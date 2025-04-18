package bh;

import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class c1 {
    public static final b1 Companion = new b1(null);
    private String adSize;
    private final Long adStartTime;
    private final String appId;
    private final Boolean isHeaderBidding;
    private final String placementReferenceId;
    private final List<String> placements;
    private final String user;

    public c1() {
        this((List) null, (Boolean) null, (String) null, (Long) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ c1 copy$default(c1 c1Var, List list, Boolean bool, String str, Long l10, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = c1Var.placements;
        }
        if ((i10 & 2) != 0) {
            bool = c1Var.isHeaderBidding;
        }
        Boolean bool2 = bool;
        if ((i10 & 4) != 0) {
            str = c1Var.adSize;
        }
        String str5 = str;
        if ((i10 & 8) != 0) {
            l10 = c1Var.adStartTime;
        }
        Long l11 = l10;
        if ((i10 & 16) != 0) {
            str2 = c1Var.appId;
        }
        String str6 = str2;
        if ((i10 & 32) != 0) {
            str3 = c1Var.placementReferenceId;
        }
        String str7 = str3;
        if ((i10 & 64) != 0) {
            str4 = c1Var.user;
        }
        return c1Var.copy(list, bool2, str5, l11, str6, str7, str4);
    }

    @SerialName("ad_size")
    public static /* synthetic */ void getAdSize$annotations() {
    }

    @SerialName(MBridgeConstans.APP_ID)
    public static /* synthetic */ void getAppId$annotations() {
    }

    @SerialName("placement_reference_id")
    public static /* synthetic */ void getPlacementReferenceId$annotations() {
    }

    @SerialName("header_bidding")
    public static /* synthetic */ void isHeaderBidding$annotations() {
    }

    @JvmStatic
    public static final void write$Self(c1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z16 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.placements != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(StringSerializer.INSTANCE), self.placements);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isHeaderBidding != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.isHeaderBidding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.adSize != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.adSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.adStartTime != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.adStartTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.appId != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.appId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.placementReferenceId != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.placementReferenceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.user != null) {
            z16 = true;
        }
        if (z16) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.user);
        }
    }

    public final List<String> component1() {
        return this.placements;
    }

    public final Boolean component2() {
        return this.isHeaderBidding;
    }

    public final String component3() {
        return this.adSize;
    }

    public final Long component4() {
        return this.adStartTime;
    }

    public final String component5() {
        return this.appId;
    }

    public final String component6() {
        return this.placementReferenceId;
    }

    public final String component7() {
        return this.user;
    }

    public final c1 copy(List<String> list, Boolean bool, String str, Long l10, String str2, String str3, String str4) {
        return new c1(list, bool, str, l10, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.areEqual(this.placements, c1Var.placements) && Intrinsics.areEqual(this.isHeaderBidding, c1Var.isHeaderBidding) && Intrinsics.areEqual(this.adSize, c1Var.adSize) && Intrinsics.areEqual(this.adStartTime, c1Var.adStartTime) && Intrinsics.areEqual(this.appId, c1Var.appId) && Intrinsics.areEqual(this.placementReferenceId, c1Var.placementReferenceId) && Intrinsics.areEqual(this.user, c1Var.user);
    }

    public final String getAdSize() {
        return this.adSize;
    }

    public final Long getAdStartTime() {
        return this.adStartTime;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getPlacementReferenceId() {
        return this.placementReferenceId;
    }

    public final List<String> getPlacements() {
        return this.placements;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        List<String> list = this.placements;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isHeaderBidding;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.adSize;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.adStartTime;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.appId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placementReferenceId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.user;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final void setAdSize(String str) {
        this.adSize = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestParam(placements=");
        sb2.append(this.placements);
        sb2.append(", isHeaderBidding=");
        sb2.append(this.isHeaderBidding);
        sb2.append(", adSize=");
        sb2.append(this.adSize);
        sb2.append(", adStartTime=");
        sb2.append(this.adStartTime);
        sb2.append(", appId=");
        sb2.append(this.appId);
        sb2.append(", placementReferenceId=");
        sb2.append(this.placementReferenceId);
        sb2.append(", user=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.user, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ c1(int i10, List list, @SerialName("header_bidding") Boolean bool, @SerialName("ad_size") String str, Long l10, @SerialName("app_id") String str2, @SerialName("placement_reference_id") String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, a1.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 2) == 0) {
            this.isHeaderBidding = null;
        } else {
            this.isHeaderBidding = bool;
        }
        if ((i10 & 4) == 0) {
            this.adSize = null;
        } else {
            this.adSize = str;
        }
        if ((i10 & 8) == 0) {
            this.adStartTime = null;
        } else {
            this.adStartTime = l10;
        }
        if ((i10 & 16) == 0) {
            this.appId = null;
        } else {
            this.appId = str2;
        }
        if ((i10 & 32) == 0) {
            this.placementReferenceId = null;
        } else {
            this.placementReferenceId = str3;
        }
        if ((i10 & 64) == 0) {
            this.user = null;
        } else {
            this.user = str4;
        }
    }

    public c1(List<String> list, Boolean bool, String str, Long l10, String str2, String str3, String str4) {
        this.placements = list;
        this.isHeaderBidding = bool;
        this.adSize = str;
        this.adStartTime = l10;
        this.appId = str2;
        this.placementReferenceId = str3;
        this.user = str4;
    }

    public /* synthetic */ c1(List list, Boolean bool, String str, Long l10, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4);
    }
}
