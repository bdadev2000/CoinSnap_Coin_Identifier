package c6;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.x;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {
    public final Long a;

    /* renamed from: b, reason: collision with root package name */
    public Long f2659b;

    /* renamed from: c, reason: collision with root package name */
    public UUID f2660c;

    /* renamed from: d, reason: collision with root package name */
    public int f2661d;

    /* renamed from: e, reason: collision with root package name */
    public Long f2662e;

    /* renamed from: f, reason: collision with root package name */
    public n f2663f;

    public l(Long l10, Long l11) {
        UUID sessionId = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(sessionId, "randomUUID()");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.a = l10;
        this.f2659b = l11;
        this.f2660c = sessionId;
    }

    public final void a() {
        long longValue;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(x.a()).edit();
        long j3 = 0;
        Long l10 = this.a;
        if (l10 == null) {
            longValue = 0;
        } else {
            longValue = l10.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", longValue);
        Long l11 = this.f2659b;
        if (l11 != null) {
            j3 = l11.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j3);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f2661d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f2660c.toString());
        edit.apply();
        n nVar = this.f2663f;
        if (nVar != null && nVar != null) {
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(x.a()).edit();
            edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", nVar.a);
            edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", nVar.f2669b);
            edit2.apply();
        }
    }
}
