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
public final class o1 {
    public static final n1 Companion = new n1(null);
    private final int refreshTime;

    public o1(int i10) {
        this.refreshTime = i10;
    }

    public static /* synthetic */ o1 copy$default(o1 o1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = o1Var.refreshTime;
        }
        return o1Var.copy(i10);
    }

    @SerialName("refresh_time")
    public static /* synthetic */ void getRefreshTime$annotations() {
    }

    @JvmStatic
    public static final void write$Self(o1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.refreshTime);
    }

    public final int component1() {
        return this.refreshTime;
    }

    public final o1 copy(int i10) {
        return new o1(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1) && this.refreshTime == ((o1) obj).refreshTime;
    }

    public final int getRefreshTime() {
        return this.refreshTime;
    }

    public int hashCode() {
        return Integer.hashCode(this.refreshTime);
    }

    public String toString() {
        return a4.j.i(new StringBuilder("ConfigSettings(refreshTime="), this.refreshTime, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ o1(int i10, @SerialName("refresh_time") int i11, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, m1.INSTANCE.getDescriptor());
        }
        this.refreshTime = i11;
    }
}
