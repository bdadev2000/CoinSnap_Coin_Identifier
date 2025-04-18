package kotlinx.serialization.json.internal;

import a4.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import vd.e;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u001a*\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a%\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0000¢\u0006\u0002\u0010\u0018\u001aE\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0014*\u00020\u001a2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00140\f2\u0006\u0010\u001b\u001a\u0002H\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001dH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"checkKind", "", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "throwSerializerNotFound", "", "type", "", "jsonTree", "Lkotlinx/serialization/json/JsonObject;", "validateIfSealed", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "actualSerializer", "", "classDiscriminator", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "json", "Lkotlinx/serialization/json/Json;", "decodeSerializableValuePolymorphic", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/json/JsonDecoder;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/json/JsonDecoder;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "encodePolymorphically", "Lkotlinx/serialization/json/JsonEncoder;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "ifPolymorphic", "Lkotlin/Function1;", "(Lkotlinx/serialization/json/JsonEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-json"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class PolymorphicKt {
    public static final void checkKind(SerialKind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (!(kind instanceof SerialKind.ENUM)) {
            if (!(kind instanceof PrimitiveKind)) {
                if (!(kind instanceof PolymorphicKind)) {
                    return;
                } else {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
                }
            }
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
    }

    public static final String classDiscriminator(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).get_discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    public static final <T> T decodeSerializableValuePolymorphic(JsonDecoder jsonDecoder, DeserializationStrategy<T> deserializer) {
        String str;
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(jsonDecoder, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if ((deserializer instanceof AbstractPolymorphicSerializer) && !jsonDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            String classDiscriminator = classDiscriminator(deserializer.getDescriptor(), jsonDecoder.getJson());
            JsonElement decodeJsonElement = jsonDecoder.decodeJsonElement();
            SerialDescriptor descriptor = deserializer.getDescriptor();
            if (decodeJsonElement instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) decodeJsonElement;
                JsonElement jsonElement = (JsonElement) jsonObject.get((Object) classDiscriminator);
                if (jsonElement != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                    str = jsonPrimitive.getContent();
                } else {
                    str = null;
                }
                DeserializationStrategy<? extends T> findPolymorphicSerializerOrNull = ((AbstractPolymorphicSerializer) deserializer).findPolymorphicSerializerOrNull(jsonDecoder, str);
                if (findPolymorphicSerializerOrNull != null) {
                    return (T) TreeJsonDecoderKt.readPolymorphicJson(jsonDecoder.getJson(), classDiscriminator, jsonObject, findPolymorphicSerializerOrNull);
                }
                throwSerializerNotFound(str, jsonObject);
                throw new KotlinNothingValueException();
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()));
        }
        return deserializer.deserialize(jsonDecoder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void encodePolymorphically(JsonEncoder jsonEncoder, SerializationStrategy<? super T> serializer, T t5, Function1<? super String, Unit> ifPolymorphic) {
        Intrinsics.checkNotNullParameter(jsonEncoder, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(ifPolymorphic, "ifPolymorphic");
        if ((serializer instanceof AbstractPolymorphicSerializer) && !jsonEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
            String classDiscriminator = classDiscriminator(serializer.getDescriptor(), jsonEncoder.getJson());
            Intrinsics.checkNotNull(t5, "null cannot be cast to non-null type kotlin.Any");
            SerializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, jsonEncoder, t5);
            validateIfSealed(abstractPolymorphicSerializer, findPolymorphicSerializer, classDiscriminator);
            checkKind(findPolymorphicSerializer.getDescriptor().getKind());
            ifPolymorphic.invoke(classDiscriminator);
            findPolymorphicSerializer.serialize(jsonEncoder, t5);
            return;
        }
        serializer.serialize(jsonEncoder, t5);
    }

    @JvmName(name = "throwSerializerNotFound")
    public static final Void throwSerializerNotFound(String str, JsonObject jsonTree) {
        String l10;
        Intrinsics.checkNotNullParameter(jsonTree, "jsonTree");
        if (str == null) {
            l10 = "missing class discriminator ('null')";
        } else {
            l10 = a.l("class discriminator '", str, '\'');
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, e.e("Polymorphic serializer was not found for ", l10), jsonTree.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateIfSealed(SerializationStrategy<?> serializationStrategy, SerializationStrategy<Object> serializationStrategy2, String str) {
        if (!(serializationStrategy instanceof SealedClassSerializer) || !JsonInternalDependenciesKt.jsonCachedSerialNames(serializationStrategy2.getDescriptor()).contains(str)) {
            return;
        }
        StringBuilder p10 = j.p("Sealed class '", serializationStrategy2.getDescriptor().getSerialName(), "' cannot be serialized as base class '", serializationStrategy.getDescriptor().getSerialName(), "' because it has property name that conflicts with JSON class discriminator '");
        p10.append(str);
        p10.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
        throw new IllegalStateException(p10.toString().toString());
    }
}
