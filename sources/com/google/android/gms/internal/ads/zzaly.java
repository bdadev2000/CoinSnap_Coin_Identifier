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
/* loaded from: classes2.dex */
public final class zzaly implements zzafa {
    private final zzafa zza;
    private final zzalt zzb;

    @Nullable
    private zzalv zzh;
    private zzan zzi;
    private final zzalm zzc = new zzalm();
    private int zze = 0;
    private int zzf = 0;
    private byte[] zzg = zzgd.zzf;
    private final zzfu zzd = new zzfu();

    public zzaly(zzafa zzafaVar, zzalt zzaltVar) {
        this.zza = zzafaVar;
        this.zzb = zzaltVar;
    }

    private final void zzb(int i9) {
        byte[] bArr;
        int length = this.zzg.length;
        int i10 = this.zzf;
        if (length - i10 >= i9) {
            return;
        }
        int i11 = i10 - this.zze;
        int max = Math.max(i11 + i11, i9 + i11);
        byte[] bArr2 = this.zzg;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.zze, bArr, 0, i11);
        this.zze = 0;
        this.zzf = i11;
        this.zzg = bArr;
    }

    public final /* synthetic */ void zza(long j7, int i9, zzaln zzalnVar) {
        boolean z8;
        zzeq.zzb(this.zzi);
        zzgbc zzgbcVar = zzalnVar.zza;
        long j9 = zzalnVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgbcVar.size());
        Iterator<E> it = zzgbcVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzei) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(com.mbridge.msdk.foundation.controller.a.f15376a, arrayList);
        bundle.putLong("d", j9);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzfu zzfuVar = this.zzd;
        int length = marshall.length;
        zzfuVar.zzI(marshall, length);
        this.zza.zzq(this.zzd, length);
        long j10 = zzalnVar.zzb;
        if (j10 == C.TIME_UNSET) {
            if (this.zzi.zzr == Long.MAX_VALUE) {
                z8 = true;
            } else {
                z8 = false;
            }
            zzeq.zzf(z8);
        } else {
            long j11 = this.zzi.zzr;
            if (j11 == Long.MAX_VALUE) {
                j7 += j10;
            } else {
                j7 = j10 + j11;
            }
        }
        this.zza.zzs(j7, i9, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ int zzf(zzu zzuVar, int i9, boolean z8) {
        return zzaey.zza(this, zzuVar, i9, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzg(zzu zzuVar, int i9, boolean z8, int i10) throws IOException {
        if (this.zzh == null) {
            return this.zza.zzg(zzuVar, i9, z8, 0);
        }
        zzb(i9);
        int zza = zzuVar.zza(this.zzg, this.zzf, i9);
        if (zza == -1) {
            if (z8) {
                return -1;
            }
            throw new EOFException();
        }
        this.zzf += zza;
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzl(zzan zzanVar) {
        boolean z8;
        zzalv zzalvVar;
        String str = zzanVar.zzn;
        str.getClass();
        if (zzcg.zzb(str) == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        if (!zzanVar.equals(this.zzi)) {
            this.zzi = zzanVar;
            if (this.zzb.zzc(zzanVar)) {
                zzalvVar = this.zzb.zzb(zzanVar);
            } else {
                zzalvVar = null;
            }
            this.zzh = zzalvVar;
        }
        if (this.zzh == null) {
            this.zza.zzl(zzanVar);
            return;
        }
        zzafa zzafaVar = this.zza;
        zzal zzb = zzanVar.zzb();
        zzb.zzX("application/x-media3-cues");
        zzb.zzz(zzanVar.zzn);
        zzb.zzab(Long.MAX_VALUE);
        zzb.zzD(this.zzb.zza(zzanVar));
        zzafaVar.zzl(zzb.zzad());
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ void zzq(zzfu zzfuVar, int i9) {
        zzaey.zzb(this, zzfuVar, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzr(zzfu zzfuVar, int i9, int i10) {
        if (this.zzh == null) {
            this.zza.zzr(zzfuVar, i9, i10);
            return;
        }
        zzb(i9);
        zzfuVar.zzG(this.zzg, this.zzf, i9);
        this.zzf += i9;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzs(final long j7, final int i9, int i10, int i11, @Nullable zzaez zzaezVar) {
        boolean z8;
        if (this.zzh == null) {
            this.zza.zzs(j7, i9, i10, i11, zzaezVar);
            return;
        }
        if (zzaezVar == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zze(z8, "DRM on subtitles is not supported");
        int i12 = (this.zzf - i11) - i10;
        this.zzh.zza(this.zzg, i12, i10, zzalu.zza(), new zzev() { // from class: com.google.android.gms.internal.ads.zzalx
            @Override // com.google.android.gms.internal.ads.zzev
            public final void zza(Object obj) {
                zzaly.this.zza(j7, i9, (zzaln) obj);
            }
        });
        int i13 = i12 + i10;
        this.zze = i13;
        if (i13 == this.zzf) {
            this.zze = 0;
            this.zzf = 0;
        }
    }
}
