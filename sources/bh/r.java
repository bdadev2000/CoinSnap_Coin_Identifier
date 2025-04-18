package bh;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonTransformingSerializer;

/* loaded from: classes4.dex */
public final class r extends JsonTransformingSerializer {
    public static final r INSTANCE = new r();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private r() {
        /*
            r2 = this;
            kotlin.jvm.internal.StringCompanionObject r0 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            kotlinx.serialization.KSerializer r1 = kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(r0)
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(r0)
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(r0)
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(r1, r0)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.r.<init>():void");
    }

    @Override // kotlinx.serialization.json.JsonTransformingSerializer
    public JsonElement transformDeserialize(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        JsonObject jsonObject = JsonElementKt.getJsonObject(element);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "moat")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new JsonObject(linkedHashMap);
    }
}
