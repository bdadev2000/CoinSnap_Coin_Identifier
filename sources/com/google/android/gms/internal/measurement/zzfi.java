package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzjk;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfi {

    /* loaded from: classes2.dex */
    public static final class zza extends zzjk<zza, zzb> implements zzkv {
        private static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private int zze;
        private boolean zzi;
        private zzjt<C0136zza> zzf = zzjk.zzcg();
        private zzjt<zzc> zzg = zzjk.zzcg();
        private zzjt<zzf> zzh = zzjk.zzcg();
        private zzjt<C0136zza> zzj = zzjk.zzcg();

        /* renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0136zza extends zzjk<C0136zza, C0137zza> implements zzkv {
            private static final C0136zza zzc;
            private static volatile zzlc<C0136zza> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0137zza extends zzjk.zzb<C0136zza, C0137zza> implements zzkv {
                private C0137zza() {
                    super(C0136zza.zzc);
                }

                public /* synthetic */ C0137zza(zzfk zzfkVar) {
                    this();
                }
            }

            static {
                C0136zza c0136zza = new C0136zza();
                zzc = c0136zza;
                zzjk.zza((Class<C0136zza>) C0136zza.class, c0136zza);
            }

            private C0136zza() {
            }

            public final zzd zzb() {
                zzd zza = zzd.zza(this.zzg);
                if (zza == null) {
                    return zzd.CONSENT_STATUS_UNSPECIFIED;
                }
                return zza;
            }

            public final zze zzc() {
                zze zza = zze.zza(this.zzf);
                if (zza == null) {
                    return zze.CONSENT_TYPE_UNSPECIFIED;
                }
                return zza;
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final Object zza(int i9, Object obj, Object obj2) {
                zzfk zzfkVar = null;
                switch (zzfk.zza[i9 - 1]) {
                    case 1:
                        return new C0136zza();
                    case 2:
                        return new C0137zza(zzfkVar);
                    case 3:
                        return zzjk.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zzd.zzb()});
                    case 4:
                        return zzc;
                    case 5:
                        zzlc<C0136zza> zzlcVar = zzd;
                        if (zzlcVar == null) {
                            synchronized (C0136zza.class) {
                                try {
                                    zzlcVar = zzd;
                                    if (zzlcVar == null) {
                                        zzlcVar = new zzjk.zza<>(zzc);
                                        zzd = zzlcVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzlcVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzb extends zzjk.zzb<zza, zzb> implements zzkv {
            private zzb() {
                super(zza.zzc);
            }

            public /* synthetic */ zzb(zzfk zzfkVar) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzc extends zzjk<zzc, C0138zza> implements zzkv {
            private static final zzc zzc;
            private static volatile zzlc<zzc> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zzc$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0138zza extends zzjk.zzb<zzc, C0138zza> implements zzkv {
                private C0138zza() {
                    super(zzc.zzc);
                }

                public /* synthetic */ C0138zza(zzfk zzfkVar) {
                    this();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzc = zzcVar;
                zzjk.zza((Class<zzc>) zzc.class, zzcVar);
            }

            private zzc() {
            }

            public final zze zzb() {
                zze zza = zze.zza(this.zzg);
                if (zza == null) {
                    return zze.CONSENT_TYPE_UNSPECIFIED;
                }
                return zza;
            }

            public final zze zzc() {
                zze zza = zze.zza(this.zzf);
                if (zza == null) {
                    return zze.CONSENT_TYPE_UNSPECIFIED;
                }
                return zza;
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final Object zza(int i9, Object obj, Object obj2) {
                zzfk zzfkVar = null;
                switch (zzfk.zza[i9 - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new C0138zza(zzfkVar);
                    case 3:
                        return zzjk.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zze.zzb()});
                    case 4:
                        return zzc;
                    case 5:
                        zzlc<zzc> zzlcVar = zzd;
                        if (zzlcVar == null) {
                            synchronized (zzc.class) {
                                try {
                                    zzlcVar = zzd;
                                    if (zzlcVar == null) {
                                        zzlcVar = new zzjk.zza<>(zzc);
                                        zzd = zzlcVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzlcVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* loaded from: classes2.dex */
        public enum zzd implements zzjp {
            CONSENT_STATUS_UNSPECIFIED(0),
            GRANTED(1),
            DENIED(2);

            private final int zze;

            zzd(int i9) {
                this.zze = i9;
            }

            public static zzjo zzb() {
                return zzfl.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int zza() {
                return this.zze;
            }

            public static zzd zza(int i9) {
                if (i9 == 0) {
                    return CONSENT_STATUS_UNSPECIFIED;
                }
                if (i9 == 1) {
                    return GRANTED;
                }
                if (i9 != 2) {
                    return null;
                }
                return DENIED;
            }
        }

        /* loaded from: classes2.dex */
        public enum zze implements zzjp {
            CONSENT_TYPE_UNSPECIFIED(0),
            AD_STORAGE(1),
            ANALYTICS_STORAGE(2),
            AD_USER_DATA(3),
            AD_PERSONALIZATION(4);

            private final int zzg;

            zze(int i9) {
                this.zzg = i9;
            }

            public static zzjo zzb() {
                return zzfm.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int zza() {
                return this.zzg;
            }

            public static zze zza(int i9) {
                if (i9 == 0) {
                    return CONSENT_TYPE_UNSPECIFIED;
                }
                if (i9 == 1) {
                    return AD_STORAGE;
                }
                if (i9 == 2) {
                    return ANALYTICS_STORAGE;
                }
                if (i9 == 3) {
                    return AD_USER_DATA;
                }
                if (i9 != 4) {
                    return null;
                }
                return AD_PERSONALIZATION;
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzf extends zzjk<zzf, C0139zza> implements zzkv {
            private static final zzf zzc;
            private static volatile zzlc<zzf> zzd;
            private int zze;
            private String zzf = "";
            private String zzg = "";

            /* renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zzf$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0139zza extends zzjk.zzb<zzf, C0139zza> implements zzkv {
                private C0139zza() {
                    super(zzf.zzc);
                }

                public /* synthetic */ C0139zza(zzfk zzfkVar) {
                    this();
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzc = zzfVar;
                zzjk.zza((Class<zzf>) zzf.class, zzfVar);
            }

            private zzf() {
            }

            public final String zzb() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final Object zza(int i9, Object obj, Object obj2) {
                zzfk zzfkVar = null;
                switch (zzfk.zza[i9 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0139zza(zzfkVar);
                    case 3:
                        return zzjk.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    case 4:
                        return zzc;
                    case 5:
                        zzlc<zzf> zzlcVar = zzd;
                        if (zzlcVar == null) {
                            synchronized (zzf.class) {
                                try {
                                    zzlcVar = zzd;
                                    if (zzlcVar == null) {
                                        zzlcVar = new zzjk.zza<>(zzc);
                                        zzd = zzlcVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzlcVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjk.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza zzb() {
            return zzc;
        }

        public final List<zzf> zzc() {
            return this.zzh;
        }

        public final List<C0136zza> zzd() {
            return this.zzf;
        }

        public final List<zzc> zze() {
            return this.zzg;
        }

        public final List<C0136zza> zzf() {
            return this.zzj;
        }

        public final boolean zzg() {
            return this.zzi;
        }

        public final boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfk zzfkVar = null;
            switch (zzfk.zza[i9 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb(zzfkVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", C0136zza.class, "zzg", zzc.class, "zzh", zzf.class, "zzi", "zzj", C0136zza.class});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zza> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzlcVar = zzd;
                                if (zzlcVar == null) {
                                    zzlcVar = new zzjk.zza<>(zzc);
                                    zzd = zzlcVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        private static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzjt<zzf> zzg = zzjk.zzcg();
        private boolean zzh;

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzb, zza> implements zzkv {
            private zza() {
                super(zzb.zzc);
            }

            public /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjk.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public final String zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfk zzfkVar = null;
            switch (zzfk.zza[i9 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzf.class, "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzb> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzlcVar = zzd;
                                if (zzlcVar == null) {
                                    zzlcVar = new zzjk.zza<>(zzc);
                                    zzd = zzlcVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzc extends zzjk<zzc, zza> implements zzkv {
        private static final zzc zzc;
        private static volatile zzlc<zzc> zzd;
        private int zze;
        private String zzf = "";
        private boolean zzg;
        private boolean zzh;
        private int zzi;

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
            }

            public final int zza() {
                return ((zzc) this.zza).zza();
            }

            public final String zzb() {
                return ((zzc) this.zza).zzc();
            }

            public final boolean zzc() {
                return ((zzc) this.zza).zzd();
            }

            public final boolean zzd() {
                return ((zzc) this.zza).zze();
            }

            public final boolean zze() {
                return ((zzc) this.zza).zzf();
            }

            public final boolean zzf() {
                return ((zzc) this.zza).zzg();
            }

            public final boolean zzg() {
                return ((zzc) this.zza).zzh();
            }

            public /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zza zza(String str) {
                zzak();
                ((zzc) this.zza).zza(str);
                return this;
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjk.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        public final int zza() {
            return this.zzi;
        }

        public final String zzc() {
            return this.zzf;
        }

        public final boolean zzd() {
            return this.zzg;
        }

        public final boolean zze() {
            return this.zzh;
        }

        public final boolean zzf() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzg() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzh() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfk zzfkVar = null;
            switch (zzfk.zza[i9 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzc> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzc.class) {
                            try {
                                zzlcVar = zzd;
                                if (zzlcVar == null) {
                                    zzlcVar = new zzjk.zza<>(zzc);
                                    zzd = zzlcVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzd extends zzjk<zzd, zza> implements zzkv {
        private static final zzd zzc;
        private static volatile zzlc<zzd> zzd;
        private int zze;
        private long zzf;
        private int zzh;
        private boolean zzm;
        private zza zzr;
        private zze zzs;
        private zzh zzt;
        private zzf zzu;
        private String zzg = "";
        private zzjt<zzg> zzi = zzjk.zzcg();
        private zzjt<zzc> zzj = zzjk.zzcg();
        private zzjt<zzff.zza> zzk = zzjk.zzcg();
        private String zzl = "";
        private zzjt<zzft.zzc> zzn = zzjk.zzcg();
        private zzjt<zzb> zzo = zzjk.zzcg();
        private String zzp = "";
        private String zzq = "";

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzd, zza> implements zzkv {
            private zza() {
                super(zzd.zzc);
            }

            public final int zza() {
                return ((zzd) this.zza).zzb();
            }

            public final zza zzb() {
                zzak();
                ((zzd) this.zza).zzt();
                return this;
            }

            public final String zzc() {
                return ((zzd) this.zza).zzj();
            }

            public final List<zzff.zza> zzd() {
                return Collections.unmodifiableList(((zzd) this.zza).zzk());
            }

            public final List<zzb> zze() {
                return Collections.unmodifiableList(((zzd) this.zza).zzl());
            }

            public /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zzc zza(int i9) {
                return ((zzd) this.zza).zza(i9);
            }

            public final zza zza(int i9, zzc.zza zzaVar) {
                zzak();
                ((zzd) this.zza).zza(i9, (zzc) ((zzjk) zzaVar.zzai()));
                return this;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjk.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zza zze() {
            return zzc.zzcb();
        }

        public static zzd zzg() {
            return zzc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzt() {
            this.zzk = zzjk.zzcg();
        }

        public final int zza() {
            return this.zzn.size();
        }

        public final int zzb() {
            return this.zzj.size();
        }

        public final long zzc() {
            return this.zzf;
        }

        public final zza zzd() {
            zza zzaVar = this.zzr;
            if (zzaVar == null) {
                return zza.zzb();
            }
            return zzaVar;
        }

        public final zzh zzh() {
            zzh zzhVar = this.zzt;
            if (zzhVar == null) {
                return zzh.zzc();
            }
            return zzhVar;
        }

        public final String zzi() {
            return this.zzg;
        }

        public final String zzj() {
            return this.zzp;
        }

        public final List<zzff.zza> zzk() {
            return this.zzk;
        }

        public final List<zzb> zzl() {
            return this.zzo;
        }

        public final List<zzft.zzc> zzm() {
            return this.zzn;
        }

        public final List<zzg> zzn() {
            return this.zzi;
        }

        public final boolean zzo() {
            return this.zzm;
        }

        public final boolean zzp() {
            if ((this.zze & 128) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzq() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzr() {
            if ((this.zze & 512) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzs() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final zzc zza(int i9) {
            return this.zzj.get(i9);
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfk zzfkVar = null;
            switch (zzfk.zza[i9 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzg.class, "zzj", zzc.class, "zzk", zzff.zza.class, "zzl", "zzm", "zzn", zzft.zzc.class, "zzo", zzb.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzd> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzd.class) {
                            try {
                                zzlcVar = zzd;
                                if (zzlcVar == null) {
                                    zzlcVar = new zzjk.zza<>(zzc);
                                    zzd = zzlcVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i9, zzc zzcVar) {
            zzcVar.getClass();
            zzjt<zzc> zzjtVar = this.zzj;
            if (!zzjtVar.zzc()) {
                this.zzj = zzjk.zza(zzjtVar);
            }
            this.zzj.set(i9, zzcVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class zze extends zzjk<zze, zza> implements zzkv {
        private static final zze zzc;
        private static volatile zzlc<zze> zzd;
        private int zze;
        private int zzf = 14;
        private int zzg = 11;
        private int zzh = 60;

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zze, zza> implements zzkv {
            private zza() {
                super(zze.zzc);
            }

            public /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjk.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfk zzfkVar = null;
            switch (zzfk.zza[i9 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zze> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zze.class) {
                            try {
                                zzlcVar = zzd;
                                if (zzlcVar == null) {
                                    zzlcVar = new zzjk.zza<>(zzc);
                                    zzd = zzlcVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzf extends zzjk<zzf, zza> implements zzkv {
        private static final zzf zzc;
        private static volatile zzlc<zzf> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzf, zza> implements zzkv {
            private zza() {
                super(zzf.zzc);
            }

            public /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjk.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfk zzfkVar = null;
            switch (zzfk.zza[i9 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzf> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzf.class) {
                            try {
                                zzlcVar = zzd;
                                if (zzlcVar == null) {
                                    zzlcVar = new zzjk.zza<>(zzc);
                                    zzd = zzlcVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzg extends zzjk<zzg, zza> implements zzkv {
        private static final zzg zzc;
        private static volatile zzlc<zzg> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzg, zza> implements zzkv {
            private zza() {
                super(zzg.zzc);
            }

            public /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzjk.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }

        public final String zzb() {
            return this.zzf;
        }

        public final String zzc() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfk zzfkVar = null;
            switch (zzfk.zza[i9 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzg> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzg.class) {
                            try {
                                zzlcVar = zzd;
                                if (zzlcVar == null) {
                                    zzlcVar = new zzjk.zza<>(zzc);
                                    zzd = zzlcVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzh extends zzjk<zzh, zza> implements zzkv {
        private static final zzh zzc;
        private static volatile zzlc<zzh> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzh, zza> implements zzkv {
            private zza() {
                super(zzh.zzc);
            }

            public /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzjk.zza((Class<zzh>) zzh.class, zzhVar);
        }

        private zzh() {
        }

        public static zzh zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zzi;
        }

        public final String zzd() {
            return this.zzg;
        }

        public final String zze() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfk zzfkVar = null;
            switch (zzfk.zza[i9 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzh> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzh.class) {
                            try {
                                zzlcVar = zzd;
                                if (zzlcVar == null) {
                                    zzlcVar = new zzjk.zza<>(zzc);
                                    zzd = zzlcVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
