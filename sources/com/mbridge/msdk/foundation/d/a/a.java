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
import com.applovin.impl.mediation.ads.e;
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

/* loaded from: classes4.dex */
public final class a {
    private static int a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static String f13077b;

    /* renamed from: d, reason: collision with root package name */
    private String f13079d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f13080e;

    /* renamed from: g, reason: collision with root package name */
    private FeedBackButton f13082g;

    /* renamed from: h, reason: collision with root package name */
    private String f13083h;

    /* renamed from: k, reason: collision with root package name */
    private String f13086k;

    /* renamed from: l, reason: collision with root package name */
    private MBFeedBackDialog f13087l;

    /* renamed from: m, reason: collision with root package name */
    private Dialog f13088m;

    /* renamed from: n, reason: collision with root package name */
    private JSONArray f13089n;

    /* renamed from: s, reason: collision with root package name */
    private int f13094s;

    /* renamed from: t, reason: collision with root package name */
    private List<C0169a> f13095t;

    /* renamed from: w, reason: collision with root package name */
    private int f13097w;

    /* renamed from: c, reason: collision with root package name */
    private float f13078c = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    private String f13081f = "";

    /* renamed from: i, reason: collision with root package name */
    private float f13084i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f13085j = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f13090o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f13091p = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f13092q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f13093r = -1;
    private int u = e.a(20.0f);

    /* renamed from: v, reason: collision with root package name */
    private String f13096v = "";

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.a f13098x = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.foundation.d.a.a.1
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
    private int f13099y = a;

    /* renamed from: z, reason: collision with root package name */
    private int f13100z = -1;
    private int A = -1;
    private int B = -1;

    public a(String str) {
        this.f13095t = new ArrayList();
        this.f13086k = str;
        if (this.f13095t == null) {
            this.f13095t = new ArrayList();
        }
        k();
        i();
        j();
    }

