package A4;

import R5.i;
import V0.k;
import V0.l;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.n;
import androidx.work.o;
import c1.C0588c;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.ar.core.BinderC1858d;
import com.google.ar.core.H;
import com.google.ar.core.dependencies.h;
import d1.C2168i;
import e1.g;
import f1.C2262k;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k.AbstractActivityC2417f;
import u4.C2756a;

/* loaded from: classes2.dex */
public final class e implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f51c;

    /* renamed from: d, reason: collision with root package name */
    public Object f52d;

    /* renamed from: f, reason: collision with root package name */
    public Object f53f;

    public /* synthetic */ e(int i9) {
        this.b = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = null;
        boolean z8 = true;
        boolean z9 = false;
        switch (this.b) {
            case 0:
                f fVar = (f) this.f53f;
                C2756a c2756a = (C2756a) this.f51c;
                fVar.b(c2756a, (TaskCompletionSource) this.f52d);
                ((AtomicInteger) fVar.f61i.f22841d).set(0);
                double min = Math.min(3600000.0d, Math.pow(fVar.b, fVar.a()) * (60000.0d / fVar.f54a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + c2756a.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 1:
                try {
                    obj = ((Callable) this.f51c).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.f53f).post(new f4.b(7, (Q.d) ((S.a) this.f52d), obj));
                return;
            case 2:
                ((i) this.f53f).getClass();
                i.b((WebView) this.f51c, (String) this.f52d);
                return;
            case 3:
                try {
                    z8 = ((Boolean) ((f4.c) this.f53f).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused3) {
                }
                ((V0.a) this.f51c).c((String) this.f52d, z8);
                return;
            case 4:
                C2262k c2262k = (C2262k) this.f52d;
                l lVar = (l) this.f53f;
                try {
                    ((f4.c) this.f51c).get();
                    o.e().b(l.f3425v, "Starting work for " + lVar.f3429g.f19802c, new Throwable[0]);
                    lVar.f3440t = lVar.f3430h.startWork();
                    c2262k.k(lVar.f3440t);
                    return;
                } catch (Throwable th) {
                    c2262k.j(th);
                    return;
                }
            case 5:
                String str2 = (String) this.f52d;
                l lVar2 = (l) this.f53f;
                try {
                    try {
                        n nVar = (n) ((C2262k) this.f51c).get();
                        if (nVar == null) {
                            o.e().d(l.f3425v, lVar2.f3429g.f19802c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            o.e().b(l.f3425v, String.format("%s returned a %s result.", lVar2.f3429g.f19802c, nVar), new Throwable[0]);
                            lVar2.f3432j = nVar;
                        }
                    } catch (InterruptedException e4) {
                        e = e4;
                        o.e().d(l.f3425v, str2 + " failed because it threw an exception/error", e);
                    } catch (CancellationException e9) {
                        o.e().f(l.f3425v, str2 + " was cancelled", e9);
                    } catch (ExecutionException e10) {
                        e = e10;
                        o.e().d(l.f3425v, str2 + " failed because it threw an exception/error", e);
                    }
                    lVar2.c();
                    return;
                } catch (Throwable th2) {
                    lVar2.c();
                    throw th2;
                }
            case 6:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f53f;
                Context context = (Context) this.f52d;
                Intent intent = (Intent) this.f51c;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    o.e().b(ConstraintProxyUpdateReceiver.f5225a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    g.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    g.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    g.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    g.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 7:
                ((b6.g) this.f53f).getClass();
                b6.g.b((WebView) this.f51c, (String) this.f52d);
                return;
            case 8:
                C2168i j7 = ((WorkDatabase) this.f51c).n().j((String) this.f52d);
                if (j7 != null && j7.b()) {
                    synchronized (((C0588c) this.f53f).f5379f) {
                        ((C0588c) this.f53f).f5382i.put((String) this.f52d, j7);
                        ((C0588c) this.f53f).f5383j.add(j7);
                        C0588c c0588c = (C0588c) this.f53f;
                        c0588c.f5384k.b(c0588c.f5383j);
                    }
                    return;
                }
                return;
            case 9:
                Activity activity = (Activity) this.f51c;
                H h6 = (H) this.f53f;
                try {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    h hVar = h6.f14265c;
                    String str3 = activity.getApplicationInfo().packageName;
                    Bundle bundle = new Bundle();
                    bundle.putCharSequence("package.name", "com.google.ar.core");
                    hVar.d(str3, Collections.singletonList(bundle), new Bundle(), new BinderC1858d(this, atomicBoolean));
                    new Handler().postDelayed(new f4.b(16, this, atomicBoolean, z9), 3000L);
                    return;
                } catch (RemoteException e11) {
                    Log.w("ARCore-InstallService", "requestInstall threw, launching fullscreen.", e11);
                    h6.getClass();
                    H.e(activity, (B3.e) this.f52d);
                    return;
                }
            case 10:
                ((k) this.f51c).f3421f.g((String) this.f52d, (C.c) this.f53f);
                return;
            default:
                m1.g gVar = (m1.g) this.f53f;
                if (gVar.f21738k != null && !gVar.f21734g) {
                    m1.g.b().e((AbstractActivityC2417f) this.f51c, (F2.h) this.f52d);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i9) {
        this.b = i9;
        this.f53f = obj;
        this.f51c = obj2;
        this.f52d = obj3;
    }

    public e(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.b = 6;
        this.f51c = intent;
        this.f52d = context;
        this.f53f = pendingResult;
    }
}
