package com.tools.arruler.ui.component.iap;

import B3.p;
import F7.l;
import G7.a;
import G7.j;
import J1.c;
import J1.m;
import O7.g;
import O7.o;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.d;
import com.google.android.gms.internal.play_billing.zzaa;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.home.HomeActivity;
import com.tools.arruler.ui.component.iap.IAPActivity;
import d4.AbstractC2186n;
import d4.C2182j;
import d4.E;
import j5.C2400c;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import p1.C2538b;
import t7.y;
import u1.AbstractC2748a;
import u6.AbstractC2791g;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class IAPActivity extends AbstractActivityC2926b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f19655h = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f19656f = "sub_year_arruler1_19.99";

    /* renamed from: g, reason: collision with root package name */
    public boolean f19657g;

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_iap;
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        String str;
        int i9 = 0;
        this.f19657g = getIntent().getBooleanExtra("IAP_FROM_MAIN", false);
        AppCompatTextView appCompatTextView = ((AbstractC2791g) k()).f23310y;
        j.d(appCompatTextView, "tvIapPolicy");
        Spanned fromHtml = Html.fromHtml(getString(R.string.iap_policy), 0);
        j.c(fromHtml, "null cannot be cast to non-null type android.text.Spannable");
        Spannable spannable = (Spannable) fromHtml;
        a h6 = j.h(spannable.getSpans(0, spannable.length(), URLSpan.class));
        while (h6.hasNext()) {
            URLSpan uRLSpan = (URLSpan) h6.next();
            spannable.setSpan(new UnderlineSpan(), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
        }
        appCompatTextView.setText(spannable);
        u(true);
        ((AbstractC2791g) k()).f23301B.setPaintFlags(16);
        ((AbstractC2791g) k()).f23308w.setPaintFlags(8);
        Log.e("VinhTQ", "initViews: SUB_YEAR " + C2538b.a().b("sub_year_arruler1_19.99"));
        Log.e("VinhTQ", "initViews: SUB_MONTH " + C2538b.a().b("sub_month_arruler1_3.99"));
        String b = C2538b.a().b("sub_year_arruler1_19.99");
        ((AbstractC2791g) k()).f23311z.setText(b);
        String b8 = C2538b.a().b("sub_month_arruler1_3.99");
        try {
            j.b(b);
            Pattern compile = Pattern.compile("[\\d,.]");
            j.d(compile, "compile(...)");
            String replaceAll = compile.matcher(b).replaceAll("");
            j.d(replaceAll, "replaceAll(...)");
            String obj = g.a0(replaceAll).toString();
            Pattern compile2 = Pattern.compile("[^\\d]");
            j.d(compile2, "compile(...)");
            String replaceAll2 = compile2.matcher(b).replaceAll("");
            j.d(replaceAll2, "replaceAll(...)");
            int parseInt = Integer.parseInt(replaceAll2);
            boolean C8 = o.C(g.a0(b).toString(), obj, false);
            String format = NumberFormat.getNumberInstance(Locale.US).format(Integer.valueOf(parseInt * 2));
            if (C8) {
                str = obj + format;
            } else {
                str = format + " " + obj;
            }
            ((AbstractC2791g) k()).f23301B.setText(str);
            Log.e("VinhTQ", "initViews result: " + str);
        } catch (NumberFormatException e4) {
            Log.e("VinhTQ", "initViews faild: " + e4.getMessage());
        }
        ((AbstractC2791g) k()).f23300A.setText(getString(R.string.money_monthly, b8));
        AppCompatTextView appCompatTextView2 = ((AbstractC2791g) k()).f23308w;
        j.d(appCompatTextView2, "tvCancel");
        if (!C2538b.a().m) {
            i9 = 8;
        }
        appCompatTextView2.setVisibility(i9);
        C2538b.a().f22175c = new C2400c(this, 5);
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        AppCompatImageView appCompatImageView = ((AbstractC2791g) k()).f23304s;
        j.d(appCompatImageView, "imvBack");
        final int i9 = 0;
        d.I(appCompatImageView, new l(this) { // from class: H6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IAPActivity f1392c;

            {
                this.f1392c = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v8, types: [p1.d, k.y, android.app.Dialog] */
            @Override // F7.l
            public final Object invoke(Object obj) {
                int i10;
                y yVar = y.f23029a;
                IAPActivity iAPActivity = this.f1392c;
                int i11 = i9;
                int i12 = IAPActivity.f19655h;
                switch (i11) {
                    case 0:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.t();
                        return yVar;
                    case 1:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(true);
                        iAPActivity.f19656f = "sub_year_arruler1_19.99";
                        return yVar;
                    case 2:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(false);
                        iAPActivity.f19656f = "sub_month_arruler1_3.99";
                        return yVar;
                    case 3:
                        j.e(iAPActivity, "this$0");
                        C2538b a6 = C2538b.a();
                        String str = iAPActivity.f19656f;
                        a6.getClass();
                        if (AbstractC2748a.f23066a.booleanValue()) {
                            if (a6.f22178f != null) {
                                m mVar = (m) a6.f22180h.get("android.test.purchased");
                                if (AbstractC2748a.f23066a.booleanValue()) {
                                    C2400c c2400c = a6.f22175c;
                                    TypedValue typedValue = new TypedValue();
                                    if (iAPActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                                        i10 = typedValue.resourceId;
                                    } else {
                                        i10 = R.style.Theme_Design_Light_BottomSheetDialog;
                                    }
                                    ?? yVar2 = new k.y(iAPActivity, i10);
                                    yVar2.l = true;
                                    yVar2.m = true;
                                    yVar2.f22197r = new p(yVar2);
                                    yVar2.d().i(1);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22198s = mVar;
                                    yVar2.f22199t = 1;
                                    yVar2.f22205z = c2400c;
                                    yVar2.show();
                                } else if (mVar != null) {
                                    a6.f22182j = "android.test.purchased";
                                    a6.f22183k = 1;
                                    E1.d dVar = new E1.d(5, false);
                                    dVar.f973c = mVar;
                                    if (mVar.a() != null) {
                                        mVar.a().getClass();
                                        String str2 = mVar.a().f1523d;
                                        if (str2 != null) {
                                            dVar.f974d = str2;
                                        }
                                    }
                                    zzaa.zzc((m) dVar.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar = new c(dVar);
                                    C2182j c2182j = AbstractC2186n.f19876c;
                                    Object[] objArr = {cVar};
                                    R2.b.i(1, objArr);
                                    E h6 = AbstractC2186n.h(1, objArr);
                                    a7.b bVar = new a7.b(4, false);
                                    ?? obj2 = new Object();
                                    obj2.f1512a = true;
                                    bVar.f4078d = obj2;
                                    bVar.f4077c = new ArrayList(h6);
                                    int i13 = a6.f22177e.b(iAPActivity, bVar.m()).f1520a;
                                }
                            }
                        } else if (a6.f22179g != null) {
                            HashMap hashMap = a6.f22181i;
                            m mVar2 = (m) hashMap.get(str);
                            if (mVar2 != null) {
                                ArrayList arrayList = ((m) hashMap.get(str)).f1535i;
                                String str3 = ((J1.l) arrayList.get(arrayList.size() - 1)).f1527a;
                                E1.d dVar2 = new E1.d(5, false);
                                dVar2.f973c = mVar2;
                                if (mVar2.a() != null) {
                                    mVar2.a().getClass();
                                    String str4 = mVar2.a().f1523d;
                                    if (str4 != null) {
                                        dVar2.f974d = str4;
                                    }
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.f974d = str3;
                                    zzaa.zzc((m) dVar2.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar2.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar2.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar2 = new c(dVar2);
                                    C2182j c2182j2 = AbstractC2186n.f19876c;
                                    Object[] objArr2 = {cVar2};
                                    R2.b.i(1, objArr2);
                                    E h9 = AbstractC2186n.h(1, objArr2);
                                    a7.b bVar2 = new a7.b(4, false);
                                    ?? obj3 = new Object();
                                    obj3.f1512a = true;
                                    bVar2.f4078d = obj3;
                                    bVar2.f4077c = new ArrayList(h9);
                                    int i14 = a6.f22177e.b(iAPActivity, bVar2.m()).f1520a;
                                } else {
                                    throw new IllegalArgumentException("offerToken can not be empty");
                                }
                            }
                        }
                        return yVar;
                    default:
                        j.e(iAPActivity, "this$0");
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
                        iAPActivity.startActivity(intent);
                        return yVar;
                }
            }
        });
        AbstractC2791g abstractC2791g = (AbstractC2791g) k();
        abstractC2791g.f23310y.setMovementMethod(new LinkMovementMethod());
        ConstraintLayout constraintLayout = ((AbstractC2791g) k()).f23303r;
        j.d(constraintLayout, "constraintYearly");
        final int i10 = 1;
        d.I(constraintLayout, new l(this) { // from class: H6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IAPActivity f1392c;

            {
                this.f1392c = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v8, types: [p1.d, k.y, android.app.Dialog] */
            @Override // F7.l
            public final Object invoke(Object obj) {
                int i102;
                y yVar = y.f23029a;
                IAPActivity iAPActivity = this.f1392c;
                int i11 = i10;
                int i12 = IAPActivity.f19655h;
                switch (i11) {
                    case 0:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.t();
                        return yVar;
                    case 1:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(true);
                        iAPActivity.f19656f = "sub_year_arruler1_19.99";
                        return yVar;
                    case 2:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(false);
                        iAPActivity.f19656f = "sub_month_arruler1_3.99";
                        return yVar;
                    case 3:
                        j.e(iAPActivity, "this$0");
                        C2538b a6 = C2538b.a();
                        String str = iAPActivity.f19656f;
                        a6.getClass();
                        if (AbstractC2748a.f23066a.booleanValue()) {
                            if (a6.f22178f != null) {
                                m mVar = (m) a6.f22180h.get("android.test.purchased");
                                if (AbstractC2748a.f23066a.booleanValue()) {
                                    C2400c c2400c = a6.f22175c;
                                    TypedValue typedValue = new TypedValue();
                                    if (iAPActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                                        i102 = typedValue.resourceId;
                                    } else {
                                        i102 = R.style.Theme_Design_Light_BottomSheetDialog;
                                    }
                                    ?? yVar2 = new k.y(iAPActivity, i102);
                                    yVar2.l = true;
                                    yVar2.m = true;
                                    yVar2.f22197r = new p(yVar2);
                                    yVar2.d().i(1);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22198s = mVar;
                                    yVar2.f22199t = 1;
                                    yVar2.f22205z = c2400c;
                                    yVar2.show();
                                } else if (mVar != null) {
                                    a6.f22182j = "android.test.purchased";
                                    a6.f22183k = 1;
                                    E1.d dVar = new E1.d(5, false);
                                    dVar.f973c = mVar;
                                    if (mVar.a() != null) {
                                        mVar.a().getClass();
                                        String str2 = mVar.a().f1523d;
                                        if (str2 != null) {
                                            dVar.f974d = str2;
                                        }
                                    }
                                    zzaa.zzc((m) dVar.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar = new c(dVar);
                                    C2182j c2182j = AbstractC2186n.f19876c;
                                    Object[] objArr = {cVar};
                                    R2.b.i(1, objArr);
                                    E h6 = AbstractC2186n.h(1, objArr);
                                    a7.b bVar = new a7.b(4, false);
                                    ?? obj2 = new Object();
                                    obj2.f1512a = true;
                                    bVar.f4078d = obj2;
                                    bVar.f4077c = new ArrayList(h6);
                                    int i13 = a6.f22177e.b(iAPActivity, bVar.m()).f1520a;
                                }
                            }
                        } else if (a6.f22179g != null) {
                            HashMap hashMap = a6.f22181i;
                            m mVar2 = (m) hashMap.get(str);
                            if (mVar2 != null) {
                                ArrayList arrayList = ((m) hashMap.get(str)).f1535i;
                                String str3 = ((J1.l) arrayList.get(arrayList.size() - 1)).f1527a;
                                E1.d dVar2 = new E1.d(5, false);
                                dVar2.f973c = mVar2;
                                if (mVar2.a() != null) {
                                    mVar2.a().getClass();
                                    String str4 = mVar2.a().f1523d;
                                    if (str4 != null) {
                                        dVar2.f974d = str4;
                                    }
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.f974d = str3;
                                    zzaa.zzc((m) dVar2.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar2.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar2.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar2 = new c(dVar2);
                                    C2182j c2182j2 = AbstractC2186n.f19876c;
                                    Object[] objArr2 = {cVar2};
                                    R2.b.i(1, objArr2);
                                    E h9 = AbstractC2186n.h(1, objArr2);
                                    a7.b bVar2 = new a7.b(4, false);
                                    ?? obj3 = new Object();
                                    obj3.f1512a = true;
                                    bVar2.f4078d = obj3;
                                    bVar2.f4077c = new ArrayList(h9);
                                    int i14 = a6.f22177e.b(iAPActivity, bVar2.m()).f1520a;
                                } else {
                                    throw new IllegalArgumentException("offerToken can not be empty");
                                }
                            }
                        }
                        return yVar;
                    default:
                        j.e(iAPActivity, "this$0");
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
                        iAPActivity.startActivity(intent);
                        return yVar;
                }
            }
        });
        ConstraintLayout constraintLayout2 = ((AbstractC2791g) k()).f23302q;
        j.d(constraintLayout2, "constraintMonthly");
        final int i11 = 2;
        d.I(constraintLayout2, new l(this) { // from class: H6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IAPActivity f1392c;

            {
                this.f1392c = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v8, types: [p1.d, k.y, android.app.Dialog] */
            @Override // F7.l
            public final Object invoke(Object obj) {
                int i102;
                y yVar = y.f23029a;
                IAPActivity iAPActivity = this.f1392c;
                int i112 = i11;
                int i12 = IAPActivity.f19655h;
                switch (i112) {
                    case 0:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.t();
                        return yVar;
                    case 1:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(true);
                        iAPActivity.f19656f = "sub_year_arruler1_19.99";
                        return yVar;
                    case 2:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(false);
                        iAPActivity.f19656f = "sub_month_arruler1_3.99";
                        return yVar;
                    case 3:
                        j.e(iAPActivity, "this$0");
                        C2538b a6 = C2538b.a();
                        String str = iAPActivity.f19656f;
                        a6.getClass();
                        if (AbstractC2748a.f23066a.booleanValue()) {
                            if (a6.f22178f != null) {
                                m mVar = (m) a6.f22180h.get("android.test.purchased");
                                if (AbstractC2748a.f23066a.booleanValue()) {
                                    C2400c c2400c = a6.f22175c;
                                    TypedValue typedValue = new TypedValue();
                                    if (iAPActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                                        i102 = typedValue.resourceId;
                                    } else {
                                        i102 = R.style.Theme_Design_Light_BottomSheetDialog;
                                    }
                                    ?? yVar2 = new k.y(iAPActivity, i102);
                                    yVar2.l = true;
                                    yVar2.m = true;
                                    yVar2.f22197r = new p(yVar2);
                                    yVar2.d().i(1);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22198s = mVar;
                                    yVar2.f22199t = 1;
                                    yVar2.f22205z = c2400c;
                                    yVar2.show();
                                } else if (mVar != null) {
                                    a6.f22182j = "android.test.purchased";
                                    a6.f22183k = 1;
                                    E1.d dVar = new E1.d(5, false);
                                    dVar.f973c = mVar;
                                    if (mVar.a() != null) {
                                        mVar.a().getClass();
                                        String str2 = mVar.a().f1523d;
                                        if (str2 != null) {
                                            dVar.f974d = str2;
                                        }
                                    }
                                    zzaa.zzc((m) dVar.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar = new c(dVar);
                                    C2182j c2182j = AbstractC2186n.f19876c;
                                    Object[] objArr = {cVar};
                                    R2.b.i(1, objArr);
                                    E h6 = AbstractC2186n.h(1, objArr);
                                    a7.b bVar = new a7.b(4, false);
                                    ?? obj2 = new Object();
                                    obj2.f1512a = true;
                                    bVar.f4078d = obj2;
                                    bVar.f4077c = new ArrayList(h6);
                                    int i13 = a6.f22177e.b(iAPActivity, bVar.m()).f1520a;
                                }
                            }
                        } else if (a6.f22179g != null) {
                            HashMap hashMap = a6.f22181i;
                            m mVar2 = (m) hashMap.get(str);
                            if (mVar2 != null) {
                                ArrayList arrayList = ((m) hashMap.get(str)).f1535i;
                                String str3 = ((J1.l) arrayList.get(arrayList.size() - 1)).f1527a;
                                E1.d dVar2 = new E1.d(5, false);
                                dVar2.f973c = mVar2;
                                if (mVar2.a() != null) {
                                    mVar2.a().getClass();
                                    String str4 = mVar2.a().f1523d;
                                    if (str4 != null) {
                                        dVar2.f974d = str4;
                                    }
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.f974d = str3;
                                    zzaa.zzc((m) dVar2.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar2.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar2.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar2 = new c(dVar2);
                                    C2182j c2182j2 = AbstractC2186n.f19876c;
                                    Object[] objArr2 = {cVar2};
                                    R2.b.i(1, objArr2);
                                    E h9 = AbstractC2186n.h(1, objArr2);
                                    a7.b bVar2 = new a7.b(4, false);
                                    ?? obj3 = new Object();
                                    obj3.f1512a = true;
                                    bVar2.f4078d = obj3;
                                    bVar2.f4077c = new ArrayList(h9);
                                    int i14 = a6.f22177e.b(iAPActivity, bVar2.m()).f1520a;
                                } else {
                                    throw new IllegalArgumentException("offerToken can not be empty");
                                }
                            }
                        }
                        return yVar;
                    default:
                        j.e(iAPActivity, "this$0");
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
                        iAPActivity.startActivity(intent);
                        return yVar;
                }
            }
        });
        AppCompatTextView appCompatTextView = ((AbstractC2791g) k()).f23309x;
        j.d(appCompatTextView, "tvContinue");
        final int i12 = 3;
        d.I(appCompatTextView, new l(this) { // from class: H6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IAPActivity f1392c;

            {
                this.f1392c = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v8, types: [p1.d, k.y, android.app.Dialog] */
            @Override // F7.l
            public final Object invoke(Object obj) {
                int i102;
                y yVar = y.f23029a;
                IAPActivity iAPActivity = this.f1392c;
                int i112 = i12;
                int i122 = IAPActivity.f19655h;
                switch (i112) {
                    case 0:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.t();
                        return yVar;
                    case 1:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(true);
                        iAPActivity.f19656f = "sub_year_arruler1_19.99";
                        return yVar;
                    case 2:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(false);
                        iAPActivity.f19656f = "sub_month_arruler1_3.99";
                        return yVar;
                    case 3:
                        j.e(iAPActivity, "this$0");
                        C2538b a6 = C2538b.a();
                        String str = iAPActivity.f19656f;
                        a6.getClass();
                        if (AbstractC2748a.f23066a.booleanValue()) {
                            if (a6.f22178f != null) {
                                m mVar = (m) a6.f22180h.get("android.test.purchased");
                                if (AbstractC2748a.f23066a.booleanValue()) {
                                    C2400c c2400c = a6.f22175c;
                                    TypedValue typedValue = new TypedValue();
                                    if (iAPActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                                        i102 = typedValue.resourceId;
                                    } else {
                                        i102 = R.style.Theme_Design_Light_BottomSheetDialog;
                                    }
                                    ?? yVar2 = new k.y(iAPActivity, i102);
                                    yVar2.l = true;
                                    yVar2.m = true;
                                    yVar2.f22197r = new p(yVar2);
                                    yVar2.d().i(1);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22198s = mVar;
                                    yVar2.f22199t = 1;
                                    yVar2.f22205z = c2400c;
                                    yVar2.show();
                                } else if (mVar != null) {
                                    a6.f22182j = "android.test.purchased";
                                    a6.f22183k = 1;
                                    E1.d dVar = new E1.d(5, false);
                                    dVar.f973c = mVar;
                                    if (mVar.a() != null) {
                                        mVar.a().getClass();
                                        String str2 = mVar.a().f1523d;
                                        if (str2 != null) {
                                            dVar.f974d = str2;
                                        }
                                    }
                                    zzaa.zzc((m) dVar.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar = new c(dVar);
                                    C2182j c2182j = AbstractC2186n.f19876c;
                                    Object[] objArr = {cVar};
                                    R2.b.i(1, objArr);
                                    E h6 = AbstractC2186n.h(1, objArr);
                                    a7.b bVar = new a7.b(4, false);
                                    ?? obj2 = new Object();
                                    obj2.f1512a = true;
                                    bVar.f4078d = obj2;
                                    bVar.f4077c = new ArrayList(h6);
                                    int i13 = a6.f22177e.b(iAPActivity, bVar.m()).f1520a;
                                }
                            }
                        } else if (a6.f22179g != null) {
                            HashMap hashMap = a6.f22181i;
                            m mVar2 = (m) hashMap.get(str);
                            if (mVar2 != null) {
                                ArrayList arrayList = ((m) hashMap.get(str)).f1535i;
                                String str3 = ((J1.l) arrayList.get(arrayList.size() - 1)).f1527a;
                                E1.d dVar2 = new E1.d(5, false);
                                dVar2.f973c = mVar2;
                                if (mVar2.a() != null) {
                                    mVar2.a().getClass();
                                    String str4 = mVar2.a().f1523d;
                                    if (str4 != null) {
                                        dVar2.f974d = str4;
                                    }
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.f974d = str3;
                                    zzaa.zzc((m) dVar2.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar2.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar2.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar2 = new c(dVar2);
                                    C2182j c2182j2 = AbstractC2186n.f19876c;
                                    Object[] objArr2 = {cVar2};
                                    R2.b.i(1, objArr2);
                                    E h9 = AbstractC2186n.h(1, objArr2);
                                    a7.b bVar2 = new a7.b(4, false);
                                    ?? obj3 = new Object();
                                    obj3.f1512a = true;
                                    bVar2.f4078d = obj3;
                                    bVar2.f4077c = new ArrayList(h9);
                                    int i14 = a6.f22177e.b(iAPActivity, bVar2.m()).f1520a;
                                } else {
                                    throw new IllegalArgumentException("offerToken can not be empty");
                                }
                            }
                        }
                        return yVar;
                    default:
                        j.e(iAPActivity, "this$0");
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
                        iAPActivity.startActivity(intent);
                        return yVar;
                }
            }
        });
        AppCompatTextView appCompatTextView2 = ((AbstractC2791g) k()).f23308w;
        j.d(appCompatTextView2, "tvCancel");
        final int i13 = 4;
        d.I(appCompatTextView2, new l(this) { // from class: H6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IAPActivity f1392c;

            {
                this.f1392c = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, J1.d] */
            /* JADX WARN: Type inference failed for: r0v8, types: [p1.d, k.y, android.app.Dialog] */
            @Override // F7.l
            public final Object invoke(Object obj) {
                int i102;
                y yVar = y.f23029a;
                IAPActivity iAPActivity = this.f1392c;
                int i112 = i13;
                int i122 = IAPActivity.f19655h;
                switch (i112) {
                    case 0:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.t();
                        return yVar;
                    case 1:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(true);
                        iAPActivity.f19656f = "sub_year_arruler1_19.99";
                        return yVar;
                    case 2:
                        j.e(iAPActivity, "this$0");
                        iAPActivity.u(false);
                        iAPActivity.f19656f = "sub_month_arruler1_3.99";
                        return yVar;
                    case 3:
                        j.e(iAPActivity, "this$0");
                        C2538b a6 = C2538b.a();
                        String str = iAPActivity.f19656f;
                        a6.getClass();
                        if (AbstractC2748a.f23066a.booleanValue()) {
                            if (a6.f22178f != null) {
                                m mVar = (m) a6.f22180h.get("android.test.purchased");
                                if (AbstractC2748a.f23066a.booleanValue()) {
                                    C2400c c2400c = a6.f22175c;
                                    TypedValue typedValue = new TypedValue();
                                    if (iAPActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                                        i102 = typedValue.resourceId;
                                    } else {
                                        i102 = R.style.Theme_Design_Light_BottomSheetDialog;
                                    }
                                    ?? yVar2 = new k.y(iAPActivity, i102);
                                    yVar2.l = true;
                                    yVar2.m = true;
                                    yVar2.f22197r = new p(yVar2);
                                    yVar2.d().i(1);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22195p = yVar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                                    yVar2.f22198s = mVar;
                                    yVar2.f22199t = 1;
                                    yVar2.f22205z = c2400c;
                                    yVar2.show();
                                } else if (mVar != null) {
                                    a6.f22182j = "android.test.purchased";
                                    a6.f22183k = 1;
                                    E1.d dVar = new E1.d(5, false);
                                    dVar.f973c = mVar;
                                    if (mVar.a() != null) {
                                        mVar.a().getClass();
                                        String str2 = mVar.a().f1523d;
                                        if (str2 != null) {
                                            dVar.f974d = str2;
                                        }
                                    }
                                    zzaa.zzc((m) dVar.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar = new c(dVar);
                                    C2182j c2182j = AbstractC2186n.f19876c;
                                    Object[] objArr = {cVar};
                                    R2.b.i(1, objArr);
                                    E h6 = AbstractC2186n.h(1, objArr);
                                    a7.b bVar = new a7.b(4, false);
                                    ?? obj2 = new Object();
                                    obj2.f1512a = true;
                                    bVar.f4078d = obj2;
                                    bVar.f4077c = new ArrayList(h6);
                                    int i132 = a6.f22177e.b(iAPActivity, bVar.m()).f1520a;
                                }
                            }
                        } else if (a6.f22179g != null) {
                            HashMap hashMap = a6.f22181i;
                            m mVar2 = (m) hashMap.get(str);
                            if (mVar2 != null) {
                                ArrayList arrayList = ((m) hashMap.get(str)).f1535i;
                                String str3 = ((J1.l) arrayList.get(arrayList.size() - 1)).f1527a;
                                E1.d dVar2 = new E1.d(5, false);
                                dVar2.f973c = mVar2;
                                if (mVar2.a() != null) {
                                    mVar2.a().getClass();
                                    String str4 = mVar2.a().f1523d;
                                    if (str4 != null) {
                                        dVar2.f974d = str4;
                                    }
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    dVar2.f974d = str3;
                                    zzaa.zzc((m) dVar2.f973c, "ProductDetails is required for constructing ProductDetailsParams.");
                                    if (((m) dVar2.f973c).f1535i != null) {
                                        zzaa.zzc((String) dVar2.f974d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                                    }
                                    c cVar2 = new c(dVar2);
                                    C2182j c2182j2 = AbstractC2186n.f19876c;
                                    Object[] objArr2 = {cVar2};
                                    R2.b.i(1, objArr2);
                                    E h9 = AbstractC2186n.h(1, objArr2);
                                    a7.b bVar2 = new a7.b(4, false);
                                    ?? obj3 = new Object();
                                    obj3.f1512a = true;
                                    bVar2.f4078d = obj3;
                                    bVar2.f4077c = new ArrayList(h9);
                                    int i14 = a6.f22177e.b(iAPActivity, bVar2.m()).f1520a;
                                } else {
                                    throw new IllegalArgumentException("offerToken can not be empty");
                                }
                            }
                        }
                        return yVar;
                    default:
                        j.e(iAPActivity, "this$0");
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
                        iAPActivity.startActivity(intent);
                        return yVar;
                }
            }
        });
    }

    public final void t() {
        if (this.f19657g) {
            finish();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) HomeActivity.class);
        intent.putExtra("key_tracking_screen_from", getClass().getSimpleName());
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        finish();
    }

    public final void u(boolean z8) {
        if (z8) {
            ((AbstractC2791g) k()).f23303r.setBackgroundResource(R.drawable.bg_item_iap_active);
            ((AbstractC2791g) k()).f23302q.setBackgroundResource(R.drawable.bg_item_iap_inactive);
            AppCompatTextView appCompatTextView = ((AbstractC2791g) k()).f23307v;
            j.d(appCompatTextView, "tvBestChoice");
            appCompatTextView.setVisibility(0);
            ((AbstractC2791g) k()).f23305t.setActivated(true);
            ((AbstractC2791g) k()).f23306u.setActivated(false);
            return;
        }
        ((AbstractC2791g) k()).f23303r.setBackgroundResource(R.drawable.bg_item_iap_inactive);
        ((AbstractC2791g) k()).f23302q.setBackgroundResource(R.drawable.bg_item_iap_active);
        AppCompatTextView appCompatTextView2 = ((AbstractC2791g) k()).f23307v;
        j.d(appCompatTextView2, "tvBestChoice");
        appCompatTextView2.setVisibility(8);
        ((AbstractC2791g) k()).f23305t.setActivated(false);
        ((AbstractC2791g) k()).f23306u.setActivated(true);
    }
}
