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
public final class s2 {
    public static final r2 Companion = new r2(null);
    private final boolean om;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ s2(int i10, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, q2.INSTANCE.getDescriptor());
        }
        this.om = z10;
    }

    public static /* synthetic */ s2 copy$default(s2 s2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = s2Var.om;
        }
        return s2Var.copy(z10);
    }

    @JvmStatic
    public static final void write$Self(s2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeBooleanElement(serialDesc, 0, self.om);
    }

    public final boolean component1() {
        return this.om;
    }

    public final s2 copy(boolean z10) {
        return new s2(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2) && this.om == ((s2) obj).om;
    }

    public final boolean getOm() {
        return this.om;
    }

    public int hashCode() {
        boolean z10 = this.om;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public String toString() {
        return a4.j.l(new StringBuilder("ViewabilitySettings(om="), this.om, ')');
    }

    public s2(boolean z10) {
        this.om = z10;
    }
}
