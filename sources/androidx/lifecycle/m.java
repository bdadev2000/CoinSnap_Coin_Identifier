package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[n.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[n.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
