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
public final class u {
    public static final t Companion = new t(null);
    private final x om;

    public u() {
        this((x) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ u copy$default(u uVar, x xVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            xVar = uVar.om;
        }
        return uVar.copy(xVar);
    }

    @JvmStatic
    public static final void write$Self(u self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z10 = true;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.om == null) {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, v.INSTANCE, self.om);
        }
    }

    public final x component1() {
        return this.om;
    }

    public final u copy(x xVar) {
        return new u(xVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.areEqual(this.om, ((u) obj).om);
    }

    public final x getOm() {
        return this.om;
    }

    public int hashCode() {
        x xVar = this.om;
        if (xVar == null) {
            return 0;
        }
        return xVar.hashCode();
    }

    public String toString() {
        return "Viewability(om=" + this.om + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ u(int i10, x xVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, s.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.om = null;
        } else {
            this.om = xVar;
        }
    }

    public u(x xVar) {
        this.om = xVar;
    }

    public /* synthetic */ u(x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : xVar);
    }
}
