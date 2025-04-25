package com.purchase.generatedAPI.kotlinAPI.model;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Price.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001&B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0016J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0014J\t\u0010#\u001a\u00020\u0005HÂ\u0003J\u0013\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/purchase/generatedAPI/kotlinAPI/model/Price;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "setAmount", "(Ljava/math/BigDecimal;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class Price extends APIModelBase<Price> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public BigDecimal amount;
    public String currency;
    private int unused;

    public Price() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final Price copy(int unused) {
        return new Price(unused);
    }

    public String toString() {
        return "Price(unused=" + this.unused + ")";
    }

    public Price(int i) {
        this.unused = i;
    }

    public /* synthetic */ Price(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ Price copy$default(Price price, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = price.unused;
        }
        return price.copy(i);
    }

    public final String getCurrency() {
        String str = this.currency;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.CURRENCY);
        return null;
    }

    public final void setCurrency(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currency = str;
    }

    public final BigDecimal getAmount() {
        BigDecimal bigDecimal = this.amount;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amount");
        return null;
    }

    public final void setAmount(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.amount = bigDecimal;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Price(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(FirebaseAnalytics.Param.CURRENCY) && !obj.isNull(FirebaseAnalytics.Param.CURRENCY)) {
            setCurrency(obj.getString(FirebaseAnalytics.Param.CURRENCY));
            if (obj.has("amount") && !obj.isNull("amount")) {
                setAmount(new BigDecimal(obj.getString("amount")));
                return;
            }
            throw new ParameterCheckFailException("amount is missing in model Price");
        }
        throw new ParameterCheckFailException("currency is missing in model Price");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.Param.CURRENCY, getCurrency());
        hashMap.put("amount", getAmount().toPlainString());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return Intrinsics.areEqual(getCurrency(), price.getCurrency()) && Intrinsics.areEqual(getAmount(), price.getAmount());
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + getCurrency().hashCode()) * 31) + getAmount().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Price price = new Price(0, 1, null);
        cloneTo(price);
        return price;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.purchase.generatedAPI.kotlinAPI.model.Price");
        Price price = (Price) o;
        super.cloneTo(price);
        price.setCurrency(cloneField(getCurrency()));
        price.setAmount(cloneField(getAmount()));
    }

    /* compiled from: Price.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/purchase/generatedAPI/kotlinAPI/model/Price$Companion;", "", "<init>", "()V", "getPriceJsonArrayMap", "", "", "", "array", "Lcom/purchase/generatedAPI/kotlinAPI/model/Price;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getPriceJsonArrayMap(List<Price> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Price) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
