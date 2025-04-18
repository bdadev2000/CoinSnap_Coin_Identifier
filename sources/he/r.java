package he;

import android.graphics.PointF;
import com.google.common.collect.c1;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class r extends ie.f {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19069c;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.f19069c = obj;
        this.f19068b = obj2;
    }

    @Override // ie.f
    public final void b() {
        boolean z10;
        pe.f fVar = pe.f.BIND;
        int i10 = this.a;
        int i11 = 1;
        Object obj = this.f19068b;
        boolean z11 = false;
        z11 = false;
        Object obj2 = this.f19069c;
        switch (i10) {
            case 0:
                s sVar = (s) obj2;
                sVar.f19104y = false;
                sVar.f19029d.e("take picture snapshot", fVar, new u(sVar, (fe.k) obj, z11, i11));
                sVar.f19104y = true;
                return;
            case 1:
                s sVar2 = (s) obj2;
                sVar2.f19103x = false;
                sVar2.f19029d.e("take picture", fVar, new u(sVar2, (fe.k) obj, z11, z11 ? 1 : 0));
                sVar2.f19103x = true;
                return;
            default:
                k.g gVar = (k.g) obj2;
                y yVar = ((s) gVar.f20065g).f19028c;
                se.a aVar = (se.a) gVar.f20062c;
                Iterator it = ((le.g) obj).f21371f.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    fe.c cVar = le.g.f21370k;
                    if (hasNext) {
                        if (!((le.a) it.next()).f21361f) {
                            cVar.a(1, "isSuccessful:", "returning false.");
                            z10 = false;
                        }
                    } else {
                        cVar.a(1, "isSuccessful:", "returning true.");
                        z10 = true;
                    }
                }
                ((c1) yVar).i(aVar, z10, (PointF) gVar.f20063d);
                Object obj3 = gVar.f20065g;
                ((s) obj3).f19029d.c(0, "reset metering");
                long j3 = ((s) obj3).N;
                if (j3 > 0 && j3 != Long.MAX_VALUE) {
                    z11 = true;
                }
                if (z11) {
                    s sVar3 = (s) obj3;
                    pe.j jVar = sVar3.f19029d;
                    pe.f fVar2 = pe.f.PREVIEW;
                    long j10 = sVar3.N;
                    androidx.activity.i iVar = new androidx.activity.i(this, 29);
                    jVar.getClass();
                    jVar.b(j10, "reset metering", new o(1, jVar, new pe.i(jVar, fVar2, iVar, i11)), true);
                    return;
                }
                return;
        }
    }
}
