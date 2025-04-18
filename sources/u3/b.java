package u3;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m3.e0;
import m3.x;
import p3.l;
import p3.s;

/* loaded from: classes.dex */
public abstract class b implements o3.f, p3.a, r3.f {
    public float A;
    public BlurMaskFilter B;
    public final Path a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f25479b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f25480c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final n3.a f25481d = new n3.a(1);

    /* renamed from: e, reason: collision with root package name */
    public final n3.a f25482e = new n3.a(PorterDuff.Mode.DST_IN, 0);

    /* renamed from: f, reason: collision with root package name */
    public final n3.a f25483f = new n3.a(PorterDuff.Mode.DST_OUT, 0);

    /* renamed from: g, reason: collision with root package name */
    public final n3.a f25484g;

    /* renamed from: h, reason: collision with root package name */
    public final n3.a f25485h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f25486i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f25487j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f25488k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f25489l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f25490m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f25491n;

    /* renamed from: o, reason: collision with root package name */
    public final x f25492o;

    /* renamed from: p, reason: collision with root package name */
    public final e f25493p;

    /* renamed from: q, reason: collision with root package name */
    public final l f25494q;

    /* renamed from: r, reason: collision with root package name */
    public p3.h f25495r;

    /* renamed from: s, reason: collision with root package name */
    public b f25496s;

    /* renamed from: t, reason: collision with root package name */
    public b f25497t;
    public List u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f25498v;

    /* renamed from: w, reason: collision with root package name */
    public final s f25499w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25500x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f25501y;

    /* renamed from: z, reason: collision with root package name */
    public n3.a f25502z;

