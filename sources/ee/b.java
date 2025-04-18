package ee;

import android.widget.ImageView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        a = iArr;
        try {
            iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
