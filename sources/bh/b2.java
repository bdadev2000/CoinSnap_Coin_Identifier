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
public final class b2 implements GeneratedSerializer {
    public static final b2 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        b2 b2Var = new b2();
        INSTANCE = b2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings", b2Var, 2);
        pluginGeneratedSerialDescriptor.addElement("error_log_level", false);
        pluginGeneratedSerialDescriptor.addElement("metrics_is_enabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b2() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{IntSerializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public d2 deserialize(Decoder decoder) {
        int i10;
        boolean z10;
        int i11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            i10 = beginStructure.decodeIntElement(descriptor2, 0);
            z10 = beginStructure.decodeBooleanElement(descriptor2, 1);
            i11 = 3;
        } else {
            boolean z11 = true;
            i10 = 0;
            boolean z12 = false;
            int i12 = 0;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    i10 = beginStructure.decodeIntElement(descriptor2, 0);
                    i12 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    z12 = beginStructure.decodeBooleanElement(descriptor2, 1);
                    i12 |= 2;
                }
            }
            z10 = z12;
            i11 = i12;
        }
        beginStructure.endStructure(descriptor2);
        return new d2(i11, i10, z10, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, d2 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        d2.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
