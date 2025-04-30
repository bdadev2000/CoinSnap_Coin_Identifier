package q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import k.C2426o;
import p.ActionProviderVisibilityListenerC2536o;
import p.C2535n;
import p.MenuC2533l;
import p.SubMenuC2521D;

/* renamed from: q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2605j implements p.x {
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public Context f22660c;

    /* renamed from: d, reason: collision with root package name */
    public MenuC2533l f22661d;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f22662f;

    /* renamed from: g, reason: collision with root package name */
    public p.w f22663g;

    /* renamed from: j, reason: collision with root package name */
    public p.z f22666j;

    /* renamed from: k, reason: collision with root package name */
    public C2603i f22667k;
    public Drawable l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22668n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22669o;

    /* renamed from: p, reason: collision with root package name */
    public int f22670p;

    /* renamed from: q, reason: collision with root package name */
    public int f22671q;

    /* renamed from: r, reason: collision with root package name */
    public int f22672r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22673s;

    /* renamed from: u, reason: collision with root package name */
    public C2597f f22675u;

    /* renamed from: v, reason: collision with root package name */
    public C2597f f22676v;

    /* renamed from: w, reason: collision with root package name */
    public RunnableC2601h f22677w;

    /* renamed from: x, reason: collision with root package name */
    public C2599g f22678x;

    /* renamed from: h, reason: collision with root package name */
    public final int f22664h = R.layout.abc_action_menu_layout;

    /* renamed from: i, reason: collision with root package name */
    public final int f22665i = R.layout.abc_action_menu_item_layout;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f22674t = new SparseBooleanArray();

    /* renamed from: y, reason: collision with root package name */
    public final C2426o f22679y = new C2426o(this, 4);

    public C2605j(Context context) {
        this.b = context;
        this.f22662f = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [p.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C2535n c2535n, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = c2535n.getActionView();
        int i9 = 0;
        if (actionView == null || c2535n.e()) {
            if (view instanceof p.y) {
                actionMenuItemView = (p.y) view;
            } else {
                actionMenuItemView = (p.y) this.f22662f.inflate(this.f22665i, viewGroup, false);
            }
            actionMenuItemView.b(c2535n);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f22666j);
            if (this.f22678x == null) {
                this.f22678x = new C2599g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f22678x);
            actionView = actionMenuItemView;
        }
        if (c2535n.f22129E) {
            i9 = 8;
        }
        actionView.setVisibility(i9);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C2611m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // p.x
    public final void b(MenuC2533l menuC2533l, boolean z8) {
        g();
        C2597f c2597f = this.f22676v;
        if (c2597f != null && c2597f.b()) {
            c2597f.f22166j.dismiss();
        }
        p.w wVar = this.f22663g;
        if (wVar != null) {
            wVar.b(menuC2533l, z8);
        }
    }

    @Override // p.x
    public final void c(Context context, MenuC2533l menuC2533l) {
        this.f22660c = context;
        LayoutInflater.from(context);
        this.f22661d = menuC2533l;
        Resources resources = context.getResources();
        if (!this.f22669o) {
            this.f22668n = true;
        }
        int i9 = 2;
        this.f22670p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
            if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                if (i10 >= 360) {
                    i9 = 3;
                }
            } else {
                i9 = 4;
            }
        } else {
            i9 = 5;
        }
        this.f22672r = i9;
        int i12 = this.f22670p;
        if (this.f22668n) {
            if (this.f22667k == null) {
                C2603i c2603i = new C2603i(this, this.b);
                this.f22667k = c2603i;
                if (this.m) {
                    c2603i.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f22667k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f22667k.getMeasuredWidth();
        } else {
            this.f22667k = null;
        }
        this.f22671q = i12;
        float f9 = resources.getDisplayMetrics().density;
    }

    @Override // p.x
    public final boolean d() {
        int i9;
        ArrayList arrayList;
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        MenuC2533l menuC2533l = this.f22661d;
        if (menuC2533l != null) {
            arrayList = menuC2533l.l();
            i9 = arrayList.size();
        } else {
            i9 = 0;
            arrayList = null;
        }
        int i11 = this.f22672r;
        int i12 = this.f22671q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f22666j;
        int i13 = 0;
        boolean z12 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z8 = true;
            if (i13 >= i9) {
                break;
            }
            C2535n c2535n = (C2535n) arrayList.get(i13);
            int i16 = c2535n.f22125A;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z12 = true;
            }
            if (this.f22673s && c2535n.f22129E) {
                i11 = 0;
            }
            i13++;
        }
        if (this.f22668n && (z12 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = this.f22674t;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i9) {
            C2535n c2535n2 = (C2535n) arrayList.get(i18);
            int i20 = c2535n2.f22125A;
            if ((i20 & 2) == i10) {
                z9 = z8;
            } else {
                z9 = false;
            }
            int i21 = c2535n2.f22130c;
            if (z9) {
                View a6 = a(c2535n2, null, viewGroup);
                a6.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a6.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z8);
                }
                c2535n2.g(z8);
            } else if ((i20 & 1) == z8) {
                boolean z13 = sparseBooleanArray.get(i21);
                if ((i17 > 0 || z13) && i12 > 0) {
                    z10 = z8;
                } else {
                    z10 = false;
                }
                if (z10) {
                    View a9 = a(c2535n2, null, viewGroup);
                    a9.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a9.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    if (i12 + i19 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 &= z11;
                }
                if (z10 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z13) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        C2535n c2535n3 = (C2535n) arrayList.get(i22);
                        if (c2535n3.f22130c == i21) {
                            if (c2535n3.f()) {
                                i17++;
                            }
                            c2535n3.g(false);
                        }
                    }
                }
                if (z10) {
                    i17--;
                }
                c2535n2.g(z10);
            } else {
                c2535n2.g(false);
                i18++;
                i10 = 2;
                z8 = true;
            }
            i18++;
            i10 = 2;
            z8 = true;
        }
        return z8;
    }

    @Override // p.x
    public final void e(p.w wVar) {
        this.f22663g = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.x
    public final void f() {
        int i9;
        C2535n c2535n;
        ViewGroup viewGroup = (ViewGroup) this.f22666j;
        ArrayList arrayList = null;
        boolean z8 = false;
        if (viewGroup != null) {
            MenuC2533l menuC2533l = this.f22661d;
            if (menuC2533l != null) {
                menuC2533l.i();
                ArrayList l = this.f22661d.l();
                int size = l.size();
                i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    C2535n c2535n2 = (C2535n) l.get(i10);
                    if (c2535n2.f()) {
                        View childAt = viewGroup.getChildAt(i9);
                        if (childAt instanceof p.y) {
                            c2535n = ((p.y) childAt).getItemData();
                        } else {
                            c2535n = null;
                        }
                        View a6 = a(c2535n2, childAt, viewGroup);
                        if (c2535n2 != c2535n) {
                            a6.setPressed(false);
                            a6.jumpDrawablesToCurrentState();
                        }
                        if (a6 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a6.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a6);
                            }
                            ((ViewGroup) this.f22666j).addView(a6, i9);
                        }
                        i9++;
                    }
                }
            } else {
                i9 = 0;
            }
            while (i9 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i9) == this.f22667k) {
                    i9++;
                } else {
                    viewGroup.removeViewAt(i9);
                }
            }
        }
        ((View) this.f22666j).requestLayout();
        MenuC2533l menuC2533l2 = this.f22661d;
        if (menuC2533l2 != null) {
            menuC2533l2.i();
            ArrayList arrayList2 = menuC2533l2.f22109k;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o = ((C2535n) arrayList2.get(i11)).f22127C;
            }
        }
        MenuC2533l menuC2533l3 = this.f22661d;
        if (menuC2533l3 != null) {
            menuC2533l3.i();
            arrayList = menuC2533l3.l;
        }
        if (this.f22668n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z8 = !((C2535n) arrayList.get(0)).f22129E;
            } else if (size3 > 0) {
                z8 = true;
            }
        }
        if (z8) {
            if (this.f22667k == null) {
                this.f22667k = new C2603i(this, this.b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f22667k.getParent();
            if (viewGroup3 != this.f22666j) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f22667k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f22666j;
                C2603i c2603i = this.f22667k;
                actionMenuView.getClass();
                C2611m j7 = ActionMenuView.j();
                j7.f22687a = true;
                actionMenuView.addView(c2603i, j7);
            }
        } else {
            C2603i c2603i2 = this.f22667k;
            if (c2603i2 != null) {
                Object parent = c2603i2.getParent();
                Object obj = this.f22666j;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f22667k);
                }
            }
        }
        ((ActionMenuView) this.f22666j).setOverflowReserved(this.f22668n);
    }

    public final boolean g() {
        Object obj;
        RunnableC2601h runnableC2601h = this.f22677w;
        if (runnableC2601h != null && (obj = this.f22666j) != null) {
            ((View) obj).removeCallbacks(runnableC2601h);
            this.f22677w = null;
            return true;
        }
        C2597f c2597f = this.f22675u;
        if (c2597f != null) {
            if (c2597f.b()) {
                c2597f.f22166j.dismiss();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.x
    public final boolean h(SubMenuC2521D subMenuC2521D) {
        boolean z8;
        if (!subMenuC2521D.hasVisibleItems()) {
            return false;
        }
        SubMenuC2521D subMenuC2521D2 = subMenuC2521D;
        while (true) {
            MenuC2533l menuC2533l = subMenuC2521D2.f22048B;
            if (menuC2533l == this.f22661d) {
                break;
            }
            subMenuC2521D2 = (SubMenuC2521D) menuC2533l;
        }
        ViewGroup viewGroup = (ViewGroup) this.f22666j;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i9);
                if ((childAt instanceof p.y) && ((p.y) childAt).getItemData() == subMenuC2521D2.f22049C) {
                    view = childAt;
                    break;
                }
                i9++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC2521D.f22049C.getClass();
        int size = subMenuC2521D.f22106h.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                MenuItem item = subMenuC2521D.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z8 = true;
                    break;
                }
                i10++;
            } else {
                z8 = false;
                break;
            }
        }
        C2597f c2597f = new C2597f(this, this.f22660c, subMenuC2521D, view);
        this.f22676v = c2597f;
        c2597f.f22164h = z8;
        p.t tVar = c2597f.f22166j;
        if (tVar != null) {
            tVar.n(z8);
        }
        C2597f c2597f2 = this.f22676v;
        if (!c2597f2.b()) {
            if (c2597f2.f22162f != null) {
                c2597f2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        p.w wVar = this.f22663g;
        if (wVar != null) {
            wVar.g(subMenuC2521D);
        }
        return true;
    }

    @Override // p.x
    public final boolean i(C2535n c2535n) {
        return false;
    }

    @Override // p.x
    public final boolean j(C2535n c2535n) {
        return false;
    }

    public final boolean k() {
        C2597f c2597f = this.f22675u;
        if (c2597f != null && c2597f.b()) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        MenuC2533l menuC2533l;
        if (this.f22668n && !k() && (menuC2533l = this.f22661d) != null && this.f22666j != null && this.f22677w == null) {
            menuC2533l.i();
            if (!menuC2533l.l.isEmpty()) {
                RunnableC2601h runnableC2601h = new RunnableC2601h(this, new C2597f(this, this.f22660c, this.f22661d, this.f22667k));
                this.f22677w = runnableC2601h;
                ((View) this.f22666j).post(runnableC2601h);
                return true;
            }
            return false;
        }
        return false;
    }
}
