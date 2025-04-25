package com.glority.android.cmsui2.entity;

import com.glority.android.adapterhelper.entity.MultiItemEntity;
import com.glority.android.cmsui2.view.BaseCmsItemView;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseCmsMultiEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/glority/android/cmsui2/entity/CmsItemEntity;", "Lcom/glority/android/adapterhelper/entity/MultiItemEntity;", Args.itemType, "", Args.title, "", "item", "Lcom/glority/android/cmsui2/view/BaseCmsItemView;", "<init>", "(ILjava/lang/String;Lcom/glority/android/cmsui2/view/BaseCmsItemView;)V", "getItemType", "()I", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getItem", "()Lcom/glority/android/cmsui2/view/BaseCmsItemView;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final /* data */ class CmsItemEntity implements MultiItemEntity {
    private final BaseCmsItemView item;
    private final int itemType;
    private String title;

    /* renamed from: component1, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final BaseCmsItemView getItem() {
        return this.item;
    }

    public final CmsItemEntity copy(int itemType, String title, BaseCmsItemView item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new CmsItemEntity(itemType, title, item);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmsItemEntity)) {
            return false;
        }
        CmsItemEntity cmsItemEntity = (CmsItemEntity) other;
        return this.itemType == cmsItemEntity.itemType && Intrinsics.areEqual(this.title, cmsItemEntity.title) && Intrinsics.areEqual(this.item, cmsItemEntity.item);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.itemType) * 31;
        String str = this.title;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.item.hashCode();
    }

    public String toString() {
        return "CmsItemEntity(itemType=" + this.itemType + ", title=" + this.title + ", item=" + this.item + ")";
    }

    public CmsItemEntity(int i, String str, BaseCmsItemView item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.itemType = i;
        this.title = str;
        this.item = item;
    }

    public static /* synthetic */ CmsItemEntity copy$default(CmsItemEntity cmsItemEntity, int i, String str, BaseCmsItemView baseCmsItemView, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsItemEntity.itemType;
        }
        if ((i2 & 2) != 0) {
            str = cmsItemEntity.title;
        }
        if ((i2 & 4) != 0) {
            baseCmsItemView = cmsItemEntity.item;
        }
        return cmsItemEntity.copy(i, str, baseCmsItemView);
    }

    public final BaseCmsItemView getItem() {
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
}
