package com.google.protobuf;

/* loaded from: classes3.dex */
public final class H1 extends D2 implements I1 {
    public /* synthetic */ H1(G1 g12) {
        this();
    }

    public H1 clearNanos() {
        copyOnWrite();
        Duration.access$400((Duration) this.instance);
        return this;
    }

    public H1 clearSeconds() {
        copyOnWrite();
        Duration.access$200((Duration) this.instance);
        return this;
    }

    @Override // com.google.protobuf.I1
    public int getNanos() {
        return ((Duration) this.instance).getNanos();
    }

    @Override // com.google.protobuf.I1
    public long getSeconds() {
        return ((Duration) this.instance).getSeconds();
    }

    public H1 setNanos(int i9) {
        copyOnWrite();
        Duration.access$300((Duration) this.instance, i9);
        return this;
    }

    public H1 setSeconds(long j7) {
        copyOnWrite();
        Duration.access$100((Duration) this.instance, j7);
        return this;
    }

    private H1() {
        super(Duration.access$000());
    }
}
