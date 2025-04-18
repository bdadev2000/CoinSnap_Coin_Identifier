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
public final class e3 {
    public static final d3 Companion = new d3(null);
    private final h3 vungle;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ e3(int i10, h3 h3Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, c3.INSTANCE.getDescriptor());
        }
        this.vungle = h3Var;
    }

    public static /* synthetic */ e3 copy$default(e3 e3Var, h3 h3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h3Var = e3Var.vungle;
        }
        return e3Var.copy(h3Var);
    }

    @JvmStatic
    public static final void write$Self(e3 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, f3.INSTANCE, self.vungle);
    }

    public final h3 component1() {
        return this.vungle;
    }

    public final e3 copy(h3 vungle) {
        Intrinsics.checkNotNullParameter(vungle, "vungle");
        return new e3(vungle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3) && Intrinsics.areEqual(this.vungle, ((e3) obj).vungle);
    }

    public final h3 getVungle() {
        return this.vungle;
    }

    public int hashCode() {
        return this.vungle.hashCode();
    }

    public String toString() {
        return "DeviceExt(vungle=" + this.vungle + ')';
    }

    public e3(h3 vungle) {
        Intrinsics.checkNotNullParameter(vungle, "vungle");
        this.vungle = vungle;
    }
}
