package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class zzaho {
    public byte[] zzN;
    public zzady zzT;
    public boolean zzU;
    public zzadx zzW;
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
    public zzadw zzi;
    public byte[] zzj;
    public zzw zzk;
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

    private static Pair zzf(zzed zzedVar) throws zzbh {
        try {
            zzedVar.zzM(16);
            long zzs = zzedVar.zzs();
            if (zzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzs == 859189832) {
                return new Pair(MimeTypes.VIDEO_H263, null);
            }
            if (zzs == 826496599) {
                int zzd = zzedVar.zzd() + 20;
                byte[] zzN = zzedVar.zzN();
                while (true) {
                    int length = zzN.length;
                    if (zzd < length - 4) {
                        int i10 = zzd + 1;
                        if (zzN[zzd] == 0 && zzN[i10] == 0 && zzN[zzd + 2] == 1 && zzN[zzd + 3] == 15) {
                            return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(zzN, zzd, length)));
                        }
                        zzd = i10;
                    } else {
                        throw zzbh.zza("Failed to find FourCC VC1 initialization data", null);
                    }
                }
            } else {
                zzdt.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbh.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbh {
        int i10;
        int i11;
        try {
            if (bArr[0] == 2) {
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    int i14 = bArr[i13];
                    i13++;
                    i10 = i14 & 255;
                    if (i10 != 255) {
                        break;
                    }
                    i12 += 255;
                }
                int i15 = i12 + i10;
                int i16 = 0;
                while (true) {
                    int i17 = bArr[i13];
                    i13++;
                    i11 = i17 & 255;
                    if (i11 != 255) {
                        break;
                    }
                    i16 += 255;
                }
                int i18 = i16 + i11;
                if (bArr[i13] == 1) {
                    byte[] bArr2 = new byte[i15];
                    System.arraycopy(bArr, i13, bArr2, 0, i15);
                    int i19 = i13 + i15;
                    if (bArr[i19] == 3) {
                        int i20 = i19 + i18;
                        if (bArr[i20] == 5) {
                            int length = bArr.length - i20;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i20, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbh.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzbh.zza("Error parsing vorbis codec private", null);
                }
                throw zzbh.zza("Error parsing vorbis codec private", null);
            }
            throw zzbh.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbh.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzed zzedVar) throws zzbh {
        UUID uuid;
        UUID uuid2;
        try {
            int zzk = zzedVar.zzk();
            if (zzk == 1) {
                return true;
            }
            if (zzk == 65534) {
                zzedVar.zzL(24);
                long zzt = zzedVar.zzt();
                uuid = zzahq.zze;
                if (zzt == uuid.getMostSignificantBits()) {
                    long zzt2 = zzedVar.zzt();
                    uuid2 = zzahq.zze;
                    if (zzt2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbh.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzbh {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbh.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x01a0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.zzacu r20, int r21) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaho.zze(com.google.android.gms.internal.ads.zzacu, int):void");
    }
}
