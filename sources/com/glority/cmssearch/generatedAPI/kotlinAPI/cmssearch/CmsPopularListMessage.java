package com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
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

/* compiled from: CmsPopularListMessage.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0005HÄ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÄ\u0003J\t\u0010 \u001a\u00020\u0005HÄ\u0003J'\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010$\u001a\u00020\u001dH\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020&0\u0013H\u0016J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050+H\u0016¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u001dH\u0016J\b\u0010.\u001a\u00020\u001dH\u0016J\u0012\u0010/\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0016J\t\u00100\u001a\u00020\u0005HÖ\u0001J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002022\u0006\u00106\u001a\u000207H\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\r¨\u00069"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/CmsPopularListMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "popularEntrance", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "map", "", "", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "getPopularEntrance", "setPopularEntrance", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "component3", "copy", "equals", "other", "forceHttps", "getFiles", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsPopularListMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    private LanguageCode languageCode;
    public Map<String, ? extends Object> map;
    private String popularEntrance;

    public static /* synthetic */ CmsPopularListMessage copy$default(CmsPopularListMessage cmsPopularListMessage, String str, LanguageCode languageCode, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cmsPopularListMessage.popularEntrance;
        }
        if ((i & 2) != 0) {
            languageCode = cmsPopularListMessage.languageCode;
        }
        if ((i & 4) != 0) {
            str2 = cmsPopularListMessage.countryCode;
        }
        return cmsPopularListMessage.copy(str, languageCode, str2);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getPopularEntrance() {
        return this.popularEntrance;
    }

    /* renamed from: component2, reason: from getter */
    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getCountryCode() {
        return this.countryCode;
    }

    public final CmsPopularListMessage copy(String popularEntrance, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(popularEntrance, "popularEntrance");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new CmsPopularListMessage(popularEntrance, languageCode, countryCode);
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
        return "CmsPopularListMessage(popularEntrance=" + this.popularEntrance + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ')';
    }

    protected final String getPopularEntrance() {
        return this.popularEntrance;
    }

    protected final void setPopularEntrance(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.popularEntrance = str;
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

    public CmsPopularListMessage(String popularEntrance, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(popularEntrance, "popularEntrance");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.popularEntrance = popularEntrance;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
    }

    public final Map<String, Object> getMap() {
        Map<String, ? extends Object> map = this.map;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("map");
        return null;
    }

    public final void setMap(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.map = map;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("map") && !obj.isNull("map")) {
            Object obj2 = obj.get("map");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            if (obj2 != null) {
                Map<String, Object> jsonObjectToMap = jsonObjectToMap((JSONObject) obj2);
                Intrinsics.checkNotNullExpressionValue(jsonObjectToMap, "jsonObjectToMap(map_temp as JSONObject)");
                setMap(jsonObjectToMap);
                this._response_at = new Date();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        throw new ParameterCheckFailException("map is missing in api CmsPopularList");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("popularEntrance", this.popularEntrance);
        hashMap.put(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, Integer.valueOf(this.languageCode.getValue()));
        hashMap.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, this.countryCode);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof CmsPopularListMessage)) {
            return false;
        }
        CmsPopularListMessage cmsPopularListMessage = (CmsPopularListMessage) other;
        return Intrinsics.areEqual(this.popularEntrance, cmsPopularListMessage.popularEntrance) && this.languageCode == cmsPopularListMessage.languageCode && Intrinsics.areEqual(this.countryCode, cmsPopularListMessage.countryCode);
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
        if (other == null || !(other instanceof CmsPopularListMessage)) {
            return false;
        }
        CmsPopularListMessage cmsPopularListMessage = (CmsPopularListMessage) other;
        return Intrinsics.areEqual(this.popularEntrance, cmsPopularListMessage.popularEntrance) && this.languageCode == cmsPopularListMessage.languageCode && Intrinsics.areEqual(this.countryCode, cmsPopularListMessage.countryCode) && Intrinsics.areEqual(getMap(), cmsPopularListMessage.getMap());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + this.popularEntrance.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + getMap().hashCode();
    }

    /* compiled from: CmsPopularListMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/CmsPopularListMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v1/cmssearch/cms_popular_list";
        }
    }
}
