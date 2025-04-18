package v9;

import android.app.Dialog;
import android.os.Bundle;
import h.j0;

/* loaded from: classes3.dex */
public class h extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26369b = 0;

    public final void c() {
        super.dismiss();
    }

    @Override // androidx.fragment.app.r
    public final void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof g) {
            g gVar = (g) dialog;
            if (gVar.f26358h == null) {
                gVar.h();
            }
            boolean z10 = gVar.f26358h.I;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.r
    public final void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof g) {
            g gVar = (g) dialog;
            if (gVar.f26358h == null) {
                gVar.h();
            }
            boolean z10 = gVar.f26358h.I;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // h.j0, androidx.fragment.app.r
    public final Dialog onCreateDialog(Bundle bundle) {
        return new g(getContext(), getTheme());
    }
}
