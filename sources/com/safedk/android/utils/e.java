package com.safedk.android.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.File;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f30023a = 620;

    /* renamed from: b, reason: collision with root package name */
    private static final String f30024b = "MemoryUtils";

    /* renamed from: c, reason: collision with root package name */
    private static final Object f30025c = new Object();

    public static long a(Context context) {
        return Runtime.getRuntime().freeMemory();
    }

    public static boolean b(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static String a() {
        try {
            return a(a(Environment.getDataDirectory()));
        } catch (Throwable th) {
            Logger.e(f30024b, "error in getHumanReadableFreeInternalMemory()");
            return "";
        }
    }

    public static long b() {
        return a(Environment.getDataDirectory());
    }

    private static long a(File file) {
        long blockSize;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            } else {
                blockSize = statFs.getBlockSize() * statFs.getAvailableBlocks();
            }
            return blockSize;
        } catch (Throwable th) {
            Logger.e(f30024b, "error in getAvailableMemoryInPath");
            return 0L;
        }
    }

    public static String a(long j2) {
        long j3 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        long j4 = j3 * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        long j5 = j4 * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        long j6 = j5 * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        long j7 = j6 * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        return j2 < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE ? a(j2) + " byte" : (j2 < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE || j2 >= j3) ? (j2 < j3 || j2 >= j4) ? (j2 < j4 || j2 >= j5) ? (j2 < j5 || j2 >= j6) ? (j2 < j6 || j2 >= j7) ? j2 >= j7 ? a(j2 / j7) + " Eb" : "???" : a(j2 / j6) + " Pb" : a(j2 / j5) + " Tb" : a(j2 / j4) + " Gb" : a(j2 / j3) + " Mb" : a(j2 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) + " Kb";
    }

    private static String a(double d) {
        return new DecimalFormat("#.##").format(d);
    }

    public static long c() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }

    public static void a(String str) {
        String a2 = a(str.getBytes().length);
        String a3 = a(c());
        Logger.d(f30024b, "loaded from prefs: " + a2);
        Logger.d(f30024b, "available heap size: " + a3);
        if (b(SafeDK.getInstance().l())) {
            Logger.e(f30024b, "android low memory!");
        }
    }

    public static void b(String str) {
        String a2 = a(str.getBytes().length);
        String a3 = a(c());
        Logger.d(f30024b, "saved in prefs: " + a2);
        boolean b2 = b(SafeDK.getInstance().l());
        Logger.d(f30024b, "available heap size: " + a3);
        if (b2) {
            Logger.e(f30024b, "android low memory!");
        }
    }

    public static void a(Map<?, ?> map, String str, boolean z2) {
        int P;
        if (map != null && map.size() > (P = SafeDK.getInstance().P())) {
            String uuid = UUID.randomUUID().toString();
            try {
                a(map, str, P, uuid, z2);
                a(map, str, P, uuid);
            } catch (Throwable th) {
                Logger.d(f30024b, "Exception in clear CIs from memory " + uuid + " - " + th.getMessage(), th);
            }
        }
    }

    private static void a(Map<?, ?> map, String str, int i2, String str2, boolean z2) {
        List list;
        HashSet hashSet = new HashSet();
        if (z2) {
            for (String str3 : CreativeInfoManager.i()) {
                for (BrandSafetyUtils.AdType adType : BrandSafetyUtils.AdType.values()) {
                    int a2 = a(map, str3, adType, str2);
                    if (a2 > i2) {
                        hashSet.add(str3 + "_" + adType.name());
                        if (a2 > 0) {
                            Logger.d(f30024b, "clear CIs from memory (expired) " + str2 + " for " + str + ", adType: " + adType.name() + ", sdkPackageName: " + str3 + ", item count: " + a2 + ", max items: " + i2);
                        }
                    }
                }
            }
        }
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            CreativeInfo creativeInfo = null;
            if (next != null && next.getValue() != null) {
                if (next.getValue() instanceof CreativeInfo) {
                    creativeInfo = (CreativeInfo) next.getValue();
                } else if ((next.getValue() instanceof List) && (list = (List) next.getValue()) != null && list.size() > 0 && (list.get(0) instanceof CreativeInfo)) {
                    creativeInfo = (CreativeInfo) list.get(0);
                }
            }
            if (creativeInfo != null) {
                String Q = creativeInfo.Q();
                BrandSafetyUtils.AdType K = creativeInfo.K();
                a(z2, str2, hashSet, it, creativeInfo, next.getKey().toString());
                if (a(map, Q, K, str2) <= i2) {
                    return;
                }
            }
        }
    }

    private static void a(Map<?, ?> map, String str, int i2, String str2) {
        int i3;
        for (String str3 : CreativeInfoManager.i()) {
            for (BrandSafetyUtils.AdType adType : BrandSafetyUtils.AdType.values()) {
                Map<Long, List<String>> b2 = b(map, str3, adType, str2);
                int a2 = a(b2, str2);
                if (a2 > i2 && (i3 = a2 - i2) > 0) {
                    ArrayList arrayList = new ArrayList(b2.keySet());
                    Collections.sort(arrayList);
                    Logger.d(f30024b, "clear CIs from memory (oldest) " + str2 + " for " + str + ", after clean iteration itemsToBeRemovedList = " + arrayList);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        int i4 = i3;
                        if (!it.hasNext()) {
                            break;
                        }
                        List<String> list = b2.get((Long) it.next());
                        if (list != null) {
                            for (String str4 : list) {
                                if (map.containsKey(str4)) {
                                    map.remove(str4);
                                    Logger.d(f30024b, "clear CIs from memory (oldest) " + str2 + " - after clean removed adId: " + str4 + ", itemsToBeRemovedCount: " + i4);
                                    i4--;
                                    if (i4 <= 0) {
                                        return;
                                    }
                                }
                            }
                        }
                        i3 = i4;
                    }
                }
            }
        }
    }

    private static int a(Map<Long, List<String>> map, String str) {
        int i2;
        int i3 = 0;
        if (map == null) {
            i2 = 0;
        } else {
            Iterator<List<String>> it = map.values().iterator();
            while (true) {
                i2 = i3;
                if (!it.hasNext()) {
                    break;
                }
                i3 = it.next().size() + i2;
            }
        }
        if (i2 > 0) {
            Logger.d(f30024b, "clear CIs from memory " + str + " - countItemsInTsMap returned " + i2);
        }
        return i2;
    }

    private static void a(boolean z2, String str, Set<String> set, Iterator<? extends Map.Entry<?, ?>> it, CreativeInfo creativeInfo, String str2) {
        if (creativeInfo != null && CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (creativeInfo.Y() != null && creativeInfo.Y().before(new Timestamp(currentTimeMillis))) {
                if (!z2) {
                    Logger.d(f30024b, "clear CIs from memory " + str + " - removing CI item. expiration time: " + a(creativeInfo.Y()) + ", sdk: " + creativeInfo.Q() + ", adType = " + creativeInfo.K() + ", key: " + str2);
                    it.remove();
                } else if (set.contains(creativeInfo.Q() + "_" + creativeInfo.K().name())) {
                    Logger.d(f30024b, "clear CIs from memory " + str + " - removing list item. expiration time: " + a(creativeInfo.Y()) + ", sdk: " + creativeInfo.Q() + ", adType = " + creativeInfo.K() + ", key: " + str2);
                    it.remove();
                }
            }
        }
    }

    private static int a(Map<?, ?> map, String str, BrandSafetyUtils.AdType adType, String str2) {
        CreativeInfo creativeInfo;
        int i2 = 0;
        for (Object obj : map.values()) {
            if (obj instanceof CreativeInfo) {
                creativeInfo = (CreativeInfo) obj;
            } else {
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (!list.isEmpty() && (list.get(0) instanceof CreativeInfo)) {
                        creativeInfo = (CreativeInfo) list.get(0);
                    }
                }
                creativeInfo = null;
            }
            if (creativeInfo != null && creativeInfo.Q() != null && creativeInfo.Q().equals(str) && ((creativeInfo.K() == null && adType == null) || (creativeInfo.K() != null && creativeInfo.K().equals(adType)))) {
                i2++;
            }
            i2 = i2;
        }
        if (i2 > 0) {
            Logger.d(f30024b, "clear CIs from memory " + str2 + " get CI count returned " + i2 + " for SdkPackage " + str + ", adType " + (adType != null ? adType.name() : "null"));
        }
        return i2;
    }

    private static Map<Long, List<String>> b(Map<?, ?> map, String str, BrandSafetyUtils.AdType adType, String str2) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            CreativeInfo creativeInfo = null;
            if (entry.getValue() instanceof CreativeInfo) {
                creativeInfo = (CreativeInfo) entry.getValue();
            } else if (entry.getValue() instanceof List) {
                List list = (List) entry.getValue();
                if (!list.isEmpty() && (list.get(0) instanceof CreativeInfo)) {
                    creativeInfo = (CreativeInfo) list.get(0);
                }
            }
            if (a(creativeInfo, str, adType, str2)) {
                List list2 = (List) hashMap.get(Long.valueOf(creativeInfo.ab()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(Long.valueOf(creativeInfo.ab()), list2);
                }
                list2.add(entry.getKey().toString());
            }
        }
        if (hashMap.size() > 0) {
            Logger.d(f30024b, "clear CIs from memory " + str2 + " get TS CI count returned " + hashMap.size() + " items for SdkPackage " + str + ", adType " + (adType != null ? adType.name() : "null"));
        }
        return hashMap;
    }

    private static boolean a(CreativeInfo creativeInfo, String str, BrandSafetyUtils.AdType adType, String str2) {
        return creativeInfo != null && creativeInfo.Q() != null && creativeInfo.Q().equals(str) && ((creativeInfo.K() == null && adType == null) || (creativeInfo.K() != null && creativeInfo.K().equals(adType)));
    }

    private static String a(Timestamp timestamp) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(timestamp.getTime()));
    }

    public static String b(long j2) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) new Date(j2));
    }
}
