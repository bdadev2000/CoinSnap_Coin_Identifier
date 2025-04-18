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
public final class m2 {
    public static final l2 Companion = new l2(null);
    private final boolean enabled;
    private final int limit;
    private final int timeout;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ m2(int i10, @SerialName("enabled") boolean z10, @SerialName("limit") int i11, @SerialName("timeout") int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, k2.INSTANCE.getDescriptor());
        }
        this.enabled = z10;
        this.limit = i11;
        this.timeout = i12;
    }

    public static /* synthetic */ m2 copy$default(m2 m2Var, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = m2Var.enabled;
        }
        if ((i12 & 2) != 0) {
            i10 = m2Var.limit;
        }
        if ((i12 & 4) != 0) {
            i11 = m2Var.timeout;
        }
        return m2Var.copy(z10, i10, i11);
    }

    @SerialName("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @SerialName("limit")
    public static /* synthetic */ void getLimit$annotations() {
    }

    @SerialName("timeout")
    public static /* synthetic */ void getTimeout$annotations() {
    }

    @JvmStatic
    public static final void write$Self(m2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeBooleanElement(serialDesc, 0, self.enabled);
        output.encodeIntElement(serialDesc, 1, self.limit);
        output.encodeIntElement(serialDesc, 2, self.timeout);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.limit;
    }

    public final int component3() {
        return this.timeout;
    }

    public final m2 copy(boolean z10, int i10, int i11) {
        return new m2(z10, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return this.enabled == m2Var.enabled && this.limit == m2Var.limit && this.timeout == m2Var.timeout;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getTimeout() {
        return this.timeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.enabled;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return Integer.hashCode(this.timeout) + kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.limit, r02 * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Session(enabled=");
        sb2.append(this.enabled);
        sb2.append(", limit=");
        sb2.append(this.limit);
        sb2.append(", timeout=");
        return a4.j.i(sb2, this.timeout, ')');
    }

    public m2(boolean z10, int i10, int i11) {
        this.enabled = z10;
        this.limit = i10;
        this.timeout = i11;
    }
}
