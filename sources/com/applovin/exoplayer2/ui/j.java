package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.applovin.impl.b5;
import com.applovin.impl.x2;
import com.applovin.impl.xp;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class j extends FrameLayout implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.ui.a f22645a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f22646b;

    /* renamed from: c, reason: collision with root package name */
    private List f22647c;
    private x2 d;

    /* renamed from: f, reason: collision with root package name */
    private float f22648f;

    /* renamed from: g, reason: collision with root package name */
    private int f22649g;

    /* renamed from: h, reason: collision with root package name */
    private float f22650h;

    /* loaded from: classes2.dex */
    public class a extends WebView {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent me) {
            DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
            return super.dispatchTouchEvent(me);
        }

        @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22652a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f22652a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22652a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22652a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(Context context) {
        this(context, null);
    }

    private static int a(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String b(int i2) {
        return i2 != 1 ? i2 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (!z2 || this.f22647c.isEmpty()) {
            return;
        }
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22647c = Collections.emptyList();
        this.d = x2.f27825g;
        this.f22648f = 0.0533f;
        this.f22649g = 0;
        this.f22650h = 0.08f;
        com.applovin.exoplayer2.ui.a aVar = new com.applovin.exoplayer2.ui.a(context, attributeSet);
        this.f22645a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f22646b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }

    private static String a(x2 x2Var) {
        int i2 = x2Var.d;
        if (i2 == 1) {
            return xp.a("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", c.a(x2Var.e));
        }
        if (i2 == 2) {
            return xp.a("0.1em 0.12em 0.15em %s", c.a(x2Var.e));
        }
        if (i2 != 3) {
            return i2 != 4 ? "unset" : xp.a("-0.05em -0.05em 0.15em %s", c.a(x2Var.e));
        }
        return xp.a("0.06em 0.08em 0.15em %s", c.a(x2Var.e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
    
        if (r8 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013e, code lost:
    
        r10 = com.facebook.appevents.internal.ViewHierarchyConstants.DIMENSION_LEFT_KEY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013f, code lost:
    
        r19 = r10;
        r17 = com.facebook.appevents.internal.ViewHierarchyConstants.DIMENSION_TOP_KEY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        if (r8 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.j.b():void");
    }

    private static String a(b5 b5Var) {
        float f2 = b5Var.f23005r;
        if (f2 == 0.0f) {
            return "";
        }
        int i2 = b5Var.f23004q;
        return xp.a("%s(%.2fdeg)", (i2 == 2 || i2 == 1) ? "skewY" : "skewX", Float.valueOf(f2));
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List list, x2 x2Var, float f2, int i2, float f3) {
        this.d = x2Var;
        this.f22648f = f2;
        this.f22649g = i2;
        this.f22650h = f3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            b5 b5Var = (b5) list.get(i3);
            if (b5Var.d != null) {
                arrayList.add(b5Var);
            } else {
                arrayList2.add(b5Var);
            }
        }
        if (!this.f22647c.isEmpty() || !arrayList2.isEmpty()) {
            this.f22647c = arrayList2;
            b();
        }
        this.f22645a.a(arrayList, x2Var, f2, i2, f3);
        invalidate();
    }

    public void a() {
        this.f22646b.destroy();
    }

    private String a(int i2, float f2) {
        float a2 = h.a(i2, f2, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return a2 == -3.4028235E38f ? "unset" : xp.a("%.2fpx", Float.valueOf(a2 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String a(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i2 = b.f22652a[alignment.ordinal()];
        return i2 != 1 ? i2 != 2 ? "center" : "end" : "start";
    }
}
