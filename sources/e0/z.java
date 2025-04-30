package e0;

import y7.AbstractC2954c;

/* loaded from: classes.dex */
public final class z extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public G f20019f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f20020g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ G f20021h;

    /* renamed from: i, reason: collision with root package name */
    public int f20022i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(G g9, w7.f fVar) {
        super(fVar);
        this.f20021h = g9;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f20020g = obj;
        this.f20022i |= Integer.MIN_VALUE;
        return this.f20021h.e(this);
    }
}
