package e0;

import y7.AbstractC2954c;

/* loaded from: classes.dex */
public final class D extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public G f19936f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19937g;

    /* renamed from: h, reason: collision with root package name */
    public Object f19938h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f19939i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G f19940j;

    /* renamed from: k, reason: collision with root package name */
    public int f19941k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G g9, w7.f fVar) {
        super(fVar);
        this.f19940j = g9;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f19939i = obj;
        this.f19941k |= Integer.MIN_VALUE;
        return this.f19940j.i(null, this, null);
    }
}
