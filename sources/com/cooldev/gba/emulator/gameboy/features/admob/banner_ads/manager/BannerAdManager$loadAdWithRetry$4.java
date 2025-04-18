package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.manager;

import android.os.Handler;
import android.os.Looper;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdManager$loadAdWithRetry$4 extends r implements l {
    final /* synthetic */ q0.a $onAdClicked;
    final /* synthetic */ l $onAdFailedToLoad;
    final /* synthetic */ l $onAdLoaded;
    final /* synthetic */ int $retryCount;
    final /* synthetic */ BannerAdManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdManager$loadAdWithRetry$4(int i2, l lVar, BannerAdManager bannerAdManager, q0.a aVar, l lVar2) {
        super(1);
        this.$retryCount = i2;
        this.$onAdFailedToLoad = lVar;
        this.this$0 = bannerAdManager;
        this.$onAdClicked = aVar;
        this.$onAdLoaded = lVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(BannerAdManager bannerAdManager, l lVar, q0.a aVar, int i2, l lVar2) {
        p0.a.s(bannerAdManager, "this$0");
        p0.a.s(lVar, "$onAdFailedToLoad");
        p0.a.s(aVar, "$onAdClicked");
        p0.a.s(lVar2, "$onAdLoaded");
        bannerAdManager.loadAdWithRetry(new BannerAdManager$loadAdWithRetry$4$1$1(lVar2), lVar, aVar, i2 - 1);
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull String str) {
        p0.a.s(str, "errorMessage");
        if (this.$retryCount > 0) {
            Handler handler = new Handler(Looper.getMainLooper());
            final BannerAdManager bannerAdManager = this.this$0;
            final l lVar = this.$onAdFailedToLoad;
            final q0.a aVar = this.$onAdClicked;
            final int i2 = this.$retryCount;
            final l lVar2 = this.$onAdLoaded;
            handler.postDelayed(new Runnable() { // from class: com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.manager.a
                @Override // java.lang.Runnable
                public final void run() {
                    BannerAdManager$loadAdWithRetry$4.invoke$lambda$0(BannerAdManager.this, lVar, aVar, i2, lVar2);
                }
            }, 5000L);
            return;
        }
        this.$onAdFailedToLoad.invoke(str);
    }
}
