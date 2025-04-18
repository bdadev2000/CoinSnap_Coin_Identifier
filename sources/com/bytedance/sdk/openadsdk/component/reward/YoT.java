package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.Ne;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.eT;
import com.bytedance.sdk.openadsdk.core.GA.tN.YFl;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.aIu;
import com.bytedance.sdk.openadsdk.core.qO;
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
public class YoT {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile YoT YFl;
    private final Context Sg;
    private com.bytedance.sdk.component.qsH.qsH wN;
    private final AtomicBoolean tN = new AtomicBoolean(false);
    private final List<Sg> AlY = Collections.synchronizedList(new ArrayList());

    /* renamed from: vc, reason: collision with root package name */
    private final Ne.YFl f10600vc = new Ne.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YoT.7
        @Override // com.bytedance.sdk.component.utils.Ne.YFl
        public void YFl(Context context, Intent intent, boolean z10, int i10) {
            if (!z10) {
                return;
            }
            if (YoT.this.wN == null) {
                YoT yoT = YoT.this;
                yoT.wN = new com.bytedance.sdk.openadsdk.component.reward.Sg("net connect task", yoT.AlY);
            }
            com.bytedance.sdk.component.utils.DSW.YFl().post(YoT.this.wN);
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.YoT$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements eT.YFl<Object> {
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.YFl AlY;
        final /* synthetic */ EH Sg;
        final /* synthetic */ boolean YFl;
        final /* synthetic */ AdSlot tN;

        /* renamed from: vc, reason: collision with root package name */
        final /* synthetic */ boolean f10602vc;
        final /* synthetic */ tN wN;

        public AnonymousClass6(boolean z10, EH eh2, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.YFl yFl, tN tNVar, boolean z11) {
            this.YFl = z10;
            this.Sg = eh2;
            this.tN = adSlot;
            this.AlY = yFl;
            this.wN = tNVar;
            this.f10602vc = z11;
        }

        @Override // com.bytedance.sdk.openadsdk.component.reward.eT.YFl
        public void YFl(boolean z10, Object obj) {
            if (z10) {
                this.Sg.Sg();
            }
            if (this.YFl) {
                if (z10) {
                    eT.YFl(YoT.this.Sg).YFl(this.tN, this.AlY);
                }
            } else {
                if (z10) {
                    if (this.wN != null) {
                        if (this.f10602vc || lG.AlY().qO() == 1) {
                            this.wN.onAdLoaded(this.Sg.YFl());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.wN != null) {
                    if (this.f10602vc || lG.AlY().qO() == 1) {
                        this.wN.onError(-1, "");
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Sg extends com.bytedance.sdk.component.qsH.qsH {
        final AdSlot Sg;
        final Wwa YFl;
        final com.bytedance.sdk.openadsdk.core.model.YFl tN;

        /* renamed from: com.bytedance.sdk.openadsdk.component.reward.YoT$Sg$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements eT.YFl<Object> {
            public AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.eT.YFl
            public void YFl(boolean z10, Object obj) {
                if (z10) {
                    eT YFl = eT.YFl(lG.YFl());
                    Sg sg2 = Sg.this;
                    YFl.YFl(sg2.Sg, sg2.tN);
                }
            }
        }

        public Sg(Wwa wwa, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
            super("Reward Task");
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
                com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(YFl, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.YoT.Sg.1
                    @Override // r5.b
                    public void YFl(c cVar, int i10, String str) {
                    }

                    @Override // r5.b
                    public void YFl(c cVar, int i10) {
                        eT YFl2 = eT.YFl(lG.YFl());
                        Sg sg2 = Sg.this;
                        YFl2.YFl(sg2.Sg, sg2.tN);
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements PAGRewardedAdLoadListener {
        private final PAGRewardedAdLoadListener AlY;
        private final AdSlot Sg;
        private final Context YFl;
        private final com.bytedance.sdk.openadsdk.core.model.YFl tN;
        private final boolean wN;

        public YFl(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.YFl yFl, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z10) {
            this.YFl = context;
            this.Sg = adSlot;
            this.tN = yFl;
            this.AlY = pAGRewardedAdLoadListener;
            this.wN = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            YoT.YFl(this.YFl).YFl(this.Sg, this.tN, this.AlY, pAGRewardedAd, this.wN);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
        public void onError(int i10, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.AlY;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i10, str);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class tN implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.YFl AlY;
        private final AtomicBoolean Sg;
        private final PAGRewardedAdLoadListener YFl;
        private final AtomicInteger tN;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
        public void onError(int i10, String str) {
            if (this.tN.decrementAndGet() <= 0 && this.YFl != null && this.Sg.compareAndSet(false, true)) {
                this.YFl.onError(i10, str);
                com.bytedance.sdk.openadsdk.pDU.tN.YFl("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.YoT.tN.1
                    @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                    @Nullable
                    public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("req_id", tN.this.AlY.YFl());
                        return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("choose_ad_load_error").Sg(jSONObject.toString());
                    }
                });
            }
        }

        private tN(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
            this.Sg = new AtomicBoolean(false);
            this.YFl = pAGRewardedAdLoadListener;
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
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.tN.decrementAndGet();
            if (this.YFl == null || !this.Sg.compareAndSet(false, true)) {
                return;
            }
            this.YFl.onAdLoaded(pAGRewardedAd);
        }
    }

    private YoT(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = lG.YFl();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.Sg = applicationContext;
        Sg();
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
        tN();
    }

    private void Sg(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (TextUtils.isEmpty(adSlot.getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.model.YFl YFl2 = eT.YFl(this.Sg).YFl(adSlot.getCodeId(), true);
            if (YFl2 != null && YFl2.AlY()) {
                EH eh2 = new EH(this.Sg, YFl2, adSlot);
                if (!YFl2.vc() && !com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(YFl2.wN())) {
                    eh2.Sg();
                }
                if (pAGRewardedAdLoadListener != null) {
                    if (!YFl2.vc() && lG.AlY().qO() == 0) {
                        YFl(adSlot, YFl2, pAGRewardedAdLoadListener, (PAGRewardedAd) eh2.YFl(), true);
                    }
                    tN tNVar = new tN(new YFl(this.Sg, adSlot, YFl2, pAGRewardedAdLoadListener, true), YFl2);
                    for (int i10 = 0; i10 < YFl2.tN().size(); i10++) {
                        YFl(YFl2.tN().get(i10), adSlot, tNVar, eh2, YFl2.vc());
                        if (YFl2.eT()) {
                            break;
                        }
                    }
                }
                for (int i11 = 0; i11 < YFl2.tN().size(); i11++) {
                    com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(YFl2.tN().get(i11), new YFl.InterfaceC0115YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YoT.1
                    });
                }
                return;
            }
        }
        YFl(adSlot, false, pAGRewardedAdLoadListener);
    }

    private void tN() {
        if (this.tN.get()) {
            this.tN.set(false);
            try {
                Ne.YFl(this.f10600vc);
            } catch (Exception unused) {
            }
        }
    }

    public static YoT YFl(Context context) {
        if (YFl == null) {
            synchronized (YoT.class) {
                if (YFl == null) {
                    YFl = new YoT(context);
                }
            }
        }
        return YFl;
    }

    public void YFl(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm()) || eT.YFl(this.Sg).YFl(adSlot.getCodeId(), false) != null) {
            return;
        }
        YFl(adSlot, true, null);
    }

    public void YFl(String str, Wwa wwa) {
        eT.YFl(this.Sg).YFl(str, wwa);
    }

    public void YFl() {
        try {
            eT.YFl(this.Sg).YFl();
        } catch (Throwable unused) {
        }
    }

    public void YFl(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        Sg(adSlot, pAGRewardedAdLoadListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.lG.AlY().qO() != 1) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.YoT.tN r6, final com.bytedance.sdk.openadsdk.component.reward.EH r7, final boolean r8) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L11
            r1 = 1
            if (r8 != 0) goto L12
            com.bytedance.sdk.openadsdk.core.settings.vc r2 = com.bytedance.sdk.openadsdk.core.lG.AlY()
            int r2 = r2.qO()
            if (r2 != r1) goto L11
            goto L12
        L11:
            r1 = r0
        L12:
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(r4)
            if (r2 != 0) goto L3d
            int r1 = r4.dBO()
            o5.a r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            m2.l r1 = (m2.l) r1
            java.lang.String r1 = r1.d()
            com.bytedance.sdk.openadsdk.core.GA.YFl.Sg r1 = com.bytedance.sdk.openadsdk.core.model.Wwa.YFl(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.YFl(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.YFl(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.YoT$2 r4 = new com.bytedance.sdk.openadsdk.component.reward.YoT$2
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(r1, r4)
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 == 0) goto L47
            com.bytedance.sdk.openadsdk.component.reward.qsH r4 = r7.YFl()
            r6.onAdLoaded(r4)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.YoT.YFl(com.bytedance.sdk.openadsdk.core.model.Wwa, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.YoT$tN, com.bytedance.sdk.openadsdk.component.reward.EH, boolean):void");
    }

    private void Sg(AdSlot adSlot) {
        if (wN.Sg() != 2) {
            return;
        }
        eT.YFl(this.Sg).YFl(adSlot.getCodeId());
    }

    private void Sg() {
        if (this.tN.get()) {
            return;
        }
        this.tN.set(true);
        Ne.YFl(this.f10600vc, this.Sg);
    }

    private void YFl(final AdSlot adSlot, final boolean z10, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.YoT.AlY()) {
            m5.a.a(adSlot.getBidAdm());
        }
        final long currentTimeMillis = System.currentTimeMillis();
        aIu aiu = new aIu();
        aiu.Sg = z10 ? 2 : 1;
        if (lG.AlY().YoT(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            aiu.qsH = 2;
        }
        lG.tN().YFl(adSlot, aiu, 7, new qO.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YoT.3
            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(int i10, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
                if (z10 || (pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener) == null) {
                    return;
                }
                pAGRewardedAdLoadListener2.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl, com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
                if (yFl.tN() != null && !yFl.tN().isEmpty()) {
                    EH eh2 = new EH(YoT.this.Sg, yFl, adSlot);
                    if (!z10) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.pDU.tN.YFl(yFl.wN(), System.currentTimeMillis() - currentTimeMillis);
                        }
                        if (!yFl.vc() && pAGRewardedAdLoadListener != null && lG.AlY().qO() == 0) {
                            YoT.this.YFl(adSlot, yFl, pAGRewardedAdLoadListener, (PAGRewardedAd) eh2.YFl(), false);
                        }
                    }
                    tN tNVar = new tN(new YFl(YoT.this.Sg, adSlot, yFl, pAGRewardedAdLoadListener, false), yFl);
                    for (int i10 = 0; i10 < yFl.tN().size(); i10++) {
                        YoT.this.YFl(yFl, yFl.tN().get(i10), eh2, adSlot, z10, tNVar, yFl.vc());
                        if (yFl.eT()) {
                            return;
                        }
                    }
                    return;
                }
                if (z10 || (pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener) == null) {
                    return;
                }
                pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.qsH.YFl(-3));
                sg2.YFl(-3);
                com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final com.bytedance.sdk.openadsdk.core.model.YFl yFl, Wwa wwa, final EH eh2, final AdSlot adSlot, final boolean z10, final tN tNVar, final boolean z11) {
        com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(wwa, new YFl.InterfaceC0115YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YoT.4
        });
        boolean z12 = true;
        if (z10 && !com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(wwa) && lG.AlY().Ga(adSlot.getCodeId()).AlY == 1 && !com.bytedance.sdk.component.utils.EH.AlY(this.Sg)) {
            YFl(new Sg(wwa, adSlot, yFl));
            return;
        }
        boolean z13 = false;
        if (tNVar == null || (!z11 && lG.AlY().qO() != 1)) {
            z12 = false;
        }
        if (!com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(wwa)) {
            if (wwa.BPI() != null) {
                com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl2 = Wwa.YFl(((l) CacheDirFactory.getICacheDir(wwa.dBO())).d(), wwa);
                YFl2.YFl("material_meta", wwa);
                YFl2.YFl("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(YFl2, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.YoT.5
                    @Override // r5.b
                    public void YFl(c cVar, int i10) {
                        eh2.Sg();
                        if (z10) {
                            eT.YFl(YoT.this.Sg).YFl(adSlot, yFl);
                        } else if (tNVar != null) {
                            if (z11 || lG.AlY().qO() == 1) {
                                tNVar.onAdLoaded(eh2.YFl());
                            }
                        }
                    }

                    @Override // r5.b
                    public void YFl(c cVar, int i10, String str) {
                        if (tNVar != null) {
                            if (z11 || lG.AlY().qO() == 1) {
                                tNVar.onError(i10, str);
                            }
                        }
                    }
                });
            } else {
                z13 = z12;
            }
            z12 = z13;
        } else if (z10) {
            eT.YFl(this.Sg).YFl(adSlot, yFl);
        }
        if (z12) {
            tNVar.onAdLoaded(eh2.YFl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.YFl yFl, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, boolean z10) {
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
        int Sg2 = wN.Sg();
        if (!z10) {
            if (Sg2 == 2) {
                eT.YFl(this.Sg).YFl(adSlot, yFl);
                Sg(adSlot);
                return;
            }
            return;
        }
        if (Sg2 == 2) {
            Sg(adSlot);
        } else if (Sg2 == 1) {
            eT.YFl(this.Sg).YFl(adSlot.getCodeId(), (Wwa) null);
        }
    }

    private void YFl(Sg sg2) {
        if (sg2 == null) {
            return;
        }
        if (this.AlY.size() > 0) {
            this.AlY.remove(0);
        }
        this.AlY.add(sg2);
    }
}
