package L;

import android.graphics.Color;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1667a = new ThreadLocal();

    public static int a(double d2, double d9, double d10) {
        double d11;
        double d12;
        double d13;
        int min;
        int min2;
        double d14 = (((-0.4986d) * d10) + (((-1.5372d) * d9) + (3.2406d * d2))) / 100.0d;
        double d15 = ((0.0415d * d10) + ((1.8758d * d9) + ((-0.9689d) * d2))) / 100.0d;
        double d16 = ((1.057d * d10) + (((-0.204d) * d9) + (0.0557d * d2))) / 100.0d;
        if (d14 > 0.0031308d) {
            d11 = (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d11 = d14 * 12.92d;
        }
        if (d15 > 0.0031308d) {
            d12 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d12 = d15 * 12.92d;
        }
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        int round = (int) Math.round(d11 * 255.0d);
        int i9 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d12 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d13 * 255.0d);
        if (round3 >= 0) {
            i9 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i9);
    }

    public static int b(int i9, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i9);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i11, c(Color.red(i9), alpha2, Color.red(i10), alpha, i11), c(Color.green(i9), alpha2, Color.green(i10), alpha, i11), c(Color.blue(i9), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int c(int i9, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i9 * 255) * i10)) / (i13 * 255);
    }

    public static int d(int i9, int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return (i9 & ViewCompat.MEASURED_SIZE_MASK) | (i10 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
