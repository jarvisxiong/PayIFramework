/**
 *  <pre>	
 *  Project Name:ServerFramework .</br>
 *  File: JymConsole.java .</br>
 *  Package Name:com.imobpay.base.console .</br>
 *  Date      Author       Changes .</br>
 *  2016年5月30日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.console;

/**
 * <pre>
 * ClassName: JymConsole <br/> 
 * Function: 交易码常量池类. <br/>  
 * date: 2016年5月30日 下午3:09:40 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 ServerFramework 1.0 . <br/>
 * </pre>
 */
public final class Console_Column {

    /******************************** 公共常量类 ***************************************/

    /** 服务交易码 */
    public static final String  SERVERJYM               = "JYM";
    /** 交易码 */
    public static final String  TRADE_CODE              = "TRADE_CODE";
    /** 日志ＰＫ */
    public static final String  LOGKEYALL               = "LOGKEYALL";
    /** 错误码 */
    public static final String  MSG_CODE                = "MSG_CODE";
    /** 错误描述 */
    public static final String  MSG_TEXT                = "MSG_TEXT";
    /** 错误码 */
    public static final String  HU_RESPCODE             = "respCode";
    /** 错误描述 */
    public static final String  HU_RESPDESC             = "respDesc";
    /*** 描述码 */
    public static final String  P_MSG_CODE              = "P_MSG_CODE";
    /*** 描述信息 */
    public static final String  P_MSG_TEXT              = "P_MSG_TEXT";
    /** 返回码 */
    public static final String  RESULTCODE              = "resultCode";
    /** 返回描述 */
    public static final String  MESSAGE                 = "message";
    /** 返回总字段描述 */
    public static final String  TOTALRESULT             = "totalResult";
    /** 手机号格式校验正则 */
    public static final String  REGEX_MOBILE            = "^((13[0-9])|(15[^4,\\D])|(14[57])|(17[03678])|(18[0,0-9]))\\d{8}$";
    /** 服务交易码 */
    public static final String  SMS_SERVERJYM           = "P_TRANCODE";
    /******************************** **** *******************************************/

    /******************************** 用户服务常量类 ***************************************/
    /** 反射包路径 */
    public static final String  USERPACKAGEPATH         = "com.imobpay.base.services.impl.";

    /** 客户端类型 */
    public static final String  OSTYPE                  = "OSTYPE";
    /** 客户编号 */
    public static final String  CUSTOMERID              = "CUSTOMERID";
    /** 用户名称 */
    public static final String  USERNAME                = "USERNAME";
    /** 真实名称 */
    public static final String  REALNAME                = "REALNAME";
    /** 用户类型 */
    public static final String  CUSTOMERTYPE            = "CUSTOMERTYPE";
    /** 用户描述 */
    public static final String  TAGDESC                 = "TAGDESC";
    /** 理财是否开户 */
    public static final String  TX_AUTH_KEY             = "TX_AUTH_KEY";
    /** 理财开通状态 */
    public static final String  TX_AUTH_KEY_YES         = "Y";
    /** 理财开通状态 */
    public static final String  TX_AUTH_KEY_NO          = "N";
    /** 是否开通理财账号 */
    public static final String  ACCTFLAG                = "ACCTFLAG";
    /** 是否开通理财账号 */
    public static final String  ACCTFLAG_0              = "0";
    /** 是否开通理财账号 */
    public static final String  ACCTFLAG_1              = "1";
    /** 客户名称 */
    public static final String  CUSTOMERNAME            = "CUSTOMERNAME";
    /** 证件号码 */
    public static final String  CUSTOMERPID             = "CUSTOMERPID";
    /** 证件类型 */
    public static final String  CUSTOMERPIDTYPE         = "CUSTOMERPIDTYPE";
    /** 注册日期 */
    public static final String  CUSTOMERREGDATE         = "CUSTOMERREGDATE";
    /** 是否关注 */
    public static final String  ATTENTION               = "ATTENTION";
    /** 客户状态 */
    public static final String  CUSTOMERTAG             = "CUSTOMERTAG";
    /** 客户审核状态 */
    public static final String  CHECKRANGE              = "CHECKRANGE";
    /** 客户等级 */
    public static final String  VIPLEVEL                = "VIPLEVEL";
    /** 等级描述 */
    public static final String  VIPLEVELDESCRIPTION     = "VIPLEVELDESCRIPTION";
    /** 是否冻结 */
    public static final String  MEMO                    = "MEMO";
    /** 客户地址 */
    public static final String  CUSTOMERADDR            = "CUSTOMERADDR";
    /** 商户编号 */
    public static final String  BUSINESSLICENCE         = "BUSINESSLICENCE";
    /** 商户名称 */
    public static final String  MERCHANTNAME            = "MERCHANTNAME";
    /** 商户地址 */
    public static final String  MERCHANTADDRES          = "MERCHANTADDRES";
    /** 邮箱地址 */
    public static final String  EMAIL                   = "EMAIL";
    /** 手机号 */
    public static final String  MOBILENO                = "MOBILENO";
    /** 应用类型 */
    public static final String  APPUSER                 = "APPUSER";
    /** 登录密码 */
    public static final String  PASSWORD                = "PASSWORD";
    /** 手机序列号 */
    public static final String  MOBILESERIALNUM         = "MOBILESERIALNUM";
    /** 客户端版本号 */
    public static final String  VERSION                 = "VERSION";
    /** 请求系统IP地址 */
    public static final String  REQSYSIP                = "REQSYSIP";
    /** 经度 */
    public static final String  LONGITUDE               = "LONGITUDE";
    /** 纬度 */
    public static final String  LATITUDE                = "LATITUDE";
    /** 用户IP */
    public static final String  USERIP                  = "USERIP";
    /** 交易日期 */
    public static final String  TRANSDATE               = "TRANSDATE";
    /** 交易时间 */
    public static final String  TRANSTIME               = "TRANSTIME";
    /** 交易流水 */
    public static final String  TRANSLOGNO              = "TRANSLOGNO";
    /** 机构号 */
    public static final String  BRANCHID                = "BRANCHID";
    /** 默认机构号 */
    public static final String  BRANCHID_00000000       = "00000000";
    /** 机构名称 */
    public static final String  BRANCHNAME              = "BRANCHNAME";
    /** 交易类型 */
    public static final String  TRANSTYPE               = "TRANSTYPE";
    /** 账户天数 */
    public static final String  ACCOUNTDAY              = "ACCOUNTDAY";
    /** 审核标记 */
    public static final String  AUDITFLAG               = "AUDITFLAG";
    /** 其它标记 */
    public static final String  GUARANTORID             = "GUARANTORID";
    /** 信用标记 */
    public static final String  CREDITTAG               = "CREDITTAG";
    /** 备注 */
    public static final String  REMARK                  = "REMARK";
    /** 验证状态 */
    public static final String  AUTHENFLAG              = "AUTHENFLAG";
    /** 00用户信息查询 */
    public static final String  TRANSTYPE_00            = "00";
    /** 01个人付款查询 */
    public static final String  TRANSTYPE_01            = "01";
    /** 10查询个人收付款到卡 */
    public static final String  TRANSTYPE_10            = "10";
    /** 00查询个人收付款到账户 */
    public static final String  TRANSTYPEPAY_00         = "00";
    /** 18查询个人收付款到卡(瑞钱包V5版) */
    public static final String  TRANSTYPE_19            = "19";
    /** 11查询个人收付款到账户(瑞钱包V5版) */
    public static final String  TRANSTYPEPAY_11         = "11";
    /** 限额服务码 */
    public static final String  SERVCODE_100017         = "100017";
    /** 产品编号 */
    public static final String  MERCHANTID_0002000058   = "0002000058";
    /** 产品编号 */
    public static final String  PRODUCTID_0000000003    = "0000000003";
    /** 产品编号 */
    public static final String  PRODUCTID_0000000002    = "0000000002";
    /** 产品编号 */
    public static final String  PRODUCTID_0000000001    = "0000000001";
    /** 产品编号 */
    public static final String  PRODUCTID_0000000000    = "0000000000";
    /** 机构属性的自定义值 . */
    public static final String  BRANCHATTR_9            = "9";
    /** 用户类型的自定义值 . */
    public static final String  USERIDTYPE_9            = "9";
    /** 黑名单信息 */
    public static final String  CUSTOMERTAG_B           = "B";
    /** 短信验证码 */
    public static final String  MOBILEMAC               = "MOBILEMAC";
    /** 性别 */
    public static final String  SEX                     = "SEX";
    /** 民族 */
    public static final String  FAMILYNAME              = "FAMILYNAME";
    /** 生日 */
    public static final String  BIRTHDAY                = "BIRTHDAY";
    /** 地址 */
    public static final String  ADDRESS                 = "ADDRESS";
    /** 签发机关 */
    public static final String  ISSUEDEPARTMENT         = "ISSUEDEPARTMENT";
    /** 有效期 */
    public static final String  VALIDTIME               = "VALIDTIME";
    /** 有效期 */
    public static final String  REQKEY                  = "ICV100001";
    /** 交易key */
    public static final String  P_TRANCODE              = "P_TRANCODE";
    /** 活动类型 */
    public static final String  ACTIVETYPE              = "ACTIVETYPE";
    /** 第一张正面照片url */
    public static final String  ONEREALNAMEURL          = "ONEREALNAMEURL";
    /** 第二张反面照片url */
    public static final String  TWOREALNAMEURL          = "TWOREALNAMEURL";
    /** 第三张手持照片url */
    public static final String  THREEREALNAMEURL        = "THREEREALNAMEURL";
    /** 第一张正面照片识别或拍照 0：识别1：拍照 */
    public static final String  IFONEPHOTOGRAPH         = "IFONEPHOTOGRAPH";
    /** 第二张反面照片识别或拍照 0：识别1：拍照 */
    public static final String  IFTWOPHOTOGRAPH         = "IFTWOPHOTOGRAPH";
    /** 第三张手持照片识别或拍照 0：识别1：拍照 */
    public static final String  IFTHREEPHOTOGRAPH       = "IFTHREEPHOTOGRAPH";
    /** customerTag为2 */
    public static final String  CUSTOMERTAG_2           = "2";

