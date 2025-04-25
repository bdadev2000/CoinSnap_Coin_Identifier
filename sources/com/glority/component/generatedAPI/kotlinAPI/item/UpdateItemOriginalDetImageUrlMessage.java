package com.glority.component.generatedAPI.kotlinAPI.item;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: UpdateItemOriginalDetImageUrlMessage.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u000f\b\u0086\b\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KBI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0016J\u0014\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020100H\u0016J\u0014\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020300H\u0016J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000101H\u0016J\b\u00107\u001a\u00020\u0007H\u0016J\b\u00108\u001a\u000205H\u0016J\b\u00109\u001a\u000205H\u0016J\b\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u000205H\u0016J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070=H\u0016¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u0010@\u001a\u00020\nH\u0016J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J^\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010IJ\t\u0010J\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017¨\u0006L"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/UpdateItemOriginalDetImageUrlMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "itemId", "", "originalDetImageUrl", "", "originalImageSha1", "originalImageHeight", "", "originalImageWidth", "originalImageFileSize", "originalImageFileFormat", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getItemId", "()J", "setItemId", "(J)V", "getOriginalDetImageUrl", "()Ljava/lang/String;", "setOriginalDetImageUrl", "(Ljava/lang/String;)V", "getOriginalImageSha1", "setOriginalImageSha1", "getOriginalImageHeight", "()Ljava/lang/Integer;", "setOriginalImageHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOriginalImageWidth", "setOriginalImageWidth", "getOriginalImageFileSize", "()Ljava/lang/Long;", "setOriginalImageFileSize", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOriginalImageFileFormat", "setOriginalImageFileFormat", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/glority/component/generatedAPI/kotlinAPI/item/UpdateItemOriginalDetImageUrlMessage;", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class UpdateItemOriginalDetImageUrlMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long itemId;
    private String originalDetImageUrl;
    private String originalImageFileFormat;
    private Long originalImageFileSize;
    private Integer originalImageHeight;
    private String originalImageSha1;
    private Integer originalImageWidth;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginalDetImageUrl() {
        return this.originalDetImageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginalImageSha1() {
        return this.originalImageSha1;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getOriginalImageHeight() {
        return this.originalImageHeight;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getOriginalImageWidth() {
        return this.originalImageWidth;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getOriginalImageFileSize() {
        return this.originalImageFileSize;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOriginalImageFileFormat() {
        return this.originalImageFileFormat;
    }

    public final UpdateItemOriginalDetImageUrlMessage copy(long itemId, String originalDetImageUrl, String originalImageSha1, Integer originalImageHeight, Integer originalImageWidth, Long originalImageFileSize, String originalImageFileFormat) {
        Intrinsics.checkNotNullParameter(originalDetImageUrl, "originalDetImageUrl");
        return new UpdateItemOriginalDetImageUrlMessage(itemId, originalDetImageUrl, originalImageSha1, originalImageHeight, originalImageWidth, originalImageFileSize, originalImageFileFormat);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean forceHttps() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean mustAuth() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean needAuth() {
        return true;
    }

    public String toString() {
        return "UpdateItemOriginalDetImageUrlMessage(itemId=" + this.itemId + ", originalDetImageUrl=" + this.originalDetImageUrl + ", originalImageSha1=" + this.originalImageSha1 + ", originalImageHeight=" + this.originalImageHeight + ", originalImageWidth=" + this.originalImageWidth + ", originalImageFileSize=" + this.originalImageFileSize + ", originalImageFileFormat=" + this.originalImageFileFormat + ")";
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final void setItemId(long j) {
        this.itemId = j;
    }

    public final String getOriginalDetImageUrl() {
        return this.originalDetImageUrl;
    }

    public final void setOriginalDetImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originalDetImageUrl = str;
    }

    public final String getOriginalImageSha1() {
        return this.originalImageSha1;
    }

    public final void setOriginalImageSha1(String str) {
        this.originalImageSha1 = str;
    }

    public final Integer getOriginalImageHeight() {
        return this.originalImageHeight;
    }

    public final void setOriginalImageHeight(Integer num) {
        this.originalImageHeight = num;
    }

    public final Integer getOriginalImageWidth() {
        return this.originalImageWidth;
    }

    public final void setOriginalImageWidth(Integer num) {
        this.originalImageWidth = num;
    }

    public final Long getOriginalImageFileSize() {
        return this.originalImageFileSize;
    }

    public final void setOriginalImageFileSize(Long l) {
        this.originalImageFileSize = l;
    }

    public final String getOriginalImageFileFormat() {
        return this.originalImageFileFormat;
    }

    public final void setOriginalImageFileFormat(String str) {
        this.originalImageFileFormat = str;
    }

    public UpdateItemOriginalDetImageUrlMessage(long j, String originalDetImageUrl, String str, Integer num, Integer num2, Long l, String str2) {
        Intrinsics.checkNotNullParameter(originalDetImageUrl, "originalDetImageUrl");
        this.itemId = j;
        this.originalDetImageUrl = originalDetImageUrl;
        this.originalImageSha1 = str;
        this.originalImageHeight = num;
        this.originalImageWidth = num2;
        this.originalImageFileSize = l;
        this.originalImageFileFormat = str2;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this._response_at = new Date();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.Param.ITEM_ID, Long.valueOf(this.itemId));
        hashMap.put("original_det_image_url", this.originalDetImageUrl);
        String str = this.originalImageSha1;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("original_image_sha1", str);
        }
        Integer num = this.originalImageHeight;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("original_image_height", num);
        }
        Integer num2 = this.originalImageWidth;
        if (num2 != null) {
            Intrinsics.checkNotNull(num2);
            hashMap.put("original_image_width", num2);
        }
        Long l = this.originalImageFileSize;
        if (l != null) {
            Intrinsics.checkNotNull(l);
            hashMap.put("original_image_file_size", l);
        }
        String str2 = this.originalImageFileFormat;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("original_image_file_format", str2);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof UpdateItemOriginalDetImageUrlMessage)) {
            return false;
        }
        UpdateItemOriginalDetImageUrlMessage updateItemOriginalDetImageUrlMessage = (UpdateItemOriginalDetImageUrlMessage) other;
        return this.itemId == updateItemOriginalDetImageUrlMessage.itemId && Intrinsics.areEqual(this.originalDetImageUrl, updateItemOriginalDetImageUrlMessage.originalDetImageUrl) && Intrinsics.areEqual(this.originalImageSha1, updateItemOriginalDetImageUrlMessage.originalImageSha1) && Intrinsics.areEqual(this.originalImageHeight, updateItemOriginalDetImageUrlMessage.originalImageHeight) && Intrinsics.areEqual(this.originalImageWidth, updateItemOriginalDetImageUrlMessage.originalImageWidth) && Intrinsics.areEqual(this.originalImageFileSize, updateItemOriginalDetImageUrlMessage.originalImageFileSize) && Intrinsics.areEqual(this.originalImageFileFormat, updateItemOriginalDetImageUrlMessage.originalImageFileFormat);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{"post"};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof UpdateItemOriginalDetImageUrlMessage)) {
            return false;
        }
        UpdateItemOriginalDetImageUrlMessage updateItemOriginalDetImageUrlMessage = (UpdateItemOriginalDetImageUrlMessage) other;
        return this.itemId == updateItemOriginalDetImageUrlMessage.itemId && Intrinsics.areEqual(this.originalDetImageUrl, updateItemOriginalDetImageUrlMessage.originalDetImageUrl) && Intrinsics.areEqual(this.originalImageSha1, updateItemOriginalDetImageUrlMessage.originalImageSha1) && Intrinsics.areEqual(this.originalImageHeight, updateItemOriginalDetImageUrlMessage.originalImageHeight) && Intrinsics.areEqual(this.originalImageWidth, updateItemOriginalDetImageUrlMessage.originalImageWidth) && Intrinsics.areEqual(this.originalImageFileSize, updateItemOriginalDetImageUrlMessage.originalImageFileSize) && Intrinsics.areEqual(this.originalImageFileFormat, updateItemOriginalDetImageUrlMessage.originalImageFileFormat);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + Long.hashCode(this.itemId)) * 31) + this.originalDetImageUrl.hashCode()) * 31;
        String str = this.originalImageSha1;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.originalImageHeight;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.originalImageWidth;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Long l = this.originalImageFileSize;
        int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.originalImageFileFormat;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    /* compiled from: UpdateItemOriginalDetImageUrlMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/UpdateItemOriginalDetImageUrlMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/item/update_item_original_det_image_url";
        }
    }
}
