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
public final class d2 {
    public static final c2 Companion = new c2(null);
    private final int errorLogLevel;
    private final boolean metricsEnabled;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ d2(int i10, @SerialName("error_log_level") int i11, @SerialName("metrics_is_enabled") boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, b2.INSTANCE.getDescriptor());
        }
        this.errorLogLevel = i11;
        this.metricsEnabled = z10;
    }

    public static /* synthetic */ d2 copy$default(d2 d2Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = d2Var.errorLogLevel;
        }
        if ((i11 & 2) != 0) {
            z10 = d2Var.metricsEnabled;
        }
        return d2Var.copy(i10, z10);
    }

    @SerialName("error_log_level")
    public static /* synthetic */ void getErrorLogLevel$annotations() {
    }

    @SerialName("metrics_is_enabled")
    public static /* synthetic */ void getMetricsEnabled$annotations() {
    }

    @JvmStatic
    public static final void write$Self(d2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.errorLogLevel);
        output.encodeBooleanElement(serialDesc, 1, self.metricsEnabled);
    }

    public final int component1() {
        return this.errorLogLevel;
    }

    public final boolean component2() {
        return this.metricsEnabled;
    }

    public final d2 copy(int i10, boolean z10) {
        return new d2(i10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.errorLogLevel == d2Var.errorLogLevel && this.metricsEnabled == d2Var.metricsEnabled;
    }

    public final int getErrorLogLevel() {
        return this.errorLogLevel;
    }

    public final boolean getMetricsEnabled() {
        return this.metricsEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.errorLogLevel) * 31;
        boolean z10 = this.metricsEnabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LogMetricsSettings(errorLogLevel=");
        sb2.append(this.errorLogLevel);
        sb2.append(", metricsEnabled=");
        return a4.j.l(sb2, this.metricsEnabled, ')');
    }

    public d2(int i10, boolean z10) {
        this.errorLogLevel = i10;
        this.metricsEnabled = z10;
    }
}
