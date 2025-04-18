package com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.q;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab.ComposableSingletons$SiteTabGuideKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$SiteTabGuideKt$lambda1$1 extends r implements q {
    public static final ComposableSingletons$SiteTabGuideKt$lambda1$1 INSTANCE = new ComposableSingletons$SiteTabGuideKt$lambda1$1();

    public ComposableSingletons$SiteTabGuideKt$lambda1$1() {
        super(3);
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull LazyItemScope lazyItemScope, @Nullable Composer composer, int i2) {
        a.s(lazyItemScope, "$this$item");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
        } else {
            SiteTabGuideKt.HeaderTitle(composer, 0);
            SpacerKt.a(SizeKt.e(Modifier.Companion.f14687a, 16), composer);
        }
    }
}
