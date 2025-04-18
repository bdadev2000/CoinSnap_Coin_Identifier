package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookActivity;
import com.facebook.h0;
import com.facebook.internal.m0;
import com.facebook.l0;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/facebook/login/i;", "Landroidx/fragment/app/r;", "<init>", "()V", "ni/a", "p3/l", "com/facebook/login/g", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class i extends androidx.fragment.app.r {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f11223n = 0;

    /* renamed from: b, reason: collision with root package name */
    public View f11224b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f11225c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f11226d;

    /* renamed from: f, reason: collision with root package name */
    public j f11227f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f11228g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public volatile h0 f11229h;

    /* renamed from: i, reason: collision with root package name */
    public volatile ScheduledFuture f11230i;

    /* renamed from: j, reason: collision with root package name */
    public volatile g f11231j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11232k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11233l;

    /* renamed from: m, reason: collision with root package name */
    public r f11234m;

    static {
        new ni.a();
    }

    public static String e() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = x5.i.a;
        sb2.append(com.facebook.x.b());
        sb2.append('|');
        x5.i.s();
        String str = com.facebook.x.f11426f;
        if (str != null) {
            sb2.append(str);
            return sb2.toString();
        }
        throw new com.facebook.q("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public final void c(String userId, p3.l lVar, String accessToken, Date date, Date date2) {
        j jVar = this.f11227f;
        if (jVar != null) {
            String applicationId = com.facebook.x.b();
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            com.facebook.a token = new com.facebook.a(accessToken, applicationId, userId, lVar.a, lVar.f23376b, lVar.f23377c, com.facebook.k.DEVICE_AUTH, date, null, date2);
            r rVar = jVar.f().f11301i;
            Intrinsics.checkNotNullParameter(token, "token");
            jVar.f().f(new t(rVar, s.SUCCESS, token, null, null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View f(boolean z10) {
        int i10;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        if (z10) {
            i10 = R.layout.com_facebook_smart_device_dialog_fragment;
        } else {
            i10 = R.layout.com_facebook_device_auth_dialog_fragment;
        }
        View inflate = layoutInflater.inflate(i10, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(R.id.progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f11224b = findViewById;
        View findViewById2 = inflate.findViewById(R.id.confirmation_code);
        if (findViewById2 != null) {
            this.f11225c = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.cancel_button);
            if (findViewById3 != null) {
                ((Button) findViewById3).setOnClickListener(new z2.b(this, 3));
                View findViewById4 = inflate.findViewById(R.id.com_facebook_device_auth_instructions);
                if (findViewById4 != null) {
                    TextView textView = (TextView) findViewById4;
                    this.f11226d = textView;
                    textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
                    return inflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void g() {
        if (!this.f11228g.compareAndSet(false, true)) {
            return;
        }
        g gVar = this.f11231j;
        if (gVar != null) {
            h6.b bVar = h6.b.a;
            h6.b.a(gVar.f11214c);
        }
        j jVar = this.f11227f;
        if (jVar != null) {
            jVar.f().f(ni.a.m(jVar.f().f11301i, "User canceled log in."));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void h(com.facebook.q ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (!this.f11228g.compareAndSet(false, true)) {
            return;
        }
        g gVar = this.f11231j;
        if (gVar != null) {
            h6.b bVar = h6.b.a;
            h6.b.a(gVar.f11214c);
        }
        j jVar = this.f11227f;
        if (jVar != null) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jVar.f().f(ni.a.q(jVar.f().f11301i, null, ex.getMessage(), null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void i(String str, long j3, Long l10) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (j3 != 0) {
            date = new Date((j3 * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date2 = new Date(l10.longValue() * 1000);
        }
        com.facebook.a aVar = new com.facebook.a(str, com.facebook.x.b(), "0", null, null, null, null, date, null, date2);
        String str2 = com.facebook.g0.f11000j;
        com.facebook.g0 y4 = com.facebook.c.y(aVar, "me", new com.facebook.e(2, this, str, date, date2));
        y4.k(l0.GET);
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        y4.f11006d = bundle;
        y4.d();
    }

    public final void j() {
        String str;
        g gVar = this.f11231j;
        if (gVar != null) {
            gVar.f11217g = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        g gVar2 = this.f11231j;
        if (gVar2 == null) {
            str = null;
        } else {
            str = gVar2.f11215d;
        }
        bundle.putString("code", str);
        bundle.putString("access_token", e());
        String str2 = com.facebook.g0.f11000j;
        this.f11229h = com.facebook.c.B("device/login_status", bundle, new e(this, 0)).d();
    }

    public final void k() {
        Long valueOf;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        g gVar = this.f11231j;
        if (gVar == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(gVar.f11216f);
        }
        if (valueOf != null) {
            synchronized (j.f11235f) {
                if (j.f11236g == null) {
                    j.f11236g = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = j.f11236g;
                if (scheduledThreadPoolExecutor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("backgroundExecutor");
                    throw null;
                }
            }
            this.f11230i = scheduledThreadPoolExecutor.schedule(new androidx.activity.d(this, 25), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(com.facebook.login.g r22) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.i.l(com.facebook.login.g):void");
    }

    public final void m(r request) {
        String jSONObject;
        Intrinsics.checkNotNullParameter(request, "request");
        this.f11234m = request;
        Bundle b3 = new Bundle();
        b3.putString("scope", TextUtils.join(",", request.f11265c));
        Intrinsics.checkNotNullParameter(b3, "b");
        String str = request.f11270i;
        if (!m0.z(str)) {
            b3.putString("redirect_uri", str);
        }
        Intrinsics.checkNotNullParameter(b3, "b");
        String str2 = request.f11272k;
        if (!m0.z(str2)) {
            b3.putString("target_user_id", str2);
        }
        b3.putString("access_token", e());
        h6.b bVar = h6.b.a;
        if (!m6.a.b(h6.b.class)) {
            try {
                HashMap hashMap = new HashMap();
                String DEVICE = Build.DEVICE;
                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                hashMap.put("device", DEVICE);
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                hashMap.put("model", MODEL);
                jSONObject = new JSONObject(hashMap).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
            } catch (Throwable th2) {
                m6.a.a(h6.b.class, th2);
            }
            b3.putString("device_info", jSONObject);
            String str3 = com.facebook.g0.f11000j;
            com.facebook.c.B("device/login", b3, new e(this, 1)).d();
        }
        jSONObject = null;
        b3.putString("device_info", jSONObject);
        String str32 = com.facebook.g0.f11000j;
        com.facebook.c.B("device/login", b3, new e(this, 1)).d();
    }

    @Override // androidx.fragment.app.r
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z10;
        h hVar = new h(this, requireActivity());
        if (h6.b.c() && !this.f11233l) {
            z10 = true;
        } else {
            z10 = false;
        }
        hVar.setContentView(f(z10));
        return hVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        a0 i10;
        g gVar;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        x xVar = (x) ((FacebookActivity) requireActivity()).f10879b;
        if (xVar == null) {
            i10 = null;
        } else {
            i10 = xVar.b().i();
        }
        this.f11227f = (j) i10;
        if (bundle != null && (gVar = (g) bundle.getParcelable("request_state")) != null) {
            l(gVar);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f11232k = true;
        this.f11228g.set(true);
        super.onDestroyView();
        h0 h0Var = this.f11229h;
        if (h0Var != null) {
            h0Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f11230i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.r, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (!this.f11232k) {
            g();
        }
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f11231j != null) {
            outState.putParcelable("request_state", this.f11231j);
        }
    }
}
