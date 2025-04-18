package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class y4 extends h3 implements z4 {
    public /* synthetic */ y4(x4 x4Var) {
        this();
    }

    public y4 addAllValues(Iterable<? extends Value> iterable) {
        copyOnWrite();
        ((ListValue) this.instance).addAllValues(iterable);
        return this;
    }

    public y4 addValues(Value value) {
        copyOnWrite();
        ((ListValue) this.instance).addValues(value);
        return this;
    }

    public y4 clearValues() {
        copyOnWrite();
        ((ListValue) this.instance).clearValues();
        return this;
    }

    @Override // com.google.protobuf.z4
    public Value getValues(int i10) {
        return ((ListValue) this.instance).getValues(i10);
    }

    @Override // com.google.protobuf.z4
    public int getValuesCount() {
        return ((ListValue) this.instance).getValuesCount();
    }

    @Override // com.google.protobuf.z4
    public List<Value> getValuesList() {
        return Collections.unmodifiableList(((ListValue) this.instance).getValuesList());
    }

    public y4 removeValues(int i10) {
        copyOnWrite();
        ((ListValue) this.instance).removeValues(i10);
        return this;
    }

    public y4 setValues(int i10, Value value) {
        copyOnWrite();
        ((ListValue) this.instance).setValues(i10, value);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private y4() {
        /*
            r1 = this;
            com.google.protobuf.ListValue r0 = com.google.protobuf.ListValue.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y4.<init>():void");
    }

    public y4 addValues(int i10, Value value) {
        copyOnWrite();
        ((ListValue) this.instance).addValues(i10, value);
        return this;
    }

    public y4 setValues(int i10, l9 l9Var) {
        copyOnWrite();
        ((ListValue) this.instance).setValues(i10, (Value) l9Var.build());
        return this;
    }

    public y4 addValues(l9 l9Var) {
        copyOnWrite();
        ((ListValue) this.instance).addValues((Value) l9Var.build());
        return this;
    }

    public y4 addValues(int i10, l9 l9Var) {
        copyOnWrite();
        ((ListValue) this.instance).addValues(i10, (Value) l9Var.build());
        return this;
    }
}
