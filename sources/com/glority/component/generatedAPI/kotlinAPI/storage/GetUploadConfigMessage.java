package com.glority.component.generatedAPI.kotlinAPI.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
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

/* compiled from: GetUploadConfigMessage.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0005HÂ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\bH\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\u0012\u0010 \u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0016J\t\u0010!\u001a\u00020\tHÖ\u0001J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006*"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/storage/GetUploadConfigMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "unused", "", "(I)V", "uploadTokenMap", "", "", "", "getUploadTokenMap", "()Ljava/util/Map;", "setUploadTokenMap", "(Ljava/util/Map;)V", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "copy", "equals", "other", "forceHttps", "getFiles", "Ljava/io/File;", "getParams", "hashCode", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class GetUploadConfigMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int unused;
    public Map<String, ? extends Object> uploadTokenMap;

    public GetUploadConfigMessage() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ GetUploadConfigMessage copy$default(GetUploadConfigMessage getUploadConfigMessage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getUploadConfigMessage.unused;
        }
        return getUploadConfigMessage.copy(i);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    public final GetUploadConfigMessage copy(int unused) {
        return new GetUploadConfigMessage(unused);
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
        return "GetUploadConfigMessage(unused=" + this.unused + ')';
    }

    public /* synthetic */ GetUploadConfigMessage(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public GetUploadConfigMessage(int i) {
        this.unused = i;
    }

    public final Map<String, Object> getUploadTokenMap() {
        Map<String, ? extends Object> map = this.uploadTokenMap;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uploadTokenMap");
        return null;
    }

    public final void setUploadTokenMap(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.uploadTokenMap = map;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("upload_token_map")) {
            Object obj2 = obj.get("upload_token_map");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            if (obj2 != null) {
                Map<String, Object> jsonObjectToMap = jsonObjectToMap((JSONObject) obj2);
                Intrinsics.checkNotNullExpressionValue(jsonObjectToMap, "jsonObjectToMap(uploadTokenMap_temp as JSONObject)");
                setUploadTokenMap(jsonObjectToMap);
                this._response_at = new Date();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        throw new ParameterCheckFailException("upload_token_map is missing in api GetUploadConfig");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        return other != null && (other instanceof GetUploadConfigMessage);
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
        return other != null && (other instanceof GetUploadConfigMessage) && Intrinsics.areEqual(getUploadTokenMap(), ((GetUploadConfigMessage) other).getUploadTokenMap());
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + getUploadTokenMap().hashCode();
    }

    /* compiled from: GetUploadConfigMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/storage/GetUploadConfigMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/storage/get_upload_config";
        }
    }
}
