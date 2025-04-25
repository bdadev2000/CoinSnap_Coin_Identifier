package com.picturecoin.generatedAPI.kotlinAPI.recognize;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
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

/* compiled from: RecognizeGradeMessage.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u000209H\u0016J\u0014\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020<0;H\u0016J\u0014\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0;H\u0016J\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010<H\u0016J\b\u0010A\u001a\u00020\u0007H\u0016J\b\u0010B\u001a\u00020?H\u0016J\b\u0010C\u001a\u00020?H\u0016J\b\u0010D\u001a\u00020?H\u0016J\b\u0010E\u001a\u00020?H\u0016J\u0013\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070GH\u0016¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010J\u001a\u00020KH\u0016J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010Q\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001c\u0010$\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001c\u0010'\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001c\u0010*\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001c\u0010-\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001c\u00100\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014¨\u0006S"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/RecognizeGradeMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "image", "Ljava/io/File;", "image2", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getImage", "()Ljava/io/File;", "setImage", "(Ljava/io/File;)V", "getImage2", "setImage2", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCmsName", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "setCmsName", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;)V", "grade", "getGrade", "setGrade", Args.uid, "getUid", "setUid", Args.year, "getYear", "setYear", "beautifiedImageUrl", "getBeautifiedImageUrl", "setBeautifiedImageUrl", Args.denominationSideUrl, "getDenominationSideUrl", "setDenominationSideUrl", Args.subjectSideUrl, "getSubjectSideUrl", "setSubjectSideUrl", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class RecognizeGradeMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String beautifiedImageUrl;
    private CmsName cmsName;
    private String countryCode;
    private String denominationSideUrl;
    public String grade;
    private File image;
    private File image2;
    private LanguageCode languageCode;
    private String subjectSideUrl;
    private String uid;
    private String year;

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
    public final File getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final File getImage2() {
        return this.image2;
    }

    public final RecognizeGradeMessage copy(LanguageCode languageCode, String countryCode, File image, File image2) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(image, "image");
        return new RecognizeGradeMessage(languageCode, countryCode, image, image2);
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
        return "RecognizeGradeMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", image=" + this.image + ", image2=" + this.image2 + ")";
    }

    public static /* synthetic */ RecognizeGradeMessage copy$default(RecognizeGradeMessage recognizeGradeMessage, LanguageCode languageCode, String str, File file, File file2, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = recognizeGradeMessage.languageCode;
        }
        if ((i & 2) != 0) {
            str = recognizeGradeMessage.countryCode;
        }
        if ((i & 4) != 0) {
            file = recognizeGradeMessage.image;
        }
        if ((i & 8) != 0) {
            file2 = recognizeGradeMessage.image2;
        }
        return recognizeGradeMessage.copy(languageCode, str, file, file2);
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

    public final File getImage() {
        return this.image;
    }

    public final void setImage(File file) {
        Intrinsics.checkNotNullParameter(file, "<set-?>");
        this.image = file;
    }

    public final File getImage2() {
        return this.image2;
    }

    public final void setImage2(File file) {
        this.image2 = file;
    }

    public RecognizeGradeMessage(LanguageCode languageCode, String countryCode, File image, File file) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(image, "image");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.image = image;
        this.image2 = file;
    }

    public final CmsName getCmsName() {
        return this.cmsName;
    }

    public final void setCmsName(CmsName cmsName) {
        this.cmsName = cmsName;
    }

    public final String getGrade() {
        String str = this.grade;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("grade");
        return null;
    }

    public final void setGrade(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.grade = str;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final String getYear() {
        return this.year;
    }

    public final void setYear(String str) {
        this.year = str;
    }

    public final String getBeautifiedImageUrl() {
        return this.beautifiedImageUrl;
    }

    public final void setBeautifiedImageUrl(String str) {
        this.beautifiedImageUrl = str;
    }

    public final String getDenominationSideUrl() {
        return this.denominationSideUrl;
    }

    public final void setDenominationSideUrl(String str) {
        this.denominationSideUrl = str;
    }

    public final String getSubjectSideUrl() {
        return this.subjectSideUrl;
    }

    public final void setSubjectSideUrl(String str) {
        this.subjectSideUrl = str;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("cms_name") && !obj.isNull("cms_name")) {
            Object obj2 = obj.get("cms_name");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            this.cmsName = new CmsName((JSONObject) obj2);
        } else {
            this.cmsName = null;
        }
        if (obj.has("grade") && !obj.isNull("grade")) {
            setGrade(obj.getString("grade"));
            if (obj.has(Args.uid) && !obj.isNull(Args.uid)) {
                this.uid = obj.getString(Args.uid);
            } else {
                this.uid = null;
            }
            if (obj.has(Args.year) && !obj.isNull(Args.year)) {
                this.year = obj.getString(Args.year);
            } else {
                this.year = null;
            }
            if (obj.has("beautified_image_url") && !obj.isNull("beautified_image_url")) {
                this.beautifiedImageUrl = obj.getString("beautified_image_url");
            } else {
                this.beautifiedImageUrl = null;
            }
            if (obj.has("denomination_side_url") && !obj.isNull("denomination_side_url")) {
                this.denominationSideUrl = obj.getString("denomination_side_url");
            } else {
                this.denominationSideUrl = null;
            }
            if (obj.has("subject_side_url") && !obj.isNull("subject_side_url")) {
                this.subjectSideUrl = obj.getString("subject_side_url");
            } else {
                this.subjectSideUrl = null;
            }
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("grade is missing in api RecognizeGrade");
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
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        HashMap hashMap = new HashMap();
        File file = this.image;
        if (file != null) {
        }
        File file2 = this.image2;
        if (file2 != null) {
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof RecognizeGradeMessage)) {
            return false;
        }
        RecognizeGradeMessage recognizeGradeMessage = (RecognizeGradeMessage) other;
        return this.languageCode == recognizeGradeMessage.languageCode && Intrinsics.areEqual(this.countryCode, recognizeGradeMessage.countryCode) && Intrinsics.areEqual(this.image, recognizeGradeMessage.image) && Intrinsics.areEqual(this.image2, recognizeGradeMessage.image2);
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
        if (other == null || !(other instanceof RecognizeGradeMessage)) {
            return false;
        }
        RecognizeGradeMessage recognizeGradeMessage = (RecognizeGradeMessage) other;
        return this.languageCode == recognizeGradeMessage.languageCode && Intrinsics.areEqual(this.countryCode, recognizeGradeMessage.countryCode) && Intrinsics.areEqual(this.image, recognizeGradeMessage.image) && Intrinsics.areEqual(this.image2, recognizeGradeMessage.image2) && Intrinsics.areEqual(this.cmsName, recognizeGradeMessage.cmsName) && Intrinsics.areEqual(getGrade(), recognizeGradeMessage.getGrade()) && Intrinsics.areEqual(this.uid, recognizeGradeMessage.uid) && Intrinsics.areEqual(this.year, recognizeGradeMessage.year) && Intrinsics.areEqual(this.beautifiedImageUrl, recognizeGradeMessage.beautifiedImageUrl) && Intrinsics.areEqual(this.denominationSideUrl, recognizeGradeMessage.denominationSideUrl) && Intrinsics.areEqual(this.subjectSideUrl, recognizeGradeMessage.subjectSideUrl);
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.image.hashCode()) * 31;
        File file = this.image2;
        int hashCode2 = (hashCode + (file != null ? file.hashCode() : 0)) * 31;
        CmsName cmsName = this.cmsName;
        int hashCode3 = (((hashCode2 + (cmsName != null ? cmsName.hashCode() : 0)) * 31) + getGrade().hashCode()) * 31;
        String str = this.uid;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.year;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.beautifiedImageUrl;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.denominationSideUrl;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.subjectSideUrl;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    /* compiled from: RecognizeGradeMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/RecognizeGradeMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/recognize/recognize_grade";
        }
    }
}
