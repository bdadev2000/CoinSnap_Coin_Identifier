package kotlinx.serialization.json.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\tH\u0016J \u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000eH\u0014J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\tH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "json", "Lkotlinx/serialization/json/Json;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlinx/serialization/json/JsonObject;", "polyDiscriminator", "", "polyDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "forceNull", "", "position", "", "getValue", "()Lkotlinx/serialization/json/JsonObject;", "absenceIsNull", "descriptor", "index", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "coerceInputValue", "tag", "currentElement", "Lkotlinx/serialization/json/JsonElement;", "decodeElementIndex", "decodeNotNullMark", "elementName", CampaignEx.JSON_KEY_DESC, "endStructure", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public class JsonTreeDecoder extends AbstractJsonTreeDecoder {
    private boolean forceNull;
    private final SerialDescriptor polyDescriptor;
    private final String polyDiscriminator;
    private int position;
    private final JsonObject value;

    public /* synthetic */ JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : serialDescriptor);
    }

    private final boolean absenceIsNull(SerialDescriptor descriptor, int index) {
        boolean z10;
        if (!getJson().getConfiguration().getExplicitNulls() && !descriptor.isElementOptional(index) && descriptor.getElementDescriptor(index).isNullable()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.forceNull = z10;
        return z10;
    }

    private final boolean coerceInputValue(SerialDescriptor descriptor, int index, String tag) {
        JsonPrimitive jsonPrimitive;
        Json json = getJson();
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
        if (!elementDescriptor.isNullable() && (currentElement(tag) instanceof JsonNull)) {
            return true;
        }
        if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
            JsonElement currentElement = currentElement(tag);
            String str = null;
            if (currentElement instanceof JsonPrimitive) {
                jsonPrimitive = (JsonPrimitive) currentElement;
            } else {
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null) {
                str = JsonElementKt.getContentOrNull(jsonPrimitive);
            }
            if (str != null && JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, str) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor == this.polyDescriptor) {
            return this;
        }
        return super.beginStructure(descriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement currentElement(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) MapsKt.getValue(getValue(), tag);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i10 = this.position;
            this.position = i10 + 1;
            String tag = getTag(descriptor, i10);
            int i11 = this.position - 1;
            this.forceNull = false;
            if (getValue().containsKey((Object) tag) || absenceIsNull(descriptor, i11)) {
                if (!this.configuration.getCoerceInputValues() || !coerceInputValue(descriptor, i11, tag)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !this.forceNull && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor desc, int index) {
        Object obj;
        boolean z10;
        Intrinsics.checkNotNullParameter(desc, "desc");
        String elementName = desc.getElementName(index);
        if (!this.configuration.getUseAlternativeNames()) {
            return elementName;
        }
        if (getValue().keySet().contains(elementName)) {
            return elementName;
        }
        Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).getOrPut(desc, JsonNamesMapKt.getJsonAlternativeNamesKey(), new JsonTreeDecoder$elementName$alternativeNamesMap$1(desc));
        Iterator<T> it = getValue().keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == index) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return elementName;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Set set;
        Set<String> plus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.configuration.getIgnoreUnknownKeys() && !(descriptor.getKind() instanceof PolymorphicKind)) {
            if (!this.configuration.getUseAlternativeNames()) {
                plus = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            } else {
                Set<String> jsonCachedSerialNames = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
                Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, JsonNamesMapKt.getJsonAlternativeNamesKey());
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = SetsKt.emptySet();
                }
                plus = SetsKt.plus((Set) jsonCachedSerialNames, (Iterable) set);
            }
            for (String str : getValue().keySet()) {
                if (!plus.contains(str) && !Intrinsics.areEqual(str, this.polyDiscriminator)) {
                    throw JsonExceptionsKt.UnknownKeyException(str, getValue().toString());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(Json json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.polyDiscriminator = str;
        this.polyDescriptor = serialDescriptor;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonObject getValue() {
        return this.value;
    }
}
