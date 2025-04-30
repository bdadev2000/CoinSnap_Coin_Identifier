package androidx.work.impl.workers;

import C.c;
import D0.j;
import D0.m;
import E1.d;
import Q7.n0;
import V0.k;
import a7.b;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.n;
import androidx.work.o;
import com.facebook.appevents.i;
import d1.C2163d;
import d1.C2168i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import w4.v0;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String b = o.g("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String b(b bVar, d dVar, c cVar, ArrayList arrayList) {
        Integer num;
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2168i c2168i = (C2168i) it.next();
            C2163d s5 = cVar.s(c2168i.f19801a);
            if (s5 != null) {
                num = Integer.valueOf(s5.b);
            } else {
                num = null;
            }
            String str2 = c2168i.f19801a;
            bVar.getClass();
            m c9 = m.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                c9.i(1);
            } else {
                c9.j(1, str2);
            }
            j jVar = (j) bVar.f4077c;
            jVar.b();
            Cursor g9 = jVar.g(c9);
            try {
                ArrayList arrayList2 = new ArrayList(g9.getCount());
                while (g9.moveToNext()) {
                    arrayList2.add(g9.getString(0));
                }
                g9.close();
                c9.release();
                ArrayList r9 = dVar.r(c2168i.f19801a);
                String join = TextUtils.join(",", arrayList2);
                String join2 = TextUtils.join(",", r9);
                String str3 = c2168i.f19801a;
                String str4 = c2168i.f19802c;
                switch (c2168i.b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder o3 = com.mbridge.msdk.foundation.entity.o.o("\n", str3, "\t ", str4, "\t ");
                o3.append(num);
                o3.append("\t ");
                o3.append(str);
                o3.append("\t ");
                sb.append(n0.m(o3, join, "\t ", join2, "\t"));
            } catch (Throwable th) {
                g9.close();
                c9.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final n doWork() {
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
        ArrayList arrayList;
        c cVar;
        b bVar;
        d dVar;
        int i9;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        WorkDatabase workDatabase = k.v(getApplicationContext()).f3418c;
        B4.c n2 = workDatabase.n();
        b l = workDatabase.l();
        d o3 = workDatabase.o();
        c k6 = workDatabase.k();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        n2.getClass();
        m c9 = m.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        c9.h(1, currentTimeMillis);
        j jVar = (j) n2.f316a;
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
            int i10 = f22;
            ArrayList arrayList2 = new ArrayList(g9.getCount());
            while (true) {
                arrayList = arrayList2;
                if (!g9.moveToNext()) {
                    break;
                }
                String string = g9.getString(f17);
                String string2 = g9.getString(f19);
                int i11 = f19;
                androidx.work.c cVar2 = new androidx.work.c();
                int i12 = f9;
                cVar2.f5203a = v0.p(g9.getInt(f9));
                if (g9.getInt(f10) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                cVar2.b = z8;
                if (g9.getInt(f11) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                cVar2.f5204c = z9;
                if (g9.getInt(f12) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar2.f5205d = z10;
                if (g9.getInt(f13) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cVar2.f5206e = z11;
                int i13 = f10;
                int i14 = f11;
                cVar2.f5207f = g9.getLong(f14);
                cVar2.f5208g = g9.getLong(f15);
                cVar2.f5209h = v0.e(g9.getBlob(f16));
                C2168i c2168i = new C2168i(string, string2);
                c2168i.b = v0.r(g9.getInt(f18));
                c2168i.f19803d = g9.getString(f20);
                c2168i.f19804e = g.a(g9.getBlob(f21));
                int i15 = i10;
                c2168i.f19805f = g.a(g9.getBlob(i15));
                i10 = i15;
                int i16 = f20;
                int i17 = f23;
                c2168i.f19806g = g9.getLong(i17);
                int i18 = f21;
                int i19 = f24;
                c2168i.f19807h = g9.getLong(i19);
                int i20 = f25;
                c2168i.f19808i = g9.getLong(i20);
                int i21 = f26;
                c2168i.f19810k = g9.getInt(i21);
                int i22 = f27;
                c2168i.l = v0.o(g9.getInt(i22));
                f25 = i20;
                int i23 = f28;
                c2168i.m = g9.getLong(i23);
                int i24 = f29;
                c2168i.f19811n = g9.getLong(i24);
                f29 = i24;
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
                c2168i.f19809j = cVar2;
                arrayList.add(c2168i);
                f33 = i28;
                f21 = i18;
                f23 = i17;
                f24 = i19;
                f10 = i13;
                f27 = i22;
                f26 = i21;
                f31 = i26;
                f32 = i27;
                f30 = i25;
                f28 = i23;
                f20 = i16;
                f11 = i14;
                f9 = i12;
                arrayList2 = arrayList;
                f19 = i11;
            }
            g9.close();
            mVar.release();
            ArrayList d2 = n2.d();
            ArrayList a6 = n2.a();
            boolean isEmpty = arrayList.isEmpty();
            String str = b;
            if (!isEmpty) {
                i9 = 0;
                o.e().f(str, "Recently completed work:\n\n", new Throwable[0]);
                cVar = k6;
                bVar = l;
                dVar = o3;
                o.e().f(str, b(bVar, dVar, cVar, arrayList), new Throwable[0]);
            } else {
                cVar = k6;
                bVar = l;
                dVar = o3;
                i9 = 0;
            }
            if (!d2.isEmpty()) {
                o.e().f(str, "Running work:\n\n", new Throwable[i9]);
                o.e().f(str, b(bVar, dVar, cVar, d2), new Throwable[i9]);
            }
            if (!a6.isEmpty()) {
                o.e().f(str, "Enqueued work:\n\n", new Throwable[i9]);
                o.e().f(str, b(bVar, dVar, cVar, a6), new Throwable[i9]);
            }
            return new androidx.work.m(g.f5213c);
        } catch (Throwable th2) {
            th = th2;
            g9.close();
            mVar.release();
            throw th;
        }
    }
}
