package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class zzcef extends zzfw {
    private final Context zza;
    private final zzgd zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbax zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private ua.b zzo;
    private final AtomicLong zzp;
    private final zzceq zzq;

    public zzcef(Context context, zzgd zzgdVar, String str, int i10, zzhd zzhdVar, zzceq zzceqVar) {
        super(false);
        this.zza = context;
        this.zzb = zzgdVar;
        this.zzq = zzceqVar;
        this.zzc = str;
        this.zzd = i10;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue();
        zzf(zzhdVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzes)).booleanValue() && !this.zzl) {
            return true;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzet)).booleanValue() || this.zzm) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int zza;
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                zza = inputStream.read(bArr, i10, i11);
            } else {
                zza = this.zzb.zza(bArr, i10, i11);
            }
            if (!this.zze || this.zzf != null) {
                zzg(zza);
            }
            return zza;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgi r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcef.zzb(com.google.android.gms.internal.ads.zzgi):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws IOException {
        if (this.zzg) {
            boolean z10 = false;
            this.zzg = false;
            this.zzh = null;
            if (!this.zze || this.zzf != null) {
                z10 = true;
            }
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
                this.zzf = null;
            } else {
                this.zzb.zzd();
            }
            if (z10) {
                zzh();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi != null) {
            if (this.zzp.get() != -1) {
                return this.zzp.get();
            }
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = zzcaj.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcee
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzcef.this.zzm();
                        }
                    });
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long zzm() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzv.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
