package androidx.compose.runtime.saveable;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
final class MapSaverKt$mapSaver$2 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 != 0) {
            throw new IllegalStateException("non-zero remainder".toString());
        }
        for (int i2 = 0; i2 < list.size(); i2 += 2) {
            Object obj2 = list.get(i2);
            a.q(obj2, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj2, list.get(i2 + 1));
        }
        throw null;
    }
}
