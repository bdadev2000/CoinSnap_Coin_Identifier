package com.glority.android.picturexx.view.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.app.AlertDialog;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogRemoveWishSuccessBinding;
import com.glority.utils.stability.LogUtils;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoveWishSuccessDialog.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/RemoveWishSuccessDialog;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.METHOD, "Lkotlin/Function0;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RemoveWishSuccessDialog {
    public static final int $stable = 0;
    public static final RemoveWishSuccessDialog INSTANCE = new RemoveWishSuccessDialog();

    private RemoveWishSuccessDialog() {
    }

    public final void open(Context context, final Function0<Unit> method) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        final DialogRemoveWishSuccessBinding inflate = DialogRemoveWishSuccessBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        final AlertDialog show = new MaterialAlertDialogBuilder(context).setView(inflate.getRoot()).setCancelable(false).setBackground(new ColorDrawable(context.getResources().getColor(R.color.transparent))).show();
        inflate.getRoot().post(new Runnable() { // from class: com.glority.android.picturexx.view.dialog.RemoveWishSuccessDialog$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RemoveWishSuccessDialog.open$lambda$2(DialogRemoveWishSuccessBinding.this);
            }
        });
        inflate.getRoot().postDelayed(new Runnable() { // from class: com.glority.android.picturexx.view.dialog.RemoveWishSuccessDialog$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RemoveWishSuccessDialog.open$lambda$5(DialogRemoveWishSuccessBinding.this, show, method);
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$2(final DialogRemoveWishSuccessBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        try {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, binding.getRoot().getX() + (binding.getRoot().getWidth() / 2), binding.getRoot().getY() + (binding.getRoot().getHeight() / 2));
            scaleAnimation.setDuration(350L);
            scaleAnimation.setInterpolator(new FastOutSlowInInterpolator());
            scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.glority.android.picturexx.view.dialog.RemoveWishSuccessDialog$open$1$1$animation$1$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    DialogRemoveWishSuccessBinding.this.getRoot().setVisibility(0);
                }
            });
            binding.getRoot().startAnimation(scaleAnimation);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$5(final DialogRemoveWishSuccessBinding binding, final AlertDialog alertDialog, final Function0 method) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(method, "$method");
        try {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, binding.getRoot().getX() + (binding.getRoot().getWidth() / 2), binding.getRoot().getY() + (binding.getRoot().getHeight() / 2));
            scaleAnimation.setDuration(350L);
            scaleAnimation.setInterpolator(new FastOutSlowInInterpolator());
            scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.glority.android.picturexx.view.dialog.RemoveWishSuccessDialog$open$2$1$animation$1$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    DialogRemoveWishSuccessBinding.this.getRoot().setVisibility(0);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    alertDialog.dismiss();
                    method.invoke();
                }
            });
            binding.getRoot().startAnimation(scaleAnimation);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
