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
public final class f1 {
    public static final e1 Companion = new e1(null);
    private p0 ccpa;
    private s0 coppa;
    private w0 gdpr;

    public f1() {
        this((w0) null, (p0) null, (s0) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ f1 copy$default(f1 f1Var, w0 w0Var, p0 p0Var, s0 s0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w0Var = f1Var.gdpr;
        }
        if ((i10 & 2) != 0) {
            p0Var = f1Var.ccpa;
        }
        if ((i10 & 4) != 0) {
            s0Var = f1Var.coppa;
        }
        return f1Var.copy(w0Var, p0Var, s0Var);
    }

    @JvmStatic
    public static final void write$Self(f1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z12 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.gdpr != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, u0.INSTANCE, self.gdpr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ccpa != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, n0.INSTANCE, self.ccpa);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.coppa != null) {
            z12 = true;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 2, q0.INSTANCE, self.coppa);
        }
    }

    public final w0 component1() {
        return this.gdpr;
    }

    public final p0 component2() {
        return this.ccpa;
    }

    public final s0 component3() {
        return this.coppa;
    }

    public final f1 copy(w0 w0Var, p0 p0Var, s0 s0Var) {
        return new f1(w0Var, p0Var, s0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.areEqual(this.gdpr, f1Var.gdpr) && Intrinsics.areEqual(this.ccpa, f1Var.ccpa) && Intrinsics.areEqual(this.coppa, f1Var.coppa);
    }

    public final p0 getCcpa() {
        return this.ccpa;
    }

    public final s0 getCoppa() {
        return this.coppa;
    }

    public final w0 getGdpr() {
        return this.gdpr;
    }

    public int hashCode() {
        w0 w0Var = this.gdpr;
        int hashCode = (w0Var == null ? 0 : w0Var.hashCode()) * 31;
        p0 p0Var = this.ccpa;
        int hashCode2 = (hashCode + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        s0 s0Var = this.coppa;
        return hashCode2 + (s0Var != null ? s0Var.hashCode() : 0);
    }

    public final void setCcpa(p0 p0Var) {
        this.ccpa = p0Var;
    }

    public final void setCoppa(s0 s0Var) {
        this.coppa = s0Var;
    }

    public final void setGdpr(w0 w0Var) {
        this.gdpr = w0Var;
    }

    public String toString() {
        return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ f1(int i10, w0 w0Var, p0 p0Var, s0 s0Var, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, d1.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = w0Var;
        }
        if ((i10 & 2) == 0) {
            this.ccpa = null;
        } else {
            this.ccpa = p0Var;
        }
        if ((i10 & 4) == 0) {
            this.coppa = null;
        } else {
            this.coppa = s0Var;
        }
    }

    public f1(w0 w0Var, p0 p0Var, s0 s0Var) {
        this.gdpr = w0Var;
        this.ccpa = p0Var;
        this.coppa = s0Var;
    }

    public /* synthetic */ f1(w0 w0Var, p0 p0Var, s0 s0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : w0Var, (i10 & 2) != 0 ? null : p0Var, (i10 & 4) != 0 ? null : s0Var);
    }
}
