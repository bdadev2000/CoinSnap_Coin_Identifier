package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.Ne;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.AlY;
import com.bytedance.sdk.openadsdk.core.GA.tN.YFl;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.aIu;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.utils.zB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m2.l;
import org.json.JSONObject;
import p5.c;
import r5.a;

/* loaded from: classes.dex */
public class wN {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile wN YFl;
    private final Context Sg;
    private com.bytedance.sdk.component.qsH.qsH wN;
    private final AtomicBoolean tN = new AtomicBoolean(false);
    private final List<tN> AlY = Collections.synchronizedList(new ArrayList());

    /* renamed from: vc, reason: collision with root package name */
    private final Ne.YFl f10613vc = new Ne.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.wN.7
        @Override // com.bytedance.sdk.component.utils.Ne.YFl
        public void YFl(Context context, Intent intent, boolean z10, int i10) {
            if (!z10) {
                return;
            }
            if (wN.this.wN == null) {
                wN wNVar = wN.this;
                wNVar.wN = new com.bytedance.sdk.openadsdk.component.reward.Sg("fsv net connect task", wNVar.AlY);
            }
            com.bytedance.sdk.component.utils.DSW.YFl().post(wN.this.wN);
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.wN$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements AlY.YFl<Object> {
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.YFl AlY;
        final /* synthetic */ pDU Sg;
        final /* synthetic */ boolean YFl;
        final /* synthetic */ AdSlot tN;

        /* renamed from: vc, reason: collision with root package name */
        final /* synthetic */ boolean f10616vc;
        final /* synthetic */ Sg wN;

        public AnonymousClass6(boolean z10, pDU pdu, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.YFl yFl, Sg sg2, boolean z11) {
            this.YFl = z10;
            this.Sg = pdu;
            this.tN = adSlot;
            this.AlY = yFl;
            this.wN = sg2;
            this.f10616vc = z11;
        }

        @Override // com.bytedance.sdk.openadsdk.component.reward.AlY.YFl
        public void YFl(boolean z10, Object obj) {
            if (z10) {
                this.Sg.Sg();
            }
            if (this.YFl) {
                if (z10) {
                    AlY.YFl(wN.this.Sg).YFl(this.tN, this.AlY);
                }
            } else {
                if (z10) {
                    if (this.wN != null) {
                        if (this.f10616vc || lG.AlY().qO() == 1) {
                            this.wN.onAdLoaded(this.Sg.YFl());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.wN != null) {
                    if (this.f10616vc || lG.AlY().qO() == 1) {
                        this.wN.onError(-1, "");
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Sg implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.YFl AlY;
        private final AtomicBoolean Sg;
        private final PAGInterstitialAdLoadListener YFl;
        private final AtomicInteger tN;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
        public void onError(int i10, String str) {
            if (this.tN.decrementAndGet() <= 0 && this.Sg.compareAndSet(false, true)) {
                this.YFl.onError(i10, str);
                com.bytedance.sdk.openadsdk.pDU.tN.YFl("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.wN.Sg.1
                    @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                    @Nullable
                    public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("req_id", Sg.this.AlY.YFl());
                        return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("choose_ad_load_error").Sg(jSONObject.toString());
                    }
                });
            }
        }

        private Sg(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
            this.Sg = new AtomicBoolean(false);
            this.YFl = pAGInterstitialAdLoadListener;
            this.AlY = yFl;
            this.tN = new AtomicInteger(YFl());
        }

        private int YFl() {
            if (!this.AlY.AlY()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.AlY.tN().size(); i11++) {
                Wwa wwa = this.AlY.tN().get(i11);
                if (wwa != null && !com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(wwa) && wwa.BPI() != null) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.tN.decrementAndGet();
            if (this.YFl == null || !this.Sg.compareAndSet(false, true)) {
                return;
            }
            this.YFl.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements PAGInterstitialAdLoadListener {
        private final PAGInterstitialAdLoadListener AlY;
        private final AdSlot Sg;
        private final Context YFl;
        private final com.bytedance.sdk.openadsdk.core.model.YFl tN;
        private final boolean wN;

        public YFl(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.YFl yFl, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z10) {
            this.YFl = context;
            this.Sg = adSlot;
            this.tN = yFl;
            this.AlY = pAGInterstitialAdLoadListener;
            this.wN = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            wN.YFl(this.YFl).YFl(this.Sg, this.tN, this.AlY, pAGInterstitialAd, this.wN);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
        public void onError(int i10, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.AlY;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i10, str);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class tN extends com.bytedance.sdk.component.qsH.qsH {
        final AdSlot Sg;
        final Wwa YFl;
        final com.bytedance.sdk.openadsdk.core.model.YFl tN;

        /* renamed from: com.bytedance.sdk.openadsdk.component.reward.wN$tN$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements AlY.YFl<Object> {
            public AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.AlY.YFl
            public void YFl(boolean z10, Object obj) {
                if (z10) {
                    AlY YFl = AlY.YFl(lG.YFl());
                    tN tNVar = tN.this;
                    YFl.YFl(tNVar.Sg, tNVar.tN);
                }
            }
        }

        public tN(Wwa wwa, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
            super("Fullscreen Task");
            this.YFl = wwa;
            this.Sg = adSlot;
            this.tN = yFl;
        }

        @Override // java.lang.Runnable
        public void run() {
            Wwa wwa = this.YFl;
            if (wwa != null && wwa.BPI() != null) {
                com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl = Wwa.YFl(((l) CacheDirFactory.getICacheDir(this.YFl.dBO())).d(), this.YFl);
                YFl.YFl("material_meta", this.YFl);
                YFl.YFl("ad_slot", this.Sg);
                com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(YFl, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.wN.tN.1
                    @Override // r5.b
                    public void YFl(c cVar, int i10, String str) {
                    }

                    @Override // r5.b
                    public void YFl(c cVar, int i10) {
                        AlY YFl2 = AlY.YFl(lG.YFl());
                        tN tNVar = tN.this;
                        YFl2.YFl(tNVar.Sg, tNVar.tN);
                    }
                });
            }
        }
    }

    private wN(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = lG.YFl();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.Sg = applicationContext;
        tN();
    }

    private void AlY() {
        if (!this.tN.get()) {
            return;
        }
        this.tN.set(false);
        try {
            Ne.YFl(this.f10613vc);
        } catch (Exception unused) {
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.wN != null) {
            try {
                com.bytedance.sdk.component.utils.DSW.YFl().removeCallbacks(this.wN);
            } catch (Exception unused) {
            }
            this.wN = null;
        }
        AlY();
    }

    private void Sg(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        zB YFl2 = zB.YFl();
        if (TextUtils.isEmpty(adSlot.getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.model.YFl YFl3 = AlY.YFl(this.Sg).YFl(adSlot.getCodeId(), true);
            if (YFl3 != null && YFl3.AlY()) {
                pDU pdu = new pDU(this.Sg, YFl3);
                if (!YFl3.vc() && !com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(YFl3.wN())) {
                    pdu.Sg();
                }
                if (pAGInterstitialAdLoadListener != null) {
                    if (!YFl3.vc() && lG.AlY().qO() == 0) {
                        YFl(adSlot, YFl3, pAGInterstitialAdLoadListener, pdu.YFl(), true);
                    }
                    Sg sg2 = new Sg(new YFl(this.Sg, adSlot, YFl3, pAGInterstitialAdLoadListener, true), YFl3);
                    for (int i10 = 0; i10 < YFl3.tN().size(); i10++) {
                        YFl(YFl3.tN().get(i10), adSlot, sg2, YFl2, pdu, YFl3.vc());
                        if (YFl3.eT()) {
                            break;
                        }
                    }
                }
                for (int i11 = 0; i11 < YFl3.tN().size(); i11++) {
                    com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(YFl3.tN().get(i11), new YFl.InterfaceC0115YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.wN.1
                    });
                }
                return;
            }
        }
        YFl(adSlot, false, YFl2, pAGInterstitialAdLoadListener);
    }

    private void tN() {
        if (this.tN.get()) {
            return;
        }
        this.tN.set(true);
        Ne.YFl(this.f10613vc, this.Sg);
    }

    public static wN YFl(Context context) {
        if (YFl == null) {
            synchronized (wN.class) {
                if (YFl == null) {
                    YFl = new wN(context);
                }
            }
        }
        return YFl;
    }

    public void YFl() {
        try {
            AlY.YFl(this.Sg).YFl();
        } catch (Throwable unused) {
        }
    }

    public void YFl(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm()) || AlY.YFl(this.Sg).YFl(adSlot.getCodeId(), false) != null) {
            return;
        }
        YFl(adSlot, true, zB.YFl(), null);
    }

    public void YFl(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        Sg(adSlot, pAGInterstitialAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.YFl yFl, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, boolean z10) {
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
        int Sg2 = Sg();
        if (!z10) {
            if (Sg2 == 2) {
                AlY.YFl(this.Sg).YFl(adSlot, yFl);
                Sg(adSlot);
                return;
            }
            return;
        }
        if (Sg2 == 2) {
            Sg(adSlot);
        } else if (Sg2 == 1) {
            AlY.YFl(this.Sg).YFl(adSlot.getCodeId(), (Wwa) null);
        }
    }

    private void Sg(AdSlot adSlot) {
        if (Sg() != 2) {
            return;
        }
        AlY.YFl(this.Sg).YFl(adSlot.getCodeId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.lG.AlY().qO() != 1) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa r3, com.bytedance.sdk.openadsdk.AdSlot r4, final com.bytedance.sdk.openadsdk.component.reward.wN.Sg r5, com.bytedance.sdk.openadsdk.utils.zB r6, final com.bytedance.sdk.openadsdk.component.reward.pDU r7, final boolean r8) {
        /*
            r2 = this;
            r6 = 0
            if (r5 == 0) goto L11
            r0 = 1
            if (r8 != 0) goto L12
            com.bytedance.sdk.openadsdk.core.settings.vc r1 = com.bytedance.sdk.openadsdk.core.lG.AlY()
            int r1 = r1.qO()
            if (r1 != r0) goto L11
            goto L12
        L11:
            r0 = r6
        L12:
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(r3)
            if (r1 != 0) goto L46
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.Wwa.wN(r3)
            if (r1 == 0) goto L46
            r3.BPI()
            int r0 = r3.dBO()
            o5.a r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            m2.l r0 = (m2.l) r0
            java.lang.String r0 = r0.d()
            com.bytedance.sdk.openadsdk.core.GA.YFl.Sg r0 = com.bytedance.sdk.openadsdk.core.model.Wwa.YFl(r0, r3)
            java.lang.String r1 = "material_meta"
            r0.YFl(r1, r3)
            java.lang.String r3 = "ad_slot"
            r0.YFl(r3, r4)
            com.bytedance.sdk.openadsdk.component.reward.wN$2 r3 = new com.bytedance.sdk.openadsdk.component.reward.wN$2
            r3.<init>()
            com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(r0, r3)
            goto L47
        L46:
            r6 = r0
        L47:
            if (r6 == 0) goto L50
            com.bytedance.sdk.openadsdk.component.reward.vc r3 = r7.YFl()
            r5.onAdLoaded(r3)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.wN.YFl(com.bytedance.sdk.openadsdk.core.model.Wwa, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.wN$Sg, com.bytedance.sdk.openadsdk.utils.zB, com.bytedance.sdk.openadsdk.component.reward.pDU, boolean):void");
    }

    public static int Sg() {
        return com.bytedance.sdk.openadsdk.aIu.YFl.YFl("ivrv_load_ad_cache_strategy", 0);
    }

    private void YFl(final AdSlot adSlot, final boolean z10, final zB zBVar, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        aIu aiu = new aIu();
        aiu.tN = z10 ? 2 : 1;
        if (lG.AlY().YoT(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            aiu.qsH = 2;
        }
        lG.tN().YFl(adSlot, aiu, 8, new qO.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.wN.3
            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(int i10, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
                if (z10 || (pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener) == null) {
                    return;
                }
                pAGInterstitialAdLoadListener2.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl, com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
                if (yFl.tN() != null && !yFl.tN().isEmpty()) {
                    pDU pdu = new pDU(wN.this.Sg, yFl);
                    if (!z10) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.pDU.tN.YFl(yFl.wN(), System.currentTimeMillis() - currentTimeMillis);
                        }
                        if (!yFl.vc() && pAGInterstitialAdLoadListener != null && lG.AlY().qO() == 0) {
                            wN.this.YFl(adSlot, yFl, pAGInterstitialAdLoadListener, pdu.YFl(), false);
                        }
                    }
                    Sg sg3 = new Sg(new YFl(wN.this.Sg, adSlot, yFl, pAGInterstitialAdLoadListener, false), yFl);
                    for (int i10 = 0; i10 < yFl.tN().size(); i10++) {
                        wN.this.YFl(yFl, yFl.tN().get(i10), pdu, adSlot, z10, zBVar, sg3, yFl.vc());
                        if (yFl.eT()) {
                            return;
                        }
                    }
                    return;
                }
                if (z10 || (pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener) == null) {
                    return;
                }
                pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.qsH.YFl(-3));
                sg2.YFl(-3);
                com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final com.bytedance.sdk.openadsdk.core.model.YFl yFl, Wwa wwa, final pDU pdu, final AdSlot adSlot, final boolean z10, zB zBVar, final Sg sg2, final boolean z11) {
        com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(wwa, new YFl.InterfaceC0115YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.wN.4
        });
        boolean z12 = true;
        if (z10 && !com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(wwa) && Wwa.wN(wwa) && lG.AlY().Ga(adSlot.getCodeId()).AlY == 1 && !com.bytedance.sdk.component.utils.EH.AlY(this.Sg)) {
            YFl(new tN(wwa, adSlot, yFl));
            return;
        }
        boolean z13 = false;
        if (sg2 == null || (!z11 && lG.AlY().qO() != 1)) {
            z12 = false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(wwa)) {
            if (z10) {
                AlY.YFl(this.Sg).YFl(adSlot, yFl);
            }
        } else if (Wwa.wN(wwa)) {
            if (wwa.BPI() != null) {
                com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl2 = Wwa.YFl(((l) CacheDirFactory.getICacheDir(wwa.dBO())).d(), wwa);
                YFl2.YFl("material_meta", wwa);
                YFl2.YFl("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(YFl2, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.wN.5
                    @Override // r5.b
                    public void YFl(c cVar, int i10) {
                        pdu.Sg();
                        if (z10) {
                            AlY.YFl(wN.this.Sg).YFl(adSlot, yFl);
                        } else if (sg2 != null) {
                            if (z11 || lG.AlY().qO() == 1) {
                                sg2.onAdLoaded(pdu.YFl());
                            }
                        }
                    }

                    @Override // r5.b
                    public void YFl(c cVar, int i10, String str) {
                        if (sg2 != null) {
                            if (z11 || lG.AlY().qO() == 1) {
                                sg2.onError(i10, str);
                            }
                        }
                    }
                });
            } else {
                z13 = z12;
            }
            z12 = z13;
        } else if (z10) {
            AlY.YFl(this.Sg).YFl(adSlot, yFl);
        }
        if (z12) {
            sg2.onAdLoaded(pdu.YFl());
        }
    }

    private void YFl(tN tNVar) {
        if (tNVar == null) {
            return;
        }
        if (this.AlY.size() > 0) {
            this.AlY.remove(0);
        }
        this.AlY.add(tNVar);
    }

    public void YFl(String str, Wwa wwa) {
        AlY.YFl(this.Sg).YFl(str, wwa);
    }
}
