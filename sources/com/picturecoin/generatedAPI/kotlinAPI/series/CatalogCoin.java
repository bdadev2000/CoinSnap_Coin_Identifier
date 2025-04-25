package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
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

/* compiled from: CatalogCoin.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00012B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020'J\u0016\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0016J\u0013\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010%H\u0014J\t\u0010/\u001a\u00020\u0005HÂ\u0003J\u0013\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogCoin;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.uid, "", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "name", "getName", "setName", Args.denominationSideUrl, "getDenominationSideUrl", "setDenominationSideUrl", Args.subjectSideUrl, "getSubjectSideUrl", "setSubjectSideUrl", "timeRange", "getTimeRange", "setTimeRange", "cmsStaticUrl", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "getCmsStaticUrl", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "setCmsStaticUrl", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class CatalogCoin extends APIModelBase<CatalogCoin> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CmsStaticUrl cmsStaticUrl;
    private String denominationSideUrl;
    public String name;
    private String subjectSideUrl;
    public String timeRange;
    public String uid;
    private int unused;

    public CatalogCoin() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final CatalogCoin copy(int unused) {
        return new CatalogCoin(unused);
    }

    public String toString() {
        return "CatalogCoin(unused=" + this.unused + ")";
    }

    public CatalogCoin(int i) {
        this.unused = i;
    }

    public /* synthetic */ CatalogCoin(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ CatalogCoin copy$default(CatalogCoin catalogCoin, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = catalogCoin.unused;
        }
        return catalogCoin.copy(i);
    }

    public final String getUid() {
        String str = this.uid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        return null;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
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

    public final String getDenominationSideUrl() {
        return this.denominationSideUrl;
    }

    public final void setDenominationSideUrl(String str) {
        this.denominationSideUrl = str;
    }

    public final String getSubjectSideUrl() {
        return this.subjectSideUrl;
    }

    public final void setSubjectSideUrl(String str) {
        this.subjectSideUrl = str;
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

    public final CmsStaticUrl getCmsStaticUrl() {
        CmsStaticUrl cmsStaticUrl = this.cmsStaticUrl;
        if (cmsStaticUrl != null) {
            return cmsStaticUrl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cmsStaticUrl");
        return null;
    }

    public final void setCmsStaticUrl(CmsStaticUrl cmsStaticUrl) {
        Intrinsics.checkNotNullParameter(cmsStaticUrl, "<set-?>");
        this.cmsStaticUrl = cmsStaticUrl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatalogCoin(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(Args.uid) && !obj.isNull(Args.uid)) {
            setUid(obj.getString(Args.uid));
            if (obj.has("name") && !obj.isNull("name")) {
                setName(obj.getString("name"));
                if (obj.has("denomination_side_url") && !obj.isNull("denomination_side_url")) {
                    this.denominationSideUrl = obj.getString("denomination_side_url");
                } else {
                    this.denominationSideUrl = null;
                }
                if (obj.has("subject_side_url") && !obj.isNull("subject_side_url")) {
                    this.subjectSideUrl = obj.getString("subject_side_url");
                } else {
                    this.subjectSideUrl = null;
                }
                if (obj.has("time_range") && !obj.isNull("time_range")) {
                    setTimeRange(obj.getString("time_range"));
                    if (obj.has("cms_static_url") && !obj.isNull("cms_static_url")) {
                        Object obj2 = obj.get("cms_static_url");
                        if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                            obj2 = new JSONObject();
                        }
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        setCmsStaticUrl(new CmsStaticUrl((JSONObject) obj2));
                        return;
                    }
                    throw new ParameterCheckFailException("cmsStaticUrl is missing in model CatalogCoin");
                }
                throw new ParameterCheckFailException("timeRange is missing in model CatalogCoin");
            }
            throw new ParameterCheckFailException("name is missing in model CatalogCoin");
        }
        throw new ParameterCheckFailException("uid is missing in model CatalogCoin");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.uid, getUid());
        hashMap.put("name", getName());
        String str = this.denominationSideUrl;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("denomination_side_url", str);
        } else if (keepNull) {
            hashMap.put("denomination_side_url", null);
        }
        String str2 = this.subjectSideUrl;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("subject_side_url", str2);
        } else if (keepNull) {
            hashMap.put("subject_side_url", null);
        }
        hashMap.put("time_range", getTimeRange());
        hashMap.put("cms_static_url", getCmsStaticUrl().getJsonMap());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CatalogCoin)) {
            return false;
        }
        CatalogCoin catalogCoin = (CatalogCoin) other;
        return Intrinsics.areEqual(getUid(), catalogCoin.getUid()) && Intrinsics.areEqual(getName(), catalogCoin.getName()) && Intrinsics.areEqual(this.denominationSideUrl, catalogCoin.denominationSideUrl) && Intrinsics.areEqual(this.subjectSideUrl, catalogCoin.subjectSideUrl) && Intrinsics.areEqual(getTimeRange(), catalogCoin.getTimeRange()) && Intrinsics.areEqual(getCmsStaticUrl(), catalogCoin.getCmsStaticUrl());
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + getUid().hashCode()) * 31) + getName().hashCode()) * 31;
        String str = this.denominationSideUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.subjectSideUrl;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + getTimeRange().hashCode()) * 31) + getCmsStaticUrl().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CatalogCoin catalogCoin = new CatalogCoin(0, 1, null);
        cloneTo(catalogCoin);
        return catalogCoin;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.series.CatalogCoin");
        CatalogCoin catalogCoin = (CatalogCoin) o;
        super.cloneTo(catalogCoin);
        catalogCoin.setUid(cloneField(getUid()));
        catalogCoin.setName(cloneField(getName()));
        String str = this.denominationSideUrl;
        catalogCoin.denominationSideUrl = str != null ? cloneField(str) : null;
        String str2 = this.subjectSideUrl;
        catalogCoin.subjectSideUrl = str2 != null ? cloneField(str2) : null;
        catalogCoin.setTimeRange(cloneField(getTimeRange()));
        catalogCoin.setCmsStaticUrl((CmsStaticUrl) cloneField(getCmsStaticUrl()));
    }

    /* compiled from: CatalogCoin.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogCoin$Companion;", "", "<init>", "()V", "getCatalogCoinJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogCoin;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCatalogCoinJsonArrayMap(List<CatalogCoin> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CatalogCoin) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
