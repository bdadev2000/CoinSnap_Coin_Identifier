package p5;

import y7.AbstractC2954c;

/* loaded from: classes2.dex */
public final class J extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public K f22270f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f22271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K f22272h;

    /* renamed from: i, reason: collision with root package name */
    public int f22273i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k6, w7.f fVar) {
        super(fVar);
        this.f22272h = k6;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f22271g = obj;
        this.f22273i |= Integer.MIN_VALUE;
        return K.a(this.f22272h, this);
    }
}
