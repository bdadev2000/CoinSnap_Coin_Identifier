package com.bytedance.sdk.openadsdk.core.widget.YFl;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.pDU.YFl.YFl;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class vc implements bZ.YFl {
    WebView AlY;
    private long Cfr;
    boolean DSW;
    float EH;
    float GA;
    String NjR;
    Wwa Sg;
    boolean Wwa;
    Context YFl;
    float YoT;
    float eT;
    private boolean hQ;
    boolean lG;

    /* renamed from: nc, reason: collision with root package name */
    int f10762nc;
    float pDU;
    long qO;
    boolean qsH;
    long rkt;
    private final Handler YI = new bZ(pDU.Sg().getLooper(), this);
    String tN = "landingpage";

    /* renamed from: vc, reason: collision with root package name */
    int f10763vc = 0;
    private final String Ga = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String dXO = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    YFl bZ = new YFl() { // from class: com.bytedance.sdk.openadsdk.core.widget.YFl.vc.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.vc.YFl
        public void YFl() {
            vc vcVar = vc.this;
            vcVar.qsH = true;
            vcVar.vc();
            vc vcVar2 = vc.this;
            vcVar2.YFl(2, vcVar2.NjR, vcVar2.f10762nc);
        }
    };
    GestureDetector UZM = new GestureDetector(lG.YFl(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.YFl.vc.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            vc.this.lG = true;
            return false;
        }
    });
    int wN = lG.AlY().kA();
    Map<Integer, Long> aIu = new HashMap();
    Map<Integer, Float> wXo = new HashMap();
    Map<Integer, Long> Ne = new HashMap();
    List<Integer> VOe = new ArrayList();

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl();
    }

    public vc(WebView webView, Wwa wwa, Context context) {
        this.Sg = wwa;
        this.AlY = webView;
        this.YFl = context;
    }

    private void AlY(String str) {
        if (DSW()) {
            return;
        }
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.Sg, new YFl.C0137YFl().YFl(this.NjR).Sg(Uri.decode(str)).YFl(), this.tN);
    }

    private boolean DSW() {
        int i10 = this.f10763vc + 1;
        this.f10763vc = i10;
        if (i10 > this.wN) {
            return true;
        }
        if (!"landingpage".equals(this.tN) && !"landingpage_endcard".equals(this.tN) && !"landingpage_split_screen".equals(this.tN) && !"landingpage_direct".equals(this.tN)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qsH() {
        WebBackForwardList copyBackForwardList = this.AlY.copyBackForwardList();
        if (copyBackForwardList != null) {
            this.f10762nc = copyBackForwardList.getCurrentIndex() + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vc() {
        if (this.wXo.get(Integer.valueOf(this.f10762nc)) != null) {
            return;
        }
        float height = this.AlY.getHeight() / GS.tN(this.YFl, this.AlY.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        this.wXo.put(Integer.valueOf(this.f10762nc), Float.valueOf(height));
    }

    private boolean wN() {
        try {
            int i10 = this.f10762nc;
            if (i10 == 2 || i10 == 3) {
                if (!Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.NjR)) {
                    if (Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.NjR)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            YoT.YFl("WebArbitrageBehavior", th2.toString());
            return false;
        }
    }

    public void Sg(String str) {
        this.NjR = str;
        qsH();
        this.aIu.put(Integer.valueOf(this.f10762nc), Long.valueOf(SystemClock.elapsedRealtime()));
        this.Ne.put(Integer.valueOf(this.f10762nc), Long.valueOf(SystemClock.elapsedRealtime()));
        this.hQ = wN();
    }

    public void tN(String str) {
        if (this.DSW) {
            this.Wwa = true;
        }
        if (this.f10762nc == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int indexOf = str.indexOf("query=") + 6;
            int indexOf2 = str.indexOf("&", indexOf);
            if (indexOf < 0 || indexOf2 >= str.length() || indexOf2 <= indexOf) {
                return;
            }
            AlY(str.substring(indexOf, indexOf2));
        }
    }

    public void YFl(String str) {
        this.tN = str;
    }

    public void YFl() {
        Sg(this.f10762nc);
    }

    public void YFl(int i10) {
        float height = (this.AlY.getHeight() + i10) / GS.tN(this.YFl, this.AlY.getContentHeight());
        Float f10 = this.wXo.get(Integer.valueOf(this.f10762nc));
        if (height > (f10 == null ? 0.0f : f10.floatValue())) {
            this.wXo.put(Integer.valueOf(this.f10762nc), Float.valueOf(height));
        }
    }

    public void Sg() {
        this.AlY.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.YFl.vc.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z10) {
                if (!z10) {
                    vc vcVar = vc.this;
                    if (!vcVar.qsH) {
                        vcVar.vc();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - vc.this.Cfr >= 50) {
                            vc vcVar2 = vc.this;
                            vcVar2.YFl(3, vcVar2.NjR, vcVar2.f10762nc);
                            vc.this.Cfr = elapsedRealtime;
                            return;
                        }
                        return;
                    }
                    vcVar.qsH = false;
                }
                if (z10) {
                    vc.this.qsH();
                    vc vcVar3 = vc.this;
                    vcVar3.aIu.put(Integer.valueOf(vcVar3.f10762nc), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    private void AlY() {
        if (DSW()) {
            return;
        }
        com.bytedance.sdk.openadsdk.pDU.YFl.YFl YFl2 = new YFl.C0137YFl().YFl(this.NjR).YFl(this.f10762nc).AlY(this.eT).wN(this.YoT).vc(this.EH).DSW((float) this.qO).YFl();
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = YFl2;
        this.YI.sendMessageDelayed(obtain, 20L);
    }

    private void Sg(int i10) {
        if (DSW() || this.VOe.contains(Integer.valueOf(i10))) {
            return;
        }
        this.VOe.add(Integer.valueOf(i10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.Ne.get(Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.Sg, new YFl.C0137YFl().YFl(this.NjR).YFl(this.f10762nc).nc((float) (elapsedRealtime - (l10 != null ? l10.longValue() : elapsedRealtime))).YFl(), this.tN);
    }

    public YFl tN() {
        return this.bZ;
    }

    private void tN(int i10) {
        if (DSW()) {
            return;
        }
        vc();
        this.DSW = true;
        com.bytedance.sdk.openadsdk.pDU.YFl.YFl YFl2 = new YFl.C0137YFl().YFl(this.NjR).YFl(this.f10762nc).YFl(this.eT).Sg(this.YoT).tN((float) this.qO).tN(i10).YFl();
        try {
            if (this.hQ) {
                WebView.HitTestResult hitTestResult = this.AlY.getHitTestResult();
                YFl2.YFl(hitTestResult.getExtra());
                YFl2.YFl(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message obtain = Message.obtain();
        obtain.what = 200;
        obtain.obj = YFl2;
        this.YI.sendMessageDelayed(obtain, 100L);
    }

    public void YFl(MotionEvent motionEvent) {
        this.UZM.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.eT = motionEvent.getX();
            this.YoT = motionEvent.getY();
            this.rkt = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            tN(2);
        } else {
            this.qO = SystemClock.elapsedRealtime() - this.rkt;
            if (Sg(motionEvent)) {
                AlY();
            } else {
                tN(1);
            }
        }
    }

    private boolean Sg(MotionEvent motionEvent) {
        this.GA = motionEvent.getX();
        float y4 = motionEvent.getY();
        this.pDU = y4;
        float f10 = this.YoT;
        if (y4 - f10 == 0.0f) {
            return false;
        }
        this.EH = y4 - f10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(int i10, String str, int i11) {
        if (DSW()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.aIu.get(Integer.valueOf(i11));
        long longValue = l10 != null ? l10.longValue() : elapsedRealtime;
        Float f10 = this.wXo.get(Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.AlY.tN.tN(this.Sg, new YFl.C0137YFl().YFl(str).YFl(i11).qsH((float) (elapsedRealtime - longValue)).NjR(f10 == null ? 0.0f : f10.floatValue()).Sg(i10).YFl(), this.tN);
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        int i10 = message.what;
        com.bytedance.sdk.openadsdk.pDU.YFl.YFl yFl = (com.bytedance.sdk.openadsdk.pDU.YFl.YFl) message.obj;
        if (i10 == 100) {
            yFl.AlY(this.lG ? 2 : 1);
            com.bytedance.sdk.openadsdk.AlY.tN.AlY(this.Sg, yFl, this.tN);
            this.lG = false;
        } else if (i10 == 200) {
            if (this.Wwa) {
                YFl(1, yFl.tN(), yFl.AlY());
            }
            yFl.tN(this.Wwa ? 1 : 0);
            com.bytedance.sdk.openadsdk.AlY.tN.wN(this.Sg, yFl, this.tN);
            this.DSW = false;
            this.Wwa = false;
        }
    }
}
