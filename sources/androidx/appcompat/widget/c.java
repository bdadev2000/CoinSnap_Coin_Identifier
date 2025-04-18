package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f821b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f823d;

    public c(ActionBarContextView actionBarContextView, j.c cVar) {
        this.f823d = actionBarContextView;
        this.f822c = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f821b;
        Object obj = this.f822c;
        switch (i10) {
            case 0:
                ((j.c) obj).a();
                return;
            default:
                z3 z3Var = (z3) this.f823d;
                Window.Callback callback = z3Var.f1113k;
                if (callback != null && z3Var.f1114l) {
                    callback.onMenuItemSelected(0, (k.a) obj);
                    return;
                }
                return;
        }
    }

    public c(z3 z3Var) {
        this.f823d = z3Var;
        this.f822c = new k.a(z3Var.a.getContext(), z3Var.f1110h);
    }
}