    /** 是否需要抓取数据 0：标识无需抓取 1：需要抓取 */
    public static final String  HU_ISGRAB               = "isgrab";
    /** 未完成认证 信用认证状态 */
    public static final String  HU_CREDITSTATUS         = "creditStatus";
    /** 未完成认证 已完成认证，可认证多张 */
    public static final String  HU_BANKCARDDESC         = "bankCardDesc";
    /** 提现卡和高级认证卡张数之和 */
    public static final String  HU_BANKCARDNUM          = "BankCardNum";
    /** 正面照片 */
    public static final String  HU_ONEREALNAMEURL       = "oneRealNameUrl";
    /** 反面照片 */
    public static final String  HU_TWOREALNAMEURL       = "twoRealNameUrl";
    /** 手持照片 */
    public static final String  HU_THREEREALNAMEURL     = "threeRealNameUrl";
    /**
     * 例：000：对应实名的三张图片一共八钟情况：000：（无需上传照片）、111（用户从未实名、审核三张图片都失败）001(上传手持照)、010（
     * 上传反面图片）、011（上传反面、手持照片）100（正面图片）、101（上传正面、手持图片）110（上传正面、反面）
     */
    public static final String  HU_PICCODE              = "picCode";
    /** 0：无需验证1：需要验证 */
    public static final String  HU_IFVERIFICATION       = "ifVerification";

    /** 属性描述：身份证正面图片标识,识别：0。拍照：1 */
    public static final String  HU_IFONEPHOTOGRAPH      = "ifOnePhotograph";
    /** 属性描述：身份证反面图片标识,识别：0。拍照：1 */
    public static final String  HU_IFTWOPHOTOGRAPH      = "ifTwoPhotograph";
    /** 属性描述：身份证正面图片标识,识别：0。拍照：1 */
    public static final String  HU_IFTHREEPHOTOGRAPH    = "ifThreePhotograph";
    /** tb_cust_activity_record表key:101表示瑞钱包活动白名单标识 */

    public static final String  KEY_101                 = "101";

    /** 手机号正则验证 */
    public static final String  REGEX_MOBILE1           = "1[0-9]{10}";

    /******************************** **** *******************************************/

    /*************************** 增值业务服务 **************************************/
    /** 充值类型 */
    public static final String  TX_CARD_NUM             = "TX_CARD_NUM";
    /** 充值面额类型-基本为50*1 */
    public static final String  TX_CARD_NUM_1           = "1";
    /** 充值面额类型-基本为50*2 */
    public static final String  TX_CARD_NUM_2           = "2";
    /** 充值面额类型-基本为50*6 */
    public static final String  TX_CARD_NUM_6           = "6";
    /** 手机号 */
    public static final String  TX_MB_NO                = "TX_MB_NO";
    /** 订单号 */
    public static final String  TX_ORDERID              = "TX_ORDERID";
    /** 手机号验证可充值状态:1 */
    public static final String  CHECKSTATUS_1           = "1";
    /** 手机充值接口交易码 */
    public static final String  OFC001                  = "OFC001";
    /** 手机充值**订单号 */
    public static final String  TX_ORGORDERID           = "TX_ORGORDERID";
    /** 手机充值**订单号 */
    public static final String  TX_PREORDERID           = "TX_PREORDERID";
    /** 手机号码 */
    public static final String  PHONENO                 = "phoneno";
    /** 金额 */
    public static final String  PRICE                   = "price";
    /** 版本 */
    public static final String  OF_VERSION              = "version";
    /** 版本 */
    public static final String  APPPHONE                = "appPhone";
    /** 商品编号 */
    public static final String  CARDID                  = "cardid";
    /** 充值数量 */
    public static final String  CARDNUM                 = "cardnum";
    /** 订单号 */
    public static final String  SPORDER_ID              = "sporder_id";
    /** 订单时间 */
    public static final String  SPORDER_TIME            = "sporder_time";
    /** 交易账号 */
    public static final String  GAME_USERID             = "game_userid";
    /** 参数名称 */
    public static final String  PARARMNAME              = "pararmName";
    /** 回调url */
    public static final String  RET_URL                 = "ret_url";
    /** 编码格式 */
    public static final String  ENCODING                = "encoding";
    /** 用户名 */
    public static final String  USERID                  = "userid";
    /** 密码 */
    public static final String  USERPWS                 = "userpws";
    /** 秘钥 */
    public static final String  KEYSTR                  = "keystr";
    /** usesys使用系统 */
    public static final String  USESYS                  = "usesys";

    /** 返回码 */
    public static final String  RETCODE                 = "retcode";
    /** 空字符串 */
    public static final String  EMPTY                   = "";
    /** 订单号 */
    public static final String  ORDERID                 = "ORDERID";
    /** 欧飞交易状态_(成功:1) */
    public static final String  OF_TRADESTATUS_1        = "1";
    /** 欧飞交易状态_(充值中:0) */
    public static final String  OF_TRADESTATUS_0        = "0";
    /** gq_order表状态_充值失败_1 */
    public static final String  GQ_ORDERSTATUS_1        = "1";
    /** gq_order表状态_充值成功_0 */
    public static final String  GQ_ORDERSTATUS_0        = "0";
    /** gq_order表状态_充值中_3 */
    public static final String  GQ_ORDERSTATUS_3        = "3";
    /** gq_order表状态_补充值成功_6 */
    public static final String  GQ_ORDERSTATUS_6        = "6";
    /** gq_order表状态_补充值失败_7 */
    public static final String  GQ_ORDERSTATUS_7        = "7";
    /** 错误信息 */
    public static final String  ERR_MSG                 = "err_msg";
    /** 日期 */
    public static final String  OPM_TX_DATE             = "OPM_TX_DATE";
    /** 时间 */
    public static final String  OPM_TX_TIME             = "OPM_TX_TIME";
    /** 返回信息 */
    public static final String  RET_MESSAGE             = "RET_MESSAGE";
    /** 返回map */
    public static final String  RESPONSE_MAP            = "RESPONSE_MAP";
    /** 代理编号 */
    public static final String  AGENTID                 = "agentid";
    /** 渠道编号 */
    public static final String  SOURCE                  = "source";
    /** 手机号码 */
    public static final String  MOBILENUM               = "mobilenum";
    /** 商户key */
    public static final String  MERCHANTKEY             = "merchantKey";
    /** 高阳md5验证字符串 */
    public static final String  VERIFYSTRING            = "verifystring";

    /******************************** **** *******************************************/
    /***************************************** 业务中心搬迁返回字段开始 **********************/

    /** 版本状态 */
    public static final String  CLIENTTYPE              = "CLIENTTYPE";
    /** 文件后缀名 */
    public static final String  FILESUFFIX              = ".txt";
    /** 目录符 */
    public static final String  CATALOGMARK             = "/";

    /** 版本状态 */
    public static final String  VERSIONSTATUS           = "VERSIONSTATUS";

