package i9;

import a9.h;
import java.util.Collections;
import java.util.List;
import v8.u0;

/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final b f19505c = new b();

    /* renamed from: b, reason: collision with root package name */
    public final List f19506b;

    public b(a9.b bVar) {
        this.f19506b = Collections.singletonList(bVar);
    }

    @Override // a9.h
    public final List getCues(long j3) {
        return j3 >= 0 ? this.f19506b : Collections.emptyList();
    }

    @Override // a9.h
    public final long getEventTime(int i10) {
        u0.d(i10 == 0);
        return 0L;
    }

    @Override // a9.h
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // a9.h
    public final int getNextEventTimeIndex(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    public b() {
        this.f19506b = Collections.emptyList();
    }
}
