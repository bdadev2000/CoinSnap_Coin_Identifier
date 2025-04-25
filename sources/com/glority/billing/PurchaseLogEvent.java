package com.glority.billing;

import kotlin.Metadata;

/* compiled from: PurchaseLogEvent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/glority/billing/PurchaseLogEvent;", "", "<init>", "()V", "PURCHASE_BUY_VERIFY", "", "PURCHASE_RESTORE", "PURCHASE_RESTORE_VERIFY", "PURCHASE_PENDING", "PURCHASE_VIP_CHECK", "VIP_PAID_TROUBLE_NOTICE_METHODCALL", "VIP_PAID_TROUBLE_NOTICE_SHOW", "VIP_PAID_TROUBLE_REPIAD_SUCCESS", "VIP_PAID_TROUBLE_REPIAD_INAPPMESSAGE_RESULT", "VIP_PAID_TROUBLE_REPIAD_CONNECT_RESULT", "QUERY_PURCHASELIST_TIME", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class PurchaseLogEvent {
    public static final PurchaseLogEvent INSTANCE = new PurchaseLogEvent();
    public static final String PURCHASE_BUY_VERIFY = "glpurchase_buy_verify";
    public static final String PURCHASE_PENDING = "glpurchase_pending";
    public static final String PURCHASE_RESTORE = "glpurchase_restore";
    public static final String PURCHASE_RESTORE_VERIFY = "glpurchase_restore_verify";
    public static final String PURCHASE_VIP_CHECK = "glpurchase_vip_check";
    public static final String QUERY_PURCHASELIST_TIME = "query_purchaselist_time";
    public static final String VIP_PAID_TROUBLE_NOTICE_METHODCALL = "vip_paidtroublenotice_methodcall";
    public static final String VIP_PAID_TROUBLE_NOTICE_SHOW = "vip_paidtroublenotice_show";
    public static final String VIP_PAID_TROUBLE_REPIAD_CONNECT_RESULT = "vip_paidtroublerepaidiconnect_result";
    public static final String VIP_PAID_TROUBLE_REPIAD_INAPPMESSAGE_RESULT = "vip_paidtroublerepaidinappmessage_result";
    public static final String VIP_PAID_TROUBLE_REPIAD_SUCCESS = "vip_paidtroublerepaid_success";

    private PurchaseLogEvent() {
    }
}
