package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2030x3 extends D2 implements InterfaceC2037y3 {
    public /* synthetic */ C2030x3(AbstractC2023w3 abstractC2023w3) {
        this();
    }

    public C2030x3 addAllValues(Iterable<? extends Value> iterable) {
        copyOnWrite();
        ((ListValue) this.instance).addAllValues(iterable);
        return this;
    }

    public C2030x3 addValues(Value value) {
        copyOnWrite();
        ((ListValue) this.instance).addValues(value);
        return this;
    }

    public C2030x3 clearValues() {
        copyOnWrite();
        ((ListValue) this.instance).clearValues();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC2037y3
    public Value getValues(int i9) {
        return ((ListValue) this.instance).getValues(i9);
    }

    @Override // com.google.protobuf.InterfaceC2037y3
    public int getValuesCount() {
        return ((ListValue) this.instance).getValuesCount();
    }

    @Override // com.google.protobuf.InterfaceC2037y3
    public List<Value> getValuesList() {
        return Collections.unmodifiableList(((ListValue) this.instance).getValuesList());
    }

    public C2030x3 removeValues(int i9) {
        copyOnWrite();
        ((ListValue) this.instance).removeValues(i9);
        return this;
    }

    public C2030x3 setValues(int i9, Value value) {
        copyOnWrite();
        ((ListValue) this.instance).setValues(i9, value);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C2030x3() {
        /*
            r1 = this;
            com.google.protobuf.ListValue r0 = com.google.protobuf.ListValue.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2030x3.<init>():void");
    }

    public C2030x3 addValues(int i9, Value value) {
        copyOnWrite();
        ((ListValue) this.instance).addValues(i9, value);
        return this;
    }

    public C2030x3 setValues(int i9, K5 k52) {
        copyOnWrite();
        ((ListValue) this.instance).setValues(i9, (Value) k52.build());
        return this;
    }

    public C2030x3 addValues(K5 k52) {
        copyOnWrite();
        ((ListValue) this.instance).addValues((Value) k52.build());
        return this;
    }

    public C2030x3 addValues(int i9, K5 k52) {
        copyOnWrite();
        ((ListValue) this.instance).addValues(i9, (Value) k52.build());
        return this;
    }
}
