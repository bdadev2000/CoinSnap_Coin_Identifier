package l5;

import android.text.format.DateUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k4.C2434c;
import k4.InterfaceC2433b;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final long f21598j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f21599k = {2, 4, 8, 16, 32, 64, 128, NotificationCompat.FLAG_LOCAL_ONLY};

    /* renamed from: a, reason: collision with root package name */
    public final O4.e f21600a;
    public final N4.b b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f21601c;

    /* renamed from: d, reason: collision with root package name */
    public final Clock f21602d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f21603e;

    /* renamed from: f, reason: collision with root package name */
    public final C2451c f21604f;

    /* renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f21605g;

    /* renamed from: h, reason: collision with root package name */
    public final j f21606h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f21607i;

    public g(O4.e eVar, N4.b bVar, Executor executor, Random random, C2451c c2451c, ConfigFetchHttpClient configFetchHttpClient, j jVar, Map map) {
        Clock clock = k5.k.f21486j;
        this.f21600a = eVar;
        this.b = bVar;
        this.f21601c = executor;
        this.f21602d = clock;
        this.f21603e = random;
        this.f21604f = c2451c;
        this.f21605g = configFetchHttpClient;
        this.f21606h = jVar;
        this.f21607i = map;
    }

    public final f a(String str, String str2, Date date, HashMap hashMap) {
        String str3;
        Long l;
        try {
            HttpURLConnection b = this.f21605g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f21605g;
            HashMap d2 = d();
            String string = this.f21606h.f21616a.getString("last_fetch_etag", null);
            InterfaceC2433b interfaceC2433b = (InterfaceC2433b) this.b.get();
            if (interfaceC2433b == null) {
                l = null;
            } else {
                l = (Long) ((C2434c) interfaceC2433b).f21472a.getUserProperties(null, null, true).get("_fot");
            }
            f fetch = configFetchHttpClient.fetch(b, str, str2, d2, string, hashMap, l, date);
            d dVar = fetch.b;
            if (dVar != null) {
                j jVar = this.f21606h;
                long j7 = dVar.f21590f;
                synchronized (jVar.b) {
                    jVar.f21616a.edit().putLong("last_template_version", j7).apply();
                }
            }
            String str4 = fetch.f21597c;
            if (str4 != null) {
                j jVar2 = this.f21606h;
                synchronized (jVar2.b) {
                    jVar2.f21616a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f21606h.c(0, j.f21615f);
            return fetch;
        } catch (k5.f e4) {
            int i9 = e4.b;
            j jVar3 = this.f21606h;
            if (i9 == 429 || i9 == 502 || i9 == 503 || i9 == 504) {
                int i10 = jVar3.a().f21613a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f21599k;
                jVar3.c(i10, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f21603e.nextInt((int) r2)));
            }
            i a6 = jVar3.a();
            int i11 = e4.b;
            if (a6.f21613a <= 1 && i11 != 429) {
                if (i11 != 401) {
                    if (i11 != 403) {
                        if (i11 != 429) {
                            if (i11 != 500) {
                                switch (i11) {
                                    case 502:
                                    case 503:
                                    case 504:
                                        str3 = "The server is unavailable. Please try again later.";
                                        break;
                                    default:
                                        str3 = "The server returned an unexpected error.";
                                        break;
                                }
                            } else {
                                str3 = "There was an internal server error.";
                            }
                        } else {
                            throw new g4.h("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new k5.f(e4.b, "Fetch failed: ".concat(str3), e4);
            }
            a6.b.getTime();
            throw new g4.h("Fetch was throttled.");
        }
    }

    public final Task b(Task task, long j7, final HashMap hashMap) {
        Task continueWithTask;
        boolean before;
        final Date date = new Date(this.f21602d.currentTimeMillis());
        boolean isSuccessful = task.isSuccessful();
        Date date2 = null;
        j jVar = this.f21606h;
        if (isSuccessful) {
            jVar.getClass();
            Date date3 = new Date(jVar.f21616a.getLong("last_fetch_time_in_millis", -1L));
            if (date3.equals(j.f21614e)) {
                before = false;
            } else {
                before = date.before(new Date(TimeUnit.SECONDS.toMillis(j7) + date3.getTime()));
            }
            if (before) {
                return Tasks.forResult(new f(2, null, null));
            }
        }
        Date date4 = jVar.a().b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = this.f21601c;
        if (date2 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()));
            date2.getTime();
            continueWithTask = Tasks.forException(new g4.h(str));
        } else {
            O4.d dVar = (O4.d) this.f21600a;
            final Task c9 = dVar.c();
            final Task d2 = dVar.d();
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{c9, d2}).continueWithTask(executor, new Continuation() { // from class: l5.e
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task onSuccessTask;
                    Date date5 = date;
                    Map map = hashMap;
                    g gVar = g.this;
                    gVar.getClass();
                    Task task3 = c9;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new g4.h("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = d2;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new g4.h("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        f a6 = gVar.a((String) task3.getResult(), ((O4.a) task4.getResult()).f2177a, date5, (HashMap) map);
                        if (a6.f21596a != 0) {
                            onSuccessTask = Tasks.forResult(a6);
                        } else {
                            onSuccessTask = gVar.f21604f.d(a6.b).onSuccessTask(gVar.f21601c, new F2.d(a6, 17));
                        }
                        return onSuccessTask;
                    } catch (k5.d e4) {
                        return Tasks.forException(e4);
                    }
                }
            });
        }
        return continueWithTask.continueWithTask(executor, new F2.e(6, this, date));
    }

    public final Task c(int i9) {
        HashMap hashMap = new HashMap(this.f21607i);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i9);
        return this.f21604f.b().continueWithTask(this.f21601c, new F2.e(7, this, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        InterfaceC2433b interfaceC2433b = (InterfaceC2433b) this.b.get();
        if (interfaceC2433b == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : ((C2434c) interfaceC2433b).f21472a.getUserProperties(null, null, false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