    /** 请求标识 1：根据appuser查询，否则默认值 */
    public static final String  DEFAULTAPPUSER          = "A000000000";
    /** 请求标识 1：根据appuser查询，否则默认值 */
    public static final String  FLAG_1                  = "1";
    /** 查询51白名单标识 */
    public static final String  WU_FLAG_1               = "1";
    /** 无忧还是否在白名单 0：不在白名单；1：在白名单 */
    public static final String  IFWHITE                 = "ifWhite";
    /** 无忧还有无申请 0：无申请；1：已申请 */
    public static final String  IFAPPLYLIMIT            = "ifApplyLimit";
    /** 无忧还是否有借款记录 0：有借款记录；1：无借款记录 */
    public static final String  IFBORROWRECORD          = "ifBorrowRecord";
    /** 无忧还是否有欠款 0：有欠款；1：无欠款 */
    public static final String  IFARREARS               = "ifArrears";
    /** 无忧还是否有逾期 0：有逾期；1：无逾期 */
    public static final String  IFOVERDUE               = "ifOverdue";
    /** 当前用户姓名 */
    public static final String  YIXINUSERNAME           = "userName";
    /** 益芯白名单返回字段 */
    public static final String  IFYIXINWHITE            = "ifYixinWhite";

    /**
     * 返回码及描述
     */
    public static final String  RESULT                  = "result";
    /**
     * 统计
     */
    public static final String  STATIS                  = "statis";

    /**
     * 版本更新内容那
     */
    public static final String  SUMMARY                 = "summary";
    /**
     * 更新版本是否可用：0可用
     */
    public static final String  ENABLE_STATUS           = "0";
    /**
     * 更新版本：0：必须更新
     */
    public static final String  IS_MUST_UPDATE          = "0";
    /**
     * 更新版本：1:可选择更新
     */
    public static final String  IS_NOT_MUST_UPDATE      = "1";
    /** 用户审核信息标识 */
    public static final String  CUSTOMERTAG_NUM0        = "0";
    /** 输出结果 */
    public static final String  HU_TOTALRESULT          = "totalResult";
    /** 客户号 */
    public static final String  HU_CUSTOMERID           = "customerId";
    /** 姓名 */
    public static final String  HU_REALNAME             = "realName";
    /** 客户姓名 */
    public static final String  HU_CUSTOMERNAME         = "customerName";
    /** 客户身份证号 */
    public static final String  HU_CERTPID              = "certPid";
    /** 机构号 */
    public static final String  HU_BRANCHID             = "branchId";
    /** VIP等级 */
    public static final String  HU_VIPLEVEL             = "vipLevel";
    /** 是否关注 Y:关注 N:不关注 */
    public static final String  HU_ATTENTION            = "attention";
    /**
     * 用户审核状态customertag 是否认证，0:未认证 1:完善资料 2：审核中 3：认证通过,
     * 4-审核失败，5--头像上传中，6--法人信息已完善
     * ，7--商户信息已完善，8--法人图片上传中，9--商户图片上传中，A--法人信息审核中，B--
     * 黑名单用户，C--商户信息审核中，D--法人审核失败，E--商户审核失败
     */
    public static final String  HU_AUTHENFLAG           = "authenFlag";
    /** 邮箱号 */
    public static final String  HU_EMAIL                = "email";
    /** 身份证审核描述 */
    public static final String  HU_REMARK               = "remark";
    /** 用户类型 */
    public static final String  HU_CUSTOMERTYPE         = "customerType";
    /** 注册地址 */
    public static final String  HU_CUSTOMERADDR         = "customerAddr";
    /** 商户营业执照 */
    public static final String  HU_BUSINESSLICENCE      = "businessLicence";
    /** 用户权限，X0 冻结X天 40永久冻结 */
    public static final String  HU_MEMO                 = "memo";
    /** 提现当日额度 */
    public static final String  HU_ACCOUNTDAY           = "accountday";
    /** 用户等级对应描述 */
    public static final String  HU_TAGDESC              = "tagDesc";
    /** 审核标识 */
    public static final String  HU_AUDITFLAG            = "auditFlag";
    /** 担保人号 */
    public static final String  HU_GUARANTORID          = "guarantorId";
    /** 信用卡状态 */
    public static final String  HU_CREDITTAG            = "creditTag";
    /** 用户等级描述 */
    public static final String  HU_VIPLEVELDESCRIPTION  = "vipLevelDescription";
    /** 用户初审还是终审标志 */
    public static final String  HU_CHECKRANGE           = "checkrange";
    /** 是否开通理财功能 10表示开通成功 */
    public static final String  HU_ACCTFLAG             = "acctFlag";
    /** 理财审核状态描述 */
    public static final String  HU_STATUSDESC           = "statusDesc";
    /** 返回白名单内容 */
    public static final String  QUERYMENU               = "queryMenu";
    /** 手机系统标识 */
    public static final String  MOBSYS_D                = "D";
    /** 手机系统标识 */
    public static final String  MOBSYS_IOS              = "IOS";
    /** 手机系统标识 */
    public static final String  MOBSYS_ANDROID          = "ANDROID";
    /** 返回结果集IOS */
    public static final String  USERLOGINTAG_I          = "I";
    /** 返回结果集安卓 */
    public static final String  USERLOGINTAG_A          = "A";
    /** 默认版本标识 */
    public static final String  LOGINTAG                = "T";
    /** 默认版本 */
    public static final String  MOBSYSVER               = "1.0.0";
    /** 底部模块比较返回字段 */
    public static final String  ITEMS                   = "ITEMS";
    /** 返回结果字段 */
    public static final String  HU_RESULTBEAN           = "resultBean";
    /** URL */
    public static final String  HU_INSURL               = "insUrl";
    /** URL */
    public static final String  HU_PARAMID              = "paramId";
    /** 用户须知类型 */
    public static final String  USERINSTRUCTTYPE        = "userInstructType";
    /** 版本类型 */
    public static final String  VERSIONUSER             = "version";
    /** 手机号 */
    public static final String  HU_APPPHONE             = "appPhone";
    /** 返回数据格式 */
    public static final String  DATE                    = "DATE";
    /** 返回数据格式 */
    public static final String  DATA                    = "data";
    /** 公告消息最大编号 */
    public static final String  NOTICECODE              = "NOTICECODE";
    /** 公告消息appuser */
    public static final String  HU_APPUSER              = "appUser";
    /** 公告内容 */
    public static final String  HU_NOTICECONTENT        = "noticeContent";
    /** 公告标题 */
    public static final String  TITLE                   = "title";
    /** 公告开始时间 */
    public static final String  HU_EFFECTTIME           = "effectTime";
    /** 新增公告结束时间 */
    public static final String  HU_ACTIVETIME           = "activeTime";
    /** 消息公告普通公告 */
    public static final String  HU_COMMONNOTICE         = "commonNotice";
    /** 泡灯公告 */
    public static final String  HU_RUNHORSELIGHT        = "runHorseLight";
    /** 弹幕公告的状态信息 */
    public static final String  HU_POPUPNOTE            = "popupNote";
    /** 弹幕图片url */
    public static final String  HU_POPUPURL             = "popupUrl";
    /** 入口图片url */
    public static final String  ENTRANCEURL             = "entranceurl";
    /** 查询shopno */
    public static final String  SHOPNOFLAG              = "SN";
    /** 查询默认机构号 */
    public static final String  DEFAULTBRANCH           = "00000000";
    /** 更新当前客户认证标识为新用户 */
    public static final String  CUSTOMERTAG_FLAG        = "0";

    /** 身份证号 */
    public static final String  IDNUMBER                = "IDNUMBER";

    /** 身份证验证验证成功的状态码 */
    public static final String  INFO_SUCCESS_CODE       = "15";
    /** 客户端更新url */
    public static final String  UPDATEURL               = "updateUrl";
    /** 客户端更新url */
    public static final String  MUST                    = "must";
    /** 是否必须更新 */
    public static final String  MUST_Y                  = "y";
    /** 是否必须更新 */
    public static final String  MUST_N                  = "n";
    /** 结果列表 */
    public static final String  RESULT_LIST             = "resultList";
    /** 无忧还查询贷款页信息 */
    public static final String  RATETYPE                = "FW";
    /** 无忧还贷款文字描述 */
    public static final String  PAYMENTDATEDESC         = "paymentDateDesc";
    /** 无忧还查询贷款页信息 */
    public static final String  REALDAYS                = "realDays";
    /** 无忧还 贷款比率 */
    public static final String  RATE                    = "rate";

    /***************************************** 业务中心搬迁返回字段结束 **********************/

    /** 数据集合 */
    public static final String  DATAS                   = "DATAS";
    /** 3DES加解密密钥 */
    public static final String  DATAS_KEY               = "takeuserinfoxinxiang2016";
    /** 数据集合 */
    public static final String  TAKE_TYPE               = "TAKETYPE";
    /** 联系人姓名 */
    public static final String  CONTACT_NAME            = "contactName";
    /** 联系人手机号 */
    public static final String  CONTACT_MOBILE          = "contactMobile";
    /** 联系人公司 */
    public static final String  CONTACT_COMPANY         = "contactCompany";
    /** 联系人联系人邮箱 */
    public static final String  CONTACT_EMAIL           = "contaceEmail";
    /** 联系人地址 */
    public static final String  CONTACT_ADDRESS         = "contactAddress";
    /** 联系人状态 */
    public static final String  STATUS                  = "1";
    /** 应用类型名称 */
    public static final String  APP_NAME                = "appName";
    /** 手机IMEL */
    public static final String  MOB_IMEL                = "mobImel";
    /** 手机类型 */
    public static final String  MOB_TYPE                = "mobType";
    /** 手机版本号 */
    public static final String  MOB_VERSION             = "mobVersion";
    /** 网络运营商名称 */
    public static final String  SERVICE_NAME            = "serviceName";
    /** SIM运营商名称 */
    public static final String  SIM_NAME                = "simName";
    /** 手机ICCID */
    public static final String  MOB_ICCID               = "mobIccid";

