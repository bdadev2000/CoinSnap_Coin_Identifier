package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzare implements Comparable {
    private final zzarp zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    private final zzari zzf;
    private Integer zzg;
    private zzarh zzh;
    private boolean zzi;

    @Nullable
    private zzaqn zzj;
    private zzard zzk;
    private final zzaqs zzl;

    public zzare(int i9, String str, @Nullable zzari zzariVar) {
        zzarp zzarpVar;
        Uri parse;
        String host;
        if (zzarp.zza) {
            zzarpVar = new zzarp();
        } else {
            zzarpVar = null;
        }
        this.zza = zzarpVar;
        this.zze = new Object();
        int i10 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i9;
        this.zzc = str;
        this.zzf = zzariVar;
        this.zzl = new zzaqs();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i10 = host.hashCode();
        }
        this.zzd = i10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzare) obj).zzg.intValue();
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
    public final zzaqn zzd() {
        return this.zzj;
    }

    public final zzare zze(zzaqn zzaqnVar) {
        this.zzj = zzaqnVar;
        return this;
    }

    public final zzare zzf(zzarh zzarhVar) {
        this.zzh = zzarhVar;
        return this;
    }

    public final zzare zzg(int i9) {
        this.zzg = Integer.valueOf(i9);
        return this;
    }

    public abstract zzark zzh(zzara zzaraVar);

    public final String zzj() {
        int i9 = this.zzb;
        String str = this.zzc;
        if (i9 != 0) {
            return o.k(Integer.toString(1), "-", str);
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaqm {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzarp.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzarn zzarnVar) {
        zzari zzariVar;
        synchronized (this.zze) {
            zzariVar = this.zzf;
        }
        zzariVar.zza(zzarnVar);
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzarh zzarhVar = this.zzh;
        if (zzarhVar != null) {
            zzarhVar.zzb(this);
        }
        if (zzarp.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzarc(this, str, id));
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
        zzard zzardVar;
        synchronized (this.zze) {
            zzardVar = this.zzk;
        }
        if (zzardVar != null) {
            zzardVar.zza(this);
        }
    }

    public final void zzs(zzark zzarkVar) {
        zzard zzardVar;
        synchronized (this.zze) {
            zzardVar = this.zzk;
        }
        if (zzardVar != null) {
            zzardVar.zzb(this, zzarkVar);
        }
    }

    public final void zzt(int i9) {
        zzarh zzarhVar = this.zzh;
        if (zzarhVar != null) {
            zzarhVar.zzc(this, i9);
        }
    }

    public final void zzu(zzard zzardVar) {
        synchronized (this.zze) {
            this.zzk = zzardVar;
        }
    }

    public final boolean zzv() {
        boolean z8;
        synchronized (this.zze) {
            z8 = this.zzi;
        }
        return z8;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaqm {
        return null;
    }

    public final zzaqs zzy() {
        return this.zzl;
    }
}
