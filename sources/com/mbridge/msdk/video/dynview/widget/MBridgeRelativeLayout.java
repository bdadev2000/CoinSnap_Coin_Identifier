package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.moffer.b;
import com.mbridge.msdk.video.dynview.moffer.d;

/* loaded from: classes3.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private d f18761a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private AnimatorSet f18762c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18763d;

    /* renamed from: e, reason: collision with root package name */
    private b f18764e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f18762c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d dVar;
        super.onDetachedFromWindow();
        if (!this.b && (dVar = this.f18761a) != null) {
            this.b = true;
            dVar.a();
        }
        AnimatorSet animatorSet = this.f18762c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i9) {
        b bVar;
        super.onVisibilityChanged(view, i9);
        if ((view instanceof MBridgeRelativeLayout) && i9 == 0 && (bVar = this.f18764e) != null && !this.f18763d) {
            this.f18763d = true;
            bVar.a();
        }
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f18762c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(b bVar) {
        this.f18764e = bVar;
    }

    public void setMoreOfferShowFailedCallBack(d dVar) {
        this.f18761a = dVar;
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
