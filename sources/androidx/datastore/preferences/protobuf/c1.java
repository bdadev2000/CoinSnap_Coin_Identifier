package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class c1 implements k1 {
    public final b a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f1354b;

    /* renamed from: c, reason: collision with root package name */
    public final v f1355c;

    public c1(t1 t1Var, v vVar, b bVar) {
        this.f1354b = t1Var;
        vVar.getClass();
        this.f1355c = vVar;
        this.a = bVar;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final void a(Object obj, fb.c cVar) {
        this.f1355c.getClass();
        a4.j.t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final void b(Object obj, o oVar, u uVar) {
        this.f1354b.getClass();
        t1.a(obj);
        this.f1355c.getClass();
        a4.j.t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final boolean equals(Object obj, Object obj2) {
        t1 t1Var = this.f1354b;
        t1Var.getClass();
        s1 s1Var = ((e0) obj).unknownFields;
        t1Var.getClass();
        if (!s1Var.equals(((e0) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final int getSerializedSize(Object obj) {
        this.f1354b.getClass();
        s1 s1Var = ((e0) obj).unknownFields;
        int i10 = s1Var.f1465d;
        if (i10 == -1) {
            i10 = 0;
            for (int i11 = 0; i11 < s1Var.a; i11++) {
                int i12 = s1Var.f1463b[i11] >>> 3;
                i10 += r.O(3, (k) s1Var.f1464c[i11]) + r.f0(2, i12) + (r.e0(1) * 2);
            }
            s1Var.f1465d = i10;
        }
        return i10 + 0;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final int hashCode(Object obj) {
        this.f1354b.getClass();
        return ((e0) obj).unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final boolean isInitialized(Object obj) {
        this.f1355c.getClass();
        a4.j.t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final void makeImmutable(Object obj) {
        this.f1354b.getClass();
        t1.b(obj);
        this.f1355c.getClass();
        a4.j.t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final void mergeFrom(Object obj, Object obj2) {
        l1.B(this.f1354b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final e0 newInstance() {
        b bVar = this.a;
        if (bVar instanceof e0) {
            return (e0) ((e0) bVar).f();
        }
        return ((b0) ((e0) bVar).e(d0.NEW_BUILDER)).b();
    }
}
