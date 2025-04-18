package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import java.util.List;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class zzgd {

    /* loaded from: classes3.dex */
    public static final class zza extends zzjt<zza, C0153zza> implements zzle {
        private static final zza zzc;
        private static volatile zzll<zza> zzd;
        private zzkc<zzb> zze = zzjt.zzch();

        /* renamed from: com.google.android.gms.internal.measurement.zzgd$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0153zza extends zzjt.zzb<zza, C0153zza> implements zzle {
            private C0153zza() {
                super(zza.zzc);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjt.zza((Class<zza>) zza.class, zzaVar);
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

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgf.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0153zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzb.class});
                case 4:
                    return zzc;
                case 5:
                    zzll<zza> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zza.class) {
                            zzllVar = zzd;
                            if (zzllVar == null) {
                                zzllVar = new zzjt.zza<>(zzc);
                                zzd = zzllVar;
                            }
                        }
                    }
                    return zzllVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzb extends zzjt<zzb, zza> implements zzle {
        private static final zzb zzc;
        private static volatile zzll<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzkc<zzd> zzg = zzjt.zzch();

        /* loaded from: classes3.dex */
        public static final class zza extends zzjt.zzb<zzb, zza> implements zzle {
            private zza() {
                super(zzb.zzc);
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjt.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public final String zzb() {
            return this.zzf;
        }

        public final List<zzd> zzc() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgf.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzb> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzb.class) {
                            zzllVar = zzd;
                            if (zzllVar == null) {
                                zzllVar = new zzjt.zza<>(zzc);
                                zzd = zzllVar;
                            }
                        }
                    }
                    return zzllVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzc extends zzjt<zzc, zza> implements zzle {
        private static final zzc zzc;
        private static volatile zzll<zzc> zzd;
        private int zze;
        private zzkc<zzd> zzf = zzjt.zzch();
        private zza zzg;

        /* loaded from: classes3.dex */
        public static final class zza extends zzjt.zzb<zzc, zza> implements zzle {
            private zza() {
                super(zzc.zzc);
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjt.zza((Class<zzc>) zzc.class, zzcVar);
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

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgf.zza[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzd.class, "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzc> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzc.class) {
                            zzllVar = zzd;
                            if (zzllVar == null) {
                                zzllVar = new zzjt.zza<>(zzc);
                                zzd = zzllVar;
                            }
                        }
                    }
                    return zzllVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzd extends zzjt<zzd, zzb> implements zzle {
        private static final zzd zzc;
        private static volatile zzll<zzd> zzd;
        private int zze;
        private int zzf;
        private zzkc<zzd> zzg = zzjt.zzch();
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        /* loaded from: classes3.dex */
        public enum zza implements zzjy {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);

            private final int zzg;

            zza(int i10) {
                this.zzg = i10;
            }

            public static zzjx zzb() {
                return zzgh.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzg;
            }

            public static zza zza(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return STRING;
                }
                if (i10 == 2) {
                    return NUMBER;
                }
                if (i10 == 3) {
                    return BOOLEAN;
                }
                if (i10 != 4) {
                    return null;
                }
                return STATEMENT;
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzb extends zzjt.zzb<zzd, zzb> implements zzle {
            private zzb() {
                super(zzd.zzc);
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjt.zza((Class<zzd>) zzd.class, zzdVar);
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
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzgf.zza[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzd> zzllVar = zzd;
                    if (zzllVar == null) {
                        synchronized (zzd.class) {
                            zzllVar = zzd;
                            if (zzllVar == null) {
                                zzllVar = new zzjt.zza<>(zzc);
                                zzd = zzllVar;
                            }
                        }
                    }
                    return zzllVar;
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
