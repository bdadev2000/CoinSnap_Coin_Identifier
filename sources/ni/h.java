package ni;

import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public final class h implements e {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f22803b;

    public /* synthetic */ h(int i10, Type type) {
        this.a = i10;
        this.f22803b = type;
    }

    public final i a(b0 b0Var) {
        switch (this.a) {
            case 0:
                i iVar = new i(b0Var);
                b0Var.enqueue(new g(0, this, iVar));
                return iVar;
            default:
                i iVar2 = new i(b0Var);
                b0Var.enqueue(new g(1, this, iVar2));
                return iVar2;
        }
    }

    @Override // ni.e
    public final /* bridge */ /* synthetic */ Object adapt(c cVar) {
        switch (this.a) {
            case 0:
                return a((b0) cVar);
            default:
                return a((b0) cVar);
        }
    }

    @Override // ni.e
    public final Type responseType() {
        return this.f22803b;
    }
}
