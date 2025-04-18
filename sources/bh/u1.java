package bh;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class u1 {
    public static final t1 Companion = new t1(null);
    private final String adsEndpoint;
    private final String errorLogsEndpoint;
    private final String metricsEndpoint;
    private final String mraidEndpoint;
    private final String riEndpoint;

    public u1() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ u1 copy$default(u1 u1Var, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = u1Var.adsEndpoint;
        }
        if ((i10 & 2) != 0) {
            str2 = u1Var.riEndpoint;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = u1Var.mraidEndpoint;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = u1Var.metricsEndpoint;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = u1Var.errorLogsEndpoint;
        }
        return u1Var.copy(str, str6, str7, str8, str5);
    }

    @SerialName(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)
    public static /* synthetic */ void getAdsEndpoint$annotations() {
    }

    @SerialName("error_logs")
    public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
    }

    @SerialName("metrics")
    public static /* synthetic */ void getMetricsEndpoint$annotations() {
    }

    @SerialName("mraid_js")
    public static /* synthetic */ void getMraidEndpoint$annotations() {
    }

    @SerialName("ri")
    public static /* synthetic */ void getRiEndpoint$annotations() {
    }

    @JvmStatic
    public static final void write$Self(u1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z14 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.adsEndpoint != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.adsEndpoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.riEndpoint != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.riEndpoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.mraidEndpoint != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.mraidEndpoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.metricsEndpoint != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.metricsEndpoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.errorLogsEndpoint != null) {
            z14 = true;
        }
        if (z14) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.errorLogsEndpoint);
        }
    }

    public final String component1() {
        return this.adsEndpoint;
    }

    public final String component2() {
        return this.riEndpoint;
    }

    public final String component3() {
        return this.mraidEndpoint;
    }

    public final String component4() {
        return this.metricsEndpoint;
    }

    public final String component5() {
        return this.errorLogsEndpoint;
    }

    public final u1 copy(String str, String str2, String str3, String str4, String str5) {
        return new u1(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return Intrinsics.areEqual(this.adsEndpoint, u1Var.adsEndpoint) && Intrinsics.areEqual(this.riEndpoint, u1Var.riEndpoint) && Intrinsics.areEqual(this.mraidEndpoint, u1Var.mraidEndpoint) && Intrinsics.areEqual(this.metricsEndpoint, u1Var.metricsEndpoint) && Intrinsics.areEqual(this.errorLogsEndpoint, u1Var.errorLogsEndpoint);
    }

    public final String getAdsEndpoint() {
        return this.adsEndpoint;
    }

    public final String getErrorLogsEndpoint() {
        return this.errorLogsEndpoint;
    }

    public final String getMetricsEndpoint() {
        return this.metricsEndpoint;
    }

    public final String getMraidEndpoint() {
        return this.mraidEndpoint;
    }

    public final String getRiEndpoint() {
        return this.riEndpoint;
    }

    public int hashCode() {
        String str = this.adsEndpoint;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.riEndpoint;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mraidEndpoint;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.metricsEndpoint;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorLogsEndpoint;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Endpoints(adsEndpoint=");
        sb2.append(this.adsEndpoint);
        sb2.append(", riEndpoint=");
        sb2.append(this.riEndpoint);
        sb2.append(", mraidEndpoint=");
        sb2.append(this.mraidEndpoint);
        sb2.append(", metricsEndpoint=");
        sb2.append(this.metricsEndpoint);
        sb2.append(", errorLogsEndpoint=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.errorLogsEndpoint, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ u1(int i10, @SerialName("ads") String str, @SerialName("ri") String str2, @SerialName("mraid_js") String str3, @SerialName("metrics") String str4, @SerialName("error_logs") String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, s1.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.adsEndpoint = null;
        } else {
            this.adsEndpoint = str;
        }
        if ((i10 & 2) == 0) {
            this.riEndpoint = null;
        } else {
            this.riEndpoint = str2;
        }
        if ((i10 & 4) == 0) {
            this.mraidEndpoint = null;
        } else {
            this.mraidEndpoint = str3;
        }
        if ((i10 & 8) == 0) {
            this.metricsEndpoint = null;
        } else {
            this.metricsEndpoint = str4;
        }
        if ((i10 & 16) == 0) {
            this.errorLogsEndpoint = null;
        } else {
            this.errorLogsEndpoint = str5;
        }
    }

    public u1(String str, String str2, String str3, String str4, String str5) {
        this.adsEndpoint = str;
        this.riEndpoint = str2;
        this.mraidEndpoint = str3;
        this.metricsEndpoint = str4;
        this.errorLogsEndpoint = str5;
    }

    public /* synthetic */ u1(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
