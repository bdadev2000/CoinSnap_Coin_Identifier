package bh;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class j3 implements GeneratedSerializer {
    public static final j3 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        j3 j3Var = new j3();
        INSTANCE = j3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.OmSdkData", j3Var, 3);
        pluginGeneratedSerialDescriptor.addElement("params", true);
        pluginGeneratedSerialDescriptor.addElement("vendorKey", true);
        pluginGeneratedSerialDescriptor.addElement("vendorURL", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j3() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public l3 deserialize(Decoder decoder) {
        Object obj;
        int i10;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        Object obj4 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            obj = decodeNullableSerializableElement;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            obj = null;
            Object obj5 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, obj4);
                    i11 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, obj);
                    i11 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, obj5);
                    i11 |= 4;
                }
            }
            i10 = i11;
            obj2 = obj4;
            obj3 = obj5;
        }
        beginStructure.endStructure(descriptor2);
        return new l3(i10, (String) obj2, (String) obj, (String) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, l3 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        l3.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
