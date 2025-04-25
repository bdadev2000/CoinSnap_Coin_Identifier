package com.glority.android.cmsui2.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseCmsMultiEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/glority/android/cmsui2/entity/ExtraData;", "", "item", "Lcom/glority/android/cmsui2/entity/CmsItemEntity;", "itemList", "", "<init>", "(Lcom/glority/android/cmsui2/entity/CmsItemEntity;Ljava/util/List;)V", "getItem", "()Lcom/glority/android/cmsui2/entity/CmsItemEntity;", "getItemList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final /* data */ class ExtraData {
    private final CmsItemEntity item;
    private final List<CmsItemEntity> itemList;

    /* renamed from: component1, reason: from getter */
    public final CmsItemEntity getItem() {
        return this.item;
    }

    public final List<CmsItemEntity> component2() {
        return this.itemList;
    }

    public final ExtraData copy(CmsItemEntity item, List<CmsItemEntity> itemList) {
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
        CmsItemEntity cmsItemEntity = this.item;
        int hashCode = (cmsItemEntity == null ? 0 : cmsItemEntity.hashCode()) * 31;
        List<CmsItemEntity> list = this.itemList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ExtraData(item=" + this.item + ", itemList=" + this.itemList + ")";
    }

    public ExtraData(CmsItemEntity cmsItemEntity, List<CmsItemEntity> list) {
        this.item = cmsItemEntity;
        this.itemList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtraData copy$default(ExtraData extraData, CmsItemEntity cmsItemEntity, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            cmsItemEntity = extraData.item;
        }
        if ((i & 2) != 0) {
            list = extraData.itemList;
        }
        return extraData.copy(cmsItemEntity, list);
    }

    public final CmsItemEntity getItem() {
        return this.item;
    }

    public final List<CmsItemEntity> getItemList() {
        return this.itemList;
    }
}
