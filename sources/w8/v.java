package w8;

import androidx.fragment.app.FragmentTransaction;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final u f24047a = new u(new byte[0], 0, 0, false);
    public static final int b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f24048c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i9 = 0; i9 < highestOneBit; i9++) {
            atomicReferenceArr[i9] = new AtomicReference();
        }
        f24048c = atomicReferenceArr;
    }

    public static final void a(u uVar) {
        int i9;
        G7.j.e(uVar, "segment");
        if (uVar.f24045f == null && uVar.f24046g == null) {
            if (uVar.f24043d) {
                return;
            }
            AtomicReference atomicReference = f24048c[(int) (Thread.currentThread().getId() & (b - 1))];
            u uVar2 = (u) atomicReference.get();
            if (uVar2 == f24047a) {
                return;
            }
            if (uVar2 == null) {
                i9 = 0;
            } else {
                i9 = uVar2.f24042c;
            }
            if (i9 >= 65536) {
                return;
            }
            uVar.f24045f = uVar2;
            uVar.b = 0;
            uVar.f24042c = i9 + FragmentTransaction.TRANSIT_EXIT_MASK;
            while (!atomicReference.compareAndSet(uVar2, uVar)) {
                if (atomicReference.get() != uVar2) {
                    uVar.f24045f = null;
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final u b() {
        AtomicReference atomicReference = f24048c[(int) (Thread.currentThread().getId() & (b - 1))];
        u uVar = f24047a;
        u uVar2 = (u) atomicReference.getAndSet(uVar);
        if (uVar2 == uVar) {
            return new u();
        }
        if (uVar2 == null) {
            atomicReference.set(null);
            return new u();
        }
        atomicReference.set(uVar2.f24045f);
        uVar2.f24045f = null;
        uVar2.f24042c = 0;
        return uVar2;
    }
}
