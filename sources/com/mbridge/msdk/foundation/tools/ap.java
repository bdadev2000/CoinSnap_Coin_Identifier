package com.mbridge.msdk.foundation.tools;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
final class ap {

    /* loaded from: classes4.dex */
    public static class a {
        static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        /* renamed from: b, reason: collision with root package name */
        static final SecureRandom f13584b = new SecureRandom();
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
            int i10 = (int) length;
            byte[] bArr = new byte[i10];
            a(file, bArr, i10);
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

    public static void a(File file, byte[] bArr, int i10) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i11 = 0;
        while (i11 < i10) {
            try {
                int read = randomAccessFile.read(bArr, i11, i10 - i11);
                if (read < 0) {
                    break;
                } else {
                    i11 += read;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    public static String b() {
        byte[] bArr = new byte[16];
        a.f13584b.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b3 = bArr[i10];
            int i11 = i10 << 1;
            char[] cArr2 = a.a;
            cArr[i11] = cArr2[(b3 >> 4) & 15];
            cArr[i11 + 1] = cArr2[b3 & Ascii.SI];
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
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
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
        } catch (Throwable th2) {
            a(randomAccessFile);
            throw th2;
        }
    }
}
