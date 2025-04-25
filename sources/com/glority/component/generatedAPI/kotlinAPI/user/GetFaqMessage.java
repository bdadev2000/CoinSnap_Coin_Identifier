package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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

/* compiled from: GetFaqMessage.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!H\u0016J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020%0!H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020\"H\u0016J\b\u0010*\u001a\u00020'H\u0016J\b\u0010+\u001a\u00020'H\u0016J\b\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00020\"0/H\u0016¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u00102\u001a\u000203H\u0016J\t\u00104\u001a\u00020\u0005HÄ\u0003J\t\u00105\u001a\u00020\u0007HÄ\u0003J\u001d\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u00107\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00069"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/GetFaqMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "deviceType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getDeviceType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "setDeviceType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;)V", "faqs", "", "Lcom/glority/component/generatedAPI/kotlinAPI/user/Faq;", "getFaqs", "()Ljava/util/List;", "setFaqs", "(Ljava/util/List;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class GetFaqMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private DeviceType deviceType;
    public List<Faq> faqs;
    private LanguageCode languageCode;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component2, reason: from getter */
    protected final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final GetFaqMessage copy(LanguageCode languageCode, DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        return new GetFaqMessage(languageCode, deviceType);
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
        return "GetFaqMessage(languageCode=" + this.languageCode + ", deviceType=" + this.deviceType + ")";
    }

    public static /* synthetic */ GetFaqMessage copy$default(GetFaqMessage getFaqMessage, LanguageCode languageCode, DeviceType deviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = getFaqMessage.languageCode;
        }
        if ((i & 2) != 0) {
            deviceType = getFaqMessage.deviceType;
        }
        return getFaqMessage.copy(languageCode, deviceType);
    }

    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    protected final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    protected final DeviceType getDeviceType() {
        return this.deviceType;
    }

    protected final void setDeviceType(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "<set-?>");
        this.deviceType = deviceType;
    }

    public GetFaqMessage(LanguageCode languageCode, DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.languageCode = languageCode;
        this.deviceType = deviceType;
    }

    public final List<Faq> getFaqs() {
        List<Faq> list = this.faqs;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("faqs");
        return null;
    }

    public final void setFaqs(List<Faq> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.faqs = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("faqs") && !obj.isNull("faqs")) {
            JSONArray jSONArray = obj.getJSONArray("faqs");
            setFaqs(new ArrayList());
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    Object obj2 = jSONArray.get(i);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    Faq faq = new Faq((JSONObject) obj2);
                    List<Faq> faqs = getFaqs();
                    Intrinsics.checkNotNull(faqs);
                    faqs.add(faq);
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
        throw new ParameterCheckFailException("faqs is missing in api GetFaq");
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
        hashMap.put("device_type", Integer.valueOf(this.deviceType.getValue()));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetFaqMessage)) {
            return false;
        }
        GetFaqMessage getFaqMessage = (GetFaqMessage) other;
        return this.languageCode == getFaqMessage.languageCode && this.deviceType == getFaqMessage.deviceType;
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
        if (other == null || !(other instanceof GetFaqMessage)) {
            return false;
        }
        GetFaqMessage getFaqMessage = (GetFaqMessage) other;
        return this.languageCode == getFaqMessage.languageCode && this.deviceType == getFaqMessage.deviceType && Intrinsics.areEqual(getFaqs(), getFaqMessage.getFaqs());
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + getFaqs().hashCode();
    }

    /* compiled from: GetFaqMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/GetFaqMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/user/get_faq";
        }
    }
}
