package com.glority.android.base.agreement.model;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0080\b\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001?B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u00100\u001a\u000201H\u0016J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000101H\u0014J\t\u00105\u001a\u00020\bHÂ\u0003J\u0013\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u000101H\u0096\u0002J\u0016\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001010;H\u0016J\u001c\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001010;2\u0006\u0010<\u001a\u000208J\b\u0010=\u001a\u00020\bH\u0016J\t\u0010>\u001a\u00020\u000bHÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R,\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R*\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R,\u0010#\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R*\u0010&\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R&\u0010)\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\tR*\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/glority/android/base/agreement/model/LegalConfig;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "agreementUrl", "getAgreementUrl", "()Ljava/lang/String;", "setAgreementUrl", "(Ljava/lang/String;)V", "agreementVersion", "getAgreementVersion", "()Ljava/lang/Integer;", "setAgreementVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "dataManagementUrl", "getDataManagementUrl", "setDataManagementUrl", "Ljava/util/Date;", "nextAgreementAvailableAt", "getNextAgreementAvailableAt", "()Ljava/util/Date;", "setNextAgreementAvailableAt", "(Ljava/util/Date;)V", "nextAgreementUrl", "getNextAgreementUrl", "setNextAgreementUrl", "nextAgreementVersion", "getNextAgreementVersion", "setNextAgreementVersion", "privacyPolicyUrl", "getPrivacyPolicyUrl", "setPrivacyPolicyUrl", "privacyPolicyVersion", "getPrivacyPolicyVersion", "()I", "setPrivacyPolicyVersion", "thirdPartyNoticesUrl", "getThirdPartyNoticesUrl", "setThirdPartyNoticesUrl", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class LegalConfig extends APIModelBase<LegalConfig> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String agreementUrl;
    private Integer agreementVersion;
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

    public static /* synthetic */ LegalConfig copy$default(LegalConfig legalConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = legalConfig.unused;
        }
        return legalConfig.copy(i);
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

    public final String getAgreementUrl() {
        return this.agreementUrl;
    }

    public final void setAgreementUrl(String str) {
        this.agreementUrl = str;
    }

    public final Integer getAgreementVersion() {
        return this.agreementVersion;
    }

    public final void setAgreementVersion(Integer num) {
        this.agreementVersion = num;
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
            this.agreementVersion = Integer.valueOf(obj.getInt("agreement_version"));
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
            if (obj.has("privacy_policy_version") && !obj.isNull("privacy_policy_version")) {
                this.privacyPolicyVersion = obj.getInt("privacy_policy_version");
                return;
            }
            throw new ParameterCheckFailException("privacyPolicyVersion is missing in model LegalConfig");
        }
        throw new ParameterCheckFailException("agreementVersion is missing in model LegalConfig");
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
        hashMap.put("agreement_version", this.agreementVersion);
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
        return ((Intrinsics.areEqual(this.agreementUrl, legalConfig.agreementUrl) ^ true) || (Intrinsics.areEqual(this.agreementVersion, legalConfig.agreementVersion) ^ true) || (Intrinsics.areEqual(this.nextAgreementUrl, legalConfig.nextAgreementUrl) ^ true) || (Intrinsics.areEqual(this.nextAgreementVersion, legalConfig.nextAgreementVersion) ^ true) || (Intrinsics.areEqual(this.nextAgreementAvailableAt, legalConfig.nextAgreementAvailableAt) ^ true) || (Intrinsics.areEqual(this.thirdPartyNoticesUrl, legalConfig.thirdPartyNoticesUrl) ^ true) || (Intrinsics.areEqual(this.privacyPolicyUrl, legalConfig.privacyPolicyUrl) ^ true) || (Intrinsics.areEqual(this.dataManagementUrl, legalConfig.dataManagementUrl) ^ true) || this.privacyPolicyVersion != legalConfig.privacyPolicyVersion) ? false : true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.agreementUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.agreementVersion;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.nextAgreementUrl;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.nextAgreementVersion;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Date date = this.nextAgreementAvailableAt;
        int hashCode6 = (hashCode5 + (date != null ? date.hashCode() : 0)) * 31;
        String str3 = this.thirdPartyNoticesUrl;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.privacyPolicyUrl;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.dataManagementUrl;
        return ((hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.privacyPolicyVersion);
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
        if (o != null) {
            LegalConfig legalConfig = (LegalConfig) o;
            super.cloneTo(legalConfig);
            String str = this.agreementUrl;
            legalConfig.agreementUrl = str != null ? cloneField(str) : null;
            legalConfig.agreementVersion = cloneField(this.agreementVersion);
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
            Integer cloneField = cloneField(Integer.valueOf(this.privacyPolicyVersion));
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.privacyPolicyVersion)");
            legalConfig.privacyPolicyVersion = cloneField.intValue();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.android.base.agreement.model.LegalConfig");
    }

    /* compiled from: LegalConfig.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/base/agreement/model/LegalConfig$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getLegalConfigJsonArrayMap", "", "array", "Lcom/glority/android/base/agreement/model/LegalConfig;", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
