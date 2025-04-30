package com.bytedance.adsdk.lottie;

/* loaded from: classes.dex */
public enum vwr {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.bytedance.adsdk.lottie.vwr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[vwr.values().length];
            zp = iArr;
            try {
                iArr[vwr.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[vwr.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zp[vwr.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean zp(int i9, boolean z8, int i10) {
        int i11 = AnonymousClass1.zp[ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return true;
        }
        if ((!z8 || i9 >= 28) && i10 <= 4 && i9 > 25) {
            return false;
        }
        return true;
    }
}
