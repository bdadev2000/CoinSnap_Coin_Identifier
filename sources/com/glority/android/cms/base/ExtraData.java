package com.glority.android.cms.base;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/glority/android/cms/base/ExtraData;", "", "item", "Lcom/glority/android/cms/base/CmsMultiEntity;", "itemList", "", "(Lcom/glority/android/cms/base/CmsMultiEntity;Ljava/util/List;)V", "getItem", "()Lcom/glority/android/cms/base/CmsMultiEntity;", "getItemList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "base-cms_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class ExtraData {
    private final CmsMultiEntity item;
    private final List<CmsMultiEntity> itemList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtraData copy$default(ExtraData extraData, CmsMultiEntity cmsMultiEntity, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            cmsMultiEntity = extraData.item;
        }
        if ((i & 2) != 0) {
            list = extraData.itemList;
        }
        return extraData.copy(cmsMultiEntity, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CmsMultiEntity getItem() {
        return this.item;
    }

    public final List<CmsMultiEntity> component2() {
        return this.itemList;
    }

    public final ExtraData copy(CmsMultiEntity item, List<CmsMultiEntity> itemList) {
        return new ExtraData(item, itemList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraData)) {
            return false;
        }
        ExtraData extraData = (ExtraData) other;
        return Intrinsics.areEqual(this.item, extraData.item) && Intrinsics.areEqual(this.itemList, extraData.itemList);
    }

    public int hashCode() {
        CmsMultiEntity cmsMultiEntity = this.item;
        int hashCode = (cmsMultiEntity != null ? cmsMultiEntity.hashCode() : 0) * 31;
        List<CmsMultiEntity> list = this.itemList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ExtraData(item=" + this.item + ", itemList=" + this.itemList + ")";
    }

    public ExtraData(CmsMultiEntity cmsMultiEntity, List<CmsMultiEntity> list) {
        this.item = cmsMultiEntity;
        this.itemList = list;
    }

    public final CmsMultiEntity getItem() {
        return this.item;
    }

    public final List<CmsMultiEntity> getItemList() {
        return this.itemList;
    }
}
