package androidx.datastore.preferences.protobuf;

import androidx.compose.foundation.text.input.a;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MapFieldSchemaLite implements MapFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.f19290a) {
                mapFieldLite = mapFieldLite.d();
            }
            mapFieldLite.c();
            if (!mapFieldLite2.isEmpty()) {
                mapFieldLite.putAll(mapFieldLite2);
            }
        }
        return mapFieldLite;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapEntryLite.Metadata b(Object obj) {
        return ((MapEntryLite) obj).f19282a;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite c(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite d(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object e(Object obj) {
        ((MapFieldLite) obj).f19290a = false;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite f() {
        return MapFieldLite.f19289b.d();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final int g(int i2, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int i3 = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                mapEntryLite.getClass();
                int k02 = CodedOutputStream.k0(i2);
                int a2 = MapEntryLite.a(mapEntryLite.f19282a, key, value);
                i3 = a.D(a2, a2, k02, i3);
            }
        }
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).f19290a;
    }
}
