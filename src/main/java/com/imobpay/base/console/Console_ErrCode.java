/**
 *  <pre>	
 *  Project Name:ServerFramework .</br>
 *  File: Console_ErrCode.java .</br>
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
 * ClassName: Console_ErrCode <br/> 
 * Function: 错误码处理类. <br/> 
 * date: 2016年5月30日 下午3:20:14 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 ServerFramework 1.0 . <br/>
 * </pre>
 */
public final class Console_ErrCode {

    /********************************** 公共类错误码 **********************************************/
    /** 交易成功 */
    public static final String SUCCESS                   = "0000";
    /** 交易失败  由于搬迁无法处理返回码，必须使用这个而建立，平常使用8894作为返回码 ，否则客户端可能存在直接退出登录的问题。*/
    public static final String RESULT_FAIL             = "0001";
    /** 交易无记录 由于搬迁无法处理返回码，必须使用这个而建立，平常使用8894作为返回码  ，否则客户端可能存在直接退出登录的问题。*/
    public static final String RESULT_NO               = "0002";
    /** 系统异常 */
    public static final String SYSERROR                  = "9999";
    /** 业务参数异常 */
    public static final String BUSS_EMPTY                = "9998";
    /** 交易为空 */
    public static final String PARAMJYM_EMPTY            = "9997";
    /** 业务功能异常 */
    public static final String BUSS_ERROR                = "9996";
    /** 请求参数为空 */
    public static final String PARAM_EMPTY               = "9995";
    /** 无记录 */
    public static final String NO_RESULT                 = "8895";
    /** 失败 */
    public static final String NO_FAIL                   = "8894";

    /** 成功 */
    public static final String SUCCESSCODE               = "00";
    /** 请求参数类型错误 */
    public static final String PARAM_TYPE_ERROR          = "9993";

    /********************************************************************************************/

    /********************************** AppServer错误返回码 **************************************/
    /** APPUSER参数异常 */
    public static final String APPUSER_EMPTY             = "9220";

    /** 模块参数异常 */
    public static final String MODULES_EMPTY             = "9221";

    /** 数据返回异常 */
    public static final String SQL_EMPTY                 = "9298";

    /** 模块返回异常 */
    public static final String RESP_MODULES_EMPTY        = "9299";

    /******************************************* 用户登录返回码统计 *******************************/
    /** 查询客户端机构异常 */
    public static final String CLIENT_BEANCH             = "9203";
    /** 查询机构对象异常 */
    public static final String CLIENT_PAYBEANCH          = "9204";
    /** 查询机构状态异常 */
    public static final String CLIENT_PAYBEANCHSTATUS    = "9205";
    /** 查询结构和客户对照表异常 */
    public static final String CLIENT_PAYUSER            = "9206";
    /** 用户密码错误 */
    public static final String CLIENT_PASSWORD           = "9208";

    /********************************** SearchServer错误返回码 **************************************/
    /** 当前用户不可用 */
    public static final String NO_UPGRADECODE            = "9210";
    /** 跳转添加用户返回码 */
    public static final String JUMPADDUSERCODE           = "0";
    /** 用户为黑名单返回码 */
    public static final String USERBLACKLISTCODE         = "9212";
    /** 当前机构未配置等级规则返回码 */
    public static final String NO_CINFGRATINGCODE        = "9213";

    /********************************************************************************************/

    /********************************** NoteServer错误返回码 **************************************/
    /** 该用户已是最高等级 */
    public static final String ERROR9211                 = "9211";
    /** 当前用户未达到升级标准 */
    public static final String ERROR9216                 = "9216";
    /** 审核失败 */
    public static final String ERROR9217                 = "9217";
    /** 配置参数异常 */
    public static final String ERROR9218                 = "9218";
    /** 应用类型不存在 */
    public static final String ERROR8903                 = "8903";
    /** 卡服务返回码：此卡已被绑定,请换卡 _9103 */
    public static final String CARDSERVER_CODE_9103      = "9103";
    /********************************************************************************************/

    /********************************** SmsServer错误返回码 **************************************/
    /** 下推失败返回码 */
    public static final String DP_FAIL                   = "0099";
    /********************************************************************************************/
    
