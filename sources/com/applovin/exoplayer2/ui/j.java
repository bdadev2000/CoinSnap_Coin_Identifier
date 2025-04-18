package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.applovin.impl.v2;
import com.applovin.impl.yp;
import com.applovin.impl.z4;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j extends FrameLayout implements SubtitleView.a {
    private final com.applovin.exoplayer2.ui.a a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f3553b;

    /* renamed from: c, reason: collision with root package name */
    private List f3554c;

    /* renamed from: d, reason: collision with root package name */
    private v2 f3555d;

    /* renamed from: f, reason: collision with root package name */
    private float f3556f;

    /* renamed from: g, reason: collision with root package name */
    private int f3557g;

    /* renamed from: h, reason: collision with root package name */
    private float f3558h;

    /* loaded from: classes.dex */
    public class a extends WebView {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
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

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(Context context) {
        this(context, null);
    }

    private static int a(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f3554c.isEmpty()) {
            b();
        }
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3554c = Collections.emptyList();
        this.f3555d = v2.f8452g;
        this.f3556f = 0.0533f;
        this.f3557g = 0;
        this.f3558h = 0.08f;
        com.applovin.exoplayer2.ui.a aVar = new com.applovin.exoplayer2.ui.a(context, attributeSet);
        this.a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f3553b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }

    private static String a(v2 v2Var) {
        int i10 = v2Var.f8455d;
        if (i10 == 1) {
            return yp.a("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", c.a(v2Var.f8456e));
        }
        if (i10 == 2) {
            return yp.a("0.1em 0.12em 0.15em %s", c.a(v2Var.f8456e));
        }
        if (i10 != 3) {
            return i10 != 4 ? "unset" : yp.a("-0.05em -0.05em 0.15em %s", c.a(v2Var.f8456e));
        }
        return yp.a("0.06em 0.08em 0.15em %s", c.a(v2Var.f8456e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0143, code lost:
    
        if (r13 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0148, code lost:
    
        r21 = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        r23 = "top";
        r13 = 2;
        r22 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0146, code lost:
    
        if (r13 != 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.j.b():void");
    }

    private static String a(z4 z4Var) {
        float f10 = z4Var.f9336r;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = z4Var.f9335q;
        return yp.a("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List list, v2 v2Var, float f10, int i10, float f11) {
        this.f3555d = v2Var;
        this.f3556f = f10;
        this.f3557g = i10;
        this.f3558h = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            z4 z4Var = (z4) list.get(i11);
            if (z4Var.f9323d != null) {
                arrayList.add(z4Var);
            } else {
                arrayList2.add(z4Var);
            }
        }
        if (!this.f3554c.isEmpty() || !arrayList2.isEmpty()) {
            this.f3554c = arrayList2;
            b();
        }
        this.a.a(arrayList, v2Var, f10, i10, f11);
        invalidate();
    }

    public void a() {
        this.f3553b.destroy();
    }

    private String a(int i10, float f10) {
        float a10 = h.a(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return a10 == -3.4028235E38f ? "unset" : yp.a("%.2fpx", Float.valueOf(a10 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String a(Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i10 = b.a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? TtmlNode.CENTER : TtmlNode.END : "start";
    }
}
