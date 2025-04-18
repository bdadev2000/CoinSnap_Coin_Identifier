package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.measurement.internal.zzje;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zzgg extends zzh {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private long zzf;
    private List<String> zzg;
    private String zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private long zzm;
    private String zzn;

    public zzgg(zzhy zzhyVar, long j3) {
        super(zzhyVar);
        this.zzm = 0L;
        this.zzn = null;
        this.zzf = j3;
    }

    private final String zzah() {
        if (zzpz.zza() && zze().zza(zzbh.zzbr)) {
            zzj().zzp().zza("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    zzj().zzv().zza("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzj().zzw().zza("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final int zzaa() {
        zzu();
        return this.zzi;
    }

    public final int zzab() {
        zzu();
        return this.zzc;
    }

    public final String zzac() {
        zzu();
        return this.zzk;
    }

    public final String zzad() {
        zzu();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzae() {
        zzt();
        zzu();
        Preconditions.checkNotNull(this.zzj);
        return this.zzj;
    }

    public final List<String> zzaf() {
        return this.zzg;
    }

    public final void zzag() {
        String format;
        String str;
        zzt();
        if (!zzk().zzo().zza(zzje.zza.ANALYTICS_STORAGE)) {
            zzj().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            zzq().zzv().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzgq zzc = zzj().zzc();
        Object[] objArr = new Object[1];
        if (format == null) {
            str = AbstractJsonLexerKt.NULL;
        } else {
            str = "not null";
        }
        objArr[0] = str;
        zzc.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzl = format;
        this.zzm = zzb().currentTimeMillis();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0191 A[Catch: IllegalStateException -> 0x01c7, TryCatch #3 {IllegalStateException -> 0x01c7, blocks: (B:18:0x016c, B:21:0x0189, B:23:0x0191, B:25:0x01aa, B:27:0x01be, B:28:0x01c3, B:30:0x01c1), top: B:17:0x016c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01aa A[Catch: IllegalStateException -> 0x01c7, TryCatch #3 {IllegalStateException -> 0x01c7, blocks: (B:18:0x016c, B:21:0x0189, B:23:0x0191, B:25:0x01aa, B:27:0x01be, B:28:0x01c3, B:30:0x01c1), top: B:17:0x016c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    @Override // com.google.android.gms.measurement.internal.zzh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzx() {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgg.zzx():void");
    }

    @Override // com.google.android.gms.measurement.internal.zzh
    public final boolean zzz() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzo zza(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgg.zza(java.lang.String):com.google.android.gms.measurement.internal.zzo");
    }

    public final boolean zzb(String str) {
        String str2 = this.zzn;
        boolean z10 = (str2 == null || str2.equals(str)) ? false : true;
        this.zzn = str;
        return z10;
    }
}
