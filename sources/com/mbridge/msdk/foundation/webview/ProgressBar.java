package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.webview.c;

/* loaded from: classes4.dex */
public class ProgressBar extends View implements c {
    Runnable a;

    /* renamed from: b, reason: collision with root package name */
    private float f13669b;

    /* renamed from: c, reason: collision with root package name */
    private float f13670c;

    /* renamed from: d, reason: collision with root package name */
    private float f13671d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f13672e;

    /* renamed from: f, reason: collision with root package name */
    private float f13673f;

    /* renamed from: g, reason: collision with root package name */
    private long f13674g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f13675h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f13676i;

    /* renamed from: j, reason: collision with root package name */
    private int f13677j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13678k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13679l;

    /* renamed from: m, reason: collision with root package name */
    private long f13680m;

    /* renamed from: n, reason: collision with root package name */
    private float f13681n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13682o;

    /* renamed from: p, reason: collision with root package name */
    private c.a f13683p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f13684q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f13685r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f13686s;

    /* renamed from: t, reason: collision with root package name */
    private float f13687t;
    private boolean u;

    /* renamed from: v, reason: collision with root package name */
    private int f13688v;

    /* renamed from: w, reason: collision with root package name */
    private int f13689w;

    /* renamed from: x, reason: collision with root package name */
    private int f13690x;

    /* renamed from: y, reason: collision with root package name */
    private long f13691y;

    public ProgressBar(Context context) {
        super(context);
        this.a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f13674g = 25L;
        this.f13675h = new Handler(Looper.getMainLooper());
        this.f13678k = false;
        this.f13681n = 0.95f;
        this.f13682o = false;
        this.f13685r = new Rect();
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11.f13679l != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005b, code lost:
    
        r8 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004b, code lost:
    
        if (r11.f13679l != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0052, code lost:
    
        if (r11.f13679l != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0059, code lost:
    
        if (r11.f13679l != false) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public float getProgress() {
        return this.f13669b;
    }

    public void initResource(boolean z10) {
        if (!z10 && (this.f13676i != null || this.f13684q != null || this.f13686s != null || this.f13672e != null)) {
            return;
        }
        Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f13676i = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f13676i.getIntrinsicHeight());
        }
        Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f13684q = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f13684q.getIntrinsicHeight());
        }
        this.f13686s = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f13672e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f13687t = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f13678k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f13676i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f13684q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z10) {
        this.f13682o = z10;
        if (!z10) {
            this.f13680m = System.currentTimeMillis();
        }
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressBarListener(c.a aVar) {
        this.f13683p = aVar;
    }

    public void setProgressState(int i10) {
        if (i10 != 5) {
            if (i10 != 6) {
                if (i10 != 7) {
                    if (i10 == 8) {
                        this.f13690x = 1;
                        if (this.f13689w == 1) {
                            startEndAnimation();
                            return;
                        }
                        return;
                    }
                    return;
                }
                startEndAnimation();
                return;
            }
            this.f13689w = 1;
            if (this.f13690x == 1) {
                startEndAnimation();
            }
            this.f13691y = 0L;
            return;
        }
        this.f13688v = 1;
        this.f13689w = 0;
        this.f13690x = 0;
        this.f13691y = 0L;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            c.a aVar = this.f13683p;
            if (aVar != null) {
                aVar.a(true);
                return;
            }
            return;
        }
        c.a aVar2 = this.f13683p;
        if (aVar2 != null) {
            aVar2.a(false);
        }
    }

    public void setVisible(boolean z10) {
        if (z10) {
            this.f13679l = true;
            this.f13680m = System.currentTimeMillis();
            this.f13671d = 0.0f;
            this.f13691y = 0L;
            this.u = false;
            this.f13673f = 0.0f;
            this.f13669b = 0.0f;
            this.f13687t = getMeasuredWidth();
            this.f13682o = false;
            this.f13688v = 0;
            this.f13689w = 0;
            this.f13690x = 0;
            Drawable drawable = this.f13676i;
            if (drawable != null) {
                this.f13677j = -drawable.getIntrinsicWidth();
            } else {
                this.f13677j = 0;
            }
            Drawable drawable2 = this.f13686s;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.f13672e;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.f13684q;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    public void startEndAnimation() {
        if (!this.u) {
            this.u = true;
            this.f13673f = 0.0f;
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f13674g = 25L;
        this.f13675h = new Handler(Looper.getMainLooper());
        this.f13678k = false;
        this.f13681n = 0.95f;
        this.f13682o = false;
        this.f13685r = new Rect();
        setWillNotDraw(false);
    }
}
