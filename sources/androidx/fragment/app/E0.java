package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class E0 extends G0 {
    public static boolean z(Transition transition) {
        if (G0.k(transition.getTargetIds()) && G0.k(transition.getTargetNames()) && G0.k(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    public final void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i9 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i9 < transitionCount) {
                A(transitionSet.getTransitionAt(i9), arrayList, arrayList2);
                i9++;
            }
            return;
        }
        if (!z(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i9 < size) {
                transition.addTarget((View) arrayList2.get(i9));
                i9++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.G0
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.G0
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i9 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i9 < transitionCount) {
                b(transitionSet.getTransitionAt(i9), arrayList);
                i9++;
            }
            return;
        }
        if (!z(transition) && G0.k(transition.getTargets())) {
            int size = arrayList.size();
            while (i9 < size) {
                transition.addTarget((View) arrayList.get(i9));
                i9++;
            }
        }
    }

    @Override // androidx.fragment.app.G0
    public final void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.G0
    public final boolean g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.G0
    public final Object h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.G0
    public final boolean l() {
        if (FragmentManager.isLoggingEnabled(4)) {
            Log.i(FragmentManager.TAG, "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.G0
    public final boolean m(Object obj) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.G0
    public final Object n(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.G0
    public final Object o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.G0
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new B0(view, arrayList));
    }

    @Override // androidx.fragment.app.G0
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C0(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.G0
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            G0.j(view, rect);
            ((Transition) obj).setEpicenterCallback(new A0(0, rect));
        }
    }

    @Override // androidx.fragment.app.G0
    public final void t(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new A0(1, rect));
    }

    @Override // androidx.fragment.app.G0
    public final void u(Fragment fragment, Object obj, P.e eVar, RunnableC0473l runnableC0473l) {
        ((Transition) obj).addListener(new D0(runnableC0473l));
    }

    @Override // androidx.fragment.app.G0
    public final void w(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            G0.f((View) arrayList.get(i9), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.G0
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            A(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.G0
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
