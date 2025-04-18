package com.cooldev.gba.emulator.gameboy.features.setting.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.cooldev.gba.emulator.gameboy.features.setting.enums.SettingEnum;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class ItemSettingWidgetKt$ItemSettingWidget$3 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SettingEnum $data;
    final /* synthetic */ a $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemSettingWidgetKt$ItemSettingWidget$3(SettingEnum settingEnum, a aVar, int i2) {
        super(2);
        this.$data = settingEnum;
        this.$onClick = aVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ItemSettingWidgetKt.ItemSettingWidget(this.$data, this.$onClick, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
