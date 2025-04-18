package com.cooldev.gba.emulator.gameboy.features.dialogs.cancel_sub_dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class CancelSubDialogKt$CancelSubDialog$3 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isDialogVisible;
    final /* synthetic */ a $onBack;
    final /* synthetic */ a $onUnSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelSubDialogKt$CancelSubDialog$3(boolean z2, a aVar, a aVar2, int i2) {
        super(2);
        this.$isDialogVisible = z2;
        this.$onUnSub = aVar;
        this.$onBack = aVar2;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        CancelSubDialogKt.CancelSubDialog(this.$isDialogVisible, this.$onUnSub, this.$onBack, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
