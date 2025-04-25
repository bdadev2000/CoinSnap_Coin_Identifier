package com.glority.android.cmsui;

import com.glority.android.adapterhelper.diff.BaseQuickDiffCallback;
import com.glority.android.adapterhelper.entity.MultiItemEntity;
import com.glority.android.xx.constants.Args;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseMultiEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\r\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u000eJ\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/glority/android/cmsui/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/entity/MultiItemEntity;", Args.itemType, "", "item", "", "(ILjava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "getItemType", "()I", "equals", "", "other", "getItemType1", "hashCode", "BaseMultiDiffCallback", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public class BaseMultiEntity implements MultiItemEntity {
    private final Object item;
    private final int itemType;

    public BaseMultiEntity(int i, Object obj) {
        this.itemType = i;
        this.item = obj;
    }

    public /* synthetic */ BaseMultiEntity(int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : obj);
    }

    public final Object getItem() {
        return this.item;
    }

    @Override // com.glority.android.adapterhelper.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public final int getItemType1() {
        return getItemType();
    }

    public boolean equals(Object other) {
        if (other instanceof BaseMultiEntity) {
            BaseMultiEntity baseMultiEntity = (BaseMultiEntity) other;
            if (getItemType() == baseMultiEntity.getItemType() && Intrinsics.areEqual(this.item, baseMultiEntity.item)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int itemType = getItemType() * 31;
        Object obj = this.item;
        return (itemType + (obj != null ? obj.hashCode() : 0)) * 31;
    }

    /* compiled from: BaseMultiEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\u000b"}, d2 = {"Lcom/glority/android/cmsui/BaseMultiEntity$BaseMultiDiffCallback;", "Lcom/glority/android/adapterhelper/diff/BaseQuickDiffCallback;", "Lcom/glority/android/cmsui/BaseMultiEntity;", "dataList", "", "(Ljava/util/List;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static class BaseMultiDiffCallback extends BaseQuickDiffCallback<BaseMultiEntity> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseMultiDiffCallback(List<? extends BaseMultiEntity> dataList) {
            super(dataList);
            Intrinsics.checkNotNullParameter(dataList, "dataList");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
        public boolean areItemsTheSame(BaseMultiEntity oldItem, BaseMultiEntity newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getItemType() == newItem.getItemType();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
        public boolean areContentsTheSame(BaseMultiEntity oldItem, BaseMultiEntity newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
