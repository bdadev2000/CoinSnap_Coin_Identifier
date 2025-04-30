package B4;

import D0.j;
import D0.m;
import I0.f;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import androidx.work.g;
import com.facebook.appevents.i;
import d1.C2161b;
import d1.C2164e;
import d1.C2168i;
import j5.C2400c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n1.C2475f;
import org.json.JSONObject;
import w4.v0;
import z.AbstractC2965e;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Object f316a;
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public Object f317c;

    /* renamed from: d, reason: collision with root package name */
    public Object f318d;

    /* renamed from: e, reason: collision with root package name */
    public Object f319e;

    /* renamed from: f, reason: collision with root package name */
    public Object f320f;

    /* renamed from: g, reason: collision with root package name */
    public Object f321g;

    /* renamed from: h, reason: collision with root package name */
    public Object f322h;

    /* renamed from: i, reason: collision with root package name */
    public Object f323i;

    public c(j jVar) {
        this.f316a = jVar;
        this.b = new C2161b(jVar, 5);
        this.f317c = new C2164e(jVar, 3);
        this.f318d = new C2164e(jVar, 4);
        this.f319e = new C2164e(jVar, 5);
        this.f320f = new C2164e(jVar, 6);
        this.f321g = new C2164e(jVar, 7);
        this.f322h = new C2164e(jVar, 8);
        this.f323i = new C2164e(jVar, 9);
        new AtomicBoolean(false);
    }

    public static void l(String str, JSONObject jSONObject) {
        StringBuilder b = AbstractC2965e.b(str);
        b.append(jSONObject.toString());
        String sb = b.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, null);
        }
    }

    public ArrayList a() {
        m mVar;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        m c9 = m.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        c9.h(1, 200);
        j jVar = (j) this.f316a;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            int f9 = i.f(g9, "required_network_type");
            int f10 = i.f(g9, "requires_charging");
            int f11 = i.f(g9, "requires_device_idle");
            int f12 = i.f(g9, "requires_battery_not_low");
            int f13 = i.f(g9, "requires_storage_not_low");
            int f14 = i.f(g9, "trigger_content_update_delay");
            int f15 = i.f(g9, "trigger_max_content_delay");
            int f16 = i.f(g9, "content_uri_triggers");
            int f17 = i.f(g9, "id");
            int f18 = i.f(g9, "state");
            int f19 = i.f(g9, "worker_class_name");
            int f20 = i.f(g9, "input_merger_class_name");
            int f21 = i.f(g9, "input");
            int f22 = i.f(g9, "output");
            mVar = c9;
            try {
                int f23 = i.f(g9, "initial_delay");
                int f24 = i.f(g9, "interval_duration");
                int f25 = i.f(g9, "flex_duration");
                int f26 = i.f(g9, "run_attempt_count");
                int f27 = i.f(g9, "backoff_policy");
                int f28 = i.f(g9, "backoff_delay_duration");
                int f29 = i.f(g9, "period_start_time");
                int f30 = i.f(g9, "minimum_retention_duration");
                int f31 = i.f(g9, "schedule_requested_at");
                int f32 = i.f(g9, "run_in_foreground");
                int f33 = i.f(g9, "out_of_quota_policy");
                int i9 = f22;
                ArrayList arrayList = new ArrayList(g9.getCount());
                while (g9.moveToNext()) {
                    String string = g9.getString(f17);
                    int i10 = f17;
                    String string2 = g9.getString(f19);
                    int i11 = f19;
                    androidx.work.c cVar = new androidx.work.c();
                    int i12 = f9;
                    cVar.f5203a = v0.p(g9.getInt(f9));
                    if (g9.getInt(f10) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    cVar.b = z8;
                    if (g9.getInt(f11) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    cVar.f5204c = z9;
                    if (g9.getInt(f12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f5205d = z10;
                    if (g9.getInt(f13) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f5206e = z11;
                    int i13 = f10;
                    int i14 = f11;
                    cVar.f5207f = g9.getLong(f14);
                    cVar.f5208g = g9.getLong(f15);
                    cVar.f5209h = v0.e(g9.getBlob(f16));
                    C2168i c2168i = new C2168i(string, string2);
                    c2168i.b = v0.r(g9.getInt(f18));
                    c2168i.f19803d = g9.getString(f20);
                    c2168i.f19804e = g.a(g9.getBlob(f21));
                    int i15 = i9;
                    c2168i.f19805f = g.a(g9.getBlob(i15));
                    int i16 = f21;
                    int i17 = f23;
                    c2168i.f19806g = g9.getLong(i17);
                    int i18 = f12;
                    int i19 = f24;
                    c2168i.f19807h = g9.getLong(i19);
                    int i20 = f25;
                    c2168i.f19808i = g9.getLong(i20);
                    int i21 = f26;
                    c2168i.f19810k = g9.getInt(i21);
                    int i22 = f27;
                    c2168i.l = v0.o(g9.getInt(i22));
                    int i23 = f28;
                    c2168i.m = g9.getLong(i23);
                    int i24 = f29;
                    c2168i.f19811n = g9.getLong(i24);
                    int i25 = f30;
                    c2168i.f19812o = g9.getLong(i25);
                    int i26 = f31;
                    c2168i.f19813p = g9.getLong(i26);
                    int i27 = f32;
                    if (g9.getInt(i27) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c2168i.f19814q = z12;
                    int i28 = f33;
                    c2168i.f19815r = v0.q(g9.getInt(i28));
                    c2168i.f19809j = cVar;
                    arrayList.add(c2168i);
                    i9 = i15;
                    f10 = i13;
                    f23 = i17;
                    f24 = i19;
                    f28 = i23;
                    f29 = i24;
                    f32 = i27;
                    f19 = i11;
                    f9 = i12;
                    f33 = i28;
                    f31 = i26;
                    f21 = i16;
                    f17 = i10;
                    f11 = i14;
                    f30 = i25;
                    f12 = i18;
                    f25 = i20;
                    f26 = i21;
                    f27 = i22;
                }
                g9.close();
                mVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g9.close();
                mVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = c9;
        }
    }

    public b b(int i9) {
        b bVar = null;
        try {
            if (!AbstractC2965e.a(2, i9)) {
                JSONObject v6 = ((C2475f) this.f319e).v();
                if (v6 != null) {
                    b n2 = ((C2400c) this.f317c).n(v6);
                    l("Loaded cached settings: ", v6);
                    ((r6.b) this.f318d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!AbstractC2965e.a(3, i9) && n2.f312c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            bVar = n2;
                        } catch (Exception e4) {
                            e = e4;
                            bVar = n2;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e9) {
            e = e9;
        }
        return bVar;
    }

    public ArrayList c(int i9) {
        m mVar;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        m c9 = m.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c9.h(1, i9);
        j jVar = (j) this.f316a;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            int f9 = i.f(g9, "required_network_type");
            int f10 = i.f(g9, "requires_charging");
            int f11 = i.f(g9, "requires_device_idle");
            int f12 = i.f(g9, "requires_battery_not_low");
            int f13 = i.f(g9, "requires_storage_not_low");
            int f14 = i.f(g9, "trigger_content_update_delay");
            int f15 = i.f(g9, "trigger_max_content_delay");
            int f16 = i.f(g9, "content_uri_triggers");
            int f17 = i.f(g9, "id");
            int f18 = i.f(g9, "state");
            int f19 = i.f(g9, "worker_class_name");
            int f20 = i.f(g9, "input_merger_class_name");
            int f21 = i.f(g9, "input");
            int f22 = i.f(g9, "output");
            mVar = c9;
            try {
                int f23 = i.f(g9, "initial_delay");
                int f24 = i.f(g9, "interval_duration");
                int f25 = i.f(g9, "flex_duration");
                int f26 = i.f(g9, "run_attempt_count");
                int f27 = i.f(g9, "backoff_policy");
                int f28 = i.f(g9, "backoff_delay_duration");
                int f29 = i.f(g9, "period_start_time");
                int f30 = i.f(g9, "minimum_retention_duration");
                int f31 = i.f(g9, "schedule_requested_at");
                int f32 = i.f(g9, "run_in_foreground");
                int f33 = i.f(g9, "out_of_quota_policy");
                int i10 = f22;
                ArrayList arrayList = new ArrayList(g9.getCount());
                while (g9.moveToNext()) {
                    String string = g9.getString(f17);
                    int i11 = f17;
                    String string2 = g9.getString(f19);
                    int i12 = f19;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = f9;
                    cVar.f5203a = v0.p(g9.getInt(f9));
                    if (g9.getInt(f10) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    cVar.b = z8;
                    if (g9.getInt(f11) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    cVar.f5204c = z9;
                    if (g9.getInt(f12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f5205d = z10;
                    if (g9.getInt(f13) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f5206e = z11;
                    int i14 = f10;
                    int i15 = f11;
                    cVar.f5207f = g9.getLong(f14);
                    cVar.f5208g = g9.getLong(f15);
                    cVar.f5209h = v0.e(g9.getBlob(f16));
                    C2168i c2168i = new C2168i(string, string2);
                    c2168i.b = v0.r(g9.getInt(f18));
                    c2168i.f19803d = g9.getString(f20);
                    c2168i.f19804e = g.a(g9.getBlob(f21));
                    int i16 = i10;
                    c2168i.f19805f = g.a(g9.getBlob(i16));
                    int i17 = f23;
                    int i18 = f21;
                    c2168i.f19806g = g9.getLong(i17);
                    int i19 = f12;
                    int i20 = f24;
                    c2168i.f19807h = g9.getLong(i20);
                    int i21 = f25;
                    c2168i.f19808i = g9.getLong(i21);
                    int i22 = f26;
                    c2168i.f19810k = g9.getInt(i22);
                    int i23 = f27;
                    c2168i.l = v0.o(g9.getInt(i23));
                    int i24 = f28;
                    c2168i.m = g9.getLong(i24);
                    int i25 = f29;
                    c2168i.f19811n = g9.getLong(i25);
                    int i26 = f30;
                    c2168i.f19812o = g9.getLong(i26);
                    int i27 = f31;
                    c2168i.f19813p = g9.getLong(i27);
                    int i28 = f32;
                    if (g9.getInt(i28) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c2168i.f19814q = z12;
                    int i29 = f33;
                    c2168i.f19815r = v0.q(g9.getInt(i29));
                    c2168i.f19809j = cVar;
                    arrayList.add(c2168i);
                    i10 = i16;
                    f10 = i14;
                    f32 = i28;
                    f17 = i11;
                    f19 = i12;
                    f9 = i13;
                    f33 = i29;
                    f21 = i18;
                    f23 = i17;
                    f24 = i20;
                    f28 = i24;
                    f29 = i25;
                    f31 = i27;
                    f11 = i15;
                    f30 = i26;
                    f12 = i19;
                    f25 = i21;
                    f26 = i22;
                    f27 = i23;
                }
                g9.close();
                mVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g9.close();
                mVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = c9;
        }
    }

    public ArrayList d() {
        m mVar;
        int f9;
        int f10;
        int f11;
        int f12;
        int f13;
        int f14;
        int f15;
        int f16;
        int f17;
        int f18;
        int f19;
        int f20;
        int f21;
        int f22;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        m c9 = m.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        j jVar = (j) this.f316a;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            f9 = i.f(g9, "required_network_type");
            f10 = i.f(g9, "requires_charging");
            f11 = i.f(g9, "requires_device_idle");
            f12 = i.f(g9, "requires_battery_not_low");
            f13 = i.f(g9, "requires_storage_not_low");
            f14 = i.f(g9, "trigger_content_update_delay");
            f15 = i.f(g9, "trigger_max_content_delay");
            f16 = i.f(g9, "content_uri_triggers");
            f17 = i.f(g9, "id");
            f18 = i.f(g9, "state");
            f19 = i.f(g9, "worker_class_name");
            f20 = i.f(g9, "input_merger_class_name");
            f21 = i.f(g9, "input");
            f22 = i.f(g9, "output");
            mVar = c9;
        } catch (Throwable th) {
            th = th;
            mVar = c9;
        }
        try {
            int f23 = i.f(g9, "initial_delay");
            int f24 = i.f(g9, "interval_duration");
            int f25 = i.f(g9, "flex_duration");
            int f26 = i.f(g9, "run_attempt_count");
            int f27 = i.f(g9, "backoff_policy");
            int f28 = i.f(g9, "backoff_delay_duration");
            int f29 = i.f(g9, "period_start_time");
            int f30 = i.f(g9, "minimum_retention_duration");
            int f31 = i.f(g9, "schedule_requested_at");
            int f32 = i.f(g9, "run_in_foreground");
            int f33 = i.f(g9, "out_of_quota_policy");
            int i9 = f22;
            ArrayList arrayList = new ArrayList(g9.getCount());
            while (g9.moveToNext()) {
                String string = g9.getString(f17);
                int i10 = f17;
                String string2 = g9.getString(f19);
                int i11 = f19;
                androidx.work.c cVar = new androidx.work.c();
                int i12 = f9;
                cVar.f5203a = v0.p(g9.getInt(f9));
                if (g9.getInt(f10) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                cVar.b = z8;
                if (g9.getInt(f11) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                cVar.f5204c = z9;
                if (g9.getInt(f12) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f5205d = z10;
                if (g9.getInt(f13) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cVar.f5206e = z11;
                int i13 = f10;
                int i14 = f11;
                cVar.f5207f = g9.getLong(f14);
                cVar.f5208g = g9.getLong(f15);
                cVar.f5209h = v0.e(g9.getBlob(f16));
                C2168i c2168i = new C2168i(string, string2);
                c2168i.b = v0.r(g9.getInt(f18));
                c2168i.f19803d = g9.getString(f20);
                c2168i.f19804e = g.a(g9.getBlob(f21));
                int i15 = i9;
                c2168i.f19805f = g.a(g9.getBlob(i15));
                int i16 = f21;
                int i17 = f23;
                c2168i.f19806g = g9.getLong(i17);
                int i18 = f12;
                int i19 = f24;
                c2168i.f19807h = g9.getLong(i19);
                int i20 = f25;
                c2168i.f19808i = g9.getLong(i20);
                int i21 = f26;
                c2168i.f19810k = g9.getInt(i21);
                int i22 = f27;
                c2168i.l = v0.o(g9.getInt(i22));
                int i23 = f28;
                c2168i.m = g9.getLong(i23);
                int i24 = f29;
                c2168i.f19811n = g9.getLong(i24);
                int i25 = f30;
                c2168i.f19812o = g9.getLong(i25);
                int i26 = f31;
                c2168i.f19813p = g9.getLong(i26);
                int i27 = f32;
                if (g9.getInt(i27) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c2168i.f19814q = z12;
                int i28 = f33;
                c2168i.f19815r = v0.q(g9.getInt(i28));
                c2168i.f19809j = cVar;
                arrayList.add(c2168i);
                i9 = i15;
                f10 = i13;
                f23 = i17;
                f24 = i19;
                f28 = i23;
                f29 = i24;
                f32 = i27;
                f19 = i11;
                f9 = i12;
                f33 = i28;
                f31 = i26;
                f21 = i16;
                f17 = i10;
                f11 = i14;
                f30 = i25;
                f12 = i18;
                f25 = i20;
                f26 = i21;
                f27 = i22;
            }
            g9.close();
            mVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g9.close();
            mVar.release();
            throw th;
        }
    }

    public ArrayList e() {
        m mVar;
        int f9;
        int f10;
        int f11;
        int f12;
        int f13;
        int f14;
        int f15;
        int f16;
        int f17;
        int f18;
        int f19;
        int f20;
        int f21;
        int f22;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        m c9 = m.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        j jVar = (j) this.f316a;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            f9 = i.f(g9, "required_network_type");
            f10 = i.f(g9, "requires_charging");
            f11 = i.f(g9, "requires_device_idle");
            f12 = i.f(g9, "requires_battery_not_low");
            f13 = i.f(g9, "requires_storage_not_low");
            f14 = i.f(g9, "trigger_content_update_delay");
            f15 = i.f(g9, "trigger_max_content_delay");
            f16 = i.f(g9, "content_uri_triggers");
            f17 = i.f(g9, "id");
            f18 = i.f(g9, "state");
            f19 = i.f(g9, "worker_class_name");
            f20 = i.f(g9, "input_merger_class_name");
            f21 = i.f(g9, "input");
            f22 = i.f(g9, "output");
            mVar = c9;
        } catch (Throwable th) {
            th = th;
            mVar = c9;
        }
        try {
            int f23 = i.f(g9, "initial_delay");
            int f24 = i.f(g9, "interval_duration");
            int f25 = i.f(g9, "flex_duration");
            int f26 = i.f(g9, "run_attempt_count");
            int f27 = i.f(g9, "backoff_policy");
            int f28 = i.f(g9, "backoff_delay_duration");
            int f29 = i.f(g9, "period_start_time");
            int f30 = i.f(g9, "minimum_retention_duration");
            int f31 = i.f(g9, "schedule_requested_at");
            int f32 = i.f(g9, "run_in_foreground");
            int f33 = i.f(g9, "out_of_quota_policy");
            int i9 = f22;
            ArrayList arrayList = new ArrayList(g9.getCount());
            while (g9.moveToNext()) {
                String string = g9.getString(f17);
                int i10 = f17;
                String string2 = g9.getString(f19);
                int i11 = f19;
                androidx.work.c cVar = new androidx.work.c();
                int i12 = f9;
                cVar.f5203a = v0.p(g9.getInt(f9));
                if (g9.getInt(f10) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                cVar.b = z8;
                if (g9.getInt(f11) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                cVar.f5204c = z9;
                if (g9.getInt(f12) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f5205d = z10;
                if (g9.getInt(f13) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cVar.f5206e = z11;
                int i13 = f10;
                int i14 = f11;
                cVar.f5207f = g9.getLong(f14);
                cVar.f5208g = g9.getLong(f15);
                cVar.f5209h = v0.e(g9.getBlob(f16));
                C2168i c2168i = new C2168i(string, string2);
                c2168i.b = v0.r(g9.getInt(f18));
                c2168i.f19803d = g9.getString(f20);
                c2168i.f19804e = g.a(g9.getBlob(f21));
                int i15 = i9;
                c2168i.f19805f = g.a(g9.getBlob(i15));
                int i16 = f21;
                int i17 = f23;
                c2168i.f19806g = g9.getLong(i17);
                int i18 = f12;
                int i19 = f24;
                c2168i.f19807h = g9.getLong(i19);
                int i20 = f25;
                c2168i.f19808i = g9.getLong(i20);
                int i21 = f26;
                c2168i.f19810k = g9.getInt(i21);
                int i22 = f27;
                c2168i.l = v0.o(g9.getInt(i22));
                int i23 = f28;
                c2168i.m = g9.getLong(i23);
                int i24 = f29;
                c2168i.f19811n = g9.getLong(i24);
                int i25 = f30;
                c2168i.f19812o = g9.getLong(i25);
                int i26 = f31;
                c2168i.f19813p = g9.getLong(i26);
                int i27 = f32;
                if (g9.getInt(i27) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c2168i.f19814q = z12;
                int i28 = f33;
                c2168i.f19815r = v0.q(g9.getInt(i28));
                c2168i.f19809j = cVar;
                arrayList.add(c2168i);
                i9 = i15;
                f10 = i13;
                f23 = i17;
                f24 = i19;
                f28 = i23;
                f29 = i24;
                f32 = i27;
                f19 = i11;
                f9 = i12;
                f33 = i28;
                f31 = i26;
                f21 = i16;
                f17 = i10;
                f11 = i14;
                f30 = i25;
                f12 = i18;
                f25 = i20;
                f26 = i21;
                f27 = i22;
            }
            g9.close();
            mVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g9.close();
            mVar.release();
            throw th;
        }
    }

    public b f() {
        return (b) ((AtomicReference) this.f322h).get();
    }

    public int g(String str) {
        m c9 = m.c(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c9.i(1);
        } else {
            c9.j(1, str);
        }
        j jVar = (j) this.f316a;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            int i9 = 0;
            if (g9.moveToFirst()) {
                i9 = v0.r(g9.getInt(0));
            }
            return i9;
        } finally {
            g9.close();
            c9.release();
        }
    }

    public ArrayList h(String str) {
        m c9 = m.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c9.i(1);
        } else {
            c9.j(1, str);
        }
        j jVar = (j) this.f316a;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            ArrayList arrayList = new ArrayList(g9.getCount());
            while (g9.moveToNext()) {
                arrayList.add(g9.getString(0));
            }
            return arrayList;
        } finally {
            g9.close();
            c9.release();
        }
    }

    public ArrayList i(String str) {
        m c9 = m.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            c9.i(1);
        } else {
            c9.j(1, str);
        }
        j jVar = (j) this.f316a;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            ArrayList arrayList = new ArrayList(g9.getCount());
            while (g9.moveToNext()) {
                arrayList.add(g9.getString(0));
            }
            return arrayList;
        } finally {
            g9.close();
            c9.release();
        }
    }

    public C2168i j(String str) {
        m mVar;
        C2168i c2168i;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        m c9 = m.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            c9.i(1);
        } else {
            c9.j(1, str);
        }
        j jVar = (j) this.f316a;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            int f9 = i.f(g9, "required_network_type");
            int f10 = i.f(g9, "requires_charging");
            int f11 = i.f(g9, "requires_device_idle");
            int f12 = i.f(g9, "requires_battery_not_low");
            int f13 = i.f(g9, "requires_storage_not_low");
            int f14 = i.f(g9, "trigger_content_update_delay");
            int f15 = i.f(g9, "trigger_max_content_delay");
            int f16 = i.f(g9, "content_uri_triggers");
            int f17 = i.f(g9, "id");
            int f18 = i.f(g9, "state");
            int f19 = i.f(g9, "worker_class_name");
            int f20 = i.f(g9, "input_merger_class_name");
            int f21 = i.f(g9, "input");
            int f22 = i.f(g9, "output");
            mVar = c9;
            try {
                int f23 = i.f(g9, "initial_delay");
                int f24 = i.f(g9, "interval_duration");
                int f25 = i.f(g9, "flex_duration");
                int f26 = i.f(g9, "run_attempt_count");
                int f27 = i.f(g9, "backoff_policy");
                int f28 = i.f(g9, "backoff_delay_duration");
                int f29 = i.f(g9, "period_start_time");
                int f30 = i.f(g9, "minimum_retention_duration");
                int f31 = i.f(g9, "schedule_requested_at");
                int f32 = i.f(g9, "run_in_foreground");
                int f33 = i.f(g9, "out_of_quota_policy");
                if (g9.moveToFirst()) {
                    String string = g9.getString(f17);
                    String string2 = g9.getString(f19);
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.f5203a = v0.p(g9.getInt(f9));
                    if (g9.getInt(f10) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    cVar.b = z8;
                    if (g9.getInt(f11) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    cVar.f5204c = z9;
                    if (g9.getInt(f12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f5205d = z10;
                    if (g9.getInt(f13) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f5206e = z11;
                    cVar.f5207f = g9.getLong(f14);
                    cVar.f5208g = g9.getLong(f15);
                    cVar.f5209h = v0.e(g9.getBlob(f16));
                    c2168i = new C2168i(string, string2);
                    c2168i.b = v0.r(g9.getInt(f18));
                    c2168i.f19803d = g9.getString(f20);
                    c2168i.f19804e = g.a(g9.getBlob(f21));
                    c2168i.f19805f = g.a(g9.getBlob(f22));
                    c2168i.f19806g = g9.getLong(f23);
                    c2168i.f19807h = g9.getLong(f24);
                    c2168i.f19808i = g9.getLong(f25);
                    c2168i.f19810k = g9.getInt(f26);
                    c2168i.l = v0.o(g9.getInt(f27));
                    c2168i.m = g9.getLong(f28);
                    c2168i.f19811n = g9.getLong(f29);
                    c2168i.f19812o = g9.getLong(f30);
                    c2168i.f19813p = g9.getLong(f31);
                    if (g9.getInt(f32) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c2168i.f19814q = z12;
                    c2168i.f19815r = v0.q(g9.getInt(f33));
                    c2168i.f19809j = cVar;
                } else {
                    c2168i = null;
                }
                g9.close();
                mVar.release();
                return c2168i;
            } catch (Throwable th) {
                th = th;
                g9.close();
                mVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = c9;
        }
    }

    public void k(String str) {
        j jVar = (j) this.f316a;
        jVar.b();
        C2164e c2164e = (C2164e) this.f320f;
        f a6 = c2164e.a();
        if (str == null) {
            a6.i(1);
        } else {
            a6.j(1, str);
        }
        jVar.c();
        try {
            a6.f1407f.executeUpdateDelete();
            jVar.h();
        } finally {
            jVar.f();
            c2164e.c(a6);
        }
    }

    public void m(long j7, String str) {
        j jVar = (j) this.f316a;
        jVar.b();
        C2164e c2164e = (C2164e) this.f322h;
        f a6 = c2164e.a();
        a6.h(1, j7);
        if (str == null) {
            a6.i(2);
        } else {
            a6.j(2, str);
        }
        jVar.c();
        try {
            a6.f1407f.executeUpdateDelete();
            jVar.h();
        } finally {
            jVar.f();
            c2164e.c(a6);
        }
    }

    public void n(String str) {
        j jVar = (j) this.f316a;
        jVar.b();
        C2164e c2164e = (C2164e) this.f321g;
        f a6 = c2164e.a();
        if (str == null) {
            a6.i(1);
        } else {
            a6.j(1, str);
        }
        jVar.c();
        try {
            a6.f1407f.executeUpdateDelete();
            jVar.h();
        } finally {
            jVar.f();
            c2164e.c(a6);
        }
    }

    public void o(String str, g gVar) {
        j jVar = (j) this.f316a;
        jVar.b();
        C2164e c2164e = (C2164e) this.f318d;
        f a6 = c2164e.a();
        byte[] c9 = g.c(gVar);
        if (c9 == null) {
            a6.i(1);
        } else {
            a6.b(1, c9);
        }
        if (str == null) {
            a6.i(2);
        } else {
            a6.j(2, str);
        }
        jVar.c();
        try {
            a6.p();
            jVar.h();
        } finally {
            jVar.f();
            c2164e.c(a6);
        }
    }

    public void p(long j7, String str) {
        j jVar = (j) this.f316a;
        jVar.b();
        C2164e c2164e = (C2164e) this.f319e;
        f a6 = c2164e.a();
        a6.h(1, j7);
        if (str == null) {
            a6.i(2);
        } else {
            a6.j(2, str);
        }
        jVar.c();
        try {
            a6.p();
            jVar.h();
        } finally {
            jVar.f();
            c2164e.c(a6);
        }
    }

    public void q(int i9, String... strArr) {
        j jVar = (j) this.f316a;
        jVar.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb.append("?");
            if (i10 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        jVar.a();
        jVar.b();
        SQLiteStatement compileStatement = ((SQLiteDatabase) jVar.f616c.getWritableDatabase().f1397c).compileStatement(sb2);
        compileStatement.bindLong(1, v0.D(i9));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i11);
            } else {
                compileStatement.bindString(i11, str);
            }
            i11++;
        }
        jVar.c();
        try {
            compileStatement.executeUpdateDelete();
            jVar.h();
        } finally {
            jVar.f();
        }
    }
}
