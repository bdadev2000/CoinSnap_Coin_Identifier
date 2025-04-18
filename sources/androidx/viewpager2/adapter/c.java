package androidx.viewpager2.adapter;

import a4.j;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p3.n;

/* loaded from: classes.dex */
public final class c implements s3.d {

    /* renamed from: b, reason: collision with root package name */
    public List f2129b;

    public /* synthetic */ c(ArrayList arrayList) {
        this.f2129b = arrayList;
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return;
        }
        j.t(it.next());
        throw null;
    }

    @Override // s3.d
    public final p3.d a() {
        if (((z3.a) this.f2129b.get(0)).c()) {
            return new p3.i(this.f2129b, 1);
        }
        return new n(this.f2129b);
    }

    @Override // s3.d
    public final List b() {
        return this.f2129b;
    }

    public final List d(int i10, ve.b bVar) {
        ArrayList arrayList = new ArrayList();
        Collections.sort(this.f2129b);
        for (ve.a aVar : this.f2129b) {
            arrayList.add(bVar.b(aVar.f26520c, aVar.f26519b));
        }
        return arrayList.subList(0, Math.min(i10, arrayList.size()));
    }

    public final c e(ve.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (ve.a aVar : this.f2129b) {
            aVar.getClass();
            RectF rectF = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f);
            PointF pointF = new PointF();
            RectF rectF2 = aVar.f26519b;
            pointF.set(rectF2.left, rectF2.top);
            PointF a = bVar.a(pointF);
            ve.a.a(rectF, a);
            a.set(rectF2.right, rectF2.top);
            PointF a10 = bVar.a(a);
            ve.a.a(rectF, a10);
            a10.set(rectF2.right, rectF2.bottom);
            PointF a11 = bVar.a(a10);
            ve.a.a(rectF, a11);
            a11.set(rectF2.left, rectF2.bottom);
            ve.a.a(rectF, bVar.a(a11));
            arrayList.add(new ve.a(aVar.f26520c, rectF));
        }
        return new c(arrayList);
    }

    @Override // s3.d
    public final boolean isStatic() {
        return this.f2129b.size() == 1 && ((z3.a) this.f2129b.get(0)).c();
    }

    public c(int i10) {
        if (i10 != 2) {
            this.f2129b = new CopyOnWriteArrayList();
        }
    }
}
