package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcan {
    public static final zzgfz zza;
    public static final zzgfz zzb;
    public static final zzgfz zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgfz zze;
    public static final zzgfz zzf;

    static {
        Executor threadPoolExecutor;
        Executor executor;
        Executor executor2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfum.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcaj("Default")));
        } else {
            zzbcm zzbcmVar = zzbcv.zzkT;
            if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcmVar) != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcmVar)).booleanValue()) {
                zzbcm zzbcmVar2 = zzbcv.zzkU;
                if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcmVar2) != null) {
                    zzbcm zzbcmVar3 = zzbcv.zzkV;
                    if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcmVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcmVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcmVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaj("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbcmVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, Api.BaseClientBuilder.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcaj("Default"));
        }
        zzcal zzcalVar = null;
        zza = new zzcam(threadPoolExecutor, zzcalVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor = zzfum.zza().zzc(5, new zzcaj("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaj("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor = threadPoolExecutor3;
        }
        zzb = new zzcam(executor, zzcalVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor2 = zzfum.zza().zzb(new zzcaj("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaj("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor4;
        }
        zzc = new zzcam(executor2, zzcalVar);
        zzd = new zzcai(3, new zzcaj(AppEventsConstants.EVENT_NAME_SCHEDULE));
        zze = new zzcam(new zzcak(), zzcalVar);
        zzf = new zzcam(zzggf.zzb(), zzcalVar);
    }
}
