package q;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import b1.f0;
import b1.z;
import e0.e0;
import e0.w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class h {
    public final z A;
    public final android.support.v4.media.session.i B;
    public final o.c C;
    public final Integer D;
    public final Drawable E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Lifecycle J;
    public r.h K;
    public r.f L;
    public Lifecycle M;
    public r.h N;
    public r.f O;

    /* renamed from: a, reason: collision with root package name */
    public final Context f31269a;

    /* renamed from: b, reason: collision with root package name */
    public c f31270b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31271c;
    public s.a d;
    public final i e;

    /* renamed from: f, reason: collision with root package name */
    public final o.c f31272f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31273g;

    /* renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f31274h;

    /* renamed from: i, reason: collision with root package name */
    public final ColorSpace f31275i;

    /* renamed from: j, reason: collision with root package name */
    public r.d f31276j;

    /* renamed from: k, reason: collision with root package name */
    public final d0.k f31277k;

    /* renamed from: l, reason: collision with root package name */
    public final h.i f31278l;

    /* renamed from: m, reason: collision with root package name */
    public final List f31279m;

    /* renamed from: n, reason: collision with root package name */
    public final u.b f31280n;

    /* renamed from: o, reason: collision with root package name */
    public final Headers.Builder f31281o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f31282p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f31283q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f31284r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f31285s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f31286t;

    /* renamed from: u, reason: collision with root package name */
    public final b f31287u;

    /* renamed from: v, reason: collision with root package name */
    public final b f31288v;
    public final b w;
    public final z x;

    /* renamed from: y, reason: collision with root package name */
    public final z f31289y;

    /* renamed from: z, reason: collision with root package name */
    public final z f31290z;

    public h(Context context) {
        this.f31269a = context;
        this.f31270b = v.f.f31377a;
        this.f31271c = null;
        this.d = null;
        this.e = null;
        this.f31272f = null;
        this.f31273g = null;
        this.f31274h = null;
        this.f31275i = null;
        this.f31276j = null;
        this.f31277k = null;
        this.f31278l = null;
        this.f31279m = w.f30218a;
        this.f31280n = null;
        this.f31281o = null;
        this.f31282p = null;
        this.f31283q = true;
        this.f31284r = null;
        this.f31285s = null;
        this.f31286t = true;
        this.f31287u = null;
        this.f31288v = null;
        this.w = null;
        this.x = null;
        this.f31289y = null;
        this.f31290z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
    }

    public final j a() {
        u.b bVar;
        r.h hVar;
        r.f fVar;
        Context context = this.f31269a;
        Object obj = this.f31271c;
        if (obj == null) {
            obj = l.f31313a;
        }
        Object obj2 = obj;
        s.a aVar = this.d;
        i iVar = this.e;
        o.c cVar = this.f31272f;
        String str = this.f31273g;
        Bitmap.Config config = this.f31274h;
        if (config == null) {
            config = this.f31270b.f31242g;
        }
        Bitmap.Config config2 = config;
        ColorSpace colorSpace = this.f31275i;
        r.d dVar = this.f31276j;
        if (dVar == null) {
            dVar = this.f31270b.f31241f;
        }
        r.d dVar2 = dVar;
        d0.k kVar = this.f31277k;
        h.i iVar2 = this.f31278l;
        List list = this.f31279m;
        u.b bVar2 = this.f31280n;
        if (bVar2 == null) {
            bVar2 = this.f31270b.e;
        }
        u.b bVar3 = bVar2;
        Headers.Builder builder = this.f31281o;
        Headers build = builder != null ? builder.build() : null;
        if (build == null) {
            build = v.g.f31380c;
        } else {
            Bitmap.Config[] configArr = v.g.f31378a;
        }
        Headers headers = build;
        LinkedHashMap linkedHashMap = this.f31282p;
        s sVar = linkedHashMap != null ? new s(f0.H(linkedHashMap)) : null;
        s sVar2 = sVar == null ? s.f31337b : sVar;
        boolean z2 = this.f31283q;
        Boolean bool = this.f31284r;
        boolean booleanValue = bool != null ? bool.booleanValue() : this.f31270b.f31243h;
        Boolean bool2 = this.f31285s;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.f31270b.f31244i;
        boolean z3 = this.f31286t;
        b bVar4 = this.f31287u;
        if (bVar4 == null) {
            bVar4 = this.f31270b.f31248m;
        }
        b bVar5 = bVar4;
        b bVar6 = this.f31288v;
        if (bVar6 == null) {
            bVar6 = this.f31270b.f31249n;
        }
        b bVar7 = bVar6;
        b bVar8 = this.w;
        if (bVar8 == null) {
            bVar8 = this.f31270b.f31250o;
        }
        b bVar9 = bVar8;
        z zVar = this.x;
        if (zVar == null) {
            zVar = this.f31270b.f31238a;
        }
        z zVar2 = zVar;
        z zVar3 = this.f31289y;
        if (zVar3 == null) {
            zVar3 = this.f31270b.f31239b;
        }
        z zVar4 = zVar3;
        z zVar5 = this.f31290z;
        if (zVar5 == null) {
            zVar5 = this.f31270b.f31240c;
        }
        z zVar6 = zVar5;
        z zVar7 = this.A;
        if (zVar7 == null) {
            zVar7 = this.f31270b.d;
        }
        z zVar8 = zVar7;
        Lifecycle lifecycle = this.J;
        Context context2 = this.f31269a;
        if (lifecycle == null && (lifecycle = this.M) == null) {
            bVar = bVar3;
            Object obj3 = context2;
            while (true) {
                if (obj3 instanceof LifecycleOwner) {
                    lifecycle = ((LifecycleOwner) obj3).getLifecycle();
                    break;
                }
                if (!(obj3 instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                obj3 = ((ContextWrapper) obj3).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = g.f31267b;
            }
        } else {
            bVar = bVar3;
        }
        Lifecycle lifecycle2 = lifecycle;
        r.h hVar2 = this.K;
        if (hVar2 == null) {
            r.h hVar3 = this.N;
            if (hVar3 == null) {
                hVar3 = new r.c(context2);
            }
            hVar = hVar3;
        } else {
            hVar = hVar2;
        }
        r.f fVar2 = this.L;
        if (fVar2 == null && (fVar2 = this.O) == null) {
            if (hVar2 instanceof r.j) {
            }
            fVar = r.f.f31347b;
        } else {
            fVar = fVar2;
        }
        android.support.v4.media.session.i iVar3 = this.B;
        o oVar = iVar3 != null ? new o(f0.H((Map) iVar3.f131b)) : null;
        return new j(context, obj2, aVar, iVar, cVar, str, config2, colorSpace, dVar2, kVar, iVar2, list, bVar, headers, sVar2, z2, booleanValue, booleanValue2, z3, bVar5, bVar7, bVar9, zVar2, zVar4, zVar6, zVar8, lifecycle2, hVar, fVar, oVar == null ? o.f31327b : oVar, this.C, this.D, this.E, this.F, this.G, this.H, this.I, new d(this.J, this.K, this.L, this.x, this.f31289y, this.f31290z, this.A, this.f31280n, this.f31276j, this.f31274h, this.f31284r, this.f31285s, this.f31287u, this.f31288v, this.w), this.f31270b);
    }

    public h(j jVar, Context context) {
        this.f31269a = context;
        this.f31270b = jVar.M;
        this.f31271c = jVar.f31292b;
        this.d = jVar.f31293c;
        this.e = jVar.d;
        this.f31272f = jVar.e;
        this.f31273g = jVar.f31294f;
        d dVar = jVar.L;
        this.f31274h = dVar.f31258j;
        this.f31275i = jVar.f31296h;
        this.f31276j = dVar.f31257i;
        this.f31277k = jVar.f31298j;
        this.f31278l = jVar.f31299k;
        this.f31279m = jVar.f31300l;
        this.f31280n = dVar.f31256h;
        this.f31281o = jVar.f31302n.newBuilder();
        this.f31282p = e0.z(jVar.f31303o.f31338a);
        this.f31283q = jVar.f31304p;
        this.f31284r = dVar.f31259k;
        this.f31285s = dVar.f31260l;
        this.f31286t = jVar.f31307s;
        this.f31287u = dVar.f31261m;
        this.f31288v = dVar.f31262n;
        this.w = dVar.f31263o;
        this.x = dVar.d;
        this.f31289y = dVar.e;
        this.f31290z = dVar.f31254f;
        this.A = dVar.f31255g;
        o oVar = jVar.D;
        oVar.getClass();
        this.B = new android.support.v4.media.session.i(oVar);
        this.C = jVar.E;
        this.D = jVar.F;
        this.E = jVar.G;
        this.F = jVar.H;
        this.G = jVar.I;
        this.H = jVar.J;
        this.I = jVar.K;
        this.J = dVar.f31251a;
        this.K = dVar.f31252b;
        this.L = dVar.f31253c;
        if (jVar.f31291a == context) {
            this.M = jVar.A;
            this.N = jVar.B;
            this.O = jVar.C;
        } else {
            this.M = null;
            this.N = null;
            this.O = null;
        }
    }
}
