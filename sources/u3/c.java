package u3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m3.a0;
import m3.x;
import p3.t;

/* loaded from: classes.dex */
public final class c extends b {
    public p3.d C;
    public final ArrayList D;
    public final RectF E;
    public final RectF F;
    public final Paint G;
    public float H;
    public boolean I;

    public c(x xVar, e eVar, List list, m3.j jVar) {
        super(xVar, eVar);
        int i10;
        b bVar;
        b cVar;
        this.D = new ArrayList();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Paint();
        this.I = true;
        s3.a aVar = eVar.f25520s;
        if (aVar != null) {
            p3.d a = aVar.a();
            this.C = a;
            f(a);
            this.C.a(this);
        } else {
            this.C = null;
        }
        r.e eVar2 = new r.e(jVar.f21559j.size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar3 = (e) list.get(size);
            int b3 = t.h.b(eVar3.f25506e);
            if (b3 != 0) {
                if (b3 != 1) {
                    if (b3 != 2) {
                        if (b3 != 3) {
                            if (b3 != 4) {
                                if (b3 != 5) {
                                    y3.b.b("Unknown layer type ".concat(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.B(eVar3.f25506e)));
                                    cVar = null;
                                } else {
                                    cVar = new k(xVar, eVar3);
                                }
                            } else {
                                cVar = new g(jVar, xVar, this, eVar3);
                            }
                        } else {
                            cVar = new f(xVar, eVar3);
                        }
                    } else {
                        cVar = new d(xVar, eVar3);
                    }
                } else {
                    cVar = new h(xVar, eVar3);
                }
            } else {
                cVar = new c(xVar, eVar3, (List) jVar.f21552c.get(eVar3.f25508g), jVar);
            }
            if (cVar != null) {
                eVar2.f(cVar.f25493p.f25505d, cVar);
                if (bVar2 != null) {
                    bVar2.f25496s = cVar;
                    bVar2 = null;
                } else {
                    this.D.add(0, cVar);
                    int b10 = t.h.b(eVar3.u);
                    if (b10 == 1 || b10 == 2) {
                        bVar2 = cVar;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < eVar2.h(); i10++) {
            b bVar3 = (b) eVar2.d(eVar2.e(i10), null);
            if (bVar3 != null && (bVar = (b) eVar2.d(bVar3.f25493p.f25507f, null)) != null) {
                bVar3.f25497t = bVar;
            }
        }
    }

    @Override // u3.b, r3.f
    public final void d(h.c cVar, Object obj) {
        super.d(cVar, obj);
        if (obj == a0.E) {
            if (cVar == null) {
                p3.d dVar = this.C;
                if (dVar != null) {
                    dVar.k(null);
                    return;
                }
                return;
            }
            t tVar = new t(cVar, null);
            this.C = tVar;
            tVar.a(this);
            f(this.C);
        }
    }

    @Override // u3.b, o3.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).e(rectF2, this.f25491n, true);
            rectF.union(rectF2);
        }
    }

    @Override // u3.b
    public final void j(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        RectF rectF = this.F;
        e eVar = this.f25493p;
        rectF.set(0.0f, 0.0f, eVar.f25516o, eVar.f25517p);
        matrix.mapRect(rectF);
        boolean z13 = this.f25492o.u;
        ArrayList arrayList = this.D;
        if (z13 && arrayList.size() > 1 && i10 != 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Paint paint = this.G;
            paint.setAlpha(i10);
            y3.g gVar = y3.h.a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.I && "__container".equals(eVar.f25504c)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !rectF.isEmpty()) {
                z12 = canvas.clipRect(rectF);
            } else {
                z12 = true;
            }
            if (z12) {
                ((b) arrayList.get(size)).g(canvas, matrix, i10);
            }
        }
        canvas.restore();
    }

    @Override // u3.b
    public final void o(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.D;
            if (i11 < arrayList2.size()) {
                ((b) arrayList2.get(i11)).c(eVar, i10, arrayList, eVar2);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // u3.b
    public final void p(boolean z10) {
        super.p(z10);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((b) it.next()).p(z10);
        }
    }

    @Override // u3.b
    public final void q(float f10) {
        this.H = f10;
        super.q(f10);
        p3.d dVar = this.C;
        e eVar = this.f25493p;
        if (dVar != null) {
            m3.j jVar = this.f25492o.f21592b;
            f10 = ((((Float) dVar.f()).floatValue() * eVar.f25503b.f21563n) - eVar.f25503b.f21561l) / ((jVar.f21562m - jVar.f21561l) + 0.01f);
        }
        if (this.C == null) {
            m3.j jVar2 = eVar.f25503b;
            f10 -= eVar.f25515n / (jVar2.f21562m - jVar2.f21561l);
        }
        if (eVar.f25514m != 0.0f && !"__container".equals(eVar.f25504c)) {
            f10 /= eVar.f25514m;
        }
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((b) arrayList.get(size)).q(f10);
            } else {
                return;
            }
        }
    }
}
