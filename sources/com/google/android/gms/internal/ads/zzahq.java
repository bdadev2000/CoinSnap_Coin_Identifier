package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
public final class zzahq implements zzacr {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;

    @Nullable
    private zzaho zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;

    @Nullable
    private zzdu zzJ;

    @Nullable
    private zzdu zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzacu zzai;
    private final zzahl zzaj;
    private final zzahs zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakg zzk;
    private final zzed zzl;
    private final zzed zzm;
    private final zzed zzn;
    private final zzed zzo;
    private final zzed zzp;
    private final zzed zzq;
    private final zzed zzr;
    private final zzed zzs;
    private final zzed zzt;
    private final zzed zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i10 = zzen.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        e.l(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzf = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzahq() {
        this(new zzahl(), 2, zzakg.zza);
    }

    private final int zzp(zzacs zzacsVar, zzaho zzahoVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(zzahoVar.zzb)) {
            zzx(zzacsVar, zza, i10);
            int i12 = this.zzaa;
            zzw();
            return i12;
        }
        if ("S_TEXT/ASS".equals(zzahoVar.zzb)) {
            zzx(zzacsVar, zzc, i10);
            int i13 = this.zzaa;
            zzw();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(zzahoVar.zzb)) {
            zzx(zzacsVar, zzd, i10);
            int i14 = this.zzaa;
            zzw();
            return i14;
        }
        zzadx zzadxVar = zzahoVar.zzW;
        boolean z11 = true;
        if (!this.zzac) {
            if (zzahoVar.zzg) {
                this.zzV &= -1073741825;
                int i15 = 128;
                if (!this.zzad) {
                    zzacsVar.zzi(this.zzn.zzN(), 0, 1);
                    this.zzZ++;
                    if ((this.zzn.zzN()[0] & ByteCompanionObject.MIN_VALUE) != 128) {
                        this.zzag = this.zzn.zzN()[0];
                        this.zzad = true;
                    } else {
                        throw zzbh.zza("Extension bit is set in signal byte", null);
                    }
                }
                byte b3 = this.zzag;
                if ((b3 & 1) == 1) {
                    int i16 = b3 & 2;
                    this.zzV |= 1073741824;
                    if (!this.zzah) {
                        zzacsVar.zzi(this.zzs.zzN(), 0, 8);
                        this.zzZ += 8;
                        this.zzah = true;
                        zzed zzedVar = this.zzn;
                        if (i16 != 2) {
                            i15 = 0;
                        }
                        zzedVar.zzN()[0] = (byte) (i15 | 8);
                        this.zzn.zzL(0);
                        zzadxVar.zzr(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzL(0);
                        zzadxVar.zzr(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i16 == 2) {
                        if (!this.zzae) {
                            zzacsVar.zzi(this.zzn.zzN(), 0, 1);
                            this.zzZ++;
                            this.zzn.zzL(0);
                            this.zzaf = this.zzn.zzm();
                            this.zzae = true;
                        }
                        int i17 = this.zzaf * 4;
                        this.zzn.zzI(i17);
                        zzacsVar.zzi(this.zzn.zzN(), 0, i17);
                        this.zzZ += i17;
                        int i18 = (this.zzaf >> 1) + 1;
                        int i19 = (i18 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i19) {
                            this.zzv = ByteBuffer.allocate(i19);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i18);
                        int i20 = 0;
                        int i21 = 0;
                        while (true) {
                            i11 = this.zzaf;
                            if (i20 >= i11) {
                                break;
                            }
                            int zzp = this.zzn.zzp();
                            int i22 = zzp - i21;
                            if (i20 % 2 == 0) {
                                this.zzv.putShort((short) i22);
                            } else {
                                this.zzv.putInt(i22);
                            }
                            i20++;
                            i21 = zzp;
                        }
                        int i23 = (i10 - this.zzZ) - i21;
                        if ((i11 & 1) == 1) {
                            this.zzv.putInt(i23);
                        } else {
                            this.zzv.putShort((short) i23);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzJ(this.zzv.array(), i19);
                        zzadxVar.zzr(this.zzt, i19, 1);
                        this.zzaa += i19;
                    }
                }
            } else {
                byte[] bArr = zzahoVar.zzh;
                if (bArr != null) {
                    this.zzq.zzJ(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahoVar.zzb) ? zzahoVar.zzf > 0 : z10) {
                this.zzV |= 268435456;
                this.zzu.zzI(0);
                int zze2 = (this.zzq.zze() + i10) - this.zzZ;
                this.zzn.zzI(4);
                this.zzn.zzN()[0] = (byte) ((zze2 >> 24) & 255);
                this.zzn.zzN()[1] = (byte) ((zze2 >> 16) & 255);
                this.zzn.zzN()[2] = (byte) ((zze2 >> 8) & 255);
                this.zzn.zzN()[3] = (byte) (zze2 & 255);
                zzadxVar.zzr(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int zze3 = this.zzq.zze() + i10;
        if (!"V_MPEG4/ISO/AVC".equals(zzahoVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahoVar.zzb)) {
            if (zzahoVar.zzT != null) {
                if (this.zzq.zze() != 0) {
                    z11 = false;
                }
                zzdb.zzf(z11);
                zzahoVar.zzT.zzd(zzacsVar);
            }
            while (true) {
                int i24 = this.zzZ;
                if (i24 >= zze3) {
                    break;
                }
                int zzq = zzq(zzacsVar, zzadxVar, zze3 - i24);
                this.zzZ += zzq;
                this.zzaa += zzq;
            }
        } else {
            byte[] zzN = this.zzm.zzN();
            zzN[0] = 0;
            zzN[1] = 0;
            zzN[2] = 0;
            int i25 = zzahoVar.zzX;
            int i26 = 4 - i25;
            while (this.zzZ < zze3) {
                int i27 = this.zzab;
                if (i27 == 0) {
                    int min = Math.min(i25, this.zzq.zzb());
                    zzacsVar.zzi(zzN, i26 + min, i25 - min);
                    if (min > 0) {
                        this.zzq.zzH(zzN, i26, min);
                    }
                    this.zzZ += i25;
                    this.zzm.zzL(0);
                    this.zzab = this.zzm.zzp();
                    this.zzl.zzL(0);
                    zzadxVar.zzq(this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int zzq2 = zzq(zzacsVar, zzadxVar, i27);
                    this.zzZ += zzq2;
                    this.zzaa += zzq2;
                    this.zzab -= zzq2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahoVar.zzb)) {
            this.zzo.zzL(0);
            zzadxVar.zzq(this.zzo, 4);
            this.zzaa += 4;
        }
        int i28 = this.zzaa;
        zzw();
        return i28;
    }

    private final int zzq(zzacs zzacsVar, zzadx zzadxVar, int i10) throws IOException {
        int zzb2 = this.zzq.zzb();
        if (zzb2 > 0) {
            int min = Math.min(i10, zzb2);
            zzadxVar.zzq(this.zzq, min);
            return min;
        }
        return zzadxVar.zzf(zzacsVar, i10, false);
    }

    private final long zzr(long j3) throws zzbh {
        long j10 = this.zzy;
        if (j10 != C.TIME_UNSET) {
            return zzen.zzu(j3, j10, 1000L, RoundingMode.FLOOR);
        }
        throw zzbh.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzs(int i10) throws zzbh {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbh.zza("Element " + i10 + " must be in a Cues", null);
        }
    }

    private final void zzt(int i10) throws zzbh {
        if (this.zzB != null) {
            return;
        }
        throw zzbh.zza("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[EDGE_INSN: B:50:0x00e0->B:49:0x00e0 BREAK  A[LOOP:0: B:42:0x00c5->B:46:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzu(com.google.android.gms.internal.ads.zzaho r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahq.zzu(com.google.android.gms.internal.ads.zzaho, long, int, int, int):void");
    }

    private final void zzv(zzacs zzacsVar, int i10) throws IOException {
        if (this.zzn.zze() >= i10) {
            return;
        }
        if (this.zzn.zzc() < i10) {
            zzed zzedVar = this.zzn;
            int zzc2 = zzedVar.zzc();
            zzedVar.zzF(Math.max(zzc2 + zzc2, i10));
        }
        zzed zzedVar2 = this.zzn;
        zzacsVar.zzi(zzedVar2.zzN(), zzedVar2.zze(), i10 - zzedVar2.zze());
        this.zzn.zzK(i10);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzacs zzacsVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.zzr.zzc() < i11) {
            zzed zzedVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i11 + i10);
            zzedVar.zzJ(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzN(), 0, length);
        }
        zzacsVar.zzi(this.zzr.zzN(), length, i10);
        this.zzr.zzL(0);
        this.zzr.zzK(i11);
    }

    private static byte[] zzy(long j3, String str, long j10) {
        boolean z10;
        if (j3 != C.TIME_UNSET) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        int i10 = (int) (j3 / 3600000000L);
        long j11 = j3 - (i10 * 3600000000L);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - (i11 * 60000000);
        int i12 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (i12 * 1000000)) / j10)));
        int i13 = zzen.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(@Nullable int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        if (length >= i10) {
            return iArr;
        }
        return new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (this.zzaj.zzc(zzacsVar)) {
                long zzf2 = zzacsVar.zzf();
                if (this.zzF) {
                    this.zzH = zzf2;
                    zzadnVar.zza = this.zzG;
                    this.zzF = false;
                    return 1;
                }
                if (this.zzC) {
                    long j3 = this.zzH;
                    if (j3 != -1) {
                        zzadnVar.zza = j3;
                        this.zzH = -1L;
                        return 1;
                    }
                }
            } else {
                for (int i10 = 0; i10 < this.zzh.size(); i10++) {
                    zzaho zzahoVar = (zzaho) this.zzh.valueAt(i10);
                    zzaho.zzd(zzahoVar);
                    zzady zzadyVar = zzahoVar.zzT;
                    if (zzadyVar != null) {
                        zzadyVar.zza(zzahoVar.zzW, zzahoVar.zzi);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzai = zzacuVar;
        if (this.zzj) {
            zzacuVar = new zzakj(zzacuVar, this.zzk);
        }
        this.zzai = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    @CallSuper
    public final void zzf(long j3, long j10) {
        this.zzI = C.TIME_UNSET;
        this.zzN = 0;
        this.zzaj.zzb();
        this.zzg.zze();
        zzw();
        for (int i10 = 0; i10 < this.zzh.size(); i10++) {
            zzady zzadyVar = ((zzaho) this.zzh.valueAt(i10)).zzT;
            if (zzadyVar != null) {
                zzadyVar.zzb();
            }
        }
    }

    @CallSuper
    public final void zzh(int i10, int i11, zzacs zzacsVar) throws IOException {
        int i12;
        long j3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        int i18 = 1;
        int i19 = 0;
        if (i17 != 161 && i17 != 163) {
            if (i17 != 165) {
                if (i17 != 16877) {
                    if (i17 != 16981) {
                        if (i17 != 18402) {
                            if (i17 != 21419) {
                                if (i17 != 25506) {
                                    if (i17 == 30322) {
                                        zzt(i10);
                                        byte[] bArr = new byte[i11];
                                        this.zzB.zzv = bArr;
                                        zzacsVar.zzi(bArr, 0, i11);
                                        return;
                                    }
                                    throw zzbh.zza("Unexpected id: " + i17, null);
                                }
                                zzt(i10);
                                byte[] bArr2 = new byte[i11];
                                this.zzB.zzj = bArr2;
                                zzacsVar.zzi(bArr2, 0, i11);
                                return;
                            }
                            Arrays.fill(this.zzp.zzN(), (byte) 0);
                            zzacsVar.zzi(this.zzp.zzN(), 4 - i11, i11);
                            this.zzp.zzL(0);
                            this.zzD = (int) this.zzp.zzu();
                            return;
                        }
                        byte[] bArr3 = new byte[i11];
                        zzacsVar.zzi(bArr3, 0, i11);
                        zzt(i10);
                        this.zzB.zzi = new zzadw(1, bArr3, 0, 0);
                        return;
                    }
                    zzt(i10);
                    byte[] bArr4 = new byte[i11];
                    this.zzB.zzh = bArr4;
                    zzacsVar.zzi(bArr4, 0, i11);
                    return;
                }
                zzt(i10);
                zzaho zzahoVar = this.zzB;
                if (zzaho.zza(zzahoVar) != 1685485123 && zzaho.zza(zzahoVar) != 1685480259) {
                    zzacsVar.zzk(i11);
                    return;
                }
                byte[] bArr5 = new byte[i11];
                zzahoVar.zzN = bArr5;
                zzacsVar.zzi(bArr5, 0, i11);
                return;
            }
            if (this.zzN == 2) {
                zzaho zzahoVar2 = (zzaho) this.zzh.get(this.zzT);
                if (this.zzW == 4 && "V_VP9".equals(zzahoVar2.zzb)) {
                    this.zzu.zzI(i11);
                    zzacsVar.zzi(this.zzu.zzN(), 0, i11);
                    return;
                } else {
                    zzacsVar.zzk(i11);
                    return;
                }
            }
            return;
        }
        int i20 = 8;
        if (this.zzN == 0) {
            this.zzT = (int) this.zzg.zzd(zzacsVar, false, true, 8);
            this.zzU = this.zzg.zza();
            this.zzP = C.TIME_UNSET;
            this.zzN = 1;
            this.zzn.zzI(0);
        }
        zzaho zzahoVar3 = (zzaho) this.zzh.get(this.zzT);
        if (zzahoVar3 == null) {
            zzacsVar.zzk(i11 - this.zzU);
            this.zzN = 0;
            return;
        }
        zzaho.zzd(zzahoVar3);
        if (this.zzN == 1) {
            zzv(zzacsVar, 3);
            int i21 = (this.zzn.zzN()[2] & 6) >> 1;
            if (i21 == 0) {
                this.zzR = 1;
                int[] zzz = zzz(this.zzS, 1);
                this.zzS = zzz;
                zzz[0] = (i11 - this.zzU) - 3;
            } else {
                zzv(zzacsVar, 4);
                int i22 = (this.zzn.zzN()[3] & UByte.MAX_VALUE) + 1;
                this.zzR = i22;
                int[] zzz2 = zzz(this.zzS, i22);
                this.zzS = zzz2;
                if (i21 == 2) {
                    int i23 = (i11 - this.zzU) - 4;
                    int i24 = this.zzR;
                    Arrays.fill(zzz2, 0, i24, i23 / i24);
                } else if (i21 == 1) {
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 4;
                    while (true) {
                        i13 = this.zzR - 1;
                        if (i25 >= i13) {
                            break;
                        }
                        this.zzS[i25] = 0;
                        do {
                            i27++;
                            zzv(zzacsVar, i27);
                            i14 = this.zzn.zzN()[i27 - 1] & UByte.MAX_VALUE;
                            int[] iArr = this.zzS;
                            i15 = iArr[i25] + i14;
                            iArr[i25] = i15;
                        } while (i14 == 255);
                        i26 += i15;
                        i25++;
                    }
                    this.zzS[i13] = ((i11 - this.zzU) - i27) - i26;
                } else {
                    if (i21 == 3) {
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            int i31 = this.zzR - 1;
                            if (i28 < i31) {
                                this.zzS[i28] = i19;
                                i30++;
                                zzv(zzacsVar, i30);
                                int i32 = i30 - 1;
                                if (this.zzn.zzN()[i32] != 0) {
                                    int i33 = i19;
                                    while (true) {
                                        if (i33 < i20) {
                                            int i34 = i18 << (7 - i33);
                                            if ((this.zzn.zzN()[i32] & i34) != 0) {
                                                i30 += i33;
                                                zzv(zzacsVar, i30);
                                                j3 = (~i34) & this.zzn.zzN()[i32] & UByte.MAX_VALUE;
                                                int i35 = i32 + 1;
                                                while (i35 < i30) {
                                                    j3 = (j3 << i20) | (this.zzn.zzN()[i35] & UByte.MAX_VALUE);
                                                    i35++;
                                                    i20 = 8;
                                                }
                                                if (i28 > 0) {
                                                    j3 -= (1 << ((i33 * 7) + 6)) - 1;
                                                }
                                            } else {
                                                i33++;
                                                i18 = 1;
                                                i20 = 8;
                                            }
                                        } else {
                                            j3 = 0;
                                            break;
                                        }
                                    }
                                    if (j3 < -2147483648L || j3 > 2147483647L) {
                                        break;
                                    }
                                    int[] iArr2 = this.zzS;
                                    int i36 = (int) j3;
                                    if (i28 != 0) {
                                        i36 += iArr2[i28 - 1];
                                    }
                                    iArr2[i28] = i36;
                                    i29 += i36;
                                    i28++;
                                    i18 = 1;
                                    i19 = 0;
                                    i20 = 8;
                                } else {
                                    throw zzbh.zza("No valid varint length mask found", null);
                                }
                            } else {
                                this.zzS[i31] = ((i11 - this.zzU) - i30) - i29;
                                break;
                            }
                        }
                        throw zzbh.zza("EBML lacing sample size out of range.", null);
                    }
                    throw zzbh.zza("Unexpected lacing value: 2", null);
                }
            }
            this.zzO = this.zzI + zzr((this.zzn.zzN()[0] << 8) | (this.zzn.zzN()[1] & UByte.MAX_VALUE));
            if (zzahoVar3.zzd != 2) {
                if (i17 == 163) {
                    if ((this.zzn.zzN()[2] & ByteCompanionObject.MIN_VALUE) == 128) {
                        i17 = 163;
                    } else {
                        i17 = 163;
                    }
                }
                i16 = 0;
                this.zzV = i16;
                this.zzN = 2;
                this.zzQ = 0;
                i12 = 163;
            }
            i16 = 1;
            this.zzV = i16;
            this.zzN = 2;
            this.zzQ = 0;
            i12 = 163;
        } else {
            i12 = 163;
        }
        if (i17 == i12) {
            while (true) {
                int i37 = this.zzQ;
                if (i37 < this.zzR) {
                    zzu(zzahoVar3, ((this.zzQ * zzahoVar3.zze) / 1000) + this.zzO, this.zzV, zzp(zzacsVar, zzahoVar3, this.zzS[i37], false), 0);
                    this.zzQ++;
                } else {
                    this.zzN = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i38 = this.zzQ;
                if (i38 < this.zzR) {
                    int[] iArr3 = this.zzS;
                    iArr3[i38] = zzp(zzacsVar, zzahoVar3, iArr3[i38], true);
                    this.zzQ++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        return new zzahr().zza(zzacsVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e6, code lost:
    
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L188;
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(int r22) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahq.zzj(int):void");
    }

    @CallSuper
    public final void zzk(int i10, double d10) throws zzbh {
        if (i10 != 181) {
            if (i10 != 17545) {
                switch (i10) {
                    case 21969:
                        zzt(i10);
                        this.zzB.zzD = (float) d10;
                        return;
                    case 21970:
                        zzt(i10);
                        this.zzB.zzE = (float) d10;
                        return;
                    case 21971:
                        zzt(i10);
                        this.zzB.zzF = (float) d10;
                        return;
                    case 21972:
                        zzt(i10);
                        this.zzB.zzG = (float) d10;
                        return;
                    case 21973:
                        zzt(i10);
                        this.zzB.zzH = (float) d10;
                        return;
                    case 21974:
                        zzt(i10);
                        this.zzB.zzI = (float) d10;
                        return;
                    case 21975:
                        zzt(i10);
                        this.zzB.zzJ = (float) d10;
                        return;
                    case 21976:
                        zzt(i10);
                        this.zzB.zzK = (float) d10;
                        return;
                    case 21977:
                        zzt(i10);
                        this.zzB.zzL = (float) d10;
                        return;
                    case 21978:
                        zzt(i10);
                        this.zzB.zzM = (float) d10;
                        return;
                    default:
                        switch (i10) {
                            case 30323:
                                zzt(i10);
                                this.zzB.zzs = (float) d10;
                                return;
                            case 30324:
                                zzt(i10);
                                this.zzB.zzt = (float) d10;
                                return;
                            case 30325:
                                zzt(i10);
                                this.zzB.zzu = (float) d10;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.zzz = (long) d10;
            return;
        }
        zzt(i10);
        this.zzB.zzQ = (int) d10;
    }

    @CallSuper
    public final void zzl(int i10, long j3) throws zzbh {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        zzt(i10);
                        this.zzB.zzd = (int) j3;
                        return;
                    case 136:
                        if (j3 == 1) {
                            z10 = true;
                        }
                        zzt(i10);
                        this.zzB.zzV = z10;
                        return;
                    case 155:
                        this.zzP = zzr(j3);
                        return;
                    case 159:
                        zzt(i10);
                        this.zzB.zzO = (int) j3;
                        return;
                    case 176:
                        zzt(i10);
                        this.zzB.zzl = (int) j3;
                        return;
                    case 179:
                        zzs(i10);
                        this.zzJ.zzc(zzr(j3));
                        return;
                    case 186:
                        zzt(i10);
                        this.zzB.zzm = (int) j3;
                        return;
                    case 215:
                        zzt(i10);
                        this.zzB.zzc = (int) j3;
                        return;
                    case 231:
                        this.zzI = zzr(j3);
                        return;
                    case 238:
                        this.zzW = (int) j3;
                        return;
                    case 241:
                        if (!this.zzL) {
                            zzs(i10);
                            this.zzK.zzc(j3);
                            this.zzL = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzX = true;
                        return;
                    case 16871:
                        zzt(i10);
                        zzaho.zzb(this.zzB, (int) j3);
                        return;
                    case 16980:
                        if (j3 != 3) {
                            throw zzbh.zza("ContentCompAlgo " + j3 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j3 < 1 || j3 > 2) {
                            throw zzbh.zza("DocTypeReadVersion " + j3 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j3 != 1) {
                            throw zzbh.zza("EBMLReadVersion " + j3 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j3 != 5) {
                            throw zzbh.zza("ContentEncAlgo " + j3 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j3 != 1) {
                            throw zzbh.zza("AESSettingsCipherMode " + j3 + " not supported", null);
                        }
                        return;
                    case 21420:
                        this.zzE = j3 + this.zzx;
                        return;
                    case 21432:
                        int i11 = (int) j3;
                        zzt(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        this.zzB.zzw = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzB.zzw = 1;
                                return;
                            }
                            this.zzB.zzw = 2;
                            return;
                        }
                        this.zzB.zzw = 0;
                        return;
                    case 21680:
                        zzt(i10);
                        this.zzB.zzo = (int) j3;
                        return;
                    case 21682:
                        zzt(i10);
                        this.zzB.zzq = (int) j3;
                        return;
                    case 21690:
                        zzt(i10);
                        this.zzB.zzp = (int) j3;
                        return;
                    case 21930:
                        if (j3 == 1) {
                            z10 = true;
                        }
                        zzt(i10);
                        this.zzB.zzU = z10;
                        return;
                    case 21938:
                        zzt(i10);
                        zzaho zzahoVar = this.zzB;
                        zzahoVar.zzx = true;
                        zzahoVar.zzn = (int) j3;
                        return;
                    case 21998:
                        zzt(i10);
                        this.zzB.zzf = (int) j3;
                        return;
                    case 22186:
                        zzt(i10);
                        this.zzB.zzR = j3;
                        return;
                    case 22203:
                        zzt(i10);
                        this.zzB.zzS = j3;
                        return;
                    case 25188:
                        zzt(i10);
                        this.zzB.zzP = (int) j3;
                        return;
                    case 30114:
                        this.zzY = j3;
                        return;
                    case 30321:
                        int i12 = (int) j3;
                        zzt(i10);
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        this.zzB.zzr = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzB.zzr = 2;
                                return;
                            }
                            this.zzB.zzr = 1;
                            return;
                        }
                        this.zzB.zzr = 0;
                        return;
                    case 2352003:
                        zzt(i10);
                        this.zzB.zze = (int) j3;
                        return;
                    case 2807729:
                        this.zzy = j3;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                int i13 = (int) j3;
                                zzt(i10);
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        this.zzB.zzA = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.zzB.zzA = 2;
                                return;
                            case 21946:
                                zzt(i10);
                                int zzb2 = zzm.zzb((int) j3);
                                if (zzb2 != -1) {
                                    this.zzB.zzz = zzb2;
                                    return;
                                }
                                return;
                            case 21947:
                                zzt(i10);
                                this.zzB.zzx = true;
                                int zza2 = zzm.zza((int) j3);
                                if (zza2 != -1) {
                                    this.zzB.zzy = zza2;
                                    return;
                                }
                                return;
                            case 21948:
                                zzt(i10);
                                this.zzB.zzB = (int) j3;
                                return;
                            case 21949:
                                zzt(i10);
                                this.zzB.zzC = (int) j3;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j3 != 1) {
                throw zzbh.zza("ContentEncodingScope " + j3 + " not supported", null);
            }
            return;
        }
        if (j3 == 0) {
            return;
        }
        throw zzbh.zza("ContentEncodingOrder " + j3 + " not supported", null);
    }

    @CallSuper
    public final void zzm(int i10, long j3, long j10) throws zzbh {
        zzdb.zzb(this.zzai);
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 187) {
                    if (i10 != 19899) {
                        if (i10 != 20533) {
                            if (i10 != 21968) {
                                if (i10 != 408125543) {
                                    if (i10 != 475249515) {
                                        if (i10 == 524531317 && !this.zzC) {
                                            if (this.zzi && this.zzG != -1) {
                                                this.zzF = true;
                                                return;
                                            } else {
                                                this.zzai.zzO(new zzadp(this.zzA, 0L));
                                                this.zzC = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.zzJ = new zzdu(32);
                                    this.zzK = new zzdu(32);
                                    return;
                                }
                                long j11 = this.zzx;
                                if (j11 != -1 && j11 != j3) {
                                    throw zzbh.zza("Multiple Segment elements not supported", null);
                                }
                                this.zzx = j3;
                                this.zzw = j10;
                                return;
                            }
                            zzt(i10);
                            this.zzB.zzx = true;
                            return;
                        }
                        zzt(i10);
                        this.zzB.zzg = true;
                        return;
                    }
                    this.zzD = -1;
                    this.zzE = -1L;
                    return;
                }
                this.zzL = false;
                return;
            }
            this.zzB = new zzaho();
            return;
        }
        this.zzX = false;
        this.zzY = 0L;
    }

    @CallSuper
    public final void zzn(int i10, String str) throws zzbh {
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 == 2274716) {
                        zzt(i10);
                        zzaho.zzc(this.zzB, str);
                        return;
                    }
                    return;
                }
                zzt(i10);
                this.zzB.zza = str;
                return;
            }
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw zzbh.zza("DocType " + str + " not supported", null);
            }
            return;
        }
        zzt(i10);
        this.zzB.zzb = str;
    }

    public zzahq(zzahl zzahlVar, int i10, zzakg zzakgVar) {
        this.zzx = -1L;
        this.zzy = C.TIME_UNSET;
        this.zzz = C.TIME_UNSET;
        this.zzA = C.TIME_UNSET;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = C.TIME_UNSET;
        this.zzaj = zzahlVar;
        zzahlVar.zza(new zzahn(this, null));
        this.zzk = zzakgVar;
        this.zzi = 1 == ((i10 & 1) ^ 1);
        this.zzj = (i10 & 2) == 0;
        this.zzg = new zzahs();
        this.zzh = new SparseArray();
        this.zzn = new zzed(4);
        this.zzo = new zzed(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzed(4);
        this.zzl = new zzed(zzfp.zza);
        this.zzm = new zzed(4);
        this.zzq = new zzed();
        this.zzr = new zzed();
        this.zzs = new zzed(8);
        this.zzt = new zzed();
        this.zzu = new zzed();
        this.zzS = new int[1];
    }

    public zzahq(zzakg zzakgVar, int i10) {
        this(new zzahl(), 0, zzakgVar);
    }
}
