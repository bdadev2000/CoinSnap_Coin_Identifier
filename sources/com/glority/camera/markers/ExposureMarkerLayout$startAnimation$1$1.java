package com.glority.camera.markers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import kotlin.Metadata;

/* compiled from: ExposureMarkerLayout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/glority/camera/markers/ExposureMarkerLayout$startAnimation$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "camera_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes6.dex */
public final class ExposureMarkerLayout$startAnimation$1$1 extends AnimatorListenerAdapter {
    final /* synthetic */ LinearLayout $it;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExposureMarkerLayout$startAnimation$1$1(LinearLayout linearLayout) {
        this.$it = linearLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        super.onAnimationEnd(animation);
        this.$it.animate().alpha(0.6f).setStartDelay(1500L).setDuration(500L).setInterpolator(new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: com.glority.camera.markers.ExposureMarkerLayout$startAnimation$1$1$onAnimationEnd$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation2) {
                super.onAnimationEnd(animation2);
                ExposureMarkerLayout$startAnimation$1$1.this.$it.animate().alpha(0.0f).setStartDelay(2500L).setDuration(500L).setInterpolator(new AccelerateInterpolator()).setListener(null).start();
            }
        }).start();
    }
}
