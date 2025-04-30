package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzft {

    /* loaded from: classes2.dex */
    public static final class zza extends zzjk<zza, C0141zza> implements zzkv {
        private static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private zzjt<zzb> zze = zzjk.zzcg();

        /* renamed from: com.google.android.gms.internal.measurement.zzft$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0141zza extends zzjk.zzb<zza, C0141zza> implements zzkv {
            private C0141zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0141zza(zzfu zzfuVar) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjk.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zze.size();
        }

        public final List<zzb> zzd() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfu zzfuVar = null;
            switch (zzfu.zza[i9 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0141zza(zzfuVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzb.class});
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
        private zzjt<zzd> zzg = zzjk.zzcg();

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzb, zza> implements zzkv {
            private zza() {
                super(zzb.zzc);
            }

            public /* synthetic */ zza(zzfu zzfuVar) {
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

        public final List<zzd> zzc() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfu zzfuVar = null;
            switch (zzfu.zza[i9 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzfuVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
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
        private zzjt<zzd> zzf = zzjk.zzcg();
        private zza zzg;

        /* loaded from: classes2.dex */
        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
            }

            public /* synthetic */ zza(zzfu zzfuVar) {
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

        public final zza zza() {
            zza zzaVar = this.zzg;
            return zzaVar == null ? zza.zzc() : zzaVar;
        }

        public final List<zzd> zzc() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfu zzfuVar = null;
            switch (zzfu.zza[i9 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzfuVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzd.class, "zzg"});
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
    public static final class zzd extends zzjk<zzd, zzb> implements zzkv {
        private static final zzd zzc;
        private static volatile zzlc<zzd> zzd;
        private int zze;
        private int zzf;
        private zzjt<zzd> zzg = zzjk.zzcg();
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        /* loaded from: classes2.dex */
        public enum zza implements zzjp {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);

            private final int zzg;

            zza(int i9) {
                this.zzg = i9;
            }

            public static zzjo zzb() {
                return zzfw.zza;
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
                    return UNKNOWN;
                }
                if (i9 == 1) {
                    return STRING;
                }
                if (i9 == 2) {
                    return NUMBER;
                }
                if (i9 == 3) {
                    return BOOLEAN;
                }
                if (i9 != 4) {
                    return null;
                }
                return STATEMENT;
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzb extends zzjk.zzb<zzd, zzb> implements zzkv {
            private zzb() {
                super(zzd.zzc);
            }

            public /* synthetic */ zzb(zzfu zzfuVar) {
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

        public final double zza() {
            return this.zzk;
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            if (zza2 == null) {
                return zza.UNKNOWN;
            }
            return zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzi;
        }

        public final List<zzd> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i9, Object obj, Object obj2) {
            zzfu zzfuVar = null;
            switch (zzfu.zza[i9 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(zzfuVar);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk"});
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
