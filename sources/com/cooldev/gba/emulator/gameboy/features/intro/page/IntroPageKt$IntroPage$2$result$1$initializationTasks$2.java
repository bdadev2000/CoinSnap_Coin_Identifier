package com.cooldev.gba.emulator.gameboy.features.intro.page;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdGameViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.intro.page.IntroPageKt$IntroPage$2$result$1$initializationTasks$2", f = "IntroPage.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class IntroPageKt$IntroPage$2$result$1$initializationTasks$2 extends i implements p {
    final /* synthetic */ BannerAdGameViewModel $bannerAdGameViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroPageKt$IntroPage$2$result$1$initializationTasks$2(BannerAdGameViewModel bannerAdGameViewModel, g gVar) {
        super(2, gVar);
        this.$bannerAdGameViewModel = bannerAdGameViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new IntroPageKt$IntroPage$2$result$1$initializationTasks$2(this.$bannerAdGameViewModel, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((IntroPageKt$IntroPage$2$result$1$initializationTasks$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            BannerAdGameViewModel bannerAdGameViewModel = this.$bannerAdGameViewModel;
            this.label = 1;
            if (bannerAdGameViewModel.initializeAd(this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
