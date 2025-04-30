package T7;

import y7.AbstractC2954c;

/* loaded from: classes3.dex */
public final class i extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public j f3055f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3056g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3057h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f3058i;

    /* renamed from: j, reason: collision with root package name */
    public int f3059j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, w7.f fVar) {
        super(fVar);
        this.f3058i = jVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f3057h = obj;
        this.f3059j |= Integer.MIN_VALUE;
        return this.f3058i.a(null, this);
    }
}
