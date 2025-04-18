package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.safedk.android.internal.partials.AppLovinVideoBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes2.dex */
public abstract class vi {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f27575a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f27576b;

    /* loaded from: classes2.dex */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* renamed from: a, reason: collision with root package name */
        private final int f27580a;

        a(int i2) {
            this.f27580a = i2;
        }

        public static a a(int i2) {
            if (i2 != 0 && i2 == 1) {
                return V2;
            }
            return DEFAULT;
        }

        public int b() {
            return this.f27580a;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f27576b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.j jVar) {
        String str3;
        String[] split = str.split(CertificateUtil.DELIMITER);
        char c2 = 0;
        try {
            try {
                if (!AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(split[0])) {
                    return null;
                }
                try {
                    if (split.length != 4) {
                        return null;
                    }
                    String str4 = split[1];
                    String str5 = split[2];
                    byte[] b2 = b(split[3]);
                    if (!str2.endsWith(str5)) {
                        return null;
                    }
                    byte[] bArr = f27575a;
                    if (!a(bArr, jVar).equals(str4)) {
                        return null;
                    }
                    char c3 = ' ';
                    byte[] a2 = a(str2.substring(0, 32), bArr, jVar);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b2);
                    char c4 = '\b';
                    long read = (((byteArrayInputStream.read() ^ a2[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ a2[0]) & 255) | (((byteArrayInputStream.read() ^ a2[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ a2[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ a2[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ a2[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ a2[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ a2[7]) & 255) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int read2 = byteArrayInputStream.read(bArr2);
                    int i2 = 0;
                    while (read2 >= 0) {
                        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                        long j2 = i2 + read;
                        long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                        long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                        long j5 = j4 ^ (j4 >> c3);
                        byteArrayOutputStream.write((byte) ((bArr2[c2] ^ a2[i2 % a2.length]) ^ (j5 & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i2 + 1) % a2.length] ^ bArr2[1]) ^ ((j5 >> c4) & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i2 + 2) % a2.length] ^ bArr2[2]) ^ ((j5 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[3] ^ a2[(i2 + 3) % a2.length]) ^ ((j5 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i2 + 4) % a2.length] ^ bArr2[4]) ^ ((j5 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i2 + 5) % a2.length] ^ bArr2[5]) ^ ((j5 >> 40) & 255)));
                        byteArrayOutputStream.write((byte) ((a2[(i2 + 6) % a2.length] ^ bArr2[6]) ^ ((j5 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[7] ^ a2[(i2 + 7) % a2.length]) ^ ((j5 >> 56) & 255)));
                        i2 += 8;
                        byteArrayInputStream = byteArrayInputStream2;
                        read2 = byteArrayInputStream2.read(bArr2);
                        read = read;
                        c4 = '\b';
                        c2 = 0;
                        c3 = ' ';
                    }
                    return AppLovinVideoBridge.stringInit(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                } catch (IOException e) {
                    e = e;
                    str3 = null;
                    com.applovin.impl.sdk.n.b("AppLovinSdk", "Failed to read bytes", e);
                    jVar.E().a("AppLovinSdk", "decode", e);
                    return str3;
                }
            } catch (IOException e2) {
                e = e2;
                str3 = null;
            }
        } catch (UnsupportedEncodingException e3) {
            jVar.E().a("AppLovinSdk", "decode", e3);
            throw new RuntimeException("UTF-8 encoding not found", e3);
        }
    }

    public static String b(String str, long j2, a aVar, String str2, com.applovin.impl.sdk.j jVar) {
        byte[] a2;
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (TextUtils.isEmpty(str) || a.NONE == aVar) {
                    return str;
                }
                if (a.V2 == aVar) {
                    a2 = a(str, j2, true, str2, jVar);
                } else {
                    a2 = a(str, j2, str2, jVar);
                }
                if (a2 != null) {
                    return new String(a2);
                }
                return null;
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static int c(byte[] bArr, String str, com.applovin.impl.sdk.j jVar) {
        int a2;
        int i2;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (a2 = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f27576b, jVar).getBytes();
        int i3 = a2 + 1;
        int length = bytes.length + i3;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i2 = length + 55) || bArr[i2] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i3, bytes.length + i3), bytes)) {
            return 0;
        }
        int i4 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i4;
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c2 = (char) bArr[0];
            if (c2 == '2') {
                return a.V2;
            }
            if (c2 == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    public static String b(byte[] bArr, String str, com.applovin.impl.sdk.j jVar) {
        if (str != null) {
            if (str.length() < 80) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return "";
            }
            a b2 = b(bArr);
            if (a.NONE == b2) {
                return new String(bArr);
            }
            if (b2 == a.V2) {
                return a(bArr, str, jVar);
            }
            return a(new String(bArr), str, jVar);
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static String a(String str) {
        return str.replace(SignatureVisitor.SUPER, SignatureVisitor.EXTENDS).replace('_', '/').replace('*', SignatureVisitor.INSTANCEOF);
    }

    private static String a(byte[] bArr, String str, com.applovin.impl.sdk.j jVar) {
        try {
            int c2 = c(bArr, str, jVar);
            if (c2 == 0) {
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, c2, bArr.length);
            if (copyOfRange.length < 16) {
                return null;
            }
            long a2 = yp.a(copyOfRange, 8);
            byte[] a3 = a(str.substring(0, 32), f27576b, jVar);
            return AppLovinVideoBridge.stringInit(yp.d(a(Arrays.copyOfRange(copyOfRange, 16, copyOfRange.length), a2 ^ yp.c(a3), a3)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            jVar.E().a("AppLovinSdk", "decode2", e);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            com.applovin.impl.sdk.n.b("AppLovinSdk", "Failed to ungzip decode", e2);
            jVar.E().a("AppLovinSdk", "decode2", e2);
            return null;
        }
    }

    private static byte[] a(String str, long j2, String str2, com.applovin.impl.sdk.j jVar) {
        char c2 = ' ';
        try {
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] a2 = a(substring2, f27575a, jVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j2 & 255)) ^ a2[0]);
            byteArrayOutputStream.write(((byte) ((j2 >> 8) & 255)) ^ a2[1]);
            byteArrayOutputStream.write(((byte) ((j2 >> 16) & 255)) ^ a2[2]);
            byteArrayOutputStream.write(((byte) ((j2 >> 24) & 255)) ^ a2[3]);
            byteArrayOutputStream.write(((byte) ((j2 >> 32) & 255)) ^ a2[4]);
            byteArrayOutputStream.write(((byte) ((j2 >> 40) & 255)) ^ a2[5]);
            byteArrayOutputStream.write(((byte) ((j2 >> 48) & 255)) ^ a2[6]);
            byteArrayOutputStream.write(((byte) ((j2 >> 56) & 255)) ^ a2[7]);
            int i2 = 0;
            while (i2 < bytes.length) {
                long j3 = j2 + i2;
                long j4 = (j3 ^ (j3 >> 33)) * (-4417276706812531889L);
                long j5 = (j4 ^ (j4 >> 29)) * (-8796714831421723037L);
                long j6 = j5 ^ (j5 >> c2);
                String str3 = substring;
                byteArrayOutputStream.write((byte) (((i2 >= bytes.length ? (byte) 0 : bytes[i2]) ^ a2[i2 % a2.length]) ^ (j6 & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i2 + 1 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j6 >> 8) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i2 + 2 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j6 >> 16) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i2 + 3 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j6 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i2 + 4 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j6 >> 32) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i2 + 5 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j6 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i2 + 6 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j6 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r4 % a2.length] ^ (i2 + 7 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j6 >> 56) & 255)));
                i2 += 8;
                substring = str3;
                c2 = ' ';
            }
            String str4 = substring;
            String c3 = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f27575a, jVar) + CertificateUtil.DELIMITER + str4 + CertificateUtil.DELIMITER + c3).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            jVar.E().a("AppLovinSdk", "encode", e);
            return null;
        }
    }

    public static byte[] a(String str, long j2, a aVar, String str2, com.applovin.impl.sdk.j jVar) {
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (TextUtils.isEmpty(str)) {
                    return new byte[0];
                }
                if (a.NONE == aVar) {
                    return str.getBytes();
                }
                if (a.V2 == aVar) {
                    return a(str, j2, false, str2, jVar);
                }
                return a(str, j2, str2, jVar);
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static byte[] a(byte[] bArr, long j2, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        long j3 = j2;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i2 % 8 == 0) {
                long j4 = i2 + j2;
                long j5 = (j4 ^ (j4 >>> 33)) * (-4417276706812531889L);
                long j6 = (j5 ^ (j5 >>> 29)) * (-8796714831421723037L);
                j3 = j6 ^ (j6 >>> 32);
            }
            byte b2 = copyOf[i2];
            copyOf[i2] = (byte) (b2 ^ (((j3 >> (r4 * 8)) & 255) ^ bArr2[i2 % bArr2.length]));
        }
        return copyOf;
    }

    private static byte[] a(String str, long j2, boolean z2, String str2, com.applovin.impl.sdk.j jVar) {
        ByteBuffer allocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bArr = f27576b;
            byte[] a2 = a(substring2, bArr, jVar);
            long c2 = yp.c(a2) ^ j2;
            byte[] bytes2 = String.format("2:%s:%s:", a(bArr, jVar), substring).getBytes();
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putLong(length);
            allocate2.putLong(c2);
            allocate2.flip();
            byte[] a3 = a(yp.a(bytes), j2, a2);
            if (z2) {
                byte[] bytes3 = c(allocate2.array()).getBytes();
                byte[] bytes4 = c(a3).getBytes();
                allocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                allocate.put(bytes2);
                allocate.put(bytes3);
                allocate.put(bytes4);
            } else {
                allocate = ByteBuffer.allocate(bytes2.length + allocate2.remaining() + a3.length);
                allocate.put(bytes2);
                allocate.put(allocate2);
                allocate.put(a3);
            }
            allocate.flip();
            return allocate.array();
        } catch (UnsupportedEncodingException e) {
            jVar.E().a("AppLovinSdk", "encode2", e);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            jVar.E().a("AppLovinSdk", "encode2", e2);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b2) {
        if (bArr != null && bArr.length != 0) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                if (bArr[i2] == b2) {
                    return i2;
                }
            }
        }
        return -1;
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.j jVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            jVar.E().a("AppLovinSdk", "SHA256", e);
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.j jVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            jVar.E().a("AppLovinSdk", "SHA1", e);
            throw new RuntimeException("SHA-1 algorithm not found", e);
        }
    }

    private static String a(byte[] bArr) {
        return AppLovinVideoBridge.stringInit(bArr, "UTF-8").replace(SignatureVisitor.EXTENDS, SignatureVisitor.SUPER).replace('/', '_').replace(SignatureVisitor.INSTANCEOF, '*');
    }
}
