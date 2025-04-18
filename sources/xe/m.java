package xe;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public final class m {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    public final void a(qe.a aVar) {
        te.d dVar = this.a.f27668j;
        qe.b bVar = (qe.b) aVar;
        bVar.getClass();
        try {
            qe.b bVar2 = (qe.b) qe.b.class.newInstance();
            ze.b bVar3 = bVar.f23899c;
            if (bVar3 != null) {
                bVar2.getClass();
                bVar2.f23899c = new ze.b(bVar3.f28749b, bVar3.f28750c);
            }
            dVar.f25383d = bVar2;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e10);
        }
    }

    public final void b(int i10) {
        o oVar = this.a;
        oVar.getClass();
        oVar.f27668j = new te.d(new androidx.work.p(33984, 36197, Integer.valueOf(i10)));
        Rect q10 = com.bumptech.glide.e.q(((fe.k) oVar.a).f17853c, oVar.f27664f);
        ((fe.k) oVar.a).f17853c = new ze.b(q10.width(), q10.height());
        if (oVar.f27666h) {
            oVar.f27667i = new we.c(oVar.f27665g, ((fe.k) oVar.a).f17853c);
        }
    }
}
