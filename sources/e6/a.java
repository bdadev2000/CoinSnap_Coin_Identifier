package e6;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.applovin.impl.sdk.g0;
import com.facebook.appevents.k;
import com.facebook.appevents.l;
import com.facebook.appevents.r;
import com.facebook.internal.m0;
import com.facebook.internal.t;
import com.facebook.internal.v;
import com.facebook.internal.w;
import com.facebook.internal.x;
import com.facebook.internal.y;
import com.facebook.internal.z;
import com.facebook.q;
import com.facebook.u0;
import h.o0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f17113d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f17114f;

    public /* synthetic */ a(Context context, String str, String str2) {
        this.f17111b = 1;
        this.f17112c = str;
        this.f17113d = context;
        this.f17114f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar;
        JSONObject jSONObject;
        int i10 = 0;
        switch (this.f17111b) {
            case 0:
                Context context = this.f17113d;
                String str = this.f17112c;
                String applicationId = this.f17114f;
                if (!m6.a.b(b.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(context, "$context");
                        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                        String stringPlus = Intrinsics.stringPlus(applicationId, "pingForOnDevice");
                        if (sharedPreferences.getLong(stringPlus, 0L) == 0) {
                            g gVar = g.f17130b;
                            if (!m6.a.b(g.class)) {
                                try {
                                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                                    g.f17130b.d(d.MOBILE_APP_INSTALL, applicationId, CollectionsKt.emptyList());
                                } catch (Throwable th2) {
                                    m6.a.a(g.class, th2);
                                }
                            }
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(stringPlus, System.currentTimeMillis());
                            edit.apply();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        m6.a.a(b.class, th3);
                        return;
                    }
                }
                return;
            case 1:
                AtomicBoolean atomicBoolean = w.a;
                String applicationId2 = this.f17112c;
                Intrinsics.checkNotNullParameter(applicationId2, "$applicationId");
                Context context2 = this.f17113d;
                Intrinsics.checkNotNullParameter(context2, "$context");
                String gateKeepersKey = this.f17114f;
                Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
                JSONObject a = w.a();
                if (a.length() != 0) {
                    w.d(applicationId2, a);
                    context2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, a.toString()).apply();
                    w.f11119d = Long.valueOf(System.currentTimeMillis());
                }
                w.e();
                w.a.set(false);
                return;
            default:
                Context context3 = this.f17113d;
                String settingsKey = this.f17112c;
                String applicationId3 = this.f17114f;
                z zVar = z.a;
                Intrinsics.checkNotNullParameter(context3, "$context");
                Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
                Intrinsics.checkNotNullParameter(applicationId3, "$applicationId");
                SharedPreferences sharedPreferences2 = context3.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                x xVar = null;
                String string = sharedPreferences2.getString(settingsKey, null);
                boolean z10 = m0.z(string);
                z zVar2 = z.a;
                if (!z10) {
                    if (string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            com.facebook.x xVar2 = com.facebook.x.a;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            xVar = z.d(applicationId3, jSONObject);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                JSONObject a10 = z.a();
                z.d(applicationId3, a10);
                sharedPreferences2.edit().putString(settingsKey, a10.toString()).apply();
                if (xVar != null) {
                    String str2 = xVar.f11129j;
                    if (!z.f11144f && str2 != null && str2.length() > 0) {
                        z.f11144f = true;
                        Log.w("z", str2);
                    }
                }
                AtomicBoolean atomicBoolean2 = w.a;
                Intrinsics.checkNotNullParameter(applicationId3, "applicationId");
                JSONObject a11 = w.a();
                Context a12 = com.facebook.x.a();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                a12.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(com.applovin.impl.mediation.ads.e.h(new Object[]{applicationId3}, 1, "com.facebook.internal.APP_GATEKEEPERS.%s", "java.lang.String.format(format, *args)"), a11.toString()).apply();
                w.d(applicationId3, a11);
                r rVar = c6.g.a;
                Context a13 = com.facebook.x.a();
                String applicationId4 = com.facebook.x.b();
                if (u0.b()) {
                    if (a13 instanceof Application) {
                        com.facebook.c cVar = k.f10950b;
                        Application context4 = (Application) a13;
                        Intrinsics.checkNotNullParameter(context4, "application");
                        String str3 = l.f10951c;
                        Intrinsics.checkNotNullParameter(context4, "application");
                        if (com.facebook.x.h()) {
                            ReentrantReadWriteLock reentrantReadWriteLock = com.facebook.appevents.c.a;
                            if (!com.facebook.appevents.c.f10926c) {
                                com.facebook.c cVar2 = r.f10969b;
                                if (l.b() == null) {
                                    com.facebook.b.J();
                                }
                                ScheduledThreadPoolExecutor b3 = l.b();
                                if (b3 != null) {
                                    b3.execute(new g0(1));
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            }
                            com.facebook.appevents.w wVar = com.facebook.appevents.w.a;
                            if (!m6.a.b(com.facebook.appevents.w.class)) {
                                try {
                                    if (!com.facebook.appevents.w.f10980c.get()) {
                                        com.facebook.appevents.w.a.b();
                                    }
                                } catch (Throwable th4) {
                                    m6.a.a(com.facebook.appevents.w.class, th4);
                                }
                            }
                            com.facebook.x xVar3 = com.facebook.x.a;
                            if (!m6.a.b(com.facebook.x.class)) {
                                try {
                                    Intrinsics.checkNotNullParameter(context4, "context");
                                    Intrinsics.checkNotNullParameter(applicationId4, "applicationId");
                                    Context applicationContext = context4.getApplicationContext();
                                    if (applicationContext != null) {
                                        com.facebook.x.c().execute(new o0(28, applicationContext, applicationId4));
                                        v vVar = v.a;
                                        if (v.c(t.OnDeviceEventProcessing) && b.a()) {
                                            String str4 = "com.facebook.sdk.attributionTracking";
                                            if (!m6.a.b(b.class)) {
                                                try {
                                                    com.facebook.x.c().execute(new a(com.facebook.x.a(), str4, applicationId4, i10));
                                                } catch (Throwable th5) {
                                                    m6.a.a(b.class, th5);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    m6.a.a(com.facebook.x.class, th6);
                                }
                            }
                            c6.b.b(context4, applicationId4);
                        } else {
                            throw new q("The Facebook sdk must be initialized before calling activateApp");
                        }
                    } else {
                        Log.w("c6.g", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                AtomicReference atomicReference = z.f11142d;
                if (z.f11141c.containsKey(applicationId3)) {
                    yVar = y.SUCCESS;
                } else {
                    yVar = y.ERROR;
                }
                atomicReference.set(yVar);
                zVar2.e();
                return;
        }
    }

    public /* synthetic */ a(Context context, String str, String str2, int i10) {
        this.f17111b = i10;
        this.f17113d = context;
        this.f17112c = str;
        this.f17114f = str2;
    }
}
