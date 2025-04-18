package com.google.protobuf;

/* loaded from: classes4.dex */
public final class n7 extends h3 implements o7 {
    public /* synthetic */ n7(m7 m7Var) {
        this();
    }

    public n7 clearFileName() {
        copyOnWrite();
        ((SourceContext) this.instance).clearFileName();
        return this;
    }

    @Override // com.google.protobuf.o7
    public String getFileName() {
        return ((SourceContext) this.instance).getFileName();
    }

    @Override // com.google.protobuf.o7
    public h0 getFileNameBytes() {
        return ((SourceContext) this.instance).getFileNameBytes();
    }

    public n7 setFileName(String str) {
        copyOnWrite();
        ((SourceContext) this.instance).setFileName(str);
        return this;
    }

    public n7 setFileNameBytes(h0 h0Var) {
        copyOnWrite();
        ((SourceContext) this.instance).setFileNameBytes(h0Var);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private n7() {
        /*
            r1 = this;
            com.google.protobuf.SourceContext r0 = com.google.protobuf.SourceContext.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.n7.<init>():void");
    }
}
