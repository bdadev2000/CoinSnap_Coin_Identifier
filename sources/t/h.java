package t;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

    public static /* synthetic */ boolean a(int i10, int i11) {
        if (i10 != 0) {
            return i10 == i11;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] c(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(a, 0, iArr, 0, i10);
        return iArr;
    }
}
