package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcaj {
    public static final zzges zza;
    public static final zzges zzb;
    public static final zzges zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzges zze;
    public static final zzges zzf;

    static {
        Executor threadPoolExecutor;
        Executor executor;
        Executor executor2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzftc.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcaf("Default")));
        } else {
            zzbce zzbceVar = zzbcn.zzkU;
            if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbceVar) != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbceVar)).booleanValue()) {
                zzbce zzbceVar2 = zzbcn.zzkV;
                if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbceVar2) != null) {
                    zzbce zzbceVar3 = zzbcn.zzkW;
                    if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbceVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbceVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbceVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaf("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbceVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcaf("Default"));
        }
        zzcai zzcaiVar = null;
        zza = new zzcah(threadPoolExecutor, zzcaiVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor = zzftc.zza().zzc(5, new zzcaf("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaf("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor = threadPoolExecutor3;
        }
        zzb = new zzcah(executor, zzcaiVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor2 = zzftc.zza().zzb(new zzcaf("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaf("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor4;
        }
        zzc = new zzcah(executor2, zzcaiVar);
        zzd = new zzcae(3, new zzcaf("Schedule"));
        zze = new zzcah(new zzcag(), zzcaiVar);
        zzf = new zzcah(zzgey.zzb(), zzcaiVar);
    }
}
