package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import b1.d0;
import b1.r;
import b1.s;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.manager.InterstitialAdManager;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.AdInterstitialEvents;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$result$1", f = "InterstitialAdViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InterstitialAdViewModel$loadAd$result$1 extends i implements p {
    final /* synthetic */ r $deferred;
    int label;
    final /* synthetic */ InterstitialAdViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$result$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.r implements a {
        final /* synthetic */ r $deferred;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(r rVar) {
            super(0);
            this.$deferred = rVar;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m80invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m80invoke() {
            AdInterstitialEvents.INSTANCE.logAdInterstitialBottomNavLoaded();
            ((s) this.$deferred).Z(Boolean.TRUE);
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$result$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.r implements l {
        final /* synthetic */ r $deferred;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(r rVar) {
            super(1);
            this.$deferred = rVar;
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return b0.f30125a;
        }

        public final void invoke(@NotNull String str) {
            p0.a.s(str, "it");
            AdInterstitialEvents.INSTANCE.logAdInterstitialFailedToLoadBottomNav();
            ((s) this.$deferred).Z(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdViewModel$loadAd$result$1(InterstitialAdViewModel interstitialAdViewModel, r rVar, g gVar) {
        super(2, gVar);
        this.this$0 = interstitialAdViewModel;
        this.$deferred = rVar;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new InterstitialAdViewModel$loadAd$result$1(this.this$0, this.$deferred, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((InterstitialAdViewModel$loadAd$result$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        InterstitialAdManager interstitialAdManager;
        i0.a aVar = i0.a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        interstitialAdManager = this.this$0.interstitialAdManager;
        InterstitialAdManager.loadAd$default(interstitialAdManager, new AnonymousClass1(this.$deferred), new AnonymousClass2(this.$deferred), null, 4, null);
        return b0.f30125a;
    }
}
