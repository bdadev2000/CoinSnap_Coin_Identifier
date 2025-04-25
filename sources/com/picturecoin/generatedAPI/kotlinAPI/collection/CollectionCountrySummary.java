package com.picturecoin.generatedAPI.kotlinAPI.collection;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
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

/* compiled from: CollectionCountrySummary.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001%B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0016J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0018H\u0014J\t\u0010\"\u001a\u00020\u0005HÂ\u0003J\u0013\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010$\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0007¨\u0006&"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "issuerCountry", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "getIssuerCountry", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "setIssuerCountry", "(Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;)V", "totalCount", "getTotalCount", "()I", "setTotalCount", "getJsonMap", "", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class CollectionCountrySummary extends APIModelBase<CollectionCountrySummary> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CountryInfo issuerCountry;
    private int totalCount;
    private int unused;

    public CollectionCountrySummary() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final CollectionCountrySummary copy(int unused) {
        return new CollectionCountrySummary(unused);
    }

    public String toString() {
        return "CollectionCountrySummary(unused=" + this.unused + ")";
    }

    public CollectionCountrySummary(int i) {
        this.unused = i;
    }

    public /* synthetic */ CollectionCountrySummary(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ CollectionCountrySummary copy$default(CollectionCountrySummary collectionCountrySummary, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = collectionCountrySummary.unused;
        }
        return collectionCountrySummary.copy(i);
    }

    public final CountryInfo getIssuerCountry() {
        CountryInfo countryInfo = this.issuerCountry;
        if (countryInfo != null) {
            return countryInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("issuerCountry");
        return null;
    }

    public final void setIssuerCountry(CountryInfo countryInfo) {
        Intrinsics.checkNotNullParameter(countryInfo, "<set-?>");
        this.issuerCountry = countryInfo;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final void setTotalCount(int i) {
        this.totalCount = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionCountrySummary(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("issuer_country") && !obj.isNull("issuer_country")) {
            Object obj2 = obj.get("issuer_country");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            setIssuerCountry(new CountryInfo((JSONObject) obj2));
            if (obj.has("total_count") && !obj.isNull("total_count")) {
                this.totalCount = obj.getInt("total_count");
                return;
            }
            throw new ParameterCheckFailException("totalCount is missing in model CollectionCountrySummary");
        }
        throw new ParameterCheckFailException("issuerCountry is missing in model CollectionCountrySummary");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("issuer_country", getIssuerCountry().getJsonMap());
        hashMap.put("total_count", Integer.valueOf(this.totalCount));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CollectionCountrySummary)) {
            return false;
        }
        CollectionCountrySummary collectionCountrySummary = (CollectionCountrySummary) other;
        return Intrinsics.areEqual(getIssuerCountry(), collectionCountrySummary.getIssuerCountry()) && this.totalCount == collectionCountrySummary.totalCount;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + getIssuerCountry().hashCode()) * 31) + Integer.hashCode(this.totalCount);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CollectionCountrySummary collectionCountrySummary = new CollectionCountrySummary(0, 1, null);
        cloneTo(collectionCountrySummary);
        return collectionCountrySummary;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary");
        CollectionCountrySummary collectionCountrySummary = (CollectionCountrySummary) o;
        super.cloneTo(collectionCountrySummary);
        collectionCountrySummary.setIssuerCountry((CountryInfo) cloneField(getIssuerCountry()));
        collectionCountrySummary.totalCount = cloneField(Integer.valueOf(this.totalCount)).intValue();
    }

    /* compiled from: CollectionCountrySummary.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary$Companion;", "", "<init>", "()V", "getCollectionCountrySummaryJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCollectionCountrySummaryJsonArrayMap(List<CollectionCountrySummary> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CollectionCountrySummary) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
