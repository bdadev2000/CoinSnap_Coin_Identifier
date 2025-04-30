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
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w;
import com.facebook.C0785a;
import com.facebook.C1824b;
import com.facebook.C1849l;
import com.facebook.D;
import com.facebook.EnumC1828f;
import com.facebook.FacebookActivity;
import com.facebook.G;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.H;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC0487w {
    public View b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f13714c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f13715d;

    /* renamed from: f, reason: collision with root package name */
    public k f13716f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f13717g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public volatile D f13718h;

    /* renamed from: i, reason: collision with root package name */
    public volatile ScheduledFuture f13719i;

    /* renamed from: j, reason: collision with root package name */
    public volatile h f13720j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13721k;
    public boolean l;
    public q m;

    public final void c(String str, C.c cVar, String str2, Date date, Date date2) {
        k kVar = this.f13716f;
        if (kVar != null) {
            String b = com.facebook.r.b();
            List list = (List) cVar.f347c;
            List list2 = (List) cVar.f348d;
            List list3 = (List) cVar.f349f;
            EnumC1828f enumC1828f = EnumC1828f.DEVICE_AUTH;
            G7.j.e(str2, "accessToken");
            kVar.e().e(new s(kVar.e().f13775i, r.SUCCESS, new C0785a(str2, b, str, list, list2, list3, enumC1828f, date, null, date2, "facebook"), null, null, null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View d(boolean z8) {
        int i9;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        G7.j.d(layoutInflater, "requireActivity().layoutInflater");
        if (z8) {
            i9 = R.layout.com_facebook_smart_device_dialog_fragment;
        } else {
            i9 = R.layout.com_facebook_device_auth_dialog_fragment;
        }
        View inflate = layoutInflater.inflate(i9, (ViewGroup) null);
        G7.j.d(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(R.id.progress_bar);
        G7.j.d(findViewById, "view.findViewById(R.id.progress_bar)");
        this.b = findViewById;
        View findViewById2 = inflate.findViewById(R.id.confirmation_code);
        if (findViewById2 != null) {
            this.f13714c = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.cancel_button);
            if (findViewById3 != null) {
                ((Button) findViewById3).setOnClickListener(new A6.c(this, 9));
                View findViewById4 = inflate.findViewById(R.id.com_facebook_device_auth_instructions);
                if (findViewById4 != null) {
                    TextView textView = (TextView) findViewById4;
                    this.f13715d = textView;
                    textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
                    return inflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void e() {
        if (!this.f13717g.compareAndSet(false, true)) {
            return;
        }
        h hVar = this.f13720j;
        if (hVar != null) {
            J2.b bVar = J2.b.f1569a;
            J2.b.a(hVar.f13710c);
        }
        k kVar = this.f13716f;
        if (kVar != null) {
            kVar.e().e(new s(kVar.e().f13775i, r.CANCEL, null, "User canceled log in.", null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void f(C1849l c1849l) {
        if (!this.f13717g.compareAndSet(false, true)) {
            return;
        }
        h hVar = this.f13720j;
        if (hVar != null) {
            J2.b bVar = J2.b.f1569a;
            J2.b.a(hVar.f13710c);
        }
        k kVar = this.f13716f;
        if (kVar != null) {
            q qVar = kVar.e().f13775i;
            String message = c1849l.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            kVar.e().e(new s(qVar, r.ERROR, null, null, TextUtils.join(": ", arrayList), null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void g(String str, long j7, Long l) {
        Date date;
        G g9 = G.b;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (j7 != 0) {
            date = new Date((j7 * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if (l.longValue() != 0) {
            date2 = new Date(l.longValue() * 1000);
        }
        C0785a c0785a = new C0785a(str, com.facebook.r.b(), "0", null, null, null, null, date, null, date2, "facebook");
        String str2 = com.facebook.C.f13380j;
        com.facebook.C w2 = R3.e.w(c0785a, "me", new C1824b(this, str, date, date2, 2));
        w2.f13388h = g9;
        w2.f13384d = bundle;
        w2.d();
    }

    public final void h() {
        String str;
        h hVar = this.f13720j;
        if (hVar != null) {
            hVar.f13713g = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        h hVar2 = this.f13720j;
        if (hVar2 == null) {
            str = null;
        } else {
            str = hVar2.f13711d;
        }
        bundle.putString("code", str);
        StringBuilder sb = new StringBuilder();
        sb.append(com.facebook.r.b());
        sb.append('|');
        AbstractC1839h.k();
        String str2 = com.facebook.r.f13805f;
        if (str2 != null) {
            sb.append(str2);
            bundle.putString("access_token", sb.toString());
            String str3 = com.facebook.C.f13380j;
            this.f13718h = new com.facebook.C(null, "device/login_status", bundle, G.f13409c, new e(this, 0)).d();
            return;
        }
        throw new C1849l("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public final void i() {
        Long valueOf;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        h hVar = this.f13720j;
        if (hVar == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(hVar.f13712f);
        }
        if (valueOf != null) {
            synchronized (k.f13722f) {
                try {
                    if (k.f13723g == null) {
                        k.f13723g = new ScheduledThreadPoolExecutor(1);
                    }
                    scheduledThreadPoolExecutor = k.f13723g;
                    if (scheduledThreadPoolExecutor == null) {
                        G7.j.k("backgroundExecutor");
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f13719i = scheduledThreadPoolExecutor.schedule(new D3.b(this, 27), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(com.facebook.login.h r18) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.j.j(com.facebook.login.h):void");
    }

    public final void k(q qVar) {
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        this.m = qVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", qVar.f13744c));
        String str = qVar.f13749i;
        if (!H.B(str)) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = qVar.f13751k;
        if (!H.B(str2)) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(com.facebook.r.b());
        sb.append('|');
        AbstractC1839h.k();
        String str3 = com.facebook.r.f13805f;
        if (str3 != null) {
            sb.append(str3);
            bundle.putString("access_token", sb.toString());
            J2.b bVar = J2.b.f1569a;
            String str4 = null;
            if (!O2.a.b(J2.b.class)) {
                try {
                    HashMap hashMap = new HashMap();
                    String str5 = Build.DEVICE;
                    G7.j.d(str5, "DEVICE");
                    hashMap.put("device", str5);
                    String str6 = Build.MODEL;
                    G7.j.d(str6, "MODEL");
                    hashMap.put("model", str6);
                    String jSONObject = new JSONObject(hashMap).toString();
                    G7.j.d(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
                    str4 = jSONObject;
                } catch (Throwable th) {
                    O2.a.a(J2.b.class, th);
                }
            }
            bundle.putString("device_info", str4);
            String str7 = com.facebook.C.f13380j;
            new com.facebook.C(null, "device/login", bundle, G.f13409c, new e(this, 1)).d();
            return;
        }
        throw new C1849l("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z8;
        i iVar = new i(this, requireActivity());
        if (J2.b.c() && !this.l) {
            z8 = true;
        } else {
            z8 = false;
        }
        iVar.setContentView(d(z8));
        return iVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z g9;
        h hVar;
        G7.j.e(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        w wVar = (w) ((FacebookActivity) requireActivity()).b;
        if (wVar == null) {
            g9 = null;
        } else {
            g9 = wVar.b().g();
        }
        this.f13716f = (k) g9;
        if (bundle != null && (hVar = (h) bundle.getParcelable("request_state")) != null) {
            j(hVar);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13721k = true;
        this.f13717g.set(true);
        super.onDestroyView();
        D d2 = this.f13718h;
        if (d2 != null) {
            d2.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f13719i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        G7.j.e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.f13721k) {
            e();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        G7.j.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.f13720j != null) {
            bundle.putParcelable("request_state", this.f13720j);
        }
    }
}
