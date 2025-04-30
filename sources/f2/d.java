package F2;

import G6.n;
import G7.j;
import M0.C0218i;
import T.C0264d;
import T.InterfaceC0262c;
import U4.K;
import U4.p;
import U4.y;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.applovin.impl.ql;
import com.facebook.internal.InterfaceC1846o;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import com.tools.arruler.ui.component.permission.PermissionActivity;
import com.tools.arruler.ui.component.splash.SplashActivity;
import com.vungle.ads.C2144v0;
import com.vungle.ads.internal.I;
import h.C2310a;
import i8.C2365b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import k5.k;
import l5.C2451c;
import n3.C2476a;
import n5.InterfaceC2479a;
import o4.InterfaceC2498d;
import p5.F;
import p5.G;
import r3.C2666i;
import r3.InterfaceC2660c;
import r3.InterfaceC2661d;
import r3.InterfaceC2664g;
import s3.InterfaceC2697b;
import t.InterfaceC2702a;
import u6.AbstractC2801q;
import w4.v0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements E2.i, h.b, Continuation, OnCompleteListener, InterfaceC2702a, InterfaceC1846o, I, OnSuccessListener, SuccessContinuation, OnPaidEventListener, InterfaceC2498d, h3.e, InterfaceC2697b, InterfaceC2664g, N4.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1130c;

    public /* synthetic */ d() {
        this.b = 16;
        this.f1130c = C2365b.f20810d;
    }

    @Override // N4.a
    public void a(N4.b bVar) {
        switch (this.b) {
            case 28:
                r4.a aVar = (r4.a) this.f1130c;
                aVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                aVar.b.set((r4.a) bVar.get());
                return;
            default:
                b1.h hVar = ((k) ((InterfaceC2479a) bVar.get())).b("firebase").f21482k;
                Set set = (Set) hVar.f5272f;
                r4.b bVar2 = (r4.b) this.f1130c;
                set.add(bVar2);
                Task b = ((C2451c) hVar.b).b();
                b.addOnSuccessListener((Executor) hVar.f5271d, new C0218i(hVar, b, bVar2, 5));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    return;
                }
                return;
        }
    }

    @Override // t.InterfaceC2702a
    public Object apply(Object obj) {
        List lambda$getOpenMeasurementVerificationScriptResources$2;
        switch (this.b) {
            case 10:
                lambda$getOpenMeasurementVerificationScriptResources$2 = com.applovin.impl.sdk.ad.b.lambda$getOpenMeasurementVerificationScriptResources$2((com.applovin.impl.sdk.ad.e) ((InterfaceC2702a) this.f1130c), (ql) obj);
                return lambda$getOpenMeasurementVerificationScriptResources$2;
            case 20:
                ((com.bumptech.glide.f) this.f1130c).getClass();
                String m = G.b.m((F) obj);
                j.d(m, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                Log.d("EventGDTLogger", "Session Event: ".concat(m));
                byte[] bytes = m.getBytes(O7.a.f2244a);
                j.d(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
            default:
                Cursor cursor = (Cursor) obj;
                C2666i c2666i = (C2666i) this.f1130c;
                c2666i.getClass();
                while (cursor.moveToNext()) {
                    c2666i.i(cursor.getInt(0), n3.c.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
        }
    }

    @Override // h.b
    public void b(Object obj) {
        Object obj2 = this.f1130c;
        switch (this.b) {
            case 1:
                C2310a c2310a = (C2310a) obj;
                n nVar = (n) obj2;
                j.e(nVar, "this$0");
                j.e(c2310a, "it");
                if (c2310a.b == -1) {
                    nVar.h().f();
                    return;
                }
                return;
            case 2:
                C2310a c2310a2 = (C2310a) obj;
                int i9 = ImageLibraryActivity.l;
                ImageLibraryActivity imageLibraryActivity = (ImageLibraryActivity) obj2;
                j.e(imageLibraryActivity, "this$0");
                j.e(c2310a2, "it");
                if (c2310a2.b == -1) {
                    imageLibraryActivity.u().f();
                    return;
                }
                return;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = PermissionActivity.f19681i;
                PermissionActivity permissionActivity = (PermissionActivity) obj2;
                j.e(permissionActivity, "this$0");
                if (booleanValue) {
                    permissionActivity.finish();
                    return;
                }
                ((AbstractC2801q) permissionActivity.k()).f23395s.setActivated(false);
                int i11 = permissionActivity.f19683g + 1;
                permissionActivity.f19683g = i11;
                a7.b bVar = a7.b.f4076f;
                if (bVar != null) {
                    ((SharedPreferences) bVar.f4078d).edit().putInt("COUNT_PERMISSION", i11).apply();
                    a7.b bVar2 = a7.b.f4076f;
                    if (bVar2 != null) {
                        if (((SharedPreferences) bVar2.f4078d).getInt("COUNT_PERMISSION", 0) > 2) {
                            new Handler(Looper.getMainLooper()).postDelayed(new D3.b(permissionActivity, 5), 500L);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
                }
                throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0197 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00e7  */
    @Override // E2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.io.File r20) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.d.c(java.io.File):void");
    }

    @Override // com.facebook.internal.InterfaceC1846o
    public void d(boolean z8) {
        String str = (String) this.f1130c;
        if (z8) {
            try {
                P2.a aVar = new P2.a(str);
                if (aVar.b != null && aVar.f2413c != null) {
                    com.facebook.appevents.n.w(aVar.f2412a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean e(E1.c cVar, int i9, Bundle bundle) {
        InterfaceC0262c interfaceC0262c;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i9 & 1) != 0) {
            try {
                ((Y.g) cVar.f972c).e();
                Parcelable parcelable = (Parcelable) ((Y.g) cVar.f972c).i();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e4) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e4);
                return false;
            }
        }
        ClipDescription description = ((Y.g) cVar.f972c).getDescription();
        Y.g gVar = (Y.g) cVar.f972c;
        ClipData clipData = new ClipData(description, new ClipData.Item(gVar.d()));
        if (i10 >= 31) {
            interfaceC0262c = new E1.c(clipData, 2);
        } else {
            C0264d c0264d = new C0264d();
            c0264d.f2880c = clipData;
            c0264d.f2881d = 2;
            interfaceC0262c = c0264d;
        }
        interfaceC0262c.d(gVar.f());
        interfaceC0262c.setExtras(bundle);
        if (ViewCompat.performReceiveContent((View) this.f1130c, interfaceC0262c.build()) != null) {
            return false;
        }
        return true;
    }

    @Override // s3.InterfaceC2697b
    public Object execute() {
        SQLiteDatabase a6;
        int i9 = 9;
        Object obj = this.f1130c;
        switch (this.b) {
            case 21:
                C2666i c2666i = (C2666i) ((InterfaceC2660c) obj);
                c2666i.getClass();
                int i10 = C2476a.f21834e;
                y yVar = new y(8);
                HashMap hashMap = new HashMap();
                a6 = c2666i.a();
                a6.beginTransaction();
                try {
                    C2476a c2476a = (C2476a) C2666i.l(a6.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0218i(c2666i, hashMap, yVar, i9));
                    a6.setTransactionSuccessful();
                    return c2476a;
                } finally {
                }
            case 22:
                C2666i c2666i2 = (C2666i) ((InterfaceC2661d) obj);
                long a9 = c2666i2.f22828c.a() - c2666i2.f22830f.f22820d;
                a6 = c2666i2.a();
                a6.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a9)};
                    C2666i.l(a6.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new d(c2666i2, 27));
                    int delete = a6.delete("events", "timestamp_ms < ?", strArr);
                    a6.setTransactionSuccessful();
                    a6.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 23:
                C2666i c2666i3 = (C2666i) ((q3.h) obj).f22774i;
                a6 = c2666i3.a();
                a6.beginTransaction();
                try {
                    a6.compileStatement("DELETE FROM log_event_dropped").execute();
                    a6.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c2666i3.f22828c.a()).execute();
                    a6.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                q3.j jVar = (q3.j) obj;
                Iterator it = ((Iterable) ((C2666i) jVar.b).c(new p4.i(i9))).iterator();
                while (it.hasNext()) {
                    jVar.f22784c.a((k3.j) it.next(), 1, false);
                }
                return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:67|68|(2:71|69)|72|73|(1:75)(1:179)|(1:77)(1:178)|78|(5:165|(1:167)|168|3c3|173)(1:82)|83|(28:87|(1:89)(2:161|(1:163))|(3:91|(1:93)|94)(2:157|(2:159|160))|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|(11:115|(2:117|(2:119|(1:121)))|123|124|125|126|(1:128)|129|130|131|132)|137|138|(1:140)|131|132)|164|(0)(0)|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|(0)|137|138|(0)|131|132) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0588, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0589, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0599, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x059a, code lost:
    
        r3 = r16;
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x059f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x05a0, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x05a2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x05a3, code lost:
    
        r8 = r3;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x05a7, code lost:
    
        r8 = r3;
        r3 = r5;
        r46 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x054f A[Catch: Exception -> 0x0588, TryCatch #2 {Exception -> 0x0588, blocks: (B:113:0x0545, B:115:0x054f, B:117:0x0559, B:119:0x0567), top: B:112:0x0545 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0211 A[Catch: NameNotFoundException -> 0x061f, TryCatch #6 {NameNotFoundException -> 0x061f, blocks: (B:42:0x01f0, B:44:0x0207, B:46:0x0218, B:49:0x021e, B:182:0x0211), top: B:41:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0207 A[Catch: NameNotFoundException -> 0x061f, TryCatch #6 {NameNotFoundException -> 0x061f, blocks: (B:42:0x01f0, B:44:0x0207, B:46:0x0218, B:49:0x021e, B:182:0x0211), top: B:41:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x042b  */
    /* JADX WARN: Type inference failed for: r3v9, types: [B4.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, r6.b] */
    @Override // o4.InterfaceC2498d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(U4.p r46) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.d.f(U4.p):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.b) {
            case 6:
                U4.I.a((Intent) this.f1130c);
                return;
            case 7:
                ((K) this.f1130c).b.trySetResult(null);
                return;
            case 8:
                ((ScheduledFuture) this.f1130c).cancel(false);
                return;
            default:
                q6.c cVar = (q6.c) this.f1130c;
                j.e(cVar, "this$0");
                j.e(task, "it");
                q6.d dVar = cVar.f22804c;
                if (dVar != null) {
                    ((SplashActivity) dVar).f19705j = true;
                    cVar.f22803a = true;
                    return;
                } else {
                    j.k(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
        }
    }

    @Override // com.vungle.ads.internal.I
    public void onImpression(View view) {
        switch (this.b) {
            case 13:
                com.vungle.ads.K.a((com.vungle.ads.K) this.f1130c, view);
                return;
            default:
                C2144v0.d((C2144v0) this.f1130c, view);
                return;
        }
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        m1.g gVar = (m1.g) this.f1130c;
        v0.v(gVar.f21737j, adValue, gVar.f21738k.getAdUnitId(), gVar.f21738k.getResponseInfo().getMediationAdapterClassName());
        if (gVar.l != null) {
            v0.w(adValue, gVar.f21738k.getAdUnitId(), gVar.l);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.vungle.ads.internal.platform.b.b((com.vungle.ads.internal.platform.b) this.f1130c, (AppSetIdInfo) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((p) this.f1130c).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string2 != null) {
                throw new IOException(string2);
            }
            Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public /* synthetic */ d(Object obj, int i9) {
        this.b = i9;
        this.f1130c = obj;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((l5.f) this.f1130c);
    }
}
