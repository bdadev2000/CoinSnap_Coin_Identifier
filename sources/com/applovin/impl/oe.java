package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.fe;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x0;
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

/* loaded from: classes.dex */
public class oe extends zb implements AppLovinCommunicatorSubscriber, x0.a {
    private List A;
    private List B;
    private List C;
    private List D;

    /* renamed from: f, reason: collision with root package name */
    private com.applovin.impl.sdk.k f6530f;

    /* renamed from: g, reason: collision with root package name */
    private List f6531g;

    /* renamed from: h, reason: collision with root package name */
    private List f6532h;

    /* renamed from: i, reason: collision with root package name */
    private List f6533i;

    /* renamed from: j, reason: collision with root package name */
    private String f6534j;

    /* renamed from: k, reason: collision with root package name */
    private String f6535k;

    /* renamed from: l, reason: collision with root package name */
    private String f6536l;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f6537m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6538n;

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f6539o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f6540p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6541q;

    /* renamed from: r, reason: collision with root package name */
    private List f6542r;

    /* renamed from: s, reason: collision with root package name */
    private List f6543s;

    /* renamed from: t, reason: collision with root package name */
    private List f6544t;
    private List u;

    /* renamed from: v, reason: collision with root package name */
    private List f6545v;

    /* renamed from: w, reason: collision with root package name */
    private List f6546w;

    /* renamed from: x, reason: collision with root package name */
    private List f6547x;

    /* renamed from: y, reason: collision with root package name */
    private List f6548y;

