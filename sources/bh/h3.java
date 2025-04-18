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
public final class h3 {
    public static final g3 Companion = new g3(null);
    private final x2 amazon;

    /* renamed from: android, reason: collision with root package name */
    private final x2 f2435android;

    public h3() {
        this((x2) null, (x2) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ h3 copy$default(h3 h3Var, x2 x2Var, x2 x2Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x2Var = h3Var.f2435android;
        }
        if ((i10 & 2) != 0) {
            x2Var2 = h3Var.amazon;
        }
        return h3Var.copy(x2Var, x2Var2);
    }

    @JvmStatic
    public static final void write$Self(h3 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z11 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f2435android != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, v2.INSTANCE, self.f2435android);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.amazon != null) {
            z11 = true;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, v2.INSTANCE, self.amazon);
        }
    }

    public final x2 component1() {
        return this.f2435android;
    }

    public final x2 component2() {
        return this.amazon;
    }

    public final h3 copy(x2 x2Var, x2 x2Var2) {
        return new h3(x2Var, x2Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return Intrinsics.areEqual(this.f2435android, h3Var.f2435android) && Intrinsics.areEqual(this.amazon, h3Var.amazon);
    }

    public final x2 getAmazon() {
        return this.amazon;
    }

    public final x2 getAndroid() {
        return this.f2435android;
    }

    public int hashCode() {
        x2 x2Var = this.f2435android;
        int hashCode = (x2Var == null ? 0 : x2Var.hashCode()) * 31;
        x2 x2Var2 = this.amazon;
        return hashCode + (x2Var2 != null ? x2Var2.hashCode() : 0);
    }

    public String toString() {
        return "VungleExt(android=" + this.f2435android + ", amazon=" + this.amazon + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ h3(int i10, x2 x2Var, x2 x2Var2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, f3.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f2435android = null;
        } else {
            this.f2435android = x2Var;
        }
        if ((i10 & 2) == 0) {
            this.amazon = null;
        } else {
            this.amazon = x2Var2;
        }
    }

    public h3(x2 x2Var, x2 x2Var2) {
        this.f2435android = x2Var;
        this.amazon = x2Var2;
    }

    public /* synthetic */ h3(x2 x2Var, x2 x2Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : x2Var, (i10 & 2) != 0 ? null : x2Var2);
    }
}
