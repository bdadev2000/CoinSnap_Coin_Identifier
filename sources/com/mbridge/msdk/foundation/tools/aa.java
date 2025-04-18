package com.mbridge.msdk.foundation.tools;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class aa {

    /* renamed from: b, reason: collision with root package name */
    protected static MessageDigest f13534b;
    protected static char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    private static String f13535c = "SameFileMD5";

    static {
        f13534b = null;
        try {
            f13534b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e2) {
            System.err.println(aa.class.getName().concat("初始化失败，MessageDigest不支持MD5Util."));
            e2.printStackTrace();
        }
    }

    public static String a(File file) throws IOException {
        MessageDigest messageDigest;
        RandomAccessFile randomAccessFile;
        if (file == null || !file.exists()) {
            return "";
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[10485760];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            String a10 = a(digest, 0, digest.length);
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                ad.b(f13535c, e2.getMessage());
            }
            return a10;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            try {
                ad.b(f13535c, th.getMessage());
                return "";
            } finally {
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e10) {
                        ad.b(f13535c, e10.getMessage());
                    }
                }
            }
        }
    }

    private static String a(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer(i11 * 2);
        int i12 = i11 + i10;
        while (i10 < i12) {
            byte b3 = bArr[i10];
            char[] cArr = a;
            char c10 = cArr[(b3 & 240) >> 4];
            char c11 = cArr[b3 & Ascii.SI];
            stringBuffer.append(c10);
            stringBuffer.append(c11);
            i10++;
        }
        return stringBuffer.toString();
    }
}
