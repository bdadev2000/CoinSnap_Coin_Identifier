package com.glority.widget.tooltips;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: GlToolTips.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/glority/widget/tooltips/GlToolTips$show$3", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlToolTips$show$3 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View $inflateView;
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ Ref.IntRef $maxWidth;
    final /* synthetic */ Ref.ObjectRef $targetViewRect;
    final /* synthetic */ int $windowHeight;
    final /* synthetic */ int $windowWidth;
    final /* synthetic */ GlToolTips this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GlToolTips$show$3(GlToolTips glToolTips, View view, Ref.IntRef intRef, int i, int i2, Ref.ObjectRef objectRef, int i3) {
        this.this$0 = glToolTips;
        this.$inflateView = view;
        this.$maxWidth = intRef;
        this.$maxHeight = i;
        this.$windowHeight = i2;
        this.$targetViewRect = objectRef;
        this.$windowWidth = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i;
        View view;
        View view2;
        ViewGroup.LayoutParams layoutParams = this.$inflateView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int width = this.$inflateView.getWidth();
        int height = this.$inflateView.getHeight();
        if (this.$maxWidth.element > 0 && this.$inflateView.getWidth() > this.$maxWidth.element) {
            this.$inflateView.getLayoutParams().width = this.$maxWidth.element;
            width = this.$maxWidth.element;
        }
        int i2 = width;
        if (this.$maxHeight <= 0 || this.$inflateView.getHeight() <= this.$maxHeight) {
            i = height;
        } else {
            this.$inflateView.getLayoutParams().height = this.$maxHeight;
            i = this.$maxHeight;
        }
        GlToolTips glToolTips = this.this$0;
        int i3 = this.$windowHeight;
        Rect rect = (Rect) this.$targetViewRect.element;
        int i4 = this.$windowWidth;
        view = this.this$0.archerView;
        Intrinsics.checkNotNull(view);
        glToolTips.adjustTopAndBottom(i2, i3, rect, i4, view, layoutParams2);
        GlToolTips glToolTips2 = this.this$0;
        Rect rect2 = (Rect) this.$targetViewRect.element;
        int i5 = this.$windowHeight;
        view2 = this.this$0.archerView;
        Intrinsics.checkNotNull(view2);
        glToolTips2.adjustStartEnd(i2, i, rect2, i5, layoutParams2, view2);
        this.$inflateView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.$inflateView.post(new Runnable() { // from class: com.glority.widget.tooltips.GlToolTips$show$3$onGlobalLayout$1
            @Override // java.lang.Runnable
            public final void run() {
                GlToolTips$show$3.this.this$0.openAnimation(GlToolTips$show$3.this.$inflateView);
            }
        });
    }
}
