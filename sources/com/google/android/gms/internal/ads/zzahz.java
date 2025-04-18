package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class zzahz {
    public byte[] zzN;
    public zzaei zzT;
    public boolean zzU;
    public zzaeh zzW;
    public int zzX;
    private int zzY;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaeg zzi;
    public byte[] zzj;
    public zzy zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzV = true;
    private String zzZ = "eng";

    private static Pair zzf(zzek zzekVar) throws zzbo {
        try {
            zzekVar.zzM(16);
            long zzs = zzekVar.zzs();
            if (zzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzs != 826496599) {
                zzea.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzd = zzekVar.zzd() + 20;
            byte[] zzN = zzekVar.zzN();
            while (true) {
                int length = zzN.length;
                if (zzd >= length - 4) {
                    throw zzbo.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i2 = zzd + 1;
                if (zzN[zzd] == 0 && zzN[i2] == 0 && zzN[zzd + 2] == 1 && zzN[zzd + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzN, zzd, length)));
                }
                zzd = i2;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbo.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbo {
        int i2;
        int i3;
        try {
            if (bArr[0] != 2) {
                throw zzbo.zza("Error parsing vorbis codec private", null);
            }
            int i4 = 0;
            int i5 = 1;
            while (true) {
                int i6 = bArr[i5];
                i5++;
                i2 = i6 & 255;
                if (i2 != 255) {
                    break;
                }
                i4 += 255;
            }
            int i7 = i4 + i2;
            int i8 = 0;
            while (true) {
                int i9 = bArr[i5];
                i5++;
                i3 = i9 & 255;
                if (i3 != 255) {
                    break;
                }
                i8 += 255;
            }
            int i10 = i8 + i3;
            if (bArr[i5] != 1) {
                throw zzbo.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, i5, bArr2, 0, i7);
            int i11 = i5 + i7;
            if (bArr[i11] != 3) {
                throw zzbo.zza("Error parsing vorbis codec private", null);
            }
            int i12 = i11 + i10;
            if (bArr[i12] != 5) {
                throw zzbo.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i12;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i12, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbo.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzek zzekVar) throws zzbo {
        UUID uuid;
        UUID uuid2;
        try {
            int zzk = zzekVar.zzk();
            if (zzk == 1) {
                return true;
            }
            if (zzk == 65534) {
                zzekVar.zzL(24);
                long zzt = zzekVar.zzt();
                uuid = zzaia.zze;
                if (zzt == uuid.getMostSignificantBits()) {
                    long zzt2 = zzekVar.zzt();
                    uuid2 = zzaia.zze;
                    if (zzt2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbo.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbo {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbo.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x019f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03da  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.zzade r19, int r20) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahz.zze(com.google.android.gms.internal.ads.zzade, int):void");
    }
}
