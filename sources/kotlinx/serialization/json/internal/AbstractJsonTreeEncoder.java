package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0014J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016J)\u0010\u001f\u001a\u00020\b\"\u0004\b\u0000\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\"2\u0006\u0010#\u001a\u0002H H\u0016¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020'H\u0014J\u0018\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020)H\u0014J\u0018\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020+H\u0014J\u0018\u0010,\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020-H\u0014J \u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u000201H\u0014J\u0018\u00102\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u000203H\u0014J\u0018\u00104\u001a\u0002052\u0006\u0010&\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u0017H\u0015J\u0018\u00107\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u000201H\u0014J\u0018\u00108\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u000209H\u0014J\u0010\u0010:\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000fH\u0014J\u0018\u0010;\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020<H\u0014J\u0018\u0010=\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0014J\u0018\u0010>\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020?H\u0014J\u0010\u0010@\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010A\u001a\u00020\u0007H&J\u0018\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0007H&J\u0018\u0010D\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010E\u001a\u000201H\u0016R\u0010\u0010\n\u001a\u00020\u000b8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003FGH¨\u0006I"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "getJson", "()Lkotlinx/serialization/json/Json;", "polymorphicDiscriminator", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "composeName", "parentName", "childName", "encodeJsonElement", "element", "encodeNotNullMark", "encodeNull", "encodeSerializableValue", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "serializer", "Lkotlinx/serialization/SerializationStrategy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeTaggedBoolean", "tag", "", "encodeTaggedByte", "", "encodeTaggedChar", "", "encodeTaggedDouble", "", "encodeTaggedEnum", "enumDescriptor", "ordinal", "", "encodeTaggedFloat", "", "encodeTaggedInline", "Lkotlinx/serialization/encoding/Encoder;", "inlineDescriptor", "encodeTaggedInt", "encodeTaggedLong", "", "encodeTaggedNull", "encodeTaggedShort", "", "encodeTaggedString", "encodeTaggedValue", "", "endEncode", "getCurrent", "putElement", "key", "shouldEncodeElementDefault", "index", "Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes5.dex */
public abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {

    @JvmField
    protected final JsonConfiguration configuration;
    private final Json json;
    private final Function1<JsonElement, Unit> nodeConsumer;
    private String polymorphicDiscriminator;

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        Function1<JsonElement, Unit> function1;
        boolean z10;
        AbstractJsonTreeEncoder jsonTreeEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (getCurrentTagOrNull() == null) {
            function1 = this.nodeConsumer;
        } else {
            function1 = new Function1<JsonElement, Unit>() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$beginStructure$consumer$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(JsonElement jsonElement) {
                    invoke2(jsonElement);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(JsonElement node) {
                    String currentTag;
                    Intrinsics.checkNotNullParameter(node, "node");
                    AbstractJsonTreeEncoder abstractJsonTreeEncoder = AbstractJsonTreeEncoder.this;
                    currentTag = abstractJsonTreeEncoder.getCurrentTag();
                    abstractJsonTreeEncoder.putElement(currentTag, node);
                }
            };
        }
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE)) {
            z10 = true;
        } else {
            z10 = kind instanceof PolymorphicKind;
        }
        if (z10) {
            jsonTreeEncoder = new JsonTreeListEncoder(this.json, function1);
        } else if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json = this.json;
            SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
            SerialKind kind2 = carrierDescriptor.getKind();
            if (!(kind2 instanceof PrimitiveKind) && !Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
                if (json.getConfiguration().getAllowStructuredMapKeys()) {
                    jsonTreeEncoder = new JsonTreeListEncoder(this.json, function1);
                } else {
                    throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
                }
            } else {
                jsonTreeEncoder = new JsonTreeMapEncoder(this.json, function1);
            }
        } else {
            jsonTreeEncoder = new JsonTreeEncoder(this.json, function1);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            jsonTreeEncoder.putElement(str, JsonElementKt.JsonPrimitive(descriptor.getSerialName()));
            this.polymorphicDiscriminator = null;
        }
        return jsonTreeEncoder;
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public String composeName(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(currentTagOrNull);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializer, T value) {
        boolean requiresTopLevelTag;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (getCurrentTagOrNull() == null) {
            requiresTopLevelTag = TreeJsonEncoderKt.getRequiresTopLevelTag(WriteModeKt.carrierDescriptor(serializer.getDescriptor(), getSerializersModule()));
            if (requiresTopLevelTag) {
                JsonPrimitiveEncoder jsonPrimitiveEncoder = new JsonPrimitiveEncoder(this.json, this.nodeConsumer);
                jsonPrimitiveEncoder.encodeSerializableValue(serializer, value);
                jsonPrimitiveEncoder.endEncode(serializer.getDescriptor());
                return;
            }
        }
        if ((serializer instanceof AbstractPolymorphicSerializer) && !getJson().getConfiguration().getUseArrayPolymorphism()) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
            String classDiscriminator = PolymorphicKt.classDiscriminator(serializer.getDescriptor(), getJson());
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
            SerializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, this, value);
            PolymorphicKt.validateIfSealed(abstractPolymorphicSerializer, findPolymorphicSerializer, classDiscriminator);
            PolymorphicKt.checkKind(findPolymorphicSerializer.getDescriptor().getKind());
            this.polymorphicDiscriminator = classDiscriminator;
            findPolymorphicSerializer.serialize(this, value);
            return;
        }
        serializer.serialize(this, value);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void endEncode(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.nodeConsumer.invoke(getCurrent());
    }

    public abstract JsonElement getCurrent();

    @Override // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final SerializersModule getSerializersModule() {
        return this.json.getSerializersModule();
    }

    public abstract void putElement(String key, JsonElement element);

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractJsonTreeEncoder(Json json, Function1<? super JsonElement, Unit> function1) {
        this.json = json;
        this.nodeConsumer = function1;
        this.configuration = json.getConfiguration();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedBoolean(String tag, boolean value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Boolean.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedByte(String tag, byte value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Byte.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedChar(String tag, char value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(String.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedDouble(String tag, double value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Double.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Double.isInfinite(value) || Double.isNaN(value)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(value), tag, getCurrent().toString());
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedEnum(String tag, SerialDescriptor enumDescriptor, int ordinal) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        putElement(tag, JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(ordinal)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedFloat(String tag, float value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Float.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Float.isInfinite(value) || Float.isNaN(value)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(value), tag, getCurrent().toString());
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    @SuppressAnimalSniffer
    public Encoder encodeTaggedInline(final String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$encodeTaggedInline$1
            private final SerializersModule serializersModule;

            {
                this.serializersModule = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte value) {
                putUnquotedString(UByte.m207toStringimpl(UByte.m163constructorimpl(value)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int value) {
                putUnquotedString(Long.toString(UInt.m240constructorimpl(value) & 4294967295L, 10));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long value) {
                String str;
                long m319constructorimpl = ULong.m319constructorimpl(value);
                if (m319constructorimpl == 0) {
                    str = "0";
                } else if (m319constructorimpl > 0) {
                    str = Long.toString(m319constructorimpl, 10);
                } else {
                    char[] cArr = new char[64];
                    long j3 = (m319constructorimpl >>> 1) / 5;
                    long j10 = 10;
                    int i10 = 63;
                    cArr[63] = Character.forDigit((int) (m319constructorimpl - (j3 * j10)), 10);
                    while (j3 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j3 % j10), 10);
                        j3 /= j10;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
                putUnquotedString(str);
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short value) {
                putUnquotedString(UShort.m470toStringimpl(UShort.m426constructorimpl(value)));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public SerializersModule getSerializersModule() {
                return this.serializersModule;
            }

            public final void putUnquotedString(String s5) {
                Intrinsics.checkNotNullParameter(s5, "s");
                AbstractJsonTreeEncoder.this.putElement(tag, new JsonLiteral(s5, false));
            }
        } : super.encodeTaggedInline((AbstractJsonTreeEncoder) tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedInt(String tag, int value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Integer.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedLong(String tag, long value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Long.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedNull(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonNull.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedShort(String tag, short value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Short.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedString(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedValue(String tag, Object value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value.toString()));
    }
}
