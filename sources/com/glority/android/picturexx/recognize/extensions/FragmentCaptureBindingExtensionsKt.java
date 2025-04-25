package com.glority.android.picturexx.recognize.extensions;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.glority.android.picturexx.recognize.databinding.FragmentCaptureBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentCaptureBindingExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"doCaptureButtonAnimator", "Landroid/animation/AnimatorSet;", "Lcom/glority/android/picturexx/recognize/databinding/FragmentCaptureBinding;", "recognize_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class FragmentCaptureBindingExtensionsKt {
    public static final AnimatorSet doCaptureButtonAnimator(FragmentCaptureBinding fragmentCaptureBinding) {
        Intrinsics.checkNotNullParameter(fragmentCaptureBinding, "<this>");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setTarget(fragmentCaptureBinding.ivShotIn);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fragmentCaptureBinding.ivShotIn, "scaleX", 1.0f, 0.85f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fragmentCaptureBinding.ivShotIn, "scaleY", 1.0f, 0.85f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(fragmentCaptureBinding.ivShotIn, "scaleX", 0.85f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(fragmentCaptureBinding.ivShotIn, "scaleY", 0.85f, 1.0f);
        animatorSet.setDuration(200L);
        ObjectAnimator objectAnimator = ofFloat;
        animatorSet.play(objectAnimator).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(objectAnimator);
        animatorSet.start();
        return animatorSet;
    }
}
