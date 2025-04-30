package com.bytedance.sdk.openadsdk.core.ugen.KS;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.core.dT;
import com.bytedance.adsdk.ugeno.core.rV;
import com.bytedance.adsdk.ugeno.core.tG;
import com.bytedance.sdk.component.adexpress.dynamic.jU;
import com.bytedance.sdk.component.adexpress.jU.HWF;
import com.bytedance.sdk.component.adexpress.lMd.QR;
import com.bytedance.sdk.component.adexpress.lMd.ku;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.tG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS implements rV, tG, jU, com.bytedance.sdk.component.adexpress.lMd.jU<View> {
    protected static int Bj = 8;
    private static float Gzh;
    private static float Lij;
    private static float RCv;
    private static float irS;
    private static long ox;
    protected zp COT;
    private float FP;
    protected FrameLayout HWF;
    protected com.bytedance.adsdk.ugeno.component.lMd<View> KS;
    private QR KVG;
    protected com.bytedance.sdk.component.adexpress.lMd.rV QR;
    protected com.bytedance.adsdk.ugeno.component.lMd YW;
    private float cz;
    private ku dQp;
    protected woN jU;
    protected Context lMd;
    private long ot;
    private float pvr;
    private JSONObject rV;
    protected WeakReference<View> vDp;
    private float vwr;
    private final boolean woN;
    private long yRU;
    protected dT zp;
    protected boolean dT = true;
    public SparseArray<KS.zp> tG = new SparseArray<>();
    private final com.bytedance.sdk.component.ku.ku QUv = new com.bytedance.sdk.component.ku.ku("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.ugen.KS.KS.1
        @Override // java.lang.Runnable
        public void run() {
            KS ks = KS.this;
            ks.rV = ks.COT.KS();
            com.bytedance.sdk.openadsdk.core.tG.KS().post(KS.this.cW);
        }
    };
    private final Runnable cW = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ugen.KS.KS.2
        @Override // java.lang.Runnable
        public void run() {
            if (KS.this.KVG != null) {
                KS ks = KS.this;
                ks.lMd(ks.KVG);
            }
        }
    };
    private boolean YhE = false;
    protected AtomicBoolean ku = new AtomicBoolean(false);

    public KS(Context context, woN won, boolean z8, zp zpVar, ViewGroup viewGroup) {
        this.lMd = context;
        this.woN = z8;
        this.zp = new dT(context);
        this.jU = won;
        this.COT = zpVar;
        this.HWF = new FrameLayout(context);
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    public View COT() {
        return this.HWF;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    public int KS() {
        return 7;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void a_() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void setSoundMute(boolean z8) {
        com.bytedance.adsdk.ugeno.component.lMd<View> lMd;
        com.bytedance.adsdk.ugeno.component.lMd<View> lmd = this.KS;
        if (lmd != null && (lMd = lmd.lMd(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) != null) {
            if (z8) {
                ((com.bytedance.adsdk.ugeno.component.image.lMd) lMd).COT("local://tt_reward_full_mute");
            } else {
                ((com.bytedance.adsdk.ugeno.component.image.lMd) lMd).COT("local://tt_reward_full_unmute");
            }
            lMd.lMd();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void setTimeUpdate(int i9) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(QR qr) {
        this.COT.Lij().zp();
        JSONObject RCv2 = this.COT.RCv();
        if (this.rV == null) {
            qr.zp(133, "ugen template is null");
            return;
        }
        if (RCv2 == null) {
            qr.zp(133, "ugen data is null");
            return;
        }
        this.zp.zp((tG) this);
        this.zp.zp((rV) this);
        this.KS = this.zp.zp(this.rV);
        this.COT.Lij().lMd();
        this.COT.Lij().KS();
        this.zp.lMd(RCv2);
        if (this.KS != null) {
            lMd lmd = new lMd();
            this.QR = lmd;
            lmd.zp(true);
            this.QR.zp(KS());
            setSoundMute(this.woN);
            com.bytedance.adsdk.ugeno.component.lMd<View> lMd = this.KS.lMd(MimeTypes.BASE_TYPE_VIDEO);
            this.YW = lMd;
            if (lMd != null && (lMd instanceof com.bytedance.sdk.openadsdk.core.ugen.component.video.zp)) {
                ((lMd) this.QR).zp((FrameLayout) ((com.bytedance.sdk.openadsdk.core.ugen.component.video.zp) lMd).pvr());
            }
            com.bytedance.adsdk.ugeno.component.lMd<View> lMd2 = this.KS.lMd("feedback");
            if (lMd2 != null && lMd2.YW() != null) {
                this.vDp = new WeakReference<>(lMd2.YW());
            }
            this.HWF.addView(this.KS.YW(), new FrameLayout.LayoutParams(this.KS.dQp(), this.KS.KVG()));
            float yRU = this.COT.yRU();
            float ox2 = this.COT.ox();
            float lMd3 = WNy.lMd(this.lMd, yRU);
            float lMd4 = WNy.lMd(this.lMd, ox2);
            if (ox2 <= 0.0f) {
                this.HWF.setLayoutParams(new FrameLayout.LayoutParams((int) lMd3, -2));
            } else {
                this.HWF.setLayoutParams(new FrameLayout.LayoutParams((int) lMd3, (int) lMd4));
            }
            if (ox2 > 0.0f && yRU > 0.0f) {
                this.QR.zp(yRU);
                this.QR.lMd(ox2);
            } else {
                this.HWF.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int KS = WNy.KS(this.lMd, this.HWF.getMeasuredWidth());
                int KS2 = WNy.KS(this.lMd, this.HWF.getMeasuredHeight());
                this.QR.zp(KS);
                this.QR.lMd(KS2);
            }
            if (this.ku.get()) {
                qr.zp(137, "ugen render timeout");
                return;
            } else {
                qr.zp(this.HWF, this.QR);
                return;
            }
        }
        qr.zp(138, "ugen render error");
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    public void zp(QR qr) {
        this.KVG = qr;
        QUv.lMd(this.QUv);
    }

    public void zp(boolean z8) {
        this.ku.set(z8);
    }

    public void zp(ku kuVar) {
        this.dQp = kuVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.tG
    public void zp(Bj bj, tG.lMd lmd, tG.zp zpVar) {
        if (bj == null) {
            return;
        }
        if (bj.lMd() == 1 || bj.lMd() == 4) {
            zp(bj);
        }
        if (bj.lMd() == 10) {
            zp(bj.KS());
        }
        if (lmd == null || bj.jU() == null) {
            return;
        }
        lmd.zp(bj.jU());
    }

    private void zp(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.component.lMd<View> lMd;
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(optString2) || (lMd = this.KS.lMd(optString2)) == null) {
            return;
        }
        if (TextUtils.equals(optString, "onShow")) {
            lMd.lMd(0);
        } else if (TextUtils.equals(optString, "onDismiss")) {
            lMd.lMd(8);
        }
    }

    private void zp(Bj bj) {
        String str;
        int i9 = 5;
        if (this.dQp == null) {
            return;
        }
        String optString = bj.KS().optString("type");
        optString.getClass();
        char c9 = 65535;
        switch (optString.hashCode()) {
            case -314498168:
                if (optString.equals("privacy")) {
                    c9 = 0;
                    break;
                }
                break;
            case -191501435:
                if (optString.equals("feedback")) {
                    c9 = 1;
                    break;
                }
                break;
            case 3363353:
                if (optString.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                    c9 = 2;
                    break;
                }
                break;
            case 3532159:
                if (optString.equals("skip")) {
                    c9 = 3;
                    break;
                }
                break;
            case 112202875:
                if (optString.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    c9 = 4;
                    break;
                }
                break;
            case 1820422063:
                if (optString.equals("creative")) {
                    c9 = 5;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                i9 = 7;
                break;
            case 1:
                i9 = 3;
                break;
            case 2:
                break;
            case 3:
                i9 = 6;
                break;
            case 4:
                i9 = 4;
                break;
            case 5:
                i9 = 2;
                break;
            default:
                i9 = 0;
                break;
        }
        com.bytedance.adsdk.ugeno.component.lMd zp = bj.zp();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.vDp;
        if (weakReference != null) {
            int[] zp2 = WNy.zp(weakReference.get());
            if (zp2 != null) {
                iArr = zp2;
            }
            int[] KS = WNy.KS(this.vDp.get());
            if (KS != null) {
                iArr2 = KS;
            }
        }
        tG.zp zp3 = new tG.zp().jU(this.vwr).KS(this.pvr).lMd(this.cz).zp(this.FP).lMd(this.ot).zp(this.yRU).KS(iArr[0]).jU(iArr[1]).COT(iArr2[0]).HWF(iArr2[1]).zp(this.tG).zp(this.dT);
        if (zp == null) {
            str = "";
        } else {
            str = zp.rV() + "_" + zp.tG();
        }
        this.dQp.zp(bj.zp().YW(), i9, zp3.zp(str).zp());
    }

    private void lMd(CharSequence charSequence, boolean z8, int i9, boolean z9) {
        View YW;
        com.bytedance.adsdk.ugeno.component.lMd<View> lMd = this.KS.lMd("skip");
        if (lMd == null || (YW = lMd.YW()) == null) {
            return;
        }
        int i10 = 0;
        if (!z8 && !z9) {
            i10 = 8;
        }
        YW.setVisibility(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.ugen.KS.KS.irS <= r2) goto L16;
     */
    @Override // com.bytedance.adsdk.ugeno.core.rV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp(com.bytedance.adsdk.ugeno.component.lMd r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ugen.KS.KS.zp(com.bytedance.adsdk.ugeno.component.lMd, android.view.MotionEvent):void");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void zp(CharSequence charSequence, int i9, int i10, boolean z8) {
        if (this.KS == null) {
            return;
        }
        boolean z9 = i9 == 1;
        zp(charSequence, z9, i10, z8);
        lMd(charSequence, z9, i10, z8);
    }

    private void zp(CharSequence charSequence, boolean z8, int i9, boolean z9) {
        int i10;
        com.bytedance.adsdk.ugeno.component.lMd<View> lMd = this.KS.lMd("countdown");
        if (lMd == null) {
            return;
        }
        View YW = lMd.YW();
        if (YW instanceof TextView) {
            try {
                i10 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.tG.zp("UGenRender", "parse duration exception", charSequence);
                i10 = 0;
            }
            if (!z9 && i10 > 0 && !this.YhE) {
                YW.setVisibility(0);
                if (!z8 && this.COT.zp() && HWF.lMd(this.COT.jU())) {
                    ((TextView) YW).setText(String.format(cz.zp(com.bytedance.sdk.component.adexpress.jU.zp(), "tt_reward_full_skip"), Integer.valueOf(i9)));
                    return;
                }
                if (!"open_ad".equals(this.COT.jU()) && this.COT.zp()) {
                    this.YhE = true;
                    YW.setVisibility(8);
                    return;
                } else {
                    ((TextView) YW).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            YW.setVisibility(8);
        }
    }
}
