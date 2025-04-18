package nd;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import qc.s0;
import wh.a0;

/* loaded from: classes4.dex */
public final class h implements d, wd.d {

    /* renamed from: g, reason: collision with root package name */
    public static h f22737g;

    /* renamed from: h, reason: collision with root package name */
    public static h f22738h;
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public float f22739b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22740c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22741d;

    /* renamed from: e, reason: collision with root package name */
    public md.a f22742e;

    /* renamed from: f, reason: collision with root package name */
    public Object f22743f;

    public /* synthetic */ h(int i10, a0 a0Var, s0 s0Var) {
        this.a = i10;
        this.f22740c = a0Var;
        this.f22741d = s0Var;
    }

    public static h d() {
        if (f22737g == null) {
            int i10 = 0;
            f22737g = new h(i10, new a0(15), new s0(14));
        }
        return f22737g;
    }

    public static h e() {
        if (f22738h == null) {
            int i10 = 1;
            f22738h = new h(i10, new a0(17), new s0(16));
        }
        return f22738h;
    }

    public final void a(float f10) {
        switch (this.a) {
            case 0:
                this.f22739b = f10;
                if (((c) this.f22743f) == null) {
                    this.f22743f = c.f22727c;
                }
                Iterator it = ((c) this.f22743f).a().iterator();
                while (it.hasNext()) {
                    pd.a aVar = ((kd.i) it.next()).f20672e;
                    b6.b.f2297i.a(aVar.f(), "setDeviceVolume", Float.valueOf(f10), aVar.a);
                }
                return;
            default:
                this.f22739b = f10;
                if (((wd.c) this.f22743f) == null) {
                    this.f22743f = wd.c.f26969c;
                }
                Iterator it2 = ((wd.c) this.f22743f).a().iterator();
                while (it2.hasNext()) {
                    yd.a aVar2 = ((vd.i) it2.next()).f26513e;
                    ka.e.f20531c.a(aVar2.e(), "setDeviceVolume", Float.valueOf(f10), aVar2.a);
                }
                return;
        }
    }

    public final void b(Context context) {
        int i10 = this.a;
        Object obj = this.f22740c;
        Object obj2 = this.f22741d;
        switch (i10) {
            case 0:
                ((s0) obj2).getClass();
                a0 a0Var = new a0(14);
                Handler handler = new Handler();
                ((a0) obj).getClass();
                this.f22742e = new md.a(handler, context, a0Var, this);
                return;
            default:
                ((s0) obj2).getClass();
                a0 a0Var2 = new a0(16);
                Handler handler2 = new Handler();
                ((a0) obj).getClass();
                this.f22742e = new md.a(handler2, context, a0Var2, this, 0);
                return;
        }
    }

    public final float c() {
        switch (this.a) {
            case 0:
                return this.f22739b;
            default:
                return this.f22739b;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                b bVar = b.f22726g;
                bVar.f22732f = this;
                bVar.g();
                rd.a.f24088g.getClass();
                rd.a.c();
                this.f22742e.d();
                return;
            default:
                wd.b bVar2 = wd.b.f26968g;
                bVar2.f22732f = this;
                bVar2.g();
                ae.a.f464g.getClass();
                ae.a.c();
                this.f22742e.d();
                return;
        }
    }

    public final void g() {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                rd.a aVar = rd.a.f24088g;
                aVar.getClass();
                Handler handler = rd.a.f24090i;
                if (handler != null) {
                    handler.removeCallbacks(rd.a.f24092k);
                    rd.a.f24090i = null;
                }
                aVar.a.clear();
                rd.a.f24089h.post(new androidx.activity.i(aVar, 25));
                b bVar = b.f22726g;
                switch (z10) {
                    case false:
                        bVar.f22730c = false;
                        bVar.f22732f = null;
                        break;
                    default:
                        bVar.f22730c = false;
                        bVar.f22732f = null;
                        break;
                }
                this.f22742e.e();
                return;
            default:
                ae.a aVar2 = ae.a.f464g;
                aVar2.getClass();
                Handler handler2 = ae.a.f466i;
                if (handler2 != null) {
                    handler2.removeCallbacks(ae.a.f468k);
                    ae.a.f466i = null;
                }
                aVar2.a.clear();
                ae.a.f465h.post(new androidx.activity.i(aVar2, 26));
                wd.b bVar2 = wd.b.f26968g;
                switch (1) {
                    case 0:
                        bVar2.f22730c = false;
                        bVar2.f22732f = null;
                        break;
                    default:
                        bVar2.f22730c = false;
                        bVar2.f22732f = null;
                        break;
                }
                this.f22742e.e();
                return;
        }
    }

    @Override // nd.d
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    rd.a.f24088g.getClass();
                    rd.a.c();
                    return;
                }
                rd.a.f24088g.getClass();
                Handler handler = rd.a.f24090i;
                if (handler != null) {
                    handler.removeCallbacks(rd.a.f24092k);
                    rd.a.f24090i = null;
                    return;
                }
                return;
            default:
                if (z10) {
                    ae.a.f464g.getClass();
                    ae.a.c();
                    return;
                }
                ae.a.f464g.getClass();
                Handler handler2 = ae.a.f466i;
                if (handler2 != null) {
                    handler2.removeCallbacks(ae.a.f468k);
                    ae.a.f466i = null;
                    return;
                }
                return;
        }
    }
}
