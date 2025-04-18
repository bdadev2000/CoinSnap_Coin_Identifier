package com.vungle.ads;

import kotlin.jvm.JvmStatic;

/* loaded from: classes4.dex */
public final class o3 {
    public static final o3 INSTANCE = new o3();

    private o3() {
    }

    @JvmStatic
    public static final String getCCPAStatus() {
        return fh.c.INSTANCE.getCcpaStatus();
    }

    @JvmStatic
    public static final String getCOPPAStatus() {
        return fh.c.INSTANCE.getCoppaStatus().name();
    }

    @JvmStatic
    public static final String getGDPRMessageVersion() {
        return fh.c.INSTANCE.getConsentMessageVersion();
    }

    @JvmStatic
    public static final String getGDPRSource() {
        return fh.c.INSTANCE.getConsentSource();
    }

    @JvmStatic
    public static final String getGDPRStatus() {
        return fh.c.INSTANCE.getConsentStatus();
    }

    @JvmStatic
    public static final long getGDPRTimestamp() {
        return fh.c.INSTANCE.getConsentTimestamp();
    }

    @JvmStatic
    public static final void setCCPAStatus(boolean z10) {
        fh.b bVar;
        if (z10) {
            bVar = fh.b.OPT_IN;
        } else {
            bVar = fh.b.OPT_OUT;
        }
        fh.c.INSTANCE.updateCcpaConsent(bVar);
    }

    @JvmStatic
    public static final void setCOPPAStatus(boolean z10) {
        fh.c.INSTANCE.updateCoppaConsent(z10);
    }

    @JvmStatic
    public static final void setGDPRStatus(boolean z10, String str) {
        String value;
        if (z10) {
            value = fh.b.OPT_IN.getValue();
        } else {
            value = fh.b.OPT_OUT.getValue();
        }
        fh.c.INSTANCE.updateGdprConsent(value, "publisher", str);
    }

    @JvmStatic
    public static final void setPublishAndroidId(boolean z10) {
        fh.c.INSTANCE.setPublishAndroidId(z10);
    }
}
