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

/* compiled from: ChangeItemCmsNameMessage.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001dH\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010$\u001a\u00020\u0007H\u0016J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\"H\u0016J\b\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070*H\u0016¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\t\u0010/\u001a\u00020\u0005HÄ\u0003J\t\u00100\u001a\u00020\u0007HÄ\u0003J\t\u00101\u001a\u00020\u0007HÄ\u0003J'\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u00065"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/ChangeItemCmsNameMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "itemId", "", "cmsNameUid", "", "cmsNameName", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getItemId", "()J", "setItemId", "(J)V", "getCmsNameUid", "()Ljava/lang/String;", "setCmsNameUid", "(Ljava/lang/String;)V", "getCmsNameName", "setCmsNameName", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ChangeItemCmsNameMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String cmsNameName;
    private String cmsNameUid;
    private long itemId;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final long getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    protected final String getCmsNameUid() {
        return this.cmsNameUid;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getCmsNameName() {
        return this.cmsNameName;
    }

    public final ChangeItemCmsNameMessage copy(long itemId, String cmsNameUid, String cmsNameName) {
        Intrinsics.checkNotNullParameter(cmsNameUid, "cmsNameUid");
        Intrinsics.checkNotNullParameter(cmsNameName, "cmsNameName");
        return new ChangeItemCmsNameMessage(itemId, cmsNameUid, cmsNameName);
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
        return "ChangeItemCmsNameMessage(itemId=" + this.itemId + ", cmsNameUid=" + this.cmsNameUid + ", cmsNameName=" + this.cmsNameName + ")";
    }

    public static /* synthetic */ ChangeItemCmsNameMessage copy$default(ChangeItemCmsNameMessage changeItemCmsNameMessage, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = changeItemCmsNameMessage.itemId;
        }
        if ((i & 2) != 0) {
            str = changeItemCmsNameMessage.cmsNameUid;
        }
        if ((i & 4) != 0) {
            str2 = changeItemCmsNameMessage.cmsNameName;
        }
        return changeItemCmsNameMessage.copy(j, str, str2);
    }

    protected final long getItemId() {
        return this.itemId;
    }

    protected final void setItemId(long j) {
        this.itemId = j;
    }

    protected final String getCmsNameUid() {
        return this.cmsNameUid;
    }

    protected final void setCmsNameUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cmsNameUid = str;
    }

    protected final String getCmsNameName() {
        return this.cmsNameName;
    }

    protected final void setCmsNameName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cmsNameName = str;
    }

    public ChangeItemCmsNameMessage(long j, String cmsNameUid, String cmsNameName) {
        Intrinsics.checkNotNullParameter(cmsNameUid, "cmsNameUid");
        Intrinsics.checkNotNullParameter(cmsNameName, "cmsNameName");
        this.itemId = j;
        this.cmsNameUid = cmsNameUid;
        this.cmsNameName = cmsNameName;
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
        hashMap.put("cms_name_uid", this.cmsNameUid);
        hashMap.put("cms_name_name", this.cmsNameName);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof ChangeItemCmsNameMessage)) {
            return false;
        }
        ChangeItemCmsNameMessage changeItemCmsNameMessage = (ChangeItemCmsNameMessage) other;
        return this.itemId == changeItemCmsNameMessage.itemId && Intrinsics.areEqual(this.cmsNameUid, changeItemCmsNameMessage.cmsNameUid) && Intrinsics.areEqual(this.cmsNameName, changeItemCmsNameMessage.cmsNameName);
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
        if (other == null || !(other instanceof ChangeItemCmsNameMessage)) {
            return false;
        }
        ChangeItemCmsNameMessage changeItemCmsNameMessage = (ChangeItemCmsNameMessage) other;
        return this.itemId == changeItemCmsNameMessage.itemId && Intrinsics.areEqual(this.cmsNameUid, changeItemCmsNameMessage.cmsNameUid) && Intrinsics.areEqual(this.cmsNameName, changeItemCmsNameMessage.cmsNameName);
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + Long.hashCode(this.itemId)) * 31) + this.cmsNameUid.hashCode()) * 31) + this.cmsNameName.hashCode();
    }

    /* compiled from: ChangeItemCmsNameMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/ChangeItemCmsNameMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/item/change_item_cms_name";
        }
    }
}
