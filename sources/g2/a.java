package G2;

import E2.h;
import G7.j;
import a5.C0398b;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.C1849l;
import com.facebook.N;
import com.facebook.appevents.l;
import com.facebook.internal.H;
import com.facebook.internal.p;
import com.facebook.internal.s;
import com.facebook.internal.t;
import com.facebook.internal.v;
import com.facebook.internal.w;
import com.facebook.r;
import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;
import u7.C2824o;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f1262d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1263f;

    public /* synthetic */ a(Context context, String str) {
        this.b = 0;
        this.f1262d = context;
        this.f1261c = "com.facebook.sdk.attributionTracking";
        this.f1263f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar;
        JSONObject jSONObject;
        switch (this.b) {
            case 0:
                Context context = this.f1262d;
                String str = this.f1261c;
                String str2 = this.f1263f;
                if (!O2.a.b(b.class)) {
                    try {
                        j.e(context, "$context");
                        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                        String j7 = j.j("pingForOnDevice", str2);
                        if (sharedPreferences.getLong(j7, 0L) == 0) {
                            if (!O2.a.b(g.class)) {
                                try {
                                    j.e(str2, "applicationId");
                                    g.f1273a.b(d.MOBILE_APP_INSTALL, str2, C2824o.b);
                                } catch (Throwable th) {
                                    O2.a.a(g.class, th);
                                }
                            }
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(j7, System.currentTimeMillis());
                            edit.apply();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        O2.a.a(b.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                String str3 = this.f1261c;
                j.e(str3, "$applicationId");
                Context context2 = this.f1262d;
                j.e(context2, "$context");
                String str4 = this.f1263f;
                j.e(str4, "$gateKeepersKey");
                JSONObject a6 = s.a();
                if (a6.length() != 0) {
                    s.d(str3, a6);
                    context2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str4, a6.toString()).apply();
                    s.f13656d = Long.valueOf(System.currentTimeMillis());
                }
                s.e();
                s.f13654a.set(false);
                return;
            default:
                Context context3 = this.f1262d;
                String str5 = this.f1261c;
                String str6 = this.f1263f;
                j.e(context3, "$context");
                j.e(str5, "$settingsKey");
                j.e(str6, "$applicationId");
                SharedPreferences sharedPreferences2 = context3.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                t tVar = null;
                String string = sharedPreferences2.getString(str5, null);
                boolean B5 = H.B(string);
                w wVar = w.f13674a;
                if (!B5) {
                    if (string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            r rVar = r.f13801a;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            tVar = w.d(str6, jSONObject);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                JSONObject a9 = w.a();
                w.d(str6, a9);
                sharedPreferences2.edit().putString(str5, a9.toString()).apply();
                if (tVar != null) {
                    String str7 = tVar.f13665i;
                    if (!w.f13678f && str7 != null && str7.length() > 0) {
                        w.f13678f = true;
                        Log.w("w", str7);
                    }
                }
                JSONObject a10 = s.a();
                r.a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str6}, 1)), a10.toString()).apply();
                s.d(str6, a10);
                com.bumptech.glide.f fVar = h.f993a;
                Context a11 = r.a();
                String b = r.b();
                if (N.b()) {
                    if (a11 instanceof Application) {
                        Application application = (Application) a11;
                        String str8 = l.f13492c;
                        if (r.f13812o.get()) {
                            ReentrantReadWriteLock reentrantReadWriteLock = com.facebook.appevents.c.f13472a;
                            if (!com.facebook.appevents.c.f13473c) {
                                if (l.b() == null) {
                                    C0398b.y();
                                }
                                ScheduledThreadPoolExecutor b8 = l.b();
                                if (b8 != null) {
                                    b8.execute(new C2.b(11));
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            }
                            com.facebook.appevents.t tVar2 = com.facebook.appevents.t.f13517a;
                            if (!O2.a.b(com.facebook.appevents.t.class)) {
                                try {
                                    if (!com.facebook.appevents.t.f13518c.get()) {
                                        com.facebook.appevents.t.f13517a.b();
                                    }
                                } catch (Throwable th3) {
                                    O2.a.a(com.facebook.appevents.t.class, th3);
                                }
                            }
                            r rVar2 = r.f13801a;
                            if (!O2.a.b(r.class)) {
                                try {
                                    Context applicationContext = application.getApplicationContext();
                                    if (applicationContext != null) {
                                        r.c().execute(new A4.d(26, applicationContext, b));
                                        com.facebook.internal.r rVar3 = com.facebook.internal.r.f13653a;
                                        if (com.facebook.internal.r.b(p.OnDeviceEventProcessing) && b.a() && !O2.a.b(b.class)) {
                                            try {
                                                r.c().execute(new a(r.a(), b));
                                            } catch (Throwable th4) {
                                                O2.a.a(b.class, th4);
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    O2.a.a(r.class, th5);
                                }
                            }
                            E2.d.c(application, b);
                        } else {
                            throw new C1849l("The Facebook sdk must be initialized before calling activateApp");
                        }
                    } else {
                        Log.w("E2.h", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                AtomicReference atomicReference = w.f13676d;
                if (w.f13675c.containsKey(str6)) {
                    vVar = v.f13671d;
                } else {
                    vVar = v.f13672f;
                }
                atomicReference.set(vVar);
                wVar.e();
                return;
        }
    }

    public /* synthetic */ a(Context context, String str, String str2) {
        this.b = 2;
        this.f1262d = context;
        this.f1261c = str;
        this.f1263f = str2;
    }

    public /* synthetic */ a(String str, Context context, String str2) {
        this.b = 1;
        this.f1261c = str;
        this.f1262d = context;
        this.f1263f = str2;
    }
}
