package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.t;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
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
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class zzaia implements zzadb {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;

    @Nullable
    private zzahz zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;

    @Nullable
    private zzeb zzJ;

    @Nullable
    private zzeb zzK;
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
    private zzade zzai;
    private final zzahv zzaj;
    private final zzaic zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakt zzk;
    private final zzek zzl;
    private final zzek zzm;
    private final zzek zzn;
    private final zzek zzo;
    private final zzek zzp;
    private final zzek zzq;
    private final zzek zzr;
    private final zzek zzs;
    private final zzek zzt;
    private final zzek zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i2 = zzeu.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        t.s(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        t.s(Opcodes.GETFIELD, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzf = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzaia() {
        this(new zzahv(), 2, zzakt.zza);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzp(zzadc zzadcVar, zzahz zzahzVar, int i2, boolean z2) throws IOException {
        int i3;
        if ("S_TEXT/UTF8".equals(zzahzVar.zzb)) {
            zzx(zzadcVar, zza, i2);
            int i4 = this.zzaa;
            zzw();
            return i4;
        }
        if ("S_TEXT/ASS".equals(zzahzVar.zzb)) {
            zzx(zzadcVar, zzc, i2);
            int i5 = this.zzaa;
            zzw();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(zzahzVar.zzb)) {
            zzx(zzadcVar, zzd, i2);
            int i6 = this.zzaa;
            zzw();
            return i6;
        }
        zzaeh zzaehVar = zzahzVar.zzW;
        if (!this.zzac) {
            if (zzahzVar.zzg) {
                this.zzV &= -1073741825;
                if (!this.zzad) {
                    zzadcVar.zzi(this.zzn.zzN(), 0, 1);
                    this.zzZ++;
                    if ((this.zzn.zzN()[0] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                        throw zzbo.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzN()[0];
                    this.zzad = true;
                }
                byte b2 = this.zzag;
                if ((b2 & 1) == 1) {
                    int i7 = b2 & 2;
                    this.zzV |= Ints.MAX_POWER_OF_TWO;
                    if (!this.zzah) {
                        zzadcVar.zzi(this.zzs.zzN(), 0, 8);
                        this.zzZ += 8;
                        this.zzah = true;
                        this.zzn.zzN()[0] = (byte) ((i7 != 2 ? 0 : 128) | 8);
                        this.zzn.zzL(0);
                        zzaehVar.zzr(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzL(0);
                        zzaehVar.zzr(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i7 == 2) {
                        if (!this.zzae) {
                            zzadcVar.zzi(this.zzn.zzN(), 0, 1);
                            this.zzZ++;
                            this.zzn.zzL(0);
                            this.zzaf = this.zzn.zzm();
                            this.zzae = true;
                        }
                        int i8 = this.zzaf * 4;
                        this.zzn.zzI(i8);
                        zzadcVar.zzi(this.zzn.zzN(), 0, i8);
                        this.zzZ += i8;
                        int i9 = (this.zzaf >> 1) + 1;
                        int i10 = (i9 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.zzv = ByteBuffer.allocate(i10);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i9);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i3 = this.zzaf;
                            if (i11 >= i3) {
                                break;
                            }
                            int zzp = this.zzn.zzp();
                            int i13 = zzp - i12;
                            if (i11 % 2 == 0) {
                                this.zzv.putShort((short) i13);
                            } else {
                                this.zzv.putInt(i13);
                            }
                            i11++;
                            i12 = zzp;
                        }
                        int i14 = (i2 - this.zzZ) - i12;
                        if ((i3 & 1) == 1) {
                            this.zzv.putInt(i14);
                        } else {
                            this.zzv.putShort((short) i14);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzJ(this.zzv.array(), i10);
                        zzaehVar.zzr(this.zzt, i10, 1);
                        this.zzaa += i10;
                    }
                }
            } else {
                byte[] bArr = zzahzVar.zzh;
                if (bArr != null) {
                    this.zzq.zzJ(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahzVar.zzb) ? zzahzVar.zzf > 0 : z2) {
                this.zzV |= 268435456;
                this.zzu.zzI(0);
                int zze2 = (this.zzq.zze() + i2) - this.zzZ;
                this.zzn.zzI(4);
                this.zzn.zzN()[0] = (byte) ((zze2 >> 24) & 255);
                this.zzn.zzN()[1] = (byte) ((zze2 >> 16) & 255);
                this.zzn.zzN()[2] = (byte) ((zze2 >> 8) & 255);
                this.zzn.zzN()[3] = (byte) (zze2 & 255);
                zzaehVar.zzr(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int zze3 = this.zzq.zze() + i2;
        if (!"V_MPEG4/ISO/AVC".equals(zzahzVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahzVar.zzb)) {
            if (zzahzVar.zzT != null) {
                zzdi.zzf(this.zzq.zze() == 0);
                zzahzVar.zzT.zzd(zzadcVar);
            }
            while (true) {
                int i15 = this.zzZ;
                if (i15 >= zze3) {
                    break;
                }
                int zzq = zzq(zzadcVar, zzaehVar, zze3 - i15);
                this.zzZ += zzq;
                this.zzaa += zzq;
            }
        } else {
            byte[] zzN = this.zzm.zzN();
            zzN[0] = 0;
            zzN[1] = 0;
            zzN[2] = 0;
            int i16 = zzahzVar.zzX;
            int i17 = 4 - i16;
            while (this.zzZ < zze3) {
                int i18 = this.zzab;
                if (i18 == 0) {
                    int min = Math.min(i16, this.zzq.zzb());
                    zzadcVar.zzi(zzN, i17 + min, i16 - min);
                    if (min > 0) {
                        this.zzq.zzH(zzN, i17, min);
                    }
                    this.zzZ += i16;
                    this.zzm.zzL(0);
                    this.zzab = this.zzm.zzp();
                    this.zzl.zzL(0);
                    zzaehVar.zzq(this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int zzq2 = zzq(zzadcVar, zzaehVar, i18);
                    this.zzZ += zzq2;
                    this.zzaa += zzq2;
                    this.zzab -= zzq2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahzVar.zzb)) {
            this.zzo.zzL(0);
            zzaehVar.zzq(this.zzo, 4);
            this.zzaa += 4;
        }
        int i19 = this.zzaa;
        zzw();
        return i19;
    }

    private final int zzq(zzadc zzadcVar, zzaeh zzaehVar, int i2) throws IOException {
        int zzb2 = this.zzq.zzb();
        if (zzb2 <= 0) {
            return zzaehVar.zzf(zzadcVar, i2, false);
        }
        int min = Math.min(i2, zzb2);
        zzaehVar.zzq(this.zzq, min);
        return min;
    }

    private final long zzr(long j2) throws zzbo {
        long j3 = this.zzy;
        if (j3 != -9223372036854775807L) {
            return zzeu.zzt(j2, j3, 1000L, RoundingMode.FLOOR);
        }
        throw zzbo.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzs(int i2) throws zzbo {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbo.zza("Element " + i2 + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzt(int i2) throws zzbo {
        if (this.zzB != null) {
            return;
        }
        throw zzbo.zza("Element " + i2 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[EDGE_INSN: B:50:0x00e0->B:49:0x00e0 BREAK  A[LOOP:0: B:42:0x00c5->B:46:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzu(com.google.android.gms.internal.ads.zzahz r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaia.zzu(com.google.android.gms.internal.ads.zzahz, long, int, int, int):void");
    }

    private final void zzv(zzadc zzadcVar, int i2) throws IOException {
        if (this.zzn.zze() >= i2) {
            return;
        }
        if (this.zzn.zzc() < i2) {
            zzek zzekVar = this.zzn;
            int zzc2 = zzekVar.zzc();
            zzekVar.zzF(Math.max(zzc2 + zzc2, i2));
        }
        zzek zzekVar2 = this.zzn;
        zzadcVar.zzi(zzekVar2.zzN(), zzekVar2.zze(), i2 - zzekVar2.zze());
        this.zzn.zzK(i2);
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

    private final void zzx(zzadc zzadcVar, byte[] bArr, int i2) throws IOException {
        int length = bArr.length;
        int i3 = length + i2;
        if (this.zzr.zzc() < i3) {
            zzek zzekVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i3 + i2);
            zzekVar.zzJ(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzN(), 0, length);
        }
        zzadcVar.zzi(this.zzr.zzN(), length, i2);
        this.zzr.zzL(0);
        this.zzr.zzK(i3);
    }

    private static byte[] zzy(long j2, String str, long j3) {
        zzdi.zzd(j2 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i2 = (int) (j2 / 3600000000L);
        Integer valueOf = Integer.valueOf(i2);
        long j4 = j2 - (i2 * 3600000000L);
        int i3 = (int) (j4 / 60000000);
        Integer valueOf2 = Integer.valueOf(i3);
        long j5 = j4 - (i3 * 60000000);
        int i4 = (int) (j5 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / j3)));
        int i5 = zzeu.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(@Nullable int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzaj.zzc(zzadcVar)) {
                for (int i2 = 0; i2 < this.zzh.size(); i2++) {
                    zzahz zzahzVar = (zzahz) this.zzh.valueAt(i2);
                    zzahz.zzd(zzahzVar);
                    zzaei zzaeiVar = zzahzVar.zzT;
                    if (zzaeiVar != null) {
                        zzaeiVar.zza(zzahzVar.zzW, zzahzVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzadcVar.zzf();
            if (this.zzF) {
                this.zzH = zzf2;
                zzadxVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j2 = this.zzH;
                if (j2 != -1) {
                    zzadxVar.zza = j2;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ zzadb zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ List zzd() {
        return zzgax.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(zzade zzadeVar) {
        this.zzai = zzadeVar;
        if (this.zzj) {
            zzadeVar = new zzakw(zzadeVar, this.zzk);
        }
        this.zzai = zzadeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    @CallSuper
    public final void zzf(long j2, long j3) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzaj.zzb();
        this.zzg.zze();
        zzw();
        for (int i2 = 0; i2 < this.zzh.size(); i2++) {
            zzaei zzaeiVar = ((zzahz) this.zzh.valueAt(i2)).zzT;
            if (zzaeiVar != null) {
                zzaeiVar.zzb();
            }
        }
    }

    @CallSuper
    public final void zzh(int i2, int i3, zzadc zzadcVar) throws IOException {
        int i4;
        long j2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i2;
        Throwable th = null;
        int i11 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                zzahz zzahzVar = (zzahz) this.zzh.get(this.zzT);
                if (this.zzW != 4 || !"V_VP9".equals(zzahzVar.zzb)) {
                    zzadcVar.zzk(i3);
                    return;
                } else {
                    this.zzu.zzI(i3);
                    zzadcVar.zzi(this.zzu.zzN(), 0, i3);
                    return;
                }
            }
            if (i10 == 16877) {
                zzt(i2);
                zzahz zzahzVar2 = this.zzB;
                if (zzahz.zza(zzahzVar2) != 1685485123 && zzahz.zza(zzahzVar2) != 1685480259) {
                    zzadcVar.zzk(i3);
                    return;
                }
                byte[] bArr = new byte[i3];
                zzahzVar2.zzN = bArr;
                zzadcVar.zzi(bArr, 0, i3);
                return;
            }
            if (i10 == 16981) {
                zzt(i2);
                byte[] bArr2 = new byte[i3];
                this.zzB.zzh = bArr2;
                zzadcVar.zzi(bArr2, 0, i3);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i3];
                zzadcVar.zzi(bArr3, 0, i3);
                zzt(i2);
                this.zzB.zzi = new zzaeg(1, bArr3, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.zzp.zzN(), (byte) 0);
                zzadcVar.zzi(this.zzp.zzN(), 4 - i3, i3);
                this.zzp.zzL(0);
                this.zzD = (int) this.zzp.zzu();
                return;
            }
            if (i10 == 25506) {
                zzt(i2);
                byte[] bArr4 = new byte[i3];
                this.zzB.zzj = bArr4;
                zzadcVar.zzi(bArr4, 0, i3);
                return;
            }
            if (i10 != 30322) {
                throw zzbo.zza("Unexpected id: " + i10, null);
            }
            zzt(i2);
            byte[] bArr5 = new byte[i3];
            this.zzB.zzv = bArr5;
            zzadcVar.zzi(bArr5, 0, i3);
            return;
        }
        if (this.zzN == 0) {
            this.zzT = (int) this.zzg.zzd(zzadcVar, false, true, 8);
            this.zzU = this.zzg.zza();
            this.zzP = -9223372036854775807L;
            this.zzN = 1;
            this.zzn.zzI(0);
        }
        zzahz zzahzVar3 = (zzahz) this.zzh.get(this.zzT);
        if (zzahzVar3 == null) {
            zzadcVar.zzk(i3 - this.zzU);
            this.zzN = 0;
            return;
        }
        zzahz.zzd(zzahzVar3);
        if (this.zzN == 1) {
            zzv(zzadcVar, 3);
            int i12 = (this.zzn.zzN()[2] & 6) >> 1;
            byte b2 = UnsignedBytes.MAX_VALUE;
            if (i12 == 0) {
                this.zzR = 1;
                int[] zzz = zzz(this.zzS, 1);
                this.zzS = zzz;
                zzz[0] = (i3 - this.zzU) - 3;
            } else {
                zzv(zzadcVar, 4);
                int i13 = (this.zzn.zzN()[3] & UnsignedBytes.MAX_VALUE) + 1;
                this.zzR = i13;
                int[] zzz2 = zzz(this.zzS, i13);
                this.zzS = zzz2;
                if (i12 == 2) {
                    int i14 = (i3 - this.zzU) - 4;
                    int i15 = this.zzR;
                    Arrays.fill(zzz2, 0, i15, i14 / i15);
                } else {
                    if (i12 != 1) {
                        if (i12 != 3) {
                            throw zzbo.zza("Unexpected lacing value: 2", null);
                        }
                        int i16 = 0;
                        int i17 = 0;
                        int i18 = 4;
                        while (true) {
                            int i19 = this.zzR - 1;
                            if (i16 >= i19) {
                                this.zzS[i19] = ((i3 - this.zzU) - i18) - i17;
                                break;
                            }
                            this.zzS[i16] = 0;
                            int i20 = i18 + 1;
                            zzv(zzadcVar, i20);
                            if (this.zzn.zzN()[i18] == 0) {
                                throw zzbo.zza("No valid varint length mask found", th);
                            }
                            int i21 = 0;
                            while (true) {
                                if (i21 >= 8) {
                                    j2 = 0;
                                    i5 = i20;
                                    break;
                                }
                                int i22 = i11 << (7 - i21);
                                if ((this.zzn.zzN()[i18] & i22) != 0) {
                                    int i23 = i20 + i21;
                                    zzv(zzadcVar, i23);
                                    j2 = this.zzn.zzN()[i18] & b2 & (~i22);
                                    int i24 = i18 + 1;
                                    while (i24 < i23) {
                                        j2 = (j2 << 8) | (this.zzn.zzN()[i24] & b2);
                                        i24++;
                                        i23 = i23;
                                        b2 = UnsignedBytes.MAX_VALUE;
                                    }
                                    i5 = i23;
                                    if (i16 > 0) {
                                        j2 -= (1 << ((i21 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i21++;
                                    i11 = 1;
                                    b2 = UnsignedBytes.MAX_VALUE;
                                }
                            }
                            if (j2 < -2147483648L || j2 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzS;
                            int i25 = (int) j2;
                            if (i16 != 0) {
                                i25 += iArr[i16 - 1];
                            }
                            iArr[i16] = i25;
                            i17 += i25;
                            i16++;
                            i18 = i5;
                            th = null;
                            i11 = 1;
                            b2 = UnsignedBytes.MAX_VALUE;
                        }
                        throw zzbo.zza("EBML lacing sample size out of range.", null);
                    }
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 4;
                    while (true) {
                        i6 = this.zzR - 1;
                        if (i26 >= i6) {
                            break;
                        }
                        this.zzS[i26] = 0;
                        while (true) {
                            i7 = i28 + 1;
                            zzv(zzadcVar, i7);
                            int i29 = this.zzn.zzN()[i28] & UnsignedBytes.MAX_VALUE;
                            int[] iArr2 = this.zzS;
                            i8 = iArr2[i26] + i29;
                            iArr2[i26] = i8;
                            if (i29 != 255) {
                                break;
                            } else {
                                i28 = i7;
                            }
                        }
                        i27 += i8;
                        i26++;
                        i28 = i7;
                    }
                    this.zzS[i6] = ((i3 - this.zzU) - i28) - i27;
                }
            }
            this.zzO = this.zzI + zzr((this.zzn.zzN()[0] << 8) | (this.zzn.zzN()[1] & UnsignedBytes.MAX_VALUE));
            if (zzahzVar3.zzd != 2) {
                if (i10 != 163) {
                    i9 = 0;
                } else if ((this.zzn.zzN()[2] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                    i10 = Opcodes.IF_ICMPGT;
                } else {
                    i9 = 0;
                    i10 = Opcodes.IF_ICMPGT;
                }
                this.zzV = i9;
                this.zzN = 2;
                this.zzQ = 0;
                i4 = Opcodes.IF_ICMPGT;
            }
            i9 = 1;
            this.zzV = i9;
            this.zzN = 2;
            this.zzQ = 0;
            i4 = Opcodes.IF_ICMPGT;
        } else {
            i4 = 163;
        }
        if (i10 == i4) {
            while (true) {
                int i30 = this.zzQ;
                if (i30 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                zzu(zzahzVar3, ((this.zzQ * zzahzVar3.zze) / 1000) + this.zzO, this.zzV, zzp(zzadcVar, zzahzVar3, this.zzS[i30], false), 0);
                this.zzQ++;
            }
        } else {
            while (true) {
                int i31 = this.zzQ;
                if (i31 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                iArr3[i31] = zzp(zzadcVar, zzahzVar3, iArr3[i31], true);
                this.zzQ++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        return new zzaib().zza(zzadcVar);
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
    public final void zzj(int r22) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaia.zzj(int):void");
    }

    @CallSuper
    public final void zzk(int i2, double d) throws zzbo {
        if (i2 == 181) {
            zzt(i2);
            this.zzB.zzQ = (int) d;
            return;
        }
        if (i2 == 17545) {
            this.zzz = (long) d;
            return;
        }
        switch (i2) {
            case 21969:
                zzt(i2);
                this.zzB.zzD = (float) d;
                return;
            case 21970:
                zzt(i2);
                this.zzB.zzE = (float) d;
                return;
            case 21971:
                zzt(i2);
                this.zzB.zzF = (float) d;
                return;
            case 21972:
                zzt(i2);
                this.zzB.zzG = (float) d;
                return;
            case 21973:
                zzt(i2);
                this.zzB.zzH = (float) d;
                return;
            case 21974:
                zzt(i2);
                this.zzB.zzI = (float) d;
                return;
            case 21975:
                zzt(i2);
                this.zzB.zzJ = (float) d;
                return;
            case 21976:
                zzt(i2);
                this.zzB.zzK = (float) d;
                return;
            case 21977:
                zzt(i2);
                this.zzB.zzL = (float) d;
                return;
            case 21978:
                zzt(i2);
                this.zzB.zzM = (float) d;
                return;
            default:
                switch (i2) {
                    case 30323:
                        zzt(i2);
                        this.zzB.zzs = (float) d;
                        return;
                    case 30324:
                        zzt(i2);
                        this.zzB.zzt = (float) d;
                        return;
                    case 30325:
                        zzt(i2);
                        this.zzB.zzu = (float) d;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    public final void zzl(int i2, long j2) throws zzbo {
        boolean z2;
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            throw zzbo.zza("ContentEncodingOrder " + j2 + " not supported", null);
        }
        if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            throw zzbo.zza("ContentEncodingScope " + j2 + " not supported", null);
        }
        switch (i2) {
            case Opcodes.LXOR /* 131 */:
                zzt(i2);
                this.zzB.zzd = (int) j2;
                return;
            case Opcodes.L2I /* 136 */:
                z2 = j2 == 1;
                zzt(i2);
                this.zzB.zzV = z2;
                return;
            case 155:
                this.zzP = zzr(j2);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                zzt(i2);
                this.zzB.zzO = (int) j2;
                return;
            case Opcodes.ARETURN /* 176 */:
                zzt(i2);
                this.zzB.zzl = (int) j2;
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                zzs(i2);
                this.zzJ.zzc(zzr(j2));
                return;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                zzt(i2);
                this.zzB.zzm = (int) j2;
                return;
            case 215:
                zzt(i2);
                this.zzB.zzc = (int) j2;
                return;
            case 231:
                this.zzI = zzr(j2);
                return;
            case 238:
                this.zzW = (int) j2;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzs(i2);
                this.zzK.zzc(j2);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzt(i2);
                zzahz.zzb(this.zzB, (int) j2);
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                throw zzbo.zza("ContentCompAlgo " + j2 + " not supported", null);
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    throw zzbo.zza("DocTypeReadVersion " + j2 + " not supported", null);
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                throw zzbo.zza("EBMLReadVersion " + j2 + " not supported", null);
            case 18401:
                if (j2 == 5) {
                    return;
                }
                throw zzbo.zza("ContentEncAlgo " + j2 + " not supported", null);
            case 18408:
                if (j2 == 1) {
                    return;
                }
                throw zzbo.zza("AESSettingsCipherMode " + j2 + " not supported", null);
            case 21420:
                this.zzE = j2 + this.zzx;
                return;
            case 21432:
                int i3 = (int) j2;
                zzt(i2);
                if (i3 == 0) {
                    this.zzB.zzw = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzB.zzw = 2;
                    return;
                } else if (i3 == 3) {
                    this.zzB.zzw = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.zzB.zzw = 3;
                    return;
                }
            case 21680:
                zzt(i2);
                this.zzB.zzo = (int) j2;
                return;
            case 21682:
                zzt(i2);
                this.zzB.zzq = (int) j2;
                return;
            case 21690:
                zzt(i2);
                this.zzB.zzp = (int) j2;
                return;
            case 21930:
                z2 = j2 == 1;
                zzt(i2);
                this.zzB.zzU = z2;
                return;
            case 21938:
                zzt(i2);
                zzahz zzahzVar = this.zzB;
                zzahzVar.zzx = true;
                zzahzVar.zzn = (int) j2;
                return;
            case 21998:
                zzt(i2);
                this.zzB.zzf = (int) j2;
                return;
            case 22186:
                zzt(i2);
                this.zzB.zzR = j2;
                return;
            case 22203:
                zzt(i2);
                this.zzB.zzS = j2;
                return;
            case 25188:
                zzt(i2);
                this.zzB.zzP = (int) j2;
                return;
            case 30114:
                this.zzY = j2;
                return;
            case 30321:
                int i4 = (int) j2;
                zzt(i2);
                if (i4 == 0) {
                    this.zzB.zzr = 0;
                    return;
                }
                if (i4 == 1) {
                    this.zzB.zzr = 1;
                    return;
                } else if (i4 == 2) {
                    this.zzB.zzr = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.zzB.zzr = 3;
                    return;
                }
            case 2352003:
                zzt(i2);
                this.zzB.zze = (int) j2;
                return;
            case 2807729:
                this.zzy = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        int i5 = (int) j2;
                        zzt(i2);
                        if (i5 == 1) {
                            this.zzB.zzA = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.zzB.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzt(i2);
                        int zzb2 = zzo.zzb((int) j2);
                        if (zzb2 != -1) {
                            this.zzB.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21947:
                        zzt(i2);
                        this.zzB.zzx = true;
                        int zza2 = zzo.zza((int) j2);
                        if (zza2 != -1) {
                            this.zzB.zzy = zza2;
                            return;
                        }
                        return;
                    case 21948:
                        zzt(i2);
                        this.zzB.zzB = (int) j2;
                        return;
                    case 21949:
                        zzt(i2);
                        this.zzB.zzC = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    public final void zzm(int i2, long j2, long j3) throws zzbo {
        zzdi.zzb(this.zzai);
        if (i2 == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i2 == 174) {
            this.zzB = new zzahz();
            return;
        }
        if (i2 == 187) {
            this.zzL = false;
            return;
        }
        if (i2 == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i2 == 20533) {
            zzt(i2);
            this.zzB.zzg = true;
            return;
        }
        if (i2 == 21968) {
            zzt(i2);
            this.zzB.zzx = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.zzx;
            if (j4 != -1 && j4 != j2) {
                throw zzbo.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j2;
            this.zzw = j3;
            return;
        }
        if (i2 == 475249515) {
            this.zzJ = new zzeb(32);
            this.zzK = new zzeb(32);
        } else if (i2 == 524531317 && !this.zzC) {
            if (this.zzi && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzO(new zzadz(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    @CallSuper
    public final void zzn(int i2, String str) throws zzbo {
        if (i2 == 134) {
            zzt(i2);
            this.zzB.zzb = str;
            return;
        }
        if (i2 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbo.zza("DocType " + str + " not supported", null);
        }
        if (i2 == 21358) {
            zzt(i2);
            this.zzB.zza = str;
        } else {
            if (i2 != 2274716) {
                return;
            }
            zzt(i2);
            zzahz.zzc(this.zzB, str);
        }
    }

    public zzaia(zzahv zzahvVar, int i2, zzakt zzaktVar) {
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzaj = zzahvVar;
        zzahvVar.zza(new zzahy(this, null));
        this.zzk = zzaktVar;
        this.zzi = 1 == ((i2 & 1) ^ 1);
        this.zzj = (i2 & 2) == 0;
        this.zzg = new zzaic();
        this.zzh = new SparseArray();
        this.zzn = new zzek(4);
        this.zzo = new zzek(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzek(4);
        this.zzl = new zzek(zzfs.zza);
        this.zzm = new zzek(4);
        this.zzq = new zzek();
        this.zzr = new zzek();
        this.zzs = new zzek(8);
        this.zzt = new zzek();
        this.zzu = new zzek();
        this.zzS = new int[1];
    }

    public zzaia(zzakt zzaktVar, int i2) {
        this(new zzahv(), 0, zzaktVar);
    }
}
