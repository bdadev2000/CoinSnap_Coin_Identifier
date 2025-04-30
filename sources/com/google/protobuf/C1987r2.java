package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1987r2 {
    private K4 fields;
    private boolean hasLazyField;
    private boolean hasNestedBuilders;
    private boolean isMutable;

    public /* synthetic */ C1987r2(AbstractC1981q2 abstractC1981q2) {
        this();
    }

    private C2001t2 buildImpl(boolean z8) {
        if (this.fields.isEmpty()) {
            return C2001t2.emptySet();
        }
        this.isMutable = false;
        K4 k42 = this.fields;
        if (this.hasNestedBuilders) {
            k42 = C2001t2.cloneAllFieldsMap(k42, false);
            replaceBuilders(k42, z8);
        }
        C2001t2 c2001t2 = new C2001t2(k42, null);
        c2001t2.hasLazyField = this.hasLazyField;
        return c2001t2;
    }

    private void ensureIsMutable() {
        K4 cloneAllFieldsMap;
        if (!this.isMutable) {
            cloneAllFieldsMap = C2001t2.cloneAllFieldsMap(this.fields, true);
            this.fields = cloneAllFieldsMap;
            this.isMutable = true;
        }
    }

    public static <T extends InterfaceC1994s2> C1987r2 fromFieldSet(C2001t2 c2001t2) {
        K4 k42;
        K4 cloneAllFieldsMap;
        boolean z8;
        k42 = c2001t2.fields;
        cloneAllFieldsMap = C2001t2.cloneAllFieldsMap(k42, true);
        C1987r2 c1987r2 = new C1987r2(cloneAllFieldsMap);
        z8 = c2001t2.hasLazyField;
        c1987r2.hasLazyField = z8;
        return c1987r2;
    }

    private void mergeFromField(Map.Entry<InterfaceC1994s2, Object> entry) {
        Object cloneIfMutable;
        Object cloneIfMutable2;
        Object cloneIfMutable3;
        InterfaceC1994s2 key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C1954m3) {
            value = ((C1954m3) value).getValue();
        }
        I2 i22 = (I2) key;
        if (i22.isRepeated()) {
            List list = (List) getFieldAllowBuilders(i22);
            if (list == null) {
                list = new ArrayList();
                this.fields.put((Comparable<Object>) i22, (Object) list);
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                cloneIfMutable3 = C2001t2.cloneIfMutable(it.next());
                list.add(cloneIfMutable3);
            }
            return;
        }
        if (i22.getLiteJavaType() == T5.MESSAGE) {
            Object fieldAllowBuilders = getFieldAllowBuilders(i22);
            if (fieldAllowBuilders == null) {
                K4 k42 = this.fields;
                cloneIfMutable2 = C2001t2.cloneIfMutable(value);
                k42.put((Comparable<Object>) i22, cloneIfMutable2);
                return;
            } else if (fieldAllowBuilders instanceof M3) {
                i22.internalMergeFrom((M3) fieldAllowBuilders, (N3) value);
                return;
            } else {
                this.fields.put((Comparable<Object>) i22, (Object) ((D2) i22.internalMergeFrom(((N3) fieldAllowBuilders).toBuilder(), (N3) value)).build());
                return;
            }
        }
        K4 k43 = this.fields;
        cloneIfMutable = C2001t2.cloneIfMutable(value);
        k43.put((Comparable<Object>) i22, cloneIfMutable);
    }

    private static Object replaceBuilder(Object obj, boolean z8) {
        if (!(obj instanceof M3)) {
            return obj;
        }
        M3 m32 = (M3) obj;
        if (z8) {
            return m32.buildPartial();
        }
        return ((D2) m32).build();
    }

    private static <T extends InterfaceC1994s2> void replaceBuilders(K4 k42, boolean z8) {
        for (int i9 = 0; i9 < k42.getNumArrayEntries(); i9++) {
            replaceBuilders(k42.getArrayEntryAt(i9), z8);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = k42.getOverflowEntries().iterator();
        while (it.hasNext()) {
            replaceBuilders(it.next(), z8);
        }
    }

    private void verifyType(InterfaceC1994s2 interfaceC1994s2, Object obj) {
        boolean isValidType;
        I2 i22 = (I2) interfaceC1994s2;
        isValidType = C2001t2.isValidType(i22.getLiteType(), obj);
        if (!isValidType) {
            if (i22.getLiteType().getJavaType() == T5.MESSAGE && (obj instanceof M3)) {
            } else {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(i22.getNumber()), i22.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }
    }

    public void addRepeatedField(InterfaceC1994s2 interfaceC1994s2, Object obj) {
        boolean z8;
        List list;
        ensureIsMutable();
        I2 i22 = (I2) interfaceC1994s2;
        if (i22.isRepeated()) {
            if (!this.hasNestedBuilders && !(obj instanceof M3)) {
                z8 = false;
            } else {
                z8 = true;
            }
            this.hasNestedBuilders = z8;
            verifyType(i22, obj);
            Object fieldAllowBuilders = getFieldAllowBuilders(i22);
            if (fieldAllowBuilders == null) {
                list = new ArrayList();
                this.fields.put((Comparable<Object>) i22, (Object) list);
            } else {
                list = (List) fieldAllowBuilders;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public C2001t2 build() {
        return buildImpl(false);
    }

    public C2001t2 buildPartial() {
        return buildImpl(true);
    }

    public void clearField(InterfaceC1994s2 interfaceC1994s2) {
        ensureIsMutable();
        this.fields.remove(interfaceC1994s2);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Map<InterfaceC1994s2, Object> getAllFields() {
        K4 cloneAllFieldsMap;
        if (this.hasLazyField) {
            cloneAllFieldsMap = C2001t2.cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                cloneAllFieldsMap.makeImmutable();
            } else {
                replaceBuilders(cloneAllFieldsMap, true);
            }
            return cloneAllFieldsMap;
        }
        if (this.fields.isImmutable()) {
            return this.fields;
        }
        return Collections.unmodifiableMap(this.fields);
    }

    public Object getField(InterfaceC1994s2 interfaceC1994s2) {
        return replaceBuilders(interfaceC1994s2, getFieldAllowBuilders(interfaceC1994s2), true);
    }

    public Object getFieldAllowBuilders(InterfaceC1994s2 interfaceC1994s2) {
        Object obj = this.fields.get(interfaceC1994s2);
        if (obj instanceof C1954m3) {
            return ((C1954m3) obj).getValue();
        }
        return obj;
    }

    public Object getRepeatedField(InterfaceC1994s2 interfaceC1994s2, int i9) {
        if (this.hasNestedBuilders) {
            ensureIsMutable();
        }
        return replaceBuilder(getRepeatedFieldAllowBuilders(interfaceC1994s2, i9), true);
    }

    public Object getRepeatedFieldAllowBuilders(InterfaceC1994s2 interfaceC1994s2, int i9) {
        I2 i22 = (I2) interfaceC1994s2;
        if (i22.isRepeated()) {
            Object fieldAllowBuilders = getFieldAllowBuilders(i22);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(i9);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getRepeatedFieldCount(InterfaceC1994s2 interfaceC1994s2) {
        I2 i22 = (I2) interfaceC1994s2;
        if (i22.isRepeated()) {
            Object fieldAllowBuilders = getFieldAllowBuilders(i22);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((List) fieldAllowBuilders).size();
        }
        throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
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

    public boolean isInitialized() {
        boolean isInitialized;
        boolean isInitialized2;
        for (int i9 = 0; i9 < this.fields.getNumArrayEntries(); i9++) {
            isInitialized2 = C2001t2.isInitialized(this.fields.getArrayEntryAt(i9));
            if (!isInitialized2) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            isInitialized = C2001t2.isInitialized(it.next());
            if (!isInitialized) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(com.google.protobuf.C2001t2 r3) {
        /*
            r2 = this;
            r2.ensureIsMutable()
            r0 = 0
        L4:
            com.google.protobuf.K4 r1 = com.google.protobuf.C2001t2.access$400(r3)
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L1c
            com.google.protobuf.K4 r1 = com.google.protobuf.C2001t2.access$400(r3)
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            r2.mergeFromField(r1)
            int r0 = r0 + 1
            goto L4
        L1c:
            com.google.protobuf.K4 r3 = com.google.protobuf.C2001t2.access$400(r3)
            java.lang.Iterable r3 = r3.getOverflowEntries()
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.mergeFromField(r0)
            goto L28
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1987r2.mergeFrom(com.google.protobuf.t2):void");
    }

    public void setField(InterfaceC1994s2 interfaceC1994s2, Object obj) {
        boolean z8;
        ensureIsMutable();
        I2 i22 = (I2) interfaceC1994s2;
        boolean z9 = false;
        if (i22.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    verifyType(i22, next);
                    if (!this.hasNestedBuilders && !(next instanceof M3)) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    this.hasNestedBuilders = z8;
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
        if (this.hasNestedBuilders || (obj instanceof M3)) {
            z9 = true;
        }
        this.hasNestedBuilders = z9;
        this.fields.put((Comparable<Object>) i22, obj);
    }

    public void setRepeatedField(InterfaceC1994s2 interfaceC1994s2, int i9, Object obj) {
        boolean z8;
        ensureIsMutable();
        I2 i22 = (I2) interfaceC1994s2;
        if (i22.isRepeated()) {
            if (!this.hasNestedBuilders && !(obj instanceof M3)) {
                z8 = false;
            } else {
                z8 = true;
            }
            this.hasNestedBuilders = z8;
            Object fieldAllowBuilders = getFieldAllowBuilders(i22);
            if (fieldAllowBuilders != null) {
                verifyType(i22, obj);
                ((List) fieldAllowBuilders).set(i9, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    private C1987r2() {
        this(K4.newFieldMap(16));
    }

    private C1987r2(K4 k42) {
        this.fields = k42;
        this.isMutable = true;
    }

    private static <T extends InterfaceC1994s2> void replaceBuilders(Map.Entry<T, Object> entry, boolean z8) {
        entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z8));
    }

    private static <T extends InterfaceC1994s2> Object replaceBuilders(T t9, Object obj, boolean z8) {
        if (obj == null) {
            return obj;
        }
        I2 i22 = (I2) t9;
        if (i22.getLiteJavaType() != T5.MESSAGE) {
            return obj;
        }
        if (i22.isRepeated()) {
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    Object obj2 = list.get(i9);
                    Object replaceBuilder = replaceBuilder(obj2, z8);
                    if (replaceBuilder != obj2) {
                        if (list == obj) {
                            list = new ArrayList(list);
                        }
                        list.set(i9, replaceBuilder);
                    }
                }
                return list;
            }
            throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
        }
        return replaceBuilder(obj, z8);
    }
}
