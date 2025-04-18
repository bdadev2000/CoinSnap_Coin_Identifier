package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhdj extends zzgzs {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Opcodes.D2F, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgzs zzd;
    private final zzgzs zze;
    private final int zzf;
    private final int zzg;

    public static zzgzs zzC(zzgzs zzgzsVar, zzgzs zzgzsVar2) {
        if (zzgzsVar2.zzd() == 0) {
            return zzgzsVar;
        }
        if (zzgzsVar.zzd() == 0) {
            return zzgzsVar2;
        }
        int zzd = zzgzsVar2.zzd() + zzgzsVar.zzd();
        if (zzd < 128) {
            return zzD(zzgzsVar, zzgzsVar2);
        }
        if (zzgzsVar instanceof zzhdj) {
            zzhdj zzhdjVar = (zzhdj) zzgzsVar;
            if (zzgzsVar2.zzd() + zzhdjVar.zze.zzd() < 128) {
                return new zzhdj(zzhdjVar.zzd, zzD(zzhdjVar.zze, zzgzsVar2));
            }
            if (zzhdjVar.zzd.zzf() > zzhdjVar.zze.zzf() && zzhdjVar.zzg > zzgzsVar2.zzf()) {
                return new zzhdj(zzhdjVar.zzd, new zzhdj(zzhdjVar.zze, zzgzsVar2));
            }
        }
        return zzd >= zzc(Math.max(zzgzsVar.zzf(), zzgzsVar2.zzf()) + 1) ? new zzhdj(zzgzsVar, zzgzsVar2) : zzhdf.zza(new zzhdf(null), zzgzsVar, zzgzsVar2);
    }

    private static zzgzs zzD(zzgzs zzgzsVar, zzgzs zzgzsVar2) {
        int zzd = zzgzsVar.zzd();
        int zzd2 = zzgzsVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgzsVar.zzz(bArr, 0, 0, zzd);
        zzgzsVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzgzq(bArr);
    }

    public static int zzc(int i2) {
        int[] iArr = zza;
        int length = iArr.length;
        return i2 >= 47 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iArr[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgzs)) {
            return false;
        }
        zzgzs zzgzsVar = (zzgzs) obj;
        if (this.zzc != zzgzsVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgzsVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzhdg zzhdgVar = null;
        zzhdh zzhdhVar = new zzhdh(this, zzhdgVar);
        zzgzp next = zzhdhVar.next();
        zzhdh zzhdhVar2 = new zzhdh(zzgzsVar, zzhdgVar);
        zzgzp next2 = zzhdhVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int zzd = next.zzd() - i2;
            int zzd2 = next2.zzd() - i3;
            int min = Math.min(zzd, zzd2);
            if (!(i2 == 0 ? next.zzg(next2, i3, min) : next2.zzg(next, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.zzc;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzhdhVar.next();
                i2 = 0;
            } else {
                i2 += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzhdhVar2.next();
                i3 = 0;
            } else {
                i3 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzs, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhdd(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final byte zza(int i2) {
        zzgzs.zzy(i2, this.zzc);
        return zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final byte zzb(int i2) {
        int i3 = this.zzf;
        return i2 < i3 ? this.zzd.zzb(i2) : this.zze.zzb(i2 - i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final void zze(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.zzf;
        if (i5 <= i6) {
            this.zzd.zze(bArr, i2, i3, i4);
        } else {
            if (i2 >= i6) {
                this.zze.zze(bArr, i2 - i6, i3, i4);
                return;
            }
            int i7 = i6 - i2;
            this.zzd.zze(bArr, i2, i3, i7);
            this.zze.zze(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final int zzi(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.zzf;
        if (i5 <= i6) {
            return this.zzd.zzi(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.zze.zzi(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.zze.zzi(this.zzd.zzi(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final int zzj(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.zzf;
        if (i5 <= i6) {
            return this.zzd.zzj(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.zze.zzj(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.zze.zzj(this.zzd.zzj(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final zzgzs zzk(int i2, int i3) {
        int zzq = zzgzs.zzq(i2, i3, this.zzc);
        if (zzq == 0) {
            return zzgzs.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i4 = this.zzf;
        if (i3 <= i4) {
            return this.zzd.zzk(i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzk(i2 - i4, i3 - i4);
        }
        zzgzs zzgzsVar = this.zzd;
        return new zzhdj(zzgzsVar.zzk(i2, zzgzsVar.zzd()), this.zze.zzk(0, i3 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final zzhac zzl() {
        ArrayList arrayList = new ArrayList();
        byte b2 = 0;
        zzhdh zzhdhVar = new zzhdh(this, null);
        while (zzhdhVar.hasNext()) {
            arrayList.add(zzhdhVar.next().zzn());
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i3 += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzgzw(arrayList, i3, true, b2 == true ? 1 : 0) : zzhac.zzG(new zzhbu(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final void zzo(zzgzj zzgzjVar) throws IOException {
        this.zzd.zzo(zzgzjVar);
        this.zze.zzo(zzgzjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final boolean zzp() {
        zzgzs zzgzsVar = this.zzd;
        zzgzs zzgzsVar2 = this.zze;
        return zzgzsVar2.zzj(zzgzsVar.zzj(0, 0, this.zzf), 0, zzgzsVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    /* renamed from: zzs */
    public final zzgzn iterator() {
        return new zzhdd(this);
    }

    private zzhdj(zzgzs zzgzsVar, zzgzs zzgzsVar2) {
        this.zzd = zzgzsVar;
        this.zze = zzgzsVar2;
        int zzd = zzgzsVar.zzd();
        this.zzf = zzd;
        this.zzc = zzgzsVar2.zzd() + zzd;
        this.zzg = Math.max(zzgzsVar.zzf(), zzgzsVar2.zzf()) + 1;
    }
}
