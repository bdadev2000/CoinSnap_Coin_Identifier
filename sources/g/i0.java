package g;

import android.view.ViewTreeObserver;
import androidx.compose.ui.graphics.painter.Painter;
import e1.t0;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30543c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, int i2, Object obj2, Object obj3) {
        super(1);
        this.f30541a = i2;
        this.f30542b = obj;
        this.f30543c = obj2;
        this.d = obj3;
    }

    public final void invoke(Throwable th) {
        int i2 = this.f30541a;
        Object obj = this.f30543c;
        Object obj2 = this.d;
        Object obj3 = this.f30542b;
        switch (i2) {
            case 2:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj;
                r.i iVar = (r.i) obj2;
                ((r.j) obj3).getClass();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(iVar);
                    return;
                }
                throw null;
            case 3:
                if (obj3 == d1.d.f30168l) {
                    return;
                }
                q0.l lVar = ((d1.b) obj).f30157b;
                android.support.v4.media.d.C(obj2);
                throw null;
            default:
                h0.l lVar2 = (h0.l) obj2;
                d0.e i3 = t0.i((q0.l) obj3, obj, null);
                if (i3 != null) {
                    kotlin.jvm.internal.e.o(lVar2, i3);
                    return;
                }
                return;
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        d0.b0 b0Var = d0.b0.f30125a;
        int i2 = this.f30541a;
        Object obj2 = this.d;
        Object obj3 = this.f30543c;
        Object obj4 = this.f30542b;
        switch (i2) {
            case 0:
                l lVar = (l) obj;
                if (lVar instanceof j) {
                    q0.l lVar2 = (q0.l) obj4;
                    if (lVar2 != null) {
                        lVar2.invoke(lVar);
                    }
                } else if (lVar instanceof k) {
                    q0.l lVar3 = (q0.l) obj3;
                    if (lVar3 != null) {
                        lVar3.invoke(lVar);
                    }
                } else if (lVar instanceof i) {
                    q0.l lVar4 = (q0.l) obj2;
                    if (lVar4 != null) {
                        lVar4.invoke(lVar);
                    }
                } else {
                    boolean z2 = lVar instanceof h;
                }
                return b0Var;
            case 1:
                l lVar5 = (l) obj;
                if (lVar5 instanceof j) {
                    Painter painter = (Painter) obj4;
                    j jVar = (j) lVar5;
                    if (painter == null) {
                        return jVar;
                    }
                    jVar.getClass();
                    return new j(painter);
                }
                if (!(lVar5 instanceof i)) {
                    return lVar5;
                }
                i iVar = (i) lVar5;
                q.e eVar = iVar.f30540b;
                if (eVar.f31266c instanceof q.m) {
                    Painter painter2 = (Painter) obj3;
                    return painter2 != null ? new i(painter2, eVar) : iVar;
                }
                Painter painter3 = (Painter) obj2;
                return painter3 != null ? new i(painter3, eVar) : iVar;
            case 2:
                invoke((Throwable) obj);
                return b0Var;
            case 3:
                invoke((Throwable) obj);
                return b0Var;
            default:
                invoke((Throwable) obj);
                return b0Var;
        }
    }
}
