package com.glority.component.generatedAPI.kotlinAPI.user;

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

/* compiled from: CheckVerifyCodeMessage.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a0\u0017H\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050$H\u0016¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020\u0005HÄ\u0003J\t\u0010*\u001a\u00020\u0005HÄ\u0003J\u001d\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006."}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/CheckVerifyCodeMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "email", "", "verifyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getVerifyCode", "setVerifyCode", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class CheckVerifyCodeMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String email;
    private String verifyCode;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    protected final String getVerifyCode() {
        return this.verifyCode;
    }

    public final CheckVerifyCodeMessage copy(String email, String verifyCode) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        return new CheckVerifyCodeMessage(email, verifyCode);
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
        return "CheckVerifyCodeMessage(email=" + this.email + ", verifyCode=" + this.verifyCode + ")";
    }

    public static /* synthetic */ CheckVerifyCodeMessage copy$default(CheckVerifyCodeMessage checkVerifyCodeMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkVerifyCodeMessage.email;
        }
        if ((i & 2) != 0) {
            str2 = checkVerifyCodeMessage.verifyCode;
        }
        return checkVerifyCodeMessage.copy(str, str2);
    }

    protected final String getEmail() {
        return this.email;
    }

    protected final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    protected final String getVerifyCode() {
        return this.verifyCode;
    }

    protected final void setVerifyCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verifyCode = str;
    }

    public CheckVerifyCodeMessage(String email, String verifyCode) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        this.email = email;
        this.verifyCode = verifyCode;
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
        hashMap.put("email", this.email);
        hashMap.put("verify_code", this.verifyCode);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof CheckVerifyCodeMessage)) {
            return false;
        }
        CheckVerifyCodeMessage checkVerifyCodeMessage = (CheckVerifyCodeMessage) other;
        return Intrinsics.areEqual(this.email, checkVerifyCodeMessage.email) && Intrinsics.areEqual(this.verifyCode, checkVerifyCodeMessage.verifyCode);
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
        if (other == null || !(other instanceof CheckVerifyCodeMessage)) {
            return false;
        }
        CheckVerifyCodeMessage checkVerifyCodeMessage = (CheckVerifyCodeMessage) other;
        return Intrinsics.areEqual(this.email, checkVerifyCodeMessage.email) && Intrinsics.areEqual(this.verifyCode, checkVerifyCodeMessage.verifyCode);
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + this.email.hashCode()) * 31) + this.verifyCode.hashCode();
    }

    /* compiled from: CheckVerifyCodeMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/CheckVerifyCodeMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/user/check_verify_code";
        }
    }
}
