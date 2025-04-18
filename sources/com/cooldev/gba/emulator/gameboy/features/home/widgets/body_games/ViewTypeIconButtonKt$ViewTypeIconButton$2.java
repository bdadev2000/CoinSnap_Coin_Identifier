package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.q;

/* loaded from: classes.dex */
public final class ViewTypeIconButtonKt$ViewTypeIconButton$2 extends r implements q {
    final /* synthetic */ HomeState $homeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTypeIconButtonKt$ViewTypeIconButton$2(HomeState homeState) {
        super(3);
        this.$homeState = homeState;
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
        } else {
            float f2 = 24;
            ImageKt.a(PainterResources_androidKt.a(this.$homeState.isViewListHorizontal() ? MyImages.INSTANCE.getList() : MyImages.INSTANCE.getGrid(), composer, 0), null, SizeKt.e(SizeKt.r(PaddingKt.f(Modifier.Companion.f14687a, 1), f2), f2), null, ContentScale.Companion.f15724g, 0.0f, null, composer, 25016, 104);
        }
    }
}
