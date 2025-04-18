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

/* loaded from: classes4.dex */
public final class r1 {
    public static final q1 Companion = new q1(null);
    private final String collectFilter;
    private final boolean enabled;
    private final int maxSendAmount;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ r1(int i10, boolean z10, @SerialName("max_send_amount") int i11, @SerialName("collect_filter") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i10 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 6, p1.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z10;
        }
        this.maxSendAmount = i11;
        this.collectFilter = str;
    }

    public static /* synthetic */ r1 copy$default(r1 r1Var, boolean z10, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = r1Var.enabled;
        }
        if ((i11 & 2) != 0) {
            i10 = r1Var.maxSendAmount;
        }
        if ((i11 & 4) != 0) {
            str = r1Var.collectFilter;
        }
        return r1Var.copy(z10, i10, str);
    }

    @SerialName("collect_filter")
    public static /* synthetic */ void getCollectFilter$annotations() {
    }

    @SerialName("max_send_amount")
    public static /* synthetic */ void getMaxSendAmount$annotations() {
    }

    @JvmStatic
    public static final void write$Self(r1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.enabled) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeBooleanElement(serialDesc, 0, self.enabled);
        }
        output.encodeIntElement(serialDesc, 1, self.maxSendAmount);
        output.encodeStringElement(serialDesc, 2, self.collectFilter);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.maxSendAmount;
    }

    public final String component3() {
        return this.collectFilter;
    }

    public final r1 copy(boolean z10, int i10, String collectFilter) {
        Intrinsics.checkNotNullParameter(collectFilter, "collectFilter");
        return new r1(z10, i10, collectFilter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.enabled == r1Var.enabled && this.maxSendAmount == r1Var.maxSendAmount && Intrinsics.areEqual(this.collectFilter, r1Var.collectFilter);
    }

    public final String getCollectFilter() {
        return this.collectFilter;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMaxSendAmount() {
        return this.maxSendAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.enabled;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.collectFilter.hashCode() + kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.maxSendAmount, r02 * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CrashReportSettings(enabled=");
        sb2.append(this.enabled);
        sb2.append(", maxSendAmount=");
        sb2.append(this.maxSendAmount);
        sb2.append(", collectFilter=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.collectFilter, ')');
    }

    public r1(boolean z10, int i10, String collectFilter) {
        Intrinsics.checkNotNullParameter(collectFilter, "collectFilter");
        this.enabled = z10;
        this.maxSendAmount = i10;
        this.collectFilter = collectFilter;
    }

    public /* synthetic */ r1(boolean z10, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, i10, str);
    }
}
