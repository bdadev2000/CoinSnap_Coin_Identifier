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
public final class p3 implements GeneratedSerializer {
    public static final p3 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        p3 p3Var = new p3();
        INSTANCE = p3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.RtbRequest", p3Var, 1);
        pluginGeneratedSerialDescriptor.addElement("sdk_user_agent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p3() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public r3 deserialize(Decoder decoder) {
        Object obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i10 = 1;
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (beginStructure.decodeSequentially()) {
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
        } else {
            int i11 = 0;
            obj = null;
            while (i10 != 0) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    i10 = 0;
                } else {
                    if (decodeElementIndex != 0) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, obj);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        beginStructure.endStructure(descriptor2);
        return new r3(i10, (String) obj, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, r3 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        r3.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
