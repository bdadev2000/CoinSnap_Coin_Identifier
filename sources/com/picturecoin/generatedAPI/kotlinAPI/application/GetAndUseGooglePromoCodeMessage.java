package com.picturecoin.generatedAPI.kotlinAPI.application;

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

/* compiled from: GetAndUseGooglePromoCodeMessage.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#H\u0016¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u0013\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u0007¨\u0006,"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/application/GetAndUseGooglePromoCodeMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "code", "getCode", "setCode", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class GetAndUseGooglePromoCodeMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String code;
    private String type;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final GetAndUseGooglePromoCodeMessage copy(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new GetAndUseGooglePromoCodeMessage(type);
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
        return "GetAndUseGooglePromoCodeMessage(type=" + this.type + ")";
    }

    public static /* synthetic */ GetAndUseGooglePromoCodeMessage copy$default(GetAndUseGooglePromoCodeMessage getAndUseGooglePromoCodeMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAndUseGooglePromoCodeMessage.type;
        }
        return getAndUseGooglePromoCodeMessage.copy(str);
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public GetAndUseGooglePromoCodeMessage(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    public final String getCode() {
        String str = this.code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("code");
        return null;
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("code") && !obj.isNull("code")) {
            setCode(obj.getString("code"));
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("code is missing in api GetAndUseGooglePromoCode");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", this.type);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        return other != null && (other instanceof GetAndUseGooglePromoCodeMessage) && Intrinsics.areEqual(this.type, ((GetAndUseGooglePromoCodeMessage) other).type);
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
        if (other == null || !(other instanceof GetAndUseGooglePromoCodeMessage)) {
            return false;
        }
        GetAndUseGooglePromoCodeMessage getAndUseGooglePromoCodeMessage = (GetAndUseGooglePromoCodeMessage) other;
        return Intrinsics.areEqual(this.type, getAndUseGooglePromoCodeMessage.type) && Intrinsics.areEqual(getCode(), getAndUseGooglePromoCodeMessage.getCode());
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + this.type.hashCode()) * 31) + getCode().hashCode();
    }

    /* compiled from: GetAndUseGooglePromoCodeMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/application/GetAndUseGooglePromoCodeMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/application/get_and_use_google_promo_code";
        }
    }
}
