package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
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
public abstract class nq {
    private static final DateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    private static final Random f6428b = new Random(System.currentTimeMillis());

    private static Set a(Set set, List list, fq fqVar, com.applovin.impl.sdk.k kVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lq a10 = lq.a((fs) it.next(), fqVar, kVar);
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }
        return set;
    }

    public static boolean b(bq bqVar) {
        oq o12;
        List f10;
        return (bqVar == null || (o12 = bqVar.o1()) == null || (f10 = o12.f()) == null || f10.isEmpty()) ? false : true;
    }

    public static gq c(bq bqVar) {
        if (b(bqVar) || a(bqVar)) {
            return null;
        }
        return gq.GENERAL_WRAPPER_ERROR;
    }

    public static String a(fs fsVar, String str, String str2) {
        fs c10 = fsVar.c(str);
        if (c10 != null) {
            String d10 = c10.d();
            if (StringUtils.isValidString(d10)) {
                return d10;
            }
        }
        return str2;
    }

    public static boolean b(fs fsVar) {
        if (fsVar != null) {
            return fsVar.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static String b() {
        DateFormat dateFormat = a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static void a(Set set, long j3, Uri uri, gq gqVar, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Uri a10 = a(((lq) it.next()).b(), j3, uri, gqVar, kVar);
                if (a10 != null) {
                    kVar.Z().a(com.applovin.impl.sdk.network.d.b().d(a10.toString()).a(false).a(), false);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(Set set, gq gqVar, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, gqVar, kVar);
    }

    public static void a(Set set, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, gq.UNSPECIFIED, kVar);
    }

    private static String a(long j3) {
        if (j3 <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j3);
        long minutes = timeUnit.toMinutes(j3);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j3 % timeUnit2.toSeconds(1L)));
    }

    public static String a(fq fqVar) {
        fs b3;
        if (fqVar != null) {
            List a10 = fqVar.a();
            int size = fqVar.a().size();
            if (size <= 0 || (b3 = ((fs) a10.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return b3.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static void a(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, gq gqVar, int i10, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
            }
            a(a(fqVar, kVar), gqVar, kVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    public static boolean a(bq bqVar) {
        eq e12;
        jq d10;
        if (bqVar == null || (e12 = bqVar.e1()) == null || (d10 = e12.d()) == null) {
            return false;
        }
        return d10.b() != null || StringUtils.isValidString(d10.a());
    }

    public static boolean a(fs fsVar) {
        if (fsVar != null) {
            return fsVar.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static void a(fs fsVar, Map map, fq fqVar, com.applovin.impl.sdk.k kVar) {
        List<fs> a10;
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (fsVar == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        fs c10 = fsVar.c("TrackingEvents");
        if (c10 == null || (a10 = c10.a("Tracking")) == null) {
            return;
        }
        for (fs fsVar2 : a10) {
            String str = (String) fsVar2.a().get(NotificationCompat.CATEGORY_EVENT);
            if (StringUtils.isValidString(str)) {
                lq a11 = lq.a(fsVar2, fqVar, kVar);
                if (a11 != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(a11);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(a11);
                        map.put(str, hashSet);
                    }
                }
            } else {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("VastUtils", "Could not find event for tracking node = " + fsVar2);
                }
            }
        }
    }

    public static void a(List list, Set set, fq fqVar, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lq a10 = lq.a((fs) it.next(), fqVar, kVar);
            if (a10 != null) {
                set.add(a10);
            }
        }
    }

    public static Uri a(String str, long j3, Uri uri, gq gqVar, com.applovin.impl.sdk.k kVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(gqVar.b());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j3 >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", a(j3));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th2) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastUtils", "Unable to replace macros in URL string " + str, th2);
                }
                kVar.B().a("VastUtils", th2);
                return null;
            }
        }
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static Set a(fq fqVar, com.applovin.impl.sdk.k kVar) {
        if (fqVar == null) {
            return null;
        }
        List<fs> a10 = fqVar.a();
        Set hashSet = new HashSet(a10.size());
        for (fs fsVar : a10) {
            fs b3 = fsVar.b("Wrapper");
            if (b3 == null) {
                b3 = fsVar.b("InLine");
            }
            if (b3 != null) {
                hashSet = a(hashSet, b3.a("Error"), fqVar, kVar);
            } else {
                hashSet = a(hashSet, fsVar.a("Error"), fqVar, kVar);
            }
        }
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static String a() {
        return Integer.toString(f6428b.nextInt(89999999) + 10000000);
    }
}
