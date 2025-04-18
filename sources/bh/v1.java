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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class v1 implements GeneratedSerializer {
    public static final v1 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        v1 v1Var = new v1();
        INSTANCE = v1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", v1Var, 6);
        pluginGeneratedSerialDescriptor.addElement("is_country_data_protected", false);
        pluginGeneratedSerialDescriptor.addElement("consent_title", false);
        pluginGeneratedSerialDescriptor.addElement("consent_message", false);
        pluginGeneratedSerialDescriptor.addElement("consent_message_version", false);
        pluginGeneratedSerialDescriptor.addElement("button_accept", false);
        pluginGeneratedSerialDescriptor.addElement("button_deny", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v1() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x004e. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public x1 deserialize(Decoder decoder) {
        String str;
        String str2;
        boolean z10;
        String str3;
        int i10;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 0);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 4);
            z10 = decodeBooleanElement;
            str = beginStructure.decodeStringElement(descriptor2, 5);
            str3 = decodeStringElement3;
            str2 = decodeStringElement4;
            str4 = decodeStringElement2;
            str5 = decodeStringElement;
            i10 = 63;
        } else {
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            boolean z11 = true;
            boolean z12 = false;
            int i11 = 0;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z11 = false;
                    case 0:
                        z12 = beginStructure.decodeBooleanElement(descriptor2, 0);
                        i11 |= 1;
                    case 1:
                        str10 = beginStructure.decodeStringElement(descriptor2, 1);
                        i11 |= 2;
                    case 2:
                        str9 = beginStructure.decodeStringElement(descriptor2, 2);
                        i11 |= 4;
                    case 3:
                        str7 = beginStructure.decodeStringElement(descriptor2, 3);
                        i11 |= 8;
                    case 4:
                        str8 = beginStructure.decodeStringElement(descriptor2, 4);
                        i11 |= 16;
                    case 5:
                        str6 = beginStructure.decodeStringElement(descriptor2, 5);
                        i11 |= 32;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str = str6;
            str2 = str8;
            z10 = z12;
            int i12 = i11;
            str3 = str7;
            i10 = i12;
            String str11 = str10;
            str4 = str9;
            str5 = str11;
        }
        beginStructure.endStructure(descriptor2);
        return new x1(i10, z10, str5, str4, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, x1 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        x1.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
