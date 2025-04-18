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

/* loaded from: classes4.dex */
public final class f {
    public static b.a a(r rVar) {
        boolean z10;
        long j3;
        long j10;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = rVar.f15472c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z10 = false;
            j3 = 0;
            j10 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            i10 = 1;
        } else {
            z10 = false;
            j3 = 0;
            j10 = 0;
        }
        String str3 = map.get("Expires");
        long a10 = str3 != null ? a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long a11 = str4 != null ? a(str4) : 0L;
        String str5 = map.get(Command.HTTP_HEADER_ETAG);
        if (i10 != 0) {
            j12 = currentTimeMillis + (j3 * 1000);
            j11 = z10 ? j12 : (j10 * 1000) + j12;
        } else {
            j11 = 0;
            if (a <= 0 || a10 < a) {
                j12 = 0;
            } else {
                j12 = currentTimeMillis + (a10 - a);
                j11 = j12;
            }
        }
        b.a aVar = new b.a();
        aVar.a = rVar.f15471b;
        aVar.f15420b = str5;
        aVar.f15424f = j12;
        aVar.f15423e = j11;
        aVar.f15421c = a;
        aVar.f15422d = a11;
        aVar.f15425g = map;
        aVar.f15426h = rVar.f15473d;
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
        } catch (ParseException e2) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                ae.a(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                ae.a("Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    public static String a(long j3) {
        return b("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j3));
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
        List<com.mbridge.msdk.tracker.network.h> list2 = aVar.f15426h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.mbridge.msdk.tracker.network.h hVar : aVar.f15426h) {
                    if (!treeSet.contains(hVar.a())) {
                        arrayList.add(hVar);
                    }
                }
            }
        } else if (!aVar.f15425g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f15425g.entrySet()) {
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
            for (int i10 = 1; i10 < split.length; i10++) {
                String[] split2 = split[i10].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return "ISO-8859-1";
    }
}
