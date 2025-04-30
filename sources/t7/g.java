package T7;

import y7.AbstractC2954c;

/* loaded from: classes3.dex */
public final class g extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public h f3049f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3050g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f3051h;

    /* renamed from: i, reason: collision with root package name */
    public int f3052i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, w7.f fVar) {
        super(fVar);
        this.f3051h = hVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f3050g = obj;
        this.f3052i |= Integer.MIN_VALUE;
        return this.f3051h.a(null, this);
    }
}
