package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcj {
    private final zzfzo zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzcj(zzfzo zzfzoVar) {
        this.zza = zzfzoVar;
        zzck zzckVar = zzck.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        do {
            z10 = false;
            for (int i10 = 0; i10 <= zzi(); i10++) {
                if (!this.zzc[i10].hasRemaining()) {
                    zzcm zzcmVar = (zzcm) this.zzb.get(i10);
                    if (zzcmVar.zzh()) {
                        if (!this.zzc[i10].hasRemaining() && i10 < zzi()) {
                            ((zzcm) this.zzb.get(i10 + 1)).zzd();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.zzc[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = zzcm.zza;
                        }
                        long remaining = byteBuffer2.remaining();
                        zzcmVar.zze(byteBuffer2);
                        this.zzc[i10] = zzcmVar.zzb();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z11 = true;
                        if (remaining2 <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    }
                }
            }
        } while (z10);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcj)) {
            return false;
        }
        zzcj zzcjVar = (zzcj) obj;
        if (this.zza.size() != zzcjVar.zza.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (this.zza.get(i10) != zzcjVar.zza.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzck zza(zzck zzckVar) throws zzcl {
        if (!zzckVar.equals(zzck.zza)) {
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                zzcm zzcmVar = (zzcm) this.zza.get(i10);
                zzck zza = zzcmVar.zza(zzckVar);
                if (zzcmVar.zzg()) {
                    zzdb.zzf(!zza.equals(zzck.zza));
                    zzckVar = zza;
                }
            }
            return zzckVar;
        }
        throw new zzcl("Unhandled input format:", zzckVar);
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzcm.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzcm.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = false;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzcm zzcmVar = (zzcm) this.zza.get(i10);
            zzcmVar.zzc();
            if (zzcmVar.zzg()) {
                this.zzb.add(zzcmVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i11 = 0; i11 <= zzi(); i11++) {
            this.zzc[i11] = ((zzcm) this.zzb.get(i11)).zzb();
        }
    }

    public final void zzd() {
        if (zzh() && !this.zzd) {
            this.zzd = true;
            ((zzcm) this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (zzh() && !this.zzd) {
            zzj(byteBuffer);
        }
    }

    public final void zzf() {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzcm zzcmVar = (zzcm) this.zza.get(i10);
            zzcmVar.zzc();
            zzcmVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzck zzckVar = zzck.zza;
        this.zzd = false;
    }

    public final boolean zzg() {
        if (this.zzd && ((zzcm) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
