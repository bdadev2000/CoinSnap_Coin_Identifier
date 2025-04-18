package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcq {
    private final zzgax zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzcq(zzgax zzgaxVar) {
        this.zza = zzgaxVar;
        zzcr zzcrVar = zzcr.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z2;
        do {
            int i2 = 0;
            z2 = false;
            while (i2 <= zzi()) {
                if (!this.zzc[i2].hasRemaining()) {
                    zzct zzctVar = (zzct) this.zzb.get(i2);
                    if (!zzctVar.zzh()) {
                        ByteBuffer byteBuffer2 = i2 > 0 ? this.zzc[i2 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzct.zza;
                        long remaining = byteBuffer2.remaining();
                        zzctVar.zze(byteBuffer2);
                        this.zzc[i2] = zzctVar.zzb();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z3 = true;
                        if (remaining2 <= 0 && !this.zzc[i2].hasRemaining()) {
                            z3 = false;
                        }
                        z2 |= z3;
                    } else if (!this.zzc[i2].hasRemaining() && i2 < zzi()) {
                        ((zzct) this.zzb.get(i2 + 1)).zzd();
                    }
                }
                i2++;
            }
        } while (z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcq)) {
            return false;
        }
        zzcq zzcqVar = (zzcq) obj;
        if (this.zza.size() != zzcqVar.zza.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            if (this.zza.get(i2) != zzcqVar.zza.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcr zza(zzcr zzcrVar) throws zzcs {
        if (zzcrVar.equals(zzcr.zza)) {
            throw new zzcs("Unhandled input format:", zzcrVar);
        }
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            zzct zzctVar = (zzct) this.zza.get(i2);
            zzcr zza = zzctVar.zza(zzcrVar);
            if (zzctVar.zzg()) {
                zzdi.zzf(!zza.equals(zzcr.zza));
                zzcrVar = zza;
            }
        }
        return zzcrVar;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzct.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzct.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = false;
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            zzct zzctVar = (zzct) this.zza.get(i2);
            zzctVar.zzc();
            if (zzctVar.zzg()) {
                this.zzb.add(zzctVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i3 = 0; i3 <= zzi(); i3++) {
            this.zzc[i3] = ((zzct) this.zzb.get(i3)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzct) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzd) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            zzct zzctVar = (zzct) this.zza.get(i2);
            zzctVar.zzc();
            zzctVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzcr zzcrVar = zzcr.zza;
        this.zzd = false;
    }

    public final boolean zzg() {
        return this.zzd && ((zzct) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
