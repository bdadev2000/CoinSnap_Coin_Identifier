package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: EnableEventMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\t\u0010\u0013\u001a\u00020\u0005HÄ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÄ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0016¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0007H\u0016J\b\u0010$\u001a\u00020\u0007H\u0016J\u0012\u0010%\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006/"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EnableEventMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "eventId", "", "enable", "", "(Ljava/lang/String;Z)V", "getEnable", "()Z", "setEnable", "(Z)V", "getEventId", "()Ljava/lang/String;", "setEventId", "(Ljava/lang/String;)V", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "component1", "component2", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class EnableEventMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean enable;
    private String eventId;

    public static /* synthetic */ EnableEventMessage copy$default(EnableEventMessage enableEventMessage, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enableEventMessage.eventId;
        }
        if ((i & 2) != 0) {
            z = enableEventMessage.enable;
        }
        return enableEventMessage.copy(str, z);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    protected final boolean getEnable() {
        return this.enable;
    }

    public final EnableEventMessage copy(String eventId, boolean enable) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return new EnableEventMessage(eventId, enable);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean forceHttps() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean mustAuth() {
        return false;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean needAuth() {
        return false;
    }

    public String toString() {
        return "EnableEventMessage(eventId=" + this.eventId + ", enable=" + this.enable + ")";
    }

    protected final String getEventId() {
        return this.eventId;
    }

    protected final void setEventId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventId = str;
    }

    protected final boolean getEnable() {
        return this.enable;
    }

    protected final void setEnable(boolean z) {
        this.enable = z;
    }

    public EnableEventMessage(String eventId, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.eventId = eventId;
        this.enable = z;
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
        hashMap.put("eventId", this.eventId);
        hashMap.put("enable", Integer.valueOf(this.enable ? 1 : 0));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof EnableEventMessage)) {
            return false;
        }
        EnableEventMessage enableEventMessage = (EnableEventMessage) other;
        return !(Intrinsics.areEqual(this.eventId, enableEventMessage.eventId) ^ true) && this.enable == enableEventMessage.enable;
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
        if (other == null || !(other instanceof EnableEventMessage)) {
            return false;
        }
        EnableEventMessage enableEventMessage = (EnableEventMessage) other;
        return !(Intrinsics.areEqual(this.eventId, enableEventMessage.eventId) ^ true) && this.enable == enableEventMessage.enable;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + this.eventId.hashCode()) * 31) + Boolean.valueOf(this.enable).hashCode();
    }

    /* compiled from: EnableEventMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EnableEventMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v1/trackingconfig/enable_event";
        }
    }
}
