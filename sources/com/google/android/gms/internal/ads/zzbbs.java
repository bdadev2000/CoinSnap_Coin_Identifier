package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes3.dex */
public final class zzbbs {

    /* renamed from: com.google.android.gms.internal.ads.zzbbs$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zza;

        static {
            int[] iArr = new int[zzgyw.values().length];
            zza = iArr;
            try {
                iArr[zzgyw.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza[zzgyw.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza[zzgyw.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza[zzgyw.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zza[zzgyw.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zza[zzgyw.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zza[zzgyw.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class zza extends zzgyx<zza, zzb> implements zzf {
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
        private static volatile zzhaq<zza> zzm;
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
        private zzgzj<zzd> zzw = zzgyx.zzbK();
        private zzgzj<zzat> zzC = zzgyx.zzbK();

        /* renamed from: com.google.android.gms.internal.ads.zzbbs$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum EnumC0141zza implements zzgzb {
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
            private static final zzgzc<EnumC0141zza> zzy = new zzgzc<EnumC0141zza>() { // from class: com.google.android.gms.internal.ads.zzbbs.zza.zza.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public EnumC0141zza zzb(int i10) {
                    return EnumC0141zza.zzb(i10);
                }
            };
            private final int zzA;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.android.gms.internal.ads.zzbbs$zza$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public final class C0142zza implements zzgzd {
                static final zzgzd zza = new C0142zza();

                private C0142zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzd
                public boolean zza(int i10) {
                    return EnumC0141zza.zzb(i10) != null;
                }
            }

            EnumC0141zza(int i10) {
                this.zzA = i10;
            }

            public static EnumC0141zza zzb(int i10) {
                switch (i10) {
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

            public static zzgzc<EnumC0141zza> zzd() {
                return zzy;
            }

            public static zzgzd zze() {
                return C0142zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgzb
            public final int zza() {
                return this.zzA;
            }
        }

        /* loaded from: classes3.dex */
        public final class zzb extends zzgyr<zza, zzb> implements zzf {
            public zzb zzA(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcw(zzacVar);
                return this;
            }

            public zzb zzB(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcx(zzgVar);
                return this;
            }

            public zzb zzC(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcy(zziVar);
                return this;
            }

            public zzb zzD(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcz(zzahVar);
                return this;
            }

            public zzb zzE(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcA(zzkVar);
                return this;
            }

            public zzb zzF(int i10) {
                zzbu();
                ((zza) this.zza).zzcB(i10);
                return this;
            }

            public zzb zzG(int i10) {
                zzbu();
                ((zza) this.zza).zzcC(i10);
                return this;
            }

            public zzb zzH(EnumC0141zza enumC0141zza) {
                zzbu();
                ((zza) this.zza).zzcD(enumC0141zza);
                return this;
            }

            public zzb zzI(zzx.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcE(zzaVar.zzbr());
                return this;
            }

            public zzb zzJ(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzcE(zzxVar);
                return this;
            }

            public zzb zzK(zzq zzqVar) {
                zzbu();
                ((zza) this.zza).zzcF(zzqVar);
                return this;
            }

            public zzb zzL(zzz.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcG(zzaVar.zzbr());
                return this;
            }

            public zzb zzM(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzcG(zzzVar);
                return this;
            }

