package com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_yearly_non_trial;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchasePageViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets.BillingsPaywallYearlyNonTrialKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets.DescriptionPaywallYearlyNonTrialKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets.HeaderPaywallYearlyNonTrialKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets.InfoBenefitPaywallYearlyNonTrialKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets.TermsAndPrivacyPaywallYearlyNonTrialKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.q;

/* loaded from: classes2.dex */
public final class PaywallYearlyNonTrialOverlayKt$PaywallYearlyNonTrialOverlay$3$1$1 extends r implements l {
    final /* synthetic */ PurchasePageViewModel $purchasePageViewModel;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_yearly_non_trial.PaywallYearlyNonTrialOverlayKt$PaywallYearlyNonTrialOverlay$3$1$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements q {
        final /* synthetic */ PurchasePageViewModel $purchasePageViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PurchasePageViewModel purchasePageViewModel) {
            super(3);
            this.$purchasePageViewModel = purchasePageViewModel;
        }

        @Override // q0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return b0.f30125a;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, @Nullable Composer composer, int i2) {
            a.s(lazyItemScope, "$this$item");
            if ((i2 & 81) == 16 && composer.i()) {
                composer.A();
                return;
            }
            Modifier.Companion companion = Modifier.Companion.f14687a;
            SpacerKt.a(SizeKt.e(companion, 20), composer);
            HeaderPaywallYearlyNonTrialKt.HeaderPaywallYearlyNonTrial(composer, 0);
            SpacerKt.a(SizeKt.e(companion, 17), composer);
            InfoBenefitPaywallYearlyNonTrialKt.InfoBenefitPaywallYearlyNonTrial(composer, 0);
            SpacerKt.a(SizeKt.e(companion, 19), composer);
            BillingsPaywallYearlyNonTrialKt.BillingsPaywallYearlyNonTrial(composer, 0);
            SpacerKt.a(SizeKt.e(companion, 3), composer);
            TermsAndPrivacyPaywallYearlyNonTrialKt.TermsAndPrivacyPaywallYearlyNonTrial(this.$purchasePageViewModel, composer, 8);
            SpacerKt.a(SizeKt.e(companion, 8), composer);
            DescriptionPaywallYearlyNonTrialKt.DescriptionPaywallYearlyNonTrial(composer, 0);
            SpacerKt.a(SizeKt.e(companion, 24), composer);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallYearlyNonTrialOverlayKt$PaywallYearlyNonTrialOverlay$3$1$1(PurchasePageViewModel purchasePageViewModel) {
        super(1);
        this.$purchasePageViewModel = purchasePageViewModel;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LazyListScope lazyListScope) {
        a.s(lazyListScope, "$this$LazyColumn");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$purchasePageViewModel);
        Object obj = ComposableLambdaKt.f14482a;
        LazyListScope.f(lazyListScope, null, new ComposableLambdaImpl(-235308438, anonymousClass1, true), 3);
    }
}
