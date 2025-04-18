package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class n0 implements s0, DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public h.j f943b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f944c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f945d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t0 f946f;

    public n0(t0 t0Var) {
        this.f946f = t0Var;
    }

    @Override // androidx.appcompat.widget.s0
    public final boolean a() {
        h.j jVar = this.f943b;
        if (jVar != null) {
            return jVar.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.s0
    public final int b() {
        return 0;
    }

    @Override // androidx.appcompat.widget.s0
    public final void c(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.s0
    public final CharSequence d() {
        return this.f945d;
    }

    @Override // androidx.appcompat.widget.s0
    public final void dismiss() {
        h.j jVar = this.f943b;
        if (jVar != null) {
            jVar.dismiss();
            this.f943b = null;
        }
    }

    @Override // androidx.appcompat.widget.s0
    public final Drawable e() {
        return null;
    }

    @Override // androidx.appcompat.widget.s0
    public final void f(CharSequence charSequence) {
        this.f945d = charSequence;
    }

    @Override // androidx.appcompat.widget.s0
    public final void g(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.s0
    public final void i(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.s0
    public final void j(int i10, int i11) {
        if (this.f944c == null) {
            return;
        }
        t0 t0Var = this.f946f;
        h.i iVar = new h.i(t0Var.getPopupContext());
        CharSequence charSequence = this.f945d;
        if (charSequence != null) {
            iVar.setTitle(charSequence);
        }
        ListAdapter listAdapter = this.f944c;
        int selectedItemPosition = t0Var.getSelectedItemPosition();
        h.e eVar = iVar.a;
        eVar.f18545n = listAdapter;
        eVar.f18546o = this;
        eVar.f18549r = selectedItemPosition;
        eVar.f18548q = true;
        h.j create = iVar.create();
        this.f943b = create;
        AlertController$RecycleListView alertController$RecycleListView = create.f18622h.f18599g;
        l0.d(alertController$RecycleListView, i10);
        l0.c(alertController$RecycleListView, i11);
        this.f943b.show();
    }

    @Override // androidx.appcompat.widget.s0
    public final int k() {
        return 0;
    }

    @Override // androidx.appcompat.widget.s0
    public final void l(ListAdapter listAdapter) {
        this.f944c = listAdapter;
    }

    @Override // androidx.appcompat.widget.s0
    public final void n(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        t0 t0Var = this.f946f;
        t0Var.setSelection(i10);
        if (t0Var.getOnItemClickListener() != null) {
            t0Var.performItemClick(null, i10, this.f944c.getItemId(i10));
        }
        dismiss();
    }
}
