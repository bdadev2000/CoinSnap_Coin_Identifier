package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.h4;
import com.applovin.impl.j4;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class l4 {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final int f5822b;

    /* renamed from: c */
    private List f5823c;

    /* renamed from: d */
    private String f5824d;

    /* renamed from: e */
    private h4 f5825e;

    /* renamed from: f */
    private f4.c f5826f;

    /* renamed from: g */
    private f4.b f5827g;

    /* renamed from: h */
    private h4 f5828h;

    /* renamed from: i */
    private Dialog f5829i;

    /* renamed from: j */
    private final p f5830j = new a();

    /* loaded from: classes.dex */
    public class a extends p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || l4.this.f5828h == null) {
                return;
            }
            if (l4.this.f5829i != null) {
                l4 l4Var = l4.this;
                if (!r.a(l4Var.a(l4Var.f5829i))) {
                    l4.this.f5829i.dismiss();
                }
                l4.this.f5829i = null;
            }
            h4 h4Var = l4.this.f5828h;
            l4.this.f5828h = null;
            l4 l4Var2 = l4.this;
            l4Var2.a(l4Var2.f5825e, h4Var, activity);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        final /* synthetic */ j4 a;

        /* renamed from: b */
        final /* synthetic */ h4 f5831b;

        /* renamed from: c */
        final /* synthetic */ Activity f5832c;

        public b(j4 j4Var, h4 h4Var, Activity activity) {
            this.a = j4Var;
            this.f5831b = h4Var;
            this.f5832c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            l4.this.f5828h = null;
            l4.this.f5829i = null;
            h4 a = l4.this.a(this.a.a());
            if (a == null) {
                l4.this.b("Destination state for TOS/PP alert is null");
                return;
            }
            l4.this.a(this.f5831b, a, this.f5832c);
            if (a.c() != h4.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends ClickableSpan {
        final /* synthetic */ Uri a;

        /* renamed from: b */
        final /* synthetic */ Activity f5834b;

        public c(Uri uri, Activity activity) {
            this.a = uri;
            this.f5834b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zp.a(this.a, this.f5834b, l4.this.a);
        }
    }

    /* loaded from: classes.dex */
    public class d extends ClickableSpan {
        final /* synthetic */ Uri a;

        /* renamed from: b */
        final /* synthetic */ Activity f5836b;

        public d(Uri uri, Activity activity) {
            this.a = uri;
            this.f5836b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zp.a(this.a, this.f5836b, l4.this.a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements CmpServiceImpl.d {
        final /* synthetic */ h4 a;

        /* renamed from: b */
        final /* synthetic */ Activity f5838b;

        public e(h4 h4Var, Activity activity) {
            this.a = h4Var;
            this.f5838b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(AppLovinCmpError appLovinCmpError) {
            l4.this.a(this.a, this.f5838b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* loaded from: classes.dex */
    public class f implements CmpServiceImpl.e {
        final /* synthetic */ h4 a;

        /* renamed from: b */
        final /* synthetic */ Activity f5840b;

        public f(h4 h4Var, Activity activity) {
            this.a = h4Var;
            this.f5840b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError == null && l4.this.f5827g != null) {
                l4.this.f5827g.a(true);
            }
            l4.this.b(this.a, this.f5840b);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        final /* synthetic */ h4 a;

        public g(h4 h4Var) {
            this.a = h4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            l4 l4Var = l4.this;
            l4Var.a(l4Var.f5825e, this.a, l4.this.a.p0());
        }
    }

    public l4(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f5822b = ((Integer) kVar.a(oj.f6785w6)).intValue();
    }

    public void c() {
        f4.b bVar;
        this.f5823c = null;
        this.f5825e = null;
        this.a.e().b(this.f5830j);
        f4.c cVar = this.f5826f;
        if (cVar != null && (bVar = this.f5827g) != null) {
            cVar.a(bVar);
        }
        this.f5826f = null;
        this.f5827g = null;
    }

    public void b(String str) {
        o6.a(str, new Object[0]);
        this.a.B().a(o.b.CONSENT_FLOW_ERROR, str, (Map) CollectionUtils.hashMap("details", "Last started states: " + this.f5824d + "\nLast successful state: " + this.f5825e));
        f4.b bVar = this.f5827g;
        if (bVar != null) {
            bVar.a(new d4(d4.f4202f, str));
        }
        c();
    }

    private h4 a() {
        List<h4> list = this.f5823c;
        if (list == null) {
            return null;
        }
        for (h4 h4Var : list) {
            if (h4Var.d()) {
                return h4Var;
            }
        }
        return null;
    }

    private void c(h4 h4Var, Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new yv(9, this, h4Var, activity));
    }

    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    public boolean b() {
        return this.f5823c != null;
    }

    public void b(h4 h4Var, Activity activity) {
        a(h4Var, activity, (Boolean) null);
    }

    public h4 a(String str) {
        List<h4> list = this.f5823c;
        if (list == null) {
            return null;
        }
        for (h4 h4Var : list) {
            if (str.equalsIgnoreCase(h4Var.b())) {
                return h4Var;
            }
        }
        return null;
    }

    public /* synthetic */ void a(AlertDialog alertDialog, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f5822b);
    }

    public /* synthetic */ void a(h4 h4Var, Activity activity) {
        SpannableString spannableString;
        if (h4Var == null) {
            b("Consent flow state is null");
            return;
        }
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("AppLovinSdk", "Transitioning to state: " + h4Var);
        }
        if (h4Var.c() == h4.b.ALERT) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            }
            i4 i4Var = (i4) h4Var;
            this.f5828h = i4Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            for (j4 j4Var : i4Var.e()) {
                b bVar = new b(j4Var, h4Var, activity);
                if (j4Var.c() == j4.a.POSITIVE) {
                    builder.setPositiveButton(j4Var.d(), bVar);
                } else if (j4Var.c() == j4.a.NEGATIVE) {
                    builder.setNegativeButton(j4Var.d(), bVar);
                } else {
                    builder.setNeutralButton(j4Var.d(), bVar);
                }
            }
            String g10 = i4Var.g();
            if (StringUtils.isValidString(g10)) {
                spannableString = new SpannableString(g10);
                String a10 = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String a11 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(g10, Arrays.asList(a10, a11))) {
                    Uri i10 = this.a.t().i();
                    if (i10 != null) {
                        StringUtils.addLinks(spannableString, Pattern.compile(a10), new c(i10, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(a11), new d(this.a.t().h(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog create = builder.setTitle(spannableString).setMessage(i4Var.f()).create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.cu
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    l4.this.a(create, dialogInterface);
                }
            });
            this.f5829i = create;
            create.show();
            return;
        }
        if (h4Var.c() == h4.b.EVENT) {
            k4 k4Var = (k4) h4Var;
            String f10 = k4Var.f();
            Map<String, String> e2 = k4Var.e();
            if (e2 == null) {
                e2 = new HashMap<>(1);
            }
            e2.put("flow_type", this.a.t().e().b());
            this.a.C().trackEvent(f10, e2);
            b(k4Var, activity);
            return;
        }
        if (h4Var.c() == h4.b.HAS_USER_CONSENT) {
            a(true);
            b(h4Var, activity);
            return;
        }
        if (h4Var.c() == h4.b.CMP_LOAD) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            } else {
                this.a.n().loadCmp(activity, new e(h4Var, activity));
                return;
            }
        }
        if (h4Var.c() == h4.b.CMP_SHOW) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            } else {
                this.a.C().trackEvent("cf_start");
                this.a.n().showCmp(activity, new f(h4Var, activity));
                return;
            }
        }
        if (h4Var.c() == h4.b.DECISION) {
            h4.a a12 = h4Var.a();
            if (a12 != h4.a.IS_AL_GDPR) {
                b("Invalid consent flow decision type: " + a12);
                return;
            }
            AppLovinSdkConfiguration.ConsentFlowUserGeography f11 = this.a.t().f();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            a(h4Var, activity, Boolean.valueOf(this.a.q().getConsentFlowUserGeography() == consentFlowUserGeography || (f11 == consentFlowUserGeography && zp.c(this.a))));
            return;
        }
        if (h4Var.c() == h4.b.TERMS_FLOW) {
            List a13 = e4.a(this.a);
            if (a13 != null && a13.size() > 0) {
                this.a.C().trackEvent("cf_start");
                this.f5823c = a13;
                a(h4Var, a(), activity);
                return;
            }
            c();
            return;
        }
        if (h4Var.c() == h4.b.REINIT) {
            c();
            return;
        }
        b("Invalid consent flow destination state: " + h4Var);
    }

    public void a(boolean z10) {
        if (this.a.t().e() == g4.a.TERMS) {
            return;
        }
        y3.b(z10, com.applovin.impl.sdk.k.k());
    }

    public void a(List list, Activity activity, f4.c cVar) {
        if (this.f5823c != null) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("AppLovinSdk", "Unable to start states: " + list);
            }
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("AppLovinSdk", "Consent flow already in progress for states: " + this.f5823c);
            }
            cVar.a(new f4.b(new d4(d4.f4201e, "Consent flow is already in progress.")));
            return;
        }
        this.f5823c = list;
        this.f5824d = String.valueOf(list);
        this.f5826f = cVar;
        this.f5827g = new f4.b();
        com.applovin.impl.sdk.k.a(activity).a(this.f5830j);
        a((h4) null, a(), activity);
    }

    public void a(h4 h4Var, Activity activity, Boolean bool) {
        a(h4Var, a(h4Var.a(bool)), activity);
    }

    public void a(h4 h4Var, h4 h4Var2, Activity activity) {
        this.f5825e = h4Var;
        c(h4Var2, activity);
    }

    private void a(h4 h4Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new g(h4Var), TimeUnit.SECONDS.toMillis(1L));
    }
}
