package com.google.protobuf;

import java.util.Map;

/* loaded from: classes4.dex */
public interface i5 {
    Map<?, ?> forMapData(Object obj);

    f5 forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i10, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
