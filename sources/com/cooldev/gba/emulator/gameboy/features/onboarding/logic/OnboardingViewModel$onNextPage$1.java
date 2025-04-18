package com.cooldev.gba.emulator.gameboy.features.onboarding.logic;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.onboarding.enums.OnboardingEnum;
import d0.b0;
import e1.i1;
import e1.m0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel$onNextPage$1", f = "OnboardingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OnboardingViewModel$onNextPage$1 extends i implements p {
    final /* synthetic */ boolean $noPremiumAccount;
    final /* synthetic */ boolean $shouldShowPurchase;
    int label;
    final /* synthetic */ OnboardingViewModel this$0;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnboardingEnum.values().length];
            try {
                iArr[OnboardingEnum.First.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnboardingEnum.Second.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnboardingEnum.Third.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingViewModel$onNextPage$1(OnboardingViewModel onboardingViewModel, boolean z2, boolean z3, g gVar) {
        super(2, gVar);
        this.this$0 = onboardingViewModel;
        this.$shouldShowPurchase = z2;
        this.$noPremiumAccount = z3;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new OnboardingViewModel$onNextPage$1(this.this$0, this.$shouldShowPurchase, this.$noPremiumAccount, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((OnboardingViewModel$onNextPage$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        m0 m0Var;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        m0Var = this.this$0._state;
        int i2 = WhenMappings.$EnumSwitchMapping$0[((OnboardingState) ((i1) m0Var).getValue()).getOnboardingTab().ordinal()];
        if (i2 == 1) {
            this.this$0.handleFirstPage();
        } else if (i2 == 2) {
            this.this$0.handleSecondPage();
        } else if (i2 == 3) {
            this.this$0.handleThirdPage(this.$shouldShowPurchase, this.$noPremiumAccount);
        }
        return b0.f30125a;
    }
}
