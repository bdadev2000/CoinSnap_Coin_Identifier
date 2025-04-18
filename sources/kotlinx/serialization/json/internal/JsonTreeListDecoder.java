package kotlinx.serialization.json.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "json", "Lkotlinx/serialization/json/Json;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlinx/serialization/json/JsonArray;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonArray;)V", "currentIndex", "", "size", "getValue", "()Lkotlinx/serialization/json/JsonArray;", "currentElement", "Lkotlinx/serialization/json/JsonElement;", "tag", "", "decodeElementIndex", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementName", CampaignEx.JSON_KEY_DESC, "index", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonTreeListDecoder extends AbstractJsonTreeDecoder {
    private int currentIndex;
    private final int size;
    private final JsonArray value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeListDecoder(Json json, JsonArray value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.size = getValue().size();
        this.currentIndex = -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement currentElement(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return getValue().get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = this.currentIndex;
        if (i10 < this.size - 1) {
            int i11 = i10 + 1;
            this.currentIndex = i11;
            return i11;
        }
        return -1;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor desc, int index) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return String.valueOf(index);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonArray getValue() {
        return this.value;
    }
}
