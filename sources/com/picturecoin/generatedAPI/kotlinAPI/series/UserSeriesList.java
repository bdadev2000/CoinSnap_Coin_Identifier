package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserSeriesList.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001?B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u000102012\u0006\u00103\u001a\u000204J\u0016\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010201H\u0016J\u0013\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u000202H\u0016J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u000102H\u0014J\t\u0010<\u001a\u00020\u0005HÂ\u0003J\u0013\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010>\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u0007R\u001a\u0010!\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001a\u0010$\u001a\u00020%X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006@"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesList;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.seriesId, "", "getSeriesId", "()J", "setSeriesId", "(J)V", Args.indexListUid, "", "getIndexListUid", "()Ljava/lang/String;", "setIndexListUid", "(Ljava/lang/String;)V", Args.title, "getTitle", "setTitle", "totalNum", "getTotalNum", "()I", "setTotalNum", "collectedNum", "getCollectedNum", "setCollectedNum", "imageUrl", "getImageUrl", "setImageUrl", "country", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "getCountry", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "setCountry", "(Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;)V", "topSubjectSideUrls", "", "getTopSubjectSideUrls", "()Ljava/util/List;", "setTopSubjectSideUrls", "(Ljava/util/List;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class UserSeriesList extends APIModelBase<UserSeriesList> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int collectedNum;
    public CountryInfo country;
    public String imageUrl;
    public String indexListUid;
    private long seriesId;
    public String title;
    private List<String> topSubjectSideUrls;
    private int totalNum;
    private int unused;

    public UserSeriesList() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final UserSeriesList copy(int unused) {
        return new UserSeriesList(unused);
    }

    public String toString() {
        return "UserSeriesList(unused=" + this.unused + ")";
    }

    public UserSeriesList(int i) {
        this.unused = i;
    }

    public /* synthetic */ UserSeriesList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ UserSeriesList copy$default(UserSeriesList userSeriesList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userSeriesList.unused;
        }
        return userSeriesList.copy(i);
    }

    public final long getSeriesId() {
        return this.seriesId;
    }

    public final void setSeriesId(long j) {
        this.seriesId = j;
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

    public final int getTotalNum() {
        return this.totalNum;
    }

    public final void setTotalNum(int i) {
        this.totalNum = i;
    }

    public final int getCollectedNum() {
        return this.collectedNum;
    }

    public final void setCollectedNum(int i) {
        this.collectedNum = i;
    }

    public final String getImageUrl() {
        String str = this.imageUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageUrl");
        return null;
    }

    public final void setImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final CountryInfo getCountry() {
        CountryInfo countryInfo = this.country;
        if (countryInfo != null) {
            return countryInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("country");
        return null;
    }

    public final void setCountry(CountryInfo countryInfo) {
        Intrinsics.checkNotNullParameter(countryInfo, "<set-?>");
        this.country = countryInfo;
    }

    public final List<String> getTopSubjectSideUrls() {
        return this.topSubjectSideUrls;
    }

    public final void setTopSubjectSideUrls(List<String> list) {
        this.topSubjectSideUrls = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UserSeriesList(org.json.JSONObject r7) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesList.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("series_id", Long.valueOf(this.seriesId));
        hashMap.put("index_list_uid", getIndexListUid());
        hashMap.put(Args.title, getTitle());
        hashMap.put("total_num", Integer.valueOf(this.totalNum));
        hashMap.put("collected_num", Integer.valueOf(this.collectedNum));
        hashMap.put("image_url", getImageUrl());
        hashMap.put("country", getCountry().getJsonMap());
        List<String> list = this.topSubjectSideUrls;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("top_subject_side_urls", list);
        } else if (keepNull) {
            hashMap.put("top_subject_side_urls", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof UserSeriesList)) {
            return false;
        }
        UserSeriesList userSeriesList = (UserSeriesList) other;
        return this.seriesId == userSeriesList.seriesId && Intrinsics.areEqual(getIndexListUid(), userSeriesList.getIndexListUid()) && Intrinsics.areEqual(getTitle(), userSeriesList.getTitle()) && this.totalNum == userSeriesList.totalNum && this.collectedNum == userSeriesList.collectedNum && Intrinsics.areEqual(getImageUrl(), userSeriesList.getImageUrl()) && Intrinsics.areEqual(getCountry(), userSeriesList.getCountry()) && Intrinsics.areEqual(this.topSubjectSideUrls, userSeriesList.topSubjectSideUrls);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((getClass().hashCode() * 31) + Long.hashCode(this.seriesId)) * 31) + getIndexListUid().hashCode()) * 31) + getTitle().hashCode()) * 31) + Integer.hashCode(this.totalNum)) * 31) + Integer.hashCode(this.collectedNum)) * 31) + getImageUrl().hashCode()) * 31) + getCountry().hashCode()) * 31;
        List<String> list = this.topSubjectSideUrls;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        UserSeriesList userSeriesList = new UserSeriesList(0, 1, null);
        cloneTo(userSeriesList);
        return userSeriesList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesList");
        UserSeriesList userSeriesList = (UserSeriesList) o;
        super.cloneTo(userSeriesList);
        userSeriesList.seriesId = cloneField(Long.valueOf(this.seriesId)).longValue();
        userSeriesList.setIndexListUid(cloneField(getIndexListUid()));
        userSeriesList.setTitle(cloneField(getTitle()));
        userSeriesList.totalNum = cloneField(Integer.valueOf(this.totalNum)).intValue();
        userSeriesList.collectedNum = cloneField(Integer.valueOf(this.collectedNum)).intValue();
        userSeriesList.setImageUrl(cloneField(getImageUrl()));
        userSeriesList.setCountry((CountryInfo) cloneField(getCountry()));
        if (this.topSubjectSideUrls == null) {
            userSeriesList.topSubjectSideUrls = null;
            return;
        }
        userSeriesList.topSubjectSideUrls = new ArrayList();
        List<String> list = this.topSubjectSideUrls;
        Intrinsics.checkNotNull(list);
        for (String str : list) {
            List<String> list2 = userSeriesList.topSubjectSideUrls;
            Intrinsics.checkNotNull(list2);
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            list2.add(cloneField);
        }
    }

    /* compiled from: UserSeriesList.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesList$Companion;", "", "<init>", "()V", "getUserSeriesListJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesList;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getUserSeriesListJsonArrayMap(List<UserSeriesList> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UserSeriesList) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("topSubjectSideUrls", String.class);
            return hashMap;
        }
    }
}
