package T7;

import y7.AbstractC2954c;

/* loaded from: classes3.dex */
public final class a extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public U7.r f3031f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ E1.c f3033h;

    /* renamed from: i, reason: collision with root package name */
    public int f3034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(E1.c cVar, w7.f fVar) {
        super(fVar);
        this.f3033h = cVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f3032g = obj;
        this.f3034i |= Integer.MIN_VALUE;
        return this.f3033h.k(null, this);
    }
}
