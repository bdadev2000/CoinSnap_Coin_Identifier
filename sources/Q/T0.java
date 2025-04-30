package q;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p.C2535n;
import p.MenuC2533l;
import p.SubMenuC2521D;

/* loaded from: classes.dex */
public final class T0 implements p.x {
    public MenuC2533l b;

    /* renamed from: c, reason: collision with root package name */
    public C2535n f22594c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f22595d;

    public T0(Toolbar toolbar) {
        this.f22595d = toolbar;
    }

    @Override // p.x
    public final void c(Context context, MenuC2533l menuC2533l) {
        C2535n c2535n;
        MenuC2533l menuC2533l2 = this.b;
        if (menuC2533l2 != null && (c2535n = this.f22594c) != null) {
            menuC2533l2.d(c2535n);
        }
        this.b = menuC2533l;
    }

    @Override // p.x
    public final boolean d() {
        return false;
    }

    @Override // p.x
    public final void f() {
        if (this.f22594c != null) {
            MenuC2533l menuC2533l = this.b;
            if (menuC2533l != null) {
                int size = menuC2533l.f22106h.size();
                for (int i9 = 0; i9 < size; i9++) {
                    if (this.b.getItem(i9) == this.f22594c) {
                        return;
                    }
                }
            }
            j(this.f22594c);
        }
    }

    @Override // p.x
    public final boolean h(SubMenuC2521D subMenuC2521D) {
        return false;
    }

    @Override // p.x
    public final boolean i(C2535n c2535n) {
        Toolbar toolbar = this.f22595d;
        toolbar.c();
        ViewParent parent = toolbar.f4301j.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4301j);
            }
            toolbar.addView(toolbar.f4301j);
        }
        View actionView = c2535n.getActionView();
        toolbar.f4302k = actionView;
        this.f22594c = c2535n;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4302k);
            }
            U0 h6 = Toolbar.h();
            h6.f22596a = (toolbar.f4305p & 112) | 8388611;
            h6.b = 2;
            toolbar.f4302k.setLayoutParams(h6);
            toolbar.addView(toolbar.f4302k);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((U0) childAt.getLayoutParams()).b != 2 && childAt != toolbar.b) {
                toolbar.removeViewAt(childCount);
                toolbar.f4283G.add(childAt);
            }
        }
        toolbar.requestLayout();
        c2535n.f22129E = true;
        c2535n.f22140p.p(false);
        KeyEvent.Callback callback = toolbar.f4302k;
        if (callback instanceof o.c) {
            ((p.p) ((o.c) callback)).b.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // p.x
    public final boolean j(C2535n c2535n) {
        Toolbar toolbar = this.f22595d;
        KeyEvent.Callback callback = toolbar.f4302k;
        if (callback instanceof o.c) {
            ((p.p) ((o.c) callback)).b.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f4302k);
        toolbar.removeView(toolbar.f4301j);
        toolbar.f4302k = null;
        ArrayList arrayList = toolbar.f4283G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f22594c = null;
        toolbar.requestLayout();
        c2535n.f22129E = false;
        c2535n.f22140p.p(false);
        toolbar.u();
        return true;
    }

    @Override // p.x
    public final void b(MenuC2533l menuC2533l, boolean z8) {
    }
}
