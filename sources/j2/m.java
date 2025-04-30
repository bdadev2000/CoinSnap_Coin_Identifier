package j2;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21024a;

    static {
        Bitmap.Config config;
        int[] iArr = new int[Bitmap.Config.values().length];
        f21024a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21024a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21024a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            int[] iArr2 = f21024a;
            config = Bitmap.Config.RGBA_F16;
            iArr2[config.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21024a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
