package mc;

import android.content.SharedPreferences;
import java.util.Date;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f22196e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f22197f = new Date(-1);
    public final SharedPreferences a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22198b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f22199c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f22200d = new Object();

    public l(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final k a() {
        k kVar;
        synchronized (this.f22199c) {
            kVar = new k(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)), 0);
        }
        return kVar;
    }

    public final k b() {
        k kVar;
        synchronized (this.f22200d) {
            kVar = new k(this.a.getInt("num_failed_realtime_streams", 0), new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L)), 1);
        }
        return kVar;
    }

    public final void c(int i10, Date date) {
        synchronized (this.f22199c) {
            this.a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(int i10, Date date) {
        synchronized (this.f22200d) {
            this.a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
