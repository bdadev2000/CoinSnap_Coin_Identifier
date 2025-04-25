package com.glority.android.picturexx.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.glority.android.picturexx.business.R;
import com.glority.android.xx.constants.LogEvents;
import com.glority.widget.GlLoadingLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinLoadingLayout.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016J0\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0014J\b\u0010\u001d\u001a\u00020\tH\u0016¨\u0006\u001e"}, d2 = {"Lcom/glority/android/picturexx/widget/CoinLoadingLayout;", "Lcom/glority/widget/GlLoadingLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defaultErrorViewRes", "", "initStatusView", "", "loadingView", "Landroid/view/View;", "errorView", "removeViewAt", "index", "removeView", "view", "removeViews", "start", "count", "onLayout", "changed", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, LogEvents.bottom, "defaultLoadingViewRes", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinLoadingLayout extends GlLoadingLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinLoadingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.glority.widget.GlLoadingLayout
    public int defaultErrorViewRes() {
        return R.layout.coin_loading_error_layout;
    }

    @Override // com.glority.widget.GlLoadingLayout
    public void initStatusView(View loadingView, final View errorView) {
        Intrinsics.checkNotNullParameter(loadingView, "loadingView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        errorView.findViewById(R.id.retry_bt).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.widget.CoinLoadingLayout$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoinLoadingLayout.initStatusView$lambda$0(CoinLoadingLayout.this, errorView, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initStatusView$lambda$0(CoinLoadingLayout this$0, View errorView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorView, "$errorView");
        this$0.removeView(errorView);
        GlLoadingLayout.Callback callback = this$0.getCallback();
        if (callback != null) {
            callback.loadData();
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        super.removeViewAt(index);
    }

    @Override // com.glority.widget.GlLoadingLayout, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        super.removeViews(start, count);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override // com.glority.widget.GlLoadingLayout
    public int defaultLoadingViewRes() {
        return R.layout.coin_loading_layout;
    }
}
