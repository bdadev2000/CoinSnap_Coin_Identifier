package com.glority.component.generatedAPI.kotlinAPI.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
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

/* compiled from: UpdateItemOriginalImageUrlMessage.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JBG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010'\u001a\u00020\u0007H\u0016J\b\u0010(\u001a\u00020)H\u0016J\t\u0010*\u001a\u00020\u0005HÄ\u0003J\t\u0010+\u001a\u00020\u0007HÄ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÄ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010.\u001a\u0004\u0018\u00010\nHÄ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÄ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÄ\u0003J^\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020)2\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\b\u00106\u001a\u00020)H\u0016J\u0014\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020908H\u0016J\u0014\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020508H\u0016J\b\u0010;\u001a\u00020\nH\u0016J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070=H\u0016¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020)H\u0016J\b\u0010@\u001a\u00020)H\u0016J\u0012\u0010A\u001a\u00020)2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\t\u0010B\u001a\u00020\u0007HÖ\u0001J\u0010\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020D2\u0006\u0010H\u001a\u00020IH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0084\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001f¨\u0006K"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/storage/UpdateItemOriginalImageUrlMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "itemId", "", "originalImageUrl", "", "originalImageSha1", "originalImageHeight", "", "originalImageWidth", "originalImageFileSize", "originalImageFileFormat", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getItemId", "()J", "setItemId", "(J)V", "getOriginalImageFileFormat", "()Ljava/lang/String;", "setOriginalImageFileFormat", "(Ljava/lang/String;)V", "getOriginalImageFileSize", "()Ljava/lang/Long;", "setOriginalImageFileSize", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOriginalImageHeight", "()Ljava/lang/Integer;", "setOriginalImageHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOriginalImageSha1", "setOriginalImageSha1", "getOriginalImageUrl", "setOriginalImageUrl", "getOriginalImageWidth", "setOriginalImageWidth", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/glority/component/generatedAPI/kotlinAPI/storage/UpdateItemOriginalImageUrlMessage;", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class UpdateItemOriginalImageUrlMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long itemId;
    private String originalImageFileFormat;
    private Long originalImageFileSize;
    private Integer originalImageHeight;
    private String originalImageSha1;
    private String originalImageUrl;
    private Integer originalImageWidth;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final long getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    protected final String getOriginalImageUrl() {
        return this.originalImageUrl;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getOriginalImageSha1() {
        return this.originalImageSha1;
    }

    /* renamed from: component4, reason: from getter */
    protected final Integer getOriginalImageHeight() {
        return this.originalImageHeight;
    }

    /* renamed from: component5, reason: from getter */
    protected final Integer getOriginalImageWidth() {
        return this.originalImageWidth;
    }

    /* renamed from: component6, reason: from getter */
    protected final Long getOriginalImageFileSize() {
        return this.originalImageFileSize;
    }

    /* renamed from: component7, reason: from getter */
    protected final String getOriginalImageFileFormat() {
        return this.originalImageFileFormat;
    }

    public final UpdateItemOriginalImageUrlMessage copy(long itemId, String originalImageUrl, String originalImageSha1, Integer originalImageHeight, Integer originalImageWidth, Long originalImageFileSize, String originalImageFileFormat) {
        Intrinsics.checkNotNullParameter(originalImageUrl, "originalImageUrl");
        return new UpdateItemOriginalImageUrlMessage(itemId, originalImageUrl, originalImageSha1, originalImageHeight, originalImageWidth, originalImageFileSize, originalImageFileFormat);
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
        return "UpdateItemOriginalImageUrlMessage(itemId=" + this.itemId + ", originalImageUrl=" + this.originalImageUrl + ", originalImageSha1=" + ((Object) this.originalImageSha1) + ", originalImageHeight=" + this.originalImageHeight + ", originalImageWidth=" + this.originalImageWidth + ", originalImageFileSize=" + this.originalImageFileSize + ", originalImageFileFormat=" + ((Object) this.originalImageFileFormat) + ')';
    }

    protected final long getItemId() {
        return this.itemId;
    }

    protected final void setItemId(long j) {
        this.itemId = j;
    }

    protected final String getOriginalImageUrl() {
        return this.originalImageUrl;
    }

    protected final void setOriginalImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originalImageUrl = str;
    }

    protected final String getOriginalImageSha1() {
        return this.originalImageSha1;
    }

    protected final void setOriginalImageSha1(String str) {
        this.originalImageSha1 = str;
    }

    protected final Integer getOriginalImageHeight() {
        return this.originalImageHeight;
    }

    protected final void setOriginalImageHeight(Integer num) {
        this.originalImageHeight = num;
    }

    protected final Integer getOriginalImageWidth() {
        return this.originalImageWidth;
    }

    protected final void setOriginalImageWidth(Integer num) {
        this.originalImageWidth = num;
    }

    protected final Long getOriginalImageFileSize() {
        return this.originalImageFileSize;
    }

    protected final void setOriginalImageFileSize(Long l) {
        this.originalImageFileSize = l;
    }

    protected final String getOriginalImageFileFormat() {
        return this.originalImageFileFormat;
    }

    protected final void setOriginalImageFileFormat(String str) {
        this.originalImageFileFormat = str;
    }

    public UpdateItemOriginalImageUrlMessage(long j, String originalImageUrl, String str, Integer num, Integer num2, Long l, String str2) {
        Intrinsics.checkNotNullParameter(originalImageUrl, "originalImageUrl");
        this.itemId = j;
        this.originalImageUrl = originalImageUrl;
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
        hashMap.put("original_image_url", this.originalImageUrl);
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
        if (other == null || !(other instanceof UpdateItemOriginalImageUrlMessage)) {
            return false;
        }
        UpdateItemOriginalImageUrlMessage updateItemOriginalImageUrlMessage = (UpdateItemOriginalImageUrlMessage) other;
        return this.itemId == updateItemOriginalImageUrlMessage.itemId && Intrinsics.areEqual(this.originalImageUrl, updateItemOriginalImageUrlMessage.originalImageUrl) && Intrinsics.areEqual(this.originalImageSha1, updateItemOriginalImageUrlMessage.originalImageSha1) && Intrinsics.areEqual(this.originalImageHeight, updateItemOriginalImageUrlMessage.originalImageHeight) && Intrinsics.areEqual(this.originalImageWidth, updateItemOriginalImageUrlMessage.originalImageWidth) && Intrinsics.areEqual(this.originalImageFileSize, updateItemOriginalImageUrlMessage.originalImageFileSize) && Intrinsics.areEqual(this.originalImageFileFormat, updateItemOriginalImageUrlMessage.originalImageFileFormat);
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
        if (other == null || !(other instanceof UpdateItemOriginalImageUrlMessage)) {
            return false;
        }
        UpdateItemOriginalImageUrlMessage updateItemOriginalImageUrlMessage = (UpdateItemOriginalImageUrlMessage) other;
        return this.itemId == updateItemOriginalImageUrlMessage.itemId && Intrinsics.areEqual(this.originalImageUrl, updateItemOriginalImageUrlMessage.originalImageUrl) && Intrinsics.areEqual(this.originalImageSha1, updateItemOriginalImageUrlMessage.originalImageSha1) && Intrinsics.areEqual(this.originalImageHeight, updateItemOriginalImageUrlMessage.originalImageHeight) && Intrinsics.areEqual(this.originalImageWidth, updateItemOriginalImageUrlMessage.originalImageWidth) && Intrinsics.areEqual(this.originalImageFileSize, updateItemOriginalImageUrlMessage.originalImageFileSize) && Intrinsics.areEqual(this.originalImageFileFormat, updateItemOriginalImageUrlMessage.originalImageFileFormat);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + Long.hashCode(this.itemId)) * 31) + this.originalImageUrl.hashCode()) * 31;
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

    /* compiled from: UpdateItemOriginalImageUrlMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/storage/UpdateItemOriginalImageUrlMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/item/update_item_original_image_url";
        }
    }
}
