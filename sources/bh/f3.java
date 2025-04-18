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
public final class f3 implements GeneratedSerializer {
    public static final f3 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        f3 f3Var = new f3();
        INSTANCE = f3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.VungleExt", f3Var, 2);
        pluginGeneratedSerialDescriptor.addElement("android", true);
        pluginGeneratedSerialDescriptor.addElement("amazon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f3() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        v2 v2Var = v2.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(v2Var), BuiltinSerializersKt.getNullable(v2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public h3 deserialize(Decoder decoder) {
        Object obj;
        int i10;
        Object obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (beginStructure.decodeSequentially()) {
            v2 v2Var = v2.INSTANCE;
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, v2Var, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, v2Var, null);
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
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, v2.INSTANCE, obj3);
                    i11 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, v2.INSTANCE, obj);
                    i11 |= 2;
                }
            }
            i10 = i11;
            obj2 = obj3;
        }
        beginStructure.endStructure(descriptor2);
        return new h3(i10, (x2) obj2, (x2) obj, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, h3 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        h3.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
