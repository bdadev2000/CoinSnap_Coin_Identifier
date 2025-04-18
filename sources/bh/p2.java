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
public final class p2 {
    public static final o2 Companion = new o2(null);
    private final boolean heartbeatEnabled;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ p2(int i10, @SerialName("heartbeat_check_enabled") boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, n2.INSTANCE.getDescriptor());
        }
        this.heartbeatEnabled = z10;
    }

    public static /* synthetic */ p2 copy$default(p2 p2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = p2Var.heartbeatEnabled;
        }
        return p2Var.copy(z10);
    }

    @SerialName("heartbeat_check_enabled")
    public static /* synthetic */ void getHeartbeatEnabled$annotations() {
    }

    @JvmStatic
    public static final void write$Self(p2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeBooleanElement(serialDesc, 0, self.heartbeatEnabled);
    }

    public final boolean component1() {
        return this.heartbeatEnabled;
    }

    public final p2 copy(boolean z10) {
        return new p2(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && this.heartbeatEnabled == ((p2) obj).heartbeatEnabled;
    }

    public final boolean getHeartbeatEnabled() {
        return this.heartbeatEnabled;
    }

    public int hashCode() {
        boolean z10 = this.heartbeatEnabled;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public String toString() {
        return a4.j.l(new StringBuilder("Template(heartbeatEnabled="), this.heartbeatEnabled, ')');
    }

    public p2(boolean z10) {
        this.heartbeatEnabled = z10;
    }
}
