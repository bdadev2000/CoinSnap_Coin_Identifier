package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzapp implements Comparable {
    private final zzaqa zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    private final zzapt zzf;
    private Integer zzg;
    private zzaps zzh;
    private boolean zzi;

    @Nullable
    private zzaoy zzj;
    private zzapo zzk;
    private final zzapd zzl;

    public zzapp(int i10, String str, @Nullable zzapt zzaptVar) {
        zzaqa zzaqaVar;
        Uri parse;
        String host;
        if (zzaqa.zza) {
            zzaqaVar = new zzaqa();
        } else {
            zzaqaVar = null;
        }
        this.zza = zzaqaVar;
        this.zze = new Object();
        int i11 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzaptVar;
        this.zzl = new zzapd();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i11 = host.hashCode();
        }
        this.zzd = i11;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzapp) obj).zzg.intValue();
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
    public final zzaoy zzd() {
        return this.zzj;
    }

    public final zzapp zze(zzaoy zzaoyVar) {
        this.zzj = zzaoyVar;
        return this;
    }

    public final zzapp zzf(zzaps zzapsVar) {
        this.zzh = zzapsVar;
        return this;
    }

    public final zzapp zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    public abstract zzapv zzh(zzapl zzaplVar);

    public final String zzj() {
        int i10 = this.zzb;
        String str = this.zzc;
        if (i10 != 0) {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(Integer.toString(1), "-", str);
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaox {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzaqa.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzapy zzapyVar) {
        zzapt zzaptVar;
        synchronized (this.zze) {
            zzaptVar = this.zzf;
        }
        zzaptVar.zza(zzapyVar);
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzaps zzapsVar = this.zzh;
        if (zzapsVar != null) {
            zzapsVar.zzb(this);
        }
        if (zzaqa.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzapn(this, str, id2));
            } else {
                this.zza.zza(str, id2);
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
        zzapo zzapoVar;
        synchronized (this.zze) {
            zzapoVar = this.zzk;
        }
        if (zzapoVar != null) {
            zzapoVar.zza(this);
        }
    }

    public final void zzs(zzapv zzapvVar) {
        zzapo zzapoVar;
        synchronized (this.zze) {
            zzapoVar = this.zzk;
        }
        if (zzapoVar != null) {
            zzapoVar.zzb(this, zzapvVar);
        }
    }

    public final void zzt(int i10) {
        zzaps zzapsVar = this.zzh;
        if (zzapsVar != null) {
            zzapsVar.zzc(this, i10);
        }
    }

    public final void zzu(zzapo zzapoVar) {
        synchronized (this.zze) {
            this.zzk = zzapoVar;
        }
    }

    public final boolean zzv() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaox {
        return null;
    }

    public final zzapd zzy() {
        return this.zzl;
    }
}
