package com.cooldev.gba.emulator.gameboy.features.manage_sub.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class BoxSubscriptionKt$SubscriptionWidget$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $purchaseTime;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxSubscriptionKt$SubscriptionWidget$2(String str, String str2, int i2) {
        super(2);
        this.$title = str;
        this.$purchaseTime = str2;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        BoxSubscriptionKt.SubscriptionWidget(this.$title, this.$purchaseTime, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
