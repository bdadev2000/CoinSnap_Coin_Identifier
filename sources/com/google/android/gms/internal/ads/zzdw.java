package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdw {
    private final zzgbc zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdx zzd;
    private zzdx zze;
    private boolean zzf;

    public zzdw(zzgbc zzgbcVar) {
        this.zza = zzgbcVar;
        zzdx zzdxVar = zzdx.zza;
        this.zzd = zzdxVar;
        this.zze = zzdxVar;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z8;
        ByteBuffer byteBuffer2;
        do {
            z8 = false;
            for (int i9 = 0; i9 <= zzi(); i9++) {
                if (!this.zzc[i9].hasRemaining()) {
                    zzdz zzdzVar = (zzdz) this.zzb.get(i9);
                    if (zzdzVar.zzh()) {
                        if (!this.zzc[i9].hasRemaining() && i9 < zzi()) {
                            ((zzdz) this.zzb.get(i9 + 1)).zzd();
                        }
                    } else {
                        if (i9 > 0) {
                            byteBuffer2 = this.zzc[i9 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = zzdz.zza;
                        }
                        long remaining = byteBuffer2.remaining();
                        zzdzVar.zze(byteBuffer2);
                        this.zzc[i9] = zzdzVar.zzb();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z9 = true;
                        if (remaining2 <= 0 && !this.zzc[i9].hasRemaining()) {
                            z9 = false;
                        }
                        z8 |= z9;
                    }
                }
            }
        } while (z8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdw)) {
            return false;
        }
        zzdw zzdwVar = (zzdw) obj;
        if (this.zza.size() != zzdwVar.zza.size()) {
            return false;
        }
        for (int i9 = 0; i9 < this.zza.size(); i9++) {
            if (this.zza.get(i9) != zzdwVar.zza.get(i9)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdx zza(zzdx zzdxVar) throws zzdy {
        if (!zzdxVar.equals(zzdx.zza)) {
            for (int i9 = 0; i9 < this.zza.size(); i9++) {
                zzdz zzdzVar = (zzdz) this.zza.get(i9);
                zzdx zza = zzdzVar.zza(zzdxVar);
                if (zzdzVar.zzg()) {
                    zzeq.zzf(!zza.equals(zzdx.zza));
                    zzdxVar = zza;
                }
            }
            this.zze = zzdxVar;
            return zzdxVar;
        }
        throw new zzdy("Unhandled input format:", zzdxVar);
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdz.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzdz.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i9 = 0; i9 < this.zza.size(); i9++) {
            zzdz zzdzVar = (zzdz) this.zza.get(i9);
            zzdzVar.zzc();
            if (zzdzVar.zzg()) {
                this.zzb.add(zzdzVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i10 = 0; i10 <= zzi(); i10++) {
            this.zzc[i10] = ((zzdz) this.zzb.get(i10)).zzb();
        }
    }

    public final void zzd() {
        if (zzh() && !this.zzf) {
            this.zzf = true;
            ((zzdz) this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (zzh() && !this.zzf) {
            zzj(byteBuffer);
        }
    }

    public final void zzf() {
        for (int i9 = 0; i9 < this.zza.size(); i9++) {
            zzdz zzdzVar = (zzdz) this.zza.get(i9);
            zzdzVar.zzc();
            zzdzVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzdx zzdxVar = zzdx.zza;
        this.zzd = zzdxVar;
        this.zze = zzdxVar;
        this.zzf = false;
    }

    public final boolean zzg() {
        if (this.zzf && ((zzdz) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        if (!this.zzb.isEmpty()) {
            return true;
        }
        return false;
    }
}
