package q3;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
import r3.C2666i;
import r3.InterfaceC2661d;
import s3.C2696a;
import s3.InterfaceC2697b;
import s3.InterfaceC2698c;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ h b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k3.j f22760c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22761d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Runnable f22762f;

    public /* synthetic */ e(h hVar, k3.j jVar, int i9, Runnable runnable) {
        this.b = hVar;
        this.f22760c = jVar;
        this.f22761d = i9;
        this.f22762f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final k3.j jVar = this.f22760c;
        final int i9 = this.f22761d;
        Runnable runnable = this.f22762f;
        final h hVar = this.b;
        InterfaceC2698c interfaceC2698c = hVar.f22771f;
        try {
            try {
                InterfaceC2661d interfaceC2661d = hVar.f22768c;
                Objects.requireNonNull(interfaceC2661d);
                ((C2666i) interfaceC2698c).j(new F2.d(interfaceC2661d, 22));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) hVar.f22767a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    hVar.a(jVar, i9);
                } else {
                    ((C2666i) interfaceC2698c).j(new InterfaceC2697b() { // from class: q3.f
                        @Override // s3.InterfaceC2697b
                        public final Object execute() {
                            h.this.f22769d.a(jVar, i9 + 1, false);
                            return null;
                        }
                    });
                }
            } catch (C2696a unused) {
                hVar.f22769d.a(jVar, i9 + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
