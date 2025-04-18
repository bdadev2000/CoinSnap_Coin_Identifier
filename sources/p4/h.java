package p4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.m;
import com.bumptech.glide.o;
import e4.q;
import g4.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h {
    public final d4.a a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f23439b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23440c;

    /* renamed from: d, reason: collision with root package name */
    public final o f23441d;

    /* renamed from: e, reason: collision with root package name */
    public final h4.d f23442e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23443f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23444g;

    /* renamed from: h, reason: collision with root package name */
    public m f23445h;

    /* renamed from: i, reason: collision with root package name */
    public e f23446i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23447j;

    /* renamed from: k, reason: collision with root package name */
    public e f23448k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f23449l;

    /* renamed from: m, reason: collision with root package name */
    public e f23450m;

    /* renamed from: n, reason: collision with root package name */
    public int f23451n;

    /* renamed from: o, reason: collision with root package name */
    public int f23452o;

    /* renamed from: p, reason: collision with root package name */
    public int f23453p;

    public h(com.bumptech.glide.b bVar, d4.e eVar, int i10, int i11, m4.c cVar, Bitmap bitmap) {
        h4.d dVar = bVar.f9606b;
        com.bumptech.glide.g gVar = bVar.f9608d;
        o e2 = com.bumptech.glide.b.e(gVar.getBaseContext());
        o e10 = com.bumptech.glide.b.e(gVar.getBaseContext());
        e10.getClass();
        m s5 = new m(e10.f9752b, e10, Bitmap.class, e10.f9753c).s(o.f9751m).s(((s4.f) ((s4.f) ((s4.f) new s4.f().d(p.a)).q()).m()).g(i10, i11));
        this.f23440c = new ArrayList();
        this.f23441d = e2;
        Handler handler = new Handler(Looper.getMainLooper(), new g(this, 0));
        this.f23442e = dVar;
        this.f23439b = handler;
        this.f23445h = s5;
        this.a = eVar;
        c(cVar, bitmap);
    }

    public final void a() {
        int i10;
        int i11;
        if (this.f23443f && !this.f23444g) {
            e eVar = this.f23450m;
            if (eVar != null) {
                this.f23450m = null;
                b(eVar);
                return;
            }
            this.f23444g = true;
            d4.a aVar = this.a;
            d4.e eVar2 = (d4.e) aVar;
            d4.c cVar = eVar2.f16847l;
            int i12 = cVar.f16825c;
            if (i12 > 0 && (i11 = eVar2.f16846k) >= 0) {
                if (i11 >= 0 && i11 < i12) {
                    i10 = ((d4.b) cVar.f16827e.get(i11)).f16821i;
                } else {
                    i10 = -1;
                }
            } else {
                i10 = 0;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i10;
            int i13 = (eVar2.f16846k + 1) % eVar2.f16847l.f16825c;
            eVar2.f16846k = i13;
            this.f23448k = new e(this.f23439b, i13, uptimeMillis);
            m y4 = this.f23445h.s((s4.f) new s4.f().l(new v4.d(Double.valueOf(Math.random())))).y(aVar);
            y4.w(this.f23448k, y4);
        }
    }

    public final void b(e eVar) {
        int i10;
        this.f23444g = false;
        boolean z10 = this.f23447j;
        Handler handler = this.f23439b;
        if (z10) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f23443f) {
            this.f23450m = eVar;
            return;
        }
        if (eVar.f23436i != null) {
            Bitmap bitmap = this.f23449l;
            if (bitmap != null) {
                this.f23442e.a(bitmap);
                this.f23449l = null;
            }
            e eVar2 = this.f23446i;
            this.f23446i = eVar;
            ArrayList arrayList = this.f23440c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    e eVar3 = cVar.f23419b.a.f23446i;
                    if (eVar3 != null) {
                        i10 = eVar3.f23434g;
                    } else {
                        i10 = -1;
                    }
                    if (i10 == ((d4.e) r6.a).f16847l.f16825c - 1) {
                        cVar.f23424h++;
                    }
                    int i11 = cVar.f23425i;
                    if (i11 != -1 && cVar.f23424h >= i11) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(q qVar, Bitmap bitmap) {
        com.bumptech.glide.c.l(qVar);
        com.bumptech.glide.c.l(bitmap);
        this.f23449l = bitmap;
        this.f23445h = this.f23445h.s(new s4.f().o(qVar, true));
        this.f23451n = w4.m.c(bitmap);
        this.f23452o = bitmap.getWidth();
        this.f23453p = bitmap.getHeight();
    }
}
