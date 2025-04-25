package com.glority.component.generatedAPI.kotlinAPI.item;

import com.glority.android.core.definition.APIModelBase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ItemImage.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00010B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010#0\"2\u0006\u0010$\u001a\u00020%J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010#0\"H\u0016J\u0013\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020#H\u0016J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010#H\u0014J\t\u0010-\u001a\u00020\u0005HÂ\u0003J\u0013\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010/\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R&\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012¨\u00061"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "iconUrl", "", "getIconUrl$annotations", "()V", "getIconUrl", "()Ljava/lang/String;", "setIconUrl", "(Ljava/lang/String;)V", "thumbnailUrl", "getThumbnailUrl$annotations", "getThumbnailUrl", "setThumbnailUrl", "imageUrl", "getImageUrl$annotations", "getImageUrl", "setImageUrl", "originalUrl", "getOriginalUrl", "setOriginalUrl", "signatureImageUrl", "getSignatureImageUrl", "setSignatureImageUrl", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ItemImage extends APIModelBase<ItemImage> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String iconUrl;
    private String imageUrl;
    private String originalUrl;
    private String signatureImageUrl;
    private String thumbnailUrl;
    private int unused;

    public ItemImage() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    @Deprecated(message = "")
    public static /* synthetic */ void getIconUrl$annotations() {
    }

    @Deprecated(message = "")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @Deprecated(message = "")
    public static /* synthetic */ void getThumbnailUrl$annotations() {
    }

    public final ItemImage copy(int unused) {
        return new ItemImage(unused);
    }

    public String toString() {
        return "ItemImage(unused=" + this.unused + ")";
    }

    public ItemImage(int i) {
        this.unused = i;
    }

    public /* synthetic */ ItemImage(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ ItemImage copy$default(ItemImage itemImage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = itemImage.unused;
        }
        return itemImage.copy(i);
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final void setThumbnailUrl(String str) {
        this.thumbnailUrl = str;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public final void setOriginalUrl(String str) {
        this.originalUrl = str;
    }

    public final String getSignatureImageUrl() {
        return this.signatureImageUrl;
    }

    public final void setSignatureImageUrl(String str) {
        this.signatureImageUrl = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemImage(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("icon_url") && !obj.isNull("icon_url")) {
            this.iconUrl = obj.getString("icon_url");
        } else {
            this.iconUrl = null;
        }
        if (obj.has("thumbnail_url") && !obj.isNull("thumbnail_url")) {
            this.thumbnailUrl = obj.getString("thumbnail_url");
        } else {
            this.thumbnailUrl = null;
        }
        if (obj.has("image_url") && !obj.isNull("image_url")) {
            this.imageUrl = obj.getString("image_url");
        } else {
            this.imageUrl = null;
        }
        if (obj.has("original_url") && !obj.isNull("original_url")) {
            this.originalUrl = obj.getString("original_url");
        } else {
            this.originalUrl = null;
        }
        if (obj.has("signature_image_url") && !obj.isNull("signature_image_url")) {
            this.signatureImageUrl = obj.getString("signature_image_url");
        } else {
            this.signatureImageUrl = null;
        }
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.iconUrl;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("icon_url", str);
        } else if (keepNull) {
            hashMap.put("icon_url", null);
        }
        String str2 = this.thumbnailUrl;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("thumbnail_url", str2);
        } else if (keepNull) {
            hashMap.put("thumbnail_url", null);
        }
        String str3 = this.imageUrl;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("image_url", str3);
        } else if (keepNull) {
            hashMap.put("image_url", null);
        }
        String str4 = this.originalUrl;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("original_url", str4);
        } else if (keepNull) {
            hashMap.put("original_url", null);
        }
        String str5 = this.signatureImageUrl;
        if (str5 != null) {
            Intrinsics.checkNotNull(str5);
            hashMap.put("signature_image_url", str5);
        } else if (keepNull) {
            hashMap.put("signature_image_url", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof ItemImage)) {
            return false;
        }
        ItemImage itemImage = (ItemImage) other;
        return Intrinsics.areEqual(this.iconUrl, itemImage.iconUrl) && Intrinsics.areEqual(this.thumbnailUrl, itemImage.thumbnailUrl) && Intrinsics.areEqual(this.imageUrl, itemImage.imageUrl) && Intrinsics.areEqual(this.originalUrl, itemImage.originalUrl) && Intrinsics.areEqual(this.signatureImageUrl, itemImage.signatureImageUrl);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.iconUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.thumbnailUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.imageUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.originalUrl;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.signatureImageUrl;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ItemImage itemImage = new ItemImage(0, 1, null);
        cloneTo(itemImage);
        return itemImage;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.item.ItemImage");
        ItemImage itemImage = (ItemImage) o;
        super.cloneTo(itemImage);
        String str = this.iconUrl;
        itemImage.iconUrl = str != null ? cloneField(str) : null;
        String str2 = this.thumbnailUrl;
        itemImage.thumbnailUrl = str2 != null ? cloneField(str2) : null;
        String str3 = this.imageUrl;
        itemImage.imageUrl = str3 != null ? cloneField(str3) : null;
        String str4 = this.originalUrl;
        itemImage.originalUrl = str4 != null ? cloneField(str4) : null;
        String str5 = this.signatureImageUrl;
        itemImage.signatureImageUrl = str5 != null ? cloneField(str5) : null;
    }

    /* compiled from: ItemImage.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage$Companion;", "", "<init>", "()V", "getItemImageJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getItemImageJsonArrayMap(List<ItemImage> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ItemImage) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
