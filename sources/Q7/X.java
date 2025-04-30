package Q7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class X extends d0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(U u8) {
        super(true);
        C0242j c0242j;
        C0242j c0242j2;
        boolean z8 = true;
        I(u8);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d0.f2560c;
        InterfaceC0241i interfaceC0241i = (InterfaceC0241i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0241i instanceof C0242j) {
            c0242j = (C0242j) interfaceC0241i;
        } else {
            c0242j = null;
        }
        if (c0242j != null) {
            d0 k6 = c0242j.k();
            while (!k6.C()) {
                InterfaceC0241i interfaceC0241i2 = (InterfaceC0241i) atomicReferenceFieldUpdater.get(k6);
                if (interfaceC0241i2 instanceof C0242j) {
                    c0242j2 = (C0242j) interfaceC0241i2;
                } else {
                    c0242j2 = null;
                }
                if (c0242j2 != null) {
                    k6 = c0242j2.k();
                }
            }
            this.f2544d = z8;
        }
        z8 = false;
        this.f2544d = z8;
    }

    @Override // Q7.d0
    public final boolean C() {
        return this.f2544d;
    }

    @Override // Q7.d0
    public final boolean D() {
        return true;
    }
}
