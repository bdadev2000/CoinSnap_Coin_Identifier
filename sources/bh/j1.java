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
public final class j1 {
    public static final i1 Companion = new i1(null);
    private final String configExt;
    private final Boolean needRefresh;

    public j1() {
        this((Boolean) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ j1 copy$default(j1 j1Var, Boolean bool, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = j1Var.needRefresh;
        }
        if ((i10 & 2) != 0) {
            str = j1Var.configExt;
        }
        return j1Var.copy(bool, str);
    }

    @SerialName("config_extension")
    public static /* synthetic */ void getConfigExt$annotations() {
    }

    @SerialName("need_refresh")
    public static /* synthetic */ void getNeedRefresh$annotations() {
    }

    @JvmStatic
    public static final void write$Self(j1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z11 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.needRefresh != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.needRefresh);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.configExt != null) {
            z11 = true;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.configExt);
        }
    }

    public final Boolean component1() {
        return this.needRefresh;
    }

    public final String component2() {
        return this.configExt;
    }

    public final j1 copy(Boolean bool, String str) {
        return new j1(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Intrinsics.areEqual(this.needRefresh, j1Var.needRefresh) && Intrinsics.areEqual(this.configExt, j1Var.configExt);
    }

    public final String getConfigExt() {
        return this.configExt;
    }

    public final Boolean getNeedRefresh() {
        return this.needRefresh;
    }

    public int hashCode() {
        Boolean bool = this.needRefresh;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.configExt;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigExtension(needRefresh=");
        sb2.append(this.needRefresh);
        sb2.append(", configExt=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.configExt, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ j1(int i10, @SerialName("need_refresh") Boolean bool, @SerialName("config_extension") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, h1.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.needRefresh = null;
        } else {
            this.needRefresh = bool;
        }
        if ((i10 & 2) == 0) {
            this.configExt = null;
        } else {
            this.configExt = str;
        }
    }

    public j1(Boolean bool, String str) {
        this.needRefresh = bool;
        this.configExt = str;
    }

    public /* synthetic */ j1(Boolean bool, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str);
    }
}
