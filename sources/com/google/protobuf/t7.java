package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class t7 extends h3 implements v7 {
    public /* synthetic */ t7(s7 s7Var) {
        this();
    }

    public t7 clearFields() {
        Map mutableFieldsMap;
        copyOnWrite();
        mutableFieldsMap = ((Struct) this.instance).getMutableFieldsMap();
        mutableFieldsMap.clear();
        return this;
    }

    @Override // com.google.protobuf.v7
    public boolean containsFields(String str) {
        str.getClass();
        return ((Struct) this.instance).getFieldsMap().containsKey(str);
    }

    @Override // com.google.protobuf.v7
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.v7
    public int getFieldsCount() {
        return ((Struct) this.instance).getFieldsMap().size();
    }

    @Override // com.google.protobuf.v7
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(((Struct) this.instance).getFieldsMap());
    }

    @Override // com.google.protobuf.v7
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
        if (fieldsMap.containsKey(str)) {
            return fieldsMap.get(str);
        }
        return value;
    }

    @Override // com.google.protobuf.v7
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
        if (fieldsMap.containsKey(str)) {
            return fieldsMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public t7 putAllFields(Map<String, Value> map) {
        Map mutableFieldsMap;
        copyOnWrite();
        mutableFieldsMap = ((Struct) this.instance).getMutableFieldsMap();
        mutableFieldsMap.putAll(map);
        return this;
    }

    public t7 putFields(String str, Value value) {
        Map mutableFieldsMap;
        str.getClass();
        value.getClass();
        copyOnWrite();
        mutableFieldsMap = ((Struct) this.instance).getMutableFieldsMap();
        mutableFieldsMap.put(str, value);
        return this;
    }

    public t7 removeFields(String str) {
        Map mutableFieldsMap;
        str.getClass();
        copyOnWrite();
        mutableFieldsMap = ((Struct) this.instance).getMutableFieldsMap();
        mutableFieldsMap.remove(str);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private t7() {
        /*
            r1 = this;
            com.google.protobuf.Struct r0 = com.google.protobuf.Struct.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t7.<init>():void");
    }
}
