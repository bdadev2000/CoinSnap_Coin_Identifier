package com.vungle.ads.internal.signals;

import bh.v3;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class a implements GeneratedSerializer {
    public static final a INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        a aVar = new a();
        INSTANCE = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SessionData", aVar, 7);
        pluginGeneratedSerialDescriptor.addElement("103", false);
        pluginGeneratedSerialDescriptor.addElement(StatisticData.ERROR_CODE_IO_ERROR, true);
        pluginGeneratedSerialDescriptor.addElement(StatisticData.ERROR_CODE_NOT_FOUND, true);
        pluginGeneratedSerialDescriptor.addElement("106", true);
        pluginGeneratedSerialDescriptor.addElement(MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE, true);
        pluginGeneratedSerialDescriptor.addElement("104", true);
        pluginGeneratedSerialDescriptor.addElement("105", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, StringSerializer.INSTANCE, longSerializer, new ArrayListSerializer(k.INSTANCE), longSerializer, intSerializer, new ArrayListSerializer(v3.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0065. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public c deserialize(Decoder decoder) {
        Object obj;
        int i10;
        int i11;
        Object obj2;
        int i12;
        String str;
        long j3;
        long j10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i13 = 2;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 0);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 1);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 2);
            obj2 = beginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(k.INSTANCE), null);
            long decodeLongElement2 = beginStructure.decodeLongElement(descriptor2, 4);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 5);
            obj = beginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(v3.INSTANCE), null);
            i10 = decodeIntElement2;
            j10 = decodeLongElement2;
            i11 = 127;
            j3 = decodeLongElement;
            i12 = decodeIntElement;
            str = decodeStringElement;
        } else {
            long j11 = 0;
            boolean z10 = true;
            int i14 = 0;
            int i15 = 0;
            String str2 = null;
            Object obj3 = null;
            long j12 = 0;
            Object obj4 = null;
            int i16 = 0;
            while (z10) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z10 = false;
                    case 0:
                        i15 |= 1;
                        i14 = beginStructure.decodeIntElement(descriptor2, 0);
                    case 1:
                        str2 = beginStructure.decodeStringElement(descriptor2, 1);
                        i15 |= 2;
                    case 2:
                        j12 = beginStructure.decodeLongElement(descriptor2, i13);
                        i15 |= 4;
                    case 3:
                        obj3 = beginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(k.INSTANCE), obj3);
                        i15 |= 8;
                        i13 = 2;
                    case 4:
                        j11 = beginStructure.decodeLongElement(descriptor2, 4);
                        i15 |= 16;
                        i13 = 2;
                    case 5:
                        i16 = beginStructure.decodeIntElement(descriptor2, 5);
                        i15 |= 32;
                        i13 = 2;
                    case 6:
                        obj4 = beginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(v3.INSTANCE), obj4);
                        i15 |= 64;
                        i13 = 2;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj4;
            i10 = i16;
            i11 = i15;
            obj2 = obj3;
            long j13 = j11;
            i12 = i14;
            str = str2;
            j3 = j12;
            j10 = j13;
        }
        beginStructure.endStructure(descriptor2);
        return new c(i11, i12, str, j3, (List) obj2, j10, i10, (List) obj, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, c value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        c.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
