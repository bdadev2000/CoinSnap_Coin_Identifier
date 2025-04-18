package bh;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.Transient;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes4.dex */
public final class i0 {
    public static final g0 Companion = new g0(null);

    /* renamed from: ad, reason: collision with root package name */
    private final z f2436ad;
    private final String adunit;
    private final List<String> impression;
    private final Json json;
    private final Integer version;

    public i0() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i0 copy$default(i0 i0Var, Integer num, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = i0Var.version;
        }
        if ((i10 & 2) != 0) {
            str = i0Var.adunit;
        }
        if ((i10 & 4) != 0) {
            list = i0Var.impression;
        }
        return i0Var.copy(num, str, list);
    }

    @Transient
    private static /* synthetic */ void getJson$annotations() {
    }

    private final String gzipDecode(byte[] bArr) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
            try {
                byte[] bArr2 = new byte[32];
                while (true) {
                    int read = gZIPInputStream.read(bArr2);
                    if (read != -1) {
                        sb2.append(new String(bArr2, 0, read, Charsets.UTF_8));
                    } else {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(gZIPInputStream, null);
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        String sb3 = sb2.toString();
                        Intrinsics.checkNotNullExpressionValue(sb3, "result.toString()");
                        return sb3;
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r5) == false) goto L31;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(bh.i0 r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            boolean r1 = r9.shouldEncodeElementDefault(r10, r0)
            r2 = 1
            if (r1 == 0) goto L19
        L17:
            r1 = r2
            goto L1f
        L19:
            java.lang.Integer r1 = r8.version
            if (r1 == 0) goto L1e
            goto L17
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L28
            kotlinx.serialization.internal.IntSerializer r1 = kotlinx.serialization.internal.IntSerializer.INSTANCE
            java.lang.Integer r3 = r8.version
            r9.encodeNullableSerializableElement(r10, r0, r1, r3)
        L28:
            boolean r1 = r9.shouldEncodeElementDefault(r10, r2)
            if (r1 == 0) goto L30
        L2e:
            r1 = r2
            goto L36
        L30:
            java.lang.String r1 = r8.adunit
            if (r1 == 0) goto L35
            goto L2e
        L35:
            r1 = r0
        L36:
            if (r1 == 0) goto L3f
            kotlinx.serialization.internal.StringSerializer r1 = kotlinx.serialization.internal.StringSerializer.INSTANCE
            java.lang.String r3 = r8.adunit
            r9.encodeNullableSerializableElement(r10, r2, r1, r3)
        L3f:
            r1 = 2
            boolean r3 = r9.shouldEncodeElementDefault(r10, r1)
            if (r3 == 0) goto L48
        L46:
            r3 = r2
            goto L4e
        L48:
            java.util.List<java.lang.String> r3 = r8.impression
            if (r3 == 0) goto L4d
            goto L46
        L4d:
            r3 = r0
        L4e:
            if (r3 == 0) goto L5c
            kotlinx.serialization.internal.ArrayListSerializer r3 = new kotlinx.serialization.internal.ArrayListSerializer
            kotlinx.serialization.internal.StringSerializer r4 = kotlinx.serialization.internal.StringSerializer.INSTANCE
            r3.<init>(r4)
            java.util.List<java.lang.String> r4 = r8.impression
            r9.encodeNullableSerializableElement(r10, r1, r3, r4)
        L5c:
            r1 = 3
            boolean r3 = r9.shouldEncodeElementDefault(r10, r1)
            if (r3 == 0) goto L65
        L63:
            r0 = r2
            goto L95
        L65:
            bh.z r3 = r8.f2436ad
            java.lang.String r4 = r8.adunit
            r5 = 0
            if (r4 == 0) goto L8e
            java.lang.String r4 = r8.getDecodedAdsResponse()
            if (r4 == 0) goto L8e
            kotlinx.serialization.json.Json r5 = r8.json
            kotlinx.serialization.modules.SerializersModule r6 = r5.getSerializersModule()
            java.lang.Class<bh.z> r7 = bh.z.class
            kotlin.reflect.KType r7 = kotlin.jvm.internal.Reflection.typeOf(r7)
            kotlinx.serialization.KSerializer r6 = kotlinx.serialization.SerializersKt.serializer(r6, r7)
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
            java.lang.Object r4 = r5.decodeFromString(r6, r4)
            bh.z r4 = (bh.z) r4
            r5 = r4
        L8e:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            if (r3 != 0) goto L95
            goto L63
        L95:
            if (r0 == 0) goto L9e
            bh.d r0 = bh.d.INSTANCE
            bh.z r8 = r8.f2436ad
            r9.encodeNullableSerializableElement(r10, r1, r0, r8)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.i0.write$Self(bh.i0, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final Integer component1() {
        return this.version;
    }

    public final String component2() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final i0 copy(Integer num, String str, List<String> list) {
        return new i0(num, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.version, i0Var.version) && Intrinsics.areEqual(this.adunit, i0Var.adunit) && Intrinsics.areEqual(this.impression, i0Var.impression);
    }

    public final z getAdPayload() {
        return this.f2436ad;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final String getDecodedAdsResponse() throws Throwable {
        byte[] decode = Base64.decode(this.adunit, 0);
        if (decode != null) {
            return gzipDecode(decode);
        }
        return null;
    }

    public final String getEventId() {
        z zVar = this.f2436ad;
        if (zVar != null) {
            return zVar.eventId();
        }
        return null;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        z zVar = this.f2436ad;
        if (zVar != null) {
            return zVar.placementId();
        }
        return null;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ i0(int i10, Integer num, String str, List list, z zVar, SerializationConstructorMarker serializationConstructorMarker) {
        String decodedAdsResponse;
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, e0.INSTANCE.getDescriptor());
        }
        z zVar2 = null;
        if ((i10 & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i10 & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i10 & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        Json Json$default = JsonKt.Json$default(null, f0.INSTANCE, 1, null);
        this.json = Json$default;
        if ((i10 & 8) != 0) {
            this.f2436ad = zVar;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            KSerializer<Object> serializer = SerializersKt.serializer(Json$default.getSerializersModule(), Reflection.typeOf(z.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            zVar2 = (z) Json$default.decodeFromString(serializer, decodedAdsResponse);
        }
        this.f2436ad = zVar2;
    }

    public i0(Integer num, String str, List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        z zVar = null;
        Json Json$default = JsonKt.Json$default(null, h0.INSTANCE, 1, null);
        this.json = Json$default;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            KSerializer<Object> serializer = SerializersKt.serializer(Json$default.getSerializersModule(), Reflection.typeOf(z.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            zVar = (z) Json$default.decodeFromString(serializer, decodedAdsResponse);
        }
        this.f2436ad = zVar;
    }

    public /* synthetic */ i0(Integer num, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list);
    }
}
