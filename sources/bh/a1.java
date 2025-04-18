package bh;

import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class a1 implements GeneratedSerializer {
    public static final a1 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        a1 a1Var = new a1();
        INSTANCE = a1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", a1Var, 7);
        pluginGeneratedSerialDescriptor.addElement("placements", true);
        pluginGeneratedSerialDescriptor.addElement("header_bidding", true);
        pluginGeneratedSerialDescriptor.addElement("ad_size", true);
        pluginGeneratedSerialDescriptor.addElement("adStartTime", true);
        pluginGeneratedSerialDescriptor.addElement(MBridgeConstans.APP_ID, true);
        pluginGeneratedSerialDescriptor.addElement("placement_reference_id", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a1() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer)), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0058. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public c1 deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i10;
        Object obj7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i11 = 6;
        Object obj8 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(stringSerializer), null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, BooleanSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, LongSerializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            i10 = 127;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z10 = false;
                        i11 = 6;
                    case 0:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(StringSerializer.INSTANCE), obj8);
                        i12 |= 1;
                        i11 = 6;
                    case 1:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, BooleanSerializer.INSTANCE, obj10);
                        i12 |= 2;
                        i11 = 6;
                    case 2:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, obj11);
                        i12 |= 4;
                    case 3:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, LongSerializer.INSTANCE, obj12);
                        i12 |= 8;
                    case 4:
                        obj13 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, obj13);
                        i12 |= 16;
                    case 5:
                        obj14 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, obj14);
                        i12 |= 32;
                    case 6:
                        obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, i11, StringSerializer.INSTANCE, obj9);
                        i12 |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj9;
            obj2 = obj10;
            obj3 = obj11;
            obj4 = obj12;
            obj5 = obj13;
            obj6 = obj14;
            Object obj15 = obj8;
            i10 = i12;
            obj7 = obj15;
        }
        beginStructure.endStructure(descriptor2);
        return new c1(i10, (List) obj7, (Boolean) obj2, (String) obj3, (Long) obj4, (String) obj5, (String) obj6, (String) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, c1 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        c1.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