    /********************************** UserServer错误返回码 **************************************/
    /**TA卡已失效[TA]返回码*/
    public static final String URL_NOEXITISCODE        = "9198";
    /**TA卡已绑定[TA]返回码*/
    public static final String NOTE_BINDEDCODE         = "9175";
    /**TA卡号已注册[TA]返回码*/
    public static final String NOTE_REGISTEREDCODE     = "9191";
    /**银行卡信息有误[TA]返回码*/
    public static final String NOTE_BANKINFODCODE      = "9190";
    /**只能绑定借记卡[TA]返回码*/
    public static final String NOTE_BINDDEBITCODE      = "9189";
    /**机构号不存在[TA]返回码*/
    public static final String NOTE_NOBRANCHIDCODE     = "9188";
    /**手机号已注册[TA]返回码*/
    public static final String NOTE_MOBILENOYETCODE    = "9192";
    /**密码错，请确认账号或密码[TA]返回码*/
    public static final String NOTE_PWDERRORCODE       = "9193";
    /**用户受限,请联系代理商[TA]返回码*/
    public static final String NOTE_USERLIMITATCODE    = "9194";
    /**用户未注册[TA]返回码*/
    public static final String NOTE_NOREGISTERCODE     = "9195";
    /**密码错误次数超过三次[TA]返回码*/
    public static final String NOTE_PWDERRORTHREECODE  = "9179";
    /**验证码不正确，请重新输入[TA]返回码*/
    public static final String NOTE_CHECKEERRORCODE    = "9187";
    /**验证码已过期,请重新申请[TA]返回码*/
    public static final String NOTE_CHECKPASTDUECODE   = "9186";
    /**原密码错误，请重新输入[TA]返回码*/
    public static final String NOTE_PWDFORMERERRCODE   = "9178";
    /**暂不支持该银行卡，请换卡[TA]返回码*/
    public static final String NOTE_NOBACKBANKCODE     = "9181";
    /**非法请求参数 [TA]返回码*/
    public static final String NOTE_LAWLESSPARAMCODE   = "9177";
    /**实名信息有误,请确认重新输入[TA]返回码*/
    public static final String NOTE_REALNAMEERRCODE    = "9184";
    /**用户未获取验证码[TA]返回码*/
    public static final String NOTE_NOTGETCHECKCODE    = "9183";
    
    /********************************************************************************************/
    
    
    /**********************************  OuterServer错误返回码 **************************************/

    /**参数未配置[TA]返回码*/
    public static final String NOTE_NOPARAMCONFIGCODE   = "9182";
    /**生成二维码失败[TA]返回码*/
    public static final String NOTE_CREATETWOCODE       = "9176";
    /**消息推送模板不存在[TA]返回码*/
    public static final String NOTE_NOTEMPLATECODE      = "9173";
    /**本轮已结束,感谢参与[TA]返回码*/
    public static final String NOTE_THISENDCODE         = "9160";
    /**系统繁忙,请稍后重试[TA]返回码*/
    public static final String NOTE_SYSISBUSYCODE       = "9199";
    /**TA卡号错误[TA]返回码*/
    public static final String NOTE_TACARDERRCODE       = "9197";
    /**用户未实名认证[TA]返回码*/
    public static final String USERNOREALNAMECODE       = "9174";
    
    /********************************************************************************************/
    
    /********************** 中文描述 ********************/

    /** 交易码为空 */
    public static final String JYMNULLDESC               = "交易码为空";
    /** 缺少必填参数 */
    public static final String NECESSARYPARAM            = "缺少必填参数";
    /** 请求参数为空 */
    public static final String PARAMEMPTYDESC            = "输入的信息有误，请联系客服.";
    /** 未知系统异常 */
    public static final String SYSNOSERVEDESC            = "感谢您的使用-当前服务正在建设当中....";
    /** 未知系统异常 */
    public static final String SYSNOERRORDESC            = "系统未知异常-正在维护当中";
    /** 代理商功能限制,请联系代理商 */
    public static final String BUSSERRORDESC             = "代理商功能限制,请联系代理商";
    /** 用户登录受限,请联系代理商 */
    public static final String BUSSERRORLOGINDESC        = "用户登录受限,请联系代理商";
    /** 用户未注册，请先注册 */
    public static final String NOREGISTER                = "用户未注册，请先注册";
    /** 查询业务类型错误 */
    public static final String BUSINESSERROR             = "传输业务类型错误，请检查再试。";
    /** 用户密码次数超过三次 */
    public static final String PWDERRTIMEDESC            = "用户密码次数超过三次";
    /** 密码错误 */
    public static final String PWDERRDESC                = "用户密码错误";

