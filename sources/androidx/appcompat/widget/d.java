package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f840b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.f840b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f840b;
                actionBarOverlayLayout.f712y = null;
                actionBarOverlayLayout.f701m = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.f840b;
        switch (i10) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f712y = null;
                actionBarOverlayLayout.f701m = false;
                return;
            case 1:
                ((f2.t) obj).m();
                animator.removeListener(this);
                return;
            case 2:
                g2.d dVar = (g2.d) obj;
                ArrayList arrayList = new ArrayList(dVar.f17940g);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ColorStateList colorStateList = ((y9.a) arrayList.get(i11)).f28122b.f28134q;
                    if (colorStateList != null) {
                        h0.a.h(dVar, colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).f11559h = null;
                return;
            case 4:
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case 5:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.J(5);
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.W.get()).requestLayout();
                    return;
                }
                return;
            case 6:
                a4.j.t(obj);
                throw null;
            case 7:
                fa.g gVar = (fa.g) obj;
                gVar.f17754b.setTranslationY(0.0f);
                gVar.b(0.0f);
                return;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.y(5);
                WeakReference weakReference2 = sideSheetBehavior.f11787p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f11787p.get()).requestLayout();
                    return;
                }
                return;
            case 9:
                na.j jVar = (na.j) obj;
                jVar.q();
                jVar.f22632r.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.a;
        Object obj = this.f840b;
        switch (i10) {
            case 2:
                g2.d dVar = (g2.d) obj;
                ArrayList arrayList = new ArrayList(dVar.f17940g);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    y9.c cVar = ((y9.a) arrayList.get(i11)).f28122b;
                    ColorStateList colorStateList = cVar.f28134q;
                    if (colorStateList != null) {
                        h0.a.g(dVar, colorStateList.getColorForState(cVar.u, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 6:
                a4.j.t(obj);
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
