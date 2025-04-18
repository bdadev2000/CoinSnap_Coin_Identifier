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
public final class x2 extends a3 {
    public static final w2 Companion = new w2(null);
    private String amazonAdvertisingId;
    private String gaid;

    public x2() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ x2 copy$default(x2 x2Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = x2Var.gaid;
        }
        if ((i10 & 2) != 0) {
            str2 = x2Var.amazonAdvertisingId;
        }
        return x2Var.copy(str, str2);
    }

    @JvmStatic
    public static final void write$Self(x2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        a3.write$Self(self, output, serialDesc);
        boolean z11 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.gaid != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.gaid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.amazonAdvertisingId != null) {
            z11 = true;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, self.amazonAdvertisingId);
        }
    }

    public final String component1() {
        return this.gaid;
    }

    public final String component2() {
        return this.amazonAdvertisingId;
    }

    public final x2 copy(String str, String str2) {
        return new x2(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return Intrinsics.areEqual(this.gaid, x2Var.gaid) && Intrinsics.areEqual(this.amazonAdvertisingId, x2Var.amazonAdvertisingId);
    }

    public final String getAmazonAdvertisingId() {
        return this.amazonAdvertisingId;
    }

    public final String getGaid() {
        return this.gaid;
    }

    public int hashCode() {
        String str = this.gaid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amazonAdvertisingId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAmazonAdvertisingId(String str) {
        this.amazonAdvertisingId = str;
    }

    public final void setGaid(String str) {
        this.gaid = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidAmazonExt(gaid=");
        sb2.append(this.gaid);
        sb2.append(", amazonAdvertisingId=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.amazonAdvertisingId, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ x2(int i10, @SerialName("android_id") String str, @SerialName("is_google_play_services_available") boolean z10, @SerialName("app_set_id") String str2, @SerialName("battery_level") float f10, @SerialName("battery_state") String str3, @SerialName("battery_saver_enabled") int i11, @SerialName("connection_type") String str4, @SerialName("connection_type_detail") String str5, String str6, String str7, @SerialName("time_zone") String str8, @SerialName("volume_level") float f11, @SerialName("sound_enabled") int i12, @SerialName("is_tv") boolean z11, @SerialName("sd_card_available") int i13, @SerialName("is_sideload_enabled") boolean z12, @SerialName("os_name") String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, str, z10, str2, f10, str3, i11, str4, str5, str6, str7, str8, f11, i12, z11, i13, z12, str9, serializationConstructorMarker);
        x2 x2Var;
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, v2.INSTANCE.getDescriptor());
        }
        if ((i10 & 131072) == 0) {
            x2Var = this;
            x2Var.gaid = null;
        } else {
            x2Var = this;
            x2Var.gaid = str10;
        }
        x2Var.amazonAdvertisingId = (i10 & 262144) != 0 ? str11 : null;
    }

    public /* synthetic */ x2(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }

    public x2(String str, String str2) {
        this.gaid = str;
        this.amazonAdvertisingId = str2;
    }
}
