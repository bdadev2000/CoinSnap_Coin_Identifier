package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0484t implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0487w b;

    public DialogInterfaceOnCancelListenerC0484t(DialogInterfaceOnCancelListenerC0487w dialogInterfaceOnCancelListenerC0487w) {
        this.b = dialogInterfaceOnCancelListenerC0487w;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        DialogInterfaceOnCancelListenerC0487w dialogInterfaceOnCancelListenerC0487w = this.b;
        dialog = dialogInterfaceOnCancelListenerC0487w.mDialog;
        if (dialog != null) {
            dialog2 = dialogInterfaceOnCancelListenerC0487w.mDialog;
            dialogInterfaceOnCancelListenerC0487w.onCancel(dialog2);
        }
    }
}
