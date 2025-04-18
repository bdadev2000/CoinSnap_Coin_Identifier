package bh;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
public final class v3 implements GeneratedSerializer {
    public static final v3 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        v3 v3Var = new v3();
        INSTANCE = v3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.UnclosedAd", v3Var, 2);
        pluginGeneratedSerialDescriptor.addElement("107", false);
        pluginGeneratedSerialDescriptor.addElement(StatisticData.ERROR_CODE_IO_ERROR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v3() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public x3 deserialize(Decoder decoder) {
        String str;
        String str2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(descriptor2, 0);
            str2 = beginStructure.decodeStringElement(descriptor2, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            str = null;
            String str3 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    str = beginStructure.decodeStringElement(descriptor2, 0);
                    i11 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str3 = beginStructure.decodeStringElement(descriptor2, 1);
                    i11 |= 2;
                }
            }
            str2 = str3;
            i10 = i11;
        }
        beginStructure.endStructure(descriptor2);
        return new x3(i10, str, str2, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, x3 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        x3.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