    /** 查询高级认证卡状态 审核通过 */
    public static final String  VIPFLAG_1               = "1";
    /** 查询高级认证卡状态 审核中 */
    public static final String  VIPFLAG_0               = "0";
    /** 查询高级认证卡状态 审核失败 */
    public static final String  VIPFLAG_2               = "2";

    /** 返回高级认证卡状态 未认证 */
    public static final String  HUVIPFLAG_0             = "0";
    /** 返回高级认证卡状态 审核通过 */
    public static final String  HUVIPFLAG_1             = "1";
    /** 返回高级认证卡状态 审核中 */
    public static final String  HUVIPFLAG_2             = "2";
    /** 返回高级认证卡状态 审核失败 */
    public static final String  HUVIPFLAG_3             = "3";

    /** 查询提现卡的绑定类型 */
    public static final String  BINDCARD_STATUS         = "T";

    /** 查询提现卡状态 审核通过 */
    public static final String  CARDFLAG_1              = "1";
    /** 查询提现卡状态 审核中 */
    public static final String  CARDFLAG_3              = "3";

    /** 返回提现卡状态 未认证 */
    public static final String  HUCARDFLAG_0            = "0";
    /** 返回提现卡状态 审核通过 */
    public static final String  HUCARDFLAG_1            = "1";
    /** 返回提现卡状态 审核中 */
    public static final String  HUCARDFLAG_2            = "2";

    /** 返回提现和高级认证卡描述 */
    public static final String  HUCARDDESC              = "已成功认证";
    /** 返回提现和高级认证卡描述 */
    public static final String  HUCARDDESC_NUM          = "张";
    /** 返回提现和高级认证卡描述 */
    public static final String  HUCARDDESC_AUDIT        = "审核中";
    /** 返回提现和高级认证卡描述 */
    public static final String  AUDIT_FAIL              = "审核失败";
    /** 返回提现和高级认证卡描述 */
    public static final String  NOT_AUDIT               = "未认证";

    /** 返回提现和高级认证卡描述 */
    public static final String  BANKCARDDESC_SUCCES     = "已完成认证，可认证多张";
    /** 返回提现和高级认证卡描述 */
    public static final String  BANKCARDDESC_FAIL       = "未完成认证";
    /** 返回提现卡和高级认证卡张数之和 */
    public static final String  BANKCARDNUM             = "BankCardNum";
    /** 实名认证状态 */
    public static final String  FLAG_0                  = "0";
    /** 实名认证状态 */
    public static final String  FLAG_5                  = "5";
    /** 返回提现卡和高级认证卡张数之和 */
    public static final String  PICCODE                 = "111";

    /** 查询参数表key */
    public static final String  UPLOADDATE              = "UPLOADDATE";
    /** 查询费率key */
    public static final String  GETFEE                  = "GETFEE";
    /** 查询交易金额显示描述key */
    public static final String  SFDESC                  = "SFDESC";
    /** 无需抓取 */
    public static final String  UPLOADDATE_0            = "0";
    /** 需要抓取 */
    public static final String  UPLOADDATE_1            = "1";
    /** 快速提现 */
    public static final String  WITHDRAWALS_DESC        = "快速提现";
    /** 普通提现 */
    public static final String  WITHDRAWALS_DESC1       = "普通提现";
    /** T+2提现 */
    public static final String  WITHDRAWALS_DESC2       = "T+2提现";
    /** 预计 此变量无需添加 final 程序中存在重新赋值 */
    public static String        WITHDRAWALS_DESC3       = "预计";
    /** 到账 此变量无需添加 final 程序中存在重新赋值 */
    public static String        WITHDRAWALS_DESC4       = "前到账";
    /** 到账提醒 */
    public static final String  WITHDRAWALS_DESC5       = "预计１个工作日后到账";
    /** 到账提醒 */
    public static final String  WITHDRAWALS_DESC6       = "预计2个工作日后到账";
    /** 收付款列表key */
    public static final String  PAYMENTLIST             = "paymentList";
    /** 闪付列表key */
    public static final String  FLASHPAYLIST            = "flashPayList";

    /********************************** 无忧还业务定义字段 *****************************************/
    /** 页码 */
    public static final String  PAGENUMBER              = "PAGENUMBER";
    /** 数据条数：0：单条记录 1：多条记录 */
    public static final String  DATANO                  = "DATANO";
    /** 数据条数：学历 */
    public static final String  EDUCATION               = "EDUCATION";
    /** 数据条数：婚姻状况 */
    public static final String  MARRY_STATUS            = "MARRY_STATUS";
    /** 数据条数：职业 */
    public static final String  PROFESSION              = "PROFESSION";
    /** 数据条数：子女数目 */
    public static final String  CHILDREN                = "CHILDREN";
    /** 数据条数：公司规模 */
    public static final String  COMPANY_SCALE           = "COMPANY_SCALE";
    /** 数据条数：职务 */
    public static final String  JOB                     = "JOB";
    /** 数据条数：联系人关系 */
    public static final String  RELA_TYPE               = "RELA_TYPE";

    /** 每页条数 */
    public static final Integer PAGE_SIZE               = 5;
    /** 每页条数 10 */
    public static final Integer PAGE_SIZE_10            = 10;
    /** 无忧还返回 */
    /** 属性描述：需还款金额 */
    public static final String  RE_NEEDPAYMENTAMOUNT    = "needPaymentAmount";
    /** 属性描述：借款到期日 */
    public static final String  RE_BILLDATE             = "billDate";
    /** 属性描述：订单编号 */
    public static final String  RE_ORDERID              = "orderId";
    /** 属性描述：贷款日期 */
    public static final String  RE_LOANDATE             = "loanDate";
    /** 属性描述：贷款类型 */
    public static final String  RE_LOANTYPE             = "loanType";
    /** 属性描述：实际到账金额 */
    public static final String  RE_ARRIVALAMOUNT        = "arrivalAmount";

    /** 属性描述：服务费 */
    public static final String  RE_SERVICEFEE           = "serviceFee";
    /** 属性描述：借款天数 */
    public static final String  RE_ACCOUNTPERIOD        = "accountPeriod";
    /** 属性描述：逾期费 */
    public static final String  RE_OVERDUEFEE           = "overdueFee";
    /** 属性描述：还清日期，未还清是为空 */
    public static final String  RE_SETTLEDATE           = "settleDate";
    /** 属性描述：贷款金额 */
    public static final String  RE_LOANAMOUNT           = "loanAmount";

    /** 属性描述：还款类型 */
    public static final String  RE_REPAYMENTTYPE        = "repaymentType";
    /** 属性描述：还款日期 */
    public static final String  RE_REPAYMENTDATE        = "repaymentDate";
    /** 属性描述：还款金额 */
    public static final String  RE_REPAYMENTAMOUNT      = "repaymentAmount";
    /** 属性描述：0：借款记录 1：结清记录 2：还款记录 */
    public static final String  RE_TYPE                 = "type";
    /** 属性描述：0：单条记录 1：多条记录 */
    public static final String  RE_DATANO               = "dataNo";
    /** 属性描述：贷款状态 1：逾期未交（大于账单日）、2：临近还款日（距账单日3天）、3、未还款 */
    public static final String  RE_STATUS               = "status";
    /** 属性描述：返回描述 */
    public static final String  RE_LOANDESC             = "无忧还";
    /** 属性描述：返回描述 */
    public static final String  RE_REPAYMENTDESC        = "自由还款";
    /** 属性描述：返回描述 */
    public static final String  RE_REPAYMENTESC1        = "按账还款";
    /** 属性描述：记录总数 */
    public static final String  RE_TOTALNUM             = "totalNum";

    /** 获取返回状态 */
    public static final String  GET_STATUS              = "STATUS";

