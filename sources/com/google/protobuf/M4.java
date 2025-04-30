package com.google.protobuf;

/* loaded from: classes3.dex */
public final class M4 extends D2 implements N4 {
    public /* synthetic */ M4(L4 l42) {
        this();
    }

    public M4 clearFileName() {
        copyOnWrite();
        ((SourceContext) this.instance).clearFileName();
        return this;
    }

    @Override // com.google.protobuf.N4
    public String getFileName() {
        return ((SourceContext) this.instance).getFileName();
    }

    @Override // com.google.protobuf.N4
    public H getFileNameBytes() {
        return ((SourceContext) this.instance).getFileNameBytes();
    }

    public M4 setFileName(String str) {
        copyOnWrite();
        ((SourceContext) this.instance).setFileName(str);
        return this;
    }

    public M4 setFileNameBytes(H h6) {
        copyOnWrite();
        ((SourceContext) this.instance).setFileNameBytes(h6);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private M4() {
        /*
            r1 = this;
            com.google.protobuf.SourceContext r0 = com.google.protobuf.SourceContext.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M4.<init>():void");
    }
}
