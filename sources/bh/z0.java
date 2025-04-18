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
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class z0 {
    public static final y0 Companion = new y0(null);
    private final String configExtension;
    private String signals;

    public z0() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ z0 copy$default(z0 z0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = z0Var.configExtension;
        }
        if ((i10 & 2) != 0) {
            str2 = z0Var.signals;
        }
        return z0Var.copy(str, str2);
    }

    @SerialName("config_extension")
    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    @SerialName("signals")
    public static /* synthetic */ void getSignals$annotations() {
    }

    @JvmStatic
    public static final void write$Self(z0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z11 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.configExtension != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.configExtension);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.signals != null) {
            z11 = true;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.signals);
        }
    }

    public final String component1() {
        return this.configExtension;
    }

    public final String component2() {
        return this.signals;
    }

    public final z0 copy(String str, String str2) {
        return new z0(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.areEqual(this.configExtension, z0Var.configExtension) && Intrinsics.areEqual(this.signals, z0Var.signals);
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        String str = this.configExtension;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.signals;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setSignals(String str) {
        this.signals = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestExt(configExtension=");
        sb2.append(this.configExtension);
        sb2.append(", signals=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.signals, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ z0(int i10, @SerialName("config_extension") String str, @SerialName("signals") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, x0.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i10 & 2) == 0) {
            this.signals = null;
        } else {
            this.signals = str2;
        }
    }

    public z0(String str, String str2) {
        this.configExtension = str;
        this.signals = str2;
    }

    public /* synthetic */ z0(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
