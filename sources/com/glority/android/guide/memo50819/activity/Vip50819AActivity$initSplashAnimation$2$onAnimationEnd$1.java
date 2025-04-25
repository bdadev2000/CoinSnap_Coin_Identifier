package com.glority.android.guide.memo50819.activity;

import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: Vip50819AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes3.dex */
final class Vip50819AActivity$initSplashAnimation$2$onAnimationEnd$1 implements Runnable {
    final /* synthetic */ Vip50819AActivity$initSplashAnimation$2 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Vip50819AActivity$initSplashAnimation$2$onAnimationEnd$1(Vip50819AActivity$initSplashAnimation$2 vip50819AActivity$initSplashAnimation$2) {
        this.this$0 = vip50819AActivity$initSplashAnimation$2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.glority.android.guide.memo50819.activity.Vip50819AActivity$initSplashAnimation$2$onAnimationEnd$1$$special$$inlined$tryCatch$lambda$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Vip50819AActivity$initSplashAnimation$2$onAnimationEnd$1.this.this$0.$onEnd.invoke();
                }
            });
            this.this$0.$fl.startAnimation(alphaAnimation);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
