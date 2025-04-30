package U7;

import y7.InterfaceC2955d;

/* loaded from: classes3.dex */
public final class w implements w7.f, InterfaceC2955d {
    public final w7.f b;

    /* renamed from: c, reason: collision with root package name */
    public final w7.k f3387c;

    public w(w7.f fVar, w7.k kVar) {
        this.b = fVar;
        this.f3387c = kVar;
    }

    @Override // y7.InterfaceC2955d
    public final InterfaceC2955d d() {
        w7.f fVar = this.b;
        if (fVar instanceof InterfaceC2955d) {
            return (InterfaceC2955d) fVar;
        }
        return null;
    }

    @Override // w7.f
    public final void e(Object obj) {
        this.b.e(obj);
    }

    @Override // w7.f
    public final w7.k getContext() {
        return this.f3387c;
    }
}
