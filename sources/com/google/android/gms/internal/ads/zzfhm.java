package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzfhm {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfk zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbhk zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzcb zzl;
    private zzbnz zzn;

    @Nullable
    private zzepc zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcf zzu;
    private int zzm = 1;
    private final zzfgz zzo = new zzfgz();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public static /* bridge */ /* synthetic */ String zzK(zzfhm zzfhmVar) {
        return zzfhmVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzM(zzfhm zzfhmVar) {
        return zzfhmVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzN(zzfhm zzfhmVar) {
        return zzfhmVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzO(zzfhm zzfhmVar) {
        return zzfhmVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzP(zzfhm zzfhmVar) {
        return zzfhmVar.zzq;
    }

    public static /* bridge */ /* synthetic */ boolean zzQ(zzfhm zzfhmVar) {
        return zzfhmVar.zzs;
    }

    public static /* bridge */ /* synthetic */ boolean zzR(zzfhm zzfhmVar) {
        return zzfhmVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcf zzT(zzfhm zzfhmVar) {
        return zzfhmVar.zzu;
    }

    public static /* bridge */ /* synthetic */ int zza(zzfhm zzfhmVar) {
        return zzfhmVar.zzm;
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzfhm zzfhmVar) {
        return zzfhmVar.zzt;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzc(zzfhm zzfhmVar) {
        return zzfhmVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzd(zzfhm zzfhmVar) {
        return zzfhmVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzl zze(zzfhm zzfhmVar) {
        return zzfhmVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzq zzg(zzfhm zzfhmVar) {
        return zzfhmVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzw zzi(zzfhm zzfhmVar) {
        return zzfhmVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcb zzj(zzfhm zzfhmVar) {
        return zzfhmVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzfk zzk(zzfhm zzfhmVar) {
        return zzfhmVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbhk zzl(zzfhm zzfhmVar) {
        return zzfhmVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbnz zzm(zzfhm zzfhmVar) {
        return zzfhmVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzepc zzn(zzfhm zzfhmVar) {
        return zzfhmVar.zzr;
    }

    public static /* bridge */ /* synthetic */ zzfgz zzo(zzfhm zzfhmVar) {
        return zzfhmVar.zzo;
    }

    public final zzfhm zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfhm zzB(boolean z8) {
        this.zze = z8;
        return this;
    }

    public final zzfhm zzC(int i9) {
        this.zzm = i9;
        return this;
    }

    public final zzfhm zzD(zzbhk zzbhkVar) {
        this.zzh = zzbhkVar;
        return this;
    }

    public final zzfhm zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfhm zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfhm zzG(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfhm zzH(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzfhm zzI(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        this.zzd = zzfkVar;
        return this;
    }

    public final zzfho zzJ() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfho(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzq;
    }

    public final zzfhm zzU(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zzu = zzcfVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzh() {
        return this.zzb;
    }

    public final zzfgz zzp() {
        return this.zzo;
    }

    public final zzfhm zzq(zzfho zzfhoVar) {
        this.zzo.zza(zzfhoVar.zzo.zza);
        this.zza = zzfhoVar.zzd;
        this.zzb = zzfhoVar.zze;
        this.zzu = zzfhoVar.zzt;
        this.zzc = zzfhoVar.zzf;
        this.zzd = zzfhoVar.zza;
        this.zzf = zzfhoVar.zzg;
        this.zzg = zzfhoVar.zzh;
        this.zzh = zzfhoVar.zzi;
        this.zzi = zzfhoVar.zzj;
        zzr(zzfhoVar.zzl);
        zzG(zzfhoVar.zzm);
        this.zzp = zzfhoVar.zzp;
        this.zzq = zzfhoVar.zzq;
        this.zzr = zzfhoVar.zzc;
        this.zzs = zzfhoVar.zzr;
        this.zzt = zzfhoVar.zzs;
        return this;
    }

    public final zzfhm zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfhm zzs(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzfhm zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfhm zzu(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzfhm zzv(zzepc zzepcVar) {
        this.zzr = zzepcVar;
        return this;
    }

    public final zzfhm zzw(zzbnz zzbnzVar) {
        this.zzn = zzbnzVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfk(false, true, false);
        return this;
    }

    public final zzfhm zzx(boolean z8) {
        this.zzp = z8;
        return this;
    }

    public final zzfhm zzy(boolean z8) {
        this.zzq = z8;
        return this;
    }

    public final zzfhm zzz(boolean z8) {
        this.zzs = true;
        return this;
    }
}
