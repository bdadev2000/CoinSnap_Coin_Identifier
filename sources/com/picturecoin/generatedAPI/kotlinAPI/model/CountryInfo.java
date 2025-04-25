package com.picturecoin.generatedAPI.kotlinAPI.model;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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

/* compiled from: CountryInfo.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00012B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020'J\u0016\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0016J\u0013\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010%H\u0014J\t\u0010/\u001a\u00020\u0005HÂ\u0003J\u0013\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "countryCode3", "getCountryCode3", "setCountryCode3", "name", "getName", "setName", "currencyCode", "getCurrencyCode", "setCurrencyCode", "symbol", "getSymbol", "setSymbol", "capitalLocation", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/Location;", "getCapitalLocation", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/Location;", "setCapitalLocation", "(Lcom/picturecoin/generatedAPI/kotlinAPI/model/Location;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class CountryInfo extends APIModelBase<CountryInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Location capitalLocation;
    public String countryCode;
    public String countryCode3;
    public String currencyCode;
    public String name;
    public String symbol;
    private int unused;

    public CountryInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final CountryInfo copy(int unused) {
        return new CountryInfo(unused);
    }

    public String toString() {
        return "CountryInfo(unused=" + this.unused + ")";
    }

    public CountryInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ CountryInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ CountryInfo copy$default(CountryInfo countryInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = countryInfo.unused;
        }
        return countryInfo.copy(i);
    }

    public final String getCountryCode() {
        String str = this.countryCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        return null;
    }

    public final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public final String getCountryCode3() {
        String str = this.countryCode3;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("countryCode3");
        return null;
    }

    public final void setCountryCode3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode3 = str;
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

    public final String getCurrencyCode() {
        String str = this.currencyCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currencyCode");
        return null;
    }

    public final void setCurrencyCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currencyCode = str;
    }

    public final String getSymbol() {
        String str = this.symbol;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("symbol");
        return null;
    }

    public final void setSymbol(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbol = str;
    }

    public final Location getCapitalLocation() {
        return this.capitalLocation;
    }

    public final void setCapitalLocation(Location location) {
        this.capitalLocation = location;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("country_code") && !obj.isNull("country_code")) {
            setCountryCode(obj.getString("country_code"));
            if (obj.has("country_code3") && !obj.isNull("country_code3")) {
                setCountryCode3(obj.getString("country_code3"));
                if (obj.has("name") && !obj.isNull("name")) {
                    setName(obj.getString("name"));
                    if (obj.has("currency_code") && !obj.isNull("currency_code")) {
                        setCurrencyCode(obj.getString("currency_code"));
                        if (obj.has("symbol") && !obj.isNull("symbol")) {
                            setSymbol(obj.getString("symbol"));
                            if (obj.has("capital_location") && !obj.isNull("capital_location")) {
                                Object obj2 = obj.get("capital_location");
                                if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                                    obj2 = new JSONObject();
                                }
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                                this.capitalLocation = new Location((JSONObject) obj2);
                                return;
                            }
                            this.capitalLocation = null;
                            return;
                        }
                        throw new ParameterCheckFailException("symbol is missing in model CountryInfo");
                    }
                    throw new ParameterCheckFailException("currencyCode is missing in model CountryInfo");
                }
                throw new ParameterCheckFailException("name is missing in model CountryInfo");
            }
            throw new ParameterCheckFailException("countryCode3 is missing in model CountryInfo");
        }
        throw new ParameterCheckFailException("countryCode is missing in model CountryInfo");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("country_code", getCountryCode());
        hashMap.put("country_code3", getCountryCode3());
        hashMap.put("name", getName());
        hashMap.put("currency_code", getCurrencyCode());
        hashMap.put("symbol", getSymbol());
        Location location = this.capitalLocation;
        if (location != null) {
            Intrinsics.checkNotNull(location);
            hashMap.put("capital_location", location.getJsonMap());
        } else if (keepNull) {
            hashMap.put("capital_location", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CountryInfo)) {
            return false;
        }
        CountryInfo countryInfo = (CountryInfo) other;
        return Intrinsics.areEqual(getCountryCode(), countryInfo.getCountryCode()) && Intrinsics.areEqual(getCountryCode3(), countryInfo.getCountryCode3()) && Intrinsics.areEqual(getName(), countryInfo.getName()) && Intrinsics.areEqual(getCurrencyCode(), countryInfo.getCurrencyCode()) && Intrinsics.areEqual(getSymbol(), countryInfo.getSymbol()) && Intrinsics.areEqual(this.capitalLocation, countryInfo.capitalLocation);
    }

    public int hashCode() {
        int hashCode = ((((((((((getClass().hashCode() * 31) + getCountryCode().hashCode()) * 31) + getCountryCode3().hashCode()) * 31) + getName().hashCode()) * 31) + getCurrencyCode().hashCode()) * 31) + getSymbol().hashCode()) * 31;
        Location location = this.capitalLocation;
        return hashCode + (location != null ? location.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CountryInfo countryInfo = new CountryInfo(0, 1, null);
        cloneTo(countryInfo);
        return countryInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo");
        CountryInfo countryInfo = (CountryInfo) o;
        super.cloneTo(countryInfo);
        countryInfo.setCountryCode(cloneField(getCountryCode()));
        countryInfo.setCountryCode3(cloneField(getCountryCode3()));
        countryInfo.setName(cloneField(getName()));
        countryInfo.setCurrencyCode(cloneField(getCurrencyCode()));
        countryInfo.setSymbol(cloneField(getSymbol()));
        APIModelBase aPIModelBase = this.capitalLocation;
        countryInfo.capitalLocation = aPIModelBase != null ? (Location) cloneField(aPIModelBase) : null;
    }

    /* compiled from: CountryInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo$Companion;", "", "<init>", "()V", "getCountryInfoJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCountryInfoJsonArrayMap(List<CountryInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CountryInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
