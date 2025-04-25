package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
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

/* compiled from: GetStaticUrlMessage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020\u001fH\u0016J\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020+0*H\u0016J\u0014\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020'0*H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000500H\u0016¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\u001fH\u0016J\b\u00103\u001a\u00020\u001fH\u0016J\u0012\u00104\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\t\u00105\u001a\u00020\u0005HÖ\u0001J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u0006>"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetStaticUrlMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "contentType", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, Args.uid, "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/String;)V", "cmsStaticUrl", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "getCmsStaticUrl", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;", "setCmsStaticUrl", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsStaticUrl;)V", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getCountryCode", "setCountryCode", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getUid", "setUid", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class GetStaticUrlMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CmsStaticUrl cmsStaticUrl;
    private String contentType;
    private String countryCode;
    private LanguageCode languageCode;
    private String uid;

    public static /* synthetic */ GetStaticUrlMessage copy$default(GetStaticUrlMessage getStaticUrlMessage, String str, LanguageCode languageCode, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getStaticUrlMessage.contentType;
        }
        if ((i & 2) != 0) {
            languageCode = getStaticUrlMessage.languageCode;
        }
        if ((i & 4) != 0) {
            str2 = getStaticUrlMessage.countryCode;
        }
        if ((i & 8) != 0) {
            str3 = getStaticUrlMessage.uid;
        }
        return getStaticUrlMessage.copy(str, languageCode, str2, str3);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    public final GetStaticUrlMessage copy(String contentType, LanguageCode languageCode, String countryCode, String uid) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new GetStaticUrlMessage(contentType, languageCode, countryCode, uid);
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
        return "GetStaticUrlMessage(contentType=" + this.contentType + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", uid=" + ((Object) this.uid) + ')';
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final void setContentType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contentType = str;
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

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public GetStaticUrlMessage(String contentType, LanguageCode languageCode, String countryCode, String str) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.contentType = contentType;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.uid = str;
    }

    public final CmsStaticUrl getCmsStaticUrl() {
        CmsStaticUrl cmsStaticUrl = this.cmsStaticUrl;
        if (cmsStaticUrl != null) {
            return cmsStaticUrl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cmsStaticUrl");
        return null;
    }

    public final void setCmsStaticUrl(CmsStaticUrl cmsStaticUrl) {
        Intrinsics.checkNotNullParameter(cmsStaticUrl, "<set-?>");
        this.cmsStaticUrl = cmsStaticUrl;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("cms_static_url") && !obj.isNull("cms_static_url")) {
            Object obj2 = obj.get("cms_static_url");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            if (obj2 != null) {
                setCmsStaticUrl(new CmsStaticUrl((JSONObject) obj2));
                this._response_at = new Date();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        throw new ParameterCheckFailException("cms_static_url is missing in api GetStaticUrl");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.Param.CONTENT_TYPE, this.contentType);
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("country_code", this.countryCode);
        String str = this.uid;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put(Args.uid, str);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetStaticUrlMessage)) {
            return false;
        }
        GetStaticUrlMessage getStaticUrlMessage = (GetStaticUrlMessage) other;
        return Intrinsics.areEqual(this.contentType, getStaticUrlMessage.contentType) && this.languageCode == getStaticUrlMessage.languageCode && Intrinsics.areEqual(this.countryCode, getStaticUrlMessage.countryCode) && Intrinsics.areEqual(this.uid, getStaticUrlMessage.uid);
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
        if (other == null || !(other instanceof GetStaticUrlMessage)) {
            return false;
        }
        GetStaticUrlMessage getStaticUrlMessage = (GetStaticUrlMessage) other;
        return Intrinsics.areEqual(this.contentType, getStaticUrlMessage.contentType) && this.languageCode == getStaticUrlMessage.languageCode && Intrinsics.areEqual(this.countryCode, getStaticUrlMessage.countryCode) && Intrinsics.areEqual(this.uid, getStaticUrlMessage.uid) && Intrinsics.areEqual(getCmsStaticUrl(), getStaticUrlMessage.getCmsStaticUrl());
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + this.contentType.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        String str = this.uid;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + getCmsStaticUrl().hashCode();
    }

    /* compiled from: GetStaticUrlMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetStaticUrlMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/cms/get_static_url";
        }
    }
}
