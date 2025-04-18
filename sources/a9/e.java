package a9;

import com.google.common.collect.n0;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import java.util.List;
import v8.u0;

/* loaded from: classes3.dex */
public final class e implements h {

    /* renamed from: b, reason: collision with root package name */
    public final long f386b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f387c;

    public e(long j3, z1 z1Var) {
        this.f386b = j3;
        this.f387c = z1Var;
    }

    @Override // a9.h
    public final List getCues(long j3) {
        if (j3 >= this.f386b) {
            return this.f387c;
        }
        n0 n0Var = r0.f12026c;
        return z1.f12062g;
    }

    @Override // a9.h
    public final long getEventTime(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        return this.f386b;
    }

    @Override // a9.h
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // a9.h
    public final int getNextEventTimeIndex(long j3) {
        return this.f386b > j3 ? 0 : -1;
    }
}
