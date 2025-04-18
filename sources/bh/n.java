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
public final class n {
    public static final m Companion = new m(null);
    private final g adMarkup;
    private final String placementReferenceId;

    public n() {
        this((String) null, (g) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ n copy$default(n nVar, String str, g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nVar.placementReferenceId;
        }
        if ((i10 & 2) != 0) {
            gVar = nVar.adMarkup;
        }
        return nVar.copy(str, gVar);
    }

    @SerialName("ad_markup")
    public static /* synthetic */ void getAdMarkup$annotations() {
    }

    @SerialName("placement_reference_id")
    public static /* synthetic */ void getPlacementReferenceId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(n self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z11 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.placementReferenceId != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.placementReferenceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.adMarkup != null) {
            z11 = true;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, e.INSTANCE, self.adMarkup);
        }
    }

    public final String component1() {
        return this.placementReferenceId;
    }

    public final g component2() {
        return this.adMarkup;
    }

    public final n copy(String str, g gVar) {
        return new n(str, gVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.placementReferenceId, nVar.placementReferenceId) && Intrinsics.areEqual(this.adMarkup, nVar.adMarkup);
    }

    public final g getAdMarkup() {
        return this.adMarkup;
    }

    public final String getPlacementReferenceId() {
        return this.placementReferenceId;
    }

    public int hashCode() {
        String str = this.placementReferenceId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        g gVar = this.adMarkup;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ n(int i10, @SerialName("placement_reference_id") String str, @SerialName("ad_markup") g gVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, l.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.placementReferenceId = null;
        } else {
            this.placementReferenceId = str;
        }
        if ((i10 & 2) == 0) {
            this.adMarkup = null;
        } else {
            this.adMarkup = gVar;
        }
    }

    public n(String str, g gVar) {
        this.placementReferenceId = str;
        this.adMarkup = gVar;
    }

    public /* synthetic */ n(String str, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : gVar);
    }
}
