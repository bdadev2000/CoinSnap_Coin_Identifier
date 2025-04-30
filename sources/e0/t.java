package e0;

import y7.AbstractC2954c;

/* loaded from: classes.dex */
public final class t extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f19991f;

    /* renamed from: g, reason: collision with root package name */
    public int f19992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T7.m f19993h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(T7.m mVar, w7.f fVar) {
        super(fVar);
        this.f19993h = mVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f19991f = obj;
        this.f19992g |= Integer.MIN_VALUE;
        return this.f19993h.a(null, this);
    }
}
