package com.glority.android.guide.memo50683.activity;

import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: Vip50683AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/glority/android/guide/memo50683/activity/Vip50683AActivity$initSplashAnimation$2", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "guide-ui_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes11.dex */
public final class Vip50683AActivity$initSplashAnimation$2 implements Animation.AnimationListener {
    final /* synthetic */ View $fl;

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Vip50683AActivity$initSplashAnimation$2(View view) {
        this.$fl = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.$fl.postDelayed(new Runnable() { // from class: com.glority.android.guide.memo50683.activity.Vip50683AActivity$initSplashAnimation$2$onAnimationEnd$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setFillAfter(true);
                    Vip50683AActivity$initSplashAnimation$2.this.$fl.startAnimation(alphaAnimation);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        }, 500L);
    }
}
