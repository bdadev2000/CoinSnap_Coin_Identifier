package bh;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class u3 {
    public static final t3 Companion = new t3(null);
    private final i3 device;
    private final z0 ext;
    private final int ordinalView;
    private final r3 request;
    private final f1 user;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ u3(int i10, i3 i3Var, f1 f1Var, z0 z0Var, r3 r3Var, @SerialName("ordinal_view") int i11, SerializationConstructorMarker serializationConstructorMarker) {
        if (17 != (i10 & 17)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 17, s3.INSTANCE.getDescriptor());
        }
        this.device = i3Var;
        if ((i10 & 2) == 0) {
            this.user = null;
        } else {
            this.user = f1Var;
        }
        if ((i10 & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = z0Var;
        }
        if ((i10 & 8) == 0) {
            this.request = null;
        } else {
            this.request = r3Var;
        }
        this.ordinalView = i11;
    }

    public static /* synthetic */ u3 copy$default(u3 u3Var, i3 i3Var, f1 f1Var, z0 z0Var, r3 r3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3Var = u3Var.device;
        }
        if ((i11 & 2) != 0) {
            f1Var = u3Var.user;
        }
        f1 f1Var2 = f1Var;
        if ((i11 & 4) != 0) {
            z0Var = u3Var.ext;
        }
        z0 z0Var2 = z0Var;
        if ((i11 & 8) != 0) {
            r3Var = u3Var.request;
        }
        r3 r3Var2 = r3Var;
        if ((i11 & 16) != 0) {
            i10 = u3Var.ordinalView;
        }
        return u3Var.copy(i3Var, f1Var2, z0Var2, r3Var2, i10);
    }

    @SerialName("ordinal_view")
    public static /* synthetic */ void getOrdinalView$annotations() {
    }

    @JvmStatic
    public static final void write$Self(u3 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z12 = false;
        output.encodeSerializableElement(serialDesc, 0, u2.INSTANCE, self.device);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.user != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 1, d1.INSTANCE, self.user);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.ext != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 2, x0.INSTANCE, self.ext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.request != null) {
            z12 = true;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 3, p3.INSTANCE, self.request);
        }
        output.encodeIntElement(serialDesc, 4, self.ordinalView);
    }

    public final i3 component1() {
        return this.device;
    }

    public final f1 component2() {
        return this.user;
    }

    public final z0 component3() {
        return this.ext;
    }

    public final r3 component4() {
        return this.request;
    }

    public final int component5() {
        return this.ordinalView;
    }

    public final u3 copy(i3 device, f1 f1Var, z0 z0Var, r3 r3Var, int i10) {
        Intrinsics.checkNotNullParameter(device, "device");
        return new u3(device, f1Var, z0Var, r3Var, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return Intrinsics.areEqual(this.device, u3Var.device) && Intrinsics.areEqual(this.user, u3Var.user) && Intrinsics.areEqual(this.ext, u3Var.ext) && Intrinsics.areEqual(this.request, u3Var.request) && this.ordinalView == u3Var.ordinalView;
    }

    public final i3 getDevice() {
        return this.device;
    }

    public final z0 getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final r3 getRequest() {
        return this.request;
    }

    public final f1 getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = this.device.hashCode() * 31;
        f1 f1Var = this.user;
        int hashCode2 = (hashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        z0 z0Var = this.ext;
        int hashCode3 = (hashCode2 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        r3 r3Var = this.request;
        return Integer.hashCode(this.ordinalView) + ((hashCode3 + (r3Var != null ? r3Var.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RtbToken(device=");
        sb2.append(this.device);
        sb2.append(", user=");
        sb2.append(this.user);
        sb2.append(", ext=");
        sb2.append(this.ext);
        sb2.append(", request=");
        sb2.append(this.request);
        sb2.append(", ordinalView=");
        return a4.j.i(sb2, this.ordinalView, ')');
    }

    public u3(i3 device, f1 f1Var, z0 z0Var, r3 r3Var, int i10) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.device = device;
        this.user = f1Var;
        this.ext = z0Var;
        this.request = r3Var;
        this.ordinalView = i10;
    }

    public /* synthetic */ u3(i3 i3Var, f1 f1Var, z0 z0Var, r3 r3Var, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3Var, (i11 & 2) != 0 ? null : f1Var, (i11 & 4) != 0 ? null : z0Var, (i11 & 8) != 0 ? null : r3Var, i10);
    }
}
