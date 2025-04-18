package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.dc;
import com.applovin.impl.i4;
import com.applovin.impl.ke;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y0;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class te extends ec implements AppLovinCommunicatorSubscriber, y0.a {
    private List A;
    private List B;
    private List C;
    private List D;

    /* renamed from: f, reason: collision with root package name */
    private com.applovin.impl.sdk.j f27105f;

    /* renamed from: g, reason: collision with root package name */
    private List f27106g;

    /* renamed from: h, reason: collision with root package name */
    private List f27107h;

    /* renamed from: i, reason: collision with root package name */
    private List f27108i;

    /* renamed from: j, reason: collision with root package name */
    private String f27109j;

    /* renamed from: k, reason: collision with root package name */
    private String f27110k;

    /* renamed from: l, reason: collision with root package name */
    private String f27111l;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f27112m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27113n;

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f27114o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f27115p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27116q;

    /* renamed from: r, reason: collision with root package name */
    private List f27117r;

    /* renamed from: s, reason: collision with root package name */
    private List f27118s;

    /* renamed from: t, reason: collision with root package name */
    private List f27119t;

    /* renamed from: u, reason: collision with root package name */
    private List f27120u;

    /* renamed from: v, reason: collision with root package name */
    private List f27121v;
    private List w;
    private List x;

    /* renamed from: y, reason: collision with root package name */
    private List f27122y;

    /* renamed from: z, reason: collision with root package name */
    private List f27123z;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27124a;

        static {
            int[] iArr = new int[y0.b.values().length];
            f27124a = iArr;
            try {
                iArr[y0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27124a[y0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27124a[y0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27124a[y0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27124a[y0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* loaded from: classes2.dex */
    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    /* loaded from: classes2.dex */
    public enum d {
        SDK_VERSION,
        PLUGIN_VERSION,
        AD_REVIEW_VERSION,
        CONSENT_FLOW,
        GOOGLE_UMP_SDK,
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL,
        APP_ADS_TXT
    }

    /* loaded from: classes2.dex */
    public enum e {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    /* loaded from: classes2.dex */
    public enum f {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public te(Context context) {
        super(context);
        this.f27114o = new StringBuilder("");
        this.f27115p = new AtomicBoolean();
        this.f27116q = false;
        this.f27117r = new ArrayList();
        this.f27118s = new ArrayList();
        this.f27119t = new ArrayList();
        this.f27120u = new ArrayList();
        this.f27121v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.f27122y = new ArrayList();
        this.f27123z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    private void a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (str.length() + sb2.length() >= ((Integer) this.f27105f.a(sj.f26952t)).intValue()) {
            com.applovin.impl.sdk.n.g("MediationDebuggerListAdapter", sb2);
            this.f27114o.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private List f() {
        boolean c2 = this.f27105f.l0().c();
        List b2 = this.f27105f.l0().b();
        return c2 ? a((String) null, a(b2, false)) : a(a(b2, true), (String) null);
    }

    private List i() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f23676a.getPackageManager().getPackageInfo(this.f23676a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(dc.a().d("Package Name").c(this.f23676a.getPackageName()).a());
        dc.b d2 = dc.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d2.c(str).a());
        arrayList.add(dc.a().d("OS").c(yp.d()).a());
        arrayList.add(dc.a().d("Account").c(StringUtils.isValidString(this.f27111l) ? this.f27111l : "None").a());
        arrayList.add(dc.a().d("Mediation Provider").c(StringUtils.isValidString(this.f27105f.O()) ? this.f27105f.O() : "None").a());
        arrayList.add(dc.a().d("OM SDK Version").c(this.f27105f.W().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.j.y0()));
        if (this.f27112m != null) {
            arrayList.add(dc.a().d("Google Families Policy").c(String.valueOf(this.f27112m)).a());
        }
        return arrayList;
    }

    private dc k() {
        String d2 = this.f27105f.k0().d();
        boolean isValidString = StringUtils.isValidString(d2);
        boolean isValidString2 = StringUtils.isValidString(this.f27105f.k0().k());
        dc.b d3 = dc.a(dc.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!isValidString) {
            d2 = isValidString2 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "None";
        }
        dc.b c2 = d3.c(d2);
        if (this.f27113n) {
            c2.a(true);
            if (isValidString2) {
                c2.a(this.f23676a);
            } else {
                c2.b("TC Data Not Found");
                c2.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z2 = this.f27105f.r().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                c2.a(z2 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                c2.b(t3.a(z2 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f23676a));
            }
        }
        return c2.a();
    }

    private dc l() {
        return this.f27105f.u().e() == i4.a.UNIFIED ? dc.a().d("MAX Terms and Privacy Policy Flow").a(this.f23676a).a(true).a() : dc.a().d("MAX Terms Flow").a(R.drawable.applovin_ic_x_mark).b(t3.a(R.color.applovin_sdk_xmarkColor, this.f23676a)).b("MAX Terms Flow").a("MAX Terms Flow is deprecated and will be removed in a future SDK version.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(true).a();
    }

    private dc m() {
        boolean hasSupportedCmp = this.f27105f.o().hasSupportedCmp();
        return dc.a().d("Google UMP SDK").a(hasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(t3.a(hasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f23676a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!hasSupportedCmp).a();
    }

    private List p() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(dc.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f27105f.a(sj.a4);
        dc.b d2 = dc.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d2.c(str).a());
        dc.b d3 = dc.a().d("Ad Review Version");
        String b2 = v.b();
        if (StringUtils.isValidString(b2)) {
            String a2 = v.a();
            if (!StringUtils.isValidString(a2)) {
                d3.c(b2);
            } else if (a2.equals(this.f27105f.b0())) {
                d3.c(b2);
            } else {
                a(d3, android.support.v4.media.d.r(new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your "), this.f27105f.B0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated", " from the correct account."));
            }
        } else {
            a(d3, "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.");
        }
        arrayList.add(d3.a());
        if (this.f27105f.B0()) {
            String a3 = yp.a(this.f27105f.g0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(a3) ? a3 : "None"));
        }
        if (this.f27105f.u().k()) {
            arrayList.add(l());
            if (this.f27105f.u().e() == i4.a.UNIFIED) {
                arrayList.add(m());
            } else {
                arrayList.add(r());
                arrayList.add(u());
            }
        }
        return arrayList;
    }

    private dc q() {
        return dc.a().d("Network Consent Statuses").a(this.f23676a).a(true).a();
    }

    private dc r() {
        boolean z2 = this.f27105f.u().h() != null;
        return dc.a().d("Privacy Policy URL").a(z2 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(t3.a(z2 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f23676a)).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(e.COUNT.ordinal());
        arrayList.add(k());
        if (StringUtils.isValidString(this.f27105f.k0().k())) {
            arrayList.add(q());
        } else {
            arrayList.add(new xh(a4.b(), false, this.f23676a));
        }
        arrayList.add(new xh(a4.a(), true, this.f23676a));
        return arrayList;
    }

    private dc u() {
        dc.b d2 = dc.a().d("Terms of Service URL");
        if (this.f27105f.u().i() != null) {
            d2.a(R.drawable.applovin_ic_check_mark_bordered);
            d2.b(t3.a(R.color.applovin_sdk_checkmarkColor, this.f23676a));
            d2.a(true);
        } else {
            d2.c("None");
            d2.a(false);
        }
        return d2.a();
    }

    private void y() {
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + yp.c(this.f27105f));
        sb.append("\nTest Mode - ".concat(this.f27105f.l0().c() ? "enabled" : "disabled"));
        sb.append("\nTarget SDK - " + this.f27105f.y().A().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f27105f.a(sj.a4);
        String b2 = v.b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb2 = new StringBuilder("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb2.append(str2);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(b2)) {
            b2 = "Disabled";
        }
        sb3.append(b2);
        sb.append(sb3.toString());
        if (this.f27105f.B0()) {
            String a2 = yp.a(this.f27105f.g0());
            StringBuilder sb4 = new StringBuilder("\nUnity Version - ");
            sb4.append(StringUtils.isValidString(a2) ? a2 : "None");
            sb.append(sb4.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(a4.a(this.f23676a));
        sb.append(this.f27105f.u().g());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.f27105f.k0().j());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = this.f27105f.k0().i().iterator();
        while (it.hasNext()) {
            sb.append(((rn) it.next()).e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f27118s.iterator();
        while (it2.hasNext()) {
            a(sb, ((ke) it2.next()).j());
        }
        Iterator it3 = this.f27117r.iterator();
        while (it3.hasNext()) {
            a(sb, ((ke) it3.next()).j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it4 = this.f27106g.iterator();
        while (it4.hasNext()) {
            a(sb, ((z) it4.next()).e());
        }
        sb.append("\n========== END ==========");
        com.applovin.impl.sdk.n.g("MediationDebuggerListAdapter", sb.toString());
        this.f27114o.append(sb.toString());
    }

    public void b(boolean z2) {
        this.f27116q = z2;
    }

    @Override // com.applovin.impl.ec
    public List c(int i2) {
        return i2 == f.APP_INFO.ordinal() ? this.x : i2 == f.MAX.ordinal() ? this.f27122y : i2 == f.PRIVACY.ordinal() ? this.f27123z : i2 == f.ADS.ordinal() ? this.A : i2 == f.INCOMPLETE_NETWORKS.ordinal() ? this.B : i2 == f.COMPLETED_NETWORKS.ordinal() ? this.C : this.D;
    }

    public boolean d() {
        return this.f27116q;
    }

    public List e() {
        return this.f27106g;
    }

    public String g() {
        return this.f27110k;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f27109j;
    }

    public List j() {
        return this.f27120u;
    }

    public List n() {
        return this.f27107h;
    }

    public String o() {
        return this.f27114o.toString();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f27123z = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.f27117r);
            this.C = a(this.f27118s);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public com.applovin.impl.sdk.j t() {
        return this.f27105f;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f27115p.get() + "}";
    }

    public List v() {
        return this.w;
    }

    public List w() {
        return this.f27121v;
    }

    public boolean x() {
        return this.f27115p.get();
    }

    private dc b(String str, String str2) {
        dc.b d2 = dc.a().d(str);
        if (StringUtils.isValidString(str2)) {
            d2.c(str2);
        } else {
            d2.a(R.drawable.applovin_ic_x_mark);
            d2.b(t3.a(R.color.applovin_sdk_xmarkColor, this.f23676a));
        }
        return d2.a();
    }

    @Override // com.applovin.impl.ec
    public int d(int i2) {
        if (i2 == f.APP_INFO.ordinal()) {
            return this.x.size();
        }
        if (i2 == f.MAX.ordinal()) {
            return this.f27122y.size();
        }
        if (i2 == f.PRIVACY.ordinal()) {
            return this.f27123z.size();
        }
        if (i2 == f.ADS.ordinal()) {
            return this.A.size();
        }
        if (i2 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i2 == f.COMPLETED_NETWORKS.ordinal()) {
            return this.C.size();
        }
        return this.D.size();
    }

    @Override // com.applovin.impl.ec
    public dc e(int i2) {
        if (i2 == f.APP_INFO.ordinal()) {
            return new fj("APP INFO");
        }
        if (i2 == f.MAX.ordinal()) {
            return new fj("MAX");
        }
        if (i2 == f.PRIVACY.ordinal()) {
            return new fj("PRIVACY");
        }
        if (i2 == f.ADS.ordinal()) {
            return new fj("ADS");
        }
        if (i2 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return new fj("INCOMPLETE SDK INTEGRATIONS");
        }
        if (i2 == f.COMPLETED_NETWORKS.ordinal()) {
            return new fj("COMPLETED SDK INTEGRATIONS");
        }
        return new fj("MISSING SDK INTEGRATIONS");
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ke keVar = (ke) it.next();
            if (!keVar.E()) {
                if (keVar.q() != ke.a.INCOMPLETE_INTEGRATION && keVar.q() != ke.a.INVALID_INTEGRATION) {
                    if (keVar.q() == ke.a.COMPLETE) {
                        this.f27118s.add(keVar);
                    } else if (keVar.q() == ke.a.MISSING) {
                        this.f27119t.add(keVar);
                    }
                } else {
                    this.f27117r.add(keVar);
                }
            }
        }
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(dc.a().d("View Ad Units (" + this.f27106g.size() + ")").a(this.f23676a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f27107h.isEmpty()) {
            arrayList.add(dc.a().d("Selective Init Ad Units (" + this.f27107h.size() + ")").a(this.f23676a).a(true).a());
        }
        arrayList.add(dc.a().d("Test Mode Enabled").c(String.valueOf(this.f27105f.l0().c())).a());
        return arrayList;
    }

    private dc b(String str) {
        dc.b a2 = dc.a();
        if (this.f27105f.l0().c()) {
            a2.a(this.f23676a);
        }
        dc.b d2 = a2.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f27105f.l0().c()) {
            str = "Enable";
        }
        return d2.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ke keVar = (ke) it.next();
            if (keVar.y() == ke.b.READY) {
                this.w.add(keVar);
            }
        }
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 f2 = ((z) it.next()).f();
            Iterator it2 = f2.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((ir) it2.next()).b());
            }
            Iterator it3 = f2.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((ir) it3.next()).b());
            }
        }
        this.f27120u = new ArrayList(hashSet);
        this.f27121v = new ArrayList(hashSet2);
        Collections.sort(this.f27120u);
        Collections.sort(this.f27121v);
    }

    private String a(y0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i2 = a.f27124a[bVar.ordinal()];
        if (i2 == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i2 == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i2 == 3) {
            return androidx.compose.foundation.text.input.a.A("Unable to find app-ads.txt file or parse entries of the file at ", str, ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i2 != 4) {
            return i2 != 5 ? "" : androidx.compose.foundation.text.input.a.A("Text file at ", str, " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        return androidx.compose.foundation.text.input.a.m("Text file at ", str, " is missing the required AppLovin line:\n\n", str2, "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    @Override // com.applovin.impl.ec
    public int b() {
        return f.COUNT.ordinal();
    }

    private dc a(String str, c cVar) {
        int i2;
        int a2;
        if (cVar == c.SUCCESS) {
            i2 = R.drawable.applovin_ic_check_mark_bordered;
            a2 = t3.a(R.color.applovin_sdk_checkmarkColor, this.f23676a);
        } else if (cVar == c.WARNING) {
            i2 = R.drawable.applovin_ic_warning;
            a2 = t3.a(R.color.applovin_sdk_warningColor, this.f23676a);
        } else {
            i2 = R.drawable.applovin_ic_x_mark;
            a2 = t3.a(R.color.applovin_sdk_xmarkColor, this.f23676a);
        }
        return dc.a().d("app-ads.txt").a(i2).b(a2).b("app-ads.txt").a(str).a(true).a();
    }

    private dc a(boolean z2) {
        return dc.a().d("Java 8").a(z2 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(t3.a(z2 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f23676a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z2).a();
    }

    private String a(List list, boolean z2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z2) {
            for (jc jcVar : this.f27120u) {
                if (list.equals(jcVar.b())) {
                    return jcVar.a();
                }
            }
            for (jc jcVar2 : this.f27121v) {
                if (list.equals(jcVar2.b())) {
                    return jcVar2.a();
                }
            }
        } else {
            for (ke keVar : this.w) {
                if (list.equals(keVar.u())) {
                    return keVar.g();
                }
            }
        }
        return String.join(",", list);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new cg((ke) it.next(), this.f23676a));
        }
        return arrayList;
    }

    private dc a(String str) {
        dc.b a2 = dc.a();
        if (!this.f27105f.l0().c()) {
            a2.a(this.f23676a);
        }
        dc.b d2 = a2.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f27105f.l0().c()) {
            str = "Enable";
        }
        return d2.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, Boolean bool, boolean z2, com.applovin.impl.sdk.j jVar) {
        this.f27105f = jVar;
        this.f27106g = list2;
        this.f27107h = list3;
        this.f27108i = list4;
        this.f27109j = str;
        this.f27110k = str2;
        this.f27111l = str3;
        this.f27112m = bool;
        this.f27113n = z2;
        if (list != null && this.f27115p.compareAndSet(false, true)) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            jVar.k0().a(list);
            c(list);
            b(list2);
            d(this.f27118s);
            this.x.addAll(i());
            this.f27122y.addAll(p());
            this.f27123z.addAll(s());
            this.A.addAll(f());
            this.B = a(this.f27117r);
            this.C = a(this.f27118s);
            this.D = a(this.f27119t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f23676a).subscribe(this, arrayList);
            y();
        }
        AppLovinSdkUtils.runOnUiThread(new mt(this, 15));
    }

    public boolean a(dc dcVar) {
        if (dcVar.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(dcVar.k().toString());
    }

    @Override // com.applovin.impl.y0.a
    public void a(y0.b bVar, String str) {
        if (bVar == y0.b.APP_DETAILS_NOT_FOUND) {
            this.f27105f.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f27105f.J().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f27122y.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    @Override // com.applovin.impl.y0.a
    public void a(w0 w0Var, String str) {
        x0 x0Var;
        String a2;
        c a3;
        c cVar;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (x0 x0Var2 : this.f27108i) {
            List list = (List) w0Var.a().get(x0Var2.b());
            if (list == null || !list.contains(x0Var2)) {
                this.f27105f.J();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n J = this.f27105f.J();
                    StringBuilder B = androidx.compose.foundation.text.input.a.B(str, " is missing a required entry: ");
                    B.append(x0Var2.d());
                    J.b("MediationDebuggerListAdapter", B.toString());
                }
                arrayList.add(x0Var2);
            }
        }
        if (arrayList.isEmpty()) {
            str2 = androidx.compose.foundation.text.input.a.A("All required entries found at ", str, ".");
            cVar = c.SUCCESS;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    x0Var = (x0) it.next();
                    if (x0Var.g()) {
                        break;
                    }
                } else {
                    x0Var = null;
                    break;
                }
            }
            if (x0Var != null) {
                y0.b bVar = y0.b.MISSING_APPLOVIN_ENTRIES;
                a2 = a(bVar, str, x0Var.d());
                a3 = a(bVar);
            } else {
                y0.b bVar2 = y0.b.MISSING_NON_APPLOVIN_ENTRIES;
                a2 = a(bVar2, str, null);
                a3 = a(bVar2);
            }
            String str3 = a2;
            cVar = a3;
            str2 = str3;
        }
        this.f27122y.add(a(str2, cVar));
        c();
    }

    private void a(dc.b bVar, String str) {
        bVar.b("MAX Ad Review").a(str).a(R.drawable.applovin_ic_x_mark).b(t3.a(R.color.applovin_sdk_xmarkColor, this.f23676a)).a(true);
    }

    private c a(y0.b bVar) {
        int i2 = a.f27124a[bVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return c.ERROR;
        }
        if (i2 != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }
}
