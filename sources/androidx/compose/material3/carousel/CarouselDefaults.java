package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerSnapDistanceMaxPages;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class CarouselDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f12644a = 40;

    /* renamed from: b, reason: collision with root package name */
    public static final float f12645b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f12646c = 10;

    public static TargetedFlingBehavior a(CarouselState carouselState, Composer composer, int i2) {
        return PagerDefaults.a(carouselState.f12717b, new PagerSnapDistanceMaxPages(), AnimationSpecKt.c(0.0f, 400.0f, null, 5), composer, (i2 << 6) & 7168, 20);
    }
}
