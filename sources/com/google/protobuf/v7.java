package com.google.protobuf;

import java.util.Map;

/* loaded from: classes4.dex */
public interface v7 extends p5 {
    boolean containsFields(String str);

    @Override // com.google.protobuf.p5, com.google.protobuf.k3
    /* synthetic */ o5 getDefaultInstanceForType();

    @Deprecated
    Map<String, Value> getFields();

    int getFieldsCount();

    Map<String, Value> getFieldsMap();

    Value getFieldsOrDefault(String str, Value value);

    Value getFieldsOrThrow(String str);

    @Override // com.google.protobuf.p5
    /* synthetic */ boolean isInitialized();
}
