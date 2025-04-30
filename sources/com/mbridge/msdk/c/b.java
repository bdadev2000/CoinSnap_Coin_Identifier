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

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f14613a = 1500;

    /* renamed from: G, reason: collision with root package name */
    private long f14620G;

    /* renamed from: I, reason: collision with root package name */
    private ArrayList<Integer> f14622I;

    /* renamed from: J, reason: collision with root package name */
    private d f14623J;

    /* renamed from: K, reason: collision with root package name */
    private C0149b f14624K;

    /* renamed from: P, reason: collision with root package name */
    private HashMap<String, String> f14628P;

    /* renamed from: Q, reason: collision with root package name */
    private String f14629Q;

    /* renamed from: V, reason: collision with root package name */
    private int f14634V;

    /* renamed from: Y, reason: collision with root package name */
    private String f14637Y;

    /* renamed from: Z, reason: collision with root package name */
    private Map<String, String> f14638Z;
    private boolean aE;
    private JSONArray aG;
    private JSONObject aH;
    private long aJ;
    private long aO;
    private boolean aP;
    private String aV;
    private String aZ;
    private int ai;
    private String al;
    private String am;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private long av;
    private long aw;
    private int m;

    /* renamed from: o, reason: collision with root package name */
    private List<com.mbridge.msdk.foundation.entity.a> f14649o;

    /* renamed from: q, reason: collision with root package name */
    private long f14651q;

    /* renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.c.a f14652r;

    /* renamed from: s, reason: collision with root package name */
    private String f14653s;

    /* renamed from: t, reason: collision with root package name */
    private Map<String, a> f14654t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f14655u;

    /* renamed from: v, reason: collision with root package name */
    private int f14656v;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f14639c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f14640d = new JSONArray();

    /* renamed from: e, reason: collision with root package name */
    private String f14641e = "";

    /* renamed from: f, reason: collision with root package name */
    private int f14642f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f14643g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f14644h = 2;

    /* renamed from: i, reason: collision with root package name */
    private int f14645i = 0;

    /* renamed from: j, reason: collision with root package name */
    private String f14646j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f14647k = "";
    private String l = "";

    /* renamed from: n, reason: collision with root package name */
    private int f14648n = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f14650p = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f14657w = 1;

    /* renamed from: x, reason: collision with root package name */
    private boolean f14658x = false;

    /* renamed from: y, reason: collision with root package name */
    private String f14659y = "";

    /* renamed from: z, reason: collision with root package name */
    private String f14660z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f14614A = "";

    /* renamed from: B, reason: collision with root package name */
    private String f14615B = "";

    /* renamed from: C, reason: collision with root package name */
    private String f14616C = "";

    /* renamed from: D, reason: collision with root package name */
    private int f14617D = 120;

    /* renamed from: E, reason: collision with root package name */
    private String f14618E = com.mbridge.msdk.foundation.same.net.e.d.f().f15832h;

    /* renamed from: F, reason: collision with root package name */
    private String f14619F = com.mbridge.msdk.foundation.same.net.e.d.f().l;

    /* renamed from: H, reason: collision with root package name */
    private int f14621H = f14613a;

    /* renamed from: L, reason: collision with root package name */
    private int f14625L = 0;

    /* renamed from: M, reason: collision with root package name */
    private long f14626M = 86400;

    /* renamed from: N, reason: collision with root package name */
    private int f14627N = 0;
    private int O = 3;

    /* renamed from: R, reason: collision with root package name */
    private boolean f14630R = true;

    /* renamed from: S, reason: collision with root package name */
    private int f14631S = 0;

    /* renamed from: T, reason: collision with root package name */
    private boolean f14632T = false;

    /* renamed from: U, reason: collision with root package name */
    private boolean f14633U = false;

    /* renamed from: W, reason: collision with root package name */
    private int f14635W = 0;

    /* renamed from: X, reason: collision with root package name */
    private int f14636X = 0;
    private String aa = "1.0";
    private int ab = 30;
    private int ac = 9377;
    private int ad = 0;
    private int ae = 5;
    private int af = 1;
    private int ag = 8000;
    private String ah = "";
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

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f14663a;
        private List<String> b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f14664c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f14665d;

        public final List<String> a() {
            return this.f14663a;
        }

        public final List<String> b() {
            return this.b;
        }

        public final List<String> c() {
            return this.f14664c;
        }

        public final List<String> d() {
            return this.f14665d;
        }

        public final void a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f14664c = r.a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.f14665d = r.a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.b = r.a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.f14663a = r.a(optJSONArray4);
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public static String a(Context context, String str) {
        try {
            g b = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b != null && ((b) b).f14638Z != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = ((b) b).f14638Z.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = ((b) b).f14638Z.get(key);
                        if (TextUtils.isEmpty(str2)) {
                            return "";
                        }
                        return str2.replace("{gaid}", com.mbridge.msdk.foundation.tools.e.c());
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
        } catch (JSONException e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
            return null;
        } catch (Exception e9) {
            if (MBridgeConstans.DEBUG) {
                e9.printStackTrace();
            }
            return null;
        }
    }

    public final long A() {
        return this.f14620G;
    }

    public final ArrayList<Integer> B() {
        return this.f14622I;
    }

    public final d C() {
        return this.f14623J;
    }

    public final C0149b D() {
        return this.f14624K;
    }

    public final long E() {
        return this.f14626M;
    }

    public final int F() {
        return this.O;
    }

    public final HashMap<String, String> G() {
        return this.f14628P;
    }

    public final int H() {
        return this.f14631S;
    }

    public final int I() {
        return this.f14634V;
    }

    public final int J() {
        return this.f14635W;
    }

    public final JSONArray K() {
        return this.f14639c;
    }

    public final JSONArray L() {
        return this.f14640d;
    }

    public final String M() {
        return this.aa;
    }

    public final int N() {
        return this.af;
    }

    public final int O() {
        return this.ag;
    }

    public final int P() {
        return this.ai;
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
        return this.f14630R;
    }

    public final boolean aB() {
        return this.f14655u;
    }

    public final boolean aC() {
        return this.f14658x;
    }

    public final boolean aD() {
        return this.f14632T;
    }

    public final boolean aE() {
        return this.b;
    }

    public final boolean aF() {
        return this.f14633U;
    }

    public final boolean aG() {
        return this.aE;
    }

    public final boolean aH() {
        return this.aP;
    }

    public final void aI() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(this.f14616C) || TextUtils.isEmpty(this.f14614A) || TextUtils.isEmpty(this.f14615B) || TextUtils.isEmpty(this.f14660z)) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.f14616C = "确认关闭？";
                this.f14614A = "关闭后您将不会获得任何奖励噢~ ";
                this.f14615B = "确认关闭";
                this.f14660z = "继续观看";
            } else {
                this.f14616C = "Confirm to close? ";
                this.f14614A = "You will not be rewarded after closing the window";
                this.f14615B = "Close it";
                this.f14660z = "Continue";
            }
        }
        if (TextUtils.isEmpty(this.f14616C) || TextUtils.isEmpty(this.f14614A) || TextUtils.isEmpty(this.f14615B) || TextUtils.isEmpty(this.f14659y)) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.f14616C = "确认关闭？";
                this.f14614A = "关闭后您将不会获得任何奖励噢~ ";
                this.f14615B = "确认关闭";
                this.f14659y = "继续试玩";
                return;
            }
            this.f14616C = "Confirm to close? ";
            this.f14614A = "You will not be rewarded after closing the window";
            this.f14615B = "Close it";
            this.f14659y = "Continue";
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
        return this.f14642f;
    }

    public final int c() {
        return this.f14643g;
    }

    public final int d() {
        return this.f14644h;
    }

    public final String f() {
        return this.f14646j;
    }

    public final String g() {
        return this.f14647k;
    }

    public final String h() {
        return this.l;
    }

    public final int i() {
        return this.m;
    }

    public final int j() {
        return this.f14648n;
    }

    public final List<com.mbridge.msdk.foundation.entity.a> k() {
        return this.f14649o;
    }

    public final int l() {
        return this.f14650p;
    }

    public final long m() {
        return this.f14651q;
    }

    public final com.mbridge.msdk.c.a n() {
        return this.f14652r;
    }

    public final String o() {
        return this.f14653s;
    }

    public final Map<String, a> p() {
        return this.f14654t;
    }

    public final int q() {
        return this.f14656v;
    }

    public final int r() {
        return this.f14657w;
    }

    public final String s() {
        return this.f14659y;
    }

    public final String t() {
        return this.f14660z;
    }

    public String toString() {
        return " cfc=" + this.f14656v + " getpf=" + this.f14626M + " rurl=" + this.aE;
    }

    public final String u() {
        return this.f14614A;
    }

    public final String v() {
        return this.f14615B;
    }

    public final String w() {
        return this.f14616C;
    }

    public final int x() {
        return this.f14617D;
    }

    public final String y() {
        return this.f14618E;
    }

    public final String z() {
        return this.f14619F;
    }

    public final void b(int i9) {
        this.f14643g = i9;
    }

    public final void c(int i9) {
        this.f14644h = i9;
    }

    public final void d(int i9) {
        this.f14645i = i9;
    }

    public final void f(int i9) {
        this.f14648n = i9;
    }

    public final void g(int i9) {
        this.f14650p = i9;
    }

    public final void h(int i9) {
        this.f14656v = i9;
    }

    public final void i(int i9) {
        this.f14657w = i9;
    }

    public final void j(int i9) {
        this.f14617D = i9;
    }

    public final void k(int i9) {
        this.O = i9;
    }

    public final void l(int i9) {
        this.f14631S = i9;
    }

    public final void m(int i9) {
        this.f14634V = i9;
    }

    public final void n(int i9) {
        this.f14635W = i9;
    }

    public final void o(int i9) {
        if (i9 > 0) {
            this.aj = i9;
        }
    }

    public final void p(int i9) {
        this.ai = i9;
    }

    public final void q(int i9) {
        this.ak = i9;
    }

    public final void r(int i9) {
        this.aF = i9;
    }

    public final void s(int i9) {
        this.aL = i9;
    }

    public final void t(int i9) {
        this.aN = i9;
    }

    public final void u(int i9) {
        this.aQ = i9;
    }

    public final void v(int i9) {
        this.aR = i9;
    }

    public final void w(int i9) {
        this.aS = i9;
    }

    public final void x(int i9) {
        this.aT = i9;
    }

    public final boolean y(int i9) {
        return this.ax.contains(Integer.valueOf(i9));
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

    public final void f(boolean z8) {
        this.aP = z8;
    }

    public final void b(long j7) {
        this.av = j7;
    }

    public final void c(long j7) {
        this.aw = j7;
    }

    public final void d(long j7) {
        this.aJ = j7;
    }

    public final void b(boolean z8) {
        this.f14658x = z8;
    }

    public final void c(boolean z8) {
        this.f14632T = z8;
    }

    public final void d(boolean z8) {
        this.b = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x069f A[Catch: Exception -> 0x023e, TryCatch #12 {Exception -> 0x023e, blocks: (B:8:0x0017, B:11:0x0064, B:14:0x00ac, B:33:0x0150, B:35:0x0232, B:36:0x0242, B:38:0x0258, B:39:0x0291, B:42:0x02ad, B:44:0x02c7, B:46:0x02cd, B:47:0x02d3, B:49:0x02d9, B:51:0x02df, B:53:0x02e6, B:56:0x02e9, B:58:0x02ef, B:59:0x02f9, B:61:0x035d, B:63:0x0365, B:66:0x036c, B:68:0x0372, B:69:0x037a, B:71:0x0380, B:74:0x038c, B:77:0x0392, B:97:0x0451, B:106:0x0497, B:127:0x051e, B:133:0x053f, B:135:0x054d, B:137:0x055d, B:138:0x0566, B:172:0x0693, B:174:0x069f, B:175:0x06a9, B:177:0x06b5, B:211:0x0690, B:214:0x0589, B:217:0x0579, B:220:0x053d, B:228:0x048e, B:256:0x0354, B:258:0x025d, B:260:0x0267, B:262:0x026d, B:263:0x0273, B:265:0x0279, B:267:0x028f, B:271:0x014d, B:272:0x00a8, B:273:0x0060, B:149:0x058b, B:207:0x0608, B:183:0x068c, B:155:0x0610, B:157:0x061a, B:159:0x0624, B:161:0x062c, B:163:0x0641, B:164:0x0654, B:166:0x065e, B:168:0x0666, B:170:0x067b, B:185:0x05ad, B:187:0x05b7, B:189:0x05c1, B:191:0x05c9, B:196:0x05e0, B:198:0x05ea, B:200:0x05f2, B:99:0x0469, B:102:0x047b, B:105:0x0486, B:144:0x057b, B:147:0x0586, B:231:0x0305, B:232:0x0317, B:234:0x031d, B:237:0x0329, B:240:0x0333, B:243:0x0341, B:250:0x034b, B:252:0x0351, B:16:0x0102, B:18:0x010a, B:20:0x0110, B:21:0x0116, B:23:0x011c, B:25:0x0126, B:27:0x0142, B:31:0x014a, B:129:0x052f, B:132:0x053a), top: B:7:0x0017, inners: #0, #1, #2, #3, #9, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06b5 A[Catch: Exception -> 0x023e, TRY_LEAVE, TryCatch #12 {Exception -> 0x023e, blocks: (B:8:0x0017, B:11:0x0064, B:14:0x00ac, B:33:0x0150, B:35:0x0232, B:36:0x0242, B:38:0x0258, B:39:0x0291, B:42:0x02ad, B:44:0x02c7, B:46:0x02cd, B:47:0x02d3, B:49:0x02d9, B:51:0x02df, B:53:0x02e6, B:56:0x02e9, B:58:0x02ef, B:59:0x02f9, B:61:0x035d, B:63:0x0365, B:66:0x036c, B:68:0x0372, B:69:0x037a, B:71:0x0380, B:74:0x038c, B:77:0x0392, B:97:0x0451, B:106:0x0497, B:127:0x051e, B:133:0x053f, B:135:0x054d, B:137:0x055d, B:138:0x0566, B:172:0x0693, B:174:0x069f, B:175:0x06a9, B:177:0x06b5, B:211:0x0690, B:214:0x0589, B:217:0x0579, B:220:0x053d, B:228:0x048e, B:256:0x0354, B:258:0x025d, B:260:0x0267, B:262:0x026d, B:263:0x0273, B:265:0x0279, B:267:0x028f, B:271:0x014d, B:272:0x00a8, B:273:0x0060, B:149:0x058b, B:207:0x0608, B:183:0x068c, B:155:0x0610, B:157:0x061a, B:159:0x0624, B:161:0x062c, B:163:0x0641, B:164:0x0654, B:166:0x065e, B:168:0x0666, B:170:0x067b, B:185:0x05ad, B:187:0x05b7, B:189:0x05c1, B:191:0x05c9, B:196:0x05e0, B:198:0x05ea, B:200:0x05f2, B:99:0x0469, B:102:0x047b, B:105:0x0486, B:144:0x057b, B:147:0x0586, B:231:0x0305, B:232:0x0317, B:234:0x031d, B:237:0x0329, B:240:0x0333, B:243:0x0341, B:250:0x034b, B:252:0x0351, B:16:0x0102, B:18:0x010a, B:20:0x0110, B:21:0x0116, B:23:0x011c, B:25:0x0126, B:27:0x0142, B:31:0x014a, B:129:0x052f, B:132:0x053a), top: B:7:0x0017, inners: #0, #1, #2, #3, #9, #13 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.c.g a(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 1737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.c.b.a(org.json.JSONObject):com.mbridge.msdk.c.g");
    }

    public final int e() {
        return this.f14645i;
    }

    /* renamed from: com.mbridge.msdk.c.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0149b {

        /* renamed from: a, reason: collision with root package name */
        private String f14671a;
        private JSONArray b;

        /* renamed from: c, reason: collision with root package name */
        private String f14672c;

        /* renamed from: d, reason: collision with root package name */
        private String f14673d;

        /* renamed from: e, reason: collision with root package name */
        private String f14674e;

        /* renamed from: f, reason: collision with root package name */
        private String f14675f;

        public static C0149b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0149b c0149b = new C0149b();
            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            c0149b.f14675f = jSONObject.optString(CampaignEx.JSON_KEY_TITLE, c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_title", "string")));
            c0149b.f14671a = jSONObject.optString("cancel", c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_close_close", "string")));
            c0149b.f14673d = jSONObject.optString("submit", c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_close_submit", "string")));
            c0149b.f14674e = jSONObject.optString("submit_notice", c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_submit_notice", "string")));
            c0149b.f14672c = jSONObject.optString("privacy", c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_privacy_des", "string")));
            JSONArray optJSONArray = jSONObject.optJSONArray(AppLovinEventTypes.USER_VIEWED_CONTENT);
            c0149b.b = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0149b.b = jSONArray;
                jSONArray.put(c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_content_not_play", "string")));
                c0149b.b.put(c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_content_sound_problems", "string")));
                c0149b.b.put(c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_content_misleading", "string")));
                c0149b.b.put(c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_content_fraud", "string")));
                c0149b.b.put(c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_content_por_violence", "string")));
                c0149b.b.put(c9.getString(v.a(c9, "mbridge_cm_feedback_dialog_content_other", "string")));
            }
            return c0149b;
        }

        public final JSONArray b() {
            return this.b;
        }

        public final String c() {
            return this.f14672c;
        }

        public final String d() {
            return this.f14673d;
        }

        public final String e() {
            return this.f14674e;
        }

        public final String f() {
            return this.f14675f;
        }

        public final String a() {
            return this.f14671a;
        }
    }

    public final void e(int i9) {
        this.m = i9;
    }

    public final void e(long j7) {
        this.aM = j7;
    }

    public final void e(boolean z8) {
        this.aE = z8;
    }

    public final String a() {
        return this.f14641e;
    }

    public final void a(int i9) {
        this.f14642f = i9;
    }

    public final void a(long j7) {
        this.f14651q = j7;
    }

    public final void a(String str) {
        this.f14629Q = str;
    }

    public final void a(boolean z8) {
        this.f14655u = z8;
    }
}
