package com.bytedance.adsdk.ugeno.Sg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.MotionEventCompat;
import ba.a;
import com.bytedance.adsdk.ugeno.AlY.wN;
import com.bytedance.adsdk.ugeno.DSW.YFl;
import com.bytedance.adsdk.ugeno.Sg.YFl;
import com.bytedance.adsdk.ugeno.YFl;
import com.bytedance.adsdk.ugeno.core.DSW;
import com.bytedance.adsdk.ugeno.core.EH;
import com.bytedance.adsdk.ugeno.core.GA;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.Sg.AlY;
import com.bytedance.adsdk.ugeno.core.Sg.tN;
import com.bytedance.adsdk.ugeno.core.YoT;
import com.bytedance.adsdk.ugeno.core.eT;
import com.bytedance.adsdk.ugeno.core.nc;
import com.bytedance.adsdk.ugeno.core.qsH;
import com.bytedance.adsdk.ugeno.core.vc;
import com.bytedance.adsdk.ugeno.core.wN;
import com.bytedance.adsdk.ugeno.tN;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class Sg<T extends View> implements View.OnTouchListener, YoT.Sg, YoT.YFl, tN {
    private GradientDrawable Af;
    protected YoT AfY;
    protected JSONObject AlY;
    protected float BPI;
    protected boolean Bh;
    protected float Bn;
    protected boolean Cfr;
    protected float Cqy;
    protected YFl<ViewGroup> DSW;
    protected float DjU;
    private boolean EAq;
    private boolean ECi;
    protected float EH;
    protected float GA;
    protected ImageView.ScaleType GS;
    protected float Ga;
    private boolean Gmi;
    private boolean Gnp;

    @Deprecated
    private tN.YFl HVP;
    protected com.bytedance.adsdk.ugeno.YFl.YFl Hjb;
    private boolean IXB;
    private boolean JB;
    private wN JGG;
    private EH JT;
    protected int Jc;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.Sg.Sg JwO;
    private boolean LL;
    protected boolean Ld;
    private String Lx;
    protected boolean Ne;
    protected qsH NjR;
    private com.bytedance.adsdk.ugeno.core.YFl PT;
    protected float RX;
    protected Map<Integer, nc> SVa;
    protected String Sco;
    protected Context Sg;
    protected boolean UI;
    protected float UT;
    protected float UZM;
    private Map<String, com.bytedance.adsdk.ugeno.AlY.Sg.YFl> Uv;
    protected int VB;
    private boolean VJb;
    protected boolean VOe;
    protected float Vmj;
    protected float Wwa;
    private boolean YFl;
    protected float YI;
    protected float YP;
    protected String YoT;
    protected float ZLB;
    private String ZS;
    protected float ZU;
    protected boolean aIu;
    private boolean agS;
    protected float bZ;
    private boolean dBO;
    protected boolean dGX;
    private boolean dU;
    protected float dXO;

    /* renamed from: dc, reason: collision with root package name */
    private boolean f10248dc;

    /* renamed from: dd, reason: collision with root package name */
    protected float f10249dd;
    protected String eT;
    private DSW ep;
    protected float fIu;
    protected boolean hQ;
    protected boolean iY;

    /* renamed from: ib, reason: collision with root package name */
    protected ViewGroup.LayoutParams f10250ib;
    protected float in;
    protected YFl.C0061YFl jz;
    protected GA kA;
    protected float ko;
    protected float lG;
    protected float lL;
    protected float lu;
    protected boolean mB;
    protected boolean mn;

    /* renamed from: nc, reason: collision with root package name */
    protected boolean f10251nc;

    /* renamed from: ni, reason: collision with root package name */
    private boolean f10252ni;

    /* renamed from: oa, reason: collision with root package name */
    private float f10253oa;
    protected float pDU;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.Sg.wN pm;
    protected boolean pq;
    protected float qO;

    /* renamed from: qf, reason: collision with root package name */
    @Deprecated
    private AlY f10254qf;
    protected boolean qjy;
    protected wN.YFl qsH;
    protected vc rE;
    protected float rkt;
    private boolean rog;
    protected JSONObject tN;
    protected boolean tQ;
    private JSONObject toy;
    protected float uGS;

    /* renamed from: vc, reason: collision with root package name */
    protected YFl<ViewGroup> f10255vc;
    protected T wN;
    protected boolean wXo;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.Sg.YFl wqc;
    private boolean ww;

    /* renamed from: xg, reason: collision with root package name */
    private boolean f10256xg;
    private boolean yn;
    protected int zB;
    protected float zG;
    private boolean zl;
    protected float zz;

    public Sg(Context context) {
        this(context, null);
    }

    private void BPI() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.eT);
        sb2.append(":");
        sb2.append(this.YoT);
        sb2.append(":");
        if (Sg(1)) {
            sb2.append("1:");
            nc ncVar = this.SVa.get(1);
            if (ncVar != null && ncVar.tN() != null) {
                sb2.append(ncVar.tN().optString("type"));
            }
        } else {
            sb2.append("0");
        }
        this.wN.setContentDescription(sb2);
    }

    private void ZU() {
        nc ncVar;
        if (this.AfY == null || !Sg(18) || (ncVar = this.SVa.get(18)) == null) {
            return;
        }
        JSONObject tN = ncVar.tN();
        if (tN != null) {
            try {
                tN.put("rotateZ", com.bytedance.adsdk.ugeno.tN.Sg.YFl(tN.optString("rotateZ"), this.AlY));
            } catch (JSONException unused) {
            }
        }
        this.AfY.YFl(ncVar, this, this);
    }

    private boolean vc(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    private ImageView.ScaleType wN(String str) {
        str.getClass();
        if (str.equals("fit")) {
            this.GS = ImageView.ScaleType.FIT_CENTER;
        } else if (!str.equals("crop")) {
            this.GS = ImageView.ScaleType.FIT_XY;
        } else {
            this.GS = ImageView.ScaleType.CENTER_CROP;
        }
        return this.GS;
    }

    private void zG() {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.iY) {
            f10 = this.BPI;
        } else {
            f10 = this.ZU;
        }
        if (this.Bh) {
            f11 = this.ko;
        } else {
            f11 = this.ZU;
        }
        if (this.dGX) {
            f12 = this.zG;
        } else {
            f12 = this.ZU;
        }
        if (this.Ld) {
            f13 = this.fIu;
        } else {
            f13 = this.ZU;
        }
        this.Af.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    public T AlY() {
        return null;
    }

    public String Cfr() {
        return this.eT;
    }

    public void DSW() {
        com.bytedance.adsdk.ugeno.core.YFl yFl = this.PT;
        if (yFl != null) {
            DSW dsw = new DSW(this.wN, yFl);
            this.ep = dsw;
            dsw.YFl();
        }
        com.bytedance.adsdk.ugeno.YFl.YFl yFl2 = this.Hjb;
        if (yFl2 != null) {
            yFl2.YFl();
        }
        if (this.wqc != null && Sg(10)) {
            this.wqc.YFl();
        }
        if (this.pm != null && Sg(9)) {
            this.pm.YFl();
        }
    }

    public float EH() {
        return this.Bn;
    }

    public float GA() {
        return this.zz;
    }

    public void GS() {
    }

    public boolean Ga() {
        return this.f10251nc;
    }

    public JSONObject Ne() {
        return this.tN;
    }

    public T NjR() {
        return this.wN;
    }

    public int Sco() {
        return this.zB;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Sg() {
        VOe();
        eT();
        this.wN.setVisibility(this.Jc);
        YFl();
        tN();
        com.bytedance.adsdk.ugeno.AlY.wN wNVar = this.JGG;
        if (wNVar != null) {
            wNVar.tN();
            this.JGG.YFl();
            this.JGG.Sg();
        }
        this.wN.setOnTouchListener(this);
        BPI();
        ViewGroup viewGroup = (ViewGroup) this.wN.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.f10256xg);
        }
        com.bytedance.adsdk.ugeno.YFl.YFl yFl = this.Hjb;
        if (yFl != null) {
            yFl.tN();
        }
    }

    public float UI() {
        T t5 = this.wN;
        if (t5 instanceof com.bytedance.adsdk.ugeno.YFl.wN) {
            return ((com.bytedance.adsdk.ugeno.YFl.wN) t5).getShine();
        }
        return 0.0f;
    }

    public ViewGroup.LayoutParams UZM() {
        return this.f10250ib;
    }

    public void VOe() {
        Bitmap.Config config;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        if (TextUtils.isEmpty(this.Sco)) {
            if (this.qjy) {
                YFl(this.jz);
                return;
            } else {
                this.Af.setColor(this.zB);
                AlY(this.zB);
                return;
            }
        }
        if (this.Sco.startsWith("local://")) {
            String replace = this.Sco.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.mB) {
                    config = Bitmap.Config.ARGB_4444;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                options.inPurgeable = true;
                options.inInputShareable = true;
                Bitmap decodeStream = BitmapFactory.decodeStream(this.Sg.getResources().openRawResource(com.bytedance.adsdk.ugeno.DSW.AlY.YFl(this.Sg, replace)), null, options);
                if (this.mB) {
                    Bitmap YFl = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, decodeStream, (int) this.lu);
                    if (YFl != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.Sg.getResources(), YFl);
                        YFl(bitmapDrawable2);
                        return;
                    }
                    bitmapDrawable = new BitmapDrawable(this.Sg.getResources(), decodeStream);
                } else {
                    bitmapDrawable = new BitmapDrawable(this.Sg.getResources(), decodeStream);
                }
                bitmapDrawable2 = bitmapDrawable;
                YFl(bitmapDrawable2);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.Sco.startsWith("http://") || this.Sco.startsWith("https://")) {
            bZ();
        }
    }

    public float Wwa() {
        return this.DjU;
    }

    public void YFl(JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.AlY = jSONObject;
        JSONObject jSONObject3 = this.tN;
        if (jSONObject3 == null) {
            return;
        }
        Iterator<String> keys = jSONObject3.keys();
        YFl<ViewGroup> yFl = this.f10255vc;
        YFl.C0064YFl tN = yFl instanceof YFl ? yFl.tN() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String YFl = com.bytedance.adsdk.ugeno.tN.Sg.YFl(this.tN.optString(next), jSONObject);
            YFl(next, YFl);
            if (tN != null) {
                tN.YFl(this.Sg, next, YFl);
            }
        }
        if (tN != null) {
            YFl(tN.YFl());
        }
        JSONObject jSONObject4 = this.toy;
        if (jSONObject4 == null || (jSONObject2 = this.AlY) == null) {
            return;
        }
        try {
            jSONObject2.put("i18n", jSONObject4);
        } catch (JSONException unused) {
        }
    }

    public wN.YFl YI() {
        return this.qsH;
    }

    public float YoT() {
        return this.lL;
    }

    public float aIu() {
        return this.ZU;
    }

    public void bZ() {
        com.bytedance.adsdk.ugeno.AlY.YFl().Sg().YFl(this.NjR, this.Sco, new YFl.InterfaceC0065YFl() { // from class: com.bytedance.adsdk.ugeno.Sg.Sg.4
            @Override // com.bytedance.adsdk.ugeno.YFl.InterfaceC0065YFl
            public void YFl(final Bitmap bitmap) {
                if (bitmap != null) {
                    Sg sg2 = Sg.this;
                    if (sg2.mB) {
                        final Bitmap YFl = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(sg2.Sg, bitmap, (int) sg2.lu);
                        if (YFl != null) {
                            com.bytedance.adsdk.ugeno.DSW.qsH.YFl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.Sg.Sg.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Sg.this.YFl(new BitmapDrawable(YFl));
                                }
                            });
                            return;
                        }
                        return;
                    }
                    com.bytedance.adsdk.ugeno.DSW.qsH.YFl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.Sg.Sg.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            Sg.this.YFl(new BitmapDrawable(bitmap));
                        }
                    });
                }
            }
        });
    }

    public YFl dXO() {
        return this.f10255vc;
    }

    public void eT() {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.Cfr) {
            f10 = this.UZM;
        } else {
            f10 = this.bZ;
        }
        if (this.hQ) {
            f11 = this.YI;
        } else {
            f11 = this.bZ;
        }
        if (this.pq) {
            f12 = this.Ga;
        } else {
            f12 = this.bZ;
        }
        if (this.mn) {
            f13 = this.dXO;
        } else {
            f13 = this.bZ;
        }
        this.wN.setPadding((int) f10, (int) f12, (int) f11, (int) f13);
    }

    public String hQ() {
        return this.YoT;
    }

    public float lG() {
        return this.UT;
    }

    public void lu() {
    }

    public float mB() {
        T t5 = this.wN;
        if (t5 instanceof com.bytedance.adsdk.ugeno.YFl.wN) {
            return ((com.bytedance.adsdk.ugeno.YFl.wN) t5).getRipple();
        }
        return 0.0f;
    }

    public int mn() {
        return (int) this.pDU;
    }

    public JSONObject nc() {
        return this.AlY;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        AlY alY;
        YoT yoT;
        com.bytedance.adsdk.ugeno.core.Sg.Sg sg2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                lu();
            }
        } else {
            GS();
        }
        GA ga2 = this.kA;
        if (ga2 != null) {
            ga2.YFl(this, motionEvent);
        }
        if (Sg(17) && motionEvent.getAction() == 0) {
            this.AfY.YFl(this.SVa.get(17), this, this);
        }
        if (Sg(1) && this.EAq && (yoT = this.AfY) != null && (sg2 = this.JwO) != null) {
            return sg2.YFl(yoT, this, motionEvent);
        }
        YoT yoT2 = this.AfY;
        if (yoT2 != null && (alY = this.f10254qf) != null) {
            return alY.YFl(yoT2, this, motionEvent);
        }
        com.bytedance.adsdk.ugeno.AlY.wN wNVar = this.JGG;
        if (wNVar != null) {
            return wNVar.YFl(motionEvent);
        }
        return false;
    }

    public float pDU() {
        return this.in;
    }

    public int pq() {
        return (int) this.GA;
    }

    public float qO() {
        return this.YP;
    }

    public void qsH() {
        DSW dsw = this.ep;
        if (dsw != null) {
            dsw.Sg();
        }
        com.bytedance.adsdk.ugeno.YFl.YFl yFl = this.Hjb;
        if (yFl != null) {
            yFl.Sg();
        }
    }

    public float rkt() {
        return this.ZLB;
    }

    public YoT wXo() {
        return this.AfY;
    }

    public boolean zB() {
        return this.tQ;
    }

    public Sg(Context context, YFl<ViewGroup> yFl) {
        this.GA = -2.0f;
        this.pDU = -2.0f;
        this.Jc = 0;
        this.tQ = true;
        this.f10249dd = 0.0f;
        this.lL = 0.0f;
        this.zz = 0.0f;
        this.Vmj = 1.0f;
        this.in = 1.0f;
        this.Bn = 1.0f;
        this.uGS = 0.0f;
        this.ZLB = 0.0f;
        this.UT = 0.0f;
        this.DjU = 0.0f;
        this.YP = 1.0f;
        this.f10256xg = true;
        this.LL = true;
        this.ww = false;
        this.JB = false;
        this.f10253oa = 12.0f;
        this.Sg = context;
        this.f10255vc = yFl;
        this.SVa = new HashMap();
        this.Af = new GradientDrawable();
        this.wN = AlY();
        this.Uv = new HashMap();
    }

    @Deprecated
    private void tN() {
        com.bytedance.adsdk.ugeno.core.Sg.tN AlY;
        this.wN.setVisibility(this.Jc);
        float f10 = this.DjU;
        if (f10 != 0.0f) {
            this.wN.setRotation(f10);
        }
        wN.YFl yFl = this.qsH;
        if (yFl != null && TextUtils.isEmpty(yFl.Sg())) {
            this.wN.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.Sg.Sg.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Sg sg2 = Sg.this;
                    if (sg2.rE != null) {
                        boolean unused = sg2.LL;
                    }
                }
            });
        } else if (Sg(1) && !this.EAq) {
            this.wN.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.Sg.Sg.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Sg sg2 = Sg.this;
                    if (sg2.AfY != null && sg2.LL) {
                        Sg sg3 = Sg.this;
                        YoT yoT = sg3.AfY;
                        nc ncVar = sg3.SVa.get(1);
                        Sg sg4 = Sg.this;
                        yoT.YFl(ncVar, sg4, sg4);
                    }
                }
            });
        }
        if (this.AfY != null && Sg(4)) {
            if (Sg(1)) {
                this.rog = true;
                this.f10254qf = new AlY(this.Sg, this.SVa.get(4), this.SVa.get(1), this.rog);
            } else {
                this.f10254qf = new AlY(this.Sg, this.SVa.get(4), this.rog);
            }
        }
        if (this.AfY != null && Sg(1) && this.EAq) {
            this.JwO = new com.bytedance.adsdk.ugeno.core.Sg.Sg(this.Sg, this.SVa.get(1));
        }
        ZU();
        if (this.AfY != null && Sg(3) && (AlY = com.bytedance.adsdk.ugeno.AlY.YFl().AlY()) != null) {
            this.HVP = AlY.YFl(this.Sg);
            new Object() { // from class: com.bytedance.adsdk.ugeno.Sg.Sg.3
            };
        }
        if (this.AfY != null && Sg(9)) {
            com.bytedance.adsdk.ugeno.core.Sg.wN wNVar = new com.bytedance.adsdk.ugeno.core.Sg.wN(this.Sg, this.SVa.get(9), this);
            this.pm = wNVar;
            wNVar.YFl(this.AfY);
        }
        if (Sg(10)) {
            com.bytedance.adsdk.ugeno.core.Sg.YFl yFl2 = new com.bytedance.adsdk.ugeno.core.Sg.YFl(this.Sg, this.SVa.get(10), this);
            this.wqc = yFl2;
            yFl2.YFl(this.AfY);
        }
    }

    public void AlY(int i10) {
        this.Af.setShape(0);
        this.Af.setColor(i10);
        zG();
        this.Af.setStroke((int) this.Cqy, this.VB);
        this.wN.setBackground(this.Af);
    }

    @Override // com.bytedance.adsdk.ugeno.tN
    public void vc() {
        if (this.JT == null || this.zl) {
            return;
        }
        this.zl = true;
    }

    @Override // com.bytedance.adsdk.ugeno.tN
    public void wN() {
        if (this.JT == null || this.dBO) {
            return;
        }
        this.dBO = true;
    }

    public void AlY(String str) {
        this.YoT = str;
    }

    private void YFl() {
        if (this.YFl) {
            this.wN.setTranslationX(this.lL);
        }
        if (this.Gnp) {
            this.wN.setTranslationY(this.zz);
        }
        if (this.f10252ni) {
            this.wN.setScaleX(this.in);
        }
        if (this.Gmi) {
            this.wN.setScaleY(this.Bn);
        }
        if (this.dU) {
            this.wN.setRotation(this.uGS);
        }
        if (this.ECi) {
            this.wN.setRotationX(this.uGS);
        }
        if (this.VJb) {
            this.wN.setRotationY(this.UT);
        }
        if (this.IXB) {
            this.wN.setAlpha(this.YP);
        }
        float f10 = this.DjU;
        if (f10 != 0.0f) {
            this.wN.setRotation(f10);
        }
    }

    public boolean Sg(int i10) {
        Map<Integer, nc> map = this.SVa;
        return map != null && map.containsKey(Integer.valueOf(i10));
    }

    public void Sg(JSONObject jSONObject) {
        this.tN = jSONObject;
    }

    public Sg<T> Sg(String str) {
        return YFl(str);
    }

    public void Sg(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && this.SVa != null) {
            try {
                int YFl = eT.YFl(str).YFl();
                nc ncVar = new nc();
                ncVar.YFl(YFl);
                ncVar.YFl(this);
                JSONObject jSONObject = new JSONObject(str2);
                if (YFl == 3) {
                    try {
                        this.f10253oa = Float.parseFloat(com.bytedance.adsdk.ugeno.tN.Sg.YFl(jSONObject.optString("shakeAmplitude"), this.AlY));
                    } catch (NumberFormatException unused) {
                        this.f10253oa = 12.0f;
                    }
                }
                YoT yoT = this.AfY;
                if (!(yoT instanceof com.bytedance.adsdk.ugeno.core.YFl.YFl)) {
                    YFl(YFl, jSONObject, ncVar);
                } else if (!((com.bytedance.adsdk.ugeno.core.YFl.YFl) yoT).YFl()) {
                    YFl(YFl, jSONObject, ncVar);
                } else {
                    ncVar.YFl(jSONObject);
                    this.SVa.put(Integer.valueOf(YFl), ncVar);
                }
            } catch (JSONException unused2) {
            }
        }
    }

    public void tN(int i10) {
        this.wN.setVisibility(i10);
    }

    public void tN(String str) {
        this.eT = str;
    }

    public void YFl(EH eh2) {
        this.JT = eh2;
    }

    public void YFl(GA ga2) {
        this.kA = ga2;
    }

    public void YFl(YoT yoT) {
        this.AfY = yoT;
    }

    @Override // com.bytedance.adsdk.ugeno.tN
    public void Sg(int i10, int i11, int i12, int i13) {
        DSW dsw = this.ep;
        if (dsw != null) {
            dsw.YFl(i10, i11);
        }
        com.bytedance.adsdk.ugeno.YFl.YFl yFl = this.Hjb;
        if (yFl != null) {
            yFl.YFl(i10, i11);
        }
    }

    public void YFl(YFl.C0061YFl c0061YFl) {
        if (c0061YFl == null) {
            return;
        }
        this.Af.setShape(0);
        this.Af.setOrientation(c0061YFl.YFl);
        if (Build.VERSION.SDK_INT >= 29) {
            a.j(this.Af, c0061YFl.Sg, c0061YFl.tN);
        } else {
            this.Af.setColors(c0061YFl.Sg);
        }
        zG();
        this.Af.setStroke((int) this.Cqy, this.VB);
        this.wN.setBackground(this.Af);
    }

    public Sg Sg(Sg sg2) {
        return (sg2.dXO() == null && (sg2 instanceof YFl)) ? sg2 : Sg(sg2.dXO());
    }

    public void YFl(Drawable drawable) {
        this.wN.setBackground(drawable);
    }

    public void YFl(ViewGroup.LayoutParams layoutParams) {
        T t5 = this.wN;
        if (t5 != null) {
            t5.setLayoutParams(layoutParams);
        }
        this.f10250ib = layoutParams;
    }

    public void YFl(wN.YFl yFl) {
        this.qsH = yFl;
    }

    public Sg<T> YFl(String str) {
        if (TextUtils.isEmpty(this.eT) || !TextUtils.equals(this.eT, str)) {
            return null;
        }
        return this;
    }

    public void YFl(boolean z10) {
        this.f10251nc = z10;
    }

    public void YFl(YFl yFl) {
        this.f10255vc = yFl;
    }

    public void YFl(qsH qsh) {
        this.NjR = qsh;
    }

    public void YFl(vc vcVar) {
        this.rE = vcVar;
    }

    public void YFl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    c10 = 14;
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c10 = 15;
                    break;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    c10 = 16;
                    break;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    c10 = 17;
                    break;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    c10 = 18;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c10 = 19;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c10 = 20;
                    break;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c10 = 21;
                    break;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    c10 = 22;
                    break;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c10 = 23;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c10 = 24;
                    break;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    c10 = 25;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c10 = 26;
                    break;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    c10 = 27;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c10 = 28;
                    break;
                }
                break;
            case 94750088:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    c10 = 29;
                    break;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    c10 = 30;
                    break;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    c10 = 31;
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c10 = '!';
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    c10 = '#';
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c10 = Typography.dollar;
                    break;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c10 = '%';
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c10 = Typography.amp;
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c10 = '(';
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c10 = ')';
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c10 = '*';
                    break;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    c10 = '+';
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c10 = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c10 = '-';
                    break;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    c10 = '.';
                    break;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    c10 = '/';
                    break;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    c10 = '0';
                    break;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    c10 = '1';
                    break;
                }
                break;
            case 1287124693:
                if (str.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    c10 = '2';
                    break;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    c10 = '3';
                    break;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    c10 = '4';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c10 = '5';
                    break;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    c10 = '6';
                    break;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    c10 = '7';
                    break;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    c10 = '8';
                    break;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    c10 = '9';
                    break;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    c10 = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    c10 = ';';
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c10 = Typography.less;
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c10 = '=';
                    break;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    c10 = Typography.greater;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.LL = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, true);
                return;
            case 1:
                this.YFl = true;
                this.lL = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f));
                return;
            case 2:
                this.Gnp = true;
                this.zz = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f));
                return;
            case 3:
                this.UZM = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.Cfr = true;
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case 16:
            case 30:
            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
            case '1':
            case '9':
            case ';':
                Sg(str, str2);
                return;
            case '\t':
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                if (com.bytedance.adsdk.ugeno.DSW.YFl.tN(str2)) {
                    this.qjy = true;
                    this.jz = com.bytedance.adsdk.ugeno.DSW.YFl.Sg(str2);
                    return;
                } else {
                    this.zB = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2, 0);
                    this.qjy = false;
                    return;
                }
            case '\n':
                this.JGG = com.bytedance.adsdk.ugeno.AlY.wN.YFl(this, str2);
                return;
            case 11:
                this.IXB = true;
                this.YP = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 1.0f);
                return;
            case '\f':
                this.BPI = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.iY = true;
                return;
            case '\r':
                if (TextUtils.equals(str2, "match_parent")) {
                    this.pDU = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.pDU = -2.0f;
                } else {
                    this.pDU = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                }
                this.JB = true;
                return;
            case 14:
                this.EH = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                return;
            case 15:
                this.Wwa = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.Ne = true;
                return;
            case 17:
            case '3':
                this.Sco = str2;
                return;
            case 18:
                this.dU = true;
                this.uGS = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f);
                return;
            case 19:
                this.f10252ni = true;
                this.in = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f);
                return;
            case 20:
                this.Gmi = true;
                this.Bn = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f);
                return;
            case 21:
                this.bZ = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                return;
            case 22:
                this.Lx = str2;
                return;
            case 23:
                this.qO = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.VOe = true;
                return;
            case 24:
                this.eT = str2;
                return;
            case 25:
                this.toy = com.bytedance.adsdk.ugeno.DSW.Sg.YFl(str2, (JSONObject) null);
                return;
            case 26:
                this.YoT = str2;
                return;
            case 27:
                float YFl = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f);
                this.lu = YFl;
                if (YFl > 0.0f) {
                    this.mB = true;
                    return;
                }
                return;
            case 28:
                this.Ga = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.pq = true;
                return;
            case NOTIFICATION_REDIRECT_VALUE:
                this.ZS = str2;
                return;
            case TEMPLATE_HTML_SIZE_VALUE:
                this.RX = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f);
                return;
            case ' ':
                this.f10252ni = true;
                this.Gmi = true;
                float[] tN = com.bytedance.adsdk.ugeno.YFl.tN.tN(str2);
                this.in = tN[0];
                this.Bn = tN[1];
                return;
            case '!':
                if (TextUtils.equals(str2, "match_parent")) {
                    this.GA = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.GA = -2.0f;
                } else {
                    this.GA = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                }
                this.ww = true;
                return;
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                this.dXO = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.mn = true;
                return;
            case '$':
                this.ko = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.Bh = true;
                return;
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                this.f10256xg = vc(str2);
                return;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                this.zG = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.dGX = true;
                return;
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                this.fIu = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.Ld = true;
                return;
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                this.YI = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.hQ = true;
                return;
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                this.VB = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
                return;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                this.Cqy = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                return;
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                this.lG = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.wXo = true;
                return;
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                this.YFl = true;
                this.Gnp = true;
                float[] tN2 = com.bytedance.adsdk.ugeno.YFl.tN.tN(str2);
                this.lL = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, tN2[0]);
                this.zz = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, tN2[1]);
                return;
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                try {
                    this.Hjb = new com.bytedance.adsdk.ugeno.YFl.YFl(this.Sg, this, com.bytedance.adsdk.ugeno.YFl.tN.YFl(new JSONObject(str2)));
                    return;
                } catch (JSONException unused) {
                    return;
                }
            case '0':
                this.PT = com.bytedance.adsdk.ugeno.core.YFl.YFl(str2, this);
                return;
            case '4':
                this.UI = true;
                this.GS = wN(str2);
                return;
            case '5':
                this.ZU = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                return;
            case '6':
                this.ECi = true;
                this.ZLB = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f);
                return;
            case '7':
                this.VJb = true;
                this.UT = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f);
                return;
            case '8':
                this.DjU = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, 0.0f);
                return;
            case ':':
                this.yn = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, false);
                return;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (TextUtils.equals("visible", str2)) {
                    this.Jc = 0;
                    return;
                }
                if (TextUtils.equals("invisible", str2)) {
                    this.Jc = 4;
                    return;
                } else {
                    if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                        this.Jc = 8;
                        return;
                    }
                    return;
                }
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                this.rkt = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(this.Sg, str2);
                this.aIu = true;
                return;
            case '>':
                this.tQ = !TextUtils.equals(str2, "unavailable");
                return;
            default:
                return;
        }
    }

    @Deprecated
    public void YFl(int i10, JSONObject jSONObject, nc ncVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("success");
        if (optJSONObject != null) {
            nc ncVar2 = new nc();
            ncVar2.YFl(optJSONObject);
            ncVar2.YFl(this);
            ncVar.YFl(ncVar2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("fail");
        if (optJSONObject2 != null) {
            nc ncVar3 = new nc();
            ncVar3.YFl(optJSONObject2);
            ncVar3.YFl(this);
            ncVar.Sg(ncVar3);
        }
        ncVar.YFl(jSONObject);
        this.SVa.put(Integer.valueOf(i10), ncVar);
    }

    @Override // com.bytedance.adsdk.ugeno.tN
    public int[] YFl(int i10, int i11) {
        if (this.RX > 0.0f) {
            if (this.ww) {
                int size = View.MeasureSpec.getSize(i10);
                float f10 = this.RX;
                if (f10 != 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.JB) {
                int size2 = View.MeasureSpec.getSize(i11);
                float f11 = this.RX;
                if (f11 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.JT != null && !this.agS) {
            this.agS = true;
        }
        return new int[]{i10, i11};
    }

    @Override // com.bytedance.adsdk.ugeno.tN
    public void YFl(int i10, int i11, int i12, int i13) {
        if (this.JT == null || this.f10248dc) {
            return;
        }
        this.f10248dc = true;
    }

    @Override // com.bytedance.adsdk.ugeno.tN
    public void YFl(Canvas canvas, IAnimation iAnimation) {
        DSW dsw = this.ep;
        if (dsw != null) {
            dsw.YFl(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tN
    public void YFl(Canvas canvas) {
        com.bytedance.adsdk.ugeno.YFl.YFl yFl = this.Hjb;
        if (yFl != null) {
            yFl.YFl(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.YoT.Sg
    public void YFl(nc ncVar) {
        YFl<ViewGroup> yFl;
        Sg<T> Sg;
        if (ncVar == null || ncVar.tN() == null || !TextUtils.equals(ncVar.tN().optString("type"), "onDismiss")) {
            return;
        }
        String optString = ncVar.tN().optString("nodeId");
        tN(8);
        this.DSW = (YFl) Sg(this);
        if (TextUtils.isEmpty(optString) || (yFl = this.DSW) == null || (Sg = yFl.Sg(optString)) == null) {
            return;
        }
        Sg.tN(8);
    }
}
