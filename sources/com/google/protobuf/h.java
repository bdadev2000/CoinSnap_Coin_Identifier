package com.google.protobuf;

/* loaded from: classes4.dex */
public final class h extends h3 implements i {
    public /* synthetic */ h(g gVar) {
        this();
    }

    public h clearTypeUrl() {
        copyOnWrite();
        ((Any) this.instance).clearTypeUrl();
        return this;
    }

    public h clearValue() {
        copyOnWrite();
        ((Any) this.instance).clearValue();
        return this;
    }

    @Override // com.google.protobuf.i
    public String getTypeUrl() {
        return ((Any) this.instance).getTypeUrl();
    }

    @Override // com.google.protobuf.i
    public h0 getTypeUrlBytes() {
        return ((Any) this.instance).getTypeUrlBytes();
    }

    @Override // com.google.protobuf.i
    public h0 getValue() {
        return ((Any) this.instance).getValue();
    }

    public h setTypeUrl(String str) {
        copyOnWrite();
        ((Any) this.instance).setTypeUrl(str);
        return this;
    }

    public h setTypeUrlBytes(h0 h0Var) {
        copyOnWrite();
        ((Any) this.instance).setTypeUrlBytes(h0Var);
        return this;
    }

    public h setValue(h0 h0Var) {
        copyOnWrite();
        ((Any) this.instance).setValue(h0Var);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private h() {
        /*
            r1 = this;
            com.google.protobuf.Any r0 = com.google.protobuf.Any.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h.<init>():void");
    }
}
