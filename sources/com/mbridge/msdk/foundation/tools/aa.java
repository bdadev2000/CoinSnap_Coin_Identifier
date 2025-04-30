package com.mbridge.msdk.foundation.tools;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public class aa {
    protected static MessageDigest b;

    /* renamed from: a, reason: collision with root package name */
    protected static char[] f15975a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    private static String f15976c = "SameFileMD5";

    static {
        b = null;
        try {
            b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e4) {
            System.err.println(aa.class.getName().concat("初始化失败，MessageDigest不支持MD5Util."));
            e4.printStackTrace();
        }
    }

    public static String a(File file) throws IOException {
        if (file == null || !file.exists()) {
            return "";
        }
        RandomAccessFile randomAccessFile = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
            try {
                byte[] bArr = new byte[10485760];
                while (true) {
                    int read = randomAccessFile2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                byte[] digest = messageDigest.digest();
                String a6 = a(digest, 0, digest.length);
                try {
                    randomAccessFile2.close();
                } catch (IOException e4) {
                    ad.b(f15976c, e4.getMessage());
                }
                return a6;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                try {
                    ad.b(f15976c, th.getMessage());
                    return "";
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e9) {
                            ad.b(f15976c, e9.getMessage());
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String a(byte[] bArr, int i9, int i10) {
        StringBuffer stringBuffer = new StringBuffer(i10 * 2);
        int i11 = i10 + i9;
        while (i9 < i11) {
            byte b8 = bArr[i9];
            char[] cArr = f15975a;
            char c9 = cArr[(b8 & 240) >> 4];
            char c10 = cArr[b8 & Ascii.SI];
            stringBuffer.append(c9);
            stringBuffer.append(c10);
            i9++;
        }
        return stringBuffer.toString();
    }
}
