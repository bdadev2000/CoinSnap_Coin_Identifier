package com.glority.android.adapterhelper.loadmore;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.adapterhelper.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadMoreView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0002R\u001c\u0010\u0003\u001a\u00020\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8eX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/glority/android/adapterhelper/loadmore/LoadMoreView;", "", "()V", "isLoadEndMoreGone", "", "()Z", "setLoadEndMoreGone", "(Z)V", "layoutId", "", "getLayoutId", "()I", "loadEndViewId", "getLoadEndViewId", "loadFailViewId", "getLoadFailViewId", "loadMoreStatus", "getLoadMoreStatus", "setLoadMoreStatus", "(I)V", "loadingViewId", "getLoadingViewId", "convert", "", "holder", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "visibleLoadEnd", "visible", "visibleLoadFail", "visibleLoading", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class LoadMoreView {
    public static final int STATUS_DEFAULT = 1;
    public static final int STATUS_END = 4;
    public static final int STATUS_FAIL = 3;
    public static final int STATUS_LOADING = 2;
    private boolean isLoadEndMoreGone;
    private int loadMoreStatus = 1;

    public abstract int getLayoutId();

    protected abstract int getLoadEndViewId();

    protected abstract int getLoadFailViewId();

    protected abstract int getLoadingViewId();

    public final int getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    public final void setLoadMoreStatus(int i) {
        this.loadMoreStatus = i;
    }

    public void convert(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i = this.loadMoreStatus;
        if (i == 1) {
            visibleLoading(holder, false);
            visibleLoadFail(holder, false);
            visibleLoadEnd(holder, false);
            return;
        }
        if (i == 2) {
            visibleLoading(holder, true);
            visibleLoadFail(holder, false);
            visibleLoadEnd(holder, false);
        } else if (i == 3) {
            visibleLoading(holder, false);
            visibleLoadFail(holder, true);
            visibleLoadEnd(holder, false);
        } else {
            if (i != 4) {
                return;
            }
            visibleLoading(holder, false);
            visibleLoadFail(holder, false);
            visibleLoadEnd(holder, true);
        }
    }

    private final void visibleLoading(BaseViewHolder holder, boolean visible) {
        holder.setGone(getLoadingViewId(), visible);
    }

    private final void visibleLoadFail(BaseViewHolder holder, boolean visible) {
        holder.setGone(getLoadFailViewId(), visible);
    }

    private final void visibleLoadEnd(BaseViewHolder holder, boolean visible) {
        int loadEndViewId = getLoadEndViewId();
        if (loadEndViewId != 0) {
            holder.setGone(loadEndViewId, visible);
        }
    }

    public final void setLoadEndMoreGone(boolean z) {
        this.isLoadEndMoreGone = z;
    }

    public final boolean isLoadEndMoreGone() {
        return this.isLoadEndMoreGone || getLayoutId() == 0;
    }
}
