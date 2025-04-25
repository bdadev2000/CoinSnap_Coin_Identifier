package com.glority.component.generatedAPI.kotlinAPI.item;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SimpleItem.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001NB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010A0@2\u0006\u0010B\u001a\u00020CJ\u0016\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010A0@H\u0016J\u0013\u0010D\u001a\u00020C2\b\u0010E\u001a\u0004\u0018\u00010AH\u0096\u0002J\b\u0010F\u001a\u00020\u0005H\u0016J\b\u0010G\u001a\u00020AH\u0016J\u0012\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010AH\u0014J\t\u0010K\u001a\u00020\u0005HÂ\u0003J\u0013\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010M\u001a\u00020\u001eHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001c\u0010)\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u001c\u0010,\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001c\u0010/\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\u001c\u00102\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001e\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010<\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b=\u00108\"\u0004\b>\u0010:¨\u0006O"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/SimpleItem;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "itemId", "", "getItemId", "()J", "setItemId", "(J)V", "itemImage", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage;", "getItemImage", "()Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage;", "setItemImage", "(Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage;)V", "shootAt", "Ljava/util/Date;", "getShootAt", "()Ljava/util/Date;", "setShootAt", "(Ljava/util/Date;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "cmsNameUid", "getCmsNameUid", "setCmsNameUid", "latinName", "getLatinName", "setLatinName", "customName", "getCustomName", "setCustomName", "customNote", "getCustomNote", "setCustomNote", "properties", "getProperties", "setProperties", "cmsCacheBusinessFields", "getCmsCacheBusinessFields", "setCmsCacheBusinessFields", "lng", "", "getLng", "()Ljava/lang/Double;", "setLng", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "lat", "getLat", "setLat", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class SimpleItem extends APIModelBase<SimpleItem> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String cmsCacheBusinessFields;
    private String cmsNameUid;
    private String customName;
    private String customNote;
    private long itemId;
    public ItemImage itemImage;
    private Double lat;
    private String latinName;
    private Double lng;
    public String name;
    private String properties;
    public Date shootAt;
    private int unused;

    public SimpleItem() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final SimpleItem copy(int unused) {
        return new SimpleItem(unused);
    }

    public String toString() {
        return "SimpleItem(unused=" + this.unused + ")";
    }

    public SimpleItem(int i) {
        this.unused = i;
    }

    public /* synthetic */ SimpleItem(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ SimpleItem copy$default(SimpleItem simpleItem, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simpleItem.unused;
        }
        return simpleItem.copy(i);
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final void setItemId(long j) {
        this.itemId = j;
    }

    public final ItemImage getItemImage() {
        ItemImage itemImage = this.itemImage;
        if (itemImage != null) {
            return itemImage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemImage");
        return null;
    }

    public final void setItemImage(ItemImage itemImage) {
        Intrinsics.checkNotNullParameter(itemImage, "<set-?>");
        this.itemImage = itemImage;
    }

    public final Date getShootAt() {
        Date date = this.shootAt;
        if (date != null) {
            return date;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shootAt");
        return null;
    }

    public final void setShootAt(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.shootAt = date;
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

    public final String getCmsNameUid() {
        return this.cmsNameUid;
    }

    public final void setCmsNameUid(String str) {
        this.cmsNameUid = str;
    }

    public final String getLatinName() {
        return this.latinName;
    }

    public final void setLatinName(String str) {
        this.latinName = str;
    }

    public final String getCustomName() {
        return this.customName;
    }

    public final void setCustomName(String str) {
        this.customName = str;
    }

    public final String getCustomNote() {
        return this.customNote;
    }

    public final void setCustomNote(String str) {
        this.customNote = str;
    }

    public final String getProperties() {
        return this.properties;
    }

    public final void setProperties(String str) {
        this.properties = str;
    }

    public final String getCmsCacheBusinessFields() {
        return this.cmsCacheBusinessFields;
    }

    public final void setCmsCacheBusinessFields(String str) {
        this.cmsCacheBusinessFields = str;
    }

    public final Double getLng() {
        return this.lng;
    }

    public final void setLng(Double d) {
        this.lng = d;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final void setLat(Double d) {
        this.lat = d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleItem(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(FirebaseAnalytics.Param.ITEM_ID) && !obj.isNull(FirebaseAnalytics.Param.ITEM_ID)) {
            this.itemId = obj.getLong(FirebaseAnalytics.Param.ITEM_ID);
            if (obj.has("item_image") && !obj.isNull("item_image")) {
                Object obj2 = obj.get("item_image");
                if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                    obj2 = new JSONObject();
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                setItemImage(new ItemImage((JSONObject) obj2));
                if (obj.has("shoot_at") && !obj.isNull("shoot_at")) {
                    setShootAt(new Date(obj.getLong("shoot_at") * 1000));
                    if (obj.has("name") && !obj.isNull("name")) {
                        setName(obj.getString("name"));
                        if (obj.has("cms_name_uid") && !obj.isNull("cms_name_uid")) {
                            this.cmsNameUid = obj.getString("cms_name_uid");
                        } else {
                            this.cmsNameUid = null;
                        }
                        if (obj.has("latin_name") && !obj.isNull("latin_name")) {
                            this.latinName = obj.getString("latin_name");
                        } else {
                            this.latinName = null;
                        }
                        if (obj.has("custom_name") && !obj.isNull("custom_name")) {
                            this.customName = obj.getString("custom_name");
                        } else {
                            this.customName = null;
                        }
                        if (obj.has("custom_note") && !obj.isNull("custom_note")) {
                            this.customNote = obj.getString("custom_note");
                        } else {
                            this.customNote = null;
                        }
                        if (obj.has("properties") && !obj.isNull("properties")) {
                            this.properties = obj.getString("properties");
                        } else {
                            this.properties = null;
                        }
                        if (obj.has("cms_cache_business_fields") && !obj.isNull("cms_cache_business_fields")) {
                            this.cmsCacheBusinessFields = obj.getString("cms_cache_business_fields");
                        } else {
                            this.cmsCacheBusinessFields = null;
                        }
                        if (obj.has("lng") && !obj.isNull("lng")) {
                            this.lng = Double.valueOf(obj.getDouble("lng"));
                        } else {
                            this.lng = null;
                        }
                        if (obj.has("lat") && !obj.isNull("lat")) {
                            this.lat = Double.valueOf(obj.getDouble("lat"));
                            return;
                        } else {
                            this.lat = null;
                            return;
                        }
                    }
                    throw new ParameterCheckFailException("name is missing in model SimpleItem");
                }
                throw new ParameterCheckFailException("shootAt is missing in model SimpleItem");
            }
            throw new ParameterCheckFailException("itemImage is missing in model SimpleItem");
        }
        throw new ParameterCheckFailException("itemId is missing in model SimpleItem");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.Param.ITEM_ID, Long.valueOf(this.itemId));
        hashMap.put("item_image", getItemImage().getJsonMap());
        hashMap.put("shoot_at", Long.valueOf(getShootAt().getTime() / 1000));
        hashMap.put("name", getName());
        String str = this.cmsNameUid;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("cms_name_uid", str);
        } else if (keepNull) {
            hashMap.put("cms_name_uid", null);
        }
        String str2 = this.latinName;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("latin_name", str2);
        } else if (keepNull) {
            hashMap.put("latin_name", null);
        }
        String str3 = this.customName;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("custom_name", str3);
        } else if (keepNull) {
            hashMap.put("custom_name", null);
        }
        String str4 = this.customNote;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("custom_note", str4);
        } else if (keepNull) {
            hashMap.put("custom_note", null);
        }
        String str5 = this.properties;
        if (str5 != null) {
            Intrinsics.checkNotNull(str5);
            hashMap.put("properties", str5);
        } else if (keepNull) {
            hashMap.put("properties", null);
        }
        String str6 = this.cmsCacheBusinessFields;
        if (str6 != null) {
            Intrinsics.checkNotNull(str6);
            hashMap.put("cms_cache_business_fields", str6);
        } else if (keepNull) {
            hashMap.put("cms_cache_business_fields", null);
        }
        Double d = this.lng;
        if (d != null) {
            Intrinsics.checkNotNull(d);
            hashMap.put("lng", d);
        } else if (keepNull) {
            hashMap.put("lng", null);
        }
        Double d2 = this.lat;
        if (d2 != null) {
            Intrinsics.checkNotNull(d2);
            hashMap.put("lat", d2);
        } else if (keepNull) {
            hashMap.put("lat", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof SimpleItem)) {
            return false;
        }
        SimpleItem simpleItem = (SimpleItem) other;
        return this.itemId == simpleItem.itemId && Intrinsics.areEqual(getItemImage(), simpleItem.getItemImage()) && Intrinsics.areEqual(getShootAt(), simpleItem.getShootAt()) && Intrinsics.areEqual(getName(), simpleItem.getName()) && Intrinsics.areEqual(this.cmsNameUid, simpleItem.cmsNameUid) && Intrinsics.areEqual(this.latinName, simpleItem.latinName) && Intrinsics.areEqual(this.customName, simpleItem.customName) && Intrinsics.areEqual(this.customNote, simpleItem.customNote) && Intrinsics.areEqual(this.properties, simpleItem.properties) && Intrinsics.areEqual(this.cmsCacheBusinessFields, simpleItem.cmsCacheBusinessFields) && Intrinsics.areEqual(this.lng, simpleItem.lng) && Intrinsics.areEqual(this.lat, simpleItem.lat);
    }

    public int hashCode() {
        int hashCode = ((((((((getClass().hashCode() * 31) + Long.hashCode(this.itemId)) * 31) + getItemImage().hashCode()) * 31) + getShootAt().hashCode()) * 31) + getName().hashCode()) * 31;
        String str = this.cmsNameUid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.latinName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.customName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.customNote;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.properties;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.cmsCacheBusinessFields;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Double d = this.lng;
        int hashCode8 = (hashCode7 + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.lat;
        return hashCode8 + (d2 != null ? d2.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        SimpleItem simpleItem = new SimpleItem(0, 1, null);
        cloneTo(simpleItem);
        return simpleItem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.item.SimpleItem");
        SimpleItem simpleItem = (SimpleItem) o;
        super.cloneTo(simpleItem);
        simpleItem.itemId = cloneField(Long.valueOf(this.itemId)).longValue();
        simpleItem.setItemImage((ItemImage) cloneField(getItemImage()));
        simpleItem.setShootAt(cloneField(getShootAt()));
        simpleItem.setName(cloneField(getName()));
        String str = this.cmsNameUid;
        simpleItem.cmsNameUid = str != null ? cloneField(str) : null;
        String str2 = this.latinName;
        simpleItem.latinName = str2 != null ? cloneField(str2) : null;
        String str3 = this.customName;
        simpleItem.customName = str3 != null ? cloneField(str3) : null;
        String str4 = this.customNote;
        simpleItem.customNote = str4 != null ? cloneField(str4) : null;
        String str5 = this.properties;
        simpleItem.properties = str5 != null ? cloneField(str5) : null;
        String str6 = this.cmsCacheBusinessFields;
        simpleItem.cmsCacheBusinessFields = str6 != null ? cloneField(str6) : null;
        Double d = this.lng;
        simpleItem.lng = d != null ? cloneField(d) : null;
        Double d2 = this.lat;
        simpleItem.lat = d2 != null ? cloneField(d2) : null;
    }

    /* compiled from: SimpleItem.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/SimpleItem$Companion;", "", "<init>", "()V", "getSimpleItemJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/item/SimpleItem;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getSimpleItemJsonArrayMap(List<SimpleItem> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SimpleItem) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
