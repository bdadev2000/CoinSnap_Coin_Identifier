package bh;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class d0 {
    public static final c0 Companion = new c0(null);
    private final String appId;
    private final String bundle;
    private final String ver;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ d0(int i10, String str, String str2, @SerialName("id") String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, b0.INSTANCE.getDescriptor());
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ d0 copy$default(d0 d0Var, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = d0Var.bundle;
        }
        if ((i10 & 2) != 0) {
            str2 = d0Var.ver;
        }
        if ((i10 & 4) != 0) {
            str3 = d0Var.appId;
        }
        return d0Var.copy(str, str2, str3);
    }

    @SerialName("id")
    public static /* synthetic */ void getAppId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(d0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.bundle);
        output.encodeStringElement(serialDesc, 1, self.ver);
        output.encodeStringElement(serialDesc, 2, self.appId);
    }

    public final String component1() {
        return this.bundle;
    }

    public final String component2() {
        return this.ver;
    }

    public final String component3() {
        return this.appId;
    }

    public final d0 copy(String bundle, String ver, String appId) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(ver, "ver");
        Intrinsics.checkNotNullParameter(appId, "appId");
        return new d0(bundle, ver, appId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.areEqual(this.bundle, d0Var.bundle) && Intrinsics.areEqual(this.ver, d0Var.ver) && Intrinsics.areEqual(this.appId, d0Var.appId);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        return this.appId.hashCode() + vd.e.c(this.ver, this.bundle.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppNode(bundle=");
        sb2.append(this.bundle);
        sb2.append(", ver=");
        sb2.append(this.ver);
        sb2.append(", appId=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.appId, ')');
    }

    public d0(String bundle, String ver, String appId) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(ver, "ver");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.bundle = bundle;
        this.ver = ver;
        this.appId = appId;
    }
}
