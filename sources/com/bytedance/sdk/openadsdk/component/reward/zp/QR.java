package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.vDp.QR;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class QR implements Handler.Callback, com.bytedance.sdk.openadsdk.YW.QR {
    private static final QR.zp YW = new QR.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.1
        @Override // com.bytedance.sdk.openadsdk.vDp.QR.zp
        public void zp(String str, String str2, Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp(str, str2, th);
        }
    };
    private final Activity Bj;
    private com.bytedance.sdk.openadsdk.vDp.ku FP;
    private rV KVG;
    private boolean RCv;
    private HomeWatcherReceiver cz;
    private volatile boolean dT;
    private boolean ku;
    private boolean ot;
    private boolean ox;
    private final zp rV;
    private final String tG;

    @NonNull
    private final woN vDp;
    private PlayableLoadingView vwr;
    private volatile boolean yRU;
    protected final AtomicBoolean zp = new AtomicBoolean(false);
    private final Handler dQp = new Handler(this);
    boolean lMd = false;
    boolean KS = false;
    long jU = 0;
    int COT = 0;
    int HWF = 0;
    int QR = 0;
    private int woN = 1;
    private boolean pvr = true;
    private final com.bytedance.sdk.openadsdk.YW.jU Lij = new com.bytedance.sdk.openadsdk.YW.jU() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.8
        @Override // com.bytedance.sdk.openadsdk.YW.jU
        public void lMd() {
        }

        @Override // com.bytedance.sdk.openadsdk.YW.jU
        public void zp(int i9) {
        }

        @Override // com.bytedance.sdk.openadsdk.YW.jU
        public void zp() {
            if (!QR.this.rV.oB.isFinishing() && QR.this.rV.zp.NJ() && cz.YW(QR.this.rV.zp)) {
                QR.this.dQp.removeMessages(800);
                QR.this.dQp.sendMessage(QR.zp(1, 0));
            }
        }
    };

    public QR(zp zpVar) {
        this.rV = zpVar;
        this.Bj = zpVar.oB;
        this.tG = zpVar.QR;
        this.vDp = zpVar.zp;
    }

    @NonNull
    private static com.bytedance.sdk.openadsdk.vDp.jU FP() {
        String HWF = com.bytedance.sdk.openadsdk.common.zp.HWF();
        HWF.getClass();
        char c9 = 65535;
        switch (HWF.hashCode()) {
            case 1653:
                if (HWF.equals("2g")) {
                    c9 = 0;
                    break;
                }
                break;
            case 1684:
                if (HWF.equals("3g")) {
                    c9 = 1;
                    break;
                }
                break;
            case 1715:
                if (HWF.equals("4g")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1746:
                if (HWF.equals("5g")) {
                    c9 = 3;
                    break;
                }
                break;
            case 3649301:
                if (HWF.equals("wifi")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_2G;
            case 1:
                return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_3G;
            case 2:
                return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_4G;
            case 3:
                return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_5G;
            case 4:
                return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_WIFI;
            default:
                return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_UNKNOWN;
        }
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.vDp.jU cz() {
        return FP();
    }

    private void ot() {
        this.vwr = (PlayableLoadingView) this.Bj.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.nz);
    }

    private String ox() {
        String str;
        String str2;
        String Gzh = KVG.jU().Gzh();
        if (!TextUtils.isEmpty(Gzh) && this.vDp.Vjb() != null) {
            String lMd = this.vDp.Vjb().lMd();
            double jU = this.vDp.Vjb().jU();
            int COT = this.vDp.Vjb().COT();
            if (this.vDp.BO() != null && !TextUtils.isEmpty(this.vDp.BO().zp())) {
                str = this.vDp.BO().zp();
            } else {
                str = "";
            }
            String fgJ = this.vDp.fgJ();
            String KS = this.vDp.Vjb().KS();
            String zp = this.vDp.Vjb().zp();
            String lMd2 = this.vDp.Vjb().lMd();
            String rCC = this.vDp.rCC();
            StringBuilder sb = new StringBuilder("appname=");
            sb.append(URLEncoder.encode(lMd));
            sb.append("&stars=");
            sb.append(jU);
            sb.append("&comments=");
            sb.append(COT);
            sb.append("&icon=");
            sb.append(URLEncoder.encode(str));
            sb.append("&downloading=true&id=");
            sb.append(URLEncoder.encode(fgJ));
            sb.append("&packageName=");
            sb.append(URLEncoder.encode(KS));
            sb.append("&downloadUrl=");
            sb.append(URLEncoder.encode(zp));
            sb.append("&name=");
            sb.append(URLEncoder.encode(lMd2));
            sb.append("&orientation=");
            if (this.woN == 1) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            sb.append(str2);
            sb.append("&apptitle=");
            sb.append(URLEncoder.encode(rCC));
            return Gzh + "?" + ((Object) sb);
        }
        return Gzh;
    }

    private boolean yRU() {
        if (this.vwr == null) {
            return false;
        }
        if (this.vDp.NJ() && cz.Bj(this.vDp)) {
            this.vwr.lMd();
            return true;
        }
        this.vwr.zp();
        return false;
    }

    public int Bj() {
        return this.HWF;
    }

    public com.bytedance.sdk.openadsdk.YW.jU KVG() {
        return this.Lij;
    }

    public void QR() {
        if (this.jU > 0) {
            return;
        }
        this.jU = System.currentTimeMillis();
        Handler handler = this.dQp;
        handler.sendMessage(handler.obtainMessage(900, Bj(), 0));
        KS(true);
    }

    public void YW() {
        int i9;
        if (this.vwr.isShown()) {
            return;
        }
        PlayableLoadingView playableLoadingView = this.vwr;
        if (playableLoadingView != null) {
            playableLoadingView.lMd();
            if (this.rV.si.ku() != null) {
                i9 = this.rV.si.ku().getProgress();
            } else {
                i9 = 0;
            }
            this.vwr.setProgress(i9);
        }
        com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
        if (kuVar != null) {
            kuVar.QUv();
        }
    }

    public void dQp() {
        this.dQp.removeMessages(900);
        this.dQp.removeMessages(600);
    }

    public boolean dT() {
        return this.dT;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        PlayableLoadingView playableLoadingView;
        rV rVVar;
        int i9 = message.what;
        if (i9 == 900) {
            if (!this.dT || !cz.Bj(this.rV.zp)) {
                return true;
            }
            int i10 = message.arg1;
            if (i10 > 0) {
                this.rV.Rh.jU(true);
                int jU = this.rV.ffE.jU(i10);
                if (jU == i10) {
                    this.rV.Rh.zp(String.valueOf(i10), null);
                } else if (jU > 0) {
                    this.rV.Rh.zp(String.valueOf(i10), String.format(com.bytedance.sdk.component.utils.cz.zp(this.rV.oB.getApplicationContext(), "tt_skip_ad_time_text"), Integer.valueOf(jU)));
                } else if (woN()) {
                    this.rV.cW.set(true);
                    this.rV.Vjb.KVG();
                } else {
                    this.rV.Rh.zp(String.valueOf(i10), com.bytedance.sdk.component.utils.cz.zp(this.rV.oB.getApplicationContext(), "tt_txt_skip"));
                    this.rV.Rh.COT(true);
                }
                Message obtain = Message.obtain();
                obtain.what = 900;
                obtain.arg1 = i10 - 1;
                this.dQp.sendMessageDelayed(obtain, 1000L);
                this.rV.ffE.COT(i10);
            } else {
                if (cz.KS(this.vDp) && (!cz.KVG(this.vDp) || !this.rV.ffE.woN())) {
                    this.rV.Rh.KS();
                    this.rV.Rh.COT(true);
                } else {
                    this.rV.Rh.jU(false);
                    this.rV.cW.set(true);
                    this.rV.Vjb.KVG();
                }
                if (!this.ku) {
                    this.ox = true;
                }
            }
            this.rV.oB.dT();
        } else {
            if (i9 != 800 || ((playableLoadingView = this.vwr) != null && playableLoadingView.KS())) {
                return true;
            }
            JSONObject jSONObject = new JSONObject();
            long j7 = 0;
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i11 = message.arg2;
                if (i11 != 0) {
                    jSONObject.put("remove_loading_page_reason", i11);
                }
                String COT = cz.COT(this.vDp);
                zp zpVar = this.rV;
                if (zpVar != null && (rVVar = zpVar.si) != null) {
                    String ot = rVVar.ot();
                    if (!TextUtils.isEmpty(ot)) {
                        COT = ot;
                    }
                }
                jSONObject.put("playable_url", COT);
                PlayableLoadingView playableLoadingView2 = this.vwr;
                if (playableLoadingView2 != null) {
                    j7 = playableLoadingView2.getDisplayDuration();
                }
                jSONObject.put("duration", j7);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.RFPM", "handleMessage json error", e4);
            }
            long j9 = j7;
            zp zpVar2 = this.rV;
            com.bytedance.sdk.openadsdk.lMd.KS.zp(zpVar2.zp, zpVar2.oB.zp, "remove_loading_page", jSONObject, j9);
            this.dQp.removeMessages(800);
            if (!this.Bj.isFinishing()) {
                this.rV.ffE.ku();
            }
        }
        return true;
    }

    public void ku() {
        rV rVVar;
        com.bytedance.sdk.openadsdk.utils.Bj bj;
        if (!cz.KS(this.vDp) && this.vwr.isShown() && (bj = this.rV.fs) != null) {
            bj.zp(Bj() * 1000);
        }
        if (cz.vDp(this.vDp) && this.vwr.isShown()) {
            zp zpVar = this.rV;
            zpVar.gH.zp(zpVar.Vjb);
        }
        PlayableLoadingView playableLoadingView = this.vwr;
        if (playableLoadingView != null) {
            playableLoadingView.zp();
        }
        if (!this.zp.getAndSet(true) && cz.lMd(this.vDp) && cz.KVG(this.vDp) && (rVVar = this.rV.si) != null && !rVVar.fRl()) {
            if (cz.Bj(this.rV.zp)) {
                zp zpVar2 = this.rV;
                zp(zpVar2.dQp, zpVar2.zp, zpVar2.oB.dQp());
                QR();
                this.rV.oB.lMd();
            }
            this.rV.gH.zp(false);
            this.rV.si.WNy();
            this.yRU = true;
            this.rV.Rh.KS(false);
            this.rV.aax.zp(true);
            this.rV.jU = true;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_event", "PL_sdk_page_show");
                jSONObject.put("playable_ts", System.currentTimeMillis());
                String COT = cz.COT(this.vDp);
                String ot = this.rV.si.ot();
                if (!TextUtils.isEmpty(ot)) {
                    COT = ot;
                }
                jSONObject.put("playable_url", COT);
                jSONObject.put("playable_sdk_version", "6.6.0");
                jSONObject.put("playable_network_type", FP());
                jSONObject.put("render_type", 2);
            } catch (JSONException unused) {
            }
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.vDp, this.tG, "playable_track", jSONObject);
            if (cz.vDp(this.vDp)) {
                this.dQp.removeMessages(900);
                this.rV.Rh.jU(false);
                RCv rCv = this.rV.qtv;
                if (rCv != null) {
                    rCv.removeMessages(1);
                    this.rV.qtv.sendEmptyMessageDelayed(600, 1000L);
                }
            }
        }
    }

    public boolean pvr() {
        PlayableLoadingView playableLoadingView = this.vwr;
        if (playableLoadingView != null && playableLoadingView.isShown()) {
            return true;
        }
        return false;
    }

    public void rV() {
        com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
        if (kuVar != null) {
            kuVar.lMd(false);
        }
        this.dQp.removeMessages(900);
    }

    public void tG() {
        if (this.FP != null && WNy.jU(this.rV.si.ku())) {
            this.FP.lMd(true);
        }
    }

    public int vDp() {
        return this.COT;
    }

    public boolean vwr() {
        return this.ox;
    }

    public boolean woN() {
        return this.yRU;
    }

    public void COT() {
        if (this.RCv) {
            return;
        }
        this.RCv = true;
        KS(false);
        zp(this.Bj.getApplicationContext());
        com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
        if (kuVar != null) {
            kuVar.fRl();
        }
        this.dQp.removeCallbacksAndMessages(null);
        DeviceUtils.AudioInfoReceiver.lMd(this);
    }

    public void HWF() {
        try {
            HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
            this.cz = homeWatcherReceiver;
            homeWatcherReceiver.zp(new HomeWatcherReceiver.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.7
                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.zp
                public void lMd() {
                    QR.this.KS = true;
                }

                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.zp
                public void zp() {
                    QR.this.KS = true;
                }
            });
            this.Bj.getApplicationContext().registerReceiver(this.cz, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable unused) {
        }
    }

    public void KS() {
        this.lMd = true;
    }

    public boolean jU() {
        return this.lMd;
    }

    public void lMd(int i9) {
        if (i9 == 5) {
            this.ku = true;
            if (cz.KVG(this.vDp)) {
                this.dQp.removeMessages(900);
                this.rV.qtv.sendEmptyMessage(600);
            }
        }
        this.dQp.sendMessage(zp(i9, 0));
    }

    public static Message zp(int i9, int i10) {
        Message obtain = Message.obtain();
        obtain.what = 800;
        obtain.arg1 = i9;
        if (i9 == 3) {
            obtain.arg2 = i10;
        }
        return obtain;
    }

    public void KS(int i9) {
        PlayableLoadingView playableLoadingView = this.vwr;
        if (playableLoadingView != null) {
            playableLoadingView.setProgress(i9);
        }
    }

    public int jU(int i9) {
        return this.QR - (this.HWF - i9);
    }

    public void jU(boolean z8) {
        com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
        if (kuVar != null) {
            kuVar.lMd(z8);
        }
    }

    public void KS(boolean z8) {
        this.dT = z8;
        if (z8) {
            return;
        }
        this.dQp.removeMessages(900);
    }

    public void HWF(int i9) {
        this.COT = i9;
    }

    public void HWF(boolean z8) {
        if (!z8 || this.rV.ffE.woN()) {
            return;
        }
        boolean Bj = cz.Bj(this.vDp);
        if ((Bj || cz.KVG(this.vDp)) && this.vDp.NJ() && !cz.YW(this.vDp)) {
            Handler handler = this.dQp;
            handler.sendMessageDelayed(handler.obtainMessage(800, 0, 0), 1000L);
        }
        if (Bj) {
            this.rV.ffE.lMd();
            this.rV.si.lMd(true);
            this.rV.si.KS(true);
            com.bytedance.sdk.openadsdk.lMd.KS.KS(this.rV.zp, this.tG, "py_loading_success", (JSONObject) null);
        }
    }

    public void KS(String str) {
        com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
        if (kuVar != null) {
            kuVar.QR(str);
        }
    }

    public void lMd() {
        if (this.zp.getAndSet(true)) {
            return;
        }
        this.KVG.YhE();
        if (cz.KS(this.vDp)) {
            this.KVG.HWF();
        }
    }

    public void zp() {
        if (this.ot) {
            return;
        }
        this.ot = true;
        zp zpVar = this.rV;
        this.KVG = zpVar.si;
        this.woN = zpVar.dT;
        ot();
        if (cz.lMd(this.vDp)) {
            DeviceUtils.AudioInfoReceiver.zp(this);
        }
        if (yRU() && cz.Bj(this.vDp) && cz.YW(this.vDp)) {
            Handler handler = this.dQp;
            handler.sendMessageDelayed(handler.obtainMessage(800, 2, cz.zp(2)), cz.tG(this.vDp) * 1000);
        }
    }

    public void COT(int i9) {
        this.COT = i9 - 1;
    }

    public void COT(boolean z8) {
        com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
        if (kuVar != null) {
            kuVar.zp(z8);
        }
    }

    public void lMd(boolean z8) {
        if (z8) {
            try {
                if (!TextUtils.isEmpty(this.KVG.ot()) && this.KVG.cz() != 0) {
                    com.bytedance.sdk.openadsdk.dT.KS.zp().zp(this.KVG.ot(), this.KVG.cz(), this.KVG.FP());
                }
            } catch (Throwable unused) {
            }
        }
        if (z8) {
            try {
                if (TextUtils.isEmpty(this.KVG.ot())) {
                    return;
                }
                com.bytedance.sdk.openadsdk.dT.KS.zp().lMd(this.KVG.ot());
            } catch (Throwable unused2) {
            }
        }
    }

    public void lMd(String str) {
        com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
        if (kuVar != null) {
            kuVar.ku(str);
        }
        if (woN()) {
            this.rV.si.jU(true);
            this.rV.aax.zp(true);
            this.rV.jU = true;
        }
    }

    public void zp(final com.bytedance.sdk.openadsdk.YW.COT cot, boolean z8) {
        com.bytedance.sdk.openadsdk.dT.lMd lmd;
        com.bytedance.sdk.component.zp.woN zp;
        com.bytedance.sdk.openadsdk.vDp.ku jU;
        if (cz.lMd(this.vDp)) {
            if (com.bytedance.sdk.openadsdk.core.ku.lMd().woN()) {
                com.bytedance.sdk.openadsdk.vDp.QR.zp(YW);
            }
            com.bytedance.sdk.openadsdk.vDp.zp zpVar = new com.bytedance.sdk.openadsdk.vDp.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.2
                @Override // com.bytedance.sdk.openadsdk.vDp.zp
                public void lMd() {
                    QR.this.rV.si.dT().KS(true);
                    com.bytedance.sdk.openadsdk.YW.COT cot2 = cot;
                    if (cot2 != null) {
                        cot2.zp();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.vDp.zp
                public void zp(int i9, String str) {
                    super.zp(i9, str);
                    if (QR.this.vwr == null || !QR.this.vwr.isShown()) {
                        return;
                    }
                    QR.this.dQp.sendMessage(QR.zp(3, cz.zp(i9)));
                }

                @Override // com.bytedance.sdk.openadsdk.vDp.zp
                public com.bytedance.sdk.openadsdk.vDp.jU zp() {
                    return QR.cz();
                }

                @Override // com.bytedance.sdk.openadsdk.vDp.zp
                public void zp(JSONObject jSONObject) {
                    com.bytedance.sdk.openadsdk.lMd.KS.lMd(QR.this.vDp, QR.this.tG, "playable_track", jSONObject);
                }
            };
            com.bytedance.sdk.openadsdk.vDp.KS ks = new com.bytedance.sdk.openadsdk.vDp.KS() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.3
                @Override // com.bytedance.sdk.openadsdk.vDp.KS
                public void zp(String str, JSONObject jSONObject) {
                    QR.this.rV.si.dT().zp(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(BidResponsedEx.KEY_CID, this.vDp.fgJ());
                jSONObject.put("log_extra", this.vDp.GP());
                jU = com.bytedance.sdk.openadsdk.vDp.ku.zp(KVG.zp(), this.rV.si.ku().getWebView(), ks, zpVar).HWF(this.rV.si.ot()).COT(com.bytedance.sdk.openadsdk.common.zp.zp(KVG.zp())).zp(com.bytedance.sdk.openadsdk.common.zp.zp()).KS(jSONObject).zp("sdkEdition", com.bytedance.sdk.openadsdk.common.zp.KS()).lMd(com.bytedance.sdk.openadsdk.common.zp.COT()).jU(com.bytedance.sdk.openadsdk.common.zp.jU()).KS(false).zp(z8).zp(cz.tG(this.vDp)).lMd(cz.tG(this.vDp)).jU(cz.Bj(this.vDp));
                this.FP = jU;
            } catch (Exception unused) {
                if (this.FP == null) {
                    lmd = new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.4
                        @Override // com.bytedance.sdk.openadsdk.dT.lMd
                        public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("PlayablePlugin_init").lMd(jSONObject2.toString());
                        }
                    };
                }
            } catch (Throwable th) {
                if (this.FP == null) {
                    com.bytedance.sdk.openadsdk.dT.KS.zp("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.4
                        @Override // com.bytedance.sdk.openadsdk.dT.lMd
                        public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("PlayablePlugin_init").lMd(jSONObject2.toString());
                        }
                    });
                }
                throw th;
            }
            if (jU == null) {
                lmd = new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.4
                    @Override // com.bytedance.sdk.openadsdk.dT.lMd
                    public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("PlayablePlugin_is_null", true);
                        return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("PlayablePlugin_init").lMd(jSONObject2.toString());
                    }
                };
                com.bytedance.sdk.openadsdk.dT.KS.zp("PlayablePlugin_init", false, lmd);
            }
            if (this.FP != null && !TextUtils.isEmpty(cz.jU(this.vDp))) {
                this.FP.KS(cz.jU(this.vDp));
            }
            com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
            if (kuVar != null) {
                Set<String> Bj = kuVar.Bj();
                final WeakReference weakReference = new WeakReference(this.FP);
                for (String str : Bj) {
                    if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (zp = this.rV.si.dT().zp()) != null) {
                        zp.zp(str, new com.bytedance.sdk.component.zp.COT<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.5
                            @Override // com.bytedance.sdk.component.zp.COT
                            public JSONObject zp(@NonNull JSONObject jSONObject2, @NonNull com.bytedance.sdk.component.zp.HWF hwf) {
                                try {
                                    com.bytedance.sdk.openadsdk.vDp.ku kuVar2 = (com.bytedance.sdk.openadsdk.vDp.ku) weakReference.get();
                                    if (kuVar2 == null) {
                                        return null;
                                    }
                                    return kuVar2.jU(zp(), jSONObject2);
                                } catch (Throwable unused2) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public void zp(DownloadListener downloadListener) {
        SSWebView YW2 = this.KVG.YW();
        if (YW2 == null) {
            return;
        }
        String ox = ox();
        if (TextUtils.isEmpty(ox)) {
            return;
        }
        YW2.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.zp.COT(this.Bj, this.KVG.Bj(), this.vDp.fgJ(), null, false) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.QR.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (QR.this.pvr) {
                    com.bytedance.sdk.openadsdk.lMd.KS.KS(QR.this.vDp, QR.this.tG, "loading_h5_success", (JSONObject) null);
                }
                super.onPageFinished(webView, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                QR.this.pvr = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                QR.this.pvr = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i9, String str, String str2) {
                super.onReceivedError(webView, i9, str, str2);
                QR.this.pvr = false;
            }
        });
        YW2.a_(ox);
        YW2.setDisplayZoomControls(false);
        YW2.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zp.jU(this.KVG.Bj(), this.KVG.vDp()));
        YW2.setDownloadListener(downloadListener);
    }

    public void zp(boolean z8) {
        if (z8) {
            this.KVG.ku().setDomStorageEnabled(true);
        }
    }

    private void zp(Context context) {
        try {
            this.cz.zp(null);
            context.getApplicationContext().unregisterReceiver(this.cz);
        } catch (Throwable unused) {
        }
    }

    public void zp(String str) {
        if (this.KS) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.jU);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.RFPM", "sendPlayableEvent error", e4);
            }
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.vDp, this.tG, str, jSONObject);
            if ("return_foreground".equals(str)) {
                this.KS = false;
            }
        }
    }

    public void zp(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.jU);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.RFPM", "endShow json error", e4);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void zp(com.bytedance.sdk.openadsdk.core.lMd.COT cot) {
        PlayableLoadingView playableLoadingView = this.vwr;
        if (playableLoadingView == null || playableLoadingView.getPlayView() == null) {
            return;
        }
        if (cz.Bj(this.vDp) || cz.KVG(this.vDp)) {
            this.vwr.getPlayView().setOnClickListener(cot);
            this.vwr.getPlayView().setOnTouchListener(cot);
        }
    }

    public void zp(int i9, woN won, boolean z8) {
        if (won == null) {
            return;
        }
        this.HWF = won.iOI();
        this.QR = KVG.jU().zp(String.valueOf(i9), z8);
    }

    @Override // com.bytedance.sdk.openadsdk.YW.QR
    public void zp(int i9) {
        if (!cz.vDp(this.rV.zp) || this.rV.FP.get()) {
            if (cz.Bj(this.rV.zp) || cz.vDp(this.rV.zp)) {
                if (this.rV.aax.lMd()) {
                    zp zpVar = this.rV;
                    boolean z8 = zpVar.jU;
                    zpVar.aax.zp();
                    if (i9 == 0) {
                        this.rV.Rh.lMd(true);
                        this.rV.UPs.lMd(true);
                        return;
                    } else {
                        this.rV.Rh.lMd(false);
                        this.rV.UPs.lMd(false);
                        return;
                    }
                }
                this.rV.aax.zp(-1);
                zp zpVar2 = this.rV;
                boolean z9 = zpVar2.jU;
                zpVar2.aax.zp();
                zp zpVar3 = this.rV;
                if (zpVar3.COT) {
                    if (i9 == 0) {
                        zpVar3.jU = true;
                        zpVar3.Rh.lMd(true);
                        this.rV.UPs.lMd(true);
                    } else {
                        zpVar3.jU = false;
                        zpVar3.Rh.lMd(false);
                        this.rV.UPs.lMd(false);
                    }
                }
            }
        }
    }

    public void zp(int i9, String str, String str2) {
        try {
            com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
            if (kuVar != null) {
                kuVar.zp(i9, str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public void zp(boolean z8, String str, int i9) {
        try {
            com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.FP;
            if (kuVar != null) {
                kuVar.zp(z8, str, i9);
            }
        } catch (Exception unused) {
        }
    }

    public void zp(long j7) {
        Message obtain = Message.obtain();
        obtain.what = 900;
        obtain.arg1 = vDp();
        this.dQp.sendMessageDelayed(obtain, j7);
    }
}
