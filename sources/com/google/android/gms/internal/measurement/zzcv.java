package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class zzcv {

    @Nullable
    private static final Method zza = zzc();

    @Nullable
    private static final Method zzb = zzb();
    private final JobScheduler zzc;

    private zzcv(JobScheduler jobScheduler) {
        this.zzc = jobScheduler;
    }

    private static int zza() {
        Method method = zzb;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e2);
                }
            }
        }
        return 0;
    }

    @Nullable
    private static Method zzb() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
                return null;
            }
            return null;
        }
    }

    @Nullable
    private static Method zzc() {
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                return null;
            }
            return null;
        }
    }

    private final int zza(JobInfo jobInfo, String str, int i10, String str2) {
        Method method = zza;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.zzc, jobInfo, str, Integer.valueOf(i10), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.e(str2, "error calling scheduleAsPackage", e2);
            }
        }
        return this.zzc.schedule(jobInfo);
    }

    public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (zza != null && context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            return new zzcv(jobScheduler).zza(jobInfo, str, zza(), str2);
        }
        return jobScheduler.schedule(jobInfo);
    }
}