    /** 无忧还基本信息上传 */
    /** 属性描述：身份证号 */
    public static final String  RU_CUSTOMERPID          = "CUSTOMERPID";
    /** 属性描述：姓名 */
    public static final String  RU_USERNAME             = "USERNAME";
    /** 属性描述：最高学历编号 */
    public static final String  RU_EDUCATIONCODE        = "EDUCATIONCODE";
    /** 属性描述：毕业院校 */
    public static final String  RU_GRADUATESCHOOL       = "GRADUATESCHOOL";
    /** 属性描述：职业编号 */
    public static final String  RU_PROFESSIONCODE       = "PROFESSIONCODE";
    /** 属性描述：工龄 */
    public static final String  RU_WORKINGYEARS         = "WORKINGYEARS";
    /** 属性描述：职业类型1（公司职员或公职人员）0（其他职业类型） */
    public static final String  RU_PROFESSIONTYPE       = "PROFESSIONTYPE";
    /** 属性描述：月均收入 */
    public static final String  RU_MONTHLYINCOME        = "MONTHLYINCOME";
    /** 属性描述：婚姻状况编号 */
    public static final String  RU_MARITALSTATUSCODE    = "MARITALSTATUSCODE";
    /** 属性描述：子女数 编号 */
    public static final String  RU_CHILDRENNUMBERCODE   = "CHILDRENNUMBERCODE";
    /** 属性描述：省份编码 */
    public static final String  RU_PROVINCE             = "PROVINCE";
    /** 属性描述：城市编码 */
    public static final String  RU_CITY                 = "CITY";
    /** 属性描述：区或县编码 */
    public static final String  RU_COUNTY               = "COUNTY";
    /** 属性描述：详细地址 */
    public static final String  RU_ADDRESS              = "ADDRESS";
    /** 属性描述：QQ号 */
    public static final String  RU_QQ                   = "QQ";
    /** 属性描述：联系方式 */
    public static final String  RU_TELEPHONE            = "TELEPHONE";
    /** 属性描述：联系人关系编号 */
    public static final String  RU_RELATIONCODE         = "RELATIONCODE";
    /** 属性描述：联系人姓名 */
    public static final String  RU_RELATIONNAME         = "RELATIONNAME";
    /** 属性描述：手机号 */
    public static final String  RU_MOBILEPHONE          = "MOBILEPHONE";
    /** 属性描述：单位名称 */
    public static final String  RU_COMPANYNAME          = "COMPANYNAME";
    /** 属性描述：单位地址 */
    public static final String  RU_COMPANYADDRESS       = "COMPANYADDRESS";
    /** 属性描述：固定电话 */
    public static final String  RU_FIXEDTELEPHONE       = "FIXEDTELEPHONE";
    /** 属性描述：单位规模编号 */
    public static final String  RU_COMPANYSIZECODE      = "COMPANYSIZECODE";
    /** 属性描述：职务编号 */
    public static final String  RU_POSITIONCODE         = "POSITIONCODE";
    /** 属性描述：省份编码 */
    public static final String  RU_PROVINCEWORKCODE     = "PROVINCEWORKCODE";
    /** 属性描述：城市编码 */
    public static final String  RU_CITYWORKCODE         = "CITYWORKCODE";
    /** 属性描述：区或县编码 */
    public static final String  RU_COUNTYWORKCODE       = "COUNTYWORKCODE";
    /** 属性描述：返回字段描述 */
    public static final String  RU_DESC                 = "desc";
    /** 数据条数：编码 */
    public static final String  RU_CODE                 = "CODE";
    /** 数据条数：城市还是区县 */
    public static final String  RU_CITYORCOUNTY         = "CITYORCOUNTY";
    /** 数据条数：返回城市还是区县 */
    public static final String  HU_CITYORCOUNTY         = "cityOrCounty";
    /** 数据条数：编码 */
    public static final String  HU_CODE                 = "code";
    /** 属性描述：学历列表返回信息 */
    public static final String  HU_EDUCATIONLIST        = "educationList";
    /** 属性描述：婚姻状态列表 */
    public static final String  HU_MARRYLIST            = "marryList";
    /** 属性描述：职业信息列表 */
    public static final String  HU_PROFESSIONLIST       = "professionList";
    /** 属性描述：子女数列表 */
    public static final String  HU_CHILDRENLIST         = "childrenList";
    /** 属性描述：公司规模列表 */
    public static final String  HU_COMPANYSCALELIST     = "companyScaleList";
    /** 属性描述：职务列表 */
    public static final String  HU_JOBLIST              = "jobList";
    /** 属性描述：联系人关系列表 */
    public static final String  HU_RELALIST             = "relaList";

    /** 无忧还基本信息返回 */
    /** 属性描述：身份证号 */
    public static final String  HU_CUSTOMERPID          = "customerpid";
    /** 属性描述：姓名 */
    public static final String  HU_USERNAME             = "userName";
    /** 属性描述：最高学历 */
    public static final String  HU_EDUCATION            = "education";
    /** 属性描述：毕业院校 */
    public static final String  HU_GRADUATESCHOOL       = "graduateSchool";
    /** 属性描述：职业 */
    public static final String  HU_PROFESSION           = "profession";
    /** 属性描述：工龄 */
    public static final String  HU_WORKINGYEARS         = "workingYears";
    /** 属性描述：月均收入 */
    public static final String  HU_MONTHLYINCOME        = "monthlyIncome";
    /** 属性描述：婚姻状况 */
    public static final String  HU_MARITALSTATUS        = "maritalStatus";
    /** 属性描述：子女数 */
    public static final String  HU_CHILDRENNUMBER       = "childrenNumber";
    /** 属性描述：省份编码 */
    public static final String  HU_PROVINCEDESC         = "provinceDesc";
    /** 属性描述：城市编码 */
    public static final String  HU_CITYDESC             = "cityDesc";
    /** 属性描述：区或县编码 */
    public static final String  HU_COUNTYDESC           = "countyDesc";
    /** 属性描述：详细地址 */
    public static final String  HU_ADDRESS              = "address";
    /** 属性描述：QQ号 */
    public static final String  HU_QQ                   = "qq";
    /** 属性描述：联系方式 */
    public static final String  HU_TELEPHONE            = "telephone";
    /** 属性描述：联系人关系 */
    public static final String  HU_RELATION             = "relation";
    /** 属性描述：联系人姓名 */
    public static final String  HU_RELATIONNAME         = "relationName";
    /** 属性描述：手机号 */
    public static final String  HU_MOBILEPHONE          = "mobilePhone";
    /** 属性描述：单位名称 */
    public static final String  HU_COMPANYNAME          = "companyName";
    /** 属性描述：单位地址 */
    public static final String  HU_COMPANYADDRESS       = "companyAddress";
    /** 属性描述：固定电话 */
    public static final String  HU_FIXEDTELEPHONE       = "fixedTelephone";
    /** 属性描述：单位规模 */
    public static final String  HU_COMPANYSIZE          = "companySize";
    /** 属性描述：职务 */
    public static final String  HU_POSITION             = "position";
    /** 属性描述：省份编码 */
    public static final String  HU_PROVINCEWORKDESC     = "provinceWorkDesc";
    /** 属性描述：城市编码 */
    public static final String  HU_CITYWORKDESC         = "cityWorkDesc";
    /** 属性描述：区或县编码 */
    public static final String  HU_COUNTYWORKDESC       = "countyWorkDesc";
    /** 属性描述：用户类型 */
    public static final String  CUSTOMERTYPES           = "A";

    /********************************** 无忧还业务定义字段 *****************************************/

