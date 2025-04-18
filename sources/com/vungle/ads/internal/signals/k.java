package com.vungle.ads.internal.signals;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class k implements GeneratedSerializer {
    public static final k INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        k kVar = new k();
        INSTANCE = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SignaledAd", kVar, 5);
        pluginGeneratedSerialDescriptor.addElement("500", true);
        pluginGeneratedSerialDescriptor.addElement("109", false);
        pluginGeneratedSerialDescriptor.addElement("107", true);
        pluginGeneratedSerialDescriptor.addElement("110", true);
        pluginGeneratedSerialDescriptor.addElement("108", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), longSerializer, IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public m deserialize(Decoder decoder) {
        long j3;
        int i10;
        Object obj;
        long j10;
        int i11;
        Object obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i12 = 3;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 1);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            long decodeLongElement2 = beginStructure.decodeLongElement(descriptor2, 3);
            i10 = 31;
            i11 = beginStructure.decodeIntElement(descriptor2, 4);
            obj = decodeNullableSerializableElement;
            j10 = decodeLongElement;
            j3 = decodeLongElement2;
        } else {
            j3 = 0;
            boolean z10 = true;
            int i13 = 0;
            Object obj3 = null;
            Object obj4 = null;
            long j11 = 0;
            int i14 = 0;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z10 = false;
                } else if (decodeElementIndex == 0) {
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, obj3);
                    i14 |= 1;
                } else if (decodeElementIndex == 1) {
                    j11 = beginStructure.decodeLongElement(descriptor2, 1);
                    i14 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, obj4);
                    i14 |= 4;
                } else if (decodeElementIndex == i12) {
                    j3 = beginStructure.decodeLongElement(descriptor2, i12);
                    i14 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    i13 = beginStructure.decodeIntElement(descriptor2, 4);
                    i14 |= 16;
                }
                i12 = 3;
            }
            i10 = i14;
            obj = obj3;
            j10 = j11;
            i11 = i13;
            obj2 = obj4;
        }
        beginStructure.endStructure(descriptor2);
        return new m(i10, (String) obj, j10, (String) obj2, j3, i11, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, m value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        m.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
