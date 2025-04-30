package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0485u implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0487w b;

    public DialogInterfaceOnDismissListenerC0485u(DialogInterfaceOnCancelListenerC0487w dialogInterfaceOnCancelListenerC0487w) {
        this.b = dialogInterfaceOnCancelListenerC0487w;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        DialogInterfaceOnCancelListenerC0487w dialogInterfaceOnCancelListenerC0487w = this.b;
        dialog = dialogInterfaceOnCancelListenerC0487w.mDialog;
        if (dialog != null) {
            dialog2 = dialogInterfaceOnCancelListenerC0487w.mDialog;
            dialogInterfaceOnCancelListenerC0487w.onDismiss(dialog2);
        }
    }
}
