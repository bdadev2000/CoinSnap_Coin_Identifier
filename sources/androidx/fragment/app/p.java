package androidx.fragment.app;

import android.app.Dialog;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public final class p implements androidx.lifecycle.f0 {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    @Override // androidx.lifecycle.f0
    public final void a(Object obj) {
        boolean z10;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (((androidx.lifecycle.v) obj) != null) {
            r rVar = this.a;
            z10 = rVar.mShowsDialog;
            if (z10) {
                View requireView = rVar.requireView();
                if (requireView.getParent() == null) {
                    dialog = rVar.mDialog;
                    if (dialog != null) {
                        if (FragmentManager.isLoggingEnabled(3)) {
                            StringBuilder sb2 = new StringBuilder("DialogFragment ");
                            sb2.append(this);
                            sb2.append(" setting the content view on ");
                            dialog3 = rVar.mDialog;
                            sb2.append(dialog3);
                            Log.d(FragmentManager.TAG, sb2.toString());
                        }
                        dialog2 = rVar.mDialog;
                        dialog2.setContentView(requireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
