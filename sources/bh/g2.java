package bh;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class g2 {
    public static final f2 Companion = new f2(null);
    private final boolean enabled;

    public g2() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ g2 copy$default(g2 g2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = g2Var.enabled;
        }
        return g2Var.copy(z10);
    }

    @JvmStatic
    public static final void write$Self(g2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z10 = true;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && !self.enabled) {
            z10 = false;
        }
        if (z10) {
            output.encodeBooleanElement(serialDesc, 0, self.enabled);
        }
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final g2 copy(boolean z10) {
        return new g2(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2) && this.enabled == ((g2) obj).enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        boolean z10 = this.enabled;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public String toString() {
        return a4.j.l(new StringBuilder("LoggingSettings(enabled="), this.enabled, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ g2(int i10, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, e2.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z10;
        }
    }

    public g2(boolean z10) {
        this.enabled = z10;
    }

    public /* synthetic */ g2(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
