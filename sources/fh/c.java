package fh;

import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import com.vungle.ads.e3;
import com.vungle.ads.internal.util.v;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    private static b ccpaConsent;
    private static eh.b filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    public static final c INSTANCE = new c();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static AtomicReference<Boolean> publishAndroidId = new AtomicReference<>();

    private c() {
    }

    private final void saveCcpaConsent(b bVar) {
        eh.b put;
        eh.b bVar2 = filePreferences;
        if (bVar2 == null || (put = bVar2.put("ccpa_status", bVar.getValue())) == null) {
            return;
        }
        put.apply();
    }

    private final void saveCoppaConsent(boolean z10) {
        eh.b put;
        eh.b bVar = filePreferences;
        if (bVar == null || (put = bVar.put("is_coppa", z10)) == null) {
            return;
        }
        put.apply();
    }

    private final void saveDisableAdId(boolean z10) {
        eh.b put;
        eh.b bVar = filePreferences;
        if (bVar == null || (put = bVar.put("disable_ad_id", z10)) == null) {
            return;
        }
        put.apply();
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j3) {
        eh.b put;
        eh.b put2;
        eh.b put3;
        eh.b put4;
        eh.b bVar = filePreferences;
        if (bVar != null && (put = bVar.put("gdpr_status", str)) != null && (put2 = put.put("gdpr_source", str2)) != null && (put3 = put2.put("gdpr_message_version", str3)) != null && (put4 = put3.put("gdpr_timestamp", j3)) != null) {
            put4.apply();
        }
    }

    private final void savePublishAndroidId(boolean z10) {
        eh.b put;
        eh.b bVar = filePreferences;
        if (bVar == null || (put = bVar.put("publish_android_id", z10)) == null) {
            return;
        }
        put.apply();
    }

    public final String getCcpaStatus() {
        String value;
        b bVar = ccpaConsent;
        return (bVar == null || (value = bVar.getValue()) == null) ? b.OPT_IN.getValue() : value;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? AppLovinMediationProvider.UNKNOWN : str;
    }

    public final long getConsentTimestamp() {
        Long l10 = gdprConsentTimestamp;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final a getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() == null) {
            return a.COPPA_NOTSET;
        }
        if (Intrinsics.areEqual(atomicReference.get(), Boolean.TRUE)) {
            return a.COPPA_ENABLED;
        }
        if (Intrinsics.areEqual(atomicReference.get(), Boolean.FALSE)) {
            return a.COPPA_DISABLED;
        }
        return a.COPPA_NOTSET;
    }

    public final boolean getPublishAndroidId() {
        Boolean bool = publishAndroidId.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final synchronized void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AtomicBoolean atomicBoolean = initialized;
        if (atomicBoolean.get()) {
            v.Companion.w("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        eh.b bVar = (eh.b) e3.Companion.getInstance(context).getService(eh.b.class);
        filePreferences = bVar;
        AtomicReference<Boolean> atomicReference = disableAdId;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            saveDisableAdId(bool.booleanValue());
        } else {
            Boolean bool2 = bVar.getBoolean("disable_ad_id");
            if (bool2 != null) {
                atomicReference.set(Boolean.valueOf(bool2.booleanValue()));
            }
        }
        String str = gdprConsent;
        long j3 = 0;
        if (str != null) {
            String str2 = gdprConsentSource;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = gdprConsentMessageVersion;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = str4;
            Long l10 = gdprConsentTimestamp;
            if (l10 != null) {
                j3 = l10.longValue();
            }
            saveGdprConsent(str, str3, str5, j3);
        } else {
            String string = bVar.getString("gdpr_status");
            b bVar2 = b.OPT_IN;
            if (Intrinsics.areEqual(string, bVar2.getValue())) {
                string = bVar2.getValue();
            } else {
                b bVar3 = b.OPT_OUT;
                if (Intrinsics.areEqual(string, bVar3.getValue())) {
                    string = bVar3.getValue();
                }
            }
            gdprConsent = string;
            gdprConsentSource = bVar.getString("gdpr_source");
            gdprConsentMessageVersion = bVar.getString("gdpr_message_version");
            gdprConsentTimestamp = Long.valueOf(bVar.getLong("gdpr_timestamp", 0L));
        }
        b bVar4 = ccpaConsent;
        if (bVar4 != null) {
            saveCcpaConsent(bVar4);
        } else {
            String string2 = bVar.getString("ccpa_status");
            b bVar5 = b.OPT_OUT;
            if (!Intrinsics.areEqual(bVar5.getValue(), string2)) {
                bVar5 = b.OPT_IN;
            }
            ccpaConsent = bVar5;
        }
        AtomicReference<Boolean> atomicReference2 = coppaStatus;
        Boolean bool3 = atomicReference2.get();
        if (bool3 != null) {
            saveCoppaConsent(bool3.booleanValue());
        } else {
            Boolean bool4 = bVar.getBoolean("is_coppa");
            if (bool4 != null) {
                atomicReference2.set(Boolean.valueOf(bool4.booleanValue()));
            }
        }
        Boolean bool5 = publishAndroidId.get();
        if (bool5 != null) {
            savePublishAndroidId(bool5.booleanValue());
        } else {
            Boolean bool6 = bVar.getBoolean("publish_android_id");
            if (bool6 != null) {
                publishAndroidId.set(Boolean.valueOf(bool6.booleanValue()));
            }
        }
        atomicBoolean.set(true);
    }

    public final void setPublishAndroidId(boolean z10) {
        publishAndroidId.set(Boolean.valueOf(z10));
        savePublishAndroidId(z10);
    }

    public final boolean shouldSendAdIds() {
        Boolean bool = disableAdId.get();
        if (bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void updateCcpaConsent(b consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        ccpaConsent = consent;
        saveCcpaConsent(consent);
    }

    public final void updateCoppaConsent(boolean z10) {
        coppaStatus.set(Boolean.valueOf(z10));
        saveCoppaConsent(z10);
    }

    public final void updateDisableAdId(boolean z10) {
        disableAdId.set(Boolean.valueOf(z10));
        saveDisableAdId(z10);
    }

    public final void updateGdprConsent(String consent, String source, String str) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(source, "source");
        gdprConsent = consent;
        gdprConsentSource = source;
        gdprConsentMessageVersion = str;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        gdprConsentTimestamp = Long.valueOf(currentTimeMillis);
        String str2 = gdprConsentMessageVersion;
        if (str2 == null) {
            str2 = "";
        }
        saveGdprConsent(consent, source, str2, currentTimeMillis);
    }
}
