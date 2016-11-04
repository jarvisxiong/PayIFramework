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
    public static final String JYM_GETTBGLBSYSPARAM    = "getTbGlbSysParam";

    /********************************************************************************************/

    /********************************** 用户服务交易码 **********************************************/
    /** 用户信息查询 */
    public static final String JYM_QUERYUSERINFO       = "QueryUserInfo";
    /** 记录身份证信息 */
    public static final String JYM_RECORDPIDINFO       = "RecordPidInfo";
    /** 用户登录 */
    public static final String JYM_USERLOGIN           = "UserLogin";
    /** 用户注册 */
    public static final String JYM_USERREGISTER        = "userRegister";

    /********************************************************************************************/

    /********************************** 短信服务交易码 **********************************************/
    /** 批量短信发送 */
    public static final String JYM_BATCHSMS            = "BatchSms";
    /** 单条短信发送 */
    public static final String JYM_SIMPLESMS           = "SimpleSms";
    /********************************************************************************************/

    /********************************** 查询服务 **********************************************/
    /** 查询banner图接口 */
    public static final String JYM_SELECTPUBLICPIC     = "SelectPublicPic";
    /** 查询app模块、底部模块和启动图 */
    public static final String JYM_COMPARELOAD         = "CompareLoad";
    /** 手机充值交易码 */
    public static final String JYM_MOBILERECHARGE      = "OFC001";
    /********************************************************************************************/

    /********************************** AppServer服务 **********************************************/
    public static final String JYM_AppMoudlesCompare   = "AppMoudlesCompare";
    /********************************************************************************************/

    /********************************** 业务服务 **********************************************/
    /** 抓取用户信息 */
    public static final String JYM_SAVETAKEUSERINFO    = "SaveTakeUserInfo";
    /** 无忧还问卷信息入库 */
    public static final String JYM_SERVICESWYHADDCUS   = "ServicesWyhAddCus";
    /********************************************************************************************/

    /********************************** 查询服务 **********************************************/
    /** 客户端更新接口 */
    public static final String JYM_CLIENTUPDATE        = "ClientUpdate";
    /** 获取是否信用升级 */
    public static final String JYM_ISUSERUPGRADE       = "IsUserUpgrade";
    /** 获取升级规则信息 */
    public static final String JYM_GETUPGRADERULE      = "GetUpgradeRule";

    /** 获取用户升级信息 */
    public static final String JYM_USERUPGRADEINFO     = "UserUpgradeInfo";
    /** 获取用户须知信息 */
    public static final String JYM_GETUSERNOTE         = "GetUserNote";
    /** 获取公告接口信息 */
    public static final String JYM_PREPCLIENTNOTICE    = "PrepClientNotice";
    /** 获取收付款费率信息 */
    public static final String JYM_PAYMENTRECEIVEDRATE = "PaymentReceivedRate";
    /** 获取用户剩余抽奖次数 */
    public static final String JYM_QUERYUSERLOTCOUNT   = "QueryUserLotCount";
    /** 查询中奖记录 */
    public static final String JYM_QUERYWINRECORD      = "QueryWinRecord";

    /********************************************************************************************/

    /********************************** 业务服务 **********************************************/

    /** 审核信用等级操作处理 */
    public static final String JYM_AUDITCREDITGRADE    = "AuditCreditGrade";

    /** 判断是否走四要素验证 */
    public static final String JYM_JUDGEIFVERIFYCARD   = "Verify100001";
    /** 四要素验证 */
    public static final String JYM_VERIFYCARD4         = "Verify100002";
    /********************************************************************************************/
    /********************************** 卡服务 **********************************************/

    /** 修改卡状态 */
    public static final String JYM_UPCARDSTATUS        = "UpCardStatus";
    /********************************************************************************************/

    /********************************** 短信服务 **********************************************/

    /** 实时、下推短信入口 */
    public static final String JYM_DWSMS1001           = "DWSMS1001";

    /********************************************************************************************/

    /********************************** 微信服务 **********************************************/

    /** 合作方查询订单入口 */
    public static final String JYM_SEARCHORDERID          = "SearchOrderID";
    /** 合作方请求订单入口 */
    public static final String JYM_SENDORDERID         = "SendOrderID";
    /** 微信支付请求入口 */
    public static final String JYM_SMZF100001           = "SMZF100001";
    /** 微信支付请求入口 */
    public static final String JYM_SMZF100002           = "SMZF100002";

    /********************************************************************************************/

}
