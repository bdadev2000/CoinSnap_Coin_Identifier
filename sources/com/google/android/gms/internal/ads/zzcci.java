package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcci {
    public static final zzgge zza;
    public static final zzgge zzb;
    public static final zzgge zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgge zze;
    public static final zzgge zzf;

    static {
        Executor threadPoolExecutor;
        Executor executor;
        Executor executor2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfuu.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcce("Default")));
        } else {
            zzbeg zzbegVar = zzbep.zzlm;
            if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbegVar) != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbegVar)).booleanValue()) {
                zzbeg zzbegVar2 = zzbep.zzln;
                if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbegVar2) != null) {
                    zzbeg zzbegVar3 = zzbep.zzlo;
                    if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbegVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbegVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbegVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcce("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbegVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcce("Default"));
        }
        zzccg zzccgVar = null;
        zza = new zzcch(threadPoolExecutor, zzccgVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor = zzfuu.zza().zzc(5, new zzcce("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcce("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor = threadPoolExecutor3;
        }
        zzb = new zzcch(executor, zzccgVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor2 = zzfuu.zza().zzb(new zzcce("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcce("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor4;
        }
        zzc = new zzcch(executor2, zzccgVar);
        zzd = new zzccd(3, new zzcce("Schedule"));
        zze = new zzcch(new zzccf(), zzccgVar);
        zzf = new zzcch(zzggk.zzb(), zzccgVar);
    }
}
