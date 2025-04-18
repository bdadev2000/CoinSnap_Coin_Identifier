package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class zzte extends zzhz {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private int zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private int zzI;
    private int zzJ;

    @Nullable
    private ByteBuffer zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private long zzX;
    private long zzY;
    private boolean zzZ;
    protected zzia zza;
    private boolean zzaa;
    private boolean zzab;
    private zztd zzac;
    private long zzad;
    private boolean zzae;

    @Nullable
    private zzrw zzaf;

    @Nullable
    private zzrw zzag;
    private final zzsr zzc;
    private final zztg zzd;
    private final float zze;
    private final zzhq zzf;
    private final zzhq zzg;
    private final zzhq zzh;
    private final zzsk zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrj zzl;

    @Nullable
    private zzaf zzm;

    @Nullable
    private zzaf zzn;

    @Nullable
    private zzlq zzo;

    @Nullable
    private MediaCrypto zzp;
    private float zzq;
    private float zzr;

    @Nullable
    private zzst zzs;

    @Nullable
    private zzaf zzt;

    @Nullable
    private MediaFormat zzu;
    private boolean zzv;
    private float zzw;

    @Nullable
    private ArrayDeque zzx;

    @Nullable
    private zzta zzy;

    @Nullable
    private zzsw zzz;

    public zzte(int i2, zzsr zzsrVar, zztg zztgVar, boolean z2, float f2) {
        super(i2);
        this.zzc = zzsrVar;
        this.zzd = zztgVar;
        this.zze = f2;
        this.zzf = new zzhq(0, 0);
        this.zzg = new zzhq(0, 0);
        this.zzh = new zzhq(2, 0);
        zzsk zzskVar = new zzsk();
        this.zzi = zzskVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzr = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzac = zztd.zza;
        zzskVar.zzj(0);
        zzskVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrj();
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzR = 0;
        this.zzI = -1;
        this.zzJ = -1;
        this.zzH = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzS = 0;
        this.zzT = 0;
        this.zza = new zzia();
    }

    public static boolean zzaP(zzaf zzafVar) {
        return zzafVar.zzI == 0;
    }

    private final void zzaQ() {
        this.zzJ = -1;
        this.zzK = null;
    }

    private final void zzaR(zztd zztdVar) {
        this.zzac = zztdVar;
        if (zztdVar.zzd != -9223372036854775807L) {
            this.zzae = true;
        }
    }

    @RequiresApi
    private final void zzaS() throws zzij {
        zzrw zzrwVar = this.zzag;
        zzrwVar.getClass();
        this.zzaf = zzrwVar;
        this.zzS = 0;
        this.zzT = 0;
    }

    @TargetApi(23)
    private final boolean zzaT() throws zzij {
        if (this.zzU) {
            this.zzS = 1;
            if (this.zzC) {
                this.zzT = 3;
                return false;
            }
            this.zzT = 2;
        } else {
            zzaS();
        }
        return true;
    }

    private final boolean zzaU() throws zzij {
        zzst zzstVar = this.zzs;
        if (zzstVar == null || this.zzS == 2 || this.zzZ) {
            return false;
        }
        if (this.zzI < 0) {
            int zza = zzstVar.zza();
            this.zzI = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzc = zzstVar.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzS == 1) {
            if (!this.zzG) {
                this.zzV = true;
                zzstVar.zzk(this.zzI, 0, 0, 0L, 4);
                zzao();
            }
            this.zzS = 2;
            return false;
        }
        if (this.zzE) {
            this.zzE = false;
            ByteBuffer byteBuffer = this.zzg.zzc;
            byteBuffer.getClass();
            byteBuffer.put(zzb);
            zzstVar.zzk(this.zzI, 0, 38, 0L, 0);
            zzao();
            this.zzU = true;
            return true;
        }
        if (this.zzR == 1) {
            int i2 = 0;
            while (true) {
                zzaf zzafVar = this.zzt;
                zzafVar.getClass();
                if (i2 >= zzafVar.zzq.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.zzt.zzq.get(i2);
                ByteBuffer byteBuffer2 = this.zzg.zzc;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            this.zzR = 2;
        }
        ByteBuffer byteBuffer3 = this.zzg.zzc;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        zzkm zzk = zzk();
        try {
            int zzcW = zzcW(zzk, this.zzg, 0);
            if (zzcW == -3) {
                if (zzQ()) {
                    this.zzY = this.zzX;
                }
                return false;
            }
            if (zzcW == -5) {
                if (this.zzR == 2) {
                    this.zzg.zzb();
                    this.zzR = 1;
                }
                zzac(zzk);
                return true;
            }
            zzhq zzhqVar = this.zzg;
            if (zzhqVar.zzf()) {
                this.zzY = this.zzX;
                if (this.zzR == 2) {
                    zzhqVar.zzb();
                    this.zzR = 1;
                }
                this.zzZ = true;
                if (!this.zzU) {
                    zzai();
                    return false;
                }
                try {
                    if (!this.zzG) {
                        this.zzV = true;
                        zzstVar.zzk(this.zzI, 0, 0, 0L, 4);
                        zzao();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzcY(e, this.zzm, false, zzeu.zzk(e.getErrorCode()));
                }
            }
            if (!this.zzU && !zzhqVar.zzg()) {
                zzhqVar.zzb();
                if (this.zzR == 2) {
                    this.zzR = 1;
                }
                return true;
            }
            if (zzaO(zzhqVar)) {
                this.zzg.zzb();
                this.zza.zzd++;
                return true;
            }
            zzhq zzhqVar2 = this.zzg;
            boolean zzl = zzhqVar2.zzl();
            if (zzl) {
                zzhqVar2.zzb.zzb(position);
            }
            long j2 = this.zzg.zze;
            if (this.zzab) {
                if (this.zzk.isEmpty()) {
                    zzeq zzeqVar = this.zzac.zze;
                    zzaf zzafVar2 = this.zzm;
                    zzafVar2.getClass();
                    zzeqVar.zzd(j2, zzafVar2);
                } else {
                    zzeq zzeqVar2 = ((zztd) this.zzk.peekLast()).zze;
                    zzaf zzafVar3 = this.zzm;
                    zzafVar3.getClass();
                    zzeqVar2.zzd(j2, zzafVar3);
                }
                this.zzab = false;
            }
            long max = Math.max(this.zzX, j2);
            this.zzX = max;
            if (zzQ() || this.zzg.zzh()) {
                this.zzY = max;
            }
            this.zzg.zzk();
            zzhq zzhqVar3 = this.zzg;
            if (zzhqVar3.zze()) {
                zzaj(zzhqVar3);
            }
            zzaE(this.zzg);
            zzau(this.zzg);
            try {
                if (zzl) {
                    zzstVar.zzl(this.zzI, 0, this.zzg.zzb, j2, 0);
                } else {
                    int i3 = this.zzI;
                    ByteBuffer byteBuffer4 = this.zzg.zzc;
                    byteBuffer4.getClass();
                    zzstVar.zzk(i3, 0, byteBuffer4.limit(), j2, 0);
                }
                zzao();
                this.zzU = true;
                this.zzR = 0;
                this.zza.zzc++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzcY(e2, this.zzm, false, zzeu.zzk(e2.getErrorCode()));
            }
        } catch (zzhp e3) {
            zzak(e3);
            zzaX(0);
            zzah();
            return true;
        }
    }

    private final boolean zzaV() {
        return this.zzJ >= 0;
    }

    private final boolean zzaW(long j2, long j3) {
        if (j3 >= j2) {
            return false;
        }
        zzaf zzafVar = this.zzn;
        if (zzafVar == null || !Objects.equals(zzafVar.zzn, "audio/opus")) {
            return true;
        }
        return !zzadw.zzf(j2, j3);
    }

    private final boolean zzaX(int i2) throws zzij {
        zzhq zzhqVar = this.zzf;
        zzkm zzk = zzk();
        zzhqVar.zzb();
        int zzcW = zzcW(zzk, this.zzf, i2 | 4);
        if (zzcW == -5) {
            zzac(zzk);
            return true;
        }
        if (zzcW != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzZ = true;
        zzai();
        return false;
    }

    private final boolean zzaY(@Nullable zzaf zzafVar) throws zzij {
        if (zzeu.zza >= 23 && this.zzs != null && this.zzT != 3 && zzcV() != 0) {
            float f2 = this.zzr;
            zzafVar.getClass();
            float zzZ = zzZ(f2, zzafVar, zzT());
            float f3 = this.zzw;
            if (f3 != zzZ) {
                if (zzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f3 != -1.0f || zzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzZ);
                    zzst zzstVar = this.zzs;
                    zzstVar.getClass();
                    zzstVar.zzq(bundle);
                    this.zzw = zzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzP = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzO = false;
        this.zzN = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zzij {
        if (this.zzU) {
            this.zzS = 1;
            this.zzT = 3;
        } else {
            zzaG();
            zzaC();
        }
    }

    private final void zzah() {
        try {
            zzst zzstVar = this.zzs;
            zzdi.zzb(zzstVar);
            zzstVar.zzj();
        } finally {
            zzaH();
        }
    }

    @TargetApi(23)
    private final void zzai() throws zzij {
        int i2 = this.zzT;
        if (i2 == 1) {
            zzah();
            return;
        }
        if (i2 == 2) {
            zzah();
            zzaS();
        } else if (i2 != 3) {
            this.zzaa = true;
            zzaq();
        } else {
            zzaG();
            zzaC();
        }
    }

    private final void zzao() {
        this.zzI = -1;
        this.zzg.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public void zzC() {
        try {
            zzad();
            zzaG();
        } finally {
            this.zzag = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzF(com.google.android.gms.internal.ads.zzaf[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzuy r18) throws com.google.android.gms.internal.ads.zzij {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zztd r1 = r0.zzac
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.zztd r1 = new com.google.android.gms.internal.ads.zztd
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaR(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.zzX
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.zzad
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.zztd r1 = new com.google.android.gms.internal.ads.zztd
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaR(r1)
            com.google.android.gms.internal.ads.zztd r1 = r0.zzac
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.zzap()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zztd r9 = new com.google.android.gms.internal.ads.zztd
            long r3 = r0.zzX
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzte.zzF(com.google.android.gms.internal.ads.zzaf[], long, long, com.google.android.gms.internal.ads.zzuy):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlr
    public void zzM(float f2, float f3) throws zzij {
        this.zzq = f2;
        this.zzr = f3;
        zzaY(this.zzt);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzlr
    public void zzV(long r22, long r24) throws com.google.android.gms.internal.ads.zzij {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzte.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public boolean zzW() {
        return this.zzaa;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaV()) {
            return true;
        }
        return this.zzH != -9223372036854775807L && zzi().zzb() < this.zzH;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final int zzY(zzaf zzafVar) throws zzij {
        try {
            return zzaa(this.zzd, zzafVar);
        } catch (zztm e) {
            throw zzcY(e, zzafVar, false, 4002);
        }
    }

    public float zzZ(float f2, zzaf zzafVar, zzaf[] zzafVarArr) {
        throw null;
    }

    public zzsv zzaA(Throwable th, @Nullable zzsw zzswVar) {
        return new zzsv(th, zzswVar);
    }

    @Nullable
    public final zzsw zzaB() {
        return this.zzz;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(46:44|45|46|47|(1:49)(1:336)|50|(1:52)|53|(1:55)|56|57|58|59|(33:166|167|(2:320|321)|169|170|(1:172)|173|(1:175)|176|177|(4:179|180|(6:181|182|183|184|185|(6:187|(2:214|215)(2:189|(1:191)(2:200|(1:202)(2:203|(1:205)(2:206|(1:208)(7:209|210|211|212|213|194|199)))))|192|193|194|199)(1:219))|220)(1:319)|221|(1:225)|226|(1:232)|233|(1:235)|236|(1:238)|239|(1:241)|242|(1:244)|245|246|(1:248)|249|(5:251|(1:253)|254|(1:256)|257)|258|(33:260|(1:262)|263|(1:265)|266|(1:268)|269|(1:271)|272|(1:274)|275|(1:277)|278|(1:280)|281|(1:283)|284|(1:286)|287|(1:289)|290|(1:292)|293|(1:295)|296|(1:298)|299|(1:301)|302|(1:304)|305|(1:307)|308)|309|(1:311)|312)(1:61)|62|(2:66|(24:74|75|(1:148)(1:79)|80|(1:147)(1:84)|85|(1:146)(1:89)|90|(16:92|(1:94)|95|96|97|98|(1:100)|101|102|103|104|105|106|107|108|109)|(14:145|96|97|98|(0)|101|102|103|104|105|106|107|108|109)|95|96|97|98|(0)|101|102|103|104|105|106|107|108|109))|149|(4:151|(2:153|(1:155))|156|(28:164|75|(1:77)|148|80|(1:82)|147|85|(1:87)|146|90|(0)|(6:126|128|130|132|134|136)|138|145|96|97|98|(0)|101|102|103|104|105|106|107|108|109))|165|75|(0)|148|80|(0)|147|85|(0)|146|90|(0)|(0)|138|145|96|97|98|(0)|101|102|103|104|105|106|107|108|109) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x050f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0510, code lost:
    
        r20 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x053c, code lost:
    
        r23.zzy = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x054d, code lost:
    
        r13 = r3;
        r11 = r10;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0554, code lost:
    
        throw r23.zzy;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0541, code lost:
    
        r23.zzy = com.google.android.gms.internal.ads.zzta.zza(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x050d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x050e, code lost:
    
        r10 = r10;
        r13 = r13;
        r20 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04e1 A[Catch: Exception -> 0x0223, TryCatch #12 {Exception -> 0x0223, blocks: (B:194:0x021b, B:212:0x0207, B:220:0x022a, B:221:0x0248, B:223:0x024d, B:225:0x0251, B:226:0x0265, B:228:0x0269, B:230:0x026f, B:232:0x0275, B:233:0x0283, B:235:0x028b, B:236:0x0295, B:238:0x029a, B:239:0x02a4, B:241:0x02a9, B:242:0x02b3, B:244:0x02b7, B:245:0x02c1, B:248:0x02cb, B:249:0x02d8, B:251:0x02dc, B:253:0x02ec, B:254:0x02f1, B:256:0x02f5, B:257:0x02fa, B:258:0x0300, B:260:0x0307, B:262:0x0317, B:263:0x031c, B:265:0x0320, B:266:0x0325, B:268:0x0329, B:269:0x032e, B:271:0x0332, B:272:0x0337, B:274:0x033b, B:275:0x0340, B:277:0x0344, B:278:0x0349, B:280:0x034d, B:281:0x0352, B:283:0x0356, B:284:0x035b, B:286:0x035f, B:287:0x0364, B:289:0x0368, B:290:0x036d, B:292:0x0371, B:293:0x0376, B:295:0x037a, B:296:0x037f, B:298:0x0383, B:299:0x0388, B:301:0x038c, B:302:0x0391, B:304:0x0395, B:305:0x039a, B:307:0x039d, B:308:0x03a2, B:309:0x03a8, B:311:0x03ad, B:312:0x03b7, B:62:0x03d1, B:64:0x03dd, B:66:0x03e5, B:68:0x03ef, B:70:0x03f7, B:72:0x03ff, B:75:0x0443, B:77:0x0449, B:80:0x0454, B:82:0x045a, B:85:0x0465, B:87:0x046b, B:90:0x0476, B:92:0x047c, B:96:0x04d3, B:98:0x04da, B:100:0x04e1, B:101:0x04ee, B:126:0x0489, B:128:0x0491, B:130:0x0499, B:132:0x04a1, B:134:0x04a9, B:136:0x04b1, B:138:0x04b9, B:140:0x04c3, B:142:0x04cd, B:151:0x040d, B:153:0x0415, B:156:0x0420, B:158:0x042a, B:160:0x0432, B:162:0x043a), top: B:211:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x053c A[Catch: zzta -> 0x053f, TryCatch #9 {zzta -> 0x053f, blocks: (B:114:0x051f, B:116:0x053c, B:117:0x0547, B:122:0x0552, B:123:0x0554, B:124:0x0541, B:343:0x0555, B:345:0x055b, B:346:0x0568), top: B:34:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0541 A[Catch: zzta -> 0x053f, TryCatch #9 {zzta -> 0x053f, blocks: (B:114:0x051f, B:116:0x053c, B:117:0x0547, B:122:0x0552, B:123:0x0554, B:124:0x0541, B:343:0x0555, B:345:0x055b, B:346:0x0568), top: B:34:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0489 A[Catch: Exception -> 0x0223, TryCatch #12 {Exception -> 0x0223, blocks: (B:194:0x021b, B:212:0x0207, B:220:0x022a, B:221:0x0248, B:223:0x024d, B:225:0x0251, B:226:0x0265, B:228:0x0269, B:230:0x026f, B:232:0x0275, B:233:0x0283, B:235:0x028b, B:236:0x0295, B:238:0x029a, B:239:0x02a4, B:241:0x02a9, B:242:0x02b3, B:244:0x02b7, B:245:0x02c1, B:248:0x02cb, B:249:0x02d8, B:251:0x02dc, B:253:0x02ec, B:254:0x02f1, B:256:0x02f5, B:257:0x02fa, B:258:0x0300, B:260:0x0307, B:262:0x0317, B:263:0x031c, B:265:0x0320, B:266:0x0325, B:268:0x0329, B:269:0x032e, B:271:0x0332, B:272:0x0337, B:274:0x033b, B:275:0x0340, B:277:0x0344, B:278:0x0349, B:280:0x034d, B:281:0x0352, B:283:0x0356, B:284:0x035b, B:286:0x035f, B:287:0x0364, B:289:0x0368, B:290:0x036d, B:292:0x0371, B:293:0x0376, B:295:0x037a, B:296:0x037f, B:298:0x0383, B:299:0x0388, B:301:0x038c, B:302:0x0391, B:304:0x0395, B:305:0x039a, B:307:0x039d, B:308:0x03a2, B:309:0x03a8, B:311:0x03ad, B:312:0x03b7, B:62:0x03d1, B:64:0x03dd, B:66:0x03e5, B:68:0x03ef, B:70:0x03f7, B:72:0x03ff, B:75:0x0443, B:77:0x0449, B:80:0x0454, B:82:0x045a, B:85:0x0465, B:87:0x046b, B:90:0x0476, B:92:0x047c, B:96:0x04d3, B:98:0x04da, B:100:0x04e1, B:101:0x04ee, B:126:0x0489, B:128:0x0491, B:130:0x0499, B:132:0x04a1, B:134:0x04a9, B:136:0x04b1, B:138:0x04b9, B:140:0x04c3, B:142:0x04cd, B:151:0x040d, B:153:0x0415, B:156:0x0420, B:158:0x042a, B:160:0x0432, B:162:0x043a), top: B:211:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0449 A[Catch: Exception -> 0x0223, TryCatch #12 {Exception -> 0x0223, blocks: (B:194:0x021b, B:212:0x0207, B:220:0x022a, B:221:0x0248, B:223:0x024d, B:225:0x0251, B:226:0x0265, B:228:0x0269, B:230:0x026f, B:232:0x0275, B:233:0x0283, B:235:0x028b, B:236:0x0295, B:238:0x029a, B:239:0x02a4, B:241:0x02a9, B:242:0x02b3, B:244:0x02b7, B:245:0x02c1, B:248:0x02cb, B:249:0x02d8, B:251:0x02dc, B:253:0x02ec, B:254:0x02f1, B:256:0x02f5, B:257:0x02fa, B:258:0x0300, B:260:0x0307, B:262:0x0317, B:263:0x031c, B:265:0x0320, B:266:0x0325, B:268:0x0329, B:269:0x032e, B:271:0x0332, B:272:0x0337, B:274:0x033b, B:275:0x0340, B:277:0x0344, B:278:0x0349, B:280:0x034d, B:281:0x0352, B:283:0x0356, B:284:0x035b, B:286:0x035f, B:287:0x0364, B:289:0x0368, B:290:0x036d, B:292:0x0371, B:293:0x0376, B:295:0x037a, B:296:0x037f, B:298:0x0383, B:299:0x0388, B:301:0x038c, B:302:0x0391, B:304:0x0395, B:305:0x039a, B:307:0x039d, B:308:0x03a2, B:309:0x03a8, B:311:0x03ad, B:312:0x03b7, B:62:0x03d1, B:64:0x03dd, B:66:0x03e5, B:68:0x03ef, B:70:0x03f7, B:72:0x03ff, B:75:0x0443, B:77:0x0449, B:80:0x0454, B:82:0x045a, B:85:0x0465, B:87:0x046b, B:90:0x0476, B:92:0x047c, B:96:0x04d3, B:98:0x04da, B:100:0x04e1, B:101:0x04ee, B:126:0x0489, B:128:0x0491, B:130:0x0499, B:132:0x04a1, B:134:0x04a9, B:136:0x04b1, B:138:0x04b9, B:140:0x04c3, B:142:0x04cd, B:151:0x040d, B:153:0x0415, B:156:0x0420, B:158:0x042a, B:160:0x0432, B:162:0x043a), top: B:211:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x045a A[Catch: Exception -> 0x0223, TryCatch #12 {Exception -> 0x0223, blocks: (B:194:0x021b, B:212:0x0207, B:220:0x022a, B:221:0x0248, B:223:0x024d, B:225:0x0251, B:226:0x0265, B:228:0x0269, B:230:0x026f, B:232:0x0275, B:233:0x0283, B:235:0x028b, B:236:0x0295, B:238:0x029a, B:239:0x02a4, B:241:0x02a9, B:242:0x02b3, B:244:0x02b7, B:245:0x02c1, B:248:0x02cb, B:249:0x02d8, B:251:0x02dc, B:253:0x02ec, B:254:0x02f1, B:256:0x02f5, B:257:0x02fa, B:258:0x0300, B:260:0x0307, B:262:0x0317, B:263:0x031c, B:265:0x0320, B:266:0x0325, B:268:0x0329, B:269:0x032e, B:271:0x0332, B:272:0x0337, B:274:0x033b, B:275:0x0340, B:277:0x0344, B:278:0x0349, B:280:0x034d, B:281:0x0352, B:283:0x0356, B:284:0x035b, B:286:0x035f, B:287:0x0364, B:289:0x0368, B:290:0x036d, B:292:0x0371, B:293:0x0376, B:295:0x037a, B:296:0x037f, B:298:0x0383, B:299:0x0388, B:301:0x038c, B:302:0x0391, B:304:0x0395, B:305:0x039a, B:307:0x039d, B:308:0x03a2, B:309:0x03a8, B:311:0x03ad, B:312:0x03b7, B:62:0x03d1, B:64:0x03dd, B:66:0x03e5, B:68:0x03ef, B:70:0x03f7, B:72:0x03ff, B:75:0x0443, B:77:0x0449, B:80:0x0454, B:82:0x045a, B:85:0x0465, B:87:0x046b, B:90:0x0476, B:92:0x047c, B:96:0x04d3, B:98:0x04da, B:100:0x04e1, B:101:0x04ee, B:126:0x0489, B:128:0x0491, B:130:0x0499, B:132:0x04a1, B:134:0x04a9, B:136:0x04b1, B:138:0x04b9, B:140:0x04c3, B:142:0x04cd, B:151:0x040d, B:153:0x0415, B:156:0x0420, B:158:0x042a, B:160:0x0432, B:162:0x043a), top: B:211:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x046b A[Catch: Exception -> 0x0223, TryCatch #12 {Exception -> 0x0223, blocks: (B:194:0x021b, B:212:0x0207, B:220:0x022a, B:221:0x0248, B:223:0x024d, B:225:0x0251, B:226:0x0265, B:228:0x0269, B:230:0x026f, B:232:0x0275, B:233:0x0283, B:235:0x028b, B:236:0x0295, B:238:0x029a, B:239:0x02a4, B:241:0x02a9, B:242:0x02b3, B:244:0x02b7, B:245:0x02c1, B:248:0x02cb, B:249:0x02d8, B:251:0x02dc, B:253:0x02ec, B:254:0x02f1, B:256:0x02f5, B:257:0x02fa, B:258:0x0300, B:260:0x0307, B:262:0x0317, B:263:0x031c, B:265:0x0320, B:266:0x0325, B:268:0x0329, B:269:0x032e, B:271:0x0332, B:272:0x0337, B:274:0x033b, B:275:0x0340, B:277:0x0344, B:278:0x0349, B:280:0x034d, B:281:0x0352, B:283:0x0356, B:284:0x035b, B:286:0x035f, B:287:0x0364, B:289:0x0368, B:290:0x036d, B:292:0x0371, B:293:0x0376, B:295:0x037a, B:296:0x037f, B:298:0x0383, B:299:0x0388, B:301:0x038c, B:302:0x0391, B:304:0x0395, B:305:0x039a, B:307:0x039d, B:308:0x03a2, B:309:0x03a8, B:311:0x03ad, B:312:0x03b7, B:62:0x03d1, B:64:0x03dd, B:66:0x03e5, B:68:0x03ef, B:70:0x03f7, B:72:0x03ff, B:75:0x0443, B:77:0x0449, B:80:0x0454, B:82:0x045a, B:85:0x0465, B:87:0x046b, B:90:0x0476, B:92:0x047c, B:96:0x04d3, B:98:0x04da, B:100:0x04e1, B:101:0x04ee, B:126:0x0489, B:128:0x0491, B:130:0x0499, B:132:0x04a1, B:134:0x04a9, B:136:0x04b1, B:138:0x04b9, B:140:0x04c3, B:142:0x04cd, B:151:0x040d, B:153:0x0415, B:156:0x0420, B:158:0x042a, B:160:0x0432, B:162:0x043a), top: B:211:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x047c A[Catch: Exception -> 0x0223, TryCatch #12 {Exception -> 0x0223, blocks: (B:194:0x021b, B:212:0x0207, B:220:0x022a, B:221:0x0248, B:223:0x024d, B:225:0x0251, B:226:0x0265, B:228:0x0269, B:230:0x026f, B:232:0x0275, B:233:0x0283, B:235:0x028b, B:236:0x0295, B:238:0x029a, B:239:0x02a4, B:241:0x02a9, B:242:0x02b3, B:244:0x02b7, B:245:0x02c1, B:248:0x02cb, B:249:0x02d8, B:251:0x02dc, B:253:0x02ec, B:254:0x02f1, B:256:0x02f5, B:257:0x02fa, B:258:0x0300, B:260:0x0307, B:262:0x0317, B:263:0x031c, B:265:0x0320, B:266:0x0325, B:268:0x0329, B:269:0x032e, B:271:0x0332, B:272:0x0337, B:274:0x033b, B:275:0x0340, B:277:0x0344, B:278:0x0349, B:280:0x034d, B:281:0x0352, B:283:0x0356, B:284:0x035b, B:286:0x035f, B:287:0x0364, B:289:0x0368, B:290:0x036d, B:292:0x0371, B:293:0x0376, B:295:0x037a, B:296:0x037f, B:298:0x0383, B:299:0x0388, B:301:0x038c, B:302:0x0391, B:304:0x0395, B:305:0x039a, B:307:0x039d, B:308:0x03a2, B:309:0x03a8, B:311:0x03ad, B:312:0x03b7, B:62:0x03d1, B:64:0x03dd, B:66:0x03e5, B:68:0x03ef, B:70:0x03f7, B:72:0x03ff, B:75:0x0443, B:77:0x0449, B:80:0x0454, B:82:0x045a, B:85:0x0465, B:87:0x046b, B:90:0x0476, B:92:0x047c, B:96:0x04d3, B:98:0x04da, B:100:0x04e1, B:101:0x04ee, B:126:0x0489, B:128:0x0491, B:130:0x0499, B:132:0x04a1, B:134:0x04a9, B:136:0x04b1, B:138:0x04b9, B:140:0x04c3, B:142:0x04cd, B:151:0x040d, B:153:0x0415, B:156:0x0420, B:158:0x042a, B:160:0x0432, B:162:0x043a), top: B:211:0x0207 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v66 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.android.gms.internal.ads.zztb, android.media.MediaCrypto] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaC() throws com.google.android.gms.internal.ads.zzij {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzte.zzaC():void");
    }

    @CallSuper
    public void zzaD(long j2) {
        this.zzad = j2;
        while (!this.zzk.isEmpty() && j2 >= ((zztd) this.zzk.peek()).zzb) {
            zztd zztdVar = (zztd) this.zzk.poll();
            zztdVar.getClass();
            zzaR(zztdVar);
            zzap();
        }
    }

    public void zzaE(zzhq zzhqVar) throws zzij {
    }

    public void zzaF(zzaf zzafVar) throws zzij {
    }

    public final void zzaG() {
        try {
            zzst zzstVar = this.zzs;
            if (zzstVar != null) {
                zzstVar.zzm();
                this.zza.zzb++;
                zzsw zzswVar = this.zzz;
                zzswVar.getClass();
                zzam(zzswVar.zza);
            }
        } finally {
            this.zzs = null;
            this.zzp = null;
            this.zzaf = null;
            zzaI();
        }
    }

    @CallSuper
    public void zzaH() {
        zzao();
        zzaQ();
        this.zzH = -9223372036854775807L;
        this.zzV = false;
        this.zzU = false;
        this.zzE = false;
        this.zzF = false;
        this.zzL = false;
        this.zzM = false;
        this.zzX = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzS = 0;
        this.zzT = 0;
        this.zzR = this.zzQ ? 1 : 0;
    }

    @CallSuper
    public final void zzaI() {
        zzaH();
        this.zzx = null;
        this.zzz = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = false;
        this.zzW = false;
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzB = false;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzQ = false;
        this.zzR = 0;
    }

    public final boolean zzaJ() throws zzij {
        boolean zzaK = zzaK();
        if (zzaK) {
            zzaC();
        }
        return zzaK;
    }

    public final boolean zzaK() {
        if (this.zzs == null) {
            return false;
        }
        int i2 = this.zzT;
        if (i2 == 3 || ((this.zzB && !this.zzW) || (this.zzC && this.zzV))) {
            zzaG();
            return true;
        }
        if (i2 == 2) {
            int i3 = zzeu.zza;
            zzdi.zzf(i3 >= 23);
            if (i3 >= 23) {
                try {
                    zzaS();
                } catch (zzij e) {
                    zzea.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaG();
                    return true;
                }
            }
        }
        zzah();
        return false;
    }

    public final boolean zzaL() {
        return this.zzN;
    }

    public final boolean zzaM(zzaf zzafVar) {
        return this.zzag == null && zzas(zzafVar);
    }

    public boolean zzaN(zzsw zzswVar) {
        return true;
    }

    public boolean zzaO(zzhq zzhqVar) {
        return false;
    }

    public abstract int zzaa(zztg zztgVar, zzaf zzafVar) throws zztm;

    public zzib zzab(zzsw zzswVar, zzaf zzafVar, zzaf zzafVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        if (zzaT() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
    
        if (zzaT() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c5, code lost:
    
        if (zzaT() == false) goto L73;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzib zzac(com.google.android.gms.internal.ads.zzkm r12) throws com.google.android.gms.internal.ads.zzij {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzte.zzac(com.google.android.gms.internal.ads.zzkm):com.google.android.gms.internal.ads.zzib");
    }

    public abstract zzsq zzaf(zzsw zzswVar, zzaf zzafVar, @Nullable MediaCrypto mediaCrypto, float f2);

    public abstract List zzag(zztg zztgVar, zzaf zzafVar, boolean z2) throws zztm;

    public void zzaj(zzhq zzhqVar) throws zzij {
        throw null;
    }

    public void zzak(Exception exc) {
        throw null;
    }

    public void zzal(String str, zzsq zzsqVar, long j2, long j3) {
        throw null;
    }

    public void zzam(String str) {
        throw null;
    }

    public void zzan(zzaf zzafVar, @Nullable MediaFormat mediaFormat) throws zzij {
        throw null;
    }

    public void zzap() {
    }

    public void zzaq() throws zzij {
    }

    public abstract boolean zzar(long j2, long j3, @Nullable zzst zzstVar, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, zzaf zzafVar) throws zzij;

    public boolean zzas(zzaf zzafVar) {
        return false;
    }

    public final float zzat() {
        return this.zzq;
    }

    public int zzau(zzhq zzhqVar) {
        return 0;
    }

    public final long zzav() {
        return this.zzac.zzd;
    }

    public final long zzaw() {
        return this.zzac.zzc;
    }

    @Nullable
    public final zzlq zzay() {
        return this.zzo;
    }

    @Nullable
    public final zzst zzaz() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlu
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlm
    public void zzu(int i2, @Nullable Object obj) throws zzij {
        if (i2 == 11) {
            this.zzo = (zzlq) obj;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public void zzx() {
        this.zzm = null;
        zzaR(zztd.zza);
        this.zzk.clear();
        zzaK();
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public void zzy(boolean z2, boolean z3) throws zzij {
        this.zza = new zzia();
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public void zzz(long j2, boolean z2) throws zzij {
        this.zzZ = false;
        this.zzaa = false;
        if (this.zzN) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzO = false;
            this.zzl.zzb();
        } else {
            zzaJ();
        }
        zzeq zzeqVar = this.zzac.zze;
        if (zzeqVar.zza() > 0) {
            this.zzab = true;
        }
        zzeqVar.zze();
        this.zzk.clear();
    }
}