    /* renamed from: z, reason: collision with root package name */
    private List f6549z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[x0.b.values().length];
            a = iArr;
            try {
                iArr[x0.b.DEVELOPER_URI_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[x0.b.APPADSTXT_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[x0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[x0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 4;
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
        this.f6539o = new StringBuilder("");
        this.f6540p = new AtomicBoolean();
        this.f6541q = false;
        this.f6542r = new ArrayList();
        this.f6543s = new ArrayList();
        this.f6544t = new ArrayList();
        this.u = new ArrayList();
        this.f6545v = new ArrayList();
        this.f6546w = new ArrayList();
        this.f6547x = new ArrayList();
        this.f6548y = new ArrayList();
        this.f6549z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    private void a(StringBuilder sb2, String str) {
        String sb3 = sb2.toString();
        if (str.length() + sb3.length() >= ((Integer) this.f6530f.a(oj.f6786x)).intValue()) {
            com.applovin.impl.sdk.t.g("MediationDebuggerListAdapter", sb3);
            this.f6539o.append(sb3);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private yb b(String str, String str2) {
        yb.b d10 = yb.a().d(str);
        if (StringUtils.isValidString(str2)) {
            d10.c(str2);
        } else {
            d10.a(R.drawable.applovin_ic_x_mark);
            d10.b(r3.a(R.color.applovin_sdk_xmarkColor, this.a));
        }
        return d10.a();
    }

    private List f() {
        boolean c10 = this.f6530f.n0().c();
        List b3 = this.f6530f.n0().b();
        if (c10) {
            return a((String) null, a(b3, false));
        }
        return a(a(b3, true), (String) null);
    }

    private List i() {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(yb.a().d("Package Name").c(this.a.getPackageName()).a());
        yb.b d10 = yb.a().d("App Version");
        String str3 = "None";
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d10.c(str).a());
        arrayList.add(yb.a().d("OS").c(zp.d()).a());
        yb.b d11 = yb.a().d("Account");
        if (!StringUtils.isValidString(this.f6536l)) {
            str2 = "None";
        } else {
            str2 = this.f6536l;
        }
        arrayList.add(d11.c(str2).a());
        yb.b d12 = yb.a().d("Mediation Provider");
        if (StringUtils.isValidString(this.f6530f.Q())) {
            str3 = this.f6530f.Q();
        }
        arrayList.add(d12.c(str3).a());
        arrayList.add(yb.a().d("OM SDK Version").c(this.f6530f.Y().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.B0()));
        if (this.f6537m != null) {
            arrayList.add(yb.a().d("Google Families Policy").c(String.valueOf(this.f6537m)).a());
        }
        return arrayList;
    }

    private yb k() {
        int i10;
        int i11;
        String d10 = this.f6530f.m0().d();
        boolean isValidString = StringUtils.isValidString(d10);
        boolean isValidString2 = StringUtils.isValidString(this.f6530f.m0().k());
        yb.b d11 = yb.a(yb.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!isValidString) {
            if (isValidString2) {
                d10 = "Unknown";
            } else {
                d10 = "None";
            }
        }
        yb.b c10 = d11.c(d10);
        if (this.f6538n) {
            boolean z10 = true;
            c10.a(true);
            if (isValidString2) {
                c10.a(this.a);
            } else {
                c10.b("TC Data Not Found");
                c10.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                if (this.f6530f.q().getConsentFlowUserGeography() != AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
                    z10 = false;
                }
                if (z10) {
                    i10 = R.drawable.applovin_ic_x_mark;
                } else {
                    i10 = R.drawable.applovin_ic_warning;
                }
                c10.a(i10);
                if (z10) {
                    i11 = R.color.applovin_sdk_xmarkColor;
                } else {
                    i11 = R.color.applovin_sdk_warningColor;
                }
                c10.b(r3.a(i11, this.a));
            }
        }
        return c10.a();
    }

    private yb l() {
        if (this.f6530f.t().e() == g4.a.UNIFIED) {
            return yb.a().d("MAX Terms and Privacy Policy Flow").a(this.a).a(true).a();
        }
        return yb.a().d("MAX Terms Flow").a(R.drawable.applovin_ic_x_mark).b(r3.a(R.color.applovin_sdk_xmarkColor, this.a)).b("MAX Terms Flow").a("MAX Terms Flow is deprecated and will be removed in a future SDK version.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(true).a();
    }

    private yb m() {
        int i10;
        int i11;
        boolean hasSupportedCmp = this.f6530f.n().hasSupportedCmp();
        yb.b d10 = yb.a().d("Google UMP SDK");
        if (hasSupportedCmp) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
        }
        yb.b a10 = d10.a(i10);
        if (hasSupportedCmp) {
            i11 = R.color.applovin_sdk_checkmarkColor;
        } else {
            i11 = R.color.applovin_sdk_xmarkColor;
        }
        return a10.b(r3.a(i11, this.a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!hasSupportedCmp).a();
    }

    private List p() {
        Map a10;
        String str;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(yb.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str2 = (String) this.f6530f.a(oj.U3);
        yb.b d10 = yb.a().d("Plugin Version");
        String str3 = "None";
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        arrayList.add(d10.c(str2).a());
        yb.b d11 = yb.a().d("Ad Review Version");
        String b3 = v.b();
        if (StringUtils.isValidString(b3)) {
            String a11 = v.a();
            if (StringUtils.isValidString(a11)) {
                if (a11.equals(this.f6530f.d0())) {
                    d11.c(b3);
                } else {
                    StringBuilder sb2 = new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                    if (this.f6530f.E0()) {
                        str = "SDK key is downloaded";
                    } else {
                        str = "Gradle plugin snippet is integrated";
                    }
                    a(d11, vd.e.h(sb2, str, " from the correct account."));
                }
            } else {
                d11.c(b3);
            }
        } else {
            a(d11, "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.");
        }
        arrayList.add(d11.a());
        if (this.f6530f.E0() && (a10 = zp.a(this.f6530f.g0())) != null) {
            String str4 = (String) a10.get("UnityVersion");
            if (StringUtils.isValidString(str4)) {
                str3 = str4;
            }
            arrayList.add(b("Unity Version", str3));
        }
        if (this.f6530f.t().k()) {
            arrayList.add(l());
            if (this.f6530f.t().e() == g4.a.UNIFIED) {
                arrayList.add(m());
            } else {
                arrayList.add(r());
                arrayList.add(u());
            }
        }
        return arrayList;
    }

    private yb q() {
        return yb.a().d("Network Consent Statuses").a(this.a).a(true).a();
    }

    private yb r() {
        boolean z10;
        int i10;
        int i11;
        if (this.f6530f.t().h() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.b d10 = yb.a().d("Privacy Policy URL");
        if (z10) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
        }
        yb.b a10 = d10.a(i10);
        if (z10) {
            i11 = R.color.applovin_sdk_checkmarkColor;
        } else {
            i11 = R.color.applovin_sdk_xmarkColor;
        }
        return a10.b(r3.a(i11, this.a)).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(e.COUNT.ordinal());
        arrayList.add(k());
        if (StringUtils.isValidString(this.f6530f.m0().k())) {
            arrayList.add(q());
        } else {
            arrayList.add(new uh(y3.b(), false, this.a));
        }
        arrayList.add(new uh(y3.c(), true, this.a));
        arrayList.add(new uh(y3.a(), true, this.a));
        return arrayList;
    }

    private yb u() {
        yb.b d10 = yb.a().d("Terms of Service URL");
        if (this.f6530f.t().i() != null) {
            d10.a(R.drawable.applovin_ic_check_mark_bordered);
            d10.b(r3.a(R.color.applovin_sdk_checkmarkColor, this.a));
            d10.a(true);
        } else {
            d10.c("None");
            d10.a(false);
        }
        return d10.a();
    }

    private void y() {
        String str;
        Map a10;
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + zp.c(this.f6530f));
        if (this.f6530f.n0().c()) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        sb2.append("\nTest Mode - ".concat(str));
        if (this.f6530f.y() != null) {
            sb2.append("\nTarget SDK - " + this.f6530f.z().g().g());
        } else {
            sb2.append("\nTarget SDK - " + this.f6530f.x().A().get("target_sdk"));
        }
        sb2.append("\n========== MAX ==========");
        String str2 = AppLovinSdk.VERSION;
        String str3 = (String) this.f6530f.a(oj.U3);
        String b3 = v.b();
        sb2.append("\nSDK Version - " + str2);
        StringBuilder sb3 = new StringBuilder("\nPlugin Version - ");
        String str4 = "None";
        if (!StringUtils.isValidString(str3)) {
            str3 = "None";
        }
        sb3.append(str3);
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(b3)) {
            b3 = "Disabled";
        }
        sb4.append(b3);
        sb2.append(sb4.toString());
        if (this.f6530f.E0() && (a10 = zp.a(this.f6530f.g0())) != null) {
            String str5 = (String) a10.get("UnityVersion");
            StringBuilder sb5 = new StringBuilder("\nUnity Version - ");
            if (StringUtils.isValidString(str5)) {
                str4 = str5;
            }
            sb5.append(str4);
            sb2.append(sb5.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(y3.a(this.a));
        sb2.append(this.f6530f.t().g());
        sb2.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb2.append(this.f6530f.m0().j());
        sb2.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = this.f6530f.m0().i().iterator();
        while (it.hasNext()) {
            sb2.append(((sn) it.next()).e());
        }
        sb2.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f6543s.iterator();
        while (it2.hasNext()) {
            a(sb2, ((fe) it2.next()).j());
        }
        Iterator it3 = this.f6542r.iterator();
        while (it3.hasNext()) {
            a(sb2, ((fe) it3.next()).j());
        }
        sb2.append("\n========== AD UNITS ==========");
        Iterator it4 = this.f6531g.iterator();
        while (it4.hasNext()) {
            a(sb2, ((z) it4.next()).e());
        }
        sb2.append("\n========== END ==========");
        com.applovin.impl.sdk.t.g("MediationDebuggerListAdapter", sb2.toString());
        this.f6539o.append(sb2.toString());
    }

    @Override // com.applovin.impl.zb
    public List c(int i10) {
        if (i10 == f.APP_INFO.ordinal()) {
            return this.f6547x;
        }
        if (i10 == f.MAX.ordinal()) {
            return this.f6548y;
        }
        if (i10 == f.PRIVACY.ordinal()) {
            return this.f6549z;
        }
        if (i10 == f.ADS.ordinal()) {
            return this.A;
        }
        if (i10 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B;
        }
        if (i10 == f.COMPLETED_NETWORKS.ordinal()) {
            return this.C;
        }
        return this.D;
    }

    public boolean d() {
        return this.f6541q;
    }

    public List e() {
        return this.f6531g;
    }

    public String g() {
        return this.f6535k;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f6534j;
    }

    public List j() {
        return this.u;
    }

    public List n() {
        return this.f6532h;
    }

    public String o() {
        return this.f6539o.toString();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f6549z = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.f6542r);
            this.C = a(this.f6543s);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public com.applovin.impl.sdk.k t() {
        return this.f6530f;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f6540p.get() + "}";
    }

    public List v() {
        return this.f6546w;
    }

    public List w() {
        return this.f6545v;
    }

    public boolean x() {
        return this.f6540p.get();
    }

    @Override // com.applovin.impl.zb
    public int d(int i10) {
        if (i10 == f.APP_INFO.ordinal()) {
            return this.f6547x.size();
        }
        if (i10 == f.MAX.ordinal()) {
            return this.f6548y.size();
        }
        if (i10 == f.PRIVACY.ordinal()) {
            return this.f6549z.size();
        }
        if (i10 == f.ADS.ordinal()) {
            return this.A.size();
        }
        if (i10 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i10 == f.COMPLETED_NETWORKS.ordinal()) {
            return this.C.size();
        }
        return this.D.size();
    }

    @Override // com.applovin.impl.zb
    public yb e(int i10) {
        if (i10 == f.APP_INFO.ordinal()) {
            return new bj("APP INFO");
        }
        if (i10 == f.MAX.ordinal()) {
            return new bj("MAX");
        }
        if (i10 == f.PRIVACY.ordinal()) {
            return new bj("PRIVACY");
        }
        if (i10 == f.ADS.ordinal()) {
            return new bj("ADS");
        }
        if (i10 == f.INCOMPLETE_NETWORKS.ordinal()) {
            return new bj("INCOMPLETE SDK INTEGRATIONS");
        }
        if (i10 == f.COMPLETED_NETWORKS.ordinal()) {
            return new bj("COMPLETED SDK INTEGRATIONS");
        }
        return new bj("MISSING SDK INTEGRATIONS");
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(yb.a().d("View Ad Units (" + this.f6531g.size() + ")").a(this.a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f6532h.isEmpty()) {
            arrayList.add(yb.a().d("Selective Init Ad Units (" + this.f6532h.size() + ")").a(this.a).a(true).a());
        }
        arrayList.add(yb.a().d("Test Mode Enabled").c(String.valueOf(this.f6530f.n0().c())).a());
        return arrayList;
    }

    private yb b(String str) {
        yb.b a10 = yb.a();
        if (this.f6530f.n0().c()) {
            a10.a(this.a);
        }
        yb.b d10 = a10.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f6530f.n0().c()) {
            str = "Enable";
        }
        return d10.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (!feVar.E()) {
                if (feVar.q() != fe.a.INCOMPLETE_INTEGRATION && feVar.q() != fe.a.INVALID_INTEGRATION) {
                    if (feVar.q() == fe.a.COMPLETE) {
                        this.f6543s.add(feVar);
                    } else if (feVar.q() == fe.a.MISSING) {
                        this.f6544t.add(feVar);
                    }
                } else {
                    this.f6542r.add(feVar);
                }
            }
        }
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (feVar.x() == fe.b.READY) {
                this.f6546w.add(feVar);
            }
        }
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 f10 = ((z) it.next()).f();
            Iterator it2 = f10.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((kr) it2.next()).b());
            }
            Iterator it3 = f10.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((kr) it3.next()).b());
            }
        }
        this.u = new ArrayList(hashSet);
        this.f6545v = new ArrayList(hashSet2);
        Collections.sort(this.u);
        Collections.sort(this.f6545v);
    }

    private String a(x0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i10 = a.a[bVar.ordinal()];
        if (i10 == 1) {
            return "Could not retrieve developer website from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i10 == 2) {
            return com.applovin.impl.mediation.ads.e.f("Unable to find app-ads.txt file or parse entries of the file at ", str, ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i10 != 3) {
            return i10 != 4 ? "" : com.applovin.impl.mediation.ads.e.f("Text file at ", str, " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        return a4.j.h("Text file at ", str, " is missing the required AppLovin line:\n\n", str2, "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    public void b(boolean z10) {
        this.f6541q = z10;
    }

    @Override // com.applovin.impl.zb
    public int b() {
        return f.COUNT.ordinal();
    }

    private yb a(String str, c cVar) {
        int i10;
        int a10;
        if (cVar == c.SUCCESS) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
            a10 = r3.a(R.color.applovin_sdk_checkmarkColor, this.a);
        } else if (cVar == c.WARNING) {
            i10 = R.drawable.applovin_ic_warning;
            a10 = r3.a(R.color.applovin_sdk_warningColor, this.a);
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
            a10 = r3.a(R.color.applovin_sdk_xmarkColor, this.a);
        }
        return yb.a().d("app-ads.txt").a(i10).b(a10).b("app-ads.txt").a(str).a(true).a();
    }

    private yb a(boolean z10) {
        return yb.a().d("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z10).a();
    }

    private String a(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z10) {
            for (ec ecVar : this.u) {
                if (list.equals(ecVar.b())) {
                    return ecVar.a();
                }
            }
            for (ec ecVar2 : this.f6545v) {
                if (list.equals(ecVar2.b())) {
                    return ecVar2.a();
                }
            }
        } else {
            for (fe feVar : this.f6546w) {
                if (list.equals(Collections.singletonList(feVar.m()))) {
                    return feVar.g();
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ",");
            }
        }
        return sb2.toString();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new xf((fe) it.next(), this.a));
        }
        return arrayList;
    }

    private yb a(String str) {
        yb.b a10 = yb.a();
        if (!this.f6530f.n0().c()) {
            a10.a(this.a);
        }
        yb.b d10 = a10.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f6530f.n0().c()) {
            str = "Enable";
        }
        return d10.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, Boolean bool, boolean z10, com.applovin.impl.sdk.k kVar) {
        this.f6530f = kVar;
        this.f6531g = list2;
        this.f6532h = list3;
        this.f6533i = list4;
        this.f6534j = str;
        this.f6535k = str2;
        this.f6536l = str3;
        this.f6537m = bool;
        this.f6538n = z10;
        if (list != null && this.f6540p.compareAndSet(false, true)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            kVar.m0().a(list);
            c(list);
            b(list2);
            d(this.f6543s);
            this.f6547x.addAll(i());
            this.f6548y.addAll(p());
            this.f6549z.addAll(s());
            this.A.addAll(f());
            this.B = a(this.f6542r);
            this.C = a(this.f6543s);
            this.D = a(this.f6544t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.a).subscribe(this, arrayList);
            y();
        }
        AppLovinSdkUtils.runOnUiThread(new nt(this, 11));
    }

    @Override // com.applovin.impl.x0.a
    public void a(x0.b bVar, String str) {
        if (bVar == x0.b.DEVELOPER_URI_NOT_FOUND) {
            this.f6530f.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6530f.L().a("MediationDebuggerListAdapter", "Developer URI was not found; app-ads.txt row will not show on the mediation debugger");
                return;
            }
            return;
        }
        this.f6548y.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    @Override // com.applovin.impl.x0.a
    public void a(v0 v0Var, String str) {
        w0 w0Var;
        String a10;
        c a11;
        c cVar;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (w0 w0Var2 : this.f6533i) {
            List list = (List) v0Var.a().get(w0Var2.b());
            if (list == null || !list.contains(w0Var2)) {
                this.f6530f.L();
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t L = this.f6530f.L();
                    StringBuilder n10 = eb.j.n(str, " is missing a required entry: ");
                    n10.append(w0Var2.d());
                    L.b("MediationDebuggerListAdapter", n10.toString());
                }
                arrayList.add(w0Var2);
            }
        }
        if (arrayList.isEmpty()) {
            str2 = com.applovin.impl.mediation.ads.e.f("All required entries found at ", str, ".");
            cVar = c.SUCCESS;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    w0Var = (w0) it.next();
                    if (w0Var.g()) {
                        break;
                    }
                } else {
                    w0Var = null;
                    break;
                }
            }
            if (w0Var != null) {
                x0.b bVar = x0.b.MISSING_APPLOVIN_ENTRIES;
                a10 = a(bVar, str, w0Var.d());
                a11 = a(bVar);
            } else {
                x0.b bVar2 = x0.b.MISSING_NON_APPLOVIN_ENTRIES;
                a10 = a(bVar2, str, null);
                a11 = a(bVar2);
            }
            String str3 = a10;
            cVar = a11;
            str2 = str3;
        }
        this.f6548y.add(a(str2, cVar));
        c();
    }

    private void a(yb.b bVar, String str) {
        bVar.b("MAX Ad Review").a(str).a(R.drawable.applovin_ic_x_mark).b(r3.a(R.color.applovin_sdk_xmarkColor, this.a)).a(true);
    }

    private c a(x0.b bVar) {
        int i10 = a.a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return c.ERROR;
        }
        if (i10 != 4) {
            return c.ERROR;
        }
        return c.WARNING;
    }
}
