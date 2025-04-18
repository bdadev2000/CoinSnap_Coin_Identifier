package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class zzsy extends zzhw {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
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
    protected zzhx zza;
    private boolean zzaa;
    private boolean zzab;
    private zzsw zzac;
    private long zzad;
    private boolean zzae;

    @Nullable
    private zzrq zzaf;

    @Nullable
    private zzrq zzag;
    private final zzsl zzc;
    private final zzta zzd;
    private final float zze;
    private final zzhm zzf;
    private final zzhm zzg;
    private final zzhm zzh;
    private final zzse zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrd zzl;

    @Nullable
    private zzad zzm;

    @Nullable
    private zzad zzn;

    @Nullable
    private zzlm zzo;

    @Nullable
    private MediaCrypto zzp;
    private float zzq;
    private float zzr;

    @Nullable
    private zzsn zzs;

    @Nullable
    private zzad zzt;

    @Nullable
    private MediaFormat zzu;
    private boolean zzv;
    private float zzw;

    @Nullable
    private ArrayDeque zzx;

    @Nullable
    private zzsu zzy;

    @Nullable
    private zzsq zzz;

    public zzsy(int i10, zzsl zzslVar, zzta zztaVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzslVar;
        this.zzd = zztaVar;
        this.zze = f10;
        this.zzf = new zzhm(0, 0);
        this.zzg = new zzhm(0, 0);
        this.zzh = new zzhm(2, 0);
        zzse zzseVar = new zzse();
        this.zzi = zzseVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzr = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzac = zzsw.zza;
        zzseVar.zzj(0);
        zzseVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrd();
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzR = 0;
        this.zzI = -1;
        this.zzJ = -1;
        this.zzH = C.TIME_UNSET;
        this.zzX = C.TIME_UNSET;
        this.zzY = C.TIME_UNSET;
        this.zzad = C.TIME_UNSET;
        this.zzS = 0;
        this.zzT = 0;
        this.zza = new zzhx();
    }

    public static boolean zzaP(zzad zzadVar) {
        return zzadVar.zzJ == 0;
    }

    private final void zzaQ() {
        this.zzJ = -1;
        this.zzK = null;
    }

    private final void zzaR(zzsw zzswVar) {
        this.zzac = zzswVar;
        if (zzswVar.zzd != C.TIME_UNSET) {
            this.zzae = true;
        }
    }

    @RequiresApi(23)
    private final void zzaS() throws zzig {
        zzrq zzrqVar = this.zzag;
        zzrqVar.getClass();
        this.zzaf = zzrqVar;
        this.zzS = 0;
        this.zzT = 0;
    }

    @TargetApi(23)
    private final boolean zzaT() throws zzig {
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

    private final boolean zzaU() {
        return this.zzJ >= 0;
    }

    private final boolean zzaV(long j3, long j10) {
        if (j10 >= j3) {
            return false;
        }
        zzad zzadVar = this.zzn;
        if (zzadVar == null || !Objects.equals(zzadVar.zzo, MimeTypes.AUDIO_OPUS)) {
            return true;
        }
        return !zzadm.zzf(j3, j10);
    }

    private final boolean zzaW(int i10) throws zzig {
        zzhm zzhmVar = this.zzf;
        zzkj zzk = zzk();
        zzhmVar.zzb();
        int zzcW = zzcW(zzk, this.zzf, i10 | 4);
        if (zzcW == -5) {
            zzac(zzk);
            return true;
        }
        if (zzcW == -4 && this.zzf.zzf()) {
            this.zzZ = true;
            zzai();
            return false;
        }
        return false;
    }

    private final boolean zzaX(@Nullable zzad zzadVar) throws zzig {
        if (zzen.zza >= 23 && this.zzs != null && this.zzT != 3 && zzcV() != 0) {
            float f10 = this.zzr;
            zzadVar.getClass();
            float zzZ = zzZ(f10, zzadVar, zzT());
            float f11 = this.zzw;
            if (f11 != zzZ) {
                if (zzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f11 != -1.0f || zzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzZ);
                    zzsn zzsnVar = this.zzs;
                    zzsnVar.getClass();
                    zzsnVar.zzq(bundle);
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

    private final void zzae() throws zzig {
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
            zzsn zzsnVar = this.zzs;
            zzdb.zzb(zzsnVar);
            zzsnVar.zzj();
        } finally {
            zzaH();
        }
    }

    @TargetApi(23)
    private final void zzai() throws zzig {
        int i10 = this.zzT;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.zzaa = true;
                    zzaq();
                    return;
                } else {
                    zzaG();
                    zzaC();
                    return;
                }
            }
            zzah();
            zzaS();
            return;
        }
        zzah();
    }

    private final void zzao() {
        this.zzI = -1;
        this.zzg.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
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
    @Override // com.google.android.gms.internal.ads.zzhw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzF(com.google.android.gms.internal.ads.zzad[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzur r18) throws com.google.android.gms.internal.ads.zzig {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzsw r1 = r0.zzac
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.zzsw r1 = new com.google.android.gms.internal.ads.zzsw
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
            com.google.android.gms.internal.ads.zzsw r1 = new com.google.android.gms.internal.ads.zzsw
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaR(r1)
            com.google.android.gms.internal.ads.zzsw r1 = r0.zzac
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.zzap()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zzsw r9 = new com.google.android.gms.internal.ads.zzsw
            long r3 = r0.zzX
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zzF(com.google.android.gms.internal.ads.zzad[], long, long, com.google.android.gms.internal.ads.zzur):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzln
    public void zzM(float f10, float f11) throws zzig {
        this.zzq = f10;
        this.zzr = f11;
        zzaX(this.zzt);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzln
    public void zzV(long r24, long r26) throws com.google.android.gms.internal.ads.zzig {
        /*
            Method dump skipped, instructions count: 1650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzW() {
        return this.zzaa;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaU()) {
            return true;
        }
        if (this.zzH == C.TIME_UNSET || zzi().zzb() >= this.zzH) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzY(zzad zzadVar) throws zzig {
        try {
            return zzaa(this.zzd, zzadVar);
        } catch (zztf e2) {
            throw zzcY(e2, zzadVar, false, 4002);
        }
    }

    public float zzZ(float f10, zzad zzadVar, zzad[] zzadVarArr) {
        throw null;
    }

    public zzsp zzaA(Throwable th2, @Nullable zzsq zzsqVar) {
        return new zzsp(th2, zzsqVar);
    }

    @Nullable
    public final zzsq zzaB() {
        return this.zzz;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:(15:44|45|46|47|(1:49)(1:347)|50|(1:52)|53|(1:55)|56|57|58|59|(38:165|166|167|168|(2:329|330)|170|171|(1:173)|174|(1:176)|177|(4:179|180|(6:181|182|183|184|185|(6:187|(2:214|215)(2:189|(1:191)(2:200|(1:202)(2:203|(1:205)(2:206|(1:208)(7:209|210|211|212|213|194|199)))))|192|193|194|199)(1:219))|220)(1:328)|221|(1:225)|226|(1:232)|233|(1:235)|236|(1:238)|239|(1:241)|242|(1:244)|245|246|(1:248)|249|(5:251|(1:253)|254|(1:256)|257)|258|(33:260|(1:262)|263|(1:265)|266|(1:268)|269|(1:271)|272|(1:274)|275|(1:277)|278|(1:280)|281|(1:283)|284|(1:286)|287|(1:289)|290|(1:292)|293|(1:295)|296|(1:298)|299|(1:301)|302|(1:304)|305|(1:307)|308)|309|(1:311)|312|313|314|315|316)(1:61)|62)|(2:66|(24:74|75|(1:148)(1:79)|80|(1:147)(1:84)|85|(1:146)(1:89)|90|(16:92|(1:94)|95|96|97|98|(1:100)|101|102|103|104|105|106|107|108|109)|(14:145|96|97|98|(0)|101|102|103|104|105|106|107|108|109)|95|96|97|98|(0)|101|102|103|104|105|106|107|108|109))|149|(2:155|(28:163|75|(1:77)|148|80|(1:82)|147|85|(1:87)|146|90|(0)|(6:126|128|130|132|134|136)|138|145|96|97|98|(0)|101|102|103|104|105|106|107|108|109))|164|75|(0)|148|80|(0)|147|85|(0)|146|90|(0)|(0)|138|145|96|97|98|(0)|101|102|103|104|105|106|107|108|109) */
    /* JADX WARN: Can't wrap try/catch for region: R(46:44|45|46|47|(1:49)(1:347)|50|(1:52)|53|(1:55)|56|57|58|59|(38:165|166|167|168|(2:329|330)|170|171|(1:173)|174|(1:176)|177|(4:179|180|(6:181|182|183|184|185|(6:187|(2:214|215)(2:189|(1:191)(2:200|(1:202)(2:203|(1:205)(2:206|(1:208)(7:209|210|211|212|213|194|199)))))|192|193|194|199)(1:219))|220)(1:328)|221|(1:225)|226|(1:232)|233|(1:235)|236|(1:238)|239|(1:241)|242|(1:244)|245|246|(1:248)|249|(5:251|(1:253)|254|(1:256)|257)|258|(33:260|(1:262)|263|(1:265)|266|(1:268)|269|(1:271)|272|(1:274)|275|(1:277)|278|(1:280)|281|(1:283)|284|(1:286)|287|(1:289)|290|(1:292)|293|(1:295)|296|(1:298)|299|(1:301)|302|(1:304)|305|(1:307)|308)|309|(1:311)|312|313|314|315|316)(1:61)|62|(2:66|(24:74|75|(1:148)(1:79)|80|(1:147)(1:84)|85|(1:146)(1:89)|90|(16:92|(1:94)|95|96|97|98|(1:100)|101|102|103|104|105|106|107|108|109)|(14:145|96|97|98|(0)|101|102|103|104|105|106|107|108|109)|95|96|97|98|(0)|101|102|103|104|105|106|107|108|109))|149|(2:155|(28:163|75|(1:77)|148|80|(1:82)|147|85|(1:87)|146|90|(0)|(6:126|128|130|132|134|136)|138|145|96|97|98|(0)|101|102|103|104|105|106|107|108|109))|164|75|(0)|148|80|(0)|147|85|(0)|146|90|(0)|(0)|138|145|96|97|98|(0)|101|102|103|104|105|106|107|108|109) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x050b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x050c, code lost:
    
        r20 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x051e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04e4 A[Catch: Exception -> 0x050d, TryCatch #0 {Exception -> 0x050d, blocks: (B:194:0x0207, B:212:0x01f3, B:220:0x020f, B:221:0x022b, B:223:0x0230, B:225:0x0234, B:226:0x0248, B:228:0x024c, B:230:0x0252, B:232:0x0258, B:233:0x0266, B:235:0x026e, B:236:0x0278, B:238:0x027d, B:239:0x0287, B:241:0x028c, B:242:0x0296, B:244:0x029a, B:245:0x02a4, B:248:0x02ae, B:249:0x02c4, B:251:0x02c8, B:253:0x02d8, B:254:0x02dd, B:256:0x02e1, B:257:0x02e6, B:258:0x02ec, B:260:0x02f3, B:262:0x0303, B:263:0x0308, B:265:0x030c, B:266:0x0311, B:268:0x0315, B:269:0x031a, B:271:0x031e, B:272:0x0323, B:274:0x0327, B:275:0x032c, B:277:0x0330, B:278:0x0335, B:280:0x0339, B:281:0x033e, B:283:0x0342, B:284:0x0347, B:286:0x034b, B:287:0x0350, B:289:0x0354, B:290:0x0359, B:292:0x035d, B:293:0x0362, B:295:0x0366, B:296:0x036b, B:298:0x036f, B:299:0x0374, B:301:0x0378, B:302:0x037d, B:304:0x0381, B:305:0x0386, B:307:0x0389, B:308:0x038e, B:309:0x0394, B:311:0x0399, B:312:0x03a3, B:316:0x03ad, B:62:0x03d5, B:64:0x03e1, B:66:0x03e9, B:68:0x03f3, B:70:0x03fb, B:72:0x0403, B:75:0x0446, B:77:0x044c, B:80:0x0457, B:82:0x045d, B:85:0x0468, B:87:0x046e, B:90:0x0479, B:92:0x047f, B:96:0x04d6, B:98:0x04dd, B:100:0x04e4, B:101:0x04f1, B:126:0x048c, B:128:0x0494, B:130:0x049c, B:132:0x04a4, B:134:0x04ac, B:136:0x04b4, B:138:0x04bc, B:140:0x04c6, B:142:0x04d0, B:151:0x0411, B:153:0x0419, B:155:0x0421, B:157:0x042b, B:159:0x0433, B:161:0x043b), top: B:211:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0546 A[Catch: zzsu -> 0x0576, TryCatch #10 {zzsu -> 0x0576, blocks: (B:114:0x0529, B:116:0x0546, B:117:0x054f, B:122:0x055f, B:123:0x0561, B:124:0x0549, B:354:0x0562, B:356:0x0568, B:357:0x0575), top: B:34:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x055f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0549 A[Catch: zzsu -> 0x0576, TryCatch #10 {zzsu -> 0x0576, blocks: (B:114:0x0529, B:116:0x0546, B:117:0x054f, B:122:0x055f, B:123:0x0561, B:124:0x0549, B:354:0x0562, B:356:0x0568, B:357:0x0575), top: B:34:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x048c A[Catch: Exception -> 0x050d, TryCatch #0 {Exception -> 0x050d, blocks: (B:194:0x0207, B:212:0x01f3, B:220:0x020f, B:221:0x022b, B:223:0x0230, B:225:0x0234, B:226:0x0248, B:228:0x024c, B:230:0x0252, B:232:0x0258, B:233:0x0266, B:235:0x026e, B:236:0x0278, B:238:0x027d, B:239:0x0287, B:241:0x028c, B:242:0x0296, B:244:0x029a, B:245:0x02a4, B:248:0x02ae, B:249:0x02c4, B:251:0x02c8, B:253:0x02d8, B:254:0x02dd, B:256:0x02e1, B:257:0x02e6, B:258:0x02ec, B:260:0x02f3, B:262:0x0303, B:263:0x0308, B:265:0x030c, B:266:0x0311, B:268:0x0315, B:269:0x031a, B:271:0x031e, B:272:0x0323, B:274:0x0327, B:275:0x032c, B:277:0x0330, B:278:0x0335, B:280:0x0339, B:281:0x033e, B:283:0x0342, B:284:0x0347, B:286:0x034b, B:287:0x0350, B:289:0x0354, B:290:0x0359, B:292:0x035d, B:293:0x0362, B:295:0x0366, B:296:0x036b, B:298:0x036f, B:299:0x0374, B:301:0x0378, B:302:0x037d, B:304:0x0381, B:305:0x0386, B:307:0x0389, B:308:0x038e, B:309:0x0394, B:311:0x0399, B:312:0x03a3, B:316:0x03ad, B:62:0x03d5, B:64:0x03e1, B:66:0x03e9, B:68:0x03f3, B:70:0x03fb, B:72:0x0403, B:75:0x0446, B:77:0x044c, B:80:0x0457, B:82:0x045d, B:85:0x0468, B:87:0x046e, B:90:0x0479, B:92:0x047f, B:96:0x04d6, B:98:0x04dd, B:100:0x04e4, B:101:0x04f1, B:126:0x048c, B:128:0x0494, B:130:0x049c, B:132:0x04a4, B:134:0x04ac, B:136:0x04b4, B:138:0x04bc, B:140:0x04c6, B:142:0x04d0, B:151:0x0411, B:153:0x0419, B:155:0x0421, B:157:0x042b, B:159:0x0433, B:161:0x043b), top: B:211:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x044c A[Catch: Exception -> 0x050d, TryCatch #0 {Exception -> 0x050d, blocks: (B:194:0x0207, B:212:0x01f3, B:220:0x020f, B:221:0x022b, B:223:0x0230, B:225:0x0234, B:226:0x0248, B:228:0x024c, B:230:0x0252, B:232:0x0258, B:233:0x0266, B:235:0x026e, B:236:0x0278, B:238:0x027d, B:239:0x0287, B:241:0x028c, B:242:0x0296, B:244:0x029a, B:245:0x02a4, B:248:0x02ae, B:249:0x02c4, B:251:0x02c8, B:253:0x02d8, B:254:0x02dd, B:256:0x02e1, B:257:0x02e6, B:258:0x02ec, B:260:0x02f3, B:262:0x0303, B:263:0x0308, B:265:0x030c, B:266:0x0311, B:268:0x0315, B:269:0x031a, B:271:0x031e, B:272:0x0323, B:274:0x0327, B:275:0x032c, B:277:0x0330, B:278:0x0335, B:280:0x0339, B:281:0x033e, B:283:0x0342, B:284:0x0347, B:286:0x034b, B:287:0x0350, B:289:0x0354, B:290:0x0359, B:292:0x035d, B:293:0x0362, B:295:0x0366, B:296:0x036b, B:298:0x036f, B:299:0x0374, B:301:0x0378, B:302:0x037d, B:304:0x0381, B:305:0x0386, B:307:0x0389, B:308:0x038e, B:309:0x0394, B:311:0x0399, B:312:0x03a3, B:316:0x03ad, B:62:0x03d5, B:64:0x03e1, B:66:0x03e9, B:68:0x03f3, B:70:0x03fb, B:72:0x0403, B:75:0x0446, B:77:0x044c, B:80:0x0457, B:82:0x045d, B:85:0x0468, B:87:0x046e, B:90:0x0479, B:92:0x047f, B:96:0x04d6, B:98:0x04dd, B:100:0x04e4, B:101:0x04f1, B:126:0x048c, B:128:0x0494, B:130:0x049c, B:132:0x04a4, B:134:0x04ac, B:136:0x04b4, B:138:0x04bc, B:140:0x04c6, B:142:0x04d0, B:151:0x0411, B:153:0x0419, B:155:0x0421, B:157:0x042b, B:159:0x0433, B:161:0x043b), top: B:211:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x045d A[Catch: Exception -> 0x050d, TryCatch #0 {Exception -> 0x050d, blocks: (B:194:0x0207, B:212:0x01f3, B:220:0x020f, B:221:0x022b, B:223:0x0230, B:225:0x0234, B:226:0x0248, B:228:0x024c, B:230:0x0252, B:232:0x0258, B:233:0x0266, B:235:0x026e, B:236:0x0278, B:238:0x027d, B:239:0x0287, B:241:0x028c, B:242:0x0296, B:244:0x029a, B:245:0x02a4, B:248:0x02ae, B:249:0x02c4, B:251:0x02c8, B:253:0x02d8, B:254:0x02dd, B:256:0x02e1, B:257:0x02e6, B:258:0x02ec, B:260:0x02f3, B:262:0x0303, B:263:0x0308, B:265:0x030c, B:266:0x0311, B:268:0x0315, B:269:0x031a, B:271:0x031e, B:272:0x0323, B:274:0x0327, B:275:0x032c, B:277:0x0330, B:278:0x0335, B:280:0x0339, B:281:0x033e, B:283:0x0342, B:284:0x0347, B:286:0x034b, B:287:0x0350, B:289:0x0354, B:290:0x0359, B:292:0x035d, B:293:0x0362, B:295:0x0366, B:296:0x036b, B:298:0x036f, B:299:0x0374, B:301:0x0378, B:302:0x037d, B:304:0x0381, B:305:0x0386, B:307:0x0389, B:308:0x038e, B:309:0x0394, B:311:0x0399, B:312:0x03a3, B:316:0x03ad, B:62:0x03d5, B:64:0x03e1, B:66:0x03e9, B:68:0x03f3, B:70:0x03fb, B:72:0x0403, B:75:0x0446, B:77:0x044c, B:80:0x0457, B:82:0x045d, B:85:0x0468, B:87:0x046e, B:90:0x0479, B:92:0x047f, B:96:0x04d6, B:98:0x04dd, B:100:0x04e4, B:101:0x04f1, B:126:0x048c, B:128:0x0494, B:130:0x049c, B:132:0x04a4, B:134:0x04ac, B:136:0x04b4, B:138:0x04bc, B:140:0x04c6, B:142:0x04d0, B:151:0x0411, B:153:0x0419, B:155:0x0421, B:157:0x042b, B:159:0x0433, B:161:0x043b), top: B:211:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x046e A[Catch: Exception -> 0x050d, TryCatch #0 {Exception -> 0x050d, blocks: (B:194:0x0207, B:212:0x01f3, B:220:0x020f, B:221:0x022b, B:223:0x0230, B:225:0x0234, B:226:0x0248, B:228:0x024c, B:230:0x0252, B:232:0x0258, B:233:0x0266, B:235:0x026e, B:236:0x0278, B:238:0x027d, B:239:0x0287, B:241:0x028c, B:242:0x0296, B:244:0x029a, B:245:0x02a4, B:248:0x02ae, B:249:0x02c4, B:251:0x02c8, B:253:0x02d8, B:254:0x02dd, B:256:0x02e1, B:257:0x02e6, B:258:0x02ec, B:260:0x02f3, B:262:0x0303, B:263:0x0308, B:265:0x030c, B:266:0x0311, B:268:0x0315, B:269:0x031a, B:271:0x031e, B:272:0x0323, B:274:0x0327, B:275:0x032c, B:277:0x0330, B:278:0x0335, B:280:0x0339, B:281:0x033e, B:283:0x0342, B:284:0x0347, B:286:0x034b, B:287:0x0350, B:289:0x0354, B:290:0x0359, B:292:0x035d, B:293:0x0362, B:295:0x0366, B:296:0x036b, B:298:0x036f, B:299:0x0374, B:301:0x0378, B:302:0x037d, B:304:0x0381, B:305:0x0386, B:307:0x0389, B:308:0x038e, B:309:0x0394, B:311:0x0399, B:312:0x03a3, B:316:0x03ad, B:62:0x03d5, B:64:0x03e1, B:66:0x03e9, B:68:0x03f3, B:70:0x03fb, B:72:0x0403, B:75:0x0446, B:77:0x044c, B:80:0x0457, B:82:0x045d, B:85:0x0468, B:87:0x046e, B:90:0x0479, B:92:0x047f, B:96:0x04d6, B:98:0x04dd, B:100:0x04e4, B:101:0x04f1, B:126:0x048c, B:128:0x0494, B:130:0x049c, B:132:0x04a4, B:134:0x04ac, B:136:0x04b4, B:138:0x04bc, B:140:0x04c6, B:142:0x04d0, B:151:0x0411, B:153:0x0419, B:155:0x0421, B:157:0x042b, B:159:0x0433, B:161:0x043b), top: B:211:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x047f A[Catch: Exception -> 0x050d, TryCatch #0 {Exception -> 0x050d, blocks: (B:194:0x0207, B:212:0x01f3, B:220:0x020f, B:221:0x022b, B:223:0x0230, B:225:0x0234, B:226:0x0248, B:228:0x024c, B:230:0x0252, B:232:0x0258, B:233:0x0266, B:235:0x026e, B:236:0x0278, B:238:0x027d, B:239:0x0287, B:241:0x028c, B:242:0x0296, B:244:0x029a, B:245:0x02a4, B:248:0x02ae, B:249:0x02c4, B:251:0x02c8, B:253:0x02d8, B:254:0x02dd, B:256:0x02e1, B:257:0x02e6, B:258:0x02ec, B:260:0x02f3, B:262:0x0303, B:263:0x0308, B:265:0x030c, B:266:0x0311, B:268:0x0315, B:269:0x031a, B:271:0x031e, B:272:0x0323, B:274:0x0327, B:275:0x032c, B:277:0x0330, B:278:0x0335, B:280:0x0339, B:281:0x033e, B:283:0x0342, B:284:0x0347, B:286:0x034b, B:287:0x0350, B:289:0x0354, B:290:0x0359, B:292:0x035d, B:293:0x0362, B:295:0x0366, B:296:0x036b, B:298:0x036f, B:299:0x0374, B:301:0x0378, B:302:0x037d, B:304:0x0381, B:305:0x0386, B:307:0x0389, B:308:0x038e, B:309:0x0394, B:311:0x0399, B:312:0x03a3, B:316:0x03ad, B:62:0x03d5, B:64:0x03e1, B:66:0x03e9, B:68:0x03f3, B:70:0x03fb, B:72:0x0403, B:75:0x0446, B:77:0x044c, B:80:0x0457, B:82:0x045d, B:85:0x0468, B:87:0x046e, B:90:0x0479, B:92:0x047f, B:96:0x04d6, B:98:0x04dd, B:100:0x04e4, B:101:0x04f1, B:126:0x048c, B:128:0x0494, B:130:0x049c, B:132:0x04a4, B:134:0x04ac, B:136:0x04b4, B:138:0x04bc, B:140:0x04c6, B:142:0x04d0, B:151:0x0411, B:153:0x0419, B:155:0x0421, B:157:0x042b, B:159:0x0433, B:161:0x043b), top: B:211:0x01f3 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.google.android.gms.internal.ads.zzsq] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzsx] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzsy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaC() throws com.google.android.gms.internal.ads.zzig {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zzaC():void");
    }

    @CallSuper
    public void zzaD(long j3) {
        this.zzad = j3;
        while (!this.zzk.isEmpty() && j3 >= ((zzsw) this.zzk.peek()).zzb) {
            zzsw zzswVar = (zzsw) this.zzk.poll();
            zzswVar.getClass();
            zzaR(zzswVar);
            zzap();
        }
    }

    public void zzaE(zzhm zzhmVar) throws zzig {
    }

    public void zzaF(zzad zzadVar) throws zzig {
    }

    public final void zzaG() {
        try {
            zzsn zzsnVar = this.zzs;
            if (zzsnVar != null) {
                zzsnVar.zzm();
                this.zza.zzb++;
                zzsq zzsqVar = this.zzz;
                zzsqVar.getClass();
                zzam(zzsqVar.zza);
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
        this.zzH = C.TIME_UNSET;
        this.zzV = false;
        this.zzU = false;
        this.zzE = false;
        this.zzF = false;
        this.zzL = false;
        this.zzM = false;
        this.zzX = C.TIME_UNSET;
        this.zzY = C.TIME_UNSET;
        this.zzad = C.TIME_UNSET;
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

    public final boolean zzaJ() throws zzig {
        boolean zzaK = zzaK();
        if (zzaK) {
            zzaC();
        }
        return zzaK;
    }

    public final boolean zzaK() {
        boolean z10;
        if (this.zzs == null) {
            return false;
        }
        int i10 = this.zzT;
        if (i10 != 3 && ((!this.zzB || this.zzW) && (!this.zzC || !this.zzV))) {
            if (i10 == 2) {
                int i11 = zzen.zza;
                if (i11 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdb.zzf(z10);
                if (i11 >= 23) {
                    try {
                        zzaS();
                    } catch (zzig e2) {
                        zzdt.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                        zzaG();
                        return true;
                    }
                }
            }
            zzah();
            return false;
        }
        zzaG();
        return true;
    }

    public final boolean zzaL() {
        return this.zzN;
    }

    public final boolean zzaM(zzad zzadVar) {
        return this.zzag == null && zzas(zzadVar);
    }

    public boolean zzaN(zzsq zzsqVar) {
        return true;
    }

    public boolean zzaO(zzhm zzhmVar) {
        return false;
    }

    public abstract int zzaa(zzta zztaVar, zzad zzadVar) throws zztf;

    public zzhy zzab(zzsq zzsqVar, zzad zzadVar, zzad zzadVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (zzaT() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ae, code lost:
    
        if (zzaT() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c1, code lost:
    
        if (zzaT() == false) goto L74;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzhy zzac(com.google.android.gms.internal.ads.zzkj r12) throws com.google.android.gms.internal.ads.zzig {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zzac(com.google.android.gms.internal.ads.zzkj):com.google.android.gms.internal.ads.zzhy");
    }

    public abstract zzsk zzaf(zzsq zzsqVar, zzad zzadVar, @Nullable MediaCrypto mediaCrypto, float f10);

    public abstract List zzag(zzta zztaVar, zzad zzadVar, boolean z10) throws zztf;

    public void zzaj(zzhm zzhmVar) throws zzig {
        throw null;
    }

    public void zzak(Exception exc) {
        throw null;
    }

    public void zzal(String str, zzsk zzskVar, long j3, long j10) {
        throw null;
    }

    public void zzam(String str) {
        throw null;
    }

    public void zzan(zzad zzadVar, @Nullable MediaFormat mediaFormat) throws zzig {
        throw null;
    }

    public void zzap() {
    }

    public void zzaq() throws zzig {
    }

    public abstract boolean zzar(long j3, long j10, @Nullable zzsn zzsnVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, zzad zzadVar) throws zzig;

    public boolean zzas(zzad zzadVar) {
        return false;
    }

    public final float zzat() {
        return this.zzq;
    }

    public int zzau(zzhm zzhmVar) {
        return 0;
    }

    public final long zzav() {
        return this.zzac.zzd;
    }

    public final long zzaw() {
        return this.zzac.zzc;
    }

    @Nullable
    public final zzlm zzay() {
        return this.zzo;
    }

    @Nullable
    public final zzsn zzaz() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzlq
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzli
    public void zzu(int i10, @Nullable Object obj) throws zzig {
        if (i10 == 11) {
            this.zzo = (zzlm) obj;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public void zzx() {
        this.zzm = null;
        zzaR(zzsw.zza);
        this.zzk.clear();
        zzaK();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public void zzy(boolean z10, boolean z11) throws zzig {
        this.zza = new zzhx();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public void zzz(long j3, boolean z10) throws zzig {
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
        zzej zzejVar = this.zzac.zze;
        if (zzejVar.zza() > 0) {
            this.zzab = true;
        }
        zzejVar.zze();
        this.zzk.clear();
    }
}
