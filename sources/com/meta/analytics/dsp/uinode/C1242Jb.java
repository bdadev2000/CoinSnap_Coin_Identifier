package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1242Jb {
    public final AdErrorType A00;
    public final String A01;

    public C1242Jb(int i9, String str) {
        this(AdErrorType.adErrorTypeFromCode(i9), str);
    }

    public C1242Jb(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C1242Jb A00(AdErrorType adErrorType) {
        return new C1242Jb(adErrorType, (String) null);
    }

    public static C1242Jb A01(AdErrorType adErrorType, String str) {
        return new C1242Jb(adErrorType, str);
    }

    public static C1242Jb A02(C1243Jc c1243Jc) {
        return new C1242Jb(c1243Jc.A00(), c1243Jc.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