    /***************************************** AppServer搬迁返回字段开始 **********************/
    /** App功能模块 */
    public static final String  MODULES                 = "MODULES";
    /** App底部模块 */
    public static final String  BOTTOMMODULES           = "BOTTOMMODULES";
    /** 总数 */
    public static final String  TOTAL                   = "TOTAL";
    /** 模块名称 */
    public static final String  NAME                    = "name";
    /** 模块下载地址 */
    public static final String  URL                     = "url";
    /** 模块描述 */
    public static final String  DESC                    = "title";
    /** 模块描述 */
    public static final String  HU_DESC                 = "desc";
    /** 版本描述 */
    public static final String  VERSION_APP             = "version";
    /** 版本描述 */
    public static final String  INSTRVERSION            = "INSTRVERSION";
    /** 模块图片 */
    public static final String  SRC                     = "src";
    /** 用户须知ID */
    public static final String  NOTICEID                = "noticeid";
    /** 是否需要升级 1 更新 2新增 3删除 */
    public static final String  UPDATEFLAG              = "updateflag";
    /** 是否有更新操作 */
    public static final String  ISUPDATE                = "isUpdate";
    /** 手机号码 */
    public static final String  MOBLIENO                = "MOBLIENO";
    /** 手机号码 */
    public static final String  HU_MOBLIENO             = "moblieNo";
    /** 手机号码列表 */
    public static final String  MOBLIENOS               = "MOBLIENOS";
    /** 手机号码 */
    public static final String  TOMOBLIENO              = "TOMOBLIENO";
    /** 查询起始条 */
    public static final String  OFFSET                  = "OFFSET";
    /** 注册日期 */
    public static final String  REGDATE                 = "REGDATE";
    /** 好友列表 */
    public static final String  USERLIST                = "USERLIST";
    /** 最近交易的好友列表 */
    public static final String  TRADELIST               = "TRADELIST";
    /** IP地址 */
    public static final String  IP                      = "IP";
    /** 端口 */
    public static final String  PORT                    = "PORT";
    /** do后缀的URL */
    public static final String  DOURL                   = "DOURL";
    /** json后缀的URL */
    public static final String  JSONURL                 = "JSONURL";
    /** 网络类型 */
    public static final String  OPERATORS               = "OPERATORS";
    /** 功能类型，0: 本地，1: 文件夹h5，2:第三方页面 */
    public static final String  FUNCTYPE                = "FUNCTYPE";
    /** 未选中状态，背景图片 */
    public static final String  ICONOFF                 = "ICONOFF";
    /** 选中状态，背景图片 */
    public static final String  ICONON                  = "ICONON";
    /** IOS跳转指向 */
    public static final String  IOSURL                  = "IOSURL";
    /** Android跳转指向 */
    public static final String  ANDROIDURL              = "ANDROIDURL";
    /** H5跳转指向 */
    public static final String  H5URL                   = "H5URL";
    /** 是否需要登录,1:需要，0：不需要 */
    public static final String  ISNEEDLOGIN             = "ISNEEDLOGIN";
    /** 调用本地H5 文件夹名 */
    public static final String  H5FLODERNAME            = "H5FLODERNAME";
    /** 标题名 */
    public static final String  H5TITLENAME             = "H5TITLENAME";
    /** 导航栏右边文字说明 */
    public static final String  H5NAVIGATERBUTNAME      = "H5NAVIGATERBUTNAME";
    /** 序号 */
    public static final String  SORTNUM                 = "SORTNUM";
    /** 标题背景色 */
    public static final String  TITLEBARCOLOR           = "TITLEBARCOLOR";
    /** 标题字体颜色 */
    public static final String  TITLENAMECOLOR          = "TITLENAMECOLOR";
    /** ios状态栏颜色 */
    public static final String  STATUBARCOLOR           = "STATUBARCOLOR";
    /** ios状态栏字体颜色 */
    public static final String  STATUBARFONTCOLOR       = "STATUBARFONTCOLOR";
    /** 临时HashMap变量 */
    public static final String  SERVERMODULES           = "SERVERMODULES";
    /** COMMON常量定义 */
    public static final String  COMMON                  = "COMMON";
    /** 数字常量定义0 */
    public static final String  ZERO                    = "0";
    /** 数字常量定义1 */
    public static final String  ONE                     = "1";
    /** 数字常量定义2 */
    public static final String  TWO                     = "2";
    /** 数字常量定义3 */
    public static final String  THREE                   = "3";
    /** 数字常量定义4 */
    public static final String  FOURE                   = "4";
    /** 数字常量定义5 */
    public static final String  FIVE                    = "5";
    /** 安桌图片 */
    public static final String  STARTANDROID            = "startAndroid";
    /** IOS图片1 */
    public static final String  STARTIOS4               = "startIOSFour";
    /** IOS图片2 */
    public static final String  STARTIOS5               = "startIOSFive";
    /** 模块版本号 */
    public static final String  APP_VERSION             = "VERSION";
    /** 下载路径 */
    public static final String  APP_URL                 = "URL";
    /** 对应描述 */
    public static final String  APP_DESC                = "DESC";
    /** 资源目录 */
    public static final String  APP_SRC                 = "SRC";
    /** 编号 */

    public static final String  APP_NOTICEID            = "NOTICEID";
    /** 功能类型 */
    public static final String  APP_FUNCTYPE            = "FUNCTYPE";
    /** 功能类型0:本地，1:文件夹h5，2:第三方页面 */
    public static final String  HU_FUNCTYPE             = "funcType";
    /** 未选中状态，背景图片 */
    public static final String  HU_ICONOFF              = "iconOff";
    /** 选中状态，背景图片 */
    public static final String  HU_ICONON               = "iconon";
    /** IOS跳转指向 */
    public static final String  HU_IOSURL               = "IOSUrl";
    /** Android跳转执向 */
    public static final String  HU_ANDROIDURL           = "androidUrl";
    /** H5跳转执向 */
    public static final String  HU_H5URL                = "htmlUrl";
    /** 是否需要登录 */
    public static final String  HU_ISNEEDLOGIN          = "isneedLogin";
    /** 调用本地H5文件夹名 */
    public static final String  HU_H5FLODERNAME         = "htmlFloderName";
    /** 标题名 */
    public static final String  HU_H5TITLENAME          = "htmltitleName";
    /** 导航栏右边文字说明 */
    public static final String  HU_H5NAVIGATERBUTNAME   = "htmlNavigaterbutName";
    /** 顺序 */

    public static final String  HU_SORTNUM              = "sortNum";
    /** 标题栏颜色 */
    public static final String  HU_TITLEBARCOLOR        = "titleBarColor";
    /** 标题名颜色 */
    public static final String  HU_TITLENAMECOLOR       = "titleNameColor";
    /** 状态栏颜色 */
    public static final String  HU_STATUBARCOLOR        = "statuBarColor";
    /** 状态栏字体颜色 */
    public static final String  HU_STATUBARFONTCOLOR    = "statuBarFontColor";
    /** App功能模块请求参数 */
    public static final String  REQ_MODULES             = "modules";
    /** App底部模块请求参数 */
    public static final String  REQ_BOTTOMMODULES       = "bottomModules";
    /** 属性描述：用户须知特殊处理标识（1） */
    public static final String  APP_TIPSSPECIAL         = "tipsSpecial";
    /** 属性描述：用户须知点击跳转控制 */
    public static final String  APP_TIPSDETAIL          = "tipsDetail";
    /** 属性描述： '功能类型（0：本地 1：h5 2：第三方跳转），默认1 */
    public static final String  APP_FUNCTYPES           = "funcType";
    /** 属性描述： IOS跳转指向 */
    public static final String  APP_IOSURL              = "iosUrl";
    /** 属性描述：android跳转指向 */
    public static final String  APP_ANDROIDURL          = "androidUrl";
    /** 属性描述：H5跳转指向（第三方） */
    public static final String  APP_H5URL               = "h5Url";
    /** 属性描述：控制显示在首页还是更多个 */
    public static final String  APP_SHOWSEAT            = "showSeat";
    /** 属性描述：分割线的颜色 */
    public static final String  APP_SPLITLINECOLOR      = "splitLineColor";
    /** 属性描述：是否需要实名 */
    public static final String  APP_NEEDREALNAME        = "needRealName";
    /** 属性描述：白名单字段 */
    public static final String  APP_WHITEFLAG           = "whiteFlag";
    /** 运营商服务密码 */
    public static final String  SERVICEPASSWORD         = "SERVICEPASSWORD";
    /** 运营商服务验证码 */
    public static final String  VERIFICATIONCODE        = "VERIFICATIONCODE";
    /** 运营商服务密码-对外服务 */
    public static final String  OPERATORPWD             = "OPERATORPWD";
    /** 运营商服务验证码-对外服务 */
    public static final String  CAPTCHA                 = "CAPTCHA";
    /** 属性描述：功能所在文件夹 */
    public static final String  APP_PATHFLODER          = "pathfloder";
    /** 属性描述：功能html */
    public static final String  APP_STARTPAGE           = "startpage";
    /** 属性描述：查询费率编号 */
    public static final String  FEE_ID                  = "00800001";
    /** 属性描述：查询费率标识 */
    public static final String  FEE_FLAG                = "B";
    /** 属性描述：登录标识 */
    public static final String  CUSTOMERTYPE_STATUS     = "00";
    /***************************************** AppServer搬迁返回字段结束 **********************/

    /***************************************** Search服务常量字段 开始 **********************/
    /** 用户编码(客户号) */
    public static final String  USERCODE                = "USERCODE";
    /** 不能升级的等级 */
    /** 能升级的等级标识 */
    public static final String  NO_UPGRADEGRADE         = "1,2,3";
    /** 逗号 */
    public static final String  COMMA                   = ",";
    /** 客户类型为00 */
    public static final String  CUSTOMERTYPE_00         = "00";
    /** 手机号 */
    public static final String  MOBLIE                  = "MOBILE";
    /** 审核通过状态:1 */
    public static final String  PREPADVANCED_STATUS_1   = "1";
    /** 年月时间格式字符串 */
    public static final String  YYYYMM                  = "yyyyMM";
    /** 固定值1 */
    public static final String  VALUE_1                 = "1";
    /** 固定值0 */
    public static final String  VALUE_0                 = "0";

    /** 固定值4 */
    public static final String  VALUE_4                 = "4";

    /** 固定值2 */
    public static final String  VALUE_2                 = "2";

