package com.google.protobuf;

/* loaded from: classes4.dex */
public final class g8 extends h3 implements h8 {
    public /* synthetic */ g8(f8 f8Var) {
        this();
    }

    public g8 clearNanos() {
        copyOnWrite();
        Timestamp.access$400((Timestamp) this.instance);
        return this;
    }

    public g8 clearSeconds() {
        copyOnWrite();
        Timestamp.access$200((Timestamp) this.instance);
        return this;
    }

    @Override // com.google.protobuf.h8
    public int getNanos() {
        return ((Timestamp) this.instance).getNanos();
    }

    @Override // com.google.protobuf.h8
    public long getSeconds() {
        return ((Timestamp) this.instance).getSeconds();
    }

    public g8 setNanos(int i10) {
        copyOnWrite();
        Timestamp.access$300((Timestamp) this.instance, i10);
        return this;
    }

    public g8 setSeconds(long j3) {
        copyOnWrite();
        Timestamp.access$100((Timestamp) this.instance, j3);
        return this;
    }

    private g8() {
        super(Timestamp.access$000());
    }
}
