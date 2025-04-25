package com.glority.android.cms.base;

import com.glority.android.adapterhelper.diff.BaseQuickDiffCallback;
import com.glority.android.adapterhelper.entity.MultiItemEntity;
import com.glority.android.xx.constants.Args;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsMultiEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/glority/android/cms/base/CmsMultiEntity;", "Lcom/glority/android/adapterhelper/entity/MultiItemEntity;", Args.itemType, "", Args.title, "", "item", "Lcom/glority/android/cms/base/BaseItem;", "(ILjava/lang/String;Lcom/glority/android/cms/base/BaseItem;)V", "getItem", "()Lcom/glority/android/cms/base/BaseItem;", "getItemType", "()I", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "CmsMultiDiffCallback", "base-cms_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsMultiEntity implements MultiItemEntity {
    private final BaseItem item;
    private final int itemType;
    private String title;

    public CmsMultiEntity(int i, String str, BaseItem baseItem) {
        this.itemType = i;
        this.title = str;
        this.item = baseItem;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CmsMultiEntity(int r1, java.lang.String r2, com.glority.android.cms.base.BaseItem r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L8
            r3 = 0
            r4 = r3
            com.glority.android.cms.base.BaseItem r4 = (com.glority.android.cms.base.BaseItem) r4
        L8:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cms.base.CmsMultiEntity.<init>(int, java.lang.String, com.glority.android.cms.base.BaseItem, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final BaseItem getItem() {
        return this.item;
    }

    @Override // com.glority.android.adapterhelper.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public boolean equals(Object other) {
        if (other instanceof CmsMultiEntity) {
            CmsMultiEntity cmsMultiEntity = (CmsMultiEntity) other;
            if (getItemType() == cmsMultiEntity.getItemType() && Intrinsics.areEqual(this.item, cmsMultiEntity.item)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int itemType = getItemType() * 31;
        BaseItem baseItem = this.item;
        return (itemType + (baseItem != null ? baseItem.hashCode() : 0)) * 31;
    }

    /* compiled from: CmsMultiEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\u000b"}, d2 = {"Lcom/glority/android/cms/base/CmsMultiEntity$CmsMultiDiffCallback;", "Lcom/glority/android/adapterhelper/diff/BaseQuickDiffCallback;", "Lcom/glority/android/cms/base/CmsMultiEntity;", "dataList", "", "(Ljava/util/List;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "base-cms_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static class CmsMultiDiffCallback extends BaseQuickDiffCallback<CmsMultiEntity> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CmsMultiDiffCallback(List<CmsMultiEntity> dataList) {
            super(dataList);
            Intrinsics.checkNotNullParameter(dataList, "dataList");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
        public boolean areItemsTheSame(CmsMultiEntity oldItem, CmsMultiEntity newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getItemType() == newItem.getItemType();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
        public boolean areContentsTheSame(CmsMultiEntity oldItem, CmsMultiEntity newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
