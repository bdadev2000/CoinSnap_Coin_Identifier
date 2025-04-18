package com.bytedance.adsdk.Sg;

/* loaded from: classes.dex */
public enum qO {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.bytedance.adsdk.Sg.qO$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[qO.values().length];
            YFl = iArr;
            try {
                iArr[qO.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[qO.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[qO.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean YFl(int i10, boolean z10, int i11) {
        int i12 = AnonymousClass1.YFl[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
