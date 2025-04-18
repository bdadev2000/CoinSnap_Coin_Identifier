package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.bZ;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class DSW extends View implements bZ.YFl {
    private View AlY;
    private boolean DSW;
    private final Runnable GA;
    private final Handler NjR;
    private boolean Sg;
    private boolean YFl;
    private boolean YoT;
    private ViewTreeObserver.OnGlobalLayoutListener eT;

    /* renamed from: nc, reason: collision with root package name */
    private final AtomicBoolean f10624nc;
    private int qsH;
    private YFl tN;

    /* renamed from: vc, reason: collision with root package name */
    @Nullable
    private List<View> f10625vc;
    private List<View> wN;

    /* loaded from: classes.dex */
    public interface YFl {
        void Sg();

        void YFl();

        void YFl(View view);

        void YFl(boolean z10);
    }

    public DSW(Context context, View view) {
        super(lG.YFl());
        this.NjR = new com.bytedance.sdk.component.utils.bZ(pDU.Sg().getLooper(), this);
        this.f10624nc = new AtomicBoolean(true);
        this.YoT = false;
        this.GA = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.DSW.3
            @Override // java.lang.Runnable
            public void run() {
                if (DSW.this.tN != null) {
                    DSW.this.tN.YFl(DSW.this.AlY);
                }
            }
        };
        this.AlY = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.eT = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.DSW.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!DSW.this.YoT) {
                    DSW.this.wN();
                    DSW.this.AlY();
                }
            }
        };
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.DSW = false;
        Sg();
        if (this.eT != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.eT);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wN();
        this.DSW = true;
        tN();
        YFl(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        Sg();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        tN();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        YFl yFl = this.tN;
        if (yFl != null) {
            yFl.YFl(z10);
        }
    }

    public void setAdType(int i10) {
        this.qsH = i10;
    }

    public void setCallback(YFl yFl) {
        this.tN = yFl;
    }

    public void setNeedCheckingShow(boolean z10) {
        this.Sg = z10;
        if (!z10 && this.YFl) {
            wN();
        } else if (z10 && !this.YFl) {
            AlY();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.wN = list;
    }

    public void setRefCreativeViews(@Nullable List<View> list) {
        this.f10625vc = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AlY() {
        if (!this.Sg || this.YFl) {
            return;
        }
        this.YFl = true;
        this.NjR.sendEmptyMessage(1);
    }

    private void Sg() {
        YFl yFl;
        if (!this.f10624nc.getAndSet(false) || (yFl = this.tN) == null) {
            return;
        }
        yFl.YFl();
    }

    private void tN() {
        YFl yFl;
        if (this.f10624nc.getAndSet(true) || (yFl = this.tN) == null) {
            return;
        }
        yFl.Sg();
    }

    private boolean vc() {
        View view = this.AlY;
        if (view instanceof com.bytedance.sdk.openadsdk.core.qsH.qO) {
            return ((com.bytedance.sdk.openadsdk.core.qsH.qO) view).EH();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wN() {
        if (this.YFl) {
            this.NjR.removeCallbacksAndMessages(null);
            this.YFl = false;
        }
    }

    public void YFl() {
        YFl(this.wN, (com.bytedance.sdk.openadsdk.core.Sg.tN) null);
        YFl(this.f10625vc, (com.bytedance.sdk.openadsdk.core.Sg.tN) null);
    }

    public void YFl(List<View> list, com.bytedance.sdk.openadsdk.core.Sg.tN tNVar) {
        if (com.bytedance.sdk.component.utils.nc.Sg(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(tNVar);
                    view.setOnTouchListener(tNVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        if (message.what == 1 && this.YFl) {
            if (vc() && pq.YFl(this.AlY, 20, this.qsH)) {
                wN();
                this.YoT = true;
                pDU.tN().post(this.GA);
                YFl(true);
                return;
            }
            this.NjR.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void YFl(final boolean z10) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.DSW.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.DSW.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (DSW.this.eT != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(DSW.this.eT);
                    } catch (Exception unused) {
                    }
                }
                if (z10) {
                    DSW.this.eT = null;
                }
            }
        });
    }
}
