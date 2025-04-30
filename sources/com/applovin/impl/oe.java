package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C0774x0;
import com.applovin.impl.fe;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class oe extends zb implements AppLovinCommunicatorSubscriber, C0774x0.a {

    /* renamed from: A, reason: collision with root package name */
    private List f9463A;

    /* renamed from: B, reason: collision with root package name */
    private List f9464B;

    /* renamed from: C, reason: collision with root package name */
    private List f9465C;

    /* renamed from: D, reason: collision with root package name */
    private List f9466D;

    /* renamed from: f, reason: collision with root package name */
    private com.applovin.impl.sdk.k f9467f;

    /* renamed from: g, reason: collision with root package name */
    private List f9468g;

    /* renamed from: h, reason: collision with root package name */
    private List f9469h;

    /* renamed from: i, reason: collision with root package name */
    private List f9470i;

    /* renamed from: j, reason: collision with root package name */
    private String f9471j;

    /* renamed from: k, reason: collision with root package name */
    private String f9472k;
    private String l;
    private Boolean m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9473n;

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f9474o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f9475p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f9476q;

    /* renamed from: r, reason: collision with root package name */
    private List f9477r;

    /* renamed from: s, reason: collision with root package name */
    private List f9478s;

    /* renamed from: t, reason: collision with root package name */
    private List f9479t;

    /* renamed from: u, reason: collision with root package name */
    private List f9480u;

    /* renamed from: v, reason: collision with root package name */
    private List f9481v;

    /* renamed from: w, reason: collision with root package name */
    private List f9482w;

    /* renamed from: x, reason: collision with root package name */
    private List f9483x;

    /* renamed from: y, reason: collision with root package name */
    private List f9484y;

    /* renamed from: z, reason: collision with root package name */
    private List f9485z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9486a;

        static {
            int[] iArr = new int[C0774x0.b.values().length];
            f9486a = iArr;
            try {
                iArr[C0774x0.b.DEVELOPER_URI_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9486a[C0774x0.b.APPADSTXT_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9486a[C0774x0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9486a[C0774x0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* loaded from: classes.dex */
    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    /* loaded from: classes.dex */
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

    /* loaded from: classes.dex */
    public enum e {
        CMP,
        NETWORK_CONSENT_STATUSES,
        IS_AGE_RESTRICTED_USER,
        DO_NOT_SELL,
        COUNT
    }

    /* loaded from: classes.dex */
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

    public oe(Context context) {
        super(context);
        this.f9474o = new StringBuilder("");
        this.f9475p = new AtomicBoolean();
        this.f9476q = false;
        this.f9477r = new ArrayList();
        this.f9478s = new ArrayList();
        this.f9479t = new ArrayList();
        this.f9480u = new ArrayList();
        this.f9481v = new ArrayList();
        this.f9482w = new ArrayList();
        this.f9483x = new ArrayList();
        this.f9484y = new ArrayList();
        this.f9485z = new ArrayList();
        this.f9463A = new ArrayList();
        this.f9464B = new ArrayList();
        this.f9465C = new ArrayList();
        this.f9466D = new ArrayList();
    }

    private void a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (str.length() + sb2.length() >= ((Integer) this.f9467f.a(oj.f9879x)).intValue()) {
            com.applovin.impl.sdk.t.g("MediationDebuggerListAdapter", sb2);
            this.f9474o.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private yb b(String str, String str2) {
        yb.b d2 = yb.a().d(str);
        if (StringUtils.isValidString(str2)) {
            d2.c(str2);
        } else {
            d2.a(R.drawable.applovin_ic_x_mark);
            d2.b(r3.a(R.color.applovin_sdk_xmarkColor, this.f12545a));
        }
        return d2.a();
    }

    private List f() {
        boolean c9 = this.f9467f.n0().c();
        List b8 = this.f9467f.n0().b();
        if (c9) {
            return a((String) null, a(b8, false));
        }
        return a(a(b8, true), (String) null);
    }

    private List i() {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f12545a.getPackageManager().getPackageInfo(this.f12545a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(yb.a().d("Package Name").c(this.f12545a.getPackageName()).a());
        yb.b d2 = yb.a().d("App Version");
        String str3 = "None";
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d2.c(str).a());
        arrayList.add(yb.a().d("OS").c(zp.d()).a());
        yb.b d9 = yb.a().d("Account");
        if (!StringUtils.isValidString(this.l)) {
            str2 = "None";
        } else {
            str2 = this.l;
        }
        arrayList.add(d9.c(str2).a());
        yb.b d10 = yb.a().d("Mediation Provider");
        if (StringUtils.isValidString(this.f9467f.Q())) {
            str3 = this.f9467f.Q();
        }
        arrayList.add(d10.c(str3).a());
        arrayList.add(yb.a().d("OM SDK Version").c(this.f9467f.Y().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.B0()));
        if (this.m != null) {
            arrayList.add(yb.a().d("Google Families Policy").c(String.valueOf(this.m)).a());
        }
        return arrayList;
    }

    private yb k() {
        int i9;
        int i10;
        String d2 = this.f9467f.m0().d();
        boolean isValidString = StringUtils.isValidString(d2);
        boolean isValidString2 = StringUtils.isValidString(this.f9467f.m0().k());
        yb.b d9 = yb.a(yb.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!isValidString) {
            if (isValidString2) {
                d2 = "Unknown";
            } else {
                d2 = "None";
            }
        }
        yb.b c9 = d9.c(d2);
        if (this.f9473n) {
            boolean z8 = true;
            c9.a(true);
            if (isValidString2) {
                c9.a(this.f12545a);
            } else {
                c9.b("TC Data Not Found");
                c9.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                if (this.f9467f.q().getConsentFlowUserGeography() != AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
                    z8 = false;
                }
                if (z8) {
                    i9 = R.drawable.applovin_ic_x_mark;
                } else {
                    i9 = R.drawable.applovin_ic_warning;
                }
                c9.a(i9);
                if (z8) {
                    i10 = R.color.applovin_sdk_xmarkColor;
                } else {
                    i10 = R.color.applovin_sdk_warningColor;
                }
                c9.b(r3.a(i10, this.f12545a));
            }
        }
        return c9.a();
    }

    private yb l() {
        if (this.f9467f.t().e() == g4.a.UNIFIED) {
            return yb.a().d("MAX Terms and Privacy Policy Flow").a(this.f12545a).a(true).a();
        }
        return yb.a().d("MAX Terms Flow").a(R.drawable.applovin_ic_x_mark).b(r3.a(R.color.applovin_sdk_xmarkColor, this.f12545a)).b("MAX Terms Flow").a("MAX Terms Flow is deprecated and will be removed in a future SDK version.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(true).a();
    }

    private yb m() {
        int i9;
        int i10;
        boolean hasSupportedCmp = this.f9467f.n().hasSupportedCmp();
        yb.b d2 = yb.a().d("Google UMP SDK");
        if (hasSupportedCmp) {
            i9 = R.drawable.applovin_ic_check_mark_bordered;
        } else {
            i9 = R.drawable.applovin_ic_x_mark;
        }
        yb.b a6 = d2.a(i9);
        if (hasSupportedCmp) {
            i10 = R.color.applovin_sdk_checkmarkColor;
        } else {
            i10 = R.color.applovin_sdk_xmarkColor;
        }
        return a6.b(r3.a(i10, this.f12545a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!hasSupportedCmp).a();
    }

    private List p() {
        Map a6;
        String str;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(yb.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str2 = (String) this.f9467f.a(oj.f9685U3);
        yb.b d2 = yb.a().d("Plugin Version");
        String str3 = "None";
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        arrayList.add(d2.c(str2).a());
        yb.b d9 = yb.a().d("Ad Review Version");
        String b8 = C0765v.b();
        if (StringUtils.isValidString(b8)) {
            String a9 = C0765v.a();
            if (StringUtils.isValidString(a9)) {
                if (a9.equals(this.f9467f.d0())) {
                    d9.c(b8);
                } else {
                    StringBuilder sb = new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                    if (this.f9467f.E0()) {
                        str = "SDK key is downloaded";
                    } else {
                        str = "Gradle plugin snippet is integrated";
                    }
                    a(d9, AbstractC2914a.h(sb, str, " from the correct account."));
                }
            } else {
                d9.c(b8);
            }
        } else {
            a(d9, "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.");
        }
        arrayList.add(d9.a());
        if (this.f9467f.E0() && (a6 = zp.a(this.f9467f.g0())) != null) {
            String str4 = (String) a6.get("UnityVersion");
            if (StringUtils.isValidString(str4)) {
                str3 = str4;
            }
            arrayList.add(b("Unity Version", str3));
        }
        if (this.f9467f.t().k()) {
            arrayList.add(l());
            if (this.f9467f.t().e() == g4.a.UNIFIED) {
                arrayList.add(m());
            } else {
                arrayList.add(r());
                arrayList.add(u());
            }
        }
        return arrayList;
    }

    private yb q() {
        return yb.a().d("Network Consent Statuses").a(this.f12545a).a(true).a();
    }

    private yb r() {
        boolean z8;
        int i9;
        int i10;
        if (this.f9467f.t().h() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        yb.b d2 = yb.a().d("Privacy Policy URL");
        if (z8) {
            i9 = R.drawable.applovin_ic_check_mark_bordered;
        } else {
            i9 = R.drawable.applovin_ic_x_mark;
        }
        yb.b a6 = d2.a(i9);
        if (z8) {
            i10 = R.color.applovin_sdk_checkmarkColor;
        } else {
            i10 = R.color.applovin_sdk_xmarkColor;
        }
        return a6.b(r3.a(i10, this.f12545a)).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(e.COUNT.ordinal());
        arrayList.add(k());
        if (StringUtils.isValidString(this.f9467f.m0().k())) {
            arrayList.add(q());
        } else {
            arrayList.add(new uh(y3.b(), false, this.f12545a));
        }
        arrayList.add(new uh(y3.c(), true, this.f12545a));
        arrayList.add(new uh(y3.a(), true, this.f12545a));
        return arrayList;
    }

    private yb u() {
        yb.b d2 = yb.a().d("Terms of Service URL");
        if (this.f9467f.t().i() != null) {
            d2.a(R.drawable.applovin_ic_check_mark_bordered);
            d2.b(r3.a(R.color.applovin_sdk_checkmarkColor, this.f12545a));
            d2.a(true);
        } else {
            d2.c("None");
            d2.a(false);
        }
        return d2.a();
    }

    private void y() {
        String str;
        Map a6;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + zp.c(this.f9467f));
        if (this.f9467f.n0().c()) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        sb.append("\nTest Mode - ".concat(str));
        if (this.f9467f.y() != null) {
            sb.append("\nTarget SDK - " + this.f9467f.z().g().g());
        } else {
            sb.append("\nTarget SDK - " + this.f9467f.x().A().get("target_sdk"));
        }
        sb.append("\n========== MAX ==========");
        String str2 = AppLovinSdk.VERSION;
        String str3 = (String) this.f9467f.a(oj.f9685U3);
        String b8 = C0765v.b();
        sb.append("\nSDK Version - " + str2);
        StringBuilder sb2 = new StringBuilder("\nPlugin Version - ");
        String str4 = "None";
        if (!StringUtils.isValidString(str3)) {
            str3 = "None";
        }
        sb2.append(str3);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(b8)) {
            b8 = "Disabled";
        }
        sb3.append(b8);
        sb.append(sb3.toString());
        if (this.f9467f.E0() && (a6 = zp.a(this.f9467f.g0())) != null) {
            String str5 = (String) a6.get("UnityVersion");
            StringBuilder sb4 = new StringBuilder("\nUnity Version - ");
            if (StringUtils.isValidString(str5)) {
                str4 = str5;
            }
            sb4.append(str4);
            sb.append(sb4.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(y3.a(this.f12545a));
        sb.append(this.f9467f.t().g());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.f9467f.m0().j());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = this.f9467f.m0().i().iterator();
        while (it.hasNext()) {
            sb.append(((sn) it.next()).e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f9478s.iterator();
        while (it2.hasNext()) {
            a(sb, ((fe) it2.next()).j());
        }
        Iterator it3 = this.f9477r.iterator();
        while (it3.hasNext()) {
            a(sb, ((fe) it3.next()).j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it4 = this.f9468g.iterator();
        while (it4.hasNext()) {
            a(sb, ((C0781z) it4.next()).e());
        }
        sb.append("\n========== END ==========");
        com.applovin.impl.sdk.t.g("MediationDebuggerListAdapter", sb.toString());
        this.f9474o.append(sb.toString());
    }

    @Override // com.applovin.impl.zb
    public List c(int i9) {
        if (i9 == f.APP_INFO.ordinal()) {
            return this.f9483x;
        }
        if (i9 == f.MAX.ordinal()) {
            return this.f9484y;
        }
        if (i9 == f.PRIVACY.ordinal()) {
            return this.f9485z;
        }
        if (i9 == f.ADS.ordinal()) {
            return this.f9463A;
        }
        if (i9 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f9464B;
        }
        if (i9 == f.COMPLETED_NETWORKS.ordinal()) {
            return this.f9465C;
        }
        return this.f9466D;
    }

    public boolean d() {
        return this.f9476q;
    }

    public List e() {
        return this.f9468g;
    }

    public String g() {
        return this.f9472k;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f9471j;
    }

    public List j() {
        return this.f9480u;
    }

    public List n() {
        return this.f9469h;
    }

    public String o() {
        return this.f9474o.toString();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9485z = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9464B = a(this.f9477r);
            this.f9465C = a(this.f9478s);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9463A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9463A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public com.applovin.impl.sdk.k t() {
        return this.f9467f;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f9475p.get() + "}";
    }

    public List v() {
        return this.f9482w;
    }

    public List w() {
        return this.f9481v;
    }

    public boolean x() {
        return this.f9475p.get();
    }

    @Override // com.applovin.impl.zb
    public int d(int i9) {
        if (i9 == f.APP_INFO.ordinal()) {
            return this.f9483x.size();
        }
        if (i9 == f.MAX.ordinal()) {
            return this.f9484y.size();
        }
        if (i9 == f.PRIVACY.ordinal()) {
            return this.f9485z.size();
        }
        if (i9 == f.ADS.ordinal()) {
            return this.f9463A.size();
        }
        if (i9 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f9464B.size();
        }
        if (i9 == f.COMPLETED_NETWORKS.ordinal()) {
            return this.f9465C.size();
        }
        return this.f9466D.size();
    }

    @Override // com.applovin.impl.zb
    public yb e(int i9) {
        if (i9 == f.APP_INFO.ordinal()) {
            return new bj("APP INFO");
        }
        if (i9 == f.MAX.ordinal()) {
            return new bj("MAX");
        }
        if (i9 == f.PRIVACY.ordinal()) {
            return new bj("PRIVACY");
        }
        if (i9 == f.ADS.ordinal()) {
            return new bj("ADS");
        }
        if (i9 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return new bj("INCOMPLETE SDK INTEGRATIONS");
        }
        if (i9 == f.COMPLETED_NETWORKS.ordinal()) {
            return new bj("COMPLETED SDK INTEGRATIONS");
        }
        return new bj("MISSING SDK INTEGRATIONS");
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(yb.a().d("View Ad Units (" + this.f9468g.size() + ")").a(this.f12545a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f9469h.isEmpty()) {
            arrayList.add(yb.a().d("Selective Init Ad Units (" + this.f9469h.size() + ")").a(this.f12545a).a(true).a());
        }
        arrayList.add(yb.a().d("Test Mode Enabled").c(String.valueOf(this.f9467f.n0().c())).a());
        return arrayList;
    }

    private yb b(String str) {
        yb.b a6 = yb.a();
        if (this.f9467f.n0().c()) {
            a6.a(this.f12545a);
        }
        yb.b d2 = a6.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f9467f.n0().c()) {
            str = "Enable";
        }
        return d2.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (!feVar.E()) {
                if (feVar.q() != fe.a.INCOMPLETE_INTEGRATION && feVar.q() != fe.a.INVALID_INTEGRATION) {
                    if (feVar.q() == fe.a.COMPLETE) {
                        this.f9478s.add(feVar);
                    } else if (feVar.q() == fe.a.MISSING) {
                        this.f9479t.add(feVar);
                    }
                } else {
                    this.f9477r.add(feVar);
                }
            }
        }
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (feVar.x() == fe.b.READY) {
                this.f9482w.add(feVar);
            }
        }
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0668a0 f9 = ((C0781z) it.next()).f();
            Iterator it2 = f9.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((kr) it2.next()).b());
            }
            Iterator it3 = f9.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((kr) it3.next()).b());
            }
        }
        this.f9480u = new ArrayList(hashSet);
        this.f9481v = new ArrayList(hashSet2);
        Collections.sort(this.f9480u);
        Collections.sort(this.f9481v);
    }

    private String a(C0774x0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i9 = a.f9486a[bVar.ordinal()];
        if (i9 == 1) {
            return "Could not retrieve developer website from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i9 == 2) {
            return AbstractC2914a.e("Unable to find app-ads.txt file or parse entries of the file at ", str, ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i9 == 3) {
            return Q7.n0.j("Text file at ", str, " is missing the required AppLovin line:\n\n", str2, "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i9 != 4) {
            return "";
        }
        return AbstractC2914a.e("Text file at ", str, " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    public void b(boolean z8) {
        this.f9476q = z8;
    }

    @Override // com.applovin.impl.zb
    public int b() {
        return f.COUNT.ordinal();
    }

    private yb a(String str, c cVar) {
        int i9;
        int a6;
        if (cVar == c.SUCCESS) {
            i9 = R.drawable.applovin_ic_check_mark_bordered;
            a6 = r3.a(R.color.applovin_sdk_checkmarkColor, this.f12545a);
        } else if (cVar == c.WARNING) {
            i9 = R.drawable.applovin_ic_warning;
            a6 = r3.a(R.color.applovin_sdk_warningColor, this.f12545a);
        } else {
            i9 = R.drawable.applovin_ic_x_mark;
            a6 = r3.a(R.color.applovin_sdk_xmarkColor, this.f12545a);
        }
        return yb.a().d("app-ads.txt").a(i9).b(a6).b("app-ads.txt").a(str).a(true).a();
    }

    private yb a(boolean z8) {
        return yb.a().d("Java 8").a(z8 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z8 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f12545a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z8).a();
    }

    private String a(List list, boolean z8) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z8) {
            for (ec ecVar : this.f9480u) {
                if (list.equals(ecVar.b())) {
                    return ecVar.a();
                }
            }
            for (ec ecVar2 : this.f9481v) {
                if (list.equals(ecVar2.b())) {
                    return ecVar2.a();
                }
            }
        } else {
            for (fe feVar : this.f9482w) {
                if (list.equals(Collections.singletonList(feVar.m()))) {
                    return feVar.g();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ",");
            }
        }
        return sb.toString();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new xf((fe) it.next(), this.f12545a));
        }
        return arrayList;
    }

    private yb a(String str) {
        yb.b a6 = yb.a();
        if (!this.f9467f.n0().c()) {
            a6.a(this.f12545a);
        }
        yb.b d2 = a6.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f9467f.n0().c()) {
            str = "Enable";
        }
        return d2.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, Boolean bool, boolean z8, com.applovin.impl.sdk.k kVar) {
        this.f9467f = kVar;
        this.f9468g = list2;
        this.f9469h = list3;
        this.f9470i = list4;
        this.f9471j = str;
        this.f9472k = str2;
        this.l = str3;
        this.m = bool;
        this.f9473n = z8;
        if (list != null && this.f9475p.compareAndSet(false, true)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            kVar.m0().a(list);
            c(list);
            b(list2);
            d(this.f9478s);
            this.f9483x.addAll(i());
            this.f9484y.addAll(p());
            this.f9485z.addAll(s());
            this.f9463A.addAll(f());
            this.f9464B = a(this.f9477r);
            this.f9465C = a(this.f9478s);
            this.f9466D = a(this.f9479t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f12545a).subscribe(this, arrayList);
            y();
        }
        AppLovinSdkUtils.runOnUiThread(new F0(this, 11));
    }

    @Override // com.applovin.impl.C0774x0.a
    public void a(C0774x0.b bVar, String str) {
        if (bVar == C0774x0.b.DEVELOPER_URI_NOT_FOUND) {
            this.f9467f.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f9467f.L().a("MediationDebuggerListAdapter", "Developer URI was not found; app-ads.txt row will not show on the mediation debugger");
                return;
            }
            return;
        }
        this.f9484y.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    @Override // com.applovin.impl.C0774x0.a
    public void a(C0766v0 c0766v0, String str) {
        C0770w0 c0770w0;
        String a6;
        c a9;
        c cVar;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (C0770w0 c0770w02 : this.f9470i) {
            List list = (List) c0766v0.a().get(c0770w02.b());
            if (list == null || !list.contains(c0770w02)) {
                this.f9467f.L();
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t L8 = this.f9467f.L();
                    StringBuilder c9 = AbstractC2965e.c(str, " is missing a required entry: ");
                    c9.append(c0770w02.d());
                    L8.b("MediationDebuggerListAdapter", c9.toString());
                }
                arrayList.add(c0770w02);
            }
        }
        if (arrayList.isEmpty()) {
            str2 = AbstractC2914a.e("All required entries found at ", str, ".");
            cVar = c.SUCCESS;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    c0770w0 = (C0770w0) it.next();
                    if (c0770w0.g()) {
                        break;
                    }
                } else {
                    c0770w0 = null;
                    break;
                }
            }
            if (c0770w0 != null) {
                C0774x0.b bVar = C0774x0.b.MISSING_APPLOVIN_ENTRIES;
                a6 = a(bVar, str, c0770w0.d());
                a9 = a(bVar);
            } else {
                C0774x0.b bVar2 = C0774x0.b.MISSING_NON_APPLOVIN_ENTRIES;
                a6 = a(bVar2, str, null);
                a9 = a(bVar2);
            }
            String str3 = a6;
            cVar = a9;
            str2 = str3;
        }
        this.f9484y.add(a(str2, cVar));
        c();
    }

    private void a(yb.b bVar, String str) {
        bVar.b("MAX Ad Review").a(str).a(R.drawable.applovin_ic_x_mark).b(r3.a(R.color.applovin_sdk_xmarkColor, this.f12545a)).a(true);
    }

    private c a(C0774x0.b bVar) {
        int i9 = a.f9486a[bVar.ordinal()];
        if (i9 == 1 || i9 == 2 || i9 == 3) {
            return c.ERROR;
        }
        if (i9 != 4) {
            return c.ERROR;
        }
        return c.WARNING;
    }
}
