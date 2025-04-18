package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class g5 {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final Object key;
    private final f5 metadata;
    private final Object value;

    private g5(t9 t9Var, Object obj, t9 t9Var2, Object obj2) {
        this.metadata = new f5(t9Var, obj, t9Var2, obj2);
        this.key = obj;
        this.value = obj2;
    }

    public static <K, V> int computeSerializedSize(f5 f5Var, K k10, V v10) {
        return x2.computeElementSize(f5Var.valueType, 2, v10) + x2.computeElementSize(f5Var.keyType, 1, k10);
    }

    public static <K, V> g5 newDefaultInstance(t9 t9Var, K k10, t9 t9Var2, V v10) {
        return new g5(t9Var, k10, t9Var2, v10);
    }

    public static <T> T parseField(r0 r0Var, a2 a2Var, t9 t9Var, T t5) throws IOException {
        int i10 = e5.$SwitchMap$com$google$protobuf$WireFormat$FieldType[t9Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return (T) x2.readPrimitiveField(r0Var, t9Var, true);
                }
                throw new RuntimeException("Groups are not allowed in maps.");
            }
            return (T) Integer.valueOf(r0Var.readEnum());
        }
        n5 builder = ((o5) t5).toBuilder();
        r0Var.readMessage(builder, a2Var);
        return (T) ((h3) builder).buildPartial();
    }

    public static <K, V> void writeTo(d1 d1Var, f5 f5Var, K k10, V v10) throws IOException {
        x2.writeElement(d1Var, f5Var.keyType, 1, k10);
        x2.writeElement(d1Var, f5Var.valueType, 2, v10);
    }

    public int computeMessageSize(int i10, Object obj, Object obj2) {
        return d1.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, obj, obj2)) + d1.computeTagSize(i10);
    }

    public Object getKey() {
        return this.key;
    }

    public f5 getMetadata() {
        return this.metadata;
    }

    public Object getValue() {
        return this.value;
    }

    public Map.Entry<Object, Object> parseEntry(h0 h0Var, a2 a2Var) throws IOException {
        return parseEntry(h0Var.newCodedInput(), this.metadata, a2Var);
    }

    public void parseInto(h5 h5Var, r0 r0Var, a2 a2Var) throws IOException {
        int pushLimit = r0Var.pushLimit(r0Var.readRawVarint32());
        f5 f5Var = this.metadata;
        Object obj = f5Var.defaultKey;
        Object obj2 = f5Var.defaultValue;
        while (true) {
            int readTag = r0Var.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == z9.makeTag(1, this.metadata.keyType.getWireType())) {
                obj = parseField(r0Var, a2Var, this.metadata.keyType, obj);
            } else if (readTag == z9.makeTag(2, this.metadata.valueType.getWireType())) {
                obj2 = parseField(r0Var, a2Var, this.metadata.valueType, obj2);
            } else if (!r0Var.skipField(readTag)) {
                break;
            }
        }
        r0Var.checkLastTagWas(0);
        r0Var.popLimit(pushLimit);
        h5Var.put(obj, obj2);
    }

    public void serializeTo(d1 d1Var, int i10, Object obj, Object obj2) throws IOException {
        d1Var.writeTag(i10, 2);
        d1Var.writeUInt32NoTag(computeSerializedSize(this.metadata, obj, obj2));
        writeTo(d1Var, this.metadata, obj, obj2);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(r0 r0Var, f5 f5Var, a2 a2Var) throws IOException {
        Object obj = f5Var.defaultKey;
        Object obj2 = f5Var.defaultValue;
        while (true) {
            int readTag = r0Var.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == z9.makeTag(1, f5Var.keyType.getWireType())) {
                obj = parseField(r0Var, a2Var, f5Var.keyType, obj);
            } else if (readTag == z9.makeTag(2, f5Var.valueType.getWireType())) {
                obj2 = parseField(r0Var, a2Var, f5Var.valueType, obj2);
            } else if (!r0Var.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private g5(f5 f5Var, Object obj, Object obj2) {
        this.metadata = f5Var;
        this.key = obj;
        this.value = obj2;
    }
}
