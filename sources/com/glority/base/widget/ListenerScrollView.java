package com.glority.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListenerScrollView.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/glority/base/widget/ListenerScrollView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onScrollListener", "Lcom/glority/base/widget/ListenerScrollView$OnScrollListener;", "getOnScrollListener", "()Lcom/glority/base/widget/ListenerScrollView$OnScrollListener;", "setOnScrollListener", "(Lcom/glority/base/widget/ListenerScrollView$OnScrollListener;)V", "onScrollChanged", "", "l", "", "t", "oldl", "oldt", "OnScrollListener", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ListenerScrollView extends ScrollView {
    public static final int $stable = 8;
    private OnScrollListener onScrollListener;

    /* compiled from: ListenerScrollView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/base/widget/ListenerScrollView$OnScrollListener;", "", "onScroll", "", "scrollY", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public interface OnScrollListener {
        void onScroll(int scrollY);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListenerScrollView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ListenerScrollView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenerScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final OnScrollListener getOnScrollListener() {
        return this.onScrollListener;
    }

    public final void setOnScrollListener(OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    @Override // android.view.View
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        OnScrollListener onScrollListener = this.onScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScroll(getScrollY());
        }
    }
}
