package h;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class i0 extends androidx.activity.o implements n {

    /* renamed from: f, reason: collision with root package name */
    public g0 f18620f;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f18621g;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969104(0x7f040210, float:1.754688E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            h.h0 r2 = new h.h0
            r2.<init>()
            r4.f18621g = r2
            h.r r2 = r4.f()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            h.g0 r5 = (h.g0) r5
            r5.V = r6
            r5 = 0
            r2.f(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.i0.<init>(android.content.Context, int):void");
    }

    @Override // h.n
    public final void a() {
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().a(view, layoutParams);
    }

    @Override // h.n
    public final void b() {
    }

    @Override // h.n
    public final void c() {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a6.k.o(this.f18621g, getWindow().getDecorView(), this, keyEvent);
    }

    public final r f() {
        if (this.f18620f == null) {
            p0 p0Var = r.f18648b;
            this.f18620f = new g0(getContext(), getWindow(), this, this);
        }
        return this.f18620f;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        g0 g0Var = (g0) f();
        g0Var.x();
        return g0Var.f18582n.findViewById(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        f().c();
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().b();
        super.onCreate(bundle);
        f().f(bundle);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void onStop() {
        super.onStop();
        g0 g0Var = (g0) f();
        g0Var.C();
        w0 w0Var = g0Var.f18585q;
        if (w0Var != null) {
            w0Var.f18696z = false;
            j.m mVar = w0Var.f18695y;
            if (mVar != null) {
                mVar.a();
            }
        }
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(int i10) {
        f().k(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().n(charSequence);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(View view) {
        f().l(view);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().m(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        f().n(getContext().getString(i10));
    }
}
