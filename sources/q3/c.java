package q3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import r3.C2666i;
import r3.InterfaceC2661d;
import u3.AbstractC2753a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22755a;
    public final InterfaceC2661d b;

    /* renamed from: c, reason: collision with root package name */
    public final C2641a f22756c;

    public c(Context context, InterfaceC2661d interfaceC2661d, C2641a c2641a) {
        this.f22755a = context;
        this.b = interfaceC2661d;
        this.f22756c = c2641a;
    }

    public final void a(k3.j jVar, int i9, boolean z8) {
        Long l;
        Context context = this.f22755a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(jVar.f21433a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        h3.d dVar = jVar.f21434c;
        adler32.update(allocate.putInt(AbstractC2753a.a(dVar)).array());
        byte[] bArr = jVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z8) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i9) {
                        android.support.v4.media.session.a.m("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a6 = ((C2666i) this.b).a();
        String valueOf = String.valueOf(AbstractC2753a.a(dVar));
        String str = jVar.f21433a;
        Cursor rawQuery = a6.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C2641a c2641a = this.f22756c;
            builder.setMinimumLatency(c2641a.a(dVar, longValue, i9));
            Set set = ((b) c2641a.b.get(dVar)).f22754c;
            if (set.contains(d.b)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(d.f22758d)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(d.f22757c)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i9);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC2753a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(c2641a.a(dVar, longValue, i9)), l, Integer.valueOf(i9)};
            String s5 = android.support.v4.media.session.a.s("JobInfoScheduler");
            if (Log.isLoggable(s5, 3)) {
                Log.d(s5, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
