package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {

    /* renamed from: r, reason: collision with root package name */
    public SpringForce f19489r;

    /* renamed from: s, reason: collision with root package name */
    public float f19490s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19491t;

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final boolean c(long j2) {
        if (this.f19491t) {
            float f2 = this.f19490s;
            if (f2 != Float.MAX_VALUE) {
                this.f19489r.f19498i = f2;
                this.f19490s = Float.MAX_VALUE;
            }
            this.f19478b = (float) this.f19489r.f19498i;
            this.f19477a = 0.0f;
            this.f19491t = false;
            return true;
        }
        if (this.f19490s != Float.MAX_VALUE) {
            SpringForce springForce = this.f19489r;
            double d = springForce.f19498i;
            long j3 = j2 / 2;
            DynamicAnimation.MassState a2 = springForce.a(this.f19478b, this.f19477a, j3);
            SpringForce springForce2 = this.f19489r;
            springForce2.f19498i = this.f19490s;
            this.f19490s = Float.MAX_VALUE;
            DynamicAnimation.MassState a3 = springForce2.a(a2.f19486a, a2.f19487b, j3);
            this.f19478b = a3.f19486a;
            this.f19477a = a3.f19487b;
        } else {
            DynamicAnimation.MassState a4 = this.f19489r.a(this.f19478b, this.f19477a, j2);
            this.f19478b = a4.f19486a;
            this.f19477a = a4.f19487b;
        }
        float max = Math.max(this.f19478b, this.f19481g);
        this.f19478b = max;
        this.f19478b = Math.min(max, Float.MAX_VALUE);
        float f3 = this.f19477a;
        SpringForce springForce3 = this.f19489r;
        springForce3.getClass();
        if (Math.abs(f3) >= springForce3.e || Math.abs(r1 - ((float) springForce3.f19498i)) >= springForce3.d) {
            return false;
        }
        this.f19478b = (float) this.f19489r.f19498i;
        this.f19477a = 0.0f;
        return true;
    }

    public final void d(float f2) {
        if (this.f19480f) {
            this.f19490s = f2;
            return;
        }
        if (this.f19489r == null) {
            this.f19489r = new SpringForce(f2);
        }
        SpringForce springForce = this.f19489r;
        double d = f2;
        springForce.f19498i = d;
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f3 = this.f19481g;
        if (d2 < f3) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.f19483i * 0.75f);
        springForce.d = abs;
        springForce.e = abs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z2 = this.f19480f;
        if (z2 || z2) {
            return;
        }
        this.f19480f = true;
        if (!this.f19479c) {
            this.f19478b = this.e.getValue(this.d);
        }
        float f4 = this.f19478b;
        if (f4 > Float.MAX_VALUE || f4 < f3) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = AnimationHandler.f19462f;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler());
        }
        AnimationHandler animationHandler = (AnimationHandler) threadLocal.get();
        ArrayList arrayList = animationHandler.f19464b;
        if (arrayList.size() == 0) {
            if (animationHandler.d == null) {
                animationHandler.d = new AnimationHandler.FrameCallbackProvider16(animationHandler.f19465c);
            }
            animationHandler.d.a();
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void e() {
        if (this.f19489r.f19493b <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f19480f) {
            this.f19491t = true;
        }
    }
}
