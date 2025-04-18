package bh;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final class k2 implements GeneratedSerializer {
    public static final k2 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        k2 k2Var = new k2();
        INSTANCE = k2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.Session", k2Var, 3);
        pluginGeneratedSerialDescriptor.addElement("enabled", false);
        pluginGeneratedSerialDescriptor.addElement("limit", false);
        pluginGeneratedSerialDescriptor.addElement("timeout", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k2() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public m2 deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            z10 = decodeBooleanElement;
            i10 = beginStructure.decodeIntElement(descriptor2, 2);
            i11 = decodeIntElement;
            i12 = 7;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    z12 = beginStructure.decodeBooleanElement(descriptor2, 0);
                    i15 |= 1;
                } else if (decodeElementIndex == 1) {
                    i14 = beginStructure.decodeIntElement(descriptor2, 1);
                    i15 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    i13 = beginStructure.decodeIntElement(descriptor2, 2);
                    i15 |= 4;
                }
            }
            z10 = z12;
            i10 = i13;
            i11 = i14;
            i12 = i15;
        }
        beginStructure.endStructure(descriptor2);
        return new m2(i12, z10, i11, i10, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, m2 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        m2.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
