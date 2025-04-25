package com.glority.android.base.agreement;

import android.util.Log;
import com.glority.android.base.agreement.model.LegalConfig;
import com.glority.android.base.agreement.util.AgreementPersistKey;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.agreement.GetLegalConfigRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.ui.base.LocaleManager;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AgreementManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020\u0004J\u0006\u0010%\u001a\u00020\u0004J\u0006\u0010&\u001a\u00020'R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0006R\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/glority/android/base/agreement/AgreementManager;", "", "()V", "DEEP_LINK_COOKIE_CONTROL", "", "getDEEP_LINK_COOKIE_CONTROL", "()Ljava/lang/String;", "DEEP_LINK_COOKIE_CONTROL$delegate", "Lkotlin/Lazy;", "defaultAgreementUrl", "getDefaultAgreementUrl", "defaultAgreementUrl$delegate", "defaultPolicyUrl", "getDefaultPolicyUrl", "defaultPolicyUrl$delegate", "legalConfig", "Lcom/glority/android/base/agreement/model/LegalConfig;", "getLegalConfig", "()Lcom/glority/android/base/agreement/model/LegalConfig;", "value", "", "localAgreementVersion", "getLocalAgreementVersion", "()Ljava/lang/Integer;", "setLocalAgreementVersion", "(Ljava/lang/Integer;)V", "needUpdateAgreement", "", "getNeedUpdateAgreement", "()Z", "nextAgreementUrl", "getNextAgreementUrl", "nextAvailableAt", "Ljava/util/Date;", "getNextAvailableAt", "()Ljava/util/Date;", "getAgreementUrl", "getPrivacyPolicyUrl", "updateLocalAgreementVersion", "", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class AgreementManager {
    public static final AgreementManager INSTANCE = new AgreementManager();

    /* renamed from: defaultPolicyUrl$delegate, reason: from kotlin metadata */
    private static final Lazy defaultPolicyUrl = LazyKt.lazy(new Function0<String>() { // from class: com.glority.android.base.agreement.AgreementManager$defaultPolicyUrl$2
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            LocaleManager localeManager = LocaleManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(localeManager, "LocaleManager.getInstance()");
            if (localeManager.isEurope()) {
                return AppContext.INSTANCE.getConfig("HOST") + "/static/EuropeanUnion/privacy_policy.html";
            }
            LocaleManager localeManager2 = LocaleManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(localeManager2, "LocaleManager.getInstance()");
            if (localeManager2.isJapanese()) {
                return AppContext.INSTANCE.getConfig("HOST") + "/static/Japan/privacy_policy.html";
            }
            return AppContext.INSTANCE.getConfig("HOST") + "/static/privacy_policy.html";
        }
    });

    /* renamed from: defaultAgreementUrl$delegate, reason: from kotlin metadata */
    private static final Lazy defaultAgreementUrl = LazyKt.lazy(new Function0<String>() { // from class: com.glority.android.base.agreement.AgreementManager$defaultAgreementUrl$2
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            LocaleManager localeManager = LocaleManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(localeManager, "LocaleManager.getInstance()");
            if (localeManager.isEurope()) {
                return AppContext.INSTANCE.getConfig("HOST") + "/static/EuropeanUnion/user_agreement.html";
            }
            LocaleManager localeManager2 = LocaleManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(localeManager2, "LocaleManager.getInstance()");
            if (localeManager2.isJapanese()) {
                return AppContext.INSTANCE.getConfig("HOST") + "/static/Japan/user_agreement.html";
            }
            return AppContext.INSTANCE.getConfig("HOST") + "/static/user_agreement.html";
        }
    });

    /* renamed from: DEEP_LINK_COOKIE_CONTROL$delegate, reason: from kotlin metadata */
    private static final Lazy DEEP_LINK_COOKIE_CONTROL = LazyKt.lazy(new Function0<String>() { // from class: com.glority.android.base.agreement.AgreementManager$DEEP_LINK_COOKIE_CONTROL$2
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return AppContext.INSTANCE.getConfig("DEEP_LINK_SCHEME") + "://dl/cookie-control";
        }
    });

    private final String getDefaultAgreementUrl() {
        return (String) defaultAgreementUrl.getValue();
    }

    private final String getDefaultPolicyUrl() {
        return (String) defaultPolicyUrl.getValue();
    }

    public final String getDEEP_LINK_COOKIE_CONTROL() {
        return (String) DEEP_LINK_COOKIE_CONTROL.getValue();
    }

    private AgreementManager() {
    }

    public final boolean getNeedUpdateAgreement() {
        Integer nextAgreementVersion;
        Date nextAgreementAvailableAt;
        updateLocalAgreementVersion();
        Integer localAgreementVersion = getLocalAgreementVersion();
        if (localAgreementVersion == null) {
            return false;
        }
        int intValue = localAgreementVersion.intValue();
        LegalConfig legalConfig = getLegalConfig();
        if (legalConfig == null || (nextAgreementVersion = legalConfig.getNextAgreementVersion()) == null) {
            return false;
        }
        int intValue2 = nextAgreementVersion.intValue();
        LegalConfig legalConfig2 = getLegalConfig();
        return legalConfig2 != null && (nextAgreementAvailableAt = legalConfig2.getNextAgreementAvailableAt()) != null && intValue2 > intValue && nextAgreementAvailableAt.getTime() > System.currentTimeMillis();
    }

    public final Date getNextAvailableAt() {
        LegalConfig legalConfig = getLegalConfig();
        if (legalConfig != null) {
            return legalConfig.getNextAgreementAvailableAt();
        }
        return null;
    }

    public final Integer getLocalAgreementVersion() {
        return (Integer) PersistData.INSTANCE.get(AgreementPersistKey.AGREEMENT_LOCAL_AGREEMENT_VERSION);
    }

    public final void setLocalAgreementVersion(Integer num) {
        PersistData.INSTANCE.set(AgreementPersistKey.AGREEMENT_LOCAL_AGREEMENT_VERSION, num);
    }

    public final String getPrivacyPolicyUrl() {
        String privacyPolicyUrl;
        LegalConfig legalConfig = getLegalConfig();
        return (legalConfig == null || (privacyPolicyUrl = legalConfig.getPrivacyPolicyUrl()) == null) ? getDefaultPolicyUrl() : privacyPolicyUrl;
    }

    public final String getAgreementUrl() {
        String agreementUrl;
        String nextAgreementUrl;
        updateLocalAgreementVersion();
        Integer localAgreementVersion = getLocalAgreementVersion();
        LegalConfig legalConfig = getLegalConfig();
        if (Intrinsics.areEqual(localAgreementVersion, legalConfig != null ? legalConfig.getNextAgreementVersion() : null)) {
            LegalConfig legalConfig2 = getLegalConfig();
            return (legalConfig2 == null || (nextAgreementUrl = legalConfig2.getNextAgreementUrl()) == null) ? getDefaultAgreementUrl() : nextAgreementUrl;
        }
        LegalConfig legalConfig3 = getLegalConfig();
        if (!Intrinsics.areEqual(localAgreementVersion, legalConfig3 != null ? legalConfig3.getAgreementVersion() : null)) {
            return getDefaultAgreementUrl();
        }
        LegalConfig legalConfig4 = getLegalConfig();
        return (legalConfig4 == null || (agreementUrl = legalConfig4.getAgreementUrl()) == null) ? getDefaultAgreementUrl() : agreementUrl;
    }

    public final void updateLocalAgreementVersion() {
        Integer localAgreementVersion = getLocalAgreementVersion();
        LegalConfig legalConfig = getLegalConfig();
        Integer agreementVersion = legalConfig != null ? legalConfig.getAgreementVersion() : null;
        LegalConfig legalConfig2 = getLegalConfig();
        Integer nextAgreementVersion = legalConfig2 != null ? legalConfig2.getNextAgreementVersion() : null;
        LegalConfig legalConfig3 = getLegalConfig();
        Date nextAgreementAvailableAt = legalConfig3 != null ? legalConfig3.getNextAgreementAvailableAt() : null;
        if (localAgreementVersion == null) {
            if (nextAgreementVersion != null) {
                setLocalAgreementVersion(nextAgreementVersion);
                return;
            } else {
                if (agreementVersion != null) {
                    setLocalAgreementVersion(agreementVersion);
                    return;
                }
                return;
            }
        }
        if (Intrinsics.areEqual(localAgreementVersion, nextAgreementVersion)) {
            return;
        }
        if (nextAgreementVersion != null && nextAgreementAvailableAt != null && nextAgreementAvailableAt.getTime() < System.currentTimeMillis()) {
            setLocalAgreementVersion(nextAgreementVersion);
        } else if (agreementVersion != null) {
            setLocalAgreementVersion(agreementVersion);
        }
    }

    public final String getNextAgreementUrl() {
        String nextAgreementUrl;
        LegalConfig legalConfig = getLegalConfig();
        return (legalConfig == null || (nextAgreementUrl = legalConfig.getNextAgreementUrl()) == null) ? getAgreementUrl() : nextAgreementUrl;
    }

    private final LegalConfig getLegalConfig() {
        try {
            LegalConfig legalConfig = (LegalConfig) new Gson().fromJson(new GetLegalConfigRequest().toResult(), LegalConfig.class);
            if (legalConfig == null) {
                return null;
            }
            Integer agreementVersion = legalConfig.getAgreementVersion();
            if (agreementVersion != null && agreementVersion.intValue() == 0) {
                legalConfig.setAgreementVersion(null);
            }
            return legalConfig;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }
}
