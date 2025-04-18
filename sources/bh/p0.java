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
public final class p0 {
    public static final o0 Companion = new o0(null);
    private final String status;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ p0(int i10, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, n0.INSTANCE.getDescriptor());
        }
        this.status = str;
    }

    public static /* synthetic */ p0 copy$default(p0 p0Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = p0Var.status;
        }
        return p0Var.copy(str);
    }

    @JvmStatic
    public static final void write$Self(p0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.status);
    }

    public final String component1() {
        return this.status;
    }

    public final p0 copy(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new p0(status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.areEqual(this.status, ((p0) obj).status);
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return com.applovin.impl.mediation.ads.e.g(new StringBuilder("CCPA(status="), this.status, ')');
    }

    public p0(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }
}
