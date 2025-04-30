package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2001t2 {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final C2001t2 DEFAULT_INSTANCE = new C2001t2(true);
    private final K4 fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    public /* synthetic */ C2001t2(K4 k42, AbstractC1981q2 abstractC1981q2) {
        this(k42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends InterfaceC1994s2> K4 cloneAllFieldsMap(K4 k42, boolean z8) {
        K4 newFieldMap = K4.newFieldMap(16);
        for (int i9 = 0; i9 < k42.getNumArrayEntries(); i9++) {
            cloneFieldEntry(newFieldMap, k42.getArrayEntryAt(i9), z8);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = k42.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(newFieldMap, it.next(), z8);
        }
        return newFieldMap;
    }

    private static <T extends InterfaceC1994s2> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z8) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C1954m3) {
            map.put(key, ((C1954m3) value).getValue());
        } else if (z8 && (value instanceof List)) {
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

    public static int computeElementSize(S5 s5, int i9, Object obj) {
        int computeTagSize = AbstractC1895e0.computeTagSize(i9);
        if (s5 == S5.GROUP) {
            computeTagSize *= 2;
        }
        return computeElementSizeNoTag(s5, obj) + computeTagSize;
    }

    public static int computeElementSizeNoTag(S5 s5, Object obj) {
        switch (AbstractC1981q2.$SwitchMap$com$google$protobuf$WireFormat$FieldType[s5.ordinal()]) {
            case 1:
                return AbstractC1895e0.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return AbstractC1895e0.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return AbstractC1895e0.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return AbstractC1895e0.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return AbstractC1895e0.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return AbstractC1895e0.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return AbstractC1895e0.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return AbstractC1895e0.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1895e0.computeGroupSizeNoTag((N3) obj);
            case 10:
                if (obj instanceof C1954m3) {
                    return AbstractC1895e0.computeLazyFieldSizeNoTag((C1954m3) obj);
                }
                return AbstractC1895e0.computeMessageSizeNoTag((N3) obj);
            case 11:
                if (obj instanceof H) {
                    return AbstractC1895e0.computeBytesSizeNoTag((H) obj);
                }
                return AbstractC1895e0.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof H) {
                    return AbstractC1895e0.computeBytesSizeNoTag((H) obj);
                }
                return AbstractC1895e0.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return AbstractC1895e0.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return AbstractC1895e0.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return AbstractC1895e0.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return AbstractC1895e0.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return AbstractC1895e0.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof V2) {
                    return AbstractC1895e0.computeEnumSizeNoTag(((V2) obj).getNumber());
                }
                return AbstractC1895e0.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(InterfaceC1994s2 interfaceC1994s2, Object obj) {
        I2 i22 = (I2) interfaceC1994s2;
        S5 liteType = i22.getLiteType();
        int number = i22.getNumber();
        if (i22.isRepeated()) {
            int i9 = 0;
            if (i22.isPacked()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i9 += computeElementSizeNoTag(liteType, it.next());
                }
                return AbstractC1895e0.computeUInt32SizeNoTag(i9) + AbstractC1895e0.computeTagSize(number) + i9;
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i9 += computeElementSize(liteType, number, it2.next());
            }
            return i9;
        }
        return computeElementSize(liteType, number, obj);
    }

    public static <T extends InterfaceC1994s2> C2001t2 emptySet() {
        return DEFAULT_INSTANCE;
    }

    public static int getWireFormatForFieldType(S5 s5, boolean z8) {
        if (z8) {
            return 2;
        }
        return s5.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof O3) {
            return ((O3) obj).isInitialized();
        }
        if (obj instanceof C1954m3) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(S5 s5, Object obj) {
        C1898e3.checkNotNull(obj);
        switch (AbstractC1981q2.$SwitchMap$com$google$protobuf$WireFormat$JavaType[s5.getJavaType().ordinal()]) {
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
                if ((obj instanceof H) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof V2)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof N3) || (obj instanceof C1954m3)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void mergeFromField(Map.Entry<InterfaceC1994s2, Object> entry) {
        InterfaceC1994s2 key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C1954m3) {
            value = ((C1954m3) value).getValue();
        }
        I2 i22 = (I2) key;
        if (i22.isRepeated()) {
            Object field = getField(i22);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((Comparable<Object>) i22, field);
            return;
        }
        if (i22.getLiteJavaType() == T5.MESSAGE) {
            Object field2 = getField(i22);
            if (field2 == null) {
                this.fields.put((Comparable<Object>) i22, cloneIfMutable(value));
                return;
            } else {
                this.fields.put((Comparable<Object>) i22, (Object) ((D2) i22.internalMergeFrom(((N3) field2).toBuilder(), (N3) value)).build());
                return;
            }
        }
        this.fields.put((Comparable<Object>) i22, cloneIfMutable(value));
    }

    public static <T extends InterfaceC1994s2> C1987r2 newBuilder() {
        return new C1987r2((AbstractC1981q2) null);
    }

    public static <T extends InterfaceC1994s2> C2001t2 newFieldSet() {
        return new C2001t2();
    }

    public static Object readPrimitiveField(S s5, S5 s52, boolean z8) throws IOException {
        if (z8) {
            return Y5.readPrimitiveField(s5, s52, X5.STRICT);
        }
        return Y5.readPrimitiveField(s5, s52, X5.LOOSE);
    }

    private void verifyType(InterfaceC1994s2 interfaceC1994s2, Object obj) {
        I2 i22 = (I2) interfaceC1994s2;
        if (isValidType(i22.getLiteType(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i22.getNumber()), i22.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void writeElement(AbstractC1895e0 abstractC1895e0, S5 s5, int i9, Object obj) throws IOException {
        if (s5 == S5.GROUP) {
            abstractC1895e0.writeGroup(i9, (N3) obj);
        } else {
            abstractC1895e0.writeTag(i9, getWireFormatForFieldType(s5, false));
            writeElementNoTag(abstractC1895e0, s5, obj);
        }
    }

    public static void writeElementNoTag(AbstractC1895e0 abstractC1895e0, S5 s5, Object obj) throws IOException {
        switch (AbstractC1981q2.$SwitchMap$com$google$protobuf$WireFormat$FieldType[s5.ordinal()]) {
            case 1:
                abstractC1895e0.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC1895e0.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                abstractC1895e0.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                abstractC1895e0.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                abstractC1895e0.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                abstractC1895e0.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                abstractC1895e0.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                abstractC1895e0.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                abstractC1895e0.writeGroupNoTag((N3) obj);
                return;
            case 10:
                abstractC1895e0.writeMessageNoTag((N3) obj);
                return;
            case 11:
                if (obj instanceof H) {
                    abstractC1895e0.writeBytesNoTag((H) obj);
                    return;
                } else {
                    abstractC1895e0.writeStringNoTag((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof H) {
                    abstractC1895e0.writeBytesNoTag((H) obj);
                    return;
                } else {
                    abstractC1895e0.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 13:
                abstractC1895e0.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 14:
                abstractC1895e0.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                abstractC1895e0.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 16:
                abstractC1895e0.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 17:
                abstractC1895e0.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof V2) {
                    abstractC1895e0.writeEnumNoTag(((V2) obj).getNumber());
                    return;
                } else {
                    abstractC1895e0.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void writeField(InterfaceC1994s2 interfaceC1994s2, Object obj, AbstractC1895e0 abstractC1895e0) throws IOException {
        I2 i22 = (I2) interfaceC1994s2;
        S5 liteType = i22.getLiteType();
        int number = i22.getNumber();
        if (i22.isRepeated()) {
            List list = (List) obj;
            if (i22.isPacked()) {
                abstractC1895e0.writeTag(number, 2);
                Iterator it = list.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    i9 += computeElementSizeNoTag(liteType, it.next());
                }
                abstractC1895e0.writeUInt32NoTag(i9);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    writeElementNoTag(abstractC1895e0, liteType, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElement(abstractC1895e0, liteType, number, it3.next());
            }
            return;
        }
        if (obj instanceof C1954m3) {
            writeElement(abstractC1895e0, liteType, number, ((C1954m3) obj).getValue());
        } else {
            writeElement(abstractC1895e0, liteType, number, obj);
        }
    }

    public void addRepeatedField(InterfaceC1994s2 interfaceC1994s2, Object obj) {
        List list;
        I2 i22 = (I2) interfaceC1994s2;
        if (i22.isRepeated()) {
            verifyType(i22, obj);
            Object field = getField(i22);
            if (field == null) {
                list = new ArrayList();
                this.fields.put((Comparable<Object>) i22, (Object) list);
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

    public void clearField(InterfaceC1994s2 interfaceC1994s2) {
        this.fields.remove(interfaceC1994s2);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Iterator<Map.Entry<InterfaceC1994s2, Object>> descendingIterator() {
        if (this.hasLazyField) {
            return new C1947l3(this.fields.descendingEntrySet().iterator());
        }
        return this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2001t2)) {
            return false;
        }
        return this.fields.equals(((C2001t2) obj).fields);
    }

    public Map<InterfaceC1994s2, Object> getAllFields() {
        if (this.hasLazyField) {
            K4 cloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
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

    public Object getField(InterfaceC1994s2 interfaceC1994s2) {
        Object obj = this.fields.get(interfaceC1994s2);
        if (obj instanceof C1954m3) {
            return ((C1954m3) obj).getValue();
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getMessageSetSerializedSize() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            i9 += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i10));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i9 += getMessageSetSerializedSize(it.next());
        }
        return i9;
    }

    public Object getRepeatedField(InterfaceC1994s2 interfaceC1994s2, int i9) {
        I2 i22 = (I2) interfaceC1994s2;
        if (i22.isRepeated()) {
            Object field = getField(i22);
            if (field != null) {
                return ((List) field).get(i9);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getRepeatedFieldCount(InterfaceC1994s2 interfaceC1994s2) {
        I2 i22 = (I2) interfaceC1994s2;
        if (i22.isRepeated()) {
            Object field = getField(i22);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getSerializedSize() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            i9 += computeFieldSize((InterfaceC1994s2) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            i9 += computeFieldSize((InterfaceC1994s2) entry.getKey(), entry.getValue());
        }
        return i9;
    }

    public boolean hasField(InterfaceC1994s2 interfaceC1994s2) {
        I2 i22 = (I2) interfaceC1994s2;
        if (!i22.isRepeated()) {
            if (this.fields.get(i22) != null) {
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
        for (int i9 = 0; i9 < this.fields.getNumArrayEntries(); i9++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i9))) {
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

    public Iterator<Map.Entry<InterfaceC1994s2, Object>> iterator() {
        if (this.hasLazyField) {
            return new C1947l3(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i9 = 0; i9 < this.fields.getNumArrayEntries(); i9++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i9);
            if (arrayEntryAt.getValue() instanceof L2) {
                ((L2) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFrom(C2001t2 c2001t2) {
        for (int i9 = 0; i9 < c2001t2.fields.getNumArrayEntries(); i9++) {
            mergeFromField(c2001t2.fields.getArrayEntryAt(i9));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = c2001t2.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    public void setField(InterfaceC1994s2 interfaceC1994s2, Object obj) {
        I2 i22 = (I2) interfaceC1994s2;
        if (i22.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    verifyType(i22, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            verifyType(i22, obj);
        }
        if (obj instanceof C1954m3) {
            this.hasLazyField = true;
        }
        this.fields.put((Comparable<Object>) i22, obj);
    }

    public void setRepeatedField(InterfaceC1994s2 interfaceC1994s2, int i9, Object obj) {
        I2 i22 = (I2) interfaceC1994s2;
        if (i22.isRepeated()) {
            Object field = getField(i22);
            if (field != null) {
                verifyType(i22, obj);
                ((List) field).set(i9, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeMessageSetTo(AbstractC1895e0 abstractC1895e0) throws IOException {
        for (int i9 = 0; i9 < this.fields.getNumArrayEntries(); i9++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i9), abstractC1895e0);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), abstractC1895e0);
        }
    }

    public void writeTo(AbstractC1895e0 abstractC1895e0) throws IOException {
        for (int i9 = 0; i9 < this.fields.getNumArrayEntries(); i9++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i9);
            writeField((InterfaceC1994s2) arrayEntryAt.getKey(), arrayEntryAt.getValue(), abstractC1895e0);
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            writeField((InterfaceC1994s2) entry.getKey(), entry.getValue(), abstractC1895e0);
        }
    }

    private C2001t2() {
        this.fields = K4.newFieldMap(16);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C2001t2 m2clone() {
        C2001t2 newFieldSet = newFieldSet();
        for (int i9 = 0; i9 < this.fields.getNumArrayEntries(); i9++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i9);
            newFieldSet.setField((InterfaceC1994s2) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            newFieldSet.setField((InterfaceC1994s2) entry.getKey(), entry.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    private C2001t2(boolean z8) {
        this(K4.newFieldMap(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<InterfaceC1994s2, Object> entry) {
        InterfaceC1994s2 key = entry.getKey();
        Object value = entry.getValue();
        I2 i22 = (I2) key;
        if (i22.getLiteJavaType() == T5.MESSAGE && !i22.isRepeated() && !i22.isPacked()) {
            if (value instanceof C1954m3) {
                return AbstractC1895e0.computeLazyFieldMessageSetExtensionSize(((I2) entry.getKey()).getNumber(), (C1954m3) value);
            }
            return AbstractC1895e0.computeMessageSetExtensionSize(((I2) entry.getKey()).getNumber(), (N3) value);
        }
        return computeFieldSize(i22, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends InterfaceC1994s2> boolean isInitialized(Map.Entry<T, Object> entry) {
        I2 i22 = (I2) entry.getKey();
        if (i22.getLiteJavaType() != T5.MESSAGE) {
            return true;
        }
        if (i22.isRepeated()) {
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

    private void writeMessageSetTo(Map.Entry<InterfaceC1994s2, Object> entry, AbstractC1895e0 abstractC1895e0) throws IOException {
        I2 i22 = (I2) entry.getKey();
        if (i22.getLiteJavaType() == T5.MESSAGE && !i22.isRepeated() && !i22.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof C1954m3) {
                value = ((C1954m3) value).getValue();
            }
            abstractC1895e0.writeMessageSetExtension(((I2) entry.getKey()).getNumber(), (N3) value);
            return;
        }
        writeField(i22, entry.getValue(), abstractC1895e0);
    }

    private C2001t2(K4 k42) {
        this.fields = k42;
        makeImmutable();
    }
}
