package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TransitionManager {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoTransition f21599a = new AutoTransition();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f21600b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f21601c = new ArrayList();

    /* loaded from: classes2.dex */
    public static class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public Transition f21602a;

        /* renamed from: b, reason: collision with root package name */
        public ViewGroup f21603b;

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ViewGroup viewGroup = this.f21603b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList arrayList = TransitionManager.f21601c;
            ViewGroup viewGroup2 = this.f21603b;
            if (!arrayList.remove(viewGroup2)) {
                return true;
            }
            final ArrayMap b2 = TransitionManager.b();
            ArrayList arrayList2 = (ArrayList) b2.get(viewGroup2);
            ArrayList arrayList3 = null;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                b2.put(viewGroup2, arrayList2);
            } else if (arrayList2.size() > 0) {
                arrayList3 = new ArrayList(arrayList2);
            }
            Transition transition = this.f21602a;
            arrayList2.add(transition);
            transition.addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition2) {
                    ((ArrayList) b2.get(MultiListener.this.f21603b)).remove(transition2);
                    transition2.removeListener(this);
                }
            });
            transition.captureValues(viewGroup2, false);
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(viewGroup2);
                }
            }
            transition.playTransition(viewGroup2);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f21603b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList arrayList = TransitionManager.f21601c;
            ViewGroup viewGroup2 = this.f21603b;
            arrayList.remove(viewGroup2);
            ArrayList arrayList2 = (ArrayList) TransitionManager.b().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(viewGroup2);
                }
            }
            this.f21602a.clearValues(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, androidx.transition.TransitionManager$MultiListener] */
    public static void a(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = f21601c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = f21599a;
        }
        Transition mo7clone = transition.mo7clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).pause(viewGroup);
            }
        }
        if (mo7clone != null) {
            mo7clone.captureValues(viewGroup, true);
        }
        if (((Scene) viewGroup.getTag(com.cooldev.gba.emulator.gameboy.R.id.transition_current_scene)) != null) {
            throw null;
        }
        viewGroup.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_current_scene, null);
        if (mo7clone != null) {
            ?? obj = new Object();
            obj.f21602a = mo7clone;
            obj.f21603b = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    public static ArrayMap b() {
        ArrayMap arrayMap;
        ThreadLocal threadLocal = f21600b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ?? simpleArrayMap = new SimpleArrayMap();
        threadLocal.set(new WeakReference(simpleArrayMap));
        return simpleArrayMap;
    }
}
