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
import com.applovin.impl.h4;
import com.applovin.impl.i4;
import com.applovin.impl.j4;
import com.applovin.impl.l4;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
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
public class n4 {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f25643a;

    /* renamed from: b */
    private final int f25644b;

    /* renamed from: c */
    private List f25645c;
    private String d;
    private j4 e;

    /* renamed from: f */
    private h4.c f25646f;

    /* renamed from: g */
    private h4.b f25647g;

    /* renamed from: h */
    private j4 f25648h;

    /* renamed from: i */
    private Dialog f25649i;

    /* renamed from: j */
    private final p f25650j = new a();

    /* loaded from: classes.dex */
    public class a extends p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || n4.this.f25648h == null) {
                return;
            }
            if (n4.this.f25649i != null) {
                n4 n4Var = n4.this;
                if (!r.a(n4Var.a(n4Var.f25649i))) {
                    n4.this.f25649i.dismiss();
                }
                n4.this.f25649i = null;
            }
            j4 j4Var = n4.this.f25648h;
            n4.this.f25648h = null;
            n4 n4Var2 = n4.this;
            n4Var2.a(n4Var2.e, j4Var, activity);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ l4 f25652a;

        /* renamed from: b */
        final /* synthetic */ j4 f25653b;

        /* renamed from: c */
        final /* synthetic */ Activity f25654c;

        public b(l4 l4Var, j4 j4Var, Activity activity) {
            this.f25652a = l4Var;
            this.f25653b = j4Var;
            this.f25654c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            n4.this.f25648h = null;
            n4.this.f25649i = null;
            j4 a2 = n4.this.a(this.f25652a.a());
            if (a2 == null) {
                n4.this.b("Destination state for TOS/PP alert is null");
                return;
            }
            n4.this.a(this.f25653b, a2, this.f25654c);
            if (a2.c() != j4.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Uri f25655a;

        /* renamed from: b */
        final /* synthetic */ Activity f25656b;

        public c(Uri uri, Activity activity) {
            this.f25655a = uri;
            this.f25656b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            yp.a(this.f25655a, this.f25656b, n4.this.f25643a);
        }
    }

    /* loaded from: classes.dex */
    public class d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Uri f25658a;

        /* renamed from: b */
        final /* synthetic */ Activity f25659b;

        public d(Uri uri, Activity activity) {
            this.f25658a = uri;
            this.f25659b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            yp.a(this.f25658a, this.f25659b, n4.this.f25643a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements CmpServiceImpl.d {

        /* renamed from: a */
        final /* synthetic */ j4 f25661a;

        /* renamed from: b */
        final /* synthetic */ Activity f25662b;

        public e(j4 j4Var, Activity activity) {
            this.f25661a = j4Var;
            this.f25662b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(AppLovinCmpError appLovinCmpError) {
            n4.this.a(this.f25661a, this.f25662b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* loaded from: classes.dex */
    public class f implements CmpServiceImpl.e {

        /* renamed from: a */
        final /* synthetic */ j4 f25664a;

        /* renamed from: b */
        final /* synthetic */ Activity f25665b;

        public f(j4 j4Var, Activity activity) {
            this.f25664a = j4Var;
            this.f25665b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError == null && n4.this.f25647g != null) {
                n4.this.f25647g.a(true);
            }
            n4.this.b(this.f25664a, this.f25665b);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ j4 f25667a;

        public g(j4 j4Var) {
            this.f25667a = j4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            n4 n4Var = n4.this;
            n4Var.a(n4Var.e, this.f25667a, n4.this.f25643a.n0());
        }
    }

    public n4(com.applovin.impl.sdk.j jVar) {
        this.f25643a = jVar;
        this.f25644b = ((Integer) jVar.a(sj.C6)).intValue();
    }

    public boolean b() {
        return this.f25645c != null;
    }

    public void c() {
        h4.b bVar;
        this.f25645c = null;
        this.e = null;
        this.f25643a.e().b(this.f25650j);
        h4.c cVar = this.f25646f;
        if (cVar != null && (bVar = this.f25647g) != null) {
            cVar.a(bVar);
        }
        this.f25646f = null;
        this.f25647g = null;
    }

    private void c(j4 j4Var, Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new ks(this, 11, j4Var, activity));
    }

    public void b(String str) {
        q6.a(str, new Object[0]);
        this.f25643a.E().a(la.I, str, (Map) CollectionUtils.hashMap("details", "Last started states: " + this.d + "\nLast successful state: " + this.e));
        h4.b bVar = this.f25647g;
        if (bVar != null) {
            bVar.a(new f4(f4.f23812f, str));
        }
        c();
    }

    private j4 a() {
        List<j4> list = this.f25645c;
        if (list == null) {
            return null;
        }
        for (j4 j4Var : list) {
            if (j4Var.d()) {
                return j4Var;
            }
        }
        return null;
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

    public void b(j4 j4Var, Activity activity) {
        a(j4Var, activity, (Boolean) null);
    }

    public j4 a(String str) {
        List<j4> list = this.f25645c;
        if (list == null) {
            return null;
        }
        for (j4 j4Var : list) {
            if (str.equalsIgnoreCase(j4Var.b())) {
                return j4Var;
            }
        }
        return null;
    }

    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f25644b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
    }

    public /* synthetic */ void a(j4 j4Var, final Activity activity) {
        SpannableString spannableString;
        if (j4Var == null) {
            b("Consent flow state is null");
            return;
        }
        this.f25643a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f25643a.J().a("AppLovinSdk", "Transitioning to state: " + j4Var);
        }
        if (j4Var.c() == j4.b.ALERT) {
            if (r.a(activity)) {
                a(j4Var);
                return;
            }
            k4 k4Var = (k4) j4Var;
            this.f25648h = k4Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            for (l4 l4Var : k4Var.e()) {
                b bVar = new b(l4Var, j4Var, activity);
                if (l4Var.c() == l4.a.POSITIVE) {
                    builder.setPositiveButton(l4Var.d(), bVar);
                } else if (l4Var.c() == l4.a.NEGATIVE) {
                    builder.setNegativeButton(l4Var.d(), bVar);
                } else {
                    builder.setNeutralButton(l4Var.d(), bVar);
                }
            }
            String g2 = k4Var.g();
            if (StringUtils.isValidString(g2)) {
                spannableString = new SpannableString(g2);
                String a2 = com.applovin.impl.sdk.j.a(R.string.applovin_terms_of_service_text);
                String a3 = com.applovin.impl.sdk.j.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(g2, Arrays.asList(a2, a3))) {
                    Uri i2 = this.f25643a.u().i();
                    if (i2 != null) {
                        StringUtils.addLinks(spannableString, Pattern.compile(a2), new c(i2, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(a3), new d(this.f25643a.u().h(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog create = builder.setTitle(spannableString).setMessage(k4Var.f()).create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.lu
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    n4.this.a(create, activity, dialogInterface);
                }
            });
            this.f25649i = create;
            create.show();
            return;
        }
        if (j4Var.c() == j4.b.EVENT) {
            m4 m4Var = (m4) j4Var;
            String f2 = m4Var.f();
            Map<String, String> e2 = m4Var.e();
            if (e2 == null) {
                e2 = new HashMap<>(1);
            }
            e2.put("flow_type", this.f25643a.u().e().b());
            this.f25643a.A().trackEvent(f2, e2);
            b(m4Var, activity);
            return;
        }
        if (j4Var.c() == j4.b.HAS_USER_CONSENT) {
            a(true);
            b(j4Var, activity);
            return;
        }
        if (j4Var.c() == j4.b.CMP_LOAD) {
            if (r.a(activity)) {
                a(j4Var);
                return;
            } else {
                this.f25643a.o().loadCmp(activity, new e(j4Var, activity));
                return;
            }
        }
        if (j4Var.c() == j4.b.CMP_SHOW) {
            if (r.a(activity)) {
                a(j4Var);
                return;
            } else {
                this.f25643a.A().trackEvent("cf_start");
                this.f25643a.o().showCmp(activity, new f(j4Var, activity));
                return;
            }
        }
        if (j4Var.c() == j4.b.DECISION) {
            j4.a a4 = j4Var.a();
            if (a4 != j4.a.IS_AL_GDPR) {
                b("Invalid consent flow decision type: " + a4);
                return;
            }
            AppLovinSdkConfiguration.ConsentFlowUserGeography f3 = this.f25643a.u().f();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            a(j4Var, activity, Boolean.valueOf(this.f25643a.r().getConsentFlowUserGeography() == consentFlowUserGeography || (f3 == consentFlowUserGeography && yp.c(this.f25643a))));
            return;
        }
        if (j4Var.c() == j4.b.TERMS_FLOW) {
            List a5 = g4.a(this.f25643a);
            if (a5 != null && a5.size() > 0) {
                this.f25643a.A().trackEvent("cf_start");
                this.f25645c = a5;
                a(j4Var, a(), activity);
                return;
            }
            c();
            return;
        }
        if (j4Var.c() == j4.b.REINIT) {
            c();
            return;
        }
        b("Invalid consent flow destination state: " + j4Var);
    }

    public void a(boolean z2) {
        if (this.f25643a.u().e() == i4.a.TERMS) {
            return;
        }
        a4.b(z2, com.applovin.impl.sdk.j.l());
    }

    public void a(List list, Activity activity, h4.c cVar) {
        if (this.f25645c != null) {
            this.f25643a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f25643a.J().a("AppLovinSdk", "Unable to start states: " + list);
            }
            this.f25643a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f25643a.J().a("AppLovinSdk", "Consent flow already in progress for states: " + this.f25645c);
            }
            cVar.a(new h4.b(new f4(f4.e, "Consent flow is already in progress.")));
            return;
        }
        this.f25645c = list;
        this.d = String.valueOf(list);
        this.f25646f = cVar;
        this.f25647g = new h4.b();
        com.applovin.impl.sdk.j.a(activity).a(this.f25650j);
        a((j4) null, a(), activity);
    }

    public void a(j4 j4Var, Activity activity, Boolean bool) {
        a(j4Var, a(j4Var.a(bool)), activity);
    }

    public void a(j4 j4Var, j4 j4Var2, Activity activity) {
        this.e = j4Var;
        c(j4Var2, activity);
    }

    private void a(j4 j4Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new g(j4Var), TimeUnit.SECONDS.toMillis(1L));
    }
}
