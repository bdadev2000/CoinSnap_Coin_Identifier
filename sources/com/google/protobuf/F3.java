package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class F3 {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final Object key;
    private final E3 metadata;
    private final Object value;

    private F3(S5 s5, Object obj, S5 s52, Object obj2) {
        this.metadata = new E3(s5, obj, s52, obj2);
        this.key = obj;
        this.value = obj2;
    }

    public static <K, V> int computeSerializedSize(E3 e32, K k6, V v6) {
        return C2001t2.computeElementSize(e32.valueType, 2, v6) + C2001t2.computeElementSize(e32.keyType, 1, k6);
    }

    public static <K, V> F3 newDefaultInstance(S5 s5, K k6, S5 s52, V v6) {
        return new F3(s5, k6, s52, v6);
    }

    public static <T> T parseField(S s5, W1 w1, S5 s52, T t9) throws IOException {
        int i9 = D3.$SwitchMap$com$google$protobuf$WireFormat$FieldType[s52.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return (T) C2001t2.readPrimitiveField(s5, s52, true);
                }
                throw new RuntimeException("Groups are not allowed in maps.");
            }
            return (T) Integer.valueOf(s5.readEnum());
        }
        M3 builder = ((N3) t9).toBuilder();
        s5.readMessage(builder, w1);
        return (T) builder.buildPartial();
    }

    public static <K, V> void writeTo(AbstractC1895e0 abstractC1895e0, E3 e32, K k6, V v6) throws IOException {
        C2001t2.writeElement(abstractC1895e0, e32.keyType, 1, k6);
        C2001t2.writeElement(abstractC1895e0, e32.valueType, 2, v6);
    }

    public int computeMessageSize(int i9, Object obj, Object obj2) {
        return AbstractC1895e0.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, obj, obj2)) + AbstractC1895e0.computeTagSize(i9);
    }

    public Object getKey() {
        return this.key;
    }

    public E3 getMetadata() {
        return this.metadata;
    }

    public Object getValue() {
        return this.value;
    }

    public Map.Entry<Object, Object> parseEntry(H h6, W1 w1) throws IOException {
        return parseEntry(h6.newCodedInput(), this.metadata, w1);
    }

    public void parseInto(G3 g32, S s5, W1 w1) throws IOException {
        int pushLimit = s5.pushLimit(s5.readRawVarint32());
        E3 e32 = this.metadata;
        Object obj = e32.defaultKey;
        Object obj2 = e32.defaultValue;
        while (true) {
            int readTag = s5.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == Y5.makeTag(1, this.metadata.keyType.getWireType())) {
                obj = parseField(s5, w1, this.metadata.keyType, obj);
            } else if (readTag == Y5.makeTag(2, this.metadata.valueType.getWireType())) {
                obj2 = parseField(s5, w1, this.metadata.valueType, obj2);
            } else if (!s5.skipField(readTag)) {
                break;
            }
        }
        s5.checkLastTagWas(0);
        s5.popLimit(pushLimit);
        g32.put(obj, obj2);
    }

    public void serializeTo(AbstractC1895e0 abstractC1895e0, int i9, Object obj, Object obj2) throws IOException {
        abstractC1895e0.writeTag(i9, 2);
        abstractC1895e0.writeUInt32NoTag(computeSerializedSize(this.metadata, obj, obj2));
        writeTo(abstractC1895e0, this.metadata, obj, obj2);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(S s5, E3 e32, W1 w1) throws IOException {
        Object obj = e32.defaultKey;
        Object obj2 = e32.defaultValue;
        while (true) {
            int readTag = s5.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == Y5.makeTag(1, e32.keyType.getWireType())) {
                obj = parseField(s5, w1, e32.keyType, obj);
            } else if (readTag == Y5.makeTag(2, e32.valueType.getWireType())) {
                obj2 = parseField(s5, w1, e32.valueType, obj2);
            } else if (!s5.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private F3(E3 e32, Object obj, Object obj2) {
        this.metadata = e32;
        this.key = obj;
        this.value = obj2;
    }
}
