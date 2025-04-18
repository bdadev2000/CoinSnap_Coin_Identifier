package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class v2 {
    private l7 fields;
    private boolean hasLazyField;
    private boolean hasNestedBuilders;
    private boolean isMutable;

    public /* synthetic */ v2(u2 u2Var) {
        this();
    }

    private x2 buildImpl(boolean z10) {
        if (this.fields.isEmpty()) {
            return x2.emptySet();
        }
        this.isMutable = false;
        l7 l7Var = this.fields;
        if (this.hasNestedBuilders) {
            l7Var = x2.cloneAllFieldsMap(l7Var, false);
            replaceBuilders(l7Var, z10);
        }
        x2 x2Var = new x2(l7Var, null);
        x2Var.hasLazyField = this.hasLazyField;
        return x2Var;
    }

    private void ensureIsMutable() {
        l7 cloneAllFieldsMap;
        if (!this.isMutable) {
            cloneAllFieldsMap = x2.cloneAllFieldsMap(this.fields, true);
            this.fields = cloneAllFieldsMap;
            this.isMutable = true;
        }
    }

    public static <T extends w2> v2 fromFieldSet(x2 x2Var) {
        l7 l7Var;
        l7 cloneAllFieldsMap;
        boolean z10;
        l7Var = x2Var.fields;
        cloneAllFieldsMap = x2.cloneAllFieldsMap(l7Var, true);
        v2 v2Var = new v2(cloneAllFieldsMap);
        z10 = x2Var.hasLazyField;
        v2Var.hasLazyField = z10;
        return v2Var;
    }

    private void mergeFromField(Map.Entry<w2, Object> entry) {
        Object cloneIfMutable;
        Object cloneIfMutable2;
        Object cloneIfMutable3;
        w2 key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof n4) {
            value = ((n4) value).getValue();
        }
        l3 l3Var = (l3) key;
        if (l3Var.isRepeated()) {
            List list = (List) getFieldAllowBuilders(l3Var);
            if (list == null) {
                list = new ArrayList();
                this.fields.put((Comparable<Object>) l3Var, (Object) list);
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                cloneIfMutable3 = x2.cloneIfMutable(it.next());
                list.add(cloneIfMutable3);
            }
            return;
        }
        if (l3Var.getLiteJavaType() == u9.MESSAGE) {
            Object fieldAllowBuilders = getFieldAllowBuilders(l3Var);
            if (fieldAllowBuilders == null) {
                l7 l7Var = this.fields;
                cloneIfMutable2 = x2.cloneIfMutable(value);
                l7Var.put((Comparable<Object>) l3Var, cloneIfMutable2);
                return;
            } else if (fieldAllowBuilders instanceof n5) {
                l3Var.internalMergeFrom((n5) fieldAllowBuilders, (o5) value);
                return;
            } else {
                this.fields.put((Comparable<Object>) l3Var, (Object) ((h3) l3Var.internalMergeFrom(((o5) fieldAllowBuilders).toBuilder(), (o5) value)).build());
                return;
            }
        }
        l7 l7Var2 = this.fields;
        cloneIfMutable = x2.cloneIfMutable(value);
        l7Var2.put((Comparable<Object>) l3Var, cloneIfMutable);
    }

    private static Object replaceBuilder(Object obj, boolean z10) {
        if (!(obj instanceof n5)) {
            return obj;
        }
        n5 n5Var = (n5) obj;
        if (z10) {
            return ((h3) n5Var).buildPartial();
        }
        return ((h3) n5Var).build();
    }

    private static <T extends w2> void replaceBuilders(l7 l7Var, boolean z10) {
        for (int i10 = 0; i10 < l7Var.getNumArrayEntries(); i10++) {
            replaceBuilders(l7Var.getArrayEntryAt(i10), z10);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = l7Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            replaceBuilders(it.next(), z10);
        }
    }

    private void verifyType(w2 w2Var, Object obj) {
        boolean isValidType;
        l3 l3Var = (l3) w2Var;
        isValidType = x2.isValidType(l3Var.getLiteType(), obj);
        if (!isValidType) {
            if (l3Var.getLiteType().getJavaType() == u9.MESSAGE && (obj instanceof n5)) {
            } else {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(l3Var.getNumber()), l3Var.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }
    }

    public void addRepeatedField(w2 w2Var, Object obj) {
        boolean z10;
        List list;
        ensureIsMutable();
        l3 l3Var = (l3) w2Var;
        if (l3Var.isRepeated()) {
            if (!this.hasNestedBuilders && !(obj instanceof n5)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.hasNestedBuilders = z10;
            verifyType(l3Var, obj);
            Object fieldAllowBuilders = getFieldAllowBuilders(l3Var);
            if (fieldAllowBuilders == null) {
                list = new ArrayList();
                this.fields.put((Comparable<Object>) l3Var, (Object) list);
            } else {
                list = (List) fieldAllowBuilders;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public x2 build() {
        return buildImpl(false);
    }

    public x2 buildPartial() {
        return buildImpl(true);
    }

    public void clearField(w2 w2Var) {
        ensureIsMutable();
        this.fields.remove(w2Var);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Map<w2, Object> getAllFields() {
        l7 cloneAllFieldsMap;
        if (this.hasLazyField) {
            cloneAllFieldsMap = x2.cloneAllFieldsMap(this.fields, false);
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

    public Object getField(w2 w2Var) {
        return replaceBuilders(w2Var, getFieldAllowBuilders(w2Var), true);
    }

    public Object getFieldAllowBuilders(w2 w2Var) {
        Object obj = this.fields.get(w2Var);
        if (obj instanceof n4) {
            return ((n4) obj).getValue();
        }
        return obj;
    }

    public Object getRepeatedField(w2 w2Var, int i10) {
        if (this.hasNestedBuilders) {
            ensureIsMutable();
        }
        return replaceBuilder(getRepeatedFieldAllowBuilders(w2Var, i10), true);
    }

    public Object getRepeatedFieldAllowBuilders(w2 w2Var, int i10) {
        l3 l3Var = (l3) w2Var;
        if (l3Var.isRepeated()) {
            Object fieldAllowBuilders = getFieldAllowBuilders(l3Var);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getRepeatedFieldCount(w2 w2Var) {
        l3 l3Var = (l3) w2Var;
        if (l3Var.isRepeated()) {
            Object fieldAllowBuilders = getFieldAllowBuilders(l3Var);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((List) fieldAllowBuilders).size();
        }
        throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
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

    public boolean isInitialized() {
        boolean isInitialized;
        boolean isInitialized2;
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            isInitialized2 = x2.isInitialized(this.fields.getArrayEntryAt(i10));
            if (!isInitialized2) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            isInitialized = x2.isInitialized(it.next());
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
    public void mergeFrom(com.google.protobuf.x2 r3) {
        /*
            r2 = this;
            r2.ensureIsMutable()
            r0 = 0
        L4:
            com.google.protobuf.l7 r1 = com.google.protobuf.x2.access$400(r3)
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L1c
            com.google.protobuf.l7 r1 = com.google.protobuf.x2.access$400(r3)
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            r2.mergeFromField(r1)
            int r0 = r0 + 1
            goto L4
        L1c:
            com.google.protobuf.l7 r3 = com.google.protobuf.x2.access$400(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v2.mergeFrom(com.google.protobuf.x2):void");
    }

    public void setField(w2 w2Var, Object obj) {
        boolean z10;
        ensureIsMutable();
        l3 l3Var = (l3) w2Var;
        boolean z11 = false;
        if (l3Var.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    verifyType(l3Var, next);
                    if (!this.hasNestedBuilders && !(next instanceof n5)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    this.hasNestedBuilders = z10;
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
        if (this.hasNestedBuilders || (obj instanceof n5)) {
            z11 = true;
        }
        this.hasNestedBuilders = z11;
        this.fields.put((Comparable<Object>) l3Var, obj);
    }

    public void setRepeatedField(w2 w2Var, int i10, Object obj) {
        boolean z10;
        ensureIsMutable();
        l3 l3Var = (l3) w2Var;
        if (l3Var.isRepeated()) {
            if (!this.hasNestedBuilders && !(obj instanceof n5)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.hasNestedBuilders = z10;
            Object fieldAllowBuilders = getFieldAllowBuilders(l3Var);
            if (fieldAllowBuilders != null) {
                verifyType(l3Var, obj);
                ((List) fieldAllowBuilders).set(i10, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    private v2() {
        this(l7.newFieldMap(16));
    }

    private v2(l7 l7Var) {
        this.fields = l7Var;
        this.isMutable = true;
    }

    private static <T extends w2> void replaceBuilders(Map.Entry<T, Object> entry, boolean z10) {
        entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z10));
    }

    private static <T extends w2> Object replaceBuilders(T t5, Object obj, boolean z10) {
        if (obj == null) {
            return obj;
        }
        l3 l3Var = (l3) t5;
        if (l3Var.getLiteJavaType() != u9.MESSAGE) {
            return obj;
        }
        if (l3Var.isRepeated()) {
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Object obj2 = list.get(i10);
                    Object replaceBuilder = replaceBuilder(obj2, z10);
                    if (replaceBuilder != obj2) {
                        if (list == obj) {
                            list = new ArrayList(list);
                        }
                        list.set(i10, replaceBuilder);
                    }
                }
                return list;
            }
            throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
        }
        return replaceBuilder(obj, z10);
    }
}
