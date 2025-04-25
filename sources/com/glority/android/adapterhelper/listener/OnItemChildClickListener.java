package com.glority.android.adapterhelper.listener;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import kotlin.Metadata;

/* compiled from: OnItemChildClickListener.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J,\u0010\u000b\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J,\u0010\f\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J,\u0010\r\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J,\u0010\u000e\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000f"}, d2 = {"Lcom/glority/android/adapterhelper/listener/OnItemChildClickListener;", "Lcom/glority/android/adapterhelper/listener/SimpleClickListener;", "()V", "onItemChildClick", "", "adapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "view", "Landroid/view/View;", "position", "", "onItemChildLongClick", "onItemClick", "onItemLongClick", "onSimpleItemChildClick", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class OnItemChildClickListener extends SimpleClickListener {
    @Override // com.glority.android.adapterhelper.listener.SimpleClickListener
    public void onItemChildLongClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {
    }

    @Override // com.glority.android.adapterhelper.listener.SimpleClickListener
    public void onItemClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {
    }

    @Override // com.glority.android.adapterhelper.listener.SimpleClickListener
    public void onItemLongClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {
    }

    public abstract void onSimpleItemChildClick(BaseQuickAdapter<?, ?> adapter, View view, int position);

    @Override // com.glority.android.adapterhelper.listener.SimpleClickListener
    public void onItemChildClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {
        onSimpleItemChildClick(adapter, view, position);
    }
}
