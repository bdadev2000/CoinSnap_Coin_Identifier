package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zzcdx extends zzcdr implements zzhd {
    private static final AtomicInteger zzd = new AtomicInteger(0);
    private String zze;
    private final zzcce zzf;
    private boolean zzg;
    private final zzcdw zzh;
    private final zzcdb zzi;
    private ByteBuffer zzj;
    private boolean zzk;
    private final Object zzl;
    private final String zzm;
    private final int zzn;
    private boolean zzo;

    public zzcdx(zzccf zzccfVar, zzcce zzcceVar) {
        super(zzccfVar);
        String str;
        int i10;
        this.zzf = zzcceVar;
        this.zzh = new zzcdw();
        this.zzi = new zzcdb();
        this.zzl = new Object();
        if (zzccfVar != null) {
            str = zzccfVar.zzr();
        } else {
            str = null;
        }
        this.zzm = (String) zzfwo.zzd(str).zzb("");
        if (zzccfVar != null) {
            i10 = zzccfVar.zzf();
        } else {
            i10 = 0;
        }
        this.zzn = i10;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzx() {
        boolean z10;
        int zza = (int) this.zzh.zza();
        int zza2 = (int) this.zzi.zza(this.zzj);
        int position = this.zzj.position();
        int round = Math.round((position / zza) * zza2);
        int zzs = zzcbw.zzs();
        int zzu = zzcbw.zzu();
        String str = this.zze;
        String zzv = zzv(str);
        long j3 = round;
        if (round > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzn(str, zzv, position, zza, j3, zza2, z10, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzd.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zza(zzgd zzgdVar, zzgi zzgiVar, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzb(zzgd zzgdVar, zzgi zzgiVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzc(zzgd zzgdVar, zzgi zzgiVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzd(zzgd zzgdVar, zzgi zzgiVar, boolean z10) {
        if (zzgdVar instanceof zzgq) {
            this.zzh.zzb((zzgq) zzgdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzf() {
        this.zzg = true;
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzl) {
            ByteBuffer byteBuffer = this.zzj;
            if (byteBuffer != null && !this.zzk) {
                byteBuffer.flip();
                this.zzk = true;
            }
            this.zzg = true;
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzt(String str) {
        String str2;
        String str3;
        zzcdx zzcdxVar;
        String str4;
        String str5 = str;
        this.zze = str5;
        String zzv = zzv(str);
        int i10 = 0;
        try {
            zzgl zzglVar = new zzgl();
            zzglVar.zzf(this.zzb);
            zzglVar.zzc(this.zzf.zzd);
            zzglVar.zzd(this.zzf.zze);
            zzglVar.zzb(true);
            zzglVar.zze(this);
            zzgd zza = zzglVar.zza();
            if (this.zzf.zzi) {
                zza = new zzccz(this.zza, zza, this.zzm, this.zzn, null, null);
            }
            zza.zzb(new zzgi(Uri.parse(str), 0L, -1L, null));
            zzccf zzccfVar = (zzccf) this.zzc.get();
            if (zzccfVar != null) {
                zzccfVar.zzt(zzv, this);
            }
            Clock zzC = com.google.android.gms.ads.internal.zzv.zzC();
            long currentTimeMillis = zzC.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzI)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzH)).longValue();
            this.zzj = ByteBuffer.allocate(this.zzf.zzc);
            int i11 = 8192;
            byte[] bArr = new byte[8192];
            str2 = "error";
            long j3 = currentTimeMillis;
            while (true) {
                try {
                    int zza2 = zza.zza(bArr, i10, Math.min(this.zzj.remaining(), i11));
                    if (zza2 == -1) {
                        this.zzo = true;
                        zzj(str5, zzv, (int) this.zzi.zza(this.zzj));
                        return true;
                    }
                    synchronized (this.zzl) {
                        try {
                            if (!this.zzg) {
                                str5 = null;
                                this.zzj.put(bArr, 0, zza2);
                            }
                        } finally {
                            th = th;
                            str3 = str;
                            zzcdxVar = this;
                            while (true) {
                                try {
                                    try {
                                        break;
                                    } catch (Exception e2) {
                                        e = e2;
                                        str4 = str2;
                                        String m10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(e.getClass().getCanonicalName(), ":", e.getMessage());
                                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str3 + " Exception: " + m10);
                                        zzcdxVar.zzg(str3, zzv, str4, m10);
                                        return false;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    if (this.zzj.remaining() <= 0) {
                        zzx();
                        return true;
                    }
                    try {
                        if (!this.zzg) {
                            long currentTimeMillis2 = zzC.currentTimeMillis();
                            if (currentTimeMillis2 - j3 >= longValue) {
                                zzx();
                                j3 = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - currentTimeMillis <= 1000 * longValue2) {
                                i10 = 0;
                                i11 = 8192;
                                str5 = str;
                            } else {
                                throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                            }
                        } else {
                            throw new IOException("Precache abort at " + this.zzj.limit() + " bytes");
                        }
                    } catch (Exception e10) {
                        e = e10;
                        zzcdxVar = this;
                        str4 = str5;
                        str3 = str;
                        String m102 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(e.getClass().getCanonicalName(), ":", e.getMessage());
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str3 + " Exception: " + m102);
                        zzcdxVar.zzg(str3, zzv, str4, m102);
                        return false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str4 = str2;
                    String m1022 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(e.getClass().getCanonicalName(), ":", e.getMessage());
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str3 + " Exception: " + m1022);
                    zzcdxVar.zzg(str3, zzv, str4, m1022);
                    return false;
                }
            }
        } catch (Exception e12) {
            e = e12;
            str2 = "error";
        }
    }
}
