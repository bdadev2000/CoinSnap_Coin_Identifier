package com.picturecoin.generatedAPI.kotlinAPI.collection;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.picturecoin.generatedAPI.kotlinAPI.enums.BestCollectionType;
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

/* compiled from: BestCollection.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001'B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0014J\t\u0010$\u001a\u00020\u0005HÂ\u0003J\u0013\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010&\u001a\u00020\u0019HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/BestCollection;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "type", "Lcom/picturecoin/generatedAPI/kotlinAPI/enums/BestCollectionType;", "getType", "()Lcom/picturecoin/generatedAPI/kotlinAPI/enums/BestCollectionType;", "setType", "(Lcom/picturecoin/generatedAPI/kotlinAPI/enums/BestCollectionType;)V", "collection", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "getCollection", "()Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "setCollection", "(Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;)V", "getJsonMap", "", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class BestCollection extends APIModelBase<BestCollection> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public Collection collection;
    public BestCollectionType type;
    private int unused;

    public BestCollection() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final BestCollection copy(int unused) {
        return new BestCollection(unused);
    }

    public String toString() {
        return "BestCollection(unused=" + this.unused + ")";
    }

    public BestCollection(int i) {
        this.unused = i;
    }

    public /* synthetic */ BestCollection(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ BestCollection copy$default(BestCollection bestCollection, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bestCollection.unused;
        }
        return bestCollection.copy(i);
    }

    public final BestCollectionType getType() {
        BestCollectionType bestCollectionType = this.type;
        if (bestCollectionType != null) {
            return bestCollectionType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        return null;
    }

    public final void setType(BestCollectionType bestCollectionType) {
        Intrinsics.checkNotNullParameter(bestCollectionType, "<set-?>");
        this.type = bestCollectionType;
    }

    public final Collection getCollection() {
        Collection collection = this.collection;
        if (collection != null) {
            return collection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("collection");
        return null;
    }

    public final void setCollection(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<set-?>");
        this.collection = collection;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BestCollection(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("type") && !obj.isNull("type")) {
            setType(BestCollectionType.INSTANCE.fromValue(obj.getInt("type")));
            if (obj.has("collection") && !obj.isNull("collection")) {
                Object obj2 = obj.get("collection");
                if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                    obj2 = new JSONObject();
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                setCollection(new Collection((JSONObject) obj2));
                return;
            }
            throw new ParameterCheckFailException("collection is missing in model BestCollection");
        }
        throw new ParameterCheckFailException("type is missing in model BestCollection");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(getType().getValue()));
        hashMap.put("collection", getCollection().getJsonMap());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof BestCollection)) {
            return false;
        }
        BestCollection bestCollection = (BestCollection) other;
        return getType() == bestCollection.getType() && Intrinsics.areEqual(getCollection(), bestCollection.getCollection());
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + getType().hashCode()) * 31) + getCollection().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        BestCollection bestCollection = new BestCollection(0, 1, null);
        cloneTo(bestCollection);
        return bestCollection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.collection.BestCollection");
        BestCollection bestCollection = (BestCollection) o;
        super.cloneTo(bestCollection);
        bestCollection.setType((BestCollectionType) cloneField(getType()));
        bestCollection.setCollection((Collection) cloneField(getCollection()));
    }

    /* compiled from: BestCollection.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/BestCollection$Companion;", "", "<init>", "()V", "getBestCollectionJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/BestCollection;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getBestCollectionJsonArrayMap(List<BestCollection> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BestCollection) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
