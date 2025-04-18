package com.bytedance.adsdk.ugeno.vc;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.qsH.tN;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public abstract class YFl<T> extends FrameLayout implements tN.AlY {
    private int AlY;
    private int DSW;
    private int EH;
    private boolean GA;
    private float NjR;
    protected com.bytedance.adsdk.ugeno.qsH.tN Sg;
    private C0071YFl Wwa;
    protected List<T> YFl;
    private boolean YoT;
    private final Runnable aIu;
    private boolean eT;
    private com.bytedance.adsdk.ugeno.vc.YFl.YFl lG;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10285nc;
    private int pDU;
    private tN qO;
    private String qsH;
    private int rkt;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10286vc;
    private int wN;
    private final Runnable wXo;

    /* loaded from: classes.dex */
    public class Sg extends com.bytedance.adsdk.ugeno.qsH.tN {
        public Sg(Context context) {
            super(context);
        }

        @Override // com.bytedance.adsdk.ugeno.qsH.tN, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (YFl.this.GA) {
                try {
                    return super.onInterceptTouchEvent(motionEvent);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            }
            return false;
        }

        @Override // com.bytedance.adsdk.ugeno.qsH.tN, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (YFl.this.GA) {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.vc.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0071YFl extends com.bytedance.adsdk.ugeno.qsH.Sg {
        public C0071YFl() {
        }

        @Override // com.bytedance.adsdk.ugeno.qsH.Sg
        public int YFl(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.qsH.Sg
        public boolean YFl(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.qsH.Sg
        public int YFl() {
            if (YFl.this.YoT) {
                return Integer.MAX_VALUE;
            }
            return YFl.this.YFl.size();
        }

        @Override // com.bytedance.adsdk.ugeno.qsH.Sg
        public Object YFl(ViewGroup viewGroup, int i10) {
            View YFl = YFl.this.YFl(i10, AlY.YFl(YFl.this.YoT, i10, YFl.this.YFl.size()));
            viewGroup.addView(YFl);
            return YFl;
        }

        @Override // com.bytedance.adsdk.ugeno.qsH.Sg
        public void YFl(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.qsH.Sg
        public float YFl(int i10) {
            if (YFl.this.NjR <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / YFl.this.NjR;
        }
    }

    public YFl(Context context) {
        super(context);
        this.YFl = new CopyOnWriteArrayList();
        this.tN = 2000;
        this.AlY = 500;
        this.wN = 10;
        this.f10286vc = -1;
        this.DSW = -1;
        this.qsH = Constants.NORMAL;
        this.NjR = 1.0f;
        this.f10285nc = true;
        this.eT = true;
        this.YoT = true;
        this.GA = true;
        this.pDU = 0;
        this.EH = 0;
        this.rkt = 0;
        this.aIu = new Runnable() { // from class: com.bytedance.adsdk.ugeno.vc.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = YFl.this.Sg.getCurrentItem() + 1;
                if (YFl.this.YoT) {
                    if (currentItem >= Integer.MAX_VALUE) {
                        YFl.this.Sg.YFl(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, false);
                        return;
                    } else {
                        YFl.this.Sg.YFl(currentItem, true);
                        return;
                    }
                }
                if (currentItem >= YFl.this.Sg.getAdapter().YFl()) {
                    YFl.this.Sg.YFl(0, false);
                } else {
                    YFl.this.Sg.YFl(currentItem, true);
                }
            }
        };
        this.wXo = new Runnable() { // from class: com.bytedance.adsdk.ugeno.vc.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                if (YFl.this.eT) {
                    int currentItem = YFl.this.Sg.getCurrentItem() + 1;
                    if (YFl.this.YoT) {
                        if (currentItem >= Integer.MAX_VALUE) {
                            YFl.this.Sg.YFl(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, false);
                        } else {
                            YFl.this.Sg.YFl(currentItem, true);
                        }
                        YFl yFl = YFl.this;
                        yFl.postDelayed(yFl.wXo, YFl.this.tN);
                        return;
                    }
                    if (currentItem >= YFl.this.Sg.getAdapter().YFl()) {
                        YFl.this.Sg.YFl(0, false);
                        YFl yFl2 = YFl.this;
                        yFl2.postDelayed(yFl2.wXo, YFl.this.tN);
                    } else {
                        YFl.this.Sg.YFl(currentItem, true);
                        YFl yFl3 = YFl.this;
                        yFl3.postDelayed(yFl3.wXo, YFl.this.tN);
                    }
                }
            }
        };
        this.Sg = new Sg(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.Sg, layoutParams);
        com.bytedance.adsdk.ugeno.vc.YFl.YFl yFl = new com.bytedance.adsdk.ugeno.vc.YFl.YFl(context);
        this.lG = yFl;
        addView(yFl);
    }

    public abstract View DSW(int i10);

    public void NjR(int i10) {
        YFl(this.qsH, this.wN, this.f10286vc, this.DSW, true);
        if (this.Wwa == null) {
            this.Wwa = new C0071YFl();
            this.Sg.YFl((tN.AlY) this);
            this.Sg.setAdapter(this.Wwa);
        }
        if (this.YoT) {
            if (i10 >= Integer.MAX_VALUE) {
                this.Sg.YFl(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, false);
                return;
            } else {
                this.Sg.YFl(i10, true);
                return;
            }
        }
        if (i10 >= 0 && i10 < this.YFl.size()) {
            this.Sg.YFl(i10, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.eT) {
            int action = motionEvent.getAction();
            if (action != 1 && action != 3 && action != 4) {
                if (action == 0) {
                    tN();
                }
            } else {
                Sg();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.bytedance.adsdk.ugeno.qsH.Sg getAdapter() {
        return this.Sg.getAdapter();
    }

    public int getCurrentItem() {
        return this.Sg.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.qsH.tN getViewPager() {
        return this.Sg;
    }

    @Override // com.bytedance.adsdk.ugeno.qsH.tN.AlY
    public void qsH(int i10) {
        boolean z10;
        boolean z11;
        if (this.qO != null) {
            int YFl = AlY.YFl(this.YoT, i10, this.YFl.size());
            tN tNVar = this.qO;
            boolean z12 = this.YoT;
            if (YFl == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (YFl == this.YFl.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            tNVar.YFl(z12, YFl, i10, z10, z11);
        }
        if (this.f10285nc) {
            this.lG.YFl(i10);
        }
    }

    public void setOnPageChangeListener(tN tNVar) {
        this.qO = tNVar;
    }

    public YFl AlY(int i10) {
        this.wN = i10;
        YFl(this.qsH, i10, this.f10286vc, this.DSW, true);
        return this;
    }

    public YFl Sg(boolean z10) {
        this.f10285nc = z10;
        return this;
    }

    public YFl YFl(boolean z10) {
        this.eT = z10;
        Sg();
        return this;
    }

    public YFl tN(int i10) {
        this.lG.setUnSelectedColor(i10);
        return this;
    }

    public YFl vc(int i10) {
        this.DSW = i10;
        YFl(this.qsH, this.wN, this.f10286vc, i10, true);
        return this;
    }

    public YFl wN(int i10) {
        this.f10286vc = i10;
        YFl(this.qsH, this.wN, i10, this.DSW, true);
        return this;
    }

    public YFl Sg(int i10) {
        this.lG.setSelectedColor(i10);
        return this;
    }

    public YFl tN(boolean z10) {
        this.lG.setLoop(z10);
        if (this.YoT != z10) {
            int YFl = AlY.YFl(z10, this.Sg.getCurrentItem(), this.YFl.size());
            this.YoT = z10;
            C0071YFl c0071YFl = this.Wwa;
            if (c0071YFl != null) {
                c0071YFl.tN();
                this.Sg.setCurrentItem(YFl);
            }
        }
        return this;
    }

    public void Sg() {
        removeCallbacks(this.wXo);
        postDelayed(this.wXo, this.tN);
    }

    public YFl YFl(int i10) {
        this.tN = i10;
        Sg();
        return this;
    }

    public YFl YFl(float f10) {
        this.NjR = f10;
        return this;
    }

    public YFl YFl(String str) {
        this.qsH = str;
        YFl(str, this.wN, this.f10286vc, this.DSW, true);
        return this;
    }

    public void YFl(String str, int i10, int i11, int i12, boolean z10) {
        C0071YFl c0071YFl = this.Wwa;
        if (c0071YFl != null) {
            c0071YFl.tN();
        }
        setClipChildren(false);
        this.Sg.setClipChildren(false);
        this.Sg.setPageMargin(i10);
        ViewGroup.LayoutParams layoutParams = this.Sg.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i11 + i10;
            marginLayoutParams.rightMargin = i12 + i10;
            this.Sg.setLayoutParams(layoutParams);
        }
        if (TextUtils.equals(str, "linear")) {
            this.Sg.YFl(false, (tN.wN) new com.bytedance.adsdk.ugeno.vc.Sg.YFl());
        } else {
            this.Sg.YFl(false, (tN.wN) null);
        }
        this.Sg.setOffscreenPageLimit((int) this.NjR);
    }

    public void tN() {
        removeCallbacks(this.wXo);
    }

    public void YFl() {
        int i10;
        YFl(this.qsH, this.wN, this.f10286vc, this.DSW, true);
        if (this.Wwa == null) {
            this.Wwa = new C0071YFl();
            this.Sg.YFl((tN.AlY) this);
            this.Sg.setAdapter(this.Wwa);
        }
        int i11 = this.pDU;
        if (i11 < 0 || i11 >= this.YFl.size()) {
            this.pDU = 0;
        }
        if (this.YoT) {
            i10 = this.pDU + LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        } else {
            i10 = this.pDU;
        }
        this.Sg.YFl(i10, true);
        if (!this.YoT) {
            qsH(i10);
        }
        if (this.eT) {
            Sg();
        }
    }

    public View YFl(int i10, int i11) {
        if (this.YFl.size() == 0) {
            return new View(getContext());
        }
        View DSW = DSW(i11);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (DSW instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (DSW.getParent() instanceof ViewGroup) {
            ((ViewGroup) DSW.getParent()).removeView(DSW);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(DSW, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public YFl<T> YFl(T t5) {
        if (t5 != null) {
            this.YFl.add(t5);
            if (this.f10285nc) {
                this.lG.Sg();
            }
        }
        C0071YFl c0071YFl = this.Wwa;
        if (c0071YFl != null) {
            c0071YFl.tN();
            this.lG.YFl(this.pDU, this.Sg.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.qsH.tN.AlY
    public void YFl(int i10, float f10, int i11) {
        if (this.qO != null) {
            AlY.YFl(this.YoT, i10, this.YFl.size());
        }
    }
}
