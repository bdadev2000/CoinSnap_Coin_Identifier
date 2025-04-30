package f5;

import com.google.firebase.perf.v1.CpuMetricReading;
import h5.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f20329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f20330d;

    public /* synthetic */ a(b bVar, i iVar, int i9) {
        this.b = i9;
        this.f20329c = bVar;
        this.f20330d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                b bVar = this.f20329c;
                CpuMetricReading b = bVar.b(this.f20330d);
                if (b != null) {
                    bVar.f20333a.add(b);
                    return;
                }
                return;
            default:
                b bVar2 = this.f20329c;
                CpuMetricReading b8 = bVar2.b(this.f20330d);
                if (b8 != null) {
                    bVar2.f20333a.add(b8);
                    return;
                }
                return;
        }
    }
}
