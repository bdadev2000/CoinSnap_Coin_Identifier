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

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f8788a;
    private final int b;

    /* renamed from: c */
    private List f8789c;

    /* renamed from: d */
    private String f8790d;

    /* renamed from: e */
    private h4 f8791e;

    /* renamed from: f */
    private f4.c f8792f;

    /* renamed from: g */
    private f4.b f8793g;

    /* renamed from: h */
    private h4 f8794h;

    /* renamed from: i */
    private Dialog f8795i;

    /* renamed from: j */
    private final AbstractC0734p f8796j = new a();

    /* loaded from: classes.dex */
    public class a extends AbstractC0734p {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || l4.this.f8794h == null) {
                return;
            }
            if (l4.this.f8795i != null) {
                l4 l4Var = l4.this;
                if (!r.a(l4Var.a(l4Var.f8795i))) {
                    l4.this.f8795i.dismiss();
                }
                l4.this.f8795i = null;
            }
            h4 h4Var = l4.this.f8794h;
            l4.this.f8794h = null;
            l4 l4Var2 = l4.this;
            l4Var2.a(l4Var2.f8791e, h4Var, activity);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ j4 f8798a;
        final /* synthetic */ h4 b;

        /* renamed from: c */
        final /* synthetic */ Activity f8799c;

        public b(j4 j4Var, h4 h4Var, Activity activity) {
            this.f8798a = j4Var;
            this.b = h4Var;
            this.f8799c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            l4.this.f8794h = null;
            l4.this.f8795i = null;
            h4 a6 = l4.this.a(this.f8798a.a());
            if (a6 == null) {
                l4.this.b("Destination state for TOS/PP alert is null");
                return;
            }
            l4.this.a(this.b, a6, this.f8799c);
            if (a6.c() != h4.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Uri f8801a;
        final /* synthetic */ Activity b;

        public c(Uri uri, Activity activity) {
            this.f8801a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zp.a(this.f8801a, this.b, l4.this.f8788a);
        }
    }

    /* loaded from: classes.dex */
    public class d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Uri f8803a;
        final /* synthetic */ Activity b;

        public d(Uri uri, Activity activity) {
            this.f8803a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zp.a(this.f8803a, this.b, l4.this.f8788a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements CmpServiceImpl.d {

        /* renamed from: a */
        final /* synthetic */ h4 f8805a;
        final /* synthetic */ Activity b;

        public e(h4 h4Var, Activity activity) {
            this.f8805a = h4Var;
            this.b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(AppLovinCmpError appLovinCmpError) {
            boolean z8;
            l4 l4Var = l4.this;
            h4 h4Var = this.f8805a;
            Activity activity = this.b;
            if (appLovinCmpError == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            l4Var.a(h4Var, activity, Boolean.valueOf(z8));
        }
    }

    /* loaded from: classes.dex */
    public class f implements CmpServiceImpl.e {

        /* renamed from: a */
        final /* synthetic */ h4 f8807a;
        final /* synthetic */ Activity b;

        public f(h4 h4Var, Activity activity) {
            this.f8807a = h4Var;
            this.b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError == null && l4.this.f8793g != null) {
                l4.this.f8793g.a(true);
            }
            l4.this.b(this.f8807a, this.b);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ h4 f8809a;

        public g(h4 h4Var) {
            this.f8809a = h4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            l4 l4Var = l4.this;
            l4Var.a(l4Var.f8791e, this.f8809a, l4.this.f8788a.p0());
        }
    }

    public l4(com.applovin.impl.sdk.k kVar) {
        this.f8788a = kVar;
        this.b = ((Integer) kVar.a(oj.f9878w6)).intValue();
    }

    public void c() {
        f4.b bVar;
        this.f8789c = null;
        this.f8791e = null;
        this.f8788a.e().b(this.f8796j);
        f4.c cVar = this.f8792f;
        if (cVar != null && (bVar = this.f8793g) != null) {
            cVar.a(bVar);
        }
        this.f8792f = null;
        this.f8793g = null;
    }

    public void b(String str) {
        o6.a(str, new Object[0]);
        this.f8788a.B().a(o.b.CONSENT_FLOW_ERROR, str, (Map) CollectionUtils.hashMap("details", "Last started states: " + this.f8790d + "\nLast successful state: " + this.f8791e));
        f4.b bVar = this.f8793g;
        if (bVar != null) {
            bVar.a(new d4(d4.f7177f, str));
        }
        c();
    }

    private h4 a() {
        List<h4> list = this.f8789c;
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
        AppLovinSdkUtils.runOnUiThread(new O2(this, h4Var, activity, 9));
    }

    public boolean b() {
        return this.f8789c != null;
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

    public void b(h4 h4Var, Activity activity) {
        a(h4Var, activity, (Boolean) null);
    }

    public h4 a(String str) {
        List<h4> list = this.f8789c;
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
        textView.setMaxLines(this.b);
    }

    public /* synthetic */ void a(h4 h4Var, Activity activity) {
        SpannableString spannableString;
        if (h4Var == null) {
            b("Consent flow state is null");
            return;
        }
        this.f8788a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f8788a.L().a("AppLovinSdk", "Transitioning to state: " + h4Var);
        }
        if (h4Var.c() == h4.b.ALERT) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            }
            i4 i4Var = (i4) h4Var;
            this.f8794h = i4Var;
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
            String g9 = i4Var.g();
            if (StringUtils.isValidString(g9)) {
                spannableString = new SpannableString(g9);
                String a6 = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String a9 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(g9, Arrays.asList(a6, a9))) {
                    Uri i9 = this.f8788a.t().i();
                    if (i9 != null) {
                        StringUtils.addLinks(spannableString, Pattern.compile(a6), new c(i9, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(a9), new d(this.f8788a.t().h(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog create = builder.setTitle(spannableString).setMessage(i4Var.f()).create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.U0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    l4.this.a(create, dialogInterface);
                }
            });
            this.f8795i = create;
            create.show();
            return;
        }
        if (h4Var.c() == h4.b.EVENT) {
            k4 k4Var = (k4) h4Var;
            String f9 = k4Var.f();
            Map<String, String> e4 = k4Var.e();
            if (e4 == null) {
                e4 = new HashMap<>(1);
            }
            e4.put("flow_type", this.f8788a.t().e().b());
            this.f8788a.C().trackEvent(f9, e4);
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
                this.f8788a.n().loadCmp(activity, new e(h4Var, activity));
                return;
            }
        }
        if (h4Var.c() == h4.b.CMP_SHOW) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            } else {
                this.f8788a.C().trackEvent("cf_start");
                this.f8788a.n().showCmp(activity, new f(h4Var, activity));
                return;
            }
        }
        if (h4Var.c() == h4.b.DECISION) {
            h4.a a10 = h4Var.a();
            if (a10 != h4.a.IS_AL_GDPR) {
                b("Invalid consent flow decision type: " + a10);
                return;
            }
            AppLovinSdkConfiguration.ConsentFlowUserGeography f10 = this.f8788a.t().f();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            a(h4Var, activity, Boolean.valueOf(this.f8788a.q().getConsentFlowUserGeography() == consentFlowUserGeography || (f10 == consentFlowUserGeography && zp.c(this.f8788a))));
            return;
        }
        if (h4Var.c() == h4.b.TERMS_FLOW) {
            List a11 = e4.a(this.f8788a);
            if (a11 != null && a11.size() > 0) {
                this.f8788a.C().trackEvent("cf_start");
                this.f8789c = a11;
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

    public void a(boolean z8) {
        if (this.f8788a.t().e() == g4.a.TERMS) {
            return;
        }
        y3.b(z8, com.applovin.impl.sdk.k.k());
    }

    public void a(List list, Activity activity, f4.c cVar) {
        if (this.f8789c != null) {
            this.f8788a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f8788a.L().a("AppLovinSdk", "Unable to start states: " + list);
            }
            this.f8788a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f8788a.L().a("AppLovinSdk", "Consent flow already in progress for states: " + this.f8789c);
            }
            cVar.a(new f4.b(new d4(d4.f7176e, "Consent flow is already in progress.")));
            return;
        }
        this.f8789c = list;
        this.f8790d = String.valueOf(list);
        this.f8792f = cVar;
        this.f8793g = new f4.b();
        com.applovin.impl.sdk.k.a(activity).a(this.f8796j);
        a((h4) null, a(), activity);
    }

    public void a(h4 h4Var, Activity activity, Boolean bool) {
        a(h4Var, a(h4Var.a(bool)), activity);
    }

    public void a(h4 h4Var, h4 h4Var2, Activity activity) {
        this.f8791e = h4Var;
        c(h4Var2, activity);
    }

    private void a(h4 h4Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new g(h4Var), TimeUnit.SECONDS.toMillis(1L));
    }
}
