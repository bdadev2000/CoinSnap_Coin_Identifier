package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

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

/* compiled from: Product.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0014J\t\u0010\u001c\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"H\u0016J\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"2\u0006\u0010#\u001a\u00020\u001fJ\b\u0010$\u001a\u00020\bH\u0016J\t\u0010%\u001a\u00020\u000bHÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Product;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "productBusinessId", "getProductBusinessId", "()Ljava/lang/String;", "setProductBusinessId", "(Ljava/lang/String;)V", "productId", "getProductId", "setProductId", "productName", "getProductName", "setProductName", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class Product extends APIModelBase<Product> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String productBusinessId;
    private String productId;
    public String productName;
    private int unused;

    public Product() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ Product copy$default(Product product, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = product.unused;
        }
        return product.copy(i);
    }

    public final Product copy(int unused) {
        return new Product(unused);
    }

    public String toString() {
        return "Product(unused=" + this.unused + ")";
    }

    public Product(int i) {
        this.unused = i;
    }

    public /* synthetic */ Product(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final String getProductBusinessId() {
        String str = this.productBusinessId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productBusinessId");
        }
        return str;
    }

    public final void setProductBusinessId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productBusinessId = str;
    }

    public final String getProductName() {
        String str = this.productName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productName");
        }
        return str;
    }

    public final void setProductName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productName = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Product(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("productId") && !obj.isNull("productId")) {
            this.productId = obj.getString("productId");
        } else {
            this.productId = null;
        }
        if (obj.has("productBusinessId") && !obj.isNull("productBusinessId")) {
            String string = obj.getString("productBusinessId");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"productBusinessId\")");
            this.productBusinessId = string;
            if (obj.has("productName") && !obj.isNull("productName")) {
                String string2 = obj.getString("productName");
                Intrinsics.checkNotNullExpressionValue(string2, "obj.getString(\"productName\")");
                this.productName = string2;
                return;
            }
            throw new ParameterCheckFailException("productName is missing in model Product");
        }
        throw new ParameterCheckFailException("productBusinessId is missing in model Product");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.productId;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("productId", str);
        } else if (keepNull) {
            hashMap.put("productId", null);
        }
        String str2 = this.productBusinessId;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productBusinessId");
        }
        hashMap.put("productBusinessId", str2);
        String str3 = this.productName;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productName");
        }
        hashMap.put("productName", str3);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        if (!Intrinsics.areEqual(this.productId, product.productId)) {
            return false;
        }
        if (this.productBusinessId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productBusinessId");
        }
        if (product.productBusinessId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productBusinessId");
        }
        if (!Intrinsics.areEqual(r1, r4)) {
            return false;
        }
        String str = this.productName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productName");
        }
        String str2 = product.productName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productName");
        }
        return !(Intrinsics.areEqual(str, str2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.productId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.productBusinessId;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productBusinessId");
        }
        int hashCode3 = (hashCode2 + str2.hashCode()) * 31;
        String str3 = this.productName;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productName");
        }
        return hashCode3 + str3.hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Product product = new Product(0, 1, null);
        cloneTo(product);
        return product;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            Product product = (Product) o;
            super.cloneTo(product);
            String str = this.productId;
            product.productId = str != null ? cloneField(str) : null;
            String str2 = this.productBusinessId;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productBusinessId");
            }
            String cloneField = cloneField(str2);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.productBusinessId)");
            product.productBusinessId = cloneField;
            String str3 = this.productName;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productName");
            }
            String cloneField2 = cloneField(str3);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.productName)");
            product.productName = cloneField2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.Product");
    }

    /* compiled from: Product.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Product$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getProductJsonArrayMap", "", "array", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Product;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getProductJsonArrayMap(List<Product> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Product) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
