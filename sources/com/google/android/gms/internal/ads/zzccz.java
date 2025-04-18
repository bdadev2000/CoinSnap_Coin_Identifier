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

/* loaded from: classes3.dex */
public final class zzccz implements zzgd {
    private final Context zza;
    private final zzgd zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbax zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzgi zzl;

    public zzccz(Context context, zzgd zzgdVar, String str, int i10, zzhd zzhdVar, zzccy zzccyVar) {
        this.zza = context;
        this.zzb = zzgdVar;
        this.zzc = str;
        this.zzd = i10;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue();
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzes)).booleanValue() && !this.zzj) {
            return true;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzet)).booleanValue() || this.zzk) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                return inputStream.read(bArr, i10, i11);
            }
            return this.zzb.zza(bArr, i10, i11);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        Long l10;
        if (!this.zzg) {
            this.zzg = true;
            Uri uri = zzgiVar.zza;
            this.zzh = uri;
            this.zzl = zzgiVar;
            this.zzi = zzbax.zza(uri);
            zzbau zzbauVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzep)).booleanValue()) {
                if (this.zzi != null) {
                    this.zzi.zzh = zzgiVar.zze;
                    this.zzi.zzi = zzfxf.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    if (this.zzi.zzg) {
                        l10 = (Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzer);
                    } else {
                        l10 = (Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeq);
                    }
                    long longValue = l10.longValue();
                    com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                    com.google.android.gms.ads.internal.zzv.zzd();
                    Future zza = zzbbi.zza(this.zza, this.zzi);
                    try {
                        try {
                            zzbbj zzbbjVar = (zzbbj) zza.get(longValue, TimeUnit.MILLISECONDS);
                            zzbbjVar.zzd();
                            this.zzj = zzbbjVar.zzf();
                            this.zzk = zzbbjVar.zze();
                            zzbbjVar.zza();
                            if (!zzg()) {
                                this.zzf = zzbbjVar.zzc();
                            }
                        } catch (InterruptedException unused) {
                            zza.cancel(false);
                            Thread.currentThread().interrupt();
                        } catch (ExecutionException | TimeoutException unused2) {
                            zza.cancel(false);
                        }
                    } catch (Throwable unused3) {
                    }
                    com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                    throw null;
                }
            } else {
                if (this.zzi != null) {
                    this.zzi.zzh = zzgiVar.zze;
                    this.zzi.zzi = zzfxf.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    zzbauVar = com.google.android.gms.ads.internal.zzv.zzc().zzb(this.zzi);
                }
                if (zzbauVar != null && zzbauVar.zze()) {
                    this.zzj = zzbauVar.zzg();
                    this.zzk = zzbauVar.zzf();
                    if (!zzg()) {
                        this.zzf = zzbauVar.zzc();
                        return -1L;
                    }
                }
            }
            if (this.zzi != null) {
                zzgg zza2 = zzgiVar.zza();
                zza2.zzd(Uri.parse(this.zzi.zza));
                this.zzl = zza2.zze();
            }
            return this.zzb.zzb(this.zzl);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
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

    @Override // com.google.android.gms.internal.ads.zzgd
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
    }
}
