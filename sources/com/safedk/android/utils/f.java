package com.safedk.android.utils;

import android.os.SystemClock;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class f {
    private static final String aM = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)<TAG_NAME>[\\s\\S]*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)<TAG_NAME>(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";
    private static final String e = "RegexFactory";

    /* renamed from: f, reason: collision with root package name */
    private static final String f30029f = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)";

    /* renamed from: g, reason: collision with root package name */
    private static final String f30030g = "(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";

    /* renamed from: h, reason: collision with root package name */
    private static final String f30031h = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)";

    /* renamed from: i, reason: collision with root package name */
    private static final String f30032i = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)";

    /* renamed from: j, reason: collision with root package name */
    private static final String f30033j = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?";

    /* renamed from: k, reason: collision with root package name */
    private static final String f30034k = "(?:\\\\+x3D|%3d|=)";

    /* renamed from: l, reason: collision with root package name */
    private static final String f30035l = "(?:\\\\+x2B|%2b|\\+)";

    /* renamed from: m, reason: collision with root package name */
    private static final String f30036m = "[\\s\\S]*?";

    /* renamed from: n, reason: collision with root package name */
    private static final String f30037n = "(?:%26|\\\\+x26|&)";

    /* renamed from: o, reason: collision with root package name */
    private static final String f30038o = "(?:%24|\\\\+x24|$)";

    /* renamed from: p, reason: collision with root package name */
    private static final String f30039p = "(?:%21|\\\\+x21|!)";

    /* renamed from: q, reason: collision with root package name */
    private static final String f30040q = "(?:%5B|\\\\+x5B|\\[|\\\\n)";

    /* renamed from: r, reason: collision with root package name */
    private static final String f30041r = "(?:%5D|\\\\+x5D|\\])";

    /* renamed from: s, reason: collision with root package name */
    private static final String f30042s = "\\)";

    /* renamed from: t, reason: collision with root package name */
    private static Pattern f30043t = null;

    /* renamed from: u, reason: collision with root package name */
    private static Pattern f30044u = null;

    /* renamed from: v, reason: collision with root package name */
    private static Pattern f30045v = null;
    private static Pattern w = null;
    private static Pattern x = null;

    /* renamed from: y, reason: collision with root package name */
    private static Pattern f30046y = null;

    /* renamed from: z, reason: collision with root package name */
    private static Pattern f30047z = null;
    private static Pattern A = null;
    private static Pattern B = null;
    private static Pattern C = null;
    private static Pattern D = null;
    private static Pattern E = null;
    private static Pattern F = null;
    private static Pattern G = null;
    private static Pattern H = null;
    private static Pattern I = null;
    private static Pattern J = null;
    private static Pattern K = null;
    private static Pattern L = null;
    private static Pattern M = null;
    private static Pattern N = null;
    private static Pattern O = null;
    private static Pattern P = null;
    private static Pattern Q = null;
    private static Pattern R = null;
    private static Pattern S = null;
    private static Pattern T = null;
    private static Pattern U = null;
    private static Pattern V = null;
    private static Pattern W = null;
    private static Pattern X = null;
    private static Pattern Y = null;
    private static Pattern Z = null;
    private static Pattern aa = null;
    private static Pattern ab = null;
    private static Pattern ac = null;
    private static Pattern ad = null;
    private static Pattern ae = null;
    private static Pattern af = null;
    private static Pattern ag = null;
    private static Pattern ah = null;
    private static Pattern ai = null;
    private static Pattern aj = null;
    private static Pattern ak = null;
    private static Pattern al = null;
    private static Pattern am = null;
    private static Pattern an = null;
    private static Pattern ao = null;
    private static Pattern ap = null;
    private static Pattern aq = null;
    private static Pattern ar = null;
    private static Pattern as = null;
    private static Pattern at = null;
    private static Pattern au = null;
    private static Pattern av = null;
    private static Pattern aw = null;
    private static Pattern ax = null;
    private static Pattern ay = null;
    private static Pattern az = null;
    private static Pattern aA = null;
    private static Pattern aB = null;
    private static Pattern aC = null;
    private static Pattern aD = null;
    private static Pattern aE = null;
    private static Pattern aF = null;
    private static Pattern aG = null;
    private static Pattern aH = null;
    private static Pattern aI = null;
    private static Pattern aJ = null;
    private static Pattern aK = null;
    private static Pattern aL = null;
    private static Pattern aN = null;
    private static Pattern aO = null;
    private static Pattern aP = null;
    private static Pattern aQ = null;
    private static Pattern aR = null;
    private static Pattern aS = null;
    private static Pattern aT = null;
    private static Pattern aU = null;
    private static Pattern aV = null;
    private static Pattern aW = null;
    private static Pattern aX = null;
    private static Pattern aY = null;
    private static Pattern aZ = null;
    private static Pattern ba = null;
    private static Pattern bb = null;

    /* renamed from: a, reason: collision with root package name */
    public static Pattern f30026a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Pattern f30027b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Pattern f30028c = null;
    public static Pattern d = null;
    private static Pattern bc = null;
    private static Pattern bd = null;
    private static Pattern be = null;
    private static f bf = null;

    public static f a() {
        return bf;
    }

    public static Pattern b() {
        if (f30027b == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f30027b = Pattern.compile("VAST.*/VAST", 2);
            Logger.d(e, "Regex VAST_FAST_VAST_BLOCK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return f30027b;
    }

    public static Pattern c() {
        if (f30026a == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f30026a = Pattern.compile(a("VAST"), 2);
            Logger.d(e, "Regex VAST_BLOCK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return f30026a;
    }

    public static Pattern d() {
        if (bb == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bb = Pattern.compile(a("Impression"), 2);
            Logger.d(e, "Regex VAST_IMPRESSION_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return bb;
    }

    public static Pattern e() {
        if (ba == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ba = Pattern.compile(a("CompanionClickTracking"), 2);
            Logger.d(e, "Regex VAST_COMPANION_CLICK_TRACKING_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ba;
    }

    public static Pattern f() {
        if (aZ == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aZ = Pattern.compile(a("ClickTracking"), 2);
            Logger.d(e, "Regex VAST_CLICK_TRACKING_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aZ;
    }

    public static Pattern g() {
        if (aY == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aY = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Tracking(?:[\\s]|%20)event(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Tracking(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2);
            Logger.d(e, "Regex VAST_VIDEO_TRACKING_EVENT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aY;
    }

    public static Pattern h() {
        if (aX == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aX = Pattern.compile(a("AdParameters"), 2);
            Logger.d(e, "Regex VAST_AD_PARAMETERS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aX;
    }

    public static Pattern i() {
        if (aW == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aW = Pattern.compile(a("HTMLResource"), 2);
            Logger.d(e, "Regex VAST_HTML_RESOURCE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aW;
    }

    public static Pattern j() {
        if (aV == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aV = Pattern.compile(a("IFrameResource"), 2);
            Logger.d(e, "Regex VAST_IFRAME_RESOURCE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aV;
    }

    public static Pattern k() {
        if (aU == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aU = Pattern.compile(a("StaticResource"), 2);
            Logger.d(e, "Regex VAST_STATIC_RESOURCE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aU;
    }

    public static Pattern l() {
        if (aT == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aT = Pattern.compile(a("YouTubeVideoId"), 2);
            Logger.d(e, "Regex VAST_YOUTUBE_VIDEO initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aT;
    }

    public static Pattern m() {
        if (aS == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aS = Pattern.compile(a("VASTAdTagURI"), 2);
            Logger.d(e, "Regex VAST_VAST_AD_TAG_URI_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aS;
    }

    public static Pattern n() {
        if (aR == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aR = Pattern.compile(a("CompanionClickThrough"), 2);
            Logger.d(e, "Regex VAST_COMPANION_CLICK_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aR;
    }

    public static Pattern o() {
        if (aQ == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aQ = Pattern.compile("(apiFramework(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)VPAID(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|type(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)application/javascript(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2);
            Logger.d(e, "Regex VAST_MEDIA_FILE_PATTERN_JS_APP_ATTRIBUTE initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aQ;
    }

    public static Pattern p() {
        if (aP == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aP = Pattern.compile(aM.replaceFirst("<TAG_NAME>", "MediaFile[^s]").replace("<TAG_NAME>", "MediaFile"), 2);
            Logger.d(e, "Regex VAST_MEDIA_FILE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aP;
    }

    public static Pattern q() {
        if (aO == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aO = Pattern.compile(a("ClickThrough"), 2);
            Logger.d(e, "Regex VAST_CLICK_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms, value = " + aO.toString());
        }
        return aO;
    }

    public static Pattern r() {
        if (aN == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aN = Pattern.compile(a("AdSystem"), 2);
            Logger.d(e, "Regex VAST_AD_SYSTEM_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aN;
    }

    public static Pattern s() {
        if (aL == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aL = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Creative[^s]?(?:id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([0-9]+)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))?.*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Creative(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2);
            Logger.d(e, "Regex VAST_CREATIVE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aL;
    }

    public static Pattern t() {
        if (aK == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aK = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)((.*?)(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34);
            Logger.d(e, "Regex VAST_AD_ID_OPTIONAL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aK;
    }

    public static Pattern u() {
        if (aJ == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aJ = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Ad(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34);
            Logger.d(e, "Regex VAST_AD_ID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aJ;
    }

    public static Pattern v() {
        if (aI == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aI = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Ad(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Ad(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34);
            Logger.d(e, "Regex VAST_AD_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aI;
    }

    public static Pattern w() {
        if (aH == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aH = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:%21|\\\\+x21|!)(?:%5B|\\\\+x5B|\\[|\\\\n)CDATA(?:%5B|\\\\+x5B|\\[|\\\\n)([\\s\\S]*?)(?:%5D|\\\\+x5D|\\])(?:%5D|\\\\+x5D|\\])(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)");
            Logger.d(e, "Regex CDATA_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aH;
    }

    public static Pattern x() {
        if (aG == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aG = Pattern.compile("\\\\+u([0-9a-f]{4})");
            Logger.d(e, "Regex UNICODE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aG;
    }

    public static Pattern y() {
        if (aE == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aE = Pattern.compile("data:([a-zA-Z]*\\/[a-zA-Z1-9]*);?([\\s\\S]*?;)base64,([^\\\"\\')]*)");
            Logger.d(e, "Regex HTML_DATA_RESOURCES_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aE;
    }

    public static Pattern z() {
        if (aD == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aD = Pattern.compile("(https?:\\/\\/.*?).googlevideo.com\\/videoplayback");
            Logger.d(e, "Regex GOOGLE_VIDEO_DOMAIN_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aD;
    }

    public static Pattern A() {
        if (aC == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aC = Pattern.compile("(https?:\\\\*\\/\\\\*\\/.*?)(?:;frame-src|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)|(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)|\\s?(?:%5D|\\\\+x5D|\\]){2})");
            Logger.d(e, "Regex URL_RESOURCES_WITH_SPECIAL_CHARS initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aC;
    }

    public static Pattern B() {
        if (aA == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aA = Pattern.compile("\\\\x3c(?:!DOCTYPE(?:.?))html\\\\x3e(.*?)(\\\\x3c/html\\\\x3e)");
            Logger.d(e, "Regex UNICODE_ENCODED_HTML initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aA;
    }

    public static Pattern C() {
        if (aB == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aB = Pattern.compile("(?s)(<html>.+?</html>)|(%3Chtml%3E.+?%3C/html%3E)");
            Logger.d(e, "Regex HTML_CONTENT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aB;
    }

    public static Pattern D() {
        if (az == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            az = Pattern.compile("((http|https|gmsg)(:|%3A)\\\\*(/|%2F)\\\\*(/|%2F).*?)(?:;frame-src| alt|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)|(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)|(?:%5B|\\\\+x5B|\\[|\\\\n)|(?:%5D|\\\\+x5D|\\])|\\)|[\n\r\t\\x{0001}-\\x{001f}\\x{fffd}])");
            Logger.d(e, "Regex URL_RESOURCES initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return az;
    }

    public static Pattern E() {
        if (ax == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ax = Pattern.compile("video_id(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;):[\\s]*(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
            Logger.d(e, "Regex ADMOB_VIDEOID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ax;
    }

    public static Pattern F() {
        if (aw == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aw = Pattern.compile("creative_id(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;):[\\s]*(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
            Logger.d(e, "Regex ADMOB_CREATIVEID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aw;
    }

    public static Pattern G() {
        if (av == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            av = Pattern.compile("destination_url(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;):[\\s]*(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
            Logger.d(e, "Regex ADMOB_VIDEO_CLICKURL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return av;
    }

    public static Pattern H() {
        if (au == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            au = Pattern.compile("........VAST .*?AdSystem", 32);
            Logger.d(e, "Regex MULTI_VAST_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return au;
    }

    public static Pattern I() {
        if (at == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            at = Pattern.compile("pod.vast", 16);
            Logger.d(e, "Regex POD_VAST_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return at;
    }

    public static Pattern J() {
        if (as == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            as = Pattern.compile("VAST ", 16);
            Logger.d(e, "Regex VAST_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return as;
    }

    public static Pattern K() {
        if (ar == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ar = Pattern.compile("ad_click_dest[\\s].*?=[\\s].*?\\\"([\\S].*?)\\\"");
            Logger.d(e, "Regex MRAID_URL_CLICK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ar;
    }

    public static Pattern L() {
        if (aq == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aq = Pattern.compile("adUnitId='(.*?)'", 2);
            Logger.d(e, "Regex MAX_AD_VIEW_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aq;
    }

    public static Pattern M() {
        if (ap == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ap = Pattern.compile("[0-9]{2,3}\\.[0-9]{2,3}\\.[0-9]{2,3}\\.[0-9]{2,3}");
            Logger.d(e, "Regex IP_ADDRESS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ap;
    }

    public static Pattern N() {
        if (ao == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ao = Pattern.compile("publisher-app-icon\\s?\\{(.*?)background(-image)?:.*?url\\(\"\\s*(?<url>.*?)\"\\s*\\)(.*?)\\}", 34);
            Logger.d(e, "Regex PUBLISHER_APP_ICON_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ao;
    }

    public static Pattern O() {
        if (an == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            an = Pattern.compile("<(?:canvas|svg)\\sclass=\\\\?\\\"(\\S+?)\\send-frame");
            Logger.d(e, "Regex IMAGE_URL_CLASS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return an;
    }

    public static Pattern P() {
        if (am == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            am = Pattern.compile("description[^>]+>\\s*<span[^>]+>([^<]+)");
            Logger.d(e, "Regex DESCRIPTION_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return am;
    }

    public static Pattern Q() {
        if (al == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            al = Pattern.compile("headline[^>]+>\\s*<span[^>]+>([^<]+)");
            Logger.d(e, "Regex HEADLINE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return al;
    }

    public static Pattern R() {
        if (ak == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ak = Pattern.compile("short-app-name[^>]+truncated[^>]+>\\s*<span[^>]+>([^<]+)");
            Logger.d(e, "Regex SHORT_APP_NAME_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ak;
    }

    public static Pattern S() {
        if (aj == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aj = Pattern.compile("<(?:canvas|svg)\\sclass=\\\\?\\\"(\\S+?)\\sendcard-app-icon");
            Logger.d(e, "Regex APP_ICON_CLASS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aj;
    }

    public static Pattern T() {
        if (ai == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ai = Pattern.compile("<div[^>]+podding-card[^>]*>");
            Logger.d(e, "Regex PODDING_CARD_DIV_CLASS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ai;
    }

    public static Pattern U() {
        if (ah == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ah = Pattern.compile("<div[^>]+\\sendcard[\\s>][^>]*>");
            Logger.d(e, "Regex ENDCARD_DIV_CLASS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ah;
    }

    public static Pattern V() {
        if (ag == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ag = Pattern.compile("\\/VAST(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos).+ytimg[^\"]+?\\/([^\\\"\\\\/]{11})\\/[^\"]+(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)");
            Logger.d(e, "Regex YOUTUBE_VIDEO_ID_PATTERN_2 initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ag;
    }

    public static Pattern W() {
        if (af == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            af = Pattern.compile("\\/VAST(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)(?:[^,]+,){6}(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([^\\\"]{11})(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)");
            Logger.d(e, "Regex YOUTUBE_VIDEO_ID_PATTERN_1 initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return af;
    }

    public static Pattern X() {
        if (ae == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ae = Pattern.compile("<meta([^>]+)\\sindex=\\\\?\\\"(\\d)\\\\?\\\"\\sname=\\\\?\\\"video_fields\\\\?\\\">");
            Logger.d(e, "Regex META_VIDEO_FIELDS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ae;
    }

    public static Pattern Y() {
        if (ad == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ad = Pattern.compile("https://www\\.youtube\\.com/watch\\?v(\\\\x3d)(.*?)(\\\\x26)");
            Logger.d(e, "Regex YOUTUBE_VIDEO_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ad;
    }

    public static Pattern Z() {
        if (ac == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ac = Pattern.compile("Clickstring\\+([0-9])=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2);
            Logger.d(e, "Regex CLICK_STRING_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ac;
    }

    public static Pattern aa() {
        if (ab == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ab = Pattern.compile("<img[^>]*src=[\\\"']([^\\\"^']*)(.*)\\/>|image:url((.*))");
            Logger.d(e, "Regex AD_IMAGE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ab;
    }

    public static Pattern ab() {
        if (aa == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aa = Pattern.compile("is_rewarded_html5_playable[^}]*?true");
            Logger.d(e, "Regex PLAYABLE_FLAG_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aa;
    }

    public static Pattern ac() {
        if (Z == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Z = Pattern.compile("survey_payload[\\'\\\"]\\s*:\\s*[\\'\\\"](.*?)[\\'\\\"]");
            Logger.d(e, "Regex SURVEY_TEXT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return Z;
    }

    public static Pattern ad() {
        if (Y == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Y = Pattern.compile("<(?!script|head|link|meta)([a-zA-Z0-9]+)(?:\\s*[^>]*)>([^=\\/\\{\\+]+?)<\\/\\1>");
            Logger.d(e, "Regex INNER_TEXT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return Y;
    }

    public static Pattern ae() {
        if (X == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            X = Pattern.compile("(?<!AdGroup\\+)Creative\\+ID\\+([0-9])=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2);
            Logger.d(e, "Regex CREATIVE_ID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return X;
    }

    public static Pattern af() {
        if (W == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            W = Pattern.compile("AdGroup\\+Creative\\+ID\\+([0-9])=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2);
            Logger.d(e, "Regex ADGROUP_CREATIVE_ID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return W;
    }

    public static Pattern ag() {
        if (U == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            U = Pattern.compile("Landing\\+Page\\+([0-9])=(.*?)&", 2);
            Logger.d(e, "Regex LANDING_PAGE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return U;
    }

    public static Pattern ah() {
        if (V == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            V = Pattern.compile("destinationUrl: (?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
            Logger.d(e, "Regex DESTINATION_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms, value : " + V);
        }
        return V;
    }

    public static Pattern ai() {
        if (T == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            T = Pattern.compile("Creative\\+ID\\+([0-9])", 2);
            Logger.d(e, "Regex MULTIPLE_ADS_COUNT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return T;
    }

    public static Pattern aj() {
        if (Q == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Q = Pattern.compile("(src\\s*=\\s*['\\\"].*?\\/)([A-Za-z0-9]{8}_)(.*?['\\\"\\?])|(url\\(.*?\\/)([A-Za-z0-9]{8}_)(.*?[)\\?])", 2);
            Logger.d(e, "Regex DIRECTSOLD_CONTENT_SRC_REGEX_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return Q;
    }

    public static Pattern ak() {
        if (R == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            R = Pattern.compile("\"URL over\"[ ]href=\"(.*?)\"", 2);
            Logger.d(e, "Regex URL_OVER_HREF_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return R;
    }

    public static Pattern al() {
        if (S == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            S = Pattern.compile("href=\"(.*?)\"", 2);
            Logger.d(e, "Regex BANNER_HREF_CLICK_URL_PATTER initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return S;
    }

    public static Pattern am() {
        if (O == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            O = Pattern.compile("<video .*src=\"(\\S*?)\".*</video>");
            Logger.d(e, "Regex VIDEO_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return O;
    }

    public static Pattern an() {
        if (P == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            P = Pattern.compile("<script .*id=\"ad-context\">(.*?)</script>");
            Logger.d(e, "Regex AD_CONTEXT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return P;
    }

    public static Pattern ao() {
        if (N == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            N = Pattern.compile("<span class=\"banner-description\">(.*?)</span>");
            Logger.d(e, "Regex BANNER_DESCRIPTION initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return N;
    }

    public static Pattern ap() {
        if (M == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            M = Pattern.compile("<span class=\"banner-title\">(.*?)</span>");
            Logger.d(e, "Regex BANNER_TITLE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return M;
    }

    public static Pattern aq() {
        if (L == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            L = Pattern.compile("!--(.*?)--");
            Logger.d(e, "Regex HTML_COMMENT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return L;
    }

    public static Pattern ar() {
        if (J == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            J = Pattern.compile("clickUrl: '([^']+)'");
            Logger.d(e, "Regex PLAYABLE_CLICK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return J;
    }

    public static Pattern as() {
        if (K == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            K = Pattern.compile("(market:[^'\"]+)['\"]");
            Logger.d(e, "Regex MARKET_APP_ID initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return K;
    }

    public static Pattern at() {
        if (f30043t == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f30043t = Pattern.compile("<tns:Ad>([\\s\\S]*?)</tns:Ad>", 2);
            Logger.d(e, "Regex PATTERN_FYBER_VAST_CONTENT initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return f30043t;
    }

    public static Pattern au() {
        if (f30044u == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f30044u = Pattern.compile("<tns:AdNetwork Value=\"(.*?)\" />", 2);
            Logger.d(e, "Regex PATTERN_FYBER_VAST_CONTENT initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return f30044u;
    }

    public static Pattern av() {
        if (f30045v == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f30045v = Pattern.compile("<meta name=\"inneractive-session\" content=\"([\\s\\S]*?)\" \\/>", 2);
            Logger.d(e, "Regex PATTERN_FYBER_HTML_AD_META_SESSION initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return f30045v;
    }

    public static Pattern aw() {
        if (w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            w = Pattern.compile("<meta name=\"inneractive-session\" content=\"([\\s\\S]*?)\" \\/>", 2);
            Logger.d(e, "Regex PATTERN_FYBER_HTML_AD_CONTENT_JS_CSS initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return w;
    }

    public static Pattern ax() {
        if (x == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            x = Pattern.compile("<a.*?id=\"liftoff-link\".*a>", 2);
            Logger.d(e, "Regex LIFTOFF_CLICK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return x;
    }

    public static Pattern ay() {
        if (f30046y == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f30046y = Pattern.compile("videoSrc:%20%22(.*?)%22", 2);
            Logger.d(e, "Regex VIDEO_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return f30046y;
    }

    public static Pattern az() {
        if (f30047z == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f30047z = Pattern.compile("<meta name=\"inneractive-session\" content=\"([\\s\\S]*?)\" \\/>", 2);
            Logger.d(e, "Regex HREF_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return f30047z;
    }

    public static Pattern aA() {
        if (B == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            B = Pattern.compile("^[0-9a-f]*$");
            Logger.d(e, "Regex HASH_FILENAME_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return B;
    }

    public static Pattern aB() {
        if (A == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            A = Pattern.compile("event_payload\".*\"event_pl\":\"(.*?)\"", 34);
            Logger.d(e, "Regex EVENT_PAYLOAD_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return A;
    }

    public static Pattern aC() {
        if (C == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C = Pattern.compile("src=\\\\?\"([^\\\\\"]+)");
            Logger.d(e, "Regex SRC_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return C;
    }

    public static Pattern aD() {
        if (D == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            D = Pattern.compile("&lt;(img|IMG) (src|SRC)=&quot;(.*?)&quot;?(.*?)( style| STYLE|&gt;)");
            Logger.d(e, "Regex MRAID_IMG initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return D;
    }

    public static Pattern aE() {
        if (E == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            E = Pattern.compile("&lt;(a|A) (href|HREF)=&quot;(.*?)&quot;(&gt;| )");
            Logger.d(e, "Regex MRAID_ANCHOR_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return E;
    }

    public static Pattern aF() {
        if (F == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            F = Pattern.compile("pinpoint_url\\\":\\\"([^\\\"]+)\"");
            Logger.d(e, "Regex LIFTOFF_PINPOINT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return F;
    }

    public static Pattern aG() {
        if (G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            G = Pattern.compile("click_config\\\":\\{\\\"clickthrough_url\\\":\\{\\\"url\\\":\\\"([^\\\"]+)\\\"");
            Logger.d(e, "Regex LIFTOFF_CLICKTHROUGH_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return G;
    }

    public static Pattern aH() {
        if (I == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            I = Pattern.compile("\\{\\\"clickURLs\\\":\\{\\\"clickthroughURL\\\":\\{\\\"url\\\":\\\"([^\\\"]+)\\\"");
            Logger.d(e, "Regex LIFTOFF_PINPOINT_OUTER_ENV_CLICK_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return I;
    }

    public static Pattern aI() {
        if (H == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            H = Pattern.compile("bidBundle\\\":\\\"([^\\\"]+)\\\"");
            Logger.d(e, "Regex LIFTOFF_BIDBUNDLE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return H;
    }

    public static String a(String str) {
        return aM.replace("<TAG_NAME>", str);
    }

    public static Pattern aJ() {
        if (f30028c == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f30028c = Pattern.compile("trackingUrl = (\\'|\\\\\\\"|\\\")(.*?)(\\'|\\\\\\\"|\\\")(;| \\+)", 2);
            Logger.d(e, "Regex APPLOVIN_MRAID_CLICK_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return f30028c;
    }

    public static Pattern aK() {
        if (bc == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bc = Pattern.compile("OMG\\s+=\\s+.+\"clickUrl\".+?\"(.+?)\"");
            Logger.d(e, "Regex MINTEGRAL_DSP_MULTI_CLICK_URL initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return bc;
    }

    public static Pattern aL() {
        if (bd == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bd = Pattern.compile("OMG\\s+=.*config\\\\\".?\\\\\"(.*?)\\\\\"");
            Logger.d(e, "Regex MINTEGRAL_MOREOFFER_CONFIG initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return bd;
    }

    public static Pattern aM() {
        if (be == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            be = Pattern.compile("\"(<.*>)");
            Logger.d(e, "Regex HTML_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return be;
    }

    public static Pattern aN() {
        if (aF == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aF = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)a .*?href(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)");
            Logger.d(e, "Regex HTML_ANCHOR_REF_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return aF;
    }

    public static Pattern aO() {
        if (ay == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ay = Pattern.compile("encrypted-tbn\\d*\\.gstatic.com/shopping\\?q");
            Logger.d(e, "Regex ADMOB_SHOPPING_COLLAGE_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return ay;
    }

    public static Pattern aP() {
        if (d == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d = Pattern.compile("\\\"clcode\\\":\\\"(\\S*?)\\\"");
            Logger.d(e, "Regex APPLOVIN_CLCODE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        }
        return d;
    }
}
