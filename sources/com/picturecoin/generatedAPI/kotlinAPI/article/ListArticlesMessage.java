package com.picturecoin.generatedAPI.kotlinAPI.article;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
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

/* compiled from: ListArticlesMessage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"0\u001fH\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010 H\u0016J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0016J\b\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,H\u0016¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010/\u001a\u000200H\u0016J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J%\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\t\u00104\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u00066"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/ListArticlesMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "types", "", "", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/util/List;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "articleList", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/Article;", "getArticleList", "setArticleList", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class ListArticlesMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<Article> articleList;
    private LanguageCode languageCode;
    private List<String> types;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final List<String> component2() {
        return this.types;
    }

    public final ListArticlesMessage copy(LanguageCode languageCode, List<String> types) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        return new ListArticlesMessage(languageCode, types);
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
        return "ListArticlesMessage(languageCode=" + this.languageCode + ", types=" + this.types + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListArticlesMessage copy$default(ListArticlesMessage listArticlesMessage, LanguageCode languageCode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = listArticlesMessage.languageCode;
        }
        if ((i & 2) != 0) {
            list = listArticlesMessage.types;
        }
        return listArticlesMessage.copy(languageCode, list);
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public ListArticlesMessage(LanguageCode languageCode, List<String> list) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        this.languageCode = languageCode;
        this.types = list;
    }

    public final List<Article> getArticleList() {
        List<Article> list = this.articleList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("articleList");
        return null;
    }

    public final void setArticleList(List<Article> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.articleList = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("article_list") && !obj.isNull("article_list")) {
            JSONArray jSONArray = obj.getJSONArray("article_list");
            setArticleList(new ArrayList());
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    Object obj2 = jSONArray.get(i);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    getArticleList().add(new Article((JSONObject) obj2));
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
        throw new ParameterCheckFailException("article_list is missing in api ListArticles");
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
        List<String> list = this.types;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("types", list);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof ListArticlesMessage)) {
            return false;
        }
        ListArticlesMessage listArticlesMessage = (ListArticlesMessage) other;
        return this.languageCode == listArticlesMessage.languageCode && Intrinsics.areEqual(this.types, listArticlesMessage.types);
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
        if (other == null || !(other instanceof ListArticlesMessage)) {
            return false;
        }
        ListArticlesMessage listArticlesMessage = (ListArticlesMessage) other;
        return this.languageCode == listArticlesMessage.languageCode && Intrinsics.areEqual(this.types, listArticlesMessage.types) && Intrinsics.areEqual(getArticleList(), listArticlesMessage.getArticleList());
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31;
        List<String> list = this.types;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + getArticleList().hashCode();
    }

    /* compiled from: ListArticlesMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/ListArticlesMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/article/article/list_articles";
        }
    }
}
