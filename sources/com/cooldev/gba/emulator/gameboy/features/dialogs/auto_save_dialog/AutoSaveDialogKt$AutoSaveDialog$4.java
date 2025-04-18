package com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class AutoSaveDialogKt$AutoSaveDialog$4 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isDialogVisible;
    final /* synthetic */ a $onDismiss;
    final /* synthetic */ a $onTurnOn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSaveDialogKt$AutoSaveDialog$4(boolean z2, a aVar, a aVar2, int i2) {
        super(2);
        this.$isDialogVisible = z2;
        this.$onDismiss = aVar;
        this.$onTurnOn = aVar2;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        AutoSaveDialogKt.AutoSaveDialog(this.$isDialogVisible, this.$onDismiss, this.$onTurnOn, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
