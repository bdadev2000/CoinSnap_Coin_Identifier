package f5;

import com.google.firebase.perf.session.gauges.GaugeManager;
import i5.EnumC2355j;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GaugeManager f20338c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20339d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ EnumC2355j f20340f;

    public /* synthetic */ c(GaugeManager gaugeManager, String str, EnumC2355j enumC2355j, int i9) {
        this.b = i9;
        this.f20338c = gaugeManager;
        this.f20339d = str;
        this.f20340f = enumC2355j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                GaugeManager.d(this.f20338c, this.f20339d, this.f20340f);
                return;
            default:
                GaugeManager.a(this.f20338c, this.f20339d, this.f20340f);
                return;
        }
    }
}
