package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: UpdateUserConversionMessage.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0086\b\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001YBs\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u000209H\u0016J\u0014\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020<0;H\u0016J\u0014\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020>0;H\u0016J\u0012\u0010?\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010<H\u0016J\b\u0010A\u001a\u00020\u0007H\u0016J\b\u0010B\u001a\u00020\u0005H\u0016J\b\u0010C\u001a\u00020\u0005H\u0016J\b\u0010D\u001a\u00020\u0005H\u0016J\b\u0010E\u001a\u00020\u0005H\u0016J\u0013\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070GH\u0016¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010J\u001a\u00020\u000bH\u0016J\t\u0010K\u001a\u00020\u0005HÄ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u000bHÄ\u0003¢\u0006\u0002\u0010!J\u000b\u0010P\u001a\u0004\u0018\u00010\rHÄ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u0090\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010WJ\t\u0010X\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001b¨\u0006Z"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateUserConversionMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "isOrganic", "", "mediaSource", "", "campaign", "campaignId", "costCentsUsd", "", "installTime", "Ljava/util/Date;", "channel", LogEventArguments.ARG_KEYWORDS, "absetId", "adId", "adType", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "setOrganic", "(Z)V", "getMediaSource", "()Ljava/lang/String;", "setMediaSource", "(Ljava/lang/String;)V", "getCampaign", "setCampaign", "getCampaignId", "setCampaignId", "getCostCentsUsd", "()Ljava/lang/Integer;", "setCostCentsUsd", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getInstallTime", "()Ljava/util/Date;", "setInstallTime", "(Ljava/util/Date;)V", "getChannel", "setChannel", "getKeywords", "setKeywords", "getAbsetId", "setAbsetId", "getAdId", "setAdId", "getAdType", "setAdType", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateUserConversionMessage;", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class UpdateUserConversionMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String absetId;
    private String adId;
    private String adType;
    private String campaign;
    private String campaignId;
    private String channel;
    private Integer costCentsUsd;
    private Date installTime;
    private boolean isOrganic;
    private String keywords;
    private String mediaSource;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final boolean getIsOrganic() {
        return this.isOrganic;
    }

    /* renamed from: component10, reason: from getter */
    protected final String getAdId() {
        return this.adId;
    }

    /* renamed from: component11, reason: from getter */
    protected final String getAdType() {
        return this.adType;
    }

    /* renamed from: component2, reason: from getter */
    protected final String getMediaSource() {
        return this.mediaSource;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getCampaign() {
        return this.campaign;
    }

    /* renamed from: component4, reason: from getter */
    protected final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component5, reason: from getter */
    protected final Integer getCostCentsUsd() {
        return this.costCentsUsd;
    }

    /* renamed from: component6, reason: from getter */
    protected final Date getInstallTime() {
        return this.installTime;
    }

    /* renamed from: component7, reason: from getter */
    protected final String getChannel() {
        return this.channel;
    }

    /* renamed from: component8, reason: from getter */
    protected final String getKeywords() {
        return this.keywords;
    }

    /* renamed from: component9, reason: from getter */
    protected final String getAbsetId() {
        return this.absetId;
    }

    public final UpdateUserConversionMessage copy(boolean isOrganic, String mediaSource, String campaign, String campaignId, Integer costCentsUsd, Date installTime, String channel, String keywords, String absetId, String adId, String adType) {
        return new UpdateUserConversionMessage(isOrganic, mediaSource, campaign, campaignId, costCentsUsd, installTime, channel, keywords, absetId, adId, adType);
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
        return "UpdateUserConversionMessage(isOrganic=" + this.isOrganic + ", mediaSource=" + this.mediaSource + ", campaign=" + this.campaign + ", campaignId=" + this.campaignId + ", costCentsUsd=" + this.costCentsUsd + ", installTime=" + this.installTime + ", channel=" + this.channel + ", keywords=" + this.keywords + ", absetId=" + this.absetId + ", adId=" + this.adId + ", adType=" + this.adType + ")";
    }

    protected final boolean isOrganic() {
        return this.isOrganic;
    }

    protected final void setOrganic(boolean z) {
        this.isOrganic = z;
    }

    protected final String getMediaSource() {
        return this.mediaSource;
    }

    protected final void setMediaSource(String str) {
        this.mediaSource = str;
    }

    protected final String getCampaign() {
        return this.campaign;
    }

    protected final void setCampaign(String str) {
        this.campaign = str;
    }

    protected final String getCampaignId() {
        return this.campaignId;
    }

    protected final void setCampaignId(String str) {
        this.campaignId = str;
    }

    protected final Integer getCostCentsUsd() {
        return this.costCentsUsd;
    }

    protected final void setCostCentsUsd(Integer num) {
        this.costCentsUsd = num;
    }

    protected final Date getInstallTime() {
        return this.installTime;
    }

    protected final void setInstallTime(Date date) {
        this.installTime = date;
    }

    protected final String getChannel() {
        return this.channel;
    }

    protected final void setChannel(String str) {
        this.channel = str;
    }

    protected final String getKeywords() {
        return this.keywords;
    }

    protected final void setKeywords(String str) {
        this.keywords = str;
    }

    protected final String getAbsetId() {
        return this.absetId;
    }

    protected final void setAbsetId(String str) {
        this.absetId = str;
    }

    protected final String getAdId() {
        return this.adId;
    }

    protected final void setAdId(String str) {
        this.adId = str;
    }

    protected final String getAdType() {
        return this.adType;
    }

    protected final void setAdType(String str) {
        this.adType = str;
    }

    public UpdateUserConversionMessage(boolean z, String str, String str2, String str3, Integer num, Date date, String str4, String str5, String str6, String str7, String str8) {
        this.isOrganic = z;
        this.mediaSource = str;
        this.campaign = str2;
        this.campaignId = str3;
        this.costCentsUsd = num;
        this.installTime = date;
        this.channel = str4;
        this.keywords = str5;
        this.absetId = str6;
        this.adId = str7;
        this.adType = str8;
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
        hashMap.put("is_organic", Integer.valueOf(this.isOrganic ? 1 : 0));
        String str = this.mediaSource;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("media_source", str);
        }
        String str2 = this.campaign;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("campaign", str2);
        }
        String str3 = this.campaignId;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put(FirebaseAnalytics.Param.CAMPAIGN_ID, str3);
        }
        Integer num = this.costCentsUsd;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("cost_cents_usd", num);
        }
        Date date = this.installTime;
        if (date != null) {
            Intrinsics.checkNotNull(date);
            hashMap.put("install_time", Long.valueOf(date.getTime() / 1000));
        }
        String str4 = this.channel;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("channel", str4);
        }
        String str5 = this.keywords;
        if (str5 != null) {
            Intrinsics.checkNotNull(str5);
            hashMap.put(LogEventArguments.ARG_KEYWORDS, str5);
        }
        String str6 = this.absetId;
        if (str6 != null) {
            Intrinsics.checkNotNull(str6);
            hashMap.put("abset_id", str6);
        }
        String str7 = this.adId;
        if (str7 != null) {
            Intrinsics.checkNotNull(str7);
            hashMap.put("ad_id", str7);
        }
        String str8 = this.adType;
        if (str8 != null) {
            Intrinsics.checkNotNull(str8);
            hashMap.put("ad_type", str8);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof UpdateUserConversionMessage)) {
            return false;
        }
        UpdateUserConversionMessage updateUserConversionMessage = (UpdateUserConversionMessage) other;
        return this.isOrganic == updateUserConversionMessage.isOrganic && Intrinsics.areEqual(this.mediaSource, updateUserConversionMessage.mediaSource) && Intrinsics.areEqual(this.campaign, updateUserConversionMessage.campaign) && Intrinsics.areEqual(this.campaignId, updateUserConversionMessage.campaignId) && Intrinsics.areEqual(this.costCentsUsd, updateUserConversionMessage.costCentsUsd) && Intrinsics.areEqual(this.installTime, updateUserConversionMessage.installTime) && Intrinsics.areEqual(this.channel, updateUserConversionMessage.channel) && Intrinsics.areEqual(this.keywords, updateUserConversionMessage.keywords) && Intrinsics.areEqual(this.absetId, updateUserConversionMessage.absetId) && Intrinsics.areEqual(this.adId, updateUserConversionMessage.adId) && Intrinsics.areEqual(this.adType, updateUserConversionMessage.adType);
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
        if (other == null || !(other instanceof UpdateUserConversionMessage)) {
            return false;
        }
        UpdateUserConversionMessage updateUserConversionMessage = (UpdateUserConversionMessage) other;
        return this.isOrganic == updateUserConversionMessage.isOrganic && Intrinsics.areEqual(this.mediaSource, updateUserConversionMessage.mediaSource) && Intrinsics.areEqual(this.campaign, updateUserConversionMessage.campaign) && Intrinsics.areEqual(this.campaignId, updateUserConversionMessage.campaignId) && Intrinsics.areEqual(this.costCentsUsd, updateUserConversionMessage.costCentsUsd) && Intrinsics.areEqual(this.installTime, updateUserConversionMessage.installTime) && Intrinsics.areEqual(this.channel, updateUserConversionMessage.channel) && Intrinsics.areEqual(this.keywords, updateUserConversionMessage.keywords) && Intrinsics.areEqual(this.absetId, updateUserConversionMessage.absetId) && Intrinsics.areEqual(this.adId, updateUserConversionMessage.adId) && Intrinsics.areEqual(this.adType, updateUserConversionMessage.adType);
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + Boolean.hashCode(this.isOrganic)) * 31;
        String str = this.mediaSource;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.campaign;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.campaignId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.costCentsUsd;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Date date = this.installTime;
        int hashCode6 = (hashCode5 + (date != null ? date.hashCode() : 0)) * 31;
        String str4 = this.channel;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.keywords;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.absetId;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.adId;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.adType;
        return hashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    /* compiled from: UpdateUserConversionMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateUserConversionMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/user/update_user_conversion";
        }
    }
}
