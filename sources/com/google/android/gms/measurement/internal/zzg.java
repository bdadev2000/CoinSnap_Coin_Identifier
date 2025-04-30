package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzg {
    private final zzhj zza;

    @Nullable
    private Long zzaa;

    @Nullable
    private Long zzab;
    private long zzac;

    @Nullable
    private String zzad;
    private int zzae;
    private int zzaf;
    private long zzag;
    private String zzah;

    @Nullable
    private byte[] zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;

    @Nullable
    private String zzap;
    private boolean zzaq;
    private long zzar;
    private long zzas;
    private final String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private String zzd;

    @Nullable
    private String zze;

    @Nullable
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    @Nullable
    private String zzj;
    private long zzk;

    @Nullable
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;

    @Nullable
    private String zzq;

    @Nullable
    private Boolean zzr;
    private long zzs;

    @Nullable
    private List<String> zzt;

    @Nullable
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private int zzy;
    private boolean zzz;

    public zzg(zzhj zzhjVar, String str) {
        Preconditions.checkNotNull(zzhjVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzhjVar;
        this.zzb = str;
        zzhjVar.zzl().zzt();
    }

    public final int zza() {
        this.zza.zzl().zzt();
        return this.zzy;
    }

    @Nullable
    public final String zzaa() {
        this.zza.zzl().zzt();
        return this.zzq;
    }

    @Nullable
    public final String zzab() {
        this.zza.zzl().zzt();
        String str = this.zzap;
        zzg((String) null);
        return str;
    }

    public final String zzac() {
        this.zza.zzl().zzt();
        return this.zzb;
    }

    @Nullable
    public final String zzad() {
        this.zza.zzl().zzt();
        return this.zzc;
    }

    @Nullable
    public final String zzae() {
        this.zza.zzl().zzt();
        return this.zzl;
    }

    @Nullable
    public final String zzaf() {
        this.zza.zzl().zzt();
        return this.zzj;
    }

    @Nullable
    public final String zzag() {
        this.zza.zzl().zzt();
        return this.zzf;
    }

    @Nullable
    public final String zzah() {
        this.zza.zzl().zzt();
        return this.zzd;
    }

    @Nullable
    public final String zzai() {
        this.zza.zzl().zzt();
        return this.zzap;
    }

    @Nullable
    public final String zzaj() {
        this.zza.zzl().zzt();
        return this.zze;
    }

    public final String zzak() {
        this.zza.zzl().zzt();
        return this.zzah;
    }

    @Nullable
    public final String zzal() {
        this.zza.zzl().zzt();
        return this.zzu;
    }

    @Nullable
    public final String zzam() {
        this.zza.zzl().zzt();
        return this.zzad;
    }

    @Nullable
    public final List<String> zzan() {
        this.zza.zzl().zzt();
        return this.zzt;
    }

    public final void zzao() {
        this.zza.zzl().zzt();
        this.zzaq = false;
    }

    public final void zzap() {
        this.zza.zzl().zzt();
        long j7 = this.zzg + 1;
        if (j7 > 2147483647L) {
            this.zza.zzj().zzu().zza("Bundle index overflow. appId", zzfw.zza(this.zzb));
            j7 = 0;
        }
        this.zzaq = true;
        this.zzg = j7;
    }

    public final boolean zzaq() {
        this.zza.zzl().zzt();
        return this.zzp;
    }

    public final boolean zzar() {
        this.zza.zzl().zzt();
        return this.zzo;
    }

    public final boolean zzas() {
        this.zza.zzl().zzt();
        return this.zzaq;
    }

    public final boolean zzat() {
        this.zza.zzl().zzt();
        return this.zzv;
    }

    public final boolean zzau() {
        this.zza.zzl().zzt();
        return this.zzz;
    }

    @Nullable
    public final byte[] zzav() {
        this.zza.zzl().zzt();
        return this.zzai;
    }

    public final int zzb() {
        this.zza.zzl().zzt();
        return this.zzaf;
    }

    public final int zzc() {
        this.zza.zzl().zzt();
        return this.zzae;
    }

    public final long zzd() {
        this.zza.zzl().zzt();
        return 0L;
    }

    public final long zze() {
        this.zza.zzl().zzt();
        return this.zzk;
    }

    public final long zzf() {
        this.zza.zzl().zzt();
        return this.zzac;
    }

    public final long zzg() {
        this.zza.zzl().zzt();
        return this.zzar;
    }

    public final long zzh() {
        this.zza.zzl().zzt();
        return this.zzam;
    }

    public final long zzi() {
        this.zza.zzl().zzt();
        return this.zzan;
    }

    public final long zzj() {
        this.zza.zzl().zzt();
        return this.zzal;
    }

    public final long zzk() {
        this.zza.zzl().zzt();
        return this.zzak;
    }

    public final long zzl() {
        this.zza.zzl().zzt();
        return this.zzao;
    }

    public final long zzm() {
        this.zza.zzl().zzt();
        return this.zzaj;
    }

    public final long zzn() {
        this.zza.zzl().zzt();
        return this.zzn;
    }

    public final long zzo() {
        this.zza.zzl().zzt();
        return this.zzs;
    }

    public final long zzp() {
        this.zza.zzl().zzt();
        return this.zzas;
    }

    public final long zzq() {
        this.zza.zzl().zzt();
        return this.zzm;
    }

    public final long zzr() {
        this.zza.zzl().zzt();
        return this.zzag;
    }

    public final long zzs() {
        this.zza.zzl().zzt();
        return this.zzi;
    }

    public final long zzt() {
        this.zza.zzl().zzt();
        return this.zzg;
    }

    public final long zzu() {
        this.zza.zzl().zzt();
        return this.zzh;
    }

    public final long zzv() {
        this.zza.zzl().zzt();
        return this.zzx;
    }

    public final long zzw() {
        this.zza.zzl().zzt();
        return this.zzw;
    }

    @Nullable
    public final Boolean zzx() {
        this.zza.zzl().zzt();
        return this.zzr;
    }

    @Nullable
    public final Long zzy() {
        this.zza.zzl().zzt();
        return this.zzaa;
    }

    @Nullable
    public final Long zzz() {
        this.zza.zzl().zzt();
        return this.zzab;
    }

    public final void zzd(@Nullable String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzj, str);
        this.zzj = str;
    }

    public final void zza(long j7) {
        this.zza.zzl().zzt();
        long j9 = this.zzg + j7;
        if (j9 > 2147483647L) {
            this.zza.zzj().zzu().zza("Bundle index overflow. appId", zzfw.zza(this.zzb));
            j9 = j7 - 1;
        }
        long j10 = this.zzag + 1;
        if (j10 > 2147483647L) {
            this.zza.zzj().zzu().zza("Delivery index overflow. appId", zzfw.zza(this.zzb));
            j10 = 0;
        }
        this.zzaq = true;
        this.zzg = j9;
        this.zzag = j10;
    }

    public final void zzb(@Nullable String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzc, str);
        this.zzc = str;
    }

    public final void zzc(@Nullable String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzl, str);
        this.zzl = str;
    }

    public final void zze(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzam != j7;
        this.zzam = j7;
    }

    public final void zzf(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzan != j7;
        this.zzan = j7;
    }

    public final void zzg(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzal != j7;
        this.zzal = j7;
    }

    public final void zzh(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzak != j7;
        this.zzak = j7;
    }

    public final void zzi(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzao != j7;
        this.zzao = j7;
    }

    public final void zzj(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzaj != j7;
        this.zzaj = j7;
    }

    public final void zzk(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzn != j7;
        this.zzn = j7;
    }

    public final void zzl(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzs != j7;
        this.zzs = j7;
    }

    public final void zzm(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzas != j7;
        this.zzas = j7;
    }

    public final void zzn(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzm != j7;
        this.zzm = j7;
    }

    public final void zzo(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzag != j7;
        this.zzag = j7;
    }

    public final void zzp(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzi != j7;
        this.zzi = j7;
    }

    public final void zzq(long j7) {
        Preconditions.checkArgument(j7 >= 0);
        this.zza.zzl().zzt();
        this.zzaq |= this.zzg != j7;
        this.zzg = j7;
    }

    public final void zzr(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzh != j7;
        this.zzh = j7;
    }

    public final void zzs(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzx != j7;
        this.zzx = j7;
    }

    public final void zzt(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzw != j7;
        this.zzw = j7;
    }

    public final void zzd(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzar != j7;
        this.zzar = j7;
    }

    public final void zzb(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzk != j7;
        this.zzk = j7;
    }

    public final void zzc(long j7) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzac != j7;
        this.zzac = j7;
    }

    public final void zze(@Nullable String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzf, str);
        this.zzf = str;
    }

    public final void zzf(@Nullable String str) {
        this.zza.zzl().zzt();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzaq |= !Objects.equals(this.zzd, str);
        this.zzd = str;
    }

    public final void zzg(@Nullable String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzap, str);
        this.zzap = str;
    }

    public final void zzh(@Nullable String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zze, str);
        this.zze = str;
    }

    public final void zzi(String str) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzah != str;
        this.zzah = str;
    }

    public final void zzj(@Nullable String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzu, str);
        this.zzu = str;
    }

    public final void zzk(@Nullable String str) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzad != str;
        this.zzad = str;
    }

    public final void zzd(boolean z8) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzz != z8;
        this.zzz = z8;
    }

    public final void zzb(int i9) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzaf != i9;
        this.zzaf = i9;
    }

    public final void zzc(int i9) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzae != i9;
        this.zzae = i9;
    }

    public final void zza(@Nullable byte[] bArr) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzai != bArr;
        this.zzai = bArr;
    }

    public final void zzb(boolean z8) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzo != z8;
        this.zzo = z8;
    }

    public final void zzc(boolean z8) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzv != z8;
        this.zzv = z8;
    }

    public final void zza(@Nullable String str) {
        this.zza.zzl().zzt();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzaq |= !Objects.equals(this.zzq, str);
        this.zzq = str;
    }

    public final void zzb(@Nullable Long l) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzab, l);
        this.zzab = l;
    }

    public final void zza(int i9) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzy != i9;
        this.zzy = i9;
    }

    public final void zza(boolean z8) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzp != z8;
        this.zzp = z8;
    }

    public final void zza(@Nullable Boolean bool) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzr, bool);
        this.zzr = bool;
    }

    public final void zza(@Nullable List<String> list) {
        this.zza.zzl().zzt();
        if (Objects.equals(this.zzt, list)) {
            return;
        }
        this.zzaq = true;
        this.zzt = list != null ? new ArrayList(list) : null;
    }

    public final void zza(@Nullable Long l) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzaa, l);
        this.zzaa = l;
    }
}
