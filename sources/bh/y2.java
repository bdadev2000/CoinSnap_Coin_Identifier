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
public final class y2 implements GeneratedSerializer {
    public static final y2 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        y2 y2Var = new y2();
        INSTANCE = y2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.CommonVungleExt", y2Var, 17);
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
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y2() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), floatSerializer, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), floatSerializer, intSerializer, booleanSerializer, intSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00c9. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public a3 deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z10;
        int i10;
        float f10;
        int i11;
        boolean z11;
        int i12;
        Object obj4;
        Object obj5;
        boolean z12;
        int i13;
        float f11;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i14 = 11;
        int i15 = 10;
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
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            Object decodeNullableSerializableElement6 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            Object decodeNullableSerializableElement7 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            float decodeFloatElement2 = beginStructure.decodeFloatElement(descriptor2, 11);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 12);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 13);
            int decodeIntElement3 = beginStructure.decodeIntElement(descriptor2, 14);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 15);
            obj4 = decodeNullableSerializableElement;
            obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, stringSerializer, null);
            z10 = decodeBooleanElement3;
            i12 = 131071;
            i10 = decodeIntElement;
            f10 = decodeFloatElement;
            i11 = decodeIntElement3;
            obj7 = decodeNullableSerializableElement2;
            f11 = decodeFloatElement2;
            obj2 = decodeNullableSerializableElement4;
            z11 = decodeBooleanElement2;
            z12 = decodeBooleanElement;
            i13 = decodeIntElement2;
            obj = decodeNullableSerializableElement6;
            obj5 = decodeNullableSerializableElement7;
            obj3 = decodeNullableSerializableElement5;
            obj6 = decodeNullableSerializableElement3;
        } else {
            int i16 = 0;
            int i17 = 16;
            boolean z13 = true;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            obj = null;
            Object obj13 = null;
            obj2 = null;
            obj3 = null;
            Object obj14 = null;
            Object obj15 = null;
            boolean z14 = false;
            z10 = false;
            boolean z15 = false;
            int i18 = 0;
            i10 = 0;
            float f12 = 0.0f;
            f10 = 0.0f;
            i11 = 0;
            while (z13) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 11;
                        i15 = 10;
                    case 0:
                        obj15 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, obj15);
                        i16 |= 1;
                        i17 = 16;
                        i14 = 11;
                        i15 = 10;
                    case 1:
                        z15 = beginStructure.decodeBooleanElement(descriptor2, 1);
                        i16 |= 2;
                        i17 = 16;
                        i14 = 11;
                    case 2:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, obj10);
                        i16 |= 4;
                        i17 = 16;
                        i14 = 11;
                    case 3:
                        f10 = beginStructure.decodeFloatElement(descriptor2, 3);
                        i16 |= 8;
                        i17 = 16;
                        i14 = 11;
                    case 4:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, obj11);
                        i16 |= 16;
                        i17 = 16;
                        i14 = 11;
                    case 5:
                        i10 = beginStructure.decodeIntElement(descriptor2, 5);
                        i16 |= 32;
                        i17 = 16;
                        i14 = 11;
                    case 6:
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, obj2);
                        i16 |= 64;
                        i17 = 16;
                        i14 = 11;
                    case 7:
                        obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, obj3);
                        i16 |= 128;
                        i17 = 16;
                        i14 = 11;
                    case 8:
                        obj13 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, obj13);
                        i16 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        i17 = 16;
                        i14 = 11;
                    case 9:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, obj);
                        i16 |= 512;
                        i17 = 16;
                        i14 = 11;
                    case 10:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor2, i15, StringSerializer.INSTANCE, obj12);
                        i16 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        i17 = 16;
                    case 11:
                        f12 = beginStructure.decodeFloatElement(descriptor2, i14);
                        i16 |= 2048;
                        i17 = 16;
                    case 12:
                        i18 = beginStructure.decodeIntElement(descriptor2, 12);
                        i16 |= 4096;
                        i17 = 16;
                    case 13:
                        i16 |= 8192;
                        z14 = beginStructure.decodeBooleanElement(descriptor2, 13);
                        i17 = 16;
                    case 14:
                        i11 = beginStructure.decodeIntElement(descriptor2, 14);
                        i16 |= JsonLexerKt.BATCH_SIZE;
                        i17 = 16;
                    case 15:
                        z10 = beginStructure.decodeBooleanElement(descriptor2, 15);
                        i16 |= 32768;
                    case 16:
                        obj14 = beginStructure.decodeNullableSerializableElement(descriptor2, i17, StringSerializer.INSTANCE, obj14);
                        i16 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            z11 = z14;
            i12 = i16;
            obj4 = obj15;
            obj5 = obj12;
            z12 = z15;
            i13 = i18;
            f11 = f12;
            obj6 = obj11;
            obj7 = obj10;
            obj8 = obj14;
            obj9 = obj13;
        }
        beginStructure.endStructure(descriptor2);
        return new a3(i12, (String) obj4, z12, (String) obj7, f10, (String) obj6, i10, (String) obj2, (String) obj3, (String) obj9, (String) obj, (String) obj5, f11, i13, z11, i11, z10, (String) obj8, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, a3 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        a3.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
