package f;

import android.graphics.Bitmap;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.q;
import q0.p;

/* loaded from: classes.dex */
public final class m extends j0.i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q.j f30404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f30405c;
    public final /* synthetic */ r.g d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f30406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bitmap f30407g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q.j jVar, o oVar, r.g gVar, e eVar, Bitmap bitmap, h0.g gVar2) {
        super(2, gVar2);
        this.f30404b = jVar;
        this.f30405c = oVar;
        this.d = gVar;
        this.f30406f = eVar;
        this.f30407g = bitmap;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new m(this.f30404b, this.f30405c, this.d, this.f30406f, this.f30407g, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30403a;
        if (i2 == 0) {
            q.m(obj);
            q.j jVar = this.f30404b;
            l.l lVar = new l.l(jVar, this.f30405c.f30413g, 0, jVar, this.d, this.f30406f, this.f30407g != null);
            this.f30403a = 1;
            obj = lVar.b(jVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}
