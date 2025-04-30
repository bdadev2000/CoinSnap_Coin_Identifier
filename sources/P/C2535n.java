package p;

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
import com.facebook.internal.C1838g;
import java.util.ArrayList;

/* renamed from: p.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2535n implements N.a {

    /* renamed from: A, reason: collision with root package name */
    public int f22125A;

    /* renamed from: B, reason: collision with root package name */
    public View f22126B;

    /* renamed from: C, reason: collision with root package name */
    public ActionProviderVisibilityListenerC2536o f22127C;

    /* renamed from: D, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f22128D;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22130c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22131d;

    /* renamed from: f, reason: collision with root package name */
    public final int f22132f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f22133g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f22134h;

    /* renamed from: i, reason: collision with root package name */
    public Intent f22135i;

    /* renamed from: j, reason: collision with root package name */
    public char f22136j;
    public char l;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f22138n;

    /* renamed from: p, reason: collision with root package name */
    public final MenuC2533l f22140p;

    /* renamed from: q, reason: collision with root package name */
    public SubMenuC2521D f22141q;

    /* renamed from: r, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f22142r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f22143s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f22144t;

    /* renamed from: k, reason: collision with root package name */
    public int f22137k = 4096;
    public int m = 4096;

    /* renamed from: o, reason: collision with root package name */
    public int f22139o = 0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f22145u = null;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f22146v = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f22147w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22148x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22149y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f22150z = 16;

    /* renamed from: E, reason: collision with root package name */
    public boolean f22129E = false;

    public C2535n(MenuC2533l menuC2533l, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f22140p = menuC2533l;
        this.b = i10;
        this.f22130c = i9;
        this.f22131d = i11;
        this.f22132f = i12;
        this.f22133g = charSequence;
        this.f22125A = i13;
    }

    public static void c(int i9, int i10, String str, StringBuilder sb) {
        if ((i9 & i10) == i10) {
            sb.append(str);
        }
    }

    @Override // N.a
    public final N.a a(ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o) {
        ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o2 = this.f22127C;
        if (actionProviderVisibilityListenerC2536o2 != null) {
            actionProviderVisibilityListenerC2536o2.getClass();
        }
        this.f22126B = null;
        this.f22127C = actionProviderVisibilityListenerC2536o;
        this.f22140p.p(true);
        ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o3 = this.f22127C;
        if (actionProviderVisibilityListenerC2536o3 != null) {
            actionProviderVisibilityListenerC2536o3.b = new C1838g(this);
            actionProviderVisibilityListenerC2536o3.f22152c.setVisibilityListener(actionProviderVisibilityListenerC2536o3);
        }
        return this;
    }

    @Override // N.a
    public final ActionProviderVisibilityListenerC2536o b() {
        return this.f22127C;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f22125A & 8) == 0) {
            return false;
        }
        if (this.f22126B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f22128D;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f22140p.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f22149y && (this.f22147w || this.f22148x)) {
            drawable = drawable.mutate();
            if (this.f22147w) {
                M.a.h(drawable, this.f22145u);
            }
            if (this.f22148x) {
                M.a.i(drawable, this.f22146v);
            }
            this.f22149y = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o;
        if ((this.f22125A & 8) == 0) {
            return false;
        }
        if (this.f22126B == null && (actionProviderVisibilityListenerC2536o = this.f22127C) != null) {
            this.f22126B = actionProviderVisibilityListenerC2536o.f22152c.onCreateActionView(this);
        }
        if (this.f22126B == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f22128D;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f22140p.f(this);
    }

    public final boolean f() {
        if ((this.f22150z & 32) == 32) {
            return true;
        }
        return false;
    }

    public final void g(boolean z8) {
        if (z8) {
            this.f22150z |= 32;
        } else {
            this.f22150z &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f22126B;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o = this.f22127C;
        if (actionProviderVisibilityListenerC2536o != null) {
            View onCreateActionView = actionProviderVisibilityListenerC2536o.f22152c.onCreateActionView(this);
            this.f22126B = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // N.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.l;
    }

    @Override // N.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f22143s;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f22130c;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f22138n;
        if (drawable != null) {
            return d(drawable);
        }
        int i9 = this.f22139o;
        if (i9 != 0) {
            Drawable g9 = com.facebook.appevents.n.g(this.f22140p.b, i9);
            this.f22139o = 0;
            this.f22138n = g9;
            return d(g9);
        }
        return null;
    }

    @Override // N.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f22145u;
    }

    @Override // N.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f22146v;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f22135i;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // N.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f22137k;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f22136j;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f22131d;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f22141q;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f22133g;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f22134h;
        if (charSequence == null) {
            return this.f22133g;
        }
        return charSequence;
    }

    @Override // N.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f22144t;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f22141q != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f22129E;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f22150z & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f22150z & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f22150z & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o = this.f22127C;
        if (actionProviderVisibilityListenerC2536o != null && actionProviderVisibilityListenerC2536o.f22152c.overridesItemVisibility()) {
            if ((this.f22150z & 8) != 0 || !this.f22127C.f22152c.isVisible()) {
                return false;
            }
            return true;
        }
        if ((this.f22150z & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i9;
        this.f22126B = view;
        this.f22127C = null;
        if (view != null && view.getId() == -1 && (i9 = this.b) > 0) {
            view.setId(i9);
        }
        MenuC2533l menuC2533l = this.f22140p;
        menuC2533l.m = true;
        menuC2533l.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        if (this.l == c9) {
            return this;
        }
        this.l = Character.toLowerCase(c9);
        this.f22140p.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        int i9 = this.f22150z;
        int i10 = (z8 ? 1 : 0) | (i9 & (-2));
        this.f22150z = i10;
        if (i9 != i10) {
            this.f22140p.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        boolean z9;
        int i9;
        int i10 = this.f22150z;
        int i11 = 2;
        if ((i10 & 4) != 0) {
            MenuC2533l menuC2533l = this.f22140p;
            menuC2533l.getClass();
            ArrayList arrayList = menuC2533l.f22106h;
            int size = arrayList.size();
            menuC2533l.w();
            for (int i12 = 0; i12 < size; i12++) {
                C2535n c2535n = (C2535n) arrayList.get(i12);
                if (c2535n.f22130c == this.f22130c && (c2535n.f22150z & 4) != 0 && c2535n.isCheckable()) {
                    if (c2535n == this) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i13 = c2535n.f22150z;
                    int i14 = i13 & (-3);
                    if (z9) {
                        i9 = 2;
                    } else {
                        i9 = 0;
                    }
                    int i15 = i9 | i14;
                    c2535n.f22150z = i15;
                    if (i13 != i15) {
                        c2535n.f22140p.p(false);
                    }
                }
            }
            menuC2533l.v();
        } else {
            int i16 = i10 & (-3);
            if (!z8) {
                i11 = 0;
            }
            int i17 = i16 | i11;
            this.f22150z = i17;
            if (i10 != i17) {
                this.f22140p.p(false);
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
    public final MenuItem setEnabled(boolean z8) {
        if (z8) {
            this.f22150z |= 16;
        } else {
            this.f22150z &= -17;
        }
        this.f22140p.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f22139o = 0;
        this.f22138n = drawable;
        this.f22149y = true;
        this.f22140p.p(false);
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22145u = colorStateList;
        this.f22147w = true;
        this.f22149y = true;
        this.f22140p.p(false);
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f22146v = mode;
        this.f22148x = true;
        this.f22149y = true;
        this.f22140p.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f22135i = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        if (this.f22136j == c9) {
            return this;
        }
        this.f22136j = c9;
        this.f22140p.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f22128D = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f22142r = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f22136j = c9;
        this.l = Character.toLowerCase(c10);
        this.f22140p.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i9) {
        int i10 = i9 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f22125A = i9;
        MenuC2533l menuC2533l = this.f22140p;
        menuC2533l.m = true;
        menuC2533l.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i9) {
        setShowAsAction(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f22133g = charSequence;
        this.f22140p.p(false);
        SubMenuC2521D subMenuC2521D = this.f22141q;
        if (subMenuC2521D != null) {
            subMenuC2521D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22134h = charSequence;
        this.f22140p.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        int i9;
        int i10 = this.f22150z;
        int i11 = i10 & (-9);
        if (z8) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        int i12 = i9 | i11;
        this.f22150z = i12;
        if (i10 != i12) {
            MenuC2533l menuC2533l = this.f22140p;
            menuC2533l.f22108j = true;
            menuC2533l.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f22133g;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // N.a, android.view.MenuItem
    public final N.a setContentDescription(CharSequence charSequence) {
        this.f22143s = charSequence;
        this.f22140p.p(false);
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final N.a setTooltipText(CharSequence charSequence) {
        this.f22144t = charSequence;
        this.f22140p.p(false);
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i9) {
        if (this.l == c9 && this.m == i9) {
            return this;
        }
        this.l = Character.toLowerCase(c9);
        this.m = KeyEvent.normalizeMetaState(i9);
        this.f22140p.p(false);
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i9) {
        if (this.f22136j == c9 && this.f22137k == i9) {
            return this;
        }
        this.f22136j = c9;
        this.f22137k = KeyEvent.normalizeMetaState(i9);
        this.f22140p.p(false);
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i9, int i10) {
        this.f22136j = c9;
        this.f22137k = KeyEvent.normalizeMetaState(i9);
        this.l = Character.toLowerCase(c10);
        this.m = KeyEvent.normalizeMetaState(i10);
        this.f22140p.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i9) {
        this.f22138n = null;
        this.f22139o = i9;
        this.f22149y = true;
        this.f22140p.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i9) {
        setTitle(this.f22140p.b.getString(i9));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i9) {
        int i10;
        Context context = this.f22140p.b;
        View inflate = LayoutInflater.from(context).inflate(i9, (ViewGroup) new LinearLayout(context), false);
        this.f22126B = inflate;
        this.f22127C = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.b) > 0) {
            inflate.setId(i10);
        }
        MenuC2533l menuC2533l = this.f22140p;
        menuC2533l.m = true;
        menuC2533l.p(true);
        return this;
    }
}
