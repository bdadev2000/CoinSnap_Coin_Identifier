package a4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.internal.play_billing.zzhl;
import com.google.android.gms.internal.play_billing.zzr;

/* loaded from: classes.dex */
public final class c0 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Object f87b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final e f88c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f89d;

    public /* synthetic */ c0(d dVar, e eVar) {
        this.f89d = dVar;
        this.f88c = eVar;
    }

    public final void a(l lVar) {
        synchronized (this.f87b) {
            e eVar = this.f88c;
            if (eVar != null) {
                eVar.a(lVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzj("BillingClient", "Billing service connected.");
        this.f89d.f96l = zzr.zzu(iBinder);
        l2.h hVar = new l2.h(this, 1);
        androidx.activity.i iVar = new androidx.activity.i(this, 12);
        d dVar = this.f89d;
        if (dVar.O(hVar, 30000L, iVar, dVar.K()) == null) {
            d dVar2 = this.f89d;
            l M = dVar2.M();
            dVar2.P(d0.a(25, 6, M));
            a(M);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzk("BillingClient", "Billing service disconnected.");
        e0 e0Var = this.f89d.f95k;
        zzhl zzz = zzhl.zzz();
        d3.g gVar = (d3.g) e0Var;
        gVar.getClass();
        if (zzz != null) {
            try {
                zzhd zzy = zzhe.zzy();
                zzy.zzn((zzgu) gVar.f16812c);
                zzy.zzo(zzz);
                ((g0) gVar.f16813d).e((zzhe) zzy.zzf());
            } catch (Throwable th2) {
                zzb.zzl("BillingLogger", "Unable to log.", th2);
            }
        }
        this.f89d.f96l = null;
        this.f89d.f90f = 0;
        synchronized (this.f87b) {
            e eVar = this.f88c;
            if (eVar != null) {
                eVar.d();
            }
        }
    }
}
