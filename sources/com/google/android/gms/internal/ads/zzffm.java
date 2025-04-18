package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzffm {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzs zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzga zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbfn zzh;
    private com.google.android.gms.ads.internal.client.zzy zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzcm zzl;
    private zzbmb zzn;

    @Nullable
    private zzems zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcq zzu;
    private int zzm = 1;
    private final zzfez zzo = new zzfez();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public static /* bridge */ /* synthetic */ String zzK(zzffm zzffmVar) {
        return zzffmVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzM(zzffm zzffmVar) {
        return zzffmVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzN(zzffm zzffmVar) {
        return zzffmVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzO(zzffm zzffmVar) {
        return zzffmVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzP(zzffm zzffmVar) {
        return zzffmVar.zzq;
    }

    public static /* bridge */ /* synthetic */ boolean zzQ(zzffm zzffmVar) {
        return zzffmVar.zzs;
    }

    public static /* bridge */ /* synthetic */ boolean zzR(zzffm zzffmVar) {
        return zzffmVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcq zzU(zzffm zzffmVar) {
        return zzffmVar.zzu;
    }

    public static /* bridge */ /* synthetic */ int zza(zzffm zzffmVar) {
        return zzffmVar.zzm;
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzffm zzffmVar) {
        return zzffmVar.zzt;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzc(zzffm zzffmVar) {
        return zzffmVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzd(zzffm zzffmVar) {
        return zzffmVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzm zze(zzffm zzffmVar) {
        return zzffmVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzs zzg(zzffm zzffmVar) {
        return zzffmVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzy zzi(zzffm zzffmVar) {
        return zzffmVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcm zzj(zzffm zzffmVar) {
        return zzffmVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzga zzk(zzffm zzffmVar) {
        return zzffmVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbfn zzl(zzffm zzffmVar) {
        return zzffmVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbmb zzm(zzffm zzffmVar) {
        return zzffmVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzems zzn(zzffm zzffmVar) {
        return zzffmVar.zzr;
    }

    public static /* bridge */ /* synthetic */ zzfez zzo(zzffm zzffmVar) {
        return zzffmVar.zzo;
    }

    public final zzffm zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzffm zzB(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzffm zzC(int i10) {
        this.zzm = i10;
        return this;
    }

    public final zzffm zzD(zzbfn zzbfnVar) {
        this.zzh = zzbfnVar;
        return this;
    }

    public final zzffm zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzffm zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzffm zzG(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzffm zzH(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final zzffm zzI(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        this.zzd = zzgaVar;
        return this;
    }

    public final zzffo zzJ() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzffo(this, null);
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

    public final zzffm zzV(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zzu = zzcqVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzs zzh() {
        return this.zzb;
    }

    public final zzfez zzp() {
        return this.zzo;
    }

    public final zzffm zzq(zzffo zzffoVar) {
        this.zzo.zza(zzffoVar.zzo.zza);
        this.zza = zzffoVar.zzd;
        this.zzb = zzffoVar.zze;
        this.zzu = zzffoVar.zzt;
        this.zzc = zzffoVar.zzf;
        this.zzd = zzffoVar.zza;
        this.zzf = zzffoVar.zzg;
        this.zzg = zzffoVar.zzh;
        this.zzh = zzffoVar.zzi;
        this.zzi = zzffoVar.zzj;
        zzr(zzffoVar.zzl);
        zzG(zzffoVar.zzm);
        this.zzp = zzffoVar.zzp;
        this.zzq = zzffoVar.zzq;
        this.zzr = zzffoVar.zzc;
        this.zzs = zzffoVar.zzr;
        this.zzt = zzffoVar.zzs;
        return this;
    }

    public final zzffm zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzffm zzs(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzb = zzsVar;
        return this;
    }

    public final zzffm zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzffm zzu(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzi = zzyVar;
        return this;
    }

    public final zzffm zzv(zzems zzemsVar) {
        this.zzr = zzemsVar;
        return this;
    }

    public final zzffm zzw(zzbmb zzbmbVar) {
        this.zzn = zzbmbVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzga(false, true, false);
        return this;
    }

    public final zzffm zzx(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzffm zzy(boolean z10) {
        this.zzq = z10;
        return this;
    }

    public final zzffm zzz(boolean z10) {
        this.zzs = true;
        return this;
    }
}
