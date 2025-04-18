package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class DashboardPageKt$PopupOfferFreeTrial$4 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ a $onClose;
    final /* synthetic */ a $onTap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$PopupOfferFreeTrial$4(Modifier modifier, a aVar, a aVar2, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$onClose = aVar;
        this.$onTap = aVar2;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        DashboardPageKt.PopupOfferFreeTrial(this.$modifier, this.$onClose, this.$onTap, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
