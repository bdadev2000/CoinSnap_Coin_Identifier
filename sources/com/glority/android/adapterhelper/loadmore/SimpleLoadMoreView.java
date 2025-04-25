package com.glority.android.adapterhelper.loadmore;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.adapterhelper.R;
import kotlin.Metadata;

/* compiled from: SimpleLoadMoreView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/glority/android/adapterhelper/loadmore/SimpleLoadMoreView;", "Lcom/glority/android/adapterhelper/loadmore/LoadMoreView;", "()V", "layoutId", "", "getLayoutId", "()I", "loadEndViewId", "getLoadEndViewId", "loadFailViewId", "getLoadFailViewId", "loadingViewId", "getLoadingViewId", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SimpleLoadMoreView extends LoadMoreView {
    @Override // com.glority.android.adapterhelper.loadmore.LoadMoreView
    public int getLayoutId() {
        return R.layout.helper_quick_view_load_more;
    }

    @Override // com.glority.android.adapterhelper.loadmore.LoadMoreView
    protected int getLoadingViewId() {
        return R.id.load_more_loading_view;
    }

    @Override // com.glority.android.adapterhelper.loadmore.LoadMoreView
    protected int getLoadFailViewId() {
        return R.id.load_more_load_fail_view;
    }

    @Override // com.glority.android.adapterhelper.loadmore.LoadMoreView
    protected int getLoadEndViewId() {
        return R.id.load_more_load_end_view;
    }
}
