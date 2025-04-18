package bh;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class q {
    public static final p Companion = new p(null);
    private final Map<String, j> cacheableReplacements;
    private final Map<String, String> normalReplacements;

    public q() {
        this((Map) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q copy$default(q qVar, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = qVar.normalReplacements;
        }
        if ((i10 & 2) != 0) {
            map2 = qVar.cacheableReplacements;
        }
        return qVar.copy(map, map2);
    }

    @SerialName("cacheable_replacements")
    public static /* synthetic */ void getCacheableReplacements$annotations() {
    }

    @SerialName("normal_replacements")
    public static /* synthetic */ void getNormalReplacements$annotations() {
    }

    @JvmStatic
    public static final void write$Self(q self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z11 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.normalReplacements != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 0, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.normalReplacements);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.cacheableReplacements != null) {
            z11 = true;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(StringSerializer.INSTANCE, h.INSTANCE), self.cacheableReplacements);
        }
    }

    public final Map<String, String> component1() {
        return this.normalReplacements;
    }

    public final Map<String, j> component2() {
        return this.cacheableReplacements;
    }

    public final q copy(Map<String, String> map, Map<String, j> map2) {
        return new q(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.normalReplacements, qVar.normalReplacements) && Intrinsics.areEqual(this.cacheableReplacements, qVar.cacheableReplacements);
    }

    public final Map<String, j> getCacheableReplacements() {
        return this.cacheableReplacements;
    }

    public final Map<String, String> getNormalReplacements() {
        return this.normalReplacements;
    }

    public int hashCode() {
        Map<String, String> map = this.normalReplacements;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, j> map2 = this.cacheableReplacements;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ q(int i10, @SerialName("normal_replacements") Map map, @SerialName("cacheable_replacements") Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, o.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.normalReplacements = null;
        } else {
            this.normalReplacements = map;
        }
        if ((i10 & 2) == 0) {
            this.cacheableReplacements = null;
        } else {
            this.cacheableReplacements = map2;
        }
    }

    public q(Map<String, String> map, Map<String, j> map2) {
        this.normalReplacements = map;
        this.cacheableReplacements = map2;
    }

    public /* synthetic */ q(Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2);
    }
}
