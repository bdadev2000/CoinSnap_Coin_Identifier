package bh;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class m3 implements GeneratedSerializer {
    public static final m3 INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        m3 m3Var = new m3();
        INSTANCE = m3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.Placement", m3Var, 10);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("reference_id", false);
        pluginGeneratedSerialDescriptor.addElement("is_incentivized", true);
        pluginGeneratedSerialDescriptor.addElement("supported_template_types", true);
        pluginGeneratedSerialDescriptor.addElement("supported_ad_formats", true);
        pluginGeneratedSerialDescriptor.addElement("ad_refresh_duration", true);
        pluginGeneratedSerialDescriptor.addElement("header_bidding", true);
        pluginGeneratedSerialDescriptor.addElement("ad_size", true);
        pluginGeneratedSerialDescriptor.addElement("isIncentivized", true);
        pluginGeneratedSerialDescriptor.addElement("placementAdType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m3() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), IntSerializer.INSTANCE, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, stringSerializer};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x007e. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public o3 deserialize(Decoder decoder) {
        String str;
        boolean z10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z11;
        int i10;
        String str2;
        int i11;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i12 = 9;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj3 = beginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(stringSerializer), null);
            obj2 = beginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(stringSerializer), null);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 5);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 6);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 8);
            str = beginStructure.decodeStringElement(descriptor2, 9);
            z10 = decodeBooleanElement;
            i11 = decodeIntElement;
            z11 = decodeBooleanElement2;
            str3 = decodeStringElement2;
            i10 = 1023;
            str2 = decodeStringElement;
        } else {
            boolean z12 = true;
            boolean z13 = false;
            boolean z14 = false;
            int i13 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str4 = null;
            String str5 = null;
            str = null;
            Object obj8 = null;
            int i14 = 0;
            while (z12) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z12 = false;
                        i12 = 9;
                    case 0:
                        str4 = beginStructure.decodeStringElement(descriptor2, 0);
                        i13 |= 1;
                        i12 = 9;
                    case 1:
                        str5 = beginStructure.decodeStringElement(descriptor2, 1);
                        i13 |= 2;
                        i12 = 9;
                    case 2:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, obj8);
                        i13 |= 4;
                        i12 = 9;
                    case 3:
                        obj7 = beginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(StringSerializer.INSTANCE), obj7);
                        i13 |= 8;
                        i12 = 9;
                    case 4:
                        obj6 = beginStructure.decodeSerializableElement(descriptor2, 4, new ArrayListSerializer(StringSerializer.INSTANCE), obj6);
                        i13 |= 16;
                        i12 = 9;
                    case 5:
                        i14 = beginStructure.decodeIntElement(descriptor2, 5);
                        i13 |= 32;
                    case 6:
                        z13 = beginStructure.decodeBooleanElement(descriptor2, 6);
                        i13 |= 64;
                    case 7:
                        obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, obj5);
                        i13 |= 128;
                    case 8:
                        z14 = beginStructure.decodeBooleanElement(descriptor2, 8);
                        i13 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    case 9:
                        str = beginStructure.decodeStringElement(descriptor2, i12);
                        i13 |= 512;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            z10 = z13;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            z11 = z14;
            i10 = i13;
            str2 = str4;
            String str6 = str5;
            i11 = i14;
            str3 = str6;
        }
        beginStructure.endStructure(descriptor2);
        return new o3(i10, str2, str3, (Boolean) obj4, (List) obj3, (List) obj2, i11, z10, (String) obj, z11, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, o3 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        o3.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
