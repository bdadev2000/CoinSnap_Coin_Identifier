package com.glority.component.generatedAPI.kotlinAPI.item;

import com.glority.android.core.definition.APIModelBase;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
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

/* compiled from: ItemDetail.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001OB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010B0A2\u0006\u0010C\u001a\u00020DJ\u0016\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010B0AH\u0016J\u0013\u0010E\u001a\u00020D2\b\u0010F\u001a\u0004\u0018\u00010BH\u0096\u0002J\b\u0010G\u001a\u00020\u0005H\u0016J\b\u0010H\u001a\u00020BH\u0016J\u0012\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010BH\u0014J\t\u0010L\u001a\u00020\u0005HÂ\u0003J\u0013\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010N\u001a\u00020\u001eHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001c\u0010)\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u001c\u0010,\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001c\u0010/\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\u001c\u00102\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R \u00105\u001a\b\u0012\u0004\u0012\u00020706X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010<\u001a\b\u0012\u0004\u0012\u00020=06X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00109\"\u0004\b?\u0010;¨\u0006P"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemDetail;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "itemId", "", "getItemId", "()J", "setItemId", "(J)V", "itemImage", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage;", "getItemImage", "()Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage;", "setItemImage", "(Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage;)V", "shootAt", "Ljava/util/Date;", "getShootAt", "()Ljava/util/Date;", "setShootAt", "(Ljava/util/Date;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "cmsNameUid", "getCmsNameUid", "setCmsNameUid", "latinName", "getLatinName", "setLatinName", "customName", "getCustomName", "setCustomName", "customNote", "getCustomNote", "setCustomNote", "properties", "getProperties", "setProperties", "cmsCacheBusinessFields", "getCmsCacheBusinessFields", "setCmsCacheBusinessFields", "cmsNames", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCmsNames", "()Ljava/util/List;", "setCmsNames", "(Ljava/util/List;)V", "probabilities", "", "getProbabilities", "setProbabilities", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ItemDetail extends APIModelBase<ItemDetail> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String cmsCacheBusinessFields;
    private String cmsNameUid;
    public List<CmsName> cmsNames;
    private String customName;
    private String customNote;
    private long itemId;
    public ItemImage itemImage;
    private String latinName;
    public String name;
    public List<Double> probabilities;
    private String properties;
    public Date shootAt;
    private int unused;

    public ItemDetail() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final ItemDetail copy(int unused) {
        return new ItemDetail(unused);
    }

    public String toString() {
        return "ItemDetail(unused=" + this.unused + ")";
    }

    public ItemDetail(int i) {
        this.unused = i;
    }

    public /* synthetic */ ItemDetail(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ ItemDetail copy$default(ItemDetail itemDetail, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = itemDetail.unused;
        }
        return itemDetail.copy(i);
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

    public final List<CmsName> getCmsNames() {
        List<CmsName> list = this.cmsNames;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cmsNames");
        return null;
    }

    public final void setCmsNames(List<CmsName> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cmsNames = list;
    }

    public final List<Double> getProbabilities() {
        List<Double> list = this.probabilities;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("probabilities");
        return null;
    }

    public final void setProbabilities(List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.probabilities = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ItemDetail(org.json.JSONObject r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.item.ItemDetail.<init>(org.json.JSONObject):void");
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
        hashMap.put("cms_names", CmsName.INSTANCE.getCmsNameJsonArrayMap(getCmsNames()));
        hashMap.put("probabilities", getProbabilities());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof ItemDetail)) {
            return false;
        }
        ItemDetail itemDetail = (ItemDetail) other;
        return this.itemId == itemDetail.itemId && Intrinsics.areEqual(getItemImage(), itemDetail.getItemImage()) && Intrinsics.areEqual(getShootAt(), itemDetail.getShootAt()) && Intrinsics.areEqual(getName(), itemDetail.getName()) && Intrinsics.areEqual(this.cmsNameUid, itemDetail.cmsNameUid) && Intrinsics.areEqual(this.latinName, itemDetail.latinName) && Intrinsics.areEqual(this.customName, itemDetail.customName) && Intrinsics.areEqual(this.customNote, itemDetail.customNote) && Intrinsics.areEqual(this.properties, itemDetail.properties) && Intrinsics.areEqual(this.cmsCacheBusinessFields, itemDetail.cmsCacheBusinessFields) && Intrinsics.areEqual(getCmsNames(), itemDetail.getCmsNames()) && Intrinsics.areEqual(getProbabilities(), itemDetail.getProbabilities());
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
        return ((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + getCmsNames().hashCode()) * 31) + getProbabilities().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ItemDetail itemDetail = new ItemDetail(0, 1, null);
        cloneTo(itemDetail);
        return itemDetail;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.item.ItemDetail");
        ItemDetail itemDetail = (ItemDetail) o;
        super.cloneTo(itemDetail);
        itemDetail.itemId = cloneField(Long.valueOf(this.itemId)).longValue();
        itemDetail.setItemImage((ItemImage) cloneField(getItemImage()));
        itemDetail.setShootAt(cloneField(getShootAt()));
        itemDetail.setName(cloneField(getName()));
        String str = this.cmsNameUid;
        itemDetail.cmsNameUid = str != null ? cloneField(str) : null;
        String str2 = this.latinName;
        itemDetail.latinName = str2 != null ? cloneField(str2) : null;
        String str3 = this.customName;
        itemDetail.customName = str3 != null ? cloneField(str3) : null;
        String str4 = this.customNote;
        itemDetail.customNote = str4 != null ? cloneField(str4) : null;
        String str5 = this.properties;
        itemDetail.properties = str5 != null ? cloneField(str5) : null;
        String str6 = this.cmsCacheBusinessFields;
        itemDetail.cmsCacheBusinessFields = str6 != null ? cloneField(str6) : null;
        itemDetail.setCmsNames(new ArrayList());
        List<CmsName> cmsNames = getCmsNames();
        Intrinsics.checkNotNull(cmsNames);
        for (CmsName cmsName : cmsNames) {
            List<CmsName> cmsNames2 = itemDetail.getCmsNames();
            Intrinsics.checkNotNull(cmsNames2);
            APIModelBase cloneField = cloneField(cmsName);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            cmsNames2.add(cloneField);
        }
        itemDetail.setProbabilities(new ArrayList());
        List<Double> probabilities = getProbabilities();
        Intrinsics.checkNotNull(probabilities);
        Iterator<Double> it = probabilities.iterator();
        while (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            List<Double> probabilities2 = itemDetail.getProbabilities();
            Intrinsics.checkNotNull(probabilities2);
            Double cloneField2 = cloneField(Double.valueOf(doubleValue));
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(...)");
            probabilities2.add(cloneField2);
        }
    }

    /* compiled from: ItemDetail.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemDetail$Companion;", "", "<init>", "()V", "getItemDetailJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemDetail;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getItemDetailJsonArrayMap(List<ItemDetail> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ItemDetail) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("cmsNames", CmsName.class);
            hashMap.put("probabilities", Double.TYPE);
            return hashMap;
        }
    }
}