            public zzb zzN(zzac.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zzb zzO(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcH(zzacVar);
                return this;
            }

            public zzb zzP(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzcI(i10, zzbVar.zzbr());
                return this;
            }

            public zzb zzQ(int i10, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzcI(i10, zzdVar);
                return this;
            }

            public zzb zzR(zzg.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zzb zzS(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zzgVar);
                return this;
            }

            public zzb zzT(zzi.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcK(zzaVar.zzbr());
                return this;
            }

            public zzb zzU(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcK(zziVar);
                return this;
            }

            public zzb zzV(zzah.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcL(zzaVar.zzbr());
                return this;
            }

            public zzb zzW(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcL(zzahVar);
                return this;
            }

            public zzb zzX(zzk.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcM(zzaVar.zzbr());
                return this;
            }

            public zzb zzY(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcM(zzkVar);
                return this;
            }

            public zzb zzZ(int i10, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcN(i10, zzaVar.zzbr());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public int zza() {
                return ((zza) this.zza).zza();
            }

            public zzb zzaa(int i10, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzcN(i10, zzatVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzd zzab(int i10) {
                return ((zza) this.zza).zzab(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzg zzac() {
                return ((zza) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzi zzad() {
                return ((zza) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzk zzae() {
                return ((zza) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzq zzaf() {
                return ((zza) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzx zzag() {
                return ((zza) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzz zzah() {
                return ((zza) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzac zzai() {
                return ((zza) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzah zzaj() {
                return ((zza) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public zzat zzak(int i10) {
                return ((zza) this.zza).zzak(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public List<zzd> zzal() {
                return Collections.unmodifiableList(((zza) this.zza).zzal());
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public List<zzat> zzam() {
                return Collections.unmodifiableList(((zza) this.zza).zzam());
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public boolean zzan() {
                return ((zza) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public boolean zzao() {
                return ((zza) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public boolean zzap() {
                return ((zza) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public boolean zzaq() {
                return ((zza) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public boolean zzar() {
                return ((zza) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public boolean zzas() {
                return ((zza) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public boolean zzat() {
                return ((zza) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public boolean zzau() {
                return ((zza) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public boolean zzav() {
                return ((zza) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public int zzb() {
                return ((zza) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzf
            public EnumC0141zza zzc() {
                return ((zza) this.zza).zzc();
            }

            public zzb zzd(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zza) this.zza).zzaF(iterable);
                return this;
            }

            public zzb zze(Iterable<? extends zzat> iterable) {
                zzbu();
                ((zza) this.zza).zzaG(iterable);
                return this;
            }

            public zzb zzf(zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaH(zzbVar.zzbr());
                return this;
            }

            public zzb zzg(zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaH(zzdVar);
                return this;
            }

            public zzb zzh(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaI(i10, zzbVar.zzbr());
                return this;
            }

            public zzb zzi(int i10, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaI(i10, zzdVar);
                return this;
            }

            public zzb zzj(zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaJ(zzaVar.zzbr());
                return this;
            }

            public zzb zzk(zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaJ(zzatVar);
                return this;
            }

            public zzb zzl(int i10, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaK(i10, zzaVar.zzbr());
                return this;
            }

            public zzb zzm(int i10, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaK(i10, zzatVar);
                return this;
            }

            public zzb zzn() {
                zzbu();
                ((zza) this.zza).zzch();
                return this;
            }

            public zzb zzo() {
                zzbu();
                ((zza) this.zza).zzci();
                return this;
            }

            public zzb zzp() {
                zzbu();
                ((zza) this.zza).zzcj();
                return this;
            }

            public zzb zzq() {
                zzbu();
                ((zza) this.zza).zzck();
                return this;
            }

            public zzb zzr() {
                zzbu();
                ((zza) this.zza).zzcl();
                return this;
            }

            public zzb zzs() {
                zzbu();
                ((zza) this.zza).zzcm();
                return this;
            }

            public zzb zzt() {
                zzbu();
                ((zza) this.zza).zzcn();
                return this;
            }

            public zzb zzu() {
                zzbu();
                ((zza) this.zza).zzco();
                return this;
            }

            public zzb zzv() {
                zzbu();
                ((zza) this.zza).zzcp();
                return this;
            }

            public zzb zzw() {
                zzbu();
                ((zza) this.zza).zzcq();
                return this;
            }

            public zzb zzx() {
                zzbu();
                ((zza) this.zza).zzcr();
                return this;
            }

            public zzb zzy(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzcu(zzxVar);
                return this;
            }

            public zzb zzz(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzcv(zzzVar);
                return this;
            }

            private zzb() {
                super(zza.zzl);
            }
        }

        static {
            zza zzaVar = new zza();
            zzl = zzaVar;
            zzgyx.zzcb(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(Iterable<? extends zzd> iterable) {
            zzcs();
            zzgwy.zzaQ(iterable, this.zzw);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG(Iterable<? extends zzat> iterable) {
            zzct();
            zzgwy.zzaQ(iterable, this.zzC);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaH(zzd zzdVar) {
            zzdVar.getClass();
            zzcs();
            this.zzw.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzcs();
            this.zzw.add(i10, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ(zzat zzatVar) {
            zzatVar.getClass();
            zzct();
            this.zzC.add(zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK(int i10, zzat zzatVar) {
            zzatVar.getClass();
            zzct();
            this.zzC.add(i10, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(zzk zzkVar) {
            zzkVar.getClass();
            zzk zzkVar2 = this.zzx;
            if (zzkVar2 != null && zzkVar2 != zzk.zzh()) {
                zzk.zza zzf2 = zzk.zzf(zzkVar2);
                zzf2.zzbj(zzkVar);
                zzkVar = zzf2.zzbs();
            }
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(int i10) {
            zzcs();
            this.zzw.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(int i10) {
            zzct();
            this.zzC.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(EnumC0141zza enumC0141zza) {
            this.zzo = enumC0141zza.zza();
            this.zzn |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(zzx zzxVar) {
            zzxVar.getClass();
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(zzz zzzVar) {
            zzzVar.getClass();
            this.zzB = zzzVar;
            this.zzn |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzac zzacVar) {
            zzacVar.getClass();
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzcs();
            this.zzw.set(i10, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzg zzgVar) {
            zzgVar.getClass();
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(zzi zziVar) {
            zziVar.getClass();
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(zzah zzahVar) {
            zzahVar.getClass();
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcM(zzk zzkVar) {
            zzkVar.getClass();
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcN(int i10, zzat zzatVar) {
            zzatVar.getClass();
            zzct();
            this.zzC.set(i10, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzn &= -2;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzA = null;
            this.zzn &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzB = null;
            this.zzn &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzz = null;
            this.zzn &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzw = zzgyx.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzu = null;
            this.zzn &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzv = null;
            this.zzn &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp() {
            this.zzy = null;
            this.zzn &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq() {
            this.zzx = null;
            this.zzn &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr() {
            this.zzC = zzgyx.zzbK();
        }

        private void zzcs() {
            zzgzj<zzd> zzgzjVar = this.zzw;
            if (!zzgzjVar.zzc()) {
                this.zzw = zzgyx.zzbL(zzgzjVar);
            }
        }

        private void zzct() {
            zzgzj<zzat> zzgzjVar = this.zzC;
            if (!zzgzjVar.zzc()) {
                this.zzC = zzgyx.zzbL(zzgzjVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu(zzx zzxVar) {
            zzxVar.getClass();
            zzx zzxVar2 = this.zzA;
            if (zzxVar2 != null && zzxVar2 != zzx.zzh()) {
                zzx.zza zzf2 = zzx.zzf(zzxVar2);
                zzf2.zzbj(zzxVar);
                zzxVar = zzf2.zzbs();
            }
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv(zzz zzzVar) {
            zzzVar.getClass();
            zzz zzzVar2 = this.zzB;
            if (zzzVar2 != null && zzzVar2 != zzz.zzh()) {
                zzz.zza zzf2 = zzz.zzf(zzzVar2);
                zzf2.zzbj(zzzVar);
                zzzVar = zzf2.zzbs();
            }
            this.zzB = zzzVar;
            this.zzn |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw(zzac zzacVar) {
            zzacVar.getClass();
            zzac zzacVar2 = this.zzz;
            if (zzacVar2 != null && zzacVar2 != zzac.zzf()) {
                zzac.zza zzc2 = zzac.zzc(zzacVar2);
                zzc2.zzbj(zzacVar);
                zzacVar = zzc2.zzbs();
            }
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzg zzgVar) {
            zzgVar.getClass();
            zzg zzgVar2 = this.zzu;
            if (zzgVar2 != null && zzgVar2 != zzg.zzh()) {
                zzg.zza zzf2 = zzg.zzf(zzgVar2);
                zzf2.zzbj(zzgVar);
                zzgVar = zzf2.zzbs();
            }
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzi zziVar) {
            zziVar.getClass();
            zzi zziVar2 = this.zzv;
            if (zziVar2 != null && zziVar2 != zzi.zzh()) {
                zzi.zza zzf2 = zzi.zzf(zziVar2);
                zzf2.zzbj(zziVar);
                zziVar = zzf2.zzbs();
            }
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzah zzahVar) {
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

        public static zzb zzd() {
            return zzl.zzaZ();
        }

        public static zzb zzf(zza zzaVar) {
            return zzl.zzba(zzaVar);
        }

        public static zza zzh() {
            return zzl;
        }

        public static zza zzi(InputStream inputStream) throws IOException {
            return (zza) zzgyx.zzbk(zzl, inputStream);
        }

        public static zza zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zza) zzgyx.zzbl(zzl, inputStream, zzgyhVar);
        }

        public static zza zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zza) zzgyx.zzbm(zzl, zzgxpVar);
        }

        public static zza zzl(zzgxv zzgxvVar) throws IOException {
            return (zza) zzgyx.zzbn(zzl, zzgxvVar);
        }

        public static zza zzm(InputStream inputStream) throws IOException {
            return (zza) zzgyx.zzbo(zzl, inputStream);
        }

        public static zza zzn(ByteBuffer byteBuffer) throws zzgzm {
            return (zza) zzgyx.zzbp(zzl, byteBuffer);
        }

        public static zza zzo(byte[] bArr) throws zzgzm {
            return (zza) zzgyx.zzbq(zzl, bArr);
        }

        public static zza zzp(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zza) zzgyx.zzbr(zzl, zzgxpVar, zzgyhVar);
        }

        public static zza zzq(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zza) zzgyx.zzbs(zzl, zzgxvVar, zzgyhVar);
        }

        public static zza zzr(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zza) zzgyx.zzbu(zzl, inputStream, zzgyhVar);
        }

        public static zza zzs(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zza) zzgyx.zzbv(zzl, byteBuffer, zzgyhVar);
        }

        public static zza zzt(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zza) zzgyx.zzbx(zzl, bArr, zzgyhVar);
        }

        public static zzhaq<zza> zzw() {
            return zzl.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public int zza() {
            return this.zzw.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzd zzab(int i10) {
            return this.zzw.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzg zzac() {
            zzg zzgVar = this.zzu;
            return zzgVar == null ? zzg.zzh() : zzgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzi zzad() {
            zzi zziVar = this.zzv;
            return zziVar == null ? zzi.zzh() : zziVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzk zzae() {
            zzk zzkVar = this.zzx;
            return zzkVar == null ? zzk.zzh() : zzkVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzq zzaf() {
            zzq zzb2 = zzq.zzb(this.zzp);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzx zzag() {
            zzx zzxVar = this.zzA;
            return zzxVar == null ? zzx.zzh() : zzxVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzz zzah() {
            zzz zzzVar = this.zzB;
            return zzzVar == null ? zzz.zzh() : zzzVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzac zzai() {
            zzac zzacVar = this.zzz;
            return zzacVar == null ? zzac.zzf() : zzacVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzah zzaj() {
            zzah zzahVar = this.zzy;
            return zzahVar == null ? zzah.zzn() : zzahVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public zzat zzak(int i10) {
            return this.zzC.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public List<zzd> zzal() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public List<zzat> zzam() {
            return this.zzC;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public boolean zzan() {
            return (this.zzn & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public boolean zzao() {
            return (this.zzn & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public boolean zzap() {
            return (this.zzn & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public boolean zzaq() {
            return (this.zzn & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public boolean zzar() {
            return (this.zzn & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public boolean zzas() {
            return (this.zzn & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public boolean zzat() {
            return (this.zzn & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public boolean zzau() {
            return (this.zzn & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public boolean zzav() {
            return (this.zzn & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzf
        public EnumC0141zza zzc() {
            EnumC0141zza zzb2 = EnumC0141zza.zzb(this.zzo);
            return zzb2 == null ? EnumC0141zza.AD_INITIATER_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC0141zza.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", zzd.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", zzat.class});
                case 3:
                    return new zza();
                case 4:
                    return new zzb();
                case 5:
                    return zzl;
                case 6:
                    zzhaq<zza> zzhaqVar = zzm;
                    if (zzhaqVar == null) {
                        synchronized (zza.class) {
                            zzhaqVar = zzm;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzl);
                                zzm = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public zze zzu(int i10) {
            return this.zzw.get(i10);
        }

        public zzbi zzv(int i10) {
            return this.zzC.get(i10);
        }

        public List<? extends zze> zzx() {
            return this.zzw;
        }

        public List<? extends zzbi> zzy() {
            return this.zzC;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzaa extends zzhaj {
        boolean zzA();

        boolean zzB();

        int zza();

        zzq zzb();

        zzv zzc();

        zzan zzw(int i10);

        zzap zzx();

        List<zzan> zzy();

        boolean zzz();
    }

    /* loaded from: classes3.dex */
    public final class zzab extends zzgyx<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzc;
        private static volatile zzhaq<zzab> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzab, zza> implements zzae {
            public zza zza() {
                zzbu();
                ((zzab) this.zza).zzz();
                return this;
            }

            public zza zzb() {
                zzbu();
                ((zzab) this.zza).zzA();
                return this;
            }

            public zza zzc(zzb zzbVar) {
                zzbu();
                ((zzab) this.zza).zzB(zzbVar);
                return this;
            }

            public zza zzd(zzc zzcVar) {
                zzbu();
                ((zzab) this.zza).zzC(zzcVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzae
            public zzb zze() {
                return ((zzab) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzae
            public zzc zzf() {
                return ((zzab) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzae
            public boolean zzg() {
                return ((zzab) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzae
            public boolean zzh() {
                return ((zzab) this.zza).zzh();
            }

            private zza() {
                super(zzab.zzc);
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzgzb {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 4;
            private static final zzgzc<zzb> zzi = new zzgzc<zzb>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzab.zzb.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i10) {
                    return zzb.zzb(i10);
                }
            };
            private final int zzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes3.dex */
            public final class zza implements zzgzd {
                static final zzgzd zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzd
                public boolean zza(int i10) {
                    return zzb.zzb(i10) != null;
                }
            }

            zzb(int i10) {
                this.zzk = i10;
            }

            public static zzb zzb(int i10) {
                if (i10 == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return TWO_G;
                }
                if (i10 == 2) {
                    return THREE_G;
                }
                if (i10 != 4) {
                    return null;
                }
                return LTE;
            }

            public static zzgzc<zzb> zzd() {
                return zzi;
            }

            public static zzgzd zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgzb
            public final int zza() {
                return this.zzk;
            }
        }

        /* loaded from: classes3.dex */
        public enum zzc implements zzgzb {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzgzc<zzc> zzg = new zzgzc<zzc>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzab.zzc.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzc zzb(int i10) {
                    return zzc.zzb(i10);
                }
            };
            private final int zzi;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes3.dex */
            public final class zza implements zzgzd {
                static final zzgzd zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzd
                public boolean zza(int i10) {
                    return zzc.zzb(i10) != null;
                }
            }

            zzc(int i10) {
                this.zzi = i10;
            }

            public static zzc zzb(int i10) {
                if (i10 == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return CELL;
                }
                if (i10 != 2) {
                    return null;
                }
                return WIFI;
            }

            public static zzgzc<zzc> zzd() {
                return zzg;
            }

            public static zzgzd zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgzb
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzc = zzabVar;
            zzgyx.zzcb(zzab.class, zzabVar);
        }

        private zzab() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB(zzb zzbVar) {
            this.zzg = zzbVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(zzc zzcVar) {
            this.zzf = zzcVar.zza();
            this.zze |= 1;
        }

        public static zza zza() {
            return zzc.zzaZ();
        }

        public static zza zzb(zzab zzabVar) {
            return zzc.zzba(zzabVar);
        }

        public static zzab zzd() {
            return zzc;
        }

        public static zzab zzi(InputStream inputStream) throws IOException {
            return (zzab) zzgyx.zzbk(zzc, inputStream);
        }

        public static zzab zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzab) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
        }

        public static zzab zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zzab) zzgyx.zzbm(zzc, zzgxpVar);
        }

        public static zzab zzl(zzgxv zzgxvVar) throws IOException {
            return (zzab) zzgyx.zzbn(zzc, zzgxvVar);
        }

        public static zzab zzm(InputStream inputStream) throws IOException {
            return (zzab) zzgyx.zzbo(zzc, inputStream);
        }

        public static zzab zzn(ByteBuffer byteBuffer) throws zzgzm {
            return (zzab) zzgyx.zzbp(zzc, byteBuffer);
        }

        public static zzab zzo(byte[] bArr) throws zzgzm {
            return (zzab) zzgyx.zzbq(zzc, bArr);
        }

        public static zzab zzp(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzab) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
        }

        public static zzab zzq(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzab) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
        }

        public static zzab zzr(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzab) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
        }

        public static zzab zzs(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzab) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
        }

        public static zzab zzt(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzab) zzgyx.zzbx(zzc, bArr, zzgyhVar);
        }

        public static zzhaq<zzab> zzu() {
            return zzc.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzz() {
            this.zze &= -3;
            this.zzg = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zzc.zze(), "zzg", zzb.zze()});
                case 3:
                    return new zzab();
                case 4:
                    return new zza();
                case 5:
                    return zzc;
                case 6:
                    zzhaq<zzab> zzhaqVar = zzd;
                    if (zzhaqVar == null) {
                        synchronized (zzab.class) {
                            zzhaqVar = zzd;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzc);
                                zzd = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzae
        public zzb zze() {
            zzb zzb2 = zzb.zzb(this.zzg);
            return zzb2 == null ? zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzae
        public zzc zzf() {
            zzc zzb2 = zzc.zzb(this.zzf);
            return zzb2 == null ? zzc.NETWORKTYPE_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzae
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzae
        public boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public final class zzac extends zzgyx<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzc;
        private static volatile zzhaq<zzac> zzd;
        private int zze;
        private int zzf;
        private zzap zzg;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzac, zza> implements zzad {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzad
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

            @Override // com.google.android.gms.internal.ads.zzbbs.zzad
            public zzap zzh() {
                return ((zzac) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzad
            public boolean zzi() {
                return ((zzac) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzad
            public boolean zzj() {
                return ((zzac) this.zza).zzj();
            }

            private zza() {
                super(zzac.zzc);
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzc = zzacVar;
            zzgyx.zzcb(zzac.class, zzacVar);
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
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
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

        public static zza zzb() {
            return zzc.zzaZ();
        }

        public static zza zzc(zzac zzacVar) {
            return zzc.zzba(zzacVar);
        }

        public static zzac zzf() {
            return zzc;
        }

        public static zzac zzg(InputStream inputStream) throws IOException {
            return (zzac) zzgyx.zzbk(zzc, inputStream);
        }

        public static zzac zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzac) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
        }

        public static zzac zzl(zzgxp zzgxpVar) throws zzgzm {
            return (zzac) zzgyx.zzbm(zzc, zzgxpVar);
        }

        public static zzac zzm(zzgxv zzgxvVar) throws IOException {
            return (zzac) zzgyx.zzbn(zzc, zzgxvVar);
        }

        public static zzac zzn(InputStream inputStream) throws IOException {
            return (zzac) zzgyx.zzbo(zzc, inputStream);
        }

        public static zzac zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzac) zzgyx.zzbp(zzc, byteBuffer);
        }

        public static zzac zzp(byte[] bArr) throws zzgzm {
            return (zzac) zzgyx.zzbq(zzc, bArr);
        }

        public static zzac zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzac) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
        }

        public static zzac zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzac) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
        }

        public static zzac zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzac) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
        }

        public static zzac zzt(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzac) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
        }

        public static zzac zzu(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzac) zzgyx.zzbx(zzc, bArr, zzgyhVar);
        }

        public static zzhaq<zzac> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzad
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzf);
            return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
                case 3:
                    return new zzac();
                case 4:
                    return new zza();
                case 5:
                    return zzc;
                case 6:
                    zzhaq<zzac> zzhaqVar = zzd;
                    if (zzhaqVar == null) {
                        synchronized (zzac.class) {
                            zzhaqVar = zzd;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzc);
                                zzd = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzad
        public zzap zzh() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzad
        public boolean zzi() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzad
        public boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzad extends zzhaj {
        zzq zza();

        zzap zzh();

        boolean zzi();

        boolean zzj();
    }

    /* loaded from: classes3.dex */
    public interface zzae extends zzhaj {
        zzab.zzb zze();

        zzab.zzc zzf();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes3.dex */
    public final class zzaf extends zzgyx<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzi;
        private static volatile zzhaq<zzaf> zzj;
        private int zzk;
        private int zzm;
        private int zzn;
        private long zzo;
        private long zzv;
        private int zzw;
        private zzgzj<zza> zzl = zzgyx.zzbK();
        private String zzp = "";
        private String zzu = "";

        /* loaded from: classes3.dex */
        public final class zza extends zzgyx<zza, C0143zza> implements zzb {
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
            private static final zzgzg<zzd.zza> zzn = new zzgzg<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzaf.zza.1
                @Override // com.google.android.gms.internal.ads.zzgzg
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd.zza zzb(int i10) {
                    zzd.zza zzb2 = zzd.zza.zzb(i10);
                    return zzb2 == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
                }
            };
            private static final zza zzo;
            private static volatile zzhaq<zza> zzp;
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
            private zzgzf zzz = zzgyx.zzbG();

            /* renamed from: com.google.android.gms.internal.ads.zzbbs$zzaf$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public final class C0143zza extends zzgyr<zza, C0143zza> implements zzb {
                public C0143zza zzA() {
                    zzbu();
                    ((zza) this.zza).zzaI();
                    return this;
                }

                public C0143zza zzB() {
                    zzbu();
                    ((zza) this.zza).zzaJ();
                    return this;
                }

                public C0143zza zzC(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzch(zzabVar);
                    return this;
                }

                public C0143zza zzD(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzci(zzqVar);
                    return this;
                }

                public C0143zza zzE(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcj(zzqVar);
                    return this;
                }

                public C0143zza zzF(int i10, zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzck(i10, zzaVar);
                    return this;
                }

                public C0143zza zzG(int i10) {
                    zzbu();
                    ((zza) this.zza).zzcl(i10);
                    return this;
                }

                public C0143zza zzH(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzcm(zzdVar);
                    return this;
                }

                public C0143zza zzI(zzab.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzcn(zzaVar.zzbr());
                    return this;
                }

                public C0143zza zzJ(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzcn(zzabVar);
                    return this;
                }

                public C0143zza zzK(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzco(zzqVar);
                    return this;
                }

                public C0143zza zzL(long j3) {
                    zzbu();
                    ((zza) this.zza).zzcp(j3);
                    return this;
                }

                public C0143zza zzM(long j3) {
                    zzbu();
                    ((zza) this.zza).zzcq(j3);
                    return this;
                }

                public C0143zza zzN(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcr(zzqVar);
                    return this;
                }

                public C0143zza zzO(long j3) {
                    zzbu();
                    ((zza) this.zza).zzcs(j3);
                    return this;
                }

                public C0143zza zzP(long j3) {
                    zzbu();
                    ((zza) this.zza).zzct(j3);
                    return this;
                }

                public C0143zza zzQ(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcu(zzqVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public zzd zzR() {
                    return ((zza) this.zza).zzR();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public List<zzd.zza> zzS() {
                    return ((zza) this.zza).zzS();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzT() {
                    return ((zza) this.zza).zzT();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzU() {
                    return ((zza) this.zza).zzU();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzV() {
                    return ((zza) this.zza).zzV();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzW() {
                    return ((zza) this.zza).zzW();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzX() {
                    return ((zza) this.zza).zzX();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzY() {
                    return ((zza) this.zza).zzY();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzZ() {
                    return ((zza) this.zza).zzZ();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public int zza() {
                    return ((zza) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzaa() {
                    return ((zza) this.zza).zzaa();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzab() {
                    return ((zza) this.zza).zzab();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzac() {
                    return ((zza) this.zza).zzac();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzad() {
                    return ((zza) this.zza).zzad();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public boolean zzae() {
                    return ((zza) this.zza).zzae();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public int zzb() {
                    return ((zza) this.zza).zzb();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public long zzc() {
                    return ((zza) this.zza).zzc();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public long zzd() {
                    return ((zza) this.zza).zzd();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public long zze() {
                    return ((zza) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public long zzf() {
                    return ((zza) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public zzd.zza zzg(int i10) {
                    return ((zza) this.zza).zzg(i10);
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public zzq zzh() {
                    return ((zza) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public zzq zzi() {
                    return ((zza) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public zzq zzj() {
                    return ((zza) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public zzq zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public zzq zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
                public zzab zzm() {
                    return ((zza) this.zza).zzm();
                }

                public C0143zza zzn(Iterable<? extends zzd.zza> iterable) {
                    zzbu();
                    ((zza) this.zza).zzav(iterable);
                    return this;
                }

                public C0143zza zzo(zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzaw(zzaVar);
                    return this;
                }

                public C0143zza zzp() {
                    zzbu();
                    ((zza) this.zza).zzax();
                    return this;
                }

                public C0143zza zzq() {
                    zzbu();
                    ((zza) this.zza).zzay();
                    return this;
                }

                public C0143zza zzr() {
                    zzbu();
                    ((zza) this.zza).zzaz();
                    return this;
                }

                public C0143zza zzs() {
                    zzbu();
                    ((zza) this.zza).zzaA();
                    return this;
                }

                public C0143zza zzt() {
                    zzbu();
                    ((zza) this.zza).zzaB();
                    return this;
                }

                public C0143zza zzu() {
                    zzbu();
                    ((zza) this.zza).zzaC();
                    return this;
                }

                public C0143zza zzv() {
                    zzbu();
                    ((zza) this.zza).zzaD();
                    return this;
                }

                public C0143zza zzw() {
                    zzbu();
                    ((zza) this.zza).zzaE();
                    return this;
                }

                public C0143zza zzx() {
                    zzbu();
                    ((zza) this.zza).zzaF();
                    return this;
                }

                public C0143zza zzy() {
                    zzbu();
                    ((zza) this.zza).zzaG();
                    return this;
                }

                public C0143zza zzz() {
                    zzbu();
                    ((zza) this.zza).zzaH();
                    return this;
                }

                private C0143zza() {
                    super(zza.zzo);
                }
            }

            static {
                zza zzaVar = new zza();
                zzo = zzaVar;
                zzgyx.zzcb(zza.class, zzaVar);
            }

            private zza() {
            }

            public static zza zzA(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
                return (zza) zzgyx.zzbu(zzo, inputStream, zzgyhVar);
            }

            public static zza zzB(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
                return (zza) zzgyx.zzbv(zzo, byteBuffer, zzgyhVar);
            }

            public static zza zzC(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
                return (zza) zzgyx.zzbx(zzo, bArr, zzgyhVar);
            }

            public static zzhaq<zza> zzD() {
                return zzo.zzbN();
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
                zzgzf zzgzfVar = this.zzz;
                if (!zzgzfVar.zzc()) {
                    this.zzz = zzgyx.zzbH(zzgzfVar);
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
                this.zzz = zzgyx.zzbG();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzch(zzab zzabVar) {
                zzabVar.getClass();
                zzab zzabVar2 = this.zzA;
                if (zzabVar2 != null && zzabVar2 != zzab.zzd()) {
                    zzab.zza zzb2 = zzab.zzb(zzabVar2);
                    zzb2.zzbj(zzabVar);
                    zzabVar = zzb2.zzbs();
                }
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzci(zzq zzqVar) {
                this.zzC = zzqVar.zza();
                this.zzu |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcj(zzq zzqVar) {
                this.zzD = zzqVar.zza();
                this.zzu |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzck(int i10, zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaK();
                this.zzz.zze(i10, zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcl(int i10) {
                this.zzu |= NotificationCompat.FLAG_LOCAL_ONLY;
                this.zzE = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcm(zzd zzdVar) {
                this.zzG = zzdVar.zza();
                this.zzu |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcn(zzab zzabVar) {
                zzabVar.getClass();
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzco(zzq zzqVar) {
                this.zzF = zzqVar.zza();
                this.zzu |= 512;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcp(long j3) {
                this.zzu |= 8;
                this.zzy = j3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcq(long j3) {
                this.zzu |= 4;
                this.zzx = j3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcr(zzq zzqVar) {
                this.zzw = zzqVar.zza();
                this.zzu |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcs(long j3) {
                this.zzu |= 1;
                this.zzv = j3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzct(long j3) {
                this.zzu |= 2048;
                this.zzH = j3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcu(zzq zzqVar) {
                this.zzB = zzqVar.zza();
                this.zzu |= 32;
            }

            public static C0143zza zzn() {
                return zzo.zzaZ();
            }

            public static C0143zza zzo(zza zzaVar) {
                return zzo.zzba(zzaVar);
            }

            public static zza zzq() {
                return zzo;
            }

            public static zza zzr(InputStream inputStream) throws IOException {
                return (zza) zzgyx.zzbk(zzo, inputStream);
            }

            public static zza zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
                return (zza) zzgyx.zzbl(zzo, inputStream, zzgyhVar);
            }

            public static zza zzt(zzgxp zzgxpVar) throws zzgzm {
                return (zza) zzgyx.zzbm(zzo, zzgxpVar);
            }

            public static zza zzu(zzgxv zzgxvVar) throws IOException {
                return (zza) zzgyx.zzbn(zzo, zzgxvVar);
            }

            public static zza zzv(InputStream inputStream) throws IOException {
                return (zza) zzgyx.zzbo(zzo, inputStream);
            }

            public static zza zzw(ByteBuffer byteBuffer) throws zzgzm {
                return (zza) zzgyx.zzbp(zzo, byteBuffer);
            }

            public static zza zzx(byte[] bArr) throws zzgzm {
                return (zza) zzgyx.zzbq(zzo, bArr);
            }

            public static zza zzy(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
                return (zza) zzgyx.zzbr(zzo, zzgxpVar, zzgyhVar);
            }

            public static zza zzz(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
                return (zza) zzgyx.zzbs(zzo, zzgxvVar, zzgyhVar);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public zzd zzR() {
                zzd zzb2 = zzd.zzb(this.zzG);
                return zzb2 == null ? zzd.UNSPECIFIED : zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public List<zzd.zza> zzS() {
                return new zzgzh(this.zzz, zzn);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzT() {
                return (this.zzu & 64) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzU() {
                return (this.zzu & 128) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzV() {
                return (this.zzu & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzW() {
                return (this.zzu & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzX() {
                return (this.zzu & 16) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzY() {
                return (this.zzu & 512) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzZ() {
                return (this.zzu & 8) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public int zza() {
                return this.zzz.size();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzaa() {
                return (this.zzu & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzab() {
                return (this.zzu & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzac() {
                return (this.zzu & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzad() {
                return (this.zzu & 2048) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public boolean zzae() {
                return (this.zzu & 32) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public int zzb() {
                return this.zzE;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public long zzc() {
                return this.zzy;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public long zzd() {
                return this.zzx;
            }

            @Override // com.google.android.gms.internal.ads.zzgyx
            public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
                switch (zzgywVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return zzgyx.zzbS(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", zzq.zze(), "zzx", "zzy", "zzz", zzd.zza.zze(), "zzA", "zzB", zzq.zze(), "zzC", zzq.zze(), "zzD", zzq.zze(), "zzE", "zzF", zzq.zze(), "zzG", zzd.zze(), "zzH"});
                    case 3:
                        return new zza();
                    case 4:
                        return new C0143zza();
                    case 5:
                        return zzo;
                    case 6:
                        zzhaq<zza> zzhaqVar = zzp;
                        if (zzhaqVar == null) {
                            synchronized (zza.class) {
                                zzhaqVar = zzp;
                                if (zzhaqVar == null) {
                                    zzhaqVar = new zzgys(zzo);
                                    zzp = zzhaqVar;
                                }
                            }
                        }
                        return zzhaqVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public long zze() {
                return this.zzv;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public long zzf() {
                return this.zzH;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public zzd.zza zzg(int i10) {
                zzd.zza zzb2 = zzd.zza.zzb(this.zzz.zzd(i10));
                return zzb2 == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public zzq zzh() {
                zzq zzb2 = zzq.zzb(this.zzC);
                return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public zzq zzi() {
                zzq zzb2 = zzq.zzb(this.zzD);
                return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public zzq zzj() {
                zzq zzb2 = zzq.zzb(this.zzF);
                return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public zzq zzk() {
                zzq zzb2 = zzq.zzb(this.zzw);
                return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public zzq zzl() {
                zzq zzb2 = zzq.zzb(this.zzB);
                return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaf.zzb
            public zzab zzm() {
                zzab zzabVar = this.zzA;
                return zzabVar == null ? zzab.zzd() : zzabVar;
            }
        }

        /* loaded from: classes3.dex */
        public interface zzb extends zzhaj {
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

            zzd.zza zzg(int i10);

            zzq zzh();

            zzq zzi();

            zzq zzj();

            zzq zzk();

            zzq zzl();

            zzab zzm();
        }

        /* loaded from: classes3.dex */
        public final class zzc extends zzgyr<zzaf, zzc> implements zzag {
            public zzc zzA(int i10) {
                zzbu();
                ((zzaf) this.zza).zzaA(i10);
                return this;
            }

            public zzc zzB(long j3) {
                zzbu();
                ((zzaf) this.zza).zzaB(j3);
                return this;
            }

            public zzc zzC(int i10, zza.C0143zza c0143zza) {
                zzbu();
                ((zzaf) this.zza).zzaC(i10, c0143zza.zzbr());
                return this;
            }

            public zzc zzD(int i10, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaC(i10, zzaVar);
                return this;
            }

            public zzc zzE(int i10) {
                zzbu();
                ((zzaf) this.zza).zzaD(i10);
                return this;
            }

            public zzc zzF(long j3) {
                zzbu();
                ((zzaf) this.zza).zzaE(j3);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public zzgxp zzG() {
                return ((zzaf) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public zzgxp zzH() {
                return ((zzaf) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public String zzI() {
                return ((zzaf) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public String zzJ() {
                return ((zzaf) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public List<zza> zzK() {
                return Collections.unmodifiableList(((zzaf) this.zza).zzK());
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public boolean zzL() {
                return ((zzaf) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public boolean zzM() {
                return ((zzaf) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public boolean zzN() {
                return ((zzaf) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public boolean zzO() {
                return ((zzaf) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public boolean zzP() {
                return ((zzaf) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public boolean zzQ() {
                return ((zzaf) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public boolean zzR() {
                return ((zzaf) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public int zza() {
                return ((zzaf) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public int zzb() {
                return ((zzaf) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public int zzc() {
                return ((zzaf) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public int zzd() {
                return ((zzaf) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public long zze() {
                return ((zzaf) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public long zzf() {
                return ((zzaf) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzag
            public zza zzg(int i10) {
                return ((zzaf) this.zza).zzg(i10);
            }

            public zzc zzh(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzaf) this.zza).zzai(iterable);
                return this;
            }

            public zzc zzi(zza.C0143zza c0143zza) {
                zzbu();
                ((zzaf) this.zza).zzaj(c0143zza.zzbr());
                return this;
            }

            public zzc zzj(zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaj(zzaVar);
                return this;
            }

            public zzc zzk(int i10, zza.C0143zza c0143zza) {
                zzbu();
                ((zzaf) this.zza).zzak(i10, c0143zza.zzbr());
                return this;
            }

            public zzc zzl(int i10, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzak(i10, zzaVar);
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

            public zzc zzu(int i10) {
                zzbu();
                ((zzaf) this.zza).zzau(i10);
                return this;
            }

            public zzc zzv(String str) {
                zzbu();
                ((zzaf) this.zza).zzav(str);
                return this;
            }

            public zzc zzw(zzgxp zzgxpVar) {
                zzbu();
                ((zzaf) this.zza).zzaw(zzgxpVar);
                return this;
            }

            public zzc zzx(int i10) {
                zzbu();
                ((zzaf) this.zza).zzax(i10);
                return this;
            }

            public zzc zzy(String str) {
                zzbu();
                ((zzaf) this.zza).zzay(str);
                return this;
            }

            public zzc zzz(zzgxp zzgxpVar) {
                zzbu();
                ((zzaf) this.zza).zzaz(zzgxpVar);
                return this;
            }

            private zzc() {
                super(zzaf.zzi);
            }
        }

        /* loaded from: classes3.dex */
        public enum zzd implements zzgzb {
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
            private static final zzgzc<zzd> zzm = new zzgzc<zzd>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzaf.zzd.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i10) {
                    return zzd.zzb(i10);
                }
            };
            private final int zzo;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes3.dex */
            public final class zza implements zzgzd {
                static final zzgzd zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzd
                public boolean zza(int i10) {
                    return zzd.zzb(i10) != null;
                }
            }

            zzd(int i10) {
                this.zzo = i10;
            }

            public static zzd zzb(int i10) {
                if (i10 == 0) {
                    return UNSPECIFIED;
                }
                if (i10 == 1) {
                    return CONNECTING;
                }
                if (i10 == 2) {
                    return CONNECTED;
                }
                if (i10 == 3) {
                    return DISCONNECTING;
                }
                if (i10 == 4) {
                    return DISCONNECTED;
                }
                if (i10 != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static zzgzc<zzd> zzd() {
                return zzm;
            }

            public static zzgzd zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgzb
            public final int zza() {
                return this.zzo;
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzi = zzafVar;
            zzgyx.zzcb(zzaf.class, zzafVar);
        }

        private zzaf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA(int i10) {
            this.zzk |= 1;
            this.zzm = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB(long j3) {
            this.zzk |= 32;
            this.zzv = j3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC(int i10, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.set(i10, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD(int i10) {
            this.zzk |= 2;
            this.zzn = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(long j3) {
            this.zzk |= 4;
            this.zzo = j3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai(Iterable<? extends zza> iterable) {
            zzat();
            zzgwy.zzaQ(iterable, this.zzl);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(int i10, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(i10, zzaVar);
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
            this.zzl = zzgyx.zzbK();
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
            zzgzj<zza> zzgzjVar = this.zzl;
            if (!zzgzjVar.zzc()) {
                this.zzl = zzgyx.zzbL(zzgzjVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau(int i10) {
            zzat();
            this.zzl.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(String str) {
            str.getClass();
            this.zzk |= 8;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw(zzgxp zzgxpVar) {
            this.zzp = zzgxpVar.zzx();
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax(int i10) {
            this.zzk |= 64;
            this.zzw = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay(String str) {
            str.getClass();
            this.zzk |= 16;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz(zzgxp zzgxpVar) {
            this.zzu = zzgxpVar.zzx();
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
            return (zzaf) zzgyx.zzbk(zzi, inputStream);
        }

        public static zzaf zzn(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzaf) zzgyx.zzbl(zzi, inputStream, zzgyhVar);
        }

        public static zzaf zzo(zzgxp zzgxpVar) throws zzgzm {
            return (zzaf) zzgyx.zzbm(zzi, zzgxpVar);
        }

        public static zzaf zzp(zzgxv zzgxvVar) throws IOException {
            return (zzaf) zzgyx.zzbn(zzi, zzgxvVar);
        }

        public static zzaf zzq(InputStream inputStream) throws IOException {
            return (zzaf) zzgyx.zzbo(zzi, inputStream);
        }

        public static zzaf zzr(ByteBuffer byteBuffer) throws zzgzm {
            return (zzaf) zzgyx.zzbp(zzi, byteBuffer);
        }

        public static zzaf zzs(byte[] bArr) throws zzgzm {
            return (zzaf) zzgyx.zzbq(zzi, bArr);
        }

        public static zzaf zzt(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzaf) zzgyx.zzbr(zzi, zzgxpVar, zzgyhVar);
        }

        public static zzaf zzu(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzaf) zzgyx.zzbs(zzi, zzgxvVar, zzgyhVar);
        }

        public static zzaf zzv(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzaf) zzgyx.zzbu(zzi, inputStream, zzgyhVar);
        }

        public static zzaf zzw(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzaf) zzgyx.zzbv(zzi, byteBuffer, zzgyhVar);
        }

        public static zzaf zzx(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzaf) zzgyx.zzbx(zzi, bArr, zzgyhVar);
        }

        public static zzhaq<zzaf> zzy() {
            return zzi.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public zzgxp zzG() {
            return zzgxp.zzw(this.zzp);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public zzgxp zzH() {
            return zzgxp.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public String zzI() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public String zzJ() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public List<zza> zzK() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public boolean zzL() {
            return (this.zzk & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public boolean zzM() {
            return (this.zzk & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public boolean zzN() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public boolean zzO() {
            return (this.zzk & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public boolean zzP() {
            return (this.zzk & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public boolean zzQ() {
            return (this.zzk & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public boolean zzR() {
            return (this.zzk & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public int zza() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public int zzb() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public int zzc() {
            return this.zzl.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public int zzd() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", zza.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
                case 3:
                    return new zzaf();
                case 4:
                    return new zzc();
                case 5:
                    return zzi;
                case 6:
                    zzhaq<zzaf> zzhaqVar = zzj;
                    if (zzhaqVar == null) {
                        synchronized (zzaf.class) {
                            zzhaqVar = zzj;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzi);
                                zzj = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public long zze() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public long zzf() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzag
        public zza zzg(int i10) {
            return this.zzl.get(i10);
        }

        public zzb zzh(int i10) {
            return this.zzl.get(i10);
        }

        public List<? extends zzb> zzz() {
            return this.zzl;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzag extends zzhaj {
        zzgxp zzG();

        zzgxp zzH();

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

        zzaf.zza zzg(int i10);
    }

    /* loaded from: classes3.dex */
    public final class zzah extends zzgyx<zzah, zza> implements zzak {
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
        private static volatile zzhaq<zzah> zzm;
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

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzah, zza> implements zzak {
            public zza zzA(int i10) {
                zzbu();
                ((zzah) this.zza).zzaA(i10);
                return this;
            }

            public zza zzB(int i10) {
                zzbu();
                ((zzah) this.zza).zzaB(i10);
                return this;
            }

            public zza zzC(int i10) {
                zzbu();
                ((zzah) this.zza).zzaC(i10);
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

            public zza zzF(int i10) {
                zzbu();
                ((zzah) this.zza).zzaE(i10);
                return this;
            }

            public zza zzG(int i10) {
                zzbu();
                ((zzah) this.zza).zzaF(i10);
                return this;
            }

            public zza zzH(int i10) {
                zzbu();
                ((zzah) this.zza).zzaG(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public zzai zzI() {
                return ((zzah) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzJ() {
                return ((zzah) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzK() {
                return ((zzah) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzL() {
                return ((zzah) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzM() {
                return ((zzah) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzN() {
                return ((zzah) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzO() {
                return ((zzah) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzP() {
                return ((zzah) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzQ() {
                return ((zzah) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzR() {
                return ((zzah) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzS() {
                return ((zzah) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public boolean zzT() {
                return ((zzah) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public int zza() {
                return ((zzah) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public int zzb() {
                return ((zzah) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public int zzc() {
                return ((zzah) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public int zzd() {
                return ((zzah) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public int zze() {
                return ((zzah) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public int zzf() {
                return ((zzah) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public int zzg() {
                return ((zzah) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public int zzh() {
                return ((zzah) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
            public zzq zzi() {
                return ((zzah) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzak
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

            public zza zzy(int i10) {
                zzbu();
                ((zzah) this.zza).zzay(i10);
                return this;
            }

            public zza zzz(int i10) {
                zzbu();
                ((zzah) this.zza).zzaz(i10);
                return this;
            }

            private zza() {
                super(zzah.zzl);
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzl = zzahVar;
            zzgyx.zzcb(zzah.class, zzahVar);
        }

        private zzah() {
        }

        public static zzhaq<zzah> zzA() {
            return zzl.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA(int i10) {
            this.zzn |= 8;
            this.zzv = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB(int i10) {
            this.zzn |= 512;
            this.zzB = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC(int i10) {
            this.zzn |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.zzA = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD(zzai zzaiVar) {
            zzaiVar.getClass();
            this.zzC = zzaiVar;
            this.zzn |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(int i10) {
            this.zzn |= 4;
            this.zzu = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(int i10) {
            this.zzn |= 32;
            this.zzx = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG(int i10) {
            this.zzn |= 16;
            this.zzw = i10;
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
            if (zzaiVar2 != null && zzaiVar2 != zzai.zzi()) {
                zzai.zza zzd2 = zzai.zzd(zzaiVar2);
                zzd2.zzbj(zzaiVar);
                zzaiVar = zzd2.zzbs();
            }
            this.zzC = zzaiVar;
            this.zzn |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
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
        public void zzay(int i10) {
            this.zzn |= 64;
            this.zzy = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz(int i10) {
            this.zzn |= 128;
            this.zzz = i10;
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
            return (zzah) zzgyx.zzbk(zzl, inputStream);
        }

        public static zzah zzp(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzah) zzgyx.zzbl(zzl, inputStream, zzgyhVar);
        }

        public static zzah zzq(zzgxp zzgxpVar) throws zzgzm {
            return (zzah) zzgyx.zzbm(zzl, zzgxpVar);
        }

        public static zzah zzr(zzgxv zzgxvVar) throws IOException {
            return (zzah) zzgyx.zzbn(zzl, zzgxvVar);
        }

        public static zzah zzs(InputStream inputStream) throws IOException {
            return (zzah) zzgyx.zzbo(zzl, inputStream);
        }

        public static zzah zzt(ByteBuffer byteBuffer) throws zzgzm {
            return (zzah) zzgyx.zzbp(zzl, byteBuffer);
        }

        public static zzah zzu(byte[] bArr) throws zzgzm {
            return (zzah) zzgyx.zzbq(zzl, bArr);
        }

        public static zzah zzv(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzah) zzgyx.zzbr(zzl, zzgxpVar, zzgyhVar);
        }

        public static zzah zzw(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzah) zzgyx.zzbs(zzl, zzgxvVar, zzgyhVar);
        }

        public static zzah zzx(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzah) zzgyx.zzbu(zzl, inputStream, zzgyhVar);
        }

        public static zzah zzy(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzah) zzgyx.zzbv(zzl, byteBuffer, zzgyhVar);
        }

        public static zzah zzz(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzah) zzgyx.zzbx(zzl, bArr, zzgyhVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public zzai zzI() {
            zzai zzaiVar = this.zzC;
            return zzaiVar == null ? zzai.zzi() : zzaiVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzJ() {
            return (this.zzn & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzK() {
            return (this.zzn & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzL() {
            return (this.zzn & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzM() {
            return (this.zzn & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzN() {
            return (this.zzn & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzO() {
            return (this.zzn & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzP() {
            return (this.zzn & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzQ() {
            return (this.zzn & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzR() {
            return (this.zzn & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzS() {
            return (this.zzn & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public boolean zzT() {
            return (this.zzn & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public int zza() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public int zzb() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public int zzc() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public int zzd() {
            return this.zzB;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", zzq.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
                case 3:
                    return new zzah();
                case 4:
                    return new zza();
                case 5:
                    return zzl;
                case 6:
                    zzhaq<zzah> zzhaqVar = zzm;
                    if (zzhaqVar == null) {
                        synchronized (zzah.class) {
                            zzhaqVar = zzm;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzl);
                                zzm = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public int zze() {
            return this.zzA;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public int zzf() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public int zzg() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public int zzh() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public zzq zzi() {
            zzq zzb2 = zzq.zzb(this.zzp);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzak
        public zzq zzj() {
            zzq zzb2 = zzq.zzb(this.zzo);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }
    }

    /* loaded from: classes3.dex */
    public final class zzai extends zzgyx<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzc;
        private static volatile zzhaq<zzai> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzai, zza> implements zzaj {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzaj
            public int zza() {
                return ((zzai) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaj
            public int zzb() {
                return ((zzai) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzai) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzai) this.zza).zzB();
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzai) this.zza).zzC(i10);
                return this;
            }

            public zza zzf(int i10) {
                zzbu();
                ((zzai) this.zza).zzD(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaj
            public boolean zzg() {
                return ((zzai) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaj
            public boolean zzh() {
                return ((zzai) this.zza).zzh();
            }

            private zza() {
                super(zzai.zzc);
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzc = zzaiVar;
            zzgyx.zzcb(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i10) {
            this.zze |= 1;
            this.zzf = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i10) {
            this.zze |= 2;
            this.zzg = i10;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzai zzaiVar) {
            return zzc.zzba(zzaiVar);
        }

        public static zzai zzi() {
            return zzc;
        }

        public static zzai zzj(InputStream inputStream) throws IOException {
            return (zzai) zzgyx.zzbk(zzc, inputStream);
        }

        public static zzai zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzai) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
        }

        public static zzai zzl(zzgxp zzgxpVar) throws zzgzm {
            return (zzai) zzgyx.zzbm(zzc, zzgxpVar);
        }

        public static zzai zzm(zzgxv zzgxvVar) throws IOException {
            return (zzai) zzgyx.zzbn(zzc, zzgxvVar);
        }

        public static zzai zzn(InputStream inputStream) throws IOException {
            return (zzai) zzgyx.zzbo(zzc, inputStream);
        }

        public static zzai zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzai) zzgyx.zzbp(zzc, byteBuffer);
        }

        public static zzai zzp(byte[] bArr) throws zzgzm {
            return (zzai) zzgyx.zzbq(zzc, bArr);
        }

        public static zzai zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzai) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
        }

        public static zzai zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzai) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
        }

        public static zzai zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzai) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
        }

        public static zzai zzt(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzai) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
        }

        public static zzai zzu(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzai) zzgyx.zzbx(zzc, bArr, zzgyhVar);
        }

        public static zzhaq<zzai> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaj
        public int zza() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaj
        public int zzb() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 3:
                    return new zzai();
                case 4:
                    return new zza();
                case 5:
                    return zzc;
                case 6:
                    zzhaq<zzai> zzhaqVar = zzd;
                    if (zzhaqVar == null) {
                        synchronized (zzai.class) {
                            zzhaqVar = zzd;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzc);
                                zzd = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaj
        public boolean zzg() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaj
        public boolean zzh() {
            return (this.zze & 2) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzaj extends zzhaj {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes3.dex */
    public interface zzak extends zzhaj {
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

    /* loaded from: classes3.dex */
    public final class zzal extends zzgyx<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzc;
        private static volatile zzhaq<zzal> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzal, zza> implements zzam {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzam
            public int zza() {
                return ((zzal) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzam
            public int zzb() {
                return ((zzal) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzal) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzal) this.zza).zzB();
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzal) this.zza).zzC(i10);
                return this;
            }

            public zza zzf(int i10) {
                zzbu();
                ((zzal) this.zza).zzD(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzam
            public boolean zzg() {
                return ((zzal) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzam
            public boolean zzh() {
                return ((zzal) this.zza).zzh();
            }

            private zza() {
                super(zzal.zzc);
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzc = zzalVar;
            zzgyx.zzcb(zzal.class, zzalVar);
        }

        private zzal() {
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
        public void zzC(int i10) {
            this.zze |= 2;
            this.zzg = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i10) {
            this.zze |= 1;
            this.zzf = i10;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzal zzalVar) {
            return zzc.zzba(zzalVar);
        }

        public static zzal zzi() {
            return zzc;
        }

        public static zzal zzj(InputStream inputStream) throws IOException {
            return (zzal) zzgyx.zzbk(zzc, inputStream);
        }

        public static zzal zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzal) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
        }

        public static zzal zzl(zzgxp zzgxpVar) throws zzgzm {
            return (zzal) zzgyx.zzbm(zzc, zzgxpVar);
        }

        public static zzal zzm(zzgxv zzgxvVar) throws IOException {
            return (zzal) zzgyx.zzbn(zzc, zzgxvVar);
        }

        public static zzal zzn(InputStream inputStream) throws IOException {
            return (zzal) zzgyx.zzbo(zzc, inputStream);
        }

        public static zzal zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzal) zzgyx.zzbp(zzc, byteBuffer);
        }

        public static zzal zzp(byte[] bArr) throws zzgzm {
            return (zzal) zzgyx.zzbq(zzc, bArr);
        }

        public static zzal zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzal) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
        }

        public static zzal zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzal) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
        }

        public static zzal zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzal) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
        }

        public static zzal zzt(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzal) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
        }

        public static zzal zzu(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzal) zzgyx.zzbx(zzc, bArr, zzgyhVar);
        }

        public static zzhaq<zzal> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzam
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzam
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 3:
                    return new zzal();
                case 4:
                    return new zza();
                case 5:
                    return zzc;
                case 6:
                    zzhaq<zzal> zzhaqVar = zzd;
                    if (zzhaqVar == null) {
                        synchronized (zzal.class) {
                            zzhaqVar = zzd;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzc);
                                zzd = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzam
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzam
        public boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzam extends zzhaj {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes3.dex */
    public final class zzan extends zzgyx<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzd;
        private static volatile zzhaq<zzan> zze;
        private int zzf;
        private String zzg = "";
        private int zzh;
        private zzap zzi;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzan, zza> implements zzao {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzao
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

            public zza zzg(zzgxp zzgxpVar) {
                zzbu();
                ((zzan) this.zza).zzM(zzgxpVar);
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

            @Override // com.google.android.gms.internal.ads.zzbbs.zzao
            public zzap zzk() {
                return ((zzan) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzao
            public zzgxp zzl() {
                return ((zzan) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzao
            public String zzm() {
                return ((zzan) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzao
            public boolean zzn() {
                return ((zzan) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzao
            public boolean zzo() {
                return ((zzan) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzao
            public boolean zzp() {
                return ((zzan) this.zza).zzp();
            }

            private zza() {
                super(zzan.zzd);
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzd = zzanVar;
            zzgyx.zzcb(zzan.class, zzanVar);
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
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
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
        public void zzM(zzgxp zzgxpVar) {
            this.zzg = zzgxpVar.zzx();
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

        public static zza zzb() {
            return zzd.zzaZ();
        }

        public static zza zzc(zzan zzanVar) {
            return zzd.zzba(zzanVar);
        }

        public static zzan zzf() {
            return zzd;
        }

        public static zzan zzg(InputStream inputStream) throws IOException {
            return (zzan) zzgyx.zzbk(zzd, inputStream);
        }

        public static zzan zzh(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzan) zzgyx.zzbl(zzd, inputStream, zzgyhVar);
        }

        public static zzan zzi(zzgxp zzgxpVar) throws zzgzm {
            return (zzan) zzgyx.zzbm(zzd, zzgxpVar);
        }

        public static zzan zzj(zzgxv zzgxvVar) throws IOException {
            return (zzan) zzgyx.zzbn(zzd, zzgxvVar);
        }

        public static zzan zzq(InputStream inputStream) throws IOException {
            return (zzan) zzgyx.zzbo(zzd, inputStream);
        }

        public static zzan zzr(ByteBuffer byteBuffer) throws zzgzm {
            return (zzan) zzgyx.zzbp(zzd, byteBuffer);
        }

        public static zzan zzs(byte[] bArr) throws zzgzm {
            return (zzan) zzgyx.zzbq(zzd, bArr);
        }

        public static zzan zzt(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzan) zzgyx.zzbr(zzd, zzgxpVar, zzgyhVar);
        }

        public static zzan zzu(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzan) zzgyx.zzbs(zzd, zzgxvVar, zzgyhVar);
        }

        public static zzan zzv(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzan) zzgyx.zzbu(zzd, inputStream, zzgyhVar);
        }

        public static zzan zzw(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzan) zzgyx.zzbv(zzd, byteBuffer, zzgyhVar);
        }

        public static zzan zzx(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzan) zzgyx.zzbx(zzd, bArr, zzgyhVar);
        }

        public static zzhaq<zzan> zzy() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzao
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzh);
            return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", zzq.zze(), "zzi"});
                case 3:
                    return new zzan();
                case 4:
                    return new zza();
                case 5:
                    return zzd;
                case 6:
                    zzhaq<zzan> zzhaqVar = zze;
                    if (zzhaqVar == null) {
                        synchronized (zzan.class) {
                            zzhaqVar = zze;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzd);
                                zze = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzao
        public zzap zzk() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzao
        public zzgxp zzl() {
            return zzgxp.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzao
        public String zzm() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzao
        public boolean zzn() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzao
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzao
        public boolean zzp() {
            return (this.zzf & 2) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzao extends zzhaj {
        zzq zza();

        zzap zzk();

        zzgxp zzl();

        String zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* loaded from: classes3.dex */
    public final class zzap extends zzgyx<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzc;
        private static volatile zzhaq<zzap> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzap, zza> implements zzaq {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzaq
            public int zza() {
                return ((zzap) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaq
            public int zzb() {
                return ((zzap) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzap) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzap) this.zza).zzB();
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzap) this.zza).zzC(i10);
                return this;
            }

            public zza zzf(int i10) {
                zzbu();
                ((zzap) this.zza).zzD(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaq
            public boolean zzg() {
                return ((zzap) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaq
            public boolean zzh() {
                return ((zzap) this.zza).zzh();
            }

            private zza() {
                super(zzap.zzc);
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzc = zzapVar;
            zzgyx.zzcb(zzap.class, zzapVar);
        }

        private zzap() {
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
        public void zzC(int i10) {
            this.zze |= 2;
            this.zzg = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i10) {
            this.zze |= 1;
            this.zzf = i10;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzap zzapVar) {
            return zzc.zzba(zzapVar);
        }

        public static zzap zzi() {
            return zzc;
        }

        public static zzap zzj(InputStream inputStream) throws IOException {
            return (zzap) zzgyx.zzbk(zzc, inputStream);
        }

        public static zzap zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzap) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
        }

        public static zzap zzl(zzgxp zzgxpVar) throws zzgzm {
            return (zzap) zzgyx.zzbm(zzc, zzgxpVar);
        }

        public static zzap zzm(zzgxv zzgxvVar) throws IOException {
            return (zzap) zzgyx.zzbn(zzc, zzgxvVar);
        }

        public static zzap zzn(InputStream inputStream) throws IOException {
            return (zzap) zzgyx.zzbo(zzc, inputStream);
        }

        public static zzap zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzap) zzgyx.zzbp(zzc, byteBuffer);
        }

        public static zzap zzp(byte[] bArr) throws zzgzm {
            return (zzap) zzgyx.zzbq(zzc, bArr);
        }

        public static zzap zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzap) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
        }

        public static zzap zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzap) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
        }

        public static zzap zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzap) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
        }

        public static zzap zzt(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzap) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
        }

        public static zzap zzu(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzap) zzgyx.zzbx(zzc, bArr, zzgyhVar);
        }

        public static zzhaq<zzap> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaq
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaq
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 3:
                    return new zzap();
                case 4:
                    return new zza();
                case 5:
                    return zzc;
                case 6:
                    zzhaq<zzap> zzhaqVar = zzd;
                    if (zzhaqVar == null) {
                        synchronized (zzap.class) {
                            zzhaqVar = zzd;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzc);
                                zzd = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaq
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaq
        public boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzaq extends zzhaj {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes3.dex */
    public final class zzar extends zzgyx<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzd;
        private static volatile zzhaq<zzar> zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzar, zza> implements zzas {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzas
            public int zza() {
                return ((zzar) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzas
            public int zzb() {
                return ((zzar) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzas
            public int zzc() {
                return ((zzar) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzar) this.zza).zzE();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzar) this.zza).zzF();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzar) this.zza).zzG();
                return this;
            }

            public zza zzg(int i10) {
                zzbu();
                ((zzar) this.zza).zzH(i10);
                return this;
            }

            public zza zzh(int i10) {
                zzbu();
                ((zzar) this.zza).zzI(i10);
                return this;
            }

            public zza zzi(int i10) {
                zzbu();
                ((zzar) this.zza).zzJ(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzas
            public boolean zzj() {
                return ((zzar) this.zza).zzj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzas
            public boolean zzk() {
                return ((zzar) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzas
            public boolean zzl() {
                return ((zzar) this.zza).zzl();
            }

            private zza() {
                super(zzar.zzd);
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzd = zzarVar;
            zzgyx.zzcb(zzar.class, zzarVar);
        }

        private zzar() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE() {
            this.zzf &= -2;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzf &= -5;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH(int i10) {
            this.zzf |= 1;
            this.zzg = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i10) {
            this.zzf |= 4;
            this.zzi = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(int i10) {
            this.zzf |= 2;
            this.zzh = i10;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zzf(zzar zzarVar) {
            return zzd.zzba(zzarVar);
        }

        public static zzar zzh() {
            return zzd;
        }

        public static zzar zzi(InputStream inputStream) throws IOException {
            return (zzar) zzgyx.zzbk(zzd, inputStream);
        }

        public static zzar zzm(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzar) zzgyx.zzbl(zzd, inputStream, zzgyhVar);
        }

        public static zzar zzn(zzgxp zzgxpVar) throws zzgzm {
            return (zzar) zzgyx.zzbm(zzd, zzgxpVar);
        }

        public static zzar zzo(zzgxv zzgxvVar) throws IOException {
            return (zzar) zzgyx.zzbn(zzd, zzgxvVar);
        }

        public static zzar zzp(InputStream inputStream) throws IOException {
            return (zzar) zzgyx.zzbo(zzd, inputStream);
        }

        public static zzar zzq(ByteBuffer byteBuffer) throws zzgzm {
            return (zzar) zzgyx.zzbp(zzd, byteBuffer);
        }

        public static zzar zzr(byte[] bArr) throws zzgzm {
            return (zzar) zzgyx.zzbq(zzd, bArr);
        }

        public static zzar zzs(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzar) zzgyx.zzbr(zzd, zzgxpVar, zzgyhVar);
        }

        public static zzar zzt(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzar) zzgyx.zzbs(zzd, zzgxvVar, zzgyhVar);
        }

        public static zzar zzu(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzar) zzgyx.zzbu(zzd, inputStream, zzgyhVar);
        }

        public static zzar zzv(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzar) zzgyx.zzbv(zzd, byteBuffer, zzgyhVar);
        }

        public static zzar zzw(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzar) zzgyx.zzbx(zzd, bArr, zzgyhVar);
        }

        public static zzhaq<zzar> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzas
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzas
        public int zzb() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzas
        public int zzc() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                case 3:
                    return new zzar();
                case 4:
                    return new zza();
                case 5:
                    return zzd;
                case 6:
                    zzhaq<zzar> zzhaqVar = zze;
                    if (zzhaqVar == null) {
                        synchronized (zzar.class) {
                            zzhaqVar = zze;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzd);
                                zze = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzas
        public boolean zzj() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzas
        public boolean zzk() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzas
        public boolean zzl() {
            return (this.zzf & 2) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzas extends zzhaj {
        int zza();

        int zzb();

        int zzc();

        boolean zzj();

        boolean zzk();

        boolean zzl();
    }

    /* loaded from: classes3.dex */
    public final class zzat extends zzgyx<zzat, zza> implements zzbi {
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
        private static volatile zzhaq<zzat> zzv;
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

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzat, zza> implements zzbi {
            public zza zzA(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcy(zzayVar);
                return this;
            }

            public zza zzB(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcz(zzbaVar);
                return this;
            }

            public zza zzC(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcA(zzbcVar);
                return this;
            }

            public zza zzD(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcB(zzbeVar);
                return this;
            }

            public zza zzE(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcC(zzbgVar);
                return this;
            }

            public zza zzF(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcD(zzapVar);
                return this;
            }

            public zza zzG(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcE(zzbjVar);
                return this;
            }

            public zza zzH(zzau.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zza zzI(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzauVar);
                return this;
            }

            public zza zzJ(zzay.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzaVar.zzbr());
                return this;
            }

            public zza zzK(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzayVar);
                return this;
            }

            public zza zzL(zzba.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zza zzM(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzbaVar);
                return this;
            }

            public zza zzN(zzbc.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zza zzO(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzbcVar);
                return this;
            }

            public zza zzP(zzbe.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zza zzQ(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcJ(zzbeVar);
                return this;
            }

            public zza zzR(zzbg.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcK(zzaVar.zzbr());
                return this;
            }

            public zza zzS(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcK(zzbgVar);
                return this;
            }

            public zza zzT(int i10) {
                zzbu();
                ((zzat) this.zza).zzcL(i10);
                return this;
            }

            public zza zzU(int i10) {
                zzbu();
                ((zzat) this.zza).zzcM(i10);
                return this;
            }

            public zza zzV(int i10) {
                zzbu();
                ((zzat) this.zza).zzcN(i10);
                return this;
            }

            public zza zzW(int i10) {
                zzbu();
                ((zzat) this.zza).zzcO(i10);
                return this;
            }

            public zza zzX(int i10) {
                zzbu();
                ((zzat) this.zza).zzcP(i10);
                return this;
            }

            public zza zzY(int i10) {
                zzbu();
                ((zzat) this.zza).zzcQ(i10);
                return this;
            }

            public zza zzZ(int i10) {
                zzbu();
                ((zzat) this.zza).zzcR(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public int zza() {
                return ((zzat) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzaA() {
                return ((zzat) this.zza).zzaA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzaB() {
                return ((zzat) this.zza).zzaB();
            }

            public zza zzaa(zzap.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcS(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcS(zzapVar);
                return this;
            }

            public zza zzac(long j3) {
                zzbu();
                ((zzat) this.zza).zzcT(j3);
                return this;
            }

            public zza zzad(zzbj.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcU(zzaVar.zzbr());
                return this;
            }

            public zza zzae(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcU(zzbjVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public zzau zzaf() {
                return ((zzat) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public zzay zzag() {
                return ((zzat) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public zzba zzah() {
                return ((zzat) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public zzbc zzai() {
                return ((zzat) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public zzbe zzaj() {
                return ((zzat) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public zzbg zzak() {
                return ((zzat) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public zzbj zzal() {
                return ((zzat) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzam() {
                return ((zzat) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzan() {
                return ((zzat) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzao() {
                return ((zzat) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzap() {
                return ((zzat) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzaq() {
                return ((zzat) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzar() {
                return ((zzat) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzas() {
                return ((zzat) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzat() {
                return ((zzat) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzau() {
                return ((zzat) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzav() {
                return ((zzat) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzaw() {
                return ((zzat) this.zza).zzaw();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzax() {
                return ((zzat) this.zza).zzax();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzay() {
                return ((zzat) this.zza).zzay();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public boolean zzaz() {
                return ((zzat) this.zza).zzaz();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public int zzb() {
                return ((zzat) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public int zzc() {
                return ((zzat) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public int zzd() {
                return ((zzat) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public int zze() {
                return ((zzat) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public int zzf() {
                return ((zzat) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public int zzg() {
                return ((zzat) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public long zzh() {
                return ((zzat) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
            public zzap zzi() {
                return ((zzat) this.zza).zzi();
            }

            public zza zzj() {
                zzbu();
                ((zzat) this.zza).zzch();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzat) this.zza).zzci();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzat) this.zza).zzcj();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzat) this.zza).zzck();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzat) this.zza).zzcl();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzat) this.zza).zzcm();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzat) this.zza).zzcn();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzat) this.zza).zzco();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzat) this.zza).zzcp();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzat) this.zza).zzcq();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzat) this.zza).zzcr();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzat) this.zza).zzcs();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzat) this.zza).zzct();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzat) this.zza).zzcu();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzat) this.zza).zzcv();
                return this;
            }

            public zza zzy() {
                zzbu();
                ((zzat) this.zza).zzcw();
                return this;
            }

            public zza zzz(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcx(zzauVar);
                return this;
            }

            private zza() {
                super(zzat.zzu);
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzu = zzatVar;
            zzgyx.zzcb(zzat.class, zzatVar);
        }

        private zzat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(zzbc zzbcVar) {
            zzbcVar.getClass();
            zzbc zzbcVar2 = this.zzC;
            if (zzbcVar2 != null && zzbcVar2 != zzbc.zzh()) {
                zzbc.zza zzf2 = zzbc.zzf(zzbcVar2);
                zzf2.zzbj(zzbcVar);
                zzbcVar = zzf2.zzbs();
            }
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(zzbe zzbeVar) {
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
        public void zzcC(zzbg zzbgVar) {
            zzbgVar.getClass();
            zzbg zzbgVar2 = this.zzz;
            if (zzbgVar2 != null && zzbgVar2 != zzbg.zzh()) {
                zzbg.zza zzf2 = zzbg.zzf(zzbgVar2);
                zzf2.zzbj(zzbgVar);
                zzbgVar = zzf2.zzbs();
            }
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzG;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(zzbj zzbjVar) {
            zzbjVar.getClass();
            zzbj zzbjVar2 = this.zzA;
            if (zzbjVar2 != null && zzbjVar2 != zzbj.zzg()) {
                zzbj.zza zzd2 = zzbj.zzd(zzbjVar2);
                zzd2.zzbj(zzbjVar);
                zzbjVar = zzd2.zzbs();
            }
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzau zzauVar) {
            zzauVar.getClass();
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(zzay zzayVar) {
            zzayVar.getClass();
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzba zzbaVar) {
            zzbaVar.getClass();
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzbc zzbcVar) {
            zzbcVar.getClass();
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzbe zzbeVar) {
            zzbeVar.getClass();
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(zzbg zzbgVar) {
            zzbgVar.getClass();
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(int i10) {
            this.zzw |= 8192;
            this.zzK = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcM(int i10) {
            this.zzw |= JsonLexerKt.BATCH_SIZE;
            this.zzL = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcN(int i10) {
            this.zzw |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            this.zzH = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcO(int i10) {
            this.zzw |= 128;
            this.zzE = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcP(int i10) {
            this.zzw |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.zzF = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcQ(int i10) {
            this.zzw |= 2048;
            this.zzI = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcR(int i10) {
            this.zzw |= 4096;
            this.zzJ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcS(zzap zzapVar) {
            zzapVar.getClass();
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcT(long j3) {
            this.zzw |= 32768;
            this.zzM = j3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcU(zzbj zzbjVar) {
            zzbjVar.getClass();
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzB = null;
            this.zzw &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzD = null;
            this.zzw &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzx = null;
            this.zzw &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzC = null;
            this.zzw &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzy = null;
            this.zzw &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzz = null;
            this.zzw &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzw &= -8193;
            this.zzK = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzw &= -16385;
            this.zzL = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp() {
            this.zzw &= -1025;
            this.zzH = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq() {
            this.zzw &= -129;
            this.zzE = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr() {
            this.zzw &= -257;
            this.zzF = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs() {
            this.zzw &= -2049;
            this.zzI = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct() {
            this.zzw &= -4097;
            this.zzJ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu() {
            this.zzG = null;
            this.zzw &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv() {
            this.zzw &= -32769;
            this.zzM = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw() {
            this.zzA = null;
            this.zzw &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzau zzauVar) {
            zzauVar.getClass();
            zzau zzauVar2 = this.zzB;
            if (zzauVar2 != null && zzauVar2 != zzau.zzg()) {
                zzau.zza zzd2 = zzau.zzd(zzauVar2);
                zzd2.zzbj(zzauVar);
                zzauVar = zzd2.zzbs();
            }
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzay zzayVar) {
            zzayVar.getClass();
            zzay zzayVar2 = this.zzD;
            if (zzayVar2 != null && zzayVar2 != zzay.zzi()) {
                zzay.zza zzg2 = zzay.zzg(zzayVar2);
                zzg2.zzbj(zzayVar);
                zzayVar = zzg2.zzbs();
            }
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzba zzbaVar) {
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
            return (zzat) zzgyx.zzbk(zzu, inputStream);
        }

        public static zzat zzo(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzat) zzgyx.zzbl(zzu, inputStream, zzgyhVar);
        }

        public static zzat zzp(zzgxp zzgxpVar) throws zzgzm {
            return (zzat) zzgyx.zzbm(zzu, zzgxpVar);
        }

        public static zzat zzq(zzgxv zzgxvVar) throws IOException {
            return (zzat) zzgyx.zzbn(zzu, zzgxvVar);
        }

        public static zzat zzr(InputStream inputStream) throws IOException {
            return (zzat) zzgyx.zzbo(zzu, inputStream);
        }

        public static zzat zzs(ByteBuffer byteBuffer) throws zzgzm {
            return (zzat) zzgyx.zzbp(zzu, byteBuffer);
        }

        public static zzat zzt(byte[] bArr) throws zzgzm {
            return (zzat) zzgyx.zzbq(zzu, bArr);
        }

        public static zzat zzu(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzat) zzgyx.zzbr(zzu, zzgxpVar, zzgyhVar);
        }

        public static zzat zzv(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzat) zzgyx.zzbs(zzu, zzgxvVar, zzgyhVar);
        }

        public static zzat zzw(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzat) zzgyx.zzbu(zzu, inputStream, zzgyhVar);
        }

        public static zzat zzx(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzat) zzgyx.zzbv(zzu, byteBuffer, zzgyhVar);
        }

        public static zzat zzy(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzat) zzgyx.zzbx(zzu, bArr, zzgyhVar);
        }

        public static zzhaq<zzat> zzz() {
            return zzu.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public int zza() {
            return this.zzK;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzaA() {
            return (this.zzw & 32768) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzaB() {
            return (this.zzw & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public zzau zzaf() {
            zzau zzauVar = this.zzB;
            return zzauVar == null ? zzau.zzg() : zzauVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public zzay zzag() {
            zzay zzayVar = this.zzD;
            return zzayVar == null ? zzay.zzi() : zzayVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public zzba zzah() {
            zzba zzbaVar = this.zzx;
            return zzbaVar == null ? zzba.zzi() : zzbaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public zzbc zzai() {
            zzbc zzbcVar = this.zzC;
            return zzbcVar == null ? zzbc.zzh() : zzbcVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public zzbe zzaj() {
            zzbe zzbeVar = this.zzy;
            return zzbeVar == null ? zzbe.zzj() : zzbeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public zzbg zzak() {
            zzbg zzbgVar = this.zzz;
            return zzbgVar == null ? zzbg.zzh() : zzbgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public zzbj zzal() {
            zzbj zzbjVar = this.zzA;
            return zzbjVar == null ? zzbj.zzg() : zzbjVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzam() {
            return (this.zzw & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzan() {
            return (this.zzw & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzao() {
            return (this.zzw & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzap() {
            return (this.zzw & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzaq() {
            return (this.zzw & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzar() {
            return (this.zzw & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzas() {
            return (this.zzw & 8192) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzat() {
            return (this.zzw & JsonLexerKt.BATCH_SIZE) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzau() {
            return (this.zzw & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzav() {
            return (this.zzw & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzaw() {
            return (this.zzw & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzax() {
            return (this.zzw & 2048) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzay() {
            return (this.zzw & 4096) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public boolean zzaz() {
            return (this.zzw & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public int zzb() {
            return this.zzL;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public int zzc() {
            return this.zzH;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public int zzd() {
            return this.zzE;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
                case 3:
                    return new zzat();
                case 4:
                    return new zza();
                case 5:
                    return zzu;
                case 6:
                    zzhaq<zzat> zzhaqVar = zzv;
                    if (zzhaqVar == null) {
                        synchronized (zzat.class) {
                            zzhaqVar = zzv;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzu);
                                zzv = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public int zze() {
            return this.zzF;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public int zzf() {
            return this.zzI;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public int zzg() {
            return this.zzJ;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public long zzh() {
            return this.zzM;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbi
        public zzap zzi() {
            zzap zzapVar = this.zzG;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }
    }

    /* loaded from: classes3.dex */
    public final class zzau extends zzgyx<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzd;
        private static volatile zzhaq<zzau> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzau, zza> implements zzav {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzav
            public zzq zza() {
                return ((zzau) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzav
            public zzap zzb() {
                return ((zzau) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzau) this.zza).zzG();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzau) this.zza).zzH();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzau) this.zza).zzI();
                return this;
            }

            public zza zzf(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzJ(zzawVar);
                return this;
            }

            public zza zzg(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzawVar);
                return this;
            }

            public zza zzj(zzap.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzM(zzaVar.zzbr());
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzl(zzq zzqVar) {
                zzbu();
                ((zzau) this.zza).zzN(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzav
            public zzaw zzm() {
                return ((zzau) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzav
            public boolean zzn() {
                return ((zzau) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzav
            public boolean zzo() {
                return ((zzau) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzav
            public boolean zzp() {
                return ((zzau) this.zza).zzp();
            }

            private zza() {
                super(zzau.zzd);
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzd = zzauVar;
            zzgyx.zzcb(zzau.class, zzauVar);
        }

        private zzau() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzc() {
            return zzd.zzaZ();
        }

        public static zza zzd(zzau zzauVar) {
            return zzd.zzba(zzauVar);
        }

        public static zzau zzg() {
            return zzd;
        }

        public static zzau zzh(InputStream inputStream) throws IOException {
            return (zzau) zzgyx.zzbk(zzd, inputStream);
        }

        public static zzau zzi(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzau) zzgyx.zzbl(zzd, inputStream, zzgyhVar);
        }

        public static zzau zzj(zzgxp zzgxpVar) throws zzgzm {
            return (zzau) zzgyx.zzbm(zzd, zzgxpVar);
        }

        public static zzau zzk(zzgxv zzgxvVar) throws IOException {
            return (zzau) zzgyx.zzbn(zzd, zzgxvVar);
        }

        public static zzau zzl(InputStream inputStream) throws IOException {
            return (zzau) zzgyx.zzbo(zzd, inputStream);
        }

        public static zzau zzq(ByteBuffer byteBuffer) throws zzgzm {
            return (zzau) zzgyx.zzbp(zzd, byteBuffer);
        }

        public static zzau zzr(byte[] bArr) throws zzgzm {
            return (zzau) zzgyx.zzbq(zzd, bArr);
        }

        public static zzau zzs(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzau) zzgyx.zzbr(zzd, zzgxpVar, zzgyhVar);
        }

        public static zzau zzt(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzau) zzgyx.zzbs(zzd, zzgxvVar, zzgyhVar);
        }

        public static zzau zzu(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzau) zzgyx.zzbu(zzd, inputStream, zzgyhVar);
        }

        public static zzau zzv(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzau) zzgyx.zzbv(zzd, byteBuffer, zzgyhVar);
        }

        public static zzau zzw(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzau) zzgyx.zzbx(zzd, bArr, zzgyhVar);
        }

        public static zzhaq<zzau> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzav
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzav
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
                case 3:
                    return new zzau();
                case 4:
                    return new zza();
                case 5:
                    return zzd;
                case 6:
                    zzhaq<zzau> zzhaqVar = zze;
                    if (zzhaqVar == null) {
                        synchronized (zzau.class) {
                            zzhaqVar = zze;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzd);
                                zze = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzav
        public zzaw zzm() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzav
        public boolean zzn() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzav
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzav
        public boolean zzp() {
            return (this.zzf & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzav extends zzhaj {
        zzq zza();

        zzap zzb();

        zzaw zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* loaded from: classes3.dex */
    public final class zzaw extends zzgyx<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzb;
        private static volatile zzhaq<zzaw> zzc;
        private int zzd;
        private int zze;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzaw, zza> implements zzax {
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

            @Override // com.google.android.gms.internal.ads.zzbbs.zzax
            public zzb zzc() {
                return ((zzaw) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzax
            public boolean zzd() {
                return ((zzaw) this.zza).zzd();
            }

            private zza() {
                super(zzaw.zzb);
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzgzb {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 3;
            private static final zzgzc<zzb> zzi = new zzgzc<zzb>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzaw.zzb.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i10) {
                    return zzb.zzb(i10);
                }
            };
            private final int zzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes3.dex */
            public final class zza implements zzgzd {
                static final zzgzd zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzd
                public boolean zza(int i10) {
                    return zzb.zzb(i10) != null;
                }
            }

            zzb(int i10) {
                this.zzk = i10;
            }

            public static zzb zzb(int i10) {
                if (i10 == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i10 == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i10 != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static zzgzc<zzb> zzd() {
                return zzi;
            }

            public static zzgzd zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgzb
            public final int zza() {
                return this.zzk;
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzb = zzawVar;
            zzgyx.zzcb(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        public static zza zza() {
            return zzb.zzaZ();
        }

        public static zza zzb(zzaw zzawVar) {
            return zzb.zzba(zzawVar);
        }

        public static zzaw zzg() {
            return zzb;
        }

        public static zzaw zzh(InputStream inputStream) throws IOException {
            return (zzaw) zzgyx.zzbk(zzb, inputStream);
        }

        public static zzaw zzi(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzaw) zzgyx.zzbl(zzb, inputStream, zzgyhVar);
        }

        public static zzaw zzj(zzgxp zzgxpVar) throws zzgzm {
            return (zzaw) zzgyx.zzbm(zzb, zzgxpVar);
        }

        public static zzaw zzk(zzgxv zzgxvVar) throws IOException {
            return (zzaw) zzgyx.zzbn(zzb, zzgxvVar);
        }

        public static zzaw zzl(InputStream inputStream) throws IOException {
            return (zzaw) zzgyx.zzbo(zzb, inputStream);
        }

        public static zzaw zzm(ByteBuffer byteBuffer) throws zzgzm {
            return (zzaw) zzgyx.zzbp(zzb, byteBuffer);
        }

        public static zzaw zzn(byte[] bArr) throws zzgzm {
            return (zzaw) zzgyx.zzbq(zzb, bArr);
        }

        public static zzaw zzo(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzaw) zzgyx.zzbr(zzb, zzgxpVar, zzgyhVar);
        }

        public static zzaw zzp(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzaw) zzgyx.zzbs(zzb, zzgxvVar, zzgyhVar);
        }

        public static zzaw zzq(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzaw) zzgyx.zzbu(zzb, inputStream, zzgyhVar);
        }

        public static zzaw zzr(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzaw) zzgyx.zzbv(zzb, byteBuffer, zzgyhVar);
        }

        public static zzaw zzs(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzaw) zzgyx.zzbx(zzb, bArr, zzgyhVar);
        }

        public static zzhaq<zzaw> zzt() {
            return zzb.zzbN();
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

        @Override // com.google.android.gms.internal.ads.zzbbs.zzax
        public zzb zzc() {
            zzb zzb2 = zzb.zzb(this.zze);
            return zzb2 == null ? zzb.VIDEO_ERROR_CODE_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzax
        public boolean zzd() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzb.zze()});
                case 3:
                    return new zzaw();
                case 4:
                    return new zza();
                case 5:
                    return zzb;
                case 6:
                    zzhaq<zzaw> zzhaqVar = zzc;
                    if (zzhaqVar == null) {
                        synchronized (zzaw.class) {
                            zzhaqVar = zzc;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzb);
                                zzc = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface zzax extends zzhaj {
        zzaw.zzb zzc();

        boolean zzd();
    }

    /* loaded from: classes3.dex */
    public final class zzay extends zzgyx<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zze;
        private static volatile zzhaq<zzay> zzf;
        private int zzg;
        private zzar zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private zzap zzk;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzay, zza> implements zzaz {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
            public zzq zza() {
                return ((zzay) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
            public zzap zzb() {
                return ((zzay) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
            public zzar zzc() {
                return ((zzay) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
            public zzaw zzd() {
                return ((zzay) this.zza).zzd();
            }

            public zza zze() {
                zzbu();
                ((zzay) this.zza).zzL();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzay) this.zza).zzM();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzay) this.zza).zzN();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzay) this.zza).zzO();
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzP(zzawVar);
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzQ(zzapVar);
                return this;
            }

            public zza zzk(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzl(zzaw.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzawVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzT(zzaVar.zzbr());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzT(zzapVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzay) this.zza).zzU(zzqVar);
                return this;
            }

            public zza zzq(zzar.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzV(zzaVar.zzbr());
                return this;
            }

            public zza zzr(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzV(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
            public boolean zzs() {
                return ((zzay) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
            public boolean zzt() {
                return ((zzay) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
            public boolean zzu() {
                return ((zzay) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
            public boolean zzv() {
                return ((zzay) this.zza).zzv();
            }

            private zza() {
                super(zzay.zze);
            }
        }

        static {
            zzay zzayVar = new zzay();
            zze = zzayVar;
            zzgyx.zzcb(zzay.class, zzayVar);
        }

        private zzay() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL() {
            this.zzj = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM() {
            this.zzk = null;
            this.zzg &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzg &= -3;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO() {
            this.zzh = null;
            this.zzg &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzh;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
            }
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzar zzarVar) {
            zzarVar.getClass();
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        public static zza zzf() {
            return zze.zzaZ();
        }

        public static zza zzg(zzay zzayVar) {
            return zze.zzba(zzayVar);
        }

        public static zzay zzi() {
            return zze;
        }

        public static zzay zzj(InputStream inputStream) throws IOException {
            return (zzay) zzgyx.zzbk(zze, inputStream);
        }

        public static zzay zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzay) zzgyx.zzbl(zze, inputStream, zzgyhVar);
        }

        public static zzay zzl(zzgxp zzgxpVar) throws zzgzm {
            return (zzay) zzgyx.zzbm(zze, zzgxpVar);
        }

        public static zzay zzm(zzgxv zzgxvVar) throws IOException {
            return (zzay) zzgyx.zzbn(zze, zzgxvVar);
        }

        public static zzay zzn(InputStream inputStream) throws IOException {
            return (zzay) zzgyx.zzbo(zze, inputStream);
        }

        public static zzay zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzay) zzgyx.zzbp(zze, byteBuffer);
        }

        public static zzay zzp(byte[] bArr) throws zzgzm {
            return (zzay) zzgyx.zzbq(zze, bArr);
        }

        public static zzay zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzay) zzgyx.zzbr(zze, zzgxpVar, zzgyhVar);
        }

        public static zzay zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzay) zzgyx.zzbs(zze, zzgxvVar, zzgyhVar);
        }

        public static zzay zzw(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzay) zzgyx.zzbu(zze, inputStream, zzgyhVar);
        }

        public static zzay zzx(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzay) zzgyx.zzbv(zze, byteBuffer, zzgyhVar);
        }

        public static zzay zzy(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzay) zzgyx.zzbx(zze, bArr, zzgyhVar);
        }

        public static zzhaq<zzay> zzz() {
            return zze.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzi);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
        public zzap zzb() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
        public zzar zzc() {
            zzar zzarVar = this.zzh;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
        public zzaw zzd() {
            zzaw zzawVar = this.zzj;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
                case 3:
                    return new zzay();
                case 4:
                    return new zza();
                case 5:
                    return zze;
                case 6:
                    zzhaq<zzay> zzhaqVar = zzf;
                    if (zzhaqVar == null) {
                        synchronized (zzay.class) {
                            zzhaqVar = zzf;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zze);
                                zzf = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
        public boolean zzs() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
        public boolean zzt() {
            return (this.zzg & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
        public boolean zzu() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaz
        public boolean zzv() {
            return (this.zzg & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzaz extends zzhaj {
        zzq zza();

        zzap zzb();

        zzar zzc();

        zzaw zzd();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* loaded from: classes3.dex */
    public final class zzb extends zzgyx<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzb;
        private static volatile zzhaq<zzb> zzc;
        private zzgzj<zza> zzd = zzgyx.zzbK();

        /* loaded from: classes3.dex */
        public final class zza extends zzgyx<zza, C0144zza> implements InterfaceC0145zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzd;
            private static volatile zzhaq<zza> zze;
            private int zzf;
            private int zzg;
            private zze zzh;
            private zzg zzi;

            /* renamed from: com.google.android.gms.internal.ads.zzbbs$zzb$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public final class C0144zza extends zzgyr<zza, C0144zza> implements InterfaceC0145zzb {
                public C0144zza zza() {
                    zzbu();
                    ((zza) this.zza).zzG();
                    return this;
                }

                public C0144zza zzb() {
                    zzbu();
                    ((zza) this.zza).zzH();
                    return this;
                }

                public C0144zza zzc() {
                    zzbu();
                    ((zza) this.zza).zzI();
                    return this;
                }

                public C0144zza zzd(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzJ(zzeVar);
                    return this;
                }

                public C0144zza zze(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzK(zzgVar);
                    return this;
                }

                public C0144zza zzf(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzL(zzdVar);
                    return this;
                }

                public C0144zza zzg(zze.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzaVar.zzbr());
                    return this;
                }

                public C0144zza zzh(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzeVar);
                    return this;
                }

                public C0144zza zzi(zzg.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzaVar.zzbr());
                    return this;
                }

                public C0144zza zzj(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzgVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
                public zzd zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
                public zze zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
                public zzg zzm() {
                    return ((zza) this.zza).zzm();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
                public boolean zzn() {
                    return ((zza) this.zza).zzn();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
                public boolean zzo() {
                    return ((zza) this.zza).zzo();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
                public boolean zzp() {
                    return ((zza) this.zza).zzp();
                }

                private C0144zza() {
                    super(zza.zzd);
                }
            }

            static {
                zza zzaVar = new zza();
                zzd = zzaVar;
                zzgyx.zzcb(zza.class, zzaVar);
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
                    zze.zza zzc2 = zze.zzc(zzeVar2);
                    zzc2.zzbj(zzeVar);
                    zzeVar = zzc2.zzbs();
                }
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzK(zzg zzgVar) {
                zzgVar.getClass();
                zzg zzgVar2 = this.zzi;
                if (zzgVar2 != null && zzgVar2 != zzg.zzf()) {
                    zzg.zza zzc2 = zzg.zzc(zzgVar2);
                    zzc2.zzbj(zzgVar);
                    zzgVar = zzc2.zzbs();
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

            public static C0144zza zza() {
                return zzd.zzaZ();
            }

            public static C0144zza zzb(zza zzaVar) {
                return zzd.zzba(zzaVar);
            }

            public static zza zzd() {
                return zzd;
            }

            public static zza zzf(InputStream inputStream) throws IOException {
                return (zza) zzgyx.zzbk(zzd, inputStream);
            }

            public static zza zzg(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
                return (zza) zzgyx.zzbl(zzd, inputStream, zzgyhVar);
            }

            public static zza zzh(zzgxp zzgxpVar) throws zzgzm {
                return (zza) zzgyx.zzbm(zzd, zzgxpVar);
            }

            public static zza zzi(zzgxv zzgxvVar) throws IOException {
                return (zza) zzgyx.zzbn(zzd, zzgxvVar);
            }

            public static zza zzj(InputStream inputStream) throws IOException {
                return (zza) zzgyx.zzbo(zzd, inputStream);
            }

            public static zza zzq(ByteBuffer byteBuffer) throws zzgzm {
                return (zza) zzgyx.zzbp(zzd, byteBuffer);
            }

            public static zza zzr(byte[] bArr) throws zzgzm {
                return (zza) zzgyx.zzbq(zzd, bArr);
            }

            public static zza zzs(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
                return (zza) zzgyx.zzbr(zzd, zzgxpVar, zzgyhVar);
            }

            public static zza zzt(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
                return (zza) zzgyx.zzbs(zzd, zzgxvVar, zzgyhVar);
            }

            public static zza zzu(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
                return (zza) zzgyx.zzbu(zzd, inputStream, zzgyhVar);
            }

            public static zza zzv(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
                return (zza) zzgyx.zzbv(zzd, byteBuffer, zzgyhVar);
            }

            public static zza zzw(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
                return (zza) zzgyx.zzbx(zzd, bArr, zzgyhVar);
            }

            public static zzhaq<zza> zzx() {
                return zzd.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzgyx
            public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
                switch (zzgywVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return zzgyx.zzbS(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzd.zze(), "zzh", "zzi"});
                    case 3:
                        return new zza();
                    case 4:
                        return new C0144zza();
                    case 5:
                        return zzd;
                    case 6:
                        zzhaq<zza> zzhaqVar = zze;
                        if (zzhaqVar == null) {
                            synchronized (zza.class) {
                                zzhaqVar = zze;
                                if (zzhaqVar == null) {
                                    zzhaqVar = new zzgys(zzd);
                                    zze = zzhaqVar;
                                }
                            }
                        }
                        return zzhaqVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
            public zzd zzk() {
                zzd zzb2 = zzd.zzb(this.zzg);
                return zzb2 == null ? zzd.UNSPECIFIED : zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
            public zze zzl() {
                zze zzeVar = this.zzh;
                return zzeVar == null ? zze.zzi() : zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
            public zzg zzm() {
                zzg zzgVar = this.zzi;
                return zzgVar == null ? zzg.zzf() : zzgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
            public boolean zzn() {
                return (this.zzf & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
            public boolean zzo() {
                return (this.zzf & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.InterfaceC0145zzb
            public boolean zzp() {
                return (this.zzf & 4) != 0;
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbbs$zzb$zzb, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0145zzb extends zzhaj {
            zzd zzk();

            zze zzl();

            zzg zzm();

            boolean zzn();

            boolean zzo();

            boolean zzp();
        }

        /* loaded from: classes3.dex */
        public final class zzc extends zzgyr<zzb, zzc> implements zzc {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzc
            public int zza() {
                return ((zzb) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzc
            public zza zzb(int i10) {
                return ((zzb) this.zza).zzb(i10);
            }

            public zzc zzc(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzb) this.zza).zzD(iterable);
                return this;
            }

            public zzc zzd(zza.C0144zza c0144zza) {
                zzbu();
                ((zzb) this.zza).zzE(c0144zza.zzbr());
                return this;
            }

            public zzc zze(zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzE(zzaVar);
                return this;
            }

            public zzc zzf(int i10, zza.C0144zza c0144zza) {
                zzbu();
                ((zzb) this.zza).zzF(i10, c0144zza.zzbr());
                return this;
            }

            public zzc zzg(int i10, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzF(i10, zzaVar);
                return this;
            }

            public zzc zzh() {
                zzbu();
                ((zzb) this.zza).zzG();
                return this;
            }

            public zzc zzi(int i10) {
                zzbu();
                ((zzb) this.zza).zzI(i10);
                return this;
            }

            public zzc zzj(int i10, zza.C0144zza c0144zza) {
                zzbu();
                ((zzb) this.zza).zzJ(i10, c0144zza.zzbr());
                return this;
            }

            public zzc zzk(int i10, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzJ(i10, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzc
            public List<zza> zzl() {
                return Collections.unmodifiableList(((zzb) this.zza).zzl());
            }

            private zzc() {
                super(zzb.zzb);
            }
        }

        /* loaded from: classes3.dex */
        public enum zzd implements zzgzb {
            UNSPECIFIED(0),
            IN_MEMORY(1);

            public static final int zzc = 0;
            public static final int zzd = 1;
            private static final zzgzc<zzd> zze = new zzgzc<zzd>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzb.zzd.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i10) {
                    return zzd.zzb(i10);
                }
            };
            private final int zzg;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes3.dex */
            public final class zza implements zzgzd {
                static final zzgzd zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzd
                public boolean zza(int i10) {
                    return zzd.zzb(i10) != null;
                }
            }

            zzd(int i10) {
                this.zzg = i10;
            }

            public static zzd zzb(int i10) {
                if (i10 == 0) {
                    return UNSPECIFIED;
                }
                if (i10 != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static zzgzc<zzd> zzd() {
                return zze;
            }

            public static zzgzd zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgzb
            public final int zza() {
                return this.zzg;
            }
        }

        /* loaded from: classes3.dex */
        public final class zze extends zzgyx<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzc;
            private static volatile zzhaq<zze> zzd;
            private int zze;
            private boolean zzf;
            private int zzg;

            /* loaded from: classes3.dex */
            public final class zza extends zzgyr<zze, zza> implements zzf {
                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzf
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

                public zza zzd(boolean z10) {
                    zzbu();
                    ((zze) this.zza).zzC(z10);
                    return this;
                }

                public zza zze(int i10) {
                    zzbu();
                    ((zze) this.zza).zzD(i10);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzf
                public boolean zzf() {
                    return ((zze) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzf
                public boolean zzg() {
                    return ((zze) this.zza).zzg();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzf
                public boolean zzh() {
                    return ((zze) this.zza).zzh();
                }

                private zza() {
                    super(zze.zzc);
                }
            }

            static {
                zze zzeVar = new zze();
                zzc = zzeVar;
                zzgyx.zzcb(zze.class, zzeVar);
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
            public void zzC(boolean z10) {
                this.zze |= 1;
                this.zzf = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzD(int i10) {
                this.zze |= 2;
                this.zzg = i10;
            }

            public static zza zzb() {
                return zzc.zzaZ();
            }

            public static zza zzc(zze zzeVar) {
                return zzc.zzba(zzeVar);
            }

            public static zze zzi() {
                return zzc;
            }

            public static zze zzj(InputStream inputStream) throws IOException {
                return (zze) zzgyx.zzbk(zzc, inputStream);
            }

            public static zze zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
                return (zze) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
            }

            public static zze zzl(zzgxp zzgxpVar) throws zzgzm {
                return (zze) zzgyx.zzbm(zzc, zzgxpVar);
            }

            public static zze zzm(zzgxv zzgxvVar) throws IOException {
                return (zze) zzgyx.zzbn(zzc, zzgxvVar);
            }

            public static zze zzn(InputStream inputStream) throws IOException {
                return (zze) zzgyx.zzbo(zzc, inputStream);
            }

            public static zze zzo(ByteBuffer byteBuffer) throws zzgzm {
                return (zze) zzgyx.zzbp(zzc, byteBuffer);
            }

            public static zze zzp(byte[] bArr) throws zzgzm {
                return (zze) zzgyx.zzbq(zzc, bArr);
            }

            public static zze zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
                return (zze) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
            }

            public static zze zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
                return (zze) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
            }

            public static zze zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
                return (zze) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
            }

            public static zze zzt(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
                return (zze) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
            }

            public static zze zzu(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
                return (zze) zzgyx.zzbx(zzc, bArr, zzgyhVar);
            }

            public static zzhaq<zze> zzv() {
                return zzc.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzf
            public int zza() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzgyx
            public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
                switch (zzgywVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    case 3:
                        return new zze();
                    case 4:
                        return new zza();
                    case 5:
                        return zzc;
                    case 6:
                        zzhaq<zze> zzhaqVar = zzd;
                        if (zzhaqVar == null) {
                            synchronized (zze.class) {
                                zzhaqVar = zzd;
                                if (zzhaqVar == null) {
                                    zzhaqVar = new zzgys(zzc);
                                    zzd = zzhaqVar;
                                }
                            }
                        }
                        return zzhaqVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzf
            public boolean zzf() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzf
            public boolean zzg() {
                return (this.zze & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzf
            public boolean zzh() {
                return (this.zze & 2) != 0;
            }
        }

        /* loaded from: classes3.dex */
        public interface zzf extends zzhaj {
            int zza();

            boolean zzf();

            boolean zzg();

            boolean zzh();
        }

        /* loaded from: classes3.dex */
        public final class zzg extends zzgyx<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzd;
            private static volatile zzhaq<zzg> zze;
            private int zzf;
            private boolean zzg;
            private boolean zzh;
            private int zzi;

            /* loaded from: classes3.dex */
            public final class zza extends zzgyr<zzg, zza> implements zzh {
                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
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

                public zza zze(boolean z10) {
                    zzbu();
                    ((zzg) this.zza).zzH(z10);
                    return this;
                }

                public zza zzf(boolean z10) {
                    zzbu();
                    ((zzg) this.zza).zzI(z10);
                    return this;
                }

                public zza zzg(int i10) {
                    zzbu();
                    ((zzg) this.zza).zzJ(i10);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
                public boolean zzh() {
                    return ((zzg) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
                public boolean zzi() {
                    return ((zzg) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
                public boolean zzj() {
                    return ((zzg) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
                public boolean zzk() {
                    return ((zzg) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
                public boolean zzl() {
                    return ((zzg) this.zza).zzl();
                }

                private zza() {
                    super(zzg.zzd);
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzd = zzgVar;
                zzgyx.zzcb(zzg.class, zzgVar);
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
            public void zzH(boolean z10) {
                this.zzf |= 1;
                this.zzg = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzI(boolean z10) {
                this.zzf |= 2;
                this.zzh = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzJ(int i10) {
                this.zzf |= 4;
                this.zzi = i10;
            }

            public static zza zzb() {
                return zzd.zzaZ();
            }

            public static zza zzc(zzg zzgVar) {
                return zzd.zzba(zzgVar);
            }

            public static zzg zzf() {
                return zzd;
            }

            public static zzg zzg(InputStream inputStream) throws IOException {
                return (zzg) zzgyx.zzbk(zzd, inputStream);
            }

            public static zzg zzm(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
                return (zzg) zzgyx.zzbl(zzd, inputStream, zzgyhVar);
            }

            public static zzg zzn(zzgxp zzgxpVar) throws zzgzm {
                return (zzg) zzgyx.zzbm(zzd, zzgxpVar);
            }

            public static zzg zzo(zzgxv zzgxvVar) throws IOException {
                return (zzg) zzgyx.zzbn(zzd, zzgxvVar);
            }

            public static zzg zzp(InputStream inputStream) throws IOException {
                return (zzg) zzgyx.zzbo(zzd, inputStream);
            }

            public static zzg zzq(ByteBuffer byteBuffer) throws zzgzm {
                return (zzg) zzgyx.zzbp(zzd, byteBuffer);
            }

            public static zzg zzr(byte[] bArr) throws zzgzm {
                return (zzg) zzgyx.zzbq(zzd, bArr);
            }

            public static zzg zzs(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
                return (zzg) zzgyx.zzbr(zzd, zzgxpVar, zzgyhVar);
            }

            public static zzg zzt(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
                return (zzg) zzgyx.zzbs(zzd, zzgxvVar, zzgyhVar);
            }

            public static zzg zzu(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
                return (zzg) zzgyx.zzbu(zzd, inputStream, zzgyhVar);
            }

            public static zzg zzv(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
                return (zzg) zzgyx.zzbv(zzd, byteBuffer, zzgyhVar);
            }

            public static zzg zzw(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
                return (zzg) zzgyx.zzbx(zzd, bArr, zzgyhVar);
            }

            public static zzhaq<zzg> zzx() {
                return zzd.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
            public int zza() {
                return this.zzi;
            }

            @Override // com.google.android.gms.internal.ads.zzgyx
            public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
                switch (zzgywVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return zzgyx.zzbS(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                    case 3:
                        return new zzg();
                    case 4:
                        return new zza();
                    case 5:
                        return zzd;
                    case 6:
                        zzhaq<zzg> zzhaqVar = zze;
                        if (zzhaqVar == null) {
                            synchronized (zzg.class) {
                                zzhaqVar = zze;
                                if (zzhaqVar == null) {
                                    zzhaqVar = new zzgys(zzd);
                                    zze = zzhaqVar;
                                }
                            }
                        }
                        return zzhaqVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
            public boolean zzh() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
            public boolean zzi() {
                return this.zzh;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
            public boolean zzj() {
                return (this.zzf & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
            public boolean zzk() {
                return (this.zzf & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzb.zzh
            public boolean zzl() {
                return (this.zzf & 4) != 0;
            }
        }

        /* loaded from: classes3.dex */
        public interface zzh extends zzhaj {
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
            zzgyx.zzcb(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(Iterable<? extends zza> iterable) {
            zzH();
            zzgwy.zzaQ(iterable, this.zzd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zza zzaVar) {
            zzaVar.getClass();
            zzH();
            this.zzd.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF(int i10, zza zzaVar) {
            zzaVar.getClass();
            zzH();
            this.zzd.add(i10, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzd = zzgyx.zzbK();
        }

        private void zzH() {
            zzgzj<zza> zzgzjVar = this.zzd;
            if (!zzgzjVar.zzc()) {
                this.zzd = zzgyx.zzbL(zzgzjVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i10) {
            zzH();
            this.zzd.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(int i10, zza zzaVar) {
            zzaVar.getClass();
            zzH();
            this.zzd.set(i10, zzaVar);
        }

        public static zzc zzd() {
            return zzb.zzaZ();
        }

        public static zzc zzf(zzb zzbVar) {
            return zzb.zzba(zzbVar);
        }

        public static zzb zzh() {
            return zzb;
        }

        public static zzb zzi(InputStream inputStream) throws IOException {
            return (zzb) zzgyx.zzbk(zzb, inputStream);
        }

        public static zzb zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzb) zzgyx.zzbl(zzb, inputStream, zzgyhVar);
        }

        public static zzb zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zzb) zzgyx.zzbm(zzb, zzgxpVar);
        }

        public static zzb zzm(zzgxv zzgxvVar) throws IOException {
            return (zzb) zzgyx.zzbn(zzb, zzgxvVar);
        }

        public static zzb zzn(InputStream inputStream) throws IOException {
            return (zzb) zzgyx.zzbo(zzb, inputStream);
        }

        public static zzb zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzb) zzgyx.zzbp(zzb, byteBuffer);
        }

        public static zzb zzp(byte[] bArr) throws zzgzm {
            return (zzb) zzgyx.zzbq(zzb, bArr);
        }

        public static zzb zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzb) zzgyx.zzbr(zzb, zzgxpVar, zzgyhVar);
        }

        public static zzb zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzb) zzgyx.zzbs(zzb, zzgxvVar, zzgyhVar);
        }

        public static zzb zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzb) zzgyx.zzbu(zzb, inputStream, zzgyhVar);
        }

        public static zzb zzt(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzb) zzgyx.zzbv(zzb, byteBuffer, zzgyhVar);
        }

        public static zzb zzu(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzb) zzgyx.zzbx(zzb, bArr, zzgyhVar);
        }

        public static zzhaq<zzb> zzv() {
            return zzb.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzc
        public int zza() {
            return this.zzd.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzc
        public zza zzb(int i10) {
            return this.zzd.get(i10);
        }

        public InterfaceC0145zzb zzc(int i10) {
            return this.zzd.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zza.class});
                case 3:
                    return new zzb();
                case 4:
                    return new zzc();
                case 5:
                    return zzb;
                case 6:
                    zzhaq<zzb> zzhaqVar = zzc;
                    if (zzhaqVar == null) {
                        synchronized (zzb.class) {
                            zzhaqVar = zzc;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzb);
                                zzc = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzc
        public List<zza> zzl() {
            return this.zzd;
        }

        public List<? extends InterfaceC0145zzb> zzw() {
            return this.zzd;
        }
    }

    /* loaded from: classes3.dex */
    public final class zzba extends zzgyx<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzf;
        private static volatile zzhaq<zzba> zzg;
        private int zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private int zzk;
        private int zzl;
        private int zzm;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzba, zza> implements zzbb {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
            public int zza() {
                return ((zzba) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
            public int zzb() {
                return ((zzba) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
            public int zzc() {
                return ((zzba) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
            public zzq zzd() {
                return ((zzba) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
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

            public zza zzo(int i10) {
                zzbu();
                ((zzba) this.zza).zzU(i10);
                return this;
            }

            public zza zzp(int i10) {
                zzbu();
                ((zzba) this.zza).zzV(i10);
                return this;
            }

            public zza zzq(int i10) {
                zzbu();
                ((zzba) this.zza).zzW(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
            public boolean zzr() {
                return ((zzba) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
            public boolean zzs() {
                return ((zzba) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
            public boolean zzt() {
                return ((zzba) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
            public boolean zzu() {
                return ((zzba) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
            public boolean zzv() {
                return ((zzba) this.zza).zzv();
            }

            private zza() {
                super(zzba.zzf);
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzf = zzbaVar;
            zzgyx.zzcb(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        public static zzhaq<zzba> zzA() {
            return zzf.zzbN();
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
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
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
        public void zzU(int i10) {
            this.zzh |= 16;
            this.zzm = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(int i10) {
            this.zzh |= 4;
            this.zzk = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(int i10) {
            this.zzh |= 8;
            this.zzl = i10;
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
            return (zzba) zzgyx.zzbk(zzf, inputStream);
        }

        public static zzba zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzba) zzgyx.zzbl(zzf, inputStream, zzgyhVar);
        }

        public static zzba zzl(zzgxp zzgxpVar) throws zzgzm {
            return (zzba) zzgyx.zzbm(zzf, zzgxpVar);
        }

        public static zzba zzm(zzgxv zzgxvVar) throws IOException {
            return (zzba) zzgyx.zzbn(zzf, zzgxvVar);
        }

        public static zzba zzn(InputStream inputStream) throws IOException {
            return (zzba) zzgyx.zzbo(zzf, inputStream);
        }

        public static zzba zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzba) zzgyx.zzbp(zzf, byteBuffer);
        }

        public static zzba zzp(byte[] bArr) throws zzgzm {
            return (zzba) zzgyx.zzbq(zzf, bArr);
        }

        public static zzba zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzba) zzgyx.zzbr(zzf, zzgxpVar, zzgyhVar);
        }

        public static zzba zzw(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzba) zzgyx.zzbs(zzf, zzgxvVar, zzgyhVar);
        }

        public static zzba zzx(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzba) zzgyx.zzbu(zzf, inputStream, zzgyhVar);
        }

        public static zzba zzy(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzba) zzgyx.zzbv(zzf, byteBuffer, zzgyhVar);
        }

        public static zzba zzz(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzba) zzgyx.zzbx(zzf, bArr, zzgyhVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public int zza() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public int zzb() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public int zzc() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public zzq zzd() {
            zzq zzb2 = zzq.zzb(this.zzi);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", zzq.zze(), "zzj", "zzk", "zzl", "zzm"});
                case 3:
                    return new zzba();
                case 4:
                    return new zza();
                case 5:
                    return zzf;
                case 6:
                    zzhaq<zzba> zzhaqVar = zzg;
                    if (zzhaqVar == null) {
                        synchronized (zzba.class) {
                            zzhaqVar = zzg;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzf);
                                zzg = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public zzaw zze() {
            zzaw zzawVar = this.zzj;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public boolean zzr() {
            return (this.zzh & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public boolean zzs() {
            return (this.zzh & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public boolean zzt() {
            return (this.zzh & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public boolean zzu() {
            return (this.zzh & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbb
        public boolean zzv() {
            return (this.zzh & 8) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzbb extends zzhaj {
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

    /* loaded from: classes3.dex */
    public final class zzbc extends zzgyx<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzd;
        private static volatile zzhaq<zzbc> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzbc, zza> implements zzbd {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
            public zzq zza() {
                return ((zzbc) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
            public zzap zzb() {
                return ((zzbc) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
            public zzaw zzc() {
                return ((zzbc) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbc) this.zza).zzG();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbc) this.zza).zzH();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbc) this.zza).zzI();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzJ(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzM(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbc) this.zza).zzN(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
            public boolean zzn() {
                return ((zzbc) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
            public boolean zzo() {
                return ((zzbc) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
            public boolean zzp() {
                return ((zzbc) this.zza).zzp();
            }

            private zza() {
                super(zzbc.zzd);
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzd = zzbcVar;
            zzgyx.zzcb(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zzf(zzbc zzbcVar) {
            return zzd.zzba(zzbcVar);
        }

        public static zzbc zzh() {
            return zzd;
        }

        public static zzbc zzi(InputStream inputStream) throws IOException {
            return (zzbc) zzgyx.zzbk(zzd, inputStream);
        }

        public static zzbc zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbc) zzgyx.zzbl(zzd, inputStream, zzgyhVar);
        }

        public static zzbc zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zzbc) zzgyx.zzbm(zzd, zzgxpVar);
        }

        public static zzbc zzl(zzgxv zzgxvVar) throws IOException {
            return (zzbc) zzgyx.zzbn(zzd, zzgxvVar);
        }

        public static zzbc zzm(InputStream inputStream) throws IOException {
            return (zzbc) zzgyx.zzbo(zzd, inputStream);
        }

        public static zzbc zzq(ByteBuffer byteBuffer) throws zzgzm {
            return (zzbc) zzgyx.zzbp(zzd, byteBuffer);
        }

        public static zzbc zzr(byte[] bArr) throws zzgzm {
            return (zzbc) zzgyx.zzbq(zzd, bArr);
        }

        public static zzbc zzs(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzbc) zzgyx.zzbr(zzd, zzgxpVar, zzgyhVar);
        }

        public static zzbc zzt(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzbc) zzgyx.zzbs(zzd, zzgxvVar, zzgyhVar);
        }

        public static zzbc zzu(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbc) zzgyx.zzbu(zzd, inputStream, zzgyhVar);
        }

        public static zzbc zzv(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzbc) zzgyx.zzbv(zzd, byteBuffer, zzgyhVar);
        }

        public static zzbc zzw(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzbc) zzgyx.zzbx(zzd, bArr, zzgyhVar);
        }

        public static zzhaq<zzbc> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
                case 3:
                    return new zzbc();
                case 4:
                    return new zza();
                case 5:
                    return zzd;
                case 6:
                    zzhaq<zzbc> zzhaqVar = zze;
                    if (zzhaqVar == null) {
                        synchronized (zzbc.class) {
                            zzhaqVar = zze;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzd);
                                zze = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
        public boolean zzn() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbd
        public boolean zzp() {
            return (this.zzf & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzbd extends zzhaj {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* loaded from: classes3.dex */
    public final class zzbe extends zzgyx<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzg;
        private static volatile zzhaq<zzbe> zzh;
        private int zzi;
        private int zzj = 1000;
        private zzaw zzk;
        private int zzl;
        private int zzm;
        private int zzn;
        private long zzo;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzbe, zza> implements zzbf {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public int zza() {
                return ((zzbe) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public int zzb() {
                return ((zzbe) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public int zzc() {
                return ((zzbe) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public long zzd() {
                return ((zzbe) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public zzq zze() {
                return ((zzbe) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
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

            public zza zzn(long j3) {
                zzbu();
                ((zzbe) this.zza).zzX(j3);
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

            public zza zzr(int i10) {
                zzbu();
                ((zzbe) this.zza).zzaa(i10);
                return this;
            }

            public zza zzs(int i10) {
                zzbu();
                ((zzbe) this.zza).zzab(i10);
                return this;
            }

            public zza zzt(int i10) {
                zzbu();
                ((zzbe) this.zza).zzac(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public boolean zzu() {
                return ((zzbe) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public boolean zzv() {
                return ((zzbe) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public boolean zzw() {
                return ((zzbe) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public boolean zzx() {
                return ((zzbe) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public boolean zzy() {
                return ((zzbe) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
            public boolean zzz() {
                return ((zzbe) this.zza).zzz();
            }

            private zza() {
                super(zzbe.zzg);
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzg = zzbeVar;
            zzgyx.zzcb(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        public static zzbe zzA(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzbe) zzgyx.zzbv(zzg, byteBuffer, zzgyhVar);
        }

        public static zzbe zzB(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzbe) zzgyx.zzbx(zzg, bArr, zzgyhVar);
        }

        public static zzhaq<zzbe> zzC() {
            return zzg.zzbN();
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
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(long j3) {
            this.zzi |= 32;
            this.zzo = j3;
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
        public void zzaa(int i10) {
            this.zzi |= 16;
            this.zzn = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(int i10) {
            this.zzi |= 4;
            this.zzl = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(int i10) {
            this.zzi |= 8;
            this.zzm = i10;
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
            return (zzbe) zzgyx.zzbk(zzg, inputStream);
        }

        public static zzbe zzl(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbe) zzgyx.zzbl(zzg, inputStream, zzgyhVar);
        }

        public static zzbe zzm(zzgxp zzgxpVar) throws zzgzm {
            return (zzbe) zzgyx.zzbm(zzg, zzgxpVar);
        }

        public static zzbe zzn(zzgxv zzgxvVar) throws IOException {
            return (zzbe) zzgyx.zzbn(zzg, zzgxvVar);
        }

        public static zzbe zzo(InputStream inputStream) throws IOException {
            return (zzbe) zzgyx.zzbo(zzg, inputStream);
        }

        public static zzbe zzp(ByteBuffer byteBuffer) throws zzgzm {
            return (zzbe) zzgyx.zzbp(zzg, byteBuffer);
        }

        public static zzbe zzq(byte[] bArr) throws zzgzm {
            return (zzbe) zzgyx.zzbq(zzg, bArr);
        }

        public static zzbe zzr(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzbe) zzgyx.zzbr(zzg, zzgxpVar, zzgyhVar);
        }

        public static zzbe zzs(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzbe) zzgyx.zzbs(zzg, zzgxvVar, zzgyhVar);
        }

        public static zzbe zzt(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbe) zzgyx.zzbu(zzg, inputStream, zzgyhVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public int zza() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public int zzb() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public int zzc() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public long zzd() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", zzq.zze(), "zzk", "zzl", "zzm", "zzn", "zzo"});
                case 3:
                    return new zzbe();
                case 4:
                    return new zza();
                case 5:
                    return zzg;
                case 6:
                    zzhaq<zzbe> zzhaqVar = zzh;
                    if (zzhaqVar == null) {
                        synchronized (zzbe.class) {
                            zzhaqVar = zzh;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzg);
                                zzh = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public zzq zze() {
            zzq zzb2 = zzq.zzb(this.zzj);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public zzaw zzf() {
            zzaw zzawVar = this.zzk;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public boolean zzu() {
            return (this.zzi & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public boolean zzv() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public boolean zzw() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public boolean zzx() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public boolean zzy() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbf
        public boolean zzz() {
            return (this.zzi & 8) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzbf extends zzhaj {
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

    /* loaded from: classes3.dex */
    public final class zzbg extends zzgyx<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzd;
        private static volatile zzhaq<zzbg> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzbg, zza> implements zzbh {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
            public zzq zza() {
                return ((zzbg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
            public zzap zzb() {
                return ((zzbg) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
            public zzaw zzc() {
                return ((zzbg) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbg) this.zza).zzG();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbg) this.zza).zzH();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbg) this.zza).zzI();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzJ(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzM(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbg) this.zza).zzN(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
            public boolean zzn() {
                return ((zzbg) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
            public boolean zzo() {
                return ((zzbg) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
            public boolean zzp() {
                return ((zzbg) this.zza).zzp();
            }

            private zza() {
                super(zzbg.zzd);
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzd = zzbgVar;
            zzgyx.zzcb(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zzf(zzbg zzbgVar) {
            return zzd.zzba(zzbgVar);
        }

        public static zzbg zzh() {
            return zzd;
        }

        public static zzbg zzi(InputStream inputStream) throws IOException {
            return (zzbg) zzgyx.zzbk(zzd, inputStream);
        }

        public static zzbg zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbg) zzgyx.zzbl(zzd, inputStream, zzgyhVar);
        }

        public static zzbg zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zzbg) zzgyx.zzbm(zzd, zzgxpVar);
        }

        public static zzbg zzl(zzgxv zzgxvVar) throws IOException {
            return (zzbg) zzgyx.zzbn(zzd, zzgxvVar);
        }

        public static zzbg zzm(InputStream inputStream) throws IOException {
            return (zzbg) zzgyx.zzbo(zzd, inputStream);
        }

        public static zzbg zzq(ByteBuffer byteBuffer) throws zzgzm {
            return (zzbg) zzgyx.zzbp(zzd, byteBuffer);
        }

        public static zzbg zzr(byte[] bArr) throws zzgzm {
            return (zzbg) zzgyx.zzbq(zzd, bArr);
        }

        public static zzbg zzs(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzbg) zzgyx.zzbr(zzd, zzgxpVar, zzgyhVar);
        }

        public static zzbg zzt(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzbg) zzgyx.zzbs(zzd, zzgxvVar, zzgyhVar);
        }

        public static zzbg zzu(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbg) zzgyx.zzbu(zzd, inputStream, zzgyhVar);
        }

        public static zzbg zzv(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzbg) zzgyx.zzbv(zzd, byteBuffer, zzgyhVar);
        }

        public static zzbg zzw(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzbg) zzgyx.zzbx(zzd, bArr, zzgyhVar);
        }

        public static zzhaq<zzbg> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
                case 3:
                    return new zzbg();
                case 4:
                    return new zza();
                case 5:
                    return zzd;
                case 6:
                    zzhaq<zzbg> zzhaqVar = zze;
                    if (zzhaqVar == null) {
                        synchronized (zzbg.class) {
                            zzhaqVar = zze;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzd);
                                zze = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
        public boolean zzn() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbh
        public boolean zzp() {
            return (this.zzf & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzbh extends zzhaj {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* loaded from: classes3.dex */
    public interface zzbi extends zzhaj {
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

    /* loaded from: classes3.dex */
    public final class zzbj extends zzgyx<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzc;
        private static volatile zzhaq<zzbj> zzd;
        private int zze;
        private int zzf = 1000;
        private zzaw zzg;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzbj, zza> implements zzbk {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzbk
            public zzq zza() {
                return ((zzbj) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbk
            public zzaw zzb() {
                return ((zzbj) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzbj) this.zza).zzB();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzbj) this.zza).zzC();
                return this;
            }

            public zza zze(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzD(zzawVar);
                return this;
            }

            public zza zzf(zzaw.zza zzaVar) {
                zzbu();
                ((zzbj) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzE(zzawVar);
                return this;
            }

            public zza zzh(zzq zzqVar) {
                zzbu();
                ((zzbj) this.zza).zzF(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbk
            public boolean zzi() {
                return ((zzbj) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbk
            public boolean zzj() {
                return ((zzbj) this.zza).zzj();
            }

            private zza() {
                super(zzbj.zzc);
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzc = zzbjVar;
            zzgyx.zzcb(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC() {
            this.zze &= -2;
            this.zzf = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzg;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzg = zzawVar;
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

        public static zza zzd(zzbj zzbjVar) {
            return zzc.zzba(zzbjVar);
        }

        public static zzbj zzg() {
            return zzc;
        }

        public static zzbj zzh(InputStream inputStream) throws IOException {
            return (zzbj) zzgyx.zzbk(zzc, inputStream);
        }

        public static zzbj zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbj) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
        }

        public static zzbj zzl(zzgxp zzgxpVar) throws zzgzm {
            return (zzbj) zzgyx.zzbm(zzc, zzgxpVar);
        }

        public static zzbj zzm(zzgxv zzgxvVar) throws IOException {
            return (zzbj) zzgyx.zzbn(zzc, zzgxvVar);
        }

        public static zzbj zzn(InputStream inputStream) throws IOException {
            return (zzbj) zzgyx.zzbo(zzc, inputStream);
        }

        public static zzbj zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzbj) zzgyx.zzbp(zzc, byteBuffer);
        }

        public static zzbj zzp(byte[] bArr) throws zzgzm {
            return (zzbj) zzgyx.zzbq(zzc, bArr);
        }

        public static zzbj zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzbj) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
        }

        public static zzbj zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzbj) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
        }

        public static zzbj zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbj) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
        }

        public static zzbj zzt(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzbj) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
        }

        public static zzbj zzu(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzbj) zzgyx.zzbx(zzc, bArr, zzgyhVar);
        }

        public static zzhaq<zzbj> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbk
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzf);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbk
        public zzaw zzb() {
            zzaw zzawVar = this.zzg;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
                case 3:
                    return new zzbj();
                case 4:
                    return new zza();
                case 5:
                    return zzc;
                case 6:
                    zzhaq<zzbj> zzhaqVar = zzd;
                    if (zzhaqVar == null) {
                        synchronized (zzbj.class) {
                            zzhaqVar = zzd;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzc);
                                zzd = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbk
        public boolean zzi() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbk
        public boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzbk extends zzhaj {
        zzq zza();

        zzaw zzb();

        boolean zzi();

        boolean zzj();
    }

    /* loaded from: classes3.dex */
    public final class zzbl extends zzgyx<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzc;
        private static volatile zzhaq<zzbl> zzd;
        private int zze;
        private boolean zzf;
        private int zzg;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzbl, zza> implements zzbm {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzbm
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

            public zza zzd(boolean z10) {
                zzbu();
                ((zzbl) this.zza).zzC(z10);
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzbl) this.zza).zzD(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbm
            public boolean zzf() {
                return ((zzbl) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbm
            public boolean zzg() {
                return ((zzbl) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzbm
            public boolean zzh() {
                return ((zzbl) this.zza).zzh();
            }

            private zza() {
                super(zzbl.zzc);
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzc = zzblVar;
            zzgyx.zzcb(zzbl.class, zzblVar);
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
        public void zzC(boolean z10) {
            this.zze |= 1;
            this.zzf = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i10) {
            this.zze |= 2;
            this.zzg = i10;
        }

        public static zza zzb() {
            return zzc.zzaZ();
        }

        public static zza zzc(zzbl zzblVar) {
            return zzc.zzba(zzblVar);
        }

        public static zzbl zzi() {
            return zzc;
        }

        public static zzbl zzj(InputStream inputStream) throws IOException {
            return (zzbl) zzgyx.zzbk(zzc, inputStream);
        }

        public static zzbl zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbl) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
        }

        public static zzbl zzl(zzgxp zzgxpVar) throws zzgzm {
            return (zzbl) zzgyx.zzbm(zzc, zzgxpVar);
        }

        public static zzbl zzm(zzgxv zzgxvVar) throws IOException {
            return (zzbl) zzgyx.zzbn(zzc, zzgxvVar);
        }

        public static zzbl zzn(InputStream inputStream) throws IOException {
            return (zzbl) zzgyx.zzbo(zzc, inputStream);
        }

        public static zzbl zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzbl) zzgyx.zzbp(zzc, byteBuffer);
        }

        public static zzbl zzp(byte[] bArr) throws zzgzm {
            return (zzbl) zzgyx.zzbq(zzc, bArr);
        }

        public static zzbl zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzbl) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
        }

        public static zzbl zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzbl) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
        }

        public static zzbl zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzbl) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
        }

        public static zzbl zzt(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzbl) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
        }

        public static zzbl zzu(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzbl) zzgyx.zzbx(zzc, bArr, zzgyhVar);
        }

        public static zzhaq<zzbl> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbm
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 3:
                    return new zzbl();
                case 4:
                    return new zza();
                case 5:
                    return zzc;
                case 6:
                    zzhaq<zzbl> zzhaqVar = zzd;
                    if (zzhaqVar == null) {
                        synchronized (zzbl.class) {
                            zzhaqVar = zzd;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzc);
                                zzd = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbm
        public boolean zzf() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbm
        public boolean zzg() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzbm
        public boolean zzh() {
            return (this.zze & 2) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzbm extends zzhaj {
        int zza();

        boolean zzf();

        boolean zzg();

        boolean zzh();
    }

    /* loaded from: classes3.dex */
    public interface zzc extends zzhaj {
        int zza();

        zzb.zza zzb(int i10);

        List<zzb.zza> zzl();
    }

    /* loaded from: classes3.dex */
    public final class zzd extends zzgyx<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzc;
        private static volatile zzhaq<zzd> zzd;
        private int zze;
        private int zzf;
        private zzal zzg;

        /* loaded from: classes3.dex */
        public enum zza implements zzgzb {
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
            private static final zzgzc<zza> zzw = new zzgzc<zza>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzd.zza.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zza zzb(int i10) {
                    return zza.zzb(i10);
                }
            };
            private final int zzy;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.android.gms.internal.ads.zzbbs$zzd$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public final class C0146zza implements zzgzd {
                static final zzgzd zza = new C0146zza();

                private C0146zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzd
                public boolean zza(int i10) {
                    return zza.zzb(i10) != null;
                }
            }

            zza(int i10) {
                this.zzy = i10;
            }

            public static zza zzb(int i10) {
                switch (i10) {
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

            public static zzgzc<zza> zzd() {
                return zzw;
            }

            public static zzgzd zze() {
                return C0146zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgzb
            public final int zza() {
                return this.zzy;
            }
        }

        /* loaded from: classes3.dex */
        public final class zzb extends zzgyr<zzd, zzb> implements zze {
            @Override // com.google.android.gms.internal.ads.zzbbs.zze
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

            @Override // com.google.android.gms.internal.ads.zzbbs.zze
            public zzal zzh() {
                return ((zzd) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zze
            public boolean zzi() {
                return ((zzd) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zze
            public boolean zzj() {
                return ((zzd) this.zza).zzj();
            }

            private zzb() {
                super(zzd.zzc);
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzgyx.zzcb(zzd.class, zzdVar);
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
            if (zzalVar2 != null && zzalVar2 != zzal.zzi()) {
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

        public static zzb zzb() {
            return zzc.zzaZ();
        }

        public static zzb zzc(zzd zzdVar) {
            return zzc.zzba(zzdVar);
        }

        public static zzd zzf() {
            return zzc;
        }

        public static zzd zzg(InputStream inputStream) throws IOException {
            return (zzd) zzgyx.zzbk(zzc, inputStream);
        }

        public static zzd zzk(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzd) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
        }

        public static zzd zzl(zzgxp zzgxpVar) throws zzgzm {
            return (zzd) zzgyx.zzbm(zzc, zzgxpVar);
        }

        public static zzd zzm(zzgxv zzgxvVar) throws IOException {
            return (zzd) zzgyx.zzbn(zzc, zzgxvVar);
        }

        public static zzd zzn(InputStream inputStream) throws IOException {
            return (zzd) zzgyx.zzbo(zzc, inputStream);
        }

        public static zzd zzo(ByteBuffer byteBuffer) throws zzgzm {
            return (zzd) zzgyx.zzbp(zzc, byteBuffer);
        }

        public static zzd zzp(byte[] bArr) throws zzgzm {
            return (zzd) zzgyx.zzbq(zzc, bArr);
        }

        public static zzd zzq(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzd) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
        }

        public static zzd zzr(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzd) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
        }

        public static zzd zzs(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzd) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
        }

        public static zzd zzt(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzd) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
        }

        public static zzd zzu(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzd) zzgyx.zzbx(zzc, bArr, zzgyhVar);
        }

        public static zzhaq<zzd> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zze
        public zza zza() {
            zza zzb2 = zza.zzb(this.zzf);
            return zzb2 == null ? zza.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zza.zze(), "zzg"});
                case 3:
                    return new zzd();
                case 4:
                    return new zzb();
                case 5:
                    return zzc;
                case 6:
                    zzhaq<zzd> zzhaqVar = zzd;
                    if (zzhaqVar == null) {
                        synchronized (zzd.class) {
                            zzhaqVar = zzd;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzc);
                                zzd = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zze
        public zzal zzh() {
            zzal zzalVar = this.zzg;
            return zzalVar == null ? zzal.zzi() : zzalVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zze
        public boolean zzi() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zze
        public boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zze extends zzhaj {
        zzd.zza zza();

        zzal zzh();

        boolean zzi();

        boolean zzj();
    }

    /* loaded from: classes3.dex */
    public interface zzf extends zzhaj {
        int zza();

        zzd zzab(int i10);

        zzg zzac();

        zzi zzad();

        zzk zzae();

        zzq zzaf();

        zzx zzag();

        zzz zzah();

        zzac zzai();

        zzah zzaj();

        zzat zzak(int i10);

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

        zza.EnumC0141zza zzc();
    }

    /* loaded from: classes3.dex */
    public final class zzg extends zzgyx<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzd;
        private static volatile zzhaq<zzg> zze;
        private int zzf;
        private String zzg = "";
        private zzgzj<zzd> zzh = zzgyx.zzbK();
        private int zzi;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzg, zza> implements zzh {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzh
            public int zza() {
                return ((zzg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzh
            public zzd zzb(int i10) {
                return ((zzg) this.zza).zzb(i10);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzg) this.zza).zzN(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzO(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzO(zzdVar);
                return this;
            }

            public zza zzf(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzP(i10, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i10, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzP(i10, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzg) this.zza).zzQ();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzg) this.zza).zzR();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzg) this.zza).zzS();
                return this;
            }

            public zza zzk(int i10) {
                zzbu();
                ((zzg) this.zza).zzU(i10);
                return this;
            }

            public zza zzl(String str) {
                zzbu();
                ((zzg) this.zza).zzV(str);
                return this;
            }

            public zza zzm(zzgxp zzgxpVar) {
                zzbu();
                ((zzg) this.zza).zzW(zzgxpVar);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzg) this.zza).zzX(zzqVar);
                return this;
            }

            public zza zzo(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzY(i10, zzbVar.zzbr());
                return this;
            }

            public zza zzp(int i10, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzY(i10, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzh
            public zzq zzq() {
                return ((zzg) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzh
            public zzgxp zzr() {
                return ((zzg) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzh
            public String zzs() {
                return ((zzg) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzh
            public List<zzd> zzt() {
                return Collections.unmodifiableList(((zzg) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzh
            public boolean zzu() {
                return ((zzg) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzh
            public boolean zzv() {
                return ((zzg) this.zza).zzv();
            }

            private zza() {
                super(zzg.zzd);
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzd = zzgVar;
            zzgyx.zzcb(zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zzhaq<zzg> zzA() {
            return zzd.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(Iterable<? extends zzd> iterable) {
            zzT();
            zzgwy.zzaQ(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(zzd zzdVar) {
            zzdVar.getClass();
            zzT();
            this.zzh.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzT();
            this.zzh.add(i10, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzf &= -2;
            this.zzg = zzh().zzs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzf &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS() {
            this.zzh = zzgyx.zzbK();
        }

        private void zzT() {
            zzgzj<zzd> zzgzjVar = this.zzh;
            if (!zzgzjVar.zzc()) {
                this.zzh = zzgyx.zzbL(zzgzjVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(int i10) {
            zzT();
            this.zzh.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzgxp zzgxpVar) {
            this.zzg = zzgxpVar.zzx();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzT();
            this.zzh.set(i10, zzdVar);
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zzf(zzg zzgVar) {
            return zzd.zzba(zzgVar);
        }

        public static zzg zzh() {
            return zzd;
        }

        public static zzg zzi(InputStream inputStream) throws IOException {
            return (zzg) zzgyx.zzbk(zzd, inputStream);
        }

        public static zzg zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzg) zzgyx.zzbl(zzd, inputStream, zzgyhVar);
        }

        public static zzg zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zzg) zzgyx.zzbm(zzd, zzgxpVar);
        }

        public static zzg zzl(zzgxv zzgxvVar) throws IOException {
            return (zzg) zzgyx.zzbn(zzd, zzgxvVar);
        }

        public static zzg zzm(InputStream inputStream) throws IOException {
            return (zzg) zzgyx.zzbo(zzd, inputStream);
        }

        public static zzg zzn(ByteBuffer byteBuffer) throws zzgzm {
            return (zzg) zzgyx.zzbp(zzd, byteBuffer);
        }

        public static zzg zzo(byte[] bArr) throws zzgzm {
            return (zzg) zzgyx.zzbq(zzd, bArr);
        }

        public static zzg zzp(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzg) zzgyx.zzbr(zzd, zzgxpVar, zzgyhVar);
        }

        public static zzg zzw(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzg) zzgyx.zzbs(zzd, zzgxvVar, zzgyhVar);
        }

        public static zzg zzx(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzg) zzgyx.zzbu(zzd, inputStream, zzgyhVar);
        }

        public static zzg zzy(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzg) zzgyx.zzbv(zzd, byteBuffer, zzgyhVar);
        }

        public static zzg zzz(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzg) zzgyx.zzbx(zzd, bArr, zzgyhVar);
        }

        public List<? extends zze> zzB() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzh
        public int zza() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzh
        public zzd zzb(int i10) {
            return this.zzh.get(i10);
        }

        public zze zzc(int i10) {
            return this.zzh.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzq.zze()});
                case 3:
                    return new zzg();
                case 4:
                    return new zza();
                case 5:
                    return zzd;
                case 6:
                    zzhaq<zzg> zzhaqVar = zze;
                    if (zzhaqVar == null) {
                        synchronized (zzg.class) {
                            zzhaqVar = zze;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzd);
                                zze = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzh
        public zzq zzq() {
            zzq zzb2 = zzq.zzb(this.zzi);
            return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzh
        public zzgxp zzr() {
            return zzgxp.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzh
        public String zzs() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzh
        public List<zzd> zzt() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzh
        public boolean zzu() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzh
        public boolean zzv() {
            return (this.zzf & 2) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzh extends zzhaj {
        int zza();

        zzd zzb(int i10);

        zzq zzq();

        zzgxp zzr();

        String zzs();

        List<zzd> zzt();

        boolean zzu();

        boolean zzv();
    }

    /* loaded from: classes3.dex */
    public final class zzi extends zzgyx<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzf;
        private static volatile zzhaq<zzi> zzg;
        private int zzh;
        private String zzi = "";
        private zzgzj<zzd> zzj = zzgyx.zzbK();
        private int zzk = 1000;
        private int zzl = 1000;
        private int zzm = 1000;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzi, zza> implements zzj {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public boolean zzA() {
                return ((zzi) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public boolean zzB() {
                return ((zzi) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public boolean zzC() {
                return ((zzi) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public boolean zzD() {
                return ((zzi) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public int zza() {
                return ((zzi) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public zzd zzb(int i10) {
                return ((zzi) this.zza).zzb(i10);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzi) this.zza).zzV(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzW(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzW(zzdVar);
                return this;
            }

            public zza zzf(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzX(i10, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i10, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzX(i10, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzi) this.zza).zzY();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzi) this.zza).zzZ();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzi) this.zza).zzaa();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzi) this.zza).zzab();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzi) this.zza).zzac();
                return this;
            }

            public zza zzm(int i10) {
                zzbu();
                ((zzi) this.zza).zzae(i10);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzaf(zzqVar);
                return this;
            }

            public zza zzo(String str) {
                zzbu();
                ((zzi) this.zza).zzag(str);
                return this;
            }

            public zza zzp(zzgxp zzgxpVar) {
                zzbu();
                ((zzi) this.zza).zzah(zzgxpVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzai(zzqVar);
                return this;
            }

            public zza zzr(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzaj(zzqVar);
                return this;
            }

            public zza zzs(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzak(i10, zzbVar.zzbr());
                return this;
            }

            public zza zzt(int i10, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzak(i10, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public zzq zzu() {
                return ((zzi) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public zzq zzv() {
                return ((zzi) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public zzq zzw() {
                return ((zzi) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public zzgxp zzx() {
                return ((zzi) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public String zzy() {
                return ((zzi) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzj
            public List<zzd> zzz() {
                return Collections.unmodifiableList(((zzi) this.zza).zzz());
            }

            private zza() {
                super(zzi.zzf);
            }
        }

        static {
            zzi zziVar = new zzi();
            zzf = zziVar;
            zzgyx.zzcb(zzi.class, zziVar);
        }

        private zzi() {
        }

        public static zzhaq<zzi> zzE() {
            return zzf.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(Iterable<? extends zzd> iterable) {
            zzad();
            zzgwy.zzaQ(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzd zzdVar) {
            zzdVar.getClass();
            zzad();
            this.zzj.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzad();
            this.zzj.add(i10, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY() {
            this.zzh &= -9;
            this.zzm = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ() {
            this.zzh &= -2;
            this.zzi = zzh().zzy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa() {
            this.zzh &= -5;
            this.zzl = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab() {
            this.zzh &= -3;
            this.zzk = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac() {
            this.zzj = zzgyx.zzbK();
        }

        private void zzad() {
            zzgzj<zzd> zzgzjVar = this.zzj;
            if (!zzgzjVar.zzc()) {
                this.zzj = zzgyx.zzbL(zzgzjVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae(int i10) {
            zzad();
            this.zzj.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf(zzq zzqVar) {
            this.zzm = zzqVar.zza();
            this.zzh |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag(String str) {
            str.getClass();
            this.zzh |= 1;
            this.zzi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah(zzgxp zzgxpVar) {
            this.zzi = zzgxpVar.zzx();
            this.zzh |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai(zzq zzqVar) {
            this.zzl = zzqVar.zza();
            this.zzh |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zzq zzqVar) {
            this.zzk = zzqVar.zza();
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzad();
            this.zzj.set(i10, zzdVar);
        }

        public static zza zzd() {
            return zzf.zzaZ();
        }

        public static zza zzf(zzi zziVar) {
            return zzf.zzba(zziVar);
        }

        public static zzi zzh() {
            return zzf;
        }

        public static zzi zzi(InputStream inputStream) throws IOException {
            return (zzi) zzgyx.zzbk(zzf, inputStream);
        }

        public static zzi zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzi) zzgyx.zzbl(zzf, inputStream, zzgyhVar);
        }

        public static zzi zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zzi) zzgyx.zzbm(zzf, zzgxpVar);
        }

        public static zzi zzl(zzgxv zzgxvVar) throws IOException {
            return (zzi) zzgyx.zzbn(zzf, zzgxvVar);
        }

        public static zzi zzm(InputStream inputStream) throws IOException {
            return (zzi) zzgyx.zzbo(zzf, inputStream);
        }

        public static zzi zzn(ByteBuffer byteBuffer) throws zzgzm {
            return (zzi) zzgyx.zzbp(zzf, byteBuffer);
        }

        public static zzi zzo(byte[] bArr) throws zzgzm {
            return (zzi) zzgyx.zzbq(zzf, bArr);
        }

        public static zzi zzp(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzi) zzgyx.zzbr(zzf, zzgxpVar, zzgyhVar);
        }

        public static zzi zzq(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzi) zzgyx.zzbs(zzf, zzgxvVar, zzgyhVar);
        }

        public static zzi zzr(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzi) zzgyx.zzbu(zzf, inputStream, zzgyhVar);
        }

        public static zzi zzs(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzi) zzgyx.zzbv(zzf, byteBuffer, zzgyhVar);
        }

        public static zzi zzt(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzi) zzgyx.zzbx(zzf, bArr, zzgyhVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public boolean zzA() {
            return (this.zzh & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public boolean zzB() {
            return (this.zzh & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public boolean zzC() {
            return (this.zzh & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public boolean zzD() {
            return (this.zzh & 2) != 0;
        }

        public List<? extends zze> zzF() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public int zza() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public zzd zzb(int i10) {
            return this.zzj.get(i10);
        }

        public zze zzc(int i10) {
            return this.zzj.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", zzd.class, "zzk", zzq.zze(), "zzl", zzq.zze(), "zzm", zzq.zze()});
                case 3:
                    return new zzi();
                case 4:
                    return new zza();
                case 5:
                    return zzf;
                case 6:
                    zzhaq<zzi> zzhaqVar = zzg;
                    if (zzhaqVar == null) {
                        synchronized (zzi.class) {
                            zzhaqVar = zzg;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzf);
                                zzg = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public zzq zzu() {
            zzq zzb2 = zzq.zzb(this.zzm);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public zzq zzv() {
            zzq zzb2 = zzq.zzb(this.zzl);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public zzq zzw() {
            zzq zzb2 = zzq.zzb(this.zzk);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public zzgxp zzx() {
            return zzgxp.zzw(this.zzi);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public String zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzj
        public List<zzd> zzz() {
            return this.zzj;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzj extends zzhaj {
        boolean zzA();

        boolean zzB();

        boolean zzC();

        boolean zzD();

        int zza();

        zzd zzb(int i10);

        zzq zzu();

        zzq zzv();

        zzq zzw();

        zzgxp zzx();

        String zzy();

        List<zzd> zzz();
    }

    /* loaded from: classes3.dex */
    public final class zzk extends zzgyx<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzg;
        private static volatile zzhaq<zzk> zzh;
        private int zzi;
        private int zzj;
        private zzap zzk;
        private zzap zzl;
        private zzap zzm;
        private zzgzj<zzap> zzn = zzgyx.zzbK();
        private int zzo;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzk, zza> implements zzl {
            public zza zzA(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzas(zzapVar);
                return this;
            }

            public zza zzB(int i10) {
                zzbu();
                ((zzk) this.zza).zzat(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public zzap zzC() {
                return ((zzk) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public zzap zzD() {
                return ((zzk) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public zzap zzE(int i10) {
                return ((zzk) this.zza).zzE(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public zzap zzF() {
                return ((zzk) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public List<zzap> zzG() {
                return Collections.unmodifiableList(((zzk) this.zza).zzG());
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public boolean zzH() {
                return ((zzk) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public boolean zzI() {
                return ((zzk) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public boolean zzJ() {
                return ((zzk) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public boolean zzK() {
                return ((zzk) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public boolean zzL() {
                return ((zzk) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public int zza() {
                return ((zzk) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public int zzb() {
                return ((zzk) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzl
            public int zzc() {
                return ((zzk) this.zza).zzc();
            }

            public zza zzd(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaa(zzaVar.zzbr());
                return this;
            }

            public zza zze(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaa(zzapVar);
                return this;
            }

            public zza zzf(int i10, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzab(i10, zzaVar.zzbr());
                return this;
            }

            public zza zzg(int i10, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzab(i10, zzapVar);
                return this;
            }

            public zza zzh(Iterable<? extends zzap> iterable) {
                zzbu();
                ((zzk) this.zza).zzac(iterable);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzk) this.zza).zzad();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzk) this.zza).zzae();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzk) this.zza).zzaf();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzk) this.zza).zzag();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzk) this.zza).zzah();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzk) this.zza).zzai();
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzak(zzapVar);
                return this;
            }

            public zza zzp(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzal(zzapVar);
                return this;
            }

            public zza zzq(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzam(zzapVar);
                return this;
            }

            public zza zzr(int i10) {
                zzbu();
                ((zzk) this.zza).zzan(i10);
                return this;
            }

            public zza zzs(int i10) {
                zzbu();
                ((zzk) this.zza).zzao(i10);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzaVar.zzbr());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzapVar);
                return this;
            }

            public zza zzv(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaq(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaq(zzapVar);
                return this;
            }

            public zza zzx(int i10, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzar(i10, zzaVar.zzbr());
                return this;
            }

            public zza zzy(int i10, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzar(i10, zzapVar);
                return this;
            }

            public zza zzz(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzas(zzaVar.zzbr());
                return this;
            }

            private zza() {
                super(zzk.zzg);
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzg = zzkVar;
            zzgyx.zzcb(zzk.class, zzkVar);
        }

        private zzk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(zzap zzapVar) {
            zzapVar.getClass();
            zzaj();
            this.zzn.add(zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(int i10, zzap zzapVar) {
            zzapVar.getClass();
            zzaj();
            this.zzn.add(i10, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(Iterable<? extends zzap> iterable) {
            zzaj();
            zzgwy.zzaQ(iterable, this.zzn);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad() {
            this.zzi &= -2;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae() {
            this.zzl = null;
            this.zzi &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag() {
            this.zzn = zzgyx.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah() {
            this.zzm = null;
            this.zzi &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai() {
            this.zzi &= -17;
            this.zzo = 0;
        }

        private void zzaj() {
            zzgzj<zzap> zzgzjVar = this.zzn;
            if (!zzgzjVar.zzc()) {
                this.zzn = zzgyx.zzbL(zzgzjVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzl;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan(int i10) {
            zzaj();
            this.zzn.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao(int i10) {
            this.zzi |= 1;
            this.zzj = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap(zzap zzapVar) {
            zzapVar.getClass();
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar(int i10, zzap zzapVar) {
            zzapVar.getClass();
            zzaj();
            this.zzn.set(i10, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat(int i10) {
            this.zzi |= 16;
            this.zzo = i10;
        }

        public static zza zzd() {
            return zzg.zzaZ();
        }

        public static zza zzf(zzk zzkVar) {
            return zzg.zzba(zzkVar);
        }

        public static zzk zzh() {
            return zzg;
        }

        public static zzk zzi(InputStream inputStream) throws IOException {
            return (zzk) zzgyx.zzbk(zzg, inputStream);
        }

        public static zzk zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzk) zzgyx.zzbl(zzg, inputStream, zzgyhVar);
        }

        public static zzk zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zzk) zzgyx.zzbm(zzg, zzgxpVar);
        }

        public static zzk zzl(zzgxv zzgxvVar) throws IOException {
            return (zzk) zzgyx.zzbn(zzg, zzgxvVar);
        }

        public static zzk zzm(InputStream inputStream) throws IOException {
            return (zzk) zzgyx.zzbo(zzg, inputStream);
        }

        public static zzk zzn(ByteBuffer byteBuffer) throws zzgzm {
            return (zzk) zzgyx.zzbp(zzg, byteBuffer);
        }

        public static zzk zzo(byte[] bArr) throws zzgzm {
            return (zzk) zzgyx.zzbq(zzg, bArr);
        }

        public static zzk zzp(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzk) zzgyx.zzbr(zzg, zzgxpVar, zzgyhVar);
        }

        public static zzk zzq(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzk) zzgyx.zzbs(zzg, zzgxvVar, zzgyhVar);
        }

        public static zzk zzr(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzk) zzgyx.zzbu(zzg, inputStream, zzgyhVar);
        }

        public static zzk zzs(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzk) zzgyx.zzbv(zzg, byteBuffer, zzgyhVar);
        }

        public static zzk zzt(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzk) zzgyx.zzbx(zzg, bArr, zzgyhVar);
        }

        public static zzhaq<zzk> zzv() {
            return zzg.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public zzap zzC() {
            zzap zzapVar = this.zzl;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public zzap zzD() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public zzap zzE(int i10) {
            return this.zzn.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public zzap zzF() {
            zzap zzapVar = this.zzm;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public List<zzap> zzG() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public boolean zzH() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public boolean zzI() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public boolean zzJ() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public boolean zzK() {
            return (this.zzi & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public boolean zzL() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public int zza() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public int zzb() {
            return this.zzn.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzl
        public int zzc() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzap.class, "zzo"});
                case 3:
                    return new zzk();
                case 4:
                    return new zza();
                case 5:
                    return zzg;
                case 6:
                    zzhaq<zzk> zzhaqVar = zzh;
                    if (zzhaqVar == null) {
                        synchronized (zzk.class) {
                            zzhaqVar = zzh;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzg);
                                zzh = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public zzaq zzu(int i10) {
            return this.zzn.get(i10);
        }

        public List<? extends zzaq> zzw() {
            return this.zzn;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzl extends zzhaj {
        zzap zzC();

        zzap zzD();

        zzap zzE(int i10);

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

    /* loaded from: classes3.dex */
    public final class zzm extends zzgyx<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzi;
        private static volatile zzhaq<zzm> zzj;
        private int zzk;
        private zzap zzm;
        private int zzn;
        private zzar zzo;
        private int zzp;
        private String zzl = "";
        private int zzu = 1000;
        private int zzv = 1000;
        private int zzw = 1000;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzm, zza> implements zzn {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public zzap zzA() {
                return ((zzm) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public zzar zzB() {
                return ((zzm) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public zzgxp zzC() {
                return ((zzm) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public String zzD() {
                return ((zzm) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public boolean zzE() {
                return ((zzm) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public boolean zzF() {
                return ((zzm) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public boolean zzG() {
                return ((zzm) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public boolean zzH() {
                return ((zzm) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public boolean zzI() {
                return ((zzm) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public boolean zzJ() {
                return ((zzm) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public boolean zzK() {
                return ((zzm) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public boolean zzL() {
                return ((zzm) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public int zza() {
                return ((zzm) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public int zzb() {
                return ((zzm) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzm) this.zza).zzac();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzm) this.zza).zzad();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzm) this.zza).zzae();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzm) this.zza).zzaf();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzm) this.zza).zzag();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzm) this.zza).zzah();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzm) this.zza).zzai();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzm) this.zza).zzaj();
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzak(zzapVar);
                return this;
            }

            public zza zzl(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzal(zzarVar);
                return this;
            }

            public zza zzm(String str) {
                zzbu();
                ((zzm) this.zza).zzam(str);
                return this;
            }

            public zza zzn(zzgxp zzgxpVar) {
                zzbu();
                ((zzm) this.zza).zzan(zzgxpVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzao(zzqVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzap(zzqVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzaq(zzqVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzar(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzar(zzapVar);
                return this;
            }

            public zza zzt(int i10) {
                zzbu();
                ((zzm) this.zza).zzas(i10);
                return this;
            }

            public zza zzu(int i10) {
                zzbu();
                ((zzm) this.zza).zzat(i10);
                return this;
            }

            public zza zzv(zzar.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzau(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzau(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public zzq zzx() {
                return ((zzm) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public zzq zzy() {
                return ((zzm) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzn
            public zzq zzz() {
                return ((zzm) this.zza).zzz();
            }

            private zza() {
                super(zzm.zzi);
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzi = zzmVar;
            zzgyx.zzcb(zzm.class, zzmVar);
        }

        private zzm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac() {
            this.zzk &= -2;
            this.zzl = zzg().zzD();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad() {
            this.zzk &= -33;
            this.zzu = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae() {
            this.zzk &= -65;
            this.zzv = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf() {
            this.zzk &= -129;
            this.zzw = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag() {
            this.zzm = null;
            this.zzk &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah() {
            this.zzk &= -17;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai() {
            this.zzk &= -5;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj() {
            this.zzo = null;
            this.zzk &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzo;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
            }
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam(String str) {
            str.getClass();
            this.zzk |= 1;
            this.zzl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan(zzgxp zzgxpVar) {
            this.zzl = zzgxpVar.zzx();
            this.zzk |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao(zzq zzqVar) {
            this.zzu = zzqVar.zza();
            this.zzk |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap(zzq zzqVar) {
            this.zzv = zzqVar.zza();
            this.zzk |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq(zzq zzqVar) {
            this.zzw = zzqVar.zza();
            this.zzk |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(int i10) {
            this.zzk |= 16;
            this.zzp = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat(int i10) {
            this.zzk |= 4;
            this.zzn = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau(zzar zzarVar) {
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

        public static zzm zzg() {
            return zzi;
        }

        public static zzm zzh(InputStream inputStream) throws IOException {
            return (zzm) zzgyx.zzbk(zzi, inputStream);
        }

        public static zzm zzi(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzm) zzgyx.zzbl(zzi, inputStream, zzgyhVar);
        }

        public static zzm zzj(zzgxp zzgxpVar) throws zzgzm {
            return (zzm) zzgyx.zzbm(zzi, zzgxpVar);
        }

        public static zzm zzk(zzgxv zzgxvVar) throws IOException {
            return (zzm) zzgyx.zzbn(zzi, zzgxvVar);
        }

        public static zzm zzl(InputStream inputStream) throws IOException {
            return (zzm) zzgyx.zzbo(zzi, inputStream);
        }

        public static zzm zzm(ByteBuffer byteBuffer) throws zzgzm {
            return (zzm) zzgyx.zzbp(zzi, byteBuffer);
        }

        public static zzm zzn(byte[] bArr) throws zzgzm {
            return (zzm) zzgyx.zzbq(zzi, bArr);
        }

        public static zzm zzo(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzm) zzgyx.zzbr(zzi, zzgxpVar, zzgyhVar);
        }

        public static zzm zzp(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzm) zzgyx.zzbs(zzi, zzgxvVar, zzgyhVar);
        }

        public static zzm zzq(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzm) zzgyx.zzbu(zzi, inputStream, zzgyhVar);
        }

        public static zzm zzr(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzm) zzgyx.zzbv(zzi, byteBuffer, zzgyhVar);
        }

        public static zzm zzs(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzm) zzgyx.zzbx(zzi, bArr, zzgyhVar);
        }

        public static zzhaq<zzm> zzt() {
            return zzi.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public zzap zzA() {
            zzap zzapVar = this.zzm;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public zzar zzB() {
            zzar zzarVar = this.zzo;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public zzgxp zzC() {
            return zzgxp.zzw(this.zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public String zzD() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public boolean zzE() {
            return (this.zzk & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public boolean zzF() {
            return (this.zzk & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public boolean zzG() {
            return (this.zzk & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public boolean zzH() {
            return (this.zzk & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public boolean zzI() {
            return (this.zzk & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public boolean zzJ() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public boolean zzK() {
            return (this.zzk & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public boolean zzL() {
            return (this.zzk & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public int zzb() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzq.zze(), "zzv", zzq.zze(), "zzw", zzq.zze()});
                case 3:
                    return new zzm();
                case 4:
                    return new zza();
                case 5:
                    return zzi;
                case 6:
                    zzhaq<zzm> zzhaqVar = zzj;
                    if (zzhaqVar == null) {
                        synchronized (zzm.class) {
                            zzhaqVar = zzj;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzi);
                                zzj = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public zzq zzx() {
            zzq zzb2 = zzq.zzb(this.zzu);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public zzq zzy() {
            zzq zzb2 = zzq.zzb(this.zzv);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzn
        public zzq zzz() {
            zzq zzb2 = zzq.zzb(this.zzw);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzn extends zzhaj {
        zzap zzA();

        zzar zzB();

        zzgxp zzC();

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

    /* loaded from: classes3.dex */
    public final class zzo extends zzgyx<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zze;
        private static volatile zzhaq<zzo> zzf;
        private int zzg;
        private int zzh;
        private zzar zzi;
        private String zzj = "";
        private String zzk = "";

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzo, zza> implements zzp {
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

            public zza zzg(zzgxp zzgxpVar) {
                zzbu();
                ((zzo) this.zza).zzT(zzgxpVar);
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

            public zza zzl(zzgxp zzgxpVar) {
                zzbu();
                ((zzo) this.zza).zzX(zzgxpVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public zzb zzm() {
                return ((zzo) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public zzar zzn() {
                return ((zzo) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public zzgxp zzo() {
                return ((zzo) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public zzgxp zzp() {
                return ((zzo) this.zza).zzp();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public String zzq() {
                return ((zzo) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public String zzr() {
                return ((zzo) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public boolean zzs() {
                return ((zzo) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public boolean zzt() {
                return ((zzo) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public boolean zzu() {
                return ((zzo) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzp
            public boolean zzv() {
                return ((zzo) this.zza).zzv();
            }

            private zza() {
                super(zzo.zze);
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzgzb {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzgzc<zzb> zzg = new zzgzc<zzb>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzo.zzb.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i10) {
                    return zzb.zzb(i10);
                }
            };
            private final int zzi;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes3.dex */
            public final class zza implements zzgzd {
                static final zzgzd zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzd
                public boolean zza(int i10) {
                    return zzb.zzb(i10) != null;
                }
            }

            zzb(int i10) {
                this.zzi = i10;
            }

            public static zzb zzb(int i10) {
                if (i10 == 0) {
                    return PLATFORM_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return IOS;
                }
                if (i10 != 2) {
                    return null;
                }
                return ANDROID;
            }

            public static zzgzc<zzb> zzd() {
                return zzg;
            }

            public static zzgzd zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgzb
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zze = zzoVar;
            zzgyx.zzcb(zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static zzo zzA(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzo) zzgyx.zzbx(zze, bArr, zzgyhVar);
        }

        public static zzhaq<zzo> zzB() {
            return zze.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzg &= -5;
            this.zzj = zzd().zzq();
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
            this.zzk = zzd().zzr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzi;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
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
        public void zzT(zzgxp zzgxpVar) {
            this.zzj = zzgxpVar.zzx();
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
        public void zzX(zzgxp zzgxpVar) {
            this.zzk = zzgxpVar.zzx();
            this.zzg |= 8;
        }

        public static zza zza() {
            return zze.zzaZ();
        }

        public static zza zzb(zzo zzoVar) {
            return zze.zzba(zzoVar);
        }

        public static zzo zzd() {
            return zze;
        }

        public static zzo zzf(InputStream inputStream) throws IOException {
            return (zzo) zzgyx.zzbk(zze, inputStream);
        }

        public static zzo zzg(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzo) zzgyx.zzbl(zze, inputStream, zzgyhVar);
        }

        public static zzo zzh(zzgxp zzgxpVar) throws zzgzm {
            return (zzo) zzgyx.zzbm(zze, zzgxpVar);
        }

        public static zzo zzi(zzgxv zzgxvVar) throws IOException {
            return (zzo) zzgyx.zzbn(zze, zzgxvVar);
        }

        public static zzo zzj(InputStream inputStream) throws IOException {
            return (zzo) zzgyx.zzbo(zze, inputStream);
        }

        public static zzo zzk(ByteBuffer byteBuffer) throws zzgzm {
            return (zzo) zzgyx.zzbp(zze, byteBuffer);
        }

        public static zzo zzl(byte[] bArr) throws zzgzm {
            return (zzo) zzgyx.zzbq(zze, bArr);
        }

        public static zzo zzw(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzo) zzgyx.zzbr(zze, zzgxpVar, zzgyhVar);
        }

        public static zzo zzx(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzo) zzgyx.zzbs(zze, zzgxvVar, zzgyhVar);
        }

        public static zzo zzy(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzo) zzgyx.zzbu(zze, inputStream, zzgyhVar);
        }

        public static zzo zzz(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzo) zzgyx.zzbv(zze, byteBuffer, zzgyhVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", zzb.zze(), "zzi", "zzj", "zzk"});
                case 3:
                    return new zzo();
                case 4:
                    return new zza();
                case 5:
                    return zze;
                case 6:
                    zzhaq<zzo> zzhaqVar = zzf;
                    if (zzhaqVar == null) {
                        synchronized (zzo.class) {
                            zzhaqVar = zzf;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zze);
                                zzf = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public zzb zzm() {
            zzb zzb2 = zzb.zzb(this.zzh);
            return zzb2 == null ? zzb.PLATFORM_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public zzar zzn() {
            zzar zzarVar = this.zzi;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public zzgxp zzo() {
            return zzgxp.zzw(this.zzj);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public zzgxp zzp() {
            return zzgxp.zzw(this.zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public String zzq() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public String zzr() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public boolean zzs() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public boolean zzt() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public boolean zzu() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzp
        public boolean zzv() {
            return (this.zzg & 8) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzp extends zzhaj {
        zzo.zzb zzm();

        zzar zzn();

        zzgxp zzo();

        zzgxp zzp();

        String zzq();

        String zzr();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* loaded from: classes3.dex */
    public enum zzq implements zzgzb {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);

        public static final int zzd = 0;
        public static final int zze = 1;
        public static final int zzf = 1000;
        private static final zzgzc<zzq> zzg = new zzgzc<zzq>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzq.1
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzq zzb(int i10) {
                return zzq.zzb(i10);
            }
        };
        private final int zzi;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public final class zza implements zzgzd {
            static final zzgzd zza = new zza();

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zzgzd
            public boolean zza(int i10) {
                return zzq.zzb(i10) != null;
            }
        }

        zzq(int i10) {
            this.zzi = i10;
        }

        public static zzq zzb(int i10) {
            if (i10 == 0) {
                return ENUM_FALSE;
            }
            if (i10 == 1) {
                return ENUM_TRUE;
            }
            if (i10 != 1000) {
                return null;
            }
            return ENUM_UNKNOWN;
        }

        public static zzgzc<zzq> zzd() {
            return zzg;
        }

        public static zzgzd zze() {
            return zza.zza;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(zza());
        }

        @Override // com.google.android.gms.internal.ads.zzgzb
        public final int zza() {
            return this.zzi;
        }
    }

    /* loaded from: classes3.dex */
    public final class zzr extends zzgyx<zzr, zza> implements zzs {
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
        private static final zzgzg<zzd.zza> zzk = new zzgzg<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzr.1
            @Override // com.google.android.gms.internal.ads.zzgzg
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i10) {
                zzd.zza zzb2 = zzd.zza.zzb(i10);
                return zzb2 == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
            }
        };
        private static final zzgzg<zzd.zza> zzl = new zzgzg<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbbs.zzr.2
            @Override // com.google.android.gms.internal.ads.zzgzg
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i10) {
                zzd.zza zzb2 = zzd.zza.zzb(i10);
                return zzb2 == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
            }
        };
        private static final zzr zzm;
        private static volatile zzhaq<zzr> zzn;
        private int zzA;
        private int zzo;
        private int zzp;
        private zzar zzv;
        private int zzw;
        private int zzz;
        private String zzu = "";
        private String zzx = "";
        private String zzy = "";
        private zzgzf zzB = zzgyx.zzbG();
        private zzgzf zzC = zzgyx.zzbG();

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzr, zza> implements zzs {
            public zza zzA(String str) {
                zzbu();
                ((zzr) this.zza).zzcj(str);
                return this;
            }

            public zza zzB(zzgxp zzgxpVar) {
                zzbu();
                ((zzr) this.zza).zzck(zzgxpVar);
                return this;
            }

            public zza zzC(String str) {
                zzbu();
                ((zzr) this.zza).zzcl(str);
                return this;
            }

            public zza zzD(zzgxp zzgxpVar) {
                zzbu();
                ((zzr) this.zza).zzcm(zzgxpVar);
                return this;
            }

            public zza zzE(int i10) {
                zzbu();
                ((zzr) this.zza).zzcn(i10);
                return this;
            }

            public zza zzF(zzar.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzco(zzaVar.zzbr());
                return this;
            }

            public zza zzG(zzar zzarVar) {
                zzbu();
                ((zzr) this.zza).zzco(zzarVar);
                return this;
            }

            public zza zzH(zzo.zzb zzbVar) {
                zzbu();
                ((zzr) this.zza).zzcp(zzbVar);
                return this;
            }

            public zza zzI(int i10, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcq(i10, zzaVar);
                return this;
            }

            public zza zzJ(int i10, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcr(i10, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public zzab.zzc zzK() {
                return ((zzr) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public zzar zzL() {
                return ((zzr) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public zzgxp zzM() {
                return ((zzr) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public zzgxp zzN() {
                return ((zzr) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public zzgxp zzO() {
                return ((zzr) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public String zzP() {
                return ((zzr) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public String zzQ() {
                return ((zzr) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public String zzR() {
                return ((zzr) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public List<zzd.zza> zzS() {
                return ((zzr) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public List<zzd.zza> zzT() {
                return ((zzr) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public boolean zzU() {
                return ((zzr) this.zza).zzU();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public boolean zzV() {
                return ((zzr) this.zza).zzV();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public boolean zzW() {
                return ((zzr) this.zza).zzW();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public boolean zzX() {
                return ((zzr) this.zza).zzX();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public boolean zzY() {
                return ((zzr) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public boolean zzZ() {
                return ((zzr) this.zza).zzZ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public int zza() {
                return ((zzr) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public boolean zzaa() {
                return ((zzr) this.zza).zzaa();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public boolean zzab() {
                return ((zzr) this.zza).zzab();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public int zzb() {
                return ((zzr) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public int zzc() {
                return ((zzr) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public zza.EnumC0141zza zzd() {
                return ((zzr) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public zzd.zza zze(int i10) {
                return ((zzr) this.zza).zze(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
            public zzd.zza zzf(int i10) {
                return ((zzr) this.zza).zzf(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzs
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

            public zza zzw(zza.EnumC0141zza enumC0141zza) {
                zzbu();
                ((zzr) this.zza).zzaJ(enumC0141zza);
                return this;
            }

            public zza zzx(String str) {
                zzbu();
                ((zzr) this.zza).zzaK(str);
                return this;
            }

            public zza zzy(zzgxp zzgxpVar) {
                zzbu();
                ((zzr) this.zza).zzch(zzgxpVar);
                return this;
            }

            public zza zzz(zzab.zzc zzcVar) {
                zzbu();
                ((zzr) this.zza).zzci(zzcVar);
                return this;
            }

            private zza() {
                super(zzr.zzm);
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzm = zzrVar;
            zzgyx.zzcb(zzr.class, zzrVar);
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
            this.zzC = zzgyx.zzbG();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF() {
            this.zzB = zzgyx.zzbG();
        }

        private void zzaG() {
            zzgzf zzgzfVar = this.zzC;
            if (!zzgzfVar.zzc()) {
                this.zzC = zzgyx.zzbH(zzgzfVar);
            }
        }

        private void zzaH() {
            zzgzf zzgzfVar = this.zzB;
            if (!zzgzfVar.zzc()) {
                this.zzB = zzgyx.zzbH(zzgzfVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzv;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
            }
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ(zza.EnumC0141zza enumC0141zza) {
            this.zzA = enumC0141zza.zza();
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
        public void zzch(zzgxp zzgxpVar) {
            this.zzx = zzgxpVar.zzx();
            this.zzo |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci(zzab.zzc zzcVar) {
            this.zzz = zzcVar.zza();
            this.zzo |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj(String str) {
            str.getClass();
            this.zzo |= 32;
            this.zzy = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck(zzgxp zzgxpVar) {
            this.zzy = zzgxpVar.zzx();
            this.zzo |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl(String str) {
            str.getClass();
            this.zzo |= 2;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm(zzgxp zzgxpVar) {
            this.zzu = zzgxpVar.zzx();
            this.zzo |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn(int i10) {
            this.zzo |= 1;
            this.zzp = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco(zzar zzarVar) {
            zzarVar.getClass();
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp(zzo.zzb zzbVar) {
            this.zzw = zzbVar.zza();
            this.zzo |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq(int i10, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaG();
            this.zzC.zze(i10, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr(int i10, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaH();
            this.zzB.zze(i10, zzaVar.zza());
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
            return (zzr) zzgyx.zzbk(zzm, inputStream);
        }

        public static zzr zzm(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzr) zzgyx.zzbl(zzm, inputStream, zzgyhVar);
        }

        public static zzr zzn(zzgxp zzgxpVar) throws zzgzm {
            return (zzr) zzgyx.zzbm(zzm, zzgxpVar);
        }

        public static zzr zzo(zzgxv zzgxvVar) throws IOException {
            return (zzr) zzgyx.zzbn(zzm, zzgxvVar);
        }

        public static zzr zzp(InputStream inputStream) throws IOException {
            return (zzr) zzgyx.zzbo(zzm, inputStream);
        }

        public static zzr zzq(ByteBuffer byteBuffer) throws zzgzm {
            return (zzr) zzgyx.zzbp(zzm, byteBuffer);
        }

        public static zzr zzr(byte[] bArr) throws zzgzm {
            return (zzr) zzgyx.zzbq(zzm, bArr);
        }

        public static zzr zzs(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzr) zzgyx.zzbr(zzm, zzgxpVar, zzgyhVar);
        }

        public static zzr zzt(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzr) zzgyx.zzbs(zzm, zzgxvVar, zzgyhVar);
        }

        public static zzr zzu(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzr) zzgyx.zzbu(zzm, inputStream, zzgyhVar);
        }

        public static zzr zzv(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzr) zzgyx.zzbv(zzm, byteBuffer, zzgyhVar);
        }

        public static zzr zzw(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzr) zzgyx.zzbx(zzm, bArr, zzgyhVar);
        }

        public static zzhaq<zzr> zzx() {
            return zzm.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public zzab.zzc zzK() {
            zzab.zzc zzb2 = zzab.zzc.zzb(this.zzz);
            return zzb2 == null ? zzab.zzc.NETWORKTYPE_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public zzar zzL() {
            zzar zzarVar = this.zzv;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public zzgxp zzM() {
            return zzgxp.zzw(this.zzx);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public zzgxp zzN() {
            return zzgxp.zzw(this.zzy);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public zzgxp zzO() {
            return zzgxp.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public String zzP() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public String zzQ() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public String zzR() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public List<zzd.zza> zzS() {
            return new zzgzh(this.zzC, zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public List<zzd.zza> zzT() {
            return new zzgzh(this.zzB, zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public boolean zzU() {
            return (this.zzo & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public boolean zzV() {
            return (this.zzo & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public boolean zzW() {
            return (this.zzo & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public boolean zzX() {
            return (this.zzo & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public boolean zzY() {
            return (this.zzo & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public boolean zzZ() {
            return (this.zzo & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public boolean zzaa() {
            return (this.zzo & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public boolean zzab() {
            return (this.zzo & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public int zzc() {
            return this.zzB.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public zza.EnumC0141zza zzd() {
            zza.EnumC0141zza zzb2 = zza.EnumC0141zza.zzb(this.zzA);
            return zzb2 == null ? zza.EnumC0141zza.AD_INITIATER_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzm, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzo", "zzp", "zzu", "zzv", "zzw", zzo.zzb.zze(), "zzx", "zzy", "zzz", zzab.zzc.zze(), "zzA", zza.EnumC0141zza.zze(), "zzB", zzd.zza.zze(), "zzC", zzd.zza.zze()});
                case 3:
                    return new zzr();
                case 4:
                    return new zza();
                case 5:
                    return zzm;
                case 6:
                    zzhaq<zzr> zzhaqVar = zzn;
                    if (zzhaqVar == null) {
                        synchronized (zzr.class) {
                            zzhaqVar = zzn;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzm);
                                zzn = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public zzd.zza zze(int i10) {
            zzd.zza zzb2 = zzd.zza.zzb(this.zzC.zzd(i10));
            return zzb2 == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public zzd.zza zzf(int i10) {
            zzd.zza zzb2 = zzd.zza.zzb(this.zzB.zzd(i10));
            return zzb2 == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzs
        public zzo.zzb zzg() {
            zzo.zzb zzb2 = zzo.zzb.zzb(this.zzw);
            return zzb2 == null ? zzo.zzb.PLATFORM_UNSPECIFIED : zzb2;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzs extends zzhaj {
        zzab.zzc zzK();

        zzar zzL();

        zzgxp zzM();

        zzgxp zzN();

        zzgxp zzO();

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

        zza.EnumC0141zza zzd();

        zzd.zza zze(int i10);

        zzd.zza zzf(int i10);

        zzo.zzb zzg();
    }

    /* loaded from: classes3.dex */
    public final class zzt extends zzgyx<zzt, zza> implements zzu {
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
        private static volatile zzhaq<zzt> zzo;
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
        private zzgzi zzz = zzgyx.zzbI();

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzt, zza> implements zzu {
            public zza zzA(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcs(zzmVar);
                return this;
            }

            public zza zzB(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzct(zzoVar);
                return this;
            }

            public zza zzC(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzcu(zzabVar);
                return this;
            }

            public zza zzD(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzcv(zzafVar);
                return this;
            }

            public zza zzE(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcw(zzarVar);
                return this;
            }

            public zza zzF(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcx(zzblVar);
                return this;
            }

            public zza zzG(zza.zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzbVar.zzbr());
                return this;
            }

            public zza zzH(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzaVar);
                return this;
            }

            public zza zzI(zzb.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzcVar.zzbr());
                return this;
            }

            public zza zzJ(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzbVar);
                return this;
            }

            public zza zzK(zzm.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcA(zzaVar.zzbr());
                return this;
            }

            public zza zzL(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcA(zzmVar);
                return this;
            }

            public zza zzM(zzo.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcB(zzaVar.zzbr());
                return this;
            }

            public zza zzN(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzcB(zzoVar);
                return this;
            }

            public zza zzO(String str) {
                zzbu();
                ((zzt) this.zza).zzcC(str);
                return this;
            }

            public zza zzP(zzgxp zzgxpVar) {
                zzbu();
                ((zzt) this.zza).zzcD(zzgxpVar);
                return this;
            }

            public zza zzQ(int i10, long j3) {
                zzbu();
                ((zzt) this.zza).zzcE(i10, j3);
                return this;
            }

            public zza zzR(zzq zzqVar) {
                zzbu();
                ((zzt) this.zza).zzcF(zzqVar);
                return this;
            }

            public zza zzS(int i10) {
                zzbu();
                ((zzt) this.zza).zzcG(i10);
                return this;
            }

            public zza zzT(zzab.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zza zzU(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzabVar);
                return this;
            }

            public zza zzV(zzaf.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcI(zzcVar.zzbr());
                return this;
            }

            public zza zzW(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzcI(zzafVar);
                return this;
            }

            public zza zzX(zzar.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zza zzY(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcJ(zzarVar);
                return this;
            }

            public zza zzZ(int i10) {
                zzbu();
                ((zzt) this.zza).zzcK(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public int zza() {
                return ((zzt) this.zza).zza();
            }

            public zza zzaa(zzbl.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcL(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcL(zzblVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zzab zzac() {
                return ((zzt) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zzaf zzad() {
                return ((zzt) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zzar zzae() {
                return ((zzt) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zzbl zzaf() {
                return ((zzt) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zzgxp zzag() {
                return ((zzt) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public String zzah() {
                return ((zzt) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public List<Long> zzai() {
                return Collections.unmodifiableList(((zzt) this.zza).zzai());
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzaj() {
                return ((zzt) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzak() {
                return ((zzt) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzal() {
                return ((zzt) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzam() {
                return ((zzt) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzan() {
                return ((zzt) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzao() {
                return ((zzt) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzap() {
                return ((zzt) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzaq() {
                return ((zzt) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzar() {
                return ((zzt) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzas() {
                return ((zzt) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzat() {
                return ((zzt) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public boolean zzau() {
                return ((zzt) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public int zzb() {
                return ((zzt) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public int zzc() {
                return ((zzt) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public long zzd(int i10) {
                return ((zzt) this.zza).zzd(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zza zze() {
                return ((zzt) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zzb zzf() {
                return ((zzt) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zzm zzg() {
                return ((zzt) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zzo zzh() {
                return ((zzt) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzu
            public zzq zzi() {
                return ((zzt) this.zza).zzi();
            }

            public zza zzj(Iterable<? extends Long> iterable) {
                zzbu();
                ((zzt) this.zza).zzaE(iterable);
                return this;
            }

            public zza zzk(long j3) {
                zzbu();
                ((zzt) this.zza).zzaF(j3);
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
                ((zzt) this.zza).zzch();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzt) this.zza).zzci();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzt) this.zza).zzcj();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzt) this.zza).zzck();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzt) this.zza).zzcl();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzt) this.zza).zzcm();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzt) this.zza).zzcn();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzt) this.zza).zzco();
                return this;
            }

            public zza zzy(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcq(zzaVar);
                return this;
            }

            public zza zzz(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcr(zzbVar);
                return this;
            }

            private zza() {
                super(zzt.zzn);
            }
        }

        static {
            zzt zztVar = new zzt();
            zzn = zztVar;
            zzgyx.zzcb(zzt.class, zztVar);
        }

        private zzt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(Iterable<? extends Long> iterable) {
            zzcp();
            zzgwy.zzaQ(iterable, this.zzz);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(long j3) {
            zzcp();
            this.zzz.zzg(j3);
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
        public void zzcA(zzm zzmVar) {
            zzmVar.getClass();
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(zzo zzoVar) {
            zzoVar.getClass();
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(String str) {
            str.getClass();
            this.zzp |= 2;
            this.zzv = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzgxp zzgxpVar) {
            this.zzv = zzgxpVar.zzx();
            this.zzp |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(int i10, long j3) {
            zzcp();
            this.zzz.zzd(i10, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzq zzqVar) {
            this.zzx = zzqVar.zza();
            this.zzp |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(int i10) {
            this.zzp |= 1;
            this.zzu = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzab zzabVar) {
            zzabVar.getClass();
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzE = zzafVar;
            this.zzp |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzar zzarVar) {
            zzarVar.getClass();
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(int i10) {
            this.zzp |= 4;
            this.zzw = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(zzbl zzblVar) {
            zzblVar.getClass();
            this.zzF = zzblVar;
            this.zzp |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzz = zzgyx.zzbI();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzp &= -9;
            this.zzx = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzp &= -2;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzC = null;
            this.zzp &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzE = null;
            this.zzp &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzy = null;
            this.zzp &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzp &= -5;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzF = null;
            this.zzp &= -1025;
        }

        private void zzcp() {
            zzgzi zzgziVar = this.zzz;
            if (!zzgziVar.zzc()) {
                this.zzz = zzgyx.zzbJ(zzgziVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq(zza zzaVar) {
            zzaVar.getClass();
            zza zzaVar2 = this.zzD;
            if (zzaVar2 != null && zzaVar2 != zza.zzh()) {
                zza.zzb zzf2 = zza.zzf(zzaVar2);
                zzf2.zzbj(zzaVar);
                zzaVar = zzf2.zzbs();
            }
            this.zzD = zzaVar;
            this.zzp |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr(zzb zzbVar) {
            zzbVar.getClass();
            zzb zzbVar2 = this.zzG;
            if (zzbVar2 != null && zzbVar2 != zzb.zzh()) {
                zzb.zzc zzf2 = zzb.zzf(zzbVar2);
                zzf2.zzbj(zzbVar);
                zzbVar = zzf2.zzbs();
            }
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs(zzm zzmVar) {
            zzmVar.getClass();
            zzm zzmVar2 = this.zzA;
            if (zzmVar2 != null && zzmVar2 != zzm.zzg()) {
                zzm.zza zzd2 = zzm.zzd(zzmVar2);
                zzd2.zzbj(zzmVar);
                zzmVar = zzd2.zzbs();
            }
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct(zzo zzoVar) {
            zzoVar.getClass();
            zzo zzoVar2 = this.zzB;
            if (zzoVar2 != null && zzoVar2 != zzo.zzd()) {
                zzo.zza zzb2 = zzo.zzb(zzoVar2);
                zzb2.zzbj(zzoVar);
                zzoVar = zzb2.zzbs();
            }
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu(zzab zzabVar) {
            zzabVar.getClass();
            zzab zzabVar2 = this.zzC;
            if (zzabVar2 != null && zzabVar2 != zzab.zzd()) {
                zzab.zza zzb2 = zzab.zzb(zzabVar2);
                zzb2.zzbj(zzabVar);
                zzabVar = zzb2.zzbs();
            }
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv(zzaf zzafVar) {
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
        public void zzcw(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzy;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
            }
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzbl zzblVar) {
            zzblVar.getClass();
            zzbl zzblVar2 = this.zzF;
            if (zzblVar2 != null && zzblVar2 != zzbl.zzi()) {
                zzbl.zza zzc2 = zzbl.zzc(zzblVar2);
                zzc2.zzbj(zzblVar);
                zzblVar = zzc2.zzbs();
            }
            this.zzF = zzblVar;
            this.zzp |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zza zzaVar) {
            zzaVar.getClass();
            this.zzD = zzaVar;
            this.zzp |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzb zzbVar) {
            zzbVar.getClass();
            this.zzG = zzbVar;
            this.zzp |= 2048;
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
            return (zzt) zzgyx.zzbk(zzn, inputStream);
        }

        public static zzt zzo(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzt) zzgyx.zzbl(zzn, inputStream, zzgyhVar);
        }

        public static zzt zzp(zzgxp zzgxpVar) throws zzgzm {
            return (zzt) zzgyx.zzbm(zzn, zzgxpVar);
        }

        public static zzt zzq(zzgxv zzgxvVar) throws IOException {
            return (zzt) zzgyx.zzbn(zzn, zzgxvVar);
        }

        public static zzt zzr(InputStream inputStream) throws IOException {
            return (zzt) zzgyx.zzbo(zzn, inputStream);
        }

        public static zzt zzs(ByteBuffer byteBuffer) throws zzgzm {
            return (zzt) zzgyx.zzbp(zzn, byteBuffer);
        }

        public static zzt zzt(byte[] bArr) throws zzgzm {
            return (zzt) zzgyx.zzbq(zzn, bArr);
        }

        public static zzt zzu(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzt) zzgyx.zzbr(zzn, zzgxpVar, zzgyhVar);
        }

        public static zzt zzv(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzt) zzgyx.zzbs(zzn, zzgxvVar, zzgyhVar);
        }

        public static zzt zzw(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzt) zzgyx.zzbu(zzn, inputStream, zzgyhVar);
        }

        public static zzt zzx(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzt) zzgyx.zzbv(zzn, byteBuffer, zzgyhVar);
        }

        public static zzt zzy(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzt) zzgyx.zzbx(zzn, bArr, zzgyhVar);
        }

        public static zzhaq<zzt> zzz() {
            return zzn.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public int zza() {
            return this.zzz.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zzab zzac() {
            zzab zzabVar = this.zzC;
            return zzabVar == null ? zzab.zzd() : zzabVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zzaf zzad() {
            zzaf zzafVar = this.zzE;
            return zzafVar == null ? zzaf.zzl() : zzafVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zzar zzae() {
            zzar zzarVar = this.zzy;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zzbl zzaf() {
            zzbl zzblVar = this.zzF;
            return zzblVar == null ? zzbl.zzi() : zzblVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zzgxp zzag() {
            return zzgxp.zzw(this.zzv);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public String zzah() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public List<Long> zzai() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzaj() {
            return (this.zzp & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzak() {
            return (this.zzp & 2048) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzal() {
            return (this.zzp & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzam() {
            return (this.zzp & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzan() {
            return (this.zzp & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzao() {
            return (this.zzp & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzap() {
            return (this.zzp & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzaq() {
            return (this.zzp & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzar() {
            return (this.zzp & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzas() {
            return (this.zzp & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzat() {
            return (this.zzp & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public boolean zzau() {
            return (this.zzp & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public int zzb() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public int zzc() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public long zzd(int i10) {
            return this.zzz.zza(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", zzq.zze(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
                case 3:
                    return new zzt();
                case 4:
                    return new zza();
                case 5:
                    return zzn;
                case 6:
                    zzhaq<zzt> zzhaqVar = zzo;
                    if (zzhaqVar == null) {
                        synchronized (zzt.class) {
                            zzhaqVar = zzo;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzn);
                                zzo = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zza zze() {
            zza zzaVar = this.zzD;
            return zzaVar == null ? zza.zzh() : zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zzb zzf() {
            zzb zzbVar = this.zzG;
            return zzbVar == null ? zzb.zzh() : zzbVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zzm zzg() {
            zzm zzmVar = this.zzA;
            return zzmVar == null ? zzm.zzg() : zzmVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zzo zzh() {
            zzo zzoVar = this.zzB;
            return zzoVar == null ? zzo.zzd() : zzoVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzu
        public zzq zzi() {
            zzq zzb2 = zzq.zzb(this.zzx);
            return zzb2 == null ? zzq.ENUM_UNKNOWN : zzb2;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzu extends zzhaj {
        int zza();

        zzab zzac();

        zzaf zzad();

        zzar zzae();

        zzbl zzaf();

        zzgxp zzag();

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

        long zzd(int i10);

        zza zze();

        zzb zzf();

        zzm zzg();

        zzo zzh();

        zzq zzi();
    }

    /* loaded from: classes3.dex */
    public final class zzv extends zzgyx<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zze;
        private static volatile zzhaq<zzv> zzf;
        private int zzg;
        private int zzi;
        private zzap zzk;
        private String zzh = "";
        private zzgzf zzj = zzgyx.zzbG();

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzv, zza> implements zzw {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public int zza(int i10) {
                return ((zzv) this.zza).zza(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public int zzb() {
                return ((zzv) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public zzq zzc() {
                return ((zzv) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzv) this.zza).zzO(iterable);
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzv) this.zza).zzP(i10);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzv) this.zza).zzQ();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzv) this.zza).zzR();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzv) this.zza).zzS();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzv) this.zza).zzT();
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzV(zzapVar);
                return this;
            }

            public zza zzk(String str) {
                zzbu();
                ((zzv) this.zza).zzW(str);
                return this;
            }

            public zza zzl(zzgxp zzgxpVar) {
                zzbu();
                ((zzv) this.zza).zzX(zzgxpVar);
                return this;
            }

            public zza zzm(zzap.zza zzaVar) {
                zzbu();
                ((zzv) this.zza).zzY(zzaVar.zzbr());
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzY(zzapVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzv) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzp(int i10, int i11) {
                zzbu();
                ((zzv) this.zza).zzaa(i10, i11);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public zzap zzq() {
                return ((zzv) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public zzgxp zzr() {
                return ((zzv) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public String zzs() {
                return ((zzv) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public List<Integer> zzt() {
                return Collections.unmodifiableList(((zzv) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public boolean zzu() {
                return ((zzv) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public boolean zzv() {
                return ((zzv) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzw
            public boolean zzw() {
                return ((zzv) this.zza).zzw();
            }

            private zza() {
                super(zzv.zze);
            }
        }

        static {
            zzv zzvVar = new zzv();
            zze = zzvVar;
            zzgyx.zzcb(zzv.class, zzvVar);
        }

        private zzv() {
        }

        public static zzv zzA(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzv) zzgyx.zzbx(zze, bArr, zzgyhVar);
        }

        public static zzhaq<zzv> zzB() {
            return zze.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(Iterable<? extends Integer> iterable) {
            zzU();
            zzgwy.zzaQ(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP(int i10) {
            zzU();
            this.zzj.zzi(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzg &= -2;
            this.zzh = zzh().zzs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzk = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS() {
            this.zzg &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT() {
            this.zzj = zzgyx.zzbG();
        }

        private void zzU() {
            zzgzf zzgzfVar = this.zzj;
            if (!zzgzfVar.zzc()) {
                this.zzj = zzgyx.zzbH(zzgzfVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(String str) {
            str.getClass();
            this.zzg |= 1;
            this.zzh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(zzgxp zzgxpVar) {
            this.zzh = zzgxpVar.zzx();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(int i10, int i11) {
            zzU();
            this.zzj.zze(i10, i11);
        }

        public static zza zzd() {
            return zze.zzaZ();
        }

        public static zza zzf(zzv zzvVar) {
            return zze.zzba(zzvVar);
        }

        public static zzv zzh() {
            return zze;
        }

        public static zzv zzi(InputStream inputStream) throws IOException {
            return (zzv) zzgyx.zzbk(zze, inputStream);
        }

        public static zzv zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzv) zzgyx.zzbl(zze, inputStream, zzgyhVar);
        }

        public static zzv zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zzv) zzgyx.zzbm(zze, zzgxpVar);
        }

        public static zzv zzl(zzgxv zzgxvVar) throws IOException {
            return (zzv) zzgyx.zzbn(zze, zzgxvVar);
        }

        public static zzv zzm(InputStream inputStream) throws IOException {
            return (zzv) zzgyx.zzbo(zze, inputStream);
        }

        public static zzv zzn(ByteBuffer byteBuffer) throws zzgzm {
            return (zzv) zzgyx.zzbp(zze, byteBuffer);
        }

        public static zzv zzo(byte[] bArr) throws zzgzm {
            return (zzv) zzgyx.zzbq(zze, bArr);
        }

        public static zzv zzp(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzv) zzgyx.zzbr(zze, zzgxpVar, zzgyhVar);
        }

        public static zzv zzx(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzv) zzgyx.zzbs(zze, zzgxvVar, zzgyhVar);
        }

        public static zzv zzy(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzv) zzgyx.zzbu(zze, inputStream, zzgyhVar);
        }

        public static zzv zzz(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzv) zzgyx.zzbv(zze, byteBuffer, zzgyhVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public int zza(int i10) {
            return this.zzj.zzd(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public int zzb() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public zzq zzc() {
            zzq zzb2 = zzq.zzb(this.zzi);
            return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
                case 3:
                    return new zzv();
                case 4:
                    return new zza();
                case 5:
                    return zze;
                case 6:
                    zzhaq<zzv> zzhaqVar = zzf;
                    if (zzhaqVar == null) {
                        synchronized (zzv.class) {
                            zzhaqVar = zzf;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zze);
                                zzf = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public zzap zzq() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public zzgxp zzr() {
            return zzgxp.zzw(this.zzh);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public String zzs() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public List<Integer> zzt() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public boolean zzu() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public boolean zzv() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzw
        public boolean zzw() {
            return (this.zzg & 2) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzw extends zzhaj {
        int zza(int i10);

        int zzb();

        zzq zzc();

        zzap zzq();

        zzgxp zzr();

        String zzs();

        List<Integer> zzt();

        boolean zzu();

        boolean zzv();

        boolean zzw();
    }

    /* loaded from: classes3.dex */
    public final class zzx extends zzgyx<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzc;
        private static volatile zzhaq<zzx> zzd;
        private int zze;
        private int zzf;
        private zzgzf zzg = zzgyx.zzbG();

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzx, zza> implements zzy {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzy
            public int zza(int i10) {
                return ((zzx) this.zza).zza(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzy
            public int zzb() {
                return ((zzx) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzy
            public zzq zzc() {
                return ((zzx) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzx) this.zza).zzD(iterable);
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzx) this.zza).zzE(i10);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzx) this.zza).zzF();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzx) this.zza).zzG();
                return this;
            }

            public zza zzh(int i10, int i11) {
                zzbu();
                ((zzx) this.zza).zzI(i10, i11);
                return this;
            }

            public zza zzi(zzq zzqVar) {
                zzbu();
                ((zzx) this.zza).zzJ(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzy
            public List<Integer> zzj() {
                return Collections.unmodifiableList(((zzx) this.zza).zzj());
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzy
            public boolean zzk() {
                return ((zzx) this.zza).zzk();
            }

            private zza() {
                super(zzx.zzc);
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzc = zzxVar;
            zzgyx.zzcb(zzx.class, zzxVar);
        }

        private zzx() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(Iterable<? extends Integer> iterable) {
            zzH();
            zzgwy.zzaQ(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(int i10) {
            zzH();
            this.zzg.zzi(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzg = zzgyx.zzbG();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zze &= -2;
            this.zzf = 0;
        }

        private void zzH() {
            zzgzf zzgzfVar = this.zzg;
            if (!zzgzfVar.zzc()) {
                this.zzg = zzgyx.zzbH(zzgzfVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i10, int i11) {
            zzH();
            this.zzg.zze(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzd() {
            return zzc.zzaZ();
        }

        public static zza zzf(zzx zzxVar) {
            return zzc.zzba(zzxVar);
        }

        public static zzx zzh() {
            return zzc;
        }

        public static zzx zzi(InputStream inputStream) throws IOException {
            return (zzx) zzgyx.zzbk(zzc, inputStream);
        }

        public static zzx zzl(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzx) zzgyx.zzbl(zzc, inputStream, zzgyhVar);
        }

        public static zzx zzm(zzgxp zzgxpVar) throws zzgzm {
            return (zzx) zzgyx.zzbm(zzc, zzgxpVar);
        }

        public static zzx zzn(zzgxv zzgxvVar) throws IOException {
            return (zzx) zzgyx.zzbn(zzc, zzgxvVar);
        }

        public static zzx zzo(InputStream inputStream) throws IOException {
            return (zzx) zzgyx.zzbo(zzc, inputStream);
        }

        public static zzx zzp(ByteBuffer byteBuffer) throws zzgzm {
            return (zzx) zzgyx.zzbp(zzc, byteBuffer);
        }

        public static zzx zzq(byte[] bArr) throws zzgzm {
            return (zzx) zzgyx.zzbq(zzc, bArr);
        }

        public static zzx zzr(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzx) zzgyx.zzbr(zzc, zzgxpVar, zzgyhVar);
        }

        public static zzx zzs(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzx) zzgyx.zzbs(zzc, zzgxvVar, zzgyhVar);
        }

        public static zzx zzt(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzx) zzgyx.zzbu(zzc, inputStream, zzgyhVar);
        }

        public static zzx zzu(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzx) zzgyx.zzbv(zzc, byteBuffer, zzgyhVar);
        }

        public static zzx zzv(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzx) zzgyx.zzbx(zzc, bArr, zzgyhVar);
        }

        public static zzhaq<zzx> zzw() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzy
        public int zza(int i10) {
            return this.zzg.zzd(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzy
        public int zzb() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzy
        public zzq zzc() {
            zzq zzb2 = zzq.zzb(this.zzf);
            return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
                case 3:
                    return new zzx();
                case 4:
                    return new zza();
                case 5:
                    return zzc;
                case 6:
                    zzhaq<zzx> zzhaqVar = zzd;
                    if (zzhaqVar == null) {
                        synchronized (zzx.class) {
                            zzhaqVar = zzd;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zzc);
                                zzd = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzy
        public List<Integer> zzj() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzy
        public boolean zzk() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface zzy extends zzhaj {
        int zza(int i10);

        int zzb();

        zzq zzc();

        List<Integer> zzj();

        boolean zzk();
    }

    /* loaded from: classes3.dex */
    public final class zzz extends zzgyx<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zze;
        private static volatile zzhaq<zzz> zzf;
        private int zzg;
        private zzv zzh;
        private zzgzj<zzan> zzi = zzgyx.zzbK();
        private int zzj;
        private zzap zzk;

        /* loaded from: classes3.dex */
        public final class zza extends zzgyr<zzz, zza> implements zzaa {
            @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
            public boolean zzA() {
                return ((zzz) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
            public boolean zzB() {
                return ((zzz) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
            public int zza() {
                return ((zzz) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
            public zzq zzb() {
                return ((zzz) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
            public zzv zzc() {
                return ((zzz) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends zzan> iterable) {
                zzbu();
                ((zzz) this.zza).zzR(iterable);
                return this;
            }

            public zza zze(zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzf(zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzS(zzanVar);
                return this;
            }

            public zza zzg(int i10, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzT(i10, zzaVar.zzbr());
                return this;
            }

            public zza zzh(int i10, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzT(i10, zzanVar);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzz) this.zza).zzU();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzz) this.zza).zzV();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzz) this.zza).zzW();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzz) this.zza).zzX();
                return this;
            }

            public zza zzm(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzZ(zzvVar);
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzaa(zzapVar);
                return this;
            }

            public zza zzo(int i10) {
                zzbu();
                ((zzz) this.zza).zzab(i10);
                return this;
            }

            public zza zzp(zzv.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzaVar.zzbr());
                return this;
            }

            public zza zzq(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzvVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzad(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzad(zzapVar);
                return this;
            }

            public zza zzt(zzq zzqVar) {
                zzbu();
                ((zzz) this.zza).zzae(zzqVar);
                return this;
            }

            public zza zzu(int i10, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzaf(i10, zzaVar.zzbr());
                return this;
            }

            public zza zzv(int i10, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzaf(i10, zzanVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
            public zzan zzw(int i10) {
                return ((zzz) this.zza).zzw(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
            public zzap zzx() {
                return ((zzz) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
            public List<zzan> zzy() {
                return Collections.unmodifiableList(((zzz) this.zza).zzy());
            }

            @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
            public boolean zzz() {
                return ((zzz) this.zza).zzz();
            }

            private zza() {
                super(zzz.zze);
            }
        }

        static {
            zzz zzzVar = new zzz();
            zze = zzzVar;
            zzgyx.zzcb(zzz.class, zzzVar);
        }

        private zzz() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(Iterable<? extends zzan> iterable) {
            zzY();
            zzgwy.zzaQ(iterable, this.zzi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(zzan zzanVar) {
            zzanVar.getClass();
            zzY();
            this.zzi.add(zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(int i10, zzan zzanVar) {
            zzanVar.getClass();
            zzY();
            this.zzi.add(i10, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU() {
            this.zzh = null;
            this.zzg &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV() {
            this.zzk = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW() {
            this.zzg &= -3;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX() {
            this.zzi = zzgyx.zzbK();
        }

        private void zzY() {
            zzgzj<zzan> zzgzjVar = this.zzi;
            if (!zzgzjVar.zzc()) {
                this.zzi = zzgyx.zzbL(zzgzjVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzv zzvVar) {
            zzvVar.getClass();
            zzv zzvVar2 = this.zzh;
            if (zzvVar2 != null && zzvVar2 != zzv.zzh()) {
                zzv.zza zzf2 = zzv.zzf(zzvVar2);
                zzf2.zzbj(zzvVar);
                zzvVar = zzf2.zzbs();
            }
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(int i10) {
            zzY();
            this.zzi.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(zzv zzvVar) {
            zzvVar.getClass();
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf(int i10, zzan zzanVar) {
            zzanVar.getClass();
            zzY();
            this.zzi.set(i10, zzanVar);
        }

        public static zza zzd() {
            return zze.zzaZ();
        }

        public static zza zzf(zzz zzzVar) {
            return zze.zzba(zzzVar);
        }

        public static zzz zzh() {
            return zze;
        }

        public static zzz zzi(InputStream inputStream) throws IOException {
            return (zzz) zzgyx.zzbk(zze, inputStream);
        }

        public static zzz zzj(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzz) zzgyx.zzbl(zze, inputStream, zzgyhVar);
        }

        public static zzz zzk(zzgxp zzgxpVar) throws zzgzm {
            return (zzz) zzgyx.zzbm(zze, zzgxpVar);
        }

        public static zzz zzl(zzgxv zzgxvVar) throws IOException {
            return (zzz) zzgyx.zzbn(zze, zzgxvVar);
        }

        public static zzz zzm(InputStream inputStream) throws IOException {
            return (zzz) zzgyx.zzbo(zze, inputStream);
        }

        public static zzz zzn(ByteBuffer byteBuffer) throws zzgzm {
            return (zzz) zzgyx.zzbp(zze, byteBuffer);
        }

        public static zzz zzo(byte[] bArr) throws zzgzm {
            return (zzz) zzgyx.zzbq(zze, bArr);
        }

        public static zzz zzp(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
            return (zzz) zzgyx.zzbr(zze, zzgxpVar, zzgyhVar);
        }

        public static zzz zzq(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
            return (zzz) zzgyx.zzbs(zze, zzgxvVar, zzgyhVar);
        }

        public static zzz zzr(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
            return (zzz) zzgyx.zzbu(zze, inputStream, zzgyhVar);
        }

        public static zzz zzs(ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
            return (zzz) zzgyx.zzbv(zze, byteBuffer, zzgyhVar);
        }

        public static zzz zzt(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
            return (zzz) zzgyx.zzbx(zze, bArr, zzgyhVar);
        }

        public static zzhaq<zzz> zzv() {
            return zze.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
        public boolean zzA() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
        public boolean zzB() {
            return (this.zzg & 2) != 0;
        }

        public List<? extends zzao> zzC() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
        public int zza() {
            return this.zzi.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
        public zzq zzb() {
            zzq zzb2 = zzq.zzb(this.zzj);
            return zzb2 == null ? zzq.ENUM_FALSE : zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
        public zzv zzc() {
            zzv zzvVar = this.zzh;
            return zzvVar == null ? zzv.zzh() : zzvVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyx
        public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
            switch (zzgywVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgyx.zzbS(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzan.class, "zzj", zzq.zze(), "zzk"});
                case 3:
                    return new zzz();
                case 4:
                    return new zza();
                case 5:
                    return zze;
                case 6:
                    zzhaq<zzz> zzhaqVar = zzf;
                    if (zzhaqVar == null) {
                        synchronized (zzz.class) {
                            zzhaqVar = zzf;
                            if (zzhaqVar == null) {
                                zzhaqVar = new zzgys(zze);
                                zzf = zzhaqVar;
                            }
                        }
                    }
                    return zzhaqVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public zzao zzu(int i10) {
            return this.zzi.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
        public zzan zzw(int i10) {
            return this.zzi.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
        public zzap zzx() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
        public List<zzan> zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbs.zzaa
        public boolean zzz() {
            return (this.zzg & 1) != 0;
        }
    }

    private zzbbs() {
    }

    public static void zza(zzgyh zzgyhVar) {
    }
}
