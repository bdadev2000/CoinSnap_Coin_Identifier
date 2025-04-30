package J1;

import android.content.Context;
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
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p1.C2537a;
import q4.C2645d;

/* renamed from: J1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209b {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f1492a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1493c;

    /* renamed from: d, reason: collision with root package name */
    public volatile B f1494d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1495e;

    /* renamed from: f, reason: collision with root package name */
    public final y f1496f;

    /* renamed from: g, reason: collision with root package name */
    public volatile zzs f1497g;

    /* renamed from: h, reason: collision with root package name */
    public volatile w f1498h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1499i;

    /* renamed from: j, reason: collision with root package name */
    public int f1500j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1501k;
    public boolean l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1502n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1503o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1504p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1505q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1506r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1507s;

    /* renamed from: t, reason: collision with root package name */
    public final C2645d f1508t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1509u;

    /* renamed from: v, reason: collision with root package name */
    public ExecutorService f1510v;

    public C0209b(C2645d c2645d, Context context, C2537a c2537a) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "7.0.0";
        }
        this.f1492a = 0;
        this.f1493c = new Handler(Looper.getMainLooper());
        this.f1500j = 0;
        this.b = str;
        this.f1495e = context.getApplicationContext();
        zzgt zzy = zzgu.zzy();
        zzy.zzn(str);
        zzy.zzm(this.f1495e.getPackageName());
        this.f1496f = new E1.d(this.f1495e, (zzgu) zzy.zzf());
        if (c2537a == null) {
            zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f1494d = new B(this.f1495e, c2537a, this.f1496f);
        this.f1508t = c2645d;
        this.f1509u = false;
        this.f1495e.getPackageName();
    }

    public final boolean a() {
        if (this.f1492a == 2 && this.f1497g != null && this.f1498h != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r26.f1518g == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0361  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final J1.g b(android.app.Activity r25, final J1.e r26) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0209b.b(android.app.Activity, J1.e):J1.g");
    }

    public final void c(E1.c cVar, n nVar) {
        if (!a()) {
            i(x.a(2, 7, z.f1562j));
            nVar.e(new ArrayList());
        } else if (!this.f1504p) {
            zzb.zzk("BillingClient", "Querying product details is not supported.");
            i(x.a(20, 7, z.f1565o));
            nVar.e(new ArrayList());
        } else if (h(new s(this, cVar, nVar, 0), 30000L, new f4.b(2, this, nVar), e()) == null) {
            i(x.a(25, 7, g()));
            nVar.e(new ArrayList());
        }
    }

    public final void d(H0.a aVar, o oVar) {
        if (!a()) {
            g gVar = z.f1562j;
            i(x.a(2, 9, gVar));
            oVar.a(gVar, zzai.zzk());
            return;
        }
        String str = aVar.f1343c;
        if (TextUtils.isEmpty(str)) {
            zzb.zzk("BillingClient", "Please provide a valid product type.");
            g gVar2 = z.f1557e;
            i(x.a(50, 9, gVar2));
            oVar.a(gVar2, zzai.zzk());
            return;
        }
        if (h(new s(this, str, oVar, 1), 30000L, new f4.b(1, this, oVar), e()) == null) {
            g g9 = g();
            i(x.a(25, 9, g9));
            oVar.a(g9, zzai.zzk());
        }
    }

    public final Handler e() {
        if (Looper.myLooper() == null) {
            return this.f1493c;
        }
        return new Handler(Looper.myLooper());
    }

    public final void f(g gVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f1493c.post(new f4.b(3, this, gVar));
    }

    public final g g() {
        if (this.f1492a != 0 && this.f1492a != 3) {
            return z.f1560h;
        }
        return z.f1562j;
    }

    public final Future h(Callable callable, long j7, Runnable runnable, Handler handler) {
        if (this.f1510v == null) {
            this.f1510v = Executors.newFixedThreadPool(zzb.zza, new u());
        }
        try {
            Future submit = this.f1510v.submit(callable);
            handler.postDelayed(new f4.b(5, submit, runnable), (long) (j7 * 0.95d));
            return submit;
        } catch (Exception e4) {
            zzb.zzl("BillingClient", "Async task throws exception!", e4);
            return null;
        }
    }

    public final void i(zzga zzgaVar) {
        y yVar = this.f1496f;
        int i9 = this.f1500j;
        E1.d dVar = (E1.d) yVar;
        dVar.getClass();
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) dVar.f973c).zzi();
            zzgtVar.zzl(i9);
            dVar.f973c = (zzgu) zzgtVar.zzf();
            dVar.C(zzgaVar);
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    public final void j(zzge zzgeVar) {
        y yVar = this.f1496f;
        int i9 = this.f1500j;
        E1.d dVar = (E1.d) yVar;
        dVar.getClass();
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) dVar.f973c).zzi();
            zzgtVar.zzl(i9);
            dVar.f973c = (zzgu) zzgtVar.zzf();
            dVar.D(zzgeVar);
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }
}
