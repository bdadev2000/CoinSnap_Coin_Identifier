package a4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class d extends p6.a {
    public ExecutorService A;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f90f;

    /* renamed from: g, reason: collision with root package name */
    public final String f91g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f92h;

    /* renamed from: i, reason: collision with root package name */
    public volatile j0 f93i;

    /* renamed from: j, reason: collision with root package name */
    public Context f94j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f95k;

    /* renamed from: l, reason: collision with root package name */
    public volatile zzs f96l;

    /* renamed from: m, reason: collision with root package name */
    public volatile c0 f97m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f98n;

    /* renamed from: o, reason: collision with root package name */
    public int f99o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f100p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f101q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f102r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f103s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f104t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f105v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f106w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f107x;

    /* renamed from: y, reason: collision with root package name */
    public p f108y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f109z;

    public d(p pVar, Context context) {
        this.f90f = 0;
        this.f92h = new Handler(Looper.getMainLooper());
        this.f99o = 0;
        this.f91g = N();
        this.f94j = context.getApplicationContext();
        zzgt zzy = zzgu.zzy();
        zzy.zzn(N());
        zzy.zzm(this.f94j.getPackageName());
        this.f95k = new d3.g(this.f94j, (zzgu) zzy.zzf());
        zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f93i = new j0(this.f94j, null, this.f95k);
        this.f108y = pVar;
        this.f94j.getPackageName();
    }

    public static String N() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    public final void E(b bVar, g3.a aVar) {
        if (!G()) {
            l lVar = f0.f123j;
            P(d0.a(2, 3, lVar));
            g3.a.b(lVar);
            return;
        }
        if (TextUtils.isEmpty(bVar.a)) {
            zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            l lVar2 = f0.f120g;
            P(d0.a(26, 3, lVar2));
            g3.a.b(lVar2);
            return;
        }
        if (!this.f101q) {
            l lVar3 = f0.f115b;
            P(d0.a(27, 3, lVar3));
            g3.a.b(lVar3);
        } else if (O(new a0(this, bVar, aVar, 4), 30000L, new androidx.appcompat.widget.j(this, aVar, 11), K()) == null) {
            l M = M();
            P(d0.a(25, 3, M));
            g3.a.b(M);
        }
    }

    public final void F(m mVar, n nVar) {
        if (!G()) {
            l lVar = f0.f123j;
            P(d0.a(2, 4, lVar));
            nVar.b(lVar, mVar.f153b);
        } else if (O(new a0(this, mVar, nVar, 0), 30000L, new k0.a(this, nVar, mVar, 9), K()) == null) {
            l M = M();
            P(d0.a(25, 4, M));
            nVar.b(M, mVar.f153b);
        }
    }

    public final boolean G() {
        return (this.f90f != 2 || this.f96l == null || this.f97m == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03bf A[Catch: Exception -> 0x0425, CancellationException -> 0x043a, TimeoutException -> 0x043c, TRY_ENTER, TryCatch #4 {CancellationException -> 0x043a, TimeoutException -> 0x043c, Exception -> 0x0425, blocks: (B:122:0x03bf, B:124:0x03cf, B:126:0x03e3, B:129:0x03ff, B:131:0x040b), top: B:120:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03cf A[Catch: Exception -> 0x0425, CancellationException -> 0x043a, TimeoutException -> 0x043c, TryCatch #4 {CancellationException -> 0x043a, TimeoutException -> 0x043c, Exception -> 0x0425, blocks: (B:122:0x03bf, B:124:0x03cf, B:126:0x03e3, B:129:0x03ff, B:131:0x040b), top: B:120:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a4.l H(mf.a r23, final a4.i r24) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.H(mf.a, a4.i):a4.l");
    }

    public final void I(f.a aVar, v vVar) {
        if (!G()) {
            l lVar = f0.f123j;
            P(d0.a(2, 7, lVar));
            vVar.l(lVar, new ArrayList());
        } else {
            if (!this.u) {
                zzb.zzk("BillingClient", "Querying product details is not supported.");
                l lVar2 = f0.f128o;
                P(d0.a(20, 7, lVar2));
                vVar.l(lVar2, new ArrayList());
                return;
            }
            if (O(new a0(this, aVar, vVar, 1), 30000L, new androidx.appcompat.widget.j(this, vVar, 9), K()) == null) {
                l M = M();
                P(d0.a(25, 7, M));
                vVar.l(M, new ArrayList());
            }
        }
    }

    public final void J(e eVar) {
        if (G()) {
            zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            Q(d0.b(6));
            eVar.a(f0.f122i);
            return;
        }
        int i10 = 1;
        if (this.f90f == 1) {
            zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            l lVar = f0.f117d;
            P(d0.a(37, 6, lVar));
            eVar.a(lVar);
            return;
        }
        if (this.f90f == 3) {
            zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            l lVar2 = f0.f123j;
            P(d0.a(38, 6, lVar2));
            eVar.a(lVar2);
            return;
        }
        this.f90f = 1;
        zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.f97m = new c0(this, eVar);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> queryIntentServices = this.f94j.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f91g);
                    if (this.f94j.bindService(intent2, this.f97m, 1)) {
                        zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i10 = 39;
                    }
                } else {
                    zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i10 = 40;
                }
            }
        } else {
            i10 = 41;
        }
        this.f90f = 0;
        zzb.zzj("BillingClient", "Billing service unavailable on device.");
        l lVar3 = f0.f116c;
        P(d0.a(i10, 6, lVar3));
        eVar.a(lVar3);
    }

    public final Handler K() {
        return Looper.myLooper() == null ? this.f92h : new Handler(Looper.myLooper());
    }

    public final void L(l lVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f92h.post(new androidx.appcompat.widget.j(this, lVar, 10));
    }

    public final l M() {
        if (this.f90f != 0 && this.f90f != 3) {
            return f0.f121h;
        }
        return f0.f123j;
    }

    public final Future O(Callable callable, long j3, Runnable runnable, Handler handler) {
        if (this.A == null) {
            this.A = Executors.newFixedThreadPool(zzb.zza, new l.c());
        }
        try {
            Future submit = this.A.submit(callable);
            handler.postDelayed(new androidx.appcompat.widget.j(submit, runnable, 12), (long) (j3 * 0.95d));
            return submit;
        } catch (Exception e2) {
            zzb.zzl("BillingClient", "Async task throws exception!", e2);
            return null;
        }
    }

    public final void P(zzga zzgaVar) {
        e0 e0Var = this.f95k;
        int i10 = this.f99o;
        d3.g gVar = (d3.g) e0Var;
        gVar.getClass();
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) gVar.f16812c).zzi();
            zzgtVar.zzl(i10);
            gVar.f16812c = (zzgu) zzgtVar.zzf();
            gVar.J(zzgaVar);
        } catch (Throwable th2) {
            zzb.zzl("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void Q(zzge zzgeVar) {
        e0 e0Var = this.f95k;
        int i10 = this.f99o;
        d3.g gVar = (d3.g) e0Var;
        gVar.getClass();
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) gVar.f16812c).zzi();
            zzgtVar.zzl(i10);
            gVar.f16812c = (zzgu) zzgtVar.zzf();
            gVar.K(zzgeVar);
        } catch (Throwable th2) {
            zzb.zzl("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // p6.a
    public final void p(a aVar, w wVar) {
        String str = aVar.f77b;
        int i10 = 2;
        if (!G()) {
            l lVar = f0.f123j;
            P(d0.a(2, 9, lVar));
            wVar.d(lVar, zzai.zzk());
        } else {
            if (TextUtils.isEmpty(str)) {
                zzb.zzk("BillingClient", "Please provide a valid product type.");
                l lVar2 = f0.f118e;
                P(d0.a(50, 9, lVar2));
                wVar.d(lVar2, zzai.zzk());
                return;
            }
            if (O(new a0(this, str, wVar, i10), 30000L, new androidx.appcompat.widget.j(this, wVar, 8), K()) == null) {
                l M = M();
                P(d0.a(25, 9, M));
                wVar.d(M, zzai.zzk());
            }
        }
    }

    public d(p pVar, Context context, x xVar) {
        String N = N();
        this.f90f = 0;
        this.f92h = new Handler(Looper.getMainLooper());
        this.f99o = 0;
        this.f91g = N;
        this.f94j = context.getApplicationContext();
        zzgt zzy = zzgu.zzy();
        zzy.zzn(N);
        zzy.zzm(this.f94j.getPackageName());
        this.f95k = new d3.g(this.f94j, (zzgu) zzy.zzf());
        if (xVar == null) {
            zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f93i = new j0(this.f94j, xVar, this.f95k);
        this.f108y = pVar;
        this.f109z = false;
        this.f94j.getPackageName();
    }
}
