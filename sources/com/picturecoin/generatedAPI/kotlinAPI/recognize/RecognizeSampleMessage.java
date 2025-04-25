package com.picturecoin.generatedAPI.kotlinAPI.recognize;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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

/* compiled from: RecognizeSampleMessage.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0016J\u0014\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*0)H\u0016J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020,0)H\u0016J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010*H\u0016J\b\u00100\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u00020.H\u0016J\b\u00102\u001a\u00020.H\u0016J\b\u00103\u001a\u00020.H\u0016J\b\u00104\u001a\u00020.H\u0016J\u0013\u00105\u001a\b\u0012\u0004\u0012\u00020\u000706H\u0016¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u00109\u001a\u00020:H\u0016J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\u001d\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010>\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006@"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/RecognizeSampleMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "itemId", "", "getItemId", "()J", "setItemId", "(J)V", "sampleImageUrl", "getSampleImageUrl", "setSampleImageUrl", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCmsName", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "setCmsName", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class RecognizeSampleMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CmsName cmsName;
    private String countryCode;
    private long itemId;
    private LanguageCode languageCode;
    public String sampleImageUrl;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final RecognizeSampleMessage copy(LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new RecognizeSampleMessage(languageCode, countryCode);
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
        return "RecognizeSampleMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ")";
    }

    public static /* synthetic */ RecognizeSampleMessage copy$default(RecognizeSampleMessage recognizeSampleMessage, LanguageCode languageCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = recognizeSampleMessage.languageCode;
        }
        if ((i & 2) != 0) {
            str = recognizeSampleMessage.countryCode;
        }
        return recognizeSampleMessage.copy(languageCode, str);
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public RecognizeSampleMessage(LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final void setItemId(long j) {
        this.itemId = j;
    }

    public final String getSampleImageUrl() {
        String str = this.sampleImageUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sampleImageUrl");
        return null;
    }

    public final void setSampleImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sampleImageUrl = str;
    }

    public final CmsName getCmsName() {
        CmsName cmsName = this.cmsName;
        if (cmsName != null) {
            return cmsName;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.cmsName);
        return null;
    }

    public final void setCmsName(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<set-?>");
        this.cmsName = cmsName;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(FirebaseAnalytics.Param.ITEM_ID) && !obj.isNull(FirebaseAnalytics.Param.ITEM_ID)) {
            this.itemId = obj.getLong(FirebaseAnalytics.Param.ITEM_ID);
            if (obj.has("sample_image_url") && !obj.isNull("sample_image_url")) {
                setSampleImageUrl(obj.getString("sample_image_url"));
                if (obj.has("cms_name") && !obj.isNull("cms_name")) {
                    Object obj2 = obj.get("cms_name");
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    setCmsName(new CmsName((JSONObject) obj2));
                    this._response_at = new Date();
                    return;
                }
                throw new ParameterCheckFailException("cms_name is missing in api RecognizeSample");
            }
            throw new ParameterCheckFailException("sample_image_url is missing in api RecognizeSample");
        }
        throw new ParameterCheckFailException("item_id is missing in api RecognizeSample");
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
        hashMap.put("country_code", this.countryCode);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof RecognizeSampleMessage)) {
            return false;
        }
        RecognizeSampleMessage recognizeSampleMessage = (RecognizeSampleMessage) other;
        return this.languageCode == recognizeSampleMessage.languageCode && Intrinsics.areEqual(this.countryCode, recognizeSampleMessage.countryCode);
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
        if (other == null || !(other instanceof RecognizeSampleMessage)) {
            return false;
        }
        RecognizeSampleMessage recognizeSampleMessage = (RecognizeSampleMessage) other;
        return this.languageCode == recognizeSampleMessage.languageCode && Intrinsics.areEqual(this.countryCode, recognizeSampleMessage.countryCode) && this.itemId == recognizeSampleMessage.itemId && Intrinsics.areEqual(getSampleImageUrl(), recognizeSampleMessage.getSampleImageUrl()) && Intrinsics.areEqual(getCmsName(), recognizeSampleMessage.getCmsName());
    }

    public int hashCode() {
        return (((((((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + Long.hashCode(this.itemId)) * 31) + getSampleImageUrl().hashCode()) * 31) + getCmsName().hashCode();
    }

    /* compiled from: RecognizeSampleMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/RecognizeSampleMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/recognize/recognize_sample";
        }
    }
}
