package com.glority.android.adapterhelper.diff;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseQuickAdapterListUpdateCallback.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/glority/android/adapterhelper/diff/BaseQuickAdapterListUpdateCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "mAdapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "(Lcom/glority/android/adapterhelper/BaseQuickAdapter;)V", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class BaseQuickAdapterListUpdateCallback implements ListUpdateCallback {
    private final BaseQuickAdapter<?, ?> mAdapter;

    public BaseQuickAdapterListUpdateCallback(BaseQuickAdapter<?, ?> mAdapter) {
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        this.mAdapter = mAdapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int position, int count) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeInserted(position + baseQuickAdapter.getHeaderLayoutCount(), count);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int position, int count) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeRemoved(position + baseQuickAdapter.getHeaderLayoutCount(), count);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int fromPosition, int toPosition) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemMoved(fromPosition + baseQuickAdapter.getHeaderLayoutCount(), toPosition + this.mAdapter.getHeaderLayoutCount());
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int position, int count, Object payload) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeChanged(position + baseQuickAdapter.getHeaderLayoutCount(), count, payload);
    }
}
