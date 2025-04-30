package com.google.protobuf;

/* renamed from: com.google.protobuf.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1907f5 extends D2 implements InterfaceC1914g5 {
    public /* synthetic */ C1907f5(AbstractC1900e5 abstractC1900e5) {
        this();
    }

    public C1907f5 clearNanos() {
        copyOnWrite();
        Timestamp.access$400((Timestamp) this.instance);
        return this;
    }

    public C1907f5 clearSeconds() {
        copyOnWrite();
        Timestamp.access$200((Timestamp) this.instance);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1914g5
    public int getNanos() {
        return ((Timestamp) this.instance).getNanos();
    }

    @Override // com.google.protobuf.InterfaceC1914g5
    public long getSeconds() {
        return ((Timestamp) this.instance).getSeconds();
    }

    public C1907f5 setNanos(int i9) {
        copyOnWrite();
        Timestamp.access$300((Timestamp) this.instance, i9);
        return this;
    }

    public C1907f5 setSeconds(long j7) {
        copyOnWrite();
        Timestamp.access$100((Timestamp) this.instance, j7);
        return this;
    }

    private C1907f5() {
        super(Timestamp.access$000());
    }
}
