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
public final class s1 implements GeneratedSerializer {
    public static final s1 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        s1 s1Var = new s1();
        INSTANCE = s1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.Endpoints", s1Var, 5);
        pluginGeneratedSerialDescriptor.addElement(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        pluginGeneratedSerialDescriptor.addElement("ri", true);
        pluginGeneratedSerialDescriptor.addElement("mraid_js", true);
        pluginGeneratedSerialDescriptor.addElement("metrics", true);
        pluginGeneratedSerialDescriptor.addElement("error_logs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s1() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public u1 deserialize(Decoder decoder) {
        Object obj;
        int i10;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        Object obj6 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            obj = decodeNullableSerializableElement;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj7 = null;
            obj = null;
            Object obj8 = null;
            Object obj9 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, obj6);
                    i11 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, obj7);
                    i11 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj = beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, obj);
                    i11 |= 4;
                } else if (decodeElementIndex == 3) {
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, obj8);
                    i11 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, obj9);
                    i11 |= 16;
                }
            }
            i10 = i11;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            obj5 = obj9;
        }
        beginStructure.endStructure(descriptor2);
        return new u1(i10, (String) obj2, (String) obj3, (String) obj, (String) obj4, (String) obj5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, u1 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        u1.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
