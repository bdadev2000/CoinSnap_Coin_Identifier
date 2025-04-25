package com.glority.component.generatedAPI.kotlinAPI.vip;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RemindUserToAttentionTrialMessage.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\n\b\u0086\b\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020!0 H\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0 H\u0016J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010!H\u0016J\b\u0010'\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020%H\u0016J\b\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0-H\u0016¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u00100\u001a\u00020\u0007H\u0016J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J'\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u00105\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u00067"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/vip/RemindUserToAttentionTrialMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "daysToRemind", "", "email", "", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;ILjava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getDaysToRemind", "()I", "setDaysToRemind", "(I)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class RemindUserToAttentionTrialMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int daysToRemind;
    private String email;
    private LanguageCode languageCode;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDaysToRemind() {
        return this.daysToRemind;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final RemindUserToAttentionTrialMessage copy(LanguageCode languageCode, int daysToRemind, String email) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(email, "email");
        return new RemindUserToAttentionTrialMessage(languageCode, daysToRemind, email);
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
        return "RemindUserToAttentionTrialMessage(languageCode=" + this.languageCode + ", daysToRemind=" + this.daysToRemind + ", email=" + this.email + ")";
    }

    public static /* synthetic */ RemindUserToAttentionTrialMessage copy$default(RemindUserToAttentionTrialMessage remindUserToAttentionTrialMessage, LanguageCode languageCode, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            languageCode = remindUserToAttentionTrialMessage.languageCode;
        }
        if ((i2 & 2) != 0) {
            i = remindUserToAttentionTrialMessage.daysToRemind;
        }
        if ((i2 & 4) != 0) {
            str = remindUserToAttentionTrialMessage.email;
        }
        return remindUserToAttentionTrialMessage.copy(languageCode, i, str);
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    public final int getDaysToRemind() {
        return this.daysToRemind;
    }

    public final void setDaysToRemind(int i) {
        this.daysToRemind = i;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public RemindUserToAttentionTrialMessage(LanguageCode languageCode, int i, String email) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(email, "email");
        this.languageCode = languageCode;
        this.daysToRemind = i;
        this.email = email;
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
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("days_to_remind", Integer.valueOf(this.daysToRemind));
        hashMap.put("email", this.email);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof RemindUserToAttentionTrialMessage)) {
            return false;
        }
        RemindUserToAttentionTrialMessage remindUserToAttentionTrialMessage = (RemindUserToAttentionTrialMessage) other;
        return this.languageCode == remindUserToAttentionTrialMessage.languageCode && this.daysToRemind == remindUserToAttentionTrialMessage.daysToRemind && Intrinsics.areEqual(this.email, remindUserToAttentionTrialMessage.email);
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
        if (other == null || !(other instanceof RemindUserToAttentionTrialMessage)) {
            return false;
        }
        RemindUserToAttentionTrialMessage remindUserToAttentionTrialMessage = (RemindUserToAttentionTrialMessage) other;
        return this.languageCode == remindUserToAttentionTrialMessage.languageCode && this.daysToRemind == remindUserToAttentionTrialMessage.daysToRemind && Intrinsics.areEqual(this.email, remindUserToAttentionTrialMessage.email);
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + Integer.hashCode(this.daysToRemind)) * 31) + this.email.hashCode();
    }

    /* compiled from: RemindUserToAttentionTrialMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/vip/RemindUserToAttentionTrialMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/vip/remind_user_to_attention_trial";
        }
    }
}
