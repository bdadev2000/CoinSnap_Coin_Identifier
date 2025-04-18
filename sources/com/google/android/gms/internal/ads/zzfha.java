package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzfha {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzs zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzgb zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbfr zzh;
    private com.google.android.gms.ads.internal.client.zzy zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzcm zzl;
    private zzbmg zzn;

    @Nullable
    private zzeob zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcq zzu;
    private int zzm = 1;
    private final zzfgn zzo = new zzfgn();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public static /* bridge */ /* synthetic */ String zzK(zzfha zzfhaVar) {
        return zzfhaVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzM(zzfha zzfhaVar) {
        return zzfhaVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzN(zzfha zzfhaVar) {
        return zzfhaVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzO(zzfha zzfhaVar) {
        return zzfhaVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzP(zzfha zzfhaVar) {
        return zzfhaVar.zzq;
    }

    public static /* bridge */ /* synthetic */ boolean zzQ(zzfha zzfhaVar) {
        return zzfhaVar.zzs;
    }

    public static /* bridge */ /* synthetic */ boolean zzR(zzfha zzfhaVar) {
        return zzfhaVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcq zzU(zzfha zzfhaVar) {
        return zzfhaVar.zzu;
    }

    public static /* bridge */ /* synthetic */ int zza(zzfha zzfhaVar) {
        return zzfhaVar.zzm;
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzfha zzfhaVar) {
        return zzfhaVar.zzt;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzc(zzfha zzfhaVar) {
        return zzfhaVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzd(zzfha zzfhaVar) {
        return zzfhaVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzm zze(zzfha zzfhaVar) {
        return zzfhaVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzs zzg(zzfha zzfhaVar) {
        return zzfhaVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzy zzi(zzfha zzfhaVar) {
        return zzfhaVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcm zzj(zzfha zzfhaVar) {
        return zzfhaVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzgb zzk(zzfha zzfhaVar) {
        return zzfhaVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbfr zzl(zzfha zzfhaVar) {
        return zzfhaVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbmg zzm(zzfha zzfhaVar) {
        return zzfhaVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzeob zzn(zzfha zzfhaVar) {
        return zzfhaVar.zzr;
    }

    public static /* bridge */ /* synthetic */ zzfgn zzo(zzfha zzfhaVar) {
        return zzfhaVar.zzo;
    }

    public final zzfha zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfha zzB(boolean z2) {
        this.zze = z2;
        return this;
    }

    public final zzfha zzC(int i2) {
        this.zzm = i2;
        return this;
    }

    public final zzfha zzD(zzbfr zzbfrVar) {
        this.zzh = zzbfrVar;
        return this;
    }

    public final zzfha zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfha zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfha zzG(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfha zzH(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final zzfha zzI(com.google.android.gms.ads.internal.client.zzgb zzgbVar) {
        this.zzd = zzgbVar;
        return this;
    }

    public final zzfhc zzJ() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfhc(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzfha zzV(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zzu = zzcqVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzs zzh() {
        return this.zzb;
    }

    public final zzfgn zzp() {
        return this.zzo;
    }

    public final zzfha zzq(zzfhc zzfhcVar) {
        this.zzo.zza(zzfhcVar.zzo.zza);
        this.zza = zzfhcVar.zzd;
        this.zzb = zzfhcVar.zze;
        this.zzu = zzfhcVar.zzt;
        this.zzc = zzfhcVar.zzf;
        this.zzd = zzfhcVar.zza;
        this.zzf = zzfhcVar.zzg;
        this.zzg = zzfhcVar.zzh;
        this.zzh = zzfhcVar.zzi;
        this.zzi = zzfhcVar.zzj;
        zzr(zzfhcVar.zzl);
        zzG(zzfhcVar.zzm);
        this.zzp = zzfhcVar.zzp;
        this.zzq = zzfhcVar.zzq;
        this.zzr = zzfhcVar.zzc;
        this.zzs = zzfhcVar.zzr;
        this.zzt = zzfhcVar.zzs;
        return this;
    }

    public final zzfha zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfha zzs(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzb = zzsVar;
        return this;
    }

    public final zzfha zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfha zzu(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzi = zzyVar;
        return this;
    }

    public final zzfha zzv(zzeob zzeobVar) {
        this.zzr = zzeobVar;
        return this;
    }

    public final zzfha zzw(zzbmg zzbmgVar) {
        this.zzn = zzbmgVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzgb(false, true, false);
        return this;
    }

    public final zzfha zzx(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final zzfha zzy(boolean z2) {
        this.zzq = z2;
        return this;
    }

    public final zzfha zzz(boolean z2) {
        this.zzs = true;
        return this;
    }
}
