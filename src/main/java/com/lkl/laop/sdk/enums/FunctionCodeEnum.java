package com.lkl.laop.sdk.enums;

/**
 * 接口地址
 */
public enum FunctionCodeEnum {

    /** V3接口 */

    API_V3_LABS_QUERY_TRADEQUERY("/api/v3/labs/query/tradequery", "聚合扫码-交易查询"),

    API_V3_LABS_TRANS_PREORDER("/api/v3/labs/trans/preorder", "聚合扫码-聚合主扫"),

    API_V3_LABS_TRANS_MICROPAY("/api/v3/labs/trans/micropay", "聚合扫码-聚合被扫"),

    API_V3_LABS_RELATION_REFUND("/api/v3/labs/relation/refund", "聚合扫码-退款交易"),

    API_V3_SACS_SEPARATE("/api/v3/sacs/separate", "分账指令V3接口-订单分账"),

    API_V3_SACS_QUERYAMT("/api/v3/sacs/queryAmt", "分账指令V3接口-可分账金额查询"),

    API_V3_SACS_QUERY("/api/v3/sacs/query", "分账指令V3接口-分账结果查询"),

    API_V3_LABS_QUERY_IDMREFUNDQUERY("/api/v3/labs/query/idmrefundquery", "商户订单退款查询"),

    API_V3_LABS_RELATION_IDMREFUND("/api/v3/labs/relation/idmrefund", "商户订单退款交易"),

    API_V3_LABS_RELATION_CLOSE("/api/v3/labs/relation/close", "聚合扫码-关单"),

    API_V3_LABS_RELATION_REVOKED("/api/v3/labs/relation/revoked", "扫码-撤销"),

    API_V3_CCSS_COUNTER_ORDER_SPECIAL_CREATE("/api/v3/ccss/counter/order/special_create", "收银台订单创建"),

    API_V3_CCSS_COUNTER_ORDER_QUERY("/api/v3/ccss/counter/order/query", "收银台订单查询"),

    API_V3_SACS_CANCEL("/api/v3/sacs/cancel", "订单分账撤销"),

    API_V3_SACS_FALLBACK("/api/v3/sacs/fallback", "订单分账回退"),

    API_V3_SACS_BALANCESEPARATE("/api/v3/sacs/balanceSeparate", "余额分账"),

    API_V3_SACS_BALANCECANCEL("/api/v3/sacs/balanceCancel", "余额分账撤销"),

    API_V3_SACS_BALANCEFALLBACK("/api/v3/sacs/balanceFallback", "余额分账回退"),

    API_V3_SACS_BALANCESEPARATEQUERY("/api/v3/sacs/balanceSeparateQuery", "余额分账结果查询"),

    API_V3_LABS_TRANS_SHARE_CODE("/api/v3/labs/trans/share_code", "支付类接口-申请分享码(支付宝吱口令)"),

    API_V3_LABS_TRANS_PREORDER_ENCRY("/api/v3/labs/trans/preorder_encry", "支付类接口-主扫交易接口（全报文加密）"),

    API_V3_LABS_TRANS_MICROPAY_ENCRY("/api/v3/labs/trans/micropay_encry", "支付类接口-被扫接口（全报文加密）"),

    API_V3_CCSS_COUNTER_ORDER_SPECIAL_CREATE_ENCRY("/api/v3/ccss/counter/order/special_create_encry", "收银台服务系统-收银台订单创建 （全报文加密）"),

    API_V3_LABS_QUERY_GETFACEAUTHINFO("/api/v3/labs/query/getfaceauthinfo", "支付类接口-微信刷脸授权信息获取"),

    API_V3_LAMS_MERCHANT_QUERY_TRANS("/api/v3/lams/merchant/query_trans", "商户服务接口V3.0-商户计费查询"),

    API_V3_LAMS_TRADE_TRADE_REFUND("/api/v3/lams/trade/trade_refund", "商户服务接口V3.0-统一退货"),

    API_V3_LAMS_TRADE_TRADE_REFUND_QUERY("/api/v3/lams/trade/trade_refund_query", "商户服务接口V3.0-退货查询"),


    API_V3_IPSQP_TRANS_QUICKSIGNAPPLY("/api/v3/ipsqp/trans/quickSignApply", "快捷签约申请(发送短信)"),

    API_V3_IPSQP_TRANS_QUICKSIGNCONFIRM("/api/v3/ipsqp/trans/quickSignConfirm", "快捷签约确认"),

    API_V3_IPSQP_TRANS_QUICKSIGNCANCEL("/api/v3/ipsqp/trans/quickSignCancel", "快捷解约"),

