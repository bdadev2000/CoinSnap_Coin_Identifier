package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class zzcey implements zzhb {
    private final Context zza;
    private final zzhb zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbcy zzi;
    private zzhh zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue();

    public zzcey(Context context, zzhb zzhbVar, String str, int i9, zzie zzieVar, zzcex zzcexVar) {
        this.zza = context;
        this.zzb = zzhbVar;
        this.zzc = str;
        this.zzd = i9;
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzer)).booleanValue() && !this.zzj) {
            return true;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzes)).booleanValue() || this.zzk) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws IOException {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                return inputStream.read(bArr, i9, i10);
            }
            return this.zzb.zza(bArr, i9, i10);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws IOException {
        Long l;
        if (!this.zzg) {
            this.zzg = true;
            Uri uri = zzhhVar.zza;
            this.zzh = uri;
            this.zzm = zzhhVar;
            this.zzi = zzbcy.zza(uri);
            zzbcv zzbcvVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeo)).booleanValue()) {
                if (this.zzi != null) {
                    this.zzi.zzh = zzhhVar.zze;
                    this.zzi.zzi = zzfyv.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    if (this.zzi.zzg) {
                        l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeq);
                    } else {
                        l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzep);
                    }
                    long longValue = l.longValue();
                    com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                    com.google.android.gms.ads.internal.zzu.zzd();
                    Future zza = zzbdj.zza(this.zza, this.zzi);
                    try {
                        try {
                            zzbdk zzbdkVar = (zzbdk) zza.get(longValue, TimeUnit.MILLISECONDS);
                            zzbdkVar.zzd();
                            this.zzj = zzbdkVar.zzf();
                            this.zzk = zzbdkVar.zze();
                            zzbdkVar.zza();
                            if (!zzg()) {
                                this.zzf = zzbdkVar.zzc();
                            }
                        } catch (InterruptedException unused) {
                            zza.cancel(false);
                            Thread.currentThread().interrupt();
                        } catch (ExecutionException | TimeoutException unused2) {
                            zza.cancel(false);
                        }
                    } catch (Throwable unused3) {
                    }
                    com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                    throw null;
                }
            } else {
                if (this.zzi != null) {
                    this.zzi.zzh = zzhhVar.zze;
                    this.zzi.zzi = zzfyv.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    zzbcvVar = com.google.android.gms.ads.internal.zzu.zzc().zzb(this.zzi);
                }
                if (zzbcvVar != null && zzbcvVar.zze()) {
                    this.zzj = zzbcvVar.zzg();
                    this.zzk = zzbcvVar.zzf();
                    if (!zzg()) {
                        this.zzf = zzbcvVar.zzc();
                        return -1L;
                    }
                }
            }
            if (this.zzi != null) {
                zzhf zza2 = zzhhVar.zza();
                zza2.zzd(Uri.parse(this.zzi.zza));
                this.zzm = zza2.zze();
            }
            return this.zzb.zzb(this.zzm);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        if (this.zzg) {
            this.zzg = false;
            this.zzh = null;
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
                this.zzf = null;
                return;
            } else {
                this.zzb.zzd();
                return;
            }
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzf(zzie zzieVar) {
    }
}
