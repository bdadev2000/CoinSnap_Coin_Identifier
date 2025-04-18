package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.enums.MenuGame;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class ItemMenuGameKt$ItemMenuGame$3 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ MenuGame $data;
    final /* synthetic */ a $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemMenuGameKt$ItemMenuGame$3(MenuGame menuGame, boolean z2, a aVar, int i2, int i3) {
        super(2);
        this.$data = menuGame;
        this.$checked = z2;
        this.$onClick = aVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ItemMenuGameKt.ItemMenuGame(this.$data, this.$checked, this.$onClick, composer, RecomposeScopeImplKt.a(this.$$changed | 1), this.$$default);
    }
}
