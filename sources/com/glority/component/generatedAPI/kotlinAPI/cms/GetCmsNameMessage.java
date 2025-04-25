package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetCmsNameMessage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0005HÄ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÄ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÄ\u0003J'\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u001cH\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020'0&H\u0016J\u0014\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0&H\u0016J\b\u0010)\u001a\u00020*H\u0016J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050,H\u0016¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u001cH\u0016J\b\u0010/\u001a\u00020\u001cH\u0016J\u0012\u00100\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\t\u00101\u001a\u00020\u0005HÖ\u0001J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006:"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetCmsNameMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "cmsNameUid", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCmsName", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "setCmsName", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;)V", "getCmsNameUid", "()Ljava/lang/String;", "setCmsNameUid", "(Ljava/lang/String;)V", "getCountryCode", "setCountryCode", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class GetCmsNameMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CmsName cmsName;
    private String cmsNameUid;
    private String countryCode;
    private LanguageCode languageCode;

    public static /* synthetic */ GetCmsNameMessage copy$default(GetCmsNameMessage getCmsNameMessage, String str, LanguageCode languageCode, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCmsNameMessage.cmsNameUid;
        }
        if ((i & 2) != 0) {
            languageCode = getCmsNameMessage.languageCode;
        }
        if ((i & 4) != 0) {
            str2 = getCmsNameMessage.countryCode;
        }
        return getCmsNameMessage.copy(str, languageCode, str2);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getCmsNameUid() {
        return this.cmsNameUid;
    }

    /* renamed from: component2, reason: from getter */
    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getCountryCode() {
        return this.countryCode;
    }

    public final GetCmsNameMessage copy(String cmsNameUid, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(cmsNameUid, "cmsNameUid");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new GetCmsNameMessage(cmsNameUid, languageCode, countryCode);
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
        return "GetCmsNameMessage(cmsNameUid=" + this.cmsNameUid + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ')';
    }

    protected final String getCmsNameUid() {
        return this.cmsNameUid;
    }

    protected final void setCmsNameUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cmsNameUid = str;
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

    public GetCmsNameMessage(String cmsNameUid, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(cmsNameUid, "cmsNameUid");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.cmsNameUid = cmsNameUid;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
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
        if (obj.has("cms_name") && !obj.isNull("cms_name")) {
            Object obj2 = obj.get("cms_name");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            if (obj2 != null) {
                setCmsName(new CmsName((JSONObject) obj2));
                this._response_at = new Date();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        throw new ParameterCheckFailException("cms_name is missing in api GetCmsName");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("cms_name_uid", this.cmsNameUid);
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
        if (other == null || !(other instanceof GetCmsNameMessage)) {
            return false;
        }
        GetCmsNameMessage getCmsNameMessage = (GetCmsNameMessage) other;
        return Intrinsics.areEqual(this.cmsNameUid, getCmsNameMessage.cmsNameUid) && this.languageCode == getCmsNameMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCmsNameMessage.countryCode);
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
        if (other == null || !(other instanceof GetCmsNameMessage)) {
            return false;
        }
        GetCmsNameMessage getCmsNameMessage = (GetCmsNameMessage) other;
        return Intrinsics.areEqual(this.cmsNameUid, getCmsNameMessage.cmsNameUid) && this.languageCode == getCmsNameMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCmsNameMessage.countryCode) && Intrinsics.areEqual(getCmsName(), getCmsNameMessage.getCmsName());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + this.cmsNameUid.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + getCmsName().hashCode();
    }

    /* compiled from: GetCmsNameMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetCmsNameMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/cms/get_cms_name";
        }
    }
}
