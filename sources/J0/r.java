package j0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f21000a;
    public u b;

    public r(int i9) {
        this.f21000a = new SparseArray(i9);
    }

    public final void a(u uVar, int i9, int i10) {
        r rVar;
        int a6 = uVar.a(i9);
        SparseArray sparseArray = this.f21000a;
        if (sparseArray == null) {
            rVar = null;
        } else {
            rVar = (r) sparseArray.get(a6);
        }
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i9), rVar);
        }
        if (i10 > i9) {
            rVar.a(uVar, i9 + 1, i10);
        } else {
            rVar.b = uVar;
        }
    }
}
