package com.picturecoin.generatedAPI.kotlinAPI.model;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: PriceValue.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bH\u0016J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001cH\u0014J\t\u0010&\u001a\u00020\u0005HÂ\u0003J\u0013\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010(\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "setCurrencyCode", "(Ljava/lang/String;)V", "symbol", "getSymbol", "setSymbol", "value", "", "getValue", "()D", "setValue", "(D)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class PriceValue extends APIModelBase<PriceValue> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String currencyCode;
    public String symbol;
    private int unused;
    private double value;

    public PriceValue() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final PriceValue copy(int unused) {
        return new PriceValue(unused);
    }

    public String toString() {
        return "PriceValue(unused=" + this.unused + ")";
    }

    public PriceValue(int i) {
        this.unused = i;
    }

    public /* synthetic */ PriceValue(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ PriceValue copy$default(PriceValue priceValue, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = priceValue.unused;
        }
        return priceValue.copy(i);
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

    public final double getValue() {
        return this.value;
    }

    public final void setValue(double d) {
        this.value = d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceValue(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("currency_code") && !obj.isNull("currency_code")) {
            setCurrencyCode(obj.getString("currency_code"));
            if (obj.has("symbol") && !obj.isNull("symbol")) {
                setSymbol(obj.getString("symbol"));
                if (obj.has("value") && !obj.isNull("value")) {
                    this.value = obj.getDouble("value");
                    return;
                }
                throw new ParameterCheckFailException("value is missing in model PriceValue");
            }
            throw new ParameterCheckFailException("symbol is missing in model PriceValue");
        }
        throw new ParameterCheckFailException("currencyCode is missing in model PriceValue");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("currency_code", getCurrencyCode());
        hashMap.put("symbol", getSymbol());
        hashMap.put("value", Double.valueOf(this.value));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof PriceValue)) {
            PriceValue priceValue = (PriceValue) other;
            if (Intrinsics.areEqual(getCurrencyCode(), priceValue.getCurrencyCode()) && Intrinsics.areEqual(getSymbol(), priceValue.getSymbol()) && this.value == priceValue.value) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + getCurrencyCode().hashCode()) * 31) + getSymbol().hashCode()) * 31) + Double.hashCode(this.value);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        PriceValue priceValue = new PriceValue(0, 1, null);
        cloneTo(priceValue);
        return priceValue;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue");
        PriceValue priceValue = (PriceValue) o;
        super.cloneTo(priceValue);
        priceValue.setCurrencyCode(cloneField(getCurrencyCode()));
        priceValue.setSymbol(cloneField(getSymbol()));
        priceValue.value = cloneField(Double.valueOf(this.value)).doubleValue();
    }

    /* compiled from: PriceValue.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue$Companion;", "", "<init>", "()V", "getPriceValueJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getPriceValueJsonArrayMap(List<PriceValue> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PriceValue) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
