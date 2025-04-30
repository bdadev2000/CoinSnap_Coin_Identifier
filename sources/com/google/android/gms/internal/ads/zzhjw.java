package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class zzhjw implements zzasr {
    private static final zzhkh zza = zzhkh.zzb(zzhjw.class);
    protected final String zzb;
    long zze;
    zzhkb zzg;
    private zzass zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    public zzhjw(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        String str;
        try {
            if (!this.zzd) {
                try {
                    zzhkh zzhkhVar = zza;
                    String str2 = this.zzb;
                    if (str2.length() != 0) {
                        str = "mem mapping ".concat(str2);
                    } else {
                        str = new String("mem mapping ");
                    }
                    zzhkhVar.zza(str);
                    this.zzi = this.zzg.zzd(this.zze, this.zzf);
                    this.zzd = true;
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zzb(zzhkb zzhkbVar, ByteBuffer byteBuffer, long j7, zzaso zzasoVar) throws IOException {
        this.zze = zzhkbVar.zzb();
        byteBuffer.remaining();
        this.zzf = j7;
        this.zzg = zzhkbVar;
        zzhkbVar.zze(zzhkbVar.zzb() + j7);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zzc(zzass zzassVar) {
        this.zzh = zzassVar;
    }

    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        String str;
        try {
            zzd();
            zzhkh zzhkhVar = zza;
            String str2 = this.zzb;
            if (str2.length() != 0) {
                str = "parsing details of ".concat(str2);
            } else {
                str = new String("parsing details of ");
            }
            zzhkhVar.zza(str);
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null) {
                this.zzc = true;
                byteBuffer.rewind();
                zzf(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.zzj = byteBuffer.slice();
                }
                this.zzi = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
