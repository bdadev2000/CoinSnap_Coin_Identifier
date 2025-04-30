package D1;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import v1.C2837C;
import v1.v;
import y1.InterfaceC2942a;
import y1.n;
import y1.q;

/* loaded from: classes.dex */
public abstract class b implements x1.e, InterfaceC2942a, A1.f {

    /* renamed from: A, reason: collision with root package name */
    public float f639A;

    /* renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f640B;

    /* renamed from: a, reason: collision with root package name */
    public final Path f641a = new Path();
    public final Matrix b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f642c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final i f643d = new i(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final i f644e;

    /* renamed from: f, reason: collision with root package name */
    public final i f645f;

    /* renamed from: g, reason: collision with root package name */
    public final i f646g;

    /* renamed from: h, reason: collision with root package name */
    public final i f647h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f648i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f649j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f650k;
    public final RectF l;
    public final RectF m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f651n;

    /* renamed from: o, reason: collision with root package name */
    public final v f652o;

    /* renamed from: p, reason: collision with root package name */
    public final e f653p;

    /* renamed from: q, reason: collision with root package name */
    public final l5.k f654q;

    /* renamed from: r, reason: collision with root package name */
    public final y1.i f655r;

    /* renamed from: s, reason: collision with root package name */
    public b f656s;

    /* renamed from: t, reason: collision with root package name */
    public b f657t;

    /* renamed from: u, reason: collision with root package name */
    public List f658u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f659v;

    /* renamed from: w, reason: collision with root package name */
    public final q f660w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f661x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f662y;

    /* renamed from: z, reason: collision with root package name */
    public i f663z;

    /* JADX WARN: Type inference failed for: r9v3, types: [y1.i, y1.e] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l5.k, java.lang.Object] */
    public b(v vVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f644e = new i(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f645f = new i(mode2);
        i iVar = new i(1, 2);
        this.f646g = iVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        i iVar2 = new i();
        iVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f647h = iVar2;
        this.f648i = new RectF();
        this.f649j = new RectF();
        this.f650k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.f651n = new Matrix();
        this.f659v = new ArrayList();
        this.f661x = true;
        this.f639A = 0.0f;
        this.f652o = vVar;
        this.f653p = eVar;
        if (eVar.f694u == 3) {
            iVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            iVar.setXfermode(new PorterDuffXfermode(mode));
        }
        B1.d dVar = eVar.f684i;
        dVar.getClass();
        q qVar = new q(dVar);
        this.f660w = qVar;
        qVar.b(this);
        List list = eVar.f683h;
        if (list != null && !list.isEmpty()) {
            ?? obj = new Object();
            obj.f21619a = list;
            obj.b = new ArrayList(list.size());
            obj.f21620c = new ArrayList(list.size());
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((ArrayList) obj.b).add(new n((List) ((C1.f) list.get(i9)).b.f273c));
                ((ArrayList) obj.f21620c).add(((C1.f) list.get(i9)).f444c.g());
            }
            this.f654q = obj;
            Iterator it = ((ArrayList) obj.b).iterator();
            while (it.hasNext()) {
                ((y1.e) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.f654q.f21620c).iterator();
            while (it2.hasNext()) {
                y1.e eVar2 = (y1.e) it2.next();
                d(eVar2);
                eVar2.a(this);
            }
        }
        e eVar3 = this.f653p;
        if (!eVar3.f693t.isEmpty()) {
            ?? eVar4 = new y1.e(eVar3.f693t);
            this.f655r = eVar4;
            eVar4.b = true;
            eVar4.a(new InterfaceC2942a() { // from class: D1.a
                @Override // y1.InterfaceC2942a
                public final void a() {
                    boolean z8;
                    b bVar = b.this;
                    if (bVar.f655r.k() == 1.0f) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8 != bVar.f661x) {
                        bVar.f661x = z8;
                        bVar.f652o.invalidateSelf();
                    }
                }
            });
            boolean z8 = ((Float) this.f655r.e()).floatValue() == 1.0f;
            if (z8 != this.f661x) {
                this.f661x = z8;
                this.f652o.invalidateSelf();
            }
            d(this.f655r);
            return;
        }
        if (true != this.f661x) {
            this.f661x = true;
            this.f652o.invalidateSelf();
        }
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f652o.invalidateSelf();
    }

    @Override // x1.e
    public void c(RectF rectF, Matrix matrix, boolean z8) {
        this.f648i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f651n;
        matrix2.set(matrix);
        if (z8) {
            List list = this.f658u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f658u.get(size)).f660w.e());
                }
            } else {
                b bVar = this.f657t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f660w.e());
                }
            }
        }
        matrix2.preConcat(this.f660w.e());
    }

    public final void d(y1.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f659v.add(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0109  */
    @Override // x1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.b.e(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // A1.f
    public void g(E1.d dVar, Object obj) {
        this.f660w.c(dVar, obj);
    }

    @Override // x1.c
    public final String getName() {
        return this.f653p.f678c;
    }

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        b bVar = this.f656s;
        e eVar3 = this.f653p;
        if (bVar != null) {
            String str = bVar.f653p.f678c;
            eVar2.getClass();
            A1.e eVar4 = new A1.e(eVar2);
            eVar4.f22a.add(str);
            if (eVar.a(i9, this.f656s.f653p.f678c)) {
                b bVar2 = this.f656s;
                A1.e eVar5 = new A1.e(eVar4);
                eVar5.b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.d(i9, eVar3.f678c)) {
                this.f656s.q(eVar, eVar.b(i9, this.f656s.f653p.f678c) + i9, arrayList, eVar4);
            }
        }
        if (!eVar.c(i9, eVar3.f678c)) {
            return;
        }
        String str2 = eVar3.f678c;
        if (!"__container".equals(str2)) {
            eVar2.getClass();
            A1.e eVar6 = new A1.e(eVar2);
            eVar6.f22a.add(str2);
            if (eVar.a(i9, str2)) {
                A1.e eVar7 = new A1.e(eVar6);
                eVar7.b = this;
                arrayList.add(eVar7);
            }
            eVar2 = eVar6;
        }
        if (eVar.d(i9, str2)) {
            q(eVar, eVar.b(i9, str2) + i9, arrayList, eVar2);
        }
    }

    public final void i() {
        if (this.f658u != null) {
            return;
        }
        if (this.f657t == null) {
            this.f658u = Collections.emptyList();
            return;
        }
        this.f658u = new ArrayList();
        for (b bVar = this.f657t; bVar != null; bVar = bVar.f657t) {
            this.f658u.add(bVar);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.f648i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f647h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i9);

    public E1.c l() {
        return this.f653p.f696w;
    }

    public F1.i m() {
        return this.f653p.f697x;
    }

    public final boolean n() {
        l5.k kVar = this.f654q;
        if (kVar != null && !((ArrayList) kVar.b).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        C2837C c2837c = this.f652o.b.f23484a;
        String str = this.f653p.f678c;
        if (c2837c.f23462a) {
            HashMap hashMap = c2837c.f23463c;
            H1.f fVar = (H1.f) hashMap.get(str);
            H1.f fVar2 = fVar;
            if (fVar == null) {
                Object obj = new Object();
                hashMap.put(str, obj);
                fVar2 = obj;
            }
            int i9 = fVar2.f1364a + 1;
            fVar2.f1364a = i9;
            if (i9 == Integer.MAX_VALUE) {
                fVar2.f1364a = i9 / 2;
            }
            if (str.equals("__container")) {
                x.h hVar = (x.h) c2837c.b.iterator();
                if (hVar.hasNext()) {
                    o.v(hVar.next());
                    throw null;
                }
            }
        }
    }

    public final void p(y1.e eVar) {
        this.f659v.remove(eVar);
    }

    public void r(boolean z8) {
        if (z8 && this.f663z == null) {
            this.f663z = new i();
        }
        this.f662y = z8;
    }

    public void s(float f9) {
        q qVar = this.f660w;
        y1.e eVar = qVar.f24329j;
        if (eVar != null) {
            eVar.i(f9);
        }
        y1.e eVar2 = qVar.m;
        if (eVar2 != null) {
            eVar2.i(f9);
        }
        y1.e eVar3 = qVar.f24331n;
        if (eVar3 != null) {
            eVar3.i(f9);
        }
        y1.e eVar4 = qVar.f24325f;
        if (eVar4 != null) {
            eVar4.i(f9);
        }
        y1.e eVar5 = qVar.f24326g;
        if (eVar5 != null) {
            eVar5.i(f9);
        }
        y1.e eVar6 = qVar.f24327h;
        if (eVar6 != null) {
            eVar6.i(f9);
        }
        y1.e eVar7 = qVar.f24328i;
        if (eVar7 != null) {
            eVar7.i(f9);
        }
        y1.i iVar = qVar.f24330k;
        if (iVar != null) {
            iVar.i(f9);
        }
        y1.i iVar2 = qVar.l;
        if (iVar2 != null) {
            iVar2.i(f9);
        }
        l5.k kVar = this.f654q;
        if (kVar != null) {
            int i9 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) kVar.b;
                if (i9 >= arrayList.size()) {
                    break;
                }
                ((y1.e) arrayList.get(i9)).i(f9);
                i9++;
            }
        }
        y1.i iVar3 = this.f655r;
        if (iVar3 != null) {
            iVar3.i(f9);
        }
        b bVar = this.f656s;
        if (bVar != null) {
            bVar.s(f9);
        }
        ArrayList arrayList2 = this.f659v;
        arrayList2.size();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((y1.e) arrayList2.get(i10)).i(f9);
        }
        arrayList2.size();
    }

    @Override // x1.c
    public final void b(List list, List list2) {
    }

    public void q(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
    }
}
