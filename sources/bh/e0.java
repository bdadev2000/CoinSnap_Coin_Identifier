package bh;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class e0 implements GeneratedSerializer {
    public static final e0 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        e0 e0Var = new e0();
        INSTANCE = e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.BidPayload", e0Var, 4);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("adunit", true);
        pluginGeneratedSerialDescriptor.addElement("impression", true);
        pluginGeneratedSerialDescriptor.addElement("ad", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e0() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer)), BuiltinSerializersKt.getNullable(d.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public i0 deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i10;
        Object obj4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        Object obj5 = null;
        if (beginStructure.decodeSequentially()) {
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, IntSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, new ArrayListSerializer(stringSerializer), null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, d.INSTANCE, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, IntSerializer.INSTANCE, obj5);
                    i11 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, obj6);
                    i11 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, new ArrayListSerializer(StringSerializer.INSTANCE), obj7);
                    i11 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, d.INSTANCE, obj8);
                    i11 |= 8;
                }
            }
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            Object obj9 = obj5;
            i10 = i11;
            obj4 = obj9;
        }
        beginStructure.endStructure(descriptor2);
        return new i0(i10, (Integer) obj4, (String) obj, (List) obj2, (z) obj3, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, i0 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        i0.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
