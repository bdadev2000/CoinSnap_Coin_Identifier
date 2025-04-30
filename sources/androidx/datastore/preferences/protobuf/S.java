package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class S implements InterfaceC0426a0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0425a f4534a;
    public final j0 b;

    /* renamed from: c, reason: collision with root package name */
    public final C0439n f4535c;

    public S(j0 j0Var, C0439n c0439n, AbstractC0425a abstractC0425a) {
        this.b = j0Var;
        c0439n.getClass();
        this.f4535c = c0439n;
        this.f4534a = abstractC0425a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final void a(Object obj, J j7) {
        this.f4535c.getClass();
        com.mbridge.msdk.foundation.entity.o.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final void b(Object obj, J5.a aVar, C0438m c0438m) {
        this.b.getClass();
        AbstractC0446v abstractC0446v = (AbstractC0446v) obj;
        if (abstractC0446v.unknownFields == i0.f4576f) {
            abstractC0446v.unknownFields = i0.b();
        }
        this.f4535c.getClass();
        com.mbridge.msdk.foundation.entity.o.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final boolean equals(Object obj, Object obj2) {
        j0 j0Var = this.b;
        j0Var.getClass();
        i0 i0Var = ((AbstractC0446v) obj).unknownFields;
        j0Var.getClass();
        if (!i0Var.equals(((AbstractC0446v) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final int getSerializedSize(Object obj) {
        this.b.getClass();
        i0 i0Var = ((AbstractC0446v) obj).unknownFields;
        int i9 = i0Var.f4579d;
        if (i9 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < i0Var.f4577a; i11++) {
                int i12 = i0Var.b[i11] >>> 3;
                i10 += C0435j.t(3, (C0432g) i0Var.f4578c[i11]) + C0435j.L(2, i12) + (C0435j.K(1) * 2);
            }
            i0Var.f4579d = i10;
            return i10;
        }
        return i9;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final int hashCode(Object obj) {
        this.b.getClass();
        return ((AbstractC0446v) obj).unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final boolean isInitialized(Object obj) {
        this.f4535c.getClass();
        com.mbridge.msdk.foundation.entity.o.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final void makeImmutable(Object obj) {
        this.b.getClass();
        ((AbstractC0446v) obj).unknownFields.f4580e = false;
        this.f4535c.getClass();
        com.mbridge.msdk.foundation.entity.o.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final void mergeFrom(Object obj, Object obj2) {
        b0.B(this.b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final Object newInstance() {
        return ((AbstractC0444t) ((AbstractC0446v) this.f4534a).d(5)).b();
    }
}
