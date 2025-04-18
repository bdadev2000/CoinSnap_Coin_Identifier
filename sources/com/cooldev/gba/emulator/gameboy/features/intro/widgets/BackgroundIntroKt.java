package com.cooldev.gba.emulator.gameboy.features.intro.widgets;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class BackgroundIntroKt {
    @ComposableTarget
    @Composable
    public static final void BackgroundIntro(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-193632686);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getIntro(), g2, 6), null, SizeKt.f4107c, null, ContentScale.Companion.f15724g, 0.0f, null, g2, 25016, 104);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BackgroundIntroKt$BackgroundIntro$1(i2);
        }
    }
}
