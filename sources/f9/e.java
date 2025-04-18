package f9;

import a9.h;
import java.util.Collections;
import java.util.List;
import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public final class e implements h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17751b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17752c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17753d;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f17751b = i10;
        this.f17752c = obj;
        this.f17753d = obj2;
    }

    @Override // a9.h
    public final List getCues(long j3) {
        a9.b bVar;
        int i10 = this.f17751b;
        Object obj = this.f17752c;
        Object obj2 = this.f17753d;
        switch (i10) {
            case 0:
                int d10 = h0.d((List) obj2, Long.valueOf(j3), false);
                if (d10 == -1) {
                    return Collections.emptyList();
                }
                return (List) ((List) obj).get(d10);
            default:
                int f10 = h0.f((long[]) obj2, j3, false);
                if (f10 != -1 && (bVar = ((a9.b[]) obj)[f10]) != a9.b.f359t) {
                    return Collections.singletonList(bVar);
                }
                return Collections.emptyList();
        }
    }

    @Override // a9.h
    public final long getEventTime(int i10) {
        boolean z10;
        boolean z11;
        int i11 = this.f17751b;
        Object obj = this.f17753d;
        boolean z12 = false;
        switch (i11) {
            case 0:
                if (i10 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u0.d(z11);
                List list = (List) obj;
                if (i10 < list.size()) {
                    z12 = true;
                }
                u0.d(z12);
                return ((Long) list.get(i10)).longValue();
            default:
                if (i10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u0.d(z10);
                long[] jArr = (long[]) obj;
                if (i10 < jArr.length) {
                    z12 = true;
                }
                u0.d(z12);
                return jArr[i10];
        }
    }

    @Override // a9.h
    public final int getEventTimeCount() {
        int i10 = this.f17751b;
        Object obj = this.f17753d;
        switch (i10) {
            case 0:
                return ((List) obj).size();
            default:
                return ((long[]) obj).length;
        }
    }

    @Override // a9.h
    public final int getNextEventTimeIndex(long j3) {
        int i10;
        int i11 = this.f17751b;
        Object obj = this.f17753d;
        switch (i11) {
            case 0:
                List list = (List) obj;
                Long valueOf = Long.valueOf(j3);
                int i12 = h0.a;
                int binarySearch = Collections.binarySearch(list, valueOf);
                if (binarySearch < 0) {
                    i10 = ~binarySearch;
                } else {
                    int size = list.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i10 = binarySearch;
                    } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) == 0);
                    i10 = binarySearch;
                }
                if (i10 >= list.size()) {
                    return -1;
                }
                return i10;
            default:
                long[] jArr = (long[]) obj;
                int b3 = h0.b(jArr, j3, false);
                if (b3 >= jArr.length) {
                    return -1;
                }
                return b3;
        }
    }
}
