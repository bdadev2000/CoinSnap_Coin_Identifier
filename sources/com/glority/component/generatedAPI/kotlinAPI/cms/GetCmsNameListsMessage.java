package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* compiled from: GetCmsNameListsMessage.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0005HÄ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÄ\u0003J\t\u0010 \u001a\u00020\u0005HÄ\u0003J'\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u001dH\u0016J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020(0'H\u0016J\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$0'H\u0016J\b\u0010*\u001a\u00020+H\u0016J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-H\u0016¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u001dH\u0016J\b\u00100\u001a\u00020\u001dH\u0016J\u0012\u00101\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\t\u00102\u001a\u00020\u0005HÖ\u0001J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u000209H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006;"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetCmsNameListsMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "contentType", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "cmsNameLists", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsNameList;", "getCmsNameLists", "()Ljava/util/List;", "setCmsNameLists", "(Ljava/util/List;)V", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getCountryCode", "setCountryCode", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class GetCmsNameListsMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<CmsNameList> cmsNameLists;
    private String contentType;
    private String countryCode;
    private LanguageCode languageCode;

    public static /* synthetic */ GetCmsNameListsMessage copy$default(GetCmsNameListsMessage getCmsNameListsMessage, String str, LanguageCode languageCode, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCmsNameListsMessage.contentType;
        }
        if ((i & 2) != 0) {
            languageCode = getCmsNameListsMessage.languageCode;
        }
        if ((i & 4) != 0) {
            str2 = getCmsNameListsMessage.countryCode;
        }
        return getCmsNameListsMessage.copy(str, languageCode, str2);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getCountryCode() {
        return this.countryCode;
    }

    public final GetCmsNameListsMessage copy(String contentType, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new GetCmsNameListsMessage(contentType, languageCode, countryCode);
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
        return "GetCmsNameListsMessage(contentType=" + this.contentType + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ')';
    }

    protected final String getContentType() {
        return this.contentType;
    }

    protected final void setContentType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contentType = str;
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

    public GetCmsNameListsMessage(String contentType, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.contentType = contentType;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
    }

    public final List<CmsNameList> getCmsNameLists() {
        List<CmsNameList> list = this.cmsNameLists;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cmsNameLists");
        return null;
    }

    public final void setCmsNameLists(List<CmsNameList> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cmsNameLists = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("cms_name_lists") && !obj.isNull("cms_name_lists")) {
            JSONArray jSONArray = obj.getJSONArray("cms_name_lists");
            setCmsNameLists(new ArrayList());
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object obj2 = jSONArray.get(i);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    if (obj2 != null) {
                        CmsNameList cmsNameList = new CmsNameList((JSONObject) obj2);
                        List<CmsNameList> cmsNameLists = getCmsNameLists();
                        Intrinsics.checkNotNull(cmsNameLists);
                        cmsNameLists.add(cmsNameList);
                        if (i == length) {
                            break;
                        } else {
                            i = i2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
            }
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("cms_name_lists is missing in api GetCmsNameLists");
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
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetCmsNameListsMessage)) {
            return false;
        }
        GetCmsNameListsMessage getCmsNameListsMessage = (GetCmsNameListsMessage) other;
        return Intrinsics.areEqual(this.contentType, getCmsNameListsMessage.contentType) && this.languageCode == getCmsNameListsMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCmsNameListsMessage.countryCode);
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
        if (other == null || !(other instanceof GetCmsNameListsMessage)) {
            return false;
        }
        GetCmsNameListsMessage getCmsNameListsMessage = (GetCmsNameListsMessage) other;
        return Intrinsics.areEqual(this.contentType, getCmsNameListsMessage.contentType) && this.languageCode == getCmsNameListsMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCmsNameListsMessage.countryCode) && Intrinsics.areEqual(getCmsNameLists(), getCmsNameListsMessage.getCmsNameLists());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + this.contentType.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + getCmsNameLists().hashCode();
    }

    /* compiled from: GetCmsNameListsMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetCmsNameListsMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/cms/get_cms_name_lists";
        }
    }
}
