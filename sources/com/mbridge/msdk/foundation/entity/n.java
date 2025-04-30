package com.mbridge.msdk.foundation.entity;

import Q7.n0;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.L;
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

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static int f15616a = 1;
    public static int b;

    /* renamed from: A, reason: collision with root package name */
    private String f15617A;

    /* renamed from: B, reason: collision with root package name */
    private String f15618B;

    /* renamed from: C, reason: collision with root package name */
    private String f15619C;

    /* renamed from: D, reason: collision with root package name */
    private String f15620D;

    /* renamed from: E, reason: collision with root package name */
    private int f15621E;

    /* renamed from: F, reason: collision with root package name */
    private String f15622F;

    /* renamed from: G, reason: collision with root package name */
    private String f15623G;

    /* renamed from: I, reason: collision with root package name */
    private String f15625I;

    /* renamed from: J, reason: collision with root package name */
    private String f15626J;

    /* renamed from: K, reason: collision with root package name */
    private String f15627K;

    /* renamed from: L, reason: collision with root package name */
    private int f15628L;

    /* renamed from: M, reason: collision with root package name */
    private long f15629M;

    /* renamed from: N, reason: collision with root package name */
    private String f15630N;
    private int O;

    /* renamed from: d, reason: collision with root package name */
    private String f15632d;

    /* renamed from: e, reason: collision with root package name */
    private int f15633e;

    /* renamed from: g, reason: collision with root package name */
    private int f15635g;

    /* renamed from: h, reason: collision with root package name */
    private String f15636h;

    /* renamed from: i, reason: collision with root package name */
    private String f15637i;

    /* renamed from: j, reason: collision with root package name */
    private String f15638j;

    /* renamed from: k, reason: collision with root package name */
    private String f15639k;
    private String l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private String f15640n;

    /* renamed from: o, reason: collision with root package name */
    private String f15641o;

    /* renamed from: p, reason: collision with root package name */
    private String f15642p;

    /* renamed from: q, reason: collision with root package name */
    private String f15643q;

    /* renamed from: r, reason: collision with root package name */
    private int f15644r;

    /* renamed from: s, reason: collision with root package name */
    private String f15645s;

    /* renamed from: t, reason: collision with root package name */
    private String f15646t;

    /* renamed from: u, reason: collision with root package name */
    private String f15647u;

    /* renamed from: w, reason: collision with root package name */
    private int f15649w;

    /* renamed from: x, reason: collision with root package name */
    private String f15650x;

    /* renamed from: y, reason: collision with root package name */
    private String f15651y;

    /* renamed from: z, reason: collision with root package name */
    private String f15652z;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f15631c = null;

    /* renamed from: f, reason: collision with root package name */
    private int f15634f = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f15648v = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f15624H = 0;

    public n(String str, int i9, int i10, int i11, int i12, String str2, String str3, int i13, String str4, int i14, String str5) {
        this.f15645s = str;
        this.f15649w = i9;
        this.f15650x = str5;
        this.f15644r = i10;
        this.O = i11;
        this.f15628L = i12;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f15651y = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
        }
        this.f15652z = str3;
        this.f15621E = i13;
        this.f15639k = str4;
        this.f15629M = i14;
    }

    public static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (next.f15619C != null) {
                stringBuffer.append("resource_type=" + next.f15619C + "&");
            }
            if (next.f15637i != null) {
                stringBuffer.append("creative=" + next.f15637i + "&");
            }
            Iterator<n> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                StringBuilder p2 = o.p(L.l(o.p(L.l(o.p(new StringBuilder("key="), next.f15645s, "&", stringBuffer, "network_type="), next.f15649w, "&", stringBuffer, "network_str="), next.f15650x, "&", stringBuffer, "result="), next.f15621E, "&", stringBuffer, "duration="), next.f15639k, "&", stringBuffer, "video_size=");
                p2.append(next.f15629M);
                p2.append("&");
                stringBuffer.append(p2.toString());
                StringBuilder l = L.l(new StringBuilder("video_length="), next.f15628L, "&", stringBuffer, "reason=");
                l.append(next.h());
                l.append("&");
                stringBuffer.append(l.toString());
                StringBuilder p7 = o.p(o.p(o.p(o.p(o.p(new StringBuilder("cid="), next.f15636h, "&", stringBuffer, "video_url="), next.f15630N, "&", stringBuffer, "rid="), next.f15617A, "&", stringBuffer, "rid_n="), next.f15618B, "&", stringBuffer, "unit_id="), next.f15627K, "&", stringBuffer, "offer_url=");
                p7.append(next.f15651y);
                stringBuffer.append(p7.toString());
                stringBuffer.append("\n");
            } else {
                StringBuilder p9 = o.p(L.l(o.p(new StringBuilder("key="), next.f15645s, "&", stringBuffer, "result="), next.f15621E, "&", stringBuffer, "duration="), next.f15639k, "&", stringBuffer, "video_size=");
                p9.append(next.f15629M);
                p9.append("&");
                stringBuffer.append(p9.toString());
                StringBuilder l2 = L.l(new StringBuilder("video_length="), next.f15628L, "&", stringBuffer, "reason=");
                l2.append(next.h());
                l2.append("&");
                stringBuffer.append(l2.toString());
                StringBuilder p10 = o.p(o.p(o.p(o.p(o.p(new StringBuilder("cid="), next.f15636h, "&", stringBuffer, "video_url="), next.f15630N, "&", stringBuffer, "rid="), next.f15617A, "&", stringBuffer, "rid_n="), next.f15618B, "&", stringBuffer, "unit_id="), next.f15627K, "&", stringBuffer, "offer_url=");
                p10.append(next.f15651y);
                stringBuffer.append(p10.toString());
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
            StringBuilder p2 = o.p(o.p(o.p(o.p(L.l(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "result="), nVar.f15621E, "&", stringBuffer, "duration="), nVar.f15639k, "&", stringBuffer, "endcard_url="), nVar.m, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "unit_id="), nVar.f15627K, "&", stringBuffer, "reason=");
            p2.append(nVar.h());
            p2.append("&");
            stringBuffer.append(p2.toString());
            StringBuilder p7 = o.p(o.p(o.p(o.p(new StringBuilder("ad_type="), nVar.f15632d, "&", stringBuffer, "rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "type="), nVar.l, "&", stringBuffer, "adspace_t=");
            p7.append(nVar.f15633e);
            stringBuffer.append(p7.toString());
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
                stringBuffer.append(it.next().f15642p);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            ad.b("VideoReportData", th.getMessage(), th);
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
                StringBuilder p2 = o.p(o.p(L.l(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "network_type="), nVar.f15649w, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "image_url="), nVar.f15643q, "&", stringBuffer, "reason=");
                p2.append(nVar.h());
                p2.append("&");
                stringBuffer.append(p2.toString());
                StringBuilder p7 = o.p(o.p(new StringBuilder("rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "unit_id=");
                p7.append(nVar.f15627K);
                p7.append("&");
                stringBuffer.append(p7.toString());
                stringBuffer.append("\n");
            } else {
                StringBuilder p9 = o.p(o.p(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "image_url="), nVar.f15643q, "&", stringBuffer, "reason=");
                p9.append(nVar.h());
                p9.append("&");
                stringBuffer.append(p9.toString());
                StringBuilder p10 = o.p(o.p(new StringBuilder("rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "unit_id=");
                p10.append(nVar.f15627K);
                p10.append("&");
                stringBuffer.append(p10.toString());
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
                StringBuilder p2 = o.p(L.l(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "network_type="), nVar.f15649w, "&", stringBuffer, "network_str="), nVar.f15650x, "&", stringBuffer, "reason=");
                p2.append(nVar.h());
                p2.append("&");
                stringBuffer.append(p2.toString());
                StringBuilder p7 = o.p(o.p(o.p(o.p(o.p(new StringBuilder("cid="), nVar.f15636h, "&", stringBuffer, "video_url="), nVar.f15630N, "&", stringBuffer, "rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "unit_id="), nVar.f15627K, "&", stringBuffer, "offer_url=");
                p7.append(nVar.f15651y);
                stringBuffer.append(p7.toString());
                stringBuffer.append("\n");
            } else {
                StringBuilder p9 = o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "reason=");
                p9.append(nVar.h());
                p9.append("&");
                stringBuffer.append(p9.toString());
                StringBuilder p10 = o.p(o.p(o.p(o.p(o.p(new StringBuilder("cid="), nVar.f15636h, "&", stringBuffer, "video_url="), nVar.f15630N, "&", stringBuffer, "rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "unit_id="), nVar.f15627K, "&", stringBuffer, "offer_url=");
                p10.append(nVar.f15651y);
                stringBuffer.append(p10.toString());
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
        StringBuilder p2 = o.p(L.l(L.l(o.p(o.p(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "unit_id="), nVar.f15627K, "&", stringBuffer, "network_type="), nVar.f15649w, "&", stringBuffer, "mraid_type="), nVar.f15648v, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "rid=");
        p2.append(nVar.f15617A);
        stringBuffer.append(p2.toString());
        return stringBuffer.toString();
    }

    public static String g(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder p2 = o.p(o.p(L.l(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "result="), nVar.f15621E, "&", stringBuffer, "duration="), nVar.f15639k, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "reason=");
        p2.append(nVar.h());
        p2.append("&");
        stringBuffer.append(p2.toString());
        StringBuilder l = L.l(o.p(o.p(o.p(new StringBuilder("ad_type="), nVar.f15632d, "&", stringBuffer, "unit_id="), nVar.f15627K, "&", stringBuffer, "devid="), nVar.f15638j, "&", stringBuffer, "mraid_type="), nVar.f15648v, "&", stringBuffer, "network_type=");
        l.append(nVar.f15649w);
        l.append("&");
        stringBuffer.append(l.toString());
        if (!TextUtils.isEmpty(nVar.m)) {
            stringBuffer.append("endcard_url=" + nVar.m + "&");
        }
        if (!TextUtils.isEmpty(nVar.l)) {
            stringBuffer.append("type=" + nVar.l + "&");
        }
        if (nVar.f15619C != null) {
            stringBuffer.append("resource_type=" + nVar.f15619C + "&");
        }
        StringBuilder p7 = o.p(new StringBuilder("rid_n="), nVar.f15618B, "&", stringBuffer, "rid=");
        p7.append(nVar.f15617A);
        stringBuffer.append(p7.toString());
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
                stringBuffer.append("key=" + nVar.f15645s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f15640n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f15625I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f15627K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f15636h) + "&");
                stringBuffer.append("network_str=" + nVar.f15650x + "&");
                StringBuilder sb = new StringBuilder("network_type=");
                sb.append(nVar.f15649w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f15645s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f15640n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f15625I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f15627K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f15636h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public final int A() {
        return this.f15624H;
    }

    public final String i() {
        return this.f15637i;
    }

    public final String j() {
        return this.f15638j;
    }

    public final int k() {
        return this.f15649w;
    }

    public final String l() {
        return this.f15650x;
    }

    public final int m() {
        return this.f15621E;
    }

    public final String n() {
        return this.f15639k;
    }

    public final long o() {
        return this.f15629M;
    }

    public final int p() {
        return this.f15628L;
    }

    public final String q() {
        return this.f15630N;
    }

    public final String r() {
        return this.f15651y;
    }

    public final String s() {
        return this.m;
    }

    public final String t() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardReportData [key=");
        sb.append(this.f15645s);
        sb.append(", networkType=");
        sb.append(this.f15649w);
        sb.append(", isCompleteView=");
        sb.append(this.f15644r);
        sb.append(", watchedMillis=");
        sb.append(this.O);
        sb.append(", videoLength=");
        sb.append(this.f15628L);
        sb.append(", offerUrl=");
        sb.append(this.f15651y);
        sb.append(", reason=");
        sb.append(this.f15652z);
        sb.append(", result=");
        sb.append(this.f15621E);
        sb.append(", duration=");
        sb.append(this.f15639k);
        sb.append(", videoSize=");
        return n0.k(sb, this.f15629M, "]");
    }

    public final int u() {
        return this.f15633e;
    }

    public final String v() {
        return this.f15643q;
    }

    public final int w() {
        return this.f15644r;
    }

    public final int x() {
        return this.O;
    }

    public final int y() {
        return this.f15648v;
    }

    public final String z() {
        return this.f15625I;
    }

    public final void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15637i = URLEncoder.encode(str);
    }

    public final void j(String str) {
        this.f15638j = str;
    }

    public final void k(String str) {
        this.f15650x = str;
    }

    public final void l(String str) {
        this.f15639k = str;
    }

    public final void m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f15630N = URLEncoder.encode(str, "utf-8");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.m = URLEncoder.encode(str, "utf-8");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void o(String str) {
        this.l = str;
    }

    public final void p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f15643q = URLEncoder.encode(str, "utf-8");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void q(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f15625I = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
        }
    }

    public final void r(String str) {
        this.f15640n = str;
    }

    public final void s(String str) {
        this.f15647u = str;
    }

    public final void t(String str) {
        this.f15620D = str;
    }

    public final void u(String str) {
        this.f15622F = str;
    }

    public final void v(String str) {
        this.f15623G = str;
    }

    public static String c(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder p2 = o.p(o.p(o.p(o.p(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "unit_id="), nVar.f15627K, "&", stringBuffer, "reason=");
            p2.append(nVar.h());
            p2.append("&");
            stringBuffer.append(p2.toString());
            StringBuilder l = L.l(new StringBuilder("case="), nVar.f15635g, "&", stringBuffer, "network_type=");
            l.append(nVar.f15649w);
            stringBuffer.append(l.toString());
            return stringBuffer.toString();
        }
        return "";
    }

    public n() {
    }

    public n(String str, int i9, String str2, String str3, String str4) {
        this.f15645s = str;
        this.f15650x = str4;
        this.f15649w = i9;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f15651y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e4) {
                e4.printStackTrace();
            }
        }
        this.f15652z = str3;
    }

    public final String h() {
        return TextUtils.isEmpty(this.f15652z) ? "" : this.f15652z;
    }

    public final void h(String str) {
        this.f15652z = str;
    }

    public n(String str, int i9, int i10, String str2, int i11, String str3, int i12, String str4) {
        this.f15645s = str;
        this.f15649w = i9;
        this.f15650x = str4;
        this.f15628L = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f15651y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e4) {
                e4.printStackTrace();
            }
        }
        this.f15621E = i11;
        this.f15639k = str3;
        this.f15629M = i12;
    }

    public static String f(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                StringBuilder p2 = o.p(o.p(L.l(L.l(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "network_type="), nVar.f15649w, "&", stringBuffer, "result="), nVar.f15621E, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "template_url="), nVar.f15625I, "&", stringBuffer, "reason=");
                p2.append(nVar.h());
                p2.append("&");
                stringBuffer.append(p2.toString());
                StringBuilder p7 = o.p(o.p(new StringBuilder("rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "unit_id=");
                p7.append(nVar.f15627K);
                p7.append("&");
                stringBuffer.append(p7.toString());
                stringBuffer.append("\n");
            } else {
                StringBuilder p9 = o.p(o.p(L.l(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "result="), nVar.f15621E, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "template_url="), nVar.f15625I, "&", stringBuffer, "reason=");
                p9.append(nVar.h());
                p9.append("&");
                stringBuffer.append(p9.toString());
                StringBuilder p10 = o.p(o.p(new StringBuilder("rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "unit_id=");
                p10.append(nVar.f15627K);
                p10.append("&");
                stringBuffer.append(p10.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public final String c() {
        return this.f15627K;
    }

    public final void c(String str) {
        this.f15627K = str;
    }

    public final void c(int i9) {
        this.f15633e = i9;
    }

    public n(Context context, CampaignEx campaignEx, int i9, String str, long j7, int i10) {
        if (i10 == 1 || i10 == 287 || i10 == 94) {
            this.f15645s = "m_download_end";
        } else if (i10 == 95) {
            this.f15645s = "2000025";
        }
        int l = z.l(context);
        this.f15649w = l;
        this.f15650x = z.a(context, l);
        this.f15628L = campaignEx.getVideoLength();
        this.f15617A = campaignEx.getRequestId();
        this.f15618B = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f15651y)) {
            try {
                this.f15651y = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
            } catch (UnsupportedEncodingException e4) {
                e4.printStackTrace();
            }
        }
        this.f15621E = i9;
        this.f15639k = str;
        this.f15629M = j7 == 0 ? campaignEx.getVideoSize() : j7;
    }

    public static String b(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder l = L.l(o.p(o.p(o.p(o.p(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "unit_id="), nVar.f15627K, "&", stringBuffer, "network_type="), nVar.f15649w, "&", stringBuffer, "mraid_type=");
            l.append(nVar.f15648v);
            l.append("&");
            stringBuffer.append(l.toString());
            stringBuffer.append("platform=1");
            return stringBuffer.toString();
        }
        return "";
    }

    public static String d(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder p2 = o.p(o.p(L.l(o.p(o.p(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "unit_id="), nVar.f15627K, "&", stringBuffer, "network_type="), nVar.f15649w, "&", stringBuffer, "rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "reason=");
        p2.append(nVar.h());
        stringBuffer.append(p2.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public static String e(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder p2 = o.p(o.p(o.p(L.l(o.p(new StringBuilder("key="), nVar.f15645s, "&", stringBuffer, "result="), nVar.f15621E, "&", stringBuffer, "duration="), nVar.f15639k, "&", stringBuffer, "cid="), nVar.f15636h, "&", stringBuffer, "unit_id="), nVar.f15627K, "&", stringBuffer, "reason=");
        p2.append(nVar.h());
        p2.append("&");
        stringBuffer.append(p2.toString());
        StringBuilder l = L.l(L.l(o.p(o.p(o.p(new StringBuilder("ad_type="), nVar.f15632d, "&", stringBuffer, "rid="), nVar.f15617A, "&", stringBuffer, "rid_n="), nVar.f15618B, "&", stringBuffer, "network_type="), nVar.f15649w, "&", stringBuffer, "mraid_type="), nVar.f15648v, "&", stringBuffer, "devid=");
        l.append(nVar.f15638j);
        l.append("&");
        stringBuffer.append(l.toString());
        if (nVar.f15619C != null) {
            stringBuffer.append("resource_type=" + nVar.f15619C + "&");
        }
        if (!TextUtils.isEmpty(nVar.m)) {
            stringBuffer.append("endcard_url=" + nVar.m + "&");
        }
        stringBuffer.append("type=" + nVar.l);
        return stringBuffer.toString();
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i9, String str7) {
        this.f15645s = str;
        this.f15641o = str2;
        this.f15626J = str3;
        this.f15646t = str4;
        this.f15627K = str5;
        this.f15636h = str6;
        this.f15649w = i9;
        this.f15650x = str7;
    }

    public final String g() {
        return this.f15618B;
    }

    public final void g(String str) {
        this.f15618B = str;
    }

    public n(String str) {
        this.f15642p = str;
    }

    public final String b() {
        return this.f15619C;
    }

    public n(String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f15645s = str;
        this.f15621E = i9;
        this.f15639k = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.m = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
        }
        this.f15636h = str4;
        this.f15627K = str5;
        this.f15652z = str6;
        this.l = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.f15664K) {
            this.f15621E = 2;
        }
    }

    public final void b(String str) {
        this.f15619C = str;
    }

    public final void b(int i9) {
        this.f15621E = i9;
    }

    public final String d() {
        return this.f15632d;
    }

    public final String b(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f15631c) == null) {
            return str2;
        }
        try {
            String str3 = map.get(str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    public final void d(String str) {
        this.f15632d = str;
    }

    public final void d(int i9) {
        this.f15648v = i9;
    }

    public static String a(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f15645s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f15641o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f15626J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f15646t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f15627K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f15636h) + "&");
                stringBuffer.append("network_str=" + nVar.f15650x + "&");
                StringBuilder sb = new StringBuilder("network_type=");
                sb.append(nVar.f15649w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f15645s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f15641o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f15626J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f15646t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f15627K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f15636h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public final String f() {
        return this.f15617A;
    }

    public final void f(String str) {
        this.f15617A = str;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i9) {
        this.f15645s = str;
        this.f15636h = str2;
        this.f15617A = str3;
        this.f15618B = str4;
        this.f15627K = str5;
        this.f15649w = i9;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i9, int i10, String str6) {
        this.f15645s = str;
        this.f15636h = str2;
        this.f15617A = str3;
        this.f15618B = str4;
        this.f15627K = str5;
        this.f15649w = i9;
        this.f15652z = str6;
        this.f15635g = i10;
    }

    public final String e() {
        return this.f15636h;
    }

    public final void e(String str) {
        this.f15636h = str;
    }

    public final void e(int i9) {
        this.f15624H = i9;
    }

    public final String a() {
        return this.f15645s;
    }

    public final void a(String str) {
        this.f15645s = str;
    }

    public final void a(int i9) {
        this.f15649w = i9;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f15631c == null) {
            this.f15631c = new HashMap();
        }
        try {
            this.f15631c.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
