package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class n {
    public static int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f13247b;
    private String A;
    private String B;
    private String C;
    private String D;
    private int E;
    private String F;
    private String G;
    private String I;
    private String J;
    private String K;
    private int L;
    private long M;
    private String N;
    private int O;

    /* renamed from: d, reason: collision with root package name */
    private String f13249d;

    /* renamed from: e, reason: collision with root package name */
    private int f13250e;

    /* renamed from: g, reason: collision with root package name */
    private int f13252g;

    /* renamed from: h, reason: collision with root package name */
    private String f13253h;

    /* renamed from: i, reason: collision with root package name */
    private String f13254i;

    /* renamed from: j, reason: collision with root package name */
    private String f13255j;

    /* renamed from: k, reason: collision with root package name */
    private String f13256k;

    /* renamed from: l, reason: collision with root package name */
    private String f13257l;

    /* renamed from: m, reason: collision with root package name */
    private String f13258m;

    /* renamed from: n, reason: collision with root package name */
    private String f13259n;

    /* renamed from: o, reason: collision with root package name */
    private String f13260o;

    /* renamed from: p, reason: collision with root package name */
    private String f13261p;

    /* renamed from: q, reason: collision with root package name */
    private String f13262q;

    /* renamed from: r, reason: collision with root package name */
    private int f13263r;

    /* renamed from: s, reason: collision with root package name */
    private String f13264s;

    /* renamed from: t, reason: collision with root package name */
    private String f13265t;
    private String u;

    /* renamed from: w, reason: collision with root package name */
    private int f13267w;

    /* renamed from: x, reason: collision with root package name */
    private String f13268x;

    /* renamed from: y, reason: collision with root package name */
    private String f13269y;

    /* renamed from: z, reason: collision with root package name */
    private String f13270z;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f13248c = null;

    /* renamed from: f, reason: collision with root package name */
    private int f13251f = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f13266v = 0;
    private int H = 0;

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f13264s = str;
        this.f13267w = i10;
        this.f13268x = str5;
        this.f13263r = i11;
        this.O = i12;
        this.L = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f13269y = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        this.f13270z = str3;
        this.E = i14;
        this.f13256k = str4;
        this.M = i15;
    }

    public static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (next.C != null) {
                stringBuffer.append("resource_type=" + next.C + "&");
            }
            if (next.f13254i != null) {
                stringBuffer.append("creative=" + next.f13254i + "&");
            }
            Iterator<n> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), next.f13264s, "&", stringBuffer, "network_type="), next.f13267w, "&", stringBuffer, "network_str="), next.f13268x, "&", stringBuffer, "result="), next.E, "&", stringBuffer, "duration="), next.f13256k, "&", stringBuffer, "video_size=");
                j3.append(next.M);
                j3.append("&");
                stringBuffer.append(j3.toString());
                StringBuilder i10 = com.applovin.impl.mediation.ads.e.i(new StringBuilder("video_length="), next.L, "&", stringBuffer, "reason=");
                i10.append(next.h());
                i10.append("&");
                stringBuffer.append(i10.toString());
                StringBuilder j10 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("cid="), next.f13253h, "&", stringBuffer, "video_url="), next.N, "&", stringBuffer, "rid="), next.A, "&", stringBuffer, "rid_n="), next.B, "&", stringBuffer, "unit_id="), next.K, "&", stringBuffer, "offer_url=");
                j10.append(next.f13269y);
                stringBuffer.append(j10.toString());
                stringBuffer.append("\n");
            } else {
                StringBuilder j11 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), next.f13264s, "&", stringBuffer, "result="), next.E, "&", stringBuffer, "duration="), next.f13256k, "&", stringBuffer, "video_size=");
                j11.append(next.M);
                j11.append("&");
                stringBuffer.append(j11.toString());
                StringBuilder i11 = com.applovin.impl.mediation.ads.e.i(new StringBuilder("video_length="), next.L, "&", stringBuffer, "reason=");
                i11.append(next.h());
                i11.append("&");
                stringBuffer.append(i11.toString());
                StringBuilder j12 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("cid="), next.f13253h, "&", stringBuffer, "video_url="), next.N, "&", stringBuffer, "rid="), next.A, "&", stringBuffer, "rid_n="), next.B, "&", stringBuffer, "unit_id="), next.K, "&", stringBuffer, "offer_url=");
                j12.append(next.f13269y);
                stringBuffer.append(j12.toString());
                stringBuffer.append("\n");
            }
            it = it2;
        }
        return stringBuffer.toString();
    }

    public static String b(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "result="), nVar.E, "&", stringBuffer, "duration="), nVar.f13256k, "&", stringBuffer, "endcard_url="), nVar.f13258m, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "unit_id="), nVar.K, "&", stringBuffer, "reason=");
            j3.append(nVar.h());
            j3.append("&");
            stringBuffer.append(j3.toString());
            StringBuilder j10 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("ad_type="), nVar.f13249d, "&", stringBuffer, "rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "type="), nVar.f13257l, "&", stringBuffer, "adspace_t=");
            j10.append(nVar.f13250e);
            stringBuffer.append(j10.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static String c(List<n> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().f13261p);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th2) {
            ad.b("VideoReportData", th2.getMessage(), th2);
            return null;
        }
    }

    public static String d(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "network_type="), nVar.f13267w, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "image_url="), nVar.f13262q, "&", stringBuffer, "reason=");
                j3.append(nVar.h());
                j3.append("&");
                stringBuffer.append(j3.toString());
                StringBuilder j10 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "unit_id=");
                j10.append(nVar.K);
                j10.append("&");
                stringBuffer.append(j10.toString());
                stringBuffer.append("\n");
            } else {
                StringBuilder j11 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "image_url="), nVar.f13262q, "&", stringBuffer, "reason=");
                j11.append(nVar.h());
                j11.append("&");
                stringBuffer.append(j11.toString());
                StringBuilder j12 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "unit_id=");
                j12.append(nVar.K);
                j12.append("&");
                stringBuffer.append(j12.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String e(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "network_type="), nVar.f13267w, "&", stringBuffer, "network_str="), nVar.f13268x, "&", stringBuffer, "reason=");
                j3.append(nVar.h());
                j3.append("&");
                stringBuffer.append(j3.toString());
                StringBuilder j10 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("cid="), nVar.f13253h, "&", stringBuffer, "video_url="), nVar.N, "&", stringBuffer, "rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "unit_id="), nVar.K, "&", stringBuffer, "offer_url=");
                j10.append(nVar.f13269y);
                stringBuffer.append(j10.toString());
                stringBuffer.append("\n");
            } else {
                StringBuilder j11 = com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "reason=");
                j11.append(nVar.h());
                j11.append("&");
                stringBuffer.append(j11.toString());
                StringBuilder j12 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("cid="), nVar.f13253h, "&", stringBuffer, "video_url="), nVar.N, "&", stringBuffer, "rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "unit_id="), nVar.K, "&", stringBuffer, "offer_url=");
                j12.append(nVar.f13269y);
                stringBuffer.append(j12.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String f(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "unit_id="), nVar.K, "&", stringBuffer, "network_type="), nVar.f13267w, "&", stringBuffer, "mraid_type="), nVar.f13266v, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "rid=");
        j3.append(nVar.A);
        stringBuffer.append(j3.toString());
        return stringBuffer.toString();
    }

    public static String g(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "result="), nVar.E, "&", stringBuffer, "duration="), nVar.f13256k, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "reason=");
        j3.append(nVar.h());
        j3.append("&");
        stringBuffer.append(j3.toString());
        StringBuilder i10 = com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("ad_type="), nVar.f13249d, "&", stringBuffer, "unit_id="), nVar.K, "&", stringBuffer, "devid="), nVar.f13255j, "&", stringBuffer, "mraid_type="), nVar.f13266v, "&", stringBuffer, "network_type=");
        i10.append(nVar.f13267w);
        i10.append("&");
        stringBuffer.append(i10.toString());
        if (!TextUtils.isEmpty(nVar.f13258m)) {
            stringBuffer.append("endcard_url=" + nVar.f13258m + "&");
        }
        if (!TextUtils.isEmpty(nVar.f13257l)) {
            stringBuffer.append("type=" + nVar.f13257l + "&");
        }
        if (nVar.C != null) {
            stringBuffer.append("resource_type=" + nVar.C + "&");
        }
        StringBuilder j10 = com.applovin.impl.mediation.ads.e.j(new StringBuilder("rid_n="), nVar.B, "&", stringBuffer, "rid=");
        j10.append(nVar.A);
        stringBuffer.append(j10.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public static String h(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f13264s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f13259n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f13253h) + "&");
                stringBuffer.append("network_str=" + nVar.f13268x + "&");
                StringBuilder sb2 = new StringBuilder("network_type=");
                sb2.append(nVar.f13267w);
                stringBuffer.append(sb2.toString());
            } else {
                stringBuffer.append("key=" + nVar.f13264s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f13259n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f13253h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final int A() {
        return this.H;
    }

    public final String i() {
        return this.f13254i;
    }

    public final String j() {
        return this.f13255j;
    }

    public final int k() {
        return this.f13267w;
    }

    public final String l() {
        return this.f13268x;
    }

    public final int m() {
        return this.E;
    }

    public final String n() {
        return this.f13256k;
    }

    public final long o() {
        return this.M;
    }

    public final int p() {
        return this.L;
    }

    public final String q() {
        return this.N;
    }

    public final String r() {
        return this.f13269y;
    }

    public final String s() {
        return this.f13258m;
    }

    public final String t() {
        return this.f13257l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RewardReportData [key=");
        sb2.append(this.f13264s);
        sb2.append(", networkType=");
        sb2.append(this.f13267w);
        sb2.append(", isCompleteView=");
        sb2.append(this.f13263r);
        sb2.append(", watchedMillis=");
        sb2.append(this.O);
        sb2.append(", videoLength=");
        sb2.append(this.L);
        sb2.append(", offerUrl=");
        sb2.append(this.f13269y);
        sb2.append(", reason=");
        sb2.append(this.f13270z);
        sb2.append(", result=");
        sb2.append(this.E);
        sb2.append(", duration=");
        sb2.append(this.f13256k);
        sb2.append(", videoSize=");
        return a4.j.j(sb2, this.M, "]");
    }

    public final int u() {
        return this.f13250e;
    }

    public final String v() {
        return this.f13262q;
    }

    public final int w() {
        return this.f13263r;
    }

    public final int x() {
        return this.O;
    }

    public final int y() {
        return this.f13266v;
    }

    public final String z() {
        return this.I;
    }

    public final void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13254i = URLEncoder.encode(str);
    }

    public final void j(String str) {
        this.f13255j = str;
    }

    public final void k(String str) {
        this.f13268x = str;
    }

    public final void l(String str) {
        this.f13256k = str;
    }

    public final void m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.N = URLEncoder.encode(str, "utf-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f13258m = URLEncoder.encode(str, "utf-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void o(String str) {
        this.f13257l = str;
    }

    public final void p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f13262q = URLEncoder.encode(str, "utf-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void q(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.I = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
    }

    public final void r(String str) {
        this.f13259n = str;
    }

    public final void s(String str) {
        this.u = str;
    }

    public final void t(String str) {
        this.D = str;
    }

    public final void u(String str) {
        this.F = str;
    }

    public final void v(String str) {
        this.G = str;
    }

    public static String c(n nVar) {
        if (nVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "unit_id="), nVar.K, "&", stringBuffer, "reason=");
        j3.append(nVar.h());
        j3.append("&");
        stringBuffer.append(j3.toString());
        StringBuilder i10 = com.applovin.impl.mediation.ads.e.i(new StringBuilder("case="), nVar.f13252g, "&", stringBuffer, "network_type=");
        i10.append(nVar.f13267w);
        stringBuffer.append(i10.toString());
        return stringBuffer.toString();
    }

    public n() {
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f13264s = str;
        this.f13268x = str4;
        this.f13267w = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f13269y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        this.f13270z = str3;
    }

    public final String h() {
        return TextUtils.isEmpty(this.f13270z) ? "" : this.f13270z;
    }

    public final void h(String str) {
        this.f13270z = str;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f13264s = str;
        this.f13267w = i10;
        this.f13268x = str4;
        this.L = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f13269y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        this.E = i12;
        this.f13256k = str3;
        this.M = i13;
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j3, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f13264s = "m_download_end";
        } else if (i11 == 95) {
            this.f13264s = "2000025";
        }
        int l10 = z.l(context);
        this.f13267w = l10;
        this.f13268x = z.a(context, l10);
        this.L = campaignEx.getVideoLength();
        this.A = campaignEx.getRequestId();
        this.B = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f13269y)) {
            try {
                this.f13269y = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        this.E = i10;
        this.f13256k = str;
        this.M = j3 == 0 ? campaignEx.getVideoSize() : j3;
    }

    public static String f(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "network_type="), nVar.f13267w, "&", stringBuffer, "result="), nVar.E, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "template_url="), nVar.I, "&", stringBuffer, "reason=");
                j3.append(nVar.h());
                j3.append("&");
                stringBuffer.append(j3.toString());
                StringBuilder j10 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "unit_id=");
                j10.append(nVar.K);
                j10.append("&");
                stringBuffer.append(j10.toString());
                stringBuffer.append("\n");
            } else {
                StringBuilder j11 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "result="), nVar.E, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "template_url="), nVar.I, "&", stringBuffer, "reason=");
                j11.append(nVar.h());
                j11.append("&");
                stringBuffer.append(j11.toString());
                StringBuilder j12 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "unit_id=");
                j12.append(nVar.K);
                j12.append("&");
                stringBuffer.append(j12.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public final String c() {
        return this.K;
    }

    public final void c(String str) {
        this.K = str;
    }

    public final void c(int i10) {
        this.f13250e = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f13264s = str;
        this.f13260o = str2;
        this.J = str3;
        this.f13265t = str4;
        this.K = str5;
        this.f13253h = str6;
        this.f13267w = i10;
        this.f13268x = str7;
    }

    public n(String str) {
        this.f13261p = str;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f13264s = str;
        this.E = i10;
        this.f13256k = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f13258m = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        this.f13253h = str4;
        this.K = str5;
        this.f13270z = str6;
        this.f13257l = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.K) {
            this.E = 2;
        }
    }

    public static String b(n nVar) {
        if (nVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder i10 = com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "unit_id="), nVar.K, "&", stringBuffer, "network_type="), nVar.f13267w, "&", stringBuffer, "mraid_type=");
        i10.append(nVar.f13266v);
        i10.append("&");
        stringBuffer.append(i10.toString());
        stringBuffer.append("platform=1");
        return stringBuffer.toString();
    }

    public final String g() {
        return this.B;
    }

    public final void g(String str) {
        this.B = str;
    }

    public static String d(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "unit_id="), nVar.K, "&", stringBuffer, "network_type="), nVar.f13267w, "&", stringBuffer, "rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "reason=");
        j3.append(nVar.h());
        stringBuffer.append(j3.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f13264s = str;
        this.f13253h = str2;
        this.A = str3;
        this.B = str4;
        this.K = str5;
        this.f13267w = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f13264s = str;
        this.f13253h = str2;
        this.A = str3;
        this.B = str4;
        this.K = str5;
        this.f13267w = i10;
        this.f13270z = str6;
        this.f13252g = i11;
    }

    public static String e(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder j3 = com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(new StringBuilder("key="), nVar.f13264s, "&", stringBuffer, "result="), nVar.E, "&", stringBuffer, "duration="), nVar.f13256k, "&", stringBuffer, "cid="), nVar.f13253h, "&", stringBuffer, "unit_id="), nVar.K, "&", stringBuffer, "reason=");
        j3.append(nVar.h());
        j3.append("&");
        stringBuffer.append(j3.toString());
        StringBuilder i10 = com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.i(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(com.applovin.impl.mediation.ads.e.j(new StringBuilder("ad_type="), nVar.f13249d, "&", stringBuffer, "rid="), nVar.A, "&", stringBuffer, "rid_n="), nVar.B, "&", stringBuffer, "network_type="), nVar.f13267w, "&", stringBuffer, "mraid_type="), nVar.f13266v, "&", stringBuffer, "devid=");
        i10.append(nVar.f13255j);
        i10.append("&");
        stringBuffer.append(i10.toString());
        if (nVar.C != null) {
            stringBuffer.append("resource_type=" + nVar.C + "&");
        }
        if (!TextUtils.isEmpty(nVar.f13258m)) {
            stringBuffer.append("endcard_url=" + nVar.f13258m + "&");
        }
        stringBuffer.append("type=" + nVar.f13257l);
        return stringBuffer.toString();
    }

    public final String b() {
        return this.C;
    }

    public final void b(String str) {
        this.C = str;
    }

    public final void b(int i10) {
        this.E = i10;
    }

    public final String b(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f13248c) == null) {
            return str2;
        }
        try {
            String str3 = map.get(str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    public final String d() {
        return this.f13249d;
    }

    public final void d(String str) {
        this.f13249d = str;
    }

    public final void d(int i10) {
        this.f13266v = i10;
    }

    public final String f() {
        return this.A;
    }

    public final void f(String str) {
        this.A = str;
    }

    public static String a(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f13264s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f13260o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f13265t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f13253h) + "&");
                stringBuffer.append("network_str=" + nVar.f13268x + "&");
                StringBuilder sb2 = new StringBuilder("network_type=");
                sb2.append(nVar.f13267w);
                stringBuffer.append(sb2.toString());
            } else {
                stringBuffer.append("key=" + nVar.f13264s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f13260o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f13265t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f13253h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String a() {
        return this.f13264s;
    }

    public final void a(String str) {
        this.f13264s = str;
    }

    public final void a(int i10) {
        this.f13267w = i10;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f13248c == null) {
            this.f13248c = new HashMap();
        }
        try {
            this.f13248c.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public final String e() {
        return this.f13253h;
    }

    public final void e(String str) {
        this.f13253h = str;
    }

    public final void e(int i10) {
        this.H = i10;
    }
}
