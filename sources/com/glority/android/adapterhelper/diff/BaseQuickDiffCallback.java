package com.glority.android.adapterhelper.diff;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseQuickDiffCallback.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\b\u0010\u0014\u001a\u00020\rH\u0016J\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/android/adapterhelper/diff/BaseQuickDiffCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/DiffUtil$Callback;", "newList", "", "(Ljava/util/List;)V", "oldList", "areContentsTheSame", "", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getNewList", "getNewListSize", "getOldList", "getOldListSize", "setOldList", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class BaseQuickDiffCallback<T> extends DiffUtil.Callback {
    private final List<T> newList;
    private List<? extends T> oldList;

    protected abstract boolean areContentsTheSame(T oldItem, T newItem);

    protected abstract boolean areItemsTheSame(T oldItem, T newItem);

    protected Object getChangePayload(T oldItem, T newItem) {
        return null;
    }

    public BaseQuickDiffCallback(ArrayList arrayList) {
        this.newList = (List<T>) (arrayList == null ? new ArrayList() : arrayList);
    }

    public final List<T> getNewList() {
        return this.newList;
    }

    public final List<T> getOldList() {
        return this.oldList;
    }

    public final void setOldList(List<? extends T> oldList) {
        if (oldList == null) {
            oldList = new ArrayList();
        }
        this.oldList = oldList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        List<? extends T> list = this.oldList;
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.newList.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        List<? extends T> list = this.oldList;
        Intrinsics.checkNotNull(list);
        return areItemsTheSame(list.get(oldItemPosition), this.newList.get(newItemPosition));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        List<? extends T> list = this.oldList;
        Intrinsics.checkNotNull(list);
        return areContentsTheSame(list.get(oldItemPosition), this.newList.get(newItemPosition));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        List<? extends T> list = this.oldList;
        Intrinsics.checkNotNull(list);
        return getChangePayload(list.get(oldItemPosition), this.newList.get(newItemPosition));
    }
}
