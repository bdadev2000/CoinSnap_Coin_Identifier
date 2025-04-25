package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.config.CountryInfo;
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

/* compiled from: CatalogInfo.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001?B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u00100\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u000102012\u0006\u00103\u001a\u000204J\u0016\u00100\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010201H\u0016J\u0013\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u000202H\u0016J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u000102H\u0014J\t\u0010<\u001a\u00020\u0005HÂ\u0003J\u0013\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010>\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020'X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0007¨\u0006@"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "catelogUid", "", "getCatelogUid", "()Ljava/lang/String;", "setCatelogUid", "(Ljava/lang/String;)V", "name", "getName", "setName", "timeRange", "getTimeRange", "setTimeRange", "description", "getDescription", "setDescription", "listBackgroudUrl", "getListBackgroudUrl", "setListBackgroudUrl", "headBackgroudUrl", "getHeadBackgroudUrl", "setHeadBackgroudUrl", Args.denominationSideUrl, "getDenominationSideUrl", "setDenominationSideUrl", Args.subjectSideUrl, "getSubjectSideUrl", "setSubjectSideUrl", "countryInfo", "Lcom/picturecoin/generatedAPI/kotlinAPI/config/CountryInfo;", "getCountryInfo", "()Lcom/picturecoin/generatedAPI/kotlinAPI/config/CountryInfo;", "setCountryInfo", "(Lcom/picturecoin/generatedAPI/kotlinAPI/config/CountryInfo;)V", "count", "getCount", "()I", "setCount", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class CatalogInfo extends APIModelBase<CatalogInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String catelogUid;
    private int count;
    public CountryInfo countryInfo;
    public String denominationSideUrl;
    public String description;
    public String headBackgroudUrl;
    public String listBackgroudUrl;
    public String name;
    public String subjectSideUrl;
    public String timeRange;
    private int unused;

    public CatalogInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final CatalogInfo copy(int unused) {
        return new CatalogInfo(unused);
    }

    public String toString() {
        return "CatalogInfo(unused=" + this.unused + ")";
    }

    public CatalogInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ CatalogInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ CatalogInfo copy$default(CatalogInfo catalogInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = catalogInfo.unused;
        }
        return catalogInfo.copy(i);
    }

    public final String getCatelogUid() {
        String str = this.catelogUid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("catelogUid");
        return null;
    }

    public final void setCatelogUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.catelogUid = str;
    }

    public final String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("name");
        return null;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getTimeRange() {
        String str = this.timeRange;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timeRange");
        return null;
    }

    public final void setTimeRange(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeRange = str;
    }

    public final String getDescription() {
        String str = this.description;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("description");
        return null;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final String getListBackgroudUrl() {
        String str = this.listBackgroudUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listBackgroudUrl");
        return null;
    }

    public final void setListBackgroudUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.listBackgroudUrl = str;
    }

    public final String getHeadBackgroudUrl() {
        String str = this.headBackgroudUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headBackgroudUrl");
        return null;
    }

    public final void setHeadBackgroudUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headBackgroudUrl = str;
    }

    public final String getDenominationSideUrl() {
        String str = this.denominationSideUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.denominationSideUrl);
        return null;
    }

    public final void setDenominationSideUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.denominationSideUrl = str;
    }

    public final String getSubjectSideUrl() {
        String str = this.subjectSideUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.subjectSideUrl);
        return null;
    }

    public final void setSubjectSideUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subjectSideUrl = str;
    }

    public final CountryInfo getCountryInfo() {
        CountryInfo countryInfo = this.countryInfo;
        if (countryInfo != null) {
            return countryInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("countryInfo");
        return null;
    }

    public final void setCountryInfo(CountryInfo countryInfo) {
        Intrinsics.checkNotNullParameter(countryInfo, "<set-?>");
        this.countryInfo = countryInfo;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatalogInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("catelog_uid") && !obj.isNull("catelog_uid")) {
            setCatelogUid(obj.getString("catelog_uid"));
            if (obj.has("name") && !obj.isNull("name")) {
                setName(obj.getString("name"));
                if (obj.has("time_range") && !obj.isNull("time_range")) {
                    setTimeRange(obj.getString("time_range"));
                    if (obj.has("description") && !obj.isNull("description")) {
                        setDescription(obj.getString("description"));
                        if (obj.has("list_backgroud_url") && !obj.isNull("list_backgroud_url")) {
                            setListBackgroudUrl(obj.getString("list_backgroud_url"));
                            if (obj.has("head_backgroud_url") && !obj.isNull("head_backgroud_url")) {
                                setHeadBackgroudUrl(obj.getString("head_backgroud_url"));
                                if (obj.has("denomination_side_url") && !obj.isNull("denomination_side_url")) {
                                    setDenominationSideUrl(obj.getString("denomination_side_url"));
                                    if (obj.has("subject_side_url") && !obj.isNull("subject_side_url")) {
                                        setSubjectSideUrl(obj.getString("subject_side_url"));
                                        if (obj.has("country_info") && !obj.isNull("country_info")) {
                                            Object obj2 = obj.get("country_info");
                                            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                                                obj2 = new JSONObject();
                                            }
                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                                            setCountryInfo(new CountryInfo((JSONObject) obj2));
                                            if (obj.has("count") && !obj.isNull("count")) {
                                                this.count = obj.getInt("count");
                                                return;
                                            }
                                            throw new ParameterCheckFailException("count is missing in model CatalogInfo");
                                        }
                                        throw new ParameterCheckFailException("countryInfo is missing in model CatalogInfo");
                                    }
                                    throw new ParameterCheckFailException("subjectSideUrl is missing in model CatalogInfo");
                                }
                                throw new ParameterCheckFailException("denominationSideUrl is missing in model CatalogInfo");
                            }
                            throw new ParameterCheckFailException("headBackgroudUrl is missing in model CatalogInfo");
                        }
                        throw new ParameterCheckFailException("listBackgroudUrl is missing in model CatalogInfo");
                    }
                    throw new ParameterCheckFailException("description is missing in model CatalogInfo");
                }
                throw new ParameterCheckFailException("timeRange is missing in model CatalogInfo");
            }
            throw new ParameterCheckFailException("name is missing in model CatalogInfo");
        }
        throw new ParameterCheckFailException("catelogUid is missing in model CatalogInfo");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("catelog_uid", getCatelogUid());
        hashMap.put("name", getName());
        hashMap.put("time_range", getTimeRange());
        hashMap.put("description", getDescription());
        hashMap.put("list_backgroud_url", getListBackgroudUrl());
        hashMap.put("head_backgroud_url", getHeadBackgroudUrl());
        hashMap.put("denomination_side_url", getDenominationSideUrl());
        hashMap.put("subject_side_url", getSubjectSideUrl());
        hashMap.put("country_info", getCountryInfo().getJsonMap());
        hashMap.put("count", Integer.valueOf(this.count));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CatalogInfo)) {
            return false;
        }
        CatalogInfo catalogInfo = (CatalogInfo) other;
        return Intrinsics.areEqual(getCatelogUid(), catalogInfo.getCatelogUid()) && Intrinsics.areEqual(getName(), catalogInfo.getName()) && Intrinsics.areEqual(getTimeRange(), catalogInfo.getTimeRange()) && Intrinsics.areEqual(getDescription(), catalogInfo.getDescription()) && Intrinsics.areEqual(getListBackgroudUrl(), catalogInfo.getListBackgroudUrl()) && Intrinsics.areEqual(getHeadBackgroudUrl(), catalogInfo.getHeadBackgroudUrl()) && Intrinsics.areEqual(getDenominationSideUrl(), catalogInfo.getDenominationSideUrl()) && Intrinsics.areEqual(getSubjectSideUrl(), catalogInfo.getSubjectSideUrl()) && Intrinsics.areEqual(getCountryInfo(), catalogInfo.getCountryInfo()) && this.count == catalogInfo.count;
    }

    public int hashCode() {
        return (((((((((((((((((((getClass().hashCode() * 31) + getCatelogUid().hashCode()) * 31) + getName().hashCode()) * 31) + getTimeRange().hashCode()) * 31) + getDescription().hashCode()) * 31) + getListBackgroudUrl().hashCode()) * 31) + getHeadBackgroudUrl().hashCode()) * 31) + getDenominationSideUrl().hashCode()) * 31) + getSubjectSideUrl().hashCode()) * 31) + getCountryInfo().hashCode()) * 31) + Integer.hashCode(this.count);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CatalogInfo catalogInfo = new CatalogInfo(0, 1, null);
        cloneTo(catalogInfo);
        return catalogInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.series.CatalogInfo");
        CatalogInfo catalogInfo = (CatalogInfo) o;
        super.cloneTo(catalogInfo);
        catalogInfo.setCatelogUid(cloneField(getCatelogUid()));
        catalogInfo.setName(cloneField(getName()));
        catalogInfo.setTimeRange(cloneField(getTimeRange()));
        catalogInfo.setDescription(cloneField(getDescription()));
        catalogInfo.setListBackgroudUrl(cloneField(getListBackgroudUrl()));
        catalogInfo.setHeadBackgroudUrl(cloneField(getHeadBackgroudUrl()));
        catalogInfo.setDenominationSideUrl(cloneField(getDenominationSideUrl()));
        catalogInfo.setSubjectSideUrl(cloneField(getSubjectSideUrl()));
        catalogInfo.setCountryInfo((CountryInfo) cloneField(getCountryInfo()));
        catalogInfo.count = cloneField(Integer.valueOf(this.count)).intValue();
    }

    /* compiled from: CatalogInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo$Companion;", "", "<init>", "()V", "getCatalogInfoJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCatalogInfoJsonArrayMap(List<CatalogInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CatalogInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
