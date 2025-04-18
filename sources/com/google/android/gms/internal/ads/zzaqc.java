package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzaqc implements Comparable {
    private final zzaqn zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    @GuardedBy
    private final zzaqg zzf;
    private Integer zzg;
    private zzaqf zzh;

    @GuardedBy
    private boolean zzi;

    @Nullable
    private zzapl zzj;

    @GuardedBy
    private zzaqb zzk;
    private final zzapq zzl;

    public zzaqc(int i2, String str, @Nullable zzaqg zzaqgVar) {
        Uri parse;
        String host;
        this.zza = zzaqn.zza ? new zzaqn() : null;
        this.zze = new Object();
        int i3 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i2;
        this.zzc = str;
        this.zzf = zzaqgVar;
        this.zzl = new zzapq();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i3 = host.hashCode();
        }
        this.zzd = i3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaqc) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzapl zzd() {
        return this.zzj;
    }

    public final zzaqc zze(zzapl zzaplVar) {
        this.zzj = zzaplVar;
        return this;
    }

    public final zzaqc zzf(zzaqf zzaqfVar) {
        this.zzh = zzaqfVar;
        return this;
    }

    public final zzaqc zzg(int i2) {
        this.zzg = Integer.valueOf(i2);
        return this;
    }

    public abstract zzaqi zzh(zzapy zzapyVar);

    public final String zzj() {
        int i2 = this.zzb;
        String str = this.zzc;
        return i2 != 0 ? androidx.compose.foundation.text.input.a.k(Integer.toString(1), "-", str) : str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzapk {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzaqn.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzaql zzaqlVar) {
        zzaqg zzaqgVar;
        synchronized (this.zze) {
            zzaqgVar = this.zzf;
        }
        zzaqgVar.zza(zzaqlVar);
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzaqf zzaqfVar = this.zzh;
        if (zzaqfVar != null) {
            zzaqfVar.zzb(this);
        }
        if (zzaqn.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaqa(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        zzaqb zzaqbVar;
        synchronized (this.zze) {
            zzaqbVar = this.zzk;
        }
        if (zzaqbVar != null) {
            zzaqbVar.zza(this);
        }
    }

    public final void zzs(zzaqi zzaqiVar) {
        zzaqb zzaqbVar;
        synchronized (this.zze) {
            zzaqbVar = this.zzk;
        }
        if (zzaqbVar != null) {
            zzaqbVar.zzb(this, zzaqiVar);
        }
    }

    public final void zzt(int i2) {
        zzaqf zzaqfVar = this.zzh;
        if (zzaqfVar != null) {
            zzaqfVar.zzc(this, i2);
        }
    }

    public final void zzu(zzaqb zzaqbVar) {
        synchronized (this.zze) {
            this.zzk = zzaqbVar;
        }
    }

    public final boolean zzv() {
        boolean z2;
        synchronized (this.zze) {
            z2 = this.zzi;
        }
        return z2;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzapk {
        return null;
    }

    public final zzapq zzy() {
        return this.zzl;
    }
}
