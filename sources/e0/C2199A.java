package e0;

import y7.AbstractC2954c;

/* renamed from: e0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2199A extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public G f19922f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f19923g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ G f19924h;

    /* renamed from: i, reason: collision with root package name */
    public int f19925i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2199A(G g9, w7.f fVar) {
        super(fVar);
        this.f19924h = g9;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f19923g = obj;
        this.f19925i |= Integer.MIN_VALUE;
        return this.f19924h.f(this);
    }
}
