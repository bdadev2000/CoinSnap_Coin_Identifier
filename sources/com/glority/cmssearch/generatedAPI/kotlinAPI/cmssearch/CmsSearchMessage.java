package com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import com.glority.cmssearch.generatedAPI.kotlinAPI.enums.EntranceType;
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

/* compiled from: CmsSearchMessage.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\t\u0010$\u001a\u00020\u0005HÄ\u0003J\t\u0010%\u001a\u00020\u0007HÄ\u0003J\t\u0010&\u001a\u00020\u0005HÄ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÄ\u0003J3\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020#H\u0016J\u0014\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020/0.H\u0016J\u0014\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020+0.H\u0016J\b\u00101\u001a\u000202H\u0016J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020\u000504H\u0016¢\u0006\u0002\u00105J\b\u00106\u001a\u00020#H\u0016J\b\u00107\u001a\u00020#H\u0016J\u0012\u00108\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\t\u00109\u001a\u00020\u0005HÖ\u0001J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020@H\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000f¨\u0006B"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/CmsSearchMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "searchText", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "entranceType", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/enums/EntranceType;", "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Lcom/glority/cmssearch/generatedAPI/kotlinAPI/enums/EntranceType;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getEntranceType", "()Lcom/glority/cmssearch/generatedAPI/kotlinAPI/enums/EntranceType;", "setEntranceType", "(Lcom/glority/cmssearch/generatedAPI/kotlinAPI/enums/EntranceType;)V", "indexModels", "", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;", "getIndexModels", "()Ljava/util/List;", "setIndexModels", "(Ljava/util/List;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getSearchText", "setSearchText", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsSearchMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    private EntranceType entranceType;
    public List<IndexModel> indexModels;
    private LanguageCode languageCode;
    private String searchText;

    public static /* synthetic */ CmsSearchMessage copy$default(CmsSearchMessage cmsSearchMessage, String str, LanguageCode languageCode, String str2, EntranceType entranceType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cmsSearchMessage.searchText;
        }
        if ((i & 2) != 0) {
            languageCode = cmsSearchMessage.languageCode;
        }
        if ((i & 4) != 0) {
            str2 = cmsSearchMessage.countryCode;
        }
        if ((i & 8) != 0) {
            entranceType = cmsSearchMessage.entranceType;
        }
        return cmsSearchMessage.copy(str, languageCode, str2, entranceType);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getSearchText() {
        return this.searchText;
    }

    /* renamed from: component2, reason: from getter */
    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    protected final EntranceType getEntranceType() {
        return this.entranceType;
    }

    public final CmsSearchMessage copy(String searchText, LanguageCode languageCode, String countryCode, EntranceType entranceType) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new CmsSearchMessage(searchText, languageCode, countryCode, entranceType);
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
        return "CmsSearchMessage(searchText=" + this.searchText + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", entranceType=" + this.entranceType + ')';
    }

    protected final String getSearchText() {
        return this.searchText;
    }

    protected final void setSearchText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.searchText = str;
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

    protected final EntranceType getEntranceType() {
        return this.entranceType;
    }

    protected final void setEntranceType(EntranceType entranceType) {
        this.entranceType = entranceType;
    }

    public CmsSearchMessage(String searchText, LanguageCode languageCode, String countryCode, EntranceType entranceType) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.searchText = searchText;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.entranceType = entranceType;
    }

    public final List<IndexModel> getIndexModels() {
        List<IndexModel> list = this.indexModels;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("indexModels");
        return null;
    }

    public final void setIndexModels(List<IndexModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.indexModels = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("indexModels") && !obj.isNull("indexModels")) {
            JSONArray jSONArray = obj.getJSONArray("indexModels");
            setIndexModels(new ArrayList());
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
                        IndexModel indexModel = new IndexModel((JSONObject) obj2);
                        List<IndexModel> indexModels = getIndexModels();
                        Intrinsics.checkNotNull(indexModels);
                        indexModels.add(indexModel);
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
        throw new ParameterCheckFailException("indexModels is missing in api CmsSearch");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("searchText", this.searchText);
        hashMap.put(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, Integer.valueOf(this.languageCode.getValue()));
        hashMap.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, this.countryCode);
        EntranceType entranceType = this.entranceType;
        if (entranceType != null) {
            Intrinsics.checkNotNull(entranceType);
            hashMap.put("entranceType", Integer.valueOf(entranceType.getValue()));
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof CmsSearchMessage)) {
            return false;
        }
        CmsSearchMessage cmsSearchMessage = (CmsSearchMessage) other;
        return Intrinsics.areEqual(this.searchText, cmsSearchMessage.searchText) && this.languageCode == cmsSearchMessage.languageCode && Intrinsics.areEqual(this.countryCode, cmsSearchMessage.countryCode) && this.entranceType == cmsSearchMessage.entranceType;
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
        if (other == null || !(other instanceof CmsSearchMessage)) {
            return false;
        }
        CmsSearchMessage cmsSearchMessage = (CmsSearchMessage) other;
        return Intrinsics.areEqual(this.searchText, cmsSearchMessage.searchText) && this.languageCode == cmsSearchMessage.languageCode && Intrinsics.areEqual(this.countryCode, cmsSearchMessage.countryCode) && this.entranceType == cmsSearchMessage.entranceType && Intrinsics.areEqual(getIndexModels(), cmsSearchMessage.getIndexModels());
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + this.searchText.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        EntranceType entranceType = this.entranceType;
        return ((hashCode + (entranceType != null ? entranceType.hashCode() : 0)) * 31) + getIndexModels().hashCode();
    }

    /* compiled from: CmsSearchMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/CmsSearchMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v1/cmssearch/cms_search";
        }
    }
}
