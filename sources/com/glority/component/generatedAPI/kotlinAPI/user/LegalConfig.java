package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.android.core.definition.APIModelBase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: LegalConfig.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001?B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u00100\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u000102012\u0006\u00103\u001a\u000204J\u0016\u00100\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010201H\u0016J\u0013\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u000202H\u0016J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u000102H\u0014J\t\u0010<\u001a\u00020\u0005HÂ\u0003J\u0013\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010>\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0007R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R\u001c\u0010'\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R\u001c\u0010*\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R\u001a\u0010-\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0007¨\u0006@"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/LegalConfig;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "agreementUrl", "", "getAgreementUrl", "()Ljava/lang/String;", "setAgreementUrl", "(Ljava/lang/String;)V", "agreementVersion", "getAgreementVersion", "()I", "setAgreementVersion", "nextAgreementUrl", "getNextAgreementUrl", "setNextAgreementUrl", "nextAgreementVersion", "getNextAgreementVersion", "()Ljava/lang/Integer;", "setNextAgreementVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "nextAgreementAvailableAt", "Ljava/util/Date;", "getNextAgreementAvailableAt", "()Ljava/util/Date;", "setNextAgreementAvailableAt", "(Ljava/util/Date;)V", "thirdPartyNoticesUrl", "getThirdPartyNoticesUrl", "setThirdPartyNoticesUrl", "privacyPolicyUrl", "getPrivacyPolicyUrl", "setPrivacyPolicyUrl", "dataManagementUrl", "getDataManagementUrl", "setDataManagementUrl", "privacyPolicyVersion", "getPrivacyPolicyVersion", "setPrivacyPolicyVersion", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class LegalConfig extends APIModelBase<LegalConfig> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = -2121876279694740320L;
    private String agreementUrl;
    private int agreementVersion;
    private String dataManagementUrl;
    private Date nextAgreementAvailableAt;
    private String nextAgreementUrl;
    private Integer nextAgreementVersion;
    private String privacyPolicyUrl;
    private int privacyPolicyVersion;
    private String thirdPartyNoticesUrl;
    private int unused;

    public LegalConfig() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final LegalConfig copy(int unused) {
        return new LegalConfig(unused);
    }

    public String toString() {
        return "LegalConfig(unused=" + this.unused + ")";
    }

    public LegalConfig(int i) {
        this.unused = i;
    }

    public /* synthetic */ LegalConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ LegalConfig copy$default(LegalConfig legalConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = legalConfig.unused;
        }
        return legalConfig.copy(i);
    }

    public final String getAgreementUrl() {
        return this.agreementUrl;
    }

    public final void setAgreementUrl(String str) {
        this.agreementUrl = str;
    }

    public final int getAgreementVersion() {
        return this.agreementVersion;
    }

    public final void setAgreementVersion(int i) {
        this.agreementVersion = i;
    }

    public final String getNextAgreementUrl() {
        return this.nextAgreementUrl;
    }

    public final void setNextAgreementUrl(String str) {
        this.nextAgreementUrl = str;
    }

    public final Integer getNextAgreementVersion() {
        return this.nextAgreementVersion;
    }

    public final void setNextAgreementVersion(Integer num) {
        this.nextAgreementVersion = num;
    }

    public final Date getNextAgreementAvailableAt() {
        return this.nextAgreementAvailableAt;
    }

    public final void setNextAgreementAvailableAt(Date date) {
        this.nextAgreementAvailableAt = date;
    }

    public final String getThirdPartyNoticesUrl() {
        return this.thirdPartyNoticesUrl;
    }

    public final void setThirdPartyNoticesUrl(String str) {
        this.thirdPartyNoticesUrl = str;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final void setPrivacyPolicyUrl(String str) {
        this.privacyPolicyUrl = str;
    }

    public final String getDataManagementUrl() {
        return this.dataManagementUrl;
    }

    public final void setDataManagementUrl(String str) {
        this.dataManagementUrl = str;
    }

    public final int getPrivacyPolicyVersion() {
        return this.privacyPolicyVersion;
    }

    public final void setPrivacyPolicyVersion(int i) {
        this.privacyPolicyVersion = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegalConfig(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("agreement_url") && !obj.isNull("agreement_url")) {
            this.agreementUrl = obj.getString("agreement_url");
        } else {
            this.agreementUrl = null;
        }
        if (obj.has("agreement_version") && !obj.isNull("agreement_version")) {
            this.agreementVersion = obj.getInt("agreement_version");
        }
        if (obj.has("next_agreement_url") && !obj.isNull("next_agreement_url")) {
            this.nextAgreementUrl = obj.getString("next_agreement_url");
        } else {
            this.nextAgreementUrl = null;
        }
        if (obj.has("next_agreement_version") && !obj.isNull("next_agreement_version")) {
            this.nextAgreementVersion = Integer.valueOf(obj.getInt("next_agreement_version"));
        } else {
            this.nextAgreementVersion = null;
        }
        if (obj.has("next_agreement_available_at") && !obj.isNull("next_agreement_available_at")) {
            this.nextAgreementAvailableAt = new Date(obj.getLong("next_agreement_available_at") * 1000);
        } else {
            this.nextAgreementAvailableAt = null;
        }
        if (obj.has("third_party_notices_url") && !obj.isNull("third_party_notices_url")) {
            this.thirdPartyNoticesUrl = obj.getString("third_party_notices_url");
        } else {
            this.thirdPartyNoticesUrl = null;
        }
        if (obj.has("privacy_policy_url") && !obj.isNull("privacy_policy_url")) {
            this.privacyPolicyUrl = obj.getString("privacy_policy_url");
        } else {
            this.privacyPolicyUrl = null;
        }
        if (obj.has("data_management_url") && !obj.isNull("data_management_url")) {
            this.dataManagementUrl = obj.getString("data_management_url");
        } else {
            this.dataManagementUrl = null;
        }
        if (!obj.has("privacy_policy_version") || obj.isNull("privacy_policy_version")) {
            return;
        }
        this.privacyPolicyVersion = obj.getInt("privacy_policy_version");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.agreementUrl;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("agreement_url", str);
        } else if (keepNull) {
            hashMap.put("agreement_url", null);
        }
        hashMap.put("agreement_version", Integer.valueOf(this.agreementVersion));
        String str2 = this.nextAgreementUrl;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("next_agreement_url", str2);
        } else if (keepNull) {
            hashMap.put("next_agreement_url", null);
        }
        Integer num = this.nextAgreementVersion;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("next_agreement_version", num);
        } else if (keepNull) {
            hashMap.put("next_agreement_version", null);
        }
        Date date = this.nextAgreementAvailableAt;
        if (date != null) {
            Intrinsics.checkNotNull(date);
            hashMap.put("next_agreement_available_at", Long.valueOf(date.getTime() / 1000));
        } else if (keepNull) {
            hashMap.put("next_agreement_available_at", null);
        }
        String str3 = this.thirdPartyNoticesUrl;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("third_party_notices_url", str3);
        } else if (keepNull) {
            hashMap.put("third_party_notices_url", null);
        }
        String str4 = this.privacyPolicyUrl;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("privacy_policy_url", str4);
        } else if (keepNull) {
            hashMap.put("privacy_policy_url", null);
        }
        String str5 = this.dataManagementUrl;
        if (str5 != null) {
            Intrinsics.checkNotNull(str5);
            hashMap.put("data_management_url", str5);
        } else if (keepNull) {
            hashMap.put("data_management_url", null);
        }
        hashMap.put("privacy_policy_version", Integer.valueOf(this.privacyPolicyVersion));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof LegalConfig)) {
            return false;
        }
        LegalConfig legalConfig = (LegalConfig) other;
        return Intrinsics.areEqual(this.agreementUrl, legalConfig.agreementUrl) && this.agreementVersion == legalConfig.agreementVersion && Intrinsics.areEqual(this.nextAgreementUrl, legalConfig.nextAgreementUrl) && Intrinsics.areEqual(this.nextAgreementVersion, legalConfig.nextAgreementVersion) && Intrinsics.areEqual(this.nextAgreementAvailableAt, legalConfig.nextAgreementAvailableAt) && Intrinsics.areEqual(this.thirdPartyNoticesUrl, legalConfig.thirdPartyNoticesUrl) && Intrinsics.areEqual(this.privacyPolicyUrl, legalConfig.privacyPolicyUrl) && Intrinsics.areEqual(this.dataManagementUrl, legalConfig.dataManagementUrl) && this.privacyPolicyVersion == legalConfig.privacyPolicyVersion;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.agreementUrl;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.agreementVersion)) * 31;
        String str2 = this.nextAgreementUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.nextAgreementVersion;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Date date = this.nextAgreementAvailableAt;
        int hashCode5 = (hashCode4 + (date != null ? date.hashCode() : 0)) * 31;
        String str3 = this.thirdPartyNoticesUrl;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.privacyPolicyUrl;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.dataManagementUrl;
        return ((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.privacyPolicyVersion);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        LegalConfig legalConfig = new LegalConfig(0, 1, null);
        cloneTo(legalConfig);
        return legalConfig;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.LegalConfig");
        LegalConfig legalConfig = (LegalConfig) o;
        super.cloneTo(legalConfig);
        String str = this.agreementUrl;
        legalConfig.agreementUrl = str != null ? cloneField(str) : null;
        legalConfig.agreementVersion = cloneField(Integer.valueOf(this.agreementVersion)).intValue();
        String str2 = this.nextAgreementUrl;
        legalConfig.nextAgreementUrl = str2 != null ? cloneField(str2) : null;
        Integer num = this.nextAgreementVersion;
        legalConfig.nextAgreementVersion = num != null ? cloneField(num) : null;
        Date date = this.nextAgreementAvailableAt;
        legalConfig.nextAgreementAvailableAt = date != null ? cloneField(date) : null;
        String str3 = this.thirdPartyNoticesUrl;
        legalConfig.thirdPartyNoticesUrl = str3 != null ? cloneField(str3) : null;
        String str4 = this.privacyPolicyUrl;
        legalConfig.privacyPolicyUrl = str4 != null ? cloneField(str4) : null;
        String str5 = this.dataManagementUrl;
        legalConfig.dataManagementUrl = str5 != null ? cloneField(str5) : null;
        legalConfig.privacyPolicyVersion = cloneField(Integer.valueOf(this.privacyPolicyVersion)).intValue();
    }

    /* compiled from: LegalConfig.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/LegalConfig$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getLegalConfigJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LegalConfig;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getLegalConfigJsonArrayMap(List<LegalConfig> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((LegalConfig) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
