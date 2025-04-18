package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class x2 {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final x2 DEFAULT_INSTANCE = new x2(true);
    private final l7 fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    public /* synthetic */ x2(l7 l7Var, u2 u2Var) {
        this(l7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends w2> l7 cloneAllFieldsMap(l7 l7Var, boolean z10) {
        l7 newFieldMap = l7.newFieldMap(16);
        for (int i10 = 0; i10 < l7Var.getNumArrayEntries(); i10++) {
            cloneFieldEntry(newFieldMap, l7Var.getArrayEntryAt(i10), z10);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = l7Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(newFieldMap, it.next(), z10);
        }
        return newFieldMap;
    }

    private static <T extends w2> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z10) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof n4) {
            map.put(key, ((n4) value).getValue());
        } else if (z10 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int computeElementSize(t9 t9Var, int i10, Object obj) {
        int computeTagSize = d1.computeTagSize(i10);
        if (t9Var == t9.GROUP) {
            computeTagSize *= 2;
        }
        return computeElementSizeNoTag(t9Var, obj) + computeTagSize;
    }

    public static int computeElementSizeNoTag(t9 t9Var, Object obj) {
        switch (u2.$SwitchMap$com$google$protobuf$WireFormat$FieldType[t9Var.ordinal()]) {
            case 1:
                return d1.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return d1.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return d1.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return d1.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return d1.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return d1.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return d1.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return d1.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return d1.computeGroupSizeNoTag((o5) obj);
            case 10:
                if (obj instanceof n4) {
                    return d1.computeLazyFieldSizeNoTag((n4) obj);
                }
                return d1.computeMessageSizeNoTag((o5) obj);
            case 11:
                if (obj instanceof h0) {
                    return d1.computeBytesSizeNoTag((h0) obj);
                }
                return d1.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof h0) {
                    return d1.computeBytesSizeNoTag((h0) obj);
                }
                return d1.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return d1.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return d1.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return d1.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return d1.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return d1.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof y3) {
                    return d1.computeEnumSizeNoTag(((y3) obj).getNumber());
                }
                return d1.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(w2 w2Var, Object obj) {
        l3 l3Var = (l3) w2Var;
        t9 liteType = l3Var.getLiteType();
        int number = l3Var.getNumber();
        if (l3Var.isRepeated()) {
            int i10 = 0;
            if (l3Var.isPacked()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i10 += computeElementSizeNoTag(liteType, it.next());
                }
                return d1.computeUInt32SizeNoTag(i10) + d1.computeTagSize(number) + i10;
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i10 += computeElementSize(liteType, number, it2.next());
            }
            return i10;
        }
        return computeElementSize(liteType, number, obj);
    }

    public static <T extends w2> x2 emptySet() {
        return DEFAULT_INSTANCE;
    }

    public static int getWireFormatForFieldType(t9 t9Var, boolean z10) {
        if (z10) {
            return 2;
        }
        return t9Var.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof p5) {
            return ((p5) obj).isInitialized();
        }
        if (obj instanceof n4) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(t9 t9Var, Object obj) {
        f4.checkNotNull(obj);
        switch (u2.$SwitchMap$com$google$protobuf$WireFormat$JavaType[t9Var.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof h0) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof y3)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof o5) || (obj instanceof n4)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void mergeFromField(Map.Entry<w2, Object> entry) {
        w2 key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof n4) {
            value = ((n4) value).getValue();
        }
        l3 l3Var = (l3) key;
        if (l3Var.isRepeated()) {
            Object field = getField(l3Var);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((Comparable<Object>) l3Var, field);
            return;
        }
        if (l3Var.getLiteJavaType() == u9.MESSAGE) {
            Object field2 = getField(l3Var);
            if (field2 == null) {
                this.fields.put((Comparable<Object>) l3Var, cloneIfMutable(value));
                return;
            } else {
                this.fields.put((Comparable<Object>) l3Var, (Object) ((h3) l3Var.internalMergeFrom(((o5) field2).toBuilder(), (o5) value)).build());
                return;
            }
        }
        this.fields.put((Comparable<Object>) l3Var, cloneIfMutable(value));
    }

    public static <T extends w2> v2 newBuilder() {
        return new v2((u2) null);
    }

    public static <T extends w2> x2 newFieldSet() {
        return new x2();
    }

    public static Object readPrimitiveField(r0 r0Var, t9 t9Var, boolean z10) throws IOException {
        if (z10) {
            return z9.readPrimitiveField(r0Var, t9Var, y9.STRICT);
        }
        return z9.readPrimitiveField(r0Var, t9Var, y9.LOOSE);
    }

    private void verifyType(w2 w2Var, Object obj) {
        l3 l3Var = (l3) w2Var;
        if (isValidType(l3Var.getLiteType(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(l3Var.getNumber()), l3Var.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void writeElement(d1 d1Var, t9 t9Var, int i10, Object obj) throws IOException {
        if (t9Var == t9.GROUP) {
            d1Var.writeGroup(i10, (o5) obj);
        } else {
            d1Var.writeTag(i10, getWireFormatForFieldType(t9Var, false));
            writeElementNoTag(d1Var, t9Var, obj);
        }
    }

    public static void writeElementNoTag(d1 d1Var, t9 t9Var, Object obj) throws IOException {
        switch (u2.$SwitchMap$com$google$protobuf$WireFormat$FieldType[t9Var.ordinal()]) {
            case 1:
                d1Var.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                d1Var.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                d1Var.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                d1Var.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                d1Var.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                d1Var.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                d1Var.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                d1Var.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                d1Var.writeGroupNoTag((o5) obj);
                return;
            case 10:
                d1Var.writeMessageNoTag((o5) obj);
                return;
            case 11:
                if (obj instanceof h0) {
                    d1Var.writeBytesNoTag((h0) obj);
                    return;
                } else {
                    d1Var.writeStringNoTag((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof h0) {
                    d1Var.writeBytesNoTag((h0) obj);
                    return;
                } else {
                    d1Var.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 13:
                d1Var.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 14:
                d1Var.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                d1Var.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 16:
                d1Var.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 17:
                d1Var.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof y3) {
                    d1Var.writeEnumNoTag(((y3) obj).getNumber());
                    return;
                } else {
                    d1Var.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void writeField(w2 w2Var, Object obj, d1 d1Var) throws IOException {
        l3 l3Var = (l3) w2Var;
        t9 liteType = l3Var.getLiteType();
        int number = l3Var.getNumber();
        if (l3Var.isRepeated()) {
            List list = (List) obj;
            if (l3Var.isPacked()) {
                d1Var.writeTag(number, 2);
                Iterator it = list.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    i10 += computeElementSizeNoTag(liteType, it.next());
                }
                d1Var.writeUInt32NoTag(i10);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    writeElementNoTag(d1Var, liteType, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElement(d1Var, liteType, number, it3.next());
            }
            return;
        }
        if (obj instanceof n4) {
            writeElement(d1Var, liteType, number, ((n4) obj).getValue());
        } else {
            writeElement(d1Var, liteType, number, obj);
        }
    }

    public void addRepeatedField(w2 w2Var, Object obj) {
        List list;
        l3 l3Var = (l3) w2Var;
        if (l3Var.isRepeated()) {
            verifyType(l3Var, obj);
            Object field = getField(l3Var);
            if (field == null) {
                list = new ArrayList();
                this.fields.put((Comparable<Object>) l3Var, (Object) list);
            } else {
                list = (List) field;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(w2 w2Var) {
        this.fields.remove(w2Var);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Iterator<Map.Entry<w2, Object>> descendingIterator() {
        if (this.hasLazyField) {
            return new m4(this.fields.descendingEntrySet().iterator());
        }
        return this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        return this.fields.equals(((x2) obj).fields);
    }

    public Map<w2, Object> getAllFields() {
        if (this.hasLazyField) {
            l7 cloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                cloneAllFieldsMap.makeImmutable();
            }
            return cloneAllFieldsMap;
        }
        if (this.fields.isImmutable()) {
            return this.fields;
        }
        return Collections.unmodifiableMap(this.fields);
    }

    public Object getField(w2 w2Var) {
        Object obj = this.fields.get(w2Var);
        if (obj instanceof n4) {
            return ((n4) obj).getValue();
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getMessageSetSerializedSize() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.fields.getNumArrayEntries(); i11++) {
            i10 += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i11));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i10 += getMessageSetSerializedSize(it.next());
        }
        return i10;
    }

    public Object getRepeatedField(w2 w2Var, int i10) {
        l3 l3Var = (l3) w2Var;
        if (l3Var.isRepeated()) {
            Object field = getField(l3Var);
            if (field != null) {
                return ((List) field).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getRepeatedFieldCount(w2 w2Var) {
        l3 l3Var = (l3) w2Var;
        if (l3Var.isRepeated()) {
            Object field = getField(l3Var);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getSerializedSize() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.fields.getNumArrayEntries(); i11++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i11);
            i10 += computeFieldSize((w2) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            i10 += computeFieldSize((w2) entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public boolean hasField(w2 w2Var) {
        l3 l3Var = (l3) w2Var;
        if (!l3Var.isRepeated()) {
            if (this.fields.get(l3Var) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<w2, Object>> iterator() {
        if (this.hasLazyField) {
            return new m4(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            if (arrayEntryAt.getValue() instanceof o3) {
                ((o3) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFrom(x2 x2Var) {
        for (int i10 = 0; i10 < x2Var.fields.getNumArrayEntries(); i10++) {
            mergeFromField(x2Var.fields.getArrayEntryAt(i10));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = x2Var.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    public void setField(w2 w2Var, Object obj) {
        l3 l3Var = (l3) w2Var;
        if (l3Var.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    verifyType(l3Var, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            verifyType(l3Var, obj);
        }
        if (obj instanceof n4) {
            this.hasLazyField = true;
        }
        this.fields.put((Comparable<Object>) l3Var, obj);
    }

    public void setRepeatedField(w2 w2Var, int i10, Object obj) {
        l3 l3Var = (l3) w2Var;
        if (l3Var.isRepeated()) {
            Object field = getField(l3Var);
            if (field != null) {
                verifyType(l3Var, obj);
                ((List) field).set(i10, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeMessageSetTo(d1 d1Var) throws IOException {
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i10), d1Var);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), d1Var);
        }
    }

    public void writeTo(d1 d1Var) throws IOException {
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            writeField((w2) arrayEntryAt.getKey(), arrayEntryAt.getValue(), d1Var);
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            writeField((w2) entry.getKey(), entry.getValue(), d1Var);
        }
    }

    private x2() {
        this.fields = l7.newFieldMap(16);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public x2 m5clone() {
        x2 newFieldSet = newFieldSet();
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            newFieldSet.setField((w2) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            newFieldSet.setField((w2) entry.getKey(), entry.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    private x2(boolean z10) {
        this(l7.newFieldMap(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<w2, Object> entry) {
        w2 key = entry.getKey();
        Object value = entry.getValue();
        l3 l3Var = (l3) key;
        if (l3Var.getLiteJavaType() == u9.MESSAGE && !l3Var.isRepeated() && !l3Var.isPacked()) {
            if (value instanceof n4) {
                return d1.computeLazyFieldMessageSetExtensionSize(((l3) entry.getKey()).getNumber(), (n4) value);
            }
            return d1.computeMessageSetExtensionSize(((l3) entry.getKey()).getNumber(), (o5) value);
        }
        return computeFieldSize(l3Var, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends w2> boolean isInitialized(Map.Entry<T, Object> entry) {
        l3 l3Var = (l3) entry.getKey();
        if (l3Var.getLiteJavaType() != u9.MESSAGE) {
            return true;
        }
        if (l3Var.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(Map.Entry<w2, Object> entry, d1 d1Var) throws IOException {
        l3 l3Var = (l3) entry.getKey();
        if (l3Var.getLiteJavaType() == u9.MESSAGE && !l3Var.isRepeated() && !l3Var.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof n4) {
                value = ((n4) value).getValue();
            }
            d1Var.writeMessageSetExtension(((l3) entry.getKey()).getNumber(), (o5) value);
            return;
        }
        writeField(l3Var, entry.getValue(), d1Var);
    }

    private x2(l7 l7Var) {
        this.fields = l7Var;
        makeImmutable();
    }
}
