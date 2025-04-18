package androidx.emoji2.text;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class y {
    public final SparseArray a;

    /* renamed from: b, reason: collision with root package name */
    public r f1550b;

    public y(int i10) {
        this.a = new SparseArray(i10);
    }

    public final void a(r rVar, int i10, int i11) {
        y yVar;
        int a = rVar.a(i10);
        SparseArray sparseArray = this.a;
        if (sparseArray == null) {
            yVar = null;
        } else {
            yVar = (y) sparseArray.get(a);
        }
        if (yVar == null) {
            yVar = new y(1);
            sparseArray.put(rVar.a(i10), yVar);
        }
        if (i11 > i10) {
            yVar.a(rVar, i10 + 1, i11);
        } else {
            yVar.f1550b = rVar;
        }
    }
}