    API_V3_IPSQP_TRANS_APPLYQUICKPAY("/api/v3/ipsqp/trans/applyQuickPay", "快捷支付申请（已有协议号）"),

    API_V3_IPSQP_TRANS_CONFIRMQUICKPAY("/api/v3/ipsqp/trans/confirmQuickPay", "快捷支付确认接口（已有协议号）"),

    API_V3_IPSQP_TRANS_APPLYSIGNANDPAY("/api/v3/ipsqp/trans/applySignAndPay", "快捷签约并支付申请（没有协议号）"),

    API_V3_IPSQP_TRANS_CONFIRMSIGNANDPAY("/api/v3/ipsqp/trans/confirmSignAndPay", "快捷支付确认接口（没有协议号）"),

    API_V3_IPSQP_QUERY_TRADEQUERY("/api/v3/ipsqp/query/tradeQuery", "代收查询"),

    API_V3_IPSQP_TRANS_GATEWAYSIGN("/api/v3/ipsqp/trans/gatewaySign", "网关签约（一键绑卡）"),

    API_V3_IPSQP_TRANS_DIRECTLYQUICKPAY("/api/v3/ipsqp/trans/directlyQuickPay", "快捷直接支付"),

    API_V3_IPSQP_QUERY_QUERYSIGNBYPAN("/api/v3/ipsqp/query/querySignByPan", "根据卡号查询协议号"),

    API_V3_IPSDK_TRANS_COLLECTIONSIGNAPPLY("/api/v3/ipsdk/trans/collectionSignApply", "代收签约申请(发送短信)"),

    API_V3_IPSDK_TRANS_COLLECTIONSIGNCONFIRM("/api/v3/ipsdk/trans/collectionSignConfirm", "代收签约确认"),

    API_V3_IPSDK_TRANS_COLLECTIONSIGNCANCEL("/api/v3/ipsdk/trans/collectionSignCancel", "代收解约"),

    API_V3_IPSDK_TRANS_BATCHCOLLECTION("/api/v3/ipsdk/trans/batchCollection", "批量代收"),

    API_V3_IPSDK_TRANS_BATCHQUERY("/api/v3/ipsdk/trans/batchQuery", "批量代收查询"),

    API_V3_IPSDK_TRANS_REALTIMECOLLECTION("/api/v3/ipsdk/trans/realTimeCollection", "实时代收"),

    API_V3_IPSDK_RELATION_REFUND("/api/v3/ipsdk/relation/refund", "代收退款"),

    API_V3_IPSDF_PAID_PAY("/api/v3/ipsdf/paid/pay", "实时代付接口"),

    API_V3_IPSDF_PAID_QUERY("/api/v3/ipsdf/paid/query", "实时代付查询接口"),

    API_V3_IPSDF_PAID_BATCHPAY("/api/v3/ipsdf/paid/batchPay", "批量代付接口"),

    API_V3_IPSDF_PAID_BATCHQUERY("/api/v3/ipsdf/paid/batchQuery", "批量代付查询接口"),

    API_V3_CCSS_COUNTER_ORDER_CLOSE("/api/v3/ccss/counter/order/close", "收银台关单"),


    /** V2接口 */

    API_V2_MMS_OPENAPI_LEDGER_APPLYLEDGERMER("/api/v2/mms/openApi/ledger/applyLedgerMer", "商户分账业务开通申请"),

    API_V2_MMS_OPENAPI_LEDGER_MODIFYLEDGERMER("/api/v2/mms/openApi/ledger/modifyLedgerMer", "商户分账信息变更申请"),

    API_V2_MMS_OPENAPI_LEDGER_QUERYLEDGERMER("/api/v2/mms/openApi/ledger/queryLedgerMer", "分账商户信息查询"),

    API_V2_MMS_OPENAPI_LEDGER_APPLYLEDGERRECEIVER("/api/v2/mms/openApi/ledger/applyLedgerReceiver", "分账接收方开通申请"),

    API_V2_MMS_OPENAPI_LEDGER_MODIFYLEDGERRECEIVER("/api/v2/mms/openApi/ledger/modifyLedgerReceiver", "分账接收方信息变更申请"),

    API_V2_MMS_OPENAPI_LEDGER_APPLYBIND("/api/v2/mms/openApi/ledger/applyBind", "分账关系绑定申请"),

    API_V2_MMS_OPENAPI_LEDGER_APPLYUNBIND("/api/v2/mms/openApi/ledger/applyUnBind", "分账关系解绑申请"),

    API_V2_MMS_OPENAPI_ACTIVESETTLE_APPLY("/api/v2/mms/openApi/activeSettle/apply", "商户开通主动结算业务"),

