package H0;

import D0.l;
import G7.j;
import P1.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import b1.C0552e;
import c2.n;
import com.facebook.login.v;
import com.google.firebase.messaging.FirebaseMessaging;
import g4.C2296f;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k8.h;
import k8.i;
import o4.C2504j;
import v4.C2852d;
import w8.x;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1344a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1345c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1346d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1347e;

    public b(m mVar, n nVar) {
        this.f1344a = 3;
        this.f1347e = new C0552e(this, 1);
        this.f1346d = mVar;
        this.f1345c = nVar;
    }

    public void a() {
        switch (this.f1344a) {
            case 1:
                L1.c.a((L1.c) this.f1347e, this, false);
                return;
            default:
                h hVar = (h) this.f1347e;
                synchronized (hVar) {
                    try {
                        if (!this.b) {
                            if (j.a(((k8.e) this.f1345c).f21508g, this)) {
                                hVar.b(this, false);
                            }
                            this.b = true;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public void b() {
        h hVar = (h) this.f1347e;
        synchronized (hVar) {
            try {
                if (!this.b) {
                    if (j.a(((k8.e) this.f1345c).f21508g, this)) {
                        hVar.b(this, true);
                    }
                    this.b = true;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        k8.e eVar = (k8.e) this.f1345c;
        if (j.a(eVar.f21508g, this)) {
            h hVar = (h) this.f1347e;
            if (hVar.f21530n) {
                hVar.b(this, false);
            } else {
                eVar.f21507f = true;
            }
        }
    }

    public File d() {
        File file;
        synchronized (((L1.c) this.f1347e)) {
            try {
                L1.b bVar = (L1.b) this.f1345c;
                if (bVar.f1691f == this) {
                    if (!bVar.f1690e) {
                        ((boolean[]) this.f1346d)[0] = true;
                    }
                    file = bVar.f1689d[0];
                    ((L1.c) this.f1347e).b.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public synchronized void e() {
        try {
            if (this.b) {
                return;
            }
            Boolean h6 = h();
            this.f1346d = h6;
            if (h6 == null) {
                A4.a aVar = new A4.a(19);
                C2504j c2504j = (C2504j) ((K4.c) this.f1345c);
                c2504j.a(c2504j.f21963c, aVar);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean f() {
        boolean h6;
        try {
            e();
            Boolean bool = (Boolean) this.f1346d;
            if (bool != null) {
                h6 = bool.booleanValue();
            } else {
                h6 = ((FirebaseMessaging) this.f1347e).f14329a.h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return h6;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, w8.x] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, w8.x] */
    public x g(int i9) {
        h hVar = (h) this.f1347e;
        synchronized (hVar) {
            try {
                if (!this.b) {
                    if (!j.a(((k8.e) this.f1345c).f21508g, this)) {
                        return new Object();
                    }
                    if (!((k8.e) this.f1345c).f21506e) {
                        boolean[] zArr = (boolean[]) this.f1346d;
                        j.b(zArr);
                        zArr[i9] = true;
                    }
                    try {
                        return new i(hVar.b.e((File) ((k8.e) this.f1345c).f21505d.get(i9)), new v(1, hVar, this));
                    } catch (FileNotFoundException unused) {
                        return new Object();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Boolean h() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C2296f c2296f = ((FirebaseMessaging) this.f1347e).f14329a;
        c2296f.a();
        Context context = c2296f.f20433a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public b(z4.c cVar, boolean z8) {
        this.f1344a = 5;
        this.f1347e = cVar;
        this.f1346d = new AtomicReference(null);
        this.b = z8;
        this.f1345c = new AtomicMarkableReference(new C2852d(z8 ? FragmentTransaction.TRANSIT_EXIT_MASK : 1024), false);
    }

    public b(Context context, String str, l lVar, boolean z8) {
        this.f1344a = 0;
        this.f1345c = context;
        this.f1346d = str;
        this.f1347e = lVar;
        this.b = z8;
    }

    public b(FirebaseMessaging firebaseMessaging, K4.c cVar) {
        this.f1344a = 2;
        this.f1347e = firebaseMessaging;
        this.f1345c = cVar;
    }

    public b(L1.c cVar, L1.b bVar) {
        this.f1344a = 1;
        this.f1347e = cVar;
        this.f1345c = bVar;
        this.f1346d = bVar.f1690e ? null : new boolean[cVar.f1698i];
    }

    public b(h hVar, k8.e eVar) {
        this.f1344a = 4;
        j.e(hVar, "this$0");
        this.f1347e = hVar;
        this.f1345c = eVar;
        this.f1346d = eVar.f21506e ? null : new boolean[2];
    }
}
