package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager;

import android.os.Handler;
import android.os.Looper;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class RewardedAdManager$loadAdWithRetry$3 extends r implements l {
    final /* synthetic */ l $onAdFailedToLoad;
    final /* synthetic */ q0.a $onAdLoaded;
    final /* synthetic */ int $retryCount;
    final /* synthetic */ RewardedAdManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdManager$loadAdWithRetry$3(int i2, l lVar, RewardedAdManager rewardedAdManager, q0.a aVar) {
        super(1);
        this.$retryCount = i2;
        this.$onAdFailedToLoad = lVar;
        this.this$0 = rewardedAdManager;
        this.$onAdLoaded = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(RewardedAdManager rewardedAdManager, q0.a aVar, l lVar, int i2) {
        p0.a.s(rewardedAdManager, "this$0");
        p0.a.s(aVar, "$onAdLoaded");
        p0.a.s(lVar, "$onAdFailedToLoad");
        rewardedAdManager.loadAdWithRetry(aVar, lVar, i2 - 1);
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
            final RewardedAdManager rewardedAdManager = this.this$0;
            final q0.a aVar = this.$onAdLoaded;
            final l lVar = this.$onAdFailedToLoad;
            final int i2 = this.$retryCount;
            handler.postDelayed(new Runnable() { // from class: com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager.b
                @Override // java.lang.Runnable
                public final void run() {
                    RewardedAdManager$loadAdWithRetry$3.invoke$lambda$0(RewardedAdManager.this, aVar, lVar, i2);
                }
            }, 5000L);
            return;
        }
        this.$onAdFailedToLoad.invoke(str);
    }
}
