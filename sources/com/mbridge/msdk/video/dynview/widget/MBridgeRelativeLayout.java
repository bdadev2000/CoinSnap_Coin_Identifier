package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.moffer.b;
import com.mbridge.msdk.video.dynview.moffer.d;

/* loaded from: classes4.dex */
public class MBridgeRelativeLayout extends RelativeLayout {
    private d a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15890b;

    /* renamed from: c, reason: collision with root package name */
    private AnimatorSet f15891c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15892d;

    /* renamed from: e, reason: collision with root package name */
    private b f15893e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f15891c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d dVar;
        super.onDetachedFromWindow();
        if (!this.f15890b && (dVar = this.a) != null) {
            this.f15890b = true;
            dVar.a();
        }
        AnimatorSet animatorSet = this.f15891c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        b bVar;
        super.onVisibilityChanged(view, i10);
        if ((view instanceof MBridgeRelativeLayout) && i10 == 0 && (bVar = this.f15893e) != null && !this.f15892d) {
            this.f15892d = true;
            bVar.a();
        }
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f15891c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(b bVar) {
        this.f15893e = bVar;
    }

    public void setMoreOfferShowFailedCallBack(d dVar) {
        this.a = dVar;
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
