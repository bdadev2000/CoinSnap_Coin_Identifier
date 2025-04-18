package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class o implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1698b;

    public o(r rVar) {
        this.f1698b = rVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        r rVar = this.f1698b;
        dialog = rVar.mDialog;
        if (dialog != null) {
            dialog2 = rVar.mDialog;
            rVar.onDismiss(dialog2);
        }
    }
}
