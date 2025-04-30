package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzakj implements zzadu, zzaet {

    @Deprecated
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzakh
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzakj(zzalt.zza, 16)};
        }
    };
    private int zzA;

    @Nullable
    private zzaie zzB;
    private final zzalt zzb;
    private final int zzc;
    private final zzfu zzd;
    private final zzfu zze;
    private final zzfu zzf;
    private final zzfu zzg;
    private final ArrayDeque zzh;
    private final zzakn zzi;
    private final List zzj;
    private zzgbc zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;

    @Nullable
    private zzfu zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private zzadx zzv;
    private zzaki[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzakj() {
        this(zzalt.zza, 16);
    }

    private static int zzi(int i9) {
        if (i9 != 1751476579) {
            return i9 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzj(zzaks zzaksVar, long j7) {
        int zza2 = zzaksVar.zza(j7);
        if (zza2 == -1) {
            return zzaksVar.zzb(j7);
        }
        return zza2;
    }

    private static long zzk(zzaks zzaksVar, long j7, long j9) {
        int zzj = zzj(zzaksVar, j7);
        if (zzj == -1) {
            return j9;
        }
        return Math.min(zzaksVar.zzc[zzj], j9);
    }

    private final void zzl() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzm(long j7) throws zzch {
        int i9;
        int i10;
        zzcd zzcdVar;
        zzcd zzcdVar2;
        int i11;
        int i12;
        long j9;
        List list;
        int i13;
        zzcd zzcdVar3;
        zzcd zzcdVar4;
        zzcd zzcdVar5;
        int i14;
        zzcd zzcdVar6;
        int i15;
        zzcd zzc;
        int i16;
        int i17;
        int i18 = 0;
        int i19 = 1;
        while (!this.zzh.isEmpty() && ((zzajm) this.zzh.peek()).zza == j7) {
            zzajm zzajmVar = (zzajm) this.zzh.pop();
            if (zzajmVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i20 = this.zzA;
                zzaej zzaejVar = new zzaej();
                zzajn zzb = zzajmVar.zzb(1969517665);
                if (zzb != null) {
                    zzcd zzb2 = zzajw.zzb(zzb);
                    zzaejVar.zzb(zzb2);
                    zzcdVar = zzb2;
                } else {
                    zzcdVar = null;
                }
                zzajm zza2 = zzajmVar.zza(1835365473);
                if (zza2 != null) {
                    zzcdVar2 = zzajw.zza(zza2);
                } else {
                    zzcdVar2 = null;
                }
                zzajn zzb3 = zzajmVar.zzb(1836476516);
                zzb3.getClass();
                if (i20 == i19) {
                    i11 = i19;
                } else {
                    i11 = i18;
                }
                zzgn zzc2 = zzajw.zzc(zzb3.zza);
                zzcc[] zzccVarArr = new zzcc[i19];
                zzccVarArr[i18] = zzc2;
                zzcd zzcdVar7 = new zzcd(C.TIME_UNSET, zzccVarArr);
                if (i19 != (this.zzc & i19)) {
                    i12 = i18;
                } else {
                    i12 = i19;
                }
                zzcd zzcdVar8 = zzcdVar;
                long j10 = -9223372036854775807L;
                zzcd zzcdVar9 = zzcdVar7;
                zzcd zzcdVar10 = zzcdVar2;
                List zzd = zzajw.zzd(zzajmVar, zzaejVar, C.TIME_UNSET, null, i12, i11, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzakg
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final Object apply(Object obj) {
                        return (zzakp) obj;
                    }
                });
                long j11 = -9223372036854775807L;
                int i21 = 0;
                int i22 = 0;
                int i23 = -1;
                while (true) {
                    j9 = 0;
                    if (i21 >= zzd.size()) {
                        break;
                    }
                    zzaks zzaksVar = (zzaks) zzd.get(i21);
                    if (zzaksVar.zzb == 0) {
                        list = zzd;
                        zzcdVar4 = zzcdVar8;
                        zzcdVar5 = zzcdVar9;
                        i14 = i19;
                    } else {
                        zzakp zzakpVar = zzaksVar.zza;
                        list = zzd;
                        long j12 = zzakpVar.zze;
                        if (j12 == j10) {
                            j12 = zzaksVar.zzh;
                        }
                        long max = Math.max(j11, j12);
                        int i24 = i22 + 1;
                        zzaki zzakiVar = new zzaki(zzakpVar, zzaksVar, this.zzv.zzw(i22, zzakpVar.zzb));
                        if (MimeTypes.AUDIO_TRUEHD.equals(zzakpVar.zzf.zzn)) {
                            i13 = zzaksVar.zze * 16;
                        } else {
                            i13 = zzaksVar.zze + 30;
                        }
                        zzal zzb4 = zzakpVar.zzf.zzb();
                        zzb4.zzP(i13);
                        if (zzakpVar.zzb == 2) {
                            if ((this.zzc & 8) != 0) {
                                zzan zzanVar = zzakpVar.zzf;
                                if (i23 == -1) {
                                    i17 = 1;
                                } else {
                                    i17 = 2;
                                }
                                zzb4.zzV(zzanVar.zzg | i17);
                            }
                            if (j12 > 0 && (i16 = zzaksVar.zzb) > 0) {
                                zzb4.zzH(i16 / (((float) j12) / 1000000.0f));
                            }
                        }
                        if (zzakpVar.zzb == 1 && zzaejVar.zza()) {
                            zzb4.zzF(zzaejVar.zza);
                            zzb4.zzG(zzaejVar.zzb);
                        }
                        int i25 = zzakpVar.zzb;
                        if (this.zzj.isEmpty()) {
                            zzcdVar4 = zzcdVar8;
                            zzcdVar3 = null;
                        } else {
                            zzcdVar3 = new zzcd(this.zzj);
                            zzcdVar4 = zzcdVar8;
                        }
                        zzcd[] zzcdVarArr = {zzcdVar3, zzcdVar4, zzcdVar9};
                        zzcdVar5 = zzcdVar9;
                        zzcd zzcdVar11 = new zzcd(C.TIME_UNSET, new zzcc[0]);
                        zzcd zzcdVar12 = zzcdVar10;
                        if (zzcdVar12 != null) {
                            int i26 = 0;
                            while (i26 < zzcdVar12.zza()) {
                                zzcc zzb5 = zzcdVar12.zzb(i26);
                                if (zzb5 instanceof zzgh) {
                                    zzgh zzghVar = (zzgh) zzb5;
                                    zzcdVar6 = zzcdVar12;
                                    if (zzghVar.zza.equals("com.android.capture.fps")) {
                                        if (i25 == 2) {
                                            i15 = 1;
                                            zzc = zzcdVar11.zzc(zzghVar);
                                        } else {
                                            i15 = 1;
                                        }
                                    } else {
                                        i15 = 1;
                                        zzc = zzcdVar11.zzc(zzghVar);
                                    }
                                    zzcdVar11 = zzc;
                                } else {
                                    zzcdVar6 = zzcdVar12;
                                    i15 = 1;
                                }
                                i26 += i15;
                                zzcdVar12 = zzcdVar6;
                            }
                        }
                        zzcdVar10 = zzcdVar12;
                        for (int i27 = 0; i27 < 3; i27++) {
                            zzcdVar11 = zzcdVar11.zzd(zzcdVarArr[i27]);
                        }
                        if (zzcdVar11.zza() > 0) {
                            zzb4.zzQ(zzcdVar11);
                        }
                        zzakiVar.zzc.zzl(zzb4.zzad());
                        if (zzakpVar.zzb == 2 && i23 == -1) {
                            i23 = arrayList.size();
                        }
                        arrayList.add(zzakiVar);
                        i22 = i24;
                        j11 = max;
                        i14 = 1;
                    }
                    i21 += i14;
                    i19 = i14;
                    zzcdVar9 = zzcdVar5;
                    zzd = list;
                    j10 = C.TIME_UNSET;
                    zzcdVar8 = zzcdVar4;
                }
                this.zzy = i23;
                this.zzz = j11;
                zzaki[] zzakiVarArr = (zzaki[]) arrayList.toArray(new zzaki[0]);
                this.zzw = zzakiVarArr;
                int length = zzakiVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i28 = 0; i28 < zzakiVarArr.length; i28++) {
                    jArr[i28] = new long[zzakiVarArr[i28].zzb.zzb];
                    jArr2[i28] = zzakiVarArr[i28].zzb.zzf[0];
                }
                i9 = 0;
                int i29 = 0;
                while (i29 < zzakiVarArr.length) {
                    long j13 = Long.MAX_VALUE;
                    int i30 = -1;
                    for (int i31 = 0; i31 < zzakiVarArr.length; i31++) {
                        if (!zArr[i31]) {
                            long j14 = jArr2[i31];
                            if (j14 <= j13) {
                                i30 = i31;
                                j13 = j14;
                            }
                        }
                    }
                    int i32 = iArr[i30];
                    long[] jArr3 = jArr[i30];
                    jArr3[i32] = j9;
                    zzaks zzaksVar2 = zzakiVarArr[i30].zzb;
                    j9 += zzaksVar2.zzd[i32];
                    int i33 = i32 + 1;
                    iArr[i30] = i33;
                    if (i33 < jArr3.length) {
                        jArr2[i30] = zzaksVar2.zzf[i33];
                    } else {
                        zArr[i30] = true;
                        i29++;
                    }
                }
                i10 = 1;
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzh.clear();
                this.zzl = 2;
            } else {
                i9 = i18;
                i10 = i19;
                if (!this.zzh.isEmpty()) {
                    ((zzajm) this.zzh.peek()).zzc(zzajmVar);
                }
            }
            i18 = i9;
            i19 = i10;
        }
        if (this.zzl != 2) {
            zzl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0017, code lost:
    
        if (r7 == r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e3, code lost:
    
        r3 = r33.zzn - r33.zzo;
        r9 = r34.zzf() + r3;
        r5 = r33.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f1, code lost:
    
        if (r5 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f3, code lost:
    
        r34.zzi(r5.zzM(), r33.zzo, (int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01ff, code lost:
    
        if (r33.zzm != 1718909296) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0201, code lost:
    
        r33.zzu = true;
        r5.zzK(8);
        r3 = zzi(r5.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x020f, code lost:
    
        if (r3 == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0212, code lost:
    
        r5.zzL(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x021a, code lost:
    
        if (r5.zzb() <= 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021c, code lost:
    
        r3 = zzi(r5.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0224, code lost:
    
        if (r3 == 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0227, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0228, code lost:
    
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x022a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0266, code lost:
    
        zzm(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0269, code lost:
    
        if (r3 == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x026e, code lost:
    
        if (r33.zzl == 2) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0270, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0232, code lost:
    
        if (r33.zzh.isEmpty() != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0234, code lost:
    
        ((com.google.android.gms.internal.ads.zzajm) r33.zzh.peek()).zzd(new com.google.android.gms.internal.ads.zzajn(r33.zzm, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0249, code lost:
    
        if (r33.zzu != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0250, code lost:
    
        if (r33.zzm != 1835295092) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0252, code lost:
    
        r33.zzA = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0257, code lost:
    
        if (r3 >= 262144) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0259, code lost:
    
        r34.zzk((int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x025e, code lost:
    
        r35.zza = r34.zzf() + r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0019, code lost:
    
        if (r7 == 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x001b, code lost:
    
        r33.zzi.zza(r34, r35, r33.zzj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0026, code lost:
    
        if (r35.zza != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0028, code lost:
    
        zzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x002b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x002c, code lost:
    
        r7 = r34.zzf();
        r14 = r33.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0032, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0034, code lost:
    
        r21 = r6;
        r28 = r21;
        r26 = -1;
        r27 = -1;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0048, code lost:
    
        r3 = r33.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x004b, code lost:
    
        if (r14 >= r3.length) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x004d, code lost:
    
        r3 = r3[r14];
        r9 = r3.zze;
        r3 = r3.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0055, code lost:
    
        if (r9 != r3.zzb) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0058, code lost:
    
        r29 = r3.zzc[r9];
        r3 = r33.zzx;
        r5 = com.google.android.gms.internal.ads.zzgd.zza;
        r31 = r3[r14][r9];
        r29 = r29 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0068, code lost:
    
        if (r29 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x006c, code lost:
    
        if (r29 < 262144) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0070, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0071, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0073, code lost:
    
        if (r28 != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0075, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0079, code lost:
    
        if (r3 != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x007d, code lost:
    
        if (r29 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0088, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x008c, code lost:
    
        if (r31 >= r19) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x008e, code lost:
    
        r21 = r3;
        r26 = r14;
        r19 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0094, code lost:
    
        r14 = r14 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x007f, code lost:
    
        r28 = r3;
        r27 = r14;
        r24 = r29;
        r22 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0077, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x006e, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0098, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x009a, code lost:
    
        if (r21 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00a3, code lost:
    
        if (r22 < (r19 + 10485760)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00a5, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00aa, code lost:
    
        r33.zzq = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00ac, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00a8, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00b1, code lost:
    
        r3 = r33.zzw[r14];
        r5 = r3.zzc;
        r9 = r3.zze;
        r14 = r3.zzb;
        r12 = r14.zzc[r9];
        r14 = r14.zzd[r9];
        r4 = r3.zzd;
        r7 = (r12 - r7) + r33.zzr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00cf, code lost:
    
        if (r7 < 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00d3, code lost:
    
        if (r7 < 262144) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x00de, code lost:
    
        if (r3.zza.zzg != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00e0, code lost:
    
        r7 = r7 + 8;
        r14 = r14 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00e5, code lost:
    
        r34.zzk((int) r7);
        r2 = r3.zza;
        r6 = r2.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00ed, code lost:
    
        if (r6 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00ef, code lost:
    
        r2 = r33.zze.zzM();
        r2[0] = 0;
        r2[1] = 0;
        r2[2] = 0;
        r8 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0103, code lost:
    
        if (r33.zzs >= r14) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0105, code lost:
    
        r7 = r33.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0107, code lost:
    
        if (r7 != 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x013b, code lost:
    
        r7 = r5.zzf(r34, r7, false);
        r33.zzr += r7;
        r33.zzs += r7;
        r33.zzt -= r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0109, code lost:
    
        r34.zzi(r2, r8, r6);
        r33.zzr += r6;
        r33.zze.zzK(0);
        r7 = r33.zze.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x011d, code lost:
    
        if (r7 < 0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x011f, code lost:
    
        r33.zzt = r7;
        r33.zzd.zzK(0);
        r5.zzq(r33.zzd, 4);
        r33.zzs += 4;
        r14 = r14 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x013a, code lost:
    
        throw com.google.android.gms.internal.ads.zzch.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0194, code lost:
    
        r1 = r3.zzb;
        r6 = r1.zzf[r9];
        r1 = r1.zzg[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x019e, code lost:
    
        if (r4 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01a0, code lost:
    
        r4.zzc(r5, r6, r1, r14, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01b7, code lost:
    
        if ((r9 + 1) != r3.zzb.zzb) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01b9, code lost:
    
        r4.zza(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01cd, code lost:
    
        r3.zze++;
        r33.zzq = -1;
        r33.zzr = 0;
        r33.zzs = 0;
        r33.zzt = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01be, code lost:
    
        r5.zzs(r6, r1, r14, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x015a, code lost:
    
        if ("audio/ac4".equals(r2.zzf.zzn) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x015e, code lost:
    
        if (r33.zzs != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0160, code lost:
    
        com.google.android.gms.internal.ads.zzacw.zzb(r14, r33.zzf);
        r6 = 7;
        r5.zzq(r33.zzf, 7);
        r33.zzs += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0172, code lost:
    
        r14 = r14 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0179, code lost:
    
        r2 = r33.zzs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x017b, code lost:
    
        if (r2 >= r14) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x017d, code lost:
    
        r2 = r5.zzf(r34, r14 - r2, false);
        r33.zzr += r2;
        r33.zzs += r2;
        r33.zzt -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0171, code lost:
    
        r6 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0174, code lost:
    
        if (r4 == null) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0176, code lost:
    
        r4.zzd(r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01df, code lost:
    
        r35.zza = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x01e2, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadv r34, com.google.android.gms.internal.ads.zzaeq r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakj.zzb(com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzaeq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        if ((this.zzc & 16) == 0) {
            zzadxVar = new zzalw(zzadxVar, this.zzb);
        }
        this.zzv = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        if (j7 == 0) {
            if (this.zzl != 3) {
                zzl();
                return;
            } else {
                this.zzi.zzb();
                this.zzj.clear();
                return;
            }
        }
        for (zzaki zzakiVar : this.zzw) {
            zzaks zzaksVar = zzakiVar.zzb;
            int zza2 = zzaksVar.zza(j9);
            if (zza2 == -1) {
                zza2 = zzaksVar.zzb(j9);
            }
            zzakiVar.zze = zza2;
            zzafb zzafbVar = zzakiVar.zzd;
            if (zzafbVar != null) {
                zzafbVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        boolean z8;
        zzgbc zzm;
        if ((this.zzc & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzaex zzb = zzako.zzb(zzadvVar, z8);
        if (zzb != null) {
            zzm = zzgbc.zzn(zzb);
        } else {
            zzm = zzgbc.zzm();
        }
        this.zzk = zzm;
        if (zzb != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        long j9;
        long j10;
        int zzb;
        zzaki[] zzakiVarArr = this.zzw;
        if (zzakiVarArr.length == 0) {
            zzaeu zzaeuVar = zzaeu.zza;
            return new zzaer(zzaeuVar, zzaeuVar);
        }
        int i9 = this.zzy;
        long j11 = -1;
        if (i9 != -1) {
            zzaks zzaksVar = zzakiVarArr[i9].zzb;
            int zzj = zzj(zzaksVar, j7);
            if (zzj == -1) {
                zzaeu zzaeuVar2 = zzaeu.zza;
                return new zzaer(zzaeuVar2, zzaeuVar2);
            }
            long j12 = zzaksVar.zzf[zzj];
            j9 = zzaksVar.zzc[zzj];
            if (j12 < j7 && zzj < zzaksVar.zzb - 1 && (zzb = zzaksVar.zzb(j7)) != -1 && zzb != zzj) {
                j10 = zzaksVar.zzf[zzb];
                j11 = zzaksVar.zzc[zzb];
            } else {
                j10 = -9223372036854775807L;
            }
            j7 = j12;
        } else {
            j9 = Long.MAX_VALUE;
            j10 = -9223372036854775807L;
        }
        int i10 = 0;
        while (true) {
            zzaki[] zzakiVarArr2 = this.zzw;
            if (i10 >= zzakiVarArr2.length) {
                break;
            }
            if (i10 != this.zzy) {
                zzaks zzaksVar2 = zzakiVarArr2[i10].zzb;
                long zzk = zzk(zzaksVar2, j7, j9);
                if (j10 != C.TIME_UNSET) {
                    j11 = zzk(zzaksVar2, j10, j11);
                }
                j9 = zzk;
            }
            i10++;
        }
        zzaeu zzaeuVar3 = new zzaeu(j7, j9);
        if (j10 == C.TIME_UNSET) {
            return new zzaer(zzaeuVar3, zzaeuVar3);
        }
        return new zzaer(zzaeuVar3, new zzaeu(j10, j11));
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }

    public zzakj(zzalt zzaltVar, int i9) {
        this.zzb = zzaltVar;
        this.zzc = i9;
        this.zzk = zzgbc.zzm();
        this.zzl = (i9 & 4) != 0 ? 3 : 0;
        this.zzi = new zzakn();
        this.zzj = new ArrayList();
        this.zzg = new zzfu(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzfu(zzgr.zza);
        this.zze = new zzfu(4);
        this.zzf = new zzfu();
        this.zzq = -1;
        this.zzv = zzadx.zza;
        this.zzw = new zzaki[0];
    }
}
