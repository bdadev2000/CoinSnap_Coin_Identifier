package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import androidx.core.app.NotificationCompat;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetEventByIdMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0005HÄ\u0003J\u0013\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0012H\u0016J\b\u0010#\u001a\u00020\u0012H\u0016J\u0012\u0010$\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006."}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetEventByIdMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "eventId", "", "(Ljava/lang/String;)V", NotificationCompat.CATEGORY_EVENT, "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Event;", "getEvent", "()Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Event;", "setEvent", "(Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/Event;)V", "getEventId", "()Ljava/lang/String;", "setEventId", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class GetEventByIdMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public Event event;
    private String eventId;

    public static /* synthetic */ GetEventByIdMessage copy$default(GetEventByIdMessage getEventByIdMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getEventByIdMessage.eventId;
        }
        return getEventByIdMessage.copy(str);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getEventId() {
        return this.eventId;
    }

    public final GetEventByIdMessage copy(String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return new GetEventByIdMessage(eventId);
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
        return "GetEventByIdMessage(eventId=" + this.eventId + ")";
    }

    protected final String getEventId() {
        return this.eventId;
    }

    protected final void setEventId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventId = str;
    }

    public GetEventByIdMessage(String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.eventId = eventId;
    }

    public final Event getEvent() {
        Event event = this.event;
        if (event == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_EVENT);
        }
        return event;
    }

    public final void setEvent(Event event) {
        Intrinsics.checkNotNullParameter(event, "<set-?>");
        this.event = event;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(NotificationCompat.CATEGORY_EVENT) && !obj.isNull(NotificationCompat.CATEGORY_EVENT)) {
            Object obj2 = obj.get(NotificationCompat.CATEGORY_EVENT);
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            if (obj2 != null) {
                this.event = new Event((JSONObject) obj2);
                this._response_at = new Date();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        throw new ParameterCheckFailException("event is missing in api GetEventById");
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
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        return (other == null || !(other instanceof GetEventByIdMessage) || (Intrinsics.areEqual(this.eventId, ((GetEventByIdMessage) other).eventId) ^ true)) ? false : true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{LogEvents.exportemptyalert_close_click_type_get};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof GetEventByIdMessage)) {
            return false;
        }
        GetEventByIdMessage getEventByIdMessage = (GetEventByIdMessage) other;
        if (!Intrinsics.areEqual(this.eventId, getEventByIdMessage.eventId)) {
            return false;
        }
        Event event = this.event;
        if (event == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_EVENT);
        }
        Event event2 = getEventByIdMessage.event;
        if (event2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_EVENT);
        }
        return !(Intrinsics.areEqual(event, event2) ^ true);
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + this.eventId.hashCode()) * 31;
        Event event = this.event;
        if (event == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_EVENT);
        }
        return hashCode + event.hashCode();
    }

    /* compiled from: GetEventByIdMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetEventByIdMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v1/trackingconfig/get_event_by_id";
        }
    }
}
