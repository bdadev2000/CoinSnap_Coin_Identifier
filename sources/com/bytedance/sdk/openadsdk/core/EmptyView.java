package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EmptyView extends View implements RCv.zp {
    private ViewTreeObserver.OnGlobalLayoutListener Bj;
    private List<View> COT;

    @Nullable
    private List<View> HWF;
    private zp KS;
    private boolean QR;
    private final Handler YW;
    private final AtomicBoolean dT;
    private View jU;
    private int ku;
    private boolean lMd;
    private final Runnable tG;
    private boolean vDp;
    private boolean zp;

    /* loaded from: classes.dex */
    public interface zp {
        void lMd();

        void zp();

        void zp(View view);

        void zp(boolean z8);
    }

    public EmptyView(Context context, View view) {
        super(KVG.zp());
        this.YW = new com.bytedance.sdk.component.utils.RCv(tG.lMd().getLooper(), this);
        this.dT = new AtomicBoolean(true);
        this.vDp = false;
        this.tG = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.3
            @Override // java.lang.Runnable
            public void run() {
                if (EmptyView.this.KS != null) {
                    EmptyView.this.KS.zp(EmptyView.this.jU);
                }
            }
        };
        this.jU = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.Bj = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!EmptyView.this.vDp) {
                    EmptyView.this.COT();
                    EmptyView.this.jU();
                }
            }
        };
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.QR = false;
        lMd();
        if (this.Bj != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.Bj);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        COT();
        this.QR = true;
        KS();
        zp(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        lMd();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        KS();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        zp zpVar = this.KS;
        if (zpVar != null) {
            zpVar.zp(z8);
        }
    }

    public void setAdType(int i9) {
        this.ku = i9;
    }

    public void setCallback(zp zpVar) {
        this.KS = zpVar;
    }

    public void setNeedCheckingShow(boolean z8) {
        this.lMd = z8;
        if (!z8 && this.zp) {
            COT();
        } else if (z8 && !this.zp) {
            jU();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.COT = list;
    }

    public void setRefCreativeViews(@Nullable List<View> list) {
        this.HWF = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void COT() {
        if (this.zp) {
            this.YW.removeCallbacksAndMessages(null);
            this.zp = false;
        }
    }

    private boolean HWF() {
        View view = this.jU;
        if (view instanceof NativeExpressView) {
            return ((NativeExpressView) view).dQp();
        }
        return true;
    }

    private void KS() {
        zp zpVar;
        if (this.dT.getAndSet(true) || (zpVar = this.KS) == null) {
            return;
        }
        zpVar.lMd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jU() {
        if (!this.lMd || this.zp) {
            return;
        }
        this.zp = true;
        this.YW.sendEmptyMessage(1);
    }

    private void lMd() {
        zp zpVar;
        if (!this.dT.getAndSet(false) || (zpVar = this.KS) == null) {
            return;
        }
        zpVar.zp();
    }

    public void zp() {
        zp(this.COT, (com.bytedance.sdk.openadsdk.core.lMd.KS) null);
        zp(this.HWF, (com.bytedance.sdk.openadsdk.core.lMd.KS) null);
    }

    public void zp(List<View> list, com.bytedance.sdk.openadsdk.core.lMd.KS ks) {
        if (com.bytedance.sdk.component.utils.Bj.lMd(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(ks);
                    view.setOnTouchListener(ks);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        if (message.what == 1 && this.zp) {
            if (HWF() && Lij.zp(this.jU, 20, this.ku)) {
                COT();
                this.vDp = true;
                tG.KS().post(this.tG);
                zp(true);
                return;
            }
            this.YW.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void zp(final boolean z8) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.ku.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (EmptyView.this.Bj != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(EmptyView.this.Bj);
                    } catch (Exception unused) {
                    }
                }
                if (z8) {
                    EmptyView.this.Bj = null;
                }
            }
        });
    }
}
