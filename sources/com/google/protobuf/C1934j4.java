package com.google.protobuf;

/* renamed from: com.google.protobuf.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1934j4 extends D2 implements InterfaceC1941k4 {
    public /* synthetic */ C1934j4(AbstractC1927i4 abstractC1927i4) {
        this();
    }

    public C1934j4 clearName() {
        copyOnWrite();
        ((Option) this.instance).clearName();
        return this;
    }

    public C1934j4 clearValue() {
        copyOnWrite();
        ((Option) this.instance).clearValue();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1941k4
    public String getName() {
        return ((Option) this.instance).getName();
    }

    @Override // com.google.protobuf.InterfaceC1941k4
    public H getNameBytes() {
        return ((Option) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC1941k4
    public Any getValue() {
        return ((Option) this.instance).getValue();
    }

    @Override // com.google.protobuf.InterfaceC1941k4
    public boolean hasValue() {
        return ((Option) this.instance).hasValue();
    }

    public C1934j4 mergeValue(Any any) {
        copyOnWrite();
        ((Option) this.instance).mergeValue(any);
        return this;
    }

    public C1934j4 setName(String str) {
        copyOnWrite();
        ((Option) this.instance).setName(str);
        return this;
    }

    public C1934j4 setNameBytes(H h6) {
        copyOnWrite();
        ((Option) this.instance).setNameBytes(h6);
        return this;
    }

    public C1934j4 setValue(Any any) {
        copyOnWrite();
        ((Option) this.instance).setValue(any);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1934j4() {
        /*
            r1 = this;
            com.google.protobuf.Option r0 = com.google.protobuf.Option.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1934j4.<init>():void");
    }

    public C1934j4 setValue(C1915h c1915h) {
        copyOnWrite();
        ((Option) this.instance).setValue((Any) c1915h.build());
        return this;
    }
}
