package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class f extends d {
    private static final String d = "VastAdParser";
    private static final CharSequence e = "acao/yes";

    /* renamed from: c, reason: collision with root package name */
    public static final List<VastAdTagUri> f29595c = new ArrayList();

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f29596a;

        /* renamed from: b, reason: collision with root package name */
        private String f29597b;

        /* renamed from: c, reason: collision with root package name */
        private String f29598c;
        private String d;
        private String e;

        /* renamed from: f, reason: collision with root package name */
        private String f29599f;

        /* renamed from: g, reason: collision with root package name */
        private String f29600g;

        /* renamed from: h, reason: collision with root package name */
        private String f29601h;

        /* renamed from: i, reason: collision with root package name */
        private List<String> f29602i;

        /* renamed from: j, reason: collision with root package name */
        private List<String> f29603j;

        /* renamed from: k, reason: collision with root package name */
        private List<String> f29604k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f29605l;

        /* renamed from: m, reason: collision with root package name */
        private List<String> f29606m;

        /* renamed from: n, reason: collision with root package name */
        private List<String> f29607n;

        /* renamed from: o, reason: collision with root package name */
        private List<String> f29608o;

        /* renamed from: p, reason: collision with root package name */
        private List<String> f29609p;

        /* renamed from: q, reason: collision with root package name */
        private List<String> f29610q;

        /* renamed from: r, reason: collision with root package name */
        private List<String> f29611r;

        a(String str, String str2, String str3, String str4, ArrayList<String> arrayList, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, boolean z2, String str5, List<String> list8, String str6, List<String> list9) {
            this.f29596a = false;
            this.f29604k = new ArrayList();
            this.f29605l = new ArrayList();
            this.f29606m = new ArrayList();
            this.f29607n = new ArrayList();
            this.d = str;
            this.e = str2;
            this.f29597b = str3;
            this.f29598c = str4;
            this.f29604k = arrayList;
            this.f29605l = list;
            this.f29606m = list2;
            this.f29607n = list3;
            this.f29608o = list4;
            this.f29609p = list5;
            this.f29610q = list6;
            this.f29611r = list7;
            this.f29596a = z2;
            this.f29600g = z2 ? str5 : null;
            this.f29603j = list8;
            this.f29601h = str6;
            this.f29602i = list9;
            k.b(f.d, "Vast ad created:\nvastAdId=" + str + "\nadSystem=" + str2 + "\nclickUrl=" + str3 + "\nvideoUrl=" + str4 + "\nprefetchResourceUrls=" + (arrayList != null ? arrayList.toString() : "null") + "\nstaticResourceUrls=" + (list != null ? list.toString() : "null") + "\nscriptResourceUrls=" + (list2 != null ? list2.toString() : "null") + "\nhtmlResourceUrls=" + (list3 != null ? list3.toString() : "null") + "\nvideoCompletedUrls=" + (list4 != null ? list4.toString() : "null") + "\nvideoTrackingEventUrls=" + (list5 != null ? list5.toString() : "null") + "\nclickTrackingUrls=" + (list6 != null ? list6.toString() : "null") + "\ncompanionClickTrackingUrls=" + (list7 != null ? list7.toString() : "null") + "\ncontainsMediaFileWithJsAppAttribute=" + z2 + "\nadParameters=" + (str5 != null ? str5.toString() : "null") + "\nimpressionUrls=" + (list8 != null ? list8.toString() : "null") + "\nmediaUrlList=" + (list9 != null ? list9.toString() : "null"));
        }

        a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
            this.f29596a = false;
            this.f29604k = new ArrayList();
            this.f29605l = new ArrayList();
            this.f29606m = new ArrayList();
            this.f29607n = new ArrayList();
            this.d = str;
            this.e = str2;
            this.f29599f = str3;
            this.f29603j = list;
            this.f29608o = list2;
            this.f29609p = list3;
            this.f29610q = list4;
            this.f29611r = list5;
            k.b(f.d, "Vast ad created:\nvastAdId=" + str + "\nadSystem=" + str2 + "\nvastAdUri=" + str3 + "\nvideoCompletedUrls=" + (list2 != null ? list2.toString() : "null") + "\nvideoTrackingEventUrls=" + (list3 != null ? list3.toString() : "null") + "\nclickTrackingUrls=" + (list4 != null ? list4.toString() : "null") + "\ncompanionClickTrackingUrls=" + (list5 != null ? list5.toString() : "null") + "\nimpressionUrls=" + (list != null ? list.toString() : "null"));
        }

        public String a() {
            return this.f29597b;
        }

        public String b() {
            return this.f29598c;
        }

        public String c() {
            return this.d;
        }

        public void a(String str) {
            this.d = str;
        }

        public String d() {
            return this.e;
        }

        public void b(String str) {
            this.e = str;
        }

        public String e() {
            return this.f29599f;
        }

        public void c(String str) {
            this.f29599f = str;
        }

        public String f() {
            return this.f29600g;
        }

        public String g() {
            return this.f29601h;
        }

        public List<String> h() {
            return this.f29602i;
        }

        public List<String> i() {
            return this.f29603j;
        }

        public void a(List<String> list) {
            this.f29603j = list;
        }

        public List<String> j() {
            return this.f29604k;
        }

        public List<String> k() {
            return this.f29605l;
        }

        public List<String> l() {
            return this.f29606m;
        }

        public List<String> m() {
            return this.f29607n;
        }

        public List<String> n() {
            return this.f29608o;
        }

        public void b(List<String> list) {
            this.f29608o = list;
        }

        public List<String> o() {
            return this.f29609p;
        }

        public void c(List<String> list) {
            this.f29609p = list;
        }

        public List<String> p() {
            return this.f29610q;
        }

        public void d(List<String> list) {
            this.f29610q = list;
        }

        public List<String> q() {
            return this.f29611r;
        }

        public void e(List<String> list) {
            this.f29611r = list;
        }

        public boolean r() {
            return this.f29596a && !s();
        }

        private boolean s() {
            for (String str : this.f29602i) {
                if (k.z(str)) {
                    Logger.d(f.d, "video file exists: " + str);
                    return true;
                }
            }
            k.b(f.d, "video file doesn't exist: " + h().toString());
            return false;
        }

        public String toString() {
            return "vastAdId=" + (this.d == null ? "null" : this.d) + ", adSystem=" + (this.e == null ? "null" : this.e) + ", clickUrl=" + (this.f29597b == null ? "null" : this.f29597b) + ", videoUrl=" + (this.f29598c == null ? "null" : this.f29598c) + ", vastAdUri=" + (this.f29599f == null ? "null" : this.f29599f) + ", mediaUrlList=" + (this.f29602i == null ? "null" : this.f29602i.toString());
        }
    }

    public static ArrayList<a> a(String str, boolean z2, String str2) {
        ArrayList<a> arrayList = new ArrayList<>();
        List<String> a2 = k.a(com.safedk.android.utils.f.v(), str);
        if (a2.size() == 0) {
            Logger.d(d, "No ad blocks detected, exiting");
            return arrayList;
        }
        Iterator<String> it = a2.iterator();
        while (it.hasNext()) {
            a b2 = b(it.next(), z2, str2);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    private static String a(String str, String str2) throws UnsupportedEncodingException {
        if (CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, false) && str.contains("%25")) {
            String decode = URLDecoder.decode(str, "UTF-8");
            Logger.d(d, "Decoding URL - url was decoded once");
            if (decode.contains("%25")) {
                decode = URLDecoder.decode(decode, "UTF-8");
                Logger.d(d, "Decoding URL - url was decoded twice");
            }
            return decode;
        }
        return str;
    }

    public static a b(String str, boolean z2, String str2) {
        try {
            k.b(d, "vast ad info parse started, response = " + str);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (a(com.safedk.android.utils.f.t(), str, -1, z2).size() == 0) {
                Logger.d(d, "No ad blocks detected, exiting");
                return null;
            }
            String str3 = null;
            String str4 = null;
            List<String> a2 = a(com.safedk.android.utils.f.u(), str, 1, z2);
            if (a2.size() > 0) {
                str3 = a(a2.get(0), false);
                Logger.d(d, "Ad ID detected: " + str3);
            }
            String str5 = null;
            List<String> a3 = a(com.safedk.android.utils.f.m(), str, 1, z2);
            if (a3.size() > 0) {
                str5 = a(k.k(a(a3.get(0), z2)), str2);
                k.b(d, "Vast ad uri added to followed urls : " + str5);
                f29595c.add(new PrefetchVastAdTagUri(str5));
            }
            List<String> a4 = a(com.safedk.android.utils.f.r(), str, 1, z2);
            if (a4.size() > 0) {
                str4 = a(a4.get(0), false);
                Logger.d(d, "Ad system detected : " + str4);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = a(com.safedk.android.utils.f.d(), str, 1, z2).iterator();
            while (it.hasNext()) {
                String replace = k.k(a(it.next(), z2)).replace("\\/", RemoteSettings.FORWARD_SLASH_STRING);
                arrayList.add(replace);
                Logger.d(d, "impression url identified : " + replace);
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<String> a5 = a(com.safedk.android.utils.f.g(), str, 1, 2, z2);
            for (int i2 = 0; i2 < a5.size(); i2 += 2) {
                a5.get(i2);
                arrayList2.add(k.k(a(a5.get(i2 + 1), z2)));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<String> it2 = a(com.safedk.android.utils.f.f(), str, 1, z2).iterator();
            while (it2.hasNext()) {
                arrayList4.add(k.k(a(it2.next(), z2)));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<String> it3 = a(com.safedk.android.utils.f.e(), str, 1, z2).iterator();
            while (it3.hasNext()) {
                arrayList5.add(k.k(a(it3.next(), z2)));
            }
            if (str5 != null) {
                return a(str5, str3, str4, arrayList, arrayList3, arrayList2, arrayList4, arrayList5);
            }
            return a(str, z2, str, str3, str4, arrayList, arrayList3, arrayList2, arrayList4, arrayList5);
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.e(d, "failed to parse vast data", th);
            return null;
        }
    }

    private static a a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        if (str == null) {
            return null;
        }
        Logger.d(d, "vast ad uri detected: " + str);
        return new a(str2, str3, str, list, list2, list3, list4, list5);
    }

    private static a a(String str, boolean z2, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        String str5;
        String str6;
        Logger.d(d, "no vast ad tag uri");
        boolean z3 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        List<String> a2 = a(com.safedk.android.utils.f.s(), str2, 0, false);
        Logger.d(d, "Number of creatives XML elements: " + a2.size());
        if (a2.size() == 0) {
            k.b(d, "Number of creatives XML elements is 0, the xml is:\n" + str2);
        }
        String str11 = null;
        for (String str12 : a2) {
            List<String> a3 = a(com.safedk.android.utils.f.n(), str12, 1, false);
            if (a3.size() > 0) {
                Logger.d(d, "companion click url list: " + a3.toString());
                str5 = a(a3.get(0), true);
            } else {
                Logger.d(d, "companion click url list is empty");
                str5 = str11;
            }
            List<String> a4 = a(com.safedk.android.utils.f.q(), str12, 1, false);
            if (a4.size() > 0) {
                Logger.d(d, "click url list: " + a4);
                str10 = a(a4.get(0), z2);
                if (str5 == null) {
                    str5 = a(a4.get(0), true);
                }
                Iterator<String> it = a4.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next(), z2));
                }
            } else {
                Logger.d(d, "click url list is empty");
            }
            if (!TextUtils.isEmpty(str5)) {
                str7 = str5;
            }
            for (String str13 : a(com.safedk.android.utils.f.p(), str12, -1, z2)) {
                List<String> a5 = a(com.safedk.android.utils.f.o(), str13, -1, z2);
                List<String> a6 = a(com.safedk.android.utils.f.p(), str13, 1, z2);
                String a7 = a(a6.get(0), z2);
                if (a5.size() > 0) {
                    z3 = true;
                    arrayList.add(a7);
                    Logger.d(d, "contains media file with JS app attribute");
                } else if (a6.size() > 0) {
                    arrayList5.add(a7);
                    Logger.d(d, "adding media file : " + a7);
                } else {
                    Logger.d(d, "cannot detect media resource in. skipping");
                }
            }
            List<String> a8 = a(com.safedk.android.utils.f.h(), str12, 1, z2);
            if (a8.size() > 0) {
                str9 = a(a8.get(0), z2);
                if (k.v(str9)) {
                    k.b(d, "ad parameters is JSON : " + str9);
                    ArrayList<String> h2 = k.h(str9);
                    if (h2.size() > 0) {
                        for (String str14 : h2) {
                            Logger.d(d, "ad parameters media url : " + str14);
                            if (k.z(str14)) {
                                Logger.d(d, "ad parameters media url is video url : " + str14);
                                arrayList5.add(a(str14, z2));
                            }
                        }
                    }
                } else {
                    k.b(d, "found ad parameters = " + str9);
                }
            }
            List<String> a9 = a(com.safedk.android.utils.f.l(), str2, 1, z2);
            if (a9.size() > 0) {
                arrayList.add("element:ytId:" + a9.get(0));
                Logger.d(d, "handle no vast ad Uri - added element to prefetch collection: " + a9.get(0));
            }
            String str15 = null;
            String str16 = null;
            Iterator it2 = arrayList5.iterator();
            while (true) {
                str6 = str16;
                if (!it2.hasNext()) {
                    str16 = null;
                    break;
                }
                str16 = (String) it2.next();
                if (k.z(str16) && str16.contains(e)) {
                    Logger.d(d, "found google videoUrl : " + str16);
                    break;
                }
                String A = k.A(str16);
                if (A != null && A.equals(k.f30095c) && str15 == null) {
                    str15 = str16;
                }
                if (A == null || A.equals(k.f30095c) || str6 != null) {
                    str16 = str6;
                }
            }
            if (str16 == null && str15 != null) {
                Logger.d(d, "found first MP4 videoUrl : " + str15);
                str16 = str15;
            }
            if (str16 == null && str6 != null) {
                Logger.d(d, "found first non-MP4 videoUrl : " + str6);
                str16 = str6;
            }
            if (!TextUtils.isEmpty(str16)) {
                if (arrayList.contains(str16)) {
                    str8 = str16;
                } else {
                    arrayList.add(str16);
                    str8 = str16;
                }
            } else {
                Logger.d(d, "VAST ad did NOT found video url");
            }
            if (!TextUtils.isEmpty(str5)) {
                Logger.d(d, "VAST ad found click Url = " + str5);
            }
            str11 = str5;
        }
        a(str, z2, arrayList2, com.safedk.android.utils.f.k());
        a(str, z2, arrayList3, com.safedk.android.utils.f.j());
        a(str, z2, arrayList4, com.safedk.android.utils.f.i());
        if (str7 != null) {
            arrayList.remove(str7);
        }
        return new a(str3, str4, str7, str8, arrayList, arrayList2, arrayList3, arrayList4, list2, list3, list4, list5, z3, str9, list, str10, arrayList5);
    }

    private static void a(String str, boolean z2, List<String> list, Pattern pattern) {
        Iterator<String> it = a(pattern, str, 1, z2).iterator();
        while (it.hasNext()) {
            String F = k.F(it.next());
            List<String> a2 = a(com.safedk.android.utils.f.w(), F, 1, z2);
            if (a2.size() > 0) {
                F = a2.get(0);
            }
            try {
                new URL(F);
                list.add(F);
            } catch (MalformedURLException e2) {
                Logger.d(d, "resources inner text is malformed. cannot add this url to the resources list");
            }
        }
    }

    public static boolean a(String str) {
        return com.safedk.android.utils.f.b().matcher(str).find();
    }

    public static void b(String str) {
        List<String> a2 = a(com.safedk.android.utils.f.m(), str, 1, true);
        if (a2.size() > 0) {
            String k2 = k.k(a(a2.get(0), true));
            k.b(d, "Vast ad uri added to followed urls : " + k2);
            f29595c.add(new PrefetchVastAdTagUri(k2));
        }
    }
}
