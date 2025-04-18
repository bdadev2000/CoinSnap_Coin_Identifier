package bh;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes4.dex */
public final class k1 implements GeneratedSerializer {
    public static final k1 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        k1 k1Var = new k1();
        INSTANCE = k1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", k1Var, 19);
        pluginGeneratedSerialDescriptor.addElement("endpoints", true);
        pluginGeneratedSerialDescriptor.addElement("placements", true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("gdpr", true);
        pluginGeneratedSerialDescriptor.addElement("logging", true);
        pluginGeneratedSerialDescriptor.addElement("crash_report", true);
        pluginGeneratedSerialDescriptor.addElement("viewability", true);
        pluginGeneratedSerialDescriptor.addElement("ad_load_optimization", true);
        pluginGeneratedSerialDescriptor.addElement("ri", true);
        pluginGeneratedSerialDescriptor.addElement("disable_ad_id", true);
        pluginGeneratedSerialDescriptor.addElement("config_extension", true);
        pluginGeneratedSerialDescriptor.addElement("template", true);
        pluginGeneratedSerialDescriptor.addElement("log_metrics", true);
        pluginGeneratedSerialDescriptor.addElement("session", true);
        pluginGeneratedSerialDescriptor.addElement("reuse_assets", true);
        pluginGeneratedSerialDescriptor.addElement("rta_debugging", true);
        pluginGeneratedSerialDescriptor.addElement("cacheable_assets_required", true);
        pluginGeneratedSerialDescriptor.addElement("sdk_session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("signals_disabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k1() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(s1.INSTANCE), BuiltinSerializersKt.getNullable(new ArrayListSerializer(m3.INSTANCE)), BuiltinSerializersKt.getNullable(m1.INSTANCE), BuiltinSerializersKt.getNullable(v1.INSTANCE), BuiltinSerializersKt.getNullable(e2.INSTANCE), BuiltinSerializersKt.getNullable(p1.INSTANCE), BuiltinSerializersKt.getNullable(q2.INSTANCE), BuiltinSerializersKt.getNullable(y1.INSTANCE), BuiltinSerializersKt.getNullable(h2.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(n2.INSTANCE), BuiltinSerializersKt.getNullable(b2.INSTANCE), BuiltinSerializersKt.getNullable(k2.INSTANCE), BuiltinSerializersKt.getNullable(j0.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00eb. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public t2 deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i10;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 0, s1.INSTANCE, null);
            obj19 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, new ArrayListSerializer(m3.INSTANCE), null);
            obj18 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, m1.INSTANCE, null);
            obj17 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, v1.INSTANCE, null);
            Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, e2.INSTANCE, null);
            obj16 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, p1.INSTANCE, null);
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, q2.INSTANCE, null);
            obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, y1.INSTANCE, null);
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, h2.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            obj14 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, booleanSerializer, null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, n2.INSTANCE, null);
            obj15 = beginStructure.decodeNullableSerializableElement(descriptor2, 12, b2.INSTANCE, null);
            obj13 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, k2.INSTANCE, null);
            Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, j0.INSTANCE, null);
            Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor2, 15, booleanSerializer, null);
            obj12 = decodeNullableSerializableElement3;
            obj11 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, booleanSerializer, null);
            Object decodeNullableSerializableElement5 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, IntSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 18, booleanSerializer, null);
            i10 = 524287;
            obj10 = decodeNullableSerializableElement5;
            obj4 = decodeNullableSerializableElement;
            obj3 = decodeNullableSerializableElement4;
            obj = decodeNullableSerializableElement2;
        } else {
            boolean z10 = true;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj27 = null;
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            obj = null;
            Object obj32 = null;
            Object obj33 = null;
            Object obj34 = null;
            Object obj35 = null;
            Object obj36 = null;
            Object obj37 = null;
            Object obj38 = null;
            int i11 = 0;
            Object obj39 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z10 = false;
                        obj26 = obj26;
                        obj23 = obj23;
                        obj38 = obj38;
                        obj22 = obj22;
                    case 0:
                        i11 |= 1;
                        obj26 = obj26;
                        obj22 = obj22;
                        obj23 = obj23;
                        obj38 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, s1.INSTANCE, obj38);
                    case 1:
                        obj39 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, new ArrayListSerializer(m3.INSTANCE), obj39);
                        i11 |= 2;
                        obj26 = obj26;
                        obj22 = obj22;
                    case 2:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj25 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, m1.INSTANCE, obj25);
                        i11 |= 4;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 3:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj24 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, v1.INSTANCE, obj24);
                        i11 |= 8;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 4:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 4, e2.INSTANCE, obj);
                        i11 |= 16;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 5:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj22 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, p1.INSTANCE, obj22);
                        i11 |= 32;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 6:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj31 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, q2.INSTANCE, obj31);
                        i11 |= 64;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 7:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj30 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, y1.INSTANCE, obj30);
                        i11 |= 128;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 8:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj29 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, h2.INSTANCE, obj29);
                        i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 9:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj23 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, BooleanSerializer.INSTANCE, obj23);
                        i11 |= 512;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 10:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj28 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, obj28);
                        i11 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 11:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj27 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, n2.INSTANCE, obj27);
                        i11 |= 2048;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 12:
                        obj20 = obj39;
                        obj32 = beginStructure.decodeNullableSerializableElement(descriptor2, 12, b2.INSTANCE, obj32);
                        i11 |= 4096;
                        obj26 = obj26;
                        obj33 = obj33;
                        obj39 = obj20;
                    case 13:
                        obj20 = obj39;
                        obj33 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, k2.INSTANCE, obj33);
                        i11 |= 8192;
                        obj26 = obj26;
                        obj34 = obj34;
                        obj39 = obj20;
                    case 14:
                        obj20 = obj39;
                        obj34 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, j0.INSTANCE, obj34);
                        i11 |= JsonLexerKt.BATCH_SIZE;
                        obj26 = obj26;
                        obj35 = obj35;
                        obj39 = obj20;
                    case 15:
                        obj20 = obj39;
                        obj35 = beginStructure.decodeNullableSerializableElement(descriptor2, 15, BooleanSerializer.INSTANCE, obj35);
                        i11 |= 32768;
                        obj26 = obj26;
                        obj36 = obj36;
                        obj39 = obj20;
                    case 16:
                        obj20 = obj39;
                        obj36 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, BooleanSerializer.INSTANCE, obj36);
                        i11 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        obj26 = obj26;
                        obj37 = obj37;
                        obj39 = obj20;
                    case 17:
                        obj20 = obj39;
                        obj21 = obj26;
                        obj37 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, IntSerializer.INSTANCE, obj37);
                        i11 |= 131072;
                        obj26 = obj21;
                        obj39 = obj20;
                    case 18:
                        obj26 = beginStructure.decodeNullableSerializableElement(descriptor2, 18, BooleanSerializer.INSTANCE, obj26);
                        i11 |= 262144;
                        obj39 = obj39;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            Object obj40 = obj22;
            obj2 = obj26;
            obj3 = obj35;
            Object obj41 = obj38;
            Object obj42 = obj23;
            obj4 = obj41;
            i10 = i11;
            obj5 = obj27;
            obj6 = obj28;
            obj7 = obj29;
            obj8 = obj30;
            obj9 = obj31;
            obj10 = obj37;
            obj11 = obj36;
            obj12 = obj34;
            obj13 = obj33;
            obj14 = obj42;
            obj15 = obj32;
            obj16 = obj40;
            Object obj43 = obj39;
            obj17 = obj24;
            obj18 = obj25;
            obj19 = obj43;
        }
        beginStructure.endStructure(descriptor2);
        return new t2(i10, (u1) obj4, (List) obj19, (o1) obj18, (x1) obj17, (g2) obj, (r1) obj16, (s2) obj9, (a2) obj8, (j2) obj7, (Boolean) obj14, (String) obj6, (p2) obj5, (d2) obj15, (m2) obj13, (l0) obj12, (Boolean) obj3, (Boolean) obj11, (Integer) obj10, (Boolean) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, t2 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        t2.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
