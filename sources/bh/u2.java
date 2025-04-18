package bh;

import androidx.core.app.NotificationCompat;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class u2 implements GeneratedSerializer {
    public static final u2 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        u2 u2Var = new u2();
        INSTANCE = u2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode", u2Var, 11);
        pluginGeneratedSerialDescriptor.addElement("make", false);
        pluginGeneratedSerialDescriptor.addElement("model", false);
        pluginGeneratedSerialDescriptor.addElement("osv", false);
        pluginGeneratedSerialDescriptor.addElement("carrier", true);
        pluginGeneratedSerialDescriptor.addElement("os", false);
        pluginGeneratedSerialDescriptor.addElement("w", false);
        pluginGeneratedSerialDescriptor.addElement("h", false);
        pluginGeneratedSerialDescriptor.addElement("ua", true);
        pluginGeneratedSerialDescriptor.addElement("ifa", true);
        pluginGeneratedSerialDescriptor.addElement("lmt", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u2() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(c3.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x007d. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public i3 deserialize(Decoder decoder) {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i10;
        String str2;
        String str3;
        int i11;
        int i12;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i13 = 10;
        int i14 = 9;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 4);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 5);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 6);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, c3.INSTANCE, null);
            i11 = decodeIntElement2;
            i12 = decodeIntElement;
            str4 = decodeStringElement4;
            str = decodeStringElement2;
            str2 = decodeStringElement;
            str3 = decodeStringElement3;
            obj = decodeNullableSerializableElement;
            i10 = 2047;
        } else {
            boolean z10 = true;
            int i15 = 0;
            int i16 = 0;
            Object obj6 = null;
            Object obj7 = null;
            obj = null;
            Object obj8 = null;
            String str5 = null;
            str = null;
            String str6 = null;
            String str7 = null;
            Object obj9 = null;
            int i17 = 0;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z10 = false;
                        i13 = 10;
                    case 0:
                        str5 = beginStructure.decodeStringElement(descriptor2, 0);
                        i16 |= 1;
                        i13 = 10;
                        i14 = 9;
                    case 1:
                        str = beginStructure.decodeStringElement(descriptor2, 1);
                        i16 |= 2;
                        i13 = 10;
                        i14 = 9;
                    case 2:
                        str6 = beginStructure.decodeStringElement(descriptor2, 2);
                        i16 |= 4;
                        i13 = 10;
                        i14 = 9;
                    case 3:
                        obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, obj9);
                        i16 |= 8;
                        i13 = 10;
                        i14 = 9;
                    case 4:
                        str7 = beginStructure.decodeStringElement(descriptor2, 4);
                        i16 |= 16;
                        i13 = 10;
                    case 5:
                        i17 = beginStructure.decodeIntElement(descriptor2, 5);
                        i16 |= 32;
                    case 6:
                        i15 = beginStructure.decodeIntElement(descriptor2, 6);
                        i16 |= 64;
                    case 7:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, obj8);
                        i16 |= 128;
                    case 8:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, obj);
                        i16 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    case 9:
                        obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, i14, IntSerializer.INSTANCE, obj6);
                        i16 |= 512;
                    case 10:
                        obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, i13, c3.INSTANCE, obj7);
                        i16 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            obj5 = obj9;
            i10 = i16;
            str2 = str5;
            str3 = str6;
            i11 = i15;
            i12 = i17;
            str4 = str7;
        }
        beginStructure.endStructure(descriptor2);
        return new i3(i10, str2, str, str3, (String) obj5, str4, i12, i11, (String) obj4, (String) obj, (Integer) obj2, (e3) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, i3 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        i3.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
