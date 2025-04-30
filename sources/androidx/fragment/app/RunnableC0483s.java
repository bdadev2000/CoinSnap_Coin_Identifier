package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0483s implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4782c;

    public /* synthetic */ RunnableC0483s(Object obj, int i9) {
        this.b = i9;
        this.f4782c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterface.OnDismissListener onDismissListener;
        Dialog dialog;
        switch (this.b) {
            case 0:
                DialogInterfaceOnCancelListenerC0487w dialogInterfaceOnCancelListenerC0487w = (DialogInterfaceOnCancelListenerC0487w) this.f4782c;
                onDismissListener = dialogInterfaceOnCancelListenerC0487w.mOnDismissListener;
                dialog = dialogInterfaceOnCancelListenerC0487w.mDialog;
                onDismissListener.onDismiss(dialog);
                return;
            case 1:
                r rVar = (r) this.f4782c;
                if (!rVar.b.isEmpty()) {
                    rVar.i();
                    return;
                }
                return;
            default:
                ((FragmentManager) this.f4782c).execPendingActions(true);
                return;
        }
    }
}