    /** 选择的充值面额错误 */
    public static final String TXCARDNUMERRDESC          = "选择的充值面额错误";
    /** 没有记录 */
    public static final String NORESULTDESC              = "无记录";
    /** 没有更新 */
    public static final String NOUPDATE                  = "无更新内容";
    /** 失败 */
    public static final String NOFAILDESC                = "失败";
    /** 解密失败 */
    public static final String FAILENC                   = "解密失败";
    /** 用户已注册 */
    public static final String USER_REG                  = "用户已注册";
    /** 不支持该手机号充值 */
    public static final String PHONETOPUPDESC            = "不支持该手机号充值";
    /** 交易已受理,预计稍后到账。请耐心等待,为避免重复充值,您可至交易明细中查看充值状态,如有疑问详询客服。 */
    public static final Object TRADEMESSAGEDESC          = "交易已受理,预计稍后到账。请耐心等待,为避免重复充值,您可至交易明细中查看充值状态,如有疑问详询客服。";

    /** 增值服务交易成功返信息 */
    public static final String SUCCESSDESC               = "交易成功";
    /** 运营商地区维护中，以运营商短信通知为准! */
    public static final String CALL_HOST_EXCEPTIONDESC   = "运营商地区维护中，以运营商短信通知为准!";
    /** 当前用户信息不存在 */
    public static final String NO_CURRENTUSERINFO        = "当前用户信息不存在.";
    /** 您的用户状态未达到升级标准. */
    public static final String NO_USERUPGRADEDESC        = "您的用户状态未达到升级标准.";
    /** 跳转添加用户返信息 */
    public static final String JUMPADDUSERDESC           = "跳转添加用户";
    /** 用户为黑名单返回描述 */
    public static final String USERBLACKLISTDESC         = "您当前不在升级范围之内";
    /** 您录用使用的应用不合法. */
    public static final String NO_USEAPPLEGAL            = "您录用使用的应用不合法.";
    /** 当前机构未配置等级规则返回描述 */
    public static final String NO_CINFGRATINGDESC        = "当前机构未配置等级规则";
    /** 当前机构未配置(费用)等级规则 返回描述 */
    public static final String NO_CINFGRATINGDESC2       = "当前机构未配置(费用)等级规则";
    /** 当前机构未配置等级规则.[请联系客服处理.]返回描述 */
    public static final String NO_CINFGRATINGDESC3       = "当前机构未配置等级规则.[请联系客服处理.]";
    /** 您已是最高等级，暂时无需升级 */
    public static final String ISHIGHESTDESC             = "您已是最高等级，暂时无需升级";
    /** 您正在初审状态，暂时无法升级 */
    public static final String STATUSFIRSTTRIALDESC      = "您正在初审状态，暂时无法升级";
    /** 查询到您有尚未完成或状态异常的记录，请根据记录中的提示完成操作 */
    public static final String EXISTERRORSTATUSJNLS      = " 查询到您有尚未完成或状态异常的记录，请根据记录中的提示完成操作";
    /** 亲爱的用户，您暂未达到升级标准，请再接再厉哦 */
    public static final String NO_REACHUPGRADE           = "亲爱的用户，您暂未达到升级标准，请再接再厉哦";
    /** 配置文件未配置sendCardServer参数。 */
    public static final String NO_CONFIGCARDURL          = "配置文件未配置sendCardServer参数。";

