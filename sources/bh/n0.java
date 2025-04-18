package bh;

import androidx.core.app.NotificationCompat;
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
public final class n0 implements GeneratedSerializer {
    public static final n0 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        n0 n0Var = new n0();
        INSTANCE = n0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.CCPA", n0Var, 1);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n0() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public p0 deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i10 = 1;
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(descriptor2, 0);
        } else {
            int i11 = 0;
            str = null;
            while (i10 != 0) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    i10 = 0;
                } else {
                    if (decodeElementIndex != 0) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str = beginStructure.decodeStringElement(descriptor2, 0);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        beginStructure.endStructure(descriptor2);
        return new p0(i10, str, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, p0 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        p0.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
