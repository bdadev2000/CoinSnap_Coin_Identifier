package x;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f24067a = new int[0];
    public static final long[] b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f24068c = new Object[0];

    public static int a(int i9, int i10, int[] iArr) {
        int i11 = i9 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static int b(long[] jArr, int i9, long j7) {
        int i10 = i9 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j9 = jArr[i12];
            if (j9 < j7) {
                i11 = i12 + 1;
            } else if (j9 > j7) {
                i10 = i12 - 1;
            } else {
                return i12;
            }
        }
        return ~i11;
    }
}