    API_V2_LAEP_INDUSTRY_EWALLETWITHDRAW("/api/v2/laep/industry/ewalletWithdraw", "账管家V2.0-账管家提现"),

    API_V2_LAEP_INDUSTRY_EWALLETWITHDRAWQUERY("/api/v2/laep/industry/ewalletWithdrawQuery", "账管家V2.0-账管家提现结果查询"),

    API_V2_LAEP_INDUSTRY_EWALLET_SETTLEPROFILE("/api/v2/laep/industry/ewallet/settleProfile", "账管家V2.0-账管家提款模式设置"),

    API_V2_LAEP_INDUSTRY_EWALLET_SETTLEQUERY("/api/v2/laep/industry/ewallet/settleQuery", "账管家V2.0-账管家提款模式查询"),

    API_V2_LAEP_INDUSTRY_EWALLET_EWALLETFEE("/api/v2/laep/industry/ewallet/ewalletfee", "账管家V2.0-账管家提款手续费设置"),

    API_V2_LAEP_INDUSTRY_EWALLET_QUERYFEE("/api/v2/laep/industry/ewallet/queryfee", "账管家V2.0-账管家提款手续费查询"),

    API_V2_LAEP_INDUSTRY_EWALLETWITHDRAWD1("/api/v2/laep/industry/ewalletWithdrawD1", "账管家V2.0-账管家提现D1"),

    API_V2_LAEP_INDUSTRY_TRANSFER_DIRECT("/api/v2/laep/industry/transfer/direct", "账管家V2.0-可用余额定向转账"),

    API_V2_LAEP_INDUSTRY_TRANSFER_QUERY("/api/v2/laep/industry/transfer/query", "账管家V2.0-转账订单查询"),

    API_V2_LAEP_INDUSTRY_EWALLETBALANCEQUERY("/api/v2/laep/industry/ewalletBalanceQuery", "账管家V2.0-账管家余额查询"),

    API_V2_LAEP_EWALLETACCOUNT_QUERYACCTINFO("/api/v2/laep/ewalletAccount/queryAcctInfo", "账管家V2.0-收单账户信息查询"),

    API_V2_MRSSQUERY_QUERYACCTINFO("/api/v2/mrssQuery/queryAcctInfo", "收单清结算接口V2-账户信息查询"),

    API_V2_LAEP_INDUSTRY_BANKCARD_BIND("/api/v2/laep/industry/bankcard/bind", "账管家V2.0-绑定银行卡"),

    API_V2_LAEP_INDUSTRY_BANKCARD_LIST("/api/v2/laep/industry/bankcard/list", "账管家V2.0-查询银行卡列表"),

    API_V2_LAEP_INDUSTRY_BANKCARD_UNBIND("/api/v2/laep/industry/bankcard/unbind", "账管家V2.0-解绑银行卡"),

    API_V2_LAEP_EWALLETACCOUNT_BILLSQRY("/api/v2/laep/ewalletAccount/billsQry", "账管家V2.0-账单分页查询"),

    API_V2_LAEP_CREATEELERECEIPT("/api/v2/laep/createEleReceipt", "账管家V2.0-生成电子回单"),

    API_V2_MCQS_MERCHANT_QUERYMERCHANTDETAIL("/api/v2/mcqs/merchant/queryMerchantDetail", "商户信息查询"),

    API_V2_MCQS_LIMIT_QUERYLIMIT("/api/v2/mcqs/limit/queryLimit", "商户限额查询"),

    API_V2_MCQS_MERCHANT_QUERYMERACCOUNT("/api/v2/mcqs/merchant/queryMerAccount", "商户结算账户查询"),

    API_V2_MCQS_MERCHANT_QUERYTERMACCOUNT("/api/v2/mcqs/merchant/queryTermAccount", "终端结算账户查询"),

    API_V2_MCQS_BUSI_QUERYTERMTRANTYPE("/api/v2/mcqs/busi/queryTermTranType", "终端交易权限查询"),

    API_V2_MCQS_MERCHANT_QUERYSHOPLISTBYNUM("/api/v2/mcqs/merchant/queryShopListByNum", "商户网点列表查询"),

    API_V2_MCQS_BUSI_QUERYBUSILISTBYNUM("/api/v2/mcqs/busi/queryBusiListByNum", "商户终端列表查询"),

    API_V2_MCQS_BUSI_QUERYTERMFEE("/api/v2/mcqs/busi/queryTermFee", "终端费率查询"),

    API_V2_MMS_OPENAPI_UPLOADFILE("/api/v2/mms/openApi/uploadFile", "附件上传"),


    ;

    private final String code;

    private final String name;


    FunctionCodeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return code.replaceAll("\\.", "/");
    }
}
