package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {

    /* renamed from: l, reason: collision with root package name */
    public static final ViewProperty f19471l = new FloatPropertyCompat("scaleX");

    /* renamed from: m, reason: collision with root package name */
    public static final ViewProperty f19472m = new FloatPropertyCompat("scaleY");

    /* renamed from: n, reason: collision with root package name */
    public static final ViewProperty f19473n = new FloatPropertyCompat("rotation");

    /* renamed from: o, reason: collision with root package name */
    public static final ViewProperty f19474o = new FloatPropertyCompat("rotationX");

    /* renamed from: p, reason: collision with root package name */
    public static final ViewProperty f19475p = new FloatPropertyCompat("rotationY");

    /* renamed from: q, reason: collision with root package name */
    public static final ViewProperty f19476q = new FloatPropertyCompat("alpha");
    public final Object d;
    public final FloatPropertyCompat e;

    /* renamed from: i, reason: collision with root package name */
    public final float f19483i;

    /* renamed from: a, reason: collision with root package name */
    public float f19477a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f19478b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19479c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19480f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float f19481g = -3.4028235E38f;

    /* renamed from: h, reason: collision with root package name */
    public long f19482h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f19484j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f19485k = new ArrayList();

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass1 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setTranslationX(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$10, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass10 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setY(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$11, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass11 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ViewCompat.r((View) obj);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ViewCompat.P((View) obj, f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$12, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass12 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setAlpha(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$13, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass13 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setScrollX((int) f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$14, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass14 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setScrollY((int) f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$15, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass15 extends FloatPropertyCompat {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            throw null;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            throw null;
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass2 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setTranslationY(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass3 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ViewCompat.p((View) obj);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ViewCompat.N((View) obj, f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass4 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setScaleX(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$5, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass5 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setScaleY(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$6, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass6 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setRotation(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$7, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass7 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setRotationX(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$8, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass8 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setRotationY(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$9, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass9 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f2) {
            ((View) obj).setX(f2);
        }
    }

    /* loaded from: classes3.dex */
    public static class MassState {

        /* renamed from: a, reason: collision with root package name */
        public float f19486a;

        /* renamed from: b, reason: collision with root package name */
        public float f19487b;
    }

    /* loaded from: classes3.dex */
    public interface OnAnimationEndListener {
        void onAnimationEnd();
    }

    /* loaded from: classes3.dex */
    public interface OnAnimationUpdateListener {
        void a(float f2);
    }

    /* loaded from: classes3.dex */
    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
    }

    public DynamicAnimation(Object obj, FloatPropertyCompat floatPropertyCompat) {
        this.d = obj;
        this.e = floatPropertyCompat;
        if (floatPropertyCompat == f19473n || floatPropertyCompat == f19474o || floatPropertyCompat == f19475p) {
            this.f19483i = 0.1f;
            return;
        }
        if (floatPropertyCompat == f19476q) {
            this.f19483i = 0.00390625f;
        } else if (floatPropertyCompat == f19471l || floatPropertyCompat == f19472m) {
            this.f19483i = 0.00390625f;
        } else {
            this.f19483i = 1.0f;
        }
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    public final boolean a(long j2) {
        ArrayList arrayList;
        long j3 = this.f19482h;
        int i2 = 0;
        if (j3 == 0) {
            this.f19482h = j2;
            b(this.f19478b);
            return false;
        }
        this.f19482h = j2;
        boolean c2 = c(j2 - j3);
        float min = Math.min(this.f19478b, Float.MAX_VALUE);
        this.f19478b = min;
        float max = Math.max(min, this.f19481g);
        this.f19478b = max;
        b(max);
        if (c2) {
            this.f19480f = false;
            ThreadLocal threadLocal = AnimationHandler.f19462f;
            if (threadLocal.get() == null) {
                threadLocal.set(new AnimationHandler());
            }
            AnimationHandler animationHandler = (AnimationHandler) threadLocal.get();
            animationHandler.f19463a.remove(this);
            ArrayList arrayList2 = animationHandler.f19464b;
            int indexOf = arrayList2.indexOf(this);
            if (indexOf >= 0) {
                arrayList2.set(indexOf, null);
                animationHandler.e = true;
            }
            this.f19482h = 0L;
            this.f19479c = false;
            while (true) {
                arrayList = this.f19484j;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i2) != null) {
                    ((OnAnimationEndListener) arrayList.get(i2)).onAnimationEnd();
                }
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
        return c2;
    }

    public final void b(float f2) {
        ArrayList arrayList;
        this.e.setValue(this.d, f2);
        int i2 = 0;
        while (true) {
            arrayList = this.f19485k;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                ((OnAnimationUpdateListener) arrayList.get(i2)).a(this.f19478b);
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public abstract boolean c(long j2);
}
