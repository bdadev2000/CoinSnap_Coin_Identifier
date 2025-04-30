package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class zzcbr {
    private final Clock zza;
    private final zzccc zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList zzc = new LinkedList();

    public zzcbr(Clock clock, zzccc zzcccVar, String str, String str2) {
        this.zza = clock;
        this.zzb = zzcccVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final Bundle zza() {
        Bundle bundle;
        synchronized (this.zzd) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.zze);
                bundle.putString("slotid", this.zzf);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.zzj);
                bundle.putLong("tresponse", this.zzk);
                bundle.putLong("timp", this.zzg);
                bundle.putLong("tload", this.zzh);
                bundle.putLong("pcc", this.zzi);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzcbq) it.next()).zzb());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String zzc() {
        return this.zze;
    }

    public final void zzd() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    zzcbq zzcbqVar = new zzcbq(this);
                    zzcbqVar.zzd();
                    this.zzc.add(zzcbqVar);
                    this.zzi++;
                    this.zzb.zzf();
                    this.zzb.zze(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1 && !this.zzc.isEmpty()) {
                    zzcbq zzcbqVar = (zzcbq) this.zzc.getLast();
                    if (zzcbqVar.zza() == -1) {
                        zzcbqVar.zzc();
                        this.zzb.zze(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1 && this.zzg == -1) {
                    this.zzg = this.zza.elapsedRealtime();
                    this.zzb.zze(this);
                }
                this.zzb.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzh(boolean z8) {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    this.zzh = this.zza.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zzb.zzi();
        }
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        synchronized (this.zzd) {
            long elapsedRealtime = this.zza.elapsedRealtime();
            this.zzj = elapsedRealtime;
            this.zzb.zzj(zzlVar, elapsedRealtime);
        }
    }

    public final void zzk(long j7) {
        synchronized (this.zzd) {
            try {
                this.zzk = j7;
                if (j7 != -1) {
                    this.zzb.zze(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
