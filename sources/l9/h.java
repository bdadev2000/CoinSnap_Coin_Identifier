package l9;

import android.view.View;
import s7.e2;
import s7.f2;

/* loaded from: classes3.dex */
public final class h implements f2, View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f21211b;

    public h(k kVar) {
        this.f21211b = kVar;
    }

    @Override // s7.f2
    public final void A(e2 e2Var) {
        boolean a = e2Var.a(4, 5);
        k kVar = this.f21211b;
        if (a) {
            kVar.g();
        }
        if (e2Var.a(4, 5, 7)) {
            kVar.h();
        }
        n9.g gVar = e2Var.a;
        if (gVar.a.get(8)) {
            kVar.i();
        }
        if (gVar.a.get(9)) {
            kVar.j();
        }
        if (e2Var.a(8, 9, 11, 0, 13)) {
            kVar.f();
        }
        if (e2Var.a(11, 0)) {
            kVar.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093 A[LOOP:0: B:35:0x0074->B:45:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.h.onClick(android.view.View):void");
    }
}
