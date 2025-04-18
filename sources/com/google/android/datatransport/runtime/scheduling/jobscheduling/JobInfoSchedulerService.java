package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.facebook.r0;
import h.c;
import i7.i;
import i7.r;
import n7.e;
import r7.a;

@RequiresApi(api = 21)
/* loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11487b = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        r.b(getApplicationContext());
        c a = i.a();
        a.G(string);
        a.I(a.b(i10));
        if (string2 != null) {
            a.f18524d = Base64.decode(string2, 0);
        }
        n7.i iVar = r.a().f19196d;
        i o10 = a.o();
        r0 r0Var = new r0(12, this, jobParameters);
        iVar.getClass();
        iVar.f22489e.execute(new e(iVar, o10, i11, r0Var));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
