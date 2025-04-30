package q;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import k.C2413b;
import k.DialogInterfaceC2416e;

/* renamed from: q.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2586I implements N, DialogInterface.OnClickListener {
    public DialogInterfaceC2416e b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f22549c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f22550d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O f22551f;

    public DialogInterfaceOnClickListenerC2586I(O o3) {
        this.f22551f = o3;
    }

    @Override // q.N
    public final boolean a() {
        DialogInterfaceC2416e dialogInterfaceC2416e = this.b;
        if (dialogInterfaceC2416e != null) {
            return dialogInterfaceC2416e.isShowing();
        }
        return false;
    }

    @Override // q.N
    public final int b() {
        return 0;
    }

    @Override // q.N
    public final void d(int i9) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // q.N
    public final void dismiss() {
        DialogInterfaceC2416e dialogInterfaceC2416e = this.b;
        if (dialogInterfaceC2416e != null) {
            dialogInterfaceC2416e.dismiss();
            this.b = null;
        }
    }

    @Override // q.N
    public final CharSequence e() {
        return this.f22550d;
    }

    @Override // q.N
    public final Drawable f() {
        return null;
    }

    @Override // q.N
    public final void h(CharSequence charSequence) {
        this.f22550d = charSequence;
    }

    @Override // q.N
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // q.N
    public final void j(int i9) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // q.N
    public final void k(int i9) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // q.N
    public final void l(int i9, int i10) {
        if (this.f22549c == null) {
            return;
        }
        O o3 = this.f22551f;
        B3.g gVar = new B3.g(o3.getPopupContext());
        CharSequence charSequence = this.f22550d;
        C2413b c2413b = (C2413b) gVar.f286d;
        if (charSequence != null) {
            c2413b.f21264d = charSequence;
        }
        ListAdapter listAdapter = this.f22549c;
        int selectedItemPosition = o3.getSelectedItemPosition();
        c2413b.l = listAdapter;
        c2413b.m = this;
        c2413b.f21273o = selectedItemPosition;
        c2413b.f21272n = true;
        DialogInterfaceC2416e b = gVar.b();
        this.b = b;
        AlertController$RecycleListView alertController$RecycleListView = b.f21306h.f21288g;
        alertController$RecycleListView.setTextDirection(i9);
        alertController$RecycleListView.setTextAlignment(i10);
        this.b.show();
    }

    @Override // q.N
    public final int m() {
        return 0;
    }

    @Override // q.N
    public final void o(ListAdapter listAdapter) {
        this.f22549c = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        O o3 = this.f22551f;
        o3.setSelection(i9);
        if (o3.getOnItemClickListener() != null) {
            o3.performItemClick(null, i9, this.f22549c.getItemId(i9));
        }
        dismiss();
    }
}