    /** 四要素成功返信息 */
    public static final String SUCCESS_DESC              = "交易成功";
    /** 应用类型不存在 */
    public static final String ERROR8903_DESC            = "应用类型不存在";
    /** CUSTOMERID不存在 */
    public static final String NO_CUSTOMERID             = "CUSTOMERID不存在";
    /** 当前等级无描述信息 */
    public static final String NO_LEVELDESC            = "当前等级无描述信息";
    /** 应用参数为空 */
    public static final String APPUSER_EMPTYDESC         = "应用请求参数为空";
    /** 模块参数为空 */
    public static final String MODULESEMPTYDESC          = "模块请求参数为空";
    /** 模块返回为空 */
    public static final String RESTMODULESEMPTYDESC      = "模块返回参数为空";
    /** 查询启动图异常 */
    public static final String STARTPICDESC              = "获取启动图异常";
    /** 底部模块比较异常 */
    public static final String COMPAREBUTTOMMODULESE     = "底部模块比较异常";
    /** 模块比较异常 */
    public static final String COMPAREMODULESE           = "模块比较异常";
    /** 当前app机构号不存在异常 */
    public static final String APPBRANCHID               = "APP机构号不存在";
    /** 当前版本已是最新版本 */
    public static final String APPVERSIONUP              = "当前版本已是最新版本";
    /** 应用类型不存在 */
    public static final String BRANCHDESC                = "应用类型不存在";
    /** 请先更新客户端 */
    public static final String PAYBRANCHDESC             = "请先更新客户端";
    /** 用户登录受限,请联系代理商 */
    public static final String PAYBRANCHFLAGDESC         = "用户登录受限,请联系代理商";
    /** 查询不到当前机构 */
    public static final String BRANCHIDERROR             = "查询当前机构信息失败。";
    /** 当前未配置收付款费率参数 */
    public static final String SHOPNOERROR               = "查询查询费率失败。";
    /** 闪付费率配置错误 */
    public static final String SFFEERROR                 = "查询闪付费率配置异常或传入参数异常";

    /** 实名认证图片审核失败 */
    public static final String PICFAIL                   = "实名审核失败，并且未对应失败图片标识";
    /** 数据库参数未配置 */
    public static final String NO_DBPARAM                = "数据库参数未配置";
    /** 无更多记录 */
    public static final String NO_MORERECORD             = "无更多记录";
    /** 请求参数异常 */
    public static final String PARM_TYPE_DESC            = "传入参数类型错误，请检查类型再试。";
    /** 手机号不符合正则表达式 */
    public static final String NO_REGEX                  = "手机号不符合正则表达式";
    /** 运营商未返回状态 */
    public static final String NO_STATUS                 = "运营商未返回状态";
    /** 请勿重复提交请求 */
    public static final String NO_REPEAT                 = "请勿重复提交请求";
    /** 暂不支持银行卡 */
    public static final String ERROR_NO_BANK_INFO        = "暂不支持该银行卡,请换卡";
    /** 该交易只支持借记卡,请换卡 */
    public static final String ERROR_BIND_D              = "该交易只支持借记卡,请换卡";
    /** 绑定类型有误 */
    public static final String ERROR_BIND_TYPE           = "绑定类型有误";
    /** 用户未实名认证通过 */
    public static final String ERROR_CUS_STATUS          = "用户未实名认证通过";
    /** 当前客户不在白名单内 */
    public static final String NO_WHITELIST              = "当前客户不在白名单内";
    /** 层级类型错误 */
    public static final String ERROR_LEVEL               = "层级类型错误";

    /** 验证码发送失败 */
    public static final String MESSAGE_FAILED            = "验证码发送失败";
    /** 返回手机号或身份证为空 */
    public static final String MOBILENO_EMPTY          = "返回手机号或身份证为空";
    /** 只能绑本人卡,请重新输入 */
    public static final String HOLDER_ERROR            = "只能绑本人卡,请重新输入";
    /** 获取的参数异常 */
    public static final String PARAM_ERROR               = "获取的参数异常";

