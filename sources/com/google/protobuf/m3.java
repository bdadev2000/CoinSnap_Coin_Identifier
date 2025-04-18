package com.google.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class m3 extends w1 {
    final o5 containingTypeDefaultInstance;
    final Object defaultValue;
    final l3 descriptor;
    final o5 messageDefaultInstance;

    public m3(o5 o5Var, Object obj, o5 o5Var2, l3 l3Var, Class cls) {
        if (o5Var != null) {
            if (l3Var.getLiteType() == t9.MESSAGE && o5Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = o5Var;
            this.defaultValue = obj;
            this.messageDefaultInstance = o5Var2;
            this.descriptor = l3Var;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public Object fromFieldSetType(Object obj) {
        if (this.descriptor.isRepeated()) {
            if (this.descriptor.getLiteJavaType() == u9.ENUM) {
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

    public o5 getContainingTypeDefaultInstance() {
        return this.containingTypeDefaultInstance;
    }

    @Override // com.google.protobuf.w1
    public Object getDefaultValue() {
        return this.defaultValue;
    }

    @Override // com.google.protobuf.w1
    public t9 getLiteType() {
        return this.descriptor.getLiteType();
    }

    @Override // com.google.protobuf.w1
    public o5 getMessageDefaultInstance() {
        return this.messageDefaultInstance;
    }

    @Override // com.google.protobuf.w1
    public int getNumber() {
        return this.descriptor.getNumber();
    }

    @Override // com.google.protobuf.w1
    public boolean isRepeated() {
        return this.descriptor.isRepeated;
    }

    public Object singularFromFieldSetType(Object obj) {
        if (this.descriptor.getLiteJavaType() == u9.ENUM) {
            return this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue());
        }
        return obj;
    }

    public Object singularToFieldSetType(Object obj) {
        if (this.descriptor.getLiteJavaType() == u9.ENUM) {
            return Integer.valueOf(((y3) obj).getNumber());
        }
        return obj;
    }

    public Object toFieldSetType(Object obj) {
        if (this.descriptor.isRepeated()) {
            if (this.descriptor.getLiteJavaType() == u9.ENUM) {
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
