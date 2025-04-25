package com.glority.android.core.route.agreement;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlAgreement.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006¨\u0006%"}, d2 = {"Lcom/glority/android/core/route/agreement/UrlAgreement;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_AGREE_AGREEMENT", "getURL_AGREE_AGREEMENT", "URL_ENABLE_COOKIE_CONTROL", "getURL_ENABLE_COOKIE_CONTROL", "URL_GET_CONFIG", "getURL_GET_CONFIG", "URL_GET_LOCAL_AGREEMENT_VERSION", "getURL_GET_LOCAL_AGREEMENT_VERSION", "URL_GET_PRIVACY_POLICY_URL", "getURL_GET_PRIVACY_POLICY_URL", "URL_GET_TERMS_OF_USE_URL", "getURL_GET_TERMS_OF_USE_URL", "URL_IS_AGREED_AGREEMENT", "getURL_IS_AGREED_AGREEMENT", "URL_IS_COOKIE_CONTROL_ENABLED", "getURL_IS_COOKIE_CONTROL_ENABLED", "URL_NEED_UPDATE_AGREEMENT", "getURL_NEED_UPDATE_AGREEMENT", "URL_OPEN_AGREEMENT_PAGE", "getURL_OPEN_AGREEMENT_PAGE", "URL_OPEN_DELETE_ACCOUNT_PAGE_REQUEST", "getURL_OPEN_DELETE_ACCOUNT_PAGE_REQUEST", "URL_OPEN_PRIVACY_POLICY_PAGE", "getURL_OPEN_PRIVACY_POLICY_PAGE", "URL_OPEN_SUBSCRIPTION_TERMS_PAGE", "getURL_OPEN_SUBSCRIPTION_TERMS_PAGE", "URL_OPEN_TERMS_OF_USE_PAGE", "getURL_OPEN_TERMS_OF_USE_PAGE", "URL_UPDATE_CONFIG", "getURL_UPDATE_CONFIG", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlAgreement {
    public static final UrlAgreement INSTANCE = new UrlAgreement();
    private static final String MODULE;
    private static final String URL_AGREE_AGREEMENT;
    private static final String URL_ENABLE_COOKIE_CONTROL;
    private static final String URL_GET_CONFIG;
    private static final String URL_GET_LOCAL_AGREEMENT_VERSION;
    private static final String URL_GET_PRIVACY_POLICY_URL;
    private static final String URL_GET_TERMS_OF_USE_URL;
    private static final String URL_IS_AGREED_AGREEMENT;
    private static final String URL_IS_COOKIE_CONTROL_ENABLED;
    private static final String URL_NEED_UPDATE_AGREEMENT;
    private static final String URL_OPEN_AGREEMENT_PAGE;
    private static final String URL_OPEN_DELETE_ACCOUNT_PAGE_REQUEST;
    private static final String URL_OPEN_PRIVACY_POLICY_PAGE;
    private static final String URL_OPEN_SUBSCRIPTION_TERMS_PAGE;
    private static final String URL_OPEN_TERMS_OF_USE_PAGE;
    private static final String URL_UPDATE_CONFIG;

    private UrlAgreement() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "agreement");
        MODULE = stringPlus;
        URL_GET_CONFIG = Intrinsics.stringPlus(stringPlus, "/getConfig");
        URL_UPDATE_CONFIG = Intrinsics.stringPlus(stringPlus, "/updateConfig");
        URL_OPEN_AGREEMENT_PAGE = Intrinsics.stringPlus(stringPlus, "/openAgreementPage");
        URL_OPEN_TERMS_OF_USE_PAGE = Intrinsics.stringPlus(stringPlus, "/openTermsOfUsePage");
        URL_OPEN_PRIVACY_POLICY_PAGE = Intrinsics.stringPlus(stringPlus, "/openPrivacyPolicyPage");
        URL_OPEN_SUBSCRIPTION_TERMS_PAGE = Intrinsics.stringPlus(stringPlus, "/openSubscriptionTermsPage");
        URL_GET_TERMS_OF_USE_URL = Intrinsics.stringPlus(stringPlus, "/getTermsOfUseUrl");
        URL_GET_PRIVACY_POLICY_URL = Intrinsics.stringPlus(stringPlus, "/getPrivacyPolicyUrl");
        URL_NEED_UPDATE_AGREEMENT = Intrinsics.stringPlus(stringPlus, "/needUpdateAgreement");
        URL_AGREE_AGREEMENT = Intrinsics.stringPlus(stringPlus, "/agreeAgreement");
        URL_IS_AGREED_AGREEMENT = Intrinsics.stringPlus(stringPlus, "/isAgreedAgreement");
        URL_GET_LOCAL_AGREEMENT_VERSION = Intrinsics.stringPlus(stringPlus, "/getLocalAgreementVersion");
        URL_ENABLE_COOKIE_CONTROL = Intrinsics.stringPlus(stringPlus, "/enableCookieControl");
        URL_IS_COOKIE_CONTROL_ENABLED = Intrinsics.stringPlus(stringPlus, "/isCookieControlEnabled");
        URL_OPEN_DELETE_ACCOUNT_PAGE_REQUEST = Intrinsics.stringPlus(stringPlus, "/openDeleteAccountPageRequest");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_GET_CONFIG() {
        return URL_GET_CONFIG;
    }

    public final String getURL_UPDATE_CONFIG() {
        return URL_UPDATE_CONFIG;
    }

    public final String getURL_OPEN_AGREEMENT_PAGE() {
        return URL_OPEN_AGREEMENT_PAGE;
    }

    public final String getURL_OPEN_TERMS_OF_USE_PAGE() {
        return URL_OPEN_TERMS_OF_USE_PAGE;
    }

    public final String getURL_OPEN_PRIVACY_POLICY_PAGE() {
        return URL_OPEN_PRIVACY_POLICY_PAGE;
    }

    public final String getURL_OPEN_SUBSCRIPTION_TERMS_PAGE() {
        return URL_OPEN_SUBSCRIPTION_TERMS_PAGE;
    }

    public final String getURL_GET_TERMS_OF_USE_URL() {
        return URL_GET_TERMS_OF_USE_URL;
    }

    public final String getURL_GET_PRIVACY_POLICY_URL() {
        return URL_GET_PRIVACY_POLICY_URL;
    }

    public final String getURL_NEED_UPDATE_AGREEMENT() {
        return URL_NEED_UPDATE_AGREEMENT;
    }

    public final String getURL_AGREE_AGREEMENT() {
        return URL_AGREE_AGREEMENT;
    }

    public final String getURL_IS_AGREED_AGREEMENT() {
        return URL_IS_AGREED_AGREEMENT;
    }

    public final String getURL_GET_LOCAL_AGREEMENT_VERSION() {
        return URL_GET_LOCAL_AGREEMENT_VERSION;
    }

    public final String getURL_ENABLE_COOKIE_CONTROL() {
        return URL_ENABLE_COOKIE_CONTROL;
    }

    public final String getURL_IS_COOKIE_CONTROL_ENABLED() {
        return URL_IS_COOKIE_CONTROL_ENABLED;
    }

    public final String getURL_OPEN_DELETE_ACCOUNT_PAGE_REQUEST() {
        return URL_OPEN_DELETE_ACCOUNT_PAGE_REQUEST;
    }
}
