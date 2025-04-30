package com.vungle.ads;

import g7.C2309c;
import g7.EnumC2308b;

/* loaded from: classes3.dex */
public final class p1 {
    public static final p1 INSTANCE = new p1();

    private p1() {
    }

    public static final String getCCPAStatus() {
        return C2309c.INSTANCE.getCcpaStatus();
    }

    public static final String getCOPPAStatus() {
        return C2309c.INSTANCE.getCoppaStatus().name();
    }

    public static final String getGDPRMessageVersion() {
        return C2309c.INSTANCE.getConsentMessageVersion();
    }

    public static final String getGDPRSource() {
        return C2309c.INSTANCE.getConsentSource();
    }

    public static final String getGDPRStatus() {
        return C2309c.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return C2309c.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean z8) {
        EnumC2308b enumC2308b;
        if (z8) {
            enumC2308b = EnumC2308b.OPT_IN;
        } else {
            enumC2308b = EnumC2308b.OPT_OUT;
        }
        C2309c.INSTANCE.updateCcpaConsent(enumC2308b);
    }

    public static final void setCOPPAStatus(boolean z8) {
        C2309c.INSTANCE.updateCoppaConsent(z8);
    }

    public static final void setGDPRStatus(boolean z8, String str) {
        String value;
        if (z8) {
            value = EnumC2308b.OPT_IN.getValue();
        } else {
            value = EnumC2308b.OPT_OUT.getValue();
        }
        C2309c.INSTANCE.updateGdprConsent(value, "publisher", str);
    }

    public static final void setPublishAndroidId(boolean z8) {
        C2309c.INSTANCE.setPublishAndroidId(z8);
    }
}
