package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.fragment.app.FragmentTransaction;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC09466h {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{92, 88, 84, 82, 80};
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
            options.inSampleSize = A00(options, i10, i9);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c0n, null, options);
        }
        return BitmapFactory.decodeStream(c0n);
    }

    public static Bitmap A02(String str, int i9, int i10, C09647f c09647f) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i10, i9);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable t9) {
            c09647f.A07().A9a(A03(0, 5, 99), C8A.A1h, new C8B(t9));
            return null;
        }
    }
}
