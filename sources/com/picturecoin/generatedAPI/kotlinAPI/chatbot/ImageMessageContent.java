package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
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
import org.json.JSONObject;

/* compiled from: ImageMessageContent.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00018B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010,\u001a\u00020-J\u0016\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010+0*H\u0016J\u0013\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020+H\u0016J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010+H\u0014J\t\u00105\u001a\u00020\u0005HÂ\u0003J\u0013\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00107\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00069"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ImageMessageContent;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "itemId", "", "getItemId", "()J", "setItemId", "(J)V", Args.itemType, "getItemType", "setItemType", "text", "getText", "setText", "photoFrom", "getPhotoFrom", "()Ljava/lang/Integer;", "setPhotoFrom", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shootAt", "Ljava/util/Date;", "getShootAt", "()Ljava/util/Date;", "setShootAt", "(Ljava/util/Date;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class ImageMessageContent extends APIModelBase<ImageMessageContent> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long itemId;
    public String itemType;
    private Integer photoFrom;
    private Date shootAt;
    private String text;
    private int unused;
    public String url;

    public ImageMessageContent() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final ImageMessageContent copy(int unused) {
        return new ImageMessageContent(unused);
    }

    public String toString() {
        return "ImageMessageContent(unused=" + this.unused + ")";
    }

    public ImageMessageContent(int i) {
        this.unused = i;
    }

    public /* synthetic */ ImageMessageContent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ ImageMessageContent copy$default(ImageMessageContent imageMessageContent, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = imageMessageContent.unused;
        }
        return imageMessageContent.copy(i);
    }

    public final String getUrl() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("url");
        return null;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final void setItemId(long j) {
        this.itemId = j;
    }

    public final String getItemType() {
        String str = this.itemType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.itemType);
        return null;
    }

    public final void setItemType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemType = str;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final Integer getPhotoFrom() {
        return this.photoFrom;
    }

    public final void setPhotoFrom(Integer num) {
        this.photoFrom = num;
    }

    public final Date getShootAt() {
        return this.shootAt;
    }

    public final void setShootAt(Date date) {
        this.shootAt = date;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageMessageContent(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("url") && !obj.isNull("url")) {
            setUrl(obj.getString("url"));
            if (obj.has(FirebaseAnalytics.Param.ITEM_ID) && !obj.isNull(FirebaseAnalytics.Param.ITEM_ID)) {
                this.itemId = obj.getLong(FirebaseAnalytics.Param.ITEM_ID);
                if (obj.has("item_type") && !obj.isNull("item_type")) {
                    setItemType(obj.getString("item_type"));
                    if (obj.has("text") && !obj.isNull("text")) {
                        this.text = obj.getString("text");
                    } else {
                        this.text = null;
                    }
                    if (obj.has("photo_from") && !obj.isNull("photo_from")) {
                        this.photoFrom = Integer.valueOf(obj.getInt("photo_from"));
                    } else {
                        this.photoFrom = null;
                    }
                    if (obj.has("shoot_at") && !obj.isNull("shoot_at")) {
                        this.shootAt = new Date(obj.getLong("shoot_at") * 1000);
                        return;
                    } else {
                        this.shootAt = null;
                        return;
                    }
                }
                throw new ParameterCheckFailException("itemType is missing in model ImageMessageContent");
            }
            throw new ParameterCheckFailException("itemId is missing in model ImageMessageContent");
        }
        throw new ParameterCheckFailException("url is missing in model ImageMessageContent");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", getUrl());
        hashMap.put(FirebaseAnalytics.Param.ITEM_ID, Long.valueOf(this.itemId));
        hashMap.put("item_type", getItemType());
        String str = this.text;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("text", str);
        } else if (keepNull) {
            hashMap.put("text", null);
        }
        Integer num = this.photoFrom;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("photo_from", num);
        } else if (keepNull) {
            hashMap.put("photo_from", null);
        }
        Date date = this.shootAt;
        if (date != null) {
            Intrinsics.checkNotNull(date);
            hashMap.put("shoot_at", Long.valueOf(date.getTime() / 1000));
        } else if (keepNull) {
            hashMap.put("shoot_at", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof ImageMessageContent)) {
            return false;
        }
        ImageMessageContent imageMessageContent = (ImageMessageContent) other;
        return Intrinsics.areEqual(getUrl(), imageMessageContent.getUrl()) && this.itemId == imageMessageContent.itemId && Intrinsics.areEqual(getItemType(), imageMessageContent.getItemType()) && Intrinsics.areEqual(this.text, imageMessageContent.text) && Intrinsics.areEqual(this.photoFrom, imageMessageContent.photoFrom) && Intrinsics.areEqual(this.shootAt, imageMessageContent.shootAt);
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + getUrl().hashCode()) * 31) + Long.hashCode(this.itemId)) * 31) + getItemType().hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.photoFrom;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Date date = this.shootAt;
        return hashCode3 + (date != null ? date.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ImageMessageContent imageMessageContent = new ImageMessageContent(0, 1, null);
        cloneTo(imageMessageContent);
        return imageMessageContent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.chatbot.ImageMessageContent");
        ImageMessageContent imageMessageContent = (ImageMessageContent) o;
        super.cloneTo(imageMessageContent);
        imageMessageContent.setUrl(cloneField(getUrl()));
        imageMessageContent.itemId = cloneField(Long.valueOf(this.itemId)).longValue();
        imageMessageContent.setItemType(cloneField(getItemType()));
        String str = this.text;
        imageMessageContent.text = str != null ? cloneField(str) : null;
        Integer num = this.photoFrom;
        imageMessageContent.photoFrom = num != null ? cloneField(num) : null;
        Date date = this.shootAt;
        imageMessageContent.shootAt = date != null ? cloneField(date) : null;
    }

    /* compiled from: ImageMessageContent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ImageMessageContent$Companion;", "", "<init>", "()V", "getImageMessageContentJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ImageMessageContent;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getImageMessageContentJsonArrayMap(List<ImageMessageContent> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ImageMessageContent) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
