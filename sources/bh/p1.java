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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class p1 implements GeneratedSerializer {
    public static final p1 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        p1 p1Var = new p1();
        INSTANCE = p1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.CrashReportSettings", p1Var, 3);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("max_send_amount", false);
        pluginGeneratedSerialDescriptor.addElement("collect_filter", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p1() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public r1 deserialize(Decoder decoder) {
        boolean z10;
        String str;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            z10 = decodeBooleanElement;
            str = beginStructure.decodeStringElement(descriptor2, 2);
            i10 = decodeIntElement;
            i11 = 7;
        } else {
            String str2 = null;
            boolean z11 = true;
            boolean z12 = false;
            int i12 = 0;
            int i13 = 0;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex == 0) {
                    z12 = beginStructure.decodeBooleanElement(descriptor2, 0);
                    i13 |= 1;
                } else if (decodeElementIndex == 1) {
                    i12 = beginStructure.decodeIntElement(descriptor2, 1);
                    i13 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str2 = beginStructure.decodeStringElement(descriptor2, 2);
                    i13 |= 4;
                }
            }
            z10 = z12;
            str = str2;
            i10 = i12;
            i11 = i13;
        }
        beginStructure.endStructure(descriptor2);
        return new r1(i11, z10, i10, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, r1 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        r1.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
