package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0677Jc extends Exception {
    public final AdErrorType A00;
    public final String A01;

    public C0677Jc(AdErrorType adErrorType, String str) {
        this(adErrorType, str, null);
    }

    public C0677Jc(AdErrorType adErrorType, String str, Throwable th2) {
        super(str, th2);
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public final AdErrorType A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }
}
