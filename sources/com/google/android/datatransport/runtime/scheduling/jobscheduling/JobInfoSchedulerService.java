package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C.c;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.k;
import k3.j;
import k3.s;
import q3.e;
import q3.h;
import u3.AbstractC2753a;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int b = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i9 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        c a6 = j.a();
        a6.A(string);
        a6.f349f = AbstractC2753a.b(i9);
        if (string2 != null) {
            a6.f348d = Base64.decode(string2, 0);
        }
        h hVar = s.a().f21453d;
        j l = a6.l();
        k kVar = new k(21, this, jobParameters);
        hVar.getClass();
        hVar.f22770e.execute(new e(hVar, l, i10, kVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
