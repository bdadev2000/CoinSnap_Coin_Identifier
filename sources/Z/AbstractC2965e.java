package z;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2965e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24482a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

    public static /* synthetic */ boolean a(int i9, int i10) {
        if (i9 != 0) {
            return i9 == i10;
        }
        throw null;
    }

    public static StringBuilder b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ int d(int i9) {
        if (i9 != 0) {
            return i9 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] e(int i9) {
        int[] iArr = new int[i9];
        System.arraycopy(f24482a, 0, iArr, 0, i9);
        return iArr;
    }
}
