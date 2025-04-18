package com.google.protobuf;

/* loaded from: classes4.dex */
public final class l1 extends h3 implements m1 {
    public /* synthetic */ l1(k1 k1Var) {
        this();
    }

    public l1 clearNanos() {
        copyOnWrite();
        Duration.access$400((Duration) this.instance);
        return this;
    }

    public l1 clearSeconds() {
        copyOnWrite();
        Duration.access$200((Duration) this.instance);
        return this;
    }

    @Override // com.google.protobuf.m1
    public int getNanos() {
        return ((Duration) this.instance).getNanos();
    }

    @Override // com.google.protobuf.m1
    public long getSeconds() {
        return ((Duration) this.instance).getSeconds();
    }

    public l1 setNanos(int i10) {
        copyOnWrite();
        Duration.access$300((Duration) this.instance, i10);
        return this;
    }

    public l1 setSeconds(long j3) {
        copyOnWrite();
        Duration.access$100((Duration) this.instance, j3);
        return this;
    }

    private l1() {
        super(Duration.access$000());
    }
}
