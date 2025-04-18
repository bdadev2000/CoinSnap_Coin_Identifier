package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a8\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0081\b\u001a5\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00112\u0006\u0010\u0012\u001a\u0002H\u0001H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"decodeByReader", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/json/Json;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "reader", "Lkotlinx/serialization/json/internal/SerialReader;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/internal/SerialReader;)Ljava/lang/Object;", "decodeToSequenceByReader", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "encodeByWriter", "", "writer", "Lkotlinx/serialization/json/internal/JsonWriter;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/JsonWriter;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "kotlinx-serialization-json"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonStreamsKt {
    @PublishedApi
    public static final <T> T decodeByReader(Json json, DeserializationStrategy<T> deserializer, SerialReader reader) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(reader, "reader");
        ReaderJsonLexer readerJsonLexer = new ReaderJsonLexer(reader, null, 2, 0 == true ? 1 : 0);
        T t5 = (T) new StreamingJsonDecoder(json, WriteMode.OBJ, readerJsonLexer, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        readerJsonLexer.expectEof();
        return t5;
    }

    @PublishedApi
    @ExperimentalSerializationApi
    public static final <T> Sequence<T> decodeToSequenceByReader(Json json, SerialReader reader, DeserializationStrategy<T> deserializer, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(format, "format");
        final Iterator JsonIterator = JsonIteratorKt.JsonIterator(format, json, new ReaderJsonLexer(reader, null, 2, 0 == true ? 1 : 0), deserializer);
        return SequencesKt.constrainOnce(new Sequence<T>() { // from class: kotlinx.serialization.json.internal.JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return JsonIterator;
            }
        });
    }

    public static /* synthetic */ Sequence decodeToSequenceByReader$default(Json json, SerialReader serialReader, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequenceByReader(json, serialReader, deserializationStrategy, decodeSequenceMode);
    }

    @PublishedApi
    public static final <T> void encodeByWriter(Json json, JsonWriter writer, SerializationStrategy<? super T> serializer, T t5) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new StreamingJsonEncoder(writer, json, WriteMode.OBJ, new JsonEncoder[WriteMode.values().length]).encodeSerializableValue(serializer, t5);
    }

    public static /* synthetic */ Sequence decodeToSequenceByReader$default(Json json, SerialReader reader, DecodeSequenceMode format, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> serializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return decodeToSequenceByReader(json, reader, serializer, format);
    }

    @PublishedApi
    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> Sequence<T> decodeToSequenceByReader(Json json, SerialReader reader, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> serializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return decodeToSequenceByReader(json, reader, serializer, format);
    }
}
