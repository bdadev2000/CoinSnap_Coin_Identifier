package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhba extends zzgxp {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgxp zzd;
    private final zzgxp zze;
    private final int zzf;
    private final int zzg;

    public static zzgxp zzC(zzgxp zzgxpVar, zzgxp zzgxpVar2) {
        if (zzgxpVar2.zzd() == 0) {
            return zzgxpVar;
        }
        if (zzgxpVar.zzd() == 0) {
            return zzgxpVar2;
        }
        int zzd = zzgxpVar2.zzd() + zzgxpVar.zzd();
        if (zzd < 128) {
            return zzD(zzgxpVar, zzgxpVar2);
        }
        if (zzgxpVar instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) zzgxpVar;
            if (zzgxpVar2.zzd() + zzhbaVar.zze.zzd() < 128) {
                return new zzhba(zzhbaVar.zzd, zzD(zzhbaVar.zze, zzgxpVar2));
            }
            if (zzhbaVar.zzd.zzf() > zzhbaVar.zze.zzf() && zzhbaVar.zzg > zzgxpVar2.zzf()) {
                return new zzhba(zzhbaVar.zzd, new zzhba(zzhbaVar.zze, zzgxpVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzgxpVar.zzf(), zzgxpVar2.zzf()) + 1)) {
            return new zzhba(zzgxpVar, zzgxpVar2);
        }
        return zzhax.zza(new zzhax(null), zzgxpVar, zzgxpVar2);
    }

    private static zzgxp zzD(zzgxp zzgxpVar, zzgxp zzgxpVar2) {
        int zzd = zzgxpVar.zzd();
        int zzd2 = zzgxpVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgxpVar.zzz(bArr, 0, 0, zzd);
        zzgxpVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzgxm(bArr);
    }

    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxp)) {
            return false;
        }
        zzgxp zzgxpVar = (zzgxp) obj;
        if (this.zzc != zzgxpVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgxpVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzhaz zzhazVar = null;
        zzhay zzhayVar = new zzhay(this, zzhazVar);
        zzgxl next = zzhayVar.next();
        zzhay zzhayVar2 = new zzhay(zzgxpVar, zzhazVar);
        zzgxl next2 = zzhayVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int zzd = next.zzd() - i10;
            int zzd2 = next2.zzd() - i11;
            int min = Math.min(zzd, zzd2);
            if (i10 == 0) {
                zzg = next.zzg(next2, i11, min);
            } else {
                zzg = next2.zzg(next, i10, min);
            }
            if (!zzg) {
                return false;
            }
            i12 += min;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzhayVar.next();
                i10 = 0;
            } else {
                i10 += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzhayVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxp, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhaw(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final byte zza(int i10) {
        zzgxp.zzy(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        if (i10 < i11) {
            return this.zzd.zzb(i10);
        }
        return this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzj(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzj(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final zzgxp zzk(int i10, int i11) {
        int zzq = zzgxp.zzq(i10, i11, this.zzc);
        if (zzq == 0) {
            return zzgxp.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzgxp zzgxpVar = this.zzd;
        return new zzhba(zzgxpVar.zzk(i10, zzgxpVar.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final zzgxv zzl() {
        ArrayList arrayList = new ArrayList();
        byte b3 = 0;
        zzhay zzhayVar = new zzhay(this, null);
        while (zzhayVar.hasNext()) {
            arrayList.add(zzhayVar.next().zzn());
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i11 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i10 |= 1;
            } else if (byteBuffer.isDirect()) {
                i10 |= 2;
            } else {
                i10 |= 4;
            }
        }
        if (i10 == 2) {
            return new zzgxr(arrayList, i11, true, b3 == true ? 1 : 0);
        }
        return zzgxv.zzG(new zzgzn(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final void zzo(zzgxg zzgxgVar) throws IOException {
        this.zzd.zzo(zzgxgVar);
        this.zze.zzo(zzgxgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean zzp() {
        zzgxp zzgxpVar = this.zzd;
        zzgxp zzgxpVar2 = this.zze;
        if (zzgxpVar2.zzj(zzgxpVar.zzj(0, 0, this.zzf), 0, zzgxpVar2.zzd()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    /* renamed from: zzs */
    public final zzgxk iterator() {
        return new zzhaw(this);
    }

    private zzhba(zzgxp zzgxpVar, zzgxp zzgxpVar2) {
        this.zzd = zzgxpVar;
        this.zze = zzgxpVar2;
        int zzd = zzgxpVar.zzd();
        this.zzf = zzd;
        this.zzc = zzgxpVar2.zzd() + zzd;
        this.zzg = Math.max(zzgxpVar.zzf(), zzgxpVar2.zzf()) + 1;
    }
}
