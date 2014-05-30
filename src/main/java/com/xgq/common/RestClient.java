package com.xgq.common;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

/**
 * Created by xieguoqiang on 14-5-28.
 */

@Component
public class RestClient {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public <T> T post(String url, Object data, Class<T> type) {
        ClientRequest request = clientRequest(url);
        request.accept(APPLICATION_JSON);
        request.body(APPLICATION_JSON, data);
        ClientResponse<?> response = null;
        try {
            response = request.post();
        } catch (Exception e) {
            throw new RestClientException("post: " + url, e, Status.INTERNAL_SERVER_ERROR);
        }

        checkStatus(url, response);

        if (response.getResponseStatus().equals(Status.OK)) {
            return response.getEntity(type);
        }
        return null;
    }

    public void post(String url, Object data) {
        ClientRequest request = clientRequest(url);
        request.body(APPLICATION_XML, data);
        ClientResponse<?> response;
        try {
            response = request.post();
        } catch (Exception e) {
            throw new RestClientException("post: " + url, e, Response.Status.INTERNAL_SERVER_ERROR);
        }

        checkStatus(url, response);
    }

    public <T> T get(String url, Class<T> classType) {
        ClientRequest request = clientRequest(url);
        ClientResponse<?> response;
        try {
            response = request.get();
        } catch (Exception e) {
            throw new RestClientException(url, e,
                    Response.Status.INTERNAL_SERVER_ERROR);
        }

        checkStatus(url, response);
        return response.getEntity(classType);
    }

    public <T> T put(String url, Object data, Class<T> type) {
        ClientRequest request = clientRequest(url);
        if (data != null) {
            request.body(APPLICATION_XML, data);
        }
        ClientResponse<?> response;
        try {
            response = request.put();
        } catch (Exception e) {
            throw new RestClientException(url, e, Response.Status.INTERNAL_SERVER_ERROR);
        }

        checkStatus(url, response);

        if (response.getResponseStatus().equals(Status.OK)) {
            return response.getEntity(type);
        }
        return null;
    }

    public void put(String url, Object data) {
        this.put(url, data, APPLICATION_XML);
    }

    public void put(String url, Object data, String contentType) {
        ClientRequest request = clientRequest(url);
        if (data != null) {
            request.body(contentType, data);
        }
        ClientResponse<?> response;
        try {
            response = request.put();
        } catch (Exception e) {
            throw new RestClientException("put: " + url, e, Response.Status.INTERNAL_SERVER_ERROR);
        }

        checkStatus(url, response);
    }

    public void put(String url){
        ClientRequest request = clientRequest(url);
        ClientResponse<?> response;
        try {
            response = request.put();
        } catch (Exception e) {
            throw new RestClientException("put: " + url, e, Response.Status.INTERNAL_SERVER_ERROR);
        }
        checkStatus(url, response);
    }

    protected void checkStatus(String url, ClientResponse<?> response)
            throws RestClientException {
        if (!response.getResponseStatus().equals(Status.OK)
                && !response.getResponseStatus().equals(Status.NO_CONTENT) && !response.getResponseStatus().equals(Status.CREATED)) {
            throw new RestClientException(url + " "
                    + response.getResponseStatus().toString() + "\n"
                    + response.getEntity(String.class),
                    response.getResponseStatus());
        }
    }

    protected ClientRequest clientRequest(String url) throws RestClientException {
        logger.debug("RestClient url:" + url);
        ClientRequest request = new ClientRequest(url);
        request.header("charset", "UTF-8");
        return request;
    }
}