package n7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.facebook.appevents.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes3.dex */
public final class c implements l {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final o7.d f22464b;

    /* renamed from: c, reason: collision with root package name */
    public final a f22465c;

    public c(Context context, o7.d dVar, a aVar) {
        this.a = context;
        this.f22464b = dVar;
        this.f22465c = aVar;
    }

    public final void a(i7.i iVar, int i10, boolean z10) {
        boolean z11;
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        f7.d dVar = iVar.f19179c;
        adler32.update(allocate.putInt(r7.a.a(dVar)).array());
        byte[] bArr = iVar.f19178b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
                com.bumptech.glide.c.q("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                return;
            }
        }
        SQLiteDatabase d10 = ((o7.j) this.f22464b).d();
        String str = iVar.a;
        long longValue = ((Long) o7.j.s(d10.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(r7.a.a(dVar))}), new m(11))).longValue();
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        a aVar = this.f22465c;
        builder.setMinimumLatency(aVar.a(dVar, longValue, i10));
        Set set = ((b) aVar.f22461b.get(dVar)).f22463c;
        if (set.contains(d.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(d.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(d.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", str);
        persistableBundle.putInt("priority", r7.a.a(dVar));
        if (bArr != null) {
            persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, longValue, i10)), Long.valueOf(longValue), Integer.valueOf(i10)};
        String C = com.bumptech.glide.c.C("JobInfoScheduler");
        if (Log.isLoggable(C, 3)) {
            Log.d(C, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
