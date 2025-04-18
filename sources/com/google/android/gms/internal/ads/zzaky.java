package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaky implements zzaeh {
    private final zzaeh zza;
    private final zzakt zzb;

    @Nullable
    private zzakv zzg;
    private zzaf zzh;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzeu.zzf;
    private final zzek zzc = new zzek();

    public zzaky(zzaeh zzaehVar, zzakt zzaktVar) {
        this.zza = zzaehVar;
        this.zzb = zzaktVar;
    }

    private final void zzb(int i2) {
        int length = this.zzf.length;
        int i3 = this.zze;
        if (length - i3 >= i2) {
            return;
        }
        int i4 = i3 - this.zzd;
        int max = Math.max(i4 + i4, i2 + i4);
        byte[] bArr = this.zzf;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i4);
        this.zzd = 0;
        this.zze = i4;
        this.zzf = bArr2;
    }

    public final /* synthetic */ void zza(long j2, int i2, zzakn zzaknVar) {
        zzdi.zzb(this.zzh);
        zzgax zzgaxVar = zzaknVar.zza;
        long j3 = zzaknVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgaxVar.size());
        Iterator<E> it = zzgaxVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzdb) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzek zzekVar = this.zzc;
        int length = marshall.length;
        zzekVar.zzJ(marshall, length);
        this.zza.zzq(this.zzc, length);
        long j4 = zzaknVar.zzb;
        if (j4 == -9223372036854775807L) {
            zzdi.zzf(this.zzh.zzs == Long.MAX_VALUE);
        } else {
            long j5 = this.zzh.zzs;
            j2 = j5 == Long.MAX_VALUE ? j2 + j4 : j4 + j5;
        }
        this.zza.zzs(j2, i2, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ int zzf(zzp zzpVar, int i2, boolean z2) {
        return zzaef.zza(this, zzpVar, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final int zzg(zzp zzpVar, int i2, boolean z2, int i3) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zzpVar, i2, z2, 0);
        }
        zzb(i2);
        int zza = zzpVar.zza(this.zzf, this.zze, i2);
        if (zza != -1) {
            this.zze += zza;
            return zza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzl(zzaf zzafVar) {
        String str = zzafVar.zzn;
        str.getClass();
        zzdi.zzd(zzbn.zzb(str) == 3);
        if (!zzafVar.equals(this.zzh)) {
            this.zzh = zzafVar;
            this.zzg = this.zzb.zzc(zzafVar) ? this.zzb.zzb(zzafVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzl(zzafVar);
            return;
        }
        zzaeh zzaehVar = this.zza;
        zzad zzb = zzafVar.zzb();
        zzb.zzZ("application/x-media3-cues");
        zzb.zzA(zzafVar.zzn);
        zzb.zzad(Long.MAX_VALUE);
        zzb.zzE(this.zzb.zza(zzafVar));
        zzaehVar.zzl(zzb.zzaf());
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ void zzq(zzek zzekVar, int i2) {
        zzaef.zzb(this, zzekVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzr(zzek zzekVar, int i2, int i3) {
        if (this.zzg == null) {
            this.zza.zzr(zzekVar, i2, i3);
            return;
        }
        zzb(i2);
        zzekVar.zzH(this.zzf, this.zze, i2);
        this.zze += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzs(final long j2, final int i2, int i3, int i4, @Nullable zzaeg zzaegVar) {
        if (this.zzg == null) {
            this.zza.zzs(j2, i2, i3, i4, zzaegVar);
            return;
        }
        zzdi.zze(zzaegVar == null, "DRM on subtitles is not supported");
        int i5 = (this.zze - i4) - i3;
        this.zzg.zza(this.zzf, i5, i3, zzaku.zza(), new zzdn() { // from class: com.google.android.gms.internal.ads.zzakx
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
                zzaky.this.zza(j2, i2, (zzakn) obj);
            }
        });
        int i6 = i5 + i3;
        this.zzd = i6;
        if (i6 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
