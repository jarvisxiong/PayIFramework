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
public final class Console_Server_Jym {

    /********************************** 公共服务交易码 **********************************************/
    /** 获取系统参数信息(TB_GLB_SYS_PARAM 表信息) */
    public static final String JYM_GETTBGLBSYSPARAM              = "getTbGlbSysParam";

    /********************************************************************************************/

    /********************************** 用户服务交易码 **********************************************/
    /** 用户信息查询 */
    public static final String JYM_QUERYUSERINFO                 = "QueryUserInfo";
    /** 记录身份证信息 */
    public static final String JYM_RECORDPIDINFO                 = "RecordPidInfo";
    /** 用户登录 */
    public static final String JYM_USERLOGIN                     = "UserLogin";
    /** 用户注册 */
    public static final String JYM_USERREGISTER                  = "userRegister";
    /** 用户注册TA */
    public static final String JYM_TAUSERREGISTER                = "TaUserRegister";
    /** 用户登录TA */
    public static final String JYM_TAUSERLOGIN                   = "TaUserLogin";
    /** 用户信息查询TA */
    public static final String JYM_TAQUERYUSERINFO               = "TaQueryUserInfo";
    /** 更新用户信息TA */
    public static final String JYM_TAUPDATEUSERINFO              = "TaUpdateUserInfo";
    /** 找回用户密码TA */
    public static final String JYM_TAFINDUSERPASS                = "TaFindUserPass";
    

    /********************************************************************************************/

    /********************************** 短信服务交易码 **********************************************/
    /** 批量短信发送 */
    public static final String JYM_BATCHSMS                      = "BatchSms";
    /** 单条短信发送 */
    public static final String JYM_SIMPLESMS                     = "SimpleSms";
    /********************************************************************************************/

    /********************************** 查询服务 **********************************************/
    /** 查询banner图接口 */
    public static final String JYM_SELECTPUBLICPIC               = "SelectPublicPic";
    /** 查询app模块、底部模块和启动图 */
    public static final String JYM_COMPARELOAD                   = "CompareLoad";
    /** 手机充值交易码 */
    public static final String JYM_MOBILERECHARGE                = "OFC001";
    /********************************************************************************************/

    /********************************** 业务服务 **********************************************/
    /** 抓取用户信息 */
    public static final String JYM_SAVETAKEUSERINFO              = "SaveTakeUserInfo";
    /** 无忧还问卷信息入库 */
    public static final String JYM_SERVICESWYHADDCUS             = "ServicesWyhAddCus";
    /** 手机运营商查询 */
    public static final String JYM_SERVICESGETMOBILEOPERATORS    = "GetMobileOperators";
    /** 手机运营商验证码请求 */
    public static final String JYM_SERVICESGETVERIFICATIONCODE   = "GetVerificationCode";
    /** 手机运营商验证码请求 */
    public static final String JYM_SERVICESVERIFICATIONOPERATOR  = "VerificationOperator";
    /** 客户手机信息获取 */
    public static final String JYM_SERVICESGETMOBILECALLBACKINFO = "GetMobileCallBackInfo";
    /** 客户手机信息获取 */
    public static final String JYM_SERVICESGETREPORTBACKINFO     = "GetReportBackInfo";
    /** 客户端首页查询 */
    public static final String JYM_SERVICESGETHOMEDATA           = "GetHomeData";
    /** 客户端首页查询 */
    public static final String JYM_SERVICESUPDATEPSAMID          = "UpdatePsamid";
    /********************************************************************************************/

    /********************************** 查询服务 **********************************************/
    /** 客户端更新接口 */
    public static final String JYM_CLIENTUPDATE                  = "ClientUpdate";
    /** 获取是否信用升级 */
    public static final String JYM_ISUSERUPGRADE                 = "IsUserUpgrade";
    /** 获取升级规则信息 */
    public static final String JYM_GETUPGRADERULE                = "GetUpgradeRule";

