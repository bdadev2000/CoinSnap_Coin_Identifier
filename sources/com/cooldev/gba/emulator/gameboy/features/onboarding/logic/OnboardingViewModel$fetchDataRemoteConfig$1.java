package com.cooldev.gba.emulator.gameboy.features.onboarding.logic;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.FeatureFlagsConfig;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel$fetchDataRemoteConfig$1", f = "OnboardingViewModel.kt", l = {77, Opcodes.IASTORE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OnboardingViewModel$fetchDataRemoteConfig$1 extends i implements p {
    Object L$0;
    int label;
    final /* synthetic */ OnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingViewModel$fetchDataRemoteConfig$1(OnboardingViewModel onboardingViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = onboardingViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new OnboardingViewModel$fetchDataRemoteConfig$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((OnboardingViewModel$fetchDataRemoteConfig$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OnboardingViewModel onboardingViewModel;
        OnboardingViewModel onboardingViewModel2;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            onboardingViewModel = this.this$0;
            FeatureFlagsConfig featureFlagsConfig = onboardingViewModel.remoteConfigService.getFeatureFlagsConfig();
            this.L$0 = onboardingViewModel;
            this.label = 1;
            obj = featureFlagsConfig.getRatingOnboardingVisible(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onboardingViewModel2 = (OnboardingViewModel) this.L$0;
                q.m(obj);
                onboardingViewModel2.ratingInAppFirstOpenRemote = ((Boolean) obj).booleanValue();
                return b0.f30125a;
            }
            onboardingViewModel = (OnboardingViewModel) this.L$0;
            q.m(obj);
        }
        onboardingViewModel.ratingOnboardingVisibleRemote = ((Boolean) obj).booleanValue();
        OnboardingViewModel onboardingViewModel3 = this.this$0;
        FeatureFlagsConfig featureFlagsConfig2 = onboardingViewModel3.remoteConfigService.getFeatureFlagsConfig();
        this.L$0 = onboardingViewModel3;
        this.label = 2;
        Object firstOpenRating = featureFlagsConfig2.getFirstOpenRating(this);
        if (firstOpenRating == aVar) {
            return aVar;
        }
        onboardingViewModel2 = onboardingViewModel3;
        obj = firstOpenRating;
        onboardingViewModel2.ratingInAppFirstOpenRemote = ((Boolean) obj).booleanValue();
        return b0.f30125a;
    }
}
