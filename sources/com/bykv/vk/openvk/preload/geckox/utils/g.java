package com.bykv.vk.openvk.preload.geckox.utils;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.InputStream;
import java.security.MessageDigest;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f13334a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws Exception {
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                try {
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = inputStream.read(bArr, 0, 4096);
                            if (read == -1) {
                                break;
                            } else {
                                messageDigest.update(bArr, 0, read);
                            }
                        }
                        try {
                            byte[] digest = messageDigest.digest();
                            String a6 = a(digest, digest.length);
                            if (!str.equals(a6)) {
                                throw new RuntimeException(AbstractC2914a.k("md5 check failed file: local md5:", a6, " expect md5:", str));
                            }
                            return;
                        } catch (Exception e4) {
                            throw new RuntimeException("md5 check failed:" + e4.getMessage(), e4);
                        }
                    } catch (Exception e9) {
                        throw new RuntimeException("md5 check failed:" + e9.getMessage(), e9);
                    }
                } finally {
                    CloseableUtils.close(inputStream);
                }
            } catch (Exception e10) {
                throw new RuntimeException("md5 check failed:" + e10.getMessage(), e10);
            }
        }
        throw new RuntimeException("md5 check failed: md5 == null");
    }

    private static String a(byte[] bArr, int i9) {
        if (bArr != null) {
            if (i9 <= bArr.length) {
                int i10 = i9 * 2;
                char[] cArr = new char[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < i9; i12++) {
                    byte b = bArr[i12];
                    int i13 = i11 + 1;
                    char[] cArr2 = f13334a;
                    cArr[i11] = cArr2[(b & 255) >> 4];
                    i11 += 2;
                    cArr[i13] = cArr2[b & Ascii.SI];
                }
                return new String(cArr, 0, i10);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
