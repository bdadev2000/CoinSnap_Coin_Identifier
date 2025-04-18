package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class h extends k.a0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f870m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f871n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, k.o oVar, l lVar) {
        super(context, oVar, lVar, true);
        this.f871n = mVar;
        this.f20047g = 8388613;
        kc.c cVar = mVar.f937y;
        this.f20049i = cVar;
        k.x xVar = this.f20050j;
        if (xVar != null) {
            xVar.g(cVar);
        }
    }

    @Override // k.a0
    public final void c() {
        int i10 = this.f870m;
        m mVar = this.f871n;
        switch (i10) {
            case 0:
                mVar.f934v = null;
                super.c();
                return;
            default:
                k.o oVar = mVar.f918d;
                if (oVar != null) {
                    oVar.c(true);
                }
                mVar.u = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, k.i0 i0Var, View view) {
        super(context, i0Var, view, false);
        this.f871n = mVar;
        if (!i0Var.A.f()) {
            View view2 = mVar.f924k;
            this.f20046f = view2 == null ? (View) mVar.f923j : view2;
        }
        kc.c cVar = mVar.f937y;
        this.f20049i = cVar;
        k.x xVar = this.f20050j;
        if (xVar != null) {
            xVar.g(cVar);
        }
    }
}
