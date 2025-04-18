package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzakl implements zzadx {
    private final zzadx zza;
    private final zzakg zzb;

    @Nullable
    private zzaki zzg;
    private zzad zzh;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzen.zzf;
    private final zzed zzc = new zzed();

    public zzakl(zzadx zzadxVar, zzakg zzakgVar) {
        this.zza = zzadxVar;
        this.zzb = zzakgVar;
    }

    private final void zzb(int i10) {
        byte[] bArr;
        int length = this.zzf.length;
        int i11 = this.zze;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.zzd;
        int max = Math.max(i12 + i12, i10 + i12);
        byte[] bArr2 = this.zzf;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.zzd, bArr, 0, i12);
        this.zzd = 0;
        this.zze = i12;
        this.zzf = bArr;
    }

    public final /* synthetic */ void zza(long j3, int i10, zzaka zzakaVar) {
        boolean z10;
        zzdb.zzb(this.zzh);
        zzfzo zzfzoVar = zzakaVar.zza;
        long j10 = zzakaVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfzoVar.size());
        Iterator<E> it = zzfzoVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzct) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(com.mbridge.msdk.foundation.controller.a.a, arrayList);
        bundle.putLong("d", j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzed zzedVar = this.zzc;
        int length = marshall.length;
        zzedVar.zzJ(marshall, length);
        this.zza.zzq(this.zzc, length);
        long j11 = zzakaVar.zzb;
        if (j11 == C.TIME_UNSET) {
            if (this.zzh.zzt == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzdb.zzf(z10);
        } else {
            long j12 = this.zzh.zzt;
            if (j12 == Long.MAX_VALUE) {
                j3 += j11;
            } else {
                j3 = j11 + j12;
            }
        }
        this.zza.zzs(j3, i10, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ int zzf(zzn zznVar, int i10, boolean z10) {
        return zzadv.zza(this, zznVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zzg(zzn zznVar, int i10, boolean z10, int i11) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zznVar, i10, z10, 0);
        }
        zzb(i10);
        int zza = zznVar.zza(this.zzf, this.zze, i10);
        if (zza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.zze += zza;
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzl(zzad zzadVar) {
        boolean z10;
        zzaki zzakiVar;
        String str = zzadVar.zzo;
        str.getClass();
        if (zzbg.zzb(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        if (!zzadVar.equals(this.zzh)) {
            this.zzh = zzadVar;
            if (this.zzb.zzc(zzadVar)) {
                zzakiVar = this.zzb.zzb(zzadVar);
            } else {
                zzakiVar = null;
            }
            this.zzg = zzakiVar;
        }
        if (this.zzg == null) {
            this.zza.zzl(zzadVar);
            return;
        }
        zzadx zzadxVar = this.zza;
        zzab zzb = zzadVar.zzb();
        zzb.zzZ("application/x-media3-cues");
        zzb.zzA(zzadVar.zzo);
        zzb.zzad(Long.MAX_VALUE);
        zzb.zzE(this.zzb.zza(zzadVar));
        zzadxVar.zzl(zzb.zzaf());
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ void zzq(zzed zzedVar, int i10) {
        zzadv.zzb(this, zzedVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzr(zzed zzedVar, int i10, int i11) {
        if (this.zzg == null) {
            this.zza.zzr(zzedVar, i10, i11);
            return;
        }
        zzb(i10);
        zzedVar.zzH(this.zzf, this.zze, i10);
        this.zze += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzs(final long j3, final int i10, int i11, int i12, @Nullable zzadw zzadwVar) {
        boolean z10;
        if (this.zzg == null) {
            this.zza.zzs(j3, i10, i11, i12, zzadwVar);
            return;
        }
        if (zzadwVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zze(z10, "DRM on subtitles is not supported");
        int i13 = (this.zze - i12) - i11;
        this.zzg.zza(this.zzf, i13, i11, zzakh.zza(), new zzdg() { // from class: com.google.android.gms.internal.ads.zzakk
            @Override // com.google.android.gms.internal.ads.zzdg
            public final void zza(Object obj) {
                zzakl.this.zza(j3, i10, (zzaka) obj);
            }
        });
        int i14 = i13 + i11;
        this.zzd = i14;
        if (i14 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
