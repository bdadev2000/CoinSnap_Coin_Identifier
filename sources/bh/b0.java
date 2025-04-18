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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class b0 implements GeneratedSerializer {
    public static final b0 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        b0 b0Var = new b0();
        INSTANCE = b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AppNode", b0Var, 3);
        pluginGeneratedSerialDescriptor.addElement("bundle", false);
        pluginGeneratedSerialDescriptor.addElement("ver", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b0() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public d0 deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            str = decodeStringElement;
            str2 = beginStructure.decodeStringElement(descriptor2, 2);
            str3 = decodeStringElement2;
            i10 = 7;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    str4 = beginStructure.decodeStringElement(descriptor2, 0);
                    i11 |= 1;
                } else if (decodeElementIndex == 1) {
                    str6 = beginStructure.decodeStringElement(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str5 = beginStructure.decodeStringElement(descriptor2, 2);
                    i11 |= 4;
                }
            }
            str = str4;
            str2 = str5;
            str3 = str6;
            i10 = i11;
        }
        beginStructure.endStructure(descriptor2);
        return new d0(i10, str, str3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, d0 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        d0.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
