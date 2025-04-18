package com.vungle.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y1 extends FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    public static final x1 Companion = new x1(null);
    private ImageView icon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.icon = new ImageView(context);
        int dpToPixels = com.vungle.ads.internal.util.g0.INSTANCE.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPixels, dpToPixels);
        ImageView imageView = this.icon;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RewardPlus.ICON);
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView3 = this.icon;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RewardPlus.ICON);
        } else {
            imageView2 = imageView3;
        }
        addView(imageView2);
    }

    public final void destroy() {
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.icon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RewardPlus.ICON);
        return null;
    }

    public final void renderTo(FrameLayout rootView, int i10) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        rootView.addView(this);
        com.vungle.ads.internal.util.g0 g0Var = com.vungle.ads.internal.util.g0.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int dpToPixels = g0Var.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPixels, dpToPixels);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        layoutParams.gravity = 8388661;
                    } else {
                        layoutParams.gravity = 8388693;
                    }
                } else {
                    layoutParams.gravity = 8388691;
                }
            } else {
                layoutParams.gravity = 8388661;
            }
        } else {
            layoutParams.gravity = 8388659;
        }
        setLayoutParams(layoutParams);
        rootView.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }
}
