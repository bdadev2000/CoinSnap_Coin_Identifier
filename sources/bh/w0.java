package bh;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class w0 {
    public static final v0 Companion = new v0(null);
    private final String consentMessageVersion;
    private final String consentSource;
    private final String consentStatus;
    private final long consentTimestamp;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ w0(int i10, @SerialName("consent_status") String str, @SerialName("consent_source") String str2, @SerialName("consent_timestamp") long j3, @SerialName("consent_message_version") String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 15, u0.INSTANCE.getDescriptor());
        }
        this.consentStatus = str;
        this.consentSource = str2;
        this.consentTimestamp = j3;
        this.consentMessageVersion = str3;
    }

    public static /* synthetic */ w0 copy$default(w0 w0Var, String str, String str2, long j3, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = w0Var.consentStatus;
        }
        if ((i10 & 2) != 0) {
            str2 = w0Var.consentSource;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            j3 = w0Var.consentTimestamp;
        }
        long j10 = j3;
        if ((i10 & 8) != 0) {
            str3 = w0Var.consentMessageVersion;
        }
        return w0Var.copy(str, str4, j10, str3);
    }

    @SerialName("consent_message_version")
    public static /* synthetic */ void getConsentMessageVersion$annotations() {
    }

    @SerialName("consent_source")
    public static /* synthetic */ void getConsentSource$annotations() {
    }

    @SerialName("consent_status")
    public static /* synthetic */ void getConsentStatus$annotations() {
    }

    @SerialName("consent_timestamp")
    public static /* synthetic */ void getConsentTimestamp$annotations() {
    }

    @JvmStatic
    public static final void write$Self(w0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.consentStatus);
        output.encodeStringElement(serialDesc, 1, self.consentSource);
        output.encodeLongElement(serialDesc, 2, self.consentTimestamp);
        output.encodeStringElement(serialDesc, 3, self.consentMessageVersion);
    }

    public final String component1() {
        return this.consentStatus;
    }

    public final String component2() {
        return this.consentSource;
    }

    public final long component3() {
        return this.consentTimestamp;
    }

    public final String component4() {
        return this.consentMessageVersion;
    }

    public final w0 copy(String consentStatus, String consentSource, long j3, String consentMessageVersion) {
        Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
        Intrinsics.checkNotNullParameter(consentSource, "consentSource");
        Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
        return new w0(consentStatus, consentSource, j3, consentMessageVersion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.areEqual(this.consentStatus, w0Var.consentStatus) && Intrinsics.areEqual(this.consentSource, w0Var.consentSource) && this.consentTimestamp == w0Var.consentTimestamp && Intrinsics.areEqual(this.consentMessageVersion, w0Var.consentMessageVersion);
    }

    public final String getConsentMessageVersion() {
        return this.consentMessageVersion;
    }

    public final String getConsentSource() {
        return this.consentSource;
    }

    public final String getConsentStatus() {
        return this.consentStatus;
    }

    public final long getConsentTimestamp() {
        return this.consentTimestamp;
    }

    public int hashCode() {
        return this.consentMessageVersion.hashCode() + ((Long.hashCode(this.consentTimestamp) + vd.e.c(this.consentSource, this.consentStatus.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GDPR(consentStatus=");
        sb2.append(this.consentStatus);
        sb2.append(", consentSource=");
        sb2.append(this.consentSource);
        sb2.append(", consentTimestamp=");
        sb2.append(this.consentTimestamp);
        sb2.append(", consentMessageVersion=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.consentMessageVersion, ')');
    }

    public w0(String consentStatus, String consentSource, long j3, String consentMessageVersion) {
        Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
        Intrinsics.checkNotNullParameter(consentSource, "consentSource");
        Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
        this.consentStatus = consentStatus;
        this.consentSource = consentSource;
        this.consentTimestamp = j3;
        this.consentMessageVersion = consentMessageVersion;
    }
}
