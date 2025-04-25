package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RecommendSeriesList.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00010B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010#0\"2\u0006\u0010$\u001a\u00020%J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010#0\"H\u0016J\u0013\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020#H\u0016J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010#H\u0014J\t\u0010-\u001a\u00020\u0005HÂ\u0003J\u0013\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010/\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeriesList;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.indexListUid, "", "getIndexListUid", "()Ljava/lang/String;", "setIndexListUid", "(Ljava/lang/String;)V", Args.title, "getTitle", "setTitle", "totalNum", "getTotalNum", "()I", "setTotalNum", "imageUrl", "getImageUrl", "setImageUrl", "country", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "getCountry", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "setCountry", "(Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class RecommendSeriesList extends APIModelBase<RecommendSeriesList> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CountryInfo country;
    public String imageUrl;
    public String indexListUid;
    public String title;
    private int totalNum;
    private int unused;

    public RecommendSeriesList() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final RecommendSeriesList copy(int unused) {
        return new RecommendSeriesList(unused);
    }

    public String toString() {
        return "RecommendSeriesList(unused=" + this.unused + ")";
    }

    public RecommendSeriesList(int i) {
        this.unused = i;
    }

    public /* synthetic */ RecommendSeriesList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ RecommendSeriesList copy$default(RecommendSeriesList recommendSeriesList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recommendSeriesList.unused;
        }
        return recommendSeriesList.copy(i);
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecommendSeriesList(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("index_list_uid") && !obj.isNull("index_list_uid")) {
            setIndexListUid(obj.getString("index_list_uid"));
            if (obj.has(Args.title) && !obj.isNull(Args.title)) {
                setTitle(obj.getString(Args.title));
                if (obj.has("total_num") && !obj.isNull("total_num")) {
                    this.totalNum = obj.getInt("total_num");
                    if (obj.has("image_url") && !obj.isNull("image_url")) {
                        setImageUrl(obj.getString("image_url"));
                        if (obj.has("country") && !obj.isNull("country")) {
                            Object obj2 = obj.get("country");
                            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                                obj2 = new JSONObject();
                            }
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                            setCountry(new CountryInfo((JSONObject) obj2));
                            return;
                        }
                        throw new ParameterCheckFailException("country is missing in model RecommendSeriesList");
                    }
                    throw new ParameterCheckFailException("imageUrl is missing in model RecommendSeriesList");
                }
                throw new ParameterCheckFailException("totalNum is missing in model RecommendSeriesList");
            }
            throw new ParameterCheckFailException("title is missing in model RecommendSeriesList");
        }
        throw new ParameterCheckFailException("indexListUid is missing in model RecommendSeriesList");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("index_list_uid", getIndexListUid());
        hashMap.put(Args.title, getTitle());
        hashMap.put("total_num", Integer.valueOf(this.totalNum));
        hashMap.put("image_url", getImageUrl());
        hashMap.put("country", getCountry().getJsonMap());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof RecommendSeriesList)) {
            return false;
        }
        RecommendSeriesList recommendSeriesList = (RecommendSeriesList) other;
        return Intrinsics.areEqual(getIndexListUid(), recommendSeriesList.getIndexListUid()) && Intrinsics.areEqual(getTitle(), recommendSeriesList.getTitle()) && this.totalNum == recommendSeriesList.totalNum && Intrinsics.areEqual(getImageUrl(), recommendSeriesList.getImageUrl()) && Intrinsics.areEqual(getCountry(), recommendSeriesList.getCountry());
    }

    public int hashCode() {
        return (((((((((getClass().hashCode() * 31) + getIndexListUid().hashCode()) * 31) + getTitle().hashCode()) * 31) + Integer.hashCode(this.totalNum)) * 31) + getImageUrl().hashCode()) * 31) + getCountry().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        RecommendSeriesList recommendSeriesList = new RecommendSeriesList(0, 1, null);
        cloneTo(recommendSeriesList);
        return recommendSeriesList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesList");
        RecommendSeriesList recommendSeriesList = (RecommendSeriesList) o;
        super.cloneTo(recommendSeriesList);
        recommendSeriesList.setIndexListUid(cloneField(getIndexListUid()));
        recommendSeriesList.setTitle(cloneField(getTitle()));
        recommendSeriesList.totalNum = cloneField(Integer.valueOf(this.totalNum)).intValue();
        recommendSeriesList.setImageUrl(cloneField(getImageUrl()));
        recommendSeriesList.setCountry((CountryInfo) cloneField(getCountry()));
    }

    /* compiled from: RecommendSeriesList.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeriesList$Companion;", "", "<init>", "()V", "getRecommendSeriesListJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeriesList;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getRecommendSeriesListJsonArrayMap(List<RecommendSeriesList> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RecommendSeriesList) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
