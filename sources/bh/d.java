package bh;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class d implements GeneratedSerializer {
    public static final d INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        d dVar = new d();
        INSTANCE = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload", dVar, 5);
        pluginGeneratedSerialDescriptor.addElement(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("mraidFiles", true);
        pluginGeneratedSerialDescriptor.addElement("incentivizedTextSettings", true);
        pluginGeneratedSerialDescriptor.addElement("assetsFullyDownloaded", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(new ArrayListSerializer(l.INSTANCE)), BuiltinSerializersKt.getNullable(h1.INSTANCE), new ContextualSerializer(orCreateKotlinClass, null, new KSerializer[]{stringSerializer, stringSerializer}), new LinkedHashMapSerializer(stringSerializer, stringSerializer), BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public z deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z10;
        int i10;
        Object obj4;
        Object obj5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i11 = 3;
        int i12 = 4;
        if (beginStructure.decodeSequentially()) {
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(l.INSTANCE), null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, h1.INSTANCE, null);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj2 = beginStructure.decodeSerializableElement(descriptor2, 2, new ContextualSerializer(orCreateKotlinClass, null, new KSerializer[]{stringSerializer, stringSerializer}), null);
            obj3 = beginStructure.decodeSerializableElement(descriptor2, 3, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            i10 = 31;
            z10 = beginStructure.decodeBooleanElement(descriptor2, 4);
        } else {
            boolean z11 = true;
            boolean z12 = false;
            int i13 = 0;
            obj = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z11 = false;
                } else if (decodeElementIndex != 0) {
                    if (decodeElementIndex == 1) {
                        obj5 = null;
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, h1.INSTANCE, obj8);
                        i13 |= 2;
                    } else if (decodeElementIndex == 2) {
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        obj5 = null;
                        obj6 = beginStructure.decodeSerializableElement(descriptor2, 2, new ContextualSerializer(orCreateKotlinClass2, null, new KSerializer[]{stringSerializer2, stringSerializer2}), obj6);
                        i13 |= 4;
                    } else if (decodeElementIndex == i11) {
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        obj7 = beginStructure.decodeSerializableElement(descriptor2, i11, new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), obj7);
                        i13 |= 8;
                    } else {
                        if (decodeElementIndex != i12) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        z12 = beginStructure.decodeBooleanElement(descriptor2, i12);
                        i13 |= 16;
                    }
                    i11 = 3;
                    i12 = 4;
                } else {
                    obj = beginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(l.INSTANCE), obj);
                    i13 |= 1;
                    i11 = 3;
                    i12 = 4;
                }
            }
            obj2 = obj6;
            obj3 = obj7;
            z10 = z12;
            i10 = i13;
            obj4 = obj8;
        }
        beginStructure.endStructure(descriptor2);
        return new z(i10, (List) obj, (j1) obj4, (ConcurrentHashMap) obj2, (Map) obj3, z10, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, z value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        z.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
