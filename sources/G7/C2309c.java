package g7;

import G7.j;
import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import com.vungle.ads.f1;
import com.vungle.ads.internal.util.v;
import f7.C2275b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2309c {
    private static EnumC2308b ccpaConsent;
    private static C2275b filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    public static final C2309c INSTANCE = new C2309c();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static AtomicReference<Boolean> publishAndroidId = new AtomicReference<>();

    private C2309c() {
    }

    private final void saveCcpaConsent(EnumC2308b enumC2308b) {
        C2275b put;
        C2275b c2275b = filePreferences;
        if (c2275b != null && (put = c2275b.put("ccpa_status", enumC2308b.getValue())) != null) {
            put.apply();
        }
    }

    private final void saveCoppaConsent(boolean z8) {
        C2275b put;
        C2275b c2275b = filePreferences;
        if (c2275b != null && (put = c2275b.put("is_coppa", z8)) != null) {
            put.apply();
        }
    }

    private final void saveDisableAdId(boolean z8) {
        C2275b put;
        C2275b c2275b = filePreferences;
        if (c2275b != null && (put = c2275b.put("disable_ad_id", z8)) != null) {
            put.apply();
        }
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j7) {
        C2275b put;
        C2275b put2;
        C2275b put3;
        C2275b put4;
        C2275b c2275b = filePreferences;
        if (c2275b != null && (put = c2275b.put("gdpr_status", str)) != null && (put2 = put.put("gdpr_source", str2)) != null && (put3 = put2.put("gdpr_message_version", str3)) != null && (put4 = put3.put("gdpr_timestamp", j7)) != null) {
            put4.apply();
        }
    }

    private final void savePublishAndroidId(boolean z8) {
        C2275b put;
        C2275b c2275b = filePreferences;
        if (c2275b != null && (put = c2275b.put("publish_android_id", z8)) != null) {
            put.apply();
        }
    }

    public final String getCcpaStatus() {
        String value;
        EnumC2308b enumC2308b = ccpaConsent;
        if (enumC2308b == null || (value = enumC2308b.getValue()) == null) {
            return EnumC2308b.OPT_IN.getValue();
        }
        return value;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        if (str == null) {
            return "no_interaction";
        }
        return str;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        if (str == null) {
            return AppLovinMediationProvider.UNKNOWN;
        }
        return str;
    }

    public final long getConsentTimestamp() {
        Long l = gdprConsentTimestamp;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final EnumC2307a getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() == null) {
            return EnumC2307a.COPPA_NOTSET;
        }
        if (j.a(atomicReference.get(), Boolean.TRUE)) {
            return EnumC2307a.COPPA_ENABLED;
        }
        if (j.a(atomicReference.get(), Boolean.FALSE)) {
            return EnumC2307a.COPPA_DISABLED;
        }
        return EnumC2307a.COPPA_NOTSET;
    }

    public final boolean getPublishAndroidId() {
        Boolean bool = publishAndroidId.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final synchronized void init(Context context) {
        j.e(context, "context");
        AtomicBoolean atomicBoolean = initialized;
        if (atomicBoolean.get()) {
            v.Companion.w("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        C2275b c2275b = (C2275b) f1.Companion.getInstance(context).getService(C2275b.class);
        filePreferences = c2275b;
        AtomicReference<Boolean> atomicReference = disableAdId;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            saveDisableAdId(bool.booleanValue());
        } else {
            Boolean bool2 = c2275b.getBoolean("disable_ad_id");
            if (bool2 != null) {
                atomicReference.set(bool2);
            }
        }
        String str = gdprConsent;
        long j7 = 0;
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
            Long l = gdprConsentTimestamp;
            if (l != null) {
                j7 = l.longValue();
            }
            saveGdprConsent(str, str3, str5, j7);
        } else {
            String string = c2275b.getString("gdpr_status");
            EnumC2308b enumC2308b = EnumC2308b.OPT_IN;
            if (j.a(string, enumC2308b.getValue())) {
                string = enumC2308b.getValue();
            } else {
                EnumC2308b enumC2308b2 = EnumC2308b.OPT_OUT;
                if (j.a(string, enumC2308b2.getValue())) {
                    string = enumC2308b2.getValue();
                }
            }
            gdprConsent = string;
            gdprConsentSource = c2275b.getString("gdpr_source");
            gdprConsentMessageVersion = c2275b.getString("gdpr_message_version");
            gdprConsentTimestamp = Long.valueOf(c2275b.getLong("gdpr_timestamp", 0L));
        }
        EnumC2308b enumC2308b3 = ccpaConsent;
        if (enumC2308b3 != null) {
            saveCcpaConsent(enumC2308b3);
        } else {
            String string2 = c2275b.getString("ccpa_status");
            EnumC2308b enumC2308b4 = EnumC2308b.OPT_OUT;
            if (!j.a(enumC2308b4.getValue(), string2)) {
                enumC2308b4 = EnumC2308b.OPT_IN;
            }
            ccpaConsent = enumC2308b4;
        }
        AtomicReference<Boolean> atomicReference2 = coppaStatus;
        Boolean bool3 = atomicReference2.get();
        if (bool3 != null) {
            saveCoppaConsent(bool3.booleanValue());
        } else {
            Boolean bool4 = c2275b.getBoolean("is_coppa");
            if (bool4 != null) {
                atomicReference2.set(bool4);
            }
        }
        Boolean bool5 = publishAndroidId.get();
        if (bool5 != null) {
            savePublishAndroidId(bool5.booleanValue());
        } else {
            Boolean bool6 = c2275b.getBoolean("publish_android_id");
            if (bool6 != null) {
                publishAndroidId.set(bool6);
            }
        }
        atomicBoolean.set(true);
    }

    public final void setPublishAndroidId(boolean z8) {
        publishAndroidId.set(Boolean.valueOf(z8));
        savePublishAndroidId(z8);
    }

    public final boolean shouldSendAdIds() {
        Boolean bool = disableAdId.get();
        if (bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void updateCcpaConsent(EnumC2308b enumC2308b) {
        j.e(enumC2308b, "consent");
        ccpaConsent = enumC2308b;
        saveCcpaConsent(enumC2308b);
    }

    public final void updateCoppaConsent(boolean z8) {
        coppaStatus.set(Boolean.valueOf(z8));
        saveCoppaConsent(z8);
    }

    public final void updateDisableAdId(boolean z8) {
        disableAdId.set(Boolean.valueOf(z8));
        saveDisableAdId(z8);
    }

    public final void updateGdprConsent(String str, String str2, String str3) {
        j.e(str, "consent");
        j.e(str2, "source");
        gdprConsent = str;
        gdprConsentSource = str2;
        gdprConsentMessageVersion = str3;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        gdprConsentTimestamp = Long.valueOf(currentTimeMillis);
        String str4 = gdprConsentMessageVersion;
        if (str4 == null) {
            str4 = "";
        }
        saveGdprConsent(str, str2, str4, currentTimeMillis);
    }
}