    /** 是否升级 */
    public static final String  FLAG                    = "FLAG";
    /** 升级等级 */
    public static final String  LEVEL                   = "LEVEL";
    /** 错误信息. */
    public static final String  IMOBPAY_RESPMSG         = "IMOBPAY_RESPMSG";
    /** customerTag为3 */
    public static final String  CUSTOMERTAG_3           = "3";
    /** checkrange为5 */
    public static final String  CHECKRANGE_5            = "5";
    /** ishighestLevel为1 */
    public static final String  ISHIGHESTLEVEL_1        = "1";
    /** 信用卡张数 */
    public static final String  CREDITNUM               = "CREDITNUM";
    /** 上月T+0费用 */
    public static final String  MONEYT0                 = "MONEYT0";
    /** 上月T+1费用 */
    public static final String  MONEYT1                 = "MONEYT1";
    /** 是否检测信用卡张数 */
    public static final String  ISCHECKCARDNUM          = "ISCHECKCARDNUM";
    /** 是否检测T+0 */
    public static final String  ISCHECKMONEY0           = "ISCHECKMONEY0";
    /** 是否检测T+1 */
    public static final String  ISCHECKMONEY1           = "ISCHECKMONEY1";

    /** 是否检测T+1 */
    public static final String  ISCHECKMONEYT0          = "ISCHECKMONEYT0";
    /** 是否检测T+1 */
    public static final String  ISCHECKMONEYT1          = "ISCHECKMONEY1";
    /** COMMONS固定值 */
    public static final String  COMMONS                 = "COMMONS";
    /** 问号 */
    public static final String  QUESTION                = "?";
    /** 等于符号 */
    public static final String  EQUAL                   = "=";
    /** 逻辑与符号 */
    public static final String  AND                     = "&";
    /** 分享号 */
    public static final String  SHARENO                 = "SHARENO";
    /** 日期格式(yyyy-MM-dd) */
    public static final String  YYYY_MM_DD              = "yyyy-MM-dd";
    /** 返回信息 */
    public static final String  RMS                     = "RMS";
    /** 规则描述 */
    public static final String  RULEDESC                = "RULEDESC";
    /** 规则名称 */
    public static final String  RULENAME                = "RULENAME";
    /** 抽奖次数 */
    public static final String  LOTCOUNT                = "lotCount";
    /** 页大小 */
    public static final String  PAGESIZE                = "PAGESIZE";
    /** 当前页 */
    public static final String  CURPAGE                 = "CURPAGE";
    /** 月份 */
    public static final String  MONTH                   = "MONTH";
    /** 本地日期 */
    public static final String  LOCALDATE               = "LOCALDATE";
    /** 本地时间 */
    public static final String  LOCALTIME               = "LOCALTIME";
    /** 是否还有数据标识 0为之后还有数据,1为之后没有数据 */
    public static final String  ISLAST                  = "isLast";
    /** 是否还有数据标识 0为之后还有数据,1为之后没有数据 */
    public static final String  ISLAST_0                = "0";
    /** 是否还有数据标识 0为之后还有数据,1为之后没有数据 */
    public static final String  ISLAST_1                = "1";
    /** 瑞钱包活动返回字段:奖品名称 */
    public static final String  HD_AWARDNAME            = "awardName";
    /** 瑞钱包活动返回字段:奖品名称 */
    public static final String  HD_MOBILENO             = "mobileNo";
    /**** 2016年10月26日11:42:41 由madman添加 *********/
    /** 本地日期 */
    public static final String  LOCALDATE_S             = "localDate";
    /** 本地时间 */
    public static final String  LOCALTIME_S             = "localTime";
    /** 状态 */
    public static final String  AWARDSTATUS             = "awardStatus";
    /** 瑞钱包活动返回字段:奖品等级 */
    public static final String  AWARDNO                 = "awardNo";
    /** 瑞钱包活动返回字段:奖品等级 */
    public static final String  AWARDLEVEL              = "awardLevel";
    /** 瑞钱包活动返回字段:奖品名称 */
    public static final String  AWARDNAME               = "awardName";
    /** 瑞钱包活动返回字段:奖品ID */
    public static final String  AWARDSID                = "awardSid";
    /** 瑞钱包活动返回字段:APP标志 */
    public static final String  APPFLAG                 = "appFlag";
    /** 瑞钱包活动返回字段:剩余抽奖次数 */
    public static final String  AVAILCOUNT              = "availCount";
    /** 瑞钱包活动返回字段:抽奖记录 */
    public static final String  AWARDLIST               = "awardList";
    /** 瑞钱包活动返回字段:中奖区间-开始 */
    public static final String  START                   = "start";
    /** 瑞钱包活动返回字段:中奖区间-结束 */
    public static final String  END                     = "end";

    /** 瑞钱包活动返回字段:总金额 */
    public static final String  SUMMONEY                = "sumMoney";

    /** 瑞钱包活动返回字段:总抽奖次数 */
    public static final String  CLICKCOUNT              = "clickCount";

    /** 瑞钱包活动返回字段:交易月份 */
    public static final String  MONTH_S                 = "month";
    /** 瑞钱包活动返回字段:达标日期 */
    public static final String  ACCORDDAY               = "accordDay";
    /** 瑞钱包活动返回字段:达标次数 */
    public static final String  ACCORDCOUNT             = "accordCount";
    /** 瑞钱包活动返回字段:返手续费 */
    public static final String  BACKMONEY               = "backMoney";
    /** 瑞钱包活动返回字段:统计月份 */
    public static final String  TRADEMONTH              = "tradeMonth";
    /** 瑞钱包活动返回字段:满立送活动 */
    public static final String  MLSACTIVELIST           = "mlsActiveList";
    /** 瑞钱包活动返回字段:大放价活动 */
    public static final String  DFJACTIVELIST           = "dfjActiveList";

    /***************************************** Search服务常量字段结束 **********************/

    /***************************************** Note服务常量字段开始 **********************/

    /** 卡在表中唯一id */
    public static final String  ID                      = "ID";
    /** 来源系统 */
    public static final String  FRMSYS                  = "FRMSYS";
    /** 发送卡服务交易码 */
    public static final String  JYM                     = "JYM";
    /** 发送卡服务卡号 */
    public static final String  BINDFLAG                = "BINDFLAG";
    /** 发送卡服务卡类型 */
    public static final String  BINDTYPE                = "BINDTYPE";
    /** 发送卡服务卡号 */
    public static final String  CARDNO                  = "CARDNO";
    /** PayNoteServer名称 */
    public static final String  PAYNOTESERVER           = "PayNoteServer";
    /** 运营商接口服务码名称 */
    public static final String  GETOPERATOR             = "GetOperator";
    /** 验证码服务码名称 */
    public static final String  GETSMSCODE              = "GetSMSCode";
    /** 验证码确认服务码名称 */
    public static final String  GETDATASOURCE           = "GetDataSource";
    /** 闪付标识 */
    public static final String  SF                      = "SF";

