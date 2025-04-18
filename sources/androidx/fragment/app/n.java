package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1695b;

    public n(r rVar) {
        this.f1695b = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        r rVar = this.f1695b;
        dialog = rVar.mDialog;
        if (dialog != null) {
            dialog2 = rVar.mDialog;
            rVar.onCancel(dialog2);
        }
    }
}
