package f5;

import com.google.firebase.perf.v1.AndroidMemoryReading;
import h5.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f20344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f20345d;

    public /* synthetic */ e(f fVar, i iVar, int i9) {
        this.b = i9;
        this.f20344c = fVar;
        this.f20345d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                f fVar = this.f20344c;
                AndroidMemoryReading b = fVar.b(this.f20345d);
                if (b != null) {
                    fVar.b.add(b);
                    return;
                }
                return;
            default:
                f fVar2 = this.f20344c;
                AndroidMemoryReading b8 = fVar2.b(this.f20345d);
                if (b8 != null) {
                    fVar2.b.add(b8);
                    return;
                }
                return;
        }
    }
}
