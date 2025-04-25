package com.glority.base.routers;

import kotlin.Metadata;

/* compiled from: UrlRouter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bQ\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0011\u0010(\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0011\u0010,\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R\u0011\u00108\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0011\u0010:\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0007R\u0011\u0010<\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0011\u0010>\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0011\u0010@\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0011\u0010B\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0007R\u0011\u0010D\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0007R\u0011\u0010F\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0007R\u0011\u0010H\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0007R\u0011\u0010J\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0007R\u0011\u0010L\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0007R\u0011\u0010N\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0007R\u0011\u0010P\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0007R\u0011\u0010R\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0007R\u0011\u0010T\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0007¨\u0006V"}, d2 = {"Lcom/glority/base/routers/UrlRouter;", "", "<init>", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_OPEN_BILLING_ACTIVITY", "getURL_OPEN_BILLING_ACTIVITY", "URL_OPEN_ACCOUNT_ACTIVITY", "getURL_OPEN_ACCOUNT_ACTIVITY", "URL_OPEN_SEARCH_ACTIVITY", "getURL_OPEN_SEARCH_ACTIVITY", "URL_OPEN_MANAGE_MEMBERSHIP_ACTIVITY", "getURL_OPEN_MANAGE_MEMBERSHIP_ACTIVITY", "URL_OPEN_FEEDBACK_FRAGMENT", "getURL_OPEN_FEEDBACK_FRAGMENT", "URL_OPEN_REPORT_FRAGMENT", "getURL_OPEN_REPORT_FRAGMENT", "URL_OPEN_LEADERBOARD_FRAGMENT", "getURL_OPEN_LEADERBOARD_FRAGMENT", "URL_OPEN_PREMIUM_CENTER_FRAGMENT", "getURL_OPEN_PREMIUM_CENTER_FRAGMENT", "URL_OPEN_PROFILE_FRAGMENT", "getURL_OPEN_PROFILE_FRAGMENT", "URL_OPEN_VIP_SUPPORT_FRAGMENT", "getURL_OPEN_VIP_SUPPORT_FRAGMENT", "URL_OPEN_INSTRUCTIONS_FRAGMENT", "getURL_OPEN_INSTRUCTIONS_FRAGMENT", "URL_GET_RECOGNIZE_IMP", "getURL_GET_RECOGNIZE_IMP", "URL_AFTER_SPLASH_AGREE_POLICY", "getURL_AFTER_SPLASH_AGREE_POLICY", "URL_GET_CONFIRM_IMP", "getURL_GET_CONFIRM_IMP", "URL_GET_CMS_DETAIL_IMP", "getURL_GET_CMS_DETAIL_IMP", "URL_GET_CUSTOM_ME_FRAGMENT", "getURL_GET_CUSTOM_ME_FRAGMENT", "URL_OPEN_AFTER_RECOGNIZE_PAGE", "getURL_OPEN_AFTER_RECOGNIZE_PAGE", "URL_OPEN_SNAP_TIPS_ACTIVITY", "getURL_OPEN_SNAP_TIPS_ACTIVITY", "URL_GET_CUSTOM_HOME_FRAGMENT", "getURL_GET_CUSTOM_HOME_FRAGMENT", "URL_GET_SURVEY_JSON", "getURL_GET_SURVEY_JSON", "URL_GET_S3_SCOPE", "getURL_GET_S3_SCOPE", "URL_GET_PURCHASE_PAGE_RES", "getURL_GET_PURCHASE_PAGE_RES", "URL_GET_CONGRATULATIONS_PAGE_RES", "getURL_GET_CONGRATULATIONS_PAGE_RES", "URL_GET_ANALYZER_LIST", "getURL_GET_ANALYZER_LIST", "URL_SETTING_NOTIFICATIONS_CLICK", "getURL_SETTING_NOTIFICATIONS_CLICK", "URL_SETTING_VIP_CONTENT", "getURL_SETTING_VIP_CONTENT", "URL_HOME_PURCHASE_SHOULD_SHOW", "getURL_HOME_PURCHASE_SHOULD_SHOW", "URL_USER_CHANGED", "getURL_USER_CHANGED", "INIT_BILLING_SKUS_DATA", "getINIT_BILLING_SKUS_DATA", "CONSUME_BUY_SUCCESS", "getCONSUME_BUY_SUCCESS", "URL_REMIND_USER_BY_EMAIL", "getURL_REMIND_USER_BY_EMAIL", "URL_OPEN_HOW_TO_REMINDER_ACTIVITY", "getURL_OPEN_HOW_TO_REMINDER_ACTIVITY", "URL_OPEN_NO_NOTIFICATION_ACCESS_ACTIVITY", "getURL_OPEN_NO_NOTIFICATION_ACCESS_ACTIVITY", "URL_OPEN_REQUEST_RATING_DIALOG", "getURL_OPEN_REQUEST_RATING_DIALOG", "URL_CLICK_PREMIUM_CENTER_CONTACT_US", "getURL_CLICK_PREMIUM_CENTER_CONTACT_US", "URL_OPEN_FEEDBACK_AND_CONSULT_DIALOG", "getURL_OPEN_FEEDBACK_AND_CONSULT_DIALOG", "OPEN_NPS", "getOPEN_NPS", "URL_START_PURCHASE_MEMO_REPLACEMENT", "getURL_START_PURCHASE_MEMO_REPLACEMENT", "URL_PURCHASE_SUCCESS", "getURL_PURCHASE_SUCCESS", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class UrlRouter {
    public static final int $stable = 0;
    public static final UrlRouter INSTANCE = new UrlRouter();
    private static final String MODULE = "picture-xx/router";
    private static final String URL_OPEN_BILLING_ACTIVITY = "picture-xx/router/openBillingActivity";
    private static final String URL_OPEN_ACCOUNT_ACTIVITY = "picture-xx/router/openAccountActivity";
    private static final String URL_OPEN_SEARCH_ACTIVITY = "picture-xx/router/openSearchActivity";
    private static final String URL_OPEN_MANAGE_MEMBERSHIP_ACTIVITY = "picture-xx/router/openManageMembershipActivity";
    private static final String URL_OPEN_FEEDBACK_FRAGMENT = "picture-xx/router/openFeedbackFragment";
    private static final String URL_OPEN_REPORT_FRAGMENT = "picture-xx/router/openReportFragment";
    private static final String URL_OPEN_LEADERBOARD_FRAGMENT = "picture-xx/router/openLeaderboardFragment";
    private static final String URL_OPEN_PREMIUM_CENTER_FRAGMENT = "picture-xx/router/openPremiumCenterFragment";
    private static final String URL_OPEN_PROFILE_FRAGMENT = "picture-xx/router/openProfileFragment";
    private static final String URL_OPEN_VIP_SUPPORT_FRAGMENT = "picture-xx/router/openVipSupportFragment";
    private static final String URL_OPEN_INSTRUCTIONS_FRAGMENT = "picture-xx/router/openInstructionsFragment";
    private static final String URL_GET_RECOGNIZE_IMP = "picture-xx/router/getRecognizeImp";
    private static final String URL_AFTER_SPLASH_AGREE_POLICY = "picture-xx/router/afterSplashAgreePolicy";
    private static final String URL_GET_CONFIRM_IMP = "picture-xx/router/getCmsConfirmImp";
    private static final String URL_GET_CMS_DETAIL_IMP = "picture-xx/router/getCmsDetailImp";
    private static final String URL_GET_CUSTOM_ME_FRAGMENT = "picture-xx/router/getCustomMeFragment";
    private static final String URL_OPEN_AFTER_RECOGNIZE_PAGE = "picture-xx/router/openAfterRecognizePage";
    private static final String URL_OPEN_SNAP_TIPS_ACTIVITY = "picture-xx/router/getSnapTipsActivity";
    private static final String URL_GET_CUSTOM_HOME_FRAGMENT = "picture-xx/router/getCustomHomeFragment";
    private static final String URL_GET_SURVEY_JSON = "picture-xx/router/getSurveyJson";
    private static final String URL_GET_S3_SCOPE = "picture-xx/router/getS3Scope";
    private static final String URL_GET_PURCHASE_PAGE_RES = "picture-xx/router/getConvertPageRes";
    private static final String URL_GET_CONGRATULATIONS_PAGE_RES = "picture-xx/router/getCongratulationsPageRes";
    private static final String URL_GET_ANALYZER_LIST = "picture-xx/router/getAnalyzerList";
    private static final String URL_SETTING_NOTIFICATIONS_CLICK = "picture-xx/router/clickNotificationsSetting";
    private static final String URL_SETTING_VIP_CONTENT = "picture-xx/router/settingVipContent";
    private static final String URL_HOME_PURCHASE_SHOULD_SHOW = "picture-xx/router/homePurchaseShouldShow";
    private static final String URL_USER_CHANGED = "picture-xx/router/userChanged";
    private static final String INIT_BILLING_SKUS_DATA = "picture-xx/router/initBillingSkusData";
    private static final String CONSUME_BUY_SUCCESS = "picture-xx/router/consume_buy_success";
    private static final String URL_REMIND_USER_BY_EMAIL = "picture-xx/router/PurchaseRemindUserByEmail";
    private static final String URL_OPEN_HOW_TO_REMINDER_ACTIVITY = "picture-xx/router/openHowToReminderActivity";
    private static final String URL_OPEN_NO_NOTIFICATION_ACCESS_ACTIVITY = "picture-xx/router/openNoNotificationAccessActivity";
    private static final String URL_OPEN_REQUEST_RATING_DIALOG = "picture-xx/router/openRequestRatingDialog";
    private static final String URL_CLICK_PREMIUM_CENTER_CONTACT_US = "picture-xx/router/clickPremiumCenterContactUs";
    private static final String URL_OPEN_FEEDBACK_AND_CONSULT_DIALOG = "picture-xx/router/openFeedbackAndConsultDialog";
    private static final String OPEN_NPS = "picture-xx/router/opennps";
    private static final String URL_START_PURCHASE_MEMO_REPLACEMENT = "picture-xx/router/startPurchaseMemoReplacement";
    private static final String URL_PURCHASE_SUCCESS = "picture-xx/router/purchaseSuccess";

    private UrlRouter() {
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_OPEN_BILLING_ACTIVITY() {
        return URL_OPEN_BILLING_ACTIVITY;
    }

    public final String getURL_OPEN_ACCOUNT_ACTIVITY() {
        return URL_OPEN_ACCOUNT_ACTIVITY;
    }

    public final String getURL_OPEN_SEARCH_ACTIVITY() {
        return URL_OPEN_SEARCH_ACTIVITY;
    }

    public final String getURL_OPEN_MANAGE_MEMBERSHIP_ACTIVITY() {
        return URL_OPEN_MANAGE_MEMBERSHIP_ACTIVITY;
    }

    public final String getURL_OPEN_FEEDBACK_FRAGMENT() {
        return URL_OPEN_FEEDBACK_FRAGMENT;
    }

    public final String getURL_OPEN_REPORT_FRAGMENT() {
        return URL_OPEN_REPORT_FRAGMENT;
    }

    public final String getURL_OPEN_LEADERBOARD_FRAGMENT() {
        return URL_OPEN_LEADERBOARD_FRAGMENT;
    }

    public final String getURL_OPEN_PREMIUM_CENTER_FRAGMENT() {
        return URL_OPEN_PREMIUM_CENTER_FRAGMENT;
    }

    public final String getURL_OPEN_PROFILE_FRAGMENT() {
        return URL_OPEN_PROFILE_FRAGMENT;
    }

    public final String getURL_OPEN_VIP_SUPPORT_FRAGMENT() {
        return URL_OPEN_VIP_SUPPORT_FRAGMENT;
    }

    public final String getURL_OPEN_INSTRUCTIONS_FRAGMENT() {
        return URL_OPEN_INSTRUCTIONS_FRAGMENT;
    }

    public final String getURL_GET_RECOGNIZE_IMP() {
        return URL_GET_RECOGNIZE_IMP;
    }

    public final String getURL_AFTER_SPLASH_AGREE_POLICY() {
        return URL_AFTER_SPLASH_AGREE_POLICY;
    }

    public final String getURL_GET_CONFIRM_IMP() {
        return URL_GET_CONFIRM_IMP;
    }

    public final String getURL_GET_CMS_DETAIL_IMP() {
        return URL_GET_CMS_DETAIL_IMP;
    }

    public final String getURL_GET_CUSTOM_ME_FRAGMENT() {
        return URL_GET_CUSTOM_ME_FRAGMENT;
    }

    public final String getURL_OPEN_AFTER_RECOGNIZE_PAGE() {
        return URL_OPEN_AFTER_RECOGNIZE_PAGE;
    }

    public final String getURL_OPEN_SNAP_TIPS_ACTIVITY() {
        return URL_OPEN_SNAP_TIPS_ACTIVITY;
    }

    public final String getURL_GET_CUSTOM_HOME_FRAGMENT() {
        return URL_GET_CUSTOM_HOME_FRAGMENT;
    }

    public final String getURL_GET_SURVEY_JSON() {
        return URL_GET_SURVEY_JSON;
    }

    public final String getURL_GET_S3_SCOPE() {
        return URL_GET_S3_SCOPE;
    }

    public final String getURL_GET_PURCHASE_PAGE_RES() {
        return URL_GET_PURCHASE_PAGE_RES;
    }

    public final String getURL_GET_CONGRATULATIONS_PAGE_RES() {
        return URL_GET_CONGRATULATIONS_PAGE_RES;
    }

    public final String getURL_GET_ANALYZER_LIST() {
        return URL_GET_ANALYZER_LIST;
    }

    public final String getURL_SETTING_NOTIFICATIONS_CLICK() {
        return URL_SETTING_NOTIFICATIONS_CLICK;
    }

    public final String getURL_SETTING_VIP_CONTENT() {
        return URL_SETTING_VIP_CONTENT;
    }

    public final String getURL_HOME_PURCHASE_SHOULD_SHOW() {
        return URL_HOME_PURCHASE_SHOULD_SHOW;
    }

    public final String getURL_USER_CHANGED() {
        return URL_USER_CHANGED;
    }

    public final String getINIT_BILLING_SKUS_DATA() {
        return INIT_BILLING_SKUS_DATA;
    }

    public final String getCONSUME_BUY_SUCCESS() {
        return CONSUME_BUY_SUCCESS;
    }

    public final String getURL_REMIND_USER_BY_EMAIL() {
        return URL_REMIND_USER_BY_EMAIL;
    }

    public final String getURL_OPEN_HOW_TO_REMINDER_ACTIVITY() {
        return URL_OPEN_HOW_TO_REMINDER_ACTIVITY;
    }

    public final String getURL_OPEN_NO_NOTIFICATION_ACCESS_ACTIVITY() {
        return URL_OPEN_NO_NOTIFICATION_ACCESS_ACTIVITY;
    }

    public final String getURL_OPEN_REQUEST_RATING_DIALOG() {
        return URL_OPEN_REQUEST_RATING_DIALOG;
    }

    public final String getURL_CLICK_PREMIUM_CENTER_CONTACT_US() {
        return URL_CLICK_PREMIUM_CENTER_CONTACT_US;
    }

    public final String getURL_OPEN_FEEDBACK_AND_CONSULT_DIALOG() {
        return URL_OPEN_FEEDBACK_AND_CONSULT_DIALOG;
    }

    public final String getOPEN_NPS() {
        return OPEN_NPS;
    }

    public final String getURL_START_PURCHASE_MEMO_REPLACEMENT() {
        return URL_START_PURCHASE_MEMO_REPLACEMENT;
    }

    public final String getURL_PURCHASE_SUCCESS() {
        return URL_PURCHASE_SUCCESS;
    }
}
