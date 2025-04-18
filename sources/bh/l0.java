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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class l0 {
    public static final k0 Companion = new k0(null);
    private final Integer diskPercentage;
    private final Long diskSize;
    private final Boolean enabled;

    public l0() {
        this((Boolean) null, (Long) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ l0 copy$default(l0 l0Var, Boolean bool, Long l10, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = l0Var.enabled;
        }
        if ((i10 & 2) != 0) {
            l10 = l0Var.diskSize;
        }
        if ((i10 & 4) != 0) {
            num = l0Var.diskPercentage;
        }
        return l0Var.copy(bool, l10, num);
    }

    @SerialName("disk_percentage")
    public static /* synthetic */ void getDiskPercentage$annotations() {
    }

    @SerialName("disk_size")
    public static /* synthetic */ void getDiskSize$annotations() {
    }

    @SerialName("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @JvmStatic
    public static final void write$Self(l0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        Long l10;
        boolean z11;
        Integer num;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z12 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.enabled, Boolean.FALSE)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.enabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || (l10 = self.diskSize) == null || l10.longValue() != 1000) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.diskSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || (num = self.diskPercentage) == null || num.intValue() != 3) {
            z12 = true;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.diskPercentage);
        }
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final Long component2() {
        return this.diskSize;
    }

    public final Integer component3() {
        return this.diskPercentage;
    }

    public final l0 copy(Boolean bool, Long l10, Integer num) {
        return new l0(bool, l10, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.areEqual(this.enabled, l0Var.enabled) && Intrinsics.areEqual(this.diskSize, l0Var.diskSize) && Intrinsics.areEqual(this.diskPercentage, l0Var.diskPercentage);
    }

    public final Integer getDiskPercentage() {
        return this.diskPercentage;
    }

    public final Long getDiskSize() {
        return this.diskSize;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l10 = this.diskSize;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num = this.diskPercentage;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ l0(int i10, @SerialName("enabled") Boolean bool, @SerialName("disk_size") Long l10, @SerialName("disk_percentage") Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, j0.INSTANCE.getDescriptor());
        }
        this.enabled = (i10 & 1) == 0 ? Boolean.FALSE : bool;
        if ((i10 & 2) == 0) {
            this.diskSize = 1000L;
        } else {
            this.diskSize = l10;
        }
        if ((i10 & 4) == 0) {
            this.diskPercentage = 3;
        } else {
            this.diskPercentage = num;
        }
    }

    public l0(Boolean bool, Long l10, Integer num) {
        this.enabled = bool;
        this.diskSize = l10;
        this.diskPercentage = num;
    }

    public /* synthetic */ l0(Boolean bool, Long l10, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? 1000L : l10, (i10 & 4) != 0 ? 3 : num);
    }
}
