package z4;

import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.core.GA.AlY.tN;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public long f28501b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28502c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f28503d;

    public d(tN tNVar) {
        this.f28503d = tNVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar;
        o oVar2;
        long j3;
        bZ bZVar;
        bZ bZVar2;
        long unused;
        e eVar = this.f28503d;
        oVar = eVar.f28505vc;
        if (oVar != null) {
            try {
                if (!this.f28502c) {
                    oVar2 = eVar.f28505vc;
                    g gVar = (g) oVar2;
                    gVar.getClass();
                    try {
                        j3 = gVar.f28514i.getCurrentPosition();
                    } catch (Throwable unused2) {
                        j3 = 0;
                    }
                    eVar.YoT = Math.max(this.f28501b, j3);
                }
                unused = eVar.YoT;
            } catch (Throwable th2) {
                th2.toString();
            }
        }
        bZVar = eVar.GA;
        if (bZVar != null) {
            bZVar2 = eVar.GA;
            bZVar2.sendEmptyMessageDelayed(100, 0L);
        }
    }
}
