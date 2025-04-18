package com.cooldev.gba.emulator.gameboy.features.onboarding.widgets;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.q;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.onboarding.widgets.ComposableSingletons$BottomOnboardingWidgetKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$BottomOnboardingWidgetKt$lambda1$1 extends r implements q {
    public static final ComposableSingletons$BottomOnboardingWidgetKt$lambda1$1 INSTANCE = new ComposableSingletons$BottomOnboardingWidgetKt$lambda1$1();

    public ComposableSingletons$BottomOnboardingWidgetKt$lambda1$1() {
        super(3);
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i2) {
        a.s(rowScope, "$this$Button");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
            return;
        }
        ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getButton(), composer, 6), null, SizeKt.f4107c, null, ContentScale.Companion.f15724g, 0.0f, null, composer, 25016, 104);
    }
}
