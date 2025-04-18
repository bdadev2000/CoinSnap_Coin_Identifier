package bh;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class s0 {
    public static final r0 Companion = new r0(null);
    private final Boolean isCoppa;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ s0(int i10, @SerialName("is_coppa") Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, q0.INSTANCE.getDescriptor());
        }
        this.isCoppa = bool;
    }

    public static /* synthetic */ s0 copy$default(s0 s0Var, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = s0Var.isCoppa;
        }
        return s0Var.copy(bool);
    }

    @SerialName("is_coppa")
    public static /* synthetic */ void isCoppa$annotations() {
    }

    @JvmStatic
    public static final void write$Self(s0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isCoppa);
    }

    public final Boolean component1() {
        return this.isCoppa;
    }

    public final s0 copy(Boolean bool) {
        return new s0(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.areEqual(this.isCoppa, ((s0) obj).isCoppa);
    }

    public int hashCode() {
        Boolean bool = this.isCoppa;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isCoppa() {
        return this.isCoppa;
    }

    public String toString() {
        return "COPPA(isCoppa=" + this.isCoppa + ')';
    }

    public s0(Boolean bool) {
        this.isCoppa = bool;
    }
}
