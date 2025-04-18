package androidx.recyclerview.widget;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public abstract class v {
    public final SparseIntArray a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public final SparseIntArray f2049b = new SparseIntArray();

    public static int a(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    public final void b() {
        this.a.clear();
    }
}
