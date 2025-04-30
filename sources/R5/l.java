package r5;

import y7.AbstractC2954c;

/* loaded from: classes2.dex */
public final class l extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f22878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f22879g;

    /* renamed from: h, reason: collision with root package name */
    public int f22880h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, w7.f fVar) {
        super(fVar);
        this.f22879g = nVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f22878f = obj;
        this.f22880h |= Integer.MIN_VALUE;
        return this.f22879g.c(null, null, this);
    }
}
