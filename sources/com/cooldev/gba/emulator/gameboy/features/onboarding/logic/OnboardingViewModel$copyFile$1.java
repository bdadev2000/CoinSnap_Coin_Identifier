package com.cooldev.gba.emulator.gameboy.features.onboarding.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

@e(c = "com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel", f = "OnboardingViewModel.kt", l = {Opcodes.DREM}, m = "copyFile")
/* loaded from: classes2.dex */
public final class OnboardingViewModel$copyFile$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingViewModel$copyFile$1(OnboardingViewModel onboardingViewModel, g gVar) {
        super(gVar);
        this.this$0 = onboardingViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object copyFile;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        copyFile = this.this$0.copyFile(this);
        return copyFile;
    }
}
