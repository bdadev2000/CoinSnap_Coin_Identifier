package com.glority.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.GlLoadingLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlLoadingLayout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001:\u00013B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J$\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u0017H\u0016J\b\u0010*\u001a\u00020#H\u0016J\b\u0010+\u001a\u00020#H\u0016J\u0018\u0010,\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010-\u001a\u00020#H\u0016J\u0012\u0010.\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u00100\u001a\u00020#2\b\b\u0002\u00101\u001a\u00020 H\u0016J\b\u00102\u001a\u00020#H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u000e\u0010\u001f\u001a\u00020 X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082D¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/glority/widget/GlLoadingLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callback", "Lcom/glority/widget/GlLoadingLayout$Callback;", "getCallback", "()Lcom/glority/widget/GlLoadingLayout$Callback;", "setCallback", "(Lcom/glority/widget/GlLoadingLayout$Callback;)V", "containerLayout", "directShowLoading", "", "errorView", "Landroid/view/View;", "getErrorView", "()Landroid/view/View;", "setErrorView", "(Landroid/view/View;)V", "firstDelayShowLoadingTime", "", "getFirstDelayShowLoadingTime", "()I", "setFirstDelayShowLoadingTime", "(I)V", "loadingView", "getLoadingView", "setLoadingView", "tagError", "", "tagLoading", "addView", "", "child", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "defaultErrorViewRes", "defaultLoadingViewRes", "hideErrorView", "hideLoadingView", "initStatusView", "loadingDone", "removeView", "view", "showError", "errorType", "showLoading", "Callback", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public class GlLoadingLayout extends FrameLayout {
    private Callback callback;
    private final FrameLayout containerLayout;
    private boolean directShowLoading;
    private View errorView;
    private int firstDelayShowLoadingTime;
    private View loadingView;
    private final String tagError;
    private final String tagLoading;

    /* compiled from: GlLoadingLayout.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/glority/widget/GlLoadingLayout$Callback;", "", "loadData", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface Callback {
        void loadData();
    }

    public GlLoadingLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlLoadingLayout(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.GlLoadingLayout.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlLoadingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tagLoading = "tagLoading";
        this.tagError = "tagError";
        this.firstDelayShowLoadingTime = 350;
        this.directShowLoading = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.containerLayout = frameLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GlLoadingLayout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.GlLoadingLayout)");
        this.firstDelayShowLoadingTime = obtainStyledAttributes.getInt(R.styleable.GlLoadingLayout_loadingDelayTime, this.firstDelayShowLoadingTime);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.GlLoadingLayout_loadingView, defaultLoadingViewRes());
        int i = obtainStyledAttributes.getInt(R.styleable.GlLoadingLayout_errorView, defaultErrorViewRes());
        this.directShowLoading = obtainStyledAttributes.getBoolean(R.styleable.GlLoadingLayout_directShowLoading, true);
        addView(frameLayout, -1, -1);
        GlLoadingLayout glLoadingLayout = this;
        View inflate = LayoutInflater.from(context).inflate(resourceId, (ViewGroup) glLoadingLayout, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…dingViewRes, this, false)");
        this.loadingView = inflate;
        View inflate2 = LayoutInflater.from(context).inflate(i, (ViewGroup) glLoadingLayout, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "LayoutInflater.from(cont…ViewViewRes, this, false)");
        this.errorView = inflate2;
        obtainStyledAttributes.recycle();
        initStatusView(this.loadingView, this.errorView);
        if (this.directShowLoading) {
            this.loadingView.setVisibility(8);
            this.loadingView.setTag("tagLoading");
            addView(this.loadingView, -1, -1);
            postDelayed(new Runnable() { // from class: com.glority.widget.GlLoadingLayout.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        GlLoadingLayout.this.getLoadingView().setVisibility(0);
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e) {
                        if (AppContext.INSTANCE.isDebugMode()) {
                            LogUtils.e(Log.getStackTraceString(e));
                        }
                    }
                }
            }, this.firstDelayShowLoadingTime);
        }
    }

    public final int getFirstDelayShowLoadingTime() {
        return this.firstDelayShowLoadingTime;
    }

    public final void setFirstDelayShowLoadingTime(int i) {
        this.firstDelayShowLoadingTime = i;
    }

    public final View getLoadingView() {
        return this.loadingView;
    }

    public final void setLoadingView(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.loadingView = view;
    }

    public final View getErrorView() {
        return this.errorView;
    }

    public final void setErrorView(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.errorView = view;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final void setCallback(Callback callback) {
        this.callback = callback;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new View[]{this.containerLayout, this.errorView, this.loadingView}), child)) {
            super.addView(child, index, params);
        } else {
            this.containerLayout.addView(child, index, params);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new View[]{this.containerLayout, this.errorView, this.loadingView}), view)) {
            super.removeView(view);
        } else {
            this.containerLayout.removeView(view);
        }
    }

    public void showLoading() {
        hideErrorView();
        if (findViewWithTag(this.tagLoading) == null) {
            this.loadingView.setTag(this.tagLoading);
            addView(this.loadingView, -1, -1);
        }
    }

    public static /* synthetic */ void showError$default(GlLoadingLayout glLoadingLayout, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showError");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        glLoadingLayout.showError(str);
    }

    public void showError(String errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        hideLoadingView();
        if (findViewWithTag(this.tagError) == null) {
            this.errorView.setTag(this.tagError);
            addView(this.errorView, -1, -1);
        }
    }

    public void loadingDone() {
        hideLoadingView();
        hideErrorView();
    }

    public void hideLoadingView() {
        removeView(this.loadingView);
    }

    public void hideErrorView() {
        removeView(this.errorView);
    }

    public void initStatusView(View loadingView, final View errorView) {
        Intrinsics.checkNotNullParameter(loadingView, "loadingView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        errorView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.GlLoadingLayout$initStatusView$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlLoadingLayout.this.removeView(errorView);
                GlLoadingLayout.Callback callback = GlLoadingLayout.this.getCallback();
                if (callback != null) {
                    callback.loadData();
                }
            }
        });
    }

    public int defaultLoadingViewRes() {
        return R.layout.gl_loading_layout_loading;
    }

    public int defaultErrorViewRes() {
        return R.layout.gl_loading_layout_error;
    }
}
