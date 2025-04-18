package com.bytedance.sdk.openadsdk.utils;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.SecureRandom;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public class Ne {
    private static final ThreadLocal<SecureRandom> YFl = new ThreadLocal<>();

    public static String YFl() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = YFl;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b3 = (byte) (bArr[6] & Ascii.SI);
        bArr[6] = b3;
        bArr[6] = (byte) (b3 | 64);
        byte b10 = (byte) (bArr[8] & 63);
        bArr[8] = b10;
        bArr[8] = (byte) (b10 | ByteCompanionObject.MIN_VALUE);
        long j3 = 0;
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j10 = (j10 << 8) | (bArr[i10] & UByte.MAX_VALUE);
        }
        for (int i11 = 8; i11 < 16; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & UByte.MAX_VALUE);
        }
        return new UUID(j10, j3).toString();
    }
}
