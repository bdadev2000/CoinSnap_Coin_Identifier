package com.google.protobuf;

import java.util.Map;

/* loaded from: classes4.dex */
public final class j5 implements i5 {
    private static <K, V> int getSerializedSizeLite(int i10, Object obj, Object obj2) {
        h5 h5Var = (h5) obj;
        g5 g5Var = (g5) obj2;
        int i11 = 0;
        if (h5Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Object, Object> entry : h5Var.entrySet()) {
            i11 += g5Var.computeMessageSize(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> h5 mergeFromLite(Object obj, Object obj2) {
        h5 h5Var = (h5) obj;
        h5 h5Var2 = (h5) obj2;
        if (!h5Var2.isEmpty()) {
            if (!h5Var.isMutable()) {
                h5Var = h5Var.mutableCopy();
            }
            h5Var.mergeFrom(h5Var2);
        }
        return h5Var;
    }

    @Override // com.google.protobuf.i5
    public Map<?, ?> forMapData(Object obj) {
        return (h5) obj;
    }

    @Override // com.google.protobuf.i5
    public f5 forMapMetadata(Object obj) {
        return ((g5) obj).getMetadata();
    }

    @Override // com.google.protobuf.i5
    public Map<?, ?> forMutableMapData(Object obj) {
        return (h5) obj;
    }

    @Override // com.google.protobuf.i5
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return getSerializedSizeLite(i10, obj, obj2);
    }

    @Override // com.google.protobuf.i5
    public boolean isImmutable(Object obj) {
        return !((h5) obj).isMutable();
    }

    @Override // com.google.protobuf.i5
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    @Override // com.google.protobuf.i5
    public Object newMapField(Object obj) {
        return h5.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.i5
    public Object toImmutable(Object obj) {
        ((h5) obj).makeImmutable();
        return obj;
    }
}
