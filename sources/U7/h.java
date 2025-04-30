package U7;

import y7.AbstractC2954c;

/* loaded from: classes3.dex */
public final class h extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public i f3360f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3361g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3362h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f3363i;

    /* renamed from: j, reason: collision with root package name */
    public int f3364j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, w7.f fVar) {
        super(fVar);
        this.f3363i = iVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f3362h = obj;
        this.f3364j |= Integer.MIN_VALUE;
        return this.f3363i.a(null, this);
    }
}
