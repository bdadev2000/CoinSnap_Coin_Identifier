package u2;

import android.content.Context;
import android.database.Cursor;
import androidx.work.y;
import com.facebook.appevents.o;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import mc.n;
import v1.f0;
import v1.j0;
import v1.n0;

/* loaded from: classes.dex */
public final class l {
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25469b;

    /* renamed from: c, reason: collision with root package name */
    public Object f25470c;

    /* renamed from: d, reason: collision with root package name */
    public Object f25471d;

    /* renamed from: e, reason: collision with root package name */
    public Object f25472e;

    /* renamed from: f, reason: collision with root package name */
    public Object f25473f;

    /* renamed from: g, reason: collision with root package name */
    public Object f25474g;

    /* renamed from: h, reason: collision with root package name */
    public Object f25475h;

    /* renamed from: i, reason: collision with root package name */
    public Object f25476i;

    /* renamed from: j, reason: collision with root package name */
    public Object f25477j;

    public l() {
    }

    public final void a(String str, String str2) {
        d().put(str, str2);
    }

    public final i7.h b() {
        String str;
        if (((String) this.a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((i7.l) this.f25470c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f25471d) == null) {
            str = eb.j.k(str, " eventMillis");
        }
        if (((Long) this.f25472e) == null) {
            str = eb.j.k(str, " uptimeMillis");
        }
        if (((Map) this.f25473f) == null) {
            str = eb.j.k(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i7.h((String) this.a, (Integer) this.f25469b, (i7.l) this.f25470c, ((Long) this.f25471d).longValue(), ((Long) this.f25472e).longValue(), (Map) this.f25473f, (Integer) this.f25474g, (String) this.f25475h, (byte[]) this.f25476i, (byte[]) this.f25477j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final ArrayList c() {
        j0 j0Var;
        int j3;
        int j10;
        int j11;
        int j12;
        int j13;
        int j14;
        int j15;
        int j16;
        int j17;
        int j18;
        int j19;
        int j20;
        int j21;
        int j22;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j0 j23 = j0.j(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        j23.m(1, 200);
        ((f0) this.a).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((f0) this.a, j23);
        try {
            j3 = o.j(G, "required_network_type");
            j10 = o.j(G, "requires_charging");
            j11 = o.j(G, "requires_device_idle");
            j12 = o.j(G, "requires_battery_not_low");
            j13 = o.j(G, "requires_storage_not_low");
            j14 = o.j(G, "trigger_content_update_delay");
            j15 = o.j(G, "trigger_max_content_delay");
            j16 = o.j(G, "content_uri_triggers");
            j17 = o.j(G, "id");
            j18 = o.j(G, "state");
            j19 = o.j(G, "worker_class_name");
            j20 = o.j(G, "input_merger_class_name");
            j21 = o.j(G, "input");
            j22 = o.j(G, "output");
            j0Var = j23;
        } catch (Throwable th2) {
            th = th2;
            j0Var = j23;
        }
        try {
            int j24 = o.j(G, "initial_delay");
            int j25 = o.j(G, "interval_duration");
            int j26 = o.j(G, "flex_duration");
            int j27 = o.j(G, "run_attempt_count");
            int j28 = o.j(G, "backoff_policy");
            int j29 = o.j(G, "backoff_delay_duration");
            int j30 = o.j(G, "period_start_time");
            int j31 = o.j(G, "minimum_retention_duration");
            int j32 = o.j(G, "schedule_requested_at");
            int j33 = o.j(G, "run_in_foreground");
            int j34 = o.j(G, "out_of_quota_policy");
            int i10 = j22;
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                String string = G.getString(j17);
                int i11 = j17;
                String string2 = G.getString(j19);
                int i12 = j19;
                androidx.work.d dVar = new androidx.work.d();
                int i13 = j3;
                dVar.a = o.r(G.getInt(j3));
                if (G.getInt(j10) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.f2188b = z10;
                if (G.getInt(j11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar.f2189c = z11;
                if (G.getInt(j12) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                dVar.f2190d = z12;
                if (G.getInt(j13) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                dVar.f2191e = z13;
                int i14 = j10;
                int i15 = j11;
                dVar.f2192f = G.getLong(j14);
                dVar.f2193g = G.getLong(j15);
                dVar.f2194h = o.a(G.getBlob(j16));
                j jVar = new j(string, string2);
                jVar.f25452b = o.t(G.getInt(j18));
                jVar.f25454d = G.getString(j20);
                jVar.f25455e = androidx.work.h.a(G.getBlob(j21));
                int i16 = i10;
                jVar.f25456f = androidx.work.h.a(G.getBlob(i16));
                i10 = i16;
                int i17 = j24;
                jVar.f25457g = G.getLong(i17);
                int i18 = j21;
                int i19 = j25;
                jVar.f25458h = G.getLong(i19);
                int i20 = j12;
                int i21 = j26;
                jVar.f25459i = G.getLong(i21);
                int i22 = j27;
                jVar.f25461k = G.getInt(i22);
                int i23 = j28;
                jVar.f25462l = o.q(G.getInt(i23));
                j26 = i21;
                int i24 = j29;
                jVar.f25463m = G.getLong(i24);
                int i25 = j30;
                jVar.f25464n = G.getLong(i25);
                j30 = i25;
                int i26 = j31;
                jVar.f25465o = G.getLong(i26);
                int i27 = j32;
                jVar.f25466p = G.getLong(i27);
                int i28 = j33;
                if (G.getInt(i28) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                jVar.f25467q = z14;
                int i29 = j34;
                jVar.f25468r = o.s(G.getInt(i29));
                jVar.f25460j = dVar;
                arrayList.add(jVar);
                j34 = i29;
                j10 = i14;
                j21 = i18;
                j24 = i17;
                j25 = i19;
                j27 = i22;
                j32 = i27;
                j17 = i11;
                j19 = i12;
                j3 = i13;
                j33 = i28;
                j31 = i26;
                j11 = i15;
                j29 = i24;
                j12 = i20;
                j28 = i23;
            }
            G.close();
            j0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            G.close();
            j0Var.release();
            throw th;
        }
    }

    public final Map d() {
        Object obj = this.f25473f;
        if (((Map) obj) != null) {
            return (Map) obj;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public final ArrayList e(int i10) {
        j0 j0Var;
        int j3;
        int j10;
        int j11;
        int j12;
        int j13;
        int j14;
        int j15;
        int j16;
        int j17;
        int j18;
        int j19;
        int j20;
        int j21;
        int j22;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j0 j23 = j0.j(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        j23.m(1, i10);
        ((f0) this.a).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((f0) this.a, j23);
        try {
            j3 = o.j(G, "required_network_type");
            j10 = o.j(G, "requires_charging");
            j11 = o.j(G, "requires_device_idle");
            j12 = o.j(G, "requires_battery_not_low");
            j13 = o.j(G, "requires_storage_not_low");
            j14 = o.j(G, "trigger_content_update_delay");
            j15 = o.j(G, "trigger_max_content_delay");
            j16 = o.j(G, "content_uri_triggers");
            j17 = o.j(G, "id");
            j18 = o.j(G, "state");
            j19 = o.j(G, "worker_class_name");
            j20 = o.j(G, "input_merger_class_name");
            j21 = o.j(G, "input");
            j22 = o.j(G, "output");
            j0Var = j23;
        } catch (Throwable th2) {
            th = th2;
            j0Var = j23;
        }
        try {
            int j24 = o.j(G, "initial_delay");
            int j25 = o.j(G, "interval_duration");
            int j26 = o.j(G, "flex_duration");
            int j27 = o.j(G, "run_attempt_count");
            int j28 = o.j(G, "backoff_policy");
            int j29 = o.j(G, "backoff_delay_duration");
            int j30 = o.j(G, "period_start_time");
            int j31 = o.j(G, "minimum_retention_duration");
            int j32 = o.j(G, "schedule_requested_at");
            int j33 = o.j(G, "run_in_foreground");
            int j34 = o.j(G, "out_of_quota_policy");
            int i11 = j22;
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                String string = G.getString(j17);
                int i12 = j17;
                String string2 = G.getString(j19);
                int i13 = j19;
                androidx.work.d dVar = new androidx.work.d();
                int i14 = j3;
                dVar.a = o.r(G.getInt(j3));
                if (G.getInt(j10) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.f2188b = z10;
                if (G.getInt(j11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar.f2189c = z11;
                if (G.getInt(j12) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                dVar.f2190d = z12;
                if (G.getInt(j13) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                dVar.f2191e = z13;
                int i15 = j10;
                int i16 = j11;
                dVar.f2192f = G.getLong(j14);
                dVar.f2193g = G.getLong(j15);
                dVar.f2194h = o.a(G.getBlob(j16));
                j jVar = new j(string, string2);
                jVar.f25452b = o.t(G.getInt(j18));
                jVar.f25454d = G.getString(j20);
                jVar.f25455e = androidx.work.h.a(G.getBlob(j21));
                int i17 = i11;
                jVar.f25456f = androidx.work.h.a(G.getBlob(i17));
                int i18 = j24;
                i11 = i17;
                jVar.f25457g = G.getLong(i18);
                int i19 = j21;
                int i20 = j25;
                jVar.f25458h = G.getLong(i20);
                int i21 = j12;
                int i22 = j26;
                jVar.f25459i = G.getLong(i22);
                int i23 = j27;
                jVar.f25461k = G.getInt(i23);
                int i24 = j28;
                jVar.f25462l = o.q(G.getInt(i24));
                j26 = i22;
                int i25 = j29;
                jVar.f25463m = G.getLong(i25);
                int i26 = j30;
                jVar.f25464n = G.getLong(i26);
                j30 = i26;
                int i27 = j31;
                jVar.f25465o = G.getLong(i27);
                int i28 = j32;
                jVar.f25466p = G.getLong(i28);
                int i29 = j33;
                if (G.getInt(i29) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                jVar.f25467q = z14;
                int i30 = j34;
                jVar.f25468r = o.s(G.getInt(i30));
                jVar.f25460j = dVar;
                arrayList.add(jVar);
                j10 = i15;
                j34 = i30;
                j21 = i19;
                j24 = i18;
                j25 = i20;
                j27 = i23;
                j32 = i28;
                j17 = i12;
                j19 = i13;
                j3 = i14;
                j33 = i29;
                j31 = i27;
                j11 = i16;
                j29 = i25;
                j12 = i21;
                j28 = i24;
            }
            G.close();
            j0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            G.close();
            j0Var.release();
            throw th;
        }
    }

    public final ArrayList f() {
        j0 j0Var;
        int j3;
        int j10;
        int j11;
        int j12;
        int j13;
        int j14;
        int j15;
        int j16;
        int j17;
        int j18;
        int j19;
        int j20;
        int j21;
        int j22;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j0 j23 = j0.j(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        ((f0) this.a).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((f0) this.a, j23);
        try {
            j3 = o.j(G, "required_network_type");
            j10 = o.j(G, "requires_charging");
            j11 = o.j(G, "requires_device_idle");
            j12 = o.j(G, "requires_battery_not_low");
            j13 = o.j(G, "requires_storage_not_low");
            j14 = o.j(G, "trigger_content_update_delay");
            j15 = o.j(G, "trigger_max_content_delay");
            j16 = o.j(G, "content_uri_triggers");
            j17 = o.j(G, "id");
            j18 = o.j(G, "state");
            j19 = o.j(G, "worker_class_name");
            j20 = o.j(G, "input_merger_class_name");
            j21 = o.j(G, "input");
            j22 = o.j(G, "output");
            j0Var = j23;
        } catch (Throwable th2) {
            th = th2;
            j0Var = j23;
        }
        try {
            int j24 = o.j(G, "initial_delay");
            int j25 = o.j(G, "interval_duration");
            int j26 = o.j(G, "flex_duration");
            int j27 = o.j(G, "run_attempt_count");
            int j28 = o.j(G, "backoff_policy");
            int j29 = o.j(G, "backoff_delay_duration");
            int j30 = o.j(G, "period_start_time");
            int j31 = o.j(G, "minimum_retention_duration");
            int j32 = o.j(G, "schedule_requested_at");
            int j33 = o.j(G, "run_in_foreground");
            int j34 = o.j(G, "out_of_quota_policy");
            int i10 = j22;
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                String string = G.getString(j17);
                int i11 = j17;
                String string2 = G.getString(j19);
                int i12 = j19;
                androidx.work.d dVar = new androidx.work.d();
                int i13 = j3;
                dVar.a = o.r(G.getInt(j3));
                if (G.getInt(j10) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.f2188b = z10;
                if (G.getInt(j11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar.f2189c = z11;
                if (G.getInt(j12) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                dVar.f2190d = z12;
                if (G.getInt(j13) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                dVar.f2191e = z13;
                int i14 = j10;
                int i15 = j11;
                dVar.f2192f = G.getLong(j14);
                dVar.f2193g = G.getLong(j15);
                dVar.f2194h = o.a(G.getBlob(j16));
                j jVar = new j(string, string2);
                jVar.f25452b = o.t(G.getInt(j18));
                jVar.f25454d = G.getString(j20);
                jVar.f25455e = androidx.work.h.a(G.getBlob(j21));
                int i16 = i10;
                jVar.f25456f = androidx.work.h.a(G.getBlob(i16));
                i10 = i16;
                int i17 = j24;
                jVar.f25457g = G.getLong(i17);
                int i18 = j21;
                int i19 = j25;
                jVar.f25458h = G.getLong(i19);
                int i20 = j12;
                int i21 = j26;
                jVar.f25459i = G.getLong(i21);
                int i22 = j27;
                jVar.f25461k = G.getInt(i22);
                int i23 = j28;
                jVar.f25462l = o.q(G.getInt(i23));
                j26 = i21;
                int i24 = j29;
                jVar.f25463m = G.getLong(i24);
                int i25 = j30;
                jVar.f25464n = G.getLong(i25);
                j30 = i25;
                int i26 = j31;
                jVar.f25465o = G.getLong(i26);
                int i27 = j32;
                jVar.f25466p = G.getLong(i27);
                int i28 = j33;
                if (G.getInt(i28) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                jVar.f25467q = z14;
                int i29 = j34;
                jVar.f25468r = o.s(G.getInt(i29));
                jVar.f25460j = dVar;
                arrayList.add(jVar);
                j34 = i29;
                j10 = i14;
                j21 = i18;
                j24 = i17;
                j25 = i19;
                j27 = i22;
                j32 = i27;
                j17 = i11;
                j19 = i12;
                j3 = i13;
                j33 = i28;
                j31 = i26;
                j11 = i15;
                j29 = i24;
                j12 = i20;
                j28 = i23;
            }
            G.close();
            j0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            G.close();
            j0Var.release();
            throw th;
        }
    }

    public final ArrayList g() {
        j0 j0Var;
        int j3;
        int j10;
        int j11;
        int j12;
        int j13;
        int j14;
        int j15;
        int j16;
        int j17;
        int j18;
        int j19;
        int j20;
        int j21;
        int j22;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j0 j23 = j0.j(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        ((f0) this.a).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((f0) this.a, j23);
        try {
            j3 = o.j(G, "required_network_type");
            j10 = o.j(G, "requires_charging");
            j11 = o.j(G, "requires_device_idle");
            j12 = o.j(G, "requires_battery_not_low");
            j13 = o.j(G, "requires_storage_not_low");
            j14 = o.j(G, "trigger_content_update_delay");
            j15 = o.j(G, "trigger_max_content_delay");
            j16 = o.j(G, "content_uri_triggers");
            j17 = o.j(G, "id");
            j18 = o.j(G, "state");
            j19 = o.j(G, "worker_class_name");
            j20 = o.j(G, "input_merger_class_name");
            j21 = o.j(G, "input");
            j22 = o.j(G, "output");
            j0Var = j23;
        } catch (Throwable th2) {
            th = th2;
            j0Var = j23;
        }
        try {
            int j24 = o.j(G, "initial_delay");
            int j25 = o.j(G, "interval_duration");
            int j26 = o.j(G, "flex_duration");
            int j27 = o.j(G, "run_attempt_count");
            int j28 = o.j(G, "backoff_policy");
            int j29 = o.j(G, "backoff_delay_duration");
            int j30 = o.j(G, "period_start_time");
            int j31 = o.j(G, "minimum_retention_duration");
            int j32 = o.j(G, "schedule_requested_at");
            int j33 = o.j(G, "run_in_foreground");
            int j34 = o.j(G, "out_of_quota_policy");
            int i10 = j22;
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                String string = G.getString(j17);
                int i11 = j17;
                String string2 = G.getString(j19);
                int i12 = j19;
                androidx.work.d dVar = new androidx.work.d();
                int i13 = j3;
                dVar.a = o.r(G.getInt(j3));
                if (G.getInt(j10) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.f2188b = z10;
                if (G.getInt(j11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar.f2189c = z11;
                if (G.getInt(j12) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                dVar.f2190d = z12;
                if (G.getInt(j13) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                dVar.f2191e = z13;
                int i14 = j10;
                int i15 = j11;
                dVar.f2192f = G.getLong(j14);
                dVar.f2193g = G.getLong(j15);
                dVar.f2194h = o.a(G.getBlob(j16));
                j jVar = new j(string, string2);
                jVar.f25452b = o.t(G.getInt(j18));
                jVar.f25454d = G.getString(j20);
                jVar.f25455e = androidx.work.h.a(G.getBlob(j21));
                int i16 = i10;
                jVar.f25456f = androidx.work.h.a(G.getBlob(i16));
                i10 = i16;
                int i17 = j24;
                jVar.f25457g = G.getLong(i17);
                int i18 = j21;
                int i19 = j25;
                jVar.f25458h = G.getLong(i19);
                int i20 = j12;
                int i21 = j26;
                jVar.f25459i = G.getLong(i21);
                int i22 = j27;
                jVar.f25461k = G.getInt(i22);
                int i23 = j28;
                jVar.f25462l = o.q(G.getInt(i23));
                j26 = i21;
                int i24 = j29;
                jVar.f25463m = G.getLong(i24);
                int i25 = j30;
                jVar.f25464n = G.getLong(i25);
                j30 = i25;
                int i26 = j31;
                jVar.f25465o = G.getLong(i26);
                int i27 = j32;
                jVar.f25466p = G.getLong(i27);
                int i28 = j33;
                if (G.getInt(i28) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                jVar.f25467q = z14;
                int i29 = j34;
                jVar.f25468r = o.s(G.getInt(i29));
                jVar.f25460j = dVar;
                arrayList.add(jVar);
                j34 = i29;
                j10 = i14;
                j21 = i18;
                j24 = i17;
                j25 = i19;
                j27 = i22;
                j32 = i27;
                j17 = i11;
                j19 = i12;
                j3 = i13;
                j33 = i28;
                j31 = i26;
                j11 = i15;
                j29 = i24;
                j12 = i20;
                j28 = i23;
            }
            G.close();
            j0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            G.close();
            j0Var.release();
            throw th;
        }
    }

    public final y h(String str) {
        y yVar;
        j0 j3 = j0.j(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            j3.o(1);
        } else {
            j3.i(1, str);
        }
        ((f0) this.a).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((f0) this.a, j3);
        try {
            if (G.moveToFirst()) {
                yVar = o.t(G.getInt(0));
            } else {
                yVar = null;
            }
            return yVar;
        } finally {
            G.close();
            j3.release();
        }
    }

    public final ArrayList i(String str) {
        j0 j3 = j0.j(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            j3.o(1);
        } else {
            j3.i(1, str);
        }
        ((f0) this.a).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((f0) this.a, j3);
        try {
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                arrayList.add(G.getString(0));
            }
            return arrayList;
        } finally {
            G.close();
            j3.release();
        }
    }

    public final ArrayList j(String str) {
        j0 j3 = j0.j(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            j3.o(1);
        } else {
            j3.i(1, str);
        }
        ((f0) this.a).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((f0) this.a, j3);
        try {
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                arrayList.add(G.getString(0));
            }
            return arrayList;
        } finally {
            G.close();
            j3.release();
        }
    }

    public final j k(String str) {
        j0 j0Var;
        int j3;
        int j10;
        int j11;
        int j12;
        int j13;
        int j14;
        int j15;
        int j16;
        int j17;
        int j18;
        int j19;
        int j20;
        int j21;
        int j22;
        j jVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j0 j23 = j0.j(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            j23.o(1);
        } else {
            j23.i(1, str);
        }
        ((f0) this.a).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((f0) this.a, j23);
        try {
            j3 = o.j(G, "required_network_type");
            j10 = o.j(G, "requires_charging");
            j11 = o.j(G, "requires_device_idle");
            j12 = o.j(G, "requires_battery_not_low");
            j13 = o.j(G, "requires_storage_not_low");
            j14 = o.j(G, "trigger_content_update_delay");
            j15 = o.j(G, "trigger_max_content_delay");
            j16 = o.j(G, "content_uri_triggers");
            j17 = o.j(G, "id");
            j18 = o.j(G, "state");
            j19 = o.j(G, "worker_class_name");
            j20 = o.j(G, "input_merger_class_name");
            j21 = o.j(G, "input");
            j22 = o.j(G, "output");
            j0Var = j23;
        } catch (Throwable th2) {
            th = th2;
            j0Var = j23;
        }
        try {
            int j24 = o.j(G, "initial_delay");
            int j25 = o.j(G, "interval_duration");
            int j26 = o.j(G, "flex_duration");
            int j27 = o.j(G, "run_attempt_count");
            int j28 = o.j(G, "backoff_policy");
            int j29 = o.j(G, "backoff_delay_duration");
            int j30 = o.j(G, "period_start_time");
            int j31 = o.j(G, "minimum_retention_duration");
            int j32 = o.j(G, "schedule_requested_at");
            int j33 = o.j(G, "run_in_foreground");
            int j34 = o.j(G, "out_of_quota_policy");
            if (G.moveToFirst()) {
                String string = G.getString(j17);
                String string2 = G.getString(j19);
                androidx.work.d dVar = new androidx.work.d();
                dVar.a = o.r(G.getInt(j3));
                if (G.getInt(j10) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.f2188b = z10;
                if (G.getInt(j11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar.f2189c = z11;
                if (G.getInt(j12) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                dVar.f2190d = z12;
                if (G.getInt(j13) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                dVar.f2191e = z13;
                dVar.f2192f = G.getLong(j14);
                dVar.f2193g = G.getLong(j15);
                dVar.f2194h = o.a(G.getBlob(j16));
                jVar = new j(string, string2);
                jVar.f25452b = o.t(G.getInt(j18));
                jVar.f25454d = G.getString(j20);
                jVar.f25455e = androidx.work.h.a(G.getBlob(j21));
                jVar.f25456f = androidx.work.h.a(G.getBlob(j22));
                jVar.f25457g = G.getLong(j24);
                jVar.f25458h = G.getLong(j25);
                jVar.f25459i = G.getLong(j26);
                jVar.f25461k = G.getInt(j27);
                jVar.f25462l = o.q(G.getInt(j28));
                jVar.f25463m = G.getLong(j29);
                jVar.f25464n = G.getLong(j30);
                jVar.f25465o = G.getLong(j31);
                jVar.f25466p = G.getLong(j32);
                if (G.getInt(j33) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                jVar.f25467q = z14;
                jVar.f25468r = o.s(G.getInt(j34));
                jVar.f25460j = dVar;
            } else {
                jVar = null;
            }
            G.close();
            j0Var.release();
            return jVar;
        } catch (Throwable th3) {
            th = th3;
            G.close();
            j0Var.release();
            throw th;
        }
    }

    public final boolean l() {
        boolean z10 = false;
        j0 j3 = j0.j(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        ((f0) this.a).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((f0) this.a, j3);
        try {
            if (G.moveToFirst()) {
                if (G.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            G.close();
            j3.release();
        }
    }

    public final void m(String str) {
        ((f0) this.a).assertNotSuspendingTransaction();
        z1.j acquire = ((n0) this.f25473f).acquire();
        if (str == null) {
            acquire.o(1);
        } else {
            acquire.i(1, str);
        }
        ((f0) this.a).beginTransaction();
        try {
            acquire.D();
            ((f0) this.a).setTransactionSuccessful();
        } finally {
            ((f0) this.a).endTransaction();
            ((n0) this.f25473f).release(acquire);
        }
    }

    public final void n(long j3, String str) {
        ((f0) this.a).assertNotSuspendingTransaction();
        z1.j acquire = ((n0) this.f25475h).acquire();
        acquire.m(1, j3);
        if (str == null) {
            acquire.o(2);
        } else {
            acquire.i(2, str);
        }
        ((f0) this.a).beginTransaction();
        try {
            acquire.D();
            ((f0) this.a).setTransactionSuccessful();
        } finally {
            ((f0) this.a).endTransaction();
            ((n0) this.f25475h).release(acquire);
        }
    }

    public final void o(String str) {
        ((f0) this.a).assertNotSuspendingTransaction();
        z1.j acquire = ((n0) this.f25474g).acquire();
        if (str == null) {
            acquire.o(1);
        } else {
            acquire.i(1, str);
        }
        ((f0) this.a).beginTransaction();
        try {
            acquire.D();
            ((f0) this.a).setTransactionSuccessful();
        } finally {
            ((f0) this.a).endTransaction();
            ((n0) this.f25474g).release(acquire);
        }
    }

    public final void p(i7.l lVar) {
        if (lVar != null) {
            this.f25470c = lVar;
            return;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    public final void q(String str, androidx.work.h hVar) {
        ((f0) this.a).assertNotSuspendingTransaction();
        z1.j acquire = ((n0) this.f25471d).acquire();
        byte[] c10 = androidx.work.h.c(hVar);
        if (c10 == null) {
            acquire.o(1);
        } else {
            acquire.n(1, c10);
        }
        if (str == null) {
            acquire.o(2);
        } else {
            acquire.i(2, str);
        }
        ((f0) this.a).beginTransaction();
        try {
            acquire.D();
            ((f0) this.a).setTransactionSuccessful();
        } finally {
            ((f0) this.a).endTransaction();
            ((n0) this.f25471d).release(acquire);
        }
    }

    public final void r(long j3, String str) {
        ((f0) this.a).assertNotSuspendingTransaction();
        z1.j acquire = ((n0) this.f25472e).acquire();
        acquire.m(1, j3);
        if (str == null) {
            acquire.o(2);
        } else {
            acquire.i(2, str);
        }
        ((f0) this.a).beginTransaction();
        try {
            acquire.D();
            ((f0) this.a).setTransactionSuccessful();
        } finally {
            ((f0) this.a).endTransaction();
            ((n0) this.f25472e).release(acquire);
        }
    }

    public final void s(y yVar, String... strArr) {
        ((f0) this.a).assertNotSuspendingTransaction();
        StringBuilder builder = new StringBuilder();
        builder.append("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i10 = 0; i10 < length; i10++) {
            builder.append("?");
            if (i10 < length - 1) {
                builder.append(",");
            }
        }
        builder.append(")");
        z1.j compileStatement = ((f0) this.a).compileStatement(builder.toString());
        compileStatement.m(1, o.y(yVar));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.o(i11);
            } else {
                compileStatement.i(i11, str);
            }
            i11++;
        }
        ((f0) this.a).beginTransaction();
        try {
            compileStatement.D();
            ((f0) this.a).setTransactionSuccessful();
        } finally {
            ((f0) this.a).endTransaction();
        }
    }

    public final void t(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null transportName");
    }

    public l(f0 f0Var) {
        this.a = f0Var;
        this.f25469b = new b(this, f0Var, 5);
        this.f25470c = new k(f0Var, 0);
        this.f25471d = new k(f0Var, 1);
        this.f25472e = new k(f0Var, 2);
        this.f25473f = new k(f0Var, 3);
        this.f25474g = new k(f0Var, 4);
        this.f25475h = new k(f0Var, 5);
        this.f25476i = new k(f0Var, 6);
        this.f25477j = new k(f0Var, 7);
    }

    public l(va.g gVar, dc.e eVar, mc.i iVar, mc.d dVar, Context context, mc.l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = new LinkedHashSet();
        this.f25469b = new n(gVar, eVar, iVar, dVar, context, (Set) this.a, lVar, scheduledExecutorService);
        this.f25471d = gVar;
        this.f25470c = iVar;
        this.f25472e = eVar;
        this.f25473f = dVar;
        this.f25474g = context;
        this.f25475h = "firebase";
        this.f25476i = lVar;
        this.f25477j = scheduledExecutorService;
    }
}
