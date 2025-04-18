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
public final class d1 implements GeneratedSerializer {
    public static final d1 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        d1 d1Var = new d1();
        INSTANCE = d1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.User", d1Var, 3);
        pluginGeneratedSerialDescriptor.addElement("gdpr", true);
        pluginGeneratedSerialDescriptor.addElement("ccpa", true);
        pluginGeneratedSerialDescriptor.addElement("coppa", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d1() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(u0.INSTANCE), BuiltinSerializersKt.getNullable(n0.INSTANCE), BuiltinSerializersKt.getNullable(q0.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public f1 deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i10;
        Object obj3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        Object obj4 = null;
        if (beginStructure.decodeSequentially()) {
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, u0.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, n0.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, q0.INSTANCE, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj5 = null;
            Object obj6 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, u0.INSTANCE, obj4);
                    i11 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, n0.INSTANCE, obj5);
                    i11 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, q0.INSTANCE, obj6);
                    i11 |= 4;
                }
            }
            obj = obj5;
            obj2 = obj6;
            Object obj7 = obj4;
            i10 = i11;
            obj3 = obj7;
        }
        beginStructure.endStructure(descriptor2);
        return new f1(i10, (w0) obj3, (p0) obj, (s0) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, f1 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        f1.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