    /** 抽奖可用次数为0 */
    public static final String COUNT_ERROR               = "抽奖可用次数为0";
    /** 手机号不合法 */
    public static final String ERROR_MOBILENO            = "手机号不合法";
    /** 短信服务不可用 */
    public static final String SMS_NOSERVER              = "短信服务不可用";
    /** 短信长度超限 */
    public static final String SMS_LEN_MSG               = "短信长度超限";
    /** 短信内容不合规 */
    public static final String SMS_VERI_ILLEGAL_CHAR_MSG = "短信内容不合规";
    /** 该用户是黑名单 */
    public static final String SMS_BLACK_CUST_MSG        = "该用户已列入黑名单";
    /** 请求订单号已存在 */
    public static final String SMS_ORDERNO_REPEAT        = "请求订单号已存在";
    /** 没有可用通道 */
    public static final String SMS_NOCHANNEL_MSG         = "没有可用通道";
    /** 签名未配置 */
    public static final String SMS_NOSIGN_MSG            = "签名未配置";
    /** 发送短信失败 */
    public static final String SMS_FAIL_MSG              = "失败";
    /** 成功 */
    public static final String SMS_SUCCESS_MSG           = "成功";
    /** 极光推送推送配置表的数据未配置 */
    public static final String DP_NODATA_MSG             = "推送配置表的数据未配置";
    /**未能查询到限额信息*/
    public static final String LIMIT_ERROR_MSG             = "未能查询到限额信息";

