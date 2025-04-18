package bh;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class u0 implements GeneratedSerializer {
    public static final u0 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        u0 u0Var = new u0();
        INSTANCE = u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.GDPR", u0Var, 4);
        pluginGeneratedSerialDescriptor.addElement("consent_status", false);
        pluginGeneratedSerialDescriptor.addElement("consent_source", false);
        pluginGeneratedSerialDescriptor.addElement("consent_timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("consent_message_version", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u0() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, LongSerializer.INSTANCE, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public w0 deserialize(Decoder decoder) {
        String str;
        String str2;
        int i10;
        String str3;
        long j3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 2);
            str = decodeStringElement;
            str2 = beginStructure.decodeStringElement(descriptor2, 3);
            i10 = 15;
            str3 = decodeStringElement2;
            j3 = decodeLongElement;
        } else {
            String str4 = null;
            String str5 = null;
            boolean z10 = true;
            long j10 = 0;
            String str6 = null;
            int i11 = 0;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    str4 = beginStructure.decodeStringElement(descriptor2, 0);
                    i11 |= 1;
                } else if (decodeElementIndex == 1) {
                    str5 = beginStructure.decodeStringElement(descriptor2, 1);
                    i11 |= 2;
                } else if (decodeElementIndex == 2) {
                    j10 = beginStructure.decodeLongElement(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str6 = beginStructure.decodeStringElement(descriptor2, 3);
                    i11 |= 8;
                }
            }
            str = str4;
            str2 = str6;
            i10 = i11;
            str3 = str5;
            j3 = j10;
        }
        beginStructure.endStructure(descriptor2);
        return new w0(i10, str, str3, j3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, w0 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        w0.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