    private void i() {
        Context c10 = c.m().c();
        if (c10 != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(c10);
                this.f13082g = feedBackButton;
                int i10 = 8;
                if (this.f13099y != 8) {
                    i10 = 0;
                }
                feedBackButton.setVisibility(i10);
                this.f13082g.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.d.a.a.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.e();
                    }
                });
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void j() {
        boolean z10;
        try {
            if (b.a().a(c.m().c()) != null) {
                g b3 = h.a().b(c.m().k());
                if (b3 == null) {
                    h.a();
                    b3 = i.a();
                }
                b.C0161b D = b3.D();
                if (D == null) {
                    ad.c("", "feedback fbk is null");
                    return;
                }
                k();
                this.f13087l = new MBFeedBackDialog(com.mbridge.msdk.foundation.d.b.a().a(c.m().c()), this.f13098x);
                FeedbackRadioGroup a10 = a(D);
                this.f13087l.setCancelText(D.d());
                this.f13087l.setConfirmText(D.a());
                this.f13087l.setPrivacyText(D.c());
                this.f13096v = D.e();
                this.f13087l.setTitle(D.f());
                this.f13087l.setContent(a10);
                MBFeedBackDialog mBFeedBackDialog = this.f13087l;
                if (!TextUtils.isEmpty(f13077b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mBFeedBackDialog.setCancelButtonClickable(z10);
                a(a10, D);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void k() {
        if (this.f13098x == null) {
            this.f13098x = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.foundation.d.a.a.3
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
        boolean z10;
        FeedBackButton feedBackButton = this.f13082g;
        if (feedBackButton != null) {
            int i10 = this.A;
            if (i10 > -1) {
                feedBackButton.setX(i10);
            }
            int i11 = this.B;
            if (i11 > -1) {
                this.f13082g.setY(i11);
            }
            float f10 = this.f13078c;
            if (f10 >= 0.0f) {
                this.f13082g.setAlpha(f10);
                FeedBackButton feedBackButton2 = this.f13082g;
                if (this.f13078c != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                feedBackButton2.setEnabled(z10);
            }
            ViewGroup.LayoutParams layoutParams = this.f13082g.getLayoutParams();
            int i12 = this.f13100z;
            if (i12 > 0) {
                this.f13082g.setWidth(i12);
                if (layoutParams != null) {
                    layoutParams.width = this.f13100z;
                }
            }
            int i13 = this.f13085j;
            if (i13 > 0) {
                this.f13082g.setHeight(i13);
                if (layoutParams != null) {
                    layoutParams.height = this.f13085j;
                }
            }
            if (layoutParams != null) {
                this.f13082g.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f13083h)) {
                    this.f13082g.setTextColor(Color.parseColor(this.f13083h));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            float f11 = this.f13084i;
            if (f11 > 0.0f) {
                this.f13082g.setTextSize(f11);
            }
            JSONArray jSONArray = this.f13089n;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context c10 = c.m().c();
                this.f13082g.setPadding(ai.a(c10, (float) this.f13089n.optDouble(0)), ai.a(c10, (float) this.f13089n.optDouble(1)), ai.a(c10, (float) this.f13089n.optDouble(2)), ai.a(c10, (float) this.f13089n.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i14 = this.u;
            if (i14 > 0) {
                gradientDrawable.setCornerRadius(i14);
            }
            if (!TextUtils.isEmpty(this.f13079d)) {
                gradientDrawable.setColor(Color.parseColor(this.f13079d));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f13082g.setBackground(gradientDrawable);
        }
    }

    public final void a(C0169a c0169a) {
        if (this.f13095t == null) {
            this.f13095t = new ArrayList();
        }
        this.f13095t.add(c0169a);
    }

    public final CampaignEx c() {
        return this.f13080e;
    }

    public final int f() {
        return this.f13094s;
    }

    public final int g() {
        return this.f13097w;
    }

    public final void b() {
        MBFeedBackDialog mBFeedBackDialog = this.f13087l;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f13087l.cancel();
    }

    public final void c(int i10) {
        this.f13099y = i10;
        FeedBackButton feedBackButton = this.f13082g;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i10);
        }
    }

    public final FeedBackButton d() {
        if (this.f13082g == null) {
            i();
        }
        return this.f13082g;
    }

    public final void e() {
        try {
            com.mbridge.msdk.foundation.d.b.a().a(this.f13086k, 0, 1, f13077b, this.f13081f);
            Activity a10 = com.mbridge.msdk.foundation.d.b.a().a(c.m().c());
            MBFeedBackDialog mBFeedBackDialog = this.f13087l;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != a10) {
                j();
            }
            Context c10 = c.m().c();
            FeedBackButton feedBackButton = this.f13082g;
            if (feedBackButton != null) {
                c10 = feedBackButton.getContext();
            }
            boolean a11 = com.mbridge.msdk.foundation.d.b.a().a(this.f13086k, c10, this.f13087l);
            int i10 = a11 ? 2 : 3;
            if (i10 == 2) {
                com.mbridge.msdk.foundation.d.b.a().a(this.f13086k, 0, 2, f13077b, this.f13081f);
            } else {
                com.mbridge.msdk.foundation.d.b.a().a(this.f13086k, 0, 3, f13077b, this.f13081f);
            }
            List<C0169a> list = this.f13095t;
            if (list != null) {
                for (C0169a c0169a : list) {
                    if (c0169a != null) {
                        c0169a.a(i10);
                    }
                }
            }
            if (a11) {
                return;
            }
            a(c10);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.d.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0169a implements com.mbridge.msdk.widget.dialog.a {
        private com.mbridge.msdk.foundation.d.a a;

        /* renamed from: b, reason: collision with root package name */
        private String f13101b;

        public C0169a(String str, com.mbridge.msdk.foundation.d.a aVar) {
            this.a = aVar;
            this.f13101b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void a() {
            com.mbridge.msdk.foundation.d.b.f13103c = false;
            com.mbridge.msdk.foundation.d.a aVar = this.a;
            if (aVar != null) {
                aVar.a(a.f13077b);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void b() {
            com.mbridge.msdk.foundation.d.b.f13103c = false;
            com.mbridge.msdk.foundation.d.a aVar = this.a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void c() {
            com.mbridge.msdk.foundation.d.a aVar = this.a;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void a(int i10) {
            com.mbridge.msdk.foundation.d.b.f13103c = true;
            com.mbridge.msdk.foundation.d.a aVar = this.a;
            if (aVar == null || i10 != 2) {
                return;
            }
            aVar.a();
        }
    }

    public final void a() {
        FeedBackButton feedBackButton = this.f13082g;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f13082g.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f13082g.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f13082g);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f13087l;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f13087l.setListener(null);
        }
        this.f13087l = null;
        this.f13095t = null;
        this.f13082g = null;
        this.f13098x = null;
    }

    public final void b(int i10) {
        this.f13097w = i10;
    }

    public static /* synthetic */ void b(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.f13086k, 0, 4, f13077b, aVar.f13081f);
        List<C0169a> list = aVar.f13095t;
        if (list != null) {
            for (C0169a c0169a : list) {
                if (c0169a != null) {
                    c0169a.b();
                }
            }
        }
        f13077b = "";
    }

    public static /* synthetic */ void c(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.f13086k, 0, 4, f13077b, aVar.f13081f);
        Context e2 = c.m().e();
        if (e2 == null) {
            e2 = c.m().c();
        }
        List<C0169a> list = aVar.f13095t;
        if (list != null) {
            for (C0169a c0169a : list) {
                if (c0169a != null) {
                    c0169a.b();
                }
            }
        }
        aVar.a(e2);
        f13077b = "";
    }

    public final void a(CampaignEx campaignEx) {
        this.f13080e = campaignEx;
    }

    public final void a(String str) {
        this.f13081f = str;
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, ai.a(this.f13080e));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, ai.a(this.f13080e));
            }
        }
    }

    private FeedbackRadioGroup a(b.C0161b c0161b) {
        JSONArray b3 = c0161b.b();
        Context c10 = c.m().c();
        if (b3 == null || b3.length() <= 0 || c10 == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(c10);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.mbridge.msdk.widget.FeedbackRadioGroup r11, com.mbridge.msdk.c.b.C0161b r12) {
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
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    if (z10) {
                        String unused = a.f13077b = (String) compoundButton.getText();
                    }
                    if (a.this.f13087l != null) {
                        a.this.f13087l.setCancelButtonClickable(!TextUtils.isEmpty(a.f13077b));
                    }
                }
            });
        }
    }

    public final void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f13082g;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f13078c);
            feedBackButton.setEnabled(this.f13078c != 0.0f);
            feedBackButton.setVisibility(this.f13099y != 8 ? 0 : 8);
            this.f13082g = feedBackButton;
            CampaignEx campaignEx = this.f13080e;
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

    public final void a(int i10) {
        this.f13094s = i10;
    }

    public final void a(int i10, int i11, int i12, int i13, int i14, float f10, String str, String str2, float f11, JSONArray jSONArray) {
        if (i10 > -1) {
            this.A = i10;
        }
        if (i11 > -1) {
            this.B = i11;
        }
        if (i12 > -1) {
            this.f13100z = i12;
        }
        if (i13 > -1) {
            this.f13085j = i13;
        }
        if (f11 > -1.0f) {
            this.f13084i = f11;
        }
        if (jSONArray != null) {
            this.f13089n = jSONArray;
        }
        this.f13083h = str;
        this.f13079d = str2;
        this.f13078c = f10;
        this.u = i14;
        l();
    }

    public static /* synthetic */ void a(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.f13086k, 1, 4, f13077b, aVar.f13081f);
        List<C0169a> list = aVar.f13095t;
        if (list != null) {
            for (C0169a c0169a : list) {
                if (c0169a != null) {
                    c0169a.a();
                }
            }
        }
        if (!TextUtils.isEmpty(aVar.f13096v)) {
            try {
                Activity a10 = com.mbridge.msdk.foundation.d.b.a().a(c.m().c());
                if (a10 != null) {
                    View inflate = LayoutInflater.from(a10).inflate(v.a(a10, "mbridge_cm_feedback_notice_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                    Dialog dialog = new Dialog(a10, 3);
                    aVar.f13088m = dialog;
                    dialog.requestWindowFeature(1);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    Window window = aVar.f13088m.getWindow();
                    layoutParams.copyFrom(window.getAttributes());
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    aVar.f13088m.setContentView(inflate);
                    aVar.f13088m.show();
                    window.setAttributes(layoutParams);
                    inflate.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.d.a.a.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.f13088m != null && a.this.f13088m.isShowing()) {
                                    a.this.f13088m.dismiss();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        f13077b = "";
    }
}
