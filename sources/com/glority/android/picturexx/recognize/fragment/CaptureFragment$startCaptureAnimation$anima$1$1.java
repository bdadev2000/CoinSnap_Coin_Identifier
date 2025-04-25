package com.glority.android.picturexx.recognize.fragment;

import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.bumptech.glide.Glide;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/glority/android/picturexx/recognize/fragment/CaptureFragment$startCaptureAnimation$anima$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationStart", "", "animation", "Landroid/view/animation/Animation;", "onAnimationEnd", "onAnimationRepeat", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CaptureFragment$startCaptureAnimation$anima$1$1 implements Animation.AnimationListener {
    final /* synthetic */ File $imageUrl;
    final /* synthetic */ Function0<Unit> $onAnimatorFinish;
    final /* synthetic */ ShapeableImageView $realTargetView;
    final /* synthetic */ GlTextView $titleTv;
    final /* synthetic */ CaptureFragment this$0;

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CaptureFragment$startCaptureAnimation$anima$1$1(CaptureFragment captureFragment, File file, GlTextView glTextView, ShapeableImageView shapeableImageView, Function0<Unit> function0) {
        this.this$0 = captureFragment;
        this.$imageUrl = file;
        this.$titleTv = glTextView;
        this.$realTargetView = shapeableImageView;
        this.$onAnimatorFinish = function0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        FrameLayout animateContainer = CaptureFragment.access$getBinding(this.this$0).animateContainer;
        Intrinsics.checkNotNullExpressionValue(animateContainer, "animateContainer");
        animateContainer.setVisibility(0);
        Glide.with(CaptureFragment.access$getBinding(this.this$0).animateIv).load(this.$imageUrl).into(CaptureFragment.access$getBinding(this.this$0).animateIv);
        this.$titleTv.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        FrameLayout animateContainer = CaptureFragment.access$getBinding(this.this$0).animateContainer;
        Intrinsics.checkNotNullExpressionValue(animateContainer, "animateContainer");
        animateContainer.setVisibility(8);
        Glide.with(this.$realTargetView).load(this.$imageUrl).into(this.$realTargetView);
        ShapeableImageView shapeableImageView = this.$realTargetView;
        final Function0<Unit> function0 = this.$onAnimatorFinish;
        final GlTextView glTextView = this.$titleTv;
        shapeableImageView.postDelayed(new Runnable() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$startCaptureAnimation$anima$1$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CaptureFragment$startCaptureAnimation$anima$1$1.onAnimationEnd$lambda$0(Function0.this, glTextView);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0(Function0 onAnimatorFinish, GlTextView titleTv) {
        Intrinsics.checkNotNullParameter(onAnimatorFinish, "$onAnimatorFinish");
        Intrinsics.checkNotNullParameter(titleTv, "$titleTv");
        onAnimatorFinish.invoke();
        titleTv.setVisibility(0);
    }
}
