package androidx.transition;

import android.animation.TimeInterpolator;
import android.support.v4.media.d;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TransitionSet extends Transition {

    /* renamed from: c, reason: collision with root package name */
    public int f21608c;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f21606a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f21607b = true;
    public boolean d = false;

    /* renamed from: f, reason: collision with root package name */
    public int f21609f = 0;

    /* loaded from: classes2.dex */
    public static class TransitionSetListener extends TransitionListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public TransitionSet f21612a;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            TransitionSet transitionSet = this.f21612a;
            int i2 = transitionSet.f21608c - 1;
            transitionSet.f21608c = i2;
            if (i2 == 0) {
                transitionSet.d = false;
                transitionSet.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            TransitionSet transitionSet = this.f21612a;
            if (transitionSet.d) {
                return;
            }
            transitionSet.start();
            transitionSet.d = true;
        }
    }

    @Override // androidx.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.addListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public final Transition addTarget(View view) {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            ((Transition) this.f21606a.get(i2)).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.f21606a.get(i2)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.f21618b)) {
            Iterator it = this.f21606a.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.isValidTarget(transitionValues.f21618b)) {
                    transition.captureEndValues(transitionValues);
                    transitionValues.f21619c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void capturePropagationValues(TransitionValues transitionValues) {
        super.capturePropagationValues(transitionValues);
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.f21606a.get(i2)).capturePropagationValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.f21618b)) {
            Iterator it = this.f21606a.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.isValidTarget(transitionValues.f21618b)) {
                    transition.captureStartValues(transitionValues);
                    transitionValues.f21619c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void createAnimators(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transition = (Transition) this.f21606a.get(i2);
            if (startDelay > 0 && (this.f21607b || i2 == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final Transition excludeTarget(View view, boolean z2) {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            ((Transition) this.f21606a.get(i2)).excludeTarget(view, z2);
        }
        return super.excludeTarget(view, z2);
    }

    @Override // androidx.transition.Transition
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.f21606a.get(i2)).forceToEnd(viewGroup);
        }
    }

    public final void g(Transition transition) {
        this.f21606a.add(transition);
        transition.mParent = this;
        long j2 = this.mDuration;
        if (j2 >= 0) {
            transition.setDuration(j2);
        }
        if ((this.f21609f & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.f21609f & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.f21609f & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.f21609f & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
    }

    public final void h(Transition transition) {
        this.f21606a.remove(transition);
        transition.mParent = null;
    }

    @Override // androidx.transition.Transition
    public final boolean hasAnimators() {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            if (((Transition) this.f21606a.get(i2)).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    public final void i(long j2) {
        ArrayList arrayList;
        super.setDuration(j2);
        if (this.mDuration < 0 || (arrayList = this.f21606a) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.f21606a.get(i2)).setDuration(j2);
        }
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((Transition) this.f21606a.get(i2)).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final TransitionSet setInterpolator(TimeInterpolator timeInterpolator) {
        this.f21609f |= 1;
        ArrayList arrayList = this.f21606a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Transition) this.f21606a.get(i2)).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    public final void k(int i2) {
        if (i2 == 0) {
            this.f21607b = true;
        } else {
            if (i2 != 1) {
                throw new AndroidRuntimeException(d.i("Invalid parameter for TransitionSet ordering: ", i2));
            }
            this.f21607b = false;
        }
    }

    @Override // androidx.transition.Transition
    public final void pause(View view) {
        super.pause(view);
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.f21606a.get(i2)).pause(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        TransitionListenerAdapter transitionListenerAdapter = new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
                TransitionSet transitionSet = TransitionSet.this;
                transitionSet.f21606a.remove(transition);
                if (transitionSet.hasAnimators()) {
                    return;
                }
                transitionSet.notifyListeners(Transition.TransitionNotification.f21598c, false);
                transitionSet.mEnded = true;
                transitionSet.notifyListeners(Transition.TransitionNotification.f21597b, false);
            }
        };
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            Transition transition = (Transition) this.f21606a.get(i2);
            transition.addListener(transitionListenerAdapter);
            transition.prepareAnimatorsForSeeking();
            long totalDurationMillis = transition.getTotalDurationMillis();
            if (this.f21607b) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j2 = this.mTotalDuration;
                transition.mSeekOffsetInParent = j2;
                this.mTotalDuration = j2 + totalDurationMillis;
            }
        }
    }

    @Override // androidx.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.removeListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public final Transition removeTarget(int i2) {
        for (int i3 = 0; i3 < this.f21606a.size(); i3++) {
            ((Transition) this.f21606a.get(i3)).removeTarget(i2);
        }
        return (TransitionSet) super.removeTarget(i2);
    }

    @Override // androidx.transition.Transition
    public final void resume(View view) {
        super.resume(view);
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.f21606a.get(i2)).resume(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.transition.TransitionSet$TransitionSetListener, java.lang.Object, androidx.transition.Transition$TransitionListener] */
    @Override // androidx.transition.Transition
    public final void runAnimators() {
        if (this.f21606a.isEmpty()) {
            start();
            end();
            return;
        }
        ?? obj = new Object();
        obj.f21612a = this;
        Iterator it = this.f21606a.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).addListener(obj);
        }
        this.f21608c = this.f21606a.size();
        if (this.f21607b) {
            Iterator it2 = this.f21606a.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).runAnimators();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f21606a.size(); i2++) {
            Transition transition = (Transition) this.f21606a.get(i2 - 1);
            final Transition transition2 = (Transition) this.f21606a.get(i2);
            transition.addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition3) {
                    Transition.this.runAnimators();
                    transition3.removeListener(this);
                }
            });
        }
        Transition transition3 = (Transition) this.f21606a.get(0);
        if (transition3 != null) {
            transition3.runAnimators();
        }
    }

    @Override // androidx.transition.Transition
    public final void setCanRemoveViews(boolean z2) {
        super.setCanRemoveViews(z2);
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.f21606a.get(i2)).setCanRemoveViews(z2);
        }
    }

    @Override // androidx.transition.Transition
    public final void setCurrentPlayTimeMillis(long j2, long j3) {
        long totalDurationMillis = getTotalDurationMillis();
        if (this.mParent != null) {
            if (j2 < 0 && j3 < 0) {
                return;
            }
            if (j2 > totalDurationMillis && j3 > totalDurationMillis) {
                return;
            }
        }
        boolean z2 = j2 < j3;
        if ((j2 >= 0 && j3 < 0) || (j2 <= totalDurationMillis && j3 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(Transition.TransitionNotification.f21596a, z2);
        }
        if (this.f21607b) {
            for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
                ((Transition) this.f21606a.get(i2)).setCurrentPlayTimeMillis(j2, j3);
            }
        } else {
            int i3 = 1;
            while (true) {
                if (i3 >= this.f21606a.size()) {
                    i3 = this.f21606a.size();
                    break;
                } else if (((Transition) this.f21606a.get(i3)).mSeekOffsetInParent > j3) {
                    break;
                } else {
                    i3++;
                }
            }
            int i4 = i3 - 1;
            if (j2 >= j3) {
                while (i4 < this.f21606a.size()) {
                    Transition transition = (Transition) this.f21606a.get(i4);
                    long j4 = transition.mSeekOffsetInParent;
                    int i5 = i4;
                    long j5 = j2 - j4;
                    if (j5 < 0) {
                        break;
                    }
                    transition.setCurrentPlayTimeMillis(j5, j3 - j4);
                    i4 = i5 + 1;
                }
            } else {
                while (i4 >= 0) {
                    Transition transition2 = (Transition) this.f21606a.get(i4);
                    long j6 = transition2.mSeekOffsetInParent;
                    long j7 = j2 - j6;
                    transition2.setCurrentPlayTimeMillis(j7, j3 - j6);
                    if (j7 >= 0) {
                        break;
                    } else {
                        i4--;
                    }
                }
            }
        }
        if (this.mParent != null) {
            if ((j2 <= totalDurationMillis || j3 > totalDurationMillis) && (j2 >= 0 || j3 < 0)) {
                return;
            }
            if (j2 > totalDurationMillis) {
                this.mEnded = true;
            }
            notifyListeners(Transition.TransitionNotification.f21597b, z2);
        }
    }

    @Override // androidx.transition.Transition
    public final /* bridge */ /* synthetic */ Transition setDuration(long j2) {
        i(j2);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        super.setEpicenterCallback(epicenterCallback);
        this.f21609f |= 8;
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.f21606a.get(i2)).setEpicenterCallback(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    public final void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f21609f |= 4;
        if (this.f21606a != null) {
            for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
                ((Transition) this.f21606a.get(i2)).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void setPropagation(TransitionPropagation transitionPropagation) {
        super.setPropagation(transitionPropagation);
        this.f21609f |= 2;
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.f21606a.get(i2)).setPropagation(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    public final Transition setStartDelay(long j2) {
        return (TransitionSet) super.setStartDelay(j2);
    }

    @Override // androidx.transition.Transition
    public final String toString(String str) {
        String transition = super.toString(str);
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            StringBuilder B = androidx.compose.foundation.text.input.a.B(transition, "\n");
            B.append(((Transition) this.f21606a.get(i2)).toString(str + "  "));
            transition = B.toString();
        }
        return transition;
    }

    @Override // androidx.transition.Transition
    /* renamed from: clone */
    public final Transition mo7clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo7clone();
        transitionSet.f21606a = new ArrayList();
        int size = this.f21606a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition mo7clone = ((Transition) this.f21606a.get(i2)).mo7clone();
            transitionSet.f21606a.add(mo7clone);
            mo7clone.mParent = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final Transition addTarget(int i2) {
        for (int i3 = 0; i3 < this.f21606a.size(); i3++) {
            ((Transition) this.f21606a.get(i3)).addTarget(i2);
        }
        return (TransitionSet) super.addTarget(i2);
    }

    @Override // androidx.transition.Transition
    public final Transition excludeTarget(String str, boolean z2) {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            ((Transition) this.f21606a.get(i2)).excludeTarget(str, z2);
        }
        return super.excludeTarget(str, z2);
    }

    @Override // androidx.transition.Transition
    public final Transition removeTarget(View view) {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            ((Transition) this.f21606a.get(i2)).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    public final Transition addTarget(String str) {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            ((Transition) this.f21606a.get(i2)).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    public final Transition excludeTarget(int i2, boolean z2) {
        for (int i3 = 0; i3 < this.f21606a.size(); i3++) {
            ((Transition) this.f21606a.get(i3)).excludeTarget(i2, z2);
        }
        return super.excludeTarget(i2, z2);
    }

    @Override // androidx.transition.Transition
    public final Transition removeTarget(Class cls) {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            ((Transition) this.f21606a.get(i2)).removeTarget((Class<?>) cls);
        }
        return (TransitionSet) super.removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    public final Transition addTarget(Class cls) {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            ((Transition) this.f21606a.get(i2)).addTarget((Class<?>) cls);
        }
        return (TransitionSet) super.addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    public final Transition excludeTarget(Class cls, boolean z2) {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            ((Transition) this.f21606a.get(i2)).excludeTarget((Class<?>) cls, z2);
        }
        return super.excludeTarget((Class<?>) cls, z2);
    }

    @Override // androidx.transition.Transition
    public final Transition removeTarget(String str) {
        for (int i2 = 0; i2 < this.f21606a.size(); i2++) {
            ((Transition) this.f21606a.get(i2)).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }
}
