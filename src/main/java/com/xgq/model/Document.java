package com.xgq.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Title: Document
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Document implements Serializable {
    private Integer id = 0;
    private String name;
    private String content;
    private String title = "";
    private String keywords;
    private String description;
    private Integer typeid;
    private Integer active;
    private Integer mainLevel;
    private Date createDate;
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getMainLevel() {
        return mainLevel;
    }

    public void setMainLevel(Integer mainLevel) {
        this.mainLevel = mainLevel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setDefaultContent(int type) {
        switch (type){
           case 1: this.content = serviceContent;break;
            case 2: this.content = solutionContent;break;
            case 5: this.content = newsContent;break;
            case 6: this.content = companyLeftLinkContent;break;
            case 7: this.content = companyRightLinkContent;break;
        }
    }

    private static String companyRightLinkContent = "<div class=\"caption compre4\">\n" +
            "      <h2>需求至上，挑战未来，一站式IT服务旗舰平台</h2>\n" +
            "      <p style=\"line-height:18px;\">荟萃个性化权威IT解决方案<br />强势大品牌云集，企业级正版软件朝圣地<br />\n" +
            "旨在帮助客户提高生产效率和灵活性，创造出卓越价值，加速取得业务成功</p>\n" +
            "    </div>\n" +
            "    <div class=\"sermain commain\">\n" +
            "      <div class=\"sRight\">\n" +
            "       <div class=\"tip3\">\n" +
            "       <b class=\"f18\">软盛教您如何购买VMware vSphere</b><br />\n" +
            "<span>VMware vSphere 的丰富功能现已包装成多个版本和多种套件，可满足任何组织的需要。 请注意，在部署 vSphere 时，ESXi 是首选的虚拟化管理程序体系结构。</span>\n" +
            "<span>VMware vSphere 提供英语版、德语版、简体中文版和日语版。</span>\n" +
            "<span>vSphere 5 将按处理器数量许可。 不同于 vSphere 4.x 许可证，vSphere 5 许可证对每 个处理器的核心数量和每台主机的 RAM 最大容量没有任何限制。</span>\n" +
            "vSphere 全天候为您的生产环境提供全球支持，可针对关键问题作出快速响应。另外还提供产品更新和升级服务。<br /><br /></div><br /><br />\n" +
            "       <b class=\"f16\">Citrix提供最完善的桌面虚拟化解决方案</b>\n" +
            "按需向每个用户交付桌面和应用Citrix XenDesktop是一套桌面虚拟化解决方案，可将Windows桌面和应用转变为一种按需服务，向任何地点、使用任何设备的任何用户交付。使用 XenDesktop，不仅可以安全地 向 PC、Mac、平板设备、智能电话、笔记本 电脑和瘦客户端交付单个 Windows、Web 和 SaaS 应用或整个虚拟桌面，而且可以为用户 提供高清体验。<br /><br /><br />\n" +
            "<b class=\"f16\">携手思杰，实现企业移动性——全面的管控和灵活性缺一不可</b><br />\n" +
            "思杰移动解决方案包由 XenMobile MDM 和 CloudGateway 组成，可为员工提供出色的移动设备、应用和数据灵活性。只需轻轻一点，员工 就可以快速接入统一应用商店中的所有移动、Web、SaaS和 Windows应用，包括可以无缝地集成起来以提供出色用户体验的安全生产力应用。<br /><br />\n" +
            "该移动解决方案包可对所有应用、数据和设备进行基于身份的置备和控 制，并进行基于策略的控制，如仅允许授权用户接入应用、离职员工的 自动账户注销；丢失设备中所保存应用和数据的选择性擦除等。有了思杰移动解决方案包，IT部门可以为用户提供灵活的设备选择，同时防止数据泄漏，保护内部网络，免受移动威胁影响。<br /><br />\n" +
            "与只管理移动设备和移动应用，或提供沙箱式（sandboxed）电子邮件 应用的单一功能产品不同，思杰移动解决方案包是一种完整的解决方案， 可以：<br />\n" +
            "•为用户提供灵活的设备和应用选择而不影响合规性要求<br />\n" +
            "•交付用户和 IT部门都青睐的先进生产力应用<br />\n" +
            "•允许员工随时随地轻松接入应用，进而推动业务增长<br />\n" +
            "•提供高级应用和数据接入控制，使用户满意，使 IT 部门确信内容安全无虞\n" +
            "      </div>\n" +
            "      <div class=\"sLeft\">\n" +
            "        <h1>构建企业的智慧云</h1>\n" +
            "        <p>Virtual Cloud Services<br />\n" +
            "云计算及虚拟化服务<br />\n" +
            "智慧的云计算 正在改变传统的商业模式</p><br /><br />\n" +
            "<h3>云计算解决当今IT组织所面临的前所未有的难题</h3>\n" +
            "<p>云计算通常简称为“云”，是一种通过Internet按需交付计算资源和按使用付费 的基础架构。你是否已经发现，今天的IT已与往日不同。随着企业规模不断扩大， 传统的企业IT架构已难以适应今天的运营需求，这让您的资金投入越发难以收效。依靠物 理服务器构建的传统IT架构，让企业面对业务增长而不断扩张服务器的规模，而换来的却 是维护和管理的高额投入、系统架构的不灵活、各部门应用系统建设相对独立等问题接踵而至。花费大笔资金的背后，却仅仅为了维持企业的运转，收效甚微。<br /><br /></p>\n" +
            "<h3>Cloud Computing Industry Core Leader <br />\n" +
            "云计算业界核心领导者 </h3>\n" +
            "<p>VMware在虚拟化和云计算基础架构领域处于 全球领先地位，所提供的经客户验证的解决方 案可通过降低复杂性以及更灵活、敏捷地交付服务来提高IT效率。VMware使企业可以采用能够解决其独有业务难题的云计算模式。<br /><br />\n" +
            "VMware提供的方法可在保留现有投资并提高安全性和控制力的同时，加快向云计算的过度。VMware拥有480,000多家客户和55,000多家合作伙伴，它的解决方案可帮助 各种规模的组织降低成本、提高业务灵活性并 确保选择自由。<br /><br />\n" +
            "2013 年 ( 中 国北 京 ） —全球 虚 拟化 和云 基础架构领导厂商 VMware 公司推出了 VMware® Horizon Suite ™。这个面向员工 移动性的全面平台将支持终端用户访问他们在 任何设备上的数据、应用和桌面，同时不会影 响 IT 安全性和控制力。<br /><br /></p>\n" +
            "<h3>软盛带您了解EMC</h3>\n" +
            "<p>EMC 通过创新的产品和服务，加速云计算之旅，帮助 IT 部门以更敏捷、更可信、成本效 率更高的方式存储、管理、保护、分析他们最重要的资产——信息。利用 EMC 技术及解 决方案，企业可以避免潜在的严重风险，降低信息管理所产生的巨大成本，同时又能充分 利用信息的价值来实现业务优势。<br /><br />\n" +
            "信息是一家公司除人员之外最重要的资产。EMC 提供了各种技术和工具，帮助客户释放 信息的力量。EMC 是一家全球领导厂商，助力企业和服务提供商转变运营方式，以服务 的形式提供 IT。<br /><br />\n" +
            "EMC 公司在全球拥有员工约 49000 人，2010 年营业收入 170 亿美元，2011 年第二季 度的综合收入为 48.5 亿美元，同比增长 20%。预期2011 年的综合收入将超过 198 亿美元。 EMC 通过创新的产品和服务，加速云计算之旅，帮助 IT 部门以更敏捷、更可信、成本效 率更高的方式存储、管理、保护、分析他们最重要的资产——信息。<br /><br />\n" +
            "利用 EMC 技术及解决方案，企业可以避免潜在的严重风险，降低信息管理所产生的巨大 成本，同时又能充分利用信息的价值来实现业务优势。<br /><br />\n" +
            "EMC 大数据是创造全新业务价值的基础。 通过将存储、分析与应用程序相集成，大数据 可帮助提高效率、提升质量以及改善个性化产品与服务。<br /><br />\n" +
            "大数据是创造全新业务价值的基础。 通过将存储、分析与应用程序相集成，大数据可帮助提高效率、提升质量。<br /><br /></p>\n" +
            "<h3>Citrix XenMobile 打造业内最全面完善的企业移动解决方案</h3>\n" +
            "<p>XenMobile MDM 是一种可靠的移动设备管理解决方案，可以对企业设 备和员工个人设备进行基于角色的管理和配置并确保安全性。完成用户设 备注册后，IT 部门可以自动为设备置备策略和应用，将应用列入黑名单或 白名单，检测并防止使用越狱设备，擦除或有选择性地擦除丢失、被盗或不符合规定的设备中的数据。用户可以使用自己喜爱的任何设备，而IT部门可以确保企业资产的合规性，并有效保护设备中保存的企业内容。<br /><br />\n" +
            "XenMobile MDM 是最创新、最安全的企业移动性管理解决方案。与只 能提供基本设备管理软件的大多数厂商不同，XenMobile MDM 可提供 多种高级功能和特性来确保移动应用可随时用于业务目的并确保移动内 容安全性，如地理围栏（geo-fencing）及自动化合规性等。<br /><br />\n" +
            "借 助“One-click（ 一 键 式 ）” 控 制 面 板、 简 单 的 管 理 控 制 台、 与 Microsoft Active Directory 及 PKI 和安全信息及事件管理（SIEM）系 统等其它企业基础架构的实时集成，XenMobile 可简化管理。<br /><br />\n" +
            "不管用作公司内移动设备管理服务器还是云解决方案，XenMobile MDM 都可以帮助您在所有主要平台上完成整个设备生命周期的管理，包括iPhone、iPad、Android、BlackBerry、Symbian及 Microsoft Windows 8。借助业内最简便易用的移动管理工具，XenMobile MDM 一开箱即可支持 BYOD 计划或企业移动计划。<br /><br /></p>\n" +
            "</div>\n" +
            "    </div>";

    private static String companyLeftLinkContent = "<table width=\"928\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"text-align:center; width:928px; overflow:hidden; margin:0 auto;\">\n" +
            "    <tr>\n" +
            "        <td><img src=\"/img/img_1.jpg\" width=\"928\" height=\"357\" /></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><img src=\"/img/img_2.jpg\" width=\"928\" height=\"392\" /></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><img src=\"/img/img_3.jpg\" width=\"928\" height=\"221\" /></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><img src=\"/img/img_4.jpg\" width=\"928\" height=\"504\" /></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><img src=\"/img/img_5.jpg\" width=\"928\" height=\"184\" /></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td align=\"center\"><img src=\"/img/img_6.gif\" width=\"599\" height=\"449\" /></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><a href=\"http://itunes.apple.com/WebObjects/MZStore.woa/wa/viewSoftware?id=351335188&amp;mt=8\" target=\"_blank\"><img src=\"/img/img_7.jpg\" width=\"928\" height=\"860\" /></a></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><a href=\"http://itunes.apple.com/ch/app/yue-jiself/id468987141?mt=8\" target=\"_blank\"><img src=\"/img/img_8.jpg\" width=\"928\" height=\"738\" /></a></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><a href=\"http://itunes.apple.com/mo/app/elle/id476550577?mt=8\" target=\"_blank\"><img src=\"/img/img_9.jpg\" width=\"928\" height=\"803\" /></a></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><a href=\"http://talent.adweek.com/gallery/Kids-Discover/10495275\" target=\"_blank\"><img src=\"/img/img_10.jpg\" width=\"928\" height=\"476\" /></a></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><a href=\"http://talent.adweek.com/gallery/Nike-Bra-Finder/10537701\" target=\"_blank\"><img src=\"/img/img_11.jpg\" width=\"928\" height=\"530\" /></a></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td><a href=\"http://talent.adweek.com/gallery/Everyday-Health-Diabetes-What-Now/10495133\" target=\"_blank\"><img src=\"img/img_12.jpg\" width=\"928\" height=\"476\" /></a></td>\n" +
            "    </tr>\n" +
            "</table>\n";

    private static String serviceContent = "      <div class=\"neirong\">\n" +
            "      <div style=\"width:560px; padding:0 0 0 20px; display:block;line-height:23px;\">\n" +
            "        <h2 style=\"color:#1b976f; font-size:18px; margin-bottom:10px; font-weight:bold;\">数据备份/容灾服务</h2>\n" +
            "        <p> <b style=\"display:block; color:#333;\">● 备份</b>\n" +
            "　　要在云时代中保持竞争力，IT 组织面临着一些新的挑战，这些挑战迫切要求一次彻底的转型。备份转型便是其中之一。事实上，它对加速您的云计算之旅至关重要。掌控这一进程，第一件事就是备份和恢复。\n" +
            "在本地机房内构建一套自动化的基于正本数据的异介质副本保存机制。目的是为了防止正本数据的丢失和逻辑错误，改变您团队的局面。获得您解决最大难题所需的速度、效率和灵活性，确保您的数据始终受到保护，并实现您的业务转型。<br />\n" +
            "　　为此，它们将赋予您以下能力：<br />\n" +
            "　　—   更快地实现虚拟化并转向云计算<br /> \n" +
            "　　—    信心十足地备份您的应用程序<br /> \n" +
            "　　—    向应用所有者授权，同时保持备份的集中控制权<br /> \n" +
            "　　—    高效地管理备份，以更少的资源完成更多的任务<br /> \n" +
            "　　—    降低成本——加速收回成本<br /><br />\n" +
            "\n" +
            "<b style=\"display:block; color:#333;\">● 容灾</b>\n" +
            "　　按照容灾系统对应用系统的保护程度可以分为数据级容灾和应用级容灾。<br />\n" +
            "　　数据级容灾系统只保证数据的完整性、可靠性和安全性，但提供实时服务的请求在灾难中会中断。应用级容灾系统能够提供不间断的应用服务，让服务请求能够透明(在灾难发生时毫无觉察)地继续运行，保证数据中心提供的服务完整、可靠、安全。因此对服务中断不太敏感的部分可以选择数据级容灾，以便节省成本，在数据级容灾的基础上构建应用级容灾系统，保证实时服务不间断运行，为用户提供更好的服务。<br />\n" +
            "　　(1)数据级容灾。通过在异地建立一份数据复制的方式保证数据的安全性，当本地工作系统出现不可恢复的物理故障时，容灾系统提供可用的数据。数据级容灾是容灾的基础形式，由于只需要考虑数据的复制和存放，不需要考虑备用系统，实现起来相对简单，投资也较少。数据级容灾需要考虑三方面问题：在线模式与离线模式问题；远程数据复制技术问题；同步与异步容灾问题。<br /> \n" +
            "　　(2)应用级容灾。应用级容灾能保证业务的连续性。在数据级容灾的基础上，建立备份的应用系统环境，当本地工作系统出现不可恢复的物理故障时，容灾系统提供可用的数据和应用系统。 \n" +
            "应用级容灾系统是建立在数据级容灾系统基础上的，同时能完成数据和应用系统环境的复制存放和管理。为实现发生灾难时的应用切换，容灾中心需要配置与工作系统同构和相同功能的业务网络、应用服务器、应用软件等。 <br />\n" +
            "　　应用级容灾还需要考虑数据复制的完全性、数据的一致性、数据的完整性、网络的通畅性、容灾切换的性能影响、应用软件的适应性改造等问题，以及为保证业务运行的所需设备、环境、人员及其相应的管理。\n" +
            "        </p>\n" +
            "    \n" +
            "    <div class=\"tabBox\" style=\"display:block; width:850px; overflow:hidden; margin-top:30px;\">\n" +
            "      <ul class=\"tabs\" style=\"background: url(/img/sermain_icon3.gif) repeat-x 0 21px; display:block; height:30px; padding-left:20px; width:850px;\">\n" +
            "        <li class=\"on\">服务内容</li>\n" +
            "        <li>软盛优势</li>\n" +
            "      </ul>\n" +
            "      <div class=\"tabmain\" style=\"display:block;padding:20px; line-height:23px; overflow:hidden;\"><b style=\"color:#333;\">数据备份</b><br />\n" +
            "软盛提供基于主流备份软件（Symantec BE，Symantec NBU，EMC network等）的，集成磁带，虚拟带库（EMC DD），传统磁盘阵列等介质的数备份服务。提供给客户一站式的软硬件一体化备份解决方案。<br /><br />\n" +
            "<b style=\"color:#333;\">容灾</b><br />\n" +
            "软盛根据客户的具体需求，提供相应的数据级容灾和应用容灾的解决方案，并提供集软件和硬件为一体的一站式服务流程。\n" +
            "      </div>\n" +
            "      <div class=\"tabmain\" style=\"padding:20px; line-height:23px; overflow:hidden;\">\n" +
            "      <p><b style=\"color:#333;\">全面的产品代理资质</b><br />\n" +
            "涉及企业私有云中全线产品的最高代理资质。（VMware企业级代理，EMC金牌代理，思科金牌代理等）<br /><br />\n" +
            "<b style=\"color:#333;\">资深的工程师团队</b><br />\n" +
            "软盛拥有多位VMware VCP工程师，并且具有3年以上的项目经验。<br /><br />\n" +
            "<b style=\"color:#333;\">众多的成功案例和丰富的行业背景</b><br />\n" +
            "软盛拥有3年多的私有云集成经验，在这个过程中，积累了大量的成功案例，并且在零售、快消、物流、金融、制造、汽车等行业，拥有资深的行业背景。<br /><br /></p>\n" +
            "      </div>\n" +
            "    </div>\n" +
            "      </div>\n" +
            "      </div>";

    private static String solutionContent = "<div class=\"neirong\">\n" +
            "                    <div style=\"width:420px; display:block;line-height:23px;\">\n" +
            "                        <div>主页 &gt; 解决方案 &gt; 按行业分 &gt; 金融行业解决方案</div>\n" +
            "                        <h2 style=\"font-size:18px; color:#0ba29a; height:25px; line-height:25px; margin:18px 0;\">诺亚财富存储改造项目解决方案</h2>\n" +
            "                        <p><b class=\"f16\" style=\"font-size:16px; display:block;\">客户背景</b>\n" +
            "                            <b>● 公司背景：</b>诺亚财富管理中心是一家专注为中国百万元以上高净值资产的私人客户提供全方位的理财规划顾问机构，提供的服务包括家庭资产配置方案，家庭金融投资以及不动产投资顾问等。2003年8月成立至今，已成中国目前最大的第三方理财顾问机构。2007年10月，美国最大的风险投资机构“红杉资本”注资诺亚，2010年11月10日，诺亚财富管理中心登陆纽交所，股票代码“NOAH”，成为中国第一支上市的第三方理财机构。<br />\n" +
            "                            <b>● 项目背景：</b>随着企业迅速的发展，企业信息现代化不断深入，诺亚原有的IT应用和系统已经无法满足发展的需要，急需一整套面向未来的IT基础架构满足未来的商业应用的需要。<br /><br />\n" +
            "                            <b class=\"f16\">现状描述</b>\n" +
            "                            ● 客户当前的主机房位于上海市浦东新区陆家时代金融中心，并且在宁波分公司也有一个机房。<br />\n" +
            "                            ● 客户在昆山已经租用一个IDC机房，并且考虑将上海总部机房的部分应用转移到昆山机房。<br />\n" +
            "                            ● 在上海总部有近11台服务器使用年限过长，考虑使用虚拟化技术更换服务器。这11台服务器分别是（金蝶，金蝶测试环境，主域控，短信平台，Exchange，威盾，基金，Lync测试，CV，ETL）<br />\n" +
            "                            ● 现有邮件服务器群，总共3台服务器。</p>\n" +
            "                        <div class=\"aboutinfo\" style=\"background:url(/img/solution_icon3.png) no-repeat; width:374px; height:88px; padding:10px 20px; display:block; overflow:hidden; margin:25px 0;\">\n" +
            "                            <h3 style=\"color:#333; display:block; font-weight:bold;\">相关产品</h3>\n" +
            "                            <ul>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">EMC VNX 5100</a></li>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">VMware vCenter server</a></li>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">EMC StorCenter ix4-200d</a></li>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">Symantec BE 2010</a></li>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">EMC SQL Server</a></li>\n" +
            "                            </ul>\n" +
            "                        </div>\n" +
            "                        <div class=\"clear_float\"></div>\n" +
            "                        <h2 style=\"font-size:18px; color:#0ba29a; height:25px; line-height:25px; margin:18px 0;\">解决方案概述</h2>\n" +
            "                        <div class=\"tabBox\">\n" +
            "                            <ul class=\"tabs\" style=\"background: url(/img/sermain_icon3.gif) repeat-x 0 21px; display:block; height:30px; padding-left:20px; width:850px;padding-left:0; width:645px;\">\n" +
            "                                <li class=\"on\">项目需求分析</li>\n" +
            "                                <li>拓扑图</li>\n" +
            "                                <li>方案简介</li>\n" +
            "                                <li>Customer Benefits</li>\n" +
            "                            </ul>\n" +
            "                            <div class=\"tabmain\" style=\"display:block;padding:20px; line-height:23px; overflow:hidden;\">\n" +
            "                                <p style=\"text-align:center;\"><img src=\"/img/solution_pre1.png\" width=\"585\" height=\"381\" /></p>\n" +
            "                            </div>\n" +
            "                            <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">222222222222222</div>\n" +
            "                            <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">33333333333</div>\n" +
            "                            <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">4444444444</div>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>";

    private static String newsContent = "<div class=\"newpage\">\n" +
            "      <h2>思杰：做一个成功的中型公司</h2>\n" +
            "      <p>良性发展和良好的企业文化，才是一个成功的公司。<br /> \n" +
            "今天，随时随地的工作和娱乐从一种时尚变成了日常需要。<br /> \n" +
            "思杰公司的掌舵者，CEO Mark B.Templeton每次的中国之行都喜欢到处逛逛。他自己乘坐地铁到中关村去体验，只需要随身携带一台智能手机。当他在等地铁时，有几份紧急的文件需要批复，他可以马上用智能手机接入无线网络就能连到公司服务器完成签署，而且即便应用公用网络也能保障其安全。这些移动办公和BYOD（自带设备）背后的强大支撑自然就是云计算。<br /> \n" +
            "思杰公司（citrix）就是为移动化提供云服务的专业公司。2011年思杰总收入22.1亿美元，净利润3.6亿美元。2012年思杰的总收入达到25.9亿美元，净利润3.5亿美元。虽然从规模上来说，思杰没法和规模数百亿的IT巨头们相提并论，但是其独特的定位和良好的企业文化却让思杰成为了一个成功的中型公司。<br /> \n" +
            "运用思杰公司的桌面虚拟化方案和服务器虚拟化方案搭建的企业桌面云和私有云，思杰员工可以在移动设备和办公室之间建立无缝连接，将工作与生活平衡好。得益于此，美国专供企业员工分享职场感悟的\"Glassdoor\"网站近日公布了第五届年度员工选择奖获奖名单，以及2013年\"50家最佳雇主\"入选名单，思杰连续两年获此双重殊荣。<br />\n" +
            "谦逊的Mark B.Templeton来到北京办公室，进门首先和前台员工打招呼，和见到的每一位员工聊天，倾听员工的想法。这样尊重个人的企业文化，使得思杰公司虽然个头不大，却魅力不小。 \n" +
            "Mark B.Templeton已经担任16年思杰CEO，谈起公司的未来，他表示：\"思杰还将保持现在的美好状态，既专注于为移动化提供云服务，又保持尊重人的价值的良好企业文化。\"<br /> \n" +
            "Q 你对于移动化和虚拟化的判断被证明是非常正确的。现在，你观察到的IT行业最大的变化是什么？<br />\n" +
            "A 随着IT技术的不断创新和演进，移动化和云计算格外令人瞩目。2007年，苹果推出的iPhone引爆了移动应用市场， 2012年平板电脑和智能手机加在一起的出货量远远超过了PC。这样的改变源于——人们越来越需要随时随地都可以工作和娱乐。消费化的趋势能够促进整个IT高科技产业的成熟。整个IT产业界，会逐渐从以自我为中心、以自己的技术为中心，转变成真正以客户为中心的模式。未来的掌控权会从IT厂商转移到由客户自己来掌握一切。<br />\n" +
            "Q 思杰现在销售规模25.9亿美元，你能描述一下心目中思杰的未来么？<br />\n" +
            "A 我想保持思杰公司目前这种美好的状态。良性发展和良好的企业文化，才是一个成功的公司。<br />\n" +
            "首先要保持思杰独特的文化，即尊重人的价值。从18年前我刚进入思杰时只有50名员工到现在思杰成为拥有8000多名员工的全球企业，思杰都贯彻着尊重人的价值的文化；第二是云计算、移动化时代，思杰希望给全世界带来更大的积极影响。<br />\n" +
            "在增长和保持企业文化之间，要找到良好的平衡点，一方面实现有条不紊的增长，另一方面也要保持尊重人的价值的企业文化不变，有些公司发展到一定程度，业务变复杂了，就会建立起比较森严的等级制度，而忽略了对人的尊重，但思杰始终要以人的价值为重。当然，业务增长和保持企业文化时常相互矛盾、相互制约，但是目光总要放长远。 </p>\n" +
            "      \n" +
            "      </div>";
}