    /*** 验证四要素开关 0为开，验证四要素 */
    public static final String  CHECK_SWITCH            = "0";
    /*** 0走四要素 */
    public static final String  VERIFY_RESULT_0         = "0";
    /*** 1 发送短信 */
    public static final String  VERIFY_RESULT_1         = "1";
    /*** 2 正常流程 */
    public static final String  VERIFY_RESULT_2         = "2";
    /** 四要素返回标志 */
    public static final String  VERFLAG                 = "verFlag";
    /** 返回参数对象 */
    public static final String  RESULTBEAN              = "resultBean";
    /** 返回参数对象 */
    public static final String  ADDMESSAGE              = "addMessage";
    /** 用户名 */
    public static final String  REAL_NAME               = "REALNAME";
    /** 用户名 */
    public static final String  USER_NAME               = "USERNAME";
    /** 手机号码 */
    public static final String  ACCT_MOBILENO           = "ACCTMOBILENO";
    /** 卡号 */
    public static final String  CARD_NO                 = "CARDNO";
    /** 身份证号码 */
    public static final String  CUSTOMER_PID            = "CUSTOMERPID";
    /** 验证码 */
    public static final String  CHECKCODE               = "CHECKCODE";
    /** 客户ID */
    public static final String  CUSTOMER_ID             = "CUSTOMERID";
    /** 商品号 */
    public static final String  PRODUCTID               = "PRODUCTID";
    /** 其号 */
    public static final String  MERCHANTID              = "MERCHANTID";
    /** psamId */
    public static final String  PSAMID                  = "PSAMID";
    /** 交易金额 */
    public static final String  ORDER_AMT               = "ORDERAMT";
    /** 卡类型 */
    public static final String  CARDTYPE                = "CARDTYPE";
    /*** 省份 */
    public static final String  PROVINCE                = "province";
    /*** 城市名称 */
    public static final String  CITYNAME                = "city";
    /** 返回手机号码 */
    public static final String  SENDSMSMOBILE           = "sendSmsMobile";
    /** 绑定费用 */
    public static final String  BINGFEE                 = "BINGFEE";
    /** 续约费用 */
    public static final String  GOTOFEE                 = "GOTOFEE";
    /** 规则T+0金额 */
    public static final String  RULEMONEYT0             = "RULEMONEYT0";
    /** 规则T+1金额 */
    public static final String  RULEMONEYT1             = "RULEMONEYT1";
    /** 规则信用卡张数 */
    public static final String  RULECREDITNUM           = "RULECREDITNUM";
    /** 用户状态 */
    public static final String  USERSTATUS              = "USERSTATUS";
    /** yyyy-MM-dd HH:mm:ss 格式字符串 */
    public static final String  YYYYMMDDHHMMSS          = "yyyy-MM-dd HH:mm:ss";
    /** 信用卡标识 */
    public static final String  X                       = "X";
    /** 账号 */
    public static final String  ACCOUNT                 = "ACCOUNT";
    /** 发送卡服务url */
    public static final String  SENDCARDSERVERURL       = "SENDCARDSERVERURL";
    /** 发送卡服务交易码 */
    public static final String  SENDCARDSERVERJYM       = "SENDCARDSERVERJYM";
    /** 发送卡服务绑定卡类型 */
    public static final String  SENDBINDFLAG            = "SENDBINDFLAG";
    /** 接触类型 */
    public static final String  CONTACTTYPE             = "contactType";
    /** 应用类型 */
    public static final String  APPTYPE                 = "appType";
    /** UTF-8编码格式 */
    public static final String  UTF_8                   = "UTF-8";
    /** 手机号信息 */
    public static final String  MOBINFO                 = "mobInfo";
    /** 线程处理配置 */
    public static final String  THREADTAKEUSERINFO      = "servicesThreadTakeUserInfo";
    /** 短信总类型 */
    public static final String  SMSTYPE                 = "SMSTYPE";
    /** 类型 */
    public static final String  TYPE                    = "TYPE";
    /** 手机内容 */
    public static final String  CONTENT                 = "CONTENT";
    /** 渠道号 */
    public static final String  CHANNEL                 = "CHANNEL";
    /** 发送短信交易码 */
    public static final String  DWSMS1001               = "DWSMS1001";
    /** 抓取用户信息发送预警手机号参数key配置 */
    public static final String  TAKEINFOEARLYNO         = "TAKEINFOEARLYNO";
    /** 便民掌柜宝 */
    public static final String  BMZHANGGUIBAO           = "bmzhangguibao";
    /** 瑞钱包3.7是否升级标识参数key(0为没有强更3.7)(1为已强更3.7) */
    /** 我的账单 */
    public static final String  ISUPGRADERQB37          = "ISUPGRADERQB37";
    /** 我的账单 */
    public static final String  BILLAMOUNT              = "billAmount";
    /** 我的额度 */
    public static final String  LIMITAMOUNT             = "limitAmount";
    /** 可贷金额 */
    public static final String  LOANABLEAMOUNT          = "loanableAmount";
    /** 需还款金额 */
    public static final String  NEEDPAYMENTAMOUNT       = "needPaymentAmount";
    /** 我的信用 */
    public static final String  CREDITSCORE             = "creditScore";
    /** 逾期或临近到账日天数 */
    public static final String  OVERDUEORPAYMENTDAY     = "overdueOrPaymentDay";
    /** 是否可贷款 */
    public static final String  LOANSTATUS              = "loanStatus";
    /** 是否有提现卡 */
    public static final String  WITHDRAWALSSTATUS       = "withdrawalsStatus";
    /** 是否已经验证运营商 */
    public static final String  OPERATORSTATUS          = "operatorStatus";
    /** 是否上传基本信息 */
    public static final String  USERINFOSTATUS          = "userinfoStatus";
    /** 已贷款金额 */
    public static final String  USEDAMOUNT              = "usedAmount";
    /** 客户类型 */
    public static final String  CUSTTYPE                = "custType";
    /** 是否评测 */
    public static final String  TESTFLAG                = "testFlag";
    /** 总计逾期费 */
    public static final String  TOTALOVERDUEFEE         = "totalOverdueFee";
    /** 手机号运营商 */
    public static final String  COLLECT_WEBSITE         = "COLLECT_WEBSITE";
    /** 手机号运营商返回 */
    public static final String  OPERATORNAME            = "operatorName";
    /** 认证表认证类型 2-手机 */
    public static final String  STATUS_2                = "2";
    /** 认证表认证状态 3-未知 */
    public static final String  STATUS_3                = "3";
    /** 手机号运营商认证结果 1-成功 */
    public static final String  STATUS_1                = "1";
    /** 可贷款状态 */
    public static final String  STATUS_LOAD             = "1";
    /***************************************** Note服务常量字段结束 **********************/

    /***************************************** 短信服务常量字段开始 **********************/

    /** 有效的短信类型 */
    public static final String  P_STATUS                = "1";
    /** 时间 */
    public static final String  TIME                    = "TIME";
    /** 短信总开关打开 */
    public static final String  TOTAL_SWITCH            = "TOTAL_SWITCH";
    /** 默认通道 */
    public static final String  DEFAULT_CHANNLE         = "DEFAULT_CHANNLE";
    /** 短信总开关打开 */
    public static final String  SMSSWITCH_1             = "1";
    /** 短信合法验证 */
    public static final String  SMS_VERI_CONTENT        = "SMS_VERI_CONTENT";
    /** 短信合法验证开关 */
    public static final String  SMS_VERI_CONTENT_SWITCH = "SMS_VERI_CONTENT_SWITCH";
    /** 短信非法字符 */
    public static final String  SMS_VERI_ILLEGAL_CHAR   = "SMS_VERI_ILLEGAL_CHAR";
    /** 默认机构 */
    public static final String  DEFAULT_BRANCHID        = "DEFAULT_BRANCHID";
    /** 默认机构打开 */
    public static final String  DEFAULT_BRANCHID_SWITCH = "1";
    /** 通道打开 */
    public static final String  SMS_CHANNEL_SWITCH_1    = "1";
    /** SIGN */
    public static final String  SMS_SIGN                = "SMSSIGN";
    /** 短信签名状态打开 */
    public static final String  SMS_BRANCH_SWITCH_0     = "0";
    /** 移通短信签名 */
    public static final String  ETSMS_SIGN              = "ETSMS_SIGN";
    /** 建州短信签名 */
    public static final String  JZSMS_SIGN              = "JZSMS_SIGN";
    /** 参数开关打开 */
    public static final String  GLBSYS_PARAM_SWITCH     = "1";
    /** ETSM */
    public static final String  ETSMS_CHARSET           = "ETSMS_CHARSET";
    /** 建州实时短信编码格式 */
    public static final String  JZSMS_CHARSET           = "JZSMS_CHARSET";
    /** ETSMS_SIGLE_MT */
    public static final String  ETSMS_SIGLE_MT          = "ETSMS_SIGLE_MT";
    /** ETSMS_SPSC */
    public static final String  ETSMS_SPSC              = "ETSMS_SPSC";
    /** ETSMS_SA */
    public static final String  ETSMS_SA                = "ETSMS_SA";
    /** MTERRCODE */
    public static final String  MTERRCODE               = "mterrcode";
    /** 短信发送失败状态 */
    public static final String  ETSMS_FAIL              = "1";
    /** 短信发送成功状态 */
    public static final String  ETSMS_SUCCESS           = "0";
    /** 状态 */
    public static final String  SENDSTATUS              = "SENDSTATUS";
    /** 订单号 */
    public static final String  P_MSG_OUTORDER          = "P_MSG_OUTORDER";
    /** 我们生成的订单号 */
    public static final String  P_MSG_ORDER             = "P_MSG_ORDER";
    /** 下推状态 */
    public static final String  DP_STATUS               = "SendStatus";
    /** 下推成功状态 */
    public static final String  DP_STATUS_1             = "1";
    /** 下推失败状态 */
    public static final String  DP_STATUS_0             = "0";
    /** 短信类型 */
    public static final String  SMS_YTURL               = "YTURL";
    /** 短信类型 */
    public static final String  SMS_TYPE_PT             = "PT";
    /** 短信类型 */
    public static final String  SMS_YTUSERNAME          = "YTUSERNAME";
    /** 短信类型 */
    public static final String  SMS_YTPW                = "YTPW";
    /***************************************** 短信服务常量字段结束 **********************/

    /***************************************** 卡服务服务常量字段开始 **********************/
    /** 客户类型 00表示个人01表示商户 */
    public static final String  CUS_TYPE_00             = "00";
    /** 客户类型 0表示本人 1非本人 */
    public static final String  CUS_CARD_HOLDER_0       = "0";
    /** 客户类型 0表示本人 1非本人 */
    public static final String  CUS_CARD_HOLDER_1       = "1";
    /** 瑞粉更换卡 */
    public static final String  VERIFYDESC              = "瑞粉更换卡";

    /***************************************** 卡服务服务常量字段结束 **********************/

}
