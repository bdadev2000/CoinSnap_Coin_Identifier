package com.glority.component.generatedAPI.kotlinAPI.support;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.component.generatedAPI.kotlinAPI.enums.SupportType;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SendSupportTicketMessage.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JBQ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-H\u0016J\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002000/H\u0016J\u0014\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002020/H\u0016J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000100H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\b\u00107\u001a\u000204H\u0016J\b\u00108\u001a\u000204H\u0016J\b\u00109\u001a\u000204H\u0016J\b\u0010:\u001a\u000204H\u0016J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050<H\u0016¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u0010?\u001a\u00020@H\u0016J\t\u0010A\u001a\u00020\u0005HÄ\u0003J\t\u0010B\u001a\u00020\u0007HÄ\u0003J\t\u0010C\u001a\u00020\tHÄ\u0003J\t\u0010D\u001a\u00020\u0005HÄ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÄ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rHÄ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rHÄ\u0003Ja\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rHÆ\u0001J\t\u0010I\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$¨\u0006K"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/support/SendSupportTicketMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "email", "", "supportType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/SupportType;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "content", "images", "", "tags", "<init>", "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/SupportType;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getSupportType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/SupportType;", "setSupportType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/SupportType;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "setCountryCode", "getContent", "setContent", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "getTags", "setTags", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class SendSupportTicketMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String content;
    private String countryCode;
    private String email;
    private List<String> images;
    private LanguageCode languageCode;
    private SupportType supportType;
    private List<String> tags;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    protected final SupportType getSupportType() {
        return this.supportType;
    }

    /* renamed from: component3, reason: from getter */
    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component4, reason: from getter */
    protected final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component5, reason: from getter */
    protected final String getContent() {
        return this.content;
    }

    protected final List<String> component6() {
        return this.images;
    }

    protected final List<String> component7() {
        return this.tags;
    }

    public final SendSupportTicketMessage copy(String email, SupportType supportType, LanguageCode languageCode, String countryCode, String content, List<String> images, List<String> tags) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(supportType, "supportType");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new SendSupportTicketMessage(email, supportType, languageCode, countryCode, content, images, tags);
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
        return "SendSupportTicketMessage(email=" + this.email + ", supportType=" + this.supportType + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", content=" + this.content + ", images=" + this.images + ", tags=" + this.tags + ")";
    }

    public static /* synthetic */ SendSupportTicketMessage copy$default(SendSupportTicketMessage sendSupportTicketMessage, String str, SupportType supportType, LanguageCode languageCode, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendSupportTicketMessage.email;
        }
        if ((i & 2) != 0) {
            supportType = sendSupportTicketMessage.supportType;
        }
        SupportType supportType2 = supportType;
        if ((i & 4) != 0) {
            languageCode = sendSupportTicketMessage.languageCode;
        }
        LanguageCode languageCode2 = languageCode;
        if ((i & 8) != 0) {
            str2 = sendSupportTicketMessage.countryCode;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = sendSupportTicketMessage.content;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            list = sendSupportTicketMessage.images;
        }
        List list3 = list;
        if ((i & 64) != 0) {
            list2 = sendSupportTicketMessage.tags;
        }
        return sendSupportTicketMessage.copy(str, supportType2, languageCode2, str4, str5, list3, list2);
    }

    protected final String getEmail() {
        return this.email;
    }

    protected final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    protected final SupportType getSupportType() {
        return this.supportType;
    }

    protected final void setSupportType(SupportType supportType) {
        Intrinsics.checkNotNullParameter(supportType, "<set-?>");
        this.supportType = supportType;
    }

    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    protected final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    protected final String getCountryCode() {
        return this.countryCode;
    }

    protected final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    protected final String getContent() {
        return this.content;
    }

    protected final void setContent(String str) {
        this.content = str;
    }

    protected final List<String> getImages() {
        return this.images;
    }

    protected final void setImages(List<String> list) {
        this.images = list;
    }

    protected final List<String> getTags() {
        return this.tags;
    }

    protected final void setTags(List<String> list) {
        this.tags = list;
    }

    public SendSupportTicketMessage(String email, SupportType supportType, LanguageCode languageCode, String countryCode, String str, List<String> list, List<String> list2) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(supportType, "supportType");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.email = email;
        this.supportType = supportType;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.content = str;
        this.images = list;
        this.tags = list2;
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
        hashMap.put("support_type", Integer.valueOf(this.supportType.getValue()));
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("country_code", this.countryCode);
        String str = this.content;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("content", str);
        }
        List<String> list = this.images;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("images", list);
        }
        List<String> list2 = this.tags;
        if (list2 != null) {
            Intrinsics.checkNotNull(list2);
            hashMap.put("tags", list2);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof SendSupportTicketMessage)) {
            return false;
        }
        SendSupportTicketMessage sendSupportTicketMessage = (SendSupportTicketMessage) other;
        return Intrinsics.areEqual(this.email, sendSupportTicketMessage.email) && this.supportType == sendSupportTicketMessage.supportType && this.languageCode == sendSupportTicketMessage.languageCode && Intrinsics.areEqual(this.countryCode, sendSupportTicketMessage.countryCode) && Intrinsics.areEqual(this.content, sendSupportTicketMessage.content) && Intrinsics.areEqual(this.images, sendSupportTicketMessage.images) && Intrinsics.areEqual(this.tags, sendSupportTicketMessage.tags);
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
        if (other == null || !(other instanceof SendSupportTicketMessage)) {
            return false;
        }
        SendSupportTicketMessage sendSupportTicketMessage = (SendSupportTicketMessage) other;
        return Intrinsics.areEqual(this.email, sendSupportTicketMessage.email) && this.supportType == sendSupportTicketMessage.supportType && this.languageCode == sendSupportTicketMessage.languageCode && Intrinsics.areEqual(this.countryCode, sendSupportTicketMessage.countryCode) && Intrinsics.areEqual(this.content, sendSupportTicketMessage.content) && Intrinsics.areEqual(this.images, sendSupportTicketMessage.images) && Intrinsics.areEqual(this.tags, sendSupportTicketMessage.tags);
    }

    public int hashCode() {
        int hashCode = ((((((((getClass().hashCode() * 31) + this.email.hashCode()) * 31) + this.supportType.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        String str = this.content;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.images;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.tags;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    /* compiled from: SendSupportTicketMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/support/SendSupportTicketMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/support/send_support_ticket";
        }
    }
}