    /** 响应码 */
    public static final String RESP_CODE_01_ERR_TXN_ID            = "0001";                                               // 未知交易码
    /** 响应码 */
    public static final String RESP_CODE_02_ERR_PARSE             = "0002";                                               // 报文解析失败
    /** 响应码 */
    public static final String RESP_CODE_03_ERR_PRARM             = "0003";                                               // 参数错误：缺少必须参数、或必须参数不合法
    /** 响应码 */
    public static final String RESP_CODE_04_ERR_NO_SESSION        = "0004";                                               // 未建立会话
    /** 响应码 */
    public static final String RESP_CODE_05_ERR_FORMAT            = "0005";                                               // 响应报文格式化异常
    /** 响应码 */
    public static final String RESP_CODE_06_ERR_NO_LOGIN          = "0006";                                               // 未登录
    /** 响应码 */
    public static final String RESP_CODE_07_ERR_LOGIN_PWD         = "0007";                                               // 登录失败：密码错误、或用户名不存在
    /** 响应码 */
    public static final String RESP_CODE_08_ERR_LOGIN_RE          = "0008";                                               // 登录失败：重复登陆，同一用户，不同SID?
    /** 响应码 */
    public static final String RESP_CODE_09_ERR_TIME_OUT          = "0009";                                               // 会话超时：请重新登录
    /** 响应码 */
    public static final String RESP_CODE_10_ERR_TOKEN             = "0010";                                               // 非法TOKEN
    /** 响应码 */
    public static final String RESP_CODE_11_ERR_TOKEN             = "0011";                                               // TOKEN超时
    /** 响应码 */
    public static final String RESP_CODE_12_ERR_SIGN              = "0012";                                               // 验签失败
    /** 响应码 */
    public static final String RESP_CODE_13_ERR_PAY_PWD           = "0013";                                               // 支付密码错误
    /** 响应码 */
    public static final String RESP_CODE_14_ERR_VERIFY_CODE       = "0014";                                               // 验证码错误
    /** 响应码 */
    public static final String RESP_CODE_15_ERR_HOST              = "0015";                                               // 主机异常
    /** 响应码 */
    public static final String RESP_CODE_16_ERR_QUITSESSION       = "0016";                                               // 已退出安全会话
    /** 响应码 */
    public static final String RESP_CODE_17_ERR_BUSINESSEXCEPTION = "0017";                                               // 业务参数异常标识码
    /** 响应码 */
    public static final String RESP_CODE_97_RESP_FAIL             = "0097";                                               // 请求已发送，
    /** 响应码 */
    // 对方未返回数据
    public static final String RESP_CODE_88_ERR_TXN               = "0088";                                               // 交易失败
    /** 响应码 */
    public static final String RESP_CODE_98_ERR_CREATE            = "0098";                                               // 服务还在建设当中，感谢您的使用.
    /** 响应码 */
    public static final String RESP_CODE_99_ERR_UNKNOW            = "0099";                                               // 未知系统异常
    /** 交易异常 */
    public static final String TRANS_ERROR                        = "交易异常";
    /**TA卡已失效[TA]返回描述*/
    public static final String URL_NOEXITISDESC          = "TA卡已失效[TA]";
    /**TA卡已绑定[TA]返回描述*/
    public static final String NOTE_BINDEDDESC           = "TA卡已绑定[TA]";
    /**TA卡号已注册[TA]返回描述*/
    public static final String NOTE_REGISTEREDDESC       = "TA卡号已注册[TA]";
    /**银行卡信息有误[TA]返回描述*/
    public static final String NOTE_BANKINFODESC         = "银行卡信息有误,请确认[TA]";
    /**只能绑定借记卡[TA]返回描述*/
    public static final String NOTE_BINDDEBITDESC        = "只能绑定借记卡[TA]";
    /**机构号不存在[TA]返回描述*/
    public static final String NOTE_NOBRANCHIDDESC       = "机构号不存在[TA]";
    /**手机号已注册[TA]返回描述*/
    public static final String NOTE_MOBILENOYETDESC      = "手机号已注册[TA]";
    /**用户未注册[TA]返回描述*/
    public static final String NOTE_NOREGISTERDESC       = "用户未注册[TA]";
    /**用户受限,请联系代理商[TA]返回描述*/
    public static final String NOTE_USERLIMITATDESC      = "用户受限,请联系代理商[TA]";
    /**密码错误次数超过三次[TA]返回描述*/
    public static final String NOTE_PWDERRORTHREEDESC    = "密码错误次数超过三次[TA]";
    /**密码错，请确认账号或密码[TA]返回描述*/
    public static final String NOTE_PWDERRORDESC         = "密码错，请确认账号或密码[TA]";
    /**验证码不正确，请重新输入[TA]返回描述*/
    public static final String NOTE_CHECKEERRORDESC      = "验证码不正确，请重新输入[TA]";
    /**验证码已过期,请重新申请[TA]返回描述*/
    public static final String NOTE_CHECKPASTDUEDESC     = "验证码已过期,请重新申请[TA]";
    /**原密码错误，请重新输入[TA]返回描述*/
    public static final String NOTE_PWDFORMERERRDESC     = "原密码错误，请重新输入[TA]";
    /**参数未配置[TA]返回描述*/
    public static final String NOTE_NOPARAMCONFIGDESC    = "参数未配置[TA]";
    /**生成二维码失败[TA]返回描述*/
    public static final String NOTE_CREATETWODESC        = "获取二维码繁忙[TA]";
    /**暂不支持该银行卡，请换卡[TA]返回描述*/
    public static final String NOTE_NOBACKBANKDESC       = "暂不支持该银行卡，请换卡[TA]";
    /**非法请求参数 [TA]返回描述*/
    public static final String NOTE_LAWLESSPARAMDESC     = "非法请求参数 [TA]";
    /**此公众号无记录[TA]返回描述*/
    public static final String NOTE_NORESULTPUBACTDESC   = "此公众号无记录[TA]";
    /**实名信息有误,请确认重新输入[TA]返回描述*/
    public static final String NOTE_REALNAMEERRDESC      = "实名信息有误,请确认重新输入[TA]";
    /**用户未获取验证码[TA]返回描述*/
    public static final String NOTE_NOTGETCHECKDESC      = "用户未获取验证码[TA]";
    /**消息推送模板不存在[TA]返回描述*/
    public static final String NOTE_NOTEMPLATEDESC       = "消息推送模板不存在[TA]";
    /**本轮已结束,感谢参与[TA]返回码*/
    public static final String NOTE_THISENDDESC          = "本轮已结束,感谢参与[TA]";
    /**系统繁忙,请稍后重试[TA]返回描述*/
    public static final String NOTE_SYSISBUSYDESC        = "系统繁忙,请稍后重试[TA]";
    /**TA卡号错误[TA]返回描述*/
    public static final String NOTE_TACARDERRDESC        = "TA卡号错误[TA]";
    /**用户未实名认证[TA]返回描述*/
    public static final String USERNOREALNAMEDESC        = "用户未实名认证[TA]";

    
}
