package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements i0.b {
    public r A;
    public MenuItem.OnActionExpandListener B;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20150b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20151c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20152d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f20153e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f20154f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f20155g;

    /* renamed from: h, reason: collision with root package name */
    public char f20156h;

    /* renamed from: j, reason: collision with root package name */
    public char f20158j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f20160l;

    /* renamed from: n, reason: collision with root package name */
    public final o f20162n;

    /* renamed from: o, reason: collision with root package name */
    public i0 f20163o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f20164p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f20165q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f20166r;

    /* renamed from: y, reason: collision with root package name */
    public int f20172y;

    /* renamed from: z, reason: collision with root package name */
    public View f20173z;

    /* renamed from: i, reason: collision with root package name */
    public int f20157i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f20159k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f20161m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f20167s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f20168t = null;
    public boolean u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20169v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20170w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f20171x = 16;
    public boolean C = false;

    public q(o oVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f20162n = oVar;
        this.a = i11;
        this.f20150b = i10;
        this.f20151c = i12;
        this.f20152d = i13;
        this.f20153e = charSequence;
        this.f20172y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // i0.b
    public final i0.b a(r rVar) {
        r rVar2 = this.A;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f20173z = null;
        this.A = rVar;
        this.f20162n.p(true);
        r rVar3 = this.A;
        if (rVar3 != null) {
            rVar3.d(new fb.c(this, 3));
        }
        return this;
    }

    @Override // i0.b
    public final r b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f20172y & 8) == 0) {
            return false;
        }
        if (this.f20173z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f20162n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f20170w && (this.u || this.f20169v)) {
            drawable = drawable.mutate();
            if (this.u) {
                h0.a.h(drawable, this.f20167s);
            }
            if (this.f20169v) {
                h0.a.i(drawable, this.f20168t);
            }
            this.f20170w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f20172y & 8) == 0) {
            return false;
        }
        if (this.f20173z == null && (rVar = this.A) != null) {
            this.f20173z = rVar.b(this);
        }
        if (this.f20173z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f20162n.f(this);
    }

    public final boolean f() {
        return (this.f20171x & 32) == 32;
    }

    public final void g(boolean z10) {
        if (z10) {
            this.f20171x |= 32;
        } else {
            this.f20171x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f20173z;
        if (view != null) {
            return view;
        }
        r rVar = this.A;
        if (rVar != null) {
            View b3 = rVar.b(this);
            this.f20173z = b3;
            return b3;
        }
        return null;
    }

    @Override // i0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f20159k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f20158j;
    }

    @Override // i0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f20165q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f20150b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f20160l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f20161m;
        if (i10 != 0) {
            Drawable t5 = com.bumptech.glide.c.t(this.f20162n.a, i10);
            this.f20161m = 0;
            this.f20160l = t5;
            return d(t5);
        }
        return null;
    }

    @Override // i0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f20167s;
    }

    @Override // i0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f20168t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f20155g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // i0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f20157i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f20156h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f20151c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f20163o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f20153e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20154f;
        return charSequence != null ? charSequence : this.f20153e;
    }

    @Override // i0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f20166r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f20163o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f20171x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f20171x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f20171x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        r rVar = this.A;
        if (rVar != null && rVar.c()) {
            if ((this.f20171x & 8) == 0 && this.A.a()) {
                return true;
            }
            return false;
        }
        if ((this.f20171x & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f20173z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.a) > 0) {
            view.setId(i10);
        }
        o oVar = this.f20162n;
        oVar.f20134k = true;
        oVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f20158j == c10) {
            return this;
        }
        this.f20158j = Character.toLowerCase(c10);
        this.f20162n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f20171x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f20171x = i11;
        if (i10 != i11) {
            this.f20162n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f20171x;
        int i12 = i11 & 4;
        o oVar = this.f20162n;
        int i13 = 2;
        if (i12 != 0) {
            oVar.getClass();
            ArrayList arrayList = oVar.f20129f;
            int size = arrayList.size();
            oVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                q qVar = (q) arrayList.get(i14);
                if (qVar.f20150b == this.f20150b) {
                    boolean z12 = true;
                    if ((qVar.f20171x & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && qVar.isCheckable()) {
                        if (qVar != this) {
                            z12 = false;
                        }
                        int i15 = qVar.f20171x;
                        int i16 = i15 & (-3);
                        if (z12) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i17 = i10 | i16;
                        qVar.f20171x = i17;
                        if (i15 != i17) {
                            qVar.f20162n.p(false);
                        }
                    }
                }
            }
            oVar.v();
        } else {
            int i18 = i11 & (-3);
            if (!z10) {
                i13 = 0;
            }
            int i19 = i13 | i18;
            this.f20171x = i19;
            if (i11 != i19) {
                oVar.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f20171x |= 16;
        } else {
            this.f20171x &= -17;
        }
        this.f20162n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f20161m = 0;
        this.f20160l = drawable;
        this.f20170w = true;
        this.f20162n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20167s = colorStateList;
        this.u = true;
        this.f20170w = true;
        this.f20162n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20168t = mode;
        this.f20169v = true;
        this.f20170w = true;
        this.f20162n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f20155g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f20156h == c10) {
            return this;
        }
        this.f20156h = c10;
        this.f20162n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f20164p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f20156h = c10;
        this.f20158j = Character.toLowerCase(c11);
        this.f20162n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f20172y = i10;
        o oVar = this.f20162n;
        oVar.f20134k = true;
        oVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f20153e = charSequence;
        this.f20162n.p(false);
        i0 i0Var = this.f20163o;
        if (i0Var != null) {
            i0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20154f = charSequence;
        this.f20162n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f20171x;
        int i12 = i11 & (-9);
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f20171x = i13;
        if (i11 != i13) {
            z11 = true;
        }
        if (z11) {
            o oVar = this.f20162n;
            oVar.f20131h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f20153e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // i0.b, android.view.MenuItem
    public final i0.b setContentDescription(CharSequence charSequence) {
        this.f20165q = charSequence;
        this.f20162n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final i0.b setTooltipText(CharSequence charSequence) {
        this.f20166r = charSequence;
        this.f20162n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f20158j == c10 && this.f20159k == i10) {
            return this;
        }
        this.f20158j = Character.toLowerCase(c10);
        this.f20159k = KeyEvent.normalizeMetaState(i10);
        this.f20162n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f20156h == c10 && this.f20157i == i10) {
            return this;
        }
        this.f20156h = c10;
        this.f20157i = KeyEvent.normalizeMetaState(i10);
        this.f20162n.p(false);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f20156h = c10;
        this.f20157i = KeyEvent.normalizeMetaState(i10);
        this.f20158j = Character.toLowerCase(c11);
        this.f20159k = KeyEvent.normalizeMetaState(i11);
        this.f20162n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f20160l = null;
        this.f20161m = i10;
        this.f20170w = true;
        this.f20162n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f20162n.a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        o oVar = this.f20162n;
        Context context = oVar.a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f20173z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.a) > 0) {
            inflate.setId(i11);
        }
        oVar.f20134k = true;
        oVar.p(true);
        return this;
    }
}
