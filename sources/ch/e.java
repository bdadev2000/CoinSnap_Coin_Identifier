package ch;

import java.io.IOException;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import wh.y0;

/* loaded from: classes4.dex */
public final class e implements a {
    public static final d Companion = new d(null);
    private static final Json json = JsonKt.Json$default(null, c.INSTANCE, 1, null);
    private final KType kType;

    public e(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "kType");
        this.kType = kType;
    }

    @Override // ch.a
    public Object convert(y0 y0Var) throws IOException {
        if (y0Var != null) {
            try {
                String string = y0Var.string();
                if (string != null) {
                    Object decodeFromString = json.decodeFromString(SerializersKt.serializer(Json.INSTANCE.getSerializersModule(), this.kType), string);
                    CloseableKt.closeFinally(y0Var, null);
                    return decodeFromString;
                }
            } finally {
            }
        }
        CloseableKt.closeFinally(y0Var, null);
        return null;
    }
}
