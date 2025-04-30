package com.bytedance.adsdk.ugeno.component;

import U4.u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MotionEventCompat;
import com.bytedance.adsdk.ugeno.component.zp;
import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.core.HWF;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.KVG;
import com.bytedance.adsdk.ugeno.core.QR;
import com.bytedance.adsdk.ugeno.core.YW;
import com.bytedance.adsdk.ugeno.core.ku;
import com.bytedance.adsdk.ugeno.core.lMd.COT;
import com.bytedance.adsdk.ugeno.core.lMd.KS;
import com.bytedance.adsdk.ugeno.core.lMd.jU;
import com.bytedance.adsdk.ugeno.core.rV;
import com.bytedance.adsdk.ugeno.core.tG;
import com.bytedance.adsdk.ugeno.core.vDp;
import com.bytedance.adsdk.ugeno.lMd.zp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class lMd<T extends View> implements tG.lMd, tG.zp, com.bytedance.adsdk.ugeno.lMd {
    protected boolean BO;
    protected String Bj;
    protected T COT;
    private boolean CZ;
    private String DY;
    protected float FP;
    private boolean GP;
    protected boolean Gzh;
    protected zp<ViewGroup> HWF;
    protected QR Iv;
    protected JSONObject KS;
    protected float KVG;
    protected boolean Lij;
    private COT MBR;
    private boolean Np;
    protected int Pxi;
    protected zp<ViewGroup> QR;
    protected String QUv;
    protected boolean RCv;
    private JSONObject REM;
    protected rV Rg;
    private boolean Rh;
    protected float UPs;
    private String Vjb;
    protected float WNy;
    protected YW YW;
    private boolean YcG;
    protected float YhE;
    protected tG aax;
    private boolean bX;
    protected float cW;
    protected float cz;
    protected float dQp;
    protected String dT;
    protected int eWG;
    protected float fRl;
    private boolean fVt;
    protected float ffE;
    private com.bytedance.adsdk.ugeno.core.lMd.zp fgJ;
    private boolean fs;
    private zp.C0069zp gH;
    protected int irS;
    protected JSONObject jU;
    protected HWF.zp ku;
    protected Context lMd;
    private KVG mW;
    private com.bytedance.adsdk.ugeno.core.lMd.lMd oB;
    protected float oKZ;
    protected float ot;
    protected boolean ox;
    protected float pvr;
    private ku qtv;
    private com.bytedance.adsdk.ugeno.core.zp rCC;
    protected float rV;
    protected Map<Integer, Bj> si;
    private boolean sqt;
    protected float tG;
    protected float vDp;
    private float vLi;
    protected float vwr;
    protected float woN;
    protected float yRU;
    private GradientDrawable zp;
    private boolean zpV;

    public lMd(Context context) {
        this(context, null);
    }

    public JSONObject Bj() {
        return this.KS;
    }

    @Override // com.bytedance.adsdk.ugeno.lMd
    public void COT() {
        if (this.mW != null && !this.Np) {
            this.Np = true;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lMd
    public void HWF() {
        com.bytedance.adsdk.ugeno.core.zp zpVar = this.rCC;
        if (zpVar != null) {
            ku kuVar = new ku(this.COT, zpVar);
            this.qtv = kuVar;
            kuVar.zp();
        }
        if (this.oB != null && zp(10)) {
            this.oB.zp();
        }
        if (this.MBR != null && zp(9)) {
            this.MBR.zp();
        }
    }

    public T KS() {
        return null;
    }

    public int KVG() {
        return (int) this.tG;
    }

    @Override // com.bytedance.adsdk.ugeno.lMd
    public void QR() {
        ku kuVar = this.qtv;
        if (kuVar != null) {
            kuVar.lMd();
        }
    }

    public T YW() {
        return this.COT;
    }

    public int dQp() {
        return (int) this.vDp;
    }

    public JSONObject dT() {
        return this.jU;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void lMd() {
        final jU jUVar;
        zp();
        this.COT.setPadding((int) (this.ox ? this.cz : this.pvr), (int) (this.Lij ? this.ot : this.pvr), (int) (this.RCv ? this.FP : this.pvr), (int) (this.Gzh ? this.yRU : this.pvr));
        this.COT.setVisibility(this.Pxi);
        HWF.zp zpVar = this.ku;
        if (zpVar != null && TextUtils.isEmpty(zpVar.lMd())) {
            this.COT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.component.lMd.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    lMd lmd = lMd.this;
                    if (lmd.Iv != null) {
                        boolean unused = lmd.zpV;
                    }
                }
            });
        } else if (zp(1) && !this.fs) {
            this.COT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.component.lMd.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    lMd lmd = lMd.this;
                    if (lmd.aax != null && lmd.zpV) {
                        lMd lmd2 = lMd.this;
                        tG tGVar = lmd2.aax;
                        Bj bj = lmd2.si.get(1);
                        lMd lmd3 = lMd.this;
                        tGVar.zp(bj, lmd3, lmd3);
                    }
                }
            });
        }
        final KS ks = null;
        if (this.aax == null || !zp(4)) {
            jUVar = null;
        } else if (zp(1)) {
            this.GP = true;
            jUVar = new jU(this.lMd, this.si.get(4), this.si.get(1), this.GP);
        } else {
            jUVar = new jU(this.lMd, this.si.get(4), this.GP);
        }
        if (this.aax != null && zp(1) && this.fs) {
            ks = new KS(this.lMd, this.si.get(1));
        }
        if (this.aax != null && zp(3)) {
            this.fgJ = new com.bytedance.adsdk.ugeno.core.lMd.zp(this.lMd);
            new Object() { // from class: com.bytedance.adsdk.ugeno.component.lMd.3
            };
        }
        if (this.aax != null && zp(9)) {
            COT cot = new COT(this.lMd, this.si.get(9), this);
            this.MBR = cot;
            cot.zp(this.aax);
        }
        if (zp(10)) {
            com.bytedance.adsdk.ugeno.core.lMd.lMd lmd = new com.bytedance.adsdk.ugeno.core.lMd.lMd(this.lMd, this.si.get(10), this);
            this.oB = lmd;
            lmd.zp(this.aax);
        }
        this.COT.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.adsdk.ugeno.component.lMd.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                jU jUVar2;
                lMd lmd2;
                tG tGVar;
                KS ks2;
                lMd lmd3 = lMd.this;
                rV rVVar = lmd3.Rg;
                if (rVVar != null) {
                    rVVar.zp(lmd3, motionEvent);
                }
                if (lMd.this.zp(17) && motionEvent.getAction() == 0) {
                    lMd lmd4 = lMd.this;
                    tG tGVar2 = lmd4.aax;
                    Bj bj = lmd4.si.get(17);
                    lMd lmd5 = lMd.this;
                    tGVar2.zp(bj, lmd5, lmd5);
                }
                if (lMd.this.zp(1) && lMd.this.fs && (tGVar = (lmd2 = lMd.this).aax) != null && (ks2 = ks) != null) {
                    return ks2.zp(tGVar, lmd2, motionEvent);
                }
                lMd lmd6 = lMd.this;
                tG tGVar3 = lmd6.aax;
                if (tGVar3 != null && (jUVar2 = jUVar) != null) {
                    return jUVar2.zp(tGVar3, lmd6, motionEvent);
                }
                return false;
            }
        });
    }

    public String rV() {
        return this.Bj;
    }

    public String tG() {
        return this.dT;
    }

    public zp vDp() {
        return this.HWF;
    }

    public boolean woN() {
        return this.BO;
    }

    public void zp(JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.jU = jSONObject;
        JSONObject jSONObject3 = this.KS;
        if (jSONObject3 == null) {
            return;
        }
        Iterator<String> keys = jSONObject3.keys();
        zp<ViewGroup> zpVar = this.HWF;
        zp.C0066zp ku = zpVar instanceof zp ? zpVar.ku() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String zp = com.bytedance.adsdk.ugeno.zp.KS.zp(this.KS.optString(next), jSONObject);
            zp(next, zp);
            if (ku != null) {
                ku.zp(this.lMd, next, zp);
            }
        }
        if (ku != null) {
            zp(ku.zp());
        }
        JSONObject jSONObject4 = this.REM;
        if (jSONObject4 == null || (jSONObject2 = this.jU) == null) {
            return;
        }
        try {
            jSONObject2.put("i18n", jSONObject4);
            Log.d("nxb", "id: " + this.dT + "; " + this.REM);
        } catch (JSONException unused) {
        }
    }

    public lMd(Context context, zp<ViewGroup> zpVar) {
        this.vDp = -2.0f;
        this.tG = -2.0f;
        this.Pxi = 0;
        this.BO = true;
        this.zpV = true;
        this.bX = false;
        this.CZ = false;
        this.vLi = 12.0f;
        this.lMd = context;
        this.HWF = zpVar;
        this.si = new HashMap();
        this.zp = new GradientDrawable();
        this.COT = KS();
    }

    public void jU(String str) {
        this.Bj = str;
    }

    public void KS(String str) {
        this.dT = str;
    }

    @Override // com.bytedance.adsdk.ugeno.lMd
    public void jU() {
        if (this.mW == null || this.sqt) {
            return;
        }
        this.sqt = true;
    }

    public void zp(KVG kvg) {
        this.mW = kvg;
    }

    public boolean zp(int i9) {
        Map<Integer, Bj> map = this.si;
        return map != null && map.containsKey(Integer.valueOf(i9));
    }

    public void zp(rV rVVar) {
        this.Rg = rVVar;
    }

    public void zp(tG tGVar) {
        this.aax = tGVar;
    }

    private void zp() {
        if (TextUtils.isEmpty(this.QUv)) {
            this.zp.setShape(0);
            if (this.Rh) {
                zp.C0069zp c0069zp = this.gH;
                if (c0069zp != null) {
                    this.zp.setOrientation(c0069zp.zp);
                    if (Build.VERSION.SDK_INT >= 29) {
                        GradientDrawable gradientDrawable = this.zp;
                        zp.C0069zp c0069zp2 = this.gH;
                        u.j(gradientDrawable, c0069zp2.lMd, c0069zp2.KS);
                    } else {
                        this.zp.setColors(this.gH.lMd);
                    }
                }
            } else {
                this.zp.setColor(this.irS);
            }
            this.zp.setCornerRadius(this.cW);
            this.zp.setStroke((int) this.ffE, this.eWG);
            this.COT.setBackground(this.zp);
            return;
        }
        if (this.QUv.startsWith("local://")) {
            String replace = this.QUv.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                this.COT.setBackground(new BitmapDrawable(this.lMd.getResources(), BitmapFactory.decodeStream(this.lMd.getResources().openRawResource(com.bytedance.adsdk.ugeno.lMd.jU.lMd(this.lMd, replace)), null, options)));
            } catch (Throwable unused) {
            }
        }
    }

    public void lMd(int i9) {
        this.COT.setVisibility(i9);
    }

    public void lMd(JSONObject jSONObject) {
        this.KS = jSONObject;
    }

    public lMd<T> lMd(String str) {
        return zp(str);
    }

    public void lMd(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && this.si != null) {
            try {
                int zp = vDp.zp(str).zp();
                Bj bj = new Bj();
                bj.zp(zp);
                bj.zp(this);
                JSONObject jSONObject = new JSONObject(str2);
                if (zp == 3) {
                    try {
                        this.vLi = Float.parseFloat(com.bytedance.adsdk.ugeno.zp.KS.zp(jSONObject.optString("shakeAmplitude"), this.jU));
                    } catch (NumberFormatException unused) {
                        this.vLi = 12.0f;
                    }
                }
                tG tGVar = this.aax;
                if (!(tGVar instanceof com.bytedance.adsdk.ugeno.core.zp.zp)) {
                    zp(zp, jSONObject, bj);
                } else if (!((com.bytedance.adsdk.ugeno.core.zp.zp) tGVar).zp()) {
                    zp(zp, jSONObject, bj);
                } else {
                    bj.zp(jSONObject);
                    this.si.put(Integer.valueOf(zp), bj);
                }
            } catch (JSONException unused2) {
            }
        }
    }

    public void zp(ViewGroup.LayoutParams layoutParams) {
        T t9 = this.COT;
        if (t9 != null) {
            t9.setLayoutParams(layoutParams);
        }
    }

    public void zp(HWF.zp zpVar) {
        this.ku = zpVar;
    }

    public lMd<T> zp(String str) {
        if (TextUtils.isEmpty(this.dT) || !TextUtils.equals(this.dT, str)) {
            return null;
        }
        return this;
    }

    public void zp(zp zpVar) {
        this.HWF = zpVar;
    }

    public void zp(YW yw) {
        this.YW = yw;
    }

    @Override // com.bytedance.adsdk.ugeno.lMd
    public void lMd(int i9, int i10, int i11, int i12) {
        ku kuVar = this.qtv;
        if (kuVar != null) {
            kuVar.zp(i9, i10);
        }
    }

    public void zp(QR qr) {
        this.Iv = qr;
    }

    public void zp(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    c9 = 2;
                    break;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    c9 = 3;
                    break;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    c9 = 4;
                    break;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    c9 = 5;
                    break;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    c9 = 6;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c9 = 7;
                    break;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    c9 = '\b';
                    break;
                }
                break;
            case -1055029545:
                if (str.equals("borderRightTopRadius")) {
                    c9 = '\t';
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c9 = '\n';
                    break;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    c9 = 11;
                    break;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    c9 = '\f';
                    break;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c9 = '\r';
                    break;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    c9 = 14;
                    break;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c9 = 15;
                    break;
                }
                break;
            case -179345264:
                if (str.equals("borderLeftBottomRadius")) {
                    c9 = 16;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c9 = 17;
                    break;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    c9 = 18;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c9 = 19;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c9 = 20;
                    break;
                }
                break;
            case 94750088:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    c9 = 21;
                    break;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    c9 = 22;
                    break;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    c9 = 23;
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c9 = 24;
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c9 = 25;
                    break;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    c9 = 26;
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c9 = 27;
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c9 = 28;
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c9 = 29;
                    break;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    c9 = 30;
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c9 = 31;
                    break;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    c9 = ' ';
                    break;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    c9 = '!';
                    break;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    c9 = '\"';
                    break;
                }
                break;
            case 1259700532:
                if (str.equals("borderLeftTopRadius")) {
                    c9 = '#';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c9 = '$';
                    break;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    c9 = '%';
                    break;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    c9 = '&';
                    break;
                }
                break;
            case 1691835405:
                if (str.equals("borderRightBottomRadius")) {
                    c9 = '\'';
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c9 = '(';
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c9 = ')';
                    break;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    c9 = '*';
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.zpV = com.bytedance.adsdk.ugeno.lMd.KS.zp(str2, true);
                return;
            case 1:
                this.cz = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                this.ox = true;
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 11:
            case 22:
            case 26:
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
            case ' ':
            case '\"':
            case '%':
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                lMd(str, str2);
                return;
            case 6:
                if (com.bytedance.adsdk.ugeno.lMd.zp.KS(str2)) {
                    this.Rh = true;
                    this.gH = com.bytedance.adsdk.ugeno.lMd.zp.lMd(str2);
                    return;
                } else {
                    this.irS = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                    this.Rh = false;
                    return;
                }
            case 7:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.tG = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.tG = -2.0f;
                } else {
                    this.tG = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                }
                this.CZ = true;
                return;
            case '\b':
                this.rV = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case '\t':
                this.UPs = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case '\n':
                this.woN = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case '\f':
                this.QUv = str2;
                return;
            case '\r':
                this.pvr = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case 14:
                this.Vjb = str2;
                return;
            case 15:
                this.vwr = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case 16:
                this.WNy = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case 17:
                this.dT = str2;
                return;
            case 18:
                this.REM = com.bytedance.adsdk.ugeno.lMd.lMd.zp(str2, (JSONObject) null);
                return;
            case 19:
                this.Bj = str2;
                return;
            case 20:
                this.ot = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                this.Lij = true;
                return;
            case 21:
                this.DY = str2;
                return;
            case 23:
                this.oKZ = com.bytedance.adsdk.ugeno.lMd.KS.zp(str2, 0.0f);
                return;
            case 24:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.vDp = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.vDp = -2.0f;
                } else {
                    this.vDp = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                }
                this.bX = true;
                return;
            case 25:
                this.yRU = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                this.Gzh = true;
                return;
            case 27:
                this.FP = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                this.RCv = true;
                return;
            case 28:
                this.eWG = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            case 29:
                this.ffE = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case 31:
                this.KVG = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case '!':
                this.rCC = com.bytedance.adsdk.ugeno.core.zp.zp(str2, this);
                return;
            case '#':
                this.YhE = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case '$':
                this.cW = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case '\'':
                this.fRl = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case '(':
                if (TextUtils.equals("visible", str2)) {
                    this.Pxi = 0;
                    return;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.Pxi = 4;
                    return;
                } else {
                    if (TextUtils.equals("gone", str2)) {
                        this.Pxi = 8;
                        return;
                    }
                    return;
                }
            case ')':
                this.dQp = com.bytedance.adsdk.ugeno.lMd.ku.zp(this.lMd, str2);
                return;
            case '*':
                this.BO = !TextUtils.equals(str2, "unavailable");
                return;
            default:
                return;
        }
    }

    public lMd lMd(lMd lmd) {
        return (lmd.vDp() == null && (lmd instanceof zp)) ? lmd : lMd(lmd.vDp());
    }

    @Deprecated
    public void zp(int i9, JSONObject jSONObject, Bj bj) {
        JSONObject optJSONObject = jSONObject.optJSONObject("success");
        if (optJSONObject != null) {
            Bj bj2 = new Bj();
            bj2.zp(optJSONObject);
            bj2.zp(this);
            bj.zp(bj2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("fail");
        if (optJSONObject2 != null) {
            Bj bj3 = new Bj();
            bj3.zp(optJSONObject2);
            bj3.zp(this);
            bj.lMd(bj3);
        }
        bj.zp(jSONObject);
        this.si.put(Integer.valueOf(i9), bj);
    }

    @Override // com.bytedance.adsdk.ugeno.lMd
    public int[] zp(int i9, int i10) {
        if (this.oKZ > 0.0f) {
            if (this.bX) {
                int size = View.MeasureSpec.getSize(i9);
                float f9 = this.oKZ;
                if (f9 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size / f9), 1073741824);
                }
            } else if (this.CZ) {
                int size2 = View.MeasureSpec.getSize(i10);
                float f10 = this.oKZ;
                if (f10 != 0.0f) {
                    i9 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f10), 1073741824);
                }
            }
        }
        if (this.mW != null && !this.fVt) {
            this.fVt = true;
        }
        return new int[]{i9, i10};
    }

    @Override // com.bytedance.adsdk.ugeno.lMd
    public void zp(int i9, int i10, int i11, int i12) {
        if (this.mW == null || this.YcG) {
            return;
        }
        this.YcG = true;
    }

    @Override // com.bytedance.adsdk.ugeno.lMd
    public void zp(Canvas canvas, IAnimation iAnimation) {
        ku kuVar = this.qtv;
        if (kuVar != null) {
            kuVar.zp(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.tG.lMd
    public void zp(Bj bj) {
        zp<ViewGroup> zpVar;
        lMd<T> lMd;
        if (bj == null || bj.KS() == null || !TextUtils.equals(bj.KS().optString("type"), "onDismiss")) {
            return;
        }
        String optString = bj.KS().optString("nodeId");
        lMd(8);
        this.QR = (zp) lMd(this);
        if (TextUtils.isEmpty(optString) || (zpVar = this.QR) == null || (lMd = zpVar.lMd(optString)) == null) {
            return;
        }
        lMd.lMd(8);
    }
}
