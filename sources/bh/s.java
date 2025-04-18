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

/* loaded from: classes4.dex */
public final class s implements GeneratedSerializer {
    public static final s INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        s sVar = new s();
        INSTANCE = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.Viewability", sVar, 1);
        pluginGeneratedSerialDescriptor.addElement("om", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(v.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public u deserialize(Decoder decoder) {
        Object obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i10 = 1;
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (beginStructure.decodeSequentially()) {
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, v.INSTANCE, null);
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
                    obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, v.INSTANCE, obj);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        beginStructure.endStructure(descriptor2);
        return new u(i10, (x) obj, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, u value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        u.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
