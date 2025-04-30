package T7;

import y7.AbstractC2954c;

/* loaded from: classes3.dex */
public final class e extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3041f;

    /* renamed from: g, reason: collision with root package name */
    public int f3042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a7.b f3043h;

    /* renamed from: i, reason: collision with root package name */
    public a7.b f3044i;

    /* renamed from: j, reason: collision with root package name */
    public c f3045j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a7.b bVar, w7.f fVar) {
        super(fVar);
        this.f3043h = bVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f3041f = obj;
        this.f3042g |= Integer.MIN_VALUE;
        return this.f3043h.k(null, this);
    }
}
