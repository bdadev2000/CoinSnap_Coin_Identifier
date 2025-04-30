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

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f10347a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};
    private static final byte[] b;

    /* loaded from: classes.dex */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* renamed from: a, reason: collision with root package name */
        private final int f10351a;

        a(int i9) {
            this.f10351a = i9;
        }

        public int b() {
            return this.f10351a;
        }

        public static a a(int i9) {
            if (i9 == 0) {
                return DEFAULT;
            }
            if (i9 == 1) {
                return V2;
            }
            return DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        b = bArr;
        System.arraycopy(new byte[]{Ascii.DC2, Ascii.FF, Ascii.FS, Ascii.DC4, 17, Ascii.ETB, Ascii.SUB, 9, Ascii.NAK, 3, Ascii.SO, Ascii.GS, 4, 0, 2, 7, 10, Ascii.GS, 6, Ascii.DC4, 1}, 0, bArr, 0, 21);
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        String str3;
        String[] split = str.split(":");
        char c9 = 0;
        try {
            try {
                if (!"1".equals(split[0])) {
                    return null;
                }
                try {
                    if (split.length != 4) {
                        return null;
                    }
                    String str4 = split[1];
                    String str5 = split[2];
                    byte[] b8 = b(split[3]);
                    if (!str2.endsWith(str5)) {
                        return null;
                    }
                    byte[] bArr = f10347a;
                    if (!a(bArr, kVar).equals(str4)) {
                        return null;
                    }
                    char c10 = ' ';
                    byte[] a6 = a(str2.substring(0, 32), bArr, kVar);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b8);
                    char c11 = '\b';
                    long read = (((byteArrayInputStream.read() ^ a6[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ a6[0]) & 255) | (((byteArrayInputStream.read() ^ a6[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ a6[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ a6[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ a6[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ a6[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ a6[7]) & 255) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int read2 = byteArrayInputStream.read(bArr2);
                    int i9 = 0;
                    while (read2 >= 0) {
                        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                        long j7 = i9 + read;
                        long j9 = (j7 ^ (j7 >> 33)) * (-4417276706812531889L);
                        long j10 = (j9 ^ (j9 >> 29)) * (-8796714831421723037L);
                        long j11 = j10 ^ (j10 >> c10);
                        byteArrayOutputStream.write((byte) ((bArr2[c9] ^ a6[i9 % a6.length]) ^ (j11 & 255)));
                        byteArrayOutputStream.write((byte) ((a6[(i9 + 1) % a6.length] ^ bArr2[1]) ^ ((j11 >> c11) & 255)));
                        byteArrayOutputStream.write((byte) ((a6[(i9 + 2) % a6.length] ^ bArr2[2]) ^ ((j11 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[3] ^ a6[(i9 + 3) % a6.length]) ^ ((j11 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) ((a6[(i9 + 4) % a6.length] ^ bArr2[4]) ^ ((j11 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) ((a6[(i9 + 5) % a6.length] ^ bArr2[5]) ^ ((j11 >> 40) & 255)));
                        byteArrayOutputStream.write((byte) ((a6[(i9 + 6) % a6.length] ^ bArr2[6]) ^ ((j11 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[7] ^ a6[(i9 + 7) % a6.length]) ^ ((j11 >> 56) & 255)));
                        i9 += 8;
                        byteArrayInputStream = byteArrayInputStream2;
                        read2 = byteArrayInputStream2.read(bArr2);
                        read = read;
                        c11 = '\b';
                        c9 = 0;
                        c10 = ' ';
                    }
                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                } catch (IOException e4) {
                    e = e4;
                    str3 = null;
                    com.applovin.impl.sdk.t.b("AppLovinSdk", "Failed to read bytes", e);
                    kVar.B().a("AppLovinSdk", "decode", e);
                    return str3;
                }
            } catch (UnsupportedEncodingException e9) {
                kVar.B().a("AppLovinSdk", "decode", e9);
                throw new RuntimeException("UTF-8 encoding not found", e9);
            }
        } catch (IOException e10) {
            e = e10;
            str3 = null;
        }
    }

    public static String b(String str, long j7, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        byte[] a6;
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (TextUtils.isEmpty(str) || a.NONE == aVar) {
                    return str;
                }
                if (a.V2 == aVar) {
                    a6 = a(str, j7, true, str2, kVar);
                } else {
                    a6 = a(str, j7, str2, kVar);
                }
                if (a6 != null) {
                    return new String(a6);
                }
                return null;
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static int c(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        int a6;
        int i9;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (a6 = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(b, kVar).getBytes();
        int i10 = a6 + 1;
        int length = bytes.length + i10;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i9 = length + 55) || bArr[i9] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i10, bytes.length + i10), bytes)) {
            return 0;
        }
        int i11 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i11;
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c9 = (char) bArr[0];
            if (c9 == '2') {
                return a.V2;
            }
            if (c9 == '{') {
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
            a b8 = b(bArr);
            if (a.NONE == b8) {
                return new String(bArr);
            }
            if (b8 == a.V2) {
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
            int c9 = c(bArr, str, kVar);
            if (c9 == 0) {
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, c9, bArr.length);
            if (copyOfRange.length < 16) {
                return null;
            }
            long a6 = zp.a(copyOfRange, 8);
            byte[] a9 = a(str.substring(0, 32), b, kVar);
            return new String(zp.d(a(Arrays.copyOfRange(copyOfRange, 16, copyOfRange.length), a6 ^ zp.c(a9), a9)), "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            kVar.B().a("AppLovinSdk", "decode2", e4);
            throw new RuntimeException("UTF-8 encoding not found", e4);
        } catch (IOException e9) {
            com.applovin.impl.sdk.t.b("AppLovinSdk", "Failed to ungzip decode", e9);
            kVar.B().a("AppLovinSdk", "decode2", e9);
            return null;
        }
    }

    private static byte[] a(String str, long j7, String str2, com.applovin.impl.sdk.k kVar) {
        char c9 = ' ';
        try {
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] a6 = a(substring2, f10347a, kVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j7 & 255)) ^ a6[0]);
            byteArrayOutputStream.write(((byte) ((j7 >> 8) & 255)) ^ a6[1]);
            byteArrayOutputStream.write(((byte) ((j7 >> 16) & 255)) ^ a6[2]);
            byteArrayOutputStream.write(((byte) ((j7 >> 24) & 255)) ^ a6[3]);
            byteArrayOutputStream.write(((byte) ((j7 >> 32) & 255)) ^ a6[4]);
            byteArrayOutputStream.write(((byte) ((j7 >> 40) & 255)) ^ a6[5]);
            byteArrayOutputStream.write(((byte) ((j7 >> 48) & 255)) ^ a6[6]);
            byteArrayOutputStream.write(((byte) ((j7 >> 56) & 255)) ^ a6[7]);
            int i9 = 0;
            while (i9 < bytes.length) {
                long j9 = j7 + i9;
                long j10 = (j9 ^ (j9 >> 33)) * (-4417276706812531889L);
                long j11 = (j10 ^ (j10 >> 29)) * (-8796714831421723037L);
                long j12 = j11 ^ (j11 >> c9);
                String str3 = substring;
                byteArrayOutputStream.write((byte) (((i9 >= bytes.length ? (byte) 0 : bytes[i9]) ^ a6[i9 % a6.length]) ^ (j12 & 255)));
                byteArrayOutputStream.write((byte) ((a6[r4 % a6.length] ^ (i9 + 1 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j12 >> 8) & 255)));
                byteArrayOutputStream.write((byte) ((a6[r4 % a6.length] ^ (i9 + 2 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j12 >> 16) & 255)));
                byteArrayOutputStream.write((byte) ((a6[r4 % a6.length] ^ (i9 + 3 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j12 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((a6[r4 % a6.length] ^ (i9 + 4 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j12 >> 32) & 255)));
                byteArrayOutputStream.write((byte) ((a6[r4 % a6.length] ^ (i9 + 5 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j12 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((a6[r4 % a6.length] ^ (i9 + 6 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j12 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((a6[r4 % a6.length] ^ (i9 + 7 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j12 >> 56) & 255)));
                i9 += 8;
                substring = str3;
                c9 = ' ';
            }
            String str4 = substring;
            String c10 = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f10347a, kVar) + ":" + str4 + ":" + c10).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e4) {
            kVar.B().a("AppLovinSdk", "encode", e4);
            return null;
        }
    }

    public static byte[] a(String str, long j7, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (TextUtils.isEmpty(str)) {
                    return new byte[0];
                }
                if (a.NONE == aVar) {
                    return str.getBytes();
                }
                if (a.V2 == aVar) {
                    return a(str, j7, false, str2, kVar);
                }
                return a(str, j7, str2, kVar);
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static byte[] a(byte[] bArr, long j7, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        long j9 = j7;
        for (int i9 = 0; i9 < bArr.length; i9++) {
            if (i9 % 8 == 0) {
                long j10 = i9 + j7;
                long j11 = (j10 ^ (j10 >>> 33)) * (-4417276706812531889L);
                long j12 = (j11 ^ (j11 >>> 29)) * (-8796714831421723037L);
                j9 = j12 ^ (j12 >>> 32);
            }
            byte b8 = copyOf[i9];
            copyOf[i9] = (byte) (b8 ^ (((j9 >> (r4 * 8)) & 255) ^ bArr2[i9 % bArr2.length]));
        }
        return copyOf;
    }

    private static byte[] a(String str, long j7, boolean z8, String str2, com.applovin.impl.sdk.k kVar) {
        ByteBuffer allocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bArr = b;
            byte[] a6 = a(substring2, bArr, kVar);
            long c9 = zp.c(a6) ^ j7;
            byte[] bytes2 = ("2:" + a(bArr, kVar) + ":" + substring + ":").getBytes();
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putLong((long) length);
            allocate2.putLong(c9);
            allocate2.flip();
            byte[] a9 = a(zp.a(bytes), j7, a6);
            if (z8) {
                byte[] bytes3 = c(allocate2.array()).getBytes();
                byte[] bytes4 = c(a9).getBytes();
                allocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                allocate.put(bytes2);
                allocate.put(bytes3);
                allocate.put(bytes4);
            } else {
                allocate = ByteBuffer.allocate(bytes2.length + allocate2.remaining() + a9.length);
                allocate.put(bytes2);
                allocate.put(allocate2);
                allocate.put(a9);
            }
            allocate.flip();
            return allocate.array();
        } catch (UnsupportedEncodingException e4) {
            kVar.B().a("AppLovinSdk", "encode2", e4);
            throw new RuntimeException("UTF-8 encoding not found", e4);
        } catch (IOException e9) {
            kVar.B().a("AppLovinSdk", "encode2", e9);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b8) {
        if (bArr != null && bArr.length != 0) {
            for (int i9 = 0; i9 < bArr.length; i9++) {
                if (bArr[i9] == b8) {
                    return i9;
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
        } catch (NoSuchAlgorithmException e4) {
            kVar.B().a("AppLovinSdk", "SHA256", e4);
            throw new RuntimeException("SHA-256 algorithm not found", e4);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.k kVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e4) {
            kVar.B().a("AppLovinSdk", "SHA1", e4);
            throw new RuntimeException("SHA-1 algorithm not found", e4);
        }
    }

    private static String a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
