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
public final class l implements GeneratedSerializer {
    public static final l INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        l lVar = new l();
        INSTANCE = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", lVar, 2);
        pluginGeneratedSerialDescriptor.addElement("placement_reference_id", true);
        pluginGeneratedSerialDescriptor.addElement("ad_markup", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(e.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public n deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (beginStructure.decodeSequentially()) {
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, e.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            obj = null;
            Object obj3 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, obj);
                    i11 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, e.INSTANCE, obj3);
                    i11 |= 2;
                }
            }
            obj2 = obj3;
            i10 = i11;
        }
        beginStructure.endStructure(descriptor2);
        return new n(i10, (String) obj, (g) obj2, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, n value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        n.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
