package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzaix {
    public byte[] zzN;
    public zzafb zzT;
    public boolean zzU;
    public zzafa zzW;
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
    public zzaez zzi;
    public byte[] zzj;
    public zzae zzk;
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

    private static Pair zzf(zzfu zzfuVar) throws zzch {
        try {
            zzfuVar.zzL(16);
            long zzs = zzfuVar.zzs();
            if (zzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzs == 859189832) {
                return new Pair(MimeTypes.VIDEO_H263, null);
            }
            if (zzs == 826496599) {
                int zzd = zzfuVar.zzd() + 20;
                byte[] zzM = zzfuVar.zzM();
                while (true) {
                    int length = zzM.length;
                    if (zzd < length - 4) {
                        int i9 = zzd + 1;
                        if (zzM[zzd] == 0 && zzM[i9] == 0 && zzM[zzd + 2] == 1 && zzM[zzd + 3] == 15) {
                            return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(zzM, zzd, length)));
                        }
                        zzd = i9;
                    } else {
                        throw zzch.zza("Failed to find FourCC VC1 initialization data", null);
                    }
                }
            } else {
                zzfk.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzch.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzch {
        int i9;
        int i10;
        try {
            if (bArr[0] == 2) {
                int i11 = 0;
                int i12 = 1;
                while (true) {
                    int i13 = bArr[i12];
                    i12++;
                    i9 = i13 & 255;
                    if (i9 != 255) {
                        break;
                    }
                    i11 += 255;
                }
                int i14 = i11 + i9;
                int i15 = 0;
                while (true) {
                    int i16 = bArr[i12];
                    i12++;
                    i10 = i16 & 255;
                    if (i10 != 255) {
                        break;
                    }
                    i15 += 255;
                }
                int i17 = i15 + i10;
                if (bArr[i12] == 1) {
                    byte[] bArr2 = new byte[i14];
                    System.arraycopy(bArr, i12, bArr2, 0, i14);
                    int i18 = i12 + i14;
                    if (bArr[i18] == 3) {
                        int i19 = i18 + i17;
                        if (bArr[i19] == 5) {
                            int length = bArr.length - i19;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i19, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzch.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzch.zza("Error parsing vorbis codec private", null);
                }
                throw zzch.zza("Error parsing vorbis codec private", null);
            }
            throw zzch.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzch.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzfu zzfuVar) throws zzch {
        UUID uuid;
        UUID uuid2;
        try {
            int zzk = zzfuVar.zzk();
            if (zzk == 1) {
                return true;
            }
            if (zzk == 65534) {
                zzfuVar.zzK(24);
                long zzt = zzfuVar.zzt();
                uuid = zzaiy.zzf;
                if (zzt == uuid.getMostSignificantBits()) {
                    long zzt2 = zzfuVar.zzt();
                    uuid2 = zzaiy.zzf;
                    if (zzt2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzch.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzch {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzch.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x019f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.zzadx r19, int r20) throws com.google.android.gms.internal.ads.zzch {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaix.zze(com.google.android.gms.internal.ads.zzadx, int):void");
    }
}
