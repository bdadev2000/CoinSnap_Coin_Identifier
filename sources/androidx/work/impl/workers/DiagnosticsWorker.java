package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.n;
import androidx.work.o;
import androidx.work.p;
import com.facebook.internal.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import m2.k;
import u2.c;
import u2.e;
import u2.j;
import u2.l;
import v1.f0;
import v1.j0;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2225b = p.g("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(c cVar, c cVar2, h.c cVar3, ArrayList arrayList) {
        Integer num;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            e y4 = cVar3.y(jVar.a);
            if (y4 != null) {
                num = Integer.valueOf(y4.f25447b);
            } else {
                num = null;
            }
            String str = jVar.a;
            cVar.getClass();
            j0 j3 = j0.j(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                j3.o(1);
            } else {
                j3.i(1, str);
            }
            f0 f0Var = cVar.a;
            f0Var.assertNotSuspendingTransaction();
            Cursor G = i.G(f0Var, j3);
            try {
                ArrayList arrayList2 = new ArrayList(G.getCount());
                while (G.moveToNext()) {
                    arrayList2.add(G.getString(0));
                }
                G.close();
                j3.release();
                sb2.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", jVar.a, jVar.f25453c, num, jVar.f25452b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", cVar2.c(jVar.a))));
            } catch (Throwable th2) {
                G.close();
                j3.release();
                throw th2;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final o doWork() {
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
        ArrayList arrayList;
        h.c cVar;
        c cVar2;
        c cVar3;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        WorkDatabase workDatabase = k.v(getApplicationContext()).f21460k;
        l h10 = workDatabase.h();
        c f10 = workDatabase.f();
        c i11 = workDatabase.i();
        h.c e2 = workDatabase.e();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        h10.getClass();
        j0 j23 = j0.j(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        j23.m(1, currentTimeMillis);
        ((f0) h10.a).assertNotSuspendingTransaction();
        Cursor G = i.G((f0) h10.a, j23);
        try {
            j3 = com.facebook.appevents.o.j(G, "required_network_type");
            j10 = com.facebook.appevents.o.j(G, "requires_charging");
            j11 = com.facebook.appevents.o.j(G, "requires_device_idle");
            j12 = com.facebook.appevents.o.j(G, "requires_battery_not_low");
            j13 = com.facebook.appevents.o.j(G, "requires_storage_not_low");
            j14 = com.facebook.appevents.o.j(G, "trigger_content_update_delay");
            j15 = com.facebook.appevents.o.j(G, "trigger_max_content_delay");
            j16 = com.facebook.appevents.o.j(G, "content_uri_triggers");
            j17 = com.facebook.appevents.o.j(G, "id");
            j18 = com.facebook.appevents.o.j(G, "state");
            j19 = com.facebook.appevents.o.j(G, "worker_class_name");
            j20 = com.facebook.appevents.o.j(G, "input_merger_class_name");
            j21 = com.facebook.appevents.o.j(G, "input");
            j22 = com.facebook.appevents.o.j(G, "output");
            j0Var = j23;
        } catch (Throwable th2) {
            th = th2;
            j0Var = j23;
        }
        try {
            int j24 = com.facebook.appevents.o.j(G, "initial_delay");
            int j25 = com.facebook.appevents.o.j(G, "interval_duration");
            int j26 = com.facebook.appevents.o.j(G, "flex_duration");
            int j27 = com.facebook.appevents.o.j(G, "run_attempt_count");
            int j28 = com.facebook.appevents.o.j(G, "backoff_policy");
            int j29 = com.facebook.appevents.o.j(G, "backoff_delay_duration");
            int j30 = com.facebook.appevents.o.j(G, "period_start_time");
            int j31 = com.facebook.appevents.o.j(G, "minimum_retention_duration");
            int j32 = com.facebook.appevents.o.j(G, "schedule_requested_at");
            int j33 = com.facebook.appevents.o.j(G, "run_in_foreground");
            int j34 = com.facebook.appevents.o.j(G, "out_of_quota_policy");
            int i12 = j22;
            ArrayList arrayList2 = new ArrayList(G.getCount());
            while (true) {
                arrayList = arrayList2;
                if (!G.moveToNext()) {
                    break;
                }
                String string = G.getString(j17);
                String string2 = G.getString(j19);
                int i13 = j19;
                d dVar = new d();
                int i14 = j3;
                dVar.a = com.facebook.appevents.o.r(G.getInt(j3));
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
                dVar.f2194h = com.facebook.appevents.o.a(G.getBlob(j16));
                j jVar = new j(string, string2);
                jVar.f25452b = com.facebook.appevents.o.t(G.getInt(j18));
                jVar.f25454d = G.getString(j20);
                jVar.f25455e = h.a(G.getBlob(j21));
                int i17 = i12;
                jVar.f25456f = h.a(G.getBlob(i17));
                i12 = i17;
                int i18 = j20;
                int i19 = j24;
                jVar.f25457g = G.getLong(i19);
                int i20 = j21;
                int i21 = j25;
                jVar.f25458h = G.getLong(i21);
                int i22 = j18;
                int i23 = j26;
                jVar.f25459i = G.getLong(i23);
                int i24 = j27;
                jVar.f25461k = G.getInt(i24);
                int i25 = j28;
                jVar.f25462l = com.facebook.appevents.o.q(G.getInt(i25));
                j26 = i23;
                int i26 = j29;
                jVar.f25463m = G.getLong(i26);
                int i27 = j30;
                jVar.f25464n = G.getLong(i27);
                j30 = i27;
                int i28 = j31;
                jVar.f25465o = G.getLong(i28);
                int i29 = j32;
                jVar.f25466p = G.getLong(i29);
                int i30 = j33;
                if (G.getInt(i30) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                jVar.f25467q = z14;
                int i31 = j34;
                jVar.f25468r = com.facebook.appevents.o.s(G.getInt(i31));
                jVar.f25460j = dVar;
                arrayList.add(jVar);
                j34 = i31;
                j21 = i20;
                j10 = i15;
                j25 = i21;
                j27 = i24;
                j32 = i29;
                j33 = i30;
                j31 = i28;
                j24 = i19;
                j20 = i18;
                j11 = i16;
                j3 = i14;
                arrayList2 = arrayList;
                j19 = i13;
                j29 = i26;
                j18 = i22;
                j28 = i25;
            }
            G.close();
            j0Var.release();
            ArrayList f11 = h10.f();
            ArrayList c10 = h10.c();
            boolean isEmpty = arrayList.isEmpty();
            String str = f2225b;
            if (!isEmpty) {
                i10 = 0;
                p.e().f(str, "Recently completed work:\n\n", new Throwable[0]);
                cVar = e2;
                cVar2 = f10;
                cVar3 = i11;
                p.e().f(str, a(cVar2, cVar3, cVar, arrayList), new Throwable[0]);
            } else {
                cVar = e2;
                cVar2 = f10;
                cVar3 = i11;
                i10 = 0;
            }
            if (!f11.isEmpty()) {
                p.e().f(str, "Running work:\n\n", new Throwable[i10]);
                p.e().f(str, a(cVar2, cVar3, cVar, f11), new Throwable[i10]);
            }
            if (!c10.isEmpty()) {
                p.e().f(str, "Enqueued work:\n\n", new Throwable[i10]);
                p.e().f(str, a(cVar2, cVar3, cVar, c10), new Throwable[i10]);
            }
            return new n(h.f2197c);
        } catch (Throwable th3) {
            th = th3;
            G.close();
            j0Var.release();
            throw th;
        }
    }
}
