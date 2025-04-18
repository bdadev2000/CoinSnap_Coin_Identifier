package bh;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Transient;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class o3 {
    public static final n3 Companion = new n3(null);
    private final int adRefreshDuration;
    private final String adSize;
    private final boolean headerBidding;
    private final String identifier;
    private final Boolean incentivized;
    private final boolean isIncentivized;
    private final String placementAdType;
    private final String referenceId;
    private final List<String> supportedAdFormats;
    private final List<String> supportedTemplateTypes;
    private Long wakeupTime;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ o3(int i10, @SerialName("id") String str, @SerialName("reference_id") String str2, @SerialName("is_incentivized") Boolean bool, @SerialName("supported_template_types") List list, @SerialName("supported_ad_formats") List list2, @SerialName("ad_refresh_duration") int i11, @SerialName("header_bidding") boolean z10, @SerialName("ad_size") String str3, boolean z11, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        String str5;
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, m3.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.referenceId = str2;
        if ((i10 & 4) == 0) {
            this.incentivized = Boolean.FALSE;
        } else {
            this.incentivized = bool;
        }
        if ((i10 & 8) == 0) {
            this.supportedTemplateTypes = CollectionsKt.emptyList();
        } else {
            this.supportedTemplateTypes = list;
        }
        if ((i10 & 16) == 0) {
            this.supportedAdFormats = CollectionsKt.emptyList();
        } else {
            this.supportedAdFormats = list2;
        }
        if ((i10 & 32) == 0) {
            this.adRefreshDuration = Integer.MIN_VALUE;
        } else {
            this.adRefreshDuration = i11;
        }
        if ((i10 & 64) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z10;
        }
        if ((i10 & 128) == 0) {
            this.adSize = null;
        } else {
            this.adSize = str3;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            Boolean bool2 = this.incentivized;
            this.isIncentivized = bool2 != null ? bool2.booleanValue() : false;
        } else {
            this.isIncentivized = z11;
        }
        this.wakeupTime = null;
        if ((i10 & 512) != 0) {
            this.placementAdType = str4;
            return;
        }
        List<String> list3 = this.supportedTemplateTypes;
        if (list3.contains("banner")) {
            str5 = "TYPE_BANNER";
        } else if (list3.contains("mrec")) {
            str5 = "TYPE_MREC";
        } else {
            str5 = list3.contains("native") ? "TYPE_NATIVE" : "TYPE_DEFAULT";
        }
        this.placementAdType = str5;
    }

    @SerialName("ad_refresh_duration")
    public static /* synthetic */ void getAdRefreshDuration$annotations() {
    }

    @SerialName("ad_size")
    public static /* synthetic */ void getAdSize$annotations() {
    }

    @SerialName("header_bidding")
    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getIdentifier$annotations() {
    }

    @SerialName("is_incentivized")
    public static /* synthetic */ void getIncentivized$annotations() {
    }

    @SerialName("reference_id")
    public static /* synthetic */ void getReferenceId$annotations() {
    }

    @SerialName("supported_ad_formats")
    public static /* synthetic */ void getSupportedAdFormats$annotations() {
    }

    @SerialName("supported_template_types")
    public static /* synthetic */ void getSupportedTemplateTypes$annotations() {
    }

    @Transient
    public static /* synthetic */ void getWakeupTime$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r4) == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(bh.o3 r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.o3.write$Self(bh.o3, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.referenceId;
    }

    public final Boolean component3() {
        return this.incentivized;
    }

    public final List<String> component4() {
        return this.supportedTemplateTypes;
    }

    public final List<String> component5() {
        return this.supportedAdFormats;
    }

    public final int component6() {
        return this.adRefreshDuration;
    }

    public final boolean component7() {
        return this.headerBidding;
    }

    public final String component8() {
        return this.adSize;
    }

    public final o3 copy(String identifier, String referenceId, Boolean bool, List<String> supportedTemplateTypes, List<String> supportedAdFormats, int i10, boolean z10, String str) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(supportedTemplateTypes, "supportedTemplateTypes");
        Intrinsics.checkNotNullParameter(supportedAdFormats, "supportedAdFormats");
        return new o3(identifier, referenceId, bool, supportedTemplateTypes, supportedAdFormats, i10, z10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.areEqual(this.identifier, o3Var.identifier) && Intrinsics.areEqual(this.referenceId, o3Var.referenceId) && Intrinsics.areEqual(this.incentivized, o3Var.incentivized) && Intrinsics.areEqual(this.supportedTemplateTypes, o3Var.supportedTemplateTypes) && Intrinsics.areEqual(this.supportedAdFormats, o3Var.supportedAdFormats) && this.adRefreshDuration == o3Var.adRefreshDuration && this.headerBidding == o3Var.headerBidding && Intrinsics.areEqual(this.adSize, o3Var.adSize);
    }

    public final int getAdRefreshDuration() {
        return this.adRefreshDuration;
    }

    public final String getAdSize() {
        return this.adSize;
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Boolean getIncentivized() {
        return this.incentivized;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final List<String> getSupportedAdFormats() {
        return this.supportedAdFormats;
    }

    public final List<String> getSupportedTemplateTypes() {
        return this.supportedTemplateTypes;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int c10 = vd.e.c(this.referenceId, this.identifier.hashCode() * 31, 31);
        Boolean bool = this.incentivized;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int e2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.adRefreshDuration, vd.e.d(this.supportedAdFormats, vd.e.d(this.supportedTemplateTypes, (c10 + hashCode) * 31, 31), 31), 31);
        boolean z10 = this.headerBidding;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (e2 + i11) * 31;
        String str = this.adSize;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i12 + i10;
    }

    public final boolean isBanner() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_BANNER") || isMREC();
    }

    public final boolean isBannerNonMREC() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_BANNER");
    }

    public final boolean isDefault() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_DEFAULT");
    }

    public final boolean isIncentivized() {
        return this.isIncentivized;
    }

    public final boolean isInterstitial() {
        return isDefault() && !this.isIncentivized;
    }

    public final boolean isMREC() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_MREC");
    }

    public final boolean isNative() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_NATIVE");
    }

    public final boolean isRewardedVideo() {
        return isDefault() && this.isIncentivized;
    }

    public final void setWakeupTime(Long l10) {
        this.wakeupTime = l10;
    }

    public final void snooze(long j3) {
        this.wakeupTime = Long.valueOf((j3 * 1000) + System.currentTimeMillis());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Placement(identifier=");
        sb2.append(this.identifier);
        sb2.append(", referenceId=");
        sb2.append(this.referenceId);
        sb2.append(", incentivized=");
        sb2.append(this.incentivized);
        sb2.append(", supportedTemplateTypes=");
        sb2.append(this.supportedTemplateTypes);
        sb2.append(", supportedAdFormats=");
        sb2.append(this.supportedAdFormats);
        sb2.append(", adRefreshDuration=");
        sb2.append(this.adRefreshDuration);
        sb2.append(", headerBidding=");
        sb2.append(this.headerBidding);
        sb2.append(", adSize=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.adSize, ')');
    }

    public o3(String identifier, String referenceId, Boolean bool, List<String> supportedTemplateTypes, List<String> supportedAdFormats, int i10, boolean z10, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(supportedTemplateTypes, "supportedTemplateTypes");
        Intrinsics.checkNotNullParameter(supportedAdFormats, "supportedAdFormats");
        this.identifier = identifier;
        this.referenceId = referenceId;
        this.incentivized = bool;
        this.supportedTemplateTypes = supportedTemplateTypes;
        this.supportedAdFormats = supportedAdFormats;
        this.adRefreshDuration = i10;
        this.headerBidding = z10;
        this.adSize = str;
        this.isIncentivized = bool != null ? bool.booleanValue() : false;
        if (supportedTemplateTypes.contains("banner")) {
            str2 = "TYPE_BANNER";
        } else if (supportedTemplateTypes.contains("mrec")) {
            str2 = "TYPE_MREC";
        } else {
            str2 = supportedTemplateTypes.contains("native") ? "TYPE_NATIVE" : "TYPE_DEFAULT";
        }
        this.placementAdType = str2;
    }

    public /* synthetic */ o3(String str, String str2, Boolean bool, List list, List list2, int i10, boolean z10, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? CollectionsKt.emptyList() : list, (i11 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 32) != 0 ? Integer.MIN_VALUE : i10, (i11 & 64) != 0 ? false : z10, (i11 & 128) != 0 ? null : str3);
    }
}
