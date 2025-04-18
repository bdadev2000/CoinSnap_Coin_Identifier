package f;

import android.graphics.Bitmap;
import q.p;

/* loaded from: classes.dex */
public final class l extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public o f30396a;

    /* renamed from: b, reason: collision with root package name */
    public p f30397b;

    /* renamed from: c, reason: collision with root package name */
    public q.j f30398c;
    public e d;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f30399f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f30400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f30401h;

    /* renamed from: i, reason: collision with root package name */
    public int f30402i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, h0.g gVar) {
        super(gVar);
        this.f30401h = oVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30400g = obj;
        this.f30402i |= Integer.MIN_VALUE;
        return o.a(this.f30401h, null, 0, this);
    }
}
