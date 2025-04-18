package com.google.protobuf;

/* loaded from: classes4.dex */
public final class k6 extends h3 implements l6 {
    public /* synthetic */ k6(j6 j6Var) {
        this();
    }

    public k6 clearName() {
        copyOnWrite();
        ((Option) this.instance).clearName();
        return this;
    }

    public k6 clearValue() {
        copyOnWrite();
        ((Option) this.instance).clearValue();
        return this;
    }

    @Override // com.google.protobuf.l6
    public String getName() {
        return ((Option) this.instance).getName();
    }

    @Override // com.google.protobuf.l6
    public h0 getNameBytes() {
        return ((Option) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.l6
    public Any getValue() {
        return ((Option) this.instance).getValue();
    }

    @Override // com.google.protobuf.l6
    public boolean hasValue() {
        return ((Option) this.instance).hasValue();
    }

    public k6 mergeValue(Any any) {
        copyOnWrite();
        ((Option) this.instance).mergeValue(any);
        return this;
    }

    public k6 setName(String str) {
        copyOnWrite();
        ((Option) this.instance).setName(str);
        return this;
    }

    public k6 setNameBytes(h0 h0Var) {
        copyOnWrite();
        ((Option) this.instance).setNameBytes(h0Var);
        return this;
    }

    public k6 setValue(Any any) {
        copyOnWrite();
        ((Option) this.instance).setValue(any);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private k6() {
        /*
            r1 = this;
            com.google.protobuf.Option r0 = com.google.protobuf.Option.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k6.<init>():void");
    }

    public k6 setValue(h hVar) {
        copyOnWrite();
        ((Option) this.instance).setValue((Any) hVar.build());
        return this;
    }
}
