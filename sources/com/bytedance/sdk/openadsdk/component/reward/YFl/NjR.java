package com.bytedance.sdk.openadsdk.component.reward.YFl;

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
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.qO.DSW;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NjR implements Handler.Callback, com.bytedance.sdk.openadsdk.YoT.DSW {

    /* renamed from: nc, reason: collision with root package name */
    private static final DSW.YFl f10582nc = new DSW.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.1
        @Override // com.bytedance.sdk.openadsdk.qO.DSW.YFl
        public void YFl(String str, String str2, Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl(str, str2, th2);
        }
    };
    private final YFl EH;

    @NonNull
    private final com.bytedance.sdk.openadsdk.core.model.Wwa GA;
    private com.bytedance.sdk.openadsdk.qO.qsH Ne;
    private boolean NjR;
    private boolean UZM;
    private boolean VOe;
    private boolean YI;
    private final Activity YoT;
    private volatile boolean bZ;
    private volatile boolean eT;
    private Wwa lG;
    private final String pDU;
    private com.bytedance.sdk.openadsdk.core.widget.eT qO;
    private boolean qsH;
    private HomeWatcherReceiver wXo;
    protected final AtomicBoolean YFl = new AtomicBoolean(false);
    private final Handler rkt = new Handler(this);
    boolean Sg = false;
    boolean tN = false;
    long AlY = 0;
    int wN = 0;

    /* renamed from: vc, reason: collision with root package name */
    int f10583vc = 0;
    int DSW = 0;
    private int Wwa = 1;
    private boolean aIu = true;
    private final com.bytedance.sdk.openadsdk.YoT.AlY Ga = new com.bytedance.sdk.openadsdk.YoT.AlY() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.8
        @Override // com.bytedance.sdk.openadsdk.YoT.AlY
        public void Sg() {
        }

        @Override // com.bytedance.sdk.openadsdk.YoT.AlY
        public void YFl(int i10) {
        }

        @Override // com.bytedance.sdk.openadsdk.YoT.AlY
        public void YFl() {
            if (!NjR.this.EH.UI.isFinishing() && NjR.this.EH.Sg.ww() && Ne.rkt(NjR.this.EH.Sg)) {
                NjR.this.rkt.removeMessages(800);
                NjR.this.rkt.sendMessage(NjR.YFl(1, 0));
            }
        }
    };

    public NjR(YFl yFl) {
        this.qsH = true;
        this.EH = yFl;
        this.YoT = yFl.UI;
        this.pDU = yFl.wN;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = yFl.Sg;
        this.GA = wwa;
        this.qsH = Ne.DSW(wwa);
    }

    private boolean Ne() {
        if (this.qO == null) {
            return false;
        }
        if (this.GA.ww() && Ne.Wwa(this.GA)) {
            this.qO.Sg(this.GA, this.Wwa);
            return true;
        }
        this.qO.tN();
        return false;
    }

    private String VOe() {
        String str;
        String str2;
        String YI = com.bytedance.sdk.openadsdk.core.lG.AlY().YI();
        if (!TextUtils.isEmpty(YI) && this.GA.in() != null) {
            String Sg = this.GA.in().Sg();
            double AlY = this.GA.in().AlY();
            int wN = this.GA.in().wN();
            if (this.GA.dGX() != null && !TextUtils.isEmpty(this.GA.dGX().YFl())) {
                str = this.GA.dGX().YFl();
            } else {
                str = "";
            }
            String zz = this.GA.zz();
            String tN = this.GA.in().tN();
            String YFl = this.GA.in().YFl();
            String Sg2 = this.GA.in().Sg();
            String Hjb = this.GA.Hjb();
            StringBuilder sb2 = new StringBuilder("appname=");
            sb2.append(URLEncoder.encode(Sg));
            sb2.append("&stars=");
            sb2.append(AlY);
            sb2.append("&comments=");
            sb2.append(wN);
            sb2.append("&icon=");
            sb2.append(URLEncoder.encode(str));
            sb2.append("&downloading=true&id=");
            sb2.append(URLEncoder.encode(zz));
            sb2.append("&packageName=");
            sb2.append(URLEncoder.encode(tN));
            sb2.append("&downloadUrl=");
            sb2.append(URLEncoder.encode(YFl));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(Sg2));
            sb2.append("&orientation=");
            if (this.Wwa == 1) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            sb2.append(str2);
            sb2.append("&apptitle=");
            sb2.append(URLEncoder.encode(Hjb));
            return YI + "?" + ((Object) sb2);
        }
        return YI;
    }

    @NonNull
    private static com.bytedance.sdk.openadsdk.qO.AlY aIu() {
        String vc2 = com.bytedance.sdk.openadsdk.common.YFl.vc();
        vc2.getClass();
        char c10 = 65535;
        switch (vc2.hashCode()) {
            case 1653:
                if (vc2.equals("2g")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1684:
                if (vc2.equals("3g")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1715:
                if (vc2.equals("4g")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746:
                if (vc2.equals("5g")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3649301:
                if (vc2.equals("wifi")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_2G;
            case 1:
                return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_3G;
            case 2:
                return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_4G;
            case 3:
                return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_5G;
            case 4:
                return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_WIFI;
            default:
                return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_UNKNOWN;
        }
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.qO.AlY qO() {
        return aIu();
    }

    private void wXo() {
        if (!this.qsH) {
            return;
        }
        this.qO = (com.bytedance.sdk.openadsdk.core.widget.eT) this.EH.mB.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Ja);
    }

    public void DSW() {
        int i10;
        if (!this.qsH || this.qO.isShown()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.eT eTVar = this.qO;
        if (eTVar != null) {
            eTVar.Sg(this.GA, this.Wwa);
            if (this.EH.mn.nc() != null) {
                i10 = this.EH.mn.nc().getProgress();
            } else {
                i10 = 0;
            }
            this.qO.setProgress(i10);
        }
        com.bytedance.sdk.openadsdk.qO.qsH qsh = this.Ne;
        if (qsh != null) {
            qsh.Cfr();
        }
    }

    public boolean EH() {
        return this.bZ;
    }

    public void GA() {
        if (!this.qsH) {
            return;
        }
        this.rkt.removeMessages(900);
        this.rkt.removeMessages(600);
    }

    public int NjR() {
        return this.f10583vc;
    }

    public com.bytedance.sdk.openadsdk.qO.qsH Wwa() {
        return this.Ne;
    }

    public void YoT() {
        if (!this.qsH) {
            return;
        }
        com.bytedance.sdk.openadsdk.qO.qsH qsh = this.Ne;
        if (qsh != null) {
            qsh.tN(false);
        }
        this.rkt.removeMessages(900);
    }

    public void eT() {
        if (this.qsH && this.Ne != null && GS.AlY(this.EH.mn.nc())) {
            this.Ne.tN(true);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        com.bytedance.sdk.openadsdk.core.widget.eT eTVar;
        Wwa wwa;
        int i10 = message.what;
        if (i10 == 900) {
            if (!this.eT || !Ne.Wwa(this.EH.Sg)) {
                return true;
            }
            int i11 = message.arg1;
            if (i11 > 0) {
                this.EH.Sco.AlY(true);
                int Sg = this.EH.UZM.Sg(i11);
                if (Sg == i11) {
                    this.EH.Sco.YFl(String.valueOf(i11), null);
                } else if (Sg > 0) {
                    this.EH.Sco.YFl(String.valueOf(i11), String.format(com.bytedance.sdk.component.utils.qO.YFl(this.EH.UI.getApplicationContext(), "tt_skip_ad_time_text"), Integer.valueOf(Sg)));
                } else if (Ne.qsH(this.GA) && !EH()) {
                    this.EH.Sco.YFl(String.valueOf(i11), com.bytedance.sdk.component.utils.qO.YFl(this.EH.UI.getApplicationContext(), "tt_reward_screen_skip_tx"));
                    this.EH.Sco.wN(true);
                } else {
                    this.EH.qO.set(true);
                    this.EH.Vmj.EH();
                }
                Message obtain = Message.obtain();
                obtain.what = 900;
                obtain.arg1 = i11 - 1;
                this.rkt.sendMessageDelayed(obtain, 1000L);
                wN(i11);
            } else {
                if (Ne.qsH(this.GA) && (!Ne.VOe(this.GA) || !this.EH.UZM.DSW())) {
                    this.EH.Sco.tN();
                    this.EH.Sco.wN(true);
                } else {
                    this.EH.Sco.AlY(false);
                    this.EH.qO.set(true);
                    this.EH.Vmj.EH();
                }
                if (!this.NjR) {
                    this.UZM = true;
                }
            }
            this.EH.ZU.pDU();
        } else {
            if (i10 != 800 || ((eTVar = this.qO) != null && (!eTVar.isShown() || this.qO.AlY()))) {
                return true;
            }
            JSONObject jSONObject = new JSONObject();
            long j3 = 0;
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i12 = message.arg2;
                if (i12 != 0) {
                    jSONObject.put("remove_loading_page_reason", i12);
                }
                String YoT = Ne.YoT(this.GA);
                YFl yFl = this.EH;
                if (yFl != null && (wwa = yFl.mn) != null) {
                    String UZM = wwa.UZM();
                    if (!TextUtils.isEmpty(UZM)) {
                        YoT = UZM;
                    }
                }
                jSONObject.put("playable_url", YoT);
                com.bytedance.sdk.openadsdk.core.widget.eT eTVar2 = this.qO;
                if (eTVar2 != null) {
                    j3 = eTVar2.getDisplayDuration();
                }
                jSONObject.put("duration", j3);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFPM", "handleMessage json error", e2);
            }
            YFl yFl2 = this.EH;
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(yFl2.Sg, yFl2.wN, "remove_loading_page", jSONObject, j3);
            this.rkt.removeMessages(800);
            if (!this.YoT.isFinishing()) {
                this.EH.UZM.wN();
            }
        }
        return true;
    }

    public boolean lG() {
        com.bytedance.sdk.openadsdk.core.widget.eT eTVar = this.qO;
        return eTVar != null && eTVar.isShown();
    }

    public int nc() {
        return this.wN;
    }

    public com.bytedance.sdk.openadsdk.YoT.AlY pDU() {
        return this.Ga;
    }

    public boolean qsH() {
        return this.eT;
    }

    public boolean rkt() {
        return this.UZM;
    }

    public void AlY() {
        if (this.qsH) {
            try {
                HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
                this.wXo = homeWatcherReceiver;
                homeWatcherReceiver.YFl(new HomeWatcherReceiver.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.7
                    @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.YFl
                    public void Sg() {
                        NjR.this.tN = true;
                    }

                    @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.YFl
                    public void YFl() {
                        NjR.this.tN = true;
                    }
                });
                this.YoT.getApplicationContext().registerReceiver(this.wXo, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (Throwable unused) {
            }
        }
    }

    public void Sg(int i10) {
        if (this.qsH) {
            if (i10 == 5) {
                this.NjR = true;
                if (Ne.VOe(this.GA)) {
                    this.rkt.removeMessages(900);
                    this.EH.zG.sendEmptyMessage(600);
                }
            }
            this.rkt.sendMessage(YFl(i10, 0));
        }
    }

    public void tN() {
        if (this.qsH && !this.YI) {
            this.YI = true;
            tN(false);
            YFl(this.YoT.getApplicationContext());
            com.bytedance.sdk.openadsdk.qO.qsH qsh = this.Ne;
            if (qsh != null) {
                qsh.Sco();
            }
            this.rkt.removeCallbacksAndMessages(null);
            DeviceUtils.AudioInfoReceiver.Sg(this);
        }
    }

    public void vc() {
        com.bytedance.sdk.openadsdk.qO.qsH qsh;
        com.bytedance.sdk.openadsdk.utils.eT eTVar;
        if (this.qsH) {
            if (!Ne.qsH(this.GA) && this.qO.isShown() && (eTVar = this.EH.Bn) != null) {
                eTVar.YFl(NjR() * 1000);
            }
            if (Ne.qO(this.GA) && this.qO.isShown()) {
                YFl yFl = this.EH;
                yFl.GS.Sg(yFl.Vmj);
            }
            com.bytedance.sdk.openadsdk.core.widget.eT eTVar2 = this.qO;
            if (eTVar2 != null) {
                eTVar2.tN();
            }
            if (this.YFl.getAndSet(true)) {
                return;
            }
            if (this.EH.mn.lu() && (qsh = this.Ne) != null) {
                qsh.YFl(1);
            }
            if (Ne.DSW(this.GA) && Ne.VOe(this.GA)) {
                Wwa wwa = this.EH.mn;
                if (wwa != null && !wwa.lu()) {
                    int i10 = !this.EH.mn.Wwa() ? 2 : 3;
                    com.bytedance.sdk.openadsdk.qO.qsH qsh2 = this.Ne;
                    if (qsh2 != null) {
                        qsh2.YFl(i10);
                    }
                    if (Ne.Wwa(this.EH.Sg)) {
                        YFl yFl2 = this.EH;
                        int i11 = yFl2.f10591vc;
                        com.bytedance.sdk.openadsdk.core.model.Wwa wwa2 = yFl2.Sg;
                        YFl(i11, wwa2, wwa2.TMt());
                        wN();
                        this.EH.ZU.eT();
                    }
                    this.EH.GS.YFl(false);
                    this.EH.mn.GS();
                    this.bZ = true;
                    this.EH.Sco.tN(false);
                    this.EH.pq.YFl(true);
                    this.EH.iY = true;
                    if (Ne.qO(this.GA)) {
                        this.rkt.removeMessages(900);
                        this.EH.Sco.AlY(false);
                        bZ bZVar = this.EH.zG;
                        if (bZVar != null) {
                            bZVar.removeMessages(1);
                            this.EH.zG.sendEmptyMessageDelayed(600, 1000L);
                        }
                    }
                    com.bytedance.sdk.openadsdk.qO.qsH qsh3 = this.Ne;
                    if (qsh3 != null) {
                        qsh3.tN(true);
                        return;
                    }
                    return;
                }
                YFl yFl3 = this.EH;
                yFl3.GS.YFl(yFl3.Vmj);
            }
        }
    }

    public void wN() {
        if (this.qsH && this.AlY <= 0) {
            this.AlY = System.currentTimeMillis();
            Handler handler = this.rkt;
            handler.sendMessage(handler.obtainMessage(900, NjR(), 0));
            tN(true);
        }
    }

    public static Message YFl(int i10, int i11) {
        Message obtain = Message.obtain();
        obtain.what = 800;
        obtain.arg1 = i10;
        if (i10 == 3) {
            obtain.arg2 = i11;
        }
        return obtain;
    }

    public int AlY(int i10) {
        return this.DSW - (this.f10583vc - i10);
    }

    public void YFl() {
        if (this.qsH && !this.VOe) {
            this.VOe = true;
            YFl yFl = this.EH;
            this.lG = yFl.mn;
            this.Wwa = yFl.Cqy;
            wXo();
            if (Ne.DSW(this.GA)) {
                DeviceUtils.AudioInfoReceiver.YFl(this);
            }
            if (Ne() && Ne.Wwa(this.GA) && Ne.rkt(this.GA)) {
                Handler handler = this.rkt;
                handler.sendMessageDelayed(handler.obtainMessage(800, 2, Ne.YFl(2)), Ne.aIu(this.GA) * 1000);
            }
        }
    }

    public void wN(int i10) {
        this.wN = i10 - 1;
    }

    public void AlY(boolean z10) {
        com.bytedance.sdk.openadsdk.qO.qsH qsh;
        if (this.qsH && (qsh = this.Ne) != null) {
            qsh.tN(z10);
        }
    }

    public void Sg() {
        if (this.qsH && !this.YFl.getAndSet(true)) {
            this.lG.Sco();
            if (Ne.qsH(this.GA)) {
                this.lG.DSW();
            }
        }
    }

    public void wN(boolean z10) {
        com.bytedance.sdk.openadsdk.qO.qsH qsh;
        if (this.qsH && (qsh = this.Ne) != null) {
            qsh.YFl(z10);
        }
    }

    public void tN(int i10) {
        com.bytedance.sdk.openadsdk.core.widget.eT eTVar;
        if (this.qsH && (eTVar = this.qO) != null) {
            eTVar.setProgress(i10);
        }
    }

    public void Sg(boolean z10) {
        if (this.qsH) {
            if (z10) {
                try {
                    if (!TextUtils.isEmpty(this.lG.UZM()) && this.lG.VOe() != 0) {
                        com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl(this.lG.UZM(), this.lG.VOe(), this.lG.bZ());
                    }
                } catch (Throwable unused) {
                }
            }
            if (z10) {
                try {
                    if (TextUtils.isEmpty(this.lG.UZM())) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.pDU.tN.YFl().Sg(this.lG.UZM());
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public void tN(boolean z10) {
        if (this.qsH) {
            this.eT = z10;
            if (z10) {
                return;
            }
            this.rkt.removeMessages(900);
        }
    }

    public void tN(String str) {
        com.bytedance.sdk.openadsdk.qO.qsH qsh = this.Ne;
        if (qsh == null || !this.qsH) {
            return;
        }
        qsh.vc(com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(this.GA));
        this.Ne.qsH(str);
    }

    public void Sg(String str) {
        com.bytedance.sdk.openadsdk.qO.qsH qsh = this.Ne;
        if (qsh != null) {
            if (!this.qsH) {
                return;
            }
            qsh.vc(com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(this.GA));
            this.Ne.NjR(str);
        }
        if (EH()) {
            this.EH.mn.AlY(true);
            this.EH.pq.YFl(true);
            this.EH.iY = true;
        }
    }

    public void YFl(final com.bytedance.sdk.openadsdk.YoT.wN wNVar, boolean z10) {
        com.bytedance.sdk.openadsdk.pDU.Sg sg2;
        com.bytedance.sdk.component.YFl.lG YFl;
        com.bytedance.sdk.openadsdk.qO.qsH wN;
        if (this.qsH && Ne.DSW(this.GA) && this.EH.ko) {
            if (com.bytedance.sdk.openadsdk.core.NjR.Sg().lG()) {
                com.bytedance.sdk.openadsdk.qO.DSW.YFl(f10582nc);
            }
            com.bytedance.sdk.openadsdk.qO.YFl yFl = new com.bytedance.sdk.openadsdk.qO.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.2
                @Override // com.bytedance.sdk.openadsdk.qO.YFl
                public void Sg() {
                    NjR.this.EH.mn.YoT().tN(true);
                    com.bytedance.sdk.openadsdk.YoT.wN wNVar2 = wNVar;
                    if (wNVar2 != null) {
                        wNVar2.YFl();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.qO.YFl
                public void YFl(int i10, String str) {
                    super.YFl(i10, str);
                    if (NjR.this.qO == null || !NjR.this.qO.isShown()) {
                        return;
                    }
                    NjR.this.rkt.sendMessage(NjR.YFl(3, Ne.YFl(i10)));
                }

                @Override // com.bytedance.sdk.openadsdk.qO.YFl
                public com.bytedance.sdk.openadsdk.qO.AlY YFl() {
                    return NjR.qO();
                }

                @Override // com.bytedance.sdk.openadsdk.qO.YFl
                public void YFl(JSONObject jSONObject) {
                    com.bytedance.sdk.openadsdk.AlY.tN.Sg(NjR.this.GA, NjR.this.pDU, "playable_track", jSONObject);
                }
            };
            com.bytedance.sdk.openadsdk.qO.tN tNVar = new com.bytedance.sdk.openadsdk.qO.tN() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.3
                @Override // com.bytedance.sdk.openadsdk.qO.tN
                public void YFl(String str, JSONObject jSONObject) {
                    NjR.this.EH.mn.YoT().YFl(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(BidResponsedEx.KEY_CID, this.GA.zz());
                jSONObject.put("log_extra", this.GA.uGS());
                wN = com.bytedance.sdk.openadsdk.qO.qsH.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), this.EH.mn.nc().getWebView(), tNVar, yFl).DSW(this.EH.mn.UZM()).wN(com.bytedance.sdk.openadsdk.common.YFl.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl())).YFl(com.bytedance.sdk.openadsdk.common.YFl.YFl()).tN(jSONObject).YFl("sdkEdition", com.bytedance.sdk.openadsdk.common.YFl.tN()).Sg(com.bytedance.sdk.openadsdk.common.YFl.wN()).AlY(com.bytedance.sdk.openadsdk.common.YFl.AlY()).AlY(false).YFl(z10).YFl(Ne.aIu(this.GA)).Sg(Ne.aIu(this.GA)).wN(Ne.Wwa(this.GA));
                this.Ne = wN;
            } catch (Exception unused) {
                if (this.Ne == null) {
                    sg2 = new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.4
                        @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                        public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("PlayablePlugin_init").Sg(jSONObject2.toString());
                        }
                    };
                }
            } catch (Throwable th2) {
                if (this.Ne == null) {
                    com.bytedance.sdk.openadsdk.pDU.tN.YFl("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.4
                        @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                        public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("PlayablePlugin_init").Sg(jSONObject2.toString());
                        }
                    });
                }
                throw th2;
            }
            if (wN == null) {
                sg2 = new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.4
                    @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                    public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("PlayablePlugin_is_null", true);
                        return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("PlayablePlugin_init").Sg(jSONObject2.toString());
                    }
                };
                com.bytedance.sdk.openadsdk.pDU.tN.YFl("PlayablePlugin_init", false, sg2);
            }
            if (this.Ne != null && !TextUtils.isEmpty(Ne.eT(this.GA))) {
                this.Ne.tN(Ne.eT(this.GA));
            }
            com.bytedance.sdk.openadsdk.qO.qsH qsh = this.Ne;
            if (qsh != null) {
                Set<String> eT = qsh.eT();
                final WeakReference weakReference = new WeakReference(this.Ne);
                for (String str : eT) {
                    if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (YFl = this.EH.mn.YoT().YFl()) != null) {
                        YFl.YFl(str, new com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.5
                            @Override // com.bytedance.sdk.component.YFl.wN
                            public JSONObject YFl(@NonNull JSONObject jSONObject2, @NonNull com.bytedance.sdk.component.YFl.vc vcVar) {
                                try {
                                    com.bytedance.sdk.openadsdk.qO.qsH qsh2 = (com.bytedance.sdk.openadsdk.qO.qsH) weakReference.get();
                                    if (qsh2 == null) {
                                        return null;
                                    }
                                    return qsh2.AlY(YFl(), jSONObject2);
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

    public void vc(int i10) {
        this.wN = i10;
    }

    public void vc(boolean z10) {
        if (this.qsH && z10 && !this.EH.UZM.DSW()) {
            com.bytedance.sdk.openadsdk.qO.qsH qsh = this.Ne;
            if (qsh != null) {
                qsh.YFl(1);
            }
            boolean Wwa = Ne.Wwa(this.GA);
            if ((Wwa || Ne.VOe(this.GA)) && this.GA.ww() && !Ne.rkt(this.GA)) {
                Handler handler = this.rkt;
                handler.sendMessageDelayed(handler.obtainMessage(800, 0, 0), 1000L);
            }
            if (Wwa) {
                this.EH.UZM.qsH();
                this.EH.mn.Sg(true);
                this.EH.mn.tN(true);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), this.EH.Sg, this.pDU, "py_loading_success");
            }
        }
    }

    public void YFl(DownloadListener downloadListener) {
        com.bytedance.sdk.component.NjR.AlY eT;
        if (this.qsH && (eT = this.lG.eT()) != null) {
            String VOe = VOe();
            if (TextUtils.isEmpty(VOe)) {
                return;
            }
            eT.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.wN(this.YoT, this.lG.GA(), this.GA.zz(), null, false) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.NjR.6
                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    if (NjR.this.aIu) {
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), NjR.this.GA, NjR.this.pDU, "loading_h5_success");
                    }
                    super.onPageFinished(webView, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    NjR.this.aIu = false;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    NjR.this.aIu = false;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i10, String str, String str2) {
                    super.onReceivedError(webView, i10, str, str2);
                    NjR.this.aIu = false;
                }
            });
            eT.a_(VOe);
            eT.setDisplayZoomControls(false);
            eT.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.lG.GA(), this.lG.pDU()));
            eT.setDownloadListener(downloadListener);
        }
    }

    public void YFl(boolean z10) {
        if (this.qsH && z10) {
            this.lG.nc().setDomStorageEnabled(true);
        }
    }

    private void YFl(Context context) {
        if (this.qsH) {
            try {
                this.wXo.YFl(null);
                context.getApplicationContext().unregisterReceiver(this.wXo);
            } catch (Throwable unused) {
            }
        }
    }

    public void YFl(String str) {
        if (this.qsH && this.tN) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.AlY);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFPM", "sendPlayableEvent error", e2);
            }
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.GA, this.pDU, str, jSONObject);
            if ("return_foreground".equals(str)) {
                this.tN = false;
            }
        }
    }

    public void YFl(JSONObject jSONObject) {
        if (this.qsH && jSONObject != null) {
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.AlY);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFPM", "endShow json error", e2);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.wN wNVar) {
        com.bytedance.sdk.openadsdk.core.widget.eT eTVar;
        if (!this.qsH || (eTVar = this.qO) == null || eTVar.getDownloadButton() == null) {
            return;
        }
        if (Ne.Wwa(this.GA) || Ne.VOe(this.GA)) {
            this.qO.getDownloadButton().setOnClickListener(wNVar);
            this.qO.getDownloadButton().setOnTouchListener(wNVar);
        }
    }

    public void YFl(int i10, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, boolean z10) {
        if (this.qsH && wwa != null) {
            this.f10583vc = wwa.VJb();
            this.DSW = com.bytedance.sdk.openadsdk.core.lG.AlY().YFl(String.valueOf(i10), z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YoT.DSW
    public void YFl(int i10) {
        if (this.qsH) {
            if (!Ne.qO(this.EH.Sg) || this.EH.f10590nc.get()) {
                if (Ne.Wwa(this.EH.Sg) || Ne.qO(this.EH.Sg)) {
                    if (this.EH.pq.Sg()) {
                        YFl yFl = this.EH;
                        boolean z10 = yFl.iY;
                        yFl.pq.YFl();
                        if (i10 == 0) {
                            this.EH.Sco.Sg(true);
                            this.EH.VOe.Sg(true);
                            return;
                        } else {
                            this.EH.Sco.Sg(false);
                            this.EH.VOe.Sg(false);
                            return;
                        }
                    }
                    this.EH.pq.YFl(-1);
                    YFl yFl2 = this.EH;
                    boolean z11 = yFl2.iY;
                    yFl2.pq.YFl();
                    YFl yFl3 = this.EH;
                    if (yFl3.Bh) {
                        if (i10 == 0) {
                            yFl3.iY = true;
                            yFl3.Sco.Sg(true);
                            this.EH.VOe.Sg(true);
                        } else {
                            yFl3.iY = false;
                            yFl3.Sco.Sg(false);
                            this.EH.VOe.Sg(false);
                        }
                    }
                }
            }
        }
    }

    public void YFl(int i10, String str, String str2) {
        if (this.qsH) {
            try {
                com.bytedance.sdk.openadsdk.qO.qsH qsh = this.Ne;
                if (qsh != null) {
                    qsh.vc(com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(this.GA));
                    this.Ne.YFl(i10, str, str2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void YFl(boolean z10, String str, int i10) {
        if (this.qsH) {
            try {
                com.bytedance.sdk.openadsdk.qO.qsH qsh = this.Ne;
                if (qsh != null) {
                    qsh.vc(com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(this.GA));
                    this.Ne.YFl(z10, str, i10);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void YFl(long j3) {
        if (this.qsH) {
            Message obtain = Message.obtain();
            obtain.what = 900;
            obtain.arg1 = nc();
            this.rkt.sendMessageDelayed(obtain, j3);
        }
    }
}
