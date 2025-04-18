package te;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25378b;

    public a(long j3) {
        this.f25378b = j3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ze.b bVar = (ze.b) obj;
        ze.b bVar2 = (ze.b) obj2;
        long j3 = bVar.f28749b * bVar.f28750c;
        long j10 = this.f25378b;
        long abs = Math.abs(j3 - j10);
        long abs2 = Math.abs((bVar2.f28749b * bVar2.f28750c) - j10);
        if (abs < abs2) {
            return -1;
        }
        if (abs == abs2) {
            return 0;
        }
        return 1;
    }
}
