package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_weekly_non_trial.widgets;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.text.TextLayoutResult;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class BillingsPaywallWeeklyNonTrialKt$PurchaseWeekly$1$3$1$1$1 extends r implements l {
    final /* synthetic */ MutableIntState $fontSize$delegate;
    final /* synthetic */ int $minFontSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingsPaywallWeeklyNonTrialKt$PurchaseWeekly$1$3$1$1$1(int i2, MutableIntState mutableIntState) {
        super(1);
        this.$minFontSize = i2;
        this.$fontSize$delegate = mutableIntState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextLayoutResult) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull TextLayoutResult textLayoutResult) {
        int g2;
        int g3;
        a.s(textLayoutResult, "textLayoutResult");
        if (textLayoutResult.d()) {
            g2 = this.$fontSize$delegate.g();
            if (g2 > this.$minFontSize) {
                MutableIntState mutableIntState = this.$fontSize$delegate;
                g3 = mutableIntState.g();
                mutableIntState.b(g3 - 1);
            }
        }
    }
}
