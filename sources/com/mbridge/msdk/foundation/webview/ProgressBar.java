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

/* loaded from: classes3.dex */
public class ProgressBar extends View implements c {

    /* renamed from: a, reason: collision with root package name */
    Runnable f16123a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private float f16124c;

    /* renamed from: d, reason: collision with root package name */
    private float f16125d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f16126e;

    /* renamed from: f, reason: collision with root package name */
    private float f16127f;

    /* renamed from: g, reason: collision with root package name */
    private long f16128g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f16129h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f16130i;

    /* renamed from: j, reason: collision with root package name */
    private int f16131j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16132k;
    private boolean l;
    private long m;

    /* renamed from: n, reason: collision with root package name */
    private float f16133n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16134o;

    /* renamed from: p, reason: collision with root package name */
    private c.a f16135p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f16136q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f16137r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f16138s;

    /* renamed from: t, reason: collision with root package name */
    private float f16139t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f16140u;

    /* renamed from: v, reason: collision with root package name */
    private int f16141v;

    /* renamed from: w, reason: collision with root package name */
    private int f16142w;

    /* renamed from: x, reason: collision with root package name */
    private int f16143x;

    /* renamed from: y, reason: collision with root package name */
    private long f16144y;

    public ProgressBar(Context context) {
        super(context);
        this.f16123a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f16128g = 25L;
        this.f16129h = new Handler(Looper.getMainLooper());
        this.f16132k = false;
        this.f16133n = 0.95f;
        this.f16134o = false;
        this.f16137r = new Rect();
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11.l != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005b, code lost:
    
        r7 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004b, code lost:
    
        if (r11.l != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0052, code lost:
    
        if (r11.l != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0059, code lost:
    
        if (r11.l != false) goto L30;
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
    public Bitmap getDrawingCache(boolean z8) {
        return null;
    }

    public float getProgress() {
        return this.b;
    }

    public void initResource(boolean z8) {
        if (!z8 && (this.f16130i != null || this.f16136q != null || this.f16138s != null || this.f16126e != null)) {
            return;
        }
        Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f16130i = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f16130i.getIntrinsicHeight());
        }
        Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f16136q = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f16136q.getIntrinsicHeight());
        }
        this.f16138s = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f16126e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
    }

    @Override // android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f16139t = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f16132k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        Drawable drawable = this.f16130i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f16136q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z8) {
        this.f16134o = z8;
        if (!z8) {
            this.m = System.currentTimeMillis();
        }
    }

    public void setProgress(float f9, boolean z8) {
        if (z8 && f9 >= 1.0f) {
            startEndAnimation();
        }
    }

    public void setProgressBarListener(c.a aVar) {
        this.f16135p = aVar;
    }

    public void setProgressState(int i9) {
        if (i9 != 5) {
            if (i9 != 6) {
                if (i9 != 7) {
                    if (i9 == 8) {
                        this.f16143x = 1;
                        if (this.f16142w == 1) {
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
            this.f16142w = 1;
            if (this.f16143x == 1) {
                startEndAnimation();
            }
            this.f16144y = 0L;
            return;
        }
        this.f16141v = 1;
        this.f16142w = 0;
        this.f16143x = 0;
        this.f16144y = 0L;
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 0) {
            c.a aVar = this.f16135p;
            if (aVar != null) {
                aVar.a(true);
                return;
            }
            return;
        }
        c.a aVar2 = this.f16135p;
        if (aVar2 != null) {
            aVar2.a(false);
        }
    }

    public void setVisible(boolean z8) {
        if (z8) {
            this.l = true;
            this.m = System.currentTimeMillis();
            this.f16125d = 0.0f;
            this.f16144y = 0L;
            this.f16140u = false;
            this.f16127f = 0.0f;
            this.b = 0.0f;
            this.f16139t = getMeasuredWidth();
            this.f16134o = false;
            this.f16141v = 0;
            this.f16142w = 0;
            this.f16143x = 0;
            Drawable drawable = this.f16130i;
            if (drawable != null) {
                this.f16131j = -drawable.getIntrinsicWidth();
            } else {
                this.f16131j = 0;
            }
            Drawable drawable2 = this.f16138s;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.f16126e;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.f16136q;
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
        if (!this.f16140u) {
            this.f16140u = true;
            this.f16127f = 0.0f;
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16123a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f16128g = 25L;
        this.f16129h = new Handler(Looper.getMainLooper());
        this.f16132k = false;
        this.f16133n = 0.95f;
        this.f16134o = false;
        this.f16137r = new Rect();
        setWillNotDraw(false);
    }
}
