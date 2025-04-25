package com.picturecoin.generatedAPI.kotlinAPI.collection;

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

/* compiled from: ExportCustomSeriesMessage.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\r\b\u0086\b\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(0'H\u0016J\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*0'H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010(H\u0016J\b\u0010.\u001a\u00020\u0007H\u0016J\b\u0010/\u001a\u00020,H\u0016J\b\u00100\u001a\u00020,H\u0016J\b\u00101\u001a\u00020,H\u0016J\b\u00102\u001a\u00020,H\u0016J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020\u000704H\u0016¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u00107\u001a\u00020\nH\u0016J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010<\u001a\u00020\u0007HÆ\u0003JB\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010>J\t\u0010?\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006A"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/ExportCustomSeriesMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "gradeScale", Args.customSeriesId, "", "email", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getGradeScale", "setGradeScale", "getCustomSeriesId", "()Ljava/lang/Integer;", "setCustomSeriesId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEmail", "setEmail", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/picturecoin/generatedAPI/kotlinAPI/collection/ExportCustomSeriesMessage;", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class ExportCustomSeriesMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    private Integer customSeriesId;
    private String email;
    private String gradeScale;
    private LanguageCode languageCode;

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
    public final String getGradeScale() {
        return this.gradeScale;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getCustomSeriesId() {
        return this.customSeriesId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final ExportCustomSeriesMessage copy(LanguageCode languageCode, String countryCode, String gradeScale, Integer customSeriesId, String email) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(gradeScale, "gradeScale");
        Intrinsics.checkNotNullParameter(email, "email");
        return new ExportCustomSeriesMessage(languageCode, countryCode, gradeScale, customSeriesId, email);
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
        return "ExportCustomSeriesMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", gradeScale=" + this.gradeScale + ", customSeriesId=" + this.customSeriesId + ", email=" + this.email + ")";
    }

    public static /* synthetic */ ExportCustomSeriesMessage copy$default(ExportCustomSeriesMessage exportCustomSeriesMessage, LanguageCode languageCode, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = exportCustomSeriesMessage.languageCode;
        }
        if ((i & 2) != 0) {
            str = exportCustomSeriesMessage.countryCode;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = exportCustomSeriesMessage.gradeScale;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            num = exportCustomSeriesMessage.customSeriesId;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = exportCustomSeriesMessage.email;
        }
        return exportCustomSeriesMessage.copy(languageCode, str4, str5, num2, str3);
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

    public final String getGradeScale() {
        return this.gradeScale;
    }

    public final void setGradeScale(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gradeScale = str;
    }

    public final Integer getCustomSeriesId() {
        return this.customSeriesId;
    }

    public final void setCustomSeriesId(Integer num) {
        this.customSeriesId = num;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public ExportCustomSeriesMessage(LanguageCode languageCode, String countryCode, String gradeScale, Integer num, String email) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(gradeScale, "gradeScale");
        Intrinsics.checkNotNullParameter(email, "email");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.gradeScale = gradeScale;
        this.customSeriesId = num;
        this.email = email;
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
        hashMap.put("grade_scale", this.gradeScale);
        Integer num = this.customSeriesId;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("custom_series_id", num);
        }
        hashMap.put("email", this.email);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof ExportCustomSeriesMessage)) {
            return false;
        }
        ExportCustomSeriesMessage exportCustomSeriesMessage = (ExportCustomSeriesMessage) other;
        return this.languageCode == exportCustomSeriesMessage.languageCode && Intrinsics.areEqual(this.countryCode, exportCustomSeriesMessage.countryCode) && Intrinsics.areEqual(this.gradeScale, exportCustomSeriesMessage.gradeScale) && Intrinsics.areEqual(this.customSeriesId, exportCustomSeriesMessage.customSeriesId) && Intrinsics.areEqual(this.email, exportCustomSeriesMessage.email);
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
        if (other == null || !(other instanceof ExportCustomSeriesMessage)) {
            return false;
        }
        ExportCustomSeriesMessage exportCustomSeriesMessage = (ExportCustomSeriesMessage) other;
        return this.languageCode == exportCustomSeriesMessage.languageCode && Intrinsics.areEqual(this.countryCode, exportCustomSeriesMessage.countryCode) && Intrinsics.areEqual(this.gradeScale, exportCustomSeriesMessage.gradeScale) && Intrinsics.areEqual(this.customSeriesId, exportCustomSeriesMessage.customSeriesId) && Intrinsics.areEqual(this.email, exportCustomSeriesMessage.email);
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.gradeScale.hashCode()) * 31;
        Integer num = this.customSeriesId;
        return ((hashCode + (num != null ? num.hashCode() : 0)) * 31) + this.email.hashCode();
    }

    /* compiled from: ExportCustomSeriesMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/ExportCustomSeriesMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/collection/export_custom_series";
        }
    }
}
