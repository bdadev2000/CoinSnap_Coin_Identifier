package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0625Jg {
    public final AdErrorType A00;
    public final String A01;

    public C0625Jg(int i2, String str) {
        this(AdErrorType.adErrorTypeFromCode(i2), str);
    }

    public C0625Jg(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C0625Jg A00(AdErrorType adErrorType) {
        return new C0625Jg(adErrorType, (String) null);
    }

    public static C0625Jg A01(AdErrorType adErrorType, String str) {
        return new C0625Jg(adErrorType, str);
    }

    public static C0625Jg A02(C0626Jh c0626Jh) {
        return new C0625Jg(c0626Jh.A00(), c0626Jh.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
