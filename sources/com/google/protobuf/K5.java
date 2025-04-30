package com.google.protobuf;

/* loaded from: classes3.dex */
public final class K5 extends D2 implements M5 {
    public /* synthetic */ K5(J5 j52) {
        this();
    }

    public K5 clearBoolValue() {
        copyOnWrite();
        ((Value) this.instance).clearBoolValue();
        return this;
    }

    public K5 clearKind() {
        copyOnWrite();
        ((Value) this.instance).clearKind();
        return this;
    }

    public K5 clearListValue() {
        copyOnWrite();
        ((Value) this.instance).clearListValue();
        return this;
    }

    public K5 clearNullValue() {
        copyOnWrite();
        ((Value) this.instance).clearNullValue();
        return this;
    }

    public K5 clearNumberValue() {
        copyOnWrite();
        ((Value) this.instance).clearNumberValue();
        return this;
    }

    public K5 clearStringValue() {
        copyOnWrite();
        ((Value) this.instance).clearStringValue();
        return this;
    }

    public K5 clearStructValue() {
        copyOnWrite();
        ((Value) this.instance).clearStructValue();
        return this;
    }

    @Override // com.google.protobuf.M5
    public boolean getBoolValue() {
        return ((Value) this.instance).getBoolValue();
    }

    @Override // com.google.protobuf.M5
    public L5 getKindCase() {
        return ((Value) this.instance).getKindCase();
    }

    @Override // com.google.protobuf.M5
    public ListValue getListValue() {
        return ((Value) this.instance).getListValue();
    }

    @Override // com.google.protobuf.M5
    public EnumC1913g4 getNullValue() {
        return ((Value) this.instance).getNullValue();
    }

    @Override // com.google.protobuf.M5
    public int getNullValueValue() {
        return ((Value) this.instance).getNullValueValue();
    }

    @Override // com.google.protobuf.M5
    public double getNumberValue() {
        return ((Value) this.instance).getNumberValue();
    }

    @Override // com.google.protobuf.M5
    public String getStringValue() {
        return ((Value) this.instance).getStringValue();
    }

    @Override // com.google.protobuf.M5
    public H getStringValueBytes() {
        return ((Value) this.instance).getStringValueBytes();
    }

    @Override // com.google.protobuf.M5
    public Struct getStructValue() {
        return ((Value) this.instance).getStructValue();
    }

    @Override // com.google.protobuf.M5
    public boolean hasBoolValue() {
        return ((Value) this.instance).hasBoolValue();
    }

    @Override // com.google.protobuf.M5
    public boolean hasListValue() {
        return ((Value) this.instance).hasListValue();
    }

    @Override // com.google.protobuf.M5
    public boolean hasNullValue() {
        return ((Value) this.instance).hasNullValue();
    }

    @Override // com.google.protobuf.M5
    public boolean hasNumberValue() {
        return ((Value) this.instance).hasNumberValue();
    }

    @Override // com.google.protobuf.M5
    public boolean hasStringValue() {
        return ((Value) this.instance).hasStringValue();
    }

    @Override // com.google.protobuf.M5
    public boolean hasStructValue() {
        return ((Value) this.instance).hasStructValue();
    }

    public K5 mergeListValue(ListValue listValue) {
        copyOnWrite();
        ((Value) this.instance).mergeListValue(listValue);
        return this;
    }

    public K5 mergeStructValue(Struct struct) {
        copyOnWrite();
        ((Value) this.instance).mergeStructValue(struct);
        return this;
    }

    public K5 setBoolValue(boolean z8) {
        copyOnWrite();
        ((Value) this.instance).setBoolValue(z8);
        return this;
    }

    public K5 setListValue(ListValue listValue) {
        copyOnWrite();
        ((Value) this.instance).setListValue(listValue);
        return this;
    }

    public K5 setNullValue(EnumC1913g4 enumC1913g4) {
        copyOnWrite();
        ((Value) this.instance).setNullValue(enumC1913g4);
        return this;
    }

    public K5 setNullValueValue(int i9) {
        copyOnWrite();
        ((Value) this.instance).setNullValueValue(i9);
        return this;
    }

    public K5 setNumberValue(double d2) {
        copyOnWrite();
        ((Value) this.instance).setNumberValue(d2);
        return this;
    }

    public K5 setStringValue(String str) {
        copyOnWrite();
        ((Value) this.instance).setStringValue(str);
        return this;
    }

    public K5 setStringValueBytes(H h6) {
        copyOnWrite();
        ((Value) this.instance).setStringValueBytes(h6);
        return this;
    }

    public K5 setStructValue(Struct struct) {
        copyOnWrite();
        ((Value) this.instance).setStructValue(struct);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private K5() {
        /*
            r1 = this;
            com.google.protobuf.Value r0 = com.google.protobuf.Value.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.K5.<init>():void");
    }

    public K5 setListValue(C2030x3 c2030x3) {
        copyOnWrite();
        ((Value) this.instance).setListValue((ListValue) c2030x3.build());
        return this;
    }

    public K5 setStructValue(S4 s42) {
        copyOnWrite();
        ((Value) this.instance).setStructValue((Struct) s42.build());
        return this;
    }
}
