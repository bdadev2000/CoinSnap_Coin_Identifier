package com.google.protobuf;

/* loaded from: classes4.dex */
public final class l9 extends h3 implements n9 {
    public /* synthetic */ l9(k9 k9Var) {
        this();
    }

    public l9 clearBoolValue() {
        copyOnWrite();
        ((Value) this.instance).clearBoolValue();
        return this;
    }

    public l9 clearKind() {
        copyOnWrite();
        ((Value) this.instance).clearKind();
        return this;
    }

    public l9 clearListValue() {
        copyOnWrite();
        ((Value) this.instance).clearListValue();
        return this;
    }

    public l9 clearNullValue() {
        copyOnWrite();
        ((Value) this.instance).clearNullValue();
        return this;
    }

    public l9 clearNumberValue() {
        copyOnWrite();
        ((Value) this.instance).clearNumberValue();
        return this;
    }

    public l9 clearStringValue() {
        copyOnWrite();
        ((Value) this.instance).clearStringValue();
        return this;
    }

    public l9 clearStructValue() {
        copyOnWrite();
        ((Value) this.instance).clearStructValue();
        return this;
    }

    @Override // com.google.protobuf.n9
    public boolean getBoolValue() {
        return ((Value) this.instance).getBoolValue();
    }

    @Override // com.google.protobuf.n9
    public m9 getKindCase() {
        return ((Value) this.instance).getKindCase();
    }

    @Override // com.google.protobuf.n9
    public ListValue getListValue() {
        return ((Value) this.instance).getListValue();
    }

    @Override // com.google.protobuf.n9
    public h6 getNullValue() {
        return ((Value) this.instance).getNullValue();
    }

    @Override // com.google.protobuf.n9
    public int getNullValueValue() {
        return ((Value) this.instance).getNullValueValue();
    }

    @Override // com.google.protobuf.n9
    public double getNumberValue() {
        return ((Value) this.instance).getNumberValue();
    }

    @Override // com.google.protobuf.n9
    public String getStringValue() {
        return ((Value) this.instance).getStringValue();
    }

    @Override // com.google.protobuf.n9
    public h0 getStringValueBytes() {
        return ((Value) this.instance).getStringValueBytes();
    }

    @Override // com.google.protobuf.n9
    public Struct getStructValue() {
        return ((Value) this.instance).getStructValue();
    }

    @Override // com.google.protobuf.n9
    public boolean hasBoolValue() {
        return ((Value) this.instance).hasBoolValue();
    }

    @Override // com.google.protobuf.n9
    public boolean hasListValue() {
        return ((Value) this.instance).hasListValue();
    }

    @Override // com.google.protobuf.n9
    public boolean hasNullValue() {
        return ((Value) this.instance).hasNullValue();
    }

    @Override // com.google.protobuf.n9
    public boolean hasNumberValue() {
        return ((Value) this.instance).hasNumberValue();
    }

    @Override // com.google.protobuf.n9
    public boolean hasStringValue() {
        return ((Value) this.instance).hasStringValue();
    }

    @Override // com.google.protobuf.n9
    public boolean hasStructValue() {
        return ((Value) this.instance).hasStructValue();
    }

    public l9 mergeListValue(ListValue listValue) {
        copyOnWrite();
        ((Value) this.instance).mergeListValue(listValue);
        return this;
    }

    public l9 mergeStructValue(Struct struct) {
        copyOnWrite();
        ((Value) this.instance).mergeStructValue(struct);
        return this;
    }

    public l9 setBoolValue(boolean z10) {
        copyOnWrite();
        ((Value) this.instance).setBoolValue(z10);
        return this;
    }

    public l9 setListValue(ListValue listValue) {
        copyOnWrite();
        ((Value) this.instance).setListValue(listValue);
        return this;
    }

    public l9 setNullValue(h6 h6Var) {
        copyOnWrite();
        ((Value) this.instance).setNullValue(h6Var);
        return this;
    }

    public l9 setNullValueValue(int i10) {
        copyOnWrite();
        ((Value) this.instance).setNullValueValue(i10);
        return this;
    }

    public l9 setNumberValue(double d10) {
        copyOnWrite();
        ((Value) this.instance).setNumberValue(d10);
        return this;
    }

    public l9 setStringValue(String str) {
        copyOnWrite();
        ((Value) this.instance).setStringValue(str);
        return this;
    }

    public l9 setStringValueBytes(h0 h0Var) {
        copyOnWrite();
        ((Value) this.instance).setStringValueBytes(h0Var);
        return this;
    }

    public l9 setStructValue(Struct struct) {
        copyOnWrite();
        ((Value) this.instance).setStructValue(struct);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private l9() {
        /*
            r1 = this;
            com.google.protobuf.Value r0 = com.google.protobuf.Value.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l9.<init>():void");
    }

    public l9 setListValue(y4 y4Var) {
        copyOnWrite();
        ((Value) this.instance).setListValue((ListValue) y4Var.build());
        return this;
    }

    public l9 setStructValue(t7 t7Var) {
        copyOnWrite();
        ((Value) this.instance).setStructValue((Struct) t7Var.build());
        return this;
    }
}
