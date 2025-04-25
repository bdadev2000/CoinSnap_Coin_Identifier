package com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetAllRealtimeMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0005HÂ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0012\u0010!\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\t\u0010\"\u001a\u00020\tHÖ\u0001J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetAllRealtimeMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "unused", "", "(I)V", "realtimes", "", "", "getRealtimes", "()Ljava/util/List;", "setRealtimes", "(Ljava/util/List;)V", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final /* data */ class GetAllRealtimeMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<String> realtimes;
    private int unused;

    public GetAllRealtimeMessage() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ GetAllRealtimeMessage copy$default(GetAllRealtimeMessage getAllRealtimeMessage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getAllRealtimeMessage.unused;
        }
        return getAllRealtimeMessage.copy(i);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    public final GetAllRealtimeMessage copy(int unused) {
        return new GetAllRealtimeMessage(unused);
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
        return "GetAllRealtimeMessage(unused=" + this.unused + ")";
    }

    public /* synthetic */ GetAllRealtimeMessage(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public GetAllRealtimeMessage(int i) {
        this.unused = i;
    }

    public final List<String> getRealtimes() {
        List<String> list = this.realtimes;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realtimes");
        }
        return list;
    }

    public final void setRealtimes(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.realtimes = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("realtimes") && !obj.isNull("realtimes")) {
            JSONArray jSONArray = obj.getJSONArray("realtimes");
            this.realtimes = new ArrayList();
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "__realtimes.getString(i0)");
                    List<String> list = this.realtimes;
                    if (list == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("realtimes");
                    }
                    Intrinsics.checkNotNull(list);
                    list.add(string);
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("realtimes is missing in api GetAllRealtime");
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
        return other != null && (other instanceof GetAllRealtimeMessage);
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
        if (other == null || !(other instanceof GetAllRealtimeMessage)) {
            return false;
        }
        List<String> list = this.realtimes;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realtimes");
        }
        List<String> list2 = ((GetAllRealtimeMessage) other).realtimes;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realtimes");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        List<String> list = this.realtimes;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realtimes");
        }
        return hashCode + list.hashCode();
    }

    /* compiled from: GetAllRealtimeMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetAllRealtimeMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v1/trackingconfig/get_all_realtime";
        }
    }
}
