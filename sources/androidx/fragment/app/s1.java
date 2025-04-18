package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s1 extends u1 {
    public static boolean s(Transition transition) {
        if (u1.h(transition.getTargetIds()) && u1.h(transition.getTargetNames()) && u1.h(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.u1
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.u1
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (!s(transition) && u1.h(transition.getTargets())) {
            int size = arrayList.size();
            while (i10 < size) {
                transition.addTarget((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.u1
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.u1
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.u1
    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.u1
    public final Object i(Object obj, Object obj2, Object obj3) {
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

    @Override // androidx.fragment.app.u1
    public final Object j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.u1
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new p1(view, arrayList));
    }

    @Override // androidx.fragment.app.u1
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new q1(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.u1
    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            u1.g(view, rect);
            ((Transition) obj).setEpicenterCallback(new o1(rect, 0));
        }
    }

    @Override // androidx.fragment.app.u1
    public final void n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new o1(rect, 1));
    }

    @Override // androidx.fragment.app.u1
    public final void o(Object obj, j0.e eVar, h.o0 o0Var) {
        ((Transition) obj).addListener(new r1(o0Var));
    }

    @Override // androidx.fragment.app.u1
    public final void p(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            u1.d((View) arrayList.get(i10), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.u1
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            t(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.u1
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                t(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (!s(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i10 < size) {
                transition.addTarget((View) arrayList2.get(i10));
                i10++;
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    transition.removeTarget((View) arrayList.get(size2));
                } else {
                    return;
                }
            }
        }
    }
}
