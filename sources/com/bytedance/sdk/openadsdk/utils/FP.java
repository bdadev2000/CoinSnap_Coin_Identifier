package com.bytedance.sdk.openadsdk.utils;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.SecureRandom;
import java.util.UUID;

/* loaded from: classes.dex */
public class FP {
    private static final ThreadLocal<SecureRandom> zp = new ThreadLocal<>();

    public static String zp() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = zp;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b = (byte) (bArr[6] & Ascii.SI);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b8 = (byte) (bArr[8] & 63);
        bArr[8] = b8;
        bArr[8] = (byte) (b8 | 128);
        long j7 = 0;
        long j9 = 0;
        for (int i9 = 0; i9 < 8; i9++) {
            j9 = (j9 << 8) | (bArr[i9] & 255);
        }
        for (int i10 = 8; i10 < 16; i10++) {
            j7 = (j7 << 8) | (bArr[i10] & 255);
        }
        return new UUID(j9, j7).toString();
    }
}
