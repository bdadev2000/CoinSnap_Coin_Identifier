package com.google.protobuf;

import java.util.Map;

/* loaded from: classes3.dex */
public final class I3 implements H3 {
    private static <K, V> int getSerializedSizeLite(int i9, Object obj, Object obj2) {
        G3 g32 = (G3) obj;
        F3 f32 = (F3) obj2;
        int i10 = 0;
        if (g32.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Object, Object> entry : g32.entrySet()) {
            i10 += f32.computeMessageSize(i9, entry.getKey(), entry.getValue());
        }
        return i10;
    }

    private static <K, V> G3 mergeFromLite(Object obj, Object obj2) {
        G3 g32 = (G3) obj;
        G3 g33 = (G3) obj2;
        if (!g33.isEmpty()) {
            if (!g32.isMutable()) {
                g32 = g32.mutableCopy();
            }
            g32.mergeFrom(g33);
        }
        return g32;
    }

    @Override // com.google.protobuf.H3
    public Map<?, ?> forMapData(Object obj) {
        return (G3) obj;
    }

    @Override // com.google.protobuf.H3
    public E3 forMapMetadata(Object obj) {
        return ((F3) obj).getMetadata();
    }

    @Override // com.google.protobuf.H3
    public Map<?, ?> forMutableMapData(Object obj) {
        return (G3) obj;
    }

    @Override // com.google.protobuf.H3
    public int getSerializedSize(int i9, Object obj, Object obj2) {
        return getSerializedSizeLite(i9, obj, obj2);
    }

    @Override // com.google.protobuf.H3
    public boolean isImmutable(Object obj) {
        return !((G3) obj).isMutable();
    }

    @Override // com.google.protobuf.H3
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    @Override // com.google.protobuf.H3
    public Object newMapField(Object obj) {
        return G3.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.H3
    public Object toImmutable(Object obj) {
        ((G3) obj).makeImmutable();
        return obj;
    }
}
