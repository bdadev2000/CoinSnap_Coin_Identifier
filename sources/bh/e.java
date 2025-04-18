package bh;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes4.dex */
public final class e implements GeneratedSerializer {
    public static final e INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        e eVar = new e();
        INSTANCE = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.AdUnit", eVar, 26);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("adType", true);
        pluginGeneratedSerialDescriptor.addElement("adSource", true);
        pluginGeneratedSerialDescriptor.addElement("campaign", true);
        pluginGeneratedSerialDescriptor.addElement("expiry", true);
        pluginGeneratedSerialDescriptor.addElement(MBridgeConstans.APP_ID, true);
        pluginGeneratedSerialDescriptor.addElement("callToActionUrl", true);
        pluginGeneratedSerialDescriptor.addElement("deeplinkUrl", true);
        pluginGeneratedSerialDescriptor.addElement("click_coordinates_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("tpat", true);
        pluginGeneratedSerialDescriptor.addElement("templateURL", true);
        pluginGeneratedSerialDescriptor.addElement("templateId", true);
        pluginGeneratedSerialDescriptor.addElement("template_type", true);
        pluginGeneratedSerialDescriptor.addElement("templateSettings", true);
        pluginGeneratedSerialDescriptor.addElement("bid_token", true);
        pluginGeneratedSerialDescriptor.addElement("ad_market_id", true);
        pluginGeneratedSerialDescriptor.addElement("info", true);
        pluginGeneratedSerialDescriptor.addElement("sleep", true);
        pluginGeneratedSerialDescriptor.addElement("viewability", true);
        pluginGeneratedSerialDescriptor.addElement("adExt", true);
        pluginGeneratedSerialDescriptor.addElement("notification", true);
        pluginGeneratedSerialDescriptor.addElement("load_ad", true);
        pluginGeneratedSerialDescriptor.addElement(CampaignEx.JSON_KEY_TIMESTAMP, true);
        pluginGeneratedSerialDescriptor.addElement("showCloseIncentivized", true);
        pluginGeneratedSerialDescriptor.addElement("showClose", true);
        pluginGeneratedSerialDescriptor.addElement("error_code", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(r.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(o.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(s.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer)), BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer)), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x012c. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public g deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        int i10;
        Object obj26;
        Object obj27;
        int i11;
        Object obj28;
        Object obj29;
        Object obj30;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            obj23 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            obj19 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            obj20 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, intSerializer, null);
            Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            Object decodeNullableSerializableElement5 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            Object decodeNullableSerializableElement6 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, null);
            obj22 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, r.INSTANCE, null);
            Object decodeNullableSerializableElement7 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            obj18 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            obj17 = beginStructure.decodeNullableSerializableElement(descriptor2, 12, stringSerializer, null);
            Object decodeNullableSerializableElement8 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, o.INSTANCE, null);
            Object decodeNullableSerializableElement9 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, stringSerializer, null);
            obj16 = decodeNullableSerializableElement8;
            obj13 = beginStructure.decodeNullableSerializableElement(descriptor2, 15, stringSerializer, null);
            obj12 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, stringSerializer, null);
            obj11 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, intSerializer, null);
            obj24 = decodeNullableSerializableElement9;
            obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 18, s.INSTANCE, null);
            obj15 = beginStructure.decodeNullableSerializableElement(descriptor2, 19, stringSerializer, null);
            Object decodeNullableSerializableElement10 = beginStructure.decodeNullableSerializableElement(descriptor2, 20, new ArrayListSerializer(stringSerializer), null);
            Object decodeNullableSerializableElement11 = beginStructure.decodeNullableSerializableElement(descriptor2, 21, new ArrayListSerializer(stringSerializer), null);
            Object decodeNullableSerializableElement12 = beginStructure.decodeNullableSerializableElement(descriptor2, 22, intSerializer, null);
            obj6 = decodeNullableSerializableElement2;
            obj9 = decodeNullableSerializableElement6;
            i10 = 67108863;
            obj26 = decodeNullableSerializableElement7;
            obj8 = decodeNullableSerializableElement5;
            obj7 = decodeNullableSerializableElement4;
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 23, intSerializer, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 24, intSerializer, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 25, intSerializer, null);
            obj = decodeNullableSerializableElement10;
            obj5 = decodeNullableSerializableElement12;
            obj21 = decodeNullableSerializableElement3;
            obj25 = decodeNullableSerializableElement;
            obj14 = decodeNullableSerializableElement11;
        } else {
            boolean z10 = true;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            obj = null;
            obj2 = null;
            Object obj34 = null;
            Object obj35 = null;
            Object obj36 = null;
            Object obj37 = null;
            obj3 = null;
            obj4 = null;
            obj5 = null;
            Object obj38 = null;
            Object obj39 = null;
            Object obj40 = null;
            Object obj41 = null;
            Object obj42 = null;
            Object obj43 = null;
            Object obj44 = null;
            Object obj45 = null;
            Object obj46 = null;
            Object obj47 = null;
            Object obj48 = null;
            Object obj49 = null;
            Object obj50 = null;
            int i12 = 0;
            Object obj51 = null;
            while (z10) {
                Object obj52 = obj31;
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        obj28 = obj32;
                        obj29 = obj33;
                        obj30 = obj52;
                        z10 = false;
                        obj32 = obj28;
                        obj33 = obj29;
                        obj31 = obj30;
                    case 0:
                        obj38 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, obj38);
                        i12 |= 1;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj39 = obj39;
                    case 1:
                        obj39 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, obj39);
                        i12 |= 2;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj40 = obj40;
                    case 2:
                        obj40 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, obj40);
                        i12 |= 4;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj41 = obj41;
                    case 3:
                        obj41 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, obj41);
                        i12 |= 8;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj42 = obj42;
                    case 4:
                        obj42 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, IntSerializer.INSTANCE, obj42);
                        i12 |= 16;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj43 = obj43;
                    case 5:
                        obj43 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, obj43);
                        i12 |= 32;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj44 = obj44;
                    case 6:
                        obj44 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, obj44);
                        i12 |= 64;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj45 = obj45;
                    case 7:
                        obj45 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, obj45);
                        i12 |= 128;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj46 = obj46;
                    case 8:
                        obj46 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, obj46);
                        i12 |= NotificationCompat.FLAG_LOCAL_ONLY;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj47 = obj47;
                    case 9:
                        obj47 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, r.INSTANCE, obj47);
                        i12 |= 512;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj48 = obj48;
                    case 10:
                        obj48 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, obj48);
                        i12 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj49 = obj49;
                    case 11:
                        obj49 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, obj49);
                        i12 |= 2048;
                        obj32 = obj32;
                        obj33 = obj33;
                        obj31 = obj52;
                        obj50 = obj50;
                    case 12:
                        obj28 = obj32;
                        obj29 = obj33;
                        obj30 = obj52;
                        obj50 = beginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, obj50);
                        i12 |= 4096;
                        obj32 = obj28;
                        obj33 = obj29;
                        obj31 = obj30;
                    case 13:
                        obj31 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, o.INSTANCE, obj52);
                        i12 |= 8192;
                        obj32 = obj32;
                        obj33 = obj33;
                    case 14:
                        obj36 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, StringSerializer.INSTANCE, obj36);
                        i12 |= JsonLexerKt.BATCH_SIZE;
                        obj32 = obj32;
                        obj31 = obj52;
                    case 15:
                        obj27 = obj36;
                        obj37 = beginStructure.decodeNullableSerializableElement(descriptor2, 15, StringSerializer.INSTANCE, obj37);
                        i11 = 32768;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 16:
                        obj27 = obj36;
                        obj51 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, obj51);
                        i11 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 17:
                        obj27 = obj36;
                        obj35 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, IntSerializer.INSTANCE, obj35);
                        i11 = 131072;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 18:
                        obj27 = obj36;
                        obj34 = beginStructure.decodeNullableSerializableElement(descriptor2, 18, s.INSTANCE, obj34);
                        i11 = 262144;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 19:
                        obj27 = obj36;
                        obj33 = beginStructure.decodeNullableSerializableElement(descriptor2, 19, StringSerializer.INSTANCE, obj33);
                        i11 = 524288;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 20:
                        obj27 = obj36;
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 20, new ArrayListSerializer(StringSerializer.INSTANCE), obj);
                        i11 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 21:
                        obj27 = obj36;
                        obj32 = beginStructure.decodeNullableSerializableElement(descriptor2, 21, new ArrayListSerializer(StringSerializer.INSTANCE), obj32);
                        i11 = 2097152;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 22:
                        obj27 = obj36;
                        obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 22, IntSerializer.INSTANCE, obj5);
                        i11 = 4194304;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 23:
                        obj27 = obj36;
                        obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 23, IntSerializer.INSTANCE, obj4);
                        i11 = 8388608;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 24:
                        obj27 = obj36;
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 24, IntSerializer.INSTANCE, obj2);
                        i11 = 16777216;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    case 25:
                        obj27 = obj36;
                        obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 25, IntSerializer.INSTANCE, obj3);
                        i11 = 33554432;
                        i12 |= i11;
                        obj31 = obj52;
                        obj36 = obj27;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            Object obj53 = obj31;
            obj6 = obj42;
            obj7 = obj44;
            obj8 = obj45;
            obj9 = obj46;
            obj10 = obj34;
            obj11 = obj35;
            obj12 = obj51;
            obj13 = obj37;
            obj14 = obj32;
            obj15 = obj33;
            obj16 = obj53;
            obj17 = obj50;
            obj18 = obj49;
            obj19 = obj39;
            obj20 = obj40;
            obj21 = obj43;
            obj22 = obj47;
            obj23 = obj38;
            obj24 = obj36;
            obj25 = obj41;
            i10 = i12;
            obj26 = obj48;
        }
        beginStructure.endStructure(descriptor2);
        return new g(i10, (String) obj23, (String) obj19, (String) obj20, (String) obj25, (Integer) obj6, (String) obj21, (String) obj7, (String) obj8, (Boolean) obj9, (Map) obj22, (String) obj26, (String) obj18, (String) obj17, (q) obj16, (String) obj24, (String) obj13, (String) obj12, (Integer) obj11, (u) obj10, (String) obj15, (List) obj, (List) obj14, (Integer) obj5, (Integer) obj4, (Integer) obj2, (Integer) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, g value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        g.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
