package com.google.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class J2 extends S1 {
    final N3 containingTypeDefaultInstance;
    final Object defaultValue;
    final I2 descriptor;
    final N3 messageDefaultInstance;

    public J2(N3 n32, Object obj, N3 n33, I2 i22, Class cls) {
        if (n32 != null) {
            if (i22.getLiteType() == S5.MESSAGE && n33 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = n32;
            this.defaultValue = obj;
            this.messageDefaultInstance = n33;
            this.descriptor = i22;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public Object fromFieldSetType(Object obj) {
        if (this.descriptor.isRepeated()) {
            if (this.descriptor.getLiteJavaType() == T5.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularFromFieldSetType(it.next()));
                }
                return arrayList;
            }
            return obj;
        }
        return singularFromFieldSetType(obj);
    }

    public N3 getContainingTypeDefaultInstance() {
        return this.containingTypeDefaultInstance;
    }

    @Override // com.google.protobuf.S1
    public Object getDefaultValue() {
        return this.defaultValue;
    }

    @Override // com.google.protobuf.S1
    public S5 getLiteType() {
        return this.descriptor.getLiteType();
    }

    @Override // com.google.protobuf.S1
    public N3 getMessageDefaultInstance() {
        return this.messageDefaultInstance;
    }

    @Override // com.google.protobuf.S1
    public int getNumber() {
        return this.descriptor.getNumber();
    }

    @Override // com.google.protobuf.S1
    public boolean isRepeated() {
        return this.descriptor.isRepeated;
    }

    public Object singularFromFieldSetType(Object obj) {
        if (this.descriptor.getLiteJavaType() == T5.ENUM) {
            return this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue());
        }
        return obj;
    }

    public Object singularToFieldSetType(Object obj) {
        if (this.descriptor.getLiteJavaType() == T5.ENUM) {
            return Integer.valueOf(((V2) obj).getNumber());
        }
        return obj;
    }

    public Object toFieldSetType(Object obj) {
        if (this.descriptor.isRepeated()) {
            if (this.descriptor.getLiteJavaType() == T5.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularToFieldSetType(it.next()));
                }
                return arrayList;
            }
            return obj;
        }
        return singularToFieldSetType(obj);
    }
}
