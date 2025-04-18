package mc;

import android.text.format.DateUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final long f22180j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f22181k = {2, 4, 8, 16, 32, 64, 128, NotificationCompat.FLAG_LOCAL_ONLY};
    public final dc.e a;

    /* renamed from: b, reason: collision with root package name */
    public final cc.c f22182b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f22183c;

    /* renamed from: d, reason: collision with root package name */
    public final Clock f22184d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f22185e;

    /* renamed from: f, reason: collision with root package name */
    public final d f22186f;

    /* renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f22187g;

    /* renamed from: h, reason: collision with root package name */
    public final l f22188h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f22189i;

    public i(dc.e eVar, cc.c cVar, ScheduledExecutorService scheduledExecutorService, Clock clock, Random random, d dVar, ConfigFetchHttpClient configFetchHttpClient, l lVar, HashMap hashMap) {
        this.a = eVar;
        this.f22182b = cVar;
        this.f22183c = scheduledExecutorService;
        this.f22184d = clock;
        this.f22185e = random;
        this.f22186f = dVar;
        this.f22187g = configFetchHttpClient;
        this.f22188h = lVar;
        this.f22189i = hashMap;
    }

    public final h a(String str, String str2, Date date, Map map) {
        boolean z10;
        String str3;
        Long l10;
        boolean z11 = false;
        try {
            HttpURLConnection b3 = this.f22187g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f22187g;
            HashMap d10 = d();
            String string = this.f22188h.a.getString("last_fetch_etag", null);
            za.b bVar = (za.b) this.f22182b.get();
            if (bVar == null) {
                l10 = null;
            } else {
                l10 = (Long) ((za.c) bVar).a.getUserProperties(null, null, true).get("_fot");
            }
            h fetch = configFetchHttpClient.fetch(b3, str, str2, d10, string, map, l10, date);
            f fVar = fetch.f22178b;
            if (fVar != null) {
                l lVar = this.f22188h;
                long j3 = fVar.f22171f;
                synchronized (lVar.f22198b) {
                    lVar.a.edit().putLong("last_template_version", j3).apply();
                }
            }
            String str4 = fetch.f22179c;
            if (str4 != null) {
                l lVar2 = this.f22188h;
                synchronized (lVar2.f22198b) {
                    lVar2.a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f22188h.c(0, l.f22197f);
            return fetch;
        } catch (lc.f e2) {
            int i10 = e2.f21337b;
            if (i10 != 429 && i10 != 502 && i10 != 503 && i10 != 504) {
                z10 = false;
            } else {
                z10 = true;
            }
            l lVar3 = this.f22188h;
            if (z10) {
                int i11 = lVar3.a().a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f22181k;
                lVar3.c(i11, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]) / 2) + this.f22185e.nextInt((int) r7)));
            }
            k a = lVar3.a();
            int i12 = e2.f21337b;
            if (a.a > 1 || i12 == 429) {
                z11 = true;
            }
            if (!z11) {
                if (i12 != 401) {
                    if (i12 != 403) {
                        if (i12 != 429) {
                            if (i12 != 500) {
                                switch (i12) {
                                    case PglCryptUtils.INPUT_INVALID /* 502 */:
                                    case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                                    case PglCryptUtils.BASE64_FAILED /* 504 */:
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
                            throw new lc.c("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new lc.f(e2.f21337b, "Fetch failed: ".concat(str3), e2);
            }
            a.f22195b.getTime();
            throw new lc.e();
        }
    }

    public final Task b(long j3, Task task, final Map map) {
        Task continueWithTask;
        boolean before;
        final Date date = new Date(this.f22184d.currentTimeMillis());
        boolean isSuccessful = task.isSuccessful();
        Date date2 = null;
        l lVar = this.f22188h;
        if (isSuccessful) {
            lVar.getClass();
            Date date3 = new Date(lVar.a.getLong("last_fetch_time_in_millis", -1L));
            if (date3.equals(l.f22196e)) {
                before = false;
            } else {
                before = date.before(new Date(TimeUnit.SECONDS.toMillis(j3) + date3.getTime()));
            }
            if (before) {
                return Tasks.forResult(new h(2, null, null));
            }
        }
        Date date4 = lVar.a().f22195b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = this.f22183c;
        if (date2 != null) {
            String format = String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime())));
            date2.getTime();
            continueWithTask = Tasks.forException(new lc.e(format));
        } else {
            dc.d dVar = (dc.d) this.a;
            final Task c10 = dVar.c();
            final Task d10 = dVar.d();
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{c10, d10}).continueWithTask(executor, new Continuation() { // from class: mc.g
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task onSuccessTask;
                    Date date5 = date;
                    Map map2 = map;
                    i iVar = i.this;
                    iVar.getClass();
                    Task task3 = c10;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new lc.c("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = d10;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new lc.c("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        h a = iVar.a((String) task3.getResult(), ((dc.a) task4.getResult()).a, date5, map2);
                        if (a.a != 0) {
                            onSuccessTask = Tasks.forResult(a);
                        } else {
                            onSuccessTask = iVar.f22186f.d(a.f22178b).onSuccessTask(iVar.f22183c, new gb.d(a, 6));
                        }
                        return onSuccessTask;
                    } catch (lc.d e2) {
                        return Tasks.forException(e2);
                    }
                }
            });
        }
        return continueWithTask.continueWithTask(executor, new androidx.fragment.app.e(26, this, date));
    }

    public final Task c(int i10) {
        HashMap hashMap = new HashMap(this.f22189i);
        hashMap.put("X-Firebase-RC-Fetch-Type", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.d(2) + "/" + i10);
        return this.f22186f.b().continueWithTask(this.f22183c, new androidx.fragment.app.e(25, this, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        za.b bVar = (za.b) this.f22182b.get();
        if (bVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : ((za.c) bVar).a.getUserProperties(null, null, false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
