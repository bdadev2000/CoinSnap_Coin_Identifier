package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserSeries.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00016B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010)0(2\u0006\u0010*\u001a\u00020+J\u0016\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010)0(H\u0016J\u0013\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020)H\u0016J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010)H\u0014J\t\u00103\u001a\u00020\u0005HÂ\u0003J\u0013\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00105\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R \u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00067"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeries;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.title, "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "childType", "getChildType", "setChildType", "composition", "getComposition", "setComposition", "seriesDescription", "getSeriesDescription", "setSeriesDescription", "pageHeaderUrl", "getPageHeaderUrl", "setPageHeaderUrl", Args.indexListUid, "getIndexListUid", "setIndexListUid", "seriesDetailList", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail;", "getSeriesDetailList", "()Ljava/util/List;", "setSeriesDetailList", "(Ljava/util/List;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class UserSeries extends APIModelBase<UserSeries> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String childType;
    public String composition;
    public String indexListUid;
    public String pageHeaderUrl;
    public String seriesDescription;
    public List<UserSeriesDetail> seriesDetailList;
    public String title;
    private int unused;

    public UserSeries() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final UserSeries copy(int unused) {
        return new UserSeries(unused);
    }

    public String toString() {
        return "UserSeries(unused=" + this.unused + ")";
    }

    public UserSeries(int i) {
        this.unused = i;
    }

    public /* synthetic */ UserSeries(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ UserSeries copy$default(UserSeries userSeries, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userSeries.unused;
        }
        return userSeries.copy(i);
    }

    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.title);
        return null;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getChildType() {
        String str = this.childType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("childType");
        return null;
    }

    public final void setChildType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.childType = str;
    }

    public final String getComposition() {
        String str = this.composition;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("composition");
        return null;
    }

    public final void setComposition(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.composition = str;
    }

    public final String getSeriesDescription() {
        String str = this.seriesDescription;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seriesDescription");
        return null;
    }

    public final void setSeriesDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.seriesDescription = str;
    }

    public final String getPageHeaderUrl() {
        String str = this.pageHeaderUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pageHeaderUrl");
        return null;
    }

    public final void setPageHeaderUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageHeaderUrl = str;
    }

    public final String getIndexListUid() {
        String str = this.indexListUid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.indexListUid);
        return null;
    }

    public final void setIndexListUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indexListUid = str;
    }

    public final List<UserSeriesDetail> getSeriesDetailList() {
        List<UserSeriesDetail> list = this.seriesDetailList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seriesDetailList");
        return null;
    }

    public final void setSeriesDetailList(List<UserSeriesDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.seriesDetailList = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UserSeries(org.json.JSONObject r6) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.series.UserSeries.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.title, getTitle());
        hashMap.put("child_type", getChildType());
        hashMap.put("composition", getComposition());
        hashMap.put("series_description", getSeriesDescription());
        hashMap.put("page_header_url", getPageHeaderUrl());
        hashMap.put("index_list_uid", getIndexListUid());
        hashMap.put("series_detail_list", UserSeriesDetail.INSTANCE.getUserSeriesDetailJsonArrayMap(getSeriesDetailList()));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof UserSeries)) {
            return false;
        }
        UserSeries userSeries = (UserSeries) other;
        return Intrinsics.areEqual(getTitle(), userSeries.getTitle()) && Intrinsics.areEqual(getChildType(), userSeries.getChildType()) && Intrinsics.areEqual(getComposition(), userSeries.getComposition()) && Intrinsics.areEqual(getSeriesDescription(), userSeries.getSeriesDescription()) && Intrinsics.areEqual(getPageHeaderUrl(), userSeries.getPageHeaderUrl()) && Intrinsics.areEqual(getIndexListUid(), userSeries.getIndexListUid()) && Intrinsics.areEqual(getSeriesDetailList(), userSeries.getSeriesDetailList());
    }

    public int hashCode() {
        return (((((((((((((getClass().hashCode() * 31) + getTitle().hashCode()) * 31) + getChildType().hashCode()) * 31) + getComposition().hashCode()) * 31) + getSeriesDescription().hashCode()) * 31) + getPageHeaderUrl().hashCode()) * 31) + getIndexListUid().hashCode()) * 31) + getSeriesDetailList().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        UserSeries userSeries = new UserSeries(0, 1, null);
        cloneTo(userSeries);
        return userSeries;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.series.UserSeries");
        UserSeries userSeries = (UserSeries) o;
        super.cloneTo(userSeries);
        userSeries.setTitle(cloneField(getTitle()));
        userSeries.setChildType(cloneField(getChildType()));
        userSeries.setComposition(cloneField(getComposition()));
        userSeries.setSeriesDescription(cloneField(getSeriesDescription()));
        userSeries.setPageHeaderUrl(cloneField(getPageHeaderUrl()));
        userSeries.setIndexListUid(cloneField(getIndexListUid()));
        userSeries.setSeriesDetailList(new ArrayList());
        List<UserSeriesDetail> seriesDetailList = getSeriesDetailList();
        Intrinsics.checkNotNull(seriesDetailList);
        for (UserSeriesDetail userSeriesDetail : seriesDetailList) {
            List<UserSeriesDetail> seriesDetailList2 = userSeries.getSeriesDetailList();
            Intrinsics.checkNotNull(seriesDetailList2);
            APIModelBase cloneField = cloneField(userSeriesDetail);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            seriesDetailList2.add(cloneField);
        }
    }

    /* compiled from: UserSeries.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeries$Companion;", "", "<init>", "()V", "getUserSeriesJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeries;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getUserSeriesJsonArrayMap(List<UserSeries> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UserSeries) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("seriesDetailList", UserSeriesDetail.class);
            return hashMap;
        }
    }
}
