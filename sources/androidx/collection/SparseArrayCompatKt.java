package androidx.collection;

/* loaded from: classes4.dex */
public final class SparseArrayCompatKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1612a = new Object();

    public static final void a(SparseArrayCompat sparseArrayCompat) {
        int i2 = sparseArrayCompat.d;
        int[] iArr = sparseArrayCompat.f1610b;
        Object[] objArr = sparseArrayCompat.f1611c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1612a) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        sparseArrayCompat.f1609a = false;
        sparseArrayCompat.d = i3;
    }
}
