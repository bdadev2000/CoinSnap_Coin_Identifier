package com.mbridge.msdk.foundation.d.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.applovin.impl.L;
import com.mbridge.msdk.c.b;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f15434a = -1;
    private static String b;

    /* renamed from: d, reason: collision with root package name */
    private String f15438d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f15439e;

    /* renamed from: g, reason: collision with root package name */
    private FeedBackButton f15441g;

    /* renamed from: h, reason: collision with root package name */
    private String f15442h;

    /* renamed from: k, reason: collision with root package name */
    private String f15445k;
    private MBFeedBackDialog l;
    private Dialog m;

    /* renamed from: n, reason: collision with root package name */
    private JSONArray f15446n;

    /* renamed from: s, reason: collision with root package name */
    private int f15451s;

    /* renamed from: t, reason: collision with root package name */
    private List<C0157a> f15452t;

    /* renamed from: w, reason: collision with root package name */
    private int f15455w;

    /* renamed from: c, reason: collision with root package name */
    private float f15437c = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    private String f15440f = "";

    /* renamed from: i, reason: collision with root package name */
    private float f15443i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f15444j = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f15447o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f15448p = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f15449q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f15450r = -1;

    /* renamed from: u, reason: collision with root package name */
    private int f15453u = L.a(20.0f);

    /* renamed from: v, reason: collision with root package name */
    private String f15454v = "";

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.a f15456x = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.foundation.d.a.a.1
        @Override // com.mbridge.msdk.widget.dialog.a
        public final void a() {
            a.a(a.this);
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void b() {
            a.b(a.this);
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void c() {
            a.c(a.this);
        }
    };

    /* renamed from: y, reason: collision with root package name */
    private int f15457y = f15434a;

    /* renamed from: z, reason: collision with root package name */
    private int f15458z = -1;

    /* renamed from: A, reason: collision with root package name */
    private int f15435A = -1;

    /* renamed from: B, reason: collision with root package name */
    private int f15436B = -1;

    public a(String str) {
        this.f15452t = new ArrayList();
        this.f15445k = str;
        if (this.f15452t == null) {
            this.f15452t = new ArrayList();
        }
        k();
        i();
        j();
    }

    private void i() {
        Context c9 = c.m().c();
        if (c9 != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(c9);
                this.f15441g = feedBackButton;
                int i9 = 8;
                if (this.f15457y != 8) {
                    i9 = 0;
                }
                feedBackButton.setVisibility(i9);
                this.f15441g.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.d.a.a.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.e();
                    }
                });
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    private void j() {
        try {
            if (b.a().a(c.m().c()) != null) {
                g b8 = h.a().b(c.m().k());
                if (b8 == null) {
                    h.a();
                    b8 = i.a();
                }
                b.C0149b D8 = b8.D();
                if (D8 == null) {
                    ad.c("", "feedback fbk is null");
                    return;
                }
                k();
                this.l = new MBFeedBackDialog(com.mbridge.msdk.foundation.d.b.a().a(c.m().c()), this.f15456x);
                FeedbackRadioGroup a6 = a(D8);
                this.l.setCancelText(D8.d());
                this.l.setConfirmText(D8.a());
                this.l.setPrivacyText(D8.c());
                this.f15454v = D8.e();
                this.l.setTitle(D8.f());
                this.l.setContent(a6);
                this.l.setCancelButtonClickable(!TextUtils.isEmpty(b));
                a(a6, D8);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void k() {
        if (this.f15456x == null) {
            this.f15456x = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.foundation.d.a.a.3
                @Override // com.mbridge.msdk.widget.dialog.a
                public final void a() {
                    a.a(a.this);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void b() {
                    a.b(a.this);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void c() {
                    a.c(a.this);
                }
            };
        }
    }

    private void l() {
        boolean z8;
        FeedBackButton feedBackButton = this.f15441g;
        if (feedBackButton != null) {
            int i9 = this.f15435A;
            if (i9 > -1) {
                feedBackButton.setX(i9);
            }
            int i10 = this.f15436B;
            if (i10 > -1) {
                this.f15441g.setY(i10);
            }
            float f9 = this.f15437c;
            if (f9 >= 0.0f) {
                this.f15441g.setAlpha(f9);
                FeedBackButton feedBackButton2 = this.f15441g;
                if (this.f15437c != 0.0f) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                feedBackButton2.setEnabled(z8);
            }
            ViewGroup.LayoutParams layoutParams = this.f15441g.getLayoutParams();
            int i11 = this.f15458z;
            if (i11 > 0) {
                this.f15441g.setWidth(i11);
                if (layoutParams != null) {
                    layoutParams.width = this.f15458z;
                }
            }
            int i12 = this.f15444j;
            if (i12 > 0) {
                this.f15441g.setHeight(i12);
                if (layoutParams != null) {
                    layoutParams.height = this.f15444j;
                }
            }
            if (layoutParams != null) {
                this.f15441g.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f15442h)) {
                    this.f15441g.setTextColor(Color.parseColor(this.f15442h));
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            float f10 = this.f15443i;
            if (f10 > 0.0f) {
                this.f15441g.setTextSize(f10);
            }
            JSONArray jSONArray = this.f15446n;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context c9 = c.m().c();
                this.f15441g.setPadding(ai.a(c9, (float) this.f15446n.optDouble(0)), ai.a(c9, (float) this.f15446n.optDouble(1)), ai.a(c9, (float) this.f15446n.optDouble(2)), ai.a(c9, (float) this.f15446n.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i13 = this.f15453u;
            if (i13 > 0) {
                gradientDrawable.setCornerRadius(i13);
            }
            if (!TextUtils.isEmpty(this.f15438d)) {
                gradientDrawable.setColor(Color.parseColor(this.f15438d));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f15441g.setBackground(gradientDrawable);
        }
    }

    public final void a(C0157a c0157a) {
        if (this.f15452t == null) {
            this.f15452t = new ArrayList();
        }
        this.f15452t.add(c0157a);
    }

    public final CampaignEx c() {
        return this.f15439e;
    }

    public final int f() {
        return this.f15451s;
    }

    public final int g() {
        return this.f15455w;
    }

    public final void b() {
        MBFeedBackDialog mBFeedBackDialog = this.l;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.l.cancel();
    }

    public final void c(int i9) {
        this.f15457y = i9;
        FeedBackButton feedBackButton = this.f15441g;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i9);
        }
    }

    public final FeedBackButton d() {
        if (this.f15441g == null) {
            i();
        }
        return this.f15441g;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r10 = this;
            com.mbridge.msdk.foundation.d.b r0 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = r10.f15445k     // Catch: java.lang.Exception -> L2a
            java.lang.String r4 = com.mbridge.msdk.foundation.d.a.a.b     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = r10.f15440f     // Catch: java.lang.Exception -> L2a
            r2 = 0
            r3 = 1
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.foundation.d.b r0 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L2a
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L2a
            android.app.Activity r0 = r0.a(r1)     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.widget.dialog.MBFeedBackDialog r1 = r10.l     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L2c
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Exception -> L2a
            if (r1 == r0) goto L2f
            goto L2c
        L2a:
            r0 = move-exception
            goto L92
        L2c:
            r10.j()     // Catch: java.lang.Exception -> L2a
        L2f:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L2a
            android.content.Context r0 = r0.c()     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.widget.FeedBackButton r1 = r10.f15441g     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L3f
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Exception -> L2a
        L3f:
            com.mbridge.msdk.foundation.d.b r1 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = r10.f15445k     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.widget.dialog.MBFeedBackDialog r3 = r10.l     // Catch: java.lang.Exception -> L2a
            boolean r1 = r1.a(r2, r0, r3)     // Catch: java.lang.Exception -> L2a
            r2 = 2
            if (r1 == 0) goto L50
            r3 = r2
            goto L51
        L50:
            r3 = 3
        L51:
            if (r3 != r2) goto L63
            com.mbridge.msdk.foundation.d.b r4 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = r10.f15445k     // Catch: java.lang.Exception -> L2a
            java.lang.String r8 = com.mbridge.msdk.foundation.d.a.a.b     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = r10.f15440f     // Catch: java.lang.Exception -> L2a
            r6 = 0
            r7 = 2
            r4.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L2a
            goto L72
        L63:
            com.mbridge.msdk.foundation.d.b r4 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = r10.f15445k     // Catch: java.lang.Exception -> L2a
            java.lang.String r8 = com.mbridge.msdk.foundation.d.a.a.b     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = r10.f15440f     // Catch: java.lang.Exception -> L2a
            r6 = 0
            r7 = 3
            r4.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L2a
        L72:
            java.util.List<com.mbridge.msdk.foundation.d.a.a$a> r2 = r10.f15452t     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L8c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L2a
        L7a:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.foundation.d.a.a$a r4 = (com.mbridge.msdk.foundation.d.a.a.C0157a) r4     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L7a
            r4.a(r3)     // Catch: java.lang.Exception -> L2a
            goto L7a
        L8c:
            if (r1 != 0) goto L95
            r10.a(r0)     // Catch: java.lang.Exception -> L2a
            goto L95
        L92:
            r0.printStackTrace()
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.d.a.a.e():void");
    }

    /* renamed from: com.mbridge.msdk.foundation.d.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0157a implements com.mbridge.msdk.widget.dialog.a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.d.a f15465a;
        private String b;

        public C0157a(String str, com.mbridge.msdk.foundation.d.a aVar) {
            this.f15465a = aVar;
            this.b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void a() {
            com.mbridge.msdk.foundation.d.b.f15467c = false;
            com.mbridge.msdk.foundation.d.a aVar = this.f15465a;
            if (aVar != null) {
                aVar.a(a.b);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void b() {
            com.mbridge.msdk.foundation.d.b.f15467c = false;
            com.mbridge.msdk.foundation.d.a aVar = this.f15465a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void c() {
            com.mbridge.msdk.foundation.d.a aVar = this.f15465a;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void a(int i9) {
            com.mbridge.msdk.foundation.d.b.f15467c = true;
            com.mbridge.msdk.foundation.d.a aVar = this.f15465a;
            if (aVar == null || i9 != 2) {
                return;
            }
            aVar.a();
        }
    }

    public final void a() {
        FeedBackButton feedBackButton = this.f15441g;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f15441g.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f15441g.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f15441g);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.l;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.l.setListener(null);
        }
        this.l = null;
        this.f15452t = null;
        this.f15441g = null;
        this.f15456x = null;
    }

    public final void b(int i9) {
        this.f15455w = i9;
    }

    public static /* synthetic */ void b(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.f15445k, 0, 4, b, aVar.f15440f);
        List<C0157a> list = aVar.f15452t;
        if (list != null) {
            for (C0157a c0157a : list) {
                if (c0157a != null) {
                    c0157a.b();
                }
            }
        }
        b = "";
    }

    public static /* synthetic */ void c(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.f15445k, 0, 4, b, aVar.f15440f);
        Context e4 = c.m().e();
        if (e4 == null) {
            e4 = c.m().c();
        }
        List<C0157a> list = aVar.f15452t;
        if (list != null) {
            for (C0157a c0157a : list) {
                if (c0157a != null) {
                    c0157a.b();
                }
            }
        }
        aVar.a(e4);
        b = "";
    }

    public final void a(CampaignEx campaignEx) {
        this.f15439e = campaignEx;
    }

    public final void a(String str) {
        this.f15440f = str;
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, ai.a(this.f15439e));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, ai.a(this.f15439e));
            }
        }
    }

    private FeedbackRadioGroup a(b.C0149b c0149b) {
        JSONArray b8 = c0149b.b();
        Context c9 = c.m().c();
        if (b8 == null || b8.length() <= 0 || c9 == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(c9);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.mbridge.msdk.widget.FeedbackRadioGroup r11, com.mbridge.msdk.c.b.C0149b r12) {
        /*
            r10 = this;
            org.json.JSONArray r12 = r12.b()
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r0 = r0.c()
            if (r12 == 0) goto L7e
            int r1 = r12.length()
            if (r1 <= 0) goto L7e
            if (r0 == 0) goto L7e
            java.lang.String r1 = "mbridge_cm_feedback_choice_btn_bg"
            java.lang.String r2 = "drawable"
            com.mbridge.msdk.foundation.tools.v.a(r0, r1, r2)
            android.content.res.Resources r1 = com.mbridge.msdk.foundation.tools.v.a(r0)
            java.lang.String r2 = "mbridge_cm_feedback_rb_text_color_color_list"
            java.lang.String r3 = "color"
            int r2 = com.mbridge.msdk.foundation.tools.v.a(r0, r2, r3)
            if (r1 == 0) goto L34
            android.content.res.ColorStateList r1 = r1.getColorStateList(r2)     // Catch: java.lang.Exception -> L30
            goto L35
        L30:
            r1 = move-exception
            r1.printStackTrace()
        L34:
            r1 = 0
        L35:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = com.mbridge.msdk.foundation.tools.ai.a(r0, r2)
            int r4 = com.mbridge.msdk.foundation.tools.ai.a(r0, r2)
            int r2 = com.mbridge.msdk.foundation.tools.ai.a(r0, r2)
            r5 = 0
        L44:
            int r6 = r12.length()
            if (r5 >= r6) goto L7e
            java.lang.String r6 = r12.optString(r5)
            android.widget.RadioButton r7 = new android.widget.RadioButton
            r7.<init>(r0)
            r7.setButtonTintList(r1)
            r7.setText(r6)
            if (r1 == 0) goto L5e
            r7.setTextColor(r1)
        L5e:
            r7.setCompoundDrawablePadding(r3)
            r7.setPadding(r3, r4, r3, r4)
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r7.setEllipsize(r6)
            android.widget.RadioGroup$LayoutParams r6 = new android.widget.RadioGroup$LayoutParams
            r8 = -1
            r9 = -2
            r6.<init>(r8, r9)
            int r8 = r2 / 4
            r6.setMargins(r2, r8, r2, r8)
            r10.a(r7)
            r11.addView(r7, r6)
            int r5 = r5 + 1
            goto L44
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.d.a.a.a(com.mbridge.msdk.widget.FeedbackRadioGroup, com.mbridge.msdk.c.b$b):void");
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.mbridge.msdk.foundation.d.a.a.4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    if (z8) {
                        String unused = a.b = (String) compoundButton.getText();
                    }
                    if (a.this.l != null) {
                        a.this.l.setCancelButtonClickable(!TextUtils.isEmpty(a.b));
                    }
                }
            });
        }
    }

    public final void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f15441g;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f15437c);
            feedBackButton.setEnabled(this.f15437c != 0.0f);
            feedBackButton.setVisibility(this.f15457y != 8 ? 0 : 8);
            this.f15441g = feedBackButton;
            CampaignEx campaignEx = this.f15439e;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                l();
            }
            feedBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.d.a.a.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.e();
                }
            });
        }
    }

    public final void a(int i9) {
        this.f15451s = i9;
    }

    public final void a(int i9, int i10, int i11, int i12, int i13, float f9, String str, String str2, float f10, JSONArray jSONArray) {
        if (i9 > -1) {
            this.f15435A = i9;
        }
        if (i10 > -1) {
            this.f15436B = i10;
        }
        if (i11 > -1) {
            this.f15458z = i11;
        }
        if (i12 > -1) {
            this.f15444j = i12;
        }
        if (f10 > -1.0f) {
            this.f15443i = f10;
        }
        if (jSONArray != null) {
            this.f15446n = jSONArray;
        }
        this.f15442h = str;
        this.f15438d = str2;
        this.f15437c = f9;
        this.f15453u = i13;
        l();
    }

    public static /* synthetic */ void a(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.f15445k, 1, 4, b, aVar.f15440f);
        List<C0157a> list = aVar.f15452t;
        if (list != null) {
            for (C0157a c0157a : list) {
                if (c0157a != null) {
                    c0157a.a();
                }
            }
        }
        if (!TextUtils.isEmpty(aVar.f15454v)) {
            try {
                Activity a6 = com.mbridge.msdk.foundation.d.b.a().a(c.m().c());
                if (a6 != null) {
                    View inflate = LayoutInflater.from(a6).inflate(v.a(a6, "mbridge_cm_feedback_notice_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                    Dialog dialog = new Dialog(a6, 3);
                    aVar.m = dialog;
                    dialog.requestWindowFeature(1);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    Window window = aVar.m.getWindow();
                    layoutParams.copyFrom(window.getAttributes());
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    aVar.m.setContentView(inflate);
                    aVar.m.show();
                    window.setAttributes(layoutParams);
                    inflate.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.d.a.a.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.m != null && a.this.m.isShowing()) {
                                    a.this.m.dismiss();
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                    }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        b = "";
    }
}
