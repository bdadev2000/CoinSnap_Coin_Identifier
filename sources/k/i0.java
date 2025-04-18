package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class i0 extends o implements SubMenu {
    public final q A;

    /* renamed from: z, reason: collision with root package name */
    public final o f20109z;

    public i0(Context context, o oVar, q qVar) {
        super(context);
        this.f20109z = oVar;
        this.A = qVar;
    }

    @Override // k.o
    public final boolean d(q qVar) {
        return this.f20109z.d(qVar);
    }

    @Override // k.o
    public final boolean e(o oVar, MenuItem menuItem) {
        if (!super.e(oVar, menuItem) && !this.f20109z.e(oVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // k.o
    public final boolean f(q qVar) {
        return this.f20109z.f(qVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // k.o
    public final String j() {
        int i10;
        q qVar = this.A;
        if (qVar != null) {
            i10 = qVar.a;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return eb.j.i("android:menu:actionviewstates:", i10);
    }

    @Override // k.o
    public final o k() {
        return this.f20109z.k();
    }

    @Override // k.o
    public final boolean m() {
        return this.f20109z.m();
    }

    @Override // k.o
    public final boolean n() {
        return this.f20109z.n();
    }

    @Override // k.o
    public final boolean o() {
        return this.f20109z.o();
    }

    @Override // k.o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f20109z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // k.o, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f20109z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}
