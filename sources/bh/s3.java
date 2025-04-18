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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class s3 implements GeneratedSerializer {
    public static final s3 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        s3 s3Var = new s3();
        INSTANCE = s3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.RtbToken", s3Var, 5);
        pluginGeneratedSerialDescriptor.addElement("device", false);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        pluginGeneratedSerialDescriptor.addElement(com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA, true);
        pluginGeneratedSerialDescriptor.addElement("ordinal_view", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s3() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{u2.INSTANCE, BuiltinSerializersKt.getNullable(d1.INSTANCE), BuiltinSerializersKt.getNullable(x0.INSTANCE), BuiltinSerializersKt.getNullable(p3.INSTANCE), IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public u3 deserialize(Decoder decoder) {
        Object obj;
        int i10;
        Object obj2;
        Object obj3;
        int i11;
        Object obj4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            obj4 = beginStructure.decodeSerializableElement(descriptor2, 0, u2.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, d1.INSTANCE, null);
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 2, x0.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, p3.INSTANCE, null);
            i11 = beginStructure.decodeIntElement(descriptor2, 4);
            obj = decodeNullableSerializableElement;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object obj5 = null;
            Object obj6 = null;
            obj = null;
            Object obj7 = null;
            int i13 = 0;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    obj5 = beginStructure.decodeSerializableElement(descriptor2, 0, u2.INSTANCE, obj5);
                    i13 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, d1.INSTANCE, obj6);
                    i13 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj = beginStructure.decodeNullableSerializableElement(descriptor2, 2, x0.INSTANCE, obj);
                    i13 |= 4;
                } else if (decodeElementIndex == 3) {
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, p3.INSTANCE, obj7);
                    i13 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    i12 = beginStructure.decodeIntElement(descriptor2, 4);
                    i13 |= 16;
                }
            }
            i10 = i13;
            obj2 = obj6;
            obj3 = obj7;
            i11 = i12;
            obj4 = obj5;
        }
        beginStructure.endStructure(descriptor2);
        return new u3(i10, (i3) obj4, (f1) obj2, (z0) obj, (r3) obj3, i11, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, u3 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        u3.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
