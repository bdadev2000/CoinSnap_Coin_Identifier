package M0;

import U4.C0315k;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import g4.C2296f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import m1.C2461a;
import m5.RunnableC2467a;
import p3.C2542a;
import r3.C2666i;
import r3.InterfaceC2664g;
import s3.InterfaceC2697b;
import w4.v0;

/* renamed from: M0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0218i implements SuccessContinuation, Continuation, OnPaidEventListener, OnSuccessListener, InterfaceC2697b, InterfaceC2664g {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1883c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1884d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1885f;

    public /* synthetic */ C0218i(D3.b bVar, w wVar, Runnable runnable) {
        this.b = 0;
        this.f1883c = bVar;
        this.f1885f = wVar;
        this.f1884d = runnable;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v12, types: [k3.h, java.lang.Object] */
    @Override // r3.InterfaceC2664g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.C0218i.apply(java.lang.Object):java.lang.Object");
    }

    @Override // s3.InterfaceC2697b
    public Object execute() {
        C2542a c2542a = (C2542a) this.f1883c;
        C2666i c2666i = (C2666i) c2542a.f22210d;
        c2666i.getClass();
        k3.j jVar = (k3.j) this.f1884d;
        h3.d dVar = jVar.f21434c;
        k3.i iVar = (k3.i) this.f1885f;
        String str = iVar.f21424a;
        String s5 = android.support.v4.media.session.a.s("SQLiteEventStore");
        if (Log.isLoggable(s5, 3)) {
            Log.d(s5, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + jVar.f21433a);
        }
        ((Long) c2666i.c(new C0218i(c2666i, iVar, jVar, 7))).getClass();
        c2542a.f22208a.a(jVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        C2461a c2461a = (C2461a) this.f1883c;
        c2461a.getClass();
        InterstitialAd interstitialAd = (InterstitialAd) this.f1885f;
        v0.v((Context) this.f1884d, adValue, interstitialAd.getAdUnitId(), interstitialAd.getResponseInfo().getMediationAdapterClassName());
        m1.g gVar = c2461a.f21707c;
        if (gVar.l != null) {
            v0.w(adValue, interstitialAd.getAdUnitId(), gVar.l);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Task task = (Task) this.f1884d;
        r4.b bVar = (r4.b) this.f1885f;
        b1.h hVar = (b1.h) this.f1883c;
        hVar.getClass();
        try {
            l5.d dVar = (l5.d) task.getResult();
            if (dVar != null) {
                ((Executor) hVar.f5271d).execute(new RunnableC2467a(bVar, ((k8.c) hVar.f5270c).c(dVar), 1));
            }
        } catch (k5.d e4) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e4);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        l5.d dVar;
        URL url;
        switch (this.b) {
            case 2:
                k5.b bVar = (k5.b) this.f1883c;
                bVar.getClass();
                Task task2 = (Task) this.f1884d;
                if (task2.isSuccessful() && task2.getResult() != null) {
                    l5.d dVar2 = (l5.d) task2.getResult();
                    Task task3 = (Task) this.f1885f;
                    if (task3.isSuccessful() && (dVar = (l5.d) task3.getResult()) != null && dVar2.f21587c.equals(dVar.f21587c)) {
                        return Tasks.forResult(Boolean.FALSE);
                    }
                    return bVar.f21476e.d(dVar2).continueWith(bVar.f21474c, new k5.a(bVar));
                }
                return Tasks.forResult(Boolean.FALSE);
            default:
                l5.m mVar = (l5.m) this.f1883c;
                mVar.getClass();
                Task task4 = (Task) this.f1884d;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new g4.h("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                Task task5 = (Task) this.f1885f;
                try {
                    if (!task5.isSuccessful()) {
                        return Tasks.forException(new g4.h("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                    }
                    try {
                        url = new URL(mVar.c(mVar.l));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    mVar.i(httpURLConnection, (String) task5.getResult(), ((O4.a) task4.getResult()).f2177a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e4) {
                    return Tasks.forException(new g4.h("Failed to open HTTP stream connection", e4));
                }
        }
    }

    public /* synthetic */ C0218i(Object obj, Object obj2, Object obj3, int i9) {
        this.b = i9;
        this.f1883c = obj;
        this.f1884d = obj2;
        this.f1885f = obj3;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String d2;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1883c;
        String str = (String) this.f1884d;
        U4.z zVar = (U4.z) this.f1885f;
        String str2 = (String) obj;
        U4.A c9 = FirebaseMessaging.c(firebaseMessaging.b);
        C2296f c2296f = firebaseMessaging.f14329a;
        c2296f.a();
        if ("[DEFAULT]".equals(c2296f.b)) {
            d2 = "";
        } else {
            d2 = c2296f.d();
        }
        String a6 = firebaseMessaging.f14335h.a();
        synchronized (c9) {
            String a9 = U4.z.a(str2, System.currentTimeMillis(), a6);
            if (a9 != null) {
                SharedPreferences.Editor edit = c9.f3244a.edit();
                edit.putString(d2 + "|T|" + str + "|*", a9);
                edit.commit();
            }
        }
        if (zVar == null || !str2.equals(zVar.f3338a)) {
            C2296f c2296f2 = firebaseMessaging.f14329a;
            c2296f2.a();
            if ("[DEFAULT]".equals(c2296f2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    c2296f2.a();
                    sb.append(c2296f2.b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(BidResponsed.KEY_TOKEN, str2);
                new C0315k(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
