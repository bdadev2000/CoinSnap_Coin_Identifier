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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class x {
    public static final w Companion = new w(null);
    private final String extraVast;
    private final Boolean isEnabled;

    public x() {
        this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ x copy$default(x xVar, Boolean bool, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = xVar.isEnabled;
        }
        if ((i10 & 2) != 0) {
            str = xVar.extraVast;
        }
        return xVar.copy(bool, str);
    }

    @SerialName("extra_vast")
    public static /* synthetic */ void getExtraVast$annotations() {
    }

    @SerialName("is_enabled")
    public static /* synthetic */ void isEnabled$annotations() {
    }

    @JvmStatic
    public static final void write$Self(x self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z11 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isEnabled != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.extraVast != null) {
            z11 = true;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.extraVast);
        }
    }

    public final Boolean component1() {
        return this.isEnabled;
    }

    public final String component2() {
        return this.extraVast;
    }

    public final x copy(Boolean bool, String str) {
        return new x(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.isEnabled, xVar.isEnabled) && Intrinsics.areEqual(this.extraVast, xVar.extraVast);
    }

    public final String getExtraVast() {
        return this.extraVast;
    }

    public int hashCode() {
        Boolean bool = this.isEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.extraVast;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ViewabilityInfo(isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", extraVast=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.extraVast, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ x(int i10, @SerialName("is_enabled") Boolean bool, @SerialName("extra_vast") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, v.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.isEnabled = null;
        } else {
            this.isEnabled = bool;
        }
        if ((i10 & 2) == 0) {
            this.extraVast = null;
        } else {
            this.extraVast = str;
        }
    }

    public x(Boolean bool, String str) {
        this.isEnabled = bool;
        this.extraVast = str;
    }

    public /* synthetic */ x(Boolean bool, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str);
    }
}
