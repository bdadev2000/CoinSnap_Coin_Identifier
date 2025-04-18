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
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class l3 {
    public static final k3 Companion = new k3(null);
    private final String params;
    private final String vendorKey;
    private final String vendorURL;

    public l3() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ l3 copy$default(l3 l3Var, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = l3Var.params;
        }
        if ((i10 & 2) != 0) {
            str2 = l3Var.vendorKey;
        }
        if ((i10 & 4) != 0) {
            str3 = l3Var.vendorURL;
        }
        return l3Var.copy(str, str2, str3);
    }

    @JvmStatic
    public static final void write$Self(l3 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z12 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.params != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.params);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.vendorKey != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.vendorKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.vendorURL != null) {
            z12 = true;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.vendorURL);
        }
    }

    public final String component1() {
        return this.params;
    }

    public final String component2() {
        return this.vendorKey;
    }

    public final String component3() {
        return this.vendorURL;
    }

    public final l3 copy(String str, String str2, String str3) {
        return new l3(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return Intrinsics.areEqual(this.params, l3Var.params) && Intrinsics.areEqual(this.vendorKey, l3Var.vendorKey) && Intrinsics.areEqual(this.vendorURL, l3Var.vendorURL);
    }

    public final String getParams() {
        return this.params;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVendorURL() {
        return this.vendorURL;
    }

    public int hashCode() {
        String str = this.params;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vendorKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendorURL;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OmSdkData(params=");
        sb2.append(this.params);
        sb2.append(", vendorKey=");
        sb2.append(this.vendorKey);
        sb2.append(", vendorURL=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.vendorURL, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ l3(int i10, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, j3.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.params = null;
        } else {
            this.params = str;
        }
        if ((i10 & 2) == 0) {
            this.vendorKey = null;
        } else {
            this.vendorKey = str2;
        }
        if ((i10 & 4) == 0) {
            this.vendorURL = null;
        } else {
            this.vendorURL = str3;
        }
    }

    public l3(String str, String str2, String str3) {
        this.params = str;
        this.vendorKey = str2;
        this.vendorURL = str3;
    }

    public /* synthetic */ l3(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
