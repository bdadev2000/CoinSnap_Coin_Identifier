package J1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.internal.play_billing.zzhl;
import com.google.android.gms.internal.play_billing.zzr;
import p1.C2537a;

/* loaded from: classes.dex */
public final class w implements ServiceConnection {
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final C2537a f1550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0209b f1551d;

    public /* synthetic */ w(C0209b c0209b, C2537a c2537a) {
        this.f1551d = c0209b;
        this.f1550c = c2537a;
    }

    public final void a(g gVar) {
        synchronized (this.b) {
            try {
                C2537a c2537a = this.f1550c;
                if (c2537a != null) {
                    c2537a.a(gVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzj("BillingClient", "Billing service connected.");
        this.f1551d.f1497g = zzr.zzu(iBinder);
        v vVar = new v(this, 0);
        B3.k kVar = new B3.k(this, 2);
        C0209b c0209b = this.f1551d;
        if (c0209b.h(vVar, 30000L, kVar, c0209b.e()) == null) {
            C0209b c0209b2 = this.f1551d;
            g g9 = c0209b2.g();
            c0209b2.i(x.a(25, 6, g9));
            a(g9);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzk("BillingClient", "Billing service disconnected.");
        y yVar = this.f1551d.f1496f;
        zzhl zzz = zzhl.zzz();
        E1.d dVar = (E1.d) yVar;
        dVar.getClass();
        if (zzz != null) {
            try {
                zzhd zzy = zzhe.zzy();
                zzy.zzn((zzgu) dVar.f973c);
                zzy.zzo(zzz);
                ((B3.e) dVar.f974d).r((zzhe) zzy.zzf());
            } catch (Throwable th) {
                zzb.zzl("BillingLogger", "Unable to log.", th);
            }
        }
        this.f1551d.f1497g = null;
        this.f1551d.f1492a = 0;
        synchronized (this.b) {
            C2537a c2537a = this.f1550c;
            if (c2537a != null) {
                c2537a.f22172a.getClass();
            }
        }
    }
}
