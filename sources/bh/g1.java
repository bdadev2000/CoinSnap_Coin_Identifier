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
public final class g1 {
    public static final t0 Companion = new t0(null);
    private final d0 app;
    private final i3 device;
    private z0 ext;
    private c1 request;
    private final f1 user;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ g1(int i10, i3 i3Var, d0 d0Var, f1 f1Var, z0 z0Var, c1 c1Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, m0.INSTANCE.getDescriptor());
        }
        this.device = i3Var;
        if ((i10 & 2) == 0) {
            this.app = null;
        } else {
            this.app = d0Var;
        }
        if ((i10 & 4) == 0) {
            this.user = null;
        } else {
            this.user = f1Var;
        }
        if ((i10 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = z0Var;
        }
        if ((i10 & 16) == 0) {
            this.request = null;
        } else {
            this.request = c1Var;
        }
    }

    public static /* synthetic */ g1 copy$default(g1 g1Var, i3 i3Var, d0 d0Var, f1 f1Var, z0 z0Var, c1 c1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i3Var = g1Var.device;
        }
        if ((i10 & 2) != 0) {
            d0Var = g1Var.app;
        }
        d0 d0Var2 = d0Var;
        if ((i10 & 4) != 0) {
            f1Var = g1Var.user;
        }
        f1 f1Var2 = f1Var;
        if ((i10 & 8) != 0) {
            z0Var = g1Var.ext;
        }
        z0 z0Var2 = z0Var;
        if ((i10 & 16) != 0) {
            c1Var = g1Var.request;
        }
        return g1Var.copy(i3Var, d0Var2, f1Var2, z0Var2, c1Var);
    }

    @JvmStatic
    public static final void write$Self(g1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z13 = false;
        output.encodeSerializableElement(serialDesc, 0, u2.INSTANCE, self.device);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.app != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 1, b0.INSTANCE, self.app);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.user != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 2, d1.INSTANCE, self.user);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.ext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 3, x0.INSTANCE, self.ext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.request != null) {
            z13 = true;
        }
        if (z13) {
            output.encodeNullableSerializableElement(serialDesc, 4, a1.INSTANCE, self.request);
        }
    }

    public final i3 component1() {
        return this.device;
    }

    public final d0 component2() {
        return this.app;
    }

    public final f1 component3() {
        return this.user;
    }

    public final z0 component4() {
        return this.ext;
    }

    public final c1 component5() {
        return this.request;
    }

    public final g1 copy(i3 device, d0 d0Var, f1 f1Var, z0 z0Var, c1 c1Var) {
        Intrinsics.checkNotNullParameter(device, "device");
        return new g1(device, d0Var, f1Var, z0Var, c1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.areEqual(this.device, g1Var.device) && Intrinsics.areEqual(this.app, g1Var.app) && Intrinsics.areEqual(this.user, g1Var.user) && Intrinsics.areEqual(this.ext, g1Var.ext) && Intrinsics.areEqual(this.request, g1Var.request);
    }

    public final d0 getApp() {
        return this.app;
    }

    public final i3 getDevice() {
        return this.device;
    }

    public final z0 getExt() {
        return this.ext;
    }

    public final c1 getRequest() {
        return this.request;
    }

    public final f1 getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = this.device.hashCode() * 31;
        d0 d0Var = this.app;
        int hashCode2 = (hashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        f1 f1Var = this.user;
        int hashCode3 = (hashCode2 + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        z0 z0Var = this.ext;
        int hashCode4 = (hashCode3 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        c1 c1Var = this.request;
        return hashCode4 + (c1Var != null ? c1Var.hashCode() : 0);
    }

    public final void setExt(z0 z0Var) {
        this.ext = z0Var;
    }

    public final void setRequest(c1 c1Var) {
        this.request = c1Var;
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    public g1(i3 device, d0 d0Var, f1 f1Var, z0 z0Var, c1 c1Var) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.device = device;
        this.app = d0Var;
        this.user = f1Var;
        this.ext = z0Var;
        this.request = c1Var;
    }

    public /* synthetic */ g1(i3 i3Var, d0 d0Var, f1 f1Var, z0 z0Var, c1 c1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3Var, (i10 & 2) != 0 ? null : d0Var, (i10 & 4) != 0 ? null : f1Var, (i10 & 8) != 0 ? null : z0Var, (i10 & 16) != 0 ? null : c1Var);
    }
}
