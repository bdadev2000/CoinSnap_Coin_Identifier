package com.glority.datareceiver.generatedAPI.kotlinAPI.datareceiver;

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

/* compiled from: EventsMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0005HÄ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÄ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÄ\u0003J\t\u0010 \u001a\u00020\u0005HÄ\u0003J\t\u0010!\u001a\u00020\u0005HÄ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020\u001cH\u0016J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020)0(H\u0016J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020%0(H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050.H\u0016¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u001cH\u0016J\b\u00101\u001a\u00020\u001cH\u0016J\u0012\u00102\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\t\u00103\u001a\u00020\u0005HÖ\u0001J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006<"}, d2 = {"Lcom/glority/datareceiver/generatedAPI/kotlinAPI/datareceiver/EventsMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "name", "", "createdAt", "Ljava/util/Date;", "payload", "source", "eventId", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getEventId", "()Ljava/lang/String;", "setEventId", "(Ljava/lang/String;)V", "getName", "setName", "getPayload", "setPayload", "getSource", "setSource", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class EventsMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Date createdAt;
    private String eventId;
    private String name;
    private String payload;
    private String source;

    public static /* synthetic */ EventsMessage copy$default(EventsMessage eventsMessage, String str, Date date, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventsMessage.name;
        }
        if ((i & 2) != 0) {
            date = eventsMessage.createdAt;
        }
        Date date2 = date;
        if ((i & 4) != 0) {
            str2 = eventsMessage.payload;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = eventsMessage.source;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = eventsMessage.eventId;
        }
        return eventsMessage.copy(str, date2, str5, str6, str4);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    protected final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getPayload() {
        return this.payload;
    }

    /* renamed from: component4, reason: from getter */
    protected final String getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    protected final String getEventId() {
        return this.eventId;
    }

    public final EventsMessage copy(String name, Date createdAt, String payload, String source, String eventId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return new EventsMessage(name, createdAt, payload, source, eventId);
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
        return "EventsMessage(name=" + this.name + ", createdAt=" + this.createdAt + ", payload=" + this.payload + ", source=" + this.source + ", eventId=" + this.eventId + ")";
    }

    protected final String getName() {
        return this.name;
    }

    protected final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    protected final Date getCreatedAt() {
        return this.createdAt;
    }

    protected final void setCreatedAt(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.createdAt = date;
    }

    protected final String getPayload() {
        return this.payload;
    }

    protected final void setPayload(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.payload = str;
    }

    protected final String getSource() {
        return this.source;
    }

    protected final void setSource(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    protected final String getEventId() {
        return this.eventId;
    }

    protected final void setEventId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventId = str;
    }

    public EventsMessage(String name, Date createdAt, String payload, String source, String eventId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.name = name;
        this.createdAt = createdAt;
        this.payload = payload;
        this.source = source;
        this.eventId = eventId;
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
        hashMap.put("name", this.name);
        hashMap.put("createdAt", Long.valueOf(this.createdAt.getTime() / 1000));
        hashMap.put("payload", this.payload);
        hashMap.put("source", this.source);
        hashMap.put("eventId", this.eventId);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof EventsMessage)) {
            return false;
        }
        EventsMessage eventsMessage = (EventsMessage) other;
        return ((Intrinsics.areEqual(this.name, eventsMessage.name) ^ true) || (Intrinsics.areEqual(this.createdAt, eventsMessage.createdAt) ^ true) || (Intrinsics.areEqual(this.payload, eventsMessage.payload) ^ true) || (Intrinsics.areEqual(this.source, eventsMessage.source) ^ true) || (Intrinsics.areEqual(this.eventId, eventsMessage.eventId) ^ true)) ? false : true;
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
        if (other == null || !(other instanceof EventsMessage)) {
            return false;
        }
        EventsMessage eventsMessage = (EventsMessage) other;
        return ((Intrinsics.areEqual(this.name, eventsMessage.name) ^ true) || (Intrinsics.areEqual(this.createdAt, eventsMessage.createdAt) ^ true) || (Intrinsics.areEqual(this.payload, eventsMessage.payload) ^ true) || (Intrinsics.areEqual(this.source, eventsMessage.source) ^ true) || (Intrinsics.areEqual(this.eventId, eventsMessage.eventId) ^ true)) ? false : true;
    }

    public int hashCode() {
        return (((((((((getClass().hashCode() * 31) + this.name.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.payload.hashCode()) * 31) + this.source.hashCode()) * 31) + this.eventId.hashCode();
    }

    /* compiled from: EventsMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/datareceiver/generatedAPI/kotlinAPI/datareceiver/EventsMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v1/datareceiver/events";
        }
    }
}
