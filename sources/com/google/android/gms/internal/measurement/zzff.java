package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzff {

    /* loaded from: classes2.dex */
    public static final class zza extends zzjk<zza, C0135zza> implements zzkv {
        private static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private int zze;
        private int zzf;
        private zzjt<zze> zzg = zzjk.zzcg();
        private zzjt<zzb> zzh = zzjk.zzcg();
        private boolean zzi;
        private boolean zzj;

        /* renamed from: com.google.android.gms.internal.measurement.zzff$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0135zza extends zzjk.zzb<zza, C0135zza> implements zzkv {
            private C0135zza() {
                super(zza.zzc);
            }

            public final int zza() {
                return ((zza) this.zza).zzb();
            }

            public final int zzb() {
                return ((zza) this.zza).zzc();
            }

            public /* synthetic */ C0135zza(zzfg zzfgVar) {
                this();
            }

            public final C0135zza zza(int i9, zzb.zza zzaVar) {
                zzak();
                ((zza) this.zza).zza(i9, (zzb) ((zzjk) zzaVar.zzai()));
                return this;
            }

            public final zze zzb(int i9) {
                return ((zza) this.zza).zzb(i9);
            }

            public final C0135zza zza(int i9, zze.zza zzaVar) {
                zzak();
                ((zza) this.zza).zza(i9, (zze) ((zzjk) zzaVar.zzai()));
                return this;
            }

            public final zzb zza(int i9) {
                return ((zza) this.zza).zza(i9);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjk.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public final int zza() {
            return this.zzf;
        }

        public final int zzb() {
            return this.zzh.size();
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List<zzb> zze() {
            return this.zzh;
        }

        public final List<zze> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final zzb zza(int i9) {
            return this.zzh.get(i9);
        }

        public final zze zzb(int i9) {
            return this.zzg.get(i9);
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfg zzfgVar = null;
            switch (zzfg.zza[i9 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0135zza(zzfgVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i9, zzb zzbVar) {
            zzbVar.getClass();
            zzjt<zzb> zzjtVar = this.zzh;
            if (!zzjtVar.zzc()) {
                this.zzh = zzjk.zza(zzjtVar);
            }
            this.zzh.set(i9, zzbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i9, zze zzeVar) {
            zzeVar.getClass();
            zzjt<zze> zzjtVar = this.zzg;
            if (!zzjtVar.zzc()) {
                this.zzg = zzjk.zza(zzjtVar);
            }
            this.zzg.set(i9, zzeVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        private static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzjt<zzc> zzh = zzjk.zzcg();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzb, zza> implements zzkv {
            private zza() {
                super(zzb.zzc);
            }

            public final int zza() {
                return ((zzb) this.zza).zza();
            }

            public final String zzb() {
                return ((zzb) this.zza).zzf();
            }

            public /* synthetic */ zza(zzfg zzfgVar) {
                this();
            }

            public final zza zza(String str) {
                zzak();
                ((zzb) this.zza).zza(str);
                return this;
            }

            public final zza zza(int i9, zzc zzcVar) {
                zzak();
                ((zzb) this.zza).zza(i9, zzcVar);
                return this;
            }

            public final zzc zza(int i9) {
                return ((zzb) this.zza).zza(i9);
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjk.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zzc() {
            return zzc.zzcb();
        }

        public final int zza() {
            return this.zzh.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final zzd zze() {
            zzd zzdVar = this.zzj;
            if (zzdVar == null) {
                return zzd.zzc();
            }
            return zzdVar;
        }

        public final String zzf() {
            return this.zzg;
        }

        public final List<zzc> zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzl() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzm() {
            if ((this.zze & 64) != 0) {
                return true;
            }
            return false;
        }

        public final zzc zza(int i9) {
            return this.zzh.get(i9);
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfg zzfgVar = null;
            switch (zzfg.zza[i9 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzfgVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i9, zzc zzcVar) {
            zzcVar.getClass();
            zzjt<zzc> zzjtVar = this.zzh;
            if (!zzjtVar.zzc()) {
                this.zzh = zzjk.zza(zzjtVar);
            }
            this.zzh.set(i9, zzcVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzc extends zzjk<zzc, zza> implements zzkv {
        private static final zzc zzc;
        private static volatile zzlc<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
            }

            public final zza zza(String str) {
                zzak();
                ((zzc) this.zza).zza(str);
                return this;
            }

            public /* synthetic */ zza(zzfg zzfgVar) {
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

        public static zzc zzb() {
            return zzc;
        }

        public final zzd zzc() {
            zzd zzdVar = this.zzg;
            if (zzdVar == null) {
                return zzd.zzc();
            }
            return zzdVar;
        }

        public final zzf zzd() {
            zzf zzfVar = this.zzf;
            if (zzfVar == null) {
                return zzf.zzd();
            }
            return zzfVar;
        }

        public final String zze() {
            return this.zzi;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzh() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfg zzfgVar = null;
            switch (zzfg.zza[i9 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzfgVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
            this.zze |= 8;
            this.zzi = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zze extends zzjk<zze, zza> implements zzkv {
        private static final zze zzc;
        private static volatile zzlc<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zze, zza> implements zzkv {
            private zza() {
                super(zze.zzc);
            }

            public final zza zza(String str) {
                zzak();
                ((zze) this.zza).zza(str);
                return this;
            }

            public /* synthetic */ zza(zzfg zzfgVar) {
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

        public static zza zzc() {
            return zzc.zzcb();
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzc zzb() {
            zzc zzcVar = this.zzh;
            if (zzcVar == null) {
                return zzc.zzb();
            }
            return zzcVar;
        }

        public final String zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfg zzfgVar = null;
            switch (zzfg.zza[i9 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzfgVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzf extends zzjk<zzf, zzb> implements zzkv {
        private static final zzf zzc;
        private static volatile zzlc<zzf> zzd;
        private int zze;
        private int zzf;
        private boolean zzh;
        private String zzg = "";
        private zzjt<String> zzi = zzjk.zzcg();

        /* loaded from: classes2.dex */
        public enum zza implements zzjp {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);

            private final int zzi;

            zza(int i9) {
                this.zzi = i9;
            }

            public static zzjo zzb() {
                return zzfj.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int zza() {
                return this.zzi;
            }

            public static zza zza(int i9) {
                switch (i9) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzb extends zzjk.zzb<zzf, zzb> implements zzkv {
            private zzb() {
                super(zzf.zzc);
            }

            public /* synthetic */ zzb(zzfg zzfgVar) {
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

        public static zzf zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzi.size();
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            if (zza2 == null) {
                return zza.UNKNOWN_MATCH_TYPE;
            }
            return zza2;
        }

        public final String zze() {
            return this.zzg;
        }

        public final List<String> zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfg zzfgVar = null;
            switch (zzfg.zza[i9 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(zzfgVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi"});
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
    public static final class zzd extends zzjk<zzd, zzb> implements zzkv {
        private static final zzd zzc;
        private static volatile zzlc<zzd> zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        /* loaded from: classes2.dex */
        public enum zza implements zzjp {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);

            private final int zzg;

            zza(int i9) {
                this.zzg = i9;
            }

            public static zzjo zzb() {
                return zzfh.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int zza() {
                return this.zzg;
            }

            public static zza zza(int i9) {
                if (i9 == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i9 == 1) {
                    return LESS_THAN;
                }
                if (i9 == 2) {
                    return GREATER_THAN;
                }
                if (i9 == 3) {
                    return EQUAL;
                }
                if (i9 != 4) {
                    return null;
                }
                return BETWEEN;
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzb extends zzjk.zzb<zzd, zzb> implements zzkv {
            private zzb() {
                super(zzd.zzc);
            }

            public /* synthetic */ zzb(zzfg zzfgVar) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjk.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zzd zzc() {
            return zzc;
        }

        public final zza zza() {
            zza zza2 = zza.zza(this.zzf);
            return zza2 == null ? zza.UNKNOWN_COMPARISON_TYPE : zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzj;
        }

        public final String zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzk() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzl() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfg zzfgVar = null;
            switch (zzfg.zza[i9 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(zzfgVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi", "zzj"});
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
    }
}
