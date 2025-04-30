package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbdv {

    /* renamed from: com.google.android.gms.internal.ads.zzbdv$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zza;

        static {
            int[] iArr = new int[zzhbn.values().length];
            zza = iArr;
            try {
                iArr[zzhbn.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza[zzhbn.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza[zzhbn.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza[zzhbn.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zza[zzhbn.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zza[zzhbn.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zza[zzhbn.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class zza extends zzhbo<zza, zzb> implements zzf {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private static final zza zzl;
        private static volatile zzhdm<zza> zzm;
        private zzx zzA;
        private zzz zzB;
        private int zzn;
        private int zzo;
        private zzg zzu;
        private zzi zzv;
        private zzk zzx;
        private zzah zzy;
        private zzac zzz;
        private int zzp = 1000;
        private zzhca<zzd> zzw = zzhbo.zzbK();
        private zzhca<zzat> zzC = zzhbo.zzbK();

        /* renamed from: com.google.android.gms.internal.ads.zzbdv$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0129zza implements zzhbs {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);

            public static final int zzm = 0;
            public static final int zzn = 1;
            public static final int zzo = 2;
            public static final int zzp = 3;
            public static final int zzq = 4;
            public static final int zzr = 5;
            public static final int zzs = 6;
            public static final int zzt = 7;
            public static final int zzu = 8;
            public static final int zzv = 9;
            public static final int zzw = 10;
            public static final int zzx = 11;
            private static final zzhbt<EnumC0129zza> zzy = new zzhbt<EnumC0129zza>() { // from class: com.google.android.gms.internal.ads.zzbdv.zza.zza.1
                @Override // com.google.android.gms.internal.ads.zzhbt
                /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public EnumC0129zza zza(int i9) {
                    return EnumC0129zza.zzb(i9);
                }
            };
            private final int zzA;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.android.gms.internal.ads.zzbdv$zza$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0130zza implements zzhbu {
                static final zzhbu zza = new C0130zza();

                private C0130zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzhbu
                public boolean zza(int i9) {
                    if (EnumC0129zza.zzb(i9) != null) {
                        return true;
                    }
                    return false;
                }
            }

            EnumC0129zza(int i9) {
                this.zzA = i9;
            }

            public static EnumC0129zza zzb(int i9) {
                switch (i9) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    case 11:
                        return REWARDED_INTERSTITIAL;
                    default:
                        return null;
                }
            }

            public static zzhbt<EnumC0129zza> zzd() {
                return zzy;
            }

            public static zzhbu zze() {
                return C0130zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzhbs
            public final int zza() {
                return this.zzA;
            }
        }

        /* loaded from: classes2.dex */
        public final class zzb extends zzhbi<zza, zzb> implements zzf {
            private zzb() {
                super(zza.zzl);
            }

            public zzb zzA(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcu(zzacVar);
                return this;
            }

            public zzb zzB(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcv(zzgVar);
                return this;
            }

            public zzb zzC(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcw(zziVar);
                return this;
            }

            public zzb zzD(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcx(zzahVar);
                return this;
            }

            public zzb zzE(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcy(zzkVar);
                return this;
            }

            public zzb zzF(int i9) {
                zzbu();
                ((zza) this.zza).zzcz(i9);
                return this;
            }

            public zzb zzG(int i9) {
                zzbu();
                ((zza) this.zza).zzcA(i9);
                return this;
            }

            public zzb zzH(EnumC0129zza enumC0129zza) {
                zzbu();
                ((zza) this.zza).zzcB(enumC0129zza);
                return this;
            }

            public zzb zzI(zzx.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcC(zzaVar.zzbr());
                return this;
            }

            public zzb zzJ(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzcC(zzxVar);
                return this;
            }

            public zzb zzK(zzq zzqVar) {
                zzbu();
                ((zza) this.zza).zzcD(zzqVar);
                return this;
            }

            public zzb zzL(zzz.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcE(zzaVar.zzbr());
                return this;
            }

            public zzb zzM(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzcE(zzzVar);
                return this;
            }

            public zzb zzN(zzac.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zzb zzO(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcF(zzacVar);
                return this;
            }

            public zzb zzP(int i9, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzcG(i9, zzbVar.zzbr());
                return this;
            }

            public zzb zzQ(int i9, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzcG(i9, zzdVar);
                return this;
            }

            public zzb zzR(zzg.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zzb zzS(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcH(zzgVar);
                return this;
            }

            public zzb zzT(zzi.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zzb zzU(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcI(zziVar);
                return this;
            }

            public zzb zzV(zzah.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zzb zzW(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zzahVar);
                return this;
            }

            public zzb zzX(zzk.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcK(zzaVar.zzbr());
                return this;
            }

            public zzb zzY(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcK(zzkVar);
                return this;
            }

            public zzb zzZ(int i9, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcL(i9, zzaVar.zzbr());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public int zza() {
                return ((zza) this.zza).zza();
            }

            public zzb zzaa(int i9, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzcL(i9, zzatVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzd zzab(int i9) {
                return ((zza) this.zza).zzab(i9);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzg zzac() {
                return ((zza) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzi zzad() {
                return ((zza) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzk zzae() {
                return ((zza) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzq zzaf() {
                return ((zza) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzx zzag() {
                return ((zza) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzz zzah() {
                return ((zza) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzac zzai() {
                return ((zza) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzah zzaj() {
                return ((zza) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public zzat zzak(int i9) {
                return ((zza) this.zza).zzak(i9);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public List<zzd> zzal() {
                return Collections.unmodifiableList(((zza) this.zza).zzal());
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public List<zzat> zzam() {
                return Collections.unmodifiableList(((zza) this.zza).zzam());
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public boolean zzan() {
                return ((zza) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public boolean zzao() {
                return ((zza) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public boolean zzap() {
                return ((zza) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public boolean zzaq() {
                return ((zza) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public boolean zzar() {
                return ((zza) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public boolean zzas() {
                return ((zza) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public boolean zzat() {
                return ((zza) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public boolean zzau() {
                return ((zza) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public boolean zzav() {
                return ((zza) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public int zzb() {
                return ((zza) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzf
            public EnumC0129zza zzc() {
                return ((zza) this.zza).zzc();
            }

            public zzb zzd(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zza) this.zza).zzaE(iterable);
                return this;
            }

            public zzb zze(Iterable<? extends zzat> iterable) {
                zzbu();
                ((zza) this.zza).zzaF(iterable);
                return this;
            }

            public zzb zzf(zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaG(zzbVar.zzbr());
                return this;
            }

            public zzb zzg(zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaG(zzdVar);
                return this;
            }

            public zzb zzh(int i9, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaH(i9, zzbVar.zzbr());
                return this;
            }

            public zzb zzi(int i9, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaH(i9, zzdVar);
                return this;
            }

            public zzb zzj(zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaI(zzaVar.zzbr());
                return this;
            }

            public zzb zzk(zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaI(zzatVar);
                return this;
            }

            public zzb zzl(int i9, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaJ(i9, zzaVar.zzbr());
                return this;
            }

            public zzb zzm(int i9, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaJ(i9, zzatVar);
                return this;
            }

            public zzb zzn() {
                zzbu();
                ((zza) this.zza).zzaK();
                return this;
            }

            public zzb zzo() {
                zzbu();
                ((zza) this.zza).zzcg();
                return this;
            }

            public zzb zzp() {
                zzbu();
                ((zza) this.zza).zzch();
                return this;
            }

            public zzb zzq() {
                zzbu();
                ((zza) this.zza).zzci();
                return this;
            }

            public zzb zzr() {
                zzbu();
                ((zza) this.zza).zzcj();
                return this;
            }

            public zzb zzs() {
                zzbu();
                ((zza) this.zza).zzck();
                return this;
            }

            public zzb zzt() {
                zzbu();
                ((zza) this.zza).zzcl();
                return this;
            }

            public zzb zzu() {
                zzbu();
                ((zza) this.zza).zzcm();
                return this;
            }

            public zzb zzv() {
                zzbu();
                ((zza) this.zza).zzcn();
                return this;
            }

            public zzb zzw() {
                zzbu();
                ((zza) this.zza).zzco();
                return this;
            }

            public zzb zzx() {
                zzbu();
                ((zza) this.zza).zzcp();
                return this;
            }

            public zzb zzy(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzcs(zzxVar);
                return this;
            }

            public zzb zzz(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzct(zzzVar);
                return this;
            }

            public /* synthetic */ zzb(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzl = zzaVar;
            zzhbo.zzca(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(Iterable<? extends zzd> iterable) {
            zzcq();
            zzgzi.zzaQ(iterable, this.zzw);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(Iterable<? extends zzat> iterable) {
            zzcr();
            zzgzi.zzaQ(iterable, this.zzC);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG(zzd zzdVar) {
            zzdVar.getClass();
            zzcq();
            this.zzw.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaH(int i9, zzd zzdVar) {
            zzdVar.getClass();
            zzcq();
            this.zzw.add(i9, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI(zzat zzatVar) {
            zzatVar.getClass();
            zzcr();
            this.zzC.add(zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ(int i9, zzat zzatVar) {
            zzatVar.getClass();
            zzcr();
            this.zzC.add(i9, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK() {
            this.zzn &= -2;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(int i9) {
            zzcr();
            this.zzC.remove(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(EnumC0129zza enumC0129zza) {
            this.zzo = enumC0129zza.zza();
            this.zzn |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(zzx zzxVar) {
            zzxVar.getClass();
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(zzz zzzVar) {
            zzzVar.getClass();
            this.zzB = zzzVar;
            this.zzn |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzac zzacVar) {
            zzacVar.getClass();
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(int i9, zzd zzdVar) {
            zzdVar.getClass();
            zzcq();
            this.zzw.set(i9, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzg zzgVar) {
            zzgVar.getClass();
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzi zziVar) {
            zziVar.getClass();
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzah zzahVar) {
            zzahVar.getClass();
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(zzk zzkVar) {
            zzkVar.getClass();
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(int i9, zzat zzatVar) {
            zzatVar.getClass();
            zzcr();
            this.zzC.set(i9, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcg() {
            this.zzA = null;
            this.zzn &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzB = null;
            this.zzn &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzz = null;
            this.zzn &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzw = zzhbo.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzu = null;
            this.zzn &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzv = null;
            this.zzn &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzy = null;
            this.zzn &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzx = null;
            this.zzn &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp() {
            this.zzC = zzhbo.zzbK();
        }

        private void zzcq() {
            zzhca<zzd> zzhcaVar = this.zzw;
            if (!zzhcaVar.zzc()) {
                this.zzw = zzhbo.zzbL(zzhcaVar);
            }
        }

        private void zzcr() {
            zzhca<zzat> zzhcaVar = this.zzC;
            if (!zzhcaVar.zzc()) {
                this.zzC = zzhbo.zzbL(zzhcaVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs(zzx zzxVar) {
            zzxVar.getClass();
            zzx zzxVar2 = this.zzA;
            if (zzxVar2 != null && zzxVar2 != zzx.zzg()) {
                zzx.zza zze2 = zzx.zze(zzxVar2);
                zze2.zzbj(zzxVar);
                zzxVar = zze2.zzbs();
            }
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct(zzz zzzVar) {
            zzzVar.getClass();
            zzz zzzVar2 = this.zzB;
            if (zzzVar2 != null && zzzVar2 != zzz.zzg()) {
                zzz.zza zze2 = zzz.zze(zzzVar2);
                zze2.zzbj(zzzVar);
                zzzVar = zze2.zzbs();
            }
            this.zzB = zzzVar;
            this.zzn |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu(zzac zzacVar) {
            zzacVar.getClass();
            zzac zzacVar2 = this.zzz;
            if (zzacVar2 != null && zzacVar2 != zzac.zzf()) {
                zzac.zza zzd2 = zzac.zzd(zzacVar2);
                zzd2.zzbj(zzacVar);
                zzacVar = zzd2.zzbs();
            }
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv(zzg zzgVar) {
            zzgVar.getClass();
            zzg zzgVar2 = this.zzu;
            if (zzgVar2 != null && zzgVar2 != zzg.zzg()) {
                zzg.zza zze2 = zzg.zze(zzgVar2);
                zze2.zzbj(zzgVar);
                zzgVar = zze2.zzbs();
            }
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw(zzi zziVar) {
            zziVar.getClass();
            zzi zziVar2 = this.zzv;
            if (zziVar2 != null && zziVar2 != zzi.zzg()) {
                zzi.zza zze2 = zzi.zze(zziVar2);
                zze2.zzbj(zziVar);
                zziVar = zze2.zzbs();
            }
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzah zzahVar) {
            zzahVar.getClass();
            zzah zzahVar2 = this.zzy;
            if (zzahVar2 != null && zzahVar2 != zzah.zzn()) {
                zzah.zza zzl2 = zzah.zzl(zzahVar2);
                zzl2.zzbj(zzahVar);
                zzahVar = zzl2.zzbs();
            }
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzk zzkVar) {
            zzkVar.getClass();
            zzk zzkVar2 = this.zzx;
            if (zzkVar2 != null && zzkVar2 != zzk.zzg()) {
                zzk.zza zze2 = zzk.zze(zzkVar2);
                zze2.zzbj(zzkVar);
                zzkVar = zze2.zzbs();
            }
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(int i9) {
            zzcq();
            this.zzw.remove(i9);
        }

        public static zzb zzd() {
            return zzl.zzaZ();
        }

        public static zzb zze(zza zzaVar) {
            return zzl.zzba(zzaVar);
        }

        public static zza zzg() {
            return zzl;
        }

        public static zza zzh(InputStream inputStream) throws IOException {
            return (zza) zzhbo.zzbk(zzl, inputStream);
        }

        public static zza zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zza) zzhbo.zzbl(zzl, inputStream, zzhayVar);
        }

        public static zza zzj(zzhac zzhacVar) throws zzhcd {
            return (zza) zzhbo.zzbm(zzl, zzhacVar);
        }

        public static zza zzk(zzham zzhamVar) throws IOException {
            return (zza) zzhbo.zzbn(zzl, zzhamVar);
        }

        public static zza zzl(InputStream inputStream) throws IOException {
            return (zza) zzhbo.zzbo(zzl, inputStream);
        }

        public static zza zzm(ByteBuffer byteBuffer) throws zzhcd {
            return (zza) zzhbo.zzbp(zzl, byteBuffer);
        }

        public static zza zzn(byte[] bArr) throws zzhcd {
            return (zza) zzhbo.zzbq(zzl, bArr);
        }

        public static zza zzo(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zza) zzhbo.zzbr(zzl, zzhacVar, zzhayVar);
        }

        public static zza zzp(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zza) zzhbo.zzbs(zzl, zzhamVar, zzhayVar);
        }

        public static zza zzq(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zza) zzhbo.zzbu(zzl, inputStream, zzhayVar);
        }

        public static zza zzr(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zza) zzhbo.zzbv(zzl, byteBuffer, zzhayVar);
        }

        public static zza zzs(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zza) zzhbo.zzbx(zzl, bArr, zzhayVar);
        }

        public static zzhdm<zza> zzv() {
            return zzl.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public int zza() {
            return this.zzw.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzd zzab(int i9) {
            return this.zzw.get(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzg zzac() {
            zzg zzgVar = this.zzu;
            if (zzgVar == null) {
                return zzg.zzg();
            }
            return zzgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzi zzad() {
            zzi zziVar = this.zzv;
            if (zziVar == null) {
                return zzi.zzg();
            }
            return zziVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzk zzae() {
            zzk zzkVar = this.zzx;
            if (zzkVar == null) {
                return zzk.zzg();
            }
            return zzkVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzq zzaf() {
            zzq zzb2 = zzq.zzb(this.zzp);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzx zzag() {
            zzx zzxVar = this.zzA;
            if (zzxVar == null) {
                return zzx.zzg();
            }
            return zzxVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzz zzah() {
            zzz zzzVar = this.zzB;
            if (zzzVar == null) {
                return zzz.zzg();
            }
            return zzzVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzac zzai() {
            zzac zzacVar = this.zzz;
            if (zzacVar == null) {
                return zzac.zzf();
            }
            return zzacVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzah zzaj() {
            zzah zzahVar = this.zzy;
            if (zzahVar == null) {
                return zzah.zzn();
            }
            return zzahVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public zzat zzak(int i9) {
            return this.zzC.get(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public List<zzd> zzal() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public List<zzat> zzam() {
            return this.zzC;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public boolean zzan() {
            return (this.zzn & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public boolean zzao() {
            return (this.zzn & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public boolean zzap() {
            return (this.zzn & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public boolean zzaq() {
            return (this.zzn & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public boolean zzar() {
            return (this.zzn & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public boolean zzas() {
            return (this.zzn & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public boolean zzat() {
            return (this.zzn & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public boolean zzau() {
            return (this.zzn & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public boolean zzav() {
            return (this.zzn & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzf
        public EnumC0129zza zzc() {
            EnumC0129zza zzb2 = EnumC0129zza.zzb(this.zzo);
            if (zzb2 == null) {
                return EnumC0129zza.AD_INITIATER_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzl, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC0129zza.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", zzd.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", zzat.class});
                case NEW_MUTABLE_INSTANCE:
                    return new zza();
                case NEW_BUILDER:
                    return new zzb(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzl;
                case GET_PARSER:
                    zzhdm<zza> zzhdmVar = zzm;
                    if (zzhdmVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzhdmVar = zzm;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzl);
                                    zzm = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public zze zzt(int i9) {
            return this.zzw.get(i9);
        }

        public zzbi zzu(int i9) {
            return this.zzC.get(i9);
        }

        public List<? extends zze> zzw() {
            return this.zzw;
        }

        public List<? extends zzbi> zzx() {
            return this.zzC;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzaa extends zzhdf {
        boolean zzA();

        boolean zzB();

        int zza();

        zzq zzb();

        zzv zzc();

        zzan zzw(int i9);

        zzap zzx();

        List<zzan> zzy();

        boolean zzz();
    }

    /* loaded from: classes2.dex */
    public final class zzab extends zzhbo<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzc;
        private static volatile zzhdm<zzab> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzab, zza> implements zzae {
            private zza() {
                super(zzab.zzc);
            }

            public zza zza() {
                zzbu();
                ((zzab) this.zza).zzA();
                return this;
            }

            public zza zzb() {
                zzbu();
                ((zzab) this.zza).zzB();
                return this;
            }

            public zza zzc(zzb zzbVar) {
                zzbu();
                ((zzab) this.zza).zzC(zzbVar);
                return this;
            }

            public zza zzd(zzc zzcVar) {
                zzbu();
                ((zzab) this.zza).zzD(zzcVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzae
            public zzb zze() {
                return ((zzab) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzae
            public zzc zzf() {
                return ((zzab) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzae
            public boolean zzg() {
                return ((zzab) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzae
            public boolean zzh() {
                return ((zzab) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public enum zzb implements zzhbs {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 4;
            private static final zzhbt<zzb> zzi = new zzhbt<zzb>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzab.zzb.1
                @Override // com.google.android.gms.internal.ads.zzhbt
                /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public zzb zza(int i9) {
                    return zzb.zzb(i9);
                }
            };
            private final int zzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzhbu {
                static final zzhbu zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzhbu
                public boolean zza(int i9) {
                    if (zzb.zzb(i9) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i9) {
                this.zzk = i9;
            }

            public static zzb zzb(int i9) {
                if (i9 == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i9 == 1) {
                    return TWO_G;
                }
                if (i9 == 2) {
                    return THREE_G;
                }
                if (i9 != 4) {
                    return null;
                }
                return LTE;
            }

            public static zzhbt<zzb> zzd() {
                return zzi;
            }

            public static zzhbu zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzhbs
            public final int zza() {
                return this.zzk;
            }
        }

        /* loaded from: classes2.dex */
        public enum zzc implements zzhbs {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzhbt<zzc> zzg = new zzhbt<zzc>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzab.zzc.1
                @Override // com.google.android.gms.internal.ads.zzhbt
                /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public zzc zza(int i9) {
                    return zzc.zzb(i9);
                }
            };
            private final int zzi;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzhbu {
                static final zzhbu zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzhbu
                public boolean zza(int i9) {
                    if (zzc.zzb(i9) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzc(int i9) {
                this.zzi = i9;
            }

            public static zzc zzb(int i9) {
                if (i9 == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i9 == 1) {
                    return CELL;
                }
                if (i9 != 2) {
                    return null;
                }
                return WIFI;
            }

            public static zzhbt<zzc> zzd() {
                return zzg;
            }

            public static zzhbu zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzhbs
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzc = zzabVar;
            zzhbo.zzca(zzab.class, zzabVar);
        }

        private zzab() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(zzb zzbVar) {
            this.zzg = zzbVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzc zzcVar) {
            this.zzf = zzcVar.zza();
            this.zze |= 1;
        }

        public static zza zza() {
            return zzc.zzaZ();
        }

        public static zza zzc(zzab zzabVar) {
            return zzc.zzba(zzabVar);
        }

        public static zzab zzi() {
            return zzc;
        }

        public static zzab zzj(InputStream inputStream) throws IOException {
            return (zzab) zzhbo.zzbk(zzc, inputStream);
        }

        public static zzab zzk(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzab) zzhbo.zzbl(zzc, inputStream, zzhayVar);
        }

        public static zzab zzl(zzhac zzhacVar) throws zzhcd {
            return (zzab) zzhbo.zzbm(zzc, zzhacVar);
        }

        public static zzab zzm(zzham zzhamVar) throws IOException {
            return (zzab) zzhbo.zzbn(zzc, zzhamVar);
        }

        public static zzab zzn(InputStream inputStream) throws IOException {
            return (zzab) zzhbo.zzbo(zzc, inputStream);
        }

        public static zzab zzo(ByteBuffer byteBuffer) throws zzhcd {
            return (zzab) zzhbo.zzbp(zzc, byteBuffer);
        }

        public static zzab zzp(byte[] bArr) throws zzhcd {
            return (zzab) zzhbo.zzbq(zzc, bArr);
        }

        public static zzab zzq(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzab) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
        }

        public static zzab zzr(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzab) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
        }

        public static zzab zzs(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzab) zzhbo.zzbu(zzc, inputStream, zzhayVar);
        }

        public static zzab zzt(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzab) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
        }

        public static zzab zzu(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzab) zzhbo.zzbx(zzc, bArr, zzhayVar);
        }

        public static zzhdm<zzab> zzv() {
            return zzc.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zzc.zze(), "zzg", zzb.zze()});
                case NEW_MUTABLE_INSTANCE:
                    return new zzab();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzc;
                case GET_PARSER:
                    zzhdm<zzab> zzhdmVar = zzd;
                    if (zzhdmVar == null) {
                        synchronized (zzab.class) {
                            try {
                                zzhdmVar = zzd;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzc);
                                    zzd = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzae
        public zzb zze() {
            zzb zzb2 = zzb.zzb(this.zzg);
            if (zzb2 == null) {
                return zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzae
        public zzc zzf() {
            zzc zzb2 = zzc.zzb(this.zzf);
            if (zzb2 == null) {
                return zzc.NETWORKTYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzae
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzae
        public boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzac extends zzhbo<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzc;
        private static volatile zzhdm<zzac> zzd;
        private int zze;
        private int zzf;
        private zzap zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzac, zza> implements zzad {
            private zza() {
                super(zzac.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzad
            public zzq zza() {
                return ((zzac) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzac) this.zza).zzB();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzac) this.zza).zzC();
                return this;
            }

            public zza zzd(zzap zzapVar) {
                zzbu();
                ((zzac) this.zza).zzD(zzapVar);
                return this;
            }

            public zza zze(zzap.zza zzaVar) {
                zzbu();
                ((zzac) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zza zzf(zzap zzapVar) {
                zzbu();
                ((zzac) this.zza).zzE(zzapVar);
                return this;
            }

            public zza zzg(zzq zzqVar) {
                zzbu();
                ((zzac) this.zza).zzF(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzad
            public zzap zzh() {
                return ((zzac) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzad
            public boolean zzi() {
                return ((zzac) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzad
            public boolean zzj() {
                return ((zzac) this.zza).zzj();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzc = zzacVar;
            zzhbo.zzca(zzac.class, zzacVar);
        }

        private zzac() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzac zzacVar) {
            return zzc.zzba(zzacVar);
        }

        public static zzac zzf() {
            return zzc;
        }

        public static zzac zzg(InputStream inputStream) throws IOException {
            return (zzac) zzhbo.zzbk(zzc, inputStream);
        }

        public static zzac zzk(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzac) zzhbo.zzbl(zzc, inputStream, zzhayVar);
        }

        public static zzac zzl(zzhac zzhacVar) throws zzhcd {
            return (zzac) zzhbo.zzbm(zzc, zzhacVar);
        }

        public static zzac zzm(zzham zzhamVar) throws IOException {
            return (zzac) zzhbo.zzbn(zzc, zzhamVar);
        }

        public static zzac zzn(InputStream inputStream) throws IOException {
            return (zzac) zzhbo.zzbo(zzc, inputStream);
        }

        public static zzac zzo(ByteBuffer byteBuffer) throws zzhcd {
            return (zzac) zzhbo.zzbp(zzc, byteBuffer);
        }

        public static zzac zzp(byte[] bArr) throws zzhcd {
            return (zzac) zzhbo.zzbq(zzc, bArr);
        }

        public static zzac zzq(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzac) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
        }

        public static zzac zzr(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzac) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
        }

        public static zzac zzs(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzac) zzhbo.zzbu(zzc, inputStream, zzhayVar);
        }

        public static zzac zzt(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzac) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
        }

        public static zzac zzu(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzac) zzhbo.zzbx(zzc, bArr, zzhayVar);
        }

        public static zzhdm<zzac> zzv() {
            return zzc.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzad
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzf);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzac();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzc;
                case GET_PARSER:
                    zzhdm<zzac> zzhdmVar = zzd;
                    if (zzhdmVar == null) {
                        synchronized (zzac.class) {
                            try {
                                zzhdmVar = zzd;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzc);
                                    zzd = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzad
        public zzap zzh() {
            zzap zzapVar = this.zzg;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzad
        public boolean zzi() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzad
        public boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzad extends zzhdf {
        zzq zza();

        zzap zzh();

        boolean zzi();

        boolean zzj();
    }

    /* loaded from: classes2.dex */
    public interface zzae extends zzhdf {
        zzab.zzb zze();

        zzab.zzc zzf();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes2.dex */
    public final class zzaf extends zzhbo<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzi;
        private static volatile zzhdm<zzaf> zzj;
        private int zzk;
        private int zzm;
        private int zzn;
        private long zzo;
        private long zzv;
        private int zzw;
        private zzhca<zza> zzl = zzhbo.zzbK();
        private String zzp = "";
        private String zzu = "";

        /* loaded from: classes2.dex */
        public final class zza extends zzhbo<zza, C0131zza> implements zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zzhbx<Integer, zzd.zza> zzn = new zzhbx<Integer, zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzaf.zza.1
                @Override // com.google.android.gms.internal.ads.zzhbx
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd.zza zzb(Integer num) {
                    zzd.zza zzb2 = zzd.zza.zzb(num.intValue());
                    if (zzb2 == null) {
                        return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    return zzb2;
                }
            };
            private static final zza zzo;
            private static volatile zzhdm<zza> zzp;
            private zzab zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private int zzF;
            private int zzG;
            private long zzH;
            private int zzu;
            private long zzv;
            private int zzw;
            private long zzx;
            private long zzy;
            private zzhbw zzz = zzhbo.zzbG();

            /* renamed from: com.google.android.gms.internal.ads.zzbdv$zzaf$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0131zza extends zzhbi<zza, C0131zza> implements zzb {
                private C0131zza() {
                    super(zza.zzo);
                }

                public C0131zza zzA() {
                    zzbu();
                    ((zza) this.zza).zzaI();
                    return this;
                }

                public C0131zza zzB() {
                    zzbu();
                    ((zza) this.zza).zzaJ();
                    return this;
                }

                public C0131zza zzC(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzcg(zzabVar);
                    return this;
                }

                public C0131zza zzD(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzch(zzqVar);
                    return this;
                }

                public C0131zza zzE(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzci(zzqVar);
                    return this;
                }

                public C0131zza zzF(int i9, zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzcj(i9, zzaVar);
                    return this;
                }

                public C0131zza zzG(int i9) {
                    zzbu();
                    ((zza) this.zza).zzck(i9);
                    return this;
                }

                public C0131zza zzH(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzcl(zzdVar);
                    return this;
                }

                public C0131zza zzI(zzab.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzcm(zzaVar.zzbr());
                    return this;
                }

                public C0131zza zzJ(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzcm(zzabVar);
                    return this;
                }

                public C0131zza zzK(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcn(zzqVar);
                    return this;
                }

                public C0131zza zzL(long j7) {
                    zzbu();
                    ((zza) this.zza).zzco(j7);
                    return this;
                }

                public C0131zza zzM(long j7) {
                    zzbu();
                    ((zza) this.zza).zzcp(j7);
                    return this;
                }

                public C0131zza zzN(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcq(zzqVar);
                    return this;
                }

                public C0131zza zzO(long j7) {
                    zzbu();
                    ((zza) this.zza).zzcr(j7);
                    return this;
                }

                public C0131zza zzP(long j7) {
                    zzbu();
                    ((zza) this.zza).zzcs(j7);
                    return this;
                }

                public C0131zza zzQ(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzct(zzqVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public zzd zzR() {
                    return ((zza) this.zza).zzR();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public List<zzd.zza> zzS() {
                    return ((zza) this.zza).zzS();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzT() {
                    return ((zza) this.zza).zzT();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzU() {
                    return ((zza) this.zza).zzU();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzV() {
                    return ((zza) this.zza).zzV();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzW() {
                    return ((zza) this.zza).zzW();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzX() {
                    return ((zza) this.zza).zzX();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzY() {
                    return ((zza) this.zza).zzY();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzZ() {
                    return ((zza) this.zza).zzZ();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public int zza() {
                    return ((zza) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzaa() {
                    return ((zza) this.zza).zzaa();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzab() {
                    return ((zza) this.zza).zzab();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzac() {
                    return ((zza) this.zza).zzac();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzad() {
                    return ((zza) this.zza).zzad();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public boolean zzae() {
                    return ((zza) this.zza).zzae();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public int zzb() {
                    return ((zza) this.zza).zzb();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public long zzc() {
                    return ((zza) this.zza).zzc();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public long zzd() {
                    return ((zza) this.zza).zzd();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public long zze() {
                    return ((zza) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public long zzf() {
                    return ((zza) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public zzd.zza zzg(int i9) {
                    return ((zza) this.zza).zzg(i9);
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public zzq zzh() {
                    return ((zza) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public zzq zzi() {
                    return ((zza) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public zzq zzj() {
                    return ((zza) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public zzq zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public zzq zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
                public zzab zzm() {
                    return ((zza) this.zza).zzm();
                }

                public C0131zza zzn(Iterable<? extends zzd.zza> iterable) {
                    zzbu();
                    ((zza) this.zza).zzav(iterable);
                    return this;
                }

                public C0131zza zzo(zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzaw(zzaVar);
                    return this;
                }

                public C0131zza zzp() {
                    zzbu();
                    ((zza) this.zza).zzax();
                    return this;
                }

                public C0131zza zzq() {
                    zzbu();
                    ((zza) this.zza).zzay();
                    return this;
                }

                public C0131zza zzr() {
                    zzbu();
                    ((zza) this.zza).zzaz();
                    return this;
                }

                public C0131zza zzs() {
                    zzbu();
                    ((zza) this.zza).zzaA();
                    return this;
                }

                public C0131zza zzt() {
                    zzbu();
                    ((zza) this.zza).zzaB();
                    return this;
                }

                public C0131zza zzu() {
                    zzbu();
                    ((zza) this.zza).zzaC();
                    return this;
                }

                public C0131zza zzv() {
                    zzbu();
                    ((zza) this.zza).zzaD();
                    return this;
                }

                public C0131zza zzw() {
                    zzbu();
                    ((zza) this.zza).zzaE();
                    return this;
                }

                public C0131zza zzx() {
                    zzbu();
                    ((zza) this.zza).zzaF();
                    return this;
                }

                public C0131zza zzy() {
                    zzbu();
                    ((zza) this.zza).zzaG();
                    return this;
                }

                public C0131zza zzz() {
                    zzbu();
                    ((zza) this.zza).zzaH();
                    return this;
                }

                public /* synthetic */ C0131zza(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzo = zzaVar;
                zzhbo.zzca(zza.class, zzaVar);
            }

            private zza() {
            }

            public static zza zzA(InputStream inputStream, zzhay zzhayVar) throws IOException {
                return (zza) zzhbo.zzbu(zzo, inputStream, zzhayVar);
            }

            public static zza zzB(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
                return (zza) zzhbo.zzbv(zzo, byteBuffer, zzhayVar);
            }

            public static zza zzC(byte[] bArr, zzhay zzhayVar) throws zzhcd {
                return (zza) zzhbo.zzbx(zzo, bArr, zzhayVar);
            }

            public static zzhdm<zza> zzD() {
                return zzo.zzbM();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaA() {
                this.zzu &= -257;
                this.zzE = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaB() {
                this.zzu &= -1025;
                this.zzG = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaC() {
                this.zzA = null;
                this.zzu &= -17;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaD() {
                this.zzu &= -513;
                this.zzF = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaE() {
                this.zzu &= -9;
                this.zzy = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaF() {
                this.zzu &= -5;
                this.zzx = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaG() {
                this.zzu &= -3;
                this.zzw = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaH() {
                this.zzu &= -2;
                this.zzv = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaI() {
                this.zzu &= -2049;
                this.zzH = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaJ() {
                this.zzu &= -33;
                this.zzB = 0;
            }

            private void zzaK() {
                zzhbw zzhbwVar = this.zzz;
                if (!zzhbwVar.zzc()) {
                    this.zzz = zzhbo.zzbH(zzhbwVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzav(Iterable<? extends zzd.zza> iterable) {
                zzaK();
                Iterator<? extends zzd.zza> it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzz.zzi(it.next().zza());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaw(zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaK();
                this.zzz.zzi(zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzax() {
                this.zzu &= -65;
                this.zzC = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzay() {
                this.zzu &= -129;
                this.zzD = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaz() {
                this.zzz = zzhbo.zzbG();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcg(zzab zzabVar) {
                zzabVar.getClass();
                zzab zzabVar2 = this.zzA;
                if (zzabVar2 != null && zzabVar2 != zzab.zzi()) {
                    zzab.zza zzc2 = zzab.zzc(zzabVar2);
                    zzc2.zzbj(zzabVar);
                    zzabVar = zzc2.zzbs();
                }
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzch(zzq zzqVar) {
                this.zzC = zzqVar.zza();
                this.zzu |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzci(zzq zzqVar) {
                this.zzD = zzqVar.zza();
                this.zzu |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcj(int i9, zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaK();
                this.zzz.zze(i9, zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzck(int i9) {
                this.zzu |= NotificationCompat.FLAG_LOCAL_ONLY;
                this.zzE = i9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcl(zzd zzdVar) {
                this.zzG = zzdVar.zza();
                this.zzu |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcm(zzab zzabVar) {
                zzabVar.getClass();
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcn(zzq zzqVar) {
                this.zzF = zzqVar.zza();
                this.zzu |= 512;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzco(long j7) {
                this.zzu |= 8;
                this.zzy = j7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcp(long j7) {
                this.zzu |= 4;
                this.zzx = j7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcq(zzq zzqVar) {
                this.zzw = zzqVar.zza();
                this.zzu |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcr(long j7) {
                this.zzu |= 1;
                this.zzv = j7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcs(long j7) {
                this.zzu |= 2048;
                this.zzH = j7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzct(zzq zzqVar) {
                this.zzB = zzqVar.zza();
                this.zzu |= 32;
            }

            public static C0131zza zzn() {
                return zzo.zzaZ();
            }

            public static C0131zza zzo(zza zzaVar) {
                return zzo.zzba(zzaVar);
            }

            public static zza zzq() {
                return zzo;
            }

            public static zza zzr(InputStream inputStream) throws IOException {
                return (zza) zzhbo.zzbk(zzo, inputStream);
            }

            public static zza zzs(InputStream inputStream, zzhay zzhayVar) throws IOException {
                return (zza) zzhbo.zzbl(zzo, inputStream, zzhayVar);
            }

            public static zza zzt(zzhac zzhacVar) throws zzhcd {
                return (zza) zzhbo.zzbm(zzo, zzhacVar);
            }

            public static zza zzu(zzham zzhamVar) throws IOException {
                return (zza) zzhbo.zzbn(zzo, zzhamVar);
            }

            public static zza zzv(InputStream inputStream) throws IOException {
                return (zza) zzhbo.zzbo(zzo, inputStream);
            }

            public static zza zzw(ByteBuffer byteBuffer) throws zzhcd {
                return (zza) zzhbo.zzbp(zzo, byteBuffer);
            }

            public static zza zzx(byte[] bArr) throws zzhcd {
                return (zza) zzhbo.zzbq(zzo, bArr);
            }

            public static zza zzy(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
                return (zza) zzhbo.zzbr(zzo, zzhacVar, zzhayVar);
            }

            public static zza zzz(zzham zzhamVar, zzhay zzhayVar) throws IOException {
                return (zza) zzhbo.zzbs(zzo, zzhamVar, zzhayVar);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public zzd zzR() {
                zzd zzb2 = zzd.zzb(this.zzG);
                if (zzb2 == null) {
                    return zzd.UNSPECIFIED;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public List<zzd.zza> zzS() {
                return new zzhby(this.zzz, zzn);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzT() {
                return (this.zzu & 64) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzU() {
                return (this.zzu & 128) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzV() {
                return (this.zzu & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzW() {
                return (this.zzu & 1024) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzX() {
                return (this.zzu & 16) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzY() {
                return (this.zzu & 512) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzZ() {
                return (this.zzu & 8) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public int zza() {
                return this.zzz.size();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzaa() {
                return (this.zzu & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzab() {
                return (this.zzu & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzac() {
                return (this.zzu & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzad() {
                return (this.zzu & 2048) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public boolean zzae() {
                return (this.zzu & 32) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public int zzb() {
                return this.zzE;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public long zzc() {
                return this.zzy;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public long zzd() {
                return this.zzx;
            }

            @Override // com.google.android.gms.internal.ads.zzhbo
            public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
                zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
                AnonymousClass1 anonymousClass1 = null;
                switch (zzhbnVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return zzhbo.zzbR(zzo, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", zzq.zze(), "zzx", "zzy", "zzz", zzd.zza.zze(), "zzA", "zzB", zzq.zze(), "zzC", zzq.zze(), "zzD", zzq.zze(), "zzE", "zzF", zzq.zze(), "zzG", zzd.zze(), "zzH"});
                    case NEW_MUTABLE_INSTANCE:
                        return new zza();
                    case NEW_BUILDER:
                        return new C0131zza(anonymousClass1);
                    case GET_DEFAULT_INSTANCE:
                        return zzo;
                    case GET_PARSER:
                        zzhdm<zza> zzhdmVar = zzp;
                        if (zzhdmVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzhdmVar = zzp;
                                    if (zzhdmVar == null) {
                                        zzhdmVar = new zzhbj(zzo);
                                        zzp = zzhdmVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzhdmVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public long zze() {
                return this.zzv;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public long zzf() {
                return this.zzH;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public zzd.zza zzg(int i9) {
                zzd.zza zzb2 = zzd.zza.zzb(this.zzz.zzd(i9));
                if (zzb2 == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public zzq zzh() {
                zzq zzb2 = zzq.zzb(this.zzC);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public zzq zzi() {
                zzq zzb2 = zzq.zzb(this.zzD);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public zzq zzj() {
                zzq zzb2 = zzq.zzb(this.zzF);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public zzq zzk() {
                zzq zzb2 = zzq.zzb(this.zzw);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public zzq zzl() {
                zzq zzb2 = zzq.zzb(this.zzB);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaf.zzb
            public zzab zzm() {
                zzab zzabVar = this.zzA;
                if (zzabVar == null) {
                    return zzab.zzi();
                }
                return zzabVar;
            }
        }

        /* loaded from: classes2.dex */
        public interface zzb extends zzhdf {
            zzd zzR();

            List<zzd.zza> zzS();

            boolean zzT();

            boolean zzU();

            boolean zzV();

            boolean zzW();

            boolean zzX();

            boolean zzY();

            boolean zzZ();

            int zza();

            boolean zzaa();

            boolean zzab();

            boolean zzac();

            boolean zzad();

            boolean zzae();

            int zzb();

            long zzc();

            long zzd();

            long zze();

            long zzf();

            zzd.zza zzg(int i9);

            zzq zzh();

            zzq zzi();

            zzq zzj();

            zzq zzk();

            zzq zzl();

            zzab zzm();
        }

        /* loaded from: classes2.dex */
        public final class zzc extends zzhbi<zzaf, zzc> implements zzag {
            private zzc() {
                super(zzaf.zzi);
            }

            public zzc zzA(int i9) {
                zzbu();
                ((zzaf) this.zza).zzaA(i9);
                return this;
            }

            public zzc zzB(long j7) {
                zzbu();
                ((zzaf) this.zza).zzaB(j7);
                return this;
            }

            public zzc zzC(int i9, zza.C0131zza c0131zza) {
                zzbu();
                ((zzaf) this.zza).zzaC(i9, c0131zza.zzbr());
                return this;
            }

            public zzc zzD(int i9, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaC(i9, zzaVar);
                return this;
            }

            public zzc zzE(int i9) {
                zzbu();
                ((zzaf) this.zza).zzaD(i9);
                return this;
            }

            public zzc zzF(long j7) {
                zzbu();
                ((zzaf) this.zza).zzaE(j7);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public zzhac zzG() {
                return ((zzaf) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public zzhac zzH() {
                return ((zzaf) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public String zzI() {
                return ((zzaf) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public String zzJ() {
                return ((zzaf) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public List<zza> zzK() {
                return Collections.unmodifiableList(((zzaf) this.zza).zzK());
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public boolean zzL() {
                return ((zzaf) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public boolean zzM() {
                return ((zzaf) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public boolean zzN() {
                return ((zzaf) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public boolean zzO() {
                return ((zzaf) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public boolean zzP() {
                return ((zzaf) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public boolean zzQ() {
                return ((zzaf) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public boolean zzR() {
                return ((zzaf) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public int zza() {
                return ((zzaf) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public int zzb() {
                return ((zzaf) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public int zzc() {
                return ((zzaf) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public int zzd() {
                return ((zzaf) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public long zze() {
                return ((zzaf) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public long zzf() {
                return ((zzaf) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzag
            public zza zzg(int i9) {
                return ((zzaf) this.zza).zzg(i9);
            }

            public zzc zzh(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzaf) this.zza).zzai(iterable);
                return this;
            }

            public zzc zzi(zza.C0131zza c0131zza) {
                zzbu();
                ((zzaf) this.zza).zzaj(c0131zza.zzbr());
                return this;
            }

            public zzc zzj(zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaj(zzaVar);
                return this;
            }

            public zzc zzk(int i9, zza.C0131zza c0131zza) {
                zzbu();
                ((zzaf) this.zza).zzak(i9, c0131zza.zzbr());
                return this;
            }

            public zzc zzl(int i9, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzak(i9, zzaVar);
                return this;
            }

            public zzc zzm() {
                zzbu();
                ((zzaf) this.zza).zzal();
                return this;
            }

            public zzc zzn() {
                zzbu();
                ((zzaf) this.zza).zzam();
                return this;
            }

            public zzc zzo() {
                zzbu();
                ((zzaf) this.zza).zzan();
                return this;
            }

            public zzc zzp() {
                zzbu();
                ((zzaf) this.zza).zzao();
                return this;
            }

            public zzc zzq() {
                zzbu();
                ((zzaf) this.zza).zzap();
                return this;
            }

            public zzc zzr() {
                zzbu();
                ((zzaf) this.zza).zzaq();
                return this;
            }

            public zzc zzs() {
                zzbu();
                ((zzaf) this.zza).zzar();
                return this;
            }

            public zzc zzt() {
                zzbu();
                ((zzaf) this.zza).zzas();
                return this;
            }

            public zzc zzu(int i9) {
                zzbu();
                ((zzaf) this.zza).zzau(i9);
                return this;
            }

            public zzc zzv(String str) {
                zzbu();
                ((zzaf) this.zza).zzav(str);
                return this;
            }

            public zzc zzw(zzhac zzhacVar) {
                zzbu();
                ((zzaf) this.zza).zzaw(zzhacVar);
                return this;
            }

            public zzc zzx(int i9) {
                zzbu();
                ((zzaf) this.zza).zzax(i9);
                return this;
            }

            public zzc zzy(String str) {
                zzbu();
                ((zzaf) this.zza).zzay(str);
                return this;
            }

            public zzc zzz(zzhac zzhacVar) {
                zzbu();
                ((zzaf) this.zza).zzaz(zzhacVar);
                return this;
            }

            public /* synthetic */ zzc(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public enum zzd implements zzhbs {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);

            public static final int zzg = 0;
            public static final int zzh = 1;
            public static final int zzi = 2;
            public static final int zzj = 3;
            public static final int zzk = 4;
            public static final int zzl = 5;
            private static final zzhbt<zzd> zzm = new zzhbt<zzd>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzaf.zzd.1
                @Override // com.google.android.gms.internal.ads.zzhbt
                /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public zzd zza(int i9) {
                    return zzd.zzb(i9);
                }
            };
            private final int zzo;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzhbu {
                static final zzhbu zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzhbu
                public boolean zza(int i9) {
                    if (zzd.zzb(i9) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i9) {
                this.zzo = i9;
            }

            public static zzd zzb(int i9) {
                if (i9 == 0) {
                    return UNSPECIFIED;
                }
                if (i9 == 1) {
                    return CONNECTING;
                }
                if (i9 == 2) {
                    return CONNECTED;
                }
                if (i9 == 3) {
                    return DISCONNECTING;
                }
                if (i9 == 4) {
                    return DISCONNECTED;
                }
                if (i9 != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static zzhbt<zzd> zzd() {
                return zzm;
            }

            public static zzhbu zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzhbs
            public final int zza() {
                return this.zzo;
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzi = zzafVar;
            zzhbo.zzca(zzaf.class, zzafVar);
        }

        private zzaf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA(int i9) {
            this.zzk |= 1;
            this.zzm = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB(long j7) {
            this.zzk |= 32;
            this.zzv = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC(int i9, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.set(i9, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD(int i9) {
            this.zzk |= 2;
            this.zzn = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(long j7) {
            this.zzk |= 4;
            this.zzo = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai(Iterable<? extends zza> iterable) {
            zzat();
            zzgzi.zzaQ(iterable, this.zzl);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(int i9, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(i9, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal() {
            this.zzk &= -9;
            this.zzp = zzl().zzI();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam() {
            this.zzk &= -65;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan() {
            this.zzk &= -17;
            this.zzu = zzl().zzJ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao() {
            this.zzk &= -2;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap() {
            this.zzk &= -33;
            this.zzv = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq() {
            this.zzl = zzhbo.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar() {
            this.zzk &= -3;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas() {
            this.zzk &= -5;
            this.zzo = 0L;
        }

        private void zzat() {
            zzhca<zza> zzhcaVar = this.zzl;
            if (!zzhcaVar.zzc()) {
                this.zzl = zzhbo.zzbL(zzhcaVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau(int i9) {
            zzat();
            this.zzl.remove(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(String str) {
            str.getClass();
            this.zzk |= 8;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw(zzhac zzhacVar) {
            this.zzp = zzhacVar.zzy();
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax(int i9) {
            this.zzk |= 64;
            this.zzw = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay(String str) {
            str.getClass();
            this.zzk |= 16;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz(zzhac zzhacVar) {
            this.zzu = zzhacVar.zzy();
            this.zzk |= 16;
        }

        public static zzc zzi() {
            return zzi.zzaZ();
        }

        public static zzc zzj(zzaf zzafVar) {
            return zzi.zzba(zzafVar);
        }

        public static zzaf zzl() {
            return zzi;
        }

        public static zzaf zzm(InputStream inputStream) throws IOException {
            return (zzaf) zzhbo.zzbk(zzi, inputStream);
        }

        public static zzaf zzn(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzaf) zzhbo.zzbl(zzi, inputStream, zzhayVar);
        }

        public static zzaf zzo(zzhac zzhacVar) throws zzhcd {
            return (zzaf) zzhbo.zzbm(zzi, zzhacVar);
        }

        public static zzaf zzp(zzham zzhamVar) throws IOException {
            return (zzaf) zzhbo.zzbn(zzi, zzhamVar);
        }

        public static zzaf zzq(InputStream inputStream) throws IOException {
            return (zzaf) zzhbo.zzbo(zzi, inputStream);
        }

        public static zzaf zzr(ByteBuffer byteBuffer) throws zzhcd {
            return (zzaf) zzhbo.zzbp(zzi, byteBuffer);
        }

        public static zzaf zzs(byte[] bArr) throws zzhcd {
            return (zzaf) zzhbo.zzbq(zzi, bArr);
        }

        public static zzaf zzt(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzaf) zzhbo.zzbr(zzi, zzhacVar, zzhayVar);
        }

        public static zzaf zzu(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzaf) zzhbo.zzbs(zzi, zzhamVar, zzhayVar);
        }

        public static zzaf zzv(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzaf) zzhbo.zzbu(zzi, inputStream, zzhayVar);
        }

        public static zzaf zzw(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzaf) zzhbo.zzbv(zzi, byteBuffer, zzhayVar);
        }

        public static zzaf zzx(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzaf) zzhbo.zzbx(zzi, bArr, zzhayVar);
        }

        public static zzhdm<zzaf> zzy() {
            return zzi.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public zzhac zzG() {
            return zzhac.zzw(this.zzp);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public zzhac zzH() {
            return zzhac.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public String zzI() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public String zzJ() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public List<zza> zzK() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public boolean zzL() {
            return (this.zzk & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public boolean zzM() {
            return (this.zzk & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public boolean zzN() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public boolean zzO() {
            return (this.zzk & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public boolean zzP() {
            return (this.zzk & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public boolean zzQ() {
            return (this.zzk & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public boolean zzR() {
            return (this.zzk & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public int zza() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public int zzb() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public int zzc() {
            return this.zzl.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public int zzd() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", zza.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzaf();
                case NEW_BUILDER:
                    return new zzc(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzi;
                case GET_PARSER:
                    zzhdm<zzaf> zzhdmVar = zzj;
                    if (zzhdmVar == null) {
                        synchronized (zzaf.class) {
                            try {
                                zzhdmVar = zzj;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzi);
                                    zzj = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public long zze() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public long zzf() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzag
        public zza zzg(int i9) {
            return this.zzl.get(i9);
        }

        public zzb zzh(int i9) {
            return this.zzl.get(i9);
        }

        public List<? extends zzb> zzz() {
            return this.zzl;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzag extends zzhdf {
        zzhac zzG();

        zzhac zzH();

        String zzI();

        String zzJ();

        List<zzaf.zza> zzK();

        boolean zzL();

        boolean zzM();

        boolean zzN();

        boolean zzO();

        boolean zzP();

        boolean zzQ();

        boolean zzR();

        int zza();

        int zzb();

        int zzc();

        int zzd();

        long zze();

        long zzf();

        zzaf.zza zzg(int i9);
    }

    /* loaded from: classes2.dex */
    public final class zzah extends zzhbo<zzah, zza> implements zzak {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private static final zzah zzl;
        private static volatile zzhdm<zzah> zzm;
        private int zzA;
        private int zzB;
        private zzai zzC;
        private int zzn;
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzah, zza> implements zzak {
            private zza() {
                super(zzah.zzl);
            }

            public zza zzA(int i9) {
                zzbu();
                ((zzah) this.zza).zzaA(i9);
                return this;
            }

            public zza zzB(int i9) {
                zzbu();
                ((zzah) this.zza).zzaB(i9);
                return this;
            }

            public zza zzC(int i9) {
                zzbu();
                ((zzah) this.zza).zzaC(i9);
                return this;
            }

            public zza zzD(zzai.zza zzaVar) {
                zzbu();
                ((zzah) this.zza).zzaD(zzaVar.zzbr());
                return this;
            }

            public zza zzE(zzai zzaiVar) {
                zzbu();
                ((zzah) this.zza).zzaD(zzaiVar);
                return this;
            }

            public zza zzF(int i9) {
                zzbu();
                ((zzah) this.zza).zzaE(i9);
                return this;
            }

            public zza zzG(int i9) {
                zzbu();
                ((zzah) this.zza).zzaF(i9);
                return this;
            }

            public zza zzH(int i9) {
                zzbu();
                ((zzah) this.zza).zzaG(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public zzai zzI() {
                return ((zzah) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzJ() {
                return ((zzah) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzK() {
                return ((zzah) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzL() {
                return ((zzah) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzM() {
                return ((zzah) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzN() {
                return ((zzah) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzO() {
                return ((zzah) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzP() {
                return ((zzah) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzQ() {
                return ((zzah) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzR() {
                return ((zzah) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzS() {
                return ((zzah) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public boolean zzT() {
                return ((zzah) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public int zza() {
                return ((zzah) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public int zzb() {
                return ((zzah) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public int zzc() {
                return ((zzah) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public int zzd() {
                return ((zzah) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public int zze() {
                return ((zzah) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public int zzf() {
                return ((zzah) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public int zzg() {
                return ((zzah) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public int zzh() {
                return ((zzah) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public zzq zzi() {
                return ((zzah) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzak
            public zzq zzj() {
                return ((zzah) this.zza).zzj();
            }

            public zza zzk() {
                zzbu();
                ((zzah) this.zza).zzak();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzah) this.zza).zzal();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzah) this.zza).zzam();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzah) this.zza).zzan();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzah) this.zza).zzao();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzah) this.zza).zzap();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzah) this.zza).zzaq();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzah) this.zza).zzar();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzah) this.zza).zzas();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzah) this.zza).zzat();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzah) this.zza).zzau();
                return this;
            }

            public zza zzv(zzai zzaiVar) {
                zzbu();
                ((zzah) this.zza).zzav(zzaiVar);
                return this;
            }

            public zza zzw(zzq zzqVar) {
                zzbu();
                ((zzah) this.zza).zzaw(zzqVar);
                return this;
            }

            public zza zzx(zzq zzqVar) {
                zzbu();
                ((zzah) this.zza).zzax(zzqVar);
                return this;
            }

            public zza zzy(int i9) {
                zzbu();
                ((zzah) this.zza).zzay(i9);
                return this;
            }

            public zza zzz(int i9) {
                zzbu();
                ((zzah) this.zza).zzaz(i9);
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzl = zzahVar;
            zzhbo.zzca(zzah.class, zzahVar);
        }

        private zzah() {
        }

        public static zzhdm<zzah> zzA() {
            return zzl.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA(int i9) {
            this.zzn |= 8;
            this.zzv = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB(int i9) {
            this.zzn |= 512;
            this.zzB = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC(int i9) {
            this.zzn |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.zzA = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD(zzai zzaiVar) {
            zzaiVar.getClass();
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(int i9) {
            this.zzn |= 4;
            this.zzu = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(int i9) {
            this.zzn |= 32;
            this.zzx = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG(int i9) {
            this.zzn |= 16;
            this.zzw = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal() {
            this.zzn &= -2;
            this.zzo = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam() {
            this.zzn &= -65;
            this.zzy = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan() {
            this.zzn &= -129;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao() {
            this.zzn &= -9;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap() {
            this.zzn &= -513;
            this.zzB = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq() {
            this.zzn &= -257;
            this.zzA = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar() {
            this.zzC = null;
            this.zzn &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas() {
            this.zzn &= -5;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat() {
            this.zzn &= -33;
            this.zzx = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau() {
            this.zzn &= -17;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(zzai zzaiVar) {
            zzaiVar.getClass();
            zzai zzaiVar2 = this.zzC;
            if (zzaiVar2 != null && zzaiVar2 != zzai.zzf()) {
                zzai.zza zzd2 = zzai.zzd(zzaiVar2);
                zzd2.zzbj(zzaiVar);
                zzaiVar = zzd2.zzbs();
            }
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax(zzq zzqVar) {
            this.zzo = zzqVar.zza();
            this.zzn |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay(int i9) {
            this.zzn |= 64;
            this.zzy = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz(int i9) {
            this.zzn |= 128;
            this.zzz = i9;
        }

        public static zza zzk() {
            return zzl.zzaZ();
        }

        public static zza zzl(zzah zzahVar) {
            return zzl.zzba(zzahVar);
        }

        public static zzah zzn() {
            return zzl;
        }

        public static zzah zzo(InputStream inputStream) throws IOException {
            return (zzah) zzhbo.zzbk(zzl, inputStream);
        }

        public static zzah zzp(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzah) zzhbo.zzbl(zzl, inputStream, zzhayVar);
        }

        public static zzah zzq(zzhac zzhacVar) throws zzhcd {
            return (zzah) zzhbo.zzbm(zzl, zzhacVar);
        }

        public static zzah zzr(zzham zzhamVar) throws IOException {
            return (zzah) zzhbo.zzbn(zzl, zzhamVar);
        }

        public static zzah zzs(InputStream inputStream) throws IOException {
            return (zzah) zzhbo.zzbo(zzl, inputStream);
        }

        public static zzah zzt(ByteBuffer byteBuffer) throws zzhcd {
            return (zzah) zzhbo.zzbp(zzl, byteBuffer);
        }

        public static zzah zzu(byte[] bArr) throws zzhcd {
            return (zzah) zzhbo.zzbq(zzl, bArr);
        }

        public static zzah zzv(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzah) zzhbo.zzbr(zzl, zzhacVar, zzhayVar);
        }

        public static zzah zzw(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzah) zzhbo.zzbs(zzl, zzhamVar, zzhayVar);
        }

        public static zzah zzx(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzah) zzhbo.zzbu(zzl, inputStream, zzhayVar);
        }

        public static zzah zzy(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzah) zzhbo.zzbv(zzl, byteBuffer, zzhayVar);
        }

        public static zzah zzz(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzah) zzhbo.zzbx(zzl, bArr, zzhayVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public zzai zzI() {
            zzai zzaiVar = this.zzC;
            if (zzaiVar == null) {
                return zzai.zzf();
            }
            return zzaiVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzJ() {
            return (this.zzn & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzK() {
            return (this.zzn & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzL() {
            return (this.zzn & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzM() {
            return (this.zzn & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzN() {
            return (this.zzn & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzO() {
            return (this.zzn & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzP() {
            return (this.zzn & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzQ() {
            return (this.zzn & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzR() {
            return (this.zzn & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzS() {
            return (this.zzn & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public boolean zzT() {
            return (this.zzn & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public int zza() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public int zzb() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public int zzc() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public int zzd() {
            return this.zzB;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzl, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", zzq.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzah();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzl;
                case GET_PARSER:
                    zzhdm<zzah> zzhdmVar = zzm;
                    if (zzhdmVar == null) {
                        synchronized (zzah.class) {
                            try {
                                zzhdmVar = zzm;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzl);
                                    zzm = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public int zze() {
            return this.zzA;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public int zzf() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public int zzg() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public int zzh() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public zzq zzi() {
            zzq zzb2 = zzq.zzb(this.zzp);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzak
        public zzq zzj() {
            zzq zzb2 = zzq.zzb(this.zzo);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzai extends zzhbo<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzc;
        private static volatile zzhdm<zzai> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzai, zza> implements zzaj {
            private zza() {
                super(zzai.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaj
            public int zza() {
                return ((zzai) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaj
            public int zzb() {
                return ((zzai) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzai) this.zza).zzz();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzai) this.zza).zzA();
                return this;
            }

            public zza zze(int i9) {
                zzbu();
                ((zzai) this.zza).zzB(i9);
                return this;
            }

            public zza zzf(int i9) {
                zzbu();
                ((zzai) this.zza).zzC(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaj
            public boolean zzg() {
                return ((zzai) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaj
            public boolean zzh() {
                return ((zzai) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzc = zzaiVar;
            zzhbo.zzca(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB(int i9) {
            this.zze |= 1;
            this.zzf = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i9) {
            this.zze |= 2;
            this.zzg = i9;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzai zzaiVar) {
            return zzc.zzba(zzaiVar);
        }

        public static zzai zzf() {
            return zzc;
        }

        public static zzai zzi(InputStream inputStream) throws IOException {
            return (zzai) zzhbo.zzbk(zzc, inputStream);
        }

        public static zzai zzj(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzai) zzhbo.zzbl(zzc, inputStream, zzhayVar);
        }

        public static zzai zzk(zzhac zzhacVar) throws zzhcd {
            return (zzai) zzhbo.zzbm(zzc, zzhacVar);
        }

        public static zzai zzl(zzham zzhamVar) throws IOException {
            return (zzai) zzhbo.zzbn(zzc, zzhamVar);
        }

        public static zzai zzm(InputStream inputStream) throws IOException {
            return (zzai) zzhbo.zzbo(zzc, inputStream);
        }

        public static zzai zzn(ByteBuffer byteBuffer) throws zzhcd {
            return (zzai) zzhbo.zzbp(zzc, byteBuffer);
        }

        public static zzai zzo(byte[] bArr) throws zzhcd {
            return (zzai) zzhbo.zzbq(zzc, bArr);
        }

        public static zzai zzp(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzai) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
        }

        public static zzai zzq(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzai) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
        }

        public static zzai zzr(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzai) zzhbo.zzbu(zzc, inputStream, zzhayVar);
        }

        public static zzai zzs(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzai) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
        }

        public static zzai zzt(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzai) zzhbo.zzbx(zzc, bArr, zzhayVar);
        }

        public static zzhdm<zzai> zzu() {
            return zzc.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzz() {
            this.zze &= -2;
            this.zzf = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaj
        public int zza() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaj
        public int zzb() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzai();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzc;
                case GET_PARSER:
                    zzhdm<zzai> zzhdmVar = zzd;
                    if (zzhdmVar == null) {
                        synchronized (zzai.class) {
                            try {
                                zzhdmVar = zzd;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzc);
                                    zzd = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaj
        public boolean zzg() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaj
        public boolean zzh() {
            return (this.zze & 2) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzaj extends zzhdf {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes2.dex */
    public interface zzak extends zzhdf {
        zzai zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        boolean zzM();

        boolean zzN();

        boolean zzO();

        boolean zzP();

        boolean zzQ();

        boolean zzR();

        boolean zzS();

        boolean zzT();

        int zza();

        int zzb();

        int zzc();

        int zzd();

        int zze();

        int zzf();

        int zzg();

        int zzh();

        zzq zzi();

        zzq zzj();
    }

    /* loaded from: classes2.dex */
    public final class zzal extends zzhbo<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzc;
        private static volatile zzhdm<zzal> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzal, zza> implements zzam {
            private zza() {
                super(zzal.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzam
            public int zza() {
                return ((zzal) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzam
            public int zzb() {
                return ((zzal) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzal) this.zza).zzz();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzal) this.zza).zzA();
                return this;
            }

            public zza zze(int i9) {
                zzbu();
                ((zzal) this.zza).zzB(i9);
                return this;
            }

            public zza zzf(int i9) {
                zzbu();
                ((zzal) this.zza).zzC(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzam
            public boolean zzg() {
                return ((zzal) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzam
            public boolean zzh() {
                return ((zzal) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzc = zzalVar;
            zzhbo.zzca(zzal.class, zzalVar);
        }

        private zzal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB(int i9) {
            this.zze |= 2;
            this.zzg = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i9) {
            this.zze |= 1;
            this.zzf = i9;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzal zzalVar) {
            return zzc.zzba(zzalVar);
        }

        public static zzal zzf() {
            return zzc;
        }

        public static zzal zzi(InputStream inputStream) throws IOException {
            return (zzal) zzhbo.zzbk(zzc, inputStream);
        }

        public static zzal zzj(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzal) zzhbo.zzbl(zzc, inputStream, zzhayVar);
        }

        public static zzal zzk(zzhac zzhacVar) throws zzhcd {
            return (zzal) zzhbo.zzbm(zzc, zzhacVar);
        }

        public static zzal zzl(zzham zzhamVar) throws IOException {
            return (zzal) zzhbo.zzbn(zzc, zzhamVar);
        }

        public static zzal zzm(InputStream inputStream) throws IOException {
            return (zzal) zzhbo.zzbo(zzc, inputStream);
        }

        public static zzal zzn(ByteBuffer byteBuffer) throws zzhcd {
            return (zzal) zzhbo.zzbp(zzc, byteBuffer);
        }

        public static zzal zzo(byte[] bArr) throws zzhcd {
            return (zzal) zzhbo.zzbq(zzc, bArr);
        }

        public static zzal zzp(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzal) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
        }

        public static zzal zzq(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzal) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
        }

        public static zzal zzr(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzal) zzhbo.zzbu(zzc, inputStream, zzhayVar);
        }

        public static zzal zzs(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzal) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
        }

        public static zzal zzt(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzal) zzhbo.zzbx(zzc, bArr, zzhayVar);
        }

        public static zzhdm<zzal> zzu() {
            return zzc.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzz() {
            this.zze &= -3;
            this.zzg = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzam
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzam
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzal();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzc;
                case GET_PARSER:
                    zzhdm<zzal> zzhdmVar = zzd;
                    if (zzhdmVar == null) {
                        synchronized (zzal.class) {
                            try {
                                zzhdmVar = zzd;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzc);
                                    zzd = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzam
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzam
        public boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzam extends zzhdf {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes2.dex */
    public final class zzan extends zzhbo<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzd;
        private static volatile zzhdm<zzan> zze;
        private int zzf;
        private String zzg = "";
        private int zzh;
        private zzap zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzan, zza> implements zzao {
            private zza() {
                super(zzan.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzao
            public zzq zza() {
                return ((zzan) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzan) this.zza).zzH();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzan) this.zza).zzI();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzan) this.zza).zzJ();
                return this;
            }

            public zza zze(zzap zzapVar) {
                zzbu();
                ((zzan) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzf(String str) {
                zzbu();
                ((zzan) this.zza).zzL(str);
                return this;
            }

            public zza zzg(zzhac zzhacVar) {
                zzbu();
                ((zzan) this.zza).zzM(zzhacVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbu();
                ((zzan) this.zza).zzN(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbu();
                ((zzan) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzj(zzq zzqVar) {
                zzbu();
                ((zzan) this.zza).zzO(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzao
            public zzap zzk() {
                return ((zzan) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzao
            public zzhac zzl() {
                return ((zzan) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzao
            public String zzm() {
                return ((zzan) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzao
            public boolean zzn() {
                return ((zzan) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzao
            public boolean zzo() {
                return ((zzan) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzao
            public boolean zzp() {
                return ((zzan) this.zza).zzp();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzd = zzanVar;
            zzhbo.zzca(zzan.class, zzanVar);
        }

        private zzan() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzf &= -2;
            this.zzg = zzf().zzm();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzhac zzhacVar) {
            this.zzg = zzhacVar.zzy();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zzf |= 2;
        }

        public static zza zzc() {
            return zzd.zzaZ();
        }

        public static zza zzd(zzan zzanVar) {
            return zzd.zzba(zzanVar);
        }

        public static zzan zzf() {
            return zzd;
        }

        public static zzan zzg(InputStream inputStream) throws IOException {
            return (zzan) zzhbo.zzbk(zzd, inputStream);
        }

        public static zzan zzh(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzan) zzhbo.zzbl(zzd, inputStream, zzhayVar);
        }

        public static zzan zzi(zzhac zzhacVar) throws zzhcd {
            return (zzan) zzhbo.zzbm(zzd, zzhacVar);
        }

        public static zzan zzj(zzham zzhamVar) throws IOException {
            return (zzan) zzhbo.zzbn(zzd, zzhamVar);
        }

        public static zzan zzq(InputStream inputStream) throws IOException {
            return (zzan) zzhbo.zzbo(zzd, inputStream);
        }

        public static zzan zzr(ByteBuffer byteBuffer) throws zzhcd {
            return (zzan) zzhbo.zzbp(zzd, byteBuffer);
        }

        public static zzan zzs(byte[] bArr) throws zzhcd {
            return (zzan) zzhbo.zzbq(zzd, bArr);
        }

        public static zzan zzt(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzan) zzhbo.zzbr(zzd, zzhacVar, zzhayVar);
        }

        public static zzan zzu(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzan) zzhbo.zzbs(zzd, zzhamVar, zzhayVar);
        }

        public static zzan zzv(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzan) zzhbo.zzbu(zzd, inputStream, zzhayVar);
        }

        public static zzan zzw(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzan) zzhbo.zzbv(zzd, byteBuffer, zzhayVar);
        }

        public static zzan zzx(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzan) zzhbo.zzbx(zzd, bArr, zzhayVar);
        }

        public static zzhdm<zzan> zzy() {
            return zzd.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzao
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzh);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", zzq.zze(), "zzi"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzan();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzd;
                case GET_PARSER:
                    zzhdm<zzan> zzhdmVar = zze;
                    if (zzhdmVar == null) {
                        synchronized (zzan.class) {
                            try {
                                zzhdmVar = zze;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzd);
                                    zze = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzao
        public zzap zzk() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzao
        public zzhac zzl() {
            return zzhac.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzao
        public String zzm() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzao
        public boolean zzn() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzao
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzao
        public boolean zzp() {
            return (this.zzf & 2) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzao extends zzhdf {
        zzq zza();

        zzap zzk();

        zzhac zzl();

        String zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* loaded from: classes2.dex */
    public final class zzap extends zzhbo<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzc;
        private static volatile zzhdm<zzap> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzap, zza> implements zzaq {
            private zza() {
                super(zzap.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaq
            public int zza() {
                return ((zzap) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaq
            public int zzb() {
                return ((zzap) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzap) this.zza).zzz();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzap) this.zza).zzA();
                return this;
            }

            public zza zze(int i9) {
                zzbu();
                ((zzap) this.zza).zzB(i9);
                return this;
            }

            public zza zzf(int i9) {
                zzbu();
                ((zzap) this.zza).zzC(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaq
            public boolean zzg() {
                return ((zzap) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaq
            public boolean zzh() {
                return ((zzap) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzc = zzapVar;
            zzhbo.zzca(zzap.class, zzapVar);
        }

        private zzap() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB(int i9) {
            this.zze |= 2;
            this.zzg = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i9) {
            this.zze |= 1;
            this.zzf = i9;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzap zzapVar) {
            return zzc.zzba(zzapVar);
        }

        public static zzap zzf() {
            return zzc;
        }

        public static zzap zzi(InputStream inputStream) throws IOException {
            return (zzap) zzhbo.zzbk(zzc, inputStream);
        }

        public static zzap zzj(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzap) zzhbo.zzbl(zzc, inputStream, zzhayVar);
        }

        public static zzap zzk(zzhac zzhacVar) throws zzhcd {
            return (zzap) zzhbo.zzbm(zzc, zzhacVar);
        }

        public static zzap zzl(zzham zzhamVar) throws IOException {
            return (zzap) zzhbo.zzbn(zzc, zzhamVar);
        }

        public static zzap zzm(InputStream inputStream) throws IOException {
            return (zzap) zzhbo.zzbo(zzc, inputStream);
        }

        public static zzap zzn(ByteBuffer byteBuffer) throws zzhcd {
            return (zzap) zzhbo.zzbp(zzc, byteBuffer);
        }

        public static zzap zzo(byte[] bArr) throws zzhcd {
            return (zzap) zzhbo.zzbq(zzc, bArr);
        }

        public static zzap zzp(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzap) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
        }

        public static zzap zzq(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzap) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
        }

        public static zzap zzr(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzap) zzhbo.zzbu(zzc, inputStream, zzhayVar);
        }

        public static zzap zzs(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzap) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
        }

        public static zzap zzt(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzap) zzhbo.zzbx(zzc, bArr, zzhayVar);
        }

        public static zzhdm<zzap> zzu() {
            return zzc.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzz() {
            this.zze &= -3;
            this.zzg = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaq
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaq
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzap();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzc;
                case GET_PARSER:
                    zzhdm<zzap> zzhdmVar = zzd;
                    if (zzhdmVar == null) {
                        synchronized (zzap.class) {
                            try {
                                zzhdmVar = zzd;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzc);
                                    zzd = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaq
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaq
        public boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzaq extends zzhdf {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes2.dex */
    public final class zzar extends zzhbo<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzd;
        private static volatile zzhdm<zzar> zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzar, zza> implements zzas {
            private zza() {
                super(zzar.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzas
            public int zza() {
                return ((zzar) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzas
            public int zzb() {
                return ((zzar) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzas
            public int zzc() {
                return ((zzar) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzar) this.zza).zzD();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzar) this.zza).zzE();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzar) this.zza).zzF();
                return this;
            }

            public zza zzg(int i9) {
                zzbu();
                ((zzar) this.zza).zzG(i9);
                return this;
            }

            public zza zzh(int i9) {
                zzbu();
                ((zzar) this.zza).zzH(i9);
                return this;
            }

            public zza zzi(int i9) {
                zzbu();
                ((zzar) this.zza).zzI(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzas
            public boolean zzj() {
                return ((zzar) this.zza).zzj();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzas
            public boolean zzk() {
                return ((zzar) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzas
            public boolean zzl() {
                return ((zzar) this.zza).zzl();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzd = zzarVar;
            zzhbo.zzca(zzar.class, zzarVar);
        }

        private zzar() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD() {
            this.zzf &= -2;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE() {
            this.zzf &= -5;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG(int i9) {
            this.zzf |= 1;
            this.zzg = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH(int i9) {
            this.zzf |= 4;
            this.zzi = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i9) {
            this.zzf |= 2;
            this.zzh = i9;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zze(zzar zzarVar) {
            return zzd.zzba(zzarVar);
        }

        public static zzar zzg() {
            return zzd;
        }

        public static zzar zzh(InputStream inputStream) throws IOException {
            return (zzar) zzhbo.zzbk(zzd, inputStream);
        }

        public static zzar zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzar) zzhbo.zzbl(zzd, inputStream, zzhayVar);
        }

        public static zzar zzm(zzhac zzhacVar) throws zzhcd {
            return (zzar) zzhbo.zzbm(zzd, zzhacVar);
        }

        public static zzar zzn(zzham zzhamVar) throws IOException {
            return (zzar) zzhbo.zzbn(zzd, zzhamVar);
        }

        public static zzar zzo(InputStream inputStream) throws IOException {
            return (zzar) zzhbo.zzbo(zzd, inputStream);
        }

        public static zzar zzp(ByteBuffer byteBuffer) throws zzhcd {
            return (zzar) zzhbo.zzbp(zzd, byteBuffer);
        }

        public static zzar zzq(byte[] bArr) throws zzhcd {
            return (zzar) zzhbo.zzbq(zzd, bArr);
        }

        public static zzar zzr(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzar) zzhbo.zzbr(zzd, zzhacVar, zzhayVar);
        }

        public static zzar zzs(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzar) zzhbo.zzbs(zzd, zzhamVar, zzhayVar);
        }

        public static zzar zzt(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzar) zzhbo.zzbu(zzd, inputStream, zzhayVar);
        }

        public static zzar zzu(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzar) zzhbo.zzbv(zzd, byteBuffer, zzhayVar);
        }

        public static zzar zzv(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzar) zzhbo.zzbx(zzd, bArr, zzhayVar);
        }

        public static zzhdm<zzar> zzw() {
            return zzd.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzas
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzas
        public int zzb() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzas
        public int zzc() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzar();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzd;
                case GET_PARSER:
                    zzhdm<zzar> zzhdmVar = zze;
                    if (zzhdmVar == null) {
                        synchronized (zzar.class) {
                            try {
                                zzhdmVar = zze;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzd);
                                    zze = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzas
        public boolean zzj() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzas
        public boolean zzk() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzas
        public boolean zzl() {
            return (this.zzf & 2) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzas extends zzhdf {
        int zza();

        int zzb();

        int zzc();

        boolean zzj();

        boolean zzk();

        boolean zzl();
    }

    /* loaded from: classes2.dex */
    public final class zzat extends zzhbo<zzat, zza> implements zzbi {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private static final zzat zzu;
        private static volatile zzhdm<zzat> zzv;
        private zzbj zzA;
        private zzau zzB;
        private zzbc zzC;
        private zzay zzD;
        private int zzE;
        private int zzF;
        private zzap zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private int zzK;
        private int zzL;
        private long zzM;
        private int zzw;
        private zzba zzx;
        private zzbe zzy;
        private zzbg zzz;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzat, zza> implements zzbi {
            private zza() {
                super(zzat.zzu);
            }

            public zza zzA(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcx(zzayVar);
                return this;
            }

            public zza zzB(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcy(zzbaVar);
                return this;
            }

            public zza zzC(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcz(zzbcVar);
                return this;
            }

            public zza zzD(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcA(zzbeVar);
                return this;
            }

            public zza zzE(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcB(zzbgVar);
                return this;
            }

            public zza zzF(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcC(zzapVar);
                return this;
            }

            public zza zzG(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcD(zzbjVar);
                return this;
            }

            public zza zzH(zzau.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcE(zzaVar.zzbr());
                return this;
            }

            public zza zzI(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcE(zzauVar);
                return this;
            }

            public zza zzJ(zzay.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zza zzK(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzayVar);
                return this;
            }

            public zza zzL(zzba.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzaVar.zzbr());
                return this;
            }

            public zza zzM(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzbaVar);
                return this;
            }

            public zza zzN(zzbc.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zza zzO(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzbcVar);
                return this;
            }

            public zza zzP(zzbe.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zza zzQ(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzbeVar);
                return this;
            }

            public zza zzR(zzbg.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zza zzS(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcJ(zzbgVar);
                return this;
            }

            public zza zzT(int i9) {
                zzbu();
                ((zzat) this.zza).zzcK(i9);
                return this;
            }

            public zza zzU(int i9) {
                zzbu();
                ((zzat) this.zza).zzcL(i9);
                return this;
            }

            public zza zzV(int i9) {
                zzbu();
                ((zzat) this.zza).zzcM(i9);
                return this;
            }

            public zza zzW(int i9) {
                zzbu();
                ((zzat) this.zza).zzcN(i9);
                return this;
            }

            public zza zzX(int i9) {
                zzbu();
                ((zzat) this.zza).zzcO(i9);
                return this;
            }

            public zza zzY(int i9) {
                zzbu();
                ((zzat) this.zza).zzcP(i9);
                return this;
            }

            public zza zzZ(int i9) {
                zzbu();
                ((zzat) this.zza).zzcQ(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public int zza() {
                return ((zzat) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzaA() {
                return ((zzat) this.zza).zzaA();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzaB() {
                return ((zzat) this.zza).zzaB();
            }

            public zza zzaa(zzap.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcR(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcR(zzapVar);
                return this;
            }

            public zza zzac(long j7) {
                zzbu();
                ((zzat) this.zza).zzcS(j7);
                return this;
            }

            public zza zzad(zzbj.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcT(zzaVar.zzbr());
                return this;
            }

            public zza zzae(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcT(zzbjVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public zzau zzaf() {
                return ((zzat) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public zzay zzag() {
                return ((zzat) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public zzba zzah() {
                return ((zzat) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public zzbc zzai() {
                return ((zzat) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public zzbe zzaj() {
                return ((zzat) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public zzbg zzak() {
                return ((zzat) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public zzbj zzal() {
                return ((zzat) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzam() {
                return ((zzat) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzan() {
                return ((zzat) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzao() {
                return ((zzat) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzap() {
                return ((zzat) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzaq() {
                return ((zzat) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzar() {
                return ((zzat) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzas() {
                return ((zzat) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzat() {
                return ((zzat) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzau() {
                return ((zzat) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzav() {
                return ((zzat) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzaw() {
                return ((zzat) this.zza).zzaw();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzax() {
                return ((zzat) this.zza).zzax();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzay() {
                return ((zzat) this.zza).zzay();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public boolean zzaz() {
                return ((zzat) this.zza).zzaz();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public int zzb() {
                return ((zzat) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public int zzc() {
                return ((zzat) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public int zzd() {
                return ((zzat) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public int zze() {
                return ((zzat) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public int zzf() {
                return ((zzat) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public int zzg() {
                return ((zzat) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public long zzh() {
                return ((zzat) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
            public zzap zzi() {
                return ((zzat) this.zza).zzi();
            }

            public zza zzj() {
                zzbu();
                ((zzat) this.zza).zzcg();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzat) this.zza).zzch();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzat) this.zza).zzci();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzat) this.zza).zzcj();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzat) this.zza).zzck();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzat) this.zza).zzcl();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzat) this.zza).zzcm();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzat) this.zza).zzcn();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzat) this.zza).zzco();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzat) this.zza).zzcp();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzat) this.zza).zzcq();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzat) this.zza).zzcr();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzat) this.zza).zzcs();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzat) this.zza).zzct();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzat) this.zza).zzcu();
                return this;
            }

            public zza zzy() {
                zzbu();
                ((zzat) this.zza).zzcv();
                return this;
            }

            public zza zzz(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcw(zzauVar);
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzu = zzatVar;
            zzhbo.zzca(zzat.class, zzatVar);
        }

        private zzat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(zzbe zzbeVar) {
            zzbeVar.getClass();
            zzbe zzbeVar2 = this.zzy;
            if (zzbeVar2 != null && zzbeVar2 != zzbe.zzj()) {
                zzbe.zza zzh2 = zzbe.zzh(zzbeVar2);
                zzh2.zzbj(zzbeVar);
                zzbeVar = zzh2.zzbs();
            }
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(zzbg zzbgVar) {
            zzbgVar.getClass();
            zzbg zzbgVar2 = this.zzz;
            if (zzbgVar2 != null && zzbgVar2 != zzbg.zzg()) {
                zzbg.zza zze2 = zzbg.zze(zzbgVar2);
                zze2.zzbj(zzbgVar);
                zzbgVar = zze2.zzbs();
            }
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzG;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzbj zzbjVar) {
            zzbjVar.getClass();
            zzbj zzbjVar2 = this.zzA;
            if (zzbjVar2 != null && zzbjVar2 != zzbj.zzf()) {
                zzbj.zza zzd2 = zzbj.zzd(zzbjVar2);
                zzd2.zzbj(zzbjVar);
                zzbjVar = zzd2.zzbs();
            }
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(zzau zzauVar) {
            zzauVar.getClass();
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzay zzayVar) {
            zzayVar.getClass();
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(zzba zzbaVar) {
            zzbaVar.getClass();
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzbc zzbcVar) {
            zzbcVar.getClass();
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzbe zzbeVar) {
            zzbeVar.getClass();
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzbg zzbgVar) {
            zzbgVar.getClass();
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(int i9) {
            this.zzw |= FragmentTransaction.TRANSIT_EXIT_MASK;
            this.zzK = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(int i9) {
            this.zzw |= 16384;
            this.zzL = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcM(int i9) {
            this.zzw |= 1024;
            this.zzH = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcN(int i9) {
            this.zzw |= 128;
            this.zzE = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcO(int i9) {
            this.zzw |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.zzF = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcP(int i9) {
            this.zzw |= 2048;
            this.zzI = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcQ(int i9) {
            this.zzw |= 4096;
            this.zzJ = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcR(zzap zzapVar) {
            zzapVar.getClass();
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcS(long j7) {
            this.zzw |= 32768;
            this.zzM = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcT(zzbj zzbjVar) {
            zzbjVar.getClass();
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcg() {
            this.zzB = null;
            this.zzw &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzD = null;
            this.zzw &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzx = null;
            this.zzw &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzC = null;
            this.zzw &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzy = null;
            this.zzw &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzz = null;
            this.zzw &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzw &= -8193;
            this.zzK = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzw &= -16385;
            this.zzL = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzw &= -1025;
            this.zzH = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp() {
            this.zzw &= -129;
            this.zzE = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq() {
            this.zzw &= -257;
            this.zzF = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr() {
            this.zzw &= -2049;
            this.zzI = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs() {
            this.zzw &= -4097;
            this.zzJ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct() {
            this.zzG = null;
            this.zzw &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu() {
            this.zzw &= -32769;
            this.zzM = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv() {
            this.zzA = null;
            this.zzw &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw(zzau zzauVar) {
            zzauVar.getClass();
            zzau zzauVar2 = this.zzB;
            if (zzauVar2 != null && zzauVar2 != zzau.zzf()) {
                zzau.zza zzd2 = zzau.zzd(zzauVar2);
                zzd2.zzbj(zzauVar);
                zzauVar = zzd2.zzbs();
            }
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzay zzayVar) {
            zzayVar.getClass();
            zzay zzayVar2 = this.zzD;
            if (zzayVar2 != null && zzayVar2 != zzay.zzh()) {
                zzay.zza zzf2 = zzay.zzf(zzayVar2);
                zzf2.zzbj(zzayVar);
                zzayVar = zzf2.zzbs();
            }
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzba zzbaVar) {
            zzbaVar.getClass();
            zzba zzbaVar2 = this.zzx;
            if (zzbaVar2 != null && zzbaVar2 != zzba.zzi()) {
                zzba.zza zzg2 = zzba.zzg(zzbaVar2);
                zzg2.zzbj(zzbaVar);
                zzbaVar = zzg2.zzbs();
            }
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzbc zzbcVar) {
            zzbcVar.getClass();
            zzbc zzbcVar2 = this.zzC;
            if (zzbcVar2 != null && zzbcVar2 != zzbc.zzg()) {
                zzbc.zza zze2 = zzbc.zze(zzbcVar2);
                zze2.zzbj(zzbcVar);
                zzbcVar = zze2.zzbs();
            }
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        public static zza zzj() {
            return zzu.zzaZ();
        }

        public static zza zzk(zzat zzatVar) {
            return zzu.zzba(zzatVar);
        }

        public static zzat zzm() {
            return zzu;
        }

        public static zzat zzn(InputStream inputStream) throws IOException {
            return (zzat) zzhbo.zzbk(zzu, inputStream);
        }

        public static zzat zzo(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzat) zzhbo.zzbl(zzu, inputStream, zzhayVar);
        }

        public static zzat zzp(zzhac zzhacVar) throws zzhcd {
            return (zzat) zzhbo.zzbm(zzu, zzhacVar);
        }

        public static zzat zzq(zzham zzhamVar) throws IOException {
            return (zzat) zzhbo.zzbn(zzu, zzhamVar);
        }

        public static zzat zzr(InputStream inputStream) throws IOException {
            return (zzat) zzhbo.zzbo(zzu, inputStream);
        }

        public static zzat zzs(ByteBuffer byteBuffer) throws zzhcd {
            return (zzat) zzhbo.zzbp(zzu, byteBuffer);
        }

        public static zzat zzt(byte[] bArr) throws zzhcd {
            return (zzat) zzhbo.zzbq(zzu, bArr);
        }

        public static zzat zzu(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzat) zzhbo.zzbr(zzu, zzhacVar, zzhayVar);
        }

        public static zzat zzv(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzat) zzhbo.zzbs(zzu, zzhamVar, zzhayVar);
        }

        public static zzat zzw(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzat) zzhbo.zzbu(zzu, inputStream, zzhayVar);
        }

        public static zzat zzx(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzat) zzhbo.zzbv(zzu, byteBuffer, zzhayVar);
        }

        public static zzat zzy(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzat) zzhbo.zzbx(zzu, bArr, zzhayVar);
        }

        public static zzhdm<zzat> zzz() {
            return zzu.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public int zza() {
            return this.zzK;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzaA() {
            return (this.zzw & 32768) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzaB() {
            return (this.zzw & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public zzau zzaf() {
            zzau zzauVar = this.zzB;
            if (zzauVar == null) {
                return zzau.zzf();
            }
            return zzauVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public zzay zzag() {
            zzay zzayVar = this.zzD;
            if (zzayVar == null) {
                return zzay.zzh();
            }
            return zzayVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public zzba zzah() {
            zzba zzbaVar = this.zzx;
            if (zzbaVar == null) {
                return zzba.zzi();
            }
            return zzbaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public zzbc zzai() {
            zzbc zzbcVar = this.zzC;
            if (zzbcVar == null) {
                return zzbc.zzg();
            }
            return zzbcVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public zzbe zzaj() {
            zzbe zzbeVar = this.zzy;
            if (zzbeVar == null) {
                return zzbe.zzj();
            }
            return zzbeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public zzbg zzak() {
            zzbg zzbgVar = this.zzz;
            if (zzbgVar == null) {
                return zzbg.zzg();
            }
            return zzbgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public zzbj zzal() {
            zzbj zzbjVar = this.zzA;
            if (zzbjVar == null) {
                return zzbj.zzf();
            }
            return zzbjVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzam() {
            return (this.zzw & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzan() {
            return (this.zzw & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzao() {
            return (this.zzw & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzap() {
            return (this.zzw & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzaq() {
            return (this.zzw & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzar() {
            return (this.zzw & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzas() {
            return (this.zzw & FragmentTransaction.TRANSIT_EXIT_MASK) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzat() {
            return (this.zzw & 16384) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzau() {
            return (this.zzw & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzav() {
            return (this.zzw & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzaw() {
            return (this.zzw & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzax() {
            return (this.zzw & 2048) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzay() {
            return (this.zzw & 4096) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public boolean zzaz() {
            return (this.zzw & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public int zzb() {
            return this.zzL;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public int zzc() {
            return this.zzH;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public int zzd() {
            return this.zzE;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzu, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzat();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzu;
                case GET_PARSER:
                    zzhdm<zzat> zzhdmVar = zzv;
                    if (zzhdmVar == null) {
                        synchronized (zzat.class) {
                            try {
                                zzhdmVar = zzv;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzu);
                                    zzv = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public int zze() {
            return this.zzF;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public int zzf() {
            return this.zzI;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public int zzg() {
            return this.zzJ;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public long zzh() {
            return this.zzM;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbi
        public zzap zzi() {
            zzap zzapVar = this.zzG;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzau extends zzhbo<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzd;
        private static volatile zzhdm<zzau> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzau, zza> implements zzav {
            private zza() {
                super(zzau.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzav
            public zzq zza() {
                return ((zzau) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzav
            public zzap zzb() {
                return ((zzau) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzau) this.zza).zzF();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzau) this.zza).zzG();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzau) this.zza).zzH();
                return this;
            }

            public zza zzf(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzI(zzawVar);
                return this;
            }

            public zza zzg(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzJ(zzapVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzK(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzK(zzawVar);
                return this;
            }

            public zza zzj(zzap.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzl(zzq zzqVar) {
                zzbu();
                ((zzau) this.zza).zzM(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzav
            public zzaw zzm() {
                return ((zzau) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzav
            public boolean zzn() {
                return ((zzau) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzav
            public boolean zzo() {
                return ((zzau) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzav
            public boolean zzp() {
                return ((zzau) this.zza).zzp();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzd = zzauVar;
            zzhbo.zzca(zzau.class, zzauVar);
        }

        private zzau() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzc() {
            return zzd.zzaZ();
        }

        public static zza zzd(zzau zzauVar) {
            return zzd.zzba(zzauVar);
        }

        public static zzau zzf() {
            return zzd;
        }

        public static zzau zzg(InputStream inputStream) throws IOException {
            return (zzau) zzhbo.zzbk(zzd, inputStream);
        }

        public static zzau zzh(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzau) zzhbo.zzbl(zzd, inputStream, zzhayVar);
        }

        public static zzau zzi(zzhac zzhacVar) throws zzhcd {
            return (zzau) zzhbo.zzbm(zzd, zzhacVar);
        }

        public static zzau zzj(zzham zzhamVar) throws IOException {
            return (zzau) zzhbo.zzbn(zzd, zzhamVar);
        }

        public static zzau zzk(InputStream inputStream) throws IOException {
            return (zzau) zzhbo.zzbo(zzd, inputStream);
        }

        public static zzau zzl(ByteBuffer byteBuffer) throws zzhcd {
            return (zzau) zzhbo.zzbp(zzd, byteBuffer);
        }

        public static zzau zzq(byte[] bArr) throws zzhcd {
            return (zzau) zzhbo.zzbq(zzd, bArr);
        }

        public static zzau zzr(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzau) zzhbo.zzbr(zzd, zzhacVar, zzhayVar);
        }

        public static zzau zzs(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzau) zzhbo.zzbs(zzd, zzhamVar, zzhayVar);
        }

        public static zzau zzt(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzau) zzhbo.zzbu(zzd, inputStream, zzhayVar);
        }

        public static zzau zzu(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzau) zzhbo.zzbv(zzd, byteBuffer, zzhayVar);
        }

        public static zzau zzv(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzau) zzhbo.zzbx(zzd, bArr, zzhayVar);
        }

        public static zzhdm<zzau> zzw() {
            return zzd.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzav
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzav
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzau();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzd;
                case GET_PARSER:
                    zzhdm<zzau> zzhdmVar = zze;
                    if (zzhdmVar == null) {
                        synchronized (zzau.class) {
                            try {
                                zzhdmVar = zze;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzd);
                                    zze = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzav
        public zzaw zzm() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzav
        public boolean zzn() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzav
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzav
        public boolean zzp() {
            return (this.zzf & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzav extends zzhdf {
        zzq zza();

        zzap zzb();

        zzaw zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* loaded from: classes2.dex */
    public final class zzaw extends zzhbo<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzb;
        private static volatile zzhdm<zzaw> zzc;
        private int zzd;
        private int zze;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzaw, zza> implements zzax {
            private zza() {
                super(zzaw.zzb);
            }

            public zza zza() {
                zzbu();
                ((zzaw) this.zza).zzw();
                return this;
            }

            public zza zzb(zzb zzbVar) {
                zzbu();
                ((zzaw) this.zza).zzx(zzbVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzax
            public zzb zzc() {
                return ((zzaw) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzax
            public boolean zzd() {
                return ((zzaw) this.zza).zzd();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public enum zzb implements zzhbs {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 3;
            private static final zzhbt<zzb> zzi = new zzhbt<zzb>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzaw.zzb.1
                @Override // com.google.android.gms.internal.ads.zzhbt
                /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public zzb zza(int i9) {
                    return zzb.zzb(i9);
                }
            };
            private final int zzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzhbu {
                static final zzhbu zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzhbu
                public boolean zza(int i9) {
                    if (zzb.zzb(i9) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i9) {
                this.zzk = i9;
            }

            public static zzb zzb(int i9) {
                if (i9 == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i9 == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i9 == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i9 != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static zzhbt<zzb> zzd() {
                return zzi;
            }

            public static zzhbu zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzhbs
            public final int zza() {
                return this.zzk;
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzb = zzawVar;
            zzhbo.zzca(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        public static zza zza() {
            return zzb.zzaZ();
        }

        public static zza zze(zzaw zzawVar) {
            return zzb.zzba(zzawVar);
        }

        public static zzaw zzg() {
            return zzb;
        }

        public static zzaw zzh(InputStream inputStream) throws IOException {
            return (zzaw) zzhbo.zzbk(zzb, inputStream);
        }

        public static zzaw zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzaw) zzhbo.zzbl(zzb, inputStream, zzhayVar);
        }

        public static zzaw zzj(zzhac zzhacVar) throws zzhcd {
            return (zzaw) zzhbo.zzbm(zzb, zzhacVar);
        }

        public static zzaw zzk(zzham zzhamVar) throws IOException {
            return (zzaw) zzhbo.zzbn(zzb, zzhamVar);
        }

        public static zzaw zzl(InputStream inputStream) throws IOException {
            return (zzaw) zzhbo.zzbo(zzb, inputStream);
        }

        public static zzaw zzm(ByteBuffer byteBuffer) throws zzhcd {
            return (zzaw) zzhbo.zzbp(zzb, byteBuffer);
        }

        public static zzaw zzn(byte[] bArr) throws zzhcd {
            return (zzaw) zzhbo.zzbq(zzb, bArr);
        }

        public static zzaw zzo(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzaw) zzhbo.zzbr(zzb, zzhacVar, zzhayVar);
        }

        public static zzaw zzp(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzaw) zzhbo.zzbs(zzb, zzhamVar, zzhayVar);
        }

        public static zzaw zzq(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzaw) zzhbo.zzbu(zzb, inputStream, zzhayVar);
        }

        public static zzaw zzr(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzaw) zzhbo.zzbv(zzb, byteBuffer, zzhayVar);
        }

        public static zzaw zzs(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzaw) zzhbo.zzbx(zzb, bArr, zzhayVar);
        }

        public static zzhdm<zzaw> zzt() {
            return zzb.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzw() {
            this.zzd &= -2;
            this.zze = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzx(zzb zzbVar) {
            this.zze = zzbVar.zza();
            this.zzd |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzax
        public zzb zzc() {
            zzb zzb2 = zzb.zzb(this.zze);
            if (zzb2 == null) {
                return zzb.VIDEO_ERROR_CODE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzax
        public boolean zzd() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzb.zze()});
                case NEW_MUTABLE_INSTANCE:
                    return new zzaw();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzb;
                case GET_PARSER:
                    zzhdm<zzaw> zzhdmVar = zzc;
                    if (zzhdmVar == null) {
                        synchronized (zzaw.class) {
                            try {
                                zzhdmVar = zzc;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzb);
                                    zzc = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface zzax extends zzhdf {
        zzaw.zzb zzc();

        boolean zzd();
    }

    /* loaded from: classes2.dex */
    public final class zzay extends zzhbo<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zze;
        private static volatile zzhdm<zzay> zzf;
        private int zzg;
        private zzar zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private zzap zzk;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzay, zza> implements zzaz {
            private zza() {
                super(zzay.zze);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
            public zzq zza() {
                return ((zzay) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
            public zzap zzb() {
                return ((zzay) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
            public zzar zzc() {
                return ((zzay) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
            public zzaw zzd() {
                return ((zzay) this.zza).zzd();
            }

            public zza zze() {
                zzbu();
                ((zzay) this.zza).zzK();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzay) this.zza).zzL();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzay) this.zza).zzM();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzay) this.zza).zzN();
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzO(zzawVar);
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzP(zzapVar);
                return this;
            }

            public zza zzk(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzQ(zzarVar);
                return this;
            }

            public zza zzl(zzaw.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzR(zzaVar.zzbr());
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzR(zzawVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzapVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzay) this.zza).zzT(zzqVar);
                return this;
            }

            public zza zzq(zzar.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzU(zzaVar.zzbr());
                return this;
            }

            public zza zzr(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzU(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
            public boolean zzs() {
                return ((zzay) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
            public boolean zzt() {
                return ((zzay) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
            public boolean zzu() {
                return ((zzay) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
            public boolean zzv() {
                return ((zzay) this.zza).zzv();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzay zzayVar = new zzay();
            zze = zzayVar;
            zzhbo.zzca(zzay.class, zzayVar);
        }

        private zzay() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK() {
            this.zzj = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL() {
            this.zzk = null;
            this.zzg &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM() {
            this.zzg &= -3;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzh = null;
            this.zzg &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzh;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(zzar zzarVar) {
            zzarVar.getClass();
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        public static zza zze() {
            return zze.zzaZ();
        }

        public static zza zzf(zzay zzayVar) {
            return zze.zzba(zzayVar);
        }

        public static zzay zzh() {
            return zze;
        }

        public static zzay zzi(InputStream inputStream) throws IOException {
            return (zzay) zzhbo.zzbk(zze, inputStream);
        }

        public static zzay zzj(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzay) zzhbo.zzbl(zze, inputStream, zzhayVar);
        }

        public static zzay zzk(zzhac zzhacVar) throws zzhcd {
            return (zzay) zzhbo.zzbm(zze, zzhacVar);
        }

        public static zzay zzl(zzham zzhamVar) throws IOException {
            return (zzay) zzhbo.zzbn(zze, zzhamVar);
        }

        public static zzay zzm(InputStream inputStream) throws IOException {
            return (zzay) zzhbo.zzbo(zze, inputStream);
        }

        public static zzay zzn(ByteBuffer byteBuffer) throws zzhcd {
            return (zzay) zzhbo.zzbp(zze, byteBuffer);
        }

        public static zzay zzo(byte[] bArr) throws zzhcd {
            return (zzay) zzhbo.zzbq(zze, bArr);
        }

        public static zzay zzp(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzay) zzhbo.zzbr(zze, zzhacVar, zzhayVar);
        }

        public static zzay zzq(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzay) zzhbo.zzbs(zze, zzhamVar, zzhayVar);
        }

        public static zzay zzr(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzay) zzhbo.zzbu(zze, inputStream, zzhayVar);
        }

        public static zzay zzw(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzay) zzhbo.zzbv(zze, byteBuffer, zzhayVar);
        }

        public static zzay zzx(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzay) zzhbo.zzbx(zze, bArr, zzhayVar);
        }

        public static zzhdm<zzay> zzy() {
            return zze.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
        public zzap zzb() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
        public zzar zzc() {
            zzar zzarVar = this.zzh;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
        public zzaw zzd() {
            zzaw zzawVar = this.zzj;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzay();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zze;
                case GET_PARSER:
                    zzhdm<zzay> zzhdmVar = zzf;
                    if (zzhdmVar == null) {
                        synchronized (zzay.class) {
                            try {
                                zzhdmVar = zzf;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zze);
                                    zzf = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
        public boolean zzs() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
        public boolean zzt() {
            return (this.zzg & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
        public boolean zzu() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaz
        public boolean zzv() {
            return (this.zzg & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzaz extends zzhdf {
        zzq zza();

        zzap zzb();

        zzar zzc();

        zzaw zzd();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* loaded from: classes2.dex */
    public final class zzb extends zzhbo<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzb;
        private static volatile zzhdm<zzb> zzc;
        private zzhca<zza> zzd = zzhbo.zzbK();

        /* loaded from: classes2.dex */
        public final class zza extends zzhbo<zza, C0132zza> implements InterfaceC0133zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzd;
            private static volatile zzhdm<zza> zze;
            private int zzf;
            private int zzg;
            private zze zzh;
            private zzg zzi;

            /* renamed from: com.google.android.gms.internal.ads.zzbdv$zzb$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0132zza extends zzhbi<zza, C0132zza> implements InterfaceC0133zzb {
                private C0132zza() {
                    super(zza.zzd);
                }

                public C0132zza zza() {
                    zzbu();
                    ((zza) this.zza).zzG();
                    return this;
                }

                public C0132zza zzb() {
                    zzbu();
                    ((zza) this.zza).zzH();
                    return this;
                }

                public C0132zza zzc() {
                    zzbu();
                    ((zza) this.zza).zzI();
                    return this;
                }

                public C0132zza zzd(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzJ(zzeVar);
                    return this;
                }

                public C0132zza zze(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzK(zzgVar);
                    return this;
                }

                public C0132zza zzf(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzL(zzdVar);
                    return this;
                }

                public C0132zza zzg(zze.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzaVar.zzbr());
                    return this;
                }

                public C0132zza zzh(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzeVar);
                    return this;
                }

                public C0132zza zzi(zzg.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzaVar.zzbr());
                    return this;
                }

                public C0132zza zzj(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzgVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
                public zzd zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
                public zze zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
                public zzg zzm() {
                    return ((zza) this.zza).zzm();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
                public boolean zzn() {
                    return ((zza) this.zza).zzn();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
                public boolean zzo() {
                    return ((zza) this.zza).zzo();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
                public boolean zzp() {
                    return ((zza) this.zza).zzp();
                }

                public /* synthetic */ C0132zza(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzd = zzaVar;
                zzhbo.zzca(zza.class, zzaVar);
            }

            private zza() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzG() {
                this.zzf &= -2;
                this.zzg = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzH() {
                this.zzh = null;
                this.zzf &= -3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzI() {
                this.zzi = null;
                this.zzf &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzJ(zze zzeVar) {
                zzeVar.getClass();
                zze zzeVar2 = this.zzh;
                if (zzeVar2 != null && zzeVar2 != zze.zzi()) {
                    zze.zza zzd2 = zze.zzd(zzeVar2);
                    zzd2.zzbj(zzeVar);
                    zzeVar = zzd2.zzbs();
                }
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzK(zzg zzgVar) {
                zzgVar.getClass();
                zzg zzgVar2 = this.zzi;
                if (zzgVar2 != null && zzgVar2 != zzg.zzf()) {
                    zzg.zza zzd2 = zzg.zzd(zzgVar2);
                    zzd2.zzbj(zzgVar);
                    zzgVar = zzd2.zzbs();
                }
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzL(zzd zzdVar) {
                this.zzg = zzdVar.zza();
                this.zzf |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzM(zze zzeVar) {
                zzeVar.getClass();
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzN(zzg zzgVar) {
                zzgVar.getClass();
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            public static C0132zza zza() {
                return zzd.zzaZ();
            }

            public static C0132zza zzc(zza zzaVar) {
                return zzd.zzba(zzaVar);
            }

            public static zza zze() {
                return zzd;
            }

            public static zza zzf(InputStream inputStream) throws IOException {
                return (zza) zzhbo.zzbk(zzd, inputStream);
            }

            public static zza zzg(InputStream inputStream, zzhay zzhayVar) throws IOException {
                return (zza) zzhbo.zzbl(zzd, inputStream, zzhayVar);
            }

            public static zza zzh(zzhac zzhacVar) throws zzhcd {
                return (zza) zzhbo.zzbm(zzd, zzhacVar);
            }

            public static zza zzi(zzham zzhamVar) throws IOException {
                return (zza) zzhbo.zzbn(zzd, zzhamVar);
            }

            public static zza zzj(InputStream inputStream) throws IOException {
                return (zza) zzhbo.zzbo(zzd, inputStream);
            }

            public static zza zzq(ByteBuffer byteBuffer) throws zzhcd {
                return (zza) zzhbo.zzbp(zzd, byteBuffer);
            }

            public static zza zzr(byte[] bArr) throws zzhcd {
                return (zza) zzhbo.zzbq(zzd, bArr);
            }

            public static zza zzs(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
                return (zza) zzhbo.zzbr(zzd, zzhacVar, zzhayVar);
            }

            public static zza zzt(zzham zzhamVar, zzhay zzhayVar) throws IOException {
                return (zza) zzhbo.zzbs(zzd, zzhamVar, zzhayVar);
            }

            public static zza zzu(InputStream inputStream, zzhay zzhayVar) throws IOException {
                return (zza) zzhbo.zzbu(zzd, inputStream, zzhayVar);
            }

            public static zza zzv(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
                return (zza) zzhbo.zzbv(zzd, byteBuffer, zzhayVar);
            }

            public static zza zzw(byte[] bArr, zzhay zzhayVar) throws zzhcd {
                return (zza) zzhbo.zzbx(zzd, bArr, zzhayVar);
            }

            public static zzhdm<zza> zzx() {
                return zzd.zzbM();
            }

            @Override // com.google.android.gms.internal.ads.zzhbo
            public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
                zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
                AnonymousClass1 anonymousClass1 = null;
                switch (zzhbnVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzd.zze(), "zzh", "zzi"});
                    case NEW_MUTABLE_INSTANCE:
                        return new zza();
                    case NEW_BUILDER:
                        return new C0132zza(anonymousClass1);
                    case GET_DEFAULT_INSTANCE:
                        return zzd;
                    case GET_PARSER:
                        zzhdm<zza> zzhdmVar = zze;
                        if (zzhdmVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzhdmVar = zze;
                                    if (zzhdmVar == null) {
                                        zzhdmVar = new zzhbj(zzd);
                                        zze = zzhdmVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzhdmVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
            public zzd zzk() {
                zzd zzb2 = zzd.zzb(this.zzg);
                if (zzb2 == null) {
                    return zzd.UNSPECIFIED;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
            public zze zzl() {
                zze zzeVar = this.zzh;
                if (zzeVar == null) {
                    return zze.zzi();
                }
                return zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
            public zzg zzm() {
                zzg zzgVar = this.zzi;
                if (zzgVar == null) {
                    return zzg.zzf();
                }
                return zzgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
            public boolean zzn() {
                return (this.zzf & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
            public boolean zzo() {
                return (this.zzf & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.InterfaceC0133zzb
            public boolean zzp() {
                return (this.zzf & 4) != 0;
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbdv$zzb$zzb, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0133zzb extends zzhdf {
            zzd zzk();

            zze zzl();

            zzg zzm();

            boolean zzn();

            boolean zzo();

            boolean zzp();
        }

        /* loaded from: classes2.dex */
        public final class zzc extends zzhbi<zzb, zzc> implements zzc {
            private zzc() {
                super(zzb.zzb);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzc
            public int zza() {
                return ((zzb) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzc
            public zza zzb(int i9) {
                return ((zzb) this.zza).zzb(i9);
            }

            public zzc zzc(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzb) this.zza).zzC(iterable);
                return this;
            }

            public zzc zzd(zza.C0132zza c0132zza) {
                zzbu();
                ((zzb) this.zza).zzD(c0132zza.zzbr());
                return this;
            }

            public zzc zze(zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzD(zzaVar);
                return this;
            }

            public zzc zzf(int i9, zza.C0132zza c0132zza) {
                zzbu();
                ((zzb) this.zza).zzE(i9, c0132zza.zzbr());
                return this;
            }

            public zzc zzg(int i9, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzE(i9, zzaVar);
                return this;
            }

            public zzc zzh() {
                zzbu();
                ((zzb) this.zza).zzF();
                return this;
            }

            public zzc zzi(int i9) {
                zzbu();
                ((zzb) this.zza).zzH(i9);
                return this;
            }

            public zzc zzj(int i9, zza.C0132zza c0132zza) {
                zzbu();
                ((zzb) this.zza).zzI(i9, c0132zza.zzbr());
                return this;
            }

            public zzc zzk(int i9, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzI(i9, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzc
            public List<zza> zzl() {
                return Collections.unmodifiableList(((zzb) this.zza).zzl());
            }

            public /* synthetic */ zzc(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public enum zzd implements zzhbs {
            UNSPECIFIED(0),
            IN_MEMORY(1);

            public static final int zzc = 0;
            public static final int zzd = 1;
            private static final zzhbt<zzd> zze = new zzhbt<zzd>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzb.zzd.1
                @Override // com.google.android.gms.internal.ads.zzhbt
                /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public zzd zza(int i9) {
                    return zzd.zzb(i9);
                }
            };
            private final int zzg;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzhbu {
                static final zzhbu zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzhbu
                public boolean zza(int i9) {
                    if (zzd.zzb(i9) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i9) {
                this.zzg = i9;
            }

            public static zzd zzb(int i9) {
                if (i9 == 0) {
                    return UNSPECIFIED;
                }
                if (i9 != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static zzhbt<zzd> zzd() {
                return zze;
            }

            public static zzhbu zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzhbs
            public final int zza() {
                return this.zzg;
            }
        }

        /* loaded from: classes2.dex */
        public final class zze extends zzhbo<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzc;
            private static volatile zzhdm<zze> zzd;
            private int zze;
            private boolean zzf;
            private int zzg;

            /* loaded from: classes2.dex */
            public final class zza extends zzhbi<zze, zza> implements zzf {
                private zza() {
                    super(zze.zzc);
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzf
                public int zza() {
                    return ((zze) this.zza).zza();
                }

                public zza zzb() {
                    zzbu();
                    ((zze) this.zza).zzA();
                    return this;
                }

                public zza zzc() {
                    zzbu();
                    ((zze) this.zza).zzB();
                    return this;
                }

                public zza zzd(boolean z8) {
                    zzbu();
                    ((zze) this.zza).zzC(z8);
                    return this;
                }

                public zza zze(int i9) {
                    zzbu();
                    ((zze) this.zza).zzD(i9);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzf
                public boolean zzf() {
                    return ((zze) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzf
                public boolean zzg() {
                    return ((zze) this.zza).zzg();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzf
                public boolean zzh() {
                    return ((zze) this.zza).zzh();
                }

                public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            static {
                zze zzeVar = new zze();
                zzc = zzeVar;
                zzhbo.zzca(zze.class, zzeVar);
            }

            private zze() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzA() {
                this.zze &= -2;
                this.zzf = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzB() {
                this.zze &= -3;
                this.zzg = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzC(boolean z8) {
                this.zze |= 1;
                this.zzf = z8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzD(int i9) {
                this.zze |= 2;
                this.zzg = i9;
            }

            public static zza zzc() {
                return zzc.zzaZ();
            }

            public static zza zzd(zze zzeVar) {
                return zzc.zzba(zzeVar);
            }

            public static zze zzi() {
                return zzc;
            }

            public static zze zzj(InputStream inputStream) throws IOException {
                return (zze) zzhbo.zzbk(zzc, inputStream);
            }

            public static zze zzk(InputStream inputStream, zzhay zzhayVar) throws IOException {
                return (zze) zzhbo.zzbl(zzc, inputStream, zzhayVar);
            }

            public static zze zzl(zzhac zzhacVar) throws zzhcd {
                return (zze) zzhbo.zzbm(zzc, zzhacVar);
            }

            public static zze zzm(zzham zzhamVar) throws IOException {
                return (zze) zzhbo.zzbn(zzc, zzhamVar);
            }

            public static zze zzn(InputStream inputStream) throws IOException {
                return (zze) zzhbo.zzbo(zzc, inputStream);
            }

            public static zze zzo(ByteBuffer byteBuffer) throws zzhcd {
                return (zze) zzhbo.zzbp(zzc, byteBuffer);
            }

            public static zze zzp(byte[] bArr) throws zzhcd {
                return (zze) zzhbo.zzbq(zzc, bArr);
            }

            public static zze zzq(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
                return (zze) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
            }

            public static zze zzr(zzham zzhamVar, zzhay zzhayVar) throws IOException {
                return (zze) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
            }

            public static zze zzs(InputStream inputStream, zzhay zzhayVar) throws IOException {
                return (zze) zzhbo.zzbu(zzc, inputStream, zzhayVar);
            }

            public static zze zzt(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
                return (zze) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
            }

            public static zze zzu(byte[] bArr, zzhay zzhayVar) throws zzhcd {
                return (zze) zzhbo.zzbx(zzc, bArr, zzhayVar);
            }

            public static zzhdm<zze> zzv() {
                return zzc.zzbM();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzf
            public int zza() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzhbo
            public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
                zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
                AnonymousClass1 anonymousClass1 = null;
                switch (zzhbnVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    case NEW_MUTABLE_INSTANCE:
                        return new zze();
                    case NEW_BUILDER:
                        return new zza(anonymousClass1);
                    case GET_DEFAULT_INSTANCE:
                        return zzc;
                    case GET_PARSER:
                        zzhdm<zze> zzhdmVar = zzd;
                        if (zzhdmVar == null) {
                            synchronized (zze.class) {
                                try {
                                    zzhdmVar = zzd;
                                    if (zzhdmVar == null) {
                                        zzhdmVar = new zzhbj(zzc);
                                        zzd = zzhdmVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzhdmVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzf
            public boolean zzf() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzf
            public boolean zzg() {
                return (this.zze & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzf
            public boolean zzh() {
                return (this.zze & 2) != 0;
            }
        }

        /* loaded from: classes2.dex */
        public interface zzf extends zzhdf {
            int zza();

            boolean zzf();

            boolean zzg();

            boolean zzh();
        }

        /* loaded from: classes2.dex */
        public final class zzg extends zzhbo<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzd;
            private static volatile zzhdm<zzg> zze;
            private int zzf;
            private boolean zzg;
            private boolean zzh;
            private int zzi;

            /* loaded from: classes2.dex */
            public final class zza extends zzhbi<zzg, zza> implements zzh {
                private zza() {
                    super(zzg.zzd);
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
                public int zza() {
                    return ((zzg) this.zza).zza();
                }

                public zza zzb() {
                    zzbu();
                    ((zzg) this.zza).zzE();
                    return this;
                }

                public zza zzc() {
                    zzbu();
                    ((zzg) this.zza).zzF();
                    return this;
                }

                public zza zzd() {
                    zzbu();
                    ((zzg) this.zza).zzG();
                    return this;
                }

                public zza zze(boolean z8) {
                    zzbu();
                    ((zzg) this.zza).zzH(z8);
                    return this;
                }

                public zza zzf(boolean z8) {
                    zzbu();
                    ((zzg) this.zza).zzI(z8);
                    return this;
                }

                public zza zzg(int i9) {
                    zzbu();
                    ((zzg) this.zza).zzJ(i9);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
                public boolean zzh() {
                    return ((zzg) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
                public boolean zzi() {
                    return ((zzg) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
                public boolean zzj() {
                    return ((zzg) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
                public boolean zzk() {
                    return ((zzg) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
                public boolean zzl() {
                    return ((zzg) this.zza).zzl();
                }

                public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzd = zzgVar;
                zzhbo.zzca(zzg.class, zzgVar);
            }

            private zzg() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzE() {
                this.zzf &= -2;
                this.zzg = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzF() {
                this.zzf &= -3;
                this.zzh = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzG() {
                this.zzf &= -5;
                this.zzi = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzH(boolean z8) {
                this.zzf |= 1;
                this.zzg = z8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzI(boolean z8) {
                this.zzf |= 2;
                this.zzh = z8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzJ(int i9) {
                this.zzf |= 4;
                this.zzi = i9;
            }

            public static zza zzc() {
                return zzd.zzaZ();
            }

            public static zza zzd(zzg zzgVar) {
                return zzd.zzba(zzgVar);
            }

            public static zzg zzf() {
                return zzd;
            }

            public static zzg zzg(InputStream inputStream) throws IOException {
                return (zzg) zzhbo.zzbk(zzd, inputStream);
            }

            public static zzg zzm(InputStream inputStream, zzhay zzhayVar) throws IOException {
                return (zzg) zzhbo.zzbl(zzd, inputStream, zzhayVar);
            }

            public static zzg zzn(zzhac zzhacVar) throws zzhcd {
                return (zzg) zzhbo.zzbm(zzd, zzhacVar);
            }

            public static zzg zzo(zzham zzhamVar) throws IOException {
                return (zzg) zzhbo.zzbn(zzd, zzhamVar);
            }

            public static zzg zzp(InputStream inputStream) throws IOException {
                return (zzg) zzhbo.zzbo(zzd, inputStream);
            }

            public static zzg zzq(ByteBuffer byteBuffer) throws zzhcd {
                return (zzg) zzhbo.zzbp(zzd, byteBuffer);
            }

            public static zzg zzr(byte[] bArr) throws zzhcd {
                return (zzg) zzhbo.zzbq(zzd, bArr);
            }

            public static zzg zzs(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
                return (zzg) zzhbo.zzbr(zzd, zzhacVar, zzhayVar);
            }

            public static zzg zzt(zzham zzhamVar, zzhay zzhayVar) throws IOException {
                return (zzg) zzhbo.zzbs(zzd, zzhamVar, zzhayVar);
            }

            public static zzg zzu(InputStream inputStream, zzhay zzhayVar) throws IOException {
                return (zzg) zzhbo.zzbu(zzd, inputStream, zzhayVar);
            }

            public static zzg zzv(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
                return (zzg) zzhbo.zzbv(zzd, byteBuffer, zzhayVar);
            }

            public static zzg zzw(byte[] bArr, zzhay zzhayVar) throws zzhcd {
                return (zzg) zzhbo.zzbx(zzd, bArr, zzhayVar);
            }

            public static zzhdm<zzg> zzx() {
                return zzd.zzbM();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
            public int zza() {
                return this.zzi;
            }

            @Override // com.google.android.gms.internal.ads.zzhbo
            public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
                zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
                AnonymousClass1 anonymousClass1 = null;
                switch (zzhbnVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                    case NEW_MUTABLE_INSTANCE:
                        return new zzg();
                    case NEW_BUILDER:
                        return new zza(anonymousClass1);
                    case GET_DEFAULT_INSTANCE:
                        return zzd;
                    case GET_PARSER:
                        zzhdm<zzg> zzhdmVar = zze;
                        if (zzhdmVar == null) {
                            synchronized (zzg.class) {
                                try {
                                    zzhdmVar = zze;
                                    if (zzhdmVar == null) {
                                        zzhdmVar = new zzhbj(zzd);
                                        zze = zzhdmVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzhdmVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
            public boolean zzh() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
            public boolean zzi() {
                return this.zzh;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
            public boolean zzj() {
                return (this.zzf & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
            public boolean zzk() {
                return (this.zzf & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzb.zzh
            public boolean zzl() {
                return (this.zzf & 4) != 0;
            }
        }

        /* loaded from: classes2.dex */
        public interface zzh extends zzhdf {
            int zza();

            boolean zzh();

            boolean zzi();

            boolean zzj();

            boolean zzk();

            boolean zzl();
        }

        static {
            zzb zzbVar = new zzb();
            zzb = zzbVar;
            zzhbo.zzca(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(Iterable<? extends zza> iterable) {
            zzG();
            zzgzi.zzaQ(iterable, this.zzd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zza zzaVar) {
            zzaVar.getClass();
            zzG();
            this.zzd.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(int i9, zza zzaVar) {
            zzaVar.getClass();
            zzG();
            this.zzd.add(i9, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzd = zzhbo.zzbK();
        }

        private void zzG() {
            zzhca<zza> zzhcaVar = this.zzd;
            if (!zzhcaVar.zzc()) {
                this.zzd = zzhbo.zzbL(zzhcaVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH(int i9) {
            zzG();
            this.zzd.remove(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i9, zza zzaVar) {
            zzaVar.getClass();
            zzG();
            this.zzd.set(i9, zzaVar);
        }

        public static zzc zzd() {
            return zzb.zzaZ();
        }

        public static zzc zze(zzb zzbVar) {
            return zzb.zzba(zzbVar);
        }

        public static zzb zzg() {
            return zzb;
        }

        public static zzb zzh(InputStream inputStream) throws IOException {
            return (zzb) zzhbo.zzbk(zzb, inputStream);
        }

        public static zzb zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzb) zzhbo.zzbl(zzb, inputStream, zzhayVar);
        }

        public static zzb zzj(zzhac zzhacVar) throws zzhcd {
            return (zzb) zzhbo.zzbm(zzb, zzhacVar);
        }

        public static zzb zzk(zzham zzhamVar) throws IOException {
            return (zzb) zzhbo.zzbn(zzb, zzhamVar);
        }

        public static zzb zzm(InputStream inputStream) throws IOException {
            return (zzb) zzhbo.zzbo(zzb, inputStream);
        }

        public static zzb zzn(ByteBuffer byteBuffer) throws zzhcd {
            return (zzb) zzhbo.zzbp(zzb, byteBuffer);
        }

        public static zzb zzo(byte[] bArr) throws zzhcd {
            return (zzb) zzhbo.zzbq(zzb, bArr);
        }

        public static zzb zzp(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzb) zzhbo.zzbr(zzb, zzhacVar, zzhayVar);
        }

        public static zzb zzq(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzb) zzhbo.zzbs(zzb, zzhamVar, zzhayVar);
        }

        public static zzb zzr(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzb) zzhbo.zzbu(zzb, inputStream, zzhayVar);
        }

        public static zzb zzs(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzb) zzhbo.zzbv(zzb, byteBuffer, zzhayVar);
        }

        public static zzb zzt(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzb) zzhbo.zzbx(zzb, bArr, zzhayVar);
        }

        public static zzhdm<zzb> zzu() {
            return zzb.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzc
        public int zza() {
            return this.zzd.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzc
        public zza zzb(int i9) {
            return this.zzd.get(i9);
        }

        public InterfaceC0133zzb zzc(int i9) {
            return this.zzd.get(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zza.class});
                case NEW_MUTABLE_INSTANCE:
                    return new zzb();
                case NEW_BUILDER:
                    return new zzc(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzb;
                case GET_PARSER:
                    zzhdm<zzb> zzhdmVar = zzc;
                    if (zzhdmVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzhdmVar = zzc;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzb);
                                    zzc = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzc
        public List<zza> zzl() {
            return this.zzd;
        }

        public List<? extends InterfaceC0133zzb> zzv() {
            return this.zzd;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzba extends zzhbo<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzf;
        private static volatile zzhdm<zzba> zzg;
        private int zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private int zzk;
        private int zzl;
        private int zzm;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzba, zza> implements zzbb {
            private zza() {
                super(zzba.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public int zza() {
                return ((zzba) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public int zzb() {
                return ((zzba) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public int zzc() {
                return ((zzba) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public zzq zzd() {
                return ((zzba) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public zzaw zze() {
                return ((zzba) this.zza).zze();
            }

            public zza zzf() {
                zzbu();
                ((zzba) this.zza).zzM();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzba) this.zza).zzN();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzba) this.zza).zzO();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzba) this.zza).zzP();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzba) this.zza).zzQ();
                return this;
            }

            public zza zzk(zzaw zzawVar) {
                zzbu();
                ((zzba) this.zza).zzR(zzawVar);
                return this;
            }

            public zza zzl(zzaw.zza zzaVar) {
                zzbu();
                ((zzba) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzba) this.zza).zzS(zzawVar);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzba) this.zza).zzT(zzqVar);
                return this;
            }

            public zza zzo(int i9) {
                zzbu();
                ((zzba) this.zza).zzU(i9);
                return this;
            }

            public zza zzp(int i9) {
                zzbu();
                ((zzba) this.zza).zzV(i9);
                return this;
            }

            public zza zzq(int i9) {
                zzbu();
                ((zzba) this.zza).zzW(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public boolean zzr() {
                return ((zzba) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public boolean zzs() {
                return ((zzba) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public boolean zzt() {
                return ((zzba) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public boolean zzu() {
                return ((zzba) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
            public boolean zzv() {
                return ((zzba) this.zza).zzv();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzf = zzbaVar;
            zzhbo.zzca(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        public static zzhdm<zzba> zzA() {
            return zzf.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM() {
            this.zzj = null;
            this.zzh &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzh &= -2;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO() {
            this.zzh &= -17;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzh &= -5;
            this.zzk = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzh &= -9;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzh |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(int i9) {
            this.zzh |= 16;
            this.zzm = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(int i9) {
            this.zzh |= 4;
            this.zzk = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(int i9) {
            this.zzh |= 8;
            this.zzl = i9;
        }

        public static zza zzf() {
            return zzf.zzaZ();
        }

        public static zza zzg(zzba zzbaVar) {
            return zzf.zzba(zzbaVar);
        }

        public static zzba zzi() {
            return zzf;
        }

        public static zzba zzj(InputStream inputStream) throws IOException {
            return (zzba) zzhbo.zzbk(zzf, inputStream);
        }

        public static zzba zzk(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzba) zzhbo.zzbl(zzf, inputStream, zzhayVar);
        }

        public static zzba zzl(zzhac zzhacVar) throws zzhcd {
            return (zzba) zzhbo.zzbm(zzf, zzhacVar);
        }

        public static zzba zzm(zzham zzhamVar) throws IOException {
            return (zzba) zzhbo.zzbn(zzf, zzhamVar);
        }

        public static zzba zzn(InputStream inputStream) throws IOException {
            return (zzba) zzhbo.zzbo(zzf, inputStream);
        }

        public static zzba zzo(ByteBuffer byteBuffer) throws zzhcd {
            return (zzba) zzhbo.zzbp(zzf, byteBuffer);
        }

        public static zzba zzp(byte[] bArr) throws zzhcd {
            return (zzba) zzhbo.zzbq(zzf, bArr);
        }

        public static zzba zzq(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzba) zzhbo.zzbr(zzf, zzhacVar, zzhayVar);
        }

        public static zzba zzw(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzba) zzhbo.zzbs(zzf, zzhamVar, zzhayVar);
        }

        public static zzba zzx(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzba) zzhbo.zzbu(zzf, inputStream, zzhayVar);
        }

        public static zzba zzy(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzba) zzhbo.zzbv(zzf, byteBuffer, zzhayVar);
        }

        public static zzba zzz(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzba) zzhbo.zzbx(zzf, bArr, zzhayVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public int zza() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public int zzb() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public int zzc() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public zzq zzd() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", zzq.zze(), "zzj", "zzk", "zzl", "zzm"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzba();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzf;
                case GET_PARSER:
                    zzhdm<zzba> zzhdmVar = zzg;
                    if (zzhdmVar == null) {
                        synchronized (zzba.class) {
                            try {
                                zzhdmVar = zzg;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzf);
                                    zzg = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public zzaw zze() {
            zzaw zzawVar = this.zzj;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public boolean zzr() {
            return (this.zzh & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public boolean zzs() {
            return (this.zzh & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public boolean zzt() {
            return (this.zzh & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public boolean zzu() {
            return (this.zzh & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbb
        public boolean zzv() {
            return (this.zzh & 8) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbb extends zzhdf {
        int zza();

        int zzb();

        int zzc();

        zzq zzd();

        zzaw zze();

        boolean zzr();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* loaded from: classes2.dex */
    public final class zzbc extends zzhbo<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzd;
        private static volatile zzhdm<zzbc> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzbc, zza> implements zzbd {
            private zza() {
                super(zzbc.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
            public zzq zza() {
                return ((zzbc) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
            public zzap zzb() {
                return ((zzbc) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
            public zzaw zzc() {
                return ((zzbc) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbc) this.zza).zzF();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbc) this.zza).zzG();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbc) this.zza).zzH();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzI(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzJ(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzK(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzK(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbc) this.zza).zzM(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
            public boolean zzn() {
                return ((zzbc) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
            public boolean zzo() {
                return ((zzbc) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
            public boolean zzp() {
                return ((zzbc) this.zza).zzp();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzd = zzbcVar;
            zzhbo.zzca(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zze(zzbc zzbcVar) {
            return zzd.zzba(zzbcVar);
        }

        public static zzbc zzg() {
            return zzd;
        }

        public static zzbc zzh(InputStream inputStream) throws IOException {
            return (zzbc) zzhbo.zzbk(zzd, inputStream);
        }

        public static zzbc zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbc) zzhbo.zzbl(zzd, inputStream, zzhayVar);
        }

        public static zzbc zzj(zzhac zzhacVar) throws zzhcd {
            return (zzbc) zzhbo.zzbm(zzd, zzhacVar);
        }

        public static zzbc zzk(zzham zzhamVar) throws IOException {
            return (zzbc) zzhbo.zzbn(zzd, zzhamVar);
        }

        public static zzbc zzl(InputStream inputStream) throws IOException {
            return (zzbc) zzhbo.zzbo(zzd, inputStream);
        }

        public static zzbc zzm(ByteBuffer byteBuffer) throws zzhcd {
            return (zzbc) zzhbo.zzbp(zzd, byteBuffer);
        }

        public static zzbc zzq(byte[] bArr) throws zzhcd {
            return (zzbc) zzhbo.zzbq(zzd, bArr);
        }

        public static zzbc zzr(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzbc) zzhbo.zzbr(zzd, zzhacVar, zzhayVar);
        }

        public static zzbc zzs(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzbc) zzhbo.zzbs(zzd, zzhamVar, zzhayVar);
        }

        public static zzbc zzt(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbc) zzhbo.zzbu(zzd, inputStream, zzhayVar);
        }

        public static zzbc zzu(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzbc) zzhbo.zzbv(zzd, byteBuffer, zzhayVar);
        }

        public static zzbc zzv(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzbc) zzhbo.zzbx(zzd, bArr, zzhayVar);
        }

        public static zzhdm<zzbc> zzw() {
            return zzd.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzbc();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzd;
                case GET_PARSER:
                    zzhdm<zzbc> zzhdmVar = zze;
                    if (zzhdmVar == null) {
                        synchronized (zzbc.class) {
                            try {
                                zzhdmVar = zze;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzd);
                                    zze = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
        public boolean zzn() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbd
        public boolean zzp() {
            return (this.zzf & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbd extends zzhdf {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* loaded from: classes2.dex */
    public final class zzbe extends zzhbo<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzg;
        private static volatile zzhdm<zzbe> zzh;
        private int zzi;
        private int zzj = 1000;
        private zzaw zzk;
        private int zzl;
        private int zzm;
        private int zzn;
        private long zzo;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzbe, zza> implements zzbf {
            private zza() {
                super(zzbe.zzg);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public int zza() {
                return ((zzbe) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public int zzb() {
                return ((zzbe) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public int zzc() {
                return ((zzbe) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public long zzd() {
                return ((zzbe) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public zzq zze() {
                return ((zzbe) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public zzaw zzf() {
                return ((zzbe) this.zza).zzf();
            }

            public zza zzg() {
                zzbu();
                ((zzbe) this.zza).zzQ();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzbe) this.zza).zzR();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzbe) this.zza).zzS();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzbe) this.zza).zzT();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzbe) this.zza).zzU();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzbe) this.zza).zzV();
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzbe) this.zza).zzW(zzawVar);
                return this;
            }

            public zza zzn(long j7) {
                zzbu();
                ((zzbe) this.zza).zzX(j7);
                return this;
            }

            public zza zzo(zzaw.zza zzaVar) {
                zzbu();
                ((zzbe) this.zza).zzY(zzaVar.zzbr());
                return this;
            }

            public zza zzp(zzaw zzawVar) {
                zzbu();
                ((zzbe) this.zza).zzY(zzawVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzbe) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzr(int i9) {
                zzbu();
                ((zzbe) this.zza).zzaa(i9);
                return this;
            }

            public zza zzs(int i9) {
                zzbu();
                ((zzbe) this.zza).zzab(i9);
                return this;
            }

            public zza zzt(int i9) {
                zzbu();
                ((zzbe) this.zza).zzac(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public boolean zzu() {
                return ((zzbe) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public boolean zzv() {
                return ((zzbe) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public boolean zzw() {
                return ((zzbe) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public boolean zzx() {
                return ((zzbe) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public boolean zzy() {
                return ((zzbe) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
            public boolean zzz() {
                return ((zzbe) this.zza).zzz();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzg = zzbeVar;
            zzhbo.zzca(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        public static zzbe zzA(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzbe) zzhbo.zzbv(zzg, byteBuffer, zzhayVar);
        }

        public static zzbe zzB(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzbe) zzhbo.zzbx(zzg, bArr, zzhayVar);
        }

        public static zzhdm<zzbe> zzC() {
            return zzg.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzi &= -33;
            this.zzo = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS() {
            this.zzi &= -2;
            this.zzj = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT() {
            this.zzi &= -17;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU() {
            this.zzi &= -5;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV() {
            this.zzi &= -9;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzk;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(long j7) {
            this.zzi |= 32;
            this.zzo = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzi |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(int i9) {
            this.zzi |= 16;
            this.zzn = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(int i9) {
            this.zzi |= 4;
            this.zzl = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(int i9) {
            this.zzi |= 8;
            this.zzm = i9;
        }

        public static zza zzg() {
            return zzg.zzaZ();
        }

        public static zza zzh(zzbe zzbeVar) {
            return zzg.zzba(zzbeVar);
        }

        public static zzbe zzj() {
            return zzg;
        }

        public static zzbe zzk(InputStream inputStream) throws IOException {
            return (zzbe) zzhbo.zzbk(zzg, inputStream);
        }

        public static zzbe zzl(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbe) zzhbo.zzbl(zzg, inputStream, zzhayVar);
        }

        public static zzbe zzm(zzhac zzhacVar) throws zzhcd {
            return (zzbe) zzhbo.zzbm(zzg, zzhacVar);
        }

        public static zzbe zzn(zzham zzhamVar) throws IOException {
            return (zzbe) zzhbo.zzbn(zzg, zzhamVar);
        }

        public static zzbe zzo(InputStream inputStream) throws IOException {
            return (zzbe) zzhbo.zzbo(zzg, inputStream);
        }

        public static zzbe zzp(ByteBuffer byteBuffer) throws zzhcd {
            return (zzbe) zzhbo.zzbp(zzg, byteBuffer);
        }

        public static zzbe zzq(byte[] bArr) throws zzhcd {
            return (zzbe) zzhbo.zzbq(zzg, bArr);
        }

        public static zzbe zzr(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzbe) zzhbo.zzbr(zzg, zzhacVar, zzhayVar);
        }

        public static zzbe zzs(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzbe) zzhbo.zzbs(zzg, zzhamVar, zzhayVar);
        }

        public static zzbe zzt(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbe) zzhbo.zzbu(zzg, inputStream, zzhayVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public int zza() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public int zzb() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public int zzc() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public long zzd() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", zzq.zze(), "zzk", "zzl", "zzm", "zzn", "zzo"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzbe();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzg;
                case GET_PARSER:
                    zzhdm<zzbe> zzhdmVar = zzh;
                    if (zzhdmVar == null) {
                        synchronized (zzbe.class) {
                            try {
                                zzhdmVar = zzh;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzg);
                                    zzh = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public zzq zze() {
            zzq zzb2 = zzq.zzb(this.zzj);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public zzaw zzf() {
            zzaw zzawVar = this.zzk;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public boolean zzu() {
            return (this.zzi & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public boolean zzv() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public boolean zzw() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public boolean zzx() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public boolean zzy() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbf
        public boolean zzz() {
            return (this.zzi & 8) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbf extends zzhdf {
        int zza();

        int zzb();

        int zzc();

        long zzd();

        zzq zze();

        zzaw zzf();

        boolean zzu();

        boolean zzv();

        boolean zzw();

        boolean zzx();

        boolean zzy();

        boolean zzz();
    }

    /* loaded from: classes2.dex */
    public final class zzbg extends zzhbo<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzd;
        private static volatile zzhdm<zzbg> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzbg, zza> implements zzbh {
            private zza() {
                super(zzbg.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
            public zzq zza() {
                return ((zzbg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
            public zzap zzb() {
                return ((zzbg) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
            public zzaw zzc() {
                return ((zzbg) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbg) this.zza).zzF();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbg) this.zza).zzG();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbg) this.zza).zzH();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzI(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzJ(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzK(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzK(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbg) this.zza).zzM(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
            public boolean zzn() {
                return ((zzbg) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
            public boolean zzo() {
                return ((zzbg) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
            public boolean zzp() {
                return ((zzbg) this.zza).zzp();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzd = zzbgVar;
            zzhbo.zzca(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zze(zzbg zzbgVar) {
            return zzd.zzba(zzbgVar);
        }

        public static zzbg zzg() {
            return zzd;
        }

        public static zzbg zzh(InputStream inputStream) throws IOException {
            return (zzbg) zzhbo.zzbk(zzd, inputStream);
        }

        public static zzbg zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbg) zzhbo.zzbl(zzd, inputStream, zzhayVar);
        }

        public static zzbg zzj(zzhac zzhacVar) throws zzhcd {
            return (zzbg) zzhbo.zzbm(zzd, zzhacVar);
        }

        public static zzbg zzk(zzham zzhamVar) throws IOException {
            return (zzbg) zzhbo.zzbn(zzd, zzhamVar);
        }

        public static zzbg zzl(InputStream inputStream) throws IOException {
            return (zzbg) zzhbo.zzbo(zzd, inputStream);
        }

        public static zzbg zzm(ByteBuffer byteBuffer) throws zzhcd {
            return (zzbg) zzhbo.zzbp(zzd, byteBuffer);
        }

        public static zzbg zzq(byte[] bArr) throws zzhcd {
            return (zzbg) zzhbo.zzbq(zzd, bArr);
        }

        public static zzbg zzr(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzbg) zzhbo.zzbr(zzd, zzhacVar, zzhayVar);
        }

        public static zzbg zzs(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzbg) zzhbo.zzbs(zzd, zzhamVar, zzhayVar);
        }

        public static zzbg zzt(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbg) zzhbo.zzbu(zzd, inputStream, zzhayVar);
        }

        public static zzbg zzu(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzbg) zzhbo.zzbv(zzd, byteBuffer, zzhayVar);
        }

        public static zzbg zzv(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzbg) zzhbo.zzbx(zzd, bArr, zzhayVar);
        }

        public static zzhdm<zzbg> zzw() {
            return zzd.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzbg();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzd;
                case GET_PARSER:
                    zzhdm<zzbg> zzhdmVar = zze;
                    if (zzhdmVar == null) {
                        synchronized (zzbg.class) {
                            try {
                                zzhdmVar = zze;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzd);
                                    zze = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
        public boolean zzn() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbh
        public boolean zzp() {
            return (this.zzf & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbh extends zzhdf {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* loaded from: classes2.dex */
    public interface zzbi extends zzhdf {
        int zza();

        boolean zzaA();

        boolean zzaB();

        zzau zzaf();

        zzay zzag();

        zzba zzah();

        zzbc zzai();

        zzbe zzaj();

        zzbg zzak();

        zzbj zzal();

        boolean zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        boolean zzav();

        boolean zzaw();

        boolean zzax();

        boolean zzay();

        boolean zzaz();

        int zzb();

        int zzc();

        int zzd();

        int zze();

        int zzf();

        int zzg();

        long zzh();

        zzap zzi();
    }

    /* loaded from: classes2.dex */
    public final class zzbj extends zzhbo<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzc;
        private static volatile zzhdm<zzbj> zzd;
        private int zze;
        private int zzf = 1000;
        private zzaw zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzbj, zza> implements zzbk {
            private zza() {
                super(zzbj.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbk
            public zzq zza() {
                return ((zzbj) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbk
            public zzaw zzb() {
                return ((zzbj) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzbj) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzbj) this.zza).zzB();
                return this;
            }

            public zza zze(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzC(zzawVar);
                return this;
            }

            public zza zzf(zzaw.zza zzaVar) {
                zzbu();
                ((zzbj) this.zza).zzD(zzaVar.zzbr());
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzD(zzawVar);
                return this;
            }

            public zza zzh(zzq zzqVar) {
                zzbu();
                ((zzbj) this.zza).zzE(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbk
            public boolean zzi() {
                return ((zzbj) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbk
            public boolean zzj() {
                return ((zzbj) this.zza).zzj();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzc = zzbjVar;
            zzhbo.zzca(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -2;
            this.zzf = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzg;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze = zzaw.zze(zzawVar2);
                zze.zzbj(zzawVar);
                zzawVar = zze.zzbs();
            }
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzbj zzbjVar) {
            return zzc.zzba(zzbjVar);
        }

        public static zzbj zzf() {
            return zzc;
        }

        public static zzbj zzg(InputStream inputStream) throws IOException {
            return (zzbj) zzhbo.zzbk(zzc, inputStream);
        }

        public static zzbj zzh(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbj) zzhbo.zzbl(zzc, inputStream, zzhayVar);
        }

        public static zzbj zzk(zzhac zzhacVar) throws zzhcd {
            return (zzbj) zzhbo.zzbm(zzc, zzhacVar);
        }

        public static zzbj zzl(zzham zzhamVar) throws IOException {
            return (zzbj) zzhbo.zzbn(zzc, zzhamVar);
        }

        public static zzbj zzm(InputStream inputStream) throws IOException {
            return (zzbj) zzhbo.zzbo(zzc, inputStream);
        }

        public static zzbj zzn(ByteBuffer byteBuffer) throws zzhcd {
            return (zzbj) zzhbo.zzbp(zzc, byteBuffer);
        }

        public static zzbj zzo(byte[] bArr) throws zzhcd {
            return (zzbj) zzhbo.zzbq(zzc, bArr);
        }

        public static zzbj zzp(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzbj) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
        }

        public static zzbj zzq(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzbj) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
        }

        public static zzbj zzr(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbj) zzhbo.zzbu(zzc, inputStream, zzhayVar);
        }

        public static zzbj zzs(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzbj) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
        }

        public static zzbj zzt(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzbj) zzhbo.zzbx(zzc, bArr, zzhayVar);
        }

        public static zzhdm<zzbj> zzu() {
            return zzc.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbk
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzf);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbk
        public zzaw zzb() {
            zzaw zzawVar = this.zzg;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzbj();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzc;
                case GET_PARSER:
                    zzhdm<zzbj> zzhdmVar = zzd;
                    if (zzhdmVar == null) {
                        synchronized (zzbj.class) {
                            try {
                                zzhdmVar = zzd;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzc);
                                    zzd = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbk
        public boolean zzi() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbk
        public boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbk extends zzhdf {
        zzq zza();

        zzaw zzb();

        boolean zzi();

        boolean zzj();
    }

    /* loaded from: classes2.dex */
    public final class zzbl extends zzhbo<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzc;
        private static volatile zzhdm<zzbl> zzd;
        private int zze;
        private boolean zzf;
        private int zzg;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzbl, zza> implements zzbm {
            private zza() {
                super(zzbl.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbm
            public int zza() {
                return ((zzbl) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzbl) this.zza).zzA();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzbl) this.zza).zzB();
                return this;
            }

            public zza zzd(boolean z8) {
                zzbu();
                ((zzbl) this.zza).zzC(z8);
                return this;
            }

            public zza zze(int i9) {
                zzbu();
                ((zzbl) this.zza).zzD(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbm
            public boolean zzf() {
                return ((zzbl) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbm
            public boolean zzg() {
                return ((zzbl) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzbm
            public boolean zzh() {
                return ((zzbl) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzc = zzblVar;
            zzhbo.zzca(zzbl.class, zzblVar);
        }

        private zzbl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(boolean z8) {
            this.zze |= 1;
            this.zzf = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i9) {
            this.zze |= 2;
            this.zzg = i9;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzbl zzblVar) {
            return zzc.zzba(zzblVar);
        }

        public static zzbl zzi() {
            return zzc;
        }

        public static zzbl zzj(InputStream inputStream) throws IOException {
            return (zzbl) zzhbo.zzbk(zzc, inputStream);
        }

        public static zzbl zzk(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbl) zzhbo.zzbl(zzc, inputStream, zzhayVar);
        }

        public static zzbl zzl(zzhac zzhacVar) throws zzhcd {
            return (zzbl) zzhbo.zzbm(zzc, zzhacVar);
        }

        public static zzbl zzm(zzham zzhamVar) throws IOException {
            return (zzbl) zzhbo.zzbn(zzc, zzhamVar);
        }

        public static zzbl zzn(InputStream inputStream) throws IOException {
            return (zzbl) zzhbo.zzbo(zzc, inputStream);
        }

        public static zzbl zzo(ByteBuffer byteBuffer) throws zzhcd {
            return (zzbl) zzhbo.zzbp(zzc, byteBuffer);
        }

        public static zzbl zzp(byte[] bArr) throws zzhcd {
            return (zzbl) zzhbo.zzbq(zzc, bArr);
        }

        public static zzbl zzq(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzbl) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
        }

        public static zzbl zzr(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzbl) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
        }

        public static zzbl zzs(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzbl) zzhbo.zzbu(zzc, inputStream, zzhayVar);
        }

        public static zzbl zzt(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzbl) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
        }

        public static zzbl zzu(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzbl) zzhbo.zzbx(zzc, bArr, zzhayVar);
        }

        public static zzhdm<zzbl> zzv() {
            return zzc.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbm
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzbl();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzc;
                case GET_PARSER:
                    zzhdm<zzbl> zzhdmVar = zzd;
                    if (zzhdmVar == null) {
                        synchronized (zzbl.class) {
                            try {
                                zzhdmVar = zzd;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzc);
                                    zzd = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbm
        public boolean zzf() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbm
        public boolean zzg() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzbm
        public boolean zzh() {
            return (this.zze & 2) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzbm extends zzhdf {
        int zza();

        boolean zzf();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes2.dex */
    public interface zzc extends zzhdf {
        int zza();

        zzb.zza zzb(int i9);

        List<zzb.zza> zzl();
    }

    /* loaded from: classes2.dex */
    public final class zzd extends zzhbo<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzc;
        private static volatile zzhdm<zzd> zzd;
        private int zze;
        private int zzf;
        private zzal zzg;

        /* loaded from: classes2.dex */
        public enum zza implements zzhbs {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);

            public static final int zzl = 0;
            public static final int zzm = 1;
            public static final int zzn = 2;
            public static final int zzo = 3;
            public static final int zzp = 4;
            public static final int zzq = 5;
            public static final int zzr = 6;
            public static final int zzs = 7;
            public static final int zzt = 8;
            public static final int zzu = 9;
            public static final int zzv = 10;
            private static final zzhbt<zza> zzw = new zzhbt<zza>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzd.zza.1
                @Override // com.google.android.gms.internal.ads.zzhbt
                /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public zza zza(int i9) {
                    return zza.zzb(i9);
                }
            };
            private final int zzy;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.android.gms.internal.ads.zzbdv$zzd$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0134zza implements zzhbu {
                static final zzhbu zza = new C0134zza();

                private C0134zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzhbu
                public boolean zza(int i9) {
                    if (zza.zzb(i9) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zza(int i9) {
                this.zzy = i9;
            }

            public static zza zzb(int i9) {
                switch (i9) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzhbt<zza> zzd() {
                return zzw;
            }

            public static zzhbu zze() {
                return C0134zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzhbs
            public final int zza() {
                return this.zzy;
            }
        }

        /* loaded from: classes2.dex */
        public final class zzb extends zzhbi<zzd, zzb> implements zze {
            private zzb() {
                super(zzd.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zze
            public zza zza() {
                return ((zzd) this.zza).zza();
            }

            public zzb zzb() {
                zzbu();
                ((zzd) this.zza).zzB();
                return this;
            }

            public zzb zzc() {
                zzbu();
                ((zzd) this.zza).zzC();
                return this;
            }

            public zzb zzd(zzal zzalVar) {
                zzbu();
                ((zzd) this.zza).zzD(zzalVar);
                return this;
            }

            public zzb zze(zzal.zza zzaVar) {
                zzbu();
                ((zzd) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zzb zzf(zzal zzalVar) {
                zzbu();
                ((zzd) this.zza).zzE(zzalVar);
                return this;
            }

            public zzb zzg(zza zzaVar) {
                zzbu();
                ((zzd) this.zza).zzF(zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zze
            public zzal zzh() {
                return ((zzd) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zze
            public boolean zzi() {
                return ((zzd) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zze
            public boolean zzj() {
                return ((zzd) this.zza).zzj();
            }

            public /* synthetic */ zzb(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzhbo.zzca(zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzal zzalVar) {
            zzalVar.getClass();
            zzal zzalVar2 = this.zzg;
            if (zzalVar2 != null && zzalVar2 != zzal.zzf()) {
                zzal.zza zzd2 = zzal.zzd(zzalVar2);
                zzd2.zzbj(zzalVar);
                zzalVar = zzd2.zzbs();
            }
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzal zzalVar) {
            zzalVar.getClass();
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF(zza zzaVar) {
            this.zzf = zzaVar.zza();
            this.zze |= 1;
        }

        public static zzb zzc() {
            return zzc.zzaZ();
        }

        public static zzb zzd(zzd zzdVar) {
            return zzc.zzba(zzdVar);
        }

        public static zzd zzf() {
            return zzc;
        }

        public static zzd zzg(InputStream inputStream) throws IOException {
            return (zzd) zzhbo.zzbk(zzc, inputStream);
        }

        public static zzd zzk(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzd) zzhbo.zzbl(zzc, inputStream, zzhayVar);
        }

        public static zzd zzl(zzhac zzhacVar) throws zzhcd {
            return (zzd) zzhbo.zzbm(zzc, zzhacVar);
        }

        public static zzd zzm(zzham zzhamVar) throws IOException {
            return (zzd) zzhbo.zzbn(zzc, zzhamVar);
        }

        public static zzd zzn(InputStream inputStream) throws IOException {
            return (zzd) zzhbo.zzbo(zzc, inputStream);
        }

        public static zzd zzo(ByteBuffer byteBuffer) throws zzhcd {
            return (zzd) zzhbo.zzbp(zzc, byteBuffer);
        }

        public static zzd zzp(byte[] bArr) throws zzhcd {
            return (zzd) zzhbo.zzbq(zzc, bArr);
        }

        public static zzd zzq(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzd) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
        }

        public static zzd zzr(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzd) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
        }

        public static zzd zzs(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzd) zzhbo.zzbu(zzc, inputStream, zzhayVar);
        }

        public static zzd zzt(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzd) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
        }

        public static zzd zzu(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzd) zzhbo.zzbx(zzc, bArr, zzhayVar);
        }

        public static zzhdm<zzd> zzv() {
            return zzc.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zze
        public zza zza() {
            zza zzb2 = zza.zzb(this.zzf);
            if (zzb2 == null) {
                return zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zza.zze(), "zzg"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzd();
                case NEW_BUILDER:
                    return new zzb(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzc;
                case GET_PARSER:
                    zzhdm<zzd> zzhdmVar = zzd;
                    if (zzhdmVar == null) {
                        synchronized (zzd.class) {
                            try {
                                zzhdmVar = zzd;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzc);
                                    zzd = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zze
        public zzal zzh() {
            zzal zzalVar = this.zzg;
            if (zzalVar == null) {
                return zzal.zzf();
            }
            return zzalVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zze
        public boolean zzi() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zze
        public boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zze extends zzhdf {
        zzd.zza zza();

        zzal zzh();

        boolean zzi();

        boolean zzj();
    }

    /* loaded from: classes2.dex */
    public interface zzf extends zzhdf {
        int zza();

        zzd zzab(int i9);

        zzg zzac();

        zzi zzad();

        zzk zzae();

        zzq zzaf();

        zzx zzag();

        zzz zzah();

        zzac zzai();

        zzah zzaj();

        zzat zzak(int i9);

        List<zzd> zzal();

        List<zzat> zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        boolean zzav();

        int zzb();

        zza.EnumC0129zza zzc();
    }

    /* loaded from: classes2.dex */
    public final class zzg extends zzhbo<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzd;
        private static volatile zzhdm<zzg> zze;
        private int zzf;
        private String zzg = "";
        private zzhca<zzd> zzh = zzhbo.zzbK();
        private int zzi;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzg, zza> implements zzh {
            private zza() {
                super(zzg.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzh
            public int zza() {
                return ((zzg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzh
            public zzd zzb(int i9) {
                return ((zzg) this.zza).zzb(i9);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzg) this.zza).zzM(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzN(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzN(zzdVar);
                return this;
            }

            public zza zzf(int i9, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzO(i9, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i9, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzO(i9, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzg) this.zza).zzP();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzg) this.zza).zzQ();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzg) this.zza).zzR();
                return this;
            }

            public zza zzk(int i9) {
                zzbu();
                ((zzg) this.zza).zzT(i9);
                return this;
            }

            public zza zzl(String str) {
                zzbu();
                ((zzg) this.zza).zzU(str);
                return this;
            }

            public zza zzm(zzhac zzhacVar) {
                zzbu();
                ((zzg) this.zza).zzV(zzhacVar);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzg) this.zza).zzW(zzqVar);
                return this;
            }

            public zza zzo(int i9, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzX(i9, zzbVar.zzbr());
                return this;
            }

            public zza zzp(int i9, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzX(i9, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzh
            public zzq zzq() {
                return ((zzg) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzh
            public zzhac zzr() {
                return ((zzg) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzh
            public String zzs() {
                return ((zzg) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzh
            public List<zzd> zzt() {
                return Collections.unmodifiableList(((zzg) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzh
            public boolean zzu() {
                return ((zzg) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzh
            public boolean zzv() {
                return ((zzg) this.zza).zzv();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzd = zzgVar;
            zzhbo.zzca(zzg.class, zzgVar);
        }

        private zzg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(Iterable<? extends zzd> iterable) {
            zzS();
            zzgzi.zzaQ(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzd zzdVar) {
            zzdVar.getClass();
            zzS();
            this.zzh.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(int i9, zzd zzdVar) {
            zzdVar.getClass();
            zzS();
            this.zzh.add(i9, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzf &= -2;
            this.zzg = zzg().zzs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzf &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzh = zzhbo.zzbK();
        }

        private void zzS() {
            zzhca<zzd> zzhcaVar = this.zzh;
            if (!zzhcaVar.zzc()) {
                this.zzh = zzhbo.zzbL(zzhcaVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(int i9) {
            zzS();
            this.zzh.remove(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzhac zzhacVar) {
            this.zzg = zzhacVar.zzy();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(int i9, zzd zzdVar) {
            zzdVar.getClass();
            zzS();
            this.zzh.set(i9, zzdVar);
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zze(zzg zzgVar) {
            return zzd.zzba(zzgVar);
        }

        public static zzg zzg() {
            return zzd;
        }

        public static zzg zzh(InputStream inputStream) throws IOException {
            return (zzg) zzhbo.zzbk(zzd, inputStream);
        }

        public static zzg zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzg) zzhbo.zzbl(zzd, inputStream, zzhayVar);
        }

        public static zzg zzj(zzhac zzhacVar) throws zzhcd {
            return (zzg) zzhbo.zzbm(zzd, zzhacVar);
        }

        public static zzg zzk(zzham zzhamVar) throws IOException {
            return (zzg) zzhbo.zzbn(zzd, zzhamVar);
        }

        public static zzg zzl(InputStream inputStream) throws IOException {
            return (zzg) zzhbo.zzbo(zzd, inputStream);
        }

        public static zzg zzm(ByteBuffer byteBuffer) throws zzhcd {
            return (zzg) zzhbo.zzbp(zzd, byteBuffer);
        }

        public static zzg zzn(byte[] bArr) throws zzhcd {
            return (zzg) zzhbo.zzbq(zzd, bArr);
        }

        public static zzg zzo(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzg) zzhbo.zzbr(zzd, zzhacVar, zzhayVar);
        }

        public static zzg zzp(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzg) zzhbo.zzbs(zzd, zzhamVar, zzhayVar);
        }

        public static zzg zzw(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzg) zzhbo.zzbu(zzd, inputStream, zzhayVar);
        }

        public static zzg zzx(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzg) zzhbo.zzbv(zzd, byteBuffer, zzhayVar);
        }

        public static zzg zzy(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzg) zzhbo.zzbx(zzd, bArr, zzhayVar);
        }

        public static zzhdm<zzg> zzz() {
            return zzd.zzbM();
        }

        public List<? extends zze> zzA() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzh
        public int zza() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzh
        public zzd zzb(int i9) {
            return this.zzh.get(i9);
        }

        public zze zzc(int i9) {
            return this.zzh.get(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzq.zze()});
                case NEW_MUTABLE_INSTANCE:
                    return new zzg();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzd;
                case GET_PARSER:
                    zzhdm<zzg> zzhdmVar = zze;
                    if (zzhdmVar == null) {
                        synchronized (zzg.class) {
                            try {
                                zzhdmVar = zze;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzd);
                                    zze = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzh
        public zzq zzq() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzh
        public zzhac zzr() {
            return zzhac.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzh
        public String zzs() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzh
        public List<zzd> zzt() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzh
        public boolean zzu() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzh
        public boolean zzv() {
            return (this.zzf & 2) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzh extends zzhdf {
        int zza();

        zzd zzb(int i9);

        zzq zzq();

        zzhac zzr();

        String zzs();

        List<zzd> zzt();

        boolean zzu();

        boolean zzv();
    }

    /* loaded from: classes2.dex */
    public final class zzi extends zzhbo<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzf;
        private static volatile zzhdm<zzi> zzg;
        private int zzh;
        private String zzi = "";
        private zzhca<zzd> zzj = zzhbo.zzbK();
        private int zzk = 1000;
        private int zzl = 1000;
        private int zzm = 1000;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzi, zza> implements zzj {
            private zza() {
                super(zzi.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public boolean zzA() {
                return ((zzi) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public boolean zzB() {
                return ((zzi) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public boolean zzC() {
                return ((zzi) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public boolean zzD() {
                return ((zzi) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public int zza() {
                return ((zzi) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public zzd zzb(int i9) {
                return ((zzi) this.zza).zzb(i9);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzi) this.zza).zzU(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzV(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzV(zzdVar);
                return this;
            }

            public zza zzf(int i9, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzW(i9, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i9, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzW(i9, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzi) this.zza).zzX();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzi) this.zza).zzY();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzi) this.zza).zzZ();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzi) this.zza).zzaa();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzi) this.zza).zzab();
                return this;
            }

            public zza zzm(int i9) {
                zzbu();
                ((zzi) this.zza).zzad(i9);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzae(zzqVar);
                return this;
            }

            public zza zzo(String str) {
                zzbu();
                ((zzi) this.zza).zzaf(str);
                return this;
            }

            public zza zzp(zzhac zzhacVar) {
                zzbu();
                ((zzi) this.zza).zzag(zzhacVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzah(zzqVar);
                return this;
            }

            public zza zzr(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzai(zzqVar);
                return this;
            }

            public zza zzs(int i9, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzaj(i9, zzbVar.zzbr());
                return this;
            }

            public zza zzt(int i9, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzaj(i9, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public zzq zzu() {
                return ((zzi) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public zzq zzv() {
                return ((zzi) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public zzq zzw() {
                return ((zzi) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public zzhac zzx() {
                return ((zzi) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public String zzy() {
                return ((zzi) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzj
            public List<zzd> zzz() {
                return Collections.unmodifiableList(((zzi) this.zza).zzz());
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzi zziVar = new zzi();
            zzf = zziVar;
            zzhbo.zzca(zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(Iterable<? extends zzd> iterable) {
            zzac();
            zzgzi.zzaQ(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzd zzdVar) {
            zzdVar.getClass();
            zzac();
            this.zzj.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(int i9, zzd zzdVar) {
            zzdVar.getClass();
            zzac();
            this.zzj.add(i9, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX() {
            this.zzh &= -9;
            this.zzm = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY() {
            this.zzh &= -2;
            this.zzi = zzg().zzy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ() {
            this.zzh &= -5;
            this.zzl = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa() {
            this.zzh &= -3;
            this.zzk = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab() {
            this.zzj = zzhbo.zzbK();
        }

        private void zzac() {
            zzhca<zzd> zzhcaVar = this.zzj;
            if (!zzhcaVar.zzc()) {
                this.zzj = zzhbo.zzbL(zzhcaVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad(int i9) {
            zzac();
            this.zzj.remove(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae(zzq zzqVar) {
            this.zzm = zzqVar.zza();
            this.zzh |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf(String str) {
            str.getClass();
            this.zzh |= 1;
            this.zzi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag(zzhac zzhacVar) {
            this.zzi = zzhacVar.zzy();
            this.zzh |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah(zzq zzqVar) {
            this.zzl = zzqVar.zza();
            this.zzh |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai(zzq zzqVar) {
            this.zzk = zzqVar.zza();
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(int i9, zzd zzdVar) {
            zzdVar.getClass();
            zzac();
            this.zzj.set(i9, zzdVar);
        }

        public static zza zzd() {
            return zzf.zzaZ();
        }

        public static zza zze(zzi zziVar) {
            return zzf.zzba(zziVar);
        }

        public static zzi zzg() {
            return zzf;
        }

        public static zzi zzh(InputStream inputStream) throws IOException {
            return (zzi) zzhbo.zzbk(zzf, inputStream);
        }

        public static zzi zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzi) zzhbo.zzbl(zzf, inputStream, zzhayVar);
        }

        public static zzi zzj(zzhac zzhacVar) throws zzhcd {
            return (zzi) zzhbo.zzbm(zzf, zzhacVar);
        }

        public static zzi zzk(zzham zzhamVar) throws IOException {
            return (zzi) zzhbo.zzbn(zzf, zzhamVar);
        }

        public static zzi zzl(InputStream inputStream) throws IOException {
            return (zzi) zzhbo.zzbo(zzf, inputStream);
        }

        public static zzi zzm(ByteBuffer byteBuffer) throws zzhcd {
            return (zzi) zzhbo.zzbp(zzf, byteBuffer);
        }

        public static zzi zzn(byte[] bArr) throws zzhcd {
            return (zzi) zzhbo.zzbq(zzf, bArr);
        }

        public static zzi zzo(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzi) zzhbo.zzbr(zzf, zzhacVar, zzhayVar);
        }

        public static zzi zzp(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzi) zzhbo.zzbs(zzf, zzhamVar, zzhayVar);
        }

        public static zzi zzq(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzi) zzhbo.zzbu(zzf, inputStream, zzhayVar);
        }

        public static zzi zzr(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzi) zzhbo.zzbv(zzf, byteBuffer, zzhayVar);
        }

        public static zzi zzs(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzi) zzhbo.zzbx(zzf, bArr, zzhayVar);
        }

        public static zzhdm<zzi> zzt() {
            return zzf.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public boolean zzA() {
            return (this.zzh & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public boolean zzB() {
            return (this.zzh & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public boolean zzC() {
            return (this.zzh & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public boolean zzD() {
            return (this.zzh & 2) != 0;
        }

        public List<? extends zze> zzE() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public int zza() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public zzd zzb(int i9) {
            return this.zzj.get(i9);
        }

        public zze zzc(int i9) {
            return this.zzj.get(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", zzd.class, "zzk", zzq.zze(), "zzl", zzq.zze(), "zzm", zzq.zze()});
                case NEW_MUTABLE_INSTANCE:
                    return new zzi();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzf;
                case GET_PARSER:
                    zzhdm<zzi> zzhdmVar = zzg;
                    if (zzhdmVar == null) {
                        synchronized (zzi.class) {
                            try {
                                zzhdmVar = zzg;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzf);
                                    zzg = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public zzq zzu() {
            zzq zzb2 = zzq.zzb(this.zzm);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public zzq zzv() {
            zzq zzb2 = zzq.zzb(this.zzl);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public zzq zzw() {
            zzq zzb2 = zzq.zzb(this.zzk);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public zzhac zzx() {
            return zzhac.zzw(this.zzi);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public String zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzj
        public List<zzd> zzz() {
            return this.zzj;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzj extends zzhdf {
        boolean zzA();

        boolean zzB();

        boolean zzC();

        boolean zzD();

        int zza();

        zzd zzb(int i9);

        zzq zzu();

        zzq zzv();

        zzq zzw();

        zzhac zzx();

        String zzy();

        List<zzd> zzz();
    }

    /* loaded from: classes2.dex */
    public final class zzk extends zzhbo<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzg;
        private static volatile zzhdm<zzk> zzh;
        private int zzi;
        private int zzj;
        private zzap zzk;
        private zzap zzl;
        private zzap zzm;
        private zzhca<zzap> zzn = zzhbo.zzbK();
        private int zzo;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzk, zza> implements zzl {
            private zza() {
                super(zzk.zzg);
            }

            public zza zzA(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzar(zzapVar);
                return this;
            }

            public zza zzB(int i9) {
                zzbu();
                ((zzk) this.zza).zzas(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public zzap zzC() {
                return ((zzk) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public zzap zzD() {
                return ((zzk) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public zzap zzE(int i9) {
                return ((zzk) this.zza).zzE(i9);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public zzap zzF() {
                return ((zzk) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public List<zzap> zzG() {
                return Collections.unmodifiableList(((zzk) this.zza).zzG());
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public boolean zzH() {
                return ((zzk) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public boolean zzI() {
                return ((zzk) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public boolean zzJ() {
                return ((zzk) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public boolean zzK() {
                return ((zzk) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public boolean zzL() {
                return ((zzk) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public int zza() {
                return ((zzk) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public int zzb() {
                return ((zzk) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzl
            public int zzc() {
                return ((zzk) this.zza).zzc();
            }

            public zza zzd(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzZ(zzaVar.zzbr());
                return this;
            }

            public zza zze(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzZ(zzapVar);
                return this;
            }

            public zza zzf(int i9, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaa(i9, zzaVar.zzbr());
                return this;
            }

            public zza zzg(int i9, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaa(i9, zzapVar);
                return this;
            }

            public zza zzh(Iterable<? extends zzap> iterable) {
                zzbu();
                ((zzk) this.zza).zzab(iterable);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzk) this.zza).zzac();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzk) this.zza).zzad();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzk) this.zza).zzae();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzk) this.zza).zzaf();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzk) this.zza).zzag();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzk) this.zza).zzah();
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaj(zzapVar);
                return this;
            }

            public zza zzp(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzak(zzapVar);
                return this;
            }

            public zza zzq(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzal(zzapVar);
                return this;
            }

            public zza zzr(int i9) {
                zzbu();
                ((zzk) this.zza).zzam(i9);
                return this;
            }

            public zza zzs(int i9) {
                zzbu();
                ((zzk) this.zza).zzan(i9);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzao(zzaVar.zzbr());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzao(zzapVar);
                return this;
            }

            public zza zzv(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzapVar);
                return this;
            }

            public zza zzx(int i9, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaq(i9, zzaVar.zzbr());
                return this;
            }

            public zza zzy(int i9, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaq(i9, zzapVar);
                return this;
            }

            public zza zzz(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzar(zzaVar.zzbr());
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzg = zzkVar;
            zzhbo.zzca(zzk.class, zzkVar);
        }

        private zzk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzap zzapVar) {
            zzapVar.getClass();
            zzai();
            this.zzn.add(zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(int i9, zzap zzapVar) {
            zzapVar.getClass();
            zzai();
            this.zzn.add(i9, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(Iterable<? extends zzap> iterable) {
            zzai();
            zzgzi.zzaQ(iterable, this.zzn);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac() {
            this.zzi &= -2;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad() {
            this.zzl = null;
            this.zzi &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf() {
            this.zzn = zzhbo.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag() {
            this.zzm = null;
            this.zzi &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah() {
            this.zzi &= -17;
            this.zzo = 0;
        }

        private void zzai() {
            zzhca<zzap> zzhcaVar = this.zzn;
            if (!zzhcaVar.zzc()) {
                this.zzn = zzhbo.zzbL(zzhcaVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzl;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam(int i9) {
            zzai();
            this.zzn.remove(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan(int i9) {
            this.zzi |= 1;
            this.zzj = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao(zzap zzapVar) {
            zzapVar.getClass();
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq(int i9, zzap zzapVar) {
            zzapVar.getClass();
            zzai();
            this.zzn.set(i9, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(int i9) {
            this.zzi |= 16;
            this.zzo = i9;
        }

        public static zza zzd() {
            return zzg.zzaZ();
        }

        public static zza zze(zzk zzkVar) {
            return zzg.zzba(zzkVar);
        }

        public static zzk zzg() {
            return zzg;
        }

        public static zzk zzh(InputStream inputStream) throws IOException {
            return (zzk) zzhbo.zzbk(zzg, inputStream);
        }

        public static zzk zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzk) zzhbo.zzbl(zzg, inputStream, zzhayVar);
        }

        public static zzk zzj(zzhac zzhacVar) throws zzhcd {
            return (zzk) zzhbo.zzbm(zzg, zzhacVar);
        }

        public static zzk zzk(zzham zzhamVar) throws IOException {
            return (zzk) zzhbo.zzbn(zzg, zzhamVar);
        }

        public static zzk zzl(InputStream inputStream) throws IOException {
            return (zzk) zzhbo.zzbo(zzg, inputStream);
        }

        public static zzk zzm(ByteBuffer byteBuffer) throws zzhcd {
            return (zzk) zzhbo.zzbp(zzg, byteBuffer);
        }

        public static zzk zzn(byte[] bArr) throws zzhcd {
            return (zzk) zzhbo.zzbq(zzg, bArr);
        }

        public static zzk zzo(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzk) zzhbo.zzbr(zzg, zzhacVar, zzhayVar);
        }

        public static zzk zzp(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzk) zzhbo.zzbs(zzg, zzhamVar, zzhayVar);
        }

        public static zzk zzq(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzk) zzhbo.zzbu(zzg, inputStream, zzhayVar);
        }

        public static zzk zzr(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzk) zzhbo.zzbv(zzg, byteBuffer, zzhayVar);
        }

        public static zzk zzs(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzk) zzhbo.zzbx(zzg, bArr, zzhayVar);
        }

        public static zzhdm<zzk> zzu() {
            return zzg.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public zzap zzC() {
            zzap zzapVar = this.zzl;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public zzap zzD() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public zzap zzE(int i9) {
            return this.zzn.get(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public zzap zzF() {
            zzap zzapVar = this.zzm;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public List<zzap> zzG() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public boolean zzH() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public boolean zzI() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public boolean zzJ() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public boolean zzK() {
            return (this.zzi & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public boolean zzL() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public int zza() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public int zzb() {
            return this.zzn.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzl
        public int zzc() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzap.class, "zzo"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzk();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzg;
                case GET_PARSER:
                    zzhdm<zzk> zzhdmVar = zzh;
                    if (zzhdmVar == null) {
                        synchronized (zzk.class) {
                            try {
                                zzhdmVar = zzh;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzg);
                                    zzh = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public zzaq zzt(int i9) {
            return this.zzn.get(i9);
        }

        public List<? extends zzaq> zzv() {
            return this.zzn;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzl extends zzhdf {
        zzap zzC();

        zzap zzD();

        zzap zzE(int i9);

        zzap zzF();

        List<zzap> zzG();

        boolean zzH();

        boolean zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        int zza();

        int zzb();

        int zzc();
    }

    /* loaded from: classes2.dex */
    public final class zzm extends zzhbo<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzi;
        private static volatile zzhdm<zzm> zzj;
        private int zzk;
        private zzap zzm;
        private int zzn;
        private zzar zzo;
        private int zzp;
        private String zzl = "";
        private int zzu = 1000;
        private int zzv = 1000;
        private int zzw = 1000;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzm, zza> implements zzn {
            private zza() {
                super(zzm.zzi);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public zzap zzA() {
                return ((zzm) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public zzar zzB() {
                return ((zzm) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public zzhac zzC() {
                return ((zzm) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public String zzD() {
                return ((zzm) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public boolean zzE() {
                return ((zzm) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public boolean zzF() {
                return ((zzm) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public boolean zzG() {
                return ((zzm) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public boolean zzH() {
                return ((zzm) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public boolean zzI() {
                return ((zzm) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public boolean zzJ() {
                return ((zzm) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public boolean zzK() {
                return ((zzm) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public boolean zzL() {
                return ((zzm) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public int zza() {
                return ((zzm) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public int zzb() {
                return ((zzm) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzm) this.zza).zzab();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzm) this.zza).zzac();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzm) this.zza).zzad();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzm) this.zza).zzae();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzm) this.zza).zzaf();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzm) this.zza).zzag();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzm) this.zza).zzah();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzm) this.zza).zzai();
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzaj(zzapVar);
                return this;
            }

            public zza zzl(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzak(zzarVar);
                return this;
            }

            public zza zzm(String str) {
                zzbu();
                ((zzm) this.zza).zzal(str);
                return this;
            }

            public zza zzn(zzhac zzhacVar) {
                zzbu();
                ((zzm) this.zza).zzam(zzhacVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzan(zzqVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzao(zzqVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzap(zzqVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzaq(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzaq(zzapVar);
                return this;
            }

            public zza zzt(int i9) {
                zzbu();
                ((zzm) this.zza).zzar(i9);
                return this;
            }

            public zza zzu(int i9) {
                zzbu();
                ((zzm) this.zza).zzas(i9);
                return this;
            }

            public zza zzv(zzar.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzat(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzat(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public zzq zzx() {
                return ((zzm) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public zzq zzy() {
                return ((zzm) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzn
            public zzq zzz() {
                return ((zzm) this.zza).zzz();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzi = zzmVar;
            zzhbo.zzca(zzm.class, zzmVar);
        }

        private zzm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab() {
            this.zzk &= -2;
            this.zzl = zzf().zzD();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac() {
            this.zzk &= -33;
            this.zzu = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad() {
            this.zzk &= -65;
            this.zzv = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae() {
            this.zzk &= -129;
            this.zzw = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf() {
            this.zzm = null;
            this.zzk &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag() {
            this.zzk &= -17;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah() {
            this.zzk &= -5;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai() {
            this.zzo = null;
            this.zzk &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzo;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal(String str) {
            str.getClass();
            this.zzk |= 1;
            this.zzl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam(zzhac zzhacVar) {
            this.zzl = zzhacVar.zzy();
            this.zzk |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan(zzq zzqVar) {
            this.zzu = zzqVar.zza();
            this.zzk |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao(zzq zzqVar) {
            this.zzv = zzqVar.zza();
            this.zzk |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap(zzq zzqVar) {
            this.zzw = zzqVar.zza();
            this.zzk |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar(int i9) {
            this.zzk |= 16;
            this.zzp = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(int i9) {
            this.zzk |= 4;
            this.zzn = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat(zzar zzarVar) {
            zzarVar.getClass();
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        public static zza zzc() {
            return zzi.zzaZ();
        }

        public static zza zzd(zzm zzmVar) {
            return zzi.zzba(zzmVar);
        }

        public static zzm zzf() {
            return zzi;
        }

        public static zzm zzg(InputStream inputStream) throws IOException {
            return (zzm) zzhbo.zzbk(zzi, inputStream);
        }

        public static zzm zzh(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzm) zzhbo.zzbl(zzi, inputStream, zzhayVar);
        }

        public static zzm zzi(zzhac zzhacVar) throws zzhcd {
            return (zzm) zzhbo.zzbm(zzi, zzhacVar);
        }

        public static zzm zzj(zzham zzhamVar) throws IOException {
            return (zzm) zzhbo.zzbn(zzi, zzhamVar);
        }

        public static zzm zzk(InputStream inputStream) throws IOException {
            return (zzm) zzhbo.zzbo(zzi, inputStream);
        }

        public static zzm zzl(ByteBuffer byteBuffer) throws zzhcd {
            return (zzm) zzhbo.zzbp(zzi, byteBuffer);
        }

        public static zzm zzm(byte[] bArr) throws zzhcd {
            return (zzm) zzhbo.zzbq(zzi, bArr);
        }

        public static zzm zzn(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzm) zzhbo.zzbr(zzi, zzhacVar, zzhayVar);
        }

        public static zzm zzo(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzm) zzhbo.zzbs(zzi, zzhamVar, zzhayVar);
        }

        public static zzm zzp(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzm) zzhbo.zzbu(zzi, inputStream, zzhayVar);
        }

        public static zzm zzq(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzm) zzhbo.zzbv(zzi, byteBuffer, zzhayVar);
        }

        public static zzm zzr(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzm) zzhbo.zzbx(zzi, bArr, zzhayVar);
        }

        public static zzhdm<zzm> zzs() {
            return zzi.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public zzap zzA() {
            zzap zzapVar = this.zzm;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public zzar zzB() {
            zzar zzarVar = this.zzo;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public zzhac zzC() {
            return zzhac.zzw(this.zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public String zzD() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public boolean zzE() {
            return (this.zzk & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public boolean zzF() {
            return (this.zzk & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public boolean zzG() {
            return (this.zzk & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public boolean zzH() {
            return (this.zzk & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public boolean zzI() {
            return (this.zzk & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public boolean zzJ() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public boolean zzK() {
            return (this.zzk & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public boolean zzL() {
            return (this.zzk & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public int zzb() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzq.zze(), "zzv", zzq.zze(), "zzw", zzq.zze()});
                case NEW_MUTABLE_INSTANCE:
                    return new zzm();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzi;
                case GET_PARSER:
                    zzhdm<zzm> zzhdmVar = zzj;
                    if (zzhdmVar == null) {
                        synchronized (zzm.class) {
                            try {
                                zzhdmVar = zzj;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzi);
                                    zzj = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public zzq zzx() {
            zzq zzb2 = zzq.zzb(this.zzu);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public zzq zzy() {
            zzq zzb2 = zzq.zzb(this.zzv);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzn
        public zzq zzz() {
            zzq zzb2 = zzq.zzb(this.zzw);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzn extends zzhdf {
        zzap zzA();

        zzar zzB();

        zzhac zzC();

        String zzD();

        boolean zzE();

        boolean zzF();

        boolean zzG();

        boolean zzH();

        boolean zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        int zza();

        int zzb();

        zzq zzx();

        zzq zzy();

        zzq zzz();
    }

    /* loaded from: classes2.dex */
    public final class zzo extends zzhbo<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zze;
        private static volatile zzhdm<zzo> zzf;
        private int zzg;
        private int zzh;
        private zzar zzi;
        private String zzj = "";
        private String zzk = "";

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzo, zza> implements zzp {
            private zza() {
                super(zzo.zze);
            }

            public zza zza() {
                zzbu();
                ((zzo) this.zza).zzN();
                return this;
            }

            public zza zzb() {
                zzbu();
                ((zzo) this.zza).zzO();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzo) this.zza).zzP();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzo) this.zza).zzQ();
                return this;
            }

            public zza zze(zzar zzarVar) {
                zzbu();
                ((zzo) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzf(String str) {
                zzbu();
                ((zzo) this.zza).zzS(str);
                return this;
            }

            public zza zzg(zzhac zzhacVar) {
                zzbu();
                ((zzo) this.zza).zzT(zzhacVar);
                return this;
            }

            public zza zzh(zzar.zza zzaVar) {
                zzbu();
                ((zzo) this.zza).zzU(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzar zzarVar) {
                zzbu();
                ((zzo) this.zza).zzU(zzarVar);
                return this;
            }

            public zza zzj(zzb zzbVar) {
                zzbu();
                ((zzo) this.zza).zzV(zzbVar);
                return this;
            }

            public zza zzk(String str) {
                zzbu();
                ((zzo) this.zza).zzW(str);
                return this;
            }

            public zza zzl(zzhac zzhacVar) {
                zzbu();
                ((zzo) this.zza).zzX(zzhacVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public zzb zzm() {
                return ((zzo) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public zzar zzn() {
                return ((zzo) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public zzhac zzo() {
                return ((zzo) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public zzhac zzp() {
                return ((zzo) this.zza).zzp();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public String zzq() {
                return ((zzo) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public String zzr() {
                return ((zzo) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public boolean zzs() {
                return ((zzo) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public boolean zzt() {
                return ((zzo) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public boolean zzu() {
                return ((zzo) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzp
            public boolean zzv() {
                return ((zzo) this.zza).zzv();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public enum zzb implements zzhbs {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzhbt<zzb> zzg = new zzhbt<zzb>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzo.zzb.1
                @Override // com.google.android.gms.internal.ads.zzhbt
                /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
                public zzb zza(int i9) {
                    return zzb.zzb(i9);
                }
            };
            private final int zzi;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public final class zza implements zzhbu {
                static final zzhbu zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzhbu
                public boolean zza(int i9) {
                    if (zzb.zzb(i9) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i9) {
                this.zzi = i9;
            }

            public static zzb zzb(int i9) {
                if (i9 == 0) {
                    return PLATFORM_UNSPECIFIED;
                }
                if (i9 == 1) {
                    return IOS;
                }
                if (i9 != 2) {
                    return null;
                }
                return ANDROID;
            }

            public static zzhbt<zzb> zzd() {
                return zzg;
            }

            public static zzhbu zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzhbs
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zze = zzoVar;
            zzhbo.zzca(zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static zzo zzA(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzo) zzhbo.zzbx(zze, bArr, zzhayVar);
        }

        public static zzhdm<zzo> zzB() {
            return zze.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzg &= -5;
            this.zzj = zze().zzq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzg &= -2;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzg &= -9;
            this.zzk = zze().zzr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzi;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(String str) {
            str.getClass();
            this.zzg |= 4;
            this.zzj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzhac zzhacVar) {
            this.zzj = zzhacVar.zzy();
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(zzar zzarVar) {
            zzarVar.getClass();
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzb zzbVar) {
            this.zzh = zzbVar.zza();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(String str) {
            str.getClass();
            this.zzg |= 8;
            this.zzk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(zzhac zzhacVar) {
            this.zzk = zzhacVar.zzy();
            this.zzg |= 8;
        }

        public static zza zza() {
            return zze.zzaZ();
        }

        public static zza zzc(zzo zzoVar) {
            return zze.zzba(zzoVar);
        }

        public static zzo zze() {
            return zze;
        }

        public static zzo zzf(InputStream inputStream) throws IOException {
            return (zzo) zzhbo.zzbk(zze, inputStream);
        }

        public static zzo zzg(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzo) zzhbo.zzbl(zze, inputStream, zzhayVar);
        }

        public static zzo zzh(zzhac zzhacVar) throws zzhcd {
            return (zzo) zzhbo.zzbm(zze, zzhacVar);
        }

        public static zzo zzi(zzham zzhamVar) throws IOException {
            return (zzo) zzhbo.zzbn(zze, zzhamVar);
        }

        public static zzo zzj(InputStream inputStream) throws IOException {
            return (zzo) zzhbo.zzbo(zze, inputStream);
        }

        public static zzo zzk(ByteBuffer byteBuffer) throws zzhcd {
            return (zzo) zzhbo.zzbp(zze, byteBuffer);
        }

        public static zzo zzl(byte[] bArr) throws zzhcd {
            return (zzo) zzhbo.zzbq(zze, bArr);
        }

        public static zzo zzw(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzo) zzhbo.zzbr(zze, zzhacVar, zzhayVar);
        }

        public static zzo zzx(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzo) zzhbo.zzbs(zze, zzhamVar, zzhayVar);
        }

        public static zzo zzy(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzo) zzhbo.zzbu(zze, inputStream, zzhayVar);
        }

        public static zzo zzz(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzo) zzhbo.zzbv(zze, byteBuffer, zzhayVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zze, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", zzb.zze(), "zzi", "zzj", "zzk"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzo();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zze;
                case GET_PARSER:
                    zzhdm<zzo> zzhdmVar = zzf;
                    if (zzhdmVar == null) {
                        synchronized (zzo.class) {
                            try {
                                zzhdmVar = zzf;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zze);
                                    zzf = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public zzb zzm() {
            zzb zzb2 = zzb.zzb(this.zzh);
            if (zzb2 == null) {
                return zzb.PLATFORM_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public zzar zzn() {
            zzar zzarVar = this.zzi;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public zzhac zzo() {
            return zzhac.zzw(this.zzj);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public zzhac zzp() {
            return zzhac.zzw(this.zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public String zzq() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public String zzr() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public boolean zzs() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public boolean zzt() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public boolean zzu() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzp
        public boolean zzv() {
            return (this.zzg & 8) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzp extends zzhdf {
        zzo.zzb zzm();

        zzar zzn();

        zzhac zzo();

        zzhac zzp();

        String zzq();

        String zzr();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* loaded from: classes2.dex */
    public enum zzq implements zzhbs {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);

        public static final int zzd = 0;
        public static final int zze = 1;
        public static final int zzf = 1000;
        private static final zzhbt<zzq> zzg = new zzhbt<zzq>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzq.1
            @Override // com.google.android.gms.internal.ads.zzhbt
            /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
            public zzq zza(int i9) {
                return zzq.zzb(i9);
            }
        };
        private final int zzi;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public final class zza implements zzhbu {
            static final zzhbu zza = new zza();

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zzhbu
            public boolean zza(int i9) {
                if (zzq.zzb(i9) != null) {
                    return true;
                }
                return false;
            }
        }

        zzq(int i9) {
            this.zzi = i9;
        }

        public static zzq zzb(int i9) {
            if (i9 == 0) {
                return ENUM_FALSE;
            }
            if (i9 == 1) {
                return ENUM_TRUE;
            }
            if (i9 != 1000) {
                return null;
            }
            return ENUM_UNKNOWN;
        }

        public static zzhbt<zzq> zzd() {
            return zzg;
        }

        public static zzhbu zze() {
            return zza.zza;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(zza());
        }

        @Override // com.google.android.gms.internal.ads.zzhbs
        public final int zza() {
            return this.zzi;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzr extends zzhbo<zzr, zza> implements zzs {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private static final zzhbx<Integer, zzd.zza> zzk = new zzhbx<Integer, zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzr.1
            @Override // com.google.android.gms.internal.ads.zzhbx
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(Integer num) {
                zzd.zza zzb2 = zzd.zza.zzb(num.intValue());
                if (zzb2 == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return zzb2;
            }
        };
        private static final zzhbx<Integer, zzd.zza> zzl = new zzhbx<Integer, zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbdv.zzr.2
            @Override // com.google.android.gms.internal.ads.zzhbx
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(Integer num) {
                zzd.zza zzb2 = zzd.zza.zzb(num.intValue());
                if (zzb2 == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return zzb2;
            }
        };
        private static final zzr zzm;
        private static volatile zzhdm<zzr> zzn;
        private int zzA;
        private int zzo;
        private int zzp;
        private zzar zzv;
        private int zzw;
        private int zzz;
        private String zzu = "";
        private String zzx = "";
        private String zzy = "";
        private zzhbw zzB = zzhbo.zzbG();
        private zzhbw zzC = zzhbo.zzbG();

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzr, zza> implements zzs {
            private zza() {
                super(zzr.zzm);
            }

            public zza zzA(String str) {
                zzbu();
                ((zzr) this.zza).zzci(str);
                return this;
            }

            public zza zzB(zzhac zzhacVar) {
                zzbu();
                ((zzr) this.zza).zzcj(zzhacVar);
                return this;
            }

            public zza zzC(String str) {
                zzbu();
                ((zzr) this.zza).zzck(str);
                return this;
            }

            public zza zzD(zzhac zzhacVar) {
                zzbu();
                ((zzr) this.zza).zzcl(zzhacVar);
                return this;
            }

            public zza zzE(int i9) {
                zzbu();
                ((zzr) this.zza).zzcm(i9);
                return this;
            }

            public zza zzF(zzar.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcn(zzaVar.zzbr());
                return this;
            }

            public zza zzG(zzar zzarVar) {
                zzbu();
                ((zzr) this.zza).zzcn(zzarVar);
                return this;
            }

            public zza zzH(zzo.zzb zzbVar) {
                zzbu();
                ((zzr) this.zza).zzco(zzbVar);
                return this;
            }

            public zza zzI(int i9, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcp(i9, zzaVar);
                return this;
            }

            public zza zzJ(int i9, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcq(i9, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public zzab.zzc zzK() {
                return ((zzr) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public zzar zzL() {
                return ((zzr) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public zzhac zzM() {
                return ((zzr) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public zzhac zzN() {
                return ((zzr) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public zzhac zzO() {
                return ((zzr) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public String zzP() {
                return ((zzr) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public String zzQ() {
                return ((zzr) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public String zzR() {
                return ((zzr) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public List<zzd.zza> zzS() {
                return ((zzr) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public List<zzd.zza> zzT() {
                return ((zzr) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public boolean zzU() {
                return ((zzr) this.zza).zzU();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public boolean zzV() {
                return ((zzr) this.zza).zzV();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public boolean zzW() {
                return ((zzr) this.zza).zzW();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public boolean zzX() {
                return ((zzr) this.zza).zzX();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public boolean zzY() {
                return ((zzr) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public boolean zzZ() {
                return ((zzr) this.zza).zzZ();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public int zza() {
                return ((zzr) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public boolean zzaa() {
                return ((zzr) this.zza).zzaa();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public boolean zzab() {
                return ((zzr) this.zza).zzab();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public int zzb() {
                return ((zzr) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public int zzc() {
                return ((zzr) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public zza.EnumC0129zza zzd() {
                return ((zzr) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public zzd.zza zze(int i9) {
                return ((zzr) this.zza).zze(i9);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public zzd.zza zzf(int i9) {
                return ((zzr) this.zza).zzf(i9);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzs
            public zzo.zzb zzg() {
                return ((zzr) this.zza).zzg();
            }

            public zza zzh(Iterable<? extends zzd.zza> iterable) {
                zzbu();
                ((zzr) this.zza).zzas(iterable);
                return this;
            }

            public zza zzi(Iterable<? extends zzd.zza> iterable) {
                zzbu();
                ((zzr) this.zza).zzat(iterable);
                return this;
            }

            public zza zzj(zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzau(zzaVar);
                return this;
            }

            public zza zzk(zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzav(zzaVar);
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzr) this.zza).zzaw();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzr) this.zza).zzax();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzr) this.zza).zzay();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzr) this.zza).zzaz();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzr) this.zza).zzaA();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzr) this.zza).zzaB();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzr) this.zza).zzaC();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzr) this.zza).zzaD();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzr) this.zza).zzaE();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzr) this.zza).zzaF();
                return this;
            }

            public zza zzv(zzar zzarVar) {
                zzbu();
                ((zzr) this.zza).zzaI(zzarVar);
                return this;
            }

            public zza zzw(zza.EnumC0129zza enumC0129zza) {
                zzbu();
                ((zzr) this.zza).zzaJ(enumC0129zza);
                return this;
            }

            public zza zzx(String str) {
                zzbu();
                ((zzr) this.zza).zzaK(str);
                return this;
            }

            public zza zzy(zzhac zzhacVar) {
                zzbu();
                ((zzr) this.zza).zzcg(zzhacVar);
                return this;
            }

            public zza zzz(zzab.zzc zzcVar) {
                zzbu();
                ((zzr) this.zza).zzch(zzcVar);
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzm = zzrVar;
            zzhbo.zzca(zzr.class, zzrVar);
        }

        private zzr() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA() {
            this.zzo &= -3;
            this.zzu = zzk().zzR();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB() {
            this.zzo &= -2;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC() {
            this.zzv = null;
            this.zzo &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD() {
            this.zzo &= -9;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE() {
            this.zzC = zzhbo.zzbG();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF() {
            this.zzB = zzhbo.zzbG();
        }

        private void zzaG() {
            zzhbw zzhbwVar = this.zzC;
            if (!zzhbwVar.zzc()) {
                this.zzC = zzhbo.zzbH(zzhbwVar);
            }
        }

        private void zzaH() {
            zzhbw zzhbwVar = this.zzB;
            if (!zzhbwVar.zzc()) {
                this.zzB = zzhbo.zzbH(zzhbwVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzv;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ(zza.EnumC0129zza enumC0129zza) {
            this.zzA = enumC0129zza.zza();
            this.zzo |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK(String str) {
            str.getClass();
            this.zzo |= 16;
            this.zzx = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(Iterable<? extends zzd.zza> iterable) {
            zzaG();
            Iterator<? extends zzd.zza> it = iterable.iterator();
            while (it.hasNext()) {
                this.zzC.zzi(it.next().zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat(Iterable<? extends zzd.zza> iterable) {
            zzaH();
            Iterator<? extends zzd.zza> it = iterable.iterator();
            while (it.hasNext()) {
                this.zzB.zzi(it.next().zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaG();
            this.zzC.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaH();
            this.zzB.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw() {
            this.zzo &= -129;
            this.zzA = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax() {
            this.zzo &= -17;
            this.zzx = zzk().zzP();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay() {
            this.zzo &= -65;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz() {
            this.zzo &= -33;
            this.zzy = zzk().zzQ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcg(zzhac zzhacVar) {
            this.zzx = zzhacVar.zzy();
            this.zzo |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch(zzab.zzc zzcVar) {
            this.zzz = zzcVar.zza();
            this.zzo |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci(String str) {
            str.getClass();
            this.zzo |= 32;
            this.zzy = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj(zzhac zzhacVar) {
            this.zzy = zzhacVar.zzy();
            this.zzo |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck(String str) {
            str.getClass();
            this.zzo |= 2;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl(zzhac zzhacVar) {
            this.zzu = zzhacVar.zzy();
            this.zzo |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm(int i9) {
            this.zzo |= 1;
            this.zzp = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn(zzar zzarVar) {
            zzarVar.getClass();
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco(zzo.zzb zzbVar) {
            this.zzw = zzbVar.zza();
            this.zzo |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp(int i9, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaG();
            this.zzC.zze(i9, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq(int i9, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaH();
            this.zzB.zze(i9, zzaVar.zza());
        }

        public static zza zzh() {
            return zzm.zzaZ();
        }

        public static zza zzi(zzr zzrVar) {
            return zzm.zzba(zzrVar);
        }

        public static zzr zzk() {
            return zzm;
        }

        public static zzr zzl(InputStream inputStream) throws IOException {
            return (zzr) zzhbo.zzbk(zzm, inputStream);
        }

        public static zzr zzm(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzr) zzhbo.zzbl(zzm, inputStream, zzhayVar);
        }

        public static zzr zzn(zzhac zzhacVar) throws zzhcd {
            return (zzr) zzhbo.zzbm(zzm, zzhacVar);
        }

        public static zzr zzo(zzham zzhamVar) throws IOException {
            return (zzr) zzhbo.zzbn(zzm, zzhamVar);
        }

        public static zzr zzp(InputStream inputStream) throws IOException {
            return (zzr) zzhbo.zzbo(zzm, inputStream);
        }

        public static zzr zzq(ByteBuffer byteBuffer) throws zzhcd {
            return (zzr) zzhbo.zzbp(zzm, byteBuffer);
        }

        public static zzr zzr(byte[] bArr) throws zzhcd {
            return (zzr) zzhbo.zzbq(zzm, bArr);
        }

        public static zzr zzs(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzr) zzhbo.zzbr(zzm, zzhacVar, zzhayVar);
        }

        public static zzr zzt(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzr) zzhbo.zzbs(zzm, zzhamVar, zzhayVar);
        }

        public static zzr zzu(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzr) zzhbo.zzbu(zzm, inputStream, zzhayVar);
        }

        public static zzr zzv(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzr) zzhbo.zzbv(zzm, byteBuffer, zzhayVar);
        }

        public static zzr zzw(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzr) zzhbo.zzbx(zzm, bArr, zzhayVar);
        }

        public static zzhdm<zzr> zzx() {
            return zzm.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public zzab.zzc zzK() {
            zzab.zzc zzb2 = zzab.zzc.zzb(this.zzz);
            if (zzb2 == null) {
                return zzab.zzc.NETWORKTYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public zzar zzL() {
            zzar zzarVar = this.zzv;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public zzhac zzM() {
            return zzhac.zzw(this.zzx);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public zzhac zzN() {
            return zzhac.zzw(this.zzy);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public zzhac zzO() {
            return zzhac.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public String zzP() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public String zzQ() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public String zzR() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public List<zzd.zza> zzS() {
            return new zzhby(this.zzC, zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public List<zzd.zza> zzT() {
            return new zzhby(this.zzB, zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public boolean zzU() {
            return (this.zzo & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public boolean zzV() {
            return (this.zzo & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public boolean zzW() {
            return (this.zzo & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public boolean zzX() {
            return (this.zzo & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public boolean zzY() {
            return (this.zzo & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public boolean zzZ() {
            return (this.zzo & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public boolean zzaa() {
            return (this.zzo & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public boolean zzab() {
            return (this.zzo & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public int zzc() {
            return this.zzB.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public zza.EnumC0129zza zzd() {
            zza.EnumC0129zza zzb2 = zza.EnumC0129zza.zzb(this.zzA);
            if (zzb2 == null) {
                return zza.EnumC0129zza.AD_INITIATER_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzm, "\u0001\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzo", "zzp", "zzu", "zzv", "zzw", zzo.zzb.zze(), "zzx", "zzy", "zzz", zzab.zzc.zze(), "zzA", zza.EnumC0129zza.zze(), "zzB", zzd.zza.zze(), "zzC", zzd.zza.zze()});
                case NEW_MUTABLE_INSTANCE:
                    return new zzr();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzm;
                case GET_PARSER:
                    zzhdm<zzr> zzhdmVar = zzn;
                    if (zzhdmVar == null) {
                        synchronized (zzr.class) {
                            try {
                                zzhdmVar = zzn;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzm);
                                    zzn = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public zzd.zza zze(int i9) {
            zzd.zza zzb2 = zzd.zza.zzb(this.zzC.zzd(i9));
            if (zzb2 == null) {
                return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public zzd.zza zzf(int i9) {
            zzd.zza zzb2 = zzd.zza.zzb(this.zzB.zzd(i9));
            if (zzb2 == null) {
                return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzs
        public zzo.zzb zzg() {
            zzo.zzb zzb2 = zzo.zzb.zzb(this.zzw);
            if (zzb2 == null) {
                return zzo.zzb.PLATFORM_UNSPECIFIED;
            }
            return zzb2;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzs extends zzhdf {
        zzab.zzc zzK();

        zzar zzL();

        zzhac zzM();

        zzhac zzN();

        zzhac zzO();

        String zzP();

        String zzQ();

        String zzR();

        List<zzd.zza> zzS();

        List<zzd.zza> zzT();

        boolean zzU();

        boolean zzV();

        boolean zzW();

        boolean zzX();

        boolean zzY();

        boolean zzZ();

        int zza();

        boolean zzaa();

        boolean zzab();

        int zzb();

        int zzc();

        zza.EnumC0129zza zzd();

        zzd.zza zze(int i9);

        zzd.zza zzf(int i9);

        zzo.zzb zzg();
    }

    /* loaded from: classes2.dex */
    public final class zzt extends zzhbo<zzt, zza> implements zzu {
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private static final zzt zzn;
        private static volatile zzhdm<zzt> zzo;
        private zzm zzA;
        private zzo zzB;
        private zzab zzC;
        private zza zzD;
        private zzaf zzE;
        private zzbl zzF;
        private zzb zzG;
        private int zzp;
        private int zzu;
        private int zzw;
        private zzar zzy;
        private String zzv = "";
        private int zzx = 1000;
        private zzhbz zzz = zzhbo.zzbI();

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzt, zza> implements zzu {
            private zza() {
                super(zzt.zzn);
            }

            public zza zzA(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcr(zzmVar);
                return this;
            }

            public zza zzB(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzcs(zzoVar);
                return this;
            }

            public zza zzC(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzct(zzabVar);
                return this;
            }

            public zza zzD(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzcu(zzafVar);
                return this;
            }

            public zza zzE(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcv(zzarVar);
                return this;
            }

            public zza zzF(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcw(zzblVar);
                return this;
            }

            public zza zzG(zza.zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcx(zzbVar.zzbr());
                return this;
            }

            public zza zzH(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcx(zzaVar);
                return this;
            }

            public zza zzI(zzb.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzcVar.zzbr());
                return this;
            }

            public zza zzJ(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzbVar);
                return this;
            }

            public zza zzK(zzm.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzaVar.zzbr());
                return this;
            }

            public zza zzL(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzmVar);
                return this;
            }

            public zza zzM(zzo.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcA(zzaVar.zzbr());
                return this;
            }

            public zza zzN(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzcA(zzoVar);
                return this;
            }

            public zza zzO(String str) {
                zzbu();
                ((zzt) this.zza).zzcB(str);
                return this;
            }

            public zza zzP(zzhac zzhacVar) {
                zzbu();
                ((zzt) this.zza).zzcC(zzhacVar);
                return this;
            }

            public zza zzQ(int i9, long j7) {
                zzbu();
                ((zzt) this.zza).zzcD(i9, j7);
                return this;
            }

            public zza zzR(zzq zzqVar) {
                zzbu();
                ((zzt) this.zza).zzcE(zzqVar);
                return this;
            }

            public zza zzS(int i9) {
                zzbu();
                ((zzt) this.zza).zzcF(i9);
                return this;
            }

            public zza zzT(zzab.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcG(zzaVar.zzbr());
                return this;
            }

            public zza zzU(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzcG(zzabVar);
                return this;
            }

            public zza zzV(zzaf.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzcVar.zzbr());
                return this;
            }

            public zza zzW(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzafVar);
                return this;
            }

            public zza zzX(zzar.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zza zzY(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcI(zzarVar);
                return this;
            }

            public zza zzZ(int i9) {
                zzbu();
                ((zzt) this.zza).zzcJ(i9);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public int zza() {
                return ((zzt) this.zza).zza();
            }

            public zza zzaa(zzbl.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcK(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcK(zzblVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zzab zzac() {
                return ((zzt) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zzaf zzad() {
                return ((zzt) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zzar zzae() {
                return ((zzt) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zzbl zzaf() {
                return ((zzt) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zzhac zzag() {
                return ((zzt) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public String zzah() {
                return ((zzt) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public List<Long> zzai() {
                return Collections.unmodifiableList(((zzt) this.zza).zzai());
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzaj() {
                return ((zzt) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzak() {
                return ((zzt) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzal() {
                return ((zzt) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzam() {
                return ((zzt) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzan() {
                return ((zzt) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzao() {
                return ((zzt) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzap() {
                return ((zzt) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzaq() {
                return ((zzt) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzar() {
                return ((zzt) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzas() {
                return ((zzt) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzat() {
                return ((zzt) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public boolean zzau() {
                return ((zzt) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public int zzb() {
                return ((zzt) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public int zzc() {
                return ((zzt) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public long zzd(int i9) {
                return ((zzt) this.zza).zzd(i9);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zza zze() {
                return ((zzt) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zzb zzf() {
                return ((zzt) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zzm zzg() {
                return ((zzt) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zzo zzh() {
                return ((zzt) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzu
            public zzq zzi() {
                return ((zzt) this.zza).zzi();
            }

            public zza zzj(Iterable<? extends Long> iterable) {
                zzbu();
                ((zzt) this.zza).zzaE(iterable);
                return this;
            }

            public zza zzk(long j7) {
                zzbu();
                ((zzt) this.zza).zzaF(j7);
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzt) this.zza).zzaG();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzt) this.zza).zzaH();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzt) this.zza).zzaI();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzt) this.zza).zzaJ();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzt) this.zza).zzaK();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzt) this.zza).zzcg();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzt) this.zza).zzch();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzt) this.zza).zzci();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzt) this.zza).zzcj();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzt) this.zza).zzck();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzt) this.zza).zzcl();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzt) this.zza).zzcm();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzt) this.zza).zzcn();
                return this;
            }

            public zza zzy(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcp(zzaVar);
                return this;
            }

            public zza zzz(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcq(zzbVar);
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzt zztVar = new zzt();
            zzn = zztVar;
            zzhbo.zzca(zzt.class, zztVar);
        }

        private zzt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(Iterable<? extends Long> iterable) {
            zzco();
            zzgzi.zzaQ(iterable, this.zzz);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(long j7) {
            zzco();
            this.zzz.zzg(j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG() {
            this.zzD = null;
            this.zzp &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaH() {
            this.zzG = null;
            this.zzp &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI() {
            this.zzA = null;
            this.zzp &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ() {
            this.zzB = null;
            this.zzp &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK() {
            this.zzp &= -3;
            this.zzv = zzm().zzah();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(zzo zzoVar) {
            zzoVar.getClass();
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(String str) {
            str.getClass();
            this.zzp |= 2;
            this.zzv = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(zzhac zzhacVar) {
            this.zzv = zzhacVar.zzy();
            this.zzp |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(int i9, long j7) {
            zzco();
            this.zzz.zzd(i9, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(zzq zzqVar) {
            this.zzx = zzqVar.zza();
            this.zzp |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(int i9) {
            this.zzp |= 1;
            this.zzu = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(zzab zzabVar) {
            zzabVar.getClass();
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzE = zzafVar;
            this.zzp |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzar zzarVar) {
            zzarVar.getClass();
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(int i9) {
            this.zzp |= 4;
            this.zzw = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(zzbl zzblVar) {
            zzblVar.getClass();
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcg() {
            this.zzz = zzhbo.zzbI();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzp &= -9;
            this.zzx = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzp &= -2;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzC = null;
            this.zzp &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzE = null;
            this.zzp &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzy = null;
            this.zzp &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzp &= -5;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzF = null;
            this.zzp &= -1025;
        }

        private void zzco() {
            zzhbz zzhbzVar = this.zzz;
            if (!zzhbzVar.zzc()) {
                this.zzz = zzhbo.zzbJ(zzhbzVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp(zza zzaVar) {
            zzaVar.getClass();
            zza zzaVar2 = this.zzD;
            if (zzaVar2 != null && zzaVar2 != zza.zzg()) {
                zza.zzb zze2 = zza.zze(zzaVar2);
                zze2.zzbj(zzaVar);
                zzaVar = zze2.zzbs();
            }
            this.zzD = zzaVar;
            this.zzp |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq(zzb zzbVar) {
            zzbVar.getClass();
            zzb zzbVar2 = this.zzG;
            if (zzbVar2 != null && zzbVar2 != zzb.zzg()) {
                zzb.zzc zze2 = zzb.zze(zzbVar2);
                zze2.zzbj(zzbVar);
                zzbVar = zze2.zzbs();
            }
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr(zzm zzmVar) {
            zzmVar.getClass();
            zzm zzmVar2 = this.zzA;
            if (zzmVar2 != null && zzmVar2 != zzm.zzf()) {
                zzm.zza zzd2 = zzm.zzd(zzmVar2);
                zzd2.zzbj(zzmVar);
                zzmVar = zzd2.zzbs();
            }
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs(zzo zzoVar) {
            zzoVar.getClass();
            zzo zzoVar2 = this.zzB;
            if (zzoVar2 != null && zzoVar2 != zzo.zze()) {
                zzo.zza zzc2 = zzo.zzc(zzoVar2);
                zzc2.zzbj(zzoVar);
                zzoVar = zzc2.zzbs();
            }
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct(zzab zzabVar) {
            zzabVar.getClass();
            zzab zzabVar2 = this.zzC;
            if (zzabVar2 != null && zzabVar2 != zzab.zzi()) {
                zzab.zza zzc2 = zzab.zzc(zzabVar2);
                zzc2.zzbj(zzabVar);
                zzabVar = zzc2.zzbs();
            }
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu(zzaf zzafVar) {
            zzafVar.getClass();
            zzaf zzafVar2 = this.zzE;
            if (zzafVar2 != null && zzafVar2 != zzaf.zzl()) {
                zzaf.zzc zzj2 = zzaf.zzj(zzafVar2);
                zzj2.zzbj(zzafVar);
                zzafVar = zzj2.zzbs();
            }
            this.zzE = zzafVar;
            this.zzp |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzy;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw(zzbl zzblVar) {
            zzblVar.getClass();
            zzbl zzblVar2 = this.zzF;
            if (zzblVar2 != null && zzblVar2 != zzbl.zzi()) {
                zzbl.zza zzd2 = zzbl.zzd(zzblVar2);
                zzd2.zzbj(zzblVar);
                zzblVar = zzd2.zzbs();
            }
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zza zzaVar) {
            zzaVar.getClass();
            this.zzD = zzaVar;
            this.zzp |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzb zzbVar) {
            zzbVar.getClass();
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzm zzmVar) {
            zzmVar.getClass();
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        public static zza zzj() {
            return zzn.zzaZ();
        }

        public static zza zzk(zzt zztVar) {
            return zzn.zzba(zztVar);
        }

        public static zzt zzm() {
            return zzn;
        }

        public static zzt zzn(InputStream inputStream) throws IOException {
            return (zzt) zzhbo.zzbk(zzn, inputStream);
        }

        public static zzt zzo(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzt) zzhbo.zzbl(zzn, inputStream, zzhayVar);
        }

        public static zzt zzp(zzhac zzhacVar) throws zzhcd {
            return (zzt) zzhbo.zzbm(zzn, zzhacVar);
        }

        public static zzt zzq(zzham zzhamVar) throws IOException {
            return (zzt) zzhbo.zzbn(zzn, zzhamVar);
        }

        public static zzt zzr(InputStream inputStream) throws IOException {
            return (zzt) zzhbo.zzbo(zzn, inputStream);
        }

        public static zzt zzs(ByteBuffer byteBuffer) throws zzhcd {
            return (zzt) zzhbo.zzbp(zzn, byteBuffer);
        }

        public static zzt zzt(byte[] bArr) throws zzhcd {
            return (zzt) zzhbo.zzbq(zzn, bArr);
        }

        public static zzt zzu(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzt) zzhbo.zzbr(zzn, zzhacVar, zzhayVar);
        }

        public static zzt zzv(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzt) zzhbo.zzbs(zzn, zzhamVar, zzhayVar);
        }

        public static zzt zzw(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzt) zzhbo.zzbu(zzn, inputStream, zzhayVar);
        }

        public static zzt zzx(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzt) zzhbo.zzbv(zzn, byteBuffer, zzhayVar);
        }

        public static zzt zzy(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzt) zzhbo.zzbx(zzn, bArr, zzhayVar);
        }

        public static zzhdm<zzt> zzz() {
            return zzn.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public int zza() {
            return this.zzz.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zzab zzac() {
            zzab zzabVar = this.zzC;
            if (zzabVar == null) {
                return zzab.zzi();
            }
            return zzabVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zzaf zzad() {
            zzaf zzafVar = this.zzE;
            if (zzafVar == null) {
                return zzaf.zzl();
            }
            return zzafVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zzar zzae() {
            zzar zzarVar = this.zzy;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zzbl zzaf() {
            zzbl zzblVar = this.zzF;
            if (zzblVar == null) {
                return zzbl.zzi();
            }
            return zzblVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zzhac zzag() {
            return zzhac.zzw(this.zzv);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public String zzah() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public List<Long> zzai() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzaj() {
            return (this.zzp & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzak() {
            return (this.zzp & 2048) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzal() {
            return (this.zzp & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzam() {
            return (this.zzp & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzan() {
            return (this.zzp & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzao() {
            return (this.zzp & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzap() {
            return (this.zzp & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzaq() {
            return (this.zzp & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzar() {
            return (this.zzp & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzas() {
            return (this.zzp & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzat() {
            return (this.zzp & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public boolean zzau() {
            return (this.zzp & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public int zzb() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public int zzc() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public long zzd(int i9) {
            return this.zzz.zza(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzn, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", zzq.zze(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzt();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzn;
                case GET_PARSER:
                    zzhdm<zzt> zzhdmVar = zzo;
                    if (zzhdmVar == null) {
                        synchronized (zzt.class) {
                            try {
                                zzhdmVar = zzo;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzn);
                                    zzo = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zza zze() {
            zza zzaVar = this.zzD;
            if (zzaVar == null) {
                return zza.zzg();
            }
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zzb zzf() {
            zzb zzbVar = this.zzG;
            if (zzbVar == null) {
                return zzb.zzg();
            }
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zzm zzg() {
            zzm zzmVar = this.zzA;
            if (zzmVar == null) {
                return zzm.zzf();
            }
            return zzmVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zzo zzh() {
            zzo zzoVar = this.zzB;
            if (zzoVar == null) {
                return zzo.zze();
            }
            return zzoVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzu
        public zzq zzi() {
            zzq zzb2 = zzq.zzb(this.zzx);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzu extends zzhdf {
        int zza();

        zzab zzac();

        zzaf zzad();

        zzar zzae();

        zzbl zzaf();

        zzhac zzag();

        String zzah();

        List<Long> zzai();

        boolean zzaj();

        boolean zzak();

        boolean zzal();

        boolean zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        int zzb();

        int zzc();

        long zzd(int i9);

        zza zze();

        zzb zzf();

        zzm zzg();

        zzo zzh();

        zzq zzi();
    }

    /* loaded from: classes2.dex */
    public final class zzv extends zzhbo<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zze;
        private static volatile zzhdm<zzv> zzf;
        private int zzg;
        private int zzi;
        private zzap zzk;
        private String zzh = "";
        private zzhbw zzj = zzhbo.zzbG();

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzv, zza> implements zzw {
            private zza() {
                super(zzv.zze);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public int zza(int i9) {
                return ((zzv) this.zza).zza(i9);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public int zzb() {
                return ((zzv) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public zzq zzc() {
                return ((zzv) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzv) this.zza).zzN(iterable);
                return this;
            }

            public zza zze(int i9) {
                zzbu();
                ((zzv) this.zza).zzO(i9);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzv) this.zza).zzP();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzv) this.zza).zzQ();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzv) this.zza).zzR();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzv) this.zza).zzS();
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzU(zzapVar);
                return this;
            }

            public zza zzk(String str) {
                zzbu();
                ((zzv) this.zza).zzV(str);
                return this;
            }

            public zza zzl(zzhac zzhacVar) {
                zzbu();
                ((zzv) this.zza).zzW(zzhacVar);
                return this;
            }

            public zza zzm(zzap.zza zzaVar) {
                zzbu();
                ((zzv) this.zza).zzX(zzaVar.zzbr());
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzX(zzapVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzv) this.zza).zzY(zzqVar);
                return this;
            }

            public zza zzp(int i9, int i10) {
                zzbu();
                ((zzv) this.zza).zzZ(i9, i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public zzap zzq() {
                return ((zzv) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public zzhac zzr() {
                return ((zzv) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public String zzs() {
                return ((zzv) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public List<Integer> zzt() {
                return Collections.unmodifiableList(((zzv) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public boolean zzu() {
                return ((zzv) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public boolean zzv() {
                return ((zzv) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzw
            public boolean zzw() {
                return ((zzv) this.zza).zzw();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzv zzvVar = new zzv();
            zze = zzvVar;
            zzhbo.zzca(zzv.class, zzvVar);
        }

        private zzv() {
        }

        public static zzhdm<zzv> zzA() {
            return zze.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(Iterable<? extends Integer> iterable) {
            zzT();
            zzgzi.zzaQ(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(int i9) {
            zzT();
            this.zzj.zzi(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzg &= -2;
            this.zzh = zzg().zzs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzk = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzg &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS() {
            this.zzj = zzhbo.zzbG();
        }

        private void zzT() {
            zzhbw zzhbwVar = this.zzj;
            if (!zzhbwVar.zzc()) {
                this.zzj = zzhbo.zzbH(zzhbwVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(String str) {
            str.getClass();
            this.zzg |= 1;
            this.zzh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzhac zzhacVar) {
            this.zzh = zzhacVar.zzy();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(int i9, int i10) {
            zzT();
            this.zzj.zze(i9, i10);
        }

        public static zza zzd() {
            return zze.zzaZ();
        }

        public static zza zze(zzv zzvVar) {
            return zze.zzba(zzvVar);
        }

        public static zzv zzg() {
            return zze;
        }

        public static zzv zzh(InputStream inputStream) throws IOException {
            return (zzv) zzhbo.zzbk(zze, inputStream);
        }

        public static zzv zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzv) zzhbo.zzbl(zze, inputStream, zzhayVar);
        }

        public static zzv zzj(zzhac zzhacVar) throws zzhcd {
            return (zzv) zzhbo.zzbm(zze, zzhacVar);
        }

        public static zzv zzk(zzham zzhamVar) throws IOException {
            return (zzv) zzhbo.zzbn(zze, zzhamVar);
        }

        public static zzv zzl(InputStream inputStream) throws IOException {
            return (zzv) zzhbo.zzbo(zze, inputStream);
        }

        public static zzv zzm(ByteBuffer byteBuffer) throws zzhcd {
            return (zzv) zzhbo.zzbp(zze, byteBuffer);
        }

        public static zzv zzn(byte[] bArr) throws zzhcd {
            return (zzv) zzhbo.zzbq(zze, bArr);
        }

        public static zzv zzo(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzv) zzhbo.zzbr(zze, zzhacVar, zzhayVar);
        }

        public static zzv zzp(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzv) zzhbo.zzbs(zze, zzhamVar, zzhayVar);
        }

        public static zzv zzx(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzv) zzhbo.zzbu(zze, inputStream, zzhayVar);
        }

        public static zzv zzy(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzv) zzhbo.zzbv(zze, byteBuffer, zzhayVar);
        }

        public static zzv zzz(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzv) zzhbo.zzbx(zze, bArr, zzhayVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public int zza(int i9) {
            return this.zzj.zzd(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public int zzb() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public zzq zzc() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzv();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zze;
                case GET_PARSER:
                    zzhdm<zzv> zzhdmVar = zzf;
                    if (zzhdmVar == null) {
                        synchronized (zzv.class) {
                            try {
                                zzhdmVar = zzf;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zze);
                                    zzf = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public zzap zzq() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public zzhac zzr() {
            return zzhac.zzw(this.zzh);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public String zzs() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public List<Integer> zzt() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public boolean zzu() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public boolean zzv() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzw
        public boolean zzw() {
            return (this.zzg & 2) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzw extends zzhdf {
        int zza(int i9);

        int zzb();

        zzq zzc();

        zzap zzq();

        zzhac zzr();

        String zzs();

        List<Integer> zzt();

        boolean zzu();

        boolean zzv();

        boolean zzw();
    }

    /* loaded from: classes2.dex */
    public final class zzx extends zzhbo<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzc;
        private static volatile zzhdm<zzx> zzd;
        private int zze;
        private int zzf;
        private zzhbw zzg = zzhbo.zzbG();

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzx, zza> implements zzy {
            private zza() {
                super(zzx.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzy
            public int zza(int i9) {
                return ((zzx) this.zza).zza(i9);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzy
            public int zzb() {
                return ((zzx) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzy
            public zzq zzc() {
                return ((zzx) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzx) this.zza).zzC(iterable);
                return this;
            }

            public zza zze(int i9) {
                zzbu();
                ((zzx) this.zza).zzD(i9);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzx) this.zza).zzE();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzx) this.zza).zzF();
                return this;
            }

            public zza zzh(int i9, int i10) {
                zzbu();
                ((zzx) this.zza).zzH(i9, i10);
                return this;
            }

            public zza zzi(zzq zzqVar) {
                zzbu();
                ((zzx) this.zza).zzI(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzy
            public List<Integer> zzj() {
                return Collections.unmodifiableList(((zzx) this.zza).zzj());
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzy
            public boolean zzk() {
                return ((zzx) this.zza).zzk();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzc = zzxVar;
            zzhbo.zzca(zzx.class, zzxVar);
        }

        private zzx() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(Iterable<? extends Integer> iterable) {
            zzG();
            zzgzi.zzaQ(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i9) {
            zzG();
            this.zzg.zzi(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE() {
            this.zzg = zzhbo.zzbG();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zze &= -2;
            this.zzf = 0;
        }

        private void zzG() {
            zzhbw zzhbwVar = this.zzg;
            if (!zzhbwVar.zzc()) {
                this.zzg = zzhbo.zzbH(zzhbwVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH(int i9, int i10) {
            zzG();
            this.zzg.zze(i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzd() {
            return zzc.zzaZ();
        }

        public static zza zze(zzx zzxVar) {
            return zzc.zzba(zzxVar);
        }

        public static zzx zzg() {
            return zzc;
        }

        public static zzx zzh(InputStream inputStream) throws IOException {
            return (zzx) zzhbo.zzbk(zzc, inputStream);
        }

        public static zzx zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzx) zzhbo.zzbl(zzc, inputStream, zzhayVar);
        }

        public static zzx zzl(zzhac zzhacVar) throws zzhcd {
            return (zzx) zzhbo.zzbm(zzc, zzhacVar);
        }

        public static zzx zzm(zzham zzhamVar) throws IOException {
            return (zzx) zzhbo.zzbn(zzc, zzhamVar);
        }

        public static zzx zzn(InputStream inputStream) throws IOException {
            return (zzx) zzhbo.zzbo(zzc, inputStream);
        }

        public static zzx zzo(ByteBuffer byteBuffer) throws zzhcd {
            return (zzx) zzhbo.zzbp(zzc, byteBuffer);
        }

        public static zzx zzp(byte[] bArr) throws zzhcd {
            return (zzx) zzhbo.zzbq(zzc, bArr);
        }

        public static zzx zzq(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzx) zzhbo.zzbr(zzc, zzhacVar, zzhayVar);
        }

        public static zzx zzr(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzx) zzhbo.zzbs(zzc, zzhamVar, zzhayVar);
        }

        public static zzx zzs(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzx) zzhbo.zzbu(zzc, inputStream, zzhayVar);
        }

        public static zzx zzt(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzx) zzhbo.zzbv(zzc, byteBuffer, zzhayVar);
        }

        public static zzx zzu(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzx) zzhbo.zzbx(zzc, bArr, zzhayVar);
        }

        public static zzhdm<zzx> zzv() {
            return zzc.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzy
        public int zza(int i9) {
            return this.zzg.zzd(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzy
        public int zzb() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzy
        public zzq zzc() {
            zzq zzb2 = zzq.zzb(this.zzf);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzx();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zzc;
                case GET_PARSER:
                    zzhdm<zzx> zzhdmVar = zzd;
                    if (zzhdmVar == null) {
                        synchronized (zzx.class) {
                            try {
                                zzhdmVar = zzd;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zzc);
                                    zzd = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzy
        public List<Integer> zzj() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzy
        public boolean zzk() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface zzy extends zzhdf {
        int zza(int i9);

        int zzb();

        zzq zzc();

        List<Integer> zzj();

        boolean zzk();
    }

    /* loaded from: classes2.dex */
    public final class zzz extends zzhbo<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zze;
        private static volatile zzhdm<zzz> zzf;
        private int zzg;
        private zzv zzh;
        private zzhca<zzan> zzi = zzhbo.zzbK();
        private int zzj;
        private zzap zzk;

        /* loaded from: classes2.dex */
        public final class zza extends zzhbi<zzz, zza> implements zzaa {
            private zza() {
                super(zzz.zze);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
            public boolean zzA() {
                return ((zzz) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
            public boolean zzB() {
                return ((zzz) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
            public int zza() {
                return ((zzz) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
            public zzq zzb() {
                return ((zzz) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
            public zzv zzc() {
                return ((zzz) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends zzan> iterable) {
                zzbu();
                ((zzz) this.zza).zzQ(iterable);
                return this;
            }

            public zza zze(zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzR(zzaVar.zzbr());
                return this;
            }

            public zza zzf(zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzR(zzanVar);
                return this;
            }

            public zza zzg(int i9, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzS(i9, zzaVar.zzbr());
                return this;
            }

            public zza zzh(int i9, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzS(i9, zzanVar);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzz) this.zza).zzT();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzz) this.zza).zzU();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzz) this.zza).zzV();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzz) this.zza).zzW();
                return this;
            }

            public zza zzm(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzY(zzvVar);
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzZ(zzapVar);
                return this;
            }

            public zza zzo(int i9) {
                zzbu();
                ((zzz) this.zza).zzaa(i9);
                return this;
            }

            public zza zzp(zzv.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzab(zzaVar.zzbr());
                return this;
            }

            public zza zzq(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzab(zzvVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzapVar);
                return this;
            }

            public zza zzt(zzq zzqVar) {
                zzbu();
                ((zzz) this.zza).zzad(zzqVar);
                return this;
            }

            public zza zzu(int i9, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzae(i9, zzaVar.zzbr());
                return this;
            }

            public zza zzv(int i9, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzae(i9, zzanVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
            public zzan zzw(int i9) {
                return ((zzz) this.zza).zzw(i9);
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
            public zzap zzx() {
                return ((zzz) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
            public List<zzan> zzy() {
                return Collections.unmodifiableList(((zzz) this.zza).zzy());
            }

            @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
            public boolean zzz() {
                return ((zzz) this.zza).zzz();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzz zzzVar = new zzz();
            zze = zzzVar;
            zzhbo.zzca(zzz.class, zzzVar);
        }

        private zzz() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ(Iterable<? extends zzan> iterable) {
            zzX();
            zzgzi.zzaQ(iterable, this.zzi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzan zzanVar) {
            zzanVar.getClass();
            zzX();
            this.zzi.add(zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(int i9, zzan zzanVar) {
            zzanVar.getClass();
            zzX();
            this.zzi.add(i9, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT() {
            this.zzh = null;
            this.zzg &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU() {
            this.zzk = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV() {
            this.zzg &= -3;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW() {
            this.zzi = zzhbo.zzbK();
        }

        private void zzX() {
            zzhca<zzan> zzhcaVar = this.zzi;
            if (!zzhcaVar.zzc()) {
                this.zzi = zzhbo.zzbL(zzhcaVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(zzv zzvVar) {
            zzvVar.getClass();
            zzv zzvVar2 = this.zzh;
            if (zzvVar2 != null && zzvVar2 != zzv.zzg()) {
                zzv.zza zze2 = zzv.zze(zzvVar2);
                zze2.zzbj(zzvVar);
                zzvVar = zze2.zzbs();
            }
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(int i9) {
            zzX();
            this.zzi.remove(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(zzv zzvVar) {
            zzvVar.getClass();
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae(int i9, zzan zzanVar) {
            zzanVar.getClass();
            zzX();
            this.zzi.set(i9, zzanVar);
        }

        public static zza zzd() {
            return zze.zzaZ();
        }

        public static zza zze(zzz zzzVar) {
            return zze.zzba(zzzVar);
        }

        public static zzz zzg() {
            return zze;
        }

        public static zzz zzh(InputStream inputStream) throws IOException {
            return (zzz) zzhbo.zzbk(zze, inputStream);
        }

        public static zzz zzi(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzz) zzhbo.zzbl(zze, inputStream, zzhayVar);
        }

        public static zzz zzj(zzhac zzhacVar) throws zzhcd {
            return (zzz) zzhbo.zzbm(zze, zzhacVar);
        }

        public static zzz zzk(zzham zzhamVar) throws IOException {
            return (zzz) zzhbo.zzbn(zze, zzhamVar);
        }

        public static zzz zzl(InputStream inputStream) throws IOException {
            return (zzz) zzhbo.zzbo(zze, inputStream);
        }

        public static zzz zzm(ByteBuffer byteBuffer) throws zzhcd {
            return (zzz) zzhbo.zzbp(zze, byteBuffer);
        }

        public static zzz zzn(byte[] bArr) throws zzhcd {
            return (zzz) zzhbo.zzbq(zze, bArr);
        }

        public static zzz zzo(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
            return (zzz) zzhbo.zzbr(zze, zzhacVar, zzhayVar);
        }

        public static zzz zzp(zzham zzhamVar, zzhay zzhayVar) throws IOException {
            return (zzz) zzhbo.zzbs(zze, zzhamVar, zzhayVar);
        }

        public static zzz zzq(InputStream inputStream, zzhay zzhayVar) throws IOException {
            return (zzz) zzhbo.zzbu(zze, inputStream, zzhayVar);
        }

        public static zzz zzr(ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
            return (zzz) zzhbo.zzbv(zze, byteBuffer, zzhayVar);
        }

        public static zzz zzs(byte[] bArr, zzhay zzhayVar) throws zzhcd {
            return (zzz) zzhbo.zzbx(zze, bArr, zzhayVar);
        }

        public static zzhdm<zzz> zzu() {
            return zze.zzbM();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
        public boolean zzA() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
        public boolean zzB() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
        public int zza() {
            return this.zzi.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
        public zzq zzb() {
            zzq zzb2 = zzq.zzb(this.zzj);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
        public zzv zzc() {
            zzv zzvVar = this.zzh;
            if (zzvVar == null) {
                return zzv.zzg();
            }
            return zzvVar;
        }

        @Override // com.google.android.gms.internal.ads.zzhbo
        public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
            zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (zzhbnVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return zzhbo.zzbR(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzan.class, "zzj", zzq.zze(), "zzk"});
                case NEW_MUTABLE_INSTANCE:
                    return new zzz();
                case NEW_BUILDER:
                    return new zza(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return zze;
                case GET_PARSER:
                    zzhdm<zzz> zzhdmVar = zzf;
                    if (zzhdmVar == null) {
                        synchronized (zzz.class) {
                            try {
                                zzhdmVar = zzf;
                                if (zzhdmVar == null) {
                                    zzhdmVar = new zzhbj(zze);
                                    zzf = zzhdmVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzhdmVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public zzao zzt(int i9) {
            return this.zzi.get(i9);
        }

        public List<? extends zzao> zzv() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
        public zzan zzw(int i9) {
            return this.zzi.get(i9);
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
        public zzap zzx() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
        public List<zzan> zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbdv.zzaa
        public boolean zzz() {
            return (this.zzg & 1) != 0;
        }
    }

    private zzbdv() {
    }

    public static void zza(zzhay zzhayVar) {
    }
}
