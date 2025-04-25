package com.glority.android.adapterhelper;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.adapterhelper.entity.MultiItemEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseMultiItemQuickAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u001a*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u001aB\u0015\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0004J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u001f\u0010\u0014\u001a\u00028\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u000eH\u0016J\u0012\u0010\u0019\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0004R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/adapterhelper/entity/MultiItemEntity;", "K", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "data", "", "(Ljava/util/List;)V", "layouts", "Landroid/util/SparseIntArray;", "addItemType", "", "type", "", "layoutResId", "getDefItemViewType", "position", "getLayoutId", "viewType", "onCreateDefViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;I)Lcom/glority/android/adapterhelper/BaseViewHolder;", "remove", "setDefaultViewTypeLayout", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class BaseMultiItemQuickAdapter<T extends MultiItemEntity, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    private static final int DEFAULT_VIEW_TYPE = -255;
    public static final int TYPE_NOT_FOUND = -404;
    private SparseIntArray layouts;

    public BaseMultiItemQuickAdapter(List<? extends T> list) {
        super(list);
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public int getDefItemViewType(int position) {
        MultiItemEntity multiItemEntity = (MultiItemEntity) getMData().get(position);
        return multiItemEntity == null ? DEFAULT_VIEW_TYPE : multiItemEntity.getItemType();
    }

    protected final void setDefaultViewTypeLayout(int layoutResId) {
        addItemType(DEFAULT_VIEW_TYPE, layoutResId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public K onCreateDefViewHolder(ViewGroup parent, int viewType) {
        return createBaseViewHolder(parent, getLayoutId(viewType));
    }

    private final int getLayoutId(int viewType) {
        SparseIntArray sparseIntArray = this.layouts;
        Intrinsics.checkNotNull(sparseIntArray);
        return sparseIntArray.get(viewType, TYPE_NOT_FOUND);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void addItemType(int type, int layoutResId) {
        if (this.layouts == null) {
            this.layouts = new SparseIntArray();
        }
        SparseIntArray sparseIntArray = this.layouts;
        Intrinsics.checkNotNull(sparseIntArray);
        sparseIntArray.put(type, layoutResId);
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void remove(int position) {
        if (position < 0 || position >= getMData().size()) {
            return;
        }
        super.remove(position);
    }
}
