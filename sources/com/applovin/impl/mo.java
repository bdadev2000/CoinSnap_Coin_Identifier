package com.applovin.impl;

import com.applovin.impl.qo;

/* loaded from: classes.dex */
public final class mo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25598a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25599b;

    /* renamed from: c, reason: collision with root package name */
    public final qo.a f25600c;
    public final int d;
    public final byte[] e;

    public mo(boolean z2, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        b1.a((bArr2 == null) ^ (i2 == 0));
        this.f25598a = z2;
        this.f25599b = str;
        this.d = i2;
        this.e = bArr2;
        this.f25600c = new qo.a(a(str), bArr, i3, i4);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 2;
            default:
                pc.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
