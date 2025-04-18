package bh;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class j {
    public static final i Companion = new i(null);
    private final String extension;
    private final Boolean required;
    private final String url;

    public j() {
        this((String) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ j copy$default(j jVar, String str, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jVar.url;
        }
        if ((i10 & 2) != 0) {
            str2 = jVar.extension;
        }
        if ((i10 & 4) != 0) {
            bool = jVar.required;
        }
        return jVar.copy(str, str2, bool);
    }

    @JvmStatic
    public static final void write$Self(j self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z12 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.url != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.url);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.extension != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.extension);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.required != null) {
            z12 = true;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.required);
        }
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.extension;
    }

    public final Boolean component3() {
        return this.required;
    }

    public final j copy(String str, String str2, Boolean bool) {
        return new j(str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.url, jVar.url) && Intrinsics.areEqual(this.extension, jVar.extension) && Intrinsics.areEqual(this.required, jVar.required);
    }

    public final String getExtension() {
        return this.extension;
    }

    public final Boolean getRequired() {
        return this.required;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.extension;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.required;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", required=" + this.required + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ j(int i10, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, h.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i10 & 2) == 0) {
            this.extension = null;
        } else {
            this.extension = str2;
        }
        if ((i10 & 4) == 0) {
            this.required = null;
        } else {
            this.required = bool;
        }
    }

    public j(String str, String str2, Boolean bool) {
        this.url = str;
        this.extension = str2;
        this.required = bool;
    }

    public /* synthetic */ j(String str, String str2, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bool);
    }
}
