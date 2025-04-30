package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import k.C2413b;
import k.DialogInterfaceC2416e;

/* renamed from: p.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2529h implements x, AdapterView.OnItemClickListener {
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f22091c;

    /* renamed from: d, reason: collision with root package name */
    public MenuC2533l f22092d;

    /* renamed from: f, reason: collision with root package name */
    public ExpandedMenuView f22093f;

    /* renamed from: g, reason: collision with root package name */
    public w f22094g;

    /* renamed from: h, reason: collision with root package name */
    public C2528g f22095h;

    public C2529h(Context context) {
        this.b = context;
        this.f22091c = LayoutInflater.from(context);
    }

    @Override // p.x
    public final void b(MenuC2533l menuC2533l, boolean z8) {
        w wVar = this.f22094g;
        if (wVar != null) {
            wVar.b(menuC2533l, z8);
        }
    }

    @Override // p.x
    public final void c(Context context, MenuC2533l menuC2533l) {
        if (this.b != null) {
            this.b = context;
            if (this.f22091c == null) {
                this.f22091c = LayoutInflater.from(context);
            }
        }
        this.f22092d = menuC2533l;
        C2528g c2528g = this.f22095h;
        if (c2528g != null) {
            c2528g.notifyDataSetChanged();
        }
    }

    @Override // p.x
    public final boolean d() {
        return false;
    }

    @Override // p.x
    public final void e(w wVar) {
        this.f22094g = wVar;
    }

    @Override // p.x
    public final void f() {
        C2528g c2528g = this.f22095h;
        if (c2528g != null) {
            c2528g.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, p.w, java.lang.Object, android.content.DialogInterface$OnDismissListener, p.m] */
    @Override // p.x
    public final boolean h(SubMenuC2521D subMenuC2521D) {
        if (!subMenuC2521D.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.b = subMenuC2521D;
        Context context = subMenuC2521D.b;
        B3.g gVar = new B3.g(context);
        C2413b c2413b = (C2413b) gVar.f286d;
        C2529h c2529h = new C2529h(c2413b.f21262a);
        obj.f22124d = c2529h;
        c2529h.f22094g = obj;
        subMenuC2521D.b(c2529h, context);
        C2529h c2529h2 = obj.f22124d;
        if (c2529h2.f22095h == null) {
            c2529h2.f22095h = new C2528g(c2529h2);
        }
        c2413b.l = c2529h2.f22095h;
        c2413b.m = obj;
        View view = subMenuC2521D.f22113q;
        if (view != null) {
            c2413b.f21265e = view;
        } else {
            c2413b.f21263c = subMenuC2521D.f22112p;
            c2413b.f21264d = subMenuC2521D.f22111o;
        }
        c2413b.f21271k = obj;
        DialogInterfaceC2416e b = gVar.b();
        obj.f22123c = b;
        b.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f22123c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f22123c.show();
        w wVar = this.f22094g;
        if (wVar != null) {
            wVar.g(subMenuC2521D);
            return true;
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

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j7) {
        this.f22092d.q(this.f22095h.getItem(i9), this, 0);
    }
}
