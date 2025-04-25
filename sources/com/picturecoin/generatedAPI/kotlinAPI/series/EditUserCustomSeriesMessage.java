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
import org.json.JSONObject;

/* compiled from: EditUserCustomSeriesMessage.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\b\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$0#H\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&0#H\u0016J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010$H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\b\u0010+\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020(H\u0016J\b\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0016J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000700H\u0016¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u00103\u001a\u00020\tH\u0016J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J1\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006;"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/EditUserCustomSeriesMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", Args.customSeriesId, "", Args.title, "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;ILjava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getCustomSeriesId", "()I", "setCustomSeriesId", "(I)V", "getTitle", "setTitle", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "component4", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class EditUserCustomSeriesMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    private int customSeriesId;
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
    public final int getCustomSeriesId() {
        return this.customSeriesId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final EditUserCustomSeriesMessage copy(LanguageCode languageCode, String countryCode, int customSeriesId, String title) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(title, "title");
        return new EditUserCustomSeriesMessage(languageCode, countryCode, customSeriesId, title);
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
        return "EditUserCustomSeriesMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", customSeriesId=" + this.customSeriesId + ", title=" + this.title + ")";
    }

    public static /* synthetic */ EditUserCustomSeriesMessage copy$default(EditUserCustomSeriesMessage editUserCustomSeriesMessage, LanguageCode languageCode, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            languageCode = editUserCustomSeriesMessage.languageCode;
        }
        if ((i2 & 2) != 0) {
            str = editUserCustomSeriesMessage.countryCode;
        }
        if ((i2 & 4) != 0) {
            i = editUserCustomSeriesMessage.customSeriesId;
        }
        if ((i2 & 8) != 0) {
            str2 = editUserCustomSeriesMessage.title;
        }
        return editUserCustomSeriesMessage.copy(languageCode, str, i, str2);
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

    public final int getCustomSeriesId() {
        return this.customSeriesId;
    }

    public final void setCustomSeriesId(int i) {
        this.customSeriesId = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public EditUserCustomSeriesMessage(LanguageCode languageCode, String countryCode, int i, String title) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(title, "title");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.customSeriesId = i;
        this.title = title;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this._response_at = new Date();
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
        hashMap.put("custom_series_id", Integer.valueOf(this.customSeriesId));
        hashMap.put(Args.title, this.title);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof EditUserCustomSeriesMessage)) {
            return false;
        }
        EditUserCustomSeriesMessage editUserCustomSeriesMessage = (EditUserCustomSeriesMessage) other;
        return this.languageCode == editUserCustomSeriesMessage.languageCode && Intrinsics.areEqual(this.countryCode, editUserCustomSeriesMessage.countryCode) && this.customSeriesId == editUserCustomSeriesMessage.customSeriesId && Intrinsics.areEqual(this.title, editUserCustomSeriesMessage.title);
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
        if (other == null || !(other instanceof EditUserCustomSeriesMessage)) {
            return false;
        }
        EditUserCustomSeriesMessage editUserCustomSeriesMessage = (EditUserCustomSeriesMessage) other;
        return this.languageCode == editUserCustomSeriesMessage.languageCode && Intrinsics.areEqual(this.countryCode, editUserCustomSeriesMessage.countryCode) && this.customSeriesId == editUserCustomSeriesMessage.customSeriesId && Intrinsics.areEqual(this.title, editUserCustomSeriesMessage.title);
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + Integer.hashCode(this.customSeriesId)) * 31) + this.title.hashCode();
    }

    /* compiled from: EditUserCustomSeriesMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/EditUserCustomSeriesMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/series/edit_user_custom_series";
        }
    }
}
