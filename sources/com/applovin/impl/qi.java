package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class qi {
    private static final byte[] a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f7217b;

    /* loaded from: classes.dex */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);

        private final int a;

        a(int i10) {
            this.a = i10;
        }

        public int b() {
            return this.a;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return DEFAULT;
            }
            if (i10 == 1) {
                return V2;
            }
            return DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f7217b = bArr;
        System.arraycopy(new byte[]{Ascii.DC2, Ascii.FF, Ascii.FS, Ascii.DC4, 17, Ascii.ETB, Ascii.SUB, 9, Ascii.NAK, 3, Ascii.SO, Ascii.GS, 4, 0, 2, 7, 10, Ascii.GS, 6, Ascii.DC4, 1}, 0, bArr, 0, 21);
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        String[] split = str.split(":");
        char c10 = 0;
        try {
            if (!"1".equals(split[0]) || split.length != 4) {
                return null;
            }
            String str3 = split[1];
            String str4 = split[2];
            byte[] b3 = b(split[3]);
            if (!str2.endsWith(str4)) {
                return null;
            }
            byte[] bArr = a;
            if (!a(bArr, kVar).equals(str3)) {
                return null;
            }
            char c11 = ' ';
            byte[] a10 = a(str2.substring(0, 32), bArr, kVar);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b3);
            char c12 = '\b';
            long read = (((byteArrayInputStream.read() ^ a10[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ a10[0]) & 255) | (((byteArrayInputStream.read() ^ a10[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ a10[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ a10[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ a10[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ a10[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ a10[7]) & 255) << 56);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[8];
            int read2 = byteArrayInputStream.read(bArr2);
            int i10 = 0;
            while (read2 >= 0) {
                ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                long j3 = i10 + read;
                long j10 = (j3 ^ (j3 >> 33)) * (-4417276706812531889L);
                long j11 = (j10 ^ (j10 >> 29)) * (-8796714831421723037L);
                long j12 = j11 ^ (j11 >> c11);
                byteArrayOutputStream.write((byte) ((bArr2[c10] ^ a10[i10 % a10.length]) ^ (j12 & 255)));
                byteArrayOutputStream.write((byte) ((a10[(i10 + 1) % a10.length] ^ bArr2[1]) ^ ((j12 >> c12) & 255)));
                byteArrayOutputStream.write((byte) ((a10[(i10 + 2) % a10.length] ^ bArr2[2]) ^ ((j12 >> 16) & 255)));
                byteArrayOutputStream.write((byte) ((bArr2[3] ^ a10[(i10 + 3) % a10.length]) ^ ((j12 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((a10[(i10 + 4) % a10.length] ^ bArr2[4]) ^ ((j12 >> 32) & 255)));
                byteArrayOutputStream.write((byte) ((a10[(i10 + 5) % a10.length] ^ bArr2[5]) ^ ((j12 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((a10[(i10 + 6) % a10.length] ^ bArr2[6]) ^ ((j12 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((bArr2[7] ^ a10[(i10 + 7) % a10.length]) ^ ((j12 >> 56) & 255)));
                i10 += 8;
                byteArrayInputStream = byteArrayInputStream2;
                read2 = byteArrayInputStream2.read(bArr2);
                read = read;
                c12 = '\b';
                c10 = 0;
                c11 = ' ';
            }
            return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
        } catch (UnsupportedEncodingException e2) {
            kVar.B().a("AppLovinSdk", "decode", e2);
            throw new RuntimeException("UTF-8 encoding not found", e2);
        } catch (IOException e10) {
            com.applovin.impl.sdk.t.b("AppLovinSdk", "Failed to read bytes", e10);
            kVar.B().a("AppLovinSdk", "decode", e10);
            return null;
        }
    }

    public static String b(String str, long j3, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        byte[] a10;
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (TextUtils.isEmpty(str) || a.NONE == aVar) {
                    return str;
                }
                if (a.V2 == aVar) {
                    a10 = a(str, j3, true, str2, kVar);
                } else {
                    a10 = a(str, j3, str2, kVar);
                }
                if (a10 != null) {
                    return new String(a10);
                }
                return null;
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static int c(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        int a10;
        int i10;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (a10 = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f7217b, kVar).getBytes();
        int i11 = a10 + 1;
        int length = bytes.length + i11;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i10 = length + 55) || bArr[i10] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i11, bytes.length + i11), bytes)) {
            return 0;
        }
        int i12 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i12;
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c10 = (char) bArr[0];
            if (c10 == '2') {
                return a.V2;
            }
            if (c10 == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    public static String b(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
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
            a b3 = b(bArr);
            if (a.NONE == b3) {
                return new String(bArr);
            }
            if (b3 == a.V2) {
                return a(bArr, str, kVar);
            }
            return a(new String(bArr), str, kVar);
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    private static String a(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        try {
            int c10 = c(bArr, str, kVar);
            if (c10 == 0) {
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, c10, bArr.length);
            if (copyOfRange.length < 16) {
                return null;
            }
            long a10 = zp.a(copyOfRange, 8);
            byte[] a11 = a(str.substring(0, 32), f7217b, kVar);
            return new String(zp.d(a(Arrays.copyOfRange(copyOfRange, 16, copyOfRange.length), a10 ^ zp.c(a11), a11)), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            kVar.B().a("AppLovinSdk", "decode2", e2);
            throw new RuntimeException("UTF-8 encoding not found", e2);
        } catch (IOException e10) {
            com.applovin.impl.sdk.t.b("AppLovinSdk", "Failed to ungzip decode", e10);
            kVar.B().a("AppLovinSdk", "decode2", e10);
            return null;
        }
    }

    private static byte[] a(String str, long j3, String str2, com.applovin.impl.sdk.k kVar) {
        char c10 = ' ';
        try {
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] a10 = a(substring2, a, kVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j3 & 255)) ^ a10[0]);
            byteArrayOutputStream.write(((byte) ((j3 >> 8) & 255)) ^ a10[1]);
            byteArrayOutputStream.write(((byte) ((j3 >> 16) & 255)) ^ a10[2]);
            byteArrayOutputStream.write(((byte) ((j3 >> 24) & 255)) ^ a10[3]);
            byteArrayOutputStream.write(((byte) ((j3 >> 32) & 255)) ^ a10[4]);
            byteArrayOutputStream.write(((byte) ((j3 >> 40) & 255)) ^ a10[5]);
            byteArrayOutputStream.write(((byte) ((j3 >> 48) & 255)) ^ a10[6]);
            byteArrayOutputStream.write(((byte) ((j3 >> 56) & 255)) ^ a10[7]);
            int i10 = 0;
            while (i10 < bytes.length) {
                long j10 = j3 + i10;
                long j11 = (j10 ^ (j10 >> 33)) * (-4417276706812531889L);
                long j12 = (j11 ^ (j11 >> 29)) * (-8796714831421723037L);
                long j13 = j12 ^ (j12 >> c10);
                String str3 = substring;
                byteArrayOutputStream.write((byte) (((i10 >= bytes.length ? (byte) 0 : bytes[i10]) ^ a10[i10 % a10.length]) ^ (j13 & 255)));
                byteArrayOutputStream.write((byte) ((a10[r4 % a10.length] ^ (i10 + 1 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 8) & 255)));
                byteArrayOutputStream.write((byte) ((a10[r4 % a10.length] ^ (i10 + 2 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 16) & 255)));
                byteArrayOutputStream.write((byte) ((a10[r4 % a10.length] ^ (i10 + 3 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((a10[r4 % a10.length] ^ (i10 + 4 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 32) & 255)));
                byteArrayOutputStream.write((byte) ((a10[r4 % a10.length] ^ (i10 + 5 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((a10[r4 % a10.length] ^ (i10 + 6 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((a10[r4 % a10.length] ^ (i10 + 7 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 56) & 255)));
                i10 += 8;
                substring = str3;
                c10 = ' ';
            }
            String str4 = substring;
            String c11 = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(a, kVar) + ":" + str4 + ":" + c11).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            kVar.B().a("AppLovinSdk", "encode", e2);
            return null;
        }
    }

    public static byte[] a(String str, long j3, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (TextUtils.isEmpty(str)) {
                    return new byte[0];
                }
                if (a.NONE == aVar) {
                    return str.getBytes();
                }
                if (a.V2 == aVar) {
                    return a(str, j3, false, str2, kVar);
                }
                return a(str, j3, str2, kVar);
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static byte[] a(byte[] bArr, long j3, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        long j10 = j3;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 % 8 == 0) {
                long j11 = i10 + j3;
                long j12 = (j11 ^ (j11 >>> 33)) * (-4417276706812531889L);
                long j13 = (j12 ^ (j12 >>> 29)) * (-8796714831421723037L);
                j10 = j13 ^ (j13 >>> 32);
            }
            byte b3 = copyOf[i10];
            copyOf[i10] = (byte) (b3 ^ (((j10 >> (r4 * 8)) & 255) ^ bArr2[i10 % bArr2.length]));
        }
        return copyOf;
    }

    private static byte[] a(String str, long j3, boolean z10, String str2, com.applovin.impl.sdk.k kVar) {
        ByteBuffer allocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bArr = f7217b;
            byte[] a10 = a(substring2, bArr, kVar);
            long c10 = zp.c(a10) ^ j3;
            byte[] bytes2 = String.format("2:%s:%s:", a(bArr, kVar), substring).getBytes();
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putLong(length);
            allocate2.putLong(c10);
            allocate2.flip();
            byte[] a11 = a(zp.a(bytes), j3, a10);
            if (z10) {
                byte[] bytes3 = c(allocate2.array()).getBytes();
                byte[] bytes4 = c(a11).getBytes();
                allocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                allocate.put(bytes2);
                allocate.put(bytes3);
                allocate.put(bytes4);
            } else {
                allocate = ByteBuffer.allocate(bytes2.length + allocate2.remaining() + a11.length);
                allocate.put(bytes2);
                allocate.put(allocate2);
                allocate.put(a11);
            }
            allocate.flip();
            return allocate.array();
        } catch (UnsupportedEncodingException e2) {
            kVar.B().a("AppLovinSdk", "encode2", e2);
            throw new RuntimeException("UTF-8 encoding not found", e2);
        } catch (IOException e10) {
            kVar.B().a("AppLovinSdk", "encode2", e10);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b3) {
        if (bArr != null && bArr.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] == b3) {
                    return i10;
                }
            }
        }
        return -1;
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.k kVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Constants.SHA256);
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e2) {
            kVar.B().a("AppLovinSdk", "SHA256", e2);
            throw new RuntimeException("SHA-256 algorithm not found", e2);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.k kVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            kVar.B().a("AppLovinSdk", "SHA1", e2);
            throw new RuntimeException("SHA-1 algorithm not found", e2);
        }
    }

    private static String a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
