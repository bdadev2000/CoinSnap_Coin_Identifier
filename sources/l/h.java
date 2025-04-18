package l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b1.d0;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.q;
import q.n;
import q0.p;

/* loaded from: classes4.dex */
public final class h extends j0.i implements p {

    /* renamed from: a, reason: collision with root package name */
    public List f30987a;

    /* renamed from: b, reason: collision with root package name */
    public n f30988b;

    /* renamed from: c, reason: collision with root package name */
    public int f30989c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f30990f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f30991g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f30992h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f30993i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f30994j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f30995k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f.e f30996l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q.j f30997m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, a aVar, n nVar, List list, f.e eVar, q.j jVar, h0.g gVar) {
        super(2, gVar);
        this.f30992h = iVar;
        this.f30993i = aVar;
        this.f30994j = nVar;
        this.f30995k = list;
        this.f30996l = eVar;
        this.f30997m = jVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        h hVar = new h(this.f30992h, this.f30993i, this.f30994j, this.f30995k, this.f30996l, this.f30997m, gVar);
        hVar.f30991g = obj;
        return hVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        n nVar;
        Bitmap I;
        List list;
        int size;
        int i2;
        i0.a aVar = i0.a.f30806a;
        int i3 = this.f30990f;
        f.e eVar = this.f30996l;
        a aVar2 = this.f30993i;
        if (i3 == 0) {
            q.m(obj);
            d0Var = (d0) this.f30991g;
            Drawable drawable = aVar2.f30937a;
            this.f30992h.getClass();
            boolean z2 = drawable instanceof BitmapDrawable;
            nVar = this.f30994j;
            if (z2) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (e0.q.N(v.g.f31378a, config)) {
                    I = bitmap;
                    eVar.getClass();
                    list = this.f30995k;
                    size = list.size();
                    i2 = 0;
                }
            }
            I = p0.a.I(drawable, nVar.f31315b, nVar.d, nVar.e, nVar.f31317f);
            eVar.getClass();
            list = this.f30995k;
            size = list.size();
            i2 = 0;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.d;
            int i4 = this.f30989c;
            nVar = this.f30988b;
            list = this.f30987a;
            d0Var = (d0) this.f30991g;
            q.m(obj);
            I = (Bitmap) obj;
            kotlin.jvm.internal.e.l(d0Var.getCoroutineContext());
            i2 = i4 + 1;
        }
        if (i2 >= size) {
            eVar.getClass();
            return new a(new BitmapDrawable(this.f30997m.f31291a.getResources(), I), aVar2.f30938b, aVar2.f30939c, aVar2.d);
        }
        android.support.v4.media.d.C(list.get(i2));
        r.g gVar = nVar.d;
        this.f30991g = d0Var;
        this.f30987a = list;
        this.f30988b = nVar;
        this.f30989c = i2;
        this.d = size;
        this.f30990f = 1;
        throw null;
    }
}
