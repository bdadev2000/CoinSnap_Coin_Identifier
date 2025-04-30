package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.applovin.impl.C0768v2;
import com.applovin.impl.yp;
import com.applovin.impl.z4;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class j extends FrameLayout implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.ui.a f6346a;
    private final WebView b;

    /* renamed from: c, reason: collision with root package name */
    private List f6347c;

    /* renamed from: d, reason: collision with root package name */
    private C0768v2 f6348d;

    /* renamed from: f, reason: collision with root package name */
    private float f6349f;

    /* renamed from: g, reason: collision with root package name */
    private int f6350g;

    /* renamed from: h, reason: collision with root package name */
    private float f6351h;

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

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6353a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f6353a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6353a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6353a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(Context context) {
        this(context, null);
    }

    private static int a(int i9) {
        if (i9 != 1) {
            return i9 != 2 ? 0 : -100;
        }
        return -50;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
    
        if (r8 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013e, code lost:
    
        r10 = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013f, code lost:
    
        r19 = r10;
        r17 = "top";
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

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        if (z8 && !this.f6347c.isEmpty()) {
            b();
        }
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6347c = Collections.emptyList();
        this.f6348d = C0768v2.f11659g;
        this.f6349f = 0.0533f;
        this.f6350g = 0;
        this.f6351h = 0.08f;
        com.applovin.exoplayer2.ui.a aVar = new com.applovin.exoplayer2.ui.a(context, attributeSet);
        this.f6346a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }

    private static String a(C0768v2 c0768v2) {
        int i9 = c0768v2.f11662d;
        if (i9 == 1) {
            return yp.a("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", c.a(c0768v2.f11663e));
        }
        if (i9 == 2) {
            return yp.a("0.1em 0.12em 0.15em %s", c.a(c0768v2.f11663e));
        }
        if (i9 == 3) {
            return yp.a("0.06em 0.08em 0.15em %s", c.a(c0768v2.f11663e));
        }
        if (i9 != 4) {
            return "unset";
        }
        return yp.a("-0.05em -0.05em 0.15em %s", c.a(c0768v2.f11663e));
    }

    private static String a(z4 z4Var) {
        String str;
        float f9 = z4Var.f12518r;
        if (f9 != 0.0f) {
            int i9 = z4Var.f12517q;
            if (i9 != 2 && i9 != 1) {
                str = "skewX";
            } else {
                str = "skewY";
            }
            return yp.a("%s(%.2fdeg)", str, Float.valueOf(f9));
        }
        return "";
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List list, C0768v2 c0768v2, float f9, int i9, float f10) {
        this.f6348d = c0768v2;
        this.f6349f = f9;
        this.f6350g = i9;
        this.f6351h = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            z4 z4Var = (z4) list.get(i10);
            if (z4Var.f12507d != null) {
                arrayList.add(z4Var);
            } else {
                arrayList2.add(z4Var);
            }
        }
        if (!this.f6347c.isEmpty() || !arrayList2.isEmpty()) {
            this.f6347c = arrayList2;
            b();
        }
        this.f6346a.a(arrayList, c0768v2, f9, i9, f10);
        invalidate();
    }

    public void a() {
        this.b.destroy();
    }

    private String a(int i9, float f9) {
        float a6 = h.a(i9, f9, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (a6 == -3.4028235E38f) {
            return "unset";
        }
        return yp.a("%.2fpx", Float.valueOf(a6 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String a(Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i9 = b.f6353a[alignment.ordinal()];
        if (i9 != 1) {
            return i9 != 2 ? TtmlNode.CENTER : TtmlNode.END;
        }
        return "start";
    }

    private static String b(int i9) {
        if (i9 == 1) {
            return "vertical-rl";
        }
        if (i9 != 2) {
            return "horizontal-tb";
        }
        return "vertical-lr";
    }
}
