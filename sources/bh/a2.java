package bh;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class a2 {
    public static final z1 Companion = new z1(null);
    private final boolean enabled;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ a2(int i10, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, y1.INSTANCE.getDescriptor());
        }
        this.enabled = z10;
    }

    public static /* synthetic */ a2 copy$default(a2 a2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = a2Var.enabled;
        }
        return a2Var.copy(z10);
    }

    @JvmStatic
    public static final void write$Self(a2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeBooleanElement(serialDesc, 0, self.enabled);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final a2 copy(boolean z10) {
        return new a2(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && this.enabled == ((a2) obj).enabled;
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
        return a4.j.l(new StringBuilder("LoadOptimizationSettings(enabled="), this.enabled, ')');
    }

    public a2(boolean z10) {
        this.enabled = z10;
    }
}
