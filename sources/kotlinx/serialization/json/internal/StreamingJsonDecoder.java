package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001MB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\nH\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010/\u001a\u00020\u0011H\u0016J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0011H\u0002J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0011H\u0002J\b\u00106\u001a\u00020\u001fH\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0002J;\u0010:\u001a\u0002H;\"\u0004\b\u0000\u0010;2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00112\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H;0=2\b\u0010>\u001a\u0004\u0018\u0001H;H\u0016¢\u0006\u0002\u0010?J!\u0010@\u001a\u0002H;\"\u0004\b\u0000\u0010;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H;0=H\u0016¢\u0006\u0002\u0010AJ\b\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020EH\u0002J\u0010\u0010G\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010H\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020EH\u0002J\u0010\u0010J\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010K\u001a\u00020\u001f*\u0004\u0018\u00010\f2\u0006\u0010L\u001a\u00020EH\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006N"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "json", "Lkotlinx/serialization/json/Json;", "mode", "Lkotlinx/serialization/json/internal/WriteMode;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "discriminatorHolder", "Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;)V", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "currentIndex", "", "elementMarker", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "getJson", "()Lkotlinx/serialization/json/Json;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "checkLeadingComma", "", "coerceInputValue", "", "index", "decodeBoolean", "decodeByte", "", "decodeChar", "", "decodeDouble", "", "decodeElementIndex", "decodeEnum", "enumDescriptor", "decodeFloat", "", "decodeInline", "Lkotlinx/serialization/encoding/Decoder;", "decodeInt", "decodeJsonElement", "Lkotlinx/serialization/json/JsonElement;", "decodeListIndex", "decodeLong", "", "decodeMapIndex", "decodeNotNullMark", "decodeNull", "", "decodeObjectIndex", "decodeSerializableElement", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "previousValue", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeShort", "", "decodeString", "", "decodeStringKey", "endStructure", "handleUnknown", "key", "skipLeftoverElements", "trySkip", "unknownKey", "DiscriminatorHolder", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder {
    private final JsonConfiguration configuration;
    private int currentIndex;
    private DiscriminatorHolder discriminatorHolder;
    private final JsonElementMarker elementMarker;
    private final Json json;

    @JvmField
    public final AbstractJsonLexer lexer;
    private final WriteMode mode;
    private final SerializersModule serializersModule;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "", "discriminatorToSkip", "", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DiscriminatorHolder {

        @JvmField
        public String discriminatorToSkip;

        public DiscriminatorHolder(String str) {
            this.discriminatorToSkip = str;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonDecoder(Json json, WriteMode mode, AbstractJsonLexer lexer, SerialDescriptor descriptor, DiscriminatorHolder discriminatorHolder) {
        JsonElementMarker jsonElementMarker;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = discriminatorHolder;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        if (configuration.getExplicitNulls()) {
            jsonElementMarker = null;
        } else {
            jsonElementMarker = new JsonElementMarker(descriptor);
        }
        this.elementMarker = jsonElementMarker;
    }

    private final void checkLeadingComma() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean coerceInputValue(SerialDescriptor descriptor, int index) {
        String peekString;
        Json json = this.json;
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
        if (!elementDescriptor.isNullable() && (!this.lexer.tryConsumeNotNull())) {
            return true;
        }
        if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || (peekString = this.lexer.peekString(this.configuration.getIsLenient())) == null || JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, peekString) != -3) {
            return false;
        }
        this.lexer.consumeString();
        return true;
    }

    private final int decodeListIndex() {
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        if (this.lexer.canConsumeValue()) {
            int i10 = this.currentIndex;
            if (i10 != -1 && !tryConsumeComma) {
                AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            int i11 = i10 + 1;
            this.currentIndex = i11;
            return i11;
        }
        if (!tryConsumeComma) {
            return -1;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected trailing comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int decodeMapIndex() {
        boolean z10;
        int i10 = this.currentIndex;
        boolean z11 = false;
        if (i10 % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 != -1) {
                z11 = this.lexer.tryConsumeComma();
            }
        } else {
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
        }
        if (this.lexer.canConsumeValue()) {
            if (z10) {
                if (this.currentIndex == -1) {
                    AbstractJsonLexer abstractJsonLexer = this.lexer;
                    boolean z12 = !z11;
                    int i11 = abstractJsonLexer.currentPosition;
                    if (!z12) {
                        AbstractJsonLexer.fail$default(abstractJsonLexer, "Unexpected trailing comma", i11, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                    int i12 = abstractJsonLexer2.currentPosition;
                    if (!z11) {
                        AbstractJsonLexer.fail$default(abstractJsonLexer2, "Expected comma after the key-value pair", i12, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            int i13 = this.currentIndex + 1;
            this.currentIndex = i13;
            return i13;
        }
        if (!z11) {
            return -1;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Expected '}', but had ',' instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int decodeObjectIndex(SerialDescriptor descriptor) {
        boolean z10;
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        while (this.lexer.canConsumeValue()) {
            String decodeStringKey = decodeStringKey();
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(descriptor, this.json, decodeStringKey);
            boolean z11 = false;
            if (jsonNameIndex != -3) {
                if (this.configuration.getCoerceInputValues() && coerceInputValue(descriptor, jsonNameIndex)) {
                    z10 = this.lexer.tryConsumeComma();
                } else {
                    JsonElementMarker jsonElementMarker = this.elementMarker;
                    if (jsonElementMarker != null) {
                        jsonElementMarker.mark$kotlinx_serialization_json(jsonNameIndex);
                    }
                    return jsonNameIndex;
                }
            } else {
                z11 = true;
                z10 = false;
            }
            if (z11) {
                tryConsumeComma = handleUnknown(decodeStringKey);
            } else {
                tryConsumeComma = z10;
            }
        }
        if (!tryConsumeComma) {
            JsonElementMarker jsonElementMarker2 = this.elementMarker;
            if (jsonElementMarker2 != null) {
                return jsonElementMarker2.nextUnmarkedIndex$kotlinx_serialization_json();
            }
            return -1;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected trailing comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String decodeStringKey() {
        if (this.configuration.getIsLenient()) {
            return this.lexer.consumeStringLenientNotNull();
        }
        return this.lexer.consumeKeyString();
    }

    private final boolean handleUnknown(String key) {
        if (!this.configuration.getIgnoreUnknownKeys() && !trySkip(this.discriminatorHolder, key)) {
            this.lexer.failOnUnknownKey(key);
        } else {
            this.lexer.skipElement(this.configuration.getIsLenient());
        }
        return this.lexer.tryConsumeComma();
    }

    private final void skipLeftoverElements(SerialDescriptor descriptor) {
        do {
        } while (decodeElementIndex(descriptor) != -1);
    }

    private final boolean trySkip(DiscriminatorHolder discriminatorHolder, String str) {
        if (discriminatorHolder == null || !Intrinsics.areEqual(discriminatorHolder.discriminatorToSkip, str)) {
            return false;
        }
        discriminatorHolder.discriminatorToSkip = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode switchMode = WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(switchMode.begin);
        checkLeadingComma();
        int i10 = WhenMappings.$EnumSwitchMapping$0[switchMode.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            if (this.mode == switchMode && this.json.getConfiguration().getExplicitNulls()) {
                return this;
            }
            return new StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.discriminatorHolder);
        }
        return new StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        if (this.configuration.getIsLenient()) {
            return this.lexer.consumeBooleanLenient();
        }
        return this.lexer.consumeBoolean();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b3 = (byte) consumeNumericLiteral;
        if (consumeNumericLiteral == b3) {
            return b3;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String consumeStringLenient = this.lexer.consumeStringLenient();
        if (consumeStringLenient.length() == 1) {
            return consumeStringLenient.charAt(0);
        }
        AbstractJsonLexer.fail$default(this.lexer, a.l("Expected single char, but got '", consumeStringLenient, '\''), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        boolean z10;
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            double parseDouble = Double.parseDouble(consumeStringLenient);
            if (!this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Double.valueOf(parseDouble));
                    throw new KotlinNothingValueException();
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, a.l("Failed to parse type 'double' for input '", consumeStringLenient, '\''), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        int decodeMapIndex;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i10 != 2) {
            if (i10 != 4) {
                decodeMapIndex = decodeListIndex();
            } else {
                decodeMapIndex = decodeObjectIndex(descriptor);
            }
        } else {
            decodeMapIndex = decodeMapIndex();
        }
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(decodeMapIndex);
        }
        return decodeMapIndex;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, decodeString(), " at path " + this.lexer.path.getPath());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        boolean z10;
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            float parseFloat = Float.parseFloat(consumeStringLenient);
            if (!this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Float.valueOf(parseFloat));
                    throw new KotlinNothingValueException();
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, a.l("Failed to parse type 'float' for input '", consumeStringLenient, '\''), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(descriptor)) {
            return new JsonDecoderForUnsignedTypes(this.lexer, this.json);
        }
        return super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i10 = (int) consumeNumericLiteral;
        if (consumeNumericLiteral == i10) {
            return i10;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse int for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return !(jsonElementMarker != null ? jsonElementMarker.getIsUnmarkedNull() : false) && this.lexer.tryConsumeNotNull();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(SerialDescriptor descriptor, int index, DeserializationStrategy<T> deserializer, T previousValue) {
        boolean z10;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (this.mode == WriteMode.MAP && (index & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.lexer.path.resetCurrentMapKey();
        }
        T t5 = (T) super.decodeSerializableElement(descriptor, index, deserializer, previousValue);
        if (z10) {
            this.lexer.path.updateCurrentMapKey(t5);
        }
        return t5;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<T> deserializer) {
        DeserializationStrategy<? extends T> deserializationStrategy;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractPolymorphicSerializer) && !this.json.getConfiguration().getUseArrayPolymorphism()) {
                String classDiscriminator = PolymorphicKt.classDiscriminator(deserializer.getDescriptor(), this.json);
                String consumeLeadingMatchingValue = this.lexer.consumeLeadingMatchingValue(classDiscriminator, this.configuration.getIsLenient());
                if (consumeLeadingMatchingValue != null) {
                    deserializationStrategy = ((AbstractPolymorphicSerializer) deserializer).findPolymorphicSerializerOrNull(this, consumeLeadingMatchingValue);
                } else {
                    deserializationStrategy = null;
                }
                if (deserializationStrategy == null) {
                    return (T) PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializer);
                }
                this.discriminatorHolder = new DiscriminatorHolder(classDiscriminator);
                return deserializationStrategy.deserialize(this);
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e2) {
            throw new MissingFieldException(e2.getMissingFields(), e2.getMessage() + " at path: " + this.lexer.path.getPath(), e2);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s5 = (short) consumeNumericLiteral;
        if (consumeNumericLiteral == s5) {
            return s5;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        if (this.configuration.getIsLenient()) {
            return this.lexer.consumeStringLenientNotNull();
        }
        return this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.json.getConfiguration().getIgnoreUnknownKeys() && descriptor.getElementsCount() == 0) {
            skipLeftoverElements(descriptor);
        }
        this.lexer.consumeNextToken(this.mode.end);
        this.lexer.path.popDescriptor();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
