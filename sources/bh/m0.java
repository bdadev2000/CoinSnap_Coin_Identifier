package bh;

import com.mbridge.msdk.MBridgeConstans;
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
public final class m0 implements GeneratedSerializer {
    public static final m0 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        m0 m0Var = new m0();
        INSTANCE = m0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody", m0Var, 5);
        pluginGeneratedSerialDescriptor.addElement("device", false);
        pluginGeneratedSerialDescriptor.addElement(MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        pluginGeneratedSerialDescriptor.addElement(com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m0() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{u2.INSTANCE, BuiltinSerializersKt.getNullable(b0.INSTANCE), BuiltinSerializersKt.getNullable(d1.INSTANCE), BuiltinSerializersKt.getNullable(x0.INSTANCE), BuiltinSerializersKt.getNullable(a1.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public g1 deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i10;
        Object obj5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        Object obj6 = null;
        if (beginStructure.decodeSequentially()) {
            obj5 = beginStructure.decodeSerializableElement(descriptor2, 0, u2.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, b0.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, d1.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, x0.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, a1.INSTANCE, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    obj6 = beginStructure.decodeSerializableElement(descriptor2, 0, u2.INSTANCE, obj6);
                    i11 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, b0.INSTANCE, obj7);
                    i11 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, d1.INSTANCE, obj8);
                    i11 |= 4;
                } else if (decodeElementIndex == 3) {
                    obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, x0.INSTANCE, obj9);
                    i11 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, a1.INSTANCE, obj10);
                    i11 |= 16;
                }
            }
            obj = obj7;
            obj2 = obj8;
            obj3 = obj9;
            obj4 = obj10;
            Object obj11 = obj6;
            i10 = i11;
            obj5 = obj11;
        }
        beginStructure.endStructure(descriptor2);
        return new g1(i10, (i3) obj5, (d0) obj, (f1) obj2, (z0) obj3, (c1) obj4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, g1 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        g1.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
