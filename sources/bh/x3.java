package bh;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
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
public final class x3 {
    public static final w3 Companion = new w3(null);
    private final String eventId;
    private String sessionId;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ x3(int i10, @SerialName("107") String str, @SerialName("101") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, v3.INSTANCE.getDescriptor());
        }
        this.eventId = str;
        if ((i10 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ x3 copy$default(x3 x3Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = x3Var.eventId;
        }
        if ((i10 & 2) != 0) {
            str2 = x3Var.sessionId;
        }
        return x3Var.copy(str, str2);
    }

    @SerialName("107")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_IO_ERROR)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(x3 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z10 = false;
        output.encodeStringElement(serialDesc, 0, self.eventId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.sessionId, "")) {
            z10 = true;
        }
        if (z10) {
            output.encodeStringElement(serialDesc, 1, self.sessionId);
        }
    }

    public final String component1() {
        return this.eventId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final x3 copy(String eventId, String sessionId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new x3(eventId, sessionId);
    }

    public boolean equals(Object obj) {
        if (obj == null || !Intrinsics.areEqual(x3.class, obj.getClass())) {
            return false;
        }
        x3 x3Var = (x3) obj;
        if (!Intrinsics.areEqual(this.eventId, x3Var.eventId) || !Intrinsics.areEqual(this.sessionId, x3Var.sessionId)) {
            return false;
        }
        return true;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + (this.eventId.hashCode() * 31);
    }

    public final void setSessionId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnclosedAd(eventId=");
        sb2.append(this.eventId);
        sb2.append(", sessionId=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.sessionId, ')');
    }

    public x3(String eventId, String sessionId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.eventId = eventId;
        this.sessionId = sessionId;
    }

    public /* synthetic */ x3(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }
}
