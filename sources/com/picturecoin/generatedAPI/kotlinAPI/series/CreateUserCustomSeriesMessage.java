package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
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

/* compiled from: CreateUserCustomSeriesMessage.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$0#H\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&0#H\u0016J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010$H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\b\u0010+\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020(H\u0016J\b\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0016J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000700H\u0016¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u00103\u001a\u000204H\u0016J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J'\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006;"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/CreateUserCustomSeriesMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", Args.title, "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getTitle", "setTitle", "customSeries", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserCustomSeries;", "getCustomSeries", "()Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserCustomSeries;", "setCustomSeries", "(Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserCustomSeries;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class CreateUserCustomSeriesMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    public UserCustomSeries customSeries;
    private LanguageCode languageCode;
    private String title;

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
    public final String getTitle() {
        return this.title;
    }

    public final CreateUserCustomSeriesMessage copy(LanguageCode languageCode, String countryCode, String title) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(title, "title");
        return new CreateUserCustomSeriesMessage(languageCode, countryCode, title);
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
        return "CreateUserCustomSeriesMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", title=" + this.title + ")";
    }

    public static /* synthetic */ CreateUserCustomSeriesMessage copy$default(CreateUserCustomSeriesMessage createUserCustomSeriesMessage, LanguageCode languageCode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = createUserCustomSeriesMessage.languageCode;
        }
        if ((i & 2) != 0) {
            str = createUserCustomSeriesMessage.countryCode;
        }
        if ((i & 4) != 0) {
            str2 = createUserCustomSeriesMessage.title;
        }
        return createUserCustomSeriesMessage.copy(languageCode, str, str2);
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

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public CreateUserCustomSeriesMessage(LanguageCode languageCode, String countryCode, String title) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(title, "title");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.title = title;
    }

    public final UserCustomSeries getCustomSeries() {
        UserCustomSeries userCustomSeries = this.customSeries;
        if (userCustomSeries != null) {
            return userCustomSeries;
        }
        Intrinsics.throwUninitializedPropertyAccessException("customSeries");
        return null;
    }

    public final void setCustomSeries(UserCustomSeries userCustomSeries) {
        Intrinsics.checkNotNullParameter(userCustomSeries, "<set-?>");
        this.customSeries = userCustomSeries;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("custom_series") && !obj.isNull("custom_series")) {
            Object obj2 = obj.get("custom_series");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            setCustomSeries(new UserCustomSeries((JSONObject) obj2));
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("custom_series is missing in api CreateUserCustomSeries");
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
        hashMap.put(Args.title, this.title);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof CreateUserCustomSeriesMessage)) {
            return false;
        }
        CreateUserCustomSeriesMessage createUserCustomSeriesMessage = (CreateUserCustomSeriesMessage) other;
        return this.languageCode == createUserCustomSeriesMessage.languageCode && Intrinsics.areEqual(this.countryCode, createUserCustomSeriesMessage.countryCode) && Intrinsics.areEqual(this.title, createUserCustomSeriesMessage.title);
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
        if (other == null || !(other instanceof CreateUserCustomSeriesMessage)) {
            return false;
        }
        CreateUserCustomSeriesMessage createUserCustomSeriesMessage = (CreateUserCustomSeriesMessage) other;
        return this.languageCode == createUserCustomSeriesMessage.languageCode && Intrinsics.areEqual(this.countryCode, createUserCustomSeriesMessage.countryCode) && Intrinsics.areEqual(this.title, createUserCustomSeriesMessage.title) && Intrinsics.areEqual(getCustomSeries(), createUserCustomSeriesMessage.getCustomSeries());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.title.hashCode()) * 31) + getCustomSeries().hashCode();
    }

    /* compiled from: CreateUserCustomSeriesMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/CreateUserCustomSeriesMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/series/create_user_custom_series";
        }
    }
}
