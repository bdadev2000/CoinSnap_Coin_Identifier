package l5;

import android.content.SharedPreferences;
import java.util.Date;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f21614e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f21615f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f21616a;
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f21617c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f21618d = new Object();

    public j(SharedPreferences sharedPreferences) {
        this.f21616a = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l5.i, java.lang.Object] */
    public final i a() {
        ?? obj;
        synchronized (this.f21617c) {
            int i9 = this.f21616a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f21616a.getLong("backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f21613a = i9;
            obj.b = date;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l5.i, java.lang.Object] */
    public final i b() {
        ?? obj;
        synchronized (this.f21618d) {
            int i9 = this.f21616a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f21616a.getLong("realtime_backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f21613a = i9;
            obj.b = date;
        }
        return obj;
    }

    public final void c(int i9, Date date) {
        synchronized (this.f21617c) {
            this.f21616a.edit().putInt("num_failed_fetches", i9).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(int i9, Date date) {
        synchronized (this.f21618d) {
            this.f21616a.edit().putInt("num_failed_realtime_streams", i9).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
