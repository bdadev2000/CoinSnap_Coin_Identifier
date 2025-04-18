package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import com.cooldev.gba.emulator.gameboy.R;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import d0.k;
import e0.t;
import e0.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* loaded from: classes2.dex */
    public static final class AnimationInfo extends SpecialEffectsInfo {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f19670c;
        public boolean d;
        public FragmentAnim.AnimationOrAnimator e;

        public AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z2) {
            super(operation, cancellationSignal);
            this.f19670c = z2;
        }

        public final FragmentAnim.AnimationOrAnimator c(Context context) {
            Animation loadAnimation;
            FragmentAnim.AnimationOrAnimator animationOrAnimator;
            FragmentAnim.AnimationOrAnimator animationOrAnimator2;
            if (this.d) {
                return this.e;
            }
            SpecialEffectsController.Operation operation = this.f19671a;
            Fragment fragment = operation.f19867c;
            boolean z2 = operation.f19865a == SpecialEffectsController.Operation.State.f19874b;
            int nextTransition = fragment.getNextTransition();
            int popEnterAnim = this.f19670c ? z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, popEnterAnim);
                if (onCreateAnimation != null) {
                    animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, popEnterAnim);
                    if (onCreateAnimator != null) {
                        animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(onCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z2 ? FragmentAnim.a(android.R.attr.activityOpenEnterAnimation, context) : FragmentAnim.a(android.R.attr.activityOpenExitAnimation, context) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? FragmentAnim.a(android.R.attr.activityCloseEnterAnimation, context) : FragmentAnim.a(android.R.attr.activityCloseExitAnimation, context) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
                        if (popEnterAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            try {
                                if (equals) {
                                    try {
                                        loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    } catch (Resources.NotFoundException e) {
                                        throw e;
                                    } catch (RuntimeException unused) {
                                    }
                                    if (loadAnimation != null) {
                                        animationOrAnimator = new FragmentAnim.AnimationOrAnimator(loadAnimation);
                                        animationOrAnimator2 = animationOrAnimator;
                                    }
                                }
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (loadAnimator != null) {
                                    animationOrAnimator = new FragmentAnim.AnimationOrAnimator(loadAnimator);
                                    animationOrAnimator2 = animationOrAnimator;
                                }
                            } catch (RuntimeException e2) {
                                if (equals) {
                                    throw e2;
                                }
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                if (loadAnimation2 != null) {
                                    animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(loadAnimation2);
                                }
                            }
                        }
                    }
                }
                this.e = animationOrAnimator2;
                this.d = true;
                return animationOrAnimator2;
            }
            animationOrAnimator2 = null;
            this.e = animationOrAnimator2;
            this.d = true;
            return animationOrAnimator2;
        }
    }

    /* loaded from: classes2.dex */
    public static class SpecialEffectsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final SpecialEffectsController.Operation f19671a;

        /* renamed from: b, reason: collision with root package name */
        public final CancellationSignal f19672b;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal) {
            this.f19671a = operation;
            this.f19672b = cancellationSignal;
        }

        public final void a() {
            SpecialEffectsController.Operation operation = this.f19671a;
            operation.getClass();
            CancellationSignal cancellationSignal = this.f19672b;
            p0.a.s(cancellationSignal, "signal");
            LinkedHashSet linkedHashSet = operation.e;
            if (linkedHashSet.remove(cancellationSignal) && linkedHashSet.isEmpty()) {
                operation.b();
            }
        }

        public final boolean b() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation operation = this.f19671a;
            View view = operation.f19867c.mView;
            p0.a.r(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State a2 = SpecialEffectsController.Operation.State.Companion.a(view);
            SpecialEffectsController.Operation.State state2 = operation.f19865a;
            return a2 == state2 || !(a2 == (state = SpecialEffectsController.Operation.State.f19874b) || state2 == state);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TransitionInfo extends SpecialEffectsInfo {

        /* renamed from: c, reason: collision with root package name */
        public final Object f19673c;
        public final boolean d;
        public final Object e;

        public TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z2, boolean z3) {
            super(operation, cancellationSignal);
            SpecialEffectsController.Operation.State state = operation.f19865a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f19874b;
            Fragment fragment = operation.f19867c;
            this.f19673c = state == state2 ? z2 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z2 ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.d = operation.f19865a == state2 ? z2 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.e = z3 ? z2 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final FragmentTransitionImpl c() {
            Object obj = this.f19673c;
            FragmentTransitionImpl d = d(obj);
            Object obj2 = this.e;
            FragmentTransitionImpl d2 = d(obj2);
            if (d == null || d2 == null || d == d2) {
                return d == null ? d2 : d;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f19671a.f19867c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final FragmentTransitionImpl d(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.f19828a;
            if (obj instanceof Transition) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.f19829b;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.e(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f19671a.f19867c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void m(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (ViewGroupCompat.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                m(childAt, arrayList);
            }
        }
    }

    public static void n(View view, ArrayMap arrayMap) {
        String o2 = ViewCompat.o(view);
        if (o2 != null) {
            arrayMap.put(o2, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    n(childAt, arrayMap);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    /* JADX WARN: Type inference failed for: r14v57, types: [androidx.core.os.CancellationSignal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v30, types: [androidx.core.os.CancellationSignal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v49, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    @Override // androidx.fragment.app.SpecialEffectsController
    public final void f(ArrayList arrayList, boolean z2) {
        SpecialEffectsController.Operation.State state;
        String str;
        Object obj;
        Object obj2;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        SpecialEffectsController.Operation.State state2;
        ViewGroup viewGroup;
        LinkedHashMap linkedHashMap;
        SpecialEffectsController.Operation operation;
        String str3;
        SpecialEffectsController.Operation operation2;
        boolean z3;
        SpecialEffectsController.Operation operation3;
        SpecialEffectsController.Operation operation4;
        String str4;
        Object obj3;
        View view;
        View view2;
        String str5;
        String str6;
        ArrayList arrayList4;
        ViewGroup viewGroup2;
        FragmentTransitionImpl fragmentTransitionImpl;
        LinkedHashMap linkedHashMap2;
        ArrayList<String> arrayList5;
        Object obj4;
        View view3;
        final DefaultSpecialEffectsController defaultSpecialEffectsController;
        final SpecialEffectsController.Operation operation5;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            state = SpecialEffectsController.Operation.State.f19874b;
            str = "operation.fragment.mView";
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            SpecialEffectsController.Operation operation6 = (SpecialEffectsController.Operation) obj;
            View view4 = operation6.f19867c.mView;
            p0.a.r(view4, "operation.fragment.mView");
            if (SpecialEffectsController.Operation.State.Companion.a(view4) == state && operation6.f19865a != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation7 = (SpecialEffectsController.Operation) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            SpecialEffectsController.Operation operation8 = (SpecialEffectsController.Operation) obj2;
            View view5 = operation8.f19867c.mView;
            p0.a.r(view5, "operation.fragment.mView");
            if (SpecialEffectsController.Operation.State.Companion.a(view5) != state && operation8.f19865a == state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation9 = (SpecialEffectsController.Operation) obj2;
        String str7 = "FragmentManager";
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + operation7 + " to " + operation9);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList b12 = u.b1(arrayList);
        Fragment fragment = ((SpecialEffectsController.Operation) u.L0(arrayList)).f19867c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Fragment.AnimationInfo animationInfo = ((SpecialEffectsController.Operation) it2.next()).f19867c.mAnimationInfo;
            Fragment.AnimationInfo animationInfo2 = fragment.mAnimationInfo;
            animationInfo.f19701b = animationInfo2.f19701b;
            animationInfo.f19702c = animationInfo2.f19702c;
            animationInfo.d = animationInfo2.d;
            animationInfo.e = animationInfo2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SpecialEffectsController.Operation operation10 = (SpecialEffectsController.Operation) it3.next();
            ?? obj5 = new Object();
            operation10.d();
            LinkedHashSet linkedHashSet = operation10.e;
            linkedHashSet.add(obj5);
            arrayList6.add(new AnimationInfo(operation10, obj5, z2));
            ?? obj6 = new Object();
            operation10.d();
            linkedHashSet.add(obj6);
            arrayList7.add(new TransitionInfo(operation10, obj6, z2, !z2 ? operation10 != operation9 : operation10 != operation7));
            operation10.d.add(new d(b12, operation10, this));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList8 = new ArrayList();
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((TransitionInfo) next).b()) {
                arrayList8.add(next);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it5 = arrayList8.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (((TransitionInfo) next2).c() != null) {
                arrayList9.add(next2);
            }
        }
        Iterator it6 = arrayList9.iterator();
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        while (it6.hasNext()) {
            TransitionInfo transitionInfo = (TransitionInfo) it6.next();
            FragmentTransitionImpl c2 = transitionInfo.c();
            if (fragmentTransitionImpl2 != null && c2 != fragmentTransitionImpl2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.f19671a.f19867c + " returned Transition " + transitionInfo.f19673c + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl2 = c2;
        }
        SpecialEffectsController.Operation.State state3 = SpecialEffectsController.Operation.State.f19875c;
        ViewGroup viewGroup3 = this.f19861a;
        if (fragmentTransitionImpl2 == null) {
            Iterator it7 = arrayList7.iterator();
            while (it7.hasNext()) {
                TransitionInfo transitionInfo2 = (TransitionInfo) it7.next();
                linkedHashMap3.put(transitionInfo2.f19671a, Boolean.FALSE);
                transitionInfo2.a();
            }
            arrayList2 = arrayList6;
            operation2 = operation7;
            operation = operation9;
            linkedHashMap = linkedHashMap3;
            str2 = " to ";
            arrayList3 = b12;
            state2 = state3;
            z3 = false;
            str3 = "FragmentManager";
            viewGroup = viewGroup3;
        } else {
            str2 = " to ";
            View view6 = new View(viewGroup3.getContext());
            Rect rect = new Rect();
            ArrayList arrayList10 = new ArrayList();
            arrayList2 = arrayList6;
            ArrayList arrayList11 = new ArrayList();
            SpecialEffectsController.Operation.State state4 = state;
            arrayList3 = b12;
            ?? simpleArrayMap = new SimpleArrayMap(0);
            Iterator it8 = arrayList7.iterator();
            state2 = state3;
            Object obj7 = null;
            boolean z4 = false;
            View view7 = null;
            while (it8.hasNext()) {
                Iterator it9 = it8;
                Object obj8 = ((TransitionInfo) it8.next()).e;
                if (obj8 == null || operation7 == null || operation9 == null) {
                    str5 = str;
                    str6 = str7;
                    arrayList4 = arrayList7;
                    viewGroup2 = viewGroup3;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    linkedHashMap2 = linkedHashMap3;
                } else {
                    Object r2 = fragmentTransitionImpl2.r(fragmentTransitionImpl2.f(obj8));
                    Fragment fragment2 = operation9.f19867c;
                    str5 = str;
                    ArrayList<String> sharedElementSourceNames = fragment2.getSharedElementSourceNames();
                    arrayList4 = arrayList7;
                    p0.a.r(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    Fragment fragment3 = operation7.f19867c;
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    ArrayList<String> sharedElementSourceNames2 = fragment3.getSharedElementSourceNames();
                    View view8 = view6;
                    p0.a.r(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = fragment3.getSharedElementTargetNames();
                    Rect rect2 = rect;
                    p0.a.r(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = size;
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i2));
                        }
                        i2++;
                        size = i3;
                    }
                    ArrayList<String> sharedElementTargetNames2 = fragment2.getSharedElementTargetNames();
                    p0.a.r(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    k kVar = !z2 ? new k(fragment3.getExitTransitionCallback(), fragment2.getEnterTransitionCallback()) : new k(fragment3.getEnterTransitionCallback(), fragment2.getExitTransitionCallback());
                    SharedElementCallback sharedElementCallback = (SharedElementCallback) kVar.f30134a;
                    SharedElementCallback sharedElementCallback2 = (SharedElementCallback) kVar.f30135b;
                    int size2 = sharedElementSourceNames.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        simpleArrayMap.put(sharedElementSourceNames.get(i4), sharedElementTargetNames2.get(i4));
                        i4++;
                        size2 = size2;
                        viewGroup3 = viewGroup3;
                    }
                    ViewGroup viewGroup4 = viewGroup3;
                    if (Log.isLoggable(str7, 2)) {
                        Log.v(str7, ">>> entering view names <<<");
                        for (Iterator<String> it10 = sharedElementTargetNames2.iterator(); it10.hasNext(); it10 = it10) {
                            Log.v(str7, "Name: " + it10.next());
                        }
                        Log.v(str7, ">>> exiting view names <<<");
                        for (Iterator<String> it11 = sharedElementSourceNames.iterator(); it11.hasNext(); it11 = it11) {
                            Log.v(str7, "Name: " + it11.next());
                        }
                    }
                    ?? simpleArrayMap2 = new SimpleArrayMap(0);
                    View view9 = fragment3.mView;
                    p0.a.r(view9, "firstOut.fragment.mView");
                    n(view9, simpleArrayMap2);
                    simpleArrayMap2.l(sharedElementSourceNames);
                    if (sharedElementCallback != null) {
                        if (Log.isLoggable(str7, 2)) {
                            Log.v(str7, "Executing exit callback for operation " + operation7);
                        }
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i5 = size3 - 1;
                                String str8 = sharedElementSourceNames.get(size3);
                                View view10 = (View) simpleArrayMap2.get(str8);
                                if (view10 == null) {
                                    simpleArrayMap.remove(str8);
                                    arrayList5 = sharedElementSourceNames;
                                } else {
                                    arrayList5 = sharedElementSourceNames;
                                    if (!p0.a.g(str8, ViewCompat.o(view10))) {
                                        simpleArrayMap.put(ViewCompat.o(view10), (String) simpleArrayMap.remove(str8));
                                    }
                                }
                                if (i5 < 0) {
                                    break;
                                }
                                size3 = i5;
                                sharedElementSourceNames = arrayList5;
                            }
                        } else {
                            arrayList5 = sharedElementSourceNames;
                        }
                    } else {
                        arrayList5 = sharedElementSourceNames;
                        simpleArrayMap.l(simpleArrayMap2.keySet());
                    }
                    ?? simpleArrayMap3 = new SimpleArrayMap(0);
                    View view11 = fragment2.mView;
                    p0.a.r(view11, "lastIn.fragment.mView");
                    n(view11, simpleArrayMap3);
                    simpleArrayMap3.l(sharedElementTargetNames2);
                    simpleArrayMap3.l(simpleArrayMap.values());
                    if (sharedElementCallback2 != null) {
                        if (Log.isLoggable(str7, 2)) {
                            Log.v(str7, "Executing enter callback for operation " + operation9);
                        }
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i6 = size4 - 1;
                                String str9 = sharedElementTargetNames2.get(size4);
                                View view12 = (View) simpleArrayMap3.get(str9);
                                if (view12 == null) {
                                    p0.a.r(str9, "name");
                                    String b2 = FragmentTransition.b(simpleArrayMap, str9);
                                    if (b2 != null) {
                                        simpleArrayMap.remove(b2);
                                    }
                                    str6 = str7;
                                } else {
                                    str6 = str7;
                                    if (!p0.a.g(str9, ViewCompat.o(view12))) {
                                        p0.a.r(str9, "name");
                                        String b3 = FragmentTransition.b(simpleArrayMap, str9);
                                        if (b3 != null) {
                                            simpleArrayMap.put(b3, ViewCompat.o(view12));
                                        }
                                    }
                                }
                                if (i6 < 0) {
                                    break;
                                }
                                size4 = i6;
                                str7 = str6;
                            }
                        } else {
                            str6 = str7;
                        }
                    } else {
                        str6 = str7;
                        FragmentTransitionImpl fragmentTransitionImpl4 = FragmentTransition.f19828a;
                        for (int i7 = simpleArrayMap.f1608c - 1; -1 < i7; i7--) {
                            if (!simpleArrayMap3.containsKey((String) simpleArrayMap.k(i7))) {
                                simpleArrayMap.i(i7);
                            }
                        }
                    }
                    t.v0(simpleArrayMap2.entrySet(), new DefaultSpecialEffectsController$retainMatchingViews$1(simpleArrayMap.keySet()), false);
                    t.v0(simpleArrayMap3.entrySet(), new DefaultSpecialEffectsController$retainMatchingViews$1(simpleArrayMap.values()), false);
                    if (simpleArrayMap.isEmpty()) {
                        arrayList10.clear();
                        arrayList11.clear();
                        it8 = it9;
                        str = str5;
                        arrayList7 = arrayList4;
                        linkedHashMap3 = linkedHashMap4;
                        view6 = view8;
                        rect = rect2;
                        fragmentTransitionImpl2 = fragmentTransitionImpl3;
                        viewGroup3 = viewGroup4;
                        str7 = str6;
                        obj7 = null;
                    } else {
                        FragmentTransition.a(fragment2, fragment3, z2, simpleArrayMap2);
                        viewGroup2 = viewGroup4;
                        OneShotPreDrawListener.a(viewGroup2, new a(operation9, operation7, z2, simpleArrayMap3));
                        arrayList10.addAll(simpleArrayMap2.values());
                        if (!arrayList5.isEmpty()) {
                            View view13 = (View) simpleArrayMap2.get(arrayList5.get(0));
                            fragmentTransitionImpl = fragmentTransitionImpl3;
                            obj4 = r2;
                            fragmentTransitionImpl.m(view13, obj4);
                            view7 = view13;
                        } else {
                            fragmentTransitionImpl = fragmentTransitionImpl3;
                            obj4 = r2;
                        }
                        arrayList11.addAll(simpleArrayMap3.values());
                        if (!(!sharedElementTargetNames2.isEmpty()) || (view3 = (View) simpleArrayMap3.get(sharedElementTargetNames2.get(0))) == null) {
                            rect = rect2;
                        } else {
                            rect = rect2;
                            OneShotPreDrawListener.a(viewGroup2, new d(fragmentTransitionImpl, view3, rect, 2));
                            z4 = true;
                        }
                        view6 = view8;
                        fragmentTransitionImpl.p(obj4, view6, arrayList10);
                        fragmentTransitionImpl.l(obj4, null, null, obj4, arrayList11);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap2 = linkedHashMap4;
                        linkedHashMap2.put(operation7, bool);
                        linkedHashMap2.put(operation9, bool);
                        obj7 = obj4;
                    }
                }
                linkedHashMap3 = linkedHashMap2;
                fragmentTransitionImpl2 = fragmentTransitionImpl;
                it8 = it9;
                str = str5;
                arrayList7 = arrayList4;
                viewGroup3 = viewGroup2;
                str7 = str6;
            }
            String str10 = str;
            String str11 = str7;
            ArrayList arrayList12 = arrayList7;
            viewGroup = viewGroup3;
            FragmentTransitionImpl fragmentTransitionImpl5 = fragmentTransitionImpl2;
            linkedHashMap = linkedHashMap3;
            ArrayList arrayList13 = new ArrayList();
            Iterator it12 = arrayList12.iterator();
            Object obj9 = null;
            Object obj10 = null;
            while (it12.hasNext()) {
                TransitionInfo transitionInfo3 = (TransitionInfo) it12.next();
                boolean b4 = transitionInfo3.b();
                Iterator it13 = it12;
                SpecialEffectsController.Operation operation11 = transitionInfo3.f19671a;
                if (b4) {
                    obj3 = simpleArrayMap;
                    linkedHashMap.put(operation11, Boolean.FALSE);
                    transitionInfo3.a();
                } else {
                    obj3 = simpleArrayMap;
                    Object f2 = fragmentTransitionImpl5.f(transitionInfo3.f19673c);
                    boolean z5 = obj7 != null && (operation11 == operation7 || operation11 == operation9);
                    if (f2 != null) {
                        SpecialEffectsController.Operation operation12 = operation9;
                        ArrayList arrayList14 = new ArrayList();
                        Object obj11 = obj7;
                        View view14 = operation11.f19867c.mView;
                        Object obj12 = obj10;
                        String str12 = str10;
                        p0.a.r(view14, str12);
                        m(view14, arrayList14);
                        if (z5) {
                            if (operation11 == operation7) {
                                arrayList14.removeAll(u.e1(arrayList10));
                            } else {
                                arrayList14.removeAll(u.e1(arrayList11));
                            }
                        }
                        if (arrayList14.isEmpty()) {
                            fragmentTransitionImpl5.a(view6, f2);
                            view = view6;
                            str10 = str12;
                        } else {
                            fragmentTransitionImpl5.b(f2, arrayList14);
                            fragmentTransitionImpl5.l(f2, f2, arrayList14, null, null);
                            str10 = str12;
                            SpecialEffectsController.Operation.State state5 = state2;
                            if (operation11.f19865a == state5) {
                                arrayList3.remove(operation11);
                                view = view6;
                                ArrayList arrayList15 = new ArrayList(arrayList14);
                                Fragment fragment4 = operation11.f19867c;
                                state2 = state5;
                                arrayList15.remove(fragment4.mView);
                                fragmentTransitionImpl5.k(f2, fragment4.mView, arrayList15);
                                OneShotPreDrawListener.a(viewGroup, new androidx.compose.material.ripple.a(arrayList14, 3));
                            } else {
                                view = view6;
                                state2 = state5;
                            }
                        }
                        SpecialEffectsController.Operation.State state6 = state4;
                        if (operation11.f19865a == state6) {
                            arrayList13.addAll(arrayList14);
                            if (z4) {
                                fragmentTransitionImpl5.n(f2, rect);
                            }
                            view2 = view7;
                        } else {
                            view2 = view7;
                            fragmentTransitionImpl5.m(view2, f2);
                        }
                        linkedHashMap.put(operation11, Boolean.TRUE);
                        if (transitionInfo3.d) {
                            obj9 = fragmentTransitionImpl5.j(obj9, f2);
                            it12 = it13;
                            view7 = view2;
                            state4 = state6;
                            view6 = view;
                            simpleArrayMap = obj3;
                            operation9 = operation12;
                            obj7 = obj11;
                            obj10 = obj12;
                        } else {
                            it12 = it13;
                            view7 = view2;
                            state4 = state6;
                            view6 = view;
                            operation9 = operation12;
                            obj7 = obj11;
                            obj10 = fragmentTransitionImpl5.j(obj12, f2);
                            simpleArrayMap = obj3;
                        }
                    } else if (!z5) {
                        linkedHashMap.put(operation11, Boolean.FALSE);
                        transitionInfo3.a();
                    }
                }
                it12 = it13;
                simpleArrayMap = obj3;
            }
            ArrayMap arrayMap = simpleArrayMap;
            operation = operation9;
            Object i8 = fragmentTransitionImpl5.i(obj9, obj10, obj7);
            if (i8 == null) {
                operation2 = operation7;
                str3 = str11;
            } else {
                ArrayList arrayList16 = new ArrayList();
                Iterator it14 = arrayList12.iterator();
                while (it14.hasNext()) {
                    Object next3 = it14.next();
                    if (!((TransitionInfo) next3).b()) {
                        arrayList16.add(next3);
                    }
                }
                Iterator it15 = arrayList16.iterator();
                while (it15.hasNext()) {
                    TransitionInfo transitionInfo4 = (TransitionInfo) it15.next();
                    Object obj13 = transitionInfo4.f19673c;
                    SpecialEffectsController.Operation operation13 = transitionInfo4.f19671a;
                    SpecialEffectsController.Operation operation14 = operation;
                    boolean z6 = obj7 != null && (operation13 == operation7 || operation13 == operation14);
                    if (obj13 != null || z6) {
                        WeakHashMap weakHashMap = ViewCompat.f18740a;
                        if (viewGroup.isLaidOut()) {
                            str4 = str11;
                            Fragment fragment5 = operation13.f19867c;
                            fragmentTransitionImpl5.o(i8, transitionInfo4.f19672b, new i(transitionInfo4, operation13, 2));
                        } else {
                            str4 = str11;
                            if (Log.isLoggable(str4, 2)) {
                                Log.v(str4, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation13);
                            }
                            transitionInfo4.a();
                        }
                    } else {
                        str4 = str11;
                    }
                    operation = operation14;
                    str11 = str4;
                }
                SpecialEffectsController.Operation operation15 = operation;
                str3 = str11;
                WeakHashMap weakHashMap2 = ViewCompat.f18740a;
                if (viewGroup.isLaidOut()) {
                    FragmentTransition.c(4, arrayList13);
                    ArrayList arrayList17 = new ArrayList();
                    int size5 = arrayList11.size();
                    for (int i9 = 0; i9 < size5; i9++) {
                        View view15 = (View) arrayList11.get(i9);
                        arrayList17.add(ViewCompat.o(view15));
                        ViewCompat.M(view15, null);
                    }
                    if (Log.isLoggable(str3, 2)) {
                        Log.v(str3, ">>>>> Beginning transition <<<<<");
                        Log.v(str3, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator it16 = arrayList10.iterator(); it16.hasNext(); it16 = it16) {
                            Object next4 = it16.next();
                            p0.a.r(next4, "sharedElementFirstOutViews");
                            View view16 = (View) next4;
                            Log.v(str3, "View: " + view16 + " Name: " + ViewCompat.o(view16));
                        }
                        Log.v(str3, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator it17 = arrayList11.iterator(); it17.hasNext(); it17 = it17) {
                            Object next5 = it17.next();
                            p0.a.r(next5, "sharedElementLastInViews");
                            View view17 = (View) next5;
                            Log.v(str3, "View: " + view17 + " Name: " + ViewCompat.o(view17));
                        }
                    }
                    fragmentTransitionImpl5.c(viewGroup, i8);
                    int size6 = arrayList11.size();
                    ArrayList arrayList18 = new ArrayList();
                    int i10 = 0;
                    while (i10 < size6) {
                        View view18 = (View) arrayList10.get(i10);
                        String o2 = ViewCompat.o(view18);
                        arrayList18.add(o2);
                        if (o2 == null) {
                            operation4 = operation7;
                            operation3 = operation15;
                        } else {
                            operation3 = operation15;
                            ViewCompat.M(view18, null);
                            String str13 = (String) arrayMap.get(o2);
                            int i11 = 0;
                            while (true) {
                                operation4 = operation7;
                                if (i11 >= size6) {
                                    break;
                                }
                                if (str13.equals(arrayList17.get(i11))) {
                                    ViewCompat.M((View) arrayList11.get(i11), o2);
                                    break;
                                } else {
                                    i11++;
                                    operation7 = operation4;
                                }
                            }
                        }
                        i10++;
                        operation7 = operation4;
                        operation15 = operation3;
                    }
                    operation2 = operation7;
                    operation = operation15;
                    OneShotPreDrawListener.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.1

                        /* renamed from: a */
                        public final /* synthetic */ int f19840a;

                        /* renamed from: b */
                        public final /* synthetic */ ArrayList f19841b;

                        /* renamed from: c */
                        public final /* synthetic */ ArrayList f19842c;
                        public final /* synthetic */ ArrayList d;

                        /* renamed from: f */
                        public final /* synthetic */ ArrayList f19843f;

                        public AnonymousClass1(int size62, ArrayList arrayList112, ArrayList arrayList172, ArrayList arrayList102, ArrayList arrayList182) {
                            r1 = size62;
                            r2 = arrayList112;
                            r3 = arrayList172;
                            r4 = arrayList102;
                            r5 = arrayList182;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            for (int i12 = 0; i12 < r1; i12++) {
                                ViewCompat.M((View) r2.get(i12), (String) r3.get(i12));
                                ViewCompat.M((View) r4.get(i12), (String) r5.get(i12));
                            }
                        }
                    });
                    z3 = false;
                    FragmentTransition.c(0, arrayList13);
                    fragmentTransitionImpl5.q(obj7, arrayList102, arrayList112);
                } else {
                    operation2 = operation7;
                    operation = operation15;
                }
            }
            z3 = false;
        }
        boolean containsValue = linkedHashMap.containsValue(Boolean.TRUE);
        Context context = viewGroup.getContext();
        ArrayList arrayList19 = new ArrayList();
        Iterator it18 = arrayList2.iterator();
        boolean z7 = z3;
        while (it18.hasNext()) {
            final AnimationInfo animationInfo3 = (AnimationInfo) it18.next();
            if (animationInfo3.b()) {
                animationInfo3.a();
            } else {
                p0.a.r(context, "context");
                FragmentAnim.AnimationOrAnimator c3 = animationInfo3.c(context);
                if (c3 == null) {
                    animationInfo3.a();
                } else {
                    final Animator animator = c3.f19722b;
                    if (animator == null) {
                        arrayList19.add(animationInfo3);
                    } else {
                        final SpecialEffectsController.Operation operation16 = animationInfo3.f19671a;
                        Fragment fragment6 = operation16.f19867c;
                        if (p0.a.g(linkedHashMap.get(operation16), Boolean.TRUE)) {
                            if (Log.isLoggable(str3, 2)) {
                                Log.v(str3, "Ignoring Animator set on " + fragment6 + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo3.a();
                        } else {
                            SpecialEffectsController.Operation.State state7 = state2;
                            boolean z8 = operation16.f19865a == state7 ? true : z3;
                            ArrayList arrayList20 = arrayList3;
                            if (z8) {
                                arrayList20.remove(operation16);
                            }
                            final View view19 = fragment6.mView;
                            viewGroup.startViewTransition(view19);
                            final boolean z9 = z8;
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator2) {
                                    p0.a.s(animator2, "anim");
                                    ViewGroup viewGroup5 = DefaultSpecialEffectsController.this.f19861a;
                                    View view20 = view19;
                                    viewGroup5.endViewTransition(view20);
                                    boolean z10 = z9;
                                    SpecialEffectsController.Operation operation17 = operation16;
                                    if (z10) {
                                        SpecialEffectsController.Operation.State state8 = operation17.f19865a;
                                        p0.a.r(view20, "viewToAnimate");
                                        state8.a(view20);
                                    }
                                    animationInfo3.a();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "Animator from operation " + operation17 + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view19);
                            animator.start();
                            if (Log.isLoggable(str3, 2)) {
                                StringBuilder sb = new StringBuilder("Animator from operation ");
                                operation5 = operation16;
                                sb.append(operation5);
                                sb.append(" has started.");
                                Log.v(str3, sb.toString());
                            } else {
                                operation5 = operation16;
                            }
                            animationInfo3.f19672b.b(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.b
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public final void onCancel() {
                                    SpecialEffectsController.Operation operation17 = operation5;
                                    p0.a.s(operation17, "$operation");
                                    animator.end();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "Animator from operation " + operation17 + " has been canceled.");
                                    }
                                }
                            });
                            arrayList3 = arrayList20;
                            state2 = state7;
                            z7 = true;
                            z3 = false;
                        }
                    }
                }
            }
        }
        ArrayList arrayList21 = arrayList3;
        Iterator it19 = arrayList19.iterator();
        while (it19.hasNext()) {
            final AnimationInfo animationInfo4 = (AnimationInfo) it19.next();
            final SpecialEffectsController.Operation operation17 = animationInfo4.f19671a;
            Fragment fragment7 = operation17.f19867c;
            if (containsValue) {
                if (Log.isLoggable(str3, 2)) {
                    Log.v(str3, "Ignoring Animation set on " + fragment7 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo4.a();
            } else if (z7) {
                if (Log.isLoggable(str3, 2)) {
                    Log.v(str3, "Ignoring Animation set on " + fragment7 + " as Animations cannot run alongside Animators.");
                }
                animationInfo4.a();
            } else {
                final View view20 = fragment7.mView;
                p0.a.r(context, "context");
                FragmentAnim.AnimationOrAnimator c4 = animationInfo4.c(context);
                if (c4 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation = c4.f19721a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (operation17.f19865a != SpecialEffectsController.Operation.State.f19873a) {
                    view20.startAnimation(animation);
                    animationInfo4.a();
                    defaultSpecialEffectsController = this;
                } else {
                    viewGroup.startViewTransition(view20);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation, viewGroup, view20);
                    defaultSpecialEffectsController = this;
                    endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation2) {
                            p0.a.s(animation2, "animation");
                            DefaultSpecialEffectsController defaultSpecialEffectsController2 = defaultSpecialEffectsController;
                            defaultSpecialEffectsController2.f19861a.post(new d(defaultSpecialEffectsController2, view20, animationInfo4, 0));
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Animation from operation " + operation17 + " has ended.");
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation2) {
                            p0.a.s(animation2, "animation");
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation2) {
                            p0.a.s(animation2, "animation");
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Animation from operation " + operation17 + " has reached onAnimationStart.");
                            }
                        }
                    });
                    view20.startAnimation(endViewTransitionAnimation);
                    if (Log.isLoggable(str3, 2)) {
                        Log.v(str3, "Animation from operation " + operation17 + " has started.");
                    }
                }
                animationInfo4.f19672b.b(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.c
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public final void onCancel() {
                        DefaultSpecialEffectsController defaultSpecialEffectsController2 = defaultSpecialEffectsController;
                        p0.a.s(defaultSpecialEffectsController2, "this$0");
                        DefaultSpecialEffectsController.AnimationInfo animationInfo5 = animationInfo4;
                        p0.a.s(animationInfo5, "$animationInfo");
                        SpecialEffectsController.Operation operation18 = operation17;
                        p0.a.s(operation18, "$operation");
                        View view21 = view20;
                        view21.clearAnimation();
                        defaultSpecialEffectsController2.f19861a.endViewTransition(view21);
                        animationInfo5.a();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Animation from operation " + operation18 + " has been cancelled.");
                        }
                    }
                });
            }
        }
        Iterator it20 = arrayList21.iterator();
        while (it20.hasNext()) {
            SpecialEffectsController.Operation operation18 = (SpecialEffectsController.Operation) it20.next();
            View view21 = operation18.f19867c.mView;
            SpecialEffectsController.Operation.State state8 = operation18.f19865a;
            p0.a.r(view21, ViewHierarchyConstants.VIEW_KEY);
            state8.a(view21);
        }
        arrayList21.clear();
        if (Log.isLoggable(str3, 2)) {
            Log.v(str3, "Completed executing operations from " + operation2 + str2 + operation);
        }
    }
}
