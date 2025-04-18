package com.cooldev.gba.emulator.gameboy.widgets.app_bar;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* renamed from: com.cooldev.gba.emulator.gameboy.widgets.app_bar.ComposableSingletons$BackIconWidgetKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$BackIconWidgetKt$lambda1$1 extends r implements p {
    public static final ComposableSingletons$BackIconWidgetKt$lambda1$1 INSTANCE = new ComposableSingletons$BackIconWidgetKt$lambda1$1();

    public ComposableSingletons$BackIconWidgetKt$lambda1$1() {
        super(2);
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if ((i2 & 11) == 2 && composer.i()) {
            composer.A();
        } else {
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getBack(), composer, 6), null, SizeKt.n(Modifier.Companion.f14687a, 40), null, null, 0.0f, null, composer, 440, 120);
        }
    }
}
