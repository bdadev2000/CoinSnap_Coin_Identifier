package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z1 extends c2 {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f1767h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z1(androidx.fragment.app.b2 r3, androidx.fragment.app.a2 r4, androidx.fragment.app.k1 r5, j0.e r6) {
        /*
            r2 = this;
            java.lang.String r0 = "finalState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "lifecycleImpact"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "fragmentStateManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "cancellationSignal"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.Fragment r0 = r5.f1677c
            java.lang.String r1 = "fragmentStateManager.fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r4, r0, r6)
            r2.f1767h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z1.<init>(androidx.fragment.app.b2, androidx.fragment.app.a2, androidx.fragment.app.k1, j0.e):void");
    }

    @Override // androidx.fragment.app.c2
    public final void b() {
        if (!this.f1600g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1600g = true;
            Iterator it = this.f1597d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1767h.k();
    }

    @Override // androidx.fragment.app.c2
    public final void d() {
        boolean z10;
        a2 a2Var = this.f1595b;
        a2 a2Var2 = a2.ADDING;
        k1 k1Var = this.f1767h;
        if (a2Var == a2Var2) {
            Fragment fragment = k1Var.f1677c;
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            View findFocus = fragment.mView.findFocus();
            if (findFocus != null) {
                fragment.setFocusedView(findFocus);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                }
            }
            View requireView = this.f1596c.requireView();
            Intrinsics.checkNotNullExpressionValue(requireView, "this.fragment.requireView()");
            if (requireView.getParent() == null) {
                k1Var.b();
                requireView.setAlpha(0.0f);
            }
            if (requireView.getAlpha() == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && requireView.getVisibility() == 0) {
                requireView.setVisibility(4);
            }
            requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            return;
        }
        if (a2Var == a2.REMOVING) {
            Fragment fragment2 = k1Var.f1677c;
            Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
            View requireView2 = fragment2.requireView();
            Intrinsics.checkNotNullExpressionValue(requireView2, "fragment.requireView()");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
            }
            requireView2.clearFocus();
        }
    }
}
