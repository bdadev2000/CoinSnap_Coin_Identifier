package b9;

import a9.l;

/* loaded from: classes3.dex */
public final class g extends l implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    public long f2401m;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (c(4) != gVar.c(4)) {
            if (c(4)) {
                return 1;
            }
        } else {
            long j3 = this.f26892h - gVar.f26892h;
            if (j3 == 0) {
                j3 = this.f2401m - gVar.f2401m;
                if (j3 == 0) {
                    return 0;
                }
            }
            if (j3 > 0) {
                return 1;
            }
        }
        return -1;
    }
}
