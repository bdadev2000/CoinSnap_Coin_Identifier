package com.mbridge.msdk.c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b {
    public static int a = 1500;
    private long G;
    private ArrayList<Integer> I;
    private d J;
    private C0161b K;
    private HashMap<String, String> P;
    private String Q;
    private int V;
    private String Y;
    private Map<String, String> Z;
    private boolean aE;
    private JSONArray aG;
    private JSONObject aH;
    private long aJ;
    private long aO;
    private boolean aP;
    private String aV;
    private String aZ;

    /* renamed from: ai, reason: collision with root package name */
    private int f12358ai;
    private String al;
    private String am;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private long av;
    private long aw;

    /* renamed from: m, reason: collision with root package name */
    private int f12370m;

    /* renamed from: o, reason: collision with root package name */
    private List<com.mbridge.msdk.foundation.entity.a> f12372o;

    /* renamed from: q, reason: collision with root package name */
    private long f12374q;

    /* renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.c.a f12375r;

    /* renamed from: s, reason: collision with root package name */
    private String f12376s;

    /* renamed from: t, reason: collision with root package name */
    private Map<String, a> f12377t;
    private boolean u;

    /* renamed from: v, reason: collision with root package name */
    private int f12378v;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12359b = false;

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f12360c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f12361d = new JSONArray();

    /* renamed from: e, reason: collision with root package name */
    private String f12362e = "";

    /* renamed from: f, reason: collision with root package name */
    private int f12363f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f12364g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f12365h = 2;

    /* renamed from: i, reason: collision with root package name */
    private int f12366i = 0;

    /* renamed from: j, reason: collision with root package name */
    private String f12367j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f12368k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f12369l = "";

    /* renamed from: n, reason: collision with root package name */
    private int f12371n = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f12373p = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f12379w = 1;

    /* renamed from: x, reason: collision with root package name */
    private boolean f12380x = false;

    /* renamed from: y, reason: collision with root package name */
    private String f12381y = "";

    /* renamed from: z, reason: collision with root package name */
    private String f12382z = "";
    private String A = "";
    private String B = "";
    private String C = "";
    private int D = 120;
    private String E = com.mbridge.msdk.foundation.same.net.e.d.f().f13398h;
    private String F = com.mbridge.msdk.foundation.same.net.e.d.f().f13402l;
    private int H = a;
    private int L = 0;
    private long M = 86400;
    private int N = 0;
    private int O = 3;
    private boolean R = true;
    private int S = 0;
    private boolean T = false;
    private boolean U = false;
    private int W = 0;
    private int X = 0;

    /* renamed from: aa, reason: collision with root package name */
    private String f12350aa = "1.0";

    /* renamed from: ab, reason: collision with root package name */
    private int f12351ab = 30;

    /* renamed from: ac, reason: collision with root package name */
    private int f12352ac = 9377;

    /* renamed from: ad, reason: collision with root package name */
    private int f12353ad = 0;

    /* renamed from: ae, reason: collision with root package name */
    private int f12354ae = 5;

    /* renamed from: af, reason: collision with root package name */
    private int f12355af = 1;

    /* renamed from: ag, reason: collision with root package name */
    private int f12356ag = 8000;

    /* renamed from: ah, reason: collision with root package name */
    private String f12357ah = "";
    private int aj = 10;
    private int ak = 120;
    private String an = "";
    private String ao = "";
    private String at = "";
    private String au = "";
    private List<Integer> ax = new ArrayList();
    private int ay = 3;
    private int az = 0;
    private int aA = 3;
    private int aB = 0;
    private int aC = 10;
    private int aD = 600;
    private int aF = 0;
    private String aI = "";
    private int aK = 8000;
    private int aL = 1;
    private long aM = 10;
    private int aN = 3;
    private int aQ = 1;
    private int aR = 1;
    private int aS = 1;
    private int aT = 1;
    private String aU = "";
    private int aW = 1300;
    private int aX = 0;
    private int aY = 0;

    /* loaded from: classes4.dex */
    public static class a {
        private List<String> a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f12385b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f12386c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f12387d;

        public final List<String> a() {
            return this.a;
        }

        public final List<String> b() {
            return this.f12385b;
        }

        public final List<String> c() {
            return this.f12386c;
        }

        public final List<String> d() {
            return this.f12387d;
        }

        public final void a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f12386c = r.a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.f12387d = r.a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.f12385b = r.a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.a = r.a(optJSONArray4);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static String a(Context context, String str) {
        try {
            g b3 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 != null && ((b) b3).Z != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = ((b) b3).Z.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = ((b) b3).Z.get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", com.mbridge.msdk.foundation.tools.e.c());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static Map<String, a> e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a aVar = new a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    aVar.a(optJSONObject);
                }
                hashMap.put(next, aVar);
            }
            return hashMap;
        } catch (JSONException e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return null;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return null;
        }
    }

    public final long A() {
        return this.G;
    }

    public final ArrayList<Integer> B() {
        return this.I;
    }

    public final d C() {
        return this.J;
    }

    public final C0161b D() {
        return this.K;
    }

    public final long E() {
        return this.M;
    }

    public final int F() {
        return this.O;
    }

    public final HashMap<String, String> G() {
        return this.P;
    }

    public final int H() {
        return this.S;
    }

    public final int I() {
        return this.V;
    }

    public final int J() {
        return this.W;
    }

    public final JSONArray K() {
        return this.f12360c;
    }

    public final JSONArray L() {
        return this.f12361d;
    }

    public final String M() {
        return this.f12350aa;
    }

    public final int N() {
        return this.f12355af;
    }

    public final int O() {
        return this.f12356ag;
    }

    public final int P() {
        return this.f12358ai;
    }

    public final int Q() {
        return this.ak;
    }

    public final String R() {
        return this.al;
    }

    public final String S() {
        return this.am;
    }

    public final String T() {
        return this.an;
    }

    public final String U() {
        return this.ao;
    }

    public final int V() {
        return this.ap;
    }

    public final int W() {
        return this.aq;
    }

    public final int X() {
        return this.ar;
    }

    public final int Y() {
        return this.as;
    }

    public final long Z() {
        return this.av;
    }

    public final boolean aA() {
        return this.R;
    }

    public final boolean aB() {
        return this.u;
    }

    public final boolean aC() {
        return this.f12380x;
    }

    public final boolean aD() {
        return this.T;
    }

    public final boolean aE() {
        return this.f12359b;
    }

    public final boolean aF() {
        return this.U;
    }

    public final boolean aG() {
        return this.aE;
    }

    public final boolean aH() {
        return this.aP;
    }

    public final void aI() {
        boolean z10;
        String language = Locale.getDefault().getLanguage();
        boolean z11 = true;
        if (!TextUtils.isEmpty(this.C) && !TextUtils.isEmpty(this.A) && !TextUtils.isEmpty(this.B) && !TextUtils.isEmpty(this.f12382z)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.C = "确认关闭？";
                this.A = "关闭后您将不会获得任何奖励噢~ ";
                this.B = "确认关闭";
                this.f12382z = "继续观看";
            } else {
                this.C = "Confirm to close? ";
                this.A = "You will not be rewarded after closing the window";
                this.B = "Close it";
                this.f12382z = "Continue";
            }
        }
        if (TextUtils.isEmpty(this.C) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f12381y)) {
            z11 = false;
        }
        if (!z11) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.C = "确认关闭？";
                this.A = "关闭后您将不会获得任何奖励噢~ ";
                this.B = "确认关闭";
                this.f12381y = "继续试玩";
                return;
            }
            this.C = "Confirm to close? ";
            this.A = "You will not be rewarded after closing the window";
            this.B = "Close it";
            this.f12381y = "Continue";
        }
    }

    public final long aa() {
        if (this.aw <= 0) {
            this.aw = 7200L;
        }
        return this.aw;
    }

    public final int ab() {
        return this.ay;
    }

    public final int ac() {
        return this.az;
    }

    public final int ad() {
        return this.aA;
    }

    public final int ae() {
        return this.aB;
    }

    public final int af() {
        return this.aC;
    }

    public final int ag() {
        return this.aD;
    }

    public final int ah() {
        return this.aF;
    }

    public final JSONArray ai() {
        return this.aG;
    }

    public final JSONObject aj() {
        return this.aH;
    }

    public final String ak() {
        return this.aI;
    }

    public final long al() {
        return this.aJ;
    }

    public final int am() {
        return this.aK;
    }

    public final int an() {
        return this.aL;
    }

    public final long ao() {
        return this.aM * 1000;
    }

    public final int ap() {
        return this.aN;
    }

    public final long aq() {
        return this.aO;
    }

    public final int ar() {
        return this.aQ;
    }

    public final int as() {
        return this.aR;
    }

    public final int at() {
        return this.aS;
    }

    public final int au() {
        return this.aT;
    }

    public final String av() {
        return this.aU;
    }

    public final String aw() {
        return this.aV;
    }

    public final int ax() {
        return this.aW;
    }

    public final int ay() {
        return this.aX;
    }

    public final int az() {
        return this.aY;
    }

    public final int b() {
        return this.f12363f;
    }

    public final int c() {
        return this.f12364g;
    }

    public final int d() {
        return this.f12365h;
    }

    public final String f() {
        return this.f12367j;
    }

    public final String g() {
        return this.f12368k;
    }

    public final String h() {
        return this.f12369l;
    }

    public final int i() {
        return this.f12370m;
    }

    public final int j() {
        return this.f12371n;
    }

    public final List<com.mbridge.msdk.foundation.entity.a> k() {
        return this.f12372o;
    }

    public final int l() {
        return this.f12373p;
    }

    public final long m() {
        return this.f12374q;
    }

    public final com.mbridge.msdk.c.a n() {
        return this.f12375r;
    }

    public final String o() {
        return this.f12376s;
    }

    public final Map<String, a> p() {
        return this.f12377t;
    }

    public final int q() {
        return this.f12378v;
    }

    public final int r() {
        return this.f12379w;
    }

    public final String s() {
        return this.f12381y;
    }

    public final String t() {
        return this.f12382z;
    }

    public String toString() {
        return " cfc=" + this.f12378v + " getpf=" + this.M + " rurl=" + this.aE;
    }

    public final String u() {
        return this.A;
    }

    public final String v() {
        return this.B;
    }

    public final String w() {
        return this.C;
    }

    public final int x() {
        return this.D;
    }

    public final String y() {
        return this.E;
    }

    public final String z() {
        return this.F;
    }

    public final void b(int i10) {
        this.f12364g = i10;
    }

    public final void c(int i10) {
        this.f12365h = i10;
    }

    public final void d(int i10) {
        this.f12366i = i10;
    }

    public final void f(int i10) {
        this.f12371n = i10;
    }

    public final void g(int i10) {
        this.f12373p = i10;
    }

    public final void h(int i10) {
        this.f12378v = i10;
    }

    public final void i(int i10) {
        this.f12379w = i10;
    }

    public final void j(int i10) {
        this.D = i10;
    }

    public final void k(int i10) {
        this.O = i10;
    }

    public final void l(int i10) {
        this.S = i10;
    }

    public final void m(int i10) {
        this.V = i10;
    }

    public final void n(int i10) {
        this.W = i10;
    }

    public final void o(int i10) {
        if (i10 > 0) {
            this.aj = i10;
        }
    }

    public final void p(int i10) {
        this.f12358ai = i10;
    }

    public final void q(int i10) {
        this.ak = i10;
    }

    public final void r(int i10) {
        this.aF = i10;
    }

    public final void s(int i10) {
        this.aL = i10;
    }

    public final void t(int i10) {
        this.aN = i10;
    }

    public final void u(int i10) {
        this.aQ = i10;
    }

    public final void v(int i10) {
        this.aR = i10;
    }

    public final void w(int i10) {
        this.aS = i10;
    }

    public final void x(int i10) {
        this.aT = i10;
    }

    public final boolean y(int i10) {
        return this.ax.contains(Integer.valueOf(i10));
    }

    public final void b(String str) {
        this.am = str;
    }

    public final void c(String str) {
        this.an = str;
    }

    public final void d(String str) {
        this.ao = str;
    }

    public final void f(boolean z10) {
        this.aP = z10;
    }

    public final void b(long j3) {
        this.av = j3;
    }

    public final void c(long j3) {
        this.aw = j3;
    }

    public final void d(long j3) {
        this.aJ = j3;
    }

    public final void b(boolean z10) {
        this.f12380x = z10;
    }

    public final void c(boolean z10) {
        this.T = z10;
    }

    public final void d(boolean z10) {
        this.f12359b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x05a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0692 A[Catch: Exception -> 0x06b4, TryCatch #8 {Exception -> 0x06b4, blocks: (B:9:0x0017, B:12:0x0064, B:15:0x00ac, B:34:0x014e, B:36:0x0230, B:37:0x023b, B:39:0x0251, B:40:0x028a, B:43:0x02a6, B:45:0x02c0, B:47:0x02c6, B:48:0x02cc, B:50:0x02d2, B:52:0x02d8, B:54:0x02df, B:57:0x02e2, B:59:0x02e8, B:60:0x02f2, B:62:0x0355, B:64:0x035d, B:67:0x0364, B:69:0x036a, B:70:0x0372, B:72:0x0378, B:75:0x0384, B:78:0x038a, B:98:0x0449, B:107:0x048f, B:128:0x0516, B:134:0x0537, B:136:0x0545, B:138:0x0555, B:139:0x055e, B:179:0x0686, B:181:0x0692, B:182:0x069c, B:184:0x06a8, B:213:0x0683, B:216:0x0582, B:221:0x0571, B:224:0x0535, B:232:0x0486, B:259:0x034c, B:261:0x0256, B:263:0x0260, B:265:0x0266, B:266:0x026c, B:268:0x0272, B:270:0x0288, B:273:0x014b, B:274:0x00a8, B:275:0x0060, B:235:0x02fe, B:236:0x0310, B:238:0x0316, B:241:0x0322, B:244:0x032c, B:247:0x033a, B:254:0x0342, B:256:0x0348, B:17:0x0102, B:19:0x010a, B:21:0x0110, B:22:0x0116, B:24:0x011c, B:26:0x0126, B:28:0x013f, B:32:0x0147, B:130:0x0527, B:133:0x0532, B:100:0x0461, B:103:0x0473, B:106:0x047e, B:152:0x0584, B:189:0x05ff, B:209:0x067e), top: B:8:0x0017, inners: #1, #2, #7, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06a8 A[Catch: Exception -> 0x06b4, TRY_LEAVE, TryCatch #8 {Exception -> 0x06b4, blocks: (B:9:0x0017, B:12:0x0064, B:15:0x00ac, B:34:0x014e, B:36:0x0230, B:37:0x023b, B:39:0x0251, B:40:0x028a, B:43:0x02a6, B:45:0x02c0, B:47:0x02c6, B:48:0x02cc, B:50:0x02d2, B:52:0x02d8, B:54:0x02df, B:57:0x02e2, B:59:0x02e8, B:60:0x02f2, B:62:0x0355, B:64:0x035d, B:67:0x0364, B:69:0x036a, B:70:0x0372, B:72:0x0378, B:75:0x0384, B:78:0x038a, B:98:0x0449, B:107:0x048f, B:128:0x0516, B:134:0x0537, B:136:0x0545, B:138:0x0555, B:139:0x055e, B:179:0x0686, B:181:0x0692, B:182:0x069c, B:184:0x06a8, B:213:0x0683, B:216:0x0582, B:221:0x0571, B:224:0x0535, B:232:0x0486, B:259:0x034c, B:261:0x0256, B:263:0x0260, B:265:0x0266, B:266:0x026c, B:268:0x0272, B:270:0x0288, B:273:0x014b, B:274:0x00a8, B:275:0x0060, B:235:0x02fe, B:236:0x0310, B:238:0x0316, B:241:0x0322, B:244:0x032c, B:247:0x033a, B:254:0x0342, B:256:0x0348, B:17:0x0102, B:19:0x010a, B:21:0x0110, B:22:0x0116, B:24:0x011c, B:26:0x0126, B:28:0x013f, B:32:0x0147, B:130:0x0527, B:133:0x0532, B:100:0x0461, B:103:0x0473, B:106:0x047e, B:152:0x0584, B:189:0x05ff, B:209:0x067e), top: B:8:0x0017, inners: #1, #2, #7, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0604 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.c.g a(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 1727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.c.b.a(org.json.JSONObject):com.mbridge.msdk.c.g");
    }

    public final int e() {
        return this.f12366i;
    }

    /* renamed from: com.mbridge.msdk.c.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0161b {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private JSONArray f12393b;

        /* renamed from: c, reason: collision with root package name */
        private String f12394c;

        /* renamed from: d, reason: collision with root package name */
        private String f12395d;

        /* renamed from: e, reason: collision with root package name */
        private String f12396e;

        /* renamed from: f, reason: collision with root package name */
        private String f12397f;

        public static C0161b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0161b c0161b = new C0161b();
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            c0161b.f12397f = jSONObject.optString(CampaignEx.JSON_KEY_TITLE, c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_title", "string")));
            c0161b.a = jSONObject.optString("cancel", c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_close_close", "string")));
            c0161b.f12395d = jSONObject.optString("submit", c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_close_submit", "string")));
            c0161b.f12396e = jSONObject.optString("submit_notice", c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_submit_notice", "string")));
            c0161b.f12394c = jSONObject.optString("privacy", c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_privacy_des", "string")));
            JSONArray optJSONArray = jSONObject.optJSONArray(AppLovinEventTypes.USER_VIEWED_CONTENT);
            c0161b.f12393b = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0161b.f12393b = jSONArray;
                jSONArray.put(c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_content_not_play", "string")));
                c0161b.f12393b.put(c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_content_sound_problems", "string")));
                c0161b.f12393b.put(c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_content_misleading", "string")));
                c0161b.f12393b.put(c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_content_fraud", "string")));
                c0161b.f12393b.put(c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_content_por_violence", "string")));
                c0161b.f12393b.put(c10.getString(v.a(c10, "mbridge_cm_feedback_dialog_content_other", "string")));
            }
            return c0161b;
        }

        public final JSONArray b() {
            return this.f12393b;
        }

        public final String c() {
            return this.f12394c;
        }

        public final String d() {
            return this.f12395d;
        }

        public final String e() {
            return this.f12396e;
        }

        public final String f() {
            return this.f12397f;
        }

        public final String a() {
            return this.a;
        }
    }

    public final void e(int i10) {
        this.f12370m = i10;
    }

    public final void e(long j3) {
        this.aM = j3;
    }

    public final void e(boolean z10) {
        this.aE = z10;
    }

    public final String a() {
        return this.f12362e;
    }

    public final void a(int i10) {
        this.f12363f = i10;
    }

    public final void a(long j3) {
        this.f12374q = j3;
    }

    public final void a(String str) {
        this.Q = str;
    }

    public final void a(boolean z10) {
        this.u = z10;
    }
}
