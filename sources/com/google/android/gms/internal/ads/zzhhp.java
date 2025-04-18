package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class zzhhp implements zzarp {
    private static final zzhia zzg = zzhia.zzb(zzhhp.class);
    protected final String zza;
    long zzd;
    zzhhu zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzhhp(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zzhia zzhiaVar = zzg;
                String str = this.zza;
                zzhiaVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zzd(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zzb(zzhhu zzhhuVar, ByteBuffer byteBuffer, long j2, zzarm zzarmVar) throws IOException {
        this.zzd = zzhhuVar.zzb();
        byteBuffer.remaining();
        this.zze = j2;
        this.zzf = zzhhuVar;
        zzhhuVar.zze(zzhhuVar.zzb() + j2);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zzhia zzhiaVar = zzg;
            String str = this.zza;
            zzhiaVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
