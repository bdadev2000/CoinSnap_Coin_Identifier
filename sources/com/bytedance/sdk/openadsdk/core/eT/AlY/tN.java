package com.bytedance.sdk.openadsdk.core.eT.AlY;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.AlY.Sg;
import com.bytedance.adsdk.ugeno.core.GA;
import com.bytedance.adsdk.ugeno.core.NjR;
import com.bytedance.adsdk.ugeno.core.YoT;
import com.bytedance.adsdk.ugeno.core.nc;
import com.bytedance.sdk.component.adexpress.Sg.DSW;
import com.bytedance.sdk.component.adexpress.Sg.pDU;
import com.bytedance.sdk.component.adexpress.Sg.qsH;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.pDU;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.core.widget.vc;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN implements GA, YoT, com.bytedance.sdk.component.adexpress.Sg.AlY<View>, com.bytedance.sdk.component.adexpress.dynamic.AlY {
    private static float Cfr = 0.0f;
    private static float Ga = 0.0f;
    private static long UZM = 0;
    private static float YI = 0.0f;
    private static float dXO = 0.0f;
    protected static int qO = 24;
    protected JSONObject AlY;
    protected FrameLayout DSW;
    protected float EH;
    protected float GA;
    protected JSONObject Ne;
    protected pDU NjR;
    protected Context Sg;
    private DSW VOe;
    protected NjR YFl;
    protected float YoT;
    protected WeakReference<View> aIu;
    private final boolean bZ;
    protected com.bytedance.adsdk.ugeno.Sg.Sg eT;
    private AlY hQ;
    protected long lG;
    private qO mn;
    protected float pDU;
    private String pq;
    protected qsH qsH;
    protected long rkt;
    protected com.bytedance.adsdk.ugeno.Sg.Sg<View> tN;

    /* renamed from: vc, reason: collision with root package name */
    protected YFl f10673vc;
    protected Wwa wN;
    protected boolean Wwa = true;
    public SparseArray<tN.YFl> wXo = new SparseArray<>();
    private String zB = "";
    private final com.bytedance.sdk.component.qsH.qsH Sco = new com.bytedance.sdk.component.qsH.qsH("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.eT.AlY.tN.1
        @Override // java.lang.Runnable
        public void run() {
            tN tNVar = tN.this;
            tNVar.AlY = tNVar.YFl();
            if (tN.this.mn == null) {
                tN.this.zB = "expressView is null";
            } else {
                tN tNVar2 = tN.this;
                tNVar2.zB = tNVar2.mn.getUgenTemplateErrorReason();
            }
            com.bytedance.sdk.openadsdk.core.pDU.tN().post(tN.this.GS);
        }
    };
    private final Runnable GS = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.eT.AlY.tN.2
        @Override // java.lang.Runnable
        public void run() {
            if (tN.this.VOe != null) {
                tN tNVar = tN.this;
                tNVar.Sg(tNVar.VOe);
            }
        }
    };
    private boolean lu = false;

    /* renamed from: nc, reason: collision with root package name */
    protected AtomicBoolean f10672nc = new AtomicBoolean(false);

    static {
        if (lG.YFl() != null) {
            qO = lG.Sg();
        }
    }

    public tN(Context context, Wwa wwa, boolean z10, YFl yFl, ViewGroup viewGroup) {
        this.Sg = context;
        this.bZ = z10;
        this.YFl = new NjR(context);
        this.wN = wwa;
        this.f10673vc = yFl;
        this.DSW = new FrameLayout(context);
        if (viewGroup instanceof qO) {
            this.mn = (qO) viewGroup;
        }
        this.pq = yFl.AlY();
        JSONObject Sg = Sg();
        this.Ne = Sg;
        this.hQ = new AlY(this.Sg, this.wN, this.pq, Sg);
    }

    private void vc() {
        com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg;
        com.bytedance.adsdk.ugeno.Sg.Sg<View> sg2 = this.tN;
        if (sg2 != null && (Sg = sg2.Sg("skip")) != null && (Sg instanceof com.bytedance.adsdk.ugeno.NjR.AlY.tN)) {
            if (!rkt.JwO().pDU(String.valueOf(this.wN.kU())) || this.wN.rkt() == 5 || this.wN.rkt() == 6 || this.wN.JGG() == 3) {
                ((com.bytedance.adsdk.ugeno.NjR.AlY.tN) Sg).wN("local://tt_close_btn");
                Sg.Sg();
            }
        }
    }

    public int AlY() {
        this.YFl.YFl((YoT) this);
        this.YFl.YFl((GA) this);
        com.bytedance.adsdk.ugeno.Sg.Sg<View> YFl = this.YFl.YFl(this.AlY);
        this.tN = YFl;
        AlY alY = this.hQ;
        if (alY != null && YFl != null) {
            alY.YFl(YFl);
        }
        this.f10673vc.Cfr().Sg();
        this.f10673vc.Cfr().tN();
        this.YFl.Sg(this.Ne);
        return 0;
    }

    @Override // com.bytedance.adsdk.ugeno.core.YoT
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, Sg.YFl yFl) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setSoundMute(boolean z10) {
        com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg;
        com.bytedance.adsdk.ugeno.Sg.Sg<View> sg2 = this.tN;
        if (sg2 != null && (Sg = sg2.Sg(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) != null) {
            if (z10) {
                ((com.bytedance.adsdk.ugeno.NjR.AlY.tN) Sg).wN("local://tt_reward_full_mute");
            } else {
                ((com.bytedance.adsdk.ugeno.NjR.AlY.tN) Sg).wN("local://tt_reward_full_unmute");
            }
            Sg.Sg();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        if (this.tN == null) {
            return;
        }
        boolean z11 = true;
        if (i10 != 1) {
            z11 = false;
        }
        YFl(charSequence, z11, i11, z10);
        Sg(charSequence, z11, i11, z10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setTimeUpdate(int i10) {
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    public View wN() {
        return this.DSW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(DSW dsw) {
        this.f10673vc.Cfr().YFl();
        if (this.AlY == null) {
            dsw.YFl(133, "ugen template is null real reason is " + this.zB);
            return;
        }
        if (this.Ne == null) {
            dsw.YFl(133, "ugen data is null");
            return;
        }
        int AlY = AlY();
        if (AlY != 0) {
            dsw.YFl(AlY, "ugen render fail");
            return;
        }
        if (this.tN != null) {
            Sg sg2 = new Sg();
            this.NjR = sg2;
            sg2.YFl(true);
            this.NjR.YFl(tN());
            setSoundMute(this.bZ);
            vc();
            com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg = this.tN.Sg(MimeTypes.BASE_TYPE_VIDEO);
            this.eT = Sg;
            if (Sg != null && (Sg instanceof com.bytedance.sdk.openadsdk.core.eT.Sg.YFl.Sg)) {
                ((Sg) this.NjR).YFl((FrameLayout) ((com.bytedance.sdk.openadsdk.core.eT.Sg.YFl.Sg) Sg).BPI());
            }
            com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg2 = this.tN.Sg("feedback");
            AlY alY = this.hQ;
            if (alY != null) {
                alY.YFl();
            }
            if (Sg2 != null && Sg2.NjR() != null) {
                this.aIu = new WeakReference<>(Sg2.NjR());
            }
            this.DSW.addView(this.tN.NjR(), new FrameLayout.LayoutParams(this.tN.pq(), this.tN.mn()));
            float YI2 = this.f10673vc.YI();
            float Ga2 = this.f10673vc.Ga();
            float tN = GS.tN(this.Sg, YI2);
            float tN2 = GS.tN(this.Sg, Ga2);
            if (tN() != 7) {
                this.DSW.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            } else if (Ga2 <= 0.0f) {
                this.DSW.setLayoutParams(new FrameLayout.LayoutParams((int) tN, -2));
            } else {
                this.DSW.setLayoutParams(new FrameLayout.LayoutParams((int) tN, (int) tN2));
            }
            if (Ga2 > 0.0f && YI2 > 0.0f) {
                this.NjR.YFl(YI2);
                this.NjR.Sg(Ga2);
            } else {
                this.DSW.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int AlY2 = GS.AlY(this.Sg, this.DSW.getMeasuredWidth());
                int AlY3 = GS.AlY(this.Sg, this.DSW.getMeasuredHeight());
                this.NjR.YFl(AlY2);
                this.NjR.Sg(AlY3);
            }
            if (this.f10672nc.get()) {
                dsw.YFl(137, "ugen render timeout");
                return;
            } else {
                dsw.YFl(this.DSW, this.NjR);
                return;
            }
        }
        dsw.YFl(138, "ugen render error");
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    public int tN() {
        return this.wN.UZM();
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    public void YFl(DSW dsw) {
        this.VOe = dsw;
        mn.Sg(this.Sco);
    }

    public JSONObject YFl() {
        return this.f10673vc.tN();
    }

    public void YFl(boolean z10) {
        this.f10672nc.set(z10);
    }

    public void YFl(qsH qsh) {
        this.qsH = qsh;
    }

    public void YFl(vc vcVar) {
        AlY alY = this.hQ;
        if (alY != null) {
            alY.YFl(vcVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.YoT
    public void YFl(nc ncVar, YoT.Sg sg2, YoT.YFl yFl) {
        if (ncVar == null) {
            return;
        }
        if (ncVar.Sg() == 1 || ncVar.Sg() == 4) {
            YFl(ncVar);
        }
        if (ncVar.Sg() == 10) {
            YFl(ncVar.tN());
        }
        if (sg2 == null || ncVar.AlY() == null) {
            return;
        }
        sg2.YFl(ncVar.AlY());
    }

    private void YFl(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg;
        if (this.tN == null || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(optString2) || (Sg = this.tN.Sg(optString2)) == null) {
            return;
        }
        if (TextUtils.equals(optString, "onShow")) {
            Sg.tN(0);
        } else if (TextUtils.equals(optString, "onDismiss")) {
            Sg.tN(8);
        }
    }

    private void YFl(nc ncVar) {
        JSONObject jSONObject;
        boolean z10;
        int i10;
        String str;
        AlY alY;
        AlY alY2;
        AlY alY3;
        if (this.qsH == null) {
            return;
        }
        String optString = ncVar.tN().optString("type");
        if ("swiperLeft".equals(optString) && (alY3 = this.hQ) != null) {
            alY3.Sg();
            return;
        }
        if ("swiperRight".equals(optString) && (alY2 = this.hQ) != null) {
            alY2.tN();
            return;
        }
        if (!"swiperClick".equals(optString) || (alY = this.hQ) == null) {
            jSONObject = null;
            z10 = false;
            i10 = 0;
        } else {
            z10 = alY.YFl(ncVar);
            jSONObject = this.hQ.AlY();
            i10 = 2;
        }
        optString.getClass();
        char c10 = 65535;
        switch (optString.hashCode()) {
            case -314498168:
                if (optString.equals("privacy")) {
                    c10 = 0;
                    break;
                }
                break;
            case -191501435:
                if (optString.equals("feedback")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3363353:
                if (optString.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                    c10 = 2;
                    break;
                }
                break;
            case 3532159:
                if (optString.equals("skip")) {
                    c10 = 3;
                    break;
                }
                break;
            case 112202875:
                if (optString.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    c10 = 4;
                    break;
                }
                break;
            case 1820422063:
                if (optString.equals("creative")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 7;
                break;
            case 1:
                i10 = 3;
                break;
            case 2:
                i10 = 5;
                break;
            case 3:
                i10 = 6;
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 2;
                break;
        }
        com.bytedance.adsdk.ugeno.Sg.Sg YFl = ncVar.YFl();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.aIu;
        if (weakReference != null) {
            int[] YFl2 = GS.YFl(weakReference.get());
            if (YFl2 != null) {
                iArr = YFl2;
            }
            int[] tN = GS.tN(this.aIu.get());
            if (tN != null) {
                iArr2 = tN;
            }
        }
        pDU.YFl YFl3 = new pDU.YFl().AlY(this.YoT).tN(this.GA).Sg(this.pDU).YFl(this.EH).Sg(this.rkt).YFl(this.lG).tN(iArr[0]).AlY(iArr[1]).wN(iArr2[0]).vc(iArr2[1]).YFl(this.wXo).YFl(ncVar.Sg() != 1 || this.Wwa);
        if (YFl == null) {
            str = "";
        } else {
            str = YFl.hQ() + "_" + YFl.Cfr();
        }
        this.qsH.YFl(ncVar.YFl().NjR(), i10, YFl3.YFl(str).Sg(z10).Sg(jSONObject).YFl());
    }

    public JSONObject Sg() {
        return this.f10673vc.dXO();
    }

    private void Sg(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg;
        View NjR;
        com.bytedance.adsdk.ugeno.Sg.Sg<View> sg2 = this.tN;
        if (sg2 == null || (Sg = sg2.Sg("skip")) == null || (NjR = Sg.NjR()) == null) {
            return;
        }
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        NjR.setVisibility(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.eT.AlY.tN.Cfr <= r2) goto L16;
     */
    @Override // com.bytedance.adsdk.ugeno.core.GA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.eT.AlY.tN.YFl(com.bytedance.adsdk.ugeno.Sg.Sg, android.view.MotionEvent):void");
    }

    private void YFl(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg;
        int i11;
        com.bytedance.adsdk.ugeno.Sg.Sg<View> sg2 = this.tN;
        if (sg2 == null || (Sg = sg2.Sg("countdown")) == null) {
            return;
        }
        View NjR = Sg.NjR();
        if (NjR instanceof TextView) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.YoT.YFl("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.lu) {
                NjR.setVisibility(0);
                if (!z10 && this.f10673vc.YFl() && com.bytedance.sdk.component.adexpress.AlY.DSW.Sg(this.f10673vc.AlY())) {
                    ((TextView) NjR).setText(String.format(com.bytedance.sdk.component.utils.qO.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), "tt_reward_full_skip"), Integer.valueOf(i10)));
                    return;
                }
                if (!"open_ad".equals(this.f10673vc.AlY()) && this.f10673vc.YFl()) {
                    this.lu = true;
                    NjR.setVisibility(8);
                    return;
                } else {
                    ((TextView) NjR).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            NjR.setVisibility(8);
        }
    }
}
