package com.mbridge.msdk.foundation.tools;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
final class ap {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        static final char[] f16026a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        static final SecureRandom b = new SecureRandom();
    }

    public static void a(File file) {
        try {
            if (file.exists()) {
                d(file);
            }
        } catch (Exception unused) {
        }
    }

    public static byte[] b(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) == 0) {
            int i9 = (int) length;
            byte[] bArr = new byte[i9];
            a(file, bArr, i9);
            return bArr;
        }
        throw new IllegalArgumentException("file too large, path:" + file.getPath());
    }

    public static boolean c(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && ((parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile())) {
            return true;
        }
        return false;
    }

    private static void d(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        file.delete();
    }

    public static void a(File file, byte[] bArr, int i9) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i10 = 0;
        while (i10 < i9) {
            try {
                int read = randomAccessFile.read(bArr, i10, i9 - i10);
                if (read < 0) {
                    break;
                } else {
                    i10 += read;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    public static String b() {
        byte[] bArr = new byte[16];
        a.b.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i9 = 0; i9 < 16; i9++) {
            byte b = bArr[i9];
            int i10 = i9 << 1;
            char[] cArr2 = a.f16026a;
            cArr[i10] = cArr2[(b >> 4) & 15];
            cArr[i10 + 1] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    public static boolean a(File file, byte[] bArr) {
        File file2;
        try {
            file2 = new File(file.getParent(), file.getName() + ".tmp");
        } catch (Exception unused) {
        }
        if (!c(file2)) {
            return false;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            randomAccessFile.setLength(bArr.length);
            randomAccessFile.write(bArr);
            a(randomAccessFile);
            if (!file.exists() || file.delete()) {
                return file2.renameTo(file);
            }
            return false;
        } catch (Throwable th) {
            a(randomAccessFile);
            throw th;
        }
    }
}
