package ki;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class g0 {
    public static final f0 a = new f0(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f20987b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f20988c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f20987b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f20988c = atomicReferenceArr;
    }

    public static final void a(f0 segment) {
        boolean z10;
        int i10;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f20983f == null && segment.f20984g == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (segment.f20981d) {
                return;
            }
            AtomicReference atomicReference = f20988c[(int) (Thread.currentThread().getId() & (f20987b - 1))];
            f0 f0Var = a;
            f0 f0Var2 = (f0) atomicReference.getAndSet(f0Var);
            if (f0Var2 == f0Var) {
                return;
            }
            if (f0Var2 != null) {
                i10 = f0Var2.f20980c;
            } else {
                i10 = 0;
            }
            if (i10 >= 65536) {
                atomicReference.set(f0Var2);
                return;
            }
            segment.f20983f = f0Var2;
            segment.f20979b = 0;
            segment.f20980c = i10 + 8192;
            atomicReference.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final f0 b() {
        AtomicReference atomicReference = f20988c[(int) (Thread.currentThread().getId() & (f20987b - 1))];
        f0 f0Var = a;
        f0 f0Var2 = (f0) atomicReference.getAndSet(f0Var);
        if (f0Var2 == f0Var) {
            return new f0();
        }
        if (f0Var2 == null) {
            atomicReference.set(null);
            return new f0();
        }
        atomicReference.set(f0Var2.f20983f);
        f0Var2.f20983f = null;
        f0Var2.f20980c = 0;
        return f0Var2;
    }
}
