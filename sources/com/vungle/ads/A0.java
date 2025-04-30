package com.vungle.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.RewardPlus;

/* loaded from: classes3.dex */
public final class A0 extends FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    public static final C2152z0 Companion = new C2152z0(null);
    private ImageView icon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(Context context) {
        super(context);
        G7.j.e(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.icon = new ImageView(context);
        int dpToPixels = com.vungle.ads.internal.util.G.INSTANCE.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPixels, dpToPixels);
        ImageView imageView = this.icon;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
            ImageView imageView2 = this.icon;
            if (imageView2 != null) {
                addView(imageView2);
                return;
            } else {
                G7.j.k(RewardPlus.ICON);
                throw null;
            }
        }
        G7.j.k(RewardPlus.ICON);
        throw null;
    }

    public final void destroy() {
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            G7.j.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.icon;
        if (imageView != null) {
            return imageView;
        }
        G7.j.k(RewardPlus.ICON);
        throw null;
    }

    public final void renderTo(FrameLayout frameLayout, int i9) {
        G7.j.e(frameLayout, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            G7.j.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        frameLayout.addView(this);
        com.vungle.ads.internal.util.G g9 = com.vungle.ads.internal.util.G.INSTANCE;
        Context context = getContext();
        G7.j.d(context, "context");
        int dpToPixels = g9.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPixels, dpToPixels);
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
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
        frameLayout.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        G7.j.e(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        G7.j.e(context, "context");
        initView(context);
    }
}
