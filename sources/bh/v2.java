package bh;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes4.dex */
public final class v2 implements GeneratedSerializer {
    public static final v2 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        v2 v2Var = new v2();
        INSTANCE = v2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.AndroidAmazonExt", v2Var, 19);
        pluginGeneratedSerialDescriptor.addElement("android_id", true);
        pluginGeneratedSerialDescriptor.addElement("is_google_play_services_available", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id", true);
        pluginGeneratedSerialDescriptor.addElement("battery_level", true);
        pluginGeneratedSerialDescriptor.addElement("battery_state", true);
        pluginGeneratedSerialDescriptor.addElement("battery_saver_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type_detail", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("time_zone", true);
        pluginGeneratedSerialDescriptor.addElement("volume_level", true);
        pluginGeneratedSerialDescriptor.addElement("sound_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_tv", true);
        pluginGeneratedSerialDescriptor.addElement("sd_card_available", true);
        pluginGeneratedSerialDescriptor.addElement("is_sideload_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("os_name", true);
        pluginGeneratedSerialDescriptor.addElement("gaid", true);
        pluginGeneratedSerialDescriptor.addElement("amazonAdvertisingId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v2() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), floatSerializer, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), floatSerializer, intSerializer, booleanSerializer, intSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00e3. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public x2 deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i10;
        float f10;
        float f11;
        Object obj3;
        Object obj4;
        boolean z10;
        Object obj5;
        Object obj6;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        int i13;
        Object obj12;
        int i14;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 1);
            Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            float decodeFloatElement = beginStructure.decodeFloatElement(descriptor2, 3);
            Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 5);
            Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            Object decodeNullableSerializableElement5 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            Object decodeNullableSerializableElement6 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            Object decodeNullableSerializableElement7 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            Object decodeNullableSerializableElement8 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            float decodeFloatElement2 = beginStructure.decodeFloatElement(descriptor2, 11);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 12);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 13);
            int decodeIntElement3 = beginStructure.decodeIntElement(descriptor2, 14);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 15);
            obj4 = decodeNullableSerializableElement;
            Object decodeNullableSerializableElement9 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, stringSerializer, null);
            Object decodeNullableSerializableElement10 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, stringSerializer, null);
            obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 18, stringSerializer, null);
            obj7 = decodeNullableSerializableElement2;
            i13 = 524287;
            f10 = decodeFloatElement2;
            i10 = decodeIntElement;
            f11 = decodeFloatElement;
            z12 = decodeBooleanElement;
            z11 = decodeBooleanElement3;
            obj2 = decodeNullableSerializableElement6;
            i12 = decodeIntElement2;
            obj5 = decodeNullableSerializableElement8;
            obj9 = decodeNullableSerializableElement7;
            obj = decodeNullableSerializableElement10;
            obj11 = decodeNullableSerializableElement3;
            i11 = decodeIntElement3;
            z10 = decodeBooleanElement2;
            obj3 = decodeNullableSerializableElement9;
            obj10 = decodeNullableSerializableElement5;
            obj6 = decodeNullableSerializableElement4;
        } else {
            int i15 = 18;
            int i16 = 0;
            boolean z13 = true;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            obj = null;
            Object obj18 = null;
            Object obj19 = null;
            obj2 = null;
            Object obj20 = null;
            Object obj21 = null;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int i17 = 0;
            i10 = 0;
            f10 = 0.0f;
            f11 = 0.0f;
            int i18 = 0;
            while (z13) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z13 = false;
                        i15 = 18;
                    case 0:
                        obj12 = obj15;
                        i16 |= 1;
                        obj21 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, obj21);
                        obj15 = obj12;
                        i15 = 18;
                    case 1:
                        obj12 = obj15;
                        z16 = beginStructure.decodeBooleanElement(descriptor2, 1);
                        i16 |= 2;
                        obj15 = obj12;
                        i15 = 18;
                    case 2:
                        obj12 = obj15;
                        obj13 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, obj13);
                        i16 |= 4;
                        obj15 = obj12;
                        i15 = 18;
                    case 3:
                        obj12 = obj15;
                        f11 = beginStructure.decodeFloatElement(descriptor2, 3);
                        i16 |= 8;
                        obj15 = obj12;
                        i15 = 18;
                    case 4:
                        obj12 = obj15;
                        obj16 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, obj16);
                        i16 |= 16;
                        obj15 = obj12;
                        i15 = 18;
                    case 5:
                        obj12 = obj15;
                        i10 = beginStructure.decodeIntElement(descriptor2, 5);
                        i16 |= 32;
                        obj15 = obj12;
                        i15 = 18;
                    case 6:
                        obj12 = obj15;
                        obj20 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, obj20);
                        i16 |= 64;
                        obj15 = obj12;
                        i15 = 18;
                    case 7:
                        obj12 = obj15;
                        obj14 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, obj14);
                        i16 |= 128;
                        obj15 = obj12;
                        i15 = 18;
                    case 8:
                        obj12 = obj15;
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, obj2);
                        i16 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        obj15 = obj12;
                        i15 = 18;
                    case 9:
                        obj12 = obj15;
                        obj19 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, obj19);
                        i16 |= 512;
                        obj15 = obj12;
                        i15 = 18;
                    case 10:
                        obj12 = obj15;
                        obj18 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, obj18);
                        i16 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        obj15 = obj12;
                        i15 = 18;
                    case 11:
                        f10 = beginStructure.decodeFloatElement(descriptor2, 11);
                        i16 |= 2048;
                        i15 = 18;
                    case 12:
                        i17 = beginStructure.decodeIntElement(descriptor2, 12);
                        i16 |= 4096;
                        i15 = 18;
                    case 13:
                        i16 |= 8192;
                        z14 = beginStructure.decodeBooleanElement(descriptor2, 13);
                        i15 = 18;
                    case 14:
                        i18 = beginStructure.decodeIntElement(descriptor2, 14);
                        i16 |= JsonLexerKt.BATCH_SIZE;
                        i15 = 18;
                    case 15:
                        z15 = beginStructure.decodeBooleanElement(descriptor2, 15);
                        i16 |= 32768;
                        i15 = 18;
                    case 16:
                        obj15 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, obj15);
                        i14 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        i16 |= i14;
                        i15 = 18;
                    case 17:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, obj);
                        i14 = 131072;
                        i16 |= i14;
                        i15 = 18;
                    case 18:
                        obj17 = beginStructure.decodeNullableSerializableElement(descriptor2, i15, StringSerializer.INSTANCE, obj17);
                        i16 |= 262144;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            obj3 = obj15;
            obj4 = obj21;
            z10 = z14;
            obj5 = obj18;
            obj6 = obj20;
            i11 = i18;
            z11 = z15;
            z12 = z16;
            i12 = i17;
            obj7 = obj13;
            obj8 = obj17;
            obj9 = obj19;
            obj10 = obj14;
            obj11 = obj16;
            i13 = i16;
        }
        beginStructure.endStructure(descriptor2);
        return new x2(i13, (String) obj4, z12, (String) obj7, f11, (String) obj11, i10, (String) obj6, (String) obj10, (String) obj2, (String) obj9, (String) obj5, f10, i12, z10, i11, z11, (String) obj3, (String) obj, (String) obj8, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, x2 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        x2.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
