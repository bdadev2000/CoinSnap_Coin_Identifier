package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.safedk.android.analytics.events.MaxEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class mq {

    /* renamed from: a, reason: collision with root package name */
    private static final DateFormat f25603a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    private static final Random f25604b = new Random(System.currentTimeMillis());

    private static Set a(Set set, List list, eq eqVar, com.applovin.impl.sdk.j jVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kq a2 = kq.a((es) it.next(), eqVar, jVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        }
        return set;
    }

    public static boolean b(aq aqVar) {
        nq t1;
        List f2;
        return (aqVar == null || (t1 = aqVar.t1()) == null || (f2 = t1.f()) == null || f2.isEmpty()) ? false : true;
    }

    public static fq c(aq aqVar) {
        if (b(aqVar) || a(aqVar)) {
            return null;
        }
        return fq.GENERAL_WRAPPER_ERROR;
    }

    public static String a(es esVar, String str, String str2) {
        es c2 = esVar.c(str);
        if (c2 != null) {
            String d = c2.d();
            if (StringUtils.isValidString(d)) {
                return d;
            }
        }
        return str2;
    }

    public static boolean b(es esVar) {
        if (esVar != null) {
            return esVar.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static String b() {
        DateFormat dateFormat = f25603a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static void a(Set set, long j2, Uri uri, fq fqVar, com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Uri a2 = a(((kq) it.next()).b(), j2, uri, fqVar, jVar);
                if (a2 != null) {
                    jVar.X().a(com.applovin.impl.sdk.network.d.b().d(a2.toString()).a(false).a(), false);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(Set set, fq fqVar, com.applovin.impl.sdk.j jVar) {
        a(set, -1L, (Uri) null, fqVar, jVar);
    }

    public static void a(Set set, com.applovin.impl.sdk.j jVar) {
        a(set, -1L, (Uri) null, fq.UNSPECIFIED, jVar);
    }

    private static String a(long j2) {
        if (j2 <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j2);
        long minutes = timeUnit.toMinutes(j2);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j2 % timeUnit2.toSeconds(1L)));
    }

    public static String a(eq eqVar) {
        es b2;
        if (eqVar != null) {
            List a2 = eqVar.a();
            int size = eqVar.a().size();
            if (size <= 0 || (b2 = ((es) a2.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return b2.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static void a(eq eqVar, AppLovinAdLoadListener appLovinAdLoadListener, fq fqVar, int i2, com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i2);
            }
            a(a(eqVar, jVar), fqVar, jVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    public static boolean a(aq aqVar) {
        dq j12;
        iq d;
        if (aqVar == null || (j12 = aqVar.j1()) == null || (d = j12.d()) == null) {
            return false;
        }
        return d.b() != null || StringUtils.isValidString(d.a());
    }

    public static boolean a(es esVar) {
        if (esVar != null) {
            return esVar.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static void a(es esVar, Map map, eq eqVar, com.applovin.impl.sdk.j jVar) {
        List<es> a2;
        if (jVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (esVar == null) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        es c2 = esVar.c("TrackingEvents");
        if (c2 == null || (a2 = c2.a("Tracking")) == null) {
            return;
        }
        for (es esVar2 : a2) {
            String str = (String) esVar2.a().get(MaxEvent.f29810a);
            if (StringUtils.isValidString(str)) {
                kq a3 = kq.a(esVar2, eqVar, jVar);
                if (a3 != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(a3);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(a3);
                        map.put(str, hashSet);
                    }
                }
            } else {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().b("VastUtils", "Could not find event for tracking node = " + esVar2);
                }
            }
        }
    }

    public static void a(List list, Set set, eq eqVar, com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kq a2 = kq.a((es) it.next(), eqVar, jVar);
            if (a2 != null) {
                set.add(a2);
            }
        }
    }

    public static Uri a(String str, long j2, Uri uri, fq fqVar, com.applovin.impl.sdk.j jVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(fqVar.b());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j2 >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", a(j2));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                jVar.E().a("VastUtils", th);
                return null;
            }
        }
        jVar.J();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.J().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static Set a(eq eqVar, com.applovin.impl.sdk.j jVar) {
        if (eqVar == null) {
            return null;
        }
        List<es> a2 = eqVar.a();
        Set hashSet = new HashSet(a2.size());
        for (es esVar : a2) {
            es b2 = esVar.b("Wrapper");
            if (b2 == null) {
                b2 = esVar.b("InLine");
            }
            if (b2 != null) {
                hashSet = a(hashSet, b2.a("Error"), eqVar, jVar);
            } else {
                hashSet = a(hashSet, esVar.a("Error"), eqVar, jVar);
            }
        }
        jVar.J();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.J().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static String a() {
        return Integer.toString(f25604b.nextInt(89999999) + 10000000);
    }
}
