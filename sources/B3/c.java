package B3;

import M0.w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.ar.core.InstallActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i9) {
        this.f281a = i9;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f281a) {
            case 8:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.f4193y = null;
                actionBarOverlayLayout.l = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f281a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                bottomSheetBehavior.I(5);
                WeakReference weakReference = bottomSheetBehavior.f13933U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.f13933U.get()).requestLayout();
                    return;
                }
                return;
            case 1:
                ((w) this.b).m();
                animator.removeListener(this);
                return;
            case 2:
                M3.h hVar = (M3.h) this.b;
                hVar.b.setTranslationY(0.0f);
                hVar.b(0.0f);
                return;
            case 3:
                N0.f fVar = (N0.f) this.b;
                ArrayList arrayList = new ArrayList(fVar.f2027g);
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ColorStateList colorStateList = ((E3.a) arrayList.get(i9)).b.f1020q;
                    if (colorStateList != null) {
                        M.a.h(fVar, colorStateList);
                    }
                }
                return;
            case 4:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                sideSheetBehavior.w(5);
                WeakReference weakReference2 = sideSheetBehavior.f14118p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f14118p.get()).requestLayout();
                    return;
                }
                return;
            case 5:
                U3.k kVar = (U3.k) this.b;
                kVar.q();
                kVar.f3166r.start();
                return;
            case 6:
                ((InstallActivity) this.b).a();
                return;
            case 7:
                G7.j.e(animator, "animation");
                super.onAnimationEnd(animator);
                ((F7.a) this.b).invoke();
                return;
            case 8:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.f4193y = null;
                actionBarOverlayLayout.l = false;
                return;
            default:
                ((HideBottomViewOnScrollBehavior) this.b).f13906h = null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f281a) {
            case 3:
                N0.f fVar = (N0.f) this.b;
                ArrayList arrayList = new ArrayList(fVar.f2027g);
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    E3.d dVar = ((E3.a) arrayList.get(i9)).b;
                    ColorStateList colorStateList = dVar.f1020q;
                    if (colorStateList != null) {
                        M.a.g(fVar, colorStateList.getColorForState(dVar.f1024u, colorStateList.getDefaultColor()));
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
