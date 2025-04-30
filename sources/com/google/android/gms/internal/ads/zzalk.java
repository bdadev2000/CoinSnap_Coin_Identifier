package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzalk extends zzali {

    @Nullable
    private zzalj zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzaff zzd;

    @Nullable
    private zzafd zze;

    @Override // com.google.android.gms.internal.ads.zzali
    public final long zza(zzfu zzfuVar) {
        int i9;
        int i10 = 0;
        if ((zzfuVar.zzM()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzfuVar.zzM()[0];
        zzalj zzaljVar = this.zza;
        zzeq.zzb(zzaljVar);
        if (!zzaljVar.zzd[(b >> 1) & (255 >>> (8 - zzaljVar.zze))].zza) {
            i9 = zzaljVar.zza.zze;
        } else {
            i9 = zzaljVar.zza.zzf;
        }
        if (this.zzc) {
            i10 = (this.zzb + i9) / 4;
        }
        if (zzfuVar.zzc() < zzfuVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzfuVar.zzM(), zzfuVar.zze() + 4);
            zzfuVar.zzI(copyOf, copyOf.length);
        } else {
            zzfuVar.zzJ(zzfuVar.zze() + 4);
        }
        long j7 = i10;
        byte[] zzM = zzfuVar.zzM();
        zzM[zzfuVar.zze() - 4] = (byte) (j7 & 255);
        zzM[zzfuVar.zze() - 3] = (byte) ((j7 >>> 8) & 255);
        zzM[zzfuVar.zze() - 2] = (byte) ((j7 >>> 16) & 255);
        zzM[zzfuVar.zze() - 1] = (byte) ((j7 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i9;
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final void zzb(boolean z8) {
        super.zzb(z8);
        if (z8) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final boolean zzc(zzfu zzfuVar, long j7, zzalf zzalfVar) throws IOException {
        zzalj zzaljVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        zzaff zzaffVar;
        long j9;
        int i14;
        int i15;
        int i16;
        boolean z8;
        if (this.zza != null) {
            zzalfVar.zza.getClass();
            return false;
        }
        zzaff zzaffVar2 = this.zzd;
        int i17 = 4;
        if (zzaffVar2 == null) {
            zzafg.zzd(1, zzfuVar, false);
            int zzj = zzfuVar.zzj();
            int zzm = zzfuVar.zzm();
            int zzj2 = zzfuVar.zzj();
            int zzi = zzfuVar.zzi();
            if (zzi <= 0) {
                i14 = -1;
            } else {
                i14 = zzi;
            }
            int zzi2 = zzfuVar.zzi();
            if (zzi2 <= 0) {
                i15 = -1;
            } else {
                i15 = zzi2;
            }
            int zzi3 = zzfuVar.zzi();
            if (zzi3 <= 0) {
                i16 = -1;
            } else {
                i16 = zzi3;
            }
            int zzm2 = zzfuVar.zzm();
            int pow = (int) Math.pow(2.0d, zzm2 & 15);
            int pow2 = (int) Math.pow(2.0d, (zzm2 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
            if (1 != (zzfuVar.zzm() & 1)) {
                z8 = false;
            } else {
                z8 = true;
            }
            this.zzd = new zzaff(zzj, zzm, zzj2, i14, i15, i16, pow, pow2, z8, Arrays.copyOf(zzfuVar.zzM(), zzfuVar.zze()));
        } else {
            zzafd zzafdVar = this.zze;
            if (zzafdVar == null) {
                this.zze = zzafg.zzc(zzfuVar, true, true);
            } else {
                byte[] bArr = new byte[zzfuVar.zze()];
                System.arraycopy(zzfuVar.zzM(), 0, bArr, 0, zzfuVar.zze());
                int i18 = zzaffVar2.zza;
                int i19 = 5;
                zzafg.zzd(5, zzfuVar, false);
                int zzm3 = zzfuVar.zzm() + 1;
                zzafc zzafcVar = new zzafc(zzfuVar.zzM());
                zzafcVar.zzc(zzfuVar.zzd() * 8);
                int i20 = 0;
                while (true) {
                    int i21 = 2;
                    int i22 = 16;
                    if (i20 < zzm3) {
                        if (zzafcVar.zzb(24) == 5653314) {
                            int zzb = zzafcVar.zzb(16);
                            int zzb2 = zzafcVar.zzb(24);
                            if (!zzafcVar.zzd()) {
                                boolean zzd = zzafcVar.zzd();
                                for (int i23 = 0; i23 < zzb2; i23++) {
                                    if (zzd) {
                                        if (zzafcVar.zzd()) {
                                            zzafcVar.zzc(5);
                                        }
                                    } else {
                                        zzafcVar.zzc(5);
                                    }
                                }
                            } else {
                                zzafcVar.zzc(5);
                                for (int i24 = 0; i24 < zzb2; i24 += zzafcVar.zzb(zzafg.zza(zzb2 - i24))) {
                                }
                            }
                            int zzb3 = zzafcVar.zzb(i17);
                            if (zzb3 <= 2) {
                                if (zzb3 != 1) {
                                    if (zzb3 != 2) {
                                        zzaffVar = zzaffVar2;
                                        i20++;
                                        zzaffVar2 = zzaffVar;
                                        i17 = 4;
                                    }
                                } else {
                                    i21 = zzb3;
                                }
                                zzafcVar.zzc(32);
                                zzafcVar.zzc(32);
                                int zzb4 = zzafcVar.zzb(i17) + 1;
                                zzafcVar.zzc(1);
                                if (i21 == 1) {
                                    if (zzb != 0) {
                                        zzaffVar = zzaffVar2;
                                        j9 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                                    } else {
                                        zzaffVar = zzaffVar2;
                                        j9 = 0;
                                    }
                                } else {
                                    zzaffVar = zzaffVar2;
                                    j9 = zzb * zzb2;
                                }
                                zzafcVar.zzc((int) (j9 * zzb4));
                                i20++;
                                zzaffVar2 = zzaffVar;
                                i17 = 4;
                            } else {
                                throw zzch.zza("lookup type greater than 2 not decodable: " + zzb3, null);
                            }
                        } else {
                            throw zzch.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzafcVar.zza(), null);
                        }
                    } else {
                        zzaff zzaffVar3 = zzaffVar2;
                        int i25 = 6;
                        int zzb5 = zzafcVar.zzb(6) + 1;
                        for (int i26 = 0; i26 < zzb5; i26++) {
                            if (zzafcVar.zzb(16) != 0) {
                                throw zzch.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i27 = 1;
                        int zzb6 = zzafcVar.zzb(6) + 1;
                        int i28 = 0;
                        while (true) {
                            int i29 = 3;
                            if (i28 < zzb6) {
                                int zzb7 = zzafcVar.zzb(i22);
                                if (zzb7 != 0) {
                                    if (zzb7 == i27) {
                                        int zzb8 = zzafcVar.zzb(i19);
                                        int[] iArr = new int[zzb8];
                                        int i30 = -1;
                                        for (int i31 = 0; i31 < zzb8; i31++) {
                                            int zzb9 = zzafcVar.zzb(4);
                                            iArr[i31] = zzb9;
                                            if (zzb9 > i30) {
                                                i30 = zzb9;
                                            }
                                        }
                                        int i32 = i30 + 1;
                                        int[] iArr2 = new int[i32];
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            iArr2[i33] = zzafcVar.zzb(i29) + 1;
                                            int zzb10 = zzafcVar.zzb(i21);
                                            if (zzb10 > 0) {
                                                i13 = 8;
                                                zzafcVar.zzc(8);
                                            } else {
                                                i13 = 8;
                                            }
                                            int i34 = zzb6;
                                            int i35 = 0;
                                            for (int i36 = 1; i35 < (i36 << zzb10); i36 = 1) {
                                                zzafcVar.zzc(i13);
                                                i35++;
                                                i13 = 8;
                                            }
                                            i33++;
                                            zzb6 = i34;
                                            i21 = 2;
                                            i29 = 3;
                                        }
                                        i12 = zzb6;
                                        zzafcVar.zzc(i21);
                                        int zzb11 = zzafcVar.zzb(4);
                                        int i37 = 0;
                                        int i38 = 0;
                                        for (int i39 = 0; i39 < zzb8; i39++) {
                                            i37 += iArr2[iArr[i39]];
                                            while (i38 < i37) {
                                                zzafcVar.zzc(zzb11);
                                                i38++;
                                            }
                                        }
                                    } else {
                                        throw zzch.zza("floor type greater than 1 not decodable: " + zzb7, null);
                                    }
                                } else {
                                    i12 = zzb6;
                                    int i40 = 8;
                                    zzafcVar.zzc(8);
                                    zzafcVar.zzc(16);
                                    zzafcVar.zzc(16);
                                    zzafcVar.zzc(6);
                                    zzafcVar.zzc(8);
                                    int zzb12 = zzafcVar.zzb(4) + 1;
                                    int i41 = 0;
                                    while (i41 < zzb12) {
                                        zzafcVar.zzc(i40);
                                        i41++;
                                        i40 = 8;
                                    }
                                }
                                i28++;
                                zzb6 = i12;
                                i25 = 6;
                                i21 = 2;
                                i22 = 16;
                                i27 = 1;
                                i19 = 5;
                            } else {
                                int i42 = 1;
                                int zzb13 = zzafcVar.zzb(i25) + 1;
                                int i43 = 0;
                                while (i43 < zzb13) {
                                    if (zzafcVar.zzb(16) <= 2) {
                                        zzafcVar.zzc(24);
                                        zzafcVar.zzc(24);
                                        zzafcVar.zzc(24);
                                        int zzb14 = zzafcVar.zzb(i25) + i42;
                                        int i44 = 8;
                                        zzafcVar.zzc(8);
                                        int[] iArr3 = new int[zzb14];
                                        for (int i45 = 0; i45 < zzb14; i45++) {
                                            int zzb15 = zzafcVar.zzb(3);
                                            if (zzafcVar.zzd()) {
                                                i11 = zzafcVar.zzb(5);
                                            } else {
                                                i11 = 0;
                                            }
                                            iArr3[i45] = (i11 * 8) + zzb15;
                                        }
                                        int i46 = 0;
                                        while (i46 < zzb14) {
                                            int i47 = 0;
                                            while (i47 < i44) {
                                                if ((iArr3[i46] & (1 << i47)) != 0) {
                                                    zzafcVar.zzc(i44);
                                                }
                                                i47++;
                                                i44 = 8;
                                            }
                                            i46++;
                                            i44 = 8;
                                        }
                                        i43++;
                                        i25 = 6;
                                        i42 = 1;
                                    } else {
                                        throw zzch.zza("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int zzb16 = zzafcVar.zzb(i25) + 1;
                                for (int i48 = 0; i48 < zzb16; i48++) {
                                    int zzb17 = zzafcVar.zzb(16);
                                    if (zzb17 != 0) {
                                        zzfk.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb17);
                                    } else {
                                        if (zzafcVar.zzd()) {
                                            i9 = 1;
                                            i10 = zzafcVar.zzb(4) + 1;
                                        } else {
                                            i9 = 1;
                                            i10 = 1;
                                        }
                                        if (zzafcVar.zzd()) {
                                            int zzb18 = zzafcVar.zzb(8) + i9;
                                            for (int i49 = 0; i49 < zzb18; i49++) {
                                                int i50 = i18 - 1;
                                                zzafcVar.zzc(zzafg.zza(i50));
                                                zzafcVar.zzc(zzafg.zza(i50));
                                            }
                                        }
                                        if (zzafcVar.zzb(2) == 0) {
                                            if (i10 > 1) {
                                                for (int i51 = 0; i51 < i18; i51++) {
                                                    zzafcVar.zzc(4);
                                                }
                                            }
                                            for (int i52 = 0; i52 < i10; i52++) {
                                                zzafcVar.zzc(8);
                                                zzafcVar.zzc(8);
                                                zzafcVar.zzc(8);
                                            }
                                        } else {
                                            throw zzch.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int zzb19 = zzafcVar.zzb(6);
                                int i53 = zzb19 + 1;
                                zzafe[] zzafeVarArr = new zzafe[i53];
                                for (int i54 = 0; i54 < i53; i54++) {
                                    zzafeVarArr[i54] = new zzafe(zzafcVar.zzd(), zzafcVar.zzb(16), zzafcVar.zzb(16), zzafcVar.zzb(8));
                                }
                                if (zzafcVar.zzd()) {
                                    zzaljVar = new zzalj(zzaffVar3, zzafdVar, bArr, zzafeVarArr, zzafg.zza(zzb19));
                                } else {
                                    throw zzch.zza("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        zzaljVar = null;
        this.zza = zzaljVar;
        if (zzaljVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaff zzaffVar4 = zzaljVar.zza;
        arrayList.add(zzaffVar4.zzg);
        arrayList.add(zzaljVar.zzc);
        zzcd zzb20 = zzafg.zzb(zzgbc.zzl(zzaljVar.zzb.zzb));
        zzal zzalVar = new zzal();
        zzalVar.zzX(MimeTypes.AUDIO_VORBIS);
        zzalVar.zzx(zzaffVar4.zzd);
        zzalVar.zzS(zzaffVar4.zzc);
        zzalVar.zzy(zzaffVar4.zza);
        zzalVar.zzY(zzaffVar4.zzb);
        zzalVar.zzL(arrayList);
        zzalVar.zzQ(zzb20);
        zzalfVar.zza = zzalVar.zzad();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final void zzi(long j7) {
        boolean z8;
        super.zzi(j7);
        int i9 = 0;
        if (j7 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.zzc = z8;
        zzaff zzaffVar = this.zzd;
        if (zzaffVar != null) {
            i9 = zzaffVar.zze;
        }
        this.zzb = i9;
    }
}
