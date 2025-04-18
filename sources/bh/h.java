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
public final class h implements GeneratedSerializer {
    public static final h INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        h hVar = new h();
        INSTANCE = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", hVar, 3);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("extension", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public j deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        Object obj3 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, null);
            obj3 = decodeNullableSerializableElement;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj4 = null;
            Object obj5 = null;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, obj3);
                    i11 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, obj4);
                    i11 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, obj5);
                    i11 |= 4;
                }
            }
            i10 = i11;
            obj = obj4;
            obj2 = obj5;
        }
        beginStructure.endStructure(descriptor2);
        return new j(i10, (String) obj3, (String) obj, (Boolean) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, j value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        j.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
