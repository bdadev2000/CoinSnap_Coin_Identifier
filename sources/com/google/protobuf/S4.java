package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class S4 extends D2 implements U4 {
    public /* synthetic */ S4(R4 r42) {
        this();
    }

    public S4 clearFields() {
        copyOnWrite();
        Struct.access$100((Struct) this.instance).clear();
        return this;
    }

    @Override // com.google.protobuf.U4
    public boolean containsFields(String str) {
        str.getClass();
        return ((Struct) this.instance).getFieldsMap().containsKey(str);
    }

    @Override // com.google.protobuf.U4
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.U4
    public int getFieldsCount() {
        return ((Struct) this.instance).getFieldsMap().size();
    }

    @Override // com.google.protobuf.U4
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(((Struct) this.instance).getFieldsMap());
    }

    @Override // com.google.protobuf.U4
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
        if (fieldsMap.containsKey(str)) {
            return fieldsMap.get(str);
        }
        return value;
    }

    @Override // com.google.protobuf.U4
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
        if (fieldsMap.containsKey(str)) {
            return fieldsMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public S4 putAllFields(Map<String, Value> map) {
        copyOnWrite();
        Struct.access$100((Struct) this.instance).putAll(map);
        return this;
    }

    public S4 putFields(String str, Value value) {
        str.getClass();
        value.getClass();
        copyOnWrite();
        Struct.access$100((Struct) this.instance).put(str, value);
        return this;
    }

    public S4 removeFields(String str) {
        str.getClass();
        copyOnWrite();
        Struct.access$100((Struct) this.instance).remove(str);
        return this;
    }

    private S4() {
        super(Struct.access$000());
    }
}
