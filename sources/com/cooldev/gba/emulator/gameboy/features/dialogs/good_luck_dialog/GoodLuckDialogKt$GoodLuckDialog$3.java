package com.cooldev.gba.emulator.gameboy.features.dialogs.good_luck_dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class GoodLuckDialogKt$GoodLuckDialog$3 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isDialogVisible;
    final /* synthetic */ a $onDismissRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoodLuckDialogKt$GoodLuckDialog$3(boolean z2, a aVar, int i2) {
        super(2);
        this.$isDialogVisible = z2;
        this.$onDismissRequest = aVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        GoodLuckDialogKt.GoodLuckDialog(this.$isDialogVisible, this.$onDismissRequest, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
