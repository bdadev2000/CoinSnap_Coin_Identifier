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

/* compiled from: ListExpertPicksMessage.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(0'H\u0016J\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*0'H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010(H\u0016J\b\u0010.\u001a\u00020\u0007H\u0016J\b\u0010/\u001a\u00020,H\u0016J\b\u00100\u001a\u00020,H\u0016J\b\u00101\u001a\u00020,H\u0016J\b\u00102\u001a\u00020,H\u0016J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020\u000704H\u0016¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u00107\u001a\u000208H\u0016J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003J)\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010=\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006?"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/ListExpertPicksMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "lastPublishedAt", "Ljava/util/Date;", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/util/Date;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getLastPublishedAt", "()Ljava/util/Date;", "setLastPublishedAt", "(Ljava/util/Date;)V", "list", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class ListExpertPicksMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    private LanguageCode languageCode;
    private Date lastPublishedAt;
    public List<ExpertPick> list;

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

    /* renamed from: component3, reason: from getter */
    public final Date getLastPublishedAt() {
        return this.lastPublishedAt;
    }

    public final ListExpertPicksMessage copy(LanguageCode languageCode, String countryCode, Date lastPublishedAt) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new ListExpertPicksMessage(languageCode, countryCode, lastPublishedAt);
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
        return "ListExpertPicksMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", lastPublishedAt=" + this.lastPublishedAt + ")";
    }

    public static /* synthetic */ ListExpertPicksMessage copy$default(ListExpertPicksMessage listExpertPicksMessage, LanguageCode languageCode, String str, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = listExpertPicksMessage.languageCode;
        }
        if ((i & 2) != 0) {
            str = listExpertPicksMessage.countryCode;
        }
        if ((i & 4) != 0) {
            date = listExpertPicksMessage.lastPublishedAt;
        }
        return listExpertPicksMessage.copy(languageCode, str, date);
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

    public final Date getLastPublishedAt() {
        return this.lastPublishedAt;
    }

    public final void setLastPublishedAt(Date date) {
        this.lastPublishedAt = date;
    }

    public ListExpertPicksMessage(LanguageCode languageCode, String countryCode, Date date) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.lastPublishedAt = date;
    }

    public final List<ExpertPick> getList() {
        List<ExpertPick> list = this.list;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("list");
        return null;
    }

    public final void setList(List<ExpertPick> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("list") && !obj.isNull("list")) {
            JSONArray jSONArray = obj.getJSONArray("list");
            setList(new ArrayList());
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    Object obj2 = jSONArray.get(i);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    getList().add(new ExpertPick((JSONObject) obj2));
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
        throw new ParameterCheckFailException("list is missing in api ListExpertPicks");
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
        Date date = this.lastPublishedAt;
        if (date != null) {
            Intrinsics.checkNotNull(date);
            hashMap.put("last_published_at", Long.valueOf(date.getTime() / 1000));
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof ListExpertPicksMessage)) {
            return false;
        }
        ListExpertPicksMessage listExpertPicksMessage = (ListExpertPicksMessage) other;
        return this.languageCode == listExpertPicksMessage.languageCode && Intrinsics.areEqual(this.countryCode, listExpertPicksMessage.countryCode) && Intrinsics.areEqual(this.lastPublishedAt, listExpertPicksMessage.lastPublishedAt);
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
        if (other == null || !(other instanceof ListExpertPicksMessage)) {
            return false;
        }
        ListExpertPicksMessage listExpertPicksMessage = (ListExpertPicksMessage) other;
        return this.languageCode == listExpertPicksMessage.languageCode && Intrinsics.areEqual(this.countryCode, listExpertPicksMessage.countryCode) && Intrinsics.areEqual(this.lastPublishedAt, listExpertPicksMessage.lastPublishedAt) && Intrinsics.areEqual(getList(), listExpertPicksMessage.getList());
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        Date date = this.lastPublishedAt;
        return ((hashCode + (date != null ? date.hashCode() : 0)) * 31) + getList().hashCode();
    }

    /* compiled from: ListExpertPicksMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/article/ListExpertPicksMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/article/article/list_expert_picks";
        }
    }
}
