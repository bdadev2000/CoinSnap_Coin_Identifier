package com.applovin.impl;

import com.applovin.impl.ro;

/* loaded from: classes.dex */
public final class no {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9361a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final ro.a f9362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9363d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f9364e;

    public no(boolean z8, String str, int i9, byte[] bArr, int i10, int i11, byte[] bArr2) {
        boolean z9;
        if (i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC0669a1.a((bArr2 == null) ^ z9);
        this.f9361a = z8;
        this.b = str;
        this.f9363d = i9;
        this.f9364e = bArr2;
        this.f9362c = new ro.a(a(str), bArr, i10, i11);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c9 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbc1)) {
                    c9 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbcs)) {
                    c9 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc)) {
                    c9 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cens)) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
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
