package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.yRU;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.jU;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.pvr;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.video.lMd.zp;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.utils.cW;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile COT zp;
    private com.bytedance.sdk.component.ku.ku COT;
    private final Context lMd;
    private final AtomicBoolean KS = new AtomicBoolean(false);
    private final List<lMd> jU = Collections.synchronizedList(new ArrayList());
    private final yRU.zp HWF = new yRU.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.COT.7
        @Override // com.bytedance.sdk.component.utils.yRU.zp
        public void zp(Context context, Intent intent, boolean z8, int i9) {
            if (!z8) {
                return;
            }
            if (COT.this.COT == null) {
                COT cot = COT.this;
                cot.COT = new com.bytedance.sdk.openadsdk.component.reward.lMd("fsv net connect task", cot.jU);
            }
            com.bytedance.sdk.component.utils.ku.zp().post(COT.this.COT);
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.COT$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements jU.zp<Object> {
        final /* synthetic */ AdSlot COT;
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.zp HWF;
        final /* synthetic */ zp KS;
        final /* synthetic */ boolean jU;
        final /* synthetic */ rV lMd;
        final /* synthetic */ boolean zp;

        public AnonymousClass6(boolean z8, rV rVVar, zp zpVar, boolean z9, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zp zpVar2) {
            this.zp = z8;
            this.lMd = rVVar;
            this.KS = zpVar;
            this.jU = z9;
            this.COT = adSlot;
            this.HWF = zpVar2;
        }

        @Override // com.bytedance.sdk.openadsdk.component.reward.jU.zp
        public void zp(boolean z8, Object obj) {
            if (z8) {
                this.lMd.lMd();
            }
            if (!this.zp) {
                if (z8) {
                    if (this.KS != null) {
                        if (this.jU || KVG.jU().cz() == 1) {
                            this.KS.onAdLoaded(this.lMd.zp());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.KS != null) {
                    if (this.jU || KVG.jU().cz() == 1) {
                        this.KS.onError(-1, "");
                        return;
                    }
                    return;
                }
                return;
            }
            if (z8) {
                jU.zp(COT.this.lMd).zp(this.COT, this.HWF);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class lMd extends com.bytedance.sdk.component.ku.ku {
        com.bytedance.sdk.openadsdk.core.model.zp KS;
        AdSlot lMd;
        woN zp;

        /* renamed from: com.bytedance.sdk.openadsdk.component.reward.COT$lMd$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements jU.zp<Object> {
            public AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.jU.zp
            public void zp(boolean z8, Object obj) {
                if (z8) {
                    jU zp = jU.zp(KVG.zp());
                    lMd lmd = lMd.this;
                    zp.zp(lmd.lMd, lmd.KS);
                }
            }
        }

        public lMd(woN won, AdSlot adSlot) {
            super("Fullscreen Task");
            this.zp = won;
            this.lMd = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            woN won = this.zp;
            if (won != null && won.eWG() != null) {
                com.bytedance.sdk.openadsdk.core.video.zp.lMd zp = woN.zp(CacheDirFactory.getICacheDir(this.zp.jyq()).zp(), this.zp);
                zp.zp("material_meta", this.zp);
                zp.zp("ad_slot", this.lMd);
                com.bytedance.sdk.openadsdk.core.video.jU.zp.zp(zp, new com.bykv.vk.openvk.component.video.api.COT.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.COT.lMd.1
                    @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
                    public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks, int i9, String str) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
                    public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks, int i9) {
                        jU zp2 = jU.zp(KVG.zp());
                        lMd lmd = lMd.this;
                        zp2.zp(lmd.lMd, lmd.KS);
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    public static class zp implements PAGInterstitialAdLoadListener {
        private final AtomicInteger KS;
        private final com.bytedance.sdk.openadsdk.core.model.zp jU;
        private final AtomicBoolean lMd;
        private final com.bytedance.sdk.openadsdk.common.KS zp;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
        public void onError(int i9, String str) {
            if (this.KS.decrementAndGet() <= 0 && this.lMd.compareAndSet(false, true)) {
                this.zp.onError(i9, str);
                com.bytedance.sdk.openadsdk.dT.KS.zp("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.COT.zp.1
                    @Override // com.bytedance.sdk.openadsdk.dT.lMd
                    @Nullable
                    public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("req_id", zp.this.jU.zp());
                        return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("choose_ad_load_error").lMd(jSONObject.toString());
                    }
                });
            }
        }

        private zp(com.bytedance.sdk.openadsdk.common.KS ks, com.bytedance.sdk.openadsdk.core.model.zp zpVar) {
            this.lMd = new AtomicBoolean(false);
            this.zp = ks;
            this.jU = zpVar;
            this.KS = new AtomicInteger(zp());
        }

        private int zp() {
            if (!this.jU.jU()) {
                return 0;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < this.jU.KS().size(); i10++) {
                woN won = this.jU.KS().get(i10);
                if (won != null && !cz.Bj(won) && won.eWG() != null) {
                    i9++;
                }
            }
            return i9;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.KS.decrementAndGet();
            if ((this.zp instanceof PAGInterstitialAdLoadListener) && this.lMd.compareAndSet(false, true)) {
                ((PAGInterstitialAdLoadListener) this.zp).onAdLoaded(pAGInterstitialAd);
            }
        }
    }

    private COT(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = KVG.zp();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.lMd = applicationContext;
        lMd();
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.COT != null) {
            try {
                com.bytedance.sdk.component.utils.ku.zp().removeCallbacks(this.COT);
            } catch (Exception unused) {
            }
            this.COT = null;
        }
        KS();
    }

    private void KS() {
        if (this.KS.get()) {
            this.KS.set(false);
            try {
                yRU.zp(this.HWF);
            } catch (Exception unused) {
            }
        }
    }

    public void lMd(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            zp(adSlot, true, cW.zp(), null);
        }
    }

    public static COT zp(Context context) {
        if (zp == null) {
            synchronized (COT.class) {
                try {
                    if (zp == null) {
                        zp = new COT(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    private void lMd(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.KS ks) {
        com.bytedance.sdk.openadsdk.core.model.zp lMd2;
        cW zp2 = cW.zp();
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (lMd2 = jU.zp(this.lMd).lMd(adSlot.getCodeId())) != null && lMd2.jU()) {
            rV rVVar = new rV(this.lMd, lMd2);
            if (!lMd2.HWF() && !cz.Bj(lMd2.COT())) {
                rVVar.lMd();
            }
            if (ks != null) {
                if (!lMd2.HWF() && (ks instanceof PAGInterstitialAdLoadListener) && KVG.jU().cz() == 0) {
                    ((PAGInterstitialAdLoadListener) ks).onAdLoaded(rVVar.zp());
                }
                zp zpVar = new zp(ks, lMd2);
                for (int i9 = 0; i9 < lMd2.KS().size(); i9++) {
                    zp(lMd2.KS().get(i9), adSlot, zpVar, zp2, rVVar, lMd2.HWF());
                }
            }
            for (int i10 = 0; i10 < lMd2.KS().size(); i10++) {
                com.bytedance.sdk.openadsdk.core.video.lMd.zp.zp().zp(lMd2.KS().get(i10), new zp.InterfaceC0118zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.COT.1
                });
            }
            return;
        }
        zp(adSlot, false, zp2, ks);
    }

    public void zp() {
        try {
            jU.zp(this.lMd).zp();
        } catch (Throwable unused) {
        }
    }

    public void zp(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || jU.zp(this.lMd).lMd(adSlot.getCodeId()) != null) {
            return;
        }
        lMd(adSlot);
    }

    public void zp(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.KS ks) {
        lMd(adSlot, ks);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.KVG.jU().cz() != 1) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(com.bytedance.sdk.openadsdk.core.model.woN r3, com.bytedance.sdk.openadsdk.AdSlot r4, final com.bytedance.sdk.openadsdk.component.reward.COT.zp r5, com.bytedance.sdk.openadsdk.utils.cW r6, final com.bytedance.sdk.openadsdk.component.reward.rV r7, final boolean r8) {
        /*
            r2 = this;
            r6 = 0
            if (r5 == 0) goto L11
            r0 = 1
            if (r8 != 0) goto L12
            com.bytedance.sdk.openadsdk.core.settings.COT r1 = com.bytedance.sdk.openadsdk.core.KVG.jU()
            int r1 = r1.cz()
            if (r1 != r0) goto L11
            goto L12
        L11:
            r0 = r6
        L12:
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.cz.Bj(r3)
            if (r1 != 0) goto L44
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.woN.COT(r3)
            if (r1 == 0) goto L44
            r3.eWG()
            int r0 = r3.jyq()
            com.bykv.vk.openvk.component.video.api.zp.lMd r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            java.lang.String r0 = r0.zp()
            com.bytedance.sdk.openadsdk.core.video.zp.lMd r0 = com.bytedance.sdk.openadsdk.core.model.woN.zp(r0, r3)
            java.lang.String r1 = "material_meta"
            r0.zp(r1, r3)
            java.lang.String r3 = "ad_slot"
            r0.zp(r3, r4)
            com.bytedance.sdk.openadsdk.component.reward.COT$2 r3 = new com.bytedance.sdk.openadsdk.component.reward.COT$2
            r3.<init>()
            com.bytedance.sdk.openadsdk.core.video.jU.zp.zp(r0, r3)
            goto L45
        L44:
            r6 = r0
        L45:
            if (r6 == 0) goto L4e
            com.bytedance.sdk.openadsdk.component.reward.HWF r3 = r7.zp()
            r5.onAdLoaded(r3)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.COT.zp(com.bytedance.sdk.openadsdk.core.model.woN, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.COT$zp, com.bytedance.sdk.openadsdk.utils.cW, com.bytedance.sdk.openadsdk.component.reward.rV, boolean):void");
    }

    private void zp(final AdSlot adSlot, final boolean z8, final cW cWVar, final com.bytedance.sdk.openadsdk.common.KS ks) {
        final long currentTimeMillis = System.currentTimeMillis();
        pvr pvrVar = new pvr();
        pvrVar.KS = z8 ? 2 : 1;
        if (KVG.jU().Bj(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            pvrVar.ku = 2;
        }
        KVG.KS().zp(adSlot, pvrVar, 8, new woN.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.COT.3
            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(int i9, String str) {
                com.bytedance.sdk.openadsdk.common.KS ks2;
                if (z8 || (ks2 = ks) == null) {
                    return;
                }
                ks2.onError(i9, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar, com.bytedance.sdk.openadsdk.core.model.lMd lmd) {
                com.bytedance.sdk.openadsdk.common.KS ks2;
                if (zpVar.KS() != null && !zpVar.KS().isEmpty()) {
                    rV rVVar = new rV(COT.this.lMd, zpVar);
                    if (!z8) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.dT.KS.zp(zpVar.COT(), System.currentTimeMillis() - currentTimeMillis);
                        }
                        if (!zpVar.HWF() && (ks instanceof PAGInterstitialAdLoadListener) && KVG.jU().cz() == 0) {
                            ((PAGInterstitialAdLoadListener) ks).onAdLoaded(rVVar.zp());
                        }
                    }
                    zp zpVar2 = new zp(ks, zpVar);
                    for (int i9 = 0; i9 < zpVar.KS().size(); i9++) {
                        COT.this.zp(zpVar, zpVar.KS().get(i9), rVVar, adSlot, z8, cWVar, zpVar2, zpVar.HWF());
                    }
                    return;
                }
                if (z8 || (ks2 = ks) == null) {
                    return;
                }
                ks2.onError(-3, com.bytedance.sdk.openadsdk.core.QR.zp(-3));
                lmd.zp(-3);
                com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
            }
        });
    }

    private void lMd() {
        if (this.KS.get()) {
            return;
        }
        this.KS.set(true);
        yRU.zp(this.HWF, this.lMd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r18 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp(final com.bytedance.sdk.openadsdk.core.model.zp r14, com.bytedance.sdk.openadsdk.core.model.woN r15, final com.bytedance.sdk.openadsdk.component.reward.rV r16, final com.bytedance.sdk.openadsdk.AdSlot r17, final boolean r18, com.bytedance.sdk.openadsdk.utils.cW r19, final com.bytedance.sdk.openadsdk.component.reward.COT.zp r20, final boolean r21) {
        /*
            r13 = this;
            r8 = r13
            r0 = r15
            r6 = r17
            r9 = r20
            com.bytedance.sdk.openadsdk.core.video.lMd.zp r1 = com.bytedance.sdk.openadsdk.core.video.lMd.zp.zp()
            com.bytedance.sdk.openadsdk.component.reward.COT$4 r2 = new com.bytedance.sdk.openadsdk.component.reward.COT$4
            r2.<init>()
            r1.zp(r15, r2)
            r1 = 1
            if (r18 == 0) goto L42
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.cz.Bj(r15)
            if (r2 != 0) goto L42
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.woN.COT(r15)
            if (r2 == 0) goto L42
            com.bytedance.sdk.openadsdk.core.settings.COT r2 = com.bytedance.sdk.openadsdk.core.KVG.jU()
            java.lang.String r3 = r17.getCodeId()
            com.bytedance.sdk.openadsdk.core.settings.zp r2 = r2.Gzh(r3)
            int r2 = r2.jU
            if (r2 != r1) goto L42
            android.content.Context r2 = r8.lMd
            boolean r2 = com.bytedance.sdk.component.utils.KVG.jU(r2)
            if (r2 != 0) goto L42
            com.bytedance.sdk.openadsdk.component.reward.COT$lMd r1 = new com.bytedance.sdk.openadsdk.component.reward.COT$lMd
            r1.<init>(r15, r6)
            r13.zp(r1)
            return
        L42:
            r10 = 0
            if (r9 == 0) goto L52
            if (r21 != 0) goto L53
            com.bytedance.sdk.openadsdk.core.settings.COT r2 = com.bytedance.sdk.openadsdk.core.KVG.jU()
            int r2 = r2.cz()
            if (r2 != r1) goto L52
            goto L53
        L52:
            r1 = r10
        L53:
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.cz.Bj(r15)
            if (r2 != 0) goto L9a
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.woN.COT(r15)
            if (r2 == 0) goto L98
            com.bykv.vk.openvk.component.video.api.KS.lMd r2 = r15.eWG()
            if (r2 == 0) goto L95
            int r1 = r15.jyq()
            com.bykv.vk.openvk.component.video.api.zp.lMd r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            java.lang.String r1 = r1.zp()
            com.bytedance.sdk.openadsdk.core.video.zp.lMd r11 = com.bytedance.sdk.openadsdk.core.model.woN.zp(r1, r15)
            java.lang.String r1 = "material_meta"
            r11.zp(r1, r15)
            java.lang.String r0 = "ad_slot"
            r11.zp(r0, r6)
            com.bytedance.sdk.openadsdk.component.reward.COT$5 r12 = new com.bytedance.sdk.openadsdk.component.reward.COT$5
            r0 = r12
            r1 = r13
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r16
            r6 = r17
            r7 = r14
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.video.jU.zp.zp(r11, r12)
            goto L96
        L95:
            r10 = r1
        L96:
            r1 = r10
            goto La4
        L98:
            if (r18 == 0) goto La4
        L9a:
            android.content.Context r0 = r8.lMd
            com.bytedance.sdk.openadsdk.component.reward.jU r0 = com.bytedance.sdk.openadsdk.component.reward.jU.zp(r0)
            r2 = r14
            r0.zp(r6, r14)
        La4:
            if (r1 == 0) goto Lad
            com.bytedance.sdk.openadsdk.component.reward.HWF r0 = r16.zp()
            r9.onAdLoaded(r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.COT.zp(com.bytedance.sdk.openadsdk.core.model.zp, com.bytedance.sdk.openadsdk.core.model.woN, com.bytedance.sdk.openadsdk.component.reward.rV, com.bytedance.sdk.openadsdk.AdSlot, boolean, com.bytedance.sdk.openadsdk.utils.cW, com.bytedance.sdk.openadsdk.component.reward.COT$zp, boolean):void");
    }

    public void zp(String str) {
        jU.zp(this.lMd).zp(str);
    }

    private void zp(lMd lmd) {
        if (lmd == null) {
            return;
        }
        if (this.jU.size() > 0) {
            this.jU.remove(0);
        }
        this.jU.add(lmd);
    }
}
