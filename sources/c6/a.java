package c6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.appevents.r;
import com.facebook.internal.x;
import com.facebook.internal.z;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2616d;

    public /* synthetic */ a(long j3, String str, int i10) {
        this.f2614b = i10;
        this.f2615c = j3;
        this.f2616d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        int i10;
        switch (this.f2614b) {
            case 0:
                long j10 = this.f2615c;
                String activityName = this.f2616d;
                Intrinsics.checkNotNullParameter(activityName, "$activityName");
                if (b.f2621f == null) {
                    b.f2621f = new l(Long.valueOf(j10), null);
                }
                l lVar = b.f2621f;
                if (lVar != null) {
                    lVar.f2659b = Long.valueOf(j10);
                }
                int i11 = 1;
                if (b.f2620e.get() <= 0) {
                    a aVar = new a(j10, activityName, i11);
                    synchronized (b.f2619d) {
                        ScheduledExecutorService scheduledExecutorService = b.f2617b;
                        z zVar = z.a;
                        x b3 = z.b(com.facebook.x.b());
                        if (b3 == null) {
                            i10 = 60;
                        } else {
                            i10 = b3.f11121b;
                        }
                        b.f2618c = scheduledExecutorService.schedule(aVar, i10, TimeUnit.SECONDS);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                long j11 = b.f2624i;
                if (j11 > 0) {
                    j3 = (j10 - j11) / 1000;
                } else {
                    j3 = 0;
                }
                r rVar = g.a;
                Context a = com.facebook.x.a();
                x f10 = z.f(com.facebook.x.b(), false);
                if (f10 != null && f10.f11124e && j3 > 0) {
                    r rVar2 = new r(a);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", activityName);
                    rVar2.a("fb_aa_time_spent_on_view", j3, bundle);
                }
                l lVar2 = b.f2621f;
                if (lVar2 != null) {
                    lVar2.a();
                    return;
                }
                return;
            default:
                long j12 = this.f2615c;
                String activityName2 = this.f2616d;
                Intrinsics.checkNotNullParameter(activityName2, "$activityName");
                if (b.f2621f == null) {
                    b.f2621f = new l(Long.valueOf(j12), null);
                }
                if (b.f2620e.get() <= 0) {
                    m mVar = m.f2664b;
                    m.i(activityName2, b.f2621f, b.f2623h);
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.x.a()).edit();
                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    edit.apply();
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(com.facebook.x.a()).edit();
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    edit2.apply();
                    b.f2621f = null;
                }
                synchronized (b.f2619d) {
                    b.f2618c = null;
                    Unit unit2 = Unit.INSTANCE;
                }
                return;
        }
    }
}
