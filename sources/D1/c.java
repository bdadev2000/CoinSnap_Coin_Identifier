package D1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v1.v;
import v1.y;
import y1.r;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: C, reason: collision with root package name */
    public y1.e f664C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f665D;

    /* renamed from: E, reason: collision with root package name */
    public final RectF f666E;

    /* renamed from: F, reason: collision with root package name */
    public final RectF f667F;

    /* renamed from: G, reason: collision with root package name */
    public final Paint f668G;

    /* renamed from: H, reason: collision with root package name */
    public float f669H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f670I;

    public c(v vVar, e eVar, List list, v1.i iVar) {
        super(vVar, eVar);
        b bVar;
        b cVar;
        String str;
        this.f665D = new ArrayList();
        this.f666E = new RectF();
        this.f667F = new RectF();
        this.f668G = new Paint();
        this.f670I = true;
        B1.b bVar2 = eVar.f692s;
        if (bVar2 != null) {
            y1.e g9 = bVar2.g();
            this.f664C = g9;
            d(g9);
            this.f664C.a(this);
        } else {
            this.f664C = null;
        }
        x.f fVar = new x.f(iVar.f23492j.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size >= 0) {
                e eVar2 = (e) list.get(size);
                int d2 = AbstractC2965e.d(eVar2.f680e);
                if (d2 != 0) {
                    if (d2 != 1) {
                        if (d2 != 2) {
                            if (d2 != 3) {
                                if (d2 != 4) {
                                    if (d2 != 5) {
                                        switch (eVar2.f680e) {
                                            case 1:
                                                str = "PRE_COMP";
                                                break;
                                            case 2:
                                                str = "SOLID";
                                                break;
                                            case 3:
                                                str = "IMAGE";
                                                break;
                                            case 4:
                                                str = "NULL";
                                                break;
                                            case 5:
                                                str = "SHAPE";
                                                break;
                                            case 6:
                                                str = "TEXT";
                                                break;
                                            case 7:
                                                str = "UNKNOWN";
                                                break;
                                            default:
                                                str = "null";
                                                break;
                                        }
                                        H1.c.b("Unknown layer type ".concat(str));
                                        cVar = null;
                                    } else {
                                        cVar = new k(vVar, eVar2);
                                    }
                                } else {
                                    cVar = new g(vVar, eVar2, this, iVar);
                                }
                            } else {
                                cVar = new b(vVar, eVar2);
                            }
                        } else {
                            cVar = new d(vVar, eVar2);
                        }
                    } else {
                        cVar = new h(vVar, eVar2);
                    }
                } else {
                    cVar = new c(vVar, eVar2, (List) iVar.f23485c.get(eVar2.f682g), iVar);
                }
                if (cVar != null) {
                    fVar.f(cVar.f653p.f679d, cVar);
                    if (bVar3 != null) {
                        bVar3.f656s = cVar;
                        bVar3 = null;
                    } else {
                        this.f665D.add(0, cVar);
                        int d9 = AbstractC2965e.d(eVar2.f694u);
                        if (d9 == 1 || d9 == 2) {
                            bVar3 = cVar;
                        }
                    }
                }
                size--;
            } else {
                for (int i9 = 0; i9 < fVar.h(); i9++) {
                    b bVar4 = (b) fVar.d(null, fVar.e(i9));
                    if (bVar4 != null && (bVar = (b) fVar.d(null, bVar4.f653p.f681f)) != null) {
                        bVar4.f657t = bVar;
                    }
                }
                return;
            }
        }
    }

    @Override // D1.b, x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        super.c(rectF, matrix, z8);
        ArrayList arrayList = this.f665D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f666E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).c(rectF2, this.f651n, true);
            rectF.union(rectF2);
        }
    }

    @Override // D1.b, A1.f
    public final void g(E1.d dVar, Object obj) {
        super.g(dVar, obj);
        if (obj == y.f23600z) {
            if (dVar == null) {
                y1.e eVar = this.f664C;
                if (eVar != null) {
                    eVar.j(null);
                    return;
                }
                return;
            }
            r rVar = new r(dVar, null);
            this.f664C = rVar;
            rVar.a(this);
            d(this.f664C);
        }
    }

    @Override // D1.b
    public final void k(Canvas canvas, Matrix matrix, int i9) {
        boolean z8;
        boolean clipRect;
        RectF rectF = this.f667F;
        e eVar = this.f653p;
        rectF.set(0.0f, 0.0f, eVar.f688o, eVar.f689p);
        matrix.mapRect(rectF);
        boolean z9 = this.f652o.f23556u;
        ArrayList arrayList = this.f665D;
        if (z9 && arrayList.size() > 1 && i9 != 255) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            Paint paint = this.f668G;
            paint.setAlpha(i9);
            H1.h hVar = H1.i.f1367a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z8) {
            i9 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if ((this.f670I || !"__container".equals(eVar.f678c)) && !rectF.isEmpty()) {
                clipRect = canvas.clipRect(rectF);
            } else {
                clipRect = true;
            }
            if (clipRect) {
                ((b) arrayList.get(size)).e(canvas, matrix, i9);
            }
        }
        canvas.restore();
    }

    @Override // D1.b
    public final void q(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f665D;
            if (i10 < arrayList2.size()) {
                ((b) arrayList2.get(i10)).h(eVar, i9, arrayList, eVar2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // D1.b
    public final void r(boolean z8) {
        super.r(z8);
        Iterator it = this.f665D.iterator();
        while (it.hasNext()) {
            ((b) it.next()).r(z8);
        }
    }

    @Override // D1.b
    public final void s(float f9) {
        this.f669H = f9;
        super.s(f9);
        y1.e eVar = this.f664C;
        e eVar2 = this.f653p;
        if (eVar != null) {
            v1.i iVar = this.f652o.b;
            f9 = ((((Float) eVar.e()).floatValue() * eVar2.b.f23494n) - eVar2.b.l) / ((iVar.m - iVar.l) + 0.01f);
        }
        if (this.f664C == null) {
            v1.i iVar2 = eVar2.b;
            f9 -= eVar2.f687n / (iVar2.m - iVar2.l);
        }
        if (eVar2.m != 0.0f && !"__container".equals(eVar2.f678c)) {
            f9 /= eVar2.m;
        }
        ArrayList arrayList = this.f665D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).s(f9);
        }
    }
}
