package com.glority.android.core.route.guide;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import com.glority.android.core.proguard.NotProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlGuide.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bq\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001a\u0010]\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001a\u0010`\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001a\u0010f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001a\u0010l\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001a\u0010o\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001a\u0010r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\b¨\u0006u"}, d2 = {"Lcom/glority/android/core/route/guide/UrlGuide;", "", "()V", "GET_ASK_EXPORT_COUNT", "", "getGET_ASK_EXPORT_COUNT", "()Ljava/lang/String;", "setGET_ASK_EXPORT_COUNT", "(Ljava/lang/String;)V", "GET_USER_CREATE_DAYS", "getGET_USER_CREATE_DAYS", "setGET_USER_CREATE_DAYS", "GET_USER_PLANT_COUNT", "getGET_USER_PLANT_COUNT", "setGET_USER_PLANT_COUNT", "IS_REINSTALL_USER", "getIS_REINSTALL_USER", "setIS_REINSTALL_USER", "MODULE", "getMODULE", "setMODULE", "URL_BILLING_GET_INTRODUCTORY_PRICE", "getURL_BILLING_GET_INTRODUCTORY_PRICE", "setURL_BILLING_GET_INTRODUCTORY_PRICE", "URL_BILLING_GET_PRICE", "getURL_BILLING_GET_PRICE", "setURL_BILLING_GET_PRICE", "URL_BILLING_GET_PRICE_IN_APP", "getURL_BILLING_GET_PRICE_IN_APP", "setURL_BILLING_GET_PRICE_IN_APP", "URL_BILLING_H5_VIP_CLOSE_BACK", "getURL_BILLING_H5_VIP_CLOSE_BACK", "setURL_BILLING_H5_VIP_CLOSE_BACK", "URL_BILLING_H5_VIP_OPEN", "getURL_BILLING_H5_VIP_OPEN", "setURL_BILLING_H5_VIP_OPEN", "URL_BILLING_INIT", "getURL_BILLING_INIT", "setURL_BILLING_INIT", "URL_BILLING_INIT_IN_APP", "getURL_BILLING_INIT_IN_APP", "setURL_BILLING_INIT_IN_APP", "URL_BILLING_SCROLL_TO_DATA_POLICY", "getURL_BILLING_SCROLL_TO_DATA_POLICY", "setURL_BILLING_SCROLL_TO_DATA_POLICY", "URL_BILLING_SET_POLICY_CLICK", "getURL_BILLING_SET_POLICY_CLICK", "setURL_BILLING_SET_POLICY_CLICK", "URL_BILLING_SET_POLICY_CLICK_V2", "getURL_BILLING_SET_POLICY_CLICK_V2", "setURL_BILLING_SET_POLICY_CLICK_V2", "URL_BILLING_SET_PRICE_BOLD", "getURL_BILLING_SET_PRICE_BOLD", "setURL_BILLING_SET_PRICE_BOLD", "URL_BILLING_UI_CLOSE", "getURL_BILLING_UI_CLOSE", "setURL_BILLING_UI_CLOSE", "URL_CLOSE", "getURL_CLOSE", "setURL_CLOSE", "URL_CURRENCY_SIGN", "getURL_CURRENCY_SIGN", "setURL_CURRENCY_SIGN", "URL_CURRENCY_SYMBOL", "getURL_CURRENCY_SYMBOL", "setURL_CURRENCY_SYMBOL", "URL_CURRENCY_SYMBOL_IN_APP", "getURL_CURRENCY_SYMBOL_IN_APP", "setURL_CURRENCY_SYMBOL_IN_APP", "URL_EXTRA_CLOSE", "getURL_EXTRA_CLOSE", "setURL_EXTRA_CLOSE", "URL_FREE", "getURL_FREE", "setURL_FREE", "URL_GET_EXPIRED_ITEM_LIST", "getURL_GET_EXPIRED_ITEM_LIST", "setURL_GET_EXPIRED_ITEM_LIST", "URL_GET_LANGUAGE_CODE", "getURL_GET_LANGUAGE_CODE", "setURL_GET_LANGUAGE_CODE", "URL_IS_ARABIC", "getURL_IS_ARABIC", "setURL_IS_ARABIC", "URL_IS_CANADA_GOOGLE_ACCOUNT", "getURL_IS_CANADA_GOOGLE_ACCOUNT", "setURL_IS_CANADA_GOOGLE_ACCOUNT", "URL_IS_JAPANESE", "getURL_IS_JAPANESE", "setURL_IS_JAPANESE", "URL_IS_VIP_IN_HISTORY", "getURL_IS_VIP_IN_HISTORY", "setURL_IS_VIP_IN_HISTORY", "URL_OPEN_CONVERT_PAGE", "getURL_OPEN_CONVERT_PAGE", "setURL_OPEN_CONVERT_PAGE", "URL_OPEN_CONVERT_PAGE_WITH_EXTRA", "getURL_OPEN_CONVERT_PAGE_WITH_EXTRA", "setURL_OPEN_CONVERT_PAGE_WITH_EXTRA", "URL_OPEN_PRIVACY_POLICY", "getURL_OPEN_PRIVACY_POLICY", "setURL_OPEN_PRIVACY_POLICY", "URL_OPEN_SERVER_TERMS", "getURL_OPEN_SERVER_TERMS", "setURL_OPEN_SERVER_TERMS", "URL_PURCHASE", "getURL_PURCHASE", "setURL_PURCHASE", "URL_PURCHASE_BY_MODE", "getURL_PURCHASE_BY_MODE", "setURL_PURCHASE_BY_MODE", "URL_PURCHASE_WITHOUT_DETAIN", "getURL_PURCHASE_WITHOUT_DETAIN", "setURL_PURCHASE_WITHOUT_DETAIN", "URL_RESTORE", "getURL_RESTORE", "setURL_RESTORE", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlGuide {
    private static String GET_ASK_EXPORT_COUNT;
    private static String GET_USER_CREATE_DAYS;
    private static String GET_USER_PLANT_COUNT;
    public static final UrlGuide INSTANCE = new UrlGuide();
    private static String IS_REINSTALL_USER;
    private static String MODULE;
    private static String URL_BILLING_GET_INTRODUCTORY_PRICE;
    private static String URL_BILLING_GET_PRICE;
    private static String URL_BILLING_GET_PRICE_IN_APP;
    private static String URL_BILLING_H5_VIP_CLOSE_BACK;
    private static String URL_BILLING_H5_VIP_OPEN;
    private static String URL_BILLING_INIT;
    private static String URL_BILLING_INIT_IN_APP;
    private static String URL_BILLING_SCROLL_TO_DATA_POLICY;
    private static String URL_BILLING_SET_POLICY_CLICK;
    private static String URL_BILLING_SET_POLICY_CLICK_V2;
    private static String URL_BILLING_SET_PRICE_BOLD;
    private static String URL_BILLING_UI_CLOSE;
    private static String URL_CLOSE;
    private static String URL_CURRENCY_SIGN;
    private static String URL_CURRENCY_SYMBOL;
    private static String URL_CURRENCY_SYMBOL_IN_APP;
    private static String URL_EXTRA_CLOSE;
    private static String URL_FREE;
    private static String URL_GET_EXPIRED_ITEM_LIST;
    private static String URL_GET_LANGUAGE_CODE;
    private static String URL_IS_ARABIC;
    private static String URL_IS_CANADA_GOOGLE_ACCOUNT;
    private static String URL_IS_JAPANESE;
    private static String URL_IS_VIP_IN_HISTORY;
    private static String URL_OPEN_CONVERT_PAGE;
    private static String URL_OPEN_CONVERT_PAGE_WITH_EXTRA;
    private static String URL_OPEN_PRIVACY_POLICY;
    private static String URL_OPEN_SERVER_TERMS;
    private static String URL_PURCHASE;
    private static String URL_PURCHASE_BY_MODE;
    private static String URL_PURCHASE_WITHOUT_DETAIN;
    private static String URL_RESTORE;

    private UrlGuide() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "guide");
        MODULE = stringPlus;
        URL_BILLING_INIT = Intrinsics.stringPlus(stringPlus, "/init");
        URL_BILLING_SET_POLICY_CLICK = Intrinsics.stringPlus(MODULE, "/setPolicyClick");
        URL_BILLING_SCROLL_TO_DATA_POLICY = Intrinsics.stringPlus(MODULE, "/scrollToDataPolicy");
        URL_BILLING_GET_PRICE = Intrinsics.stringPlus(MODULE, "/getPrice");
        URL_RESTORE = Intrinsics.stringPlus(MODULE, "/restore");
        URL_PURCHASE = Intrinsics.stringPlus(MODULE, "/purchase");
        URL_PURCHASE_BY_MODE = Intrinsics.stringPlus(MODULE, "/purchaseByMode");
        URL_FREE = Intrinsics.stringPlus(MODULE, "/Free");
        URL_IS_JAPANESE = Intrinsics.stringPlus(MODULE, "/IsJapanese");
        URL_IS_ARABIC = Intrinsics.stringPlus(MODULE, "/isArabic");
        URL_GET_LANGUAGE_CODE = Intrinsics.stringPlus(MODULE, "/get_language_code");
        URL_CLOSE = Intrinsics.stringPlus(MODULE, "/close");
        URL_CURRENCY_SYMBOL = Intrinsics.stringPlus(MODULE, "/get_currency_symbol");
        URL_IS_CANADA_GOOGLE_ACCOUNT = Intrinsics.stringPlus(MODULE, "/url_is_canada_google_account");
        URL_OPEN_SERVER_TERMS = Intrinsics.stringPlus(MODULE, "/open_server_terms");
        URL_OPEN_PRIVACY_POLICY = Intrinsics.stringPlus(MODULE, "/open_privacy_policy");
        URL_OPEN_CONVERT_PAGE = Intrinsics.stringPlus(MODULE, "/open_convert_page");
        URL_BILLING_SET_PRICE_BOLD = Intrinsics.stringPlus(MODULE, "/set_price_bold");
        URL_BILLING_SET_POLICY_CLICK_V2 = Intrinsics.stringPlus(MODULE, "/setPolicyClickV2");
        URL_BILLING_GET_INTRODUCTORY_PRICE = Intrinsics.stringPlus(MODULE, "/getIntroductoryPrice");
        URL_BILLING_UI_CLOSE = Intrinsics.stringPlus(MODULE, "/uiClose");
        URL_OPEN_CONVERT_PAGE_WITH_EXTRA = Intrinsics.stringPlus(MODULE, "/open_convert_page_with_extra");
        URL_PURCHASE_WITHOUT_DETAIN = Intrinsics.stringPlus(MODULE, "/purchaseWithoutDetain");
        URL_IS_VIP_IN_HISTORY = Intrinsics.stringPlus(MODULE, "/isVipInHistory");
        URL_EXTRA_CLOSE = Intrinsics.stringPlus(MODULE, "/extra_close");
        URL_BILLING_INIT_IN_APP = Intrinsics.stringPlus(MODULE, "/init_in_app");
        URL_CURRENCY_SYMBOL_IN_APP = Intrinsics.stringPlus(MODULE, "/get_currency_symbol_in_app");
        URL_BILLING_GET_PRICE_IN_APP = Intrinsics.stringPlus(MODULE, "/getPrice_in_app");
        URL_BILLING_H5_VIP_OPEN = Intrinsics.stringPlus(MODULE, "/h5_vip_open");
        URL_BILLING_H5_VIP_CLOSE_BACK = Intrinsics.stringPlus(MODULE, "/h5_vip_close_back");
        GET_USER_CREATE_DAYS = Intrinsics.stringPlus(MODULE, "/getUserCreateDays");
        GET_USER_PLANT_COUNT = Intrinsics.stringPlus(MODULE, "/getUserPlantCount");
        GET_ASK_EXPORT_COUNT = Intrinsics.stringPlus(MODULE, "/getAskExportCount");
        IS_REINSTALL_USER = Intrinsics.stringPlus(MODULE, "/isReinstallUser");
        URL_CURRENCY_SIGN = Intrinsics.stringPlus(MODULE, "/get_currency_sign");
        URL_GET_EXPIRED_ITEM_LIST = Intrinsics.stringPlus(MODULE, "/get_expired_item_list");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_BILLING_INIT() {
        return URL_BILLING_INIT;
    }

    public final void setURL_BILLING_INIT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_INIT = str;
    }

    public final String getURL_BILLING_SET_POLICY_CLICK() {
        return URL_BILLING_SET_POLICY_CLICK;
    }

    public final void setURL_BILLING_SET_POLICY_CLICK(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_SET_POLICY_CLICK = str;
    }

    public final String getURL_BILLING_SCROLL_TO_DATA_POLICY() {
        return URL_BILLING_SCROLL_TO_DATA_POLICY;
    }

    public final void setURL_BILLING_SCROLL_TO_DATA_POLICY(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_SCROLL_TO_DATA_POLICY = str;
    }

    public final String getURL_BILLING_GET_PRICE() {
        return URL_BILLING_GET_PRICE;
    }

    public final void setURL_BILLING_GET_PRICE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_GET_PRICE = str;
    }

    public final String getURL_RESTORE() {
        return URL_RESTORE;
    }

    public final void setURL_RESTORE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_RESTORE = str;
    }

    public final String getURL_PURCHASE() {
        return URL_PURCHASE;
    }

    public final void setURL_PURCHASE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_PURCHASE = str;
    }

    public final String getURL_PURCHASE_BY_MODE() {
        return URL_PURCHASE_BY_MODE;
    }

    public final void setURL_PURCHASE_BY_MODE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_PURCHASE_BY_MODE = str;
    }

    public final String getURL_FREE() {
        return URL_FREE;
    }

    public final void setURL_FREE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_FREE = str;
    }

    public final String getURL_IS_JAPANESE() {
        return URL_IS_JAPANESE;
    }

    public final void setURL_IS_JAPANESE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_IS_JAPANESE = str;
    }

    public final String getURL_IS_ARABIC() {
        return URL_IS_ARABIC;
    }

    public final void setURL_IS_ARABIC(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_IS_ARABIC = str;
    }

    public final String getURL_GET_LANGUAGE_CODE() {
        return URL_GET_LANGUAGE_CODE;
    }

    public final void setURL_GET_LANGUAGE_CODE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_GET_LANGUAGE_CODE = str;
    }

    public final String getURL_CLOSE() {
        return URL_CLOSE;
    }

    public final void setURL_CLOSE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_CLOSE = str;
    }

    public final String getURL_CURRENCY_SYMBOL() {
        return URL_CURRENCY_SYMBOL;
    }

    public final void setURL_CURRENCY_SYMBOL(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_CURRENCY_SYMBOL = str;
    }

    public final String getURL_IS_CANADA_GOOGLE_ACCOUNT() {
        return URL_IS_CANADA_GOOGLE_ACCOUNT;
    }

    public final void setURL_IS_CANADA_GOOGLE_ACCOUNT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_IS_CANADA_GOOGLE_ACCOUNT = str;
    }

    public final String getURL_OPEN_SERVER_TERMS() {
        return URL_OPEN_SERVER_TERMS;
    }

    public final void setURL_OPEN_SERVER_TERMS(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_OPEN_SERVER_TERMS = str;
    }

    public final String getURL_OPEN_PRIVACY_POLICY() {
        return URL_OPEN_PRIVACY_POLICY;
    }

    public final void setURL_OPEN_PRIVACY_POLICY(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_OPEN_PRIVACY_POLICY = str;
    }

    public final String getURL_OPEN_CONVERT_PAGE() {
        return URL_OPEN_CONVERT_PAGE;
    }

    public final void setURL_OPEN_CONVERT_PAGE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_OPEN_CONVERT_PAGE = str;
    }

    public final String getURL_BILLING_SET_PRICE_BOLD() {
        return URL_BILLING_SET_PRICE_BOLD;
    }

    public final void setURL_BILLING_SET_PRICE_BOLD(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_SET_PRICE_BOLD = str;
    }

    public final String getURL_BILLING_SET_POLICY_CLICK_V2() {
        return URL_BILLING_SET_POLICY_CLICK_V2;
    }

    public final void setURL_BILLING_SET_POLICY_CLICK_V2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_SET_POLICY_CLICK_V2 = str;
    }

    public final String getURL_BILLING_GET_INTRODUCTORY_PRICE() {
        return URL_BILLING_GET_INTRODUCTORY_PRICE;
    }

    public final void setURL_BILLING_GET_INTRODUCTORY_PRICE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_GET_INTRODUCTORY_PRICE = str;
    }

    public final String getURL_BILLING_UI_CLOSE() {
        return URL_BILLING_UI_CLOSE;
    }

    public final void setURL_BILLING_UI_CLOSE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_UI_CLOSE = str;
    }

    public final String getURL_OPEN_CONVERT_PAGE_WITH_EXTRA() {
        return URL_OPEN_CONVERT_PAGE_WITH_EXTRA;
    }

    public final void setURL_OPEN_CONVERT_PAGE_WITH_EXTRA(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_OPEN_CONVERT_PAGE_WITH_EXTRA = str;
    }

    public final String getURL_PURCHASE_WITHOUT_DETAIN() {
        return URL_PURCHASE_WITHOUT_DETAIN;
    }

    public final void setURL_PURCHASE_WITHOUT_DETAIN(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_PURCHASE_WITHOUT_DETAIN = str;
    }

    public final String getURL_IS_VIP_IN_HISTORY() {
        return URL_IS_VIP_IN_HISTORY;
    }

    public final void setURL_IS_VIP_IN_HISTORY(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_IS_VIP_IN_HISTORY = str;
    }

    public final String getURL_EXTRA_CLOSE() {
        return URL_EXTRA_CLOSE;
    }

    public final void setURL_EXTRA_CLOSE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_EXTRA_CLOSE = str;
    }

    public final String getURL_BILLING_INIT_IN_APP() {
        return URL_BILLING_INIT_IN_APP;
    }

    public final void setURL_BILLING_INIT_IN_APP(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_INIT_IN_APP = str;
    }

    public final String getURL_CURRENCY_SYMBOL_IN_APP() {
        return URL_CURRENCY_SYMBOL_IN_APP;
    }

    public final void setURL_CURRENCY_SYMBOL_IN_APP(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_CURRENCY_SYMBOL_IN_APP = str;
    }

    public final String getURL_BILLING_GET_PRICE_IN_APP() {
        return URL_BILLING_GET_PRICE_IN_APP;
    }

    public final void setURL_BILLING_GET_PRICE_IN_APP(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_GET_PRICE_IN_APP = str;
    }

    public final String getURL_BILLING_H5_VIP_OPEN() {
        return URL_BILLING_H5_VIP_OPEN;
    }

    public final void setURL_BILLING_H5_VIP_OPEN(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_H5_VIP_OPEN = str;
    }

    public final String getURL_BILLING_H5_VIP_CLOSE_BACK() {
        return URL_BILLING_H5_VIP_CLOSE_BACK;
    }

    public final void setURL_BILLING_H5_VIP_CLOSE_BACK(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BILLING_H5_VIP_CLOSE_BACK = str;
    }

    public final String getGET_USER_CREATE_DAYS() {
        return GET_USER_CREATE_DAYS;
    }

    public final void setGET_USER_CREATE_DAYS(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        GET_USER_CREATE_DAYS = str;
    }

    public final String getGET_USER_PLANT_COUNT() {
        return GET_USER_PLANT_COUNT;
    }

    public final void setGET_USER_PLANT_COUNT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        GET_USER_PLANT_COUNT = str;
    }

    public final String getGET_ASK_EXPORT_COUNT() {
        return GET_ASK_EXPORT_COUNT;
    }

    public final void setGET_ASK_EXPORT_COUNT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        GET_ASK_EXPORT_COUNT = str;
    }

    public final String getIS_REINSTALL_USER() {
        return IS_REINSTALL_USER;
    }

    public final void setIS_REINSTALL_USER(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        IS_REINSTALL_USER = str;
    }

    public final String getURL_CURRENCY_SIGN() {
        return URL_CURRENCY_SIGN;
    }

    public final void setURL_CURRENCY_SIGN(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_CURRENCY_SIGN = str;
    }

    public final String getURL_GET_EXPIRED_ITEM_LIST() {
        return URL_GET_EXPIRED_ITEM_LIST;
    }

    public final void setURL_GET_EXPIRED_ITEM_LIST(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_GET_EXPIRED_ITEM_LIST = str;
    }
}
