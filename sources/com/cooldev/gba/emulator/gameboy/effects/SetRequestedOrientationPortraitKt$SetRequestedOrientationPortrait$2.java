package com.cooldev.gba.emulator.gameboy.effects;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes3.dex */
public final class SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $lockPortrait;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$2(boolean z2, int i2, int i3) {
        super(2);
        this.$lockPortrait = z2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(this.$lockPortrait, composer, RecomposeScopeImplKt.a(this.$$changed | 1), this.$$default);
    }
}
