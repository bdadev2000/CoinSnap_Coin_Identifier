package E2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.N;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.r;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f979d;

    public /* synthetic */ b(long j7, String str, int i9) {
        this.b = i9;
        this.f978c = j7;
        this.f979d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j7;
        int i9;
        int i10 = 1;
        switch (this.b) {
            case 0:
                long j9 = this.f978c;
                String str = this.f979d;
                G7.j.e(str, "$activityName");
                if (d.f984f == null) {
                    d.f984f = new m(Long.valueOf(j9), null);
                }
                m mVar = d.f984f;
                if (mVar != null) {
                    mVar.b = Long.valueOf(j9);
                }
                if (d.f983e.get() <= 0) {
                    b bVar = new b(j9, str, i10);
                    synchronized (d.f982d) {
                        ScheduledExecutorService scheduledExecutorService = d.b;
                        w wVar = w.f13674a;
                        t b = w.b(r.b());
                        if (b == null) {
                            i9 = 60;
                        } else {
                            i9 = b.b;
                        }
                        d.f981c = scheduledExecutorService.schedule(bVar, i9, TimeUnit.SECONDS);
                    }
                }
                long j10 = d.f987i;
                if (j10 > 0) {
                    j7 = (j9 - j10) / 1000;
                } else {
                    j7 = 0;
                }
                com.bumptech.glide.f fVar = h.f993a;
                Context a6 = r.a();
                t f9 = w.f(r.b(), false);
                if (f9 != null && f9.f13660d && j7 > 0) {
                    com.facebook.appevents.l lVar = new com.facebook.appevents.l(a6, (String) null);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", str);
                    double d2 = j7;
                    if (N.b() && !O2.a.b(lVar)) {
                        try {
                            lVar.e("fb_aa_time_spent_on_view", Double.valueOf(d2), bundle, false, d.b());
                        } catch (Throwable th) {
                            O2.a.a(lVar, th);
                        }
                    }
                }
                m mVar2 = d.f984f;
                if (mVar2 != null) {
                    mVar2.a();
                    return;
                }
                return;
            default:
                long j11 = this.f978c;
                String str2 = this.f979d;
                G7.j.e(str2, "$activityName");
                if (d.f984f == null) {
                    d.f984f = new m(Long.valueOf(j11), null);
                }
                if (d.f983e.get() <= 0) {
                    n.d(str2, d.f984f, d.f986h);
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(r.a()).edit();
                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    edit.apply();
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(r.a()).edit();
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    edit2.apply();
                    d.f984f = null;
                }
                synchronized (d.f982d) {
                    d.f981c = null;
                }
                return;
        }
    }
}
