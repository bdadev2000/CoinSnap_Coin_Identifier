package com.cooldev.gba.emulator.gameboy.features.game.page;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.q;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.game.page.ComposableSingletons$GamePageKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$GamePageKt$lambda1$1 extends r implements q {
    public static final ComposableSingletons$GamePageKt$lambda1$1 INSTANCE = new ComposableSingletons$GamePageKt$lambda1$1();

    public ComposableSingletons$GamePageKt$lambda1$1() {
        super(3);
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i2) {
        a.s(paddingValues, "it");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
        }
    }
}