    public b(x xVar, e eVar) {
        n3.a aVar = new n3.a(1);
        this.f25484g = aVar;
        this.f25485h = new n3.a(PorterDuff.Mode.CLEAR);
        this.f25486i = new RectF();
        this.f25487j = new RectF();
        this.f25488k = new RectF();
        this.f25489l = new RectF();
        this.f25490m = new RectF();
        this.f25491n = new Matrix();
        this.f25498v = new ArrayList();
        this.f25500x = true;
        this.A = 0.0f;
        this.f25492o = xVar;
        this.f25493p = eVar;
        if (eVar.u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        s3.c cVar = eVar.f25510i;
        cVar.getClass();
        s sVar = new s(cVar);
        this.f25499w = sVar;
        sVar.b(this);
        List list = eVar.f25509h;
        if (list != null && !list.isEmpty()) {
            l lVar = new l(list);
            this.f25494q = lVar;
            Iterator it = lVar.a.iterator();
            while (it.hasNext()) {
                ((p3.d) it.next()).a(this);
            }
            for (p3.d dVar : this.f25494q.f23376b) {
                f(dVar);
                dVar.a(this);
            }
        }
        e eVar2 = this.f25493p;
        if (!eVar2.f25521t.isEmpty()) {
            p3.h hVar = new p3.h(eVar2.f25521t);
            this.f25495r = hVar;
            hVar.f23360b = true;
            hVar.a(new p3.a() { // from class: u3.a
                @Override // p3.a
                public final void a() {
                    boolean z10;
                    b bVar = b.this;
                    if (bVar.f25495r.l() == 1.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != bVar.f25500x) {
                        bVar.f25500x = z10;
                        bVar.f25492o.invalidateSelf();
                    }
                }
            });
            boolean z10 = ((Float) this.f25495r.f()).floatValue() == 1.0f;
            if (z10 != this.f25500x) {
                this.f25500x = z10;
                this.f25492o.invalidateSelf();
            }
            f(this.f25495r);
            return;
        }
        if (true != this.f25500x) {
            this.f25500x = true;
            this.f25492o.invalidateSelf();
        }
    }

    @Override // p3.a
    public final void a() {
        this.f25492o.invalidateSelf();
    }

    @Override // o3.d
    public final void b(List list, List list2) {
    }

    @Override // r3.f
    public final void c(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        b bVar = this.f25496s;
        e eVar3 = this.f25493p;
        if (bVar != null) {
            String str = bVar.f25493p.f25504c;
            eVar2.getClass();
            r3.e eVar4 = new r3.e(eVar2);
            eVar4.a.add(str);
            if (eVar.a(i10, this.f25496s.f25493p.f25504c)) {
                b bVar2 = this.f25496s;
                r3.e eVar5 = new r3.e(eVar4);
                eVar5.f23991b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.d(i10, eVar3.f25504c)) {
                this.f25496s.o(eVar, eVar.b(i10, this.f25496s.f25493p.f25504c) + i10, arrayList, eVar4);
            }
        }
        if (!eVar.c(i10, eVar3.f25504c)) {
            return;
        }
        String str2 = eVar3.f25504c;
        if (!"__container".equals(str2)) {
            eVar2.getClass();
            r3.e eVar6 = new r3.e(eVar2);
            eVar6.a.add(str2);
            if (eVar.a(i10, str2)) {
                r3.e eVar7 = new r3.e(eVar6);
                eVar7.f23991b = this;
                arrayList.add(eVar7);
            }
            eVar2 = eVar6;
        }
        if (eVar.d(i10, str2)) {
            o(eVar, eVar.b(i10, str2) + i10, arrayList, eVar2);
        }
    }

    @Override // r3.f
    public void d(h.c cVar, Object obj) {
        this.f25499w.c(cVar, obj);
    }

    @Override // o3.f
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f25486i.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.f25491n;
        matrix2.set(matrix);
        if (z10) {
            List list = this.u;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((b) this.u.get(size)).f25499w.d());
                    }
                }
            } else {
                b bVar = this.f25497t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f25499w.d());
                }
            }
        }
        matrix2.preConcat(this.f25499w.d());
    }

    public final void f(p3.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f25498v.add(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0219  */
    @Override // o3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.b.g(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // o3.d
    public final String getName() {
        return this.f25493p.f25504c;
    }

    public final void h() {
        if (this.u != null) {
            return;
        }
        if (this.f25497t == null) {
            this.u = Collections.emptyList();
            return;
        }
        this.u = new ArrayList();
        for (b bVar = this.f25497t; bVar != null; bVar = bVar.f25497t) {
            this.u.add(bVar);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.f25486i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f25485h);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i10);

    public v3.c k() {
        return this.f25493p.f25523w;
    }

    public w3.h l() {
        return this.f25493p.f25524x;
    }

    public final void m() {
        e0 e0Var = this.f25492o.f21592b.a;
        String str = this.f25493p.f25504c;
        if (e0Var.a) {
            HashMap hashMap = e0Var.f21529c;
            y3.e eVar = (y3.e) hashMap.get(str);
            if (eVar == null) {
                eVar = new y3.e();
                hashMap.put(str, eVar);
            }
            int i10 = eVar.a + 1;
            eVar.a = i10;
            if (i10 == Integer.MAX_VALUE) {
                eVar.a = i10 / 2;
            }
            if (str.equals("__container")) {
                Iterator it = e0Var.f21528b.iterator();
                if (it.hasNext()) {
                    a4.j.t(it.next());
                    throw null;
                }
            }
        }
    }

    public final void n(p3.d dVar) {
        this.f25498v.remove(dVar);
    }

    public void o(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
    }

    public void p(boolean z10) {
        if (z10 && this.f25502z == null) {
            this.f25502z = new n3.a();
        }
        this.f25501y = z10;
    }

    public void q(float f10) {
        s sVar = this.f25499w;
        p3.d dVar = sVar.f23406j;
        if (dVar != null) {
            dVar.j(f10);
        }
        p3.d dVar2 = sVar.f23409m;
        if (dVar2 != null) {
            dVar2.j(f10);
        }
        p3.d dVar3 = sVar.f23410n;
        if (dVar3 != null) {
            dVar3.j(f10);
        }
        p3.d dVar4 = sVar.f23402f;
        if (dVar4 != null) {
            dVar4.j(f10);
        }
        p3.d dVar5 = sVar.f23403g;
        if (dVar5 != null) {
            dVar5.j(f10);
        }
        p3.d dVar6 = sVar.f23404h;
        if (dVar6 != null) {
            dVar6.j(f10);
        }
        p3.d dVar7 = sVar.f23405i;
        if (dVar7 != null) {
            dVar7.j(f10);
        }
        p3.h hVar = sVar.f23407k;
        if (hVar != null) {
            hVar.j(f10);
        }
        p3.h hVar2 = sVar.f23408l;
        if (hVar2 != null) {
            hVar2.j(f10);
        }
        l lVar = this.f25494q;
        if (lVar != null) {
            int i10 = 0;
            while (true) {
                List list = lVar.a;
                if (i10 >= list.size()) {
                    break;
                }
                ((p3.d) list.get(i10)).j(f10);
                i10++;
            }
        }
        p3.h hVar3 = this.f25495r;
        if (hVar3 != null) {
            hVar3.j(f10);
        }
        b bVar = this.f25496s;
        if (bVar != null) {
            bVar.q(f10);
        }
        ArrayList arrayList = this.f25498v;
        arrayList.size();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((p3.d) arrayList.get(i11)).j(f10);
        }
        arrayList.size();
    }
}
