package com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GameROMWebsite;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$5 extends r implements q0.r {
    final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$5(List list) {
        super(4);
        this.$items = list;
    }

    @Override // q0.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return b0.f30125a;
    }

    @Composable
    public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope, int i2, @Nullable Composer composer, int i3) {
        int i4;
        if ((i3 & 6) == 0) {
            i4 = (composer.I(lazyGridItemScope) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer.c(i2) ? 32 : 16;
        }
        if ((i4 & Opcodes.I2S) == 146 && composer.i()) {
            composer.A();
            return;
        }
        GameROMWebsite gameROMWebsite = (GameROMWebsite) this.$items.get(i2);
        composer.J(-1557629186);
        ItemGameROMWebsiteKt.ItemGameROMWebsite(gameROMWebsite, composer, ((i4 & 14) >> 3) & 14);
        composer.D();
    }
}
