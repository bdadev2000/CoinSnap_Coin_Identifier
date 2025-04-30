package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.tracker.network.ae;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.r;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class f {
    public static b.a a(r rVar) {
        boolean z8;
        long j7;
        long j9;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = rVar.f18232c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a6 = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i9 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z8 = false;
            j7 = 0;
            j9 = 0;
            while (i9 < split.length) {
                String trim = split[i9].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j7 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j9 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z8 = true;
                }
                i9++;
            }
            i9 = 1;
        } else {
            z8 = false;
            j7 = 0;
            j9 = 0;
        }
        String str3 = map.get("Expires");
        long a9 = str3 != null ? a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long a10 = str4 != null ? a(str4) : 0L;
        String str5 = map.get(Command.HTTP_HEADER_ETAG);
        if (i9 != 0) {
            j11 = currentTimeMillis + (j7 * 1000);
            j10 = z8 ? j11 : (j9 * 1000) + j11;
        } else {
            j10 = 0;
            if (a6 <= 0 || a9 < a6) {
                j11 = 0;
            } else {
                j11 = currentTimeMillis + (a9 - a6);
                j10 = j11;
            }
        }
        b.a aVar = new b.a();
        aVar.f18163a = rVar.b;
        aVar.b = str5;
        aVar.f18167f = j11;
        aVar.f18166e = j10;
        aVar.f18164c = a6;
        aVar.f18165d = a10;
        aVar.f18168g = map;
        aVar.f18169h = rVar.f18233d;
        return aVar;
    }

    private static SimpleDateFormat b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private static long a(String str) {
        try {
            Date parse = b("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0L;
        } catch (ParseException e4) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                ae.a(e4, "Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                ae.a("Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    public static String a(long j7) {
        return b("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j7));
    }

    public static List<com.mbridge.msdk.tracker.network.h> a(List<com.mbridge.msdk.tracker.network.h> list, b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.mbridge.msdk.tracker.network.h> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.mbridge.msdk.tracker.network.h> list2 = aVar.f18169h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.mbridge.msdk.tracker.network.h hVar : aVar.f18169h) {
                    if (!treeSet.contains(hVar.a())) {
                        arrayList.add(hVar);
                    }
                }
            }
        } else if (!aVar.f18168g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f18168g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.mbridge.msdk.tracker.network.h(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static String a(Map<String, String> map) {
        String str;
        if (map != null && (str = map.get("Content-Type")) != null) {
            String[] split = str.split(";", 0);
            for (int i9 = 1; i9 < split.length; i9++) {
                String[] split2 = split[i9].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return "ISO-8859-1";
    }
}
