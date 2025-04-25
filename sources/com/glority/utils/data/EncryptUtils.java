package com.glority.utils.data;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes9.dex */
public final class EncryptUtils {
    public static String md2(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return md2(str.getBytes());
    }

    public static String md2(byte[] bArr) {
        return StringUtils.bytes2HexString(md2ToBytes(bArr));
    }

    public static byte[] md2ToBytes(byte[] bArr) {
        return hashTemplate(bArr, "MD2");
    }

    public static String md5(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return md5(str.getBytes());
    }

    public static String md5(String str, String str2) {
        if (str == null && str2 == null) {
            return "";
        }
        if (str2 == null) {
            return StringUtils.bytes2HexString(md5ToBytes(str.getBytes()));
        }
        if (str == null) {
            return StringUtils.bytes2HexString(md5ToBytes(str2.getBytes()));
        }
        return StringUtils.bytes2HexString(md5ToBytes((str + str2).getBytes()));
    }

    public static String md5(byte[] bArr) {
        return StringUtils.bytes2HexString(md5ToBytes(bArr));
    }

    public static String md5(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return "";
        }
        if (bArr2 == null) {
            return StringUtils.bytes2HexString(md5ToBytes(bArr));
        }
        if (bArr == null) {
            return StringUtils.bytes2HexString(md5ToBytes(bArr2));
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return StringUtils.bytes2HexString(md5ToBytes(bArr3));
    }

    public static byte[] md5ToBytes(byte[] bArr) {
        return hashTemplate(bArr, "MD5");
    }

    public static String md5File(String str) {
        return md5File(StringUtils.isSpace(str) ? null : new File(str));
    }

    public static byte[] md5FileToBytes(String str) {
        return md5FileToBytes(StringUtils.isSpace(str) ? null : new File(str));
    }

    public static String md5File(File file) {
        return StringUtils.bytes2HexString(md5FileToBytes(file));
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0048: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:45:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] md5FileToBytes(java.io.File r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.security.NoSuchAlgorithmException -> L37
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35 java.security.NoSuchAlgorithmException -> L37
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
            r2.<init>(r1, r4)     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
            r4 = 262144(0x40000, float:3.67342E-40)
            byte[] r4 = new byte[r4]     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
        L18:
            int r3 = r2.read(r4)     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
            if (r3 > 0) goto L18
            java.security.MessageDigest r4 = r2.getMessageDigest()     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
            byte[] r4 = r4.digest()     // Catch: java.io.IOException -> L2f java.security.NoSuchAlgorithmException -> L31 java.lang.Throwable -> L47
            r1.close()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            r0.printStackTrace()
        L2e:
            return r4
        L2f:
            r4 = move-exception
            goto L39
        L31:
            r4 = move-exception
            goto L39
        L33:
            r4 = move-exception
            goto L49
        L35:
            r4 = move-exception
            goto L38
        L37:
            r4 = move-exception
        L38:
            r1 = r0
        L39:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.io.IOException -> L42
            goto L46
        L42:
            r4 = move-exception
            r4.printStackTrace()
        L46:
            return r0
        L47:
            r4 = move-exception
            r0 = r1
        L49:
            if (r0 == 0) goto L53
            r0.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r0.printStackTrace()
        L53:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.data.EncryptUtils.md5FileToBytes(java.io.File):byte[]");
    }

    public static String sha1(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return sha1(str.getBytes());
    }

    public static String sha1(byte[] bArr) {
        return StringUtils.bytes2HexString(sha1ToBytes(bArr));
    }

    public static byte[] sha1ToBytes(byte[] bArr) {
        return hashTemplate(bArr, "SHA1");
    }

    public static String sha224(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return sha224(str.getBytes());
    }

    public static String sha224(byte[] bArr) {
        return StringUtils.bytes2HexString(sha224ToBytes(bArr));
    }

    public static byte[] sha224ToBytes(byte[] bArr) {
        return hashTemplate(bArr, "SHA224");
    }

    public static String sha256(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return sha256(str.getBytes());
    }

    public static String sha256(byte[] bArr) {
        return StringUtils.bytes2HexString(sha256ToBytes(bArr));
    }

    public static byte[] sha256ToBytes(byte[] bArr) {
        return hashTemplate(bArr, "SHA256");
    }

    public static String sha384(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return sha384(str.getBytes());
    }

    public static String sha384(byte[] bArr) {
        return StringUtils.bytes2HexString(sha384ToBytes(bArr));
    }

    public static byte[] sha384ToBytes(byte[] bArr) {
        return hashTemplate(bArr, "SHA384");
    }

    public static String sha512(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return sha512(str.getBytes());
    }

    public static String sha512(byte[] bArr) {
        return StringUtils.bytes2HexString(sha512ToBytes(bArr));
    }

    public static byte[] sha512ToBytes(byte[] bArr) {
        return hashTemplate(bArr, "SHA512");
    }

    public static byte[] hashTemplate(byte[] bArr, String str) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    private EncryptUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
