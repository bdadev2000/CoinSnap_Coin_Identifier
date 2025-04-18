package com.applovin.impl;

import com.applovin.impl.ro;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class no {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6423b;

    /* renamed from: c, reason: collision with root package name */
    public final ro.a f6424c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6425d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f6426e;

    public no(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a1.a((bArr2 == null) ^ z11);
        this.a = z10;
        this.f6423b = str;
        this.f6425d = i10;
        this.f6426e = bArr2;
        this.f6424c = new ro.a(a(str), bArr, i11, i12);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C.CENC_TYPE_cbc1)) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(C.CENC_TYPE_cbcs)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(C.CENC_TYPE_cenc)) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(C.CENC_TYPE_cens)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                kc.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
