package g;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements e1.i, kotlin.jvm.internal.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f30552a;

    public n(t tVar) {
        this.f30552a = tVar;
    }

    @Override // kotlin.jvm.internal.l
    public final d0.c c() {
        return new kotlin.jvm.internal.a(2, this.f30552a, t.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
    }

    @Override // e1.i
    public final Object emit(Object obj, h0.g gVar) {
        this.f30552a.b((l) obj);
        i0.a aVar = i0.a.f30806a;
        return d0.b0.f30125a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e1.i) && (obj instanceof kotlin.jvm.internal.l)) {
            return p0.a.g(c(), ((kotlin.jvm.internal.l) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
