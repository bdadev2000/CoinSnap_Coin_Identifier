package e0;

import y7.AbstractC2954c;

/* loaded from: classes.dex */
public final class C extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public Object f19931f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19932g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f19933h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G f19934i;

    /* renamed from: j, reason: collision with root package name */
    public int f19935j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(G g9, w7.f fVar) {
        super(fVar);
        this.f19934i = g9;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f19933h = obj;
        this.f19935j |= Integer.MIN_VALUE;
        return this.f19934i.h(this);
    }
}
