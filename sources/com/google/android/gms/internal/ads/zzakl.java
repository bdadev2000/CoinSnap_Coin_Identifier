package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class zzakl extends zzakj {

    @Nullable
    private zzakk zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzaem zzd;

    @Nullable
    private zzaek zze;

    @Override // com.google.android.gms.internal.ads.zzakj
    public final long zza(zzek zzekVar) {
        if ((zzekVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b2 = zzekVar.zzN()[0];
        zzakk zzakkVar = this.zza;
        zzdi.zzb(zzakkVar);
        int i2 = !zzakkVar.zzd[(b2 >> 1) & (255 >>> (8 - zzakkVar.zze))].zza ? zzakkVar.zza.zze : zzakkVar.zza.zzf;
        int i3 = this.zzc ? (this.zzb + i2) / 4 : 0;
        if (zzekVar.zzc() < zzekVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzekVar.zzN(), zzekVar.zze() + 4);
            zzekVar.zzJ(copyOf, copyOf.length);
        } else {
            zzekVar.zzK(zzekVar.zze() + 4);
        }
        long j2 = i3;
        byte[] zzN = zzekVar.zzN();
        zzN[zzekVar.zze() - 4] = (byte) (j2 & 255);
        zzN[zzekVar.zze() - 3] = (byte) ((j2 >>> 8) & 255);
        zzN[zzekVar.zze() - 2] = (byte) ((j2 >>> 16) & 255);
        zzN[zzekVar.zze() - 1] = (byte) ((j2 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i2;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    public final void zzb(boolean z2) {
        super.zzb(z2);
        if (z2) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzek zzekVar, long j2, zzakg zzakgVar) throws IOException {
        zzakk zzakkVar;
        int i2;
        int i3;
        int i4;
        int i5;
        zzaem zzaemVar;
        long j3;
        if (this.zza != null) {
            zzakgVar.zza.getClass();
            return false;
        }
        zzaem zzaemVar2 = this.zzd;
        int i6 = 4;
        if (zzaemVar2 == null) {
            zzaen.zzd(1, zzekVar, false);
            int zzj = zzekVar.zzj();
            int zzm = zzekVar.zzm();
            int zzj2 = zzekVar.zzj();
            int zzi = zzekVar.zzi();
            int i7 = zzi <= 0 ? -1 : zzi;
            int zzi2 = zzekVar.zzi();
            int i8 = zzi2 <= 0 ? -1 : zzi2;
            int zzi3 = zzekVar.zzi();
            int i9 = zzi3 <= 0 ? -1 : zzi3;
            int zzm2 = zzekVar.zzm();
            this.zzd = new zzaem(zzj, zzm, zzj2, i7, i8, i9, (int) Math.pow(2.0d, zzm2 & 15), (int) Math.pow(2.0d, (zzm2 & 240) >> 4), 1 == (zzekVar.zzm() & 1), Arrays.copyOf(zzekVar.zzN(), zzekVar.zze()));
        } else {
            zzaek zzaekVar = this.zze;
            if (zzaekVar == null) {
                this.zze = zzaen.zzc(zzekVar, true, true);
            } else {
                byte[] bArr = new byte[zzekVar.zze()];
                System.arraycopy(zzekVar.zzN(), 0, bArr, 0, zzekVar.zze());
                int i10 = zzaemVar2.zza;
                int i11 = 5;
                zzaen.zzd(5, zzekVar, false);
                int zzm3 = zzekVar.zzm() + 1;
                zzaej zzaejVar = new zzaej(zzekVar.zzN());
                zzaejVar.zzc(zzekVar.zzd() * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 2;
                    int i14 = 16;
                    if (i12 >= zzm3) {
                        zzaem zzaemVar3 = zzaemVar2;
                        int i15 = 6;
                        int zzb = zzaejVar.zzb(6) + 1;
                        for (int i16 = 0; i16 < zzb; i16++) {
                            if (zzaejVar.zzb(16) != 0) {
                                throw zzbo.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i17 = 1;
                        int zzb2 = zzaejVar.zzb(6) + 1;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < zzb2) {
                                int zzb3 = zzaejVar.zzb(i14);
                                if (zzb3 == 0) {
                                    i4 = zzb2;
                                    int i20 = 8;
                                    zzaejVar.zzc(8);
                                    zzaejVar.zzc(16);
                                    zzaejVar.zzc(16);
                                    zzaejVar.zzc(6);
                                    zzaejVar.zzc(8);
                                    int zzb4 = zzaejVar.zzb(4) + 1;
                                    int i21 = 0;
                                    while (i21 < zzb4) {
                                        zzaejVar.zzc(i20);
                                        i21++;
                                        i20 = 8;
                                    }
                                } else {
                                    if (zzb3 != i17) {
                                        throw zzbo.zza("floor type greater than 1 not decodable: " + zzb3, null);
                                    }
                                    int zzb5 = zzaejVar.zzb(i11);
                                    int[] iArr = new int[zzb5];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < zzb5; i23++) {
                                        int zzb6 = zzaejVar.zzb(4);
                                        iArr[i23] = zzb6;
                                        if (zzb6 > i22) {
                                            i22 = zzb6;
                                        }
                                    }
                                    int i24 = i22 + 1;
                                    int[] iArr2 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        iArr2[i25] = zzaejVar.zzb(i19) + 1;
                                        int zzb7 = zzaejVar.zzb(i13);
                                        if (zzb7 > 0) {
                                            i5 = 8;
                                            zzaejVar.zzc(8);
                                        } else {
                                            i5 = 8;
                                        }
                                        int i26 = zzb2;
                                        int i27 = 0;
                                        for (int i28 = 1; i27 < (i28 << zzb7); i28 = 1) {
                                            zzaejVar.zzc(i5);
                                            i27++;
                                            i5 = 8;
                                        }
                                        i25++;
                                        zzb2 = i26;
                                        i13 = 2;
                                        i19 = 3;
                                    }
                                    i4 = zzb2;
                                    zzaejVar.zzc(i13);
                                    int zzb8 = zzaejVar.zzb(4);
                                    int i29 = 0;
                                    int i30 = 0;
                                    for (int i31 = 0; i31 < zzb5; i31++) {
                                        i29 += iArr2[iArr[i31]];
                                        while (i30 < i29) {
                                            zzaejVar.zzc(zzb8);
                                            i30++;
                                        }
                                    }
                                }
                                i18++;
                                zzb2 = i4;
                                i15 = 6;
                                i13 = 2;
                                i14 = 16;
                                i17 = 1;
                                i11 = 5;
                            } else {
                                int i32 = 1;
                                int zzb9 = zzaejVar.zzb(i15) + 1;
                                int i33 = 0;
                                while (i33 < zzb9) {
                                    if (zzaejVar.zzb(16) > 2) {
                                        throw zzbo.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaejVar.zzc(24);
                                    zzaejVar.zzc(24);
                                    zzaejVar.zzc(24);
                                    int zzb10 = zzaejVar.zzb(i15) + i32;
                                    int i34 = 8;
                                    zzaejVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i35 = 0; i35 < zzb10; i35++) {
                                        iArr3[i35] = ((zzaejVar.zzd() ? zzaejVar.zzb(5) : 0) * 8) + zzaejVar.zzb(3);
                                    }
                                    int i36 = 0;
                                    while (i36 < zzb10) {
                                        int i37 = 0;
                                        while (i37 < i34) {
                                            if ((iArr3[i36] & (1 << i37)) != 0) {
                                                zzaejVar.zzc(i34);
                                            }
                                            i37++;
                                            i34 = 8;
                                        }
                                        i36++;
                                        i34 = 8;
                                    }
                                    i33++;
                                    i15 = 6;
                                    i32 = 1;
                                }
                                int zzb11 = zzaejVar.zzb(i15) + 1;
                                for (int i38 = 0; i38 < zzb11; i38++) {
                                    int zzb12 = zzaejVar.zzb(16);
                                    if (zzb12 != 0) {
                                        zzea.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb12);
                                    } else {
                                        if (zzaejVar.zzd()) {
                                            i2 = 1;
                                            i3 = zzaejVar.zzb(4) + 1;
                                        } else {
                                            i2 = 1;
                                            i3 = 1;
                                        }
                                        if (zzaejVar.zzd()) {
                                            int zzb13 = zzaejVar.zzb(8) + i2;
                                            for (int i39 = 0; i39 < zzb13; i39++) {
                                                int i40 = i10 - 1;
                                                zzaejVar.zzc(zzaen.zza(i40));
                                                zzaejVar.zzc(zzaen.zza(i40));
                                            }
                                        }
                                        if (zzaejVar.zzb(2) != 0) {
                                            throw zzbo.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i3 > 1) {
                                            for (int i41 = 0; i41 < i10; i41++) {
                                                zzaejVar.zzc(4);
                                            }
                                        }
                                        for (int i42 = 0; i42 < i3; i42++) {
                                            zzaejVar.zzc(8);
                                            zzaejVar.zzc(8);
                                            zzaejVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzaejVar.zzb(6);
                                int i43 = zzb14 + 1;
                                zzael[] zzaelVarArr = new zzael[i43];
                                for (int i44 = 0; i44 < i43; i44++) {
                                    zzaelVarArr[i44] = new zzael(zzaejVar.zzd(), zzaejVar.zzb(16), zzaejVar.zzb(16), zzaejVar.zzb(8));
                                }
                                if (!zzaejVar.zzd()) {
                                    throw zzbo.zza("framing bit after modes not set as expected", null);
                                }
                                zzakkVar = new zzakk(zzaemVar3, zzaekVar, bArr, zzaelVarArr, zzaen.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzaejVar.zzb(24) != 5653314) {
                            throw zzbo.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaejVar.zza(), null);
                        }
                        int zzb15 = zzaejVar.zzb(16);
                        int zzb16 = zzaejVar.zzb(24);
                        if (zzaejVar.zzd()) {
                            zzaejVar.zzc(5);
                            for (int i45 = 0; i45 < zzb16; i45 += zzaejVar.zzb(zzaen.zza(zzb16 - i45))) {
                            }
                        } else {
                            boolean zzd = zzaejVar.zzd();
                            for (int i46 = 0; i46 < zzb16; i46++) {
                                if (!zzd) {
                                    zzaejVar.zzc(5);
                                } else if (zzaejVar.zzd()) {
                                    zzaejVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzaejVar.zzb(i6);
                        if (zzb17 > 2) {
                            throw zzbo.zza("lookup type greater than 2 not decodable: " + zzb17, null);
                        }
                        if (zzb17 == 1) {
                            i13 = zzb17;
                        } else if (zzb17 != 2) {
                            zzaemVar = zzaemVar2;
                            i12++;
                            zzaemVar2 = zzaemVar;
                            i6 = 4;
                        }
                        zzaejVar.zzc(32);
                        zzaejVar.zzc(32);
                        int zzb18 = zzaejVar.zzb(i6) + 1;
                        zzaejVar.zzc(1);
                        if (i13 != 1) {
                            zzaemVar = zzaemVar2;
                            j3 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            zzaemVar = zzaemVar2;
                            j3 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            zzaemVar = zzaemVar2;
                            j3 = 0;
                        }
                        zzaejVar.zzc((int) (j3 * zzb18));
                        i12++;
                        zzaemVar2 = zzaemVar;
                        i6 = 4;
                    }
                }
            }
        }
        zzakkVar = null;
        this.zza = zzakkVar;
        if (zzakkVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaem zzaemVar4 = zzakkVar.zza;
        arrayList.add(zzaemVar4.zzg);
        arrayList.add(zzakkVar.zzc);
        zzbk zzb19 = zzaen.zzb(zzgax.zzm(zzakkVar.zzb.zza));
        zzad zzadVar = new zzad();
        zzadVar.zzZ("audio/vorbis");
        zzadVar.zzy(zzaemVar4.zzd);
        zzadVar.zzU(zzaemVar4.zzc);
        zzadVar.zzz(zzaemVar4.zza);
        zzadVar.zzaa(zzaemVar4.zzb);
        zzadVar.zzM(arrayList);
        zzadVar.zzS(zzb19);
        zzakgVar.zza = zzadVar.zzaf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    public final void zzi(long j2) {
        super.zzi(j2);
        this.zzc = j2 != 0;
        zzaem zzaemVar = this.zzd;
        this.zzb = zzaemVar != null ? zzaemVar.zze : 0;
    }
}
