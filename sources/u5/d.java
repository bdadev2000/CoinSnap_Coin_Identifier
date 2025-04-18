package u5;

import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Paint.Align.values().length];
        try {
            iArr[Paint.Align.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Paint.Align.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Paint.Align.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
