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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class h1 implements GeneratedSerializer {
    public static final h1 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        h1 h1Var = new h1();
        INSTANCE = h1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigExtension", h1Var, 2);
        pluginGeneratedSerialDescriptor.addElement("need_refresh", true);
        pluginGeneratedSerialDescriptor.addElement("config_extension", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h1() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public j1 deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (beginStructure.decodeSequentially()) {
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, BooleanSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, null);
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
                    obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, BooleanSerializer.INSTANCE, obj);
                    i11 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, obj3);
                    i11 |= 2;
                }
            }
            obj2 = obj3;
            i10 = i11;
        }
        beginStructure.endStructure(descriptor2);
        return new j1(i10, (Boolean) obj, (String) obj2, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, j1 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        j1.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
