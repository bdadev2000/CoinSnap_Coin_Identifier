package E2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.r;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Long f1000a;
    public Long b;

    /* renamed from: c, reason: collision with root package name */
    public UUID f1001c;

    /* renamed from: d, reason: collision with root package name */
    public int f1002d;

    /* renamed from: e, reason: collision with root package name */
    public Long f1003e;

    /* renamed from: f, reason: collision with root package name */
    public D0.k f1004f;

    public m(Long l, Long l2) {
        UUID randomUUID = UUID.randomUUID();
        G7.j.d(randomUUID, "randomUUID()");
        this.f1000a = l;
        this.b = l2;
        this.f1001c = randomUUID;
    }

    public final void a() {
        long longValue;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(r.a()).edit();
        long j7 = 0;
        Long l = this.f1000a;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", longValue);
        Long l2 = this.b;
        if (l2 != null) {
            j7 = l2.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j7);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f1002d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f1001c.toString());
        edit.apply();
        D0.k kVar = this.f1004f;
        if (kVar != null && kVar != null) {
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(r.a()).edit();
            edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", kVar.b);
            edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", kVar.f624c);
            edit2.apply();
        }
    }
}
