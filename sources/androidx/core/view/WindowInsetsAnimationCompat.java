package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.cooldev.gba.emulator.gameboy.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* renamed from: a, reason: collision with root package name */
    public Impl f18767a;

    /* loaded from: classes.dex */
    public static final class BoundsCompat {

        /* renamed from: a, reason: collision with root package name */
        public final Insets f18768a;

        /* renamed from: b, reason: collision with root package name */
        public final Insets f18769b;

        public BoundsCompat(Insets insets, Insets insets2) {
            this.f18768a = insets;
            this.f18769b = insets2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f18768a + " upper=" + this.f18769b + "}";
        }

        public BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets lowerBound;
            android.graphics.Insets upperBound;
            lowerBound = bounds.getLowerBound();
            this.f18768a = Insets.c(lowerBound);
            upperBound = bounds.getUpperBound();
            this.f18769b = Insets.c(upperBound);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        /* loaded from: classes.dex */
        public @interface DispatchMode {
        }

        public Callback(int i2) {
            this.mDispatchMode = i2;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public abstract WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list);

        public BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            return boundsCompat;
        }
    }

    /* loaded from: classes.dex */
    public static class Impl {

        /* renamed from: a, reason: collision with root package name */
        public final int f18770a;

        /* renamed from: b, reason: collision with root package name */
        public float f18771b;

        /* renamed from: c, reason: collision with root package name */
        public final Interpolator f18772c;
        public final long d;

        public Impl(int i2, Interpolator interpolator, long j2) {
            this.f18770a = i2;
            this.f18772c = interpolator;
            this.d = j2;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.f18772c;
            return interpolator != null ? interpolator.getInterpolation(this.f18771b) : this.f18771b;
        }

        public int c() {
            return this.f18770a;
        }

        public void d(float f2) {
            this.f18771b = f2;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Impl21 extends Impl {
        public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        public static final FastOutLinearInInterpolator f18773f = new FastOutLinearInInterpolator();

        /* renamed from: g, reason: collision with root package name */
        public static final DecelerateInterpolator f18774g = new DecelerateInterpolator();

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final Callback f18775a;

            /* renamed from: b, reason: collision with root package name */
            public WindowInsetsCompat f18776b;

            public Impl21OnApplyWindowInsetsListener(View view, Callback callback) {
                this.f18775a = callback;
                WeakHashMap weakHashMap = ViewCompat.f18740a;
                WindowInsetsCompat a2 = ViewCompat.Api23Impl.a(view);
                this.f18776b = a2 != null ? new WindowInsetsCompat.Builder(a2).f18793a.b() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
                WindowInsetsCompat.Impl impl;
                if (!view.isLaidOut()) {
                    this.f18776b = WindowInsetsCompat.s(view, windowInsets);
                    return Impl21.i(view, windowInsets);
                }
                final WindowInsetsCompat s2 = WindowInsetsCompat.s(view, windowInsets);
                if (this.f18776b == null) {
                    WeakHashMap weakHashMap = ViewCompat.f18740a;
                    this.f18776b = ViewCompat.Api23Impl.a(view);
                }
                if (this.f18776b == null) {
                    this.f18776b = s2;
                    return Impl21.i(view, windowInsets);
                }
                Callback j2 = Impl21.j(view);
                if (j2 != null && Objects.equals(j2.mDispachedInsets, windowInsets)) {
                    return Impl21.i(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = this.f18776b;
                int i2 = 1;
                int i3 = 0;
                while (true) {
                    impl = s2.f18789a;
                    if (i2 > 256) {
                        break;
                    }
                    if (!impl.f(i2).equals(windowInsetsCompat.f18789a.f(i2))) {
                        i3 |= i2;
                    }
                    i2 <<= 1;
                }
                if (i3 == 0) {
                    return Impl21.i(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat2 = this.f18776b;
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i3, (i3 & 8) != 0 ? impl.f(8).d > windowInsetsCompat2.f18789a.f(8).d ? Impl21.e : Impl21.f18773f : Impl21.f18774g, 160L);
                windowInsetsAnimationCompat.f18767a.d(0.0f);
                final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.f18767a.a());
                Insets f2 = impl.f(i3);
                Insets f3 = windowInsetsCompat2.f18789a.f(i3);
                int min = Math.min(f2.f18533a, f3.f18533a);
                int i4 = f2.f18534b;
                int i5 = f3.f18534b;
                int min2 = Math.min(i4, i5);
                int i6 = f2.f18535c;
                int i7 = f3.f18535c;
                int min3 = Math.min(i6, i7);
                int i8 = f2.d;
                final int i9 = i3;
                int i10 = f3.d;
                final BoundsCompat boundsCompat = new BoundsCompat(Insets.b(min, min2, min3, Math.min(i8, i10)), Insets.b(Math.max(f2.f18533a, f3.f18533a), Math.max(i4, i5), Math.max(i6, i7), Math.max(i8, i10)));
                Impl21.f(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        WindowInsetsCompat.Builder builder;
                        WindowInsetsCompat windowInsetsCompat3;
                        float f4;
                        AnonymousClass1 anonymousClass1 = this;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = WindowInsetsAnimationCompat.this;
                        windowInsetsAnimationCompat2.f18767a.d(animatedFraction);
                        float b2 = windowInsetsAnimationCompat2.f18767a.b();
                        PathInterpolator pathInterpolator = Impl21.e;
                        WindowInsetsCompat windowInsetsCompat4 = s2;
                        WindowInsetsCompat.Builder builder2 = new WindowInsetsCompat.Builder(windowInsetsCompat4);
                        int i11 = 1;
                        while (true) {
                            WindowInsetsCompat.BuilderImpl builderImpl = builder2.f18793a;
                            if (i11 > 256) {
                                Impl21.g(view, builderImpl.b(), Collections.singletonList(windowInsetsAnimationCompat2));
                                return;
                            }
                            if ((i9 & i11) == 0) {
                                builderImpl.c(i11, windowInsetsCompat4.f18789a.f(i11));
                                f4 = b2;
                                builder = builder2;
                                windowInsetsCompat3 = windowInsetsCompat4;
                            } else {
                                Insets f5 = windowInsetsCompat4.f18789a.f(i11);
                                Insets f6 = windowInsetsCompat2.f18789a.f(i11);
                                float f7 = 1.0f - b2;
                                int i12 = (int) (((f5.f18533a - f6.f18533a) * f7) + 0.5d);
                                int i13 = (int) (((f5.f18534b - f6.f18534b) * f7) + 0.5d);
                                float f8 = (f5.f18535c - f6.f18535c) * f7;
                                builder = builder2;
                                windowInsetsCompat3 = windowInsetsCompat4;
                                float f9 = (f5.d - f6.d) * f7;
                                f4 = b2;
                                builderImpl.c(i11, WindowInsetsCompat.n(f5, i12, i13, (int) (f8 + 0.5d), (int) (f9 + 0.5d)));
                            }
                            i11 <<= 1;
                            anonymousClass1 = this;
                            builder2 = builder;
                            b2 = f4;
                            windowInsetsCompat4 = windowInsetsCompat3;
                        }
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = WindowInsetsAnimationCompat.this;
                        windowInsetsAnimationCompat2.f18767a.d(1.0f);
                        Impl21.e(view, windowInsetsAnimationCompat2);
                    }
                });
                OneShotPreDrawListener.a(view, new Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Impl21.h(view, windowInsetsAnimationCompat, boundsCompat);
                        duration.start();
                    }
                });
                this.f18776b = s2;
                return Impl21.i(view, windowInsets);
            }
        }

        public static void e(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback j2 = j(view);
            if (j2 != null) {
                j2.onEnd(windowInsetsAnimationCompat);
                if (j2.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    e(viewGroup.getChildAt(i2), windowInsetsAnimationCompat);
                }
            }
        }

        public static void f(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z2) {
            Callback j2 = j(view);
            if (j2 != null) {
                j2.mDispachedInsets = windowInsets;
                if (!z2) {
                    j2.onPrepare(windowInsetsAnimationCompat);
                    z2 = j2.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    f(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, windowInsets, z2);
                }
            }
        }

        public static void g(View view, WindowInsetsCompat windowInsetsCompat, List list) {
            Callback j2 = j(view);
            if (j2 != null) {
                windowInsetsCompat = j2.onProgress(windowInsetsCompat, list);
                if (j2.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    g(viewGroup.getChildAt(i2), windowInsetsCompat, list);
                }
            }
        }

        public static void h(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback j2 = j(view);
            if (j2 != null) {
                j2.onStart(windowInsetsAnimationCompat, boundsCompat);
                if (j2.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    h(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static Callback j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).f18775a;
            }
            return null;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Impl30 extends Impl {
        public final WindowInsetsAnimation e;

        @RequiresApi
        /* loaded from: classes.dex */
        public static class ProxyCallback extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final Callback f18785a;

            /* renamed from: b, reason: collision with root package name */
            public List f18786b;

            /* renamed from: c, reason: collision with root package name */
            public ArrayList f18787c;
            public final HashMap d;

            public ProxyCallback(Callback callback) {
                super(callback.getDispatchMode());
                this.d = new HashMap();
                this.f18785a = callback;
            }

            public final WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        windowInsetsAnimationCompat.f18767a = new Impl30(windowInsetsAnimation);
                    }
                    this.d.put(windowInsetsAnimation, windowInsetsAnimationCompat);
                }
                return windowInsetsAnimationCompat;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f18785a.onEnd(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f18785a.onPrepare(a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
                float fraction;
                ArrayList arrayList = this.f18787c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f18787c = arrayList2;
                    this.f18786b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation i2 = androidx.compose.foundation.layout.a.i(list.get(size));
                    WindowInsetsAnimationCompat a2 = a(i2);
                    fraction = i2.getFraction();
                    a2.f18767a.d(fraction);
                    this.f18787c.add(a2);
                }
                return this.f18785a.onProgress(WindowInsetsCompat.s(null, windowInsets), this.f18786b).r();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                BoundsCompat onStart = this.f18785a.onStart(a(windowInsetsAnimation), new BoundsCompat(bounds));
                onStart.getClass();
                androidx.compose.foundation.layout.a.m();
                return androidx.compose.foundation.layout.a.g(onStart.f18768a.d(), onStart.f18769b.d());
            }
        }

        public Impl30(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final long a() {
            long durationMillis;
            durationMillis = this.e.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final float b() {
            float interpolatedFraction;
            interpolatedFraction = this.e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final int c() {
            int typeMask;
            typeMask = this.e.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final void d(float f2) {
            this.e.setFraction(f2);
        }
    }

    public WindowInsetsAnimationCompat(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f18767a = new Impl30(androidx.compose.foundation.layout.a.h(i2, interpolator, j2));
        } else {
            this.f18767a = new Impl(i2, interpolator, j2);
        }
    }

    public final long a() {
        return this.f18767a.a();
    }

    public final float b() {
        return this.f18767a.b();
    }

    public final int c() {
        return this.f18767a.c();
    }
}