    /** 获取用户升级信息 */
    public static final String JYM_USERUPGRADEINFO               = "UserUpgradeInfo";
    /** 获取用户须知信息 */
    public static final String JYM_GETUSERNOTE                   = "GetUserNote";
    /** 获取公告接口信息 */
    public static final String JYM_PREPCLIENTNOTICE              = "PrepClientNotice";
    /** 获取收付款费率信息 */
    public static final String JYM_PAYMENTRECEIVEDRATE           = "PaymentReceivedRate";
    /** 获取用户剩余抽奖次数 */
    public static final String JYM_QUERYUSERLOTCOUNT             = "QueryUserLotCount";
    /** 查询中奖记录 */
    public static final String JYM_QUERYWINRECORD                = "QueryWinRecord";
    /** 查询瑞粉返佣发放记录 */
    public static final String JYM_SELECTSENDREBATERECORD        = "SelectSendRebateRecord";
    /** 查询人脉关系 */
    public static final String JYM_SELECTCONTACTS                = "SelectContacts";
    /** 查询返佣记录 */
    public static final String JYM_SELECTREBATERECORD            = "SelectRebateRecord";
    /** 查询首页资产信息 */
    public static final String JYM_SELECTREBATEINFO              = "SelectRebateInfo";
    /** 查询瑞粉公告消息 */
    public static final String JYM_SELECTFANSNOTICE              = "SelectFansNotice";
    /** 查询系统参数 */
    public static final String JYM_SELECTSYSPARAM                = "SelectSysParam";
    /** 瑞钱宝年终活动抽奖查询 */
    public static final String JYM_SERVICESDRAWLIST              = "DrawList";
    /** 瑞钱宝年终活动点击抽奖 */
    public static final String JYM_SERVICESCLICKDRAW             = "ClickDraw";
    /** 瑞钱宝年终我的战绩查询 */
    public static final String JYM_SERVICESMYWARSCORES           = "MyWarScores";
    /** 查询ic公钥接口 */
    public static final String JYM_SERVICEGETPUBLICKEY           = "GetPublicKey";
    /** 查询获取限额 */
    public static final String JYM_SERVICESGETLIMIT              = "GetLimit";
    /** 查询系统参数 */
    public static final String JYM_SERVICESGETWITHDRAWALSFEE     = "GetWithdrawalsFee";
    /** 瑞钱宝年终活动抽奖查询 */
    public static final String JYM_DRAWLIST                      = "DrawList";
    /** 瑞钱宝年终活动点击抽奖 */
    public static final String JYM_CLICKDRAW                     = "ClickDraw";
    /** 瑞钱宝年终我的战绩查询 */
    public static final String JYM_MYWARSCORES                   = "MyWarScores";
    /** 获取银行信息 */
    public static final String JYM_TAGETBANKINFO                 = "TaGetBankInfo";
    /** 获取微信用户信息 */
    public static final String JYM_TAGETUSERWXINFO               = "TAGetUserWxInfo";
    /** 获取TA交易记录 */
    public static final String JYM_TATRANSRECORDS                = "TaTransRecords";
    /** 获取微信token号 */
    public static final String JYM_TAGETWXTOKEN                  = "TaGetWxToken";

    /********************************************************************************************/

    /********************************** 业务服务 **********************************************/

    /** 审核信用等级操作处理 */
    public static final String JYM_AUDITCREDITGRADE              = "AuditCreditGrade";

    /** 判断是否走四要素验证 */
    public static final String JYM_JUDGEIFVERIFYCARD             = "Verify100001";
    /** 四要素验证 */
    public static final String JYM_VERIFYCARD4                   = "Verify100002";
    /** 获取无忧还交易记录接口 */
    public static final String JYM_GETLOANRECORD                 = "GetLoanRecord";
    /** 获取无忧还查询贷款页信息 */
    public static final String JYM_GETLOANDESC                   = "GetLoanDesc";

    /** 无忧还 上传用户认证信息接口 */
    public static final String JYM_UPLOADUSERMESSAGE             = "UploadUserMessage";
    /** 无忧还 查询用户认证基本信息接口 */
    public static final String JYM_GETUSERMESSAGE                = "GetUserMessage";
    /** 无忧还 查询基本数据接口 */
    public static final String JYM_GETBASEDATA                   = "GetBaseData";
    /********************************************************************************************/
    /********************************** 卡服务 **********************************************/

    /** 修改卡状态 */
    public static final String JYM_UPCARDSTATUS                  = "UpCardStatus";
    /** 修改绑定卡信息 */
    public static final String JYM_UPDATEBINDCARD                = "UpdateBindCard";
    /********************************************************************************************/

    /********************************** 短信服务 **********************************************/

    /** 实时、下推短信入口 */
    public static final String JYM_DWSMS1001                     = "DWSMS1001";

    /********************************************************************************************/
    /********************************** 微信服务 **********************************************/

    /** 合作方查询订单入口 */
    public static final String JYM_SEARCHORDERID                 = "SearchOrderID";
    /** 合作方请求订单入口 */
    public static final String JYM_SENDORDERID                   = "SendOrderID";
    /** 微信支付请求入口 */
    public static final String JYM_SMZF100001                    = "SMZF100001";
    /** 微信支付请求入口 */
    public static final String JYM_SMZF100002                    = "SMZF100002";
    /** 获取用户二维码请求入口 */
    public static final String JYM_TAGETPAYPICURL                = "TAGetPayPicUrl";

    /********************************************************************************************/
}
