package k;

import a.AbstractC0325a;
import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.V;
import g4.AbstractC2292b;
import w4.v0;

/* loaded from: classes.dex */
public abstract class y extends f.m implements InterfaceC2418g {

    /* renamed from: f, reason: collision with root package name */
    public w f21391f;

    /* renamed from: g, reason: collision with root package name */
    public final x f21392g;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [k.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969035(0x7f0401cb, float:1.754674E38)
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
            k.x r2 = new k.x
            r2.<init>()
            r4.f21392g = r2
            k.k r2 = r4.d()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            k.w r5 = (k.w) r5
            r5.f21365V = r6
            r2.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.y.<init>(android.content.Context, int):void");
    }

    @Override // f.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w wVar = (w) d();
        wVar.w();
        ((ViewGroup) wVar.f21347C.findViewById(R.id.content)).addView(view, layoutParams);
        wVar.f21379o.a(wVar.f21378n.getCallback());
    }

    public final AbstractC2422k d() {
        if (this.f21391f == null) {
            ExecutorC2421j executorC2421j = AbstractC2422k.b;
            this.f21391f = new w(getContext(), getWindow(), this, this);
        }
        return this.f21391f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0325a.f(this.f21392g, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        V.k(getWindow().getDecorView(), this);
        AbstractC2292b.j(getWindow().getDecorView(), this);
        v0.z(getWindow().getDecorView(), this);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i9) {
        w wVar = (w) d();
        wVar.w();
        return wVar.f21378n.findViewById(i9);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().c();
    }

    @Override // f.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().e();
    }

    @Override // f.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        w wVar = (w) d();
        wVar.A();
        C2411H c2411h = wVar.f21381q;
        if (c2411h != null) {
            c2411h.f21256v = false;
            o.k kVar = c2411h.f21255u;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    @Override // f.m, android.app.Dialog
    public void setContentView(int i9) {
        e();
        d().j(i9);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().m(charSequence);
    }

    @Override // f.m, android.app.Dialog
    public void setContentView(View view) {
        e();
        d().k(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i9) {
        super.setTitle(i9);
        d().m(getContext().getString(i9));
    }

    @Override // f.m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().l(view, layoutParams);
    }
}
