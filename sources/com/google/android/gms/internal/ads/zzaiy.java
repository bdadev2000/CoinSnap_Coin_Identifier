package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzaiy implements zzadu {

    @Deprecated
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzaiu
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzaiy(zzalt.zza, 2)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;

    @Nullable
    private zzaix zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;

    @Nullable
    private zzfl zzK;

    @Nullable
    private zzfl zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzadx zzaj;
    private final zzait zzh;
    private final zzaja zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzalt zzl;
    private final zzfu zzm;
    private final zzfu zzn;
    private final zzfu zzo;
    private final zzfu zzp;
    private final zzfu zzq;
    private final zzfu zzr;
    private final zzfu zzs;
    private final zzfu zzt;
    private final zzfu zzu;
    private final zzfu zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i9 = zzgd.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfxs.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        L.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        L.q(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzaiy() {
        this(new zzair(), 2, zzalt.zza);
    }

    private final int zzo(zzadv zzadvVar, zzaix zzaixVar, int i9, boolean z8) throws IOException {
        int i10;
        if ("S_TEXT/UTF8".equals(zzaixVar.zzb)) {
            zzw(zzadvVar, zzb, i9);
            int i11 = this.zzab;
            zzv();
            return i11;
        }
        if ("S_TEXT/ASS".equals(zzaixVar.zzb)) {
            zzw(zzadvVar, zzd, i9);
            int i12 = this.zzab;
            zzv();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(zzaixVar.zzb)) {
            zzw(zzadvVar, zze, i9);
            int i13 = this.zzab;
            zzv();
            return i13;
        }
        zzafa zzafaVar = zzaixVar.zzW;
        boolean z9 = true;
        if (!this.zzad) {
            if (zzaixVar.zzg) {
                this.zzW &= -1073741825;
                int i14 = 128;
                if (!this.zzae) {
                    ((zzadi) zzadvVar).zzn(this.zzo.zzM(), 0, 1, false);
                    this.zzaa++;
                    if ((this.zzo.zzM()[0] & 128) != 128) {
                        this.zzah = this.zzo.zzM()[0];
                        this.zzae = true;
                    } else {
                        throw zzch.zza("Extension bit is set in signal byte", null);
                    }
                }
                byte b = this.zzah;
                if ((b & 1) == 1) {
                    int i15 = b & 2;
                    this.zzW |= 1073741824;
                    if (!this.zzai) {
                        ((zzadi) zzadvVar).zzn(this.zzt.zzM(), 0, 8, false);
                        this.zzaa += 8;
                        this.zzai = true;
                        zzfu zzfuVar = this.zzo;
                        if (i15 != 2) {
                            i14 = 0;
                        }
                        zzfuVar.zzM()[0] = (byte) (i14 | 8);
                        this.zzo.zzK(0);
                        zzafaVar.zzr(this.zzo, 1, 1);
                        this.zzab++;
                        this.zzt.zzK(0);
                        zzafaVar.zzr(this.zzt, 8, 1);
                        this.zzab += 8;
                    }
                    if (i15 == 2) {
                        if (!this.zzaf) {
                            ((zzadi) zzadvVar).zzn(this.zzo.zzM(), 0, 1, false);
                            this.zzaa++;
                            this.zzo.zzK(0);
                            this.zzag = this.zzo.zzm();
                            this.zzaf = true;
                        }
                        int i16 = this.zzag * 4;
                        this.zzo.zzH(i16);
                        ((zzadi) zzadvVar).zzn(this.zzo.zzM(), 0, i16, false);
                        this.zzaa += i16;
                        int i17 = (this.zzag >> 1) + 1;
                        int i18 = (i17 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.zzw = ByteBuffer.allocate(i18);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i17);
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            i10 = this.zzag;
                            if (i19 >= i10) {
                                break;
                            }
                            int zzp = this.zzo.zzp();
                            int i21 = zzp - i20;
                            if (i19 % 2 == 0) {
                                this.zzw.putShort((short) i21);
                            } else {
                                this.zzw.putInt(i21);
                            }
                            i19++;
                            i20 = zzp;
                        }
                        int i22 = (i9 - this.zzaa) - i20;
                        if ((i10 & 1) == 1) {
                            this.zzw.putInt(i22);
                        } else {
                            this.zzw.putShort((short) i22);
                            this.zzw.putInt(0);
                        }
                        this.zzu.zzI(this.zzw.array(), i18);
                        zzafaVar.zzr(this.zzu, i18, 1);
                        this.zzab += i18;
                    }
                }
            } else {
                byte[] bArr = zzaixVar.zzh;
                if (bArr != null) {
                    this.zzr.zzI(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzaixVar.zzb) ? zzaixVar.zzf > 0 : z8) {
                this.zzW |= 268435456;
                this.zzv.zzH(0);
                int zze2 = (this.zzr.zze() + i9) - this.zzaa;
                this.zzo.zzH(4);
                this.zzo.zzM()[0] = (byte) ((zze2 >> 24) & 255);
                this.zzo.zzM()[1] = (byte) ((zze2 >> 16) & 255);
                this.zzo.zzM()[2] = (byte) ((zze2 >> 8) & 255);
                this.zzo.zzM()[3] = (byte) (zze2 & 255);
                zzafaVar.zzr(this.zzo, 4, 2);
                this.zzab += 4;
            }
            this.zzad = true;
        }
        int zze3 = this.zzr.zze() + i9;
        if (!"V_MPEG4/ISO/AVC".equals(zzaixVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzaixVar.zzb)) {
            if (zzaixVar.zzT != null) {
                if (this.zzr.zze() != 0) {
                    z9 = false;
                }
                zzeq.zzf(z9);
                zzaixVar.zzT.zzd(zzadvVar);
            }
            while (true) {
                int i23 = this.zzaa;
                if (i23 >= zze3) {
                    break;
                }
                int zzp2 = zzp(zzadvVar, zzafaVar, zze3 - i23);
                this.zzaa += zzp2;
                this.zzab += zzp2;
            }
        } else {
            byte[] zzM = this.zzn.zzM();
            zzM[0] = 0;
            zzM[1] = 0;
            zzM[2] = 0;
            int i24 = zzaixVar.zzX;
            int i25 = 4 - i24;
            while (this.zzaa < zze3) {
                int i26 = this.zzac;
                if (i26 == 0) {
                    int min = Math.min(i24, this.zzr.zzb());
                    ((zzadi) zzadvVar).zzn(zzM, i25 + min, i24 - min, false);
                    if (min > 0) {
                        this.zzr.zzG(zzM, i25, min);
                    }
                    this.zzaa += i24;
                    this.zzn.zzK(0);
                    this.zzac = this.zzn.zzp();
                    this.zzm.zzK(0);
                    zzaey.zzb(zzafaVar, this.zzm, 4);
                    this.zzab += 4;
                } else {
                    int zzp3 = zzp(zzadvVar, zzafaVar, i26);
                    this.zzaa += zzp3;
                    this.zzab += zzp3;
                    this.zzac -= zzp3;
                }
            }
        }
        if ("A_VORBIS".equals(zzaixVar.zzb)) {
            this.zzp.zzK(0);
            zzaey.zzb(zzafaVar, this.zzp, 4);
            this.zzab += 4;
        }
        int i27 = this.zzab;
        zzv();
        return i27;
    }

    private final int zzp(zzadv zzadvVar, zzafa zzafaVar, int i9) throws IOException {
        int zzb2 = this.zzr.zzb();
        if (zzb2 > 0) {
            int min = Math.min(i9, zzb2);
            zzaey.zzb(zzafaVar, this.zzr, min);
            return min;
        }
        return zzaey.zza(zzafaVar, zzadvVar, i9, false);
    }

    private final long zzq(long j7) throws zzch {
        long j9 = this.zzz;
        if (j9 != C.TIME_UNSET) {
            return zzgd.zzt(j7, j9, 1000L, RoundingMode.FLOOR);
        }
        throw zzch.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzr(int i9) throws zzch {
        if (this.zzK != null && this.zzL != null) {
            return;
        }
        throw zzch.zza("Element " + i9 + " must be in a Cues", null);
    }

    private final void zzs(int i9) throws zzch {
        if (this.zzC != null) {
            return;
        }
        throw zzch.zza("Element " + i9 + " must be in a TrackEntry", null);
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
    private final void zzt(com.google.android.gms.internal.ads.zzaix r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiy.zzt(com.google.android.gms.internal.ads.zzaix, long, int, int, int):void");
    }

    private final void zzu(zzadv zzadvVar, int i9) throws IOException {
        if (this.zzo.zze() >= i9) {
            return;
        }
        if (this.zzo.zzc() < i9) {
            zzfu zzfuVar = this.zzo;
            int zzc2 = zzfuVar.zzc();
            zzfuVar.zzE(Math.max(zzc2 + zzc2, i9));
        }
        zzfu zzfuVar2 = this.zzo;
        ((zzadi) zzadvVar).zzn(zzfuVar2.zzM(), zzfuVar2.zze(), i9 - zzfuVar2.zze(), false);
        this.zzo.zzJ(i9);
    }

    private final void zzv() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzr.zzH(0);
    }

    private final void zzw(zzadv zzadvVar, byte[] bArr, int i9) throws IOException {
        int length = bArr.length;
        int i10 = length + i9;
        if (this.zzs.zzc() < i10) {
            zzfu zzfuVar = this.zzs;
            byte[] copyOf = Arrays.copyOf(bArr, i10 + i9);
            zzfuVar.zzI(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzs.zzM(), 0, length);
        }
        ((zzadi) zzadvVar).zzn(this.zzs.zzM(), length, i9, false);
        this.zzs.zzK(0);
        this.zzs.zzJ(i10);
    }

    private static byte[] zzx(long j7, String str, long j9) {
        boolean z8;
        if (j7 != C.TIME_UNSET) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        Locale locale = Locale.US;
        int i9 = (int) (j7 / 3600000000L);
        Integer valueOf = Integer.valueOf(i9);
        long j10 = j7 - (i9 * 3600000000L);
        int i10 = (int) (j10 / 60000000);
        Integer valueOf2 = Integer.valueOf(i10);
        long j11 = j10 - (i10 * 60000000);
        int i11 = (int) (j11 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i11), Integer.valueOf((int) ((j11 - (i11 * 1000000)) / j9)));
        int i12 = zzgd.zza;
        return format.getBytes(zzfxs.zzc);
    }

    private static int[] zzy(@Nullable int[] iArr, int i9) {
        if (iArr == null) {
            return new int[i9];
        }
        int length = iArr.length;
        if (length >= i9) {
            return iArr;
        }
        return new int[Math.max(length + length, i9)];
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        this.zzN = false;
        while (!this.zzN) {
            if (this.zzh.zzc(zzadvVar)) {
                long zzf2 = zzadvVar.zzf();
                if (this.zzG) {
                    this.zzI = zzf2;
                    zzaeqVar.zza = this.zzH;
                    this.zzG = false;
                    return 1;
                }
                if (this.zzD) {
                    long j7 = this.zzI;
                    if (j7 != -1) {
                        zzaeqVar.zza = j7;
                        this.zzI = -1L;
                        return 1;
                    }
                }
            } else {
                for (int i9 = 0; i9 < this.zzj.size(); i9++) {
                    zzaix zzaixVar = (zzaix) this.zzj.valueAt(i9);
                    zzaix.zzd(zzaixVar);
                    zzafb zzafbVar = zzaixVar.zzT;
                    if (zzafbVar != null) {
                        zzafbVar.zza(zzaixVar.zzW, zzaixVar.zzi);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzaj = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    @CallSuper
    public final void zze(long j7, long j9) {
        this.zzJ = C.TIME_UNSET;
        this.zzO = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzv();
        for (int i9 = 0; i9 < this.zzj.size(); i9++) {
            zzafb zzafbVar = ((zzaix) this.zzj.valueAt(i9)).zzT;
            if (zzafbVar != null) {
                zzafbVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        return new zzaiz().zza(zzadvVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0285, code lost:
    
        throw com.google.android.gms.internal.ads.zzch.zza("EBML lacing sample size out of range.", null);
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(int r22, int r23, com.google.android.gms.internal.ads.zzadv r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiy.zzh(int, int, com.google.android.gms.internal.ads.zzadv):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0259, code lost:
    
        if (r5.equals("V_AV1") != false) goto L188;
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(int r22) throws com.google.android.gms.internal.ads.zzch {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiy.zzi(int):void");
    }

    @CallSuper
    public final void zzj(int i9, double d2) throws zzch {
        if (i9 != 181) {
            if (i9 != 17545) {
                switch (i9) {
                    case 21969:
                        zzs(i9);
                        this.zzC.zzD = (float) d2;
                        return;
                    case 21970:
                        zzs(i9);
                        this.zzC.zzE = (float) d2;
                        return;
                    case 21971:
                        zzs(i9);
                        this.zzC.zzF = (float) d2;
                        return;
                    case 21972:
                        zzs(i9);
                        this.zzC.zzG = (float) d2;
                        return;
                    case 21973:
                        zzs(i9);
                        this.zzC.zzH = (float) d2;
                        return;
                    case 21974:
                        zzs(i9);
                        this.zzC.zzI = (float) d2;
                        return;
                    case 21975:
                        zzs(i9);
                        this.zzC.zzJ = (float) d2;
                        return;
                    case 21976:
                        zzs(i9);
                        this.zzC.zzK = (float) d2;
                        return;
                    case 21977:
                        zzs(i9);
                        this.zzC.zzL = (float) d2;
                        return;
                    case 21978:
                        zzs(i9);
                        this.zzC.zzM = (float) d2;
                        return;
                    default:
                        switch (i9) {
                            case 30323:
                                zzs(i9);
                                this.zzC.zzs = (float) d2;
                                return;
                            case 30324:
                                zzs(i9);
                                this.zzC.zzt = (float) d2;
                                return;
                            case 30325:
                                zzs(i9);
                                this.zzC.zzu = (float) d2;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.zzA = (long) d2;
            return;
        }
        zzs(i9);
        this.zzC.zzQ = (int) d2;
    }

    @CallSuper
    public final void zzk(int i9, long j7) throws zzch {
        if (i9 != 20529) {
            if (i9 != 20530) {
                boolean z8 = false;
                switch (i9) {
                    case 131:
                        zzs(i9);
                        this.zzC.zzd = (int) j7;
                        return;
                    case 136:
                        if (j7 == 1) {
                            z8 = true;
                        }
                        zzs(i9);
                        this.zzC.zzV = z8;
                        return;
                    case 155:
                        this.zzQ = zzq(j7);
                        return;
                    case 159:
                        zzs(i9);
                        this.zzC.zzO = (int) j7;
                        return;
                    case 176:
                        zzs(i9);
                        this.zzC.zzl = (int) j7;
                        return;
                    case 179:
                        zzr(i9);
                        this.zzK.zzc(zzq(j7));
                        return;
                    case 186:
                        zzs(i9);
                        this.zzC.zzm = (int) j7;
                        return;
                    case 215:
                        zzs(i9);
                        this.zzC.zzc = (int) j7;
                        return;
                    case 231:
                        this.zzJ = zzq(j7);
                        return;
                    case 238:
                        this.zzX = (int) j7;
                        return;
                    case 241:
                        if (!this.zzM) {
                            zzr(i9);
                            this.zzL.zzc(j7);
                            this.zzM = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzY = true;
                        return;
                    case 16871:
                        zzs(i9);
                        zzaix.zzb(this.zzC, (int) j7);
                        return;
                    case 16980:
                        if (j7 != 3) {
                            throw zzch.zza("ContentCompAlgo " + j7 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j7 < 1 || j7 > 2) {
                            throw zzch.zza("DocTypeReadVersion " + j7 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j7 != 1) {
                            throw zzch.zza("EBMLReadVersion " + j7 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j7 != 5) {
                            throw zzch.zza("ContentEncAlgo " + j7 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j7 != 1) {
                            throw zzch.zza("AESSettingsCipherMode " + j7 + " not supported", null);
                        }
                        return;
                    case 21420:
                        this.zzF = j7 + this.zzy;
                        return;
                    case 21432:
                        int i10 = (int) j7;
                        zzs(i9);
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 3) {
                                    if (i10 == 15) {
                                        this.zzC.zzw = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzC.zzw = 1;
                                return;
                            }
                            this.zzC.zzw = 2;
                            return;
                        }
                        this.zzC.zzw = 0;
                        return;
                    case 21680:
                        zzs(i9);
                        this.zzC.zzo = (int) j7;
                        return;
                    case 21682:
                        zzs(i9);
                        this.zzC.zzq = (int) j7;
                        return;
                    case 21690:
                        zzs(i9);
                        this.zzC.zzp = (int) j7;
                        return;
                    case 21930:
                        if (j7 == 1) {
                            z8 = true;
                        }
                        zzs(i9);
                        this.zzC.zzU = z8;
                        return;
                    case 21938:
                        zzs(i9);
                        zzaix zzaixVar = this.zzC;
                        zzaixVar.zzx = true;
                        zzaixVar.zzn = (int) j7;
                        return;
                    case 21998:
                        zzs(i9);
                        this.zzC.zzf = (int) j7;
                        return;
                    case 22186:
                        zzs(i9);
                        this.zzC.zzR = j7;
                        return;
                    case 22203:
                        zzs(i9);
                        this.zzC.zzS = j7;
                        return;
                    case 25188:
                        zzs(i9);
                        this.zzC.zzP = (int) j7;
                        return;
                    case 30114:
                        this.zzZ = j7;
                        return;
                    case 30321:
                        int i11 = (int) j7;
                        zzs(i9);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        this.zzC.zzr = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.zzC.zzr = 2;
                                return;
                            }
                            this.zzC.zzr = 1;
                            return;
                        }
                        this.zzC.zzr = 0;
                        return;
                    case 2352003:
                        zzs(i9);
                        this.zzC.zze = (int) j7;
                        return;
                    case 2807729:
                        this.zzz = j7;
                        return;
                    default:
                        switch (i9) {
                            case 21945:
                                int i12 = (int) j7;
                                zzs(i9);
                                if (i12 != 1) {
                                    if (i12 == 2) {
                                        this.zzC.zzA = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.zzC.zzA = 2;
                                return;
                            case 21946:
                                zzs(i9);
                                int zzb2 = zzt.zzb((int) j7);
                                if (zzb2 != -1) {
                                    this.zzC.zzz = zzb2;
                                    return;
                                }
                                return;
                            case 21947:
                                zzs(i9);
                                this.zzC.zzx = true;
                                int zza2 = zzt.zza((int) j7);
                                if (zza2 != -1) {
                                    this.zzC.zzy = zza2;
                                    return;
                                }
                                return;
                            case 21948:
                                zzs(i9);
                                this.zzC.zzB = (int) j7;
                                return;
                            case 21949:
                                zzs(i9);
                                this.zzC.zzC = (int) j7;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j7 != 1) {
                throw zzch.zza("ContentEncodingScope " + j7 + " not supported", null);
            }
            return;
        }
        if (j7 == 0) {
            return;
        }
        throw zzch.zza("ContentEncodingOrder " + j7 + " not supported", null);
    }

    @CallSuper
    public final void zzl(int i9, long j7, long j9) throws zzch {
        zzeq.zzb(this.zzaj);
        if (i9 != 160) {
            if (i9 != 174) {
                if (i9 != 187) {
                    if (i9 != 19899) {
                        if (i9 != 20533) {
                            if (i9 != 21968) {
                                if (i9 != 408125543) {
                                    if (i9 != 475249515) {
                                        if (i9 == 524531317 && !this.zzD) {
                                            if (this.zzk && this.zzH != -1) {
                                                this.zzG = true;
                                                return;
                                            } else {
                                                this.zzaj.zzO(new zzaes(this.zzB, 0L));
                                                this.zzD = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.zzK = new zzfl(32);
                                    this.zzL = new zzfl(32);
                                    return;
                                }
                                long j10 = this.zzy;
                                if (j10 != -1 && j10 != j7) {
                                    throw zzch.zza("Multiple Segment elements not supported", null);
                                }
                                this.zzy = j7;
                                this.zzx = j9;
                                return;
                            }
                            zzs(i9);
                            this.zzC.zzx = true;
                            return;
                        }
                        zzs(i9);
                        this.zzC.zzg = true;
                        return;
                    }
                    this.zzE = -1;
                    this.zzF = -1L;
                    return;
                }
                this.zzM = false;
                return;
            }
            this.zzC = new zzaix();
            return;
        }
        this.zzY = false;
        this.zzZ = 0L;
    }

    @CallSuper
    public final void zzm(int i9, String str) throws zzch {
        if (i9 != 134) {
            if (i9 != 17026) {
                if (i9 != 21358) {
                    if (i9 == 2274716) {
                        zzs(i9);
                        zzaix.zzc(this.zzC, str);
                        return;
                    }
                    return;
                }
                zzs(i9);
                this.zzC.zza = str;
                return;
            }
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw zzch.zza("DocType " + str + " not supported", null);
            }
            return;
        }
        zzs(i9);
        this.zzC.zzb = str;
    }

    public zzaiy(zzait zzaitVar, int i9, zzalt zzaltVar) {
        this.zzy = -1L;
        this.zzz = C.TIME_UNSET;
        this.zzA = C.TIME_UNSET;
        this.zzB = C.TIME_UNSET;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = C.TIME_UNSET;
        this.zzh = zzaitVar;
        zzaitVar.zza(new zzaiw(this, null));
        this.zzl = zzaltVar;
        this.zzk = true;
        this.zzi = new zzaja();
        this.zzj = new SparseArray();
        this.zzo = new zzfu(4);
        this.zzp = new zzfu(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzfu(4);
        this.zzm = new zzfu(zzgr.zza);
        this.zzn = new zzfu(4);
        this.zzr = new zzfu();
        this.zzs = new zzfu();
        this.zzt = new zzfu(8);
        this.zzu = new zzfu();
        this.zzv = new zzfu();
        this.zzT = new int[1];
    }

    public zzaiy(zzalt zzaltVar, int i9) {
        this(new zzair(), 2, zzaltVar);
    }
}
