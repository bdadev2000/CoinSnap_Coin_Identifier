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

/* compiled from: GetCmsArticlesMessage.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÄ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÄ\u0003J\u001f\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u001aH\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$0#H\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0#H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050)H\u0016¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\u0012\u0010-\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u0002002\u0006\u00104\u001a\u000205H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u00067"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetCmsArticlesMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "contentType", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "articles", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsArticle;", "getArticles", "()Ljava/util/List;", "setArticles", "(Ljava/util/List;)V", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "copy", "equals", "other", "", "forceHttps", "getFiles", "", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class GetCmsArticlesMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<CmsArticle> articles;
    private String contentType;
    private LanguageCode languageCode;

    public static /* synthetic */ GetCmsArticlesMessage copy$default(GetCmsArticlesMessage getCmsArticlesMessage, String str, LanguageCode languageCode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCmsArticlesMessage.contentType;
        }
        if ((i & 2) != 0) {
            languageCode = getCmsArticlesMessage.languageCode;
        }
        return getCmsArticlesMessage.copy(str, languageCode);
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

    public final GetCmsArticlesMessage copy(String contentType, LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        return new GetCmsArticlesMessage(contentType, languageCode);
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
        return "GetCmsArticlesMessage(contentType=" + ((Object) this.contentType) + ", languageCode=" + this.languageCode + ')';
    }

    protected final String getContentType() {
        return this.contentType;
    }

    protected final void setContentType(String str) {
        this.contentType = str;
    }

    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    protected final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    public GetCmsArticlesMessage(String str, LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        this.contentType = str;
        this.languageCode = languageCode;
    }

    public final List<CmsArticle> getArticles() {
        List<CmsArticle> list = this.articles;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("articles");
        return null;
    }

    public final void setArticles(List<CmsArticle> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.articles = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("articles") && !obj.isNull("articles")) {
            JSONArray jSONArray = obj.getJSONArray("articles");
            setArticles(new ArrayList());
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
                        CmsArticle cmsArticle = new CmsArticle((JSONObject) obj2);
                        List<CmsArticle> articles = getArticles();
                        Intrinsics.checkNotNull(articles);
                        articles.add(cmsArticle);
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
        throw new ParameterCheckFailException("articles is missing in api GetCmsArticles");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        String str = this.contentType;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put(FirebaseAnalytics.Param.CONTENT_TYPE, str);
        }
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetCmsArticlesMessage)) {
            return false;
        }
        GetCmsArticlesMessage getCmsArticlesMessage = (GetCmsArticlesMessage) other;
        return Intrinsics.areEqual(this.contentType, getCmsArticlesMessage.contentType) && this.languageCode == getCmsArticlesMessage.languageCode;
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
        if (other == null || !(other instanceof GetCmsArticlesMessage)) {
            return false;
        }
        GetCmsArticlesMessage getCmsArticlesMessage = (GetCmsArticlesMessage) other;
        return Intrinsics.areEqual(this.contentType, getCmsArticlesMessage.contentType) && this.languageCode == getCmsArticlesMessage.languageCode && Intrinsics.areEqual(getArticles(), getCmsArticlesMessage.getArticles());
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.contentType;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.languageCode.hashCode()) * 31) + getArticles().hashCode();
    }

    /* compiled from: GetCmsArticlesMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetCmsArticlesMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/cms/articles";
        }
    }
}
