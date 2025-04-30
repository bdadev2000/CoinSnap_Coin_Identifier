package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.fragment.app.FragmentTransaction;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C0M {
    public static byte[] A00;

    static {
        A06();
    }

    public static String A04(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 61);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{46, 33, 36, 45, 114, 103, 103};
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i9) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i9 || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i9 && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i9, int i10) throws IOException {
        if (Build.VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C0N c0n = new C0N(inputStream);
        c0n.mark(FragmentTransaction.TRANSIT_EXIT_MASK);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c0n, null, options);
        c0n.reset();
        if (!c0n.A00()) {
            options.inSampleSize = A00(options, i9, i10);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c0n, null, options);
        }
        return BitmapFactory.decodeStream(c0n);
    }

    public static Bitmap A02(String str, int i9, int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = A00(options, i9, i10);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap A03(String str, int i9, int i10, boolean z8) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            if (i9 > 0 && i10 > 0) {
                if (z8) {
                    Bitmap A01 = A01(fileInputStream, i9, i10);
                    A07(fileInputStream);
                    return A01;
                }
                Bitmap A02 = A02(str, i9, i10);
                A07(fileInputStream);
                return A02;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
            A07(fileInputStream);
            return decodeStream;
        } catch (Throwable th) {
            A07(null);
            throw th;
        }
    }

    public static String A05(File file) {
        if (file != null) {
            return A04(0, 7, 117) + file.getPath();
        }
        return null;
    }

    public static void A07(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
