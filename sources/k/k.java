package k;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class k implements c0, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f20112b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f20113c;

    /* renamed from: d, reason: collision with root package name */
    public o f20114d;

    /* renamed from: f, reason: collision with root package name */
    public ExpandedMenuView f20115f;

    /* renamed from: g, reason: collision with root package name */
    public b0 f20116g;

    /* renamed from: h, reason: collision with root package name */
    public j f20117h;

    public k(Context context) {
        this.f20112b = context;
        this.f20113c = LayoutInflater.from(context);
    }

    @Override // k.c0
    public final void b(o oVar, boolean z10) {
        b0 b0Var = this.f20116g;
        if (b0Var != null) {
            b0Var.b(oVar, z10);
        }
    }

    @Override // k.c0
    public final boolean c(q qVar) {
        return false;
    }

    @Override // k.c0
    public final void d() {
        j jVar = this.f20117h;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // k.c0
    public final boolean e(q qVar) {
        return false;
    }

    @Override // k.c0
    public final boolean f(i0 i0Var) {
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        p pVar = new p(i0Var);
        Context context = i0Var.a;
        h.i iVar = new h.i(context);
        k kVar = new k(iVar.getContext());
        pVar.f20149d = kVar;
        kVar.f20116g = pVar;
        i0Var.b(kVar, context);
        k kVar2 = pVar.f20149d;
        if (kVar2.f20117h == null) {
            kVar2.f20117h = new j(kVar2);
        }
        j jVar = kVar2.f20117h;
        h.e eVar = iVar.a;
        eVar.f18545n = jVar;
        eVar.f18546o = pVar;
        View view = i0Var.f20138o;
        if (view != null) {
            eVar.f18536e = view;
        } else {
            eVar.f18534c = i0Var.f20137n;
            iVar.setTitle(i0Var.f20136m);
        }
        eVar.f18544m = pVar;
        h.j create = iVar.create();
        pVar.f20148c = create;
        create.setOnDismissListener(pVar);
        WindowManager.LayoutParams attributes = pVar.f20148c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pVar.f20148c.show();
        b0 b0Var = this.f20116g;
        if (b0Var != null) {
            b0Var.i(i0Var);
            return true;
        }
        return true;
    }

    @Override // k.c0
    public final void g(b0 b0Var) {
        this.f20116g = b0Var;
    }

    @Override // k.c0
    public final boolean h() {
        return false;
    }

    @Override // k.c0
    public final void i(Context context, o oVar) {
        if (this.f20112b != null) {
            this.f20112b = context;
            if (this.f20113c == null) {
                this.f20113c = LayoutInflater.from(context);
            }
        }
        this.f20114d = oVar;
        j jVar = this.f20117h;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        this.f20114d.q(this.f20117h.getItem(i10), this, 0);
    }
}
