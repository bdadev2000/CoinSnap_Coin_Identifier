package com.glority.android.cms.headview.base;

import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderViewEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006%"}, d2 = {"Lcom/glority/android/cms/headview/base/HeaderViewEntity;", "", "userImages", "", "", "similarImages", "cmsNames", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "showNoMatchItem", "", "extraData", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V", "getCmsNames", "()Ljava/util/List;", "getExtraData", "()Ljava/util/Map;", "setExtraData", "(Ljava/util/Map;)V", "getShowNoMatchItem", "()Z", "setShowNoMatchItem", "(Z)V", "getSimilarImages", "getUserImages", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class HeaderViewEntity {
    private final List<CmsName> cmsNames;
    private Map<String, ? extends Object> extraData;
    private boolean showNoMatchItem;
    private final List<String> similarImages;
    private final List<String> userImages;

    public static /* synthetic */ HeaderViewEntity copy$default(HeaderViewEntity headerViewEntity, List list, List list2, List list3, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = headerViewEntity.userImages;
        }
        if ((i & 2) != 0) {
            list2 = headerViewEntity.similarImages;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            list3 = headerViewEntity.cmsNames;
        }
        List list5 = list3;
        if ((i & 8) != 0) {
            z = headerViewEntity.showNoMatchItem;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            map = headerViewEntity.extraData;
        }
        return headerViewEntity.copy(list, list4, list5, z2, map);
    }

    public final List<String> component1() {
        return this.userImages;
    }

    public final List<String> component2() {
        return this.similarImages;
    }

    public final List<CmsName> component3() {
        return this.cmsNames;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowNoMatchItem() {
        return this.showNoMatchItem;
    }

    public final Map<String, Object> component5() {
        return this.extraData;
    }

    public final HeaderViewEntity copy(List<String> userImages, List<String> similarImages, List<CmsName> cmsNames, boolean showNoMatchItem, Map<String, ? extends Object> extraData) {
        Intrinsics.checkNotNullParameter(userImages, "userImages");
        Intrinsics.checkNotNullParameter(similarImages, "similarImages");
        return new HeaderViewEntity(userImages, similarImages, cmsNames, showNoMatchItem, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderViewEntity)) {
            return false;
        }
        HeaderViewEntity headerViewEntity = (HeaderViewEntity) other;
        return Intrinsics.areEqual(this.userImages, headerViewEntity.userImages) && Intrinsics.areEqual(this.similarImages, headerViewEntity.similarImages) && Intrinsics.areEqual(this.cmsNames, headerViewEntity.cmsNames) && this.showNoMatchItem == headerViewEntity.showNoMatchItem && Intrinsics.areEqual(this.extraData, headerViewEntity.extraData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<String> list = this.userImages;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.similarImages;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<CmsName> list3 = this.cmsNames;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        boolean z = this.showNoMatchItem;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        Map<String, ? extends Object> map = this.extraData;
        return i2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "HeaderViewEntity(userImages=" + this.userImages + ", similarImages=" + this.similarImages + ", cmsNames=" + this.cmsNames + ", showNoMatchItem=" + this.showNoMatchItem + ", extraData=" + this.extraData + ")";
    }

    public HeaderViewEntity(List<String> userImages, List<String> similarImages, List<CmsName> list, boolean z, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(userImages, "userImages");
        Intrinsics.checkNotNullParameter(similarImages, "similarImages");
        this.userImages = userImages;
        this.similarImages = similarImages;
        this.cmsNames = list;
        this.showNoMatchItem = z;
        this.extraData = map;
    }

    public final List<String> getUserImages() {
        return this.userImages;
    }

    public final List<String> getSimilarImages() {
        return this.similarImages;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ HeaderViewEntity(java.util.List r8, java.util.List r9, java.util.List r10, boolean r11, java.util.Map r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 4
            r0 = 0
            if (r14 == 0) goto La
            r10 = r0
            java.util.List r10 = (java.util.List) r10
            r4 = r0
            goto Lb
        La:
            r4 = r10
        Lb:
            r10 = r13 & 8
            if (r10 == 0) goto L10
            r11 = 0
        L10:
            r5 = r11
            r10 = r13 & 16
            if (r10 == 0) goto L1a
            r10 = r0
            java.util.Map r10 = (java.util.Map) r10
            r6 = r0
            goto L1b
        L1a:
            r6 = r12
        L1b:
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cms.headview.base.HeaderViewEntity.<init>(java.util.List, java.util.List, java.util.List, boolean, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<CmsName> getCmsNames() {
        return this.cmsNames;
    }

    public final boolean getShowNoMatchItem() {
        return this.showNoMatchItem;
    }

    public final void setShowNoMatchItem(boolean z) {
        this.showNoMatchItem = z;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final void setExtraData(Map<String, ? extends Object> map) {
        this.extraData = map;
    }
}
