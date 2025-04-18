package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzajy extends zzajw {

    @Nullable
    private zzajx zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzaec zzd;

    @Nullable
    private zzaea zze;

    @Override // com.google.android.gms.internal.ads.zzajw
    public final long zza(zzed zzedVar) {
        int i10;
        int i11 = 0;
        if ((zzedVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b3 = zzedVar.zzN()[0];
        zzajx zzajxVar = this.zza;
        zzdb.zzb(zzajxVar);
        if (!zzajxVar.zzd[(b3 >> 1) & (255 >>> (8 - zzajxVar.zze))].zza) {
            i10 = zzajxVar.zza.zze;
        } else {
            i10 = zzajxVar.zza.zzf;
        }
        if (this.zzc) {
            i11 = (this.zzb + i10) / 4;
        }
        if (zzedVar.zzc() < zzedVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzedVar.zzN(), zzedVar.zze() + 4);
            zzedVar.zzJ(copyOf, copyOf.length);
        } else {
            zzedVar.zzK(zzedVar.zze() + 4);
        }
        long j3 = i11;
        byte[] zzN = zzedVar.zzN();
        zzN[zzedVar.zze() - 4] = (byte) (j3 & 255);
        zzN[zzedVar.zze() - 3] = (byte) ((j3 >>> 8) & 255);
        zzN[zzedVar.zze() - 2] = (byte) ((j3 >>> 16) & 255);
        zzN[zzedVar.zze() - 1] = (byte) ((j3 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final boolean zzc(zzed zzedVar, long j3, zzajt zzajtVar) throws IOException {
        zzajx zzajxVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zzaec zzaecVar;
        long j10;
        int i15;
        int i16;
        int i17;
        boolean z10;
        if (this.zza != null) {
            zzajtVar.zza.getClass();
            return false;
        }
        zzaec zzaecVar2 = this.zzd;
        int i18 = 4;
        if (zzaecVar2 == null) {
            zzaed.zzd(1, zzedVar, false);
            int zzj = zzedVar.zzj();
            int zzm = zzedVar.zzm();
            int zzj2 = zzedVar.zzj();
            int zzi = zzedVar.zzi();
            if (zzi <= 0) {
                i15 = -1;
            } else {
                i15 = zzi;
            }
            int zzi2 = zzedVar.zzi();
            if (zzi2 <= 0) {
                i16 = -1;
            } else {
                i16 = zzi2;
            }
            int zzi3 = zzedVar.zzi();
            if (zzi3 <= 0) {
                i17 = -1;
            } else {
                i17 = zzi3;
            }
            int zzm2 = zzedVar.zzm();
            int pow = (int) Math.pow(2.0d, zzm2 & 15);
            int pow2 = (int) Math.pow(2.0d, (zzm2 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
            if (1 != (zzedVar.zzm() & 1)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.zzd = new zzaec(zzj, zzm, zzj2, i15, i16, i17, pow, pow2, z10, Arrays.copyOf(zzedVar.zzN(), zzedVar.zze()));
        } else {
            zzaea zzaeaVar = this.zze;
            if (zzaeaVar == null) {
                this.zze = zzaed.zzc(zzedVar, true, true);
            } else {
                byte[] bArr = new byte[zzedVar.zze()];
                System.arraycopy(zzedVar.zzN(), 0, bArr, 0, zzedVar.zze());
                int i19 = zzaecVar2.zza;
                int i20 = 5;
                zzaed.zzd(5, zzedVar, false);
                int zzm3 = zzedVar.zzm() + 1;
                zzadz zzadzVar = new zzadz(zzedVar.zzN());
                zzadzVar.zzc(zzedVar.zzd() * 8);
                int i21 = 0;
                while (true) {
                    int i22 = 2;
                    int i23 = 16;
                    if (i21 < zzm3) {
                        if (zzadzVar.zzb(24) == 5653314) {
                            int zzb = zzadzVar.zzb(16);
                            int zzb2 = zzadzVar.zzb(24);
                            if (!zzadzVar.zzd()) {
                                boolean zzd = zzadzVar.zzd();
                                for (int i24 = 0; i24 < zzb2; i24++) {
                                    if (zzd) {
                                        if (zzadzVar.zzd()) {
                                            zzadzVar.zzc(5);
                                        }
                                    } else {
                                        zzadzVar.zzc(5);
                                    }
                                }
                            } else {
                                zzadzVar.zzc(5);
                                for (int i25 = 0; i25 < zzb2; i25 += zzadzVar.zzb(zzaed.zza(zzb2 - i25))) {
                                }
                            }
                            int zzb3 = zzadzVar.zzb(i18);
                            if (zzb3 <= 2) {
                                if (zzb3 != 1) {
                                    if (zzb3 != 2) {
                                        zzaecVar = zzaecVar2;
                                        i21++;
                                        zzaecVar2 = zzaecVar;
                                        i18 = 4;
                                    }
                                } else {
                                    i22 = zzb3;
                                }
                                zzadzVar.zzc(32);
                                zzadzVar.zzc(32);
                                int zzb4 = zzadzVar.zzb(i18) + 1;
                                zzadzVar.zzc(1);
                                if (i22 == 1) {
                                    if (zzb != 0) {
                                        zzaecVar = zzaecVar2;
                                        j10 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                                    } else {
                                        zzaecVar = zzaecVar2;
                                        j10 = 0;
                                    }
                                } else {
                                    zzaecVar = zzaecVar2;
                                    j10 = zzb * zzb2;
                                }
                                zzadzVar.zzc((int) (j10 * zzb4));
                                i21++;
                                zzaecVar2 = zzaecVar;
                                i18 = 4;
                            } else {
                                throw zzbh.zza("lookup type greater than 2 not decodable: " + zzb3, null);
                            }
                        } else {
                            throw zzbh.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzadzVar.zza(), null);
                        }
                    } else {
                        zzaec zzaecVar3 = zzaecVar2;
                        int i26 = 6;
                        int zzb5 = zzadzVar.zzb(6) + 1;
                        for (int i27 = 0; i27 < zzb5; i27++) {
                            if (zzadzVar.zzb(16) != 0) {
                                throw zzbh.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i28 = 1;
                        int zzb6 = zzadzVar.zzb(6) + 1;
                        int i29 = 0;
                        while (true) {
                            int i30 = 3;
                            if (i29 < zzb6) {
                                int zzb7 = zzadzVar.zzb(i23);
                                if (zzb7 != 0) {
                                    if (zzb7 == i28) {
                                        int zzb8 = zzadzVar.zzb(i20);
                                        int[] iArr = new int[zzb8];
                                        int i31 = -1;
                                        for (int i32 = 0; i32 < zzb8; i32++) {
                                            int zzb9 = zzadzVar.zzb(4);
                                            iArr[i32] = zzb9;
                                            if (zzb9 > i31) {
                                                i31 = zzb9;
                                            }
                                        }
                                        int i33 = i31 + 1;
                                        int[] iArr2 = new int[i33];
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            iArr2[i34] = zzadzVar.zzb(i30) + 1;
                                            int zzb10 = zzadzVar.zzb(i22);
                                            if (zzb10 > 0) {
                                                i14 = 8;
                                                zzadzVar.zzc(8);
                                            } else {
                                                i14 = 8;
                                            }
                                            int i35 = zzb6;
                                            int i36 = 0;
                                            for (int i37 = 1; i36 < (i37 << zzb10); i37 = 1) {
                                                zzadzVar.zzc(i14);
                                                i36++;
                                                i14 = 8;
                                            }
                                            i34++;
                                            zzb6 = i35;
                                            i22 = 2;
                                            i30 = 3;
                                        }
                                        i13 = zzb6;
                                        zzadzVar.zzc(i22);
                                        int zzb11 = zzadzVar.zzb(4);
                                        int i38 = 0;
                                        int i39 = 0;
                                        for (int i40 = 0; i40 < zzb8; i40++) {
                                            i38 += iArr2[iArr[i40]];
                                            while (i39 < i38) {
                                                zzadzVar.zzc(zzb11);
                                                i39++;
                                            }
                                        }
                                    } else {
                                        throw zzbh.zza("floor type greater than 1 not decodable: " + zzb7, null);
                                    }
                                } else {
                                    i13 = zzb6;
                                    int i41 = 8;
                                    zzadzVar.zzc(8);
                                    zzadzVar.zzc(16);
                                    zzadzVar.zzc(16);
                                    zzadzVar.zzc(6);
                                    zzadzVar.zzc(8);
                                    int zzb12 = zzadzVar.zzb(4) + 1;
                                    int i42 = 0;
                                    while (i42 < zzb12) {
                                        zzadzVar.zzc(i41);
                                        i42++;
                                        i41 = 8;
                                    }
                                }
                                i29++;
                                zzb6 = i13;
                                i26 = 6;
                                i23 = 16;
                                i22 = 2;
                                i28 = 1;
                                i20 = 5;
                            } else {
                                int i43 = 1;
                                int zzb13 = zzadzVar.zzb(i26) + 1;
                                int i44 = 0;
                                while (i44 < zzb13) {
                                    if (zzadzVar.zzb(16) <= 2) {
                                        zzadzVar.zzc(24);
                                        zzadzVar.zzc(24);
                                        zzadzVar.zzc(24);
                                        int zzb14 = zzadzVar.zzb(i26) + i43;
                                        int i45 = 8;
                                        zzadzVar.zzc(8);
                                        int[] iArr3 = new int[zzb14];
                                        for (int i46 = 0; i46 < zzb14; i46++) {
                                            int zzb15 = zzadzVar.zzb(3);
                                            if (zzadzVar.zzd()) {
                                                i12 = zzadzVar.zzb(5);
                                            } else {
                                                i12 = 0;
                                            }
                                            iArr3[i46] = (i12 * 8) + zzb15;
                                        }
                                        int i47 = 0;
                                        while (i47 < zzb14) {
                                            int i48 = 0;
                                            while (i48 < i45) {
                                                if ((iArr3[i47] & (1 << i48)) != 0) {
                                                    zzadzVar.zzc(i45);
                                                }
                                                i48++;
                                                i45 = 8;
                                            }
                                            i47++;
                                            i45 = 8;
                                        }
                                        i44++;
                                        i26 = 6;
                                        i43 = 1;
                                    } else {
                                        throw zzbh.zza("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int zzb16 = zzadzVar.zzb(i26) + 1;
                                for (int i49 = 0; i49 < zzb16; i49++) {
                                    int zzb17 = zzadzVar.zzb(16);
                                    if (zzb17 != 0) {
                                        zzdt.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb17);
                                    } else {
                                        if (zzadzVar.zzd()) {
                                            i10 = 1;
                                            i11 = zzadzVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            i11 = 1;
                                        }
                                        if (zzadzVar.zzd()) {
                                            int zzb18 = zzadzVar.zzb(8) + i10;
                                            for (int i50 = 0; i50 < zzb18; i50++) {
                                                int i51 = i19 - 1;
                                                zzadzVar.zzc(zzaed.zza(i51));
                                                zzadzVar.zzc(zzaed.zza(i51));
                                            }
                                        }
                                        if (zzadzVar.zzb(2) == 0) {
                                            if (i11 > 1) {
                                                for (int i52 = 0; i52 < i19; i52++) {
                                                    zzadzVar.zzc(4);
                                                }
                                            }
                                            for (int i53 = 0; i53 < i11; i53++) {
                                                zzadzVar.zzc(8);
                                                zzadzVar.zzc(8);
                                                zzadzVar.zzc(8);
                                            }
                                        } else {
                                            throw zzbh.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int zzb19 = zzadzVar.zzb(6) + 1;
                                zzaeb[] zzaebVarArr = new zzaeb[zzb19];
                                for (int i54 = 0; i54 < zzb19; i54++) {
                                    zzaebVarArr[i54] = new zzaeb(zzadzVar.zzd(), zzadzVar.zzb(16), zzadzVar.zzb(16), zzadzVar.zzb(8));
                                }
                                if (zzadzVar.zzd()) {
                                    zzajxVar = new zzajx(zzaecVar3, zzaeaVar, bArr, zzaebVarArr, zzaed.zza(zzb19 - 1));
                                } else {
                                    throw zzbh.zza("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        zzajxVar = null;
        this.zza = zzajxVar;
        if (zzajxVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaec zzaecVar4 = zzajxVar.zza;
        arrayList.add(zzaecVar4.zzg);
        arrayList.add(zzajxVar.zzc);
        zzbd zzb20 = zzaed.zzb(zzfzo.zzm(zzajxVar.zzb.zza));
        zzab zzabVar = new zzab();
        zzabVar.zzZ(MimeTypes.AUDIO_VORBIS);
        zzabVar.zzy(zzaecVar4.zzd);
        zzabVar.zzU(zzaecVar4.zzc);
        zzabVar.zzz(zzaecVar4.zza);
        zzabVar.zzaa(zzaecVar4.zzb);
        zzabVar.zzM(arrayList);
        zzabVar.zzS(zzb20);
        zzajtVar.zza = zzabVar.zzaf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzi(long j3) {
        super.zzi(j3);
        this.zzc = j3 != 0;
        zzaec zzaecVar = this.zzd;
        this.zzb = zzaecVar != null ? zzaecVar.zze : 0;
    }
}
