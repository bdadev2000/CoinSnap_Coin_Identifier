package androidx.recyclerview.widget;

import android.util.SparseIntArray;

/* renamed from: androidx.recyclerview.widget.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0541v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f5099a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();

    public static int a(int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        if (i11 + 1 > i10) {
            return i12 + 1;
        }
        return i12;
    }

    public final void b() {
        this.f5099a.clear();
    }
}
