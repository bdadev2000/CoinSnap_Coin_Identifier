package com.cooldev.gba.emulator.gameboy.features.onboarding.logic;

import android.content.Context;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.io.File;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel$addFirstGame$1", f = "OnboardingViewModel.kt", l = {Opcodes.POP2, Opcodes.DUP_X2}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OnboardingViewModel$addFirstGame$1 extends i implements p {
    int label;
    final /* synthetic */ OnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingViewModel$addFirstGame$1(OnboardingViewModel onboardingViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = onboardingViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new OnboardingViewModel$addFirstGame$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((OnboardingViewModel$addFirstGame$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Context context;
        Object copyFile;
        Object copyFile2;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            context = this.this$0.context;
            File file = new File(context.getExternalFilesDir(null), "GBA");
            if (file.exists()) {
                OnboardingViewModel onboardingViewModel = this.this$0;
                this.label = 2;
                copyFile = onboardingViewModel.copyFile(this);
                if (copyFile == aVar) {
                    return aVar;
                }
            } else if (file.mkdirs()) {
                OnboardingViewModel onboardingViewModel2 = this.this$0;
                this.label = 1;
                copyFile2 = onboardingViewModel2.copyFile(this);
                if (copyFile2 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
