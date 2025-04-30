package j0;

import U4.y;
import android.os.Build;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends z2.i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f20967c;

    public e(f fVar) {
        this.f20967c = fVar;
    }

    @Override // z2.i
    public final void l(Throwable th) {
        ((j) this.f20967c.f20969c).d(th);
    }

    @Override // z2.i
    public final void m(y yVar) {
        Set<int[]> p2;
        f fVar = this.f20967c;
        fVar.b = yVar;
        y yVar2 = (y) fVar.b;
        j jVar = (j) fVar.f20969c;
        L4.f fVar2 = jVar.f20977g;
        d dVar = jVar.f20979i;
        if (Build.VERSION.SDK_INT >= 34) {
            p2 = m.a();
        } else {
            p2 = C2.m.p();
        }
        fVar.f20968a = new C.c(yVar2, fVar2, dVar, p2);
        ((j) fVar.f20969c).e();
    }
}
