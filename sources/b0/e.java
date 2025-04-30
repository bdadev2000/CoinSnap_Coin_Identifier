package B0;

import y7.AbstractC2954c;

/* loaded from: classes.dex */
public final class e extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public f f257f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f259h;

    /* renamed from: i, reason: collision with root package name */
    public int f260i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, w7.f fVar2) {
        super(fVar2);
        this.f259h = fVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f258g = obj;
        this.f260i |= Integer.MIN_VALUE;
        return f.c(this.f259h, null, this);
    }
}
