package com.glority.android;

import kotlin.Metadata;

/* compiled from: PurchaseUiLogEvents.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/PurchaseUiLogEvents;", "", "<init>", "()V", "NOTIFICATION_ACCESS_DIALOG", "", "NOTIFICATION_ACCESS_DIALOG_GO_TO_SETTINGS_CLICK", "NOTIFICATION_ACCESS_DIALOG_LATER_CLICK", "HOW_TO_REMINDER", "HOW_TO_REMINDER_GOT_IT_CLICK", "HOW_TO_REMINDER_VIA_EMAIL_CLKICK", "HOW_TO_REMINDER_CLOSE_CLKICK", "HOW_TO_REMINDER_REGISTER_EMAIL_SUCCESS", "HOW_TO_REMINDER_REGISTER_EMAIL_FAILED", "INPUTEMAILBYREMINDER", "INPUTEMAILBYREMINDER_SUBMIT_CLICK", "INPUTEMAILBYREMINDER_NOTNEED_CLICK", "INPUTEMAILBYREMINDER_EMAIL_CLICK", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes.dex */
public final class PurchaseUiLogEvents {
    public static final String HOW_TO_REMINDER = "vip_reminderaccessedalert";
    public static final String HOW_TO_REMINDER_CLOSE_CLKICK = "vip_reminderaccessedalertcross_click";
    public static final String HOW_TO_REMINDER_GOT_IT_CLICK = "vip_reminderaccessedalertok_click";
    public static final String HOW_TO_REMINDER_REGISTER_EMAIL_FAILED = "vip_reminderaccessedalertregisteremail_failed";
    public static final String HOW_TO_REMINDER_REGISTER_EMAIL_SUCCESS = "vip_reminderaccessedalertregisteremail_success";
    public static final String HOW_TO_REMINDER_VIA_EMAIL_CLKICK = "vip_reminderaccessedalertsendemail_click";
    public static final String INPUTEMAILBYREMINDER = "inputemailbyreminder";
    public static final String INPUTEMAILBYREMINDER_EMAIL_CLICK = "inputemailbyreminder_email_click";
    public static final String INPUTEMAILBYREMINDER_NOTNEED_CLICK = "inputemailbyreminder_notneed_click";
    public static final String INPUTEMAILBYREMINDER_SUBMIT_CLICK = "inputemailbyreminder_submit_click";
    public static final PurchaseUiLogEvents INSTANCE = new PurchaseUiLogEvents();
    public static final String NOTIFICATION_ACCESS_DIALOG = "vip_remindernoaccessalert";
    public static final String NOTIFICATION_ACCESS_DIALOG_GO_TO_SETTINGS_CLICK = "vip_remindernoaccessalertgotosettings_click";
    public static final String NOTIFICATION_ACCESS_DIALOG_LATER_CLICK = "vip_remindernoaccessalertlater_click";

    private PurchaseUiLogEvents() {
    }
}
