package h;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class j0 extends androidx.fragment.app.r {
    @Override // androidx.fragment.app.r
    public Dialog onCreateDialog(Bundle bundle) {
        return new i0(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.r
    public final void setupDialog(Dialog dialog, int i10) {
        if (dialog instanceof i0) {
            i0 i0Var = (i0) dialog;
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            i0Var.f().i(1);
            return;
        }
        super.setupDialog(dialog, i10);
    }
}
