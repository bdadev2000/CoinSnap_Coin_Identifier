package s9;

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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import r.k;

/* loaded from: classes3.dex */
public final class b {
    public final k a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f24936b = new k();

    public static b a(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e2);
            return null;
        }
    }

    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bVar.f24936b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = a.f24934c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = a.f24935d;
                    }
                } else {
                    interpolator = a.f24933b;
                }
                c cVar = new c(startDelay, duration, interpolator);
                cVar.f24939d = objectAnimator.getRepeatCount();
                cVar.f24940e = objectAnimator.getRepeatMode();
                bVar.a.put(propertyName, cVar);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + b.class.getName() + AbstractJsonLexerKt.BEGIN_OBJ + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
