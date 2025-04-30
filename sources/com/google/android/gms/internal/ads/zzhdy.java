package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhdy extends zzhac {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzhac zzd;
    private final zzhac zze;
    private final int zzf;
    private final int zzg;

    public static zzhac zzD(zzhac zzhacVar, zzhac zzhacVar2) {
        if (zzhacVar2.zzd() == 0) {
            return zzhacVar;
        }
        if (zzhacVar.zzd() == 0) {
            return zzhacVar2;
        }
        int zzd = zzhacVar2.zzd() + zzhacVar.zzd();
        if (zzd < 128) {
            return zzE(zzhacVar, zzhacVar2);
        }
        if (zzhacVar instanceof zzhdy) {
            zzhdy zzhdyVar = (zzhdy) zzhacVar;
            if (zzhacVar2.zzd() + zzhdyVar.zze.zzd() < 128) {
                return new zzhdy(zzhdyVar.zzd, zzE(zzhdyVar.zze, zzhacVar2));
            }
            if (zzhdyVar.zzd.zzf() > zzhdyVar.zze.zzf() && zzhdyVar.zzg > zzhacVar2.zzf()) {
                return new zzhdy(zzhdyVar.zzd, new zzhdy(zzhdyVar.zze, zzhacVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzhacVar.zzf(), zzhacVar2.zzf()) + 1)) {
            return new zzhdy(zzhacVar, zzhacVar2);
        }
        return zzhdu.zza(new zzhdu(null), zzhacVar, zzhacVar2);
    }

    private static zzhac zzE(zzhac zzhacVar, zzhac zzhacVar2) {
        int zzd = zzhacVar.zzd();
        int zzd2 = zzhacVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzhacVar.zzA(bArr, 0, 0, zzd);
        zzhacVar2.zzA(bArr, 0, zzd, zzd2);
        return new zzgzy(bArr);
    }

    public static int zzc(int i9) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i9 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhac)) {
            return false;
        }
        zzhac zzhacVar = (zzhac) obj;
        if (this.zzc != zzhacVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzhacVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzhdv zzhdvVar = null;
        zzhdw zzhdwVar = new zzhdw(this, zzhdvVar);
        zzgzx next = zzhdwVar.next();
        zzhdw zzhdwVar2 = new zzhdw(zzhacVar, zzhdvVar);
        zzgzx next2 = zzhdwVar2.next();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int zzd = next.zzd() - i9;
            int zzd2 = next2.zzd() - i10;
            int min = Math.min(zzd, zzd2);
            if (i9 == 0) {
                zzg = next.zzg(next2, i10, min);
            } else {
                zzg = next2.zzg(next, i9, min);
            }
            if (!zzg) {
                return false;
            }
            i11 += min;
            int i12 = this.zzc;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzhdwVar.next();
                i9 = 0;
            } else {
                i9 += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzhdwVar2.next();
                i10 = 0;
            } else {
                i10 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhds(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final byte zza(int i9) {
        zzhac.zzz(i9, this.zzc);
        return zzb(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final byte zzb(int i9) {
        int i10 = this.zzf;
        if (i9 < i10) {
            return this.zzd.zzb(i9);
        }
        return this.zze.zzb(i9 - i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zze(byte[] bArr, int i9, int i10, int i11) {
        int i12 = i9 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            this.zzd.zze(bArr, i9, i10, i11);
        } else {
            if (i9 >= i13) {
                this.zze.zze(bArr, i9 - i13, i10, i11);
                return;
            }
            int i14 = i13 - i9;
            this.zzd.zze(bArr, i9, i10, i14);
            this.zze.zze(bArr, 0, i10 + i14, i11 - i14);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzh() {
        if (this.zzc >= zzc(this.zzg)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzi(int i9, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            return this.zzd.zzi(i9, i10, i11);
        }
        if (i10 >= i13) {
            return this.zze.zzi(i9, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.zze.zzi(this.zzd.zzi(i9, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzj(int i9, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            return this.zzd.zzj(i9, i10, i11);
        }
        if (i10 >= i13) {
            return this.zze.zzj(i9, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.zze.zzj(this.zzd.zzj(i9, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzhac zzk(int i9, int i10) {
        int zzq = zzhac.zzq(i9, i10, this.zzc);
        if (zzq == 0) {
            return zzhac.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzk(i9, i10);
        }
        if (i9 >= i11) {
            return this.zze.zzk(i9 - i11, i10 - i11);
        }
        zzhac zzhacVar = this.zzd;
        return new zzhdy(zzhacVar.zzk(i9, zzhacVar.zzd()), this.zze.zzk(0, i10 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzham zzl() {
        ArrayList arrayList = new ArrayList();
        byte b = 0;
        zzhdw zzhdwVar = new zzhdw(this, null);
        while (zzhdwVar.hasNext()) {
            arrayList.add(zzhdwVar.next().zzn());
        }
        Iterator it = arrayList.iterator();
        int i9 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i10 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i9 |= 1;
            } else if (byteBuffer.isDirect()) {
                i9 |= 2;
            } else {
                i9 |= 4;
            }
        }
        if (i9 == 2) {
            return new zzhag(arrayList, i10, true, b == true ? 1 : 0);
        }
        return zzham.zzI(new zzhce(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzm(Charset charset) {
        return new String(zzB(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzo(zzgzq zzgzqVar) throws IOException {
        this.zzd.zzo(zzgzqVar);
        this.zze.zzo(zzgzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzp() {
        zzhac zzhacVar = this.zzd;
        zzhac zzhacVar2 = this.zze;
        if (zzhacVar2.zzj(zzhacVar.zzj(0, 0, this.zzf), 0, zzhacVar2.zzd()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    /* renamed from: zzs */
    public final zzgzv iterator() {
        return new zzhds(this);
    }

    private zzhdy(zzhac zzhacVar, zzhac zzhacVar2) {
        this.zzd = zzhacVar;
        this.zze = zzhacVar2;
        int zzd = zzhacVar.zzd();
        this.zzf = zzd;
        this.zzc = zzhacVar2.zzd() + zzd;
        this.zzg = Math.max(zzhacVar.zzf(), zzhacVar2.zzf()) + 1;
    }
}
