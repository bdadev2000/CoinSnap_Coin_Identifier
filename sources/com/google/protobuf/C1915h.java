package com.google.protobuf;

/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1915h extends D2 implements InterfaceC1922i {
    public /* synthetic */ C1915h(AbstractC1908g abstractC1908g) {
        this();
    }

    public C1915h clearTypeUrl() {
        copyOnWrite();
        ((Any) this.instance).clearTypeUrl();
        return this;
    }

    public C1915h clearValue() {
        copyOnWrite();
        ((Any) this.instance).clearValue();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1922i
    public String getTypeUrl() {
        return ((Any) this.instance).getTypeUrl();
    }

    @Override // com.google.protobuf.InterfaceC1922i
    public H getTypeUrlBytes() {
        return ((Any) this.instance).getTypeUrlBytes();
    }

    @Override // com.google.protobuf.InterfaceC1922i
    public H getValue() {
        return ((Any) this.instance).getValue();
    }

    public C1915h setTypeUrl(String str) {
        copyOnWrite();
        ((Any) this.instance).setTypeUrl(str);
        return this;
    }

    public C1915h setTypeUrlBytes(H h6) {
        copyOnWrite();
        ((Any) this.instance).setTypeUrlBytes(h6);
        return this;
    }

    public C1915h setValue(H h6) {
        copyOnWrite();
        ((Any) this.instance).setValue(h6);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1915h() {
        /*
            r1 = this;
            com.google.protobuf.Any r0 = com.google.protobuf.Any.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1915h.<init>():void");
    }
}
