package com.bytedance.sdk.component.NjR;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.DSW;
import com.bytedance.sdk.component.utils.UZM;
import com.bytedance.sdk.component.utils.bZ;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements View.OnTouchListener, bZ.YFl {
    private final List<Integer> AlY;
    private volatile float DSW;
    private int GA;
    private final int Sg;
    private float Wwa;
    private long YoT;
    private View.OnTouchListener aIu;
    private long eT;
    private float lG;
    private String qO;
    private volatile float qsH;
    private boolean rkt;
    private final int tN;

    /* renamed from: vc, reason: collision with root package name */
    private final Context f10323vc;
    private final int wN;
    private ViewConfiguration wXo;
    private float NjR = -1.0f;

    /* renamed from: nc, reason: collision with root package name */
    private float f10322nc = -1.0f;
    private final Handler EH = new bZ(DSW.YFl().getLooper(), this);
    InterfaceC0077YFl YFl = new InterfaceC0077YFl() { // from class: com.bytedance.sdk.component.NjR.YFl.1
        @Override // com.bytedance.sdk.component.NjR.YFl.InterfaceC0077YFl
        public void YFl() {
            if (YFl.this.NjR == -1.0f && YFl.this.f10322nc == -1.0f && YFl.this.YoT == -1) {
                float unused = YFl.this.NjR;
                float unused2 = YFl.this.f10322nc;
                YFl yFl = YFl.this;
                yFl.NjR = yFl.DSW;
                YFl yFl2 = YFl.this;
                yFl2.f10322nc = yFl2.qsH;
                YFl yFl3 = YFl.this;
                yFl3.YoT = yFl3.eT;
                YFl.this.rkt = true;
            }
            float unused3 = YFl.this.NjR;
            float unused4 = YFl.this.f10322nc;
        }

        @Override // com.bytedance.sdk.component.NjR.YFl.InterfaceC0077YFl
        public void YFl(int i10) {
            YFl.this.GA = i10;
            YFl.this.Sg();
        }
    };
    private int Ne = -1;
    private final List<Integer> pDU = new ArrayList();

    /* renamed from: com.bytedance.sdk.component.NjR.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0077YFl {
        void YFl();

        void YFl(int i10);
    }

    public YFl(Context context, int i10, int i11, List<Integer> list, int i12) {
        this.f10323vc = context;
        if (i10 == -1) {
            this.Sg = UZM.YFl(context);
        } else {
            this.Sg = UZM.YFl(context, i10);
        }
        this.tN = UZM.YFl(context, i11);
        this.AlY = list;
        this.wN = i12;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y4 = motionEvent.getY();
        this.eT = SystemClock.elapsedRealtime();
        this.DSW = x10;
        this.qsH = y4;
        if (action != 0) {
            if (action == 1 && YFl(x10, y4)) {
                int YFl = YFl(this.DSW, this.qsH, this.eT);
                boolean z10 = !this.pDU.contains(Integer.valueOf(this.GA));
                YFl(view, motionEvent, YFl, z10);
                if (z10) {
                    this.pDU.add(Integer.valueOf(this.GA));
                }
                if (YFl == 0) {
                    motionEvent.setAction(3);
                }
            }
        } else {
            this.lG = x10;
            this.Wwa = y4;
        }
        View.OnTouchListener onTouchListener = this.aIu;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg() {
        this.NjR = -1.0f;
        this.f10322nc = -1.0f;
        this.YoT = -1L;
    }

    public void YFl(View.OnTouchListener onTouchListener) {
        this.aIu = onTouchListener;
    }

    public InterfaceC0077YFl YFl() {
        return this.YFl;
    }

    private void YFl(View view, MotionEvent motionEvent, int i10, boolean z10) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        int i11 = 1;
        jSONObject.put("is_interceptor", i10 == 0 ? 1 : 0);
        if (!z10) {
            i11 = 0;
        }
        jSONObject.put("is_first_click", i11);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i10);
        jSONObject.put("current_url_index", this.GA);
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = jSONObject;
        this.EH.sendMessageDelayed(obtain, 200L);
    }

    private boolean YFl(float f10, float f11) {
        if (this.wXo == null) {
            this.wXo = ViewConfiguration.get(this.f10323vc);
        }
        if (this.Ne == -1) {
            this.Ne = this.wXo.getScaledTouchSlop();
        }
        return Math.abs(f10 - this.lG) <= ((float) this.Ne) && Math.abs(f11 - this.Wwa) <= ((float) this.Ne);
    }

    public void YFl(String str) {
        this.qO = str;
    }

    private int YFl(float f10, float f11, long j3) {
        if (this.NjR == -1.0f && this.f10322nc == -1.0f && this.YoT == -1) {
            return 1;
        }
        if (!this.AlY.contains(Integer.valueOf(this.GA))) {
            return 2;
        }
        if (j3 - this.YoT > this.wN) {
            Sg();
            return 3;
        }
        float abs = Math.abs(f10 - this.NjR);
        float abs2 = Math.abs(f11 - this.f10322nc);
        if (abs <= this.Sg / 2.0f && abs2 <= this.tN / 2.0f) {
            return 0;
        }
        Sg();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        int i10 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i10 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.rkt ? 1 : 0);
                    this.rkt = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.NjR.YFl.YFl.YFl().Sg() != null) {
                com.bytedance.sdk.component.NjR.YFl.YFl.YFl().Sg().YFl(this.qO, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
