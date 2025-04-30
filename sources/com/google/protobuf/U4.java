package com.google.protobuf;

import java.util.Map;

/* loaded from: classes3.dex */
public interface U4 extends O3 {
    boolean containsFields(String str);

    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    @Deprecated
    Map<String, Value> getFields();

    int getFieldsCount();

    Map<String, Value> getFieldsMap();

    Value getFieldsOrDefault(String str, Value value);

    Value getFieldsOrThrow(String str);

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
