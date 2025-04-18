package com.cooldev.gba.emulator.gameboy.constants;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.AdSize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MyApps {
    public static final int $stable = 0;

    @NotNull
    public static final MyApps INSTANCE = new MyApps();

    @NotNull
    private static final RoundedCornerShape border360 = RoundedCornerShapeKt.b(360);
    private static final float heightAdsBanner = AdSize.BANNER.getHeight();
    private static final float pAdsBanner = 24;
    private static final float hNavigationBarPortrait = 67;

    private MyApps() {
    }

    @NotNull
    public final RoundedCornerShape getBorder360() {
        return border360;
    }

    /* renamed from: getHNavigationBarPortrait-D9Ej5fM, reason: not valid java name */
    public final float m9getHNavigationBarPortraitD9Ej5fM() {
        return hNavigationBarPortrait;
    }

    /* renamed from: getHeightAdsBanner-D9Ej5fM, reason: not valid java name */
    public final float m10getHeightAdsBannerD9Ej5fM() {
        return heightAdsBanner;
    }

    /* renamed from: getPAdsBanner-D9Ej5fM, reason: not valid java name */
    public final float m11getPAdsBannerD9Ej5fM() {
        return pAdsBanner;
    }
}
