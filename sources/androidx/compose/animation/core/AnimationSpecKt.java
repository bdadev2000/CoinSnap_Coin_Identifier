package androidx.compose.animation.core;

import q0.l;

/* loaded from: classes2.dex */
public final class AnimationSpecKt {
    public static InfiniteRepeatableSpec a(DurationBasedAnimationSpec durationBasedAnimationSpec, long j2, int i2) {
        RepeatMode repeatMode = (i2 & 2) != 0 ? RepeatMode.f2158a : null;
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.animation.core.KeyframesSpecBaseConfig, androidx.compose.animation.core.KeyframesSpec$KeyframesSpecConfig, java.lang.Object] */
    public static final KeyframesSpec b(l lVar) {
        ?? keyframesSpecBaseConfig = new KeyframesSpecBaseConfig();
        lVar.invoke(keyframesSpecBaseConfig);
        return new KeyframesSpec(keyframesSpecBaseConfig);
    }

    public static SpringSpec c(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new SpringSpec(f2, f3, obj);
    }

    public static TweenSpec d(int i2, int i3, Easing easing, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            easing = EasingKt.f2083a;
        }
        return new TweenSpec(i2, i3, easing);
    }
}
