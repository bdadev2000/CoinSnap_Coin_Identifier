package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.yRU;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.Bj;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.pvr;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.video.lMd.zp;
import com.bytedance.sdk.openadsdk.core.woN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vDp {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile vDp zp;
    private com.bytedance.sdk.component.ku.ku COT;
    private final Context lMd;
    private final AtomicBoolean KS = new AtomicBoolean(false);
    private final List<lMd> jU = Collections.synchronizedList(new ArrayList());
    private final yRU.zp HWF = new yRU.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.vDp.7
        @Override // com.bytedance.sdk.component.utils.yRU.zp
        public void zp(Context context, Intent intent, boolean z8, int i9) {
            if (!z8) {
                return;
            }
            if (vDp.this.COT == null) {
                vDp vdp = vDp.this;
                vdp.COT = new com.bytedance.sdk.openadsdk.component.reward.lMd("net connect task", vdp.jU);
            }
            com.bytedance.sdk.component.utils.ku.zp().post(vDp.this.COT);
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.vDp$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements Bj.zp<Object> {
        final /* synthetic */ AdSlot COT;
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.zp HWF;
        final /* synthetic */ zp KS;
        final /* synthetic */ boolean jU;
        final /* synthetic */ dQp lMd;
        final /* synthetic */ boolean zp;

        public AnonymousClass6(boolean z8, dQp dqp, zp zpVar, boolean z9, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zp zpVar2) {
            this.zp = z8;
            this.lMd = dqp;
            this.KS = zpVar;
            this.jU = z9;
            this.COT = adSlot;
            this.HWF = zpVar2;
        }

        @Override // com.bytedance.sdk.openadsdk.component.reward.Bj.zp
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
                Bj.zp(vDp.this.lMd).zp(this.COT, this.HWF);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class lMd extends com.bytedance.sdk.component.ku.ku {
        com.bytedance.sdk.openadsdk.core.model.zp KS;
        AdSlot lMd;
        woN zp;

        /* renamed from: com.bytedance.sdk.openadsdk.component.reward.vDp$lMd$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements Bj.zp<Object> {
            public AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.Bj.zp
            public void zp(boolean z8, Object obj) {
                if (z8) {
                    Bj zp = Bj.zp(KVG.zp());
                    lMd lmd = lMd.this;
                    zp.zp(lmd.lMd, lmd.KS);
                }
            }
        }

        public lMd(woN won, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zp zpVar) {
            super("Reward Task");
            this.zp = won;
            this.lMd = adSlot;
            this.KS = zpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            woN won = this.zp;
            if (won != null && won.eWG() != null) {
                com.bytedance.sdk.openadsdk.core.video.zp.lMd zp = woN.zp(CacheDirFactory.getICacheDir(this.zp.jyq()).zp(), this.zp);
                zp.zp("material_meta", this.zp);
                zp.zp("ad_slot", this.lMd);
                com.bytedance.sdk.openadsdk.core.video.jU.zp.zp(zp, new com.bykv.vk.openvk.component.video.api.COT.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.vDp.lMd.1
                    @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
                    public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks, int i9, String str) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
                    public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks, int i9) {
                        Bj zp2 = Bj.zp(KVG.zp());
                        lMd lmd = lMd.this;
                        zp2.zp(lmd.lMd, lmd.KS);
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    public static class zp implements PAGRewardedAdLoadListener {
        private final AtomicInteger KS;
        private final com.bytedance.sdk.openadsdk.core.model.zp jU;
        private final AtomicBoolean lMd;
        private final com.bytedance.sdk.openadsdk.common.KS zp;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
        public void onError(int i9, String str) {
            if (this.KS.decrementAndGet() <= 0 && (this.zp instanceof PAGRewardedAdLoadListener) && this.lMd.compareAndSet(false, true)) {
                this.zp.onError(i9, str);
                com.bytedance.sdk.openadsdk.dT.KS.zp("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.vDp.zp.1
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
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.KS.decrementAndGet();
            if ((this.zp instanceof PAGRewardedAdLoadListener) && this.lMd.compareAndSet(false, true)) {
                ((PAGRewardedAdLoadListener) this.zp).onAdLoaded(pAGRewardedAd);
            }
        }
    }

    private vDp(Context context) {
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
            zp(adSlot, true, null);
        }
    }

    private void lMd(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.KS ks) {
        com.bytedance.sdk.openadsdk.core.model.zp lMd2;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (lMd2 = Bj.zp(this.lMd).lMd(adSlot.getCodeId())) != null && lMd2.jU()) {
            dQp dqp = new dQp(this.lMd, lMd2, adSlot);
            if (!lMd2.HWF() && !cz.Bj(lMd2.COT())) {
                dqp.lMd();
            }
            if (ks != null) {
                if (!lMd2.HWF() && (ks instanceof PAGRewardedAdLoadListener) && KVG.jU().cz() == 0) {
                    ((PAGRewardedAdLoadListener) ks).onAdLoaded(dqp.zp());
                }
                zp zpVar = new zp(ks, lMd2);
                for (int i9 = 0; i9 < lMd2.KS().size(); i9++) {
                    zp(lMd2.KS().get(i9), adSlot, zpVar, dqp, lMd2.HWF());
                }
            }
            for (int i10 = 0; i10 < lMd2.KS().size(); i10++) {
                com.bytedance.sdk.openadsdk.core.video.lMd.zp.zp().zp(lMd2.KS().get(i10), new zp.InterfaceC0118zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.vDp.1
                });
            }
            return;
        }
        zp(adSlot, false, ks);
    }

    public static vDp zp(Context context) {
        if (zp == null) {
            synchronized (vDp.class) {
                try {
                    if (zp == null) {
                        zp = new vDp(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public void zp(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || Bj.zp(this.lMd).lMd(adSlot.getCodeId()) != null) {
            return;
        }
        lMd(adSlot);
    }

    public void zp() {
        try {
            Bj.zp(this.lMd).zp();
        } catch (Throwable unused) {
        }
    }

    public void zp(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.KS ks) {
        lMd(adSlot, ks);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.KVG.jU().cz() != 1) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(com.bytedance.sdk.openadsdk.core.model.woN r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.vDp.zp r6, final com.bytedance.sdk.openadsdk.component.reward.dQp r7, final boolean r8) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L11
            r1 = 1
            if (r8 != 0) goto L12
            com.bytedance.sdk.openadsdk.core.settings.COT r2 = com.bytedance.sdk.openadsdk.core.KVG.jU()
            int r2 = r2.cz()
            if (r2 != r1) goto L11
            goto L12
        L11:
            r1 = r0
        L12:
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.cz.Bj(r4)
            if (r2 != 0) goto L3b
            int r1 = r4.jyq()
            com.bykv.vk.openvk.component.video.api.zp.lMd r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            java.lang.String r1 = r1.zp()
            com.bytedance.sdk.openadsdk.core.video.zp.lMd r1 = com.bytedance.sdk.openadsdk.core.model.woN.zp(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.zp(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.zp(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.vDp$2 r4 = new com.bytedance.sdk.openadsdk.component.reward.vDp$2
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.video.jU.zp.zp(r1, r4)
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L45
            com.bytedance.sdk.openadsdk.component.reward.ku r4 = r7.zp()
            r6.onAdLoaded(r4)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vDp.zp(com.bytedance.sdk.openadsdk.core.model.woN, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.vDp$zp, com.bytedance.sdk.openadsdk.component.reward.dQp, boolean):void");
    }

    private void lMd() {
        if (this.KS.get()) {
            return;
        }
        this.KS.set(true);
        yRU.zp(this.HWF, this.lMd);
    }

    private void zp(final AdSlot adSlot, final boolean z8, final com.bytedance.sdk.openadsdk.common.KS ks) {
        if (com.bytedance.sdk.component.utils.tG.jU()) {
            com.bykv.vk.openvk.component.video.api.HWF.lMd.zp(adSlot.getBidAdm());
        }
        final long currentTimeMillis = System.currentTimeMillis();
        pvr pvrVar = new pvr();
        pvrVar.lMd = z8 ? 2 : 1;
        if (KVG.jU().Bj(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            pvrVar.ku = 2;
        }
        KVG.KS().zp(adSlot, pvrVar, 7, new woN.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.vDp.3
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
                    dQp dqp = new dQp(vDp.this.lMd, zpVar, adSlot);
                    if (!z8) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.dT.KS.zp(zpVar.COT(), System.currentTimeMillis() - currentTimeMillis);
                        }
                        if (!zpVar.HWF() && (ks instanceof PAGRewardedAdLoadListener) && KVG.jU().cz() == 0) {
                            ((PAGRewardedAdLoadListener) ks).onAdLoaded(dqp.zp());
                        }
                    }
                    zp zpVar2 = new zp(ks, zpVar);
                    for (int i9 = 0; i9 < zpVar.KS().size(); i9++) {
                        vDp.this.zp(zpVar, zpVar.KS().get(i9), dqp, adSlot, z8, zpVar2, zpVar.HWF());
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

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final com.bytedance.sdk.openadsdk.core.model.zp zpVar, com.bytedance.sdk.openadsdk.core.model.woN won, final dQp dqp, final AdSlot adSlot, final boolean z8, final zp zpVar2, final boolean z9) {
        com.bytedance.sdk.openadsdk.core.video.lMd.zp.zp().zp(won, new zp.InterfaceC0118zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.vDp.4
        });
        boolean z10 = true;
        if (z8 && !cz.Bj(won) && KVG.jU().Gzh(adSlot.getCodeId()).jU == 1 && !com.bytedance.sdk.component.utils.KVG.jU(this.lMd)) {
            zp(new lMd(won, adSlot, zpVar));
            return;
        }
        boolean z11 = false;
        if (zpVar2 == null || (!z9 && KVG.jU().cz() != 1)) {
            z10 = false;
        }
        if (!cz.Bj(won)) {
            if (won.eWG() != null) {
                com.bytedance.sdk.openadsdk.core.video.zp.lMd zp2 = com.bytedance.sdk.openadsdk.core.model.woN.zp(CacheDirFactory.getICacheDir(won.jyq()).zp(), won);
                zp2.zp("material_meta", won);
                zp2.zp("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.video.jU.zp.zp(zp2, new com.bykv.vk.openvk.component.video.api.COT.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.vDp.5
                    @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
                    public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks, int i9) {
                        dqp.lMd();
                        if (z8) {
                            Bj.zp(vDp.this.lMd).zp(adSlot, zpVar);
                        } else if (zpVar2 != null) {
                            if (z9 || KVG.jU().cz() == 1) {
                                zpVar2.onAdLoaded(dqp.zp());
                            }
                        }
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
                    public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks, int i9, String str) {
                        if (zpVar2 != null) {
                            if (z9 || KVG.jU().cz() == 1) {
                                zpVar2.onError(i9, str);
                            }
                        }
                    }
                });
            } else {
                z11 = z10;
            }
            z10 = z11;
        } else {
            Bj.zp(this.lMd).zp(adSlot, zpVar);
        }
        if (z10) {
            zpVar2.onAdLoaded(dqp.zp());
        }
    }

    public void zp(String str) {
        Bj.zp(this.lMd).zp(str);
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
