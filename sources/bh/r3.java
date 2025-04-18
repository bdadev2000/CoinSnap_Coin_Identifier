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
public final class r3 {
    public static final q3 Companion = new q3(null);
    private final String sdkUserAgent;

    public r3() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ r3 copy$default(r3 r3Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r3Var.sdkUserAgent;
        }
        return r3Var.copy(str);
    }

    @SerialName("sdk_user_agent")
    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }

    @JvmStatic
    public static final void write$Self(r3 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z10 = true;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.sdkUserAgent == null) {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.sdkUserAgent);
        }
    }

    public final String component1() {
        return this.sdkUserAgent;
    }

    public final r3 copy(String str) {
        return new r3(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3) && Intrinsics.areEqual(this.sdkUserAgent, ((r3) obj).sdkUserAgent);
    }

    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return com.applovin.impl.mediation.ads.e.g(new StringBuilder("RtbRequest(sdkUserAgent="), this.sdkUserAgent, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ r3(int i10, @SerialName("sdk_user_agent") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, p3.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public r3(String str) {
        this.sdkUserAgent = str;
    }

    public /* synthetic */ r3(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
