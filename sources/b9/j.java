package b9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v8.u0;

/* loaded from: classes3.dex */
public final class j implements a9.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2408b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2409c;

    public /* synthetic */ j(List list, int i10) {
        this.f2408b = i10;
        this.f2409c = list;
    }

    @Override // a9.h
    public final List getCues(long j3) {
        int i10 = this.f2408b;
        List list = this.f2409c;
        switch (i10) {
            case 0:
                if (j3 < 0) {
                    return Collections.emptyList();
                }
                return list;
            case 1:
            case 2:
                return list;
            default:
                if (j3 < 0) {
                    return Collections.emptyList();
                }
                return list;
        }
    }

    @Override // a9.h
    public final long getEventTime(int i10) {
        boolean z10 = true;
        switch (this.f2408b) {
            case 0:
                if (i10 != 0) {
                    z10 = false;
                }
                u0.d(z10);
                return 0L;
            case 1:
            case 2:
                return 0L;
            default:
                if (i10 != 0) {
                    z10 = false;
                }
                u0.d(z10);
                return 0L;
        }
    }

    @Override // a9.h
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // a9.h
    public final int getNextEventTimeIndex(long j3) {
        switch (this.f2408b) {
            case 0:
                return j3 < 0 ? 0 : -1;
            case 1:
            case 2:
                return -1;
            default:
                return j3 < 0 ? 0 : -1;
        }
    }

    public j(ArrayList arrayList) {
        this.f2408b = 3;
        this.f2409c = Collections.unmodifiableList(arrayList);
    }
}
