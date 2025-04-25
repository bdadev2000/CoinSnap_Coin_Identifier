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

/* compiled from: UpdateItemOriginalImageUrlMessage.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d0\u001aH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070'H\u0016¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\t\u0010,\u001a\u00020\u0005HÄ\u0003J\t\u0010-\u001a\u00020\u0007HÄ\u0003J\u001d\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010/\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00061"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/UpdateItemOriginalImageUrlMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "itemId", "", "originalImageUrl", "", "<init>", "(JLjava/lang/String;)V", "getItemId", "()J", "setItemId", "(J)V", "getOriginalImageUrl", "()Ljava/lang/String;", "setOriginalImageUrl", "(Ljava/lang/String;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class UpdateItemOriginalImageUrlMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long itemId;
    private String originalImageUrl;

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

    public final UpdateItemOriginalImageUrlMessage copy(long itemId, String originalImageUrl) {
        Intrinsics.checkNotNullParameter(originalImageUrl, "originalImageUrl");
        return new UpdateItemOriginalImageUrlMessage(itemId, originalImageUrl);
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
        return "UpdateItemOriginalImageUrlMessage(itemId=" + this.itemId + ", originalImageUrl=" + this.originalImageUrl + ")";
    }

    public static /* synthetic */ UpdateItemOriginalImageUrlMessage copy$default(UpdateItemOriginalImageUrlMessage updateItemOriginalImageUrlMessage, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = updateItemOriginalImageUrlMessage.itemId;
        }
        if ((i & 2) != 0) {
            str = updateItemOriginalImageUrlMessage.originalImageUrl;
        }
        return updateItemOriginalImageUrlMessage.copy(j, str);
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

    public UpdateItemOriginalImageUrlMessage(long j, String originalImageUrl) {
        Intrinsics.checkNotNullParameter(originalImageUrl, "originalImageUrl");
        this.itemId = j;
        this.originalImageUrl = originalImageUrl;
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
        return this.itemId == updateItemOriginalImageUrlMessage.itemId && Intrinsics.areEqual(this.originalImageUrl, updateItemOriginalImageUrlMessage.originalImageUrl);
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
        return this.itemId == updateItemOriginalImageUrlMessage.itemId && Intrinsics.areEqual(this.originalImageUrl, updateItemOriginalImageUrlMessage.originalImageUrl);
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + Long.hashCode(this.itemId)) * 31) + this.originalImageUrl.hashCode();
    }

    /* compiled from: UpdateItemOriginalImageUrlMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/UpdateItemOriginalImageUrlMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
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
