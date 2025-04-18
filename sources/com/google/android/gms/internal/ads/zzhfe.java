package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class zzhfe implements zzarc {
    private static final zzhfp zzg = zzhfp.zzb(zzhfe.class);
    protected final String zza;
    long zzd;
    zzhfj zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzhfe(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        String str;
        if (!this.zzc) {
            try {
                zzhfp zzhfpVar = zzg;
                String str2 = this.zza;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzhfpVar.zza(str);
                this.zzh = this.zzf.zzd(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzb(zzhfj zzhfjVar, ByteBuffer byteBuffer, long j3, zzaqz zzaqzVar) throws IOException {
        this.zzd = zzhfjVar.zzb();
        byteBuffer.remaining();
        this.zze = j3;
        this.zzf = zzhfjVar;
        zzhfjVar.zze(zzhfjVar.zzb() + j3);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        String str;
        zzc();
        zzhfp zzhfpVar = zzg;
        String str2 = this.zza;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzhfpVar.zza(str);
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
    }
}
