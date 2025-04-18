package z4;

import com.bytedance.sdk.component.utils.bZ;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f28496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f28497c;

    public b(e eVar, long j3) {
        this.f28497c = eVar;
        this.f28496b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bZ bZVar;
        bZ bZVar2;
        e eVar = this.f28497c;
        bZVar = eVar.GA;
        if (bZVar != null) {
            bZVar2 = eVar.GA;
            bZVar2.obtainMessage(106, Long.valueOf(this.f28496b)).sendToTarget();
        }
    }
}
