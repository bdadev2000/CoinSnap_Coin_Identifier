package com.picturecoin.generatedAPI.kotlinAPI.wish;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
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
import org.json.JSONObject;

/* compiled from: Wishes.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00015B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010)\u001a\u00020*J\u0016\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010(0'H\u0016J\u0013\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020(H\u0016J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010(H\u0014J\t\u00102\u001a\u00020\u0005HÂ\u0003J\u0013\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00104\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00066"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/wish/Wishes;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.wishId, "getWishId", "()Ljava/lang/Integer;", "setWishId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", Args.uid, "", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "price", "getPrice", "setPrice", "name", "getName", "setName", "originalImageUrl", "getOriginalImageUrl", "setOriginalImageUrl", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class Wishes extends APIModelBase<Wishes> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Date createdAt;
    private String name;
    public String originalImageUrl;
    private String price;
    public String uid;
    private int unused;
    private Integer wishId;

    public Wishes() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final Wishes copy(int unused) {
        return new Wishes(unused);
    }

    public String toString() {
        return "Wishes(unused=" + this.unused + ")";
    }

    public Wishes(int i) {
        this.unused = i;
    }

    public /* synthetic */ Wishes(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ Wishes copy$default(Wishes wishes, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wishes.unused;
        }
        return wishes.copy(i);
    }

    public final Integer getWishId() {
        return this.wishId;
    }

    public final void setWishId(Integer num) {
        this.wishId = num;
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

    public final String getPrice() {
        return this.price;
    }

    public final void setPrice(String str) {
        this.price = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getOriginalImageUrl() {
        String str = this.originalImageUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("originalImageUrl");
        return null;
    }

    public final void setOriginalImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originalImageUrl = str;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Wishes(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("wish_id") && !obj.isNull("wish_id")) {
            this.wishId = Integer.valueOf(obj.getInt("wish_id"));
        } else {
            this.wishId = null;
        }
        if (obj.has(Args.uid) && !obj.isNull(Args.uid)) {
            setUid(obj.getString(Args.uid));
            if (obj.has("price") && !obj.isNull("price")) {
                this.price = obj.getString("price");
            } else {
                this.price = null;
            }
            if (obj.has("name") && !obj.isNull("name")) {
                this.name = obj.getString("name");
            } else {
                this.name = null;
            }
            if (obj.has("original_image_url") && !obj.isNull("original_image_url")) {
                setOriginalImageUrl(obj.getString("original_image_url"));
                if (obj.has("created_at") && !obj.isNull("created_at")) {
                    this.createdAt = new Date(obj.getLong("created_at") * 1000);
                    return;
                } else {
                    this.createdAt = null;
                    return;
                }
            }
            throw new ParameterCheckFailException("originalImageUrl is missing in model Wishes");
        }
        throw new ParameterCheckFailException("uid is missing in model Wishes");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        Integer num = this.wishId;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("wish_id", num);
        } else if (keepNull) {
            hashMap.put("wish_id", null);
        }
        hashMap.put(Args.uid, getUid());
        String str = this.price;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("price", str);
        } else if (keepNull) {
            hashMap.put("price", null);
        }
        String str2 = this.name;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("name", str2);
        } else if (keepNull) {
            hashMap.put("name", null);
        }
        hashMap.put("original_image_url", getOriginalImageUrl());
        Date date = this.createdAt;
        if (date != null) {
            Intrinsics.checkNotNull(date);
            hashMap.put("created_at", Long.valueOf(date.getTime() / 1000));
        } else if (keepNull) {
            hashMap.put("created_at", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Wishes)) {
            return false;
        }
        Wishes wishes = (Wishes) other;
        return Intrinsics.areEqual(this.wishId, wishes.wishId) && Intrinsics.areEqual(getUid(), wishes.getUid()) && Intrinsics.areEqual(this.price, wishes.price) && Intrinsics.areEqual(this.name, wishes.name) && Intrinsics.areEqual(getOriginalImageUrl(), wishes.getOriginalImageUrl()) && Intrinsics.areEqual(this.createdAt, wishes.createdAt);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        Integer num = this.wishId;
        int hashCode2 = (((hashCode + (num != null ? num.hashCode() : 0)) * 31) + getUid().hashCode()) * 31;
        String str = this.price;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int hashCode4 = (((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + getOriginalImageUrl().hashCode()) * 31;
        Date date = this.createdAt;
        return hashCode4 + (date != null ? date.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Wishes wishes = new Wishes(0, 1, null);
        cloneTo(wishes);
        return wishes;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.wish.Wishes");
        Wishes wishes = (Wishes) o;
        super.cloneTo(wishes);
        Integer num = this.wishId;
        wishes.wishId = num != null ? cloneField(num) : null;
        wishes.setUid(cloneField(getUid()));
        String str = this.price;
        wishes.price = str != null ? cloneField(str) : null;
        String str2 = this.name;
        wishes.name = str2 != null ? cloneField(str2) : null;
        wishes.setOriginalImageUrl(cloneField(getOriginalImageUrl()));
        Date date = this.createdAt;
        wishes.createdAt = date != null ? cloneField(date) : null;
    }

    /* compiled from: Wishes.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/wish/Wishes$Companion;", "", "<init>", "()V", "getWishesJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/wish/Wishes;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getWishesJsonArrayMap(List<Wishes> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Wishes) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
