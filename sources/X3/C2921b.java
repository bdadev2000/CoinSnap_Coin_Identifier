package x3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import x.l;

/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2921b {

    /* renamed from: a, reason: collision with root package name */
    public final l f24229a = new l();
    public final l b = new l();

    public static C2921b a(Context context, int i9) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i9);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e4) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i9), e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [x3.c, java.lang.Object] */
    public static C2921b b(ArrayList arrayList) {
        C2921b c2921b = new C2921b();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            Animator animator = (Animator) arrayList.get(i9);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                c2921b.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = AbstractC2920a.f24227c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = AbstractC2920a.f24228d;
                    }
                } else {
                    interpolator = AbstractC2920a.b;
                }
                ?? obj = new Object();
                obj.f24232d = 0;
                obj.f24233e = 1;
                obj.f24230a = startDelay;
                obj.b = duration;
                obj.f24231c = interpolator;
                obj.f24232d = objectAnimator.getRepeatCount();
                obj.f24233e = objectAnimator.getRepeatMode();
                c2921b.f24229a.put(propertyName, obj);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return c2921b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2921b)) {
            return false;
        }
        return this.f24229a.equals(((C2921b) obj).f24229a);
    }

    public final int hashCode() {
        return this.f24229a.hashCode();
    }

    public final String toString() {
        return "\n" + C2921b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f24229a + "}\n";
    }
}
