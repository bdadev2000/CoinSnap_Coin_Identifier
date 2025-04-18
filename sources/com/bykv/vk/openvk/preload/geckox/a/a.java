package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0051a {
        String a;

        /* renamed from: b, reason: collision with root package name */
        String f10002b;

        /* renamed from: c, reason: collision with root package name */
        int f10003c;

        /* renamed from: d, reason: collision with root package name */
        long f10004d;

        /* renamed from: e, reason: collision with root package name */
        File f10005e;

        public C0051a(String str, String str2, int i10, long j3, File file) {
            this.a = str;
            this.f10002b = str2;
            this.f10003c = i10;
            this.f10004d = j3;
            this.f10005e = file;
        }
    }

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, final com.bykv.vk.openvk.preload.geckox.e.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        Iterator<Map.Entry<String, ComponentModel.b>> it;
        Iterator<ComponentModel.a> it2;
        File file2;
        List<Long> b3;
        File file3;
        Iterator<Long> it3;
        List<Long> b10;
        Iterator<Map.Entry<String, ComponentModel.b>> it4;
        Iterator<ComponentModel.a> it5;
        File file4;
        String str;
        File file5;
        List<Long> list2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            Iterator<Map.Entry<String, ComponentModel.b>> it6 = map.entrySet().iterator();
            while (it6.hasNext()) {
                Map.Entry<String, ComponentModel.b> next = it6.next();
                String key = next.getKey();
                File file6 = new File(file, key);
                if (file6.isDirectory() && (value = next.getValue()) != null && (list = value.a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list3 = value.a;
                    HashSet hashSet = new HashSet();
                    Iterator<ComponentModel.a> it7 = list3.iterator();
                    while (it7.hasNext()) {
                        ComponentModel.a next2 = it7.next();
                        String str2 = next2.a;
                        if (!hashSet.contains(str2)) {
                            hashSet.add(str2);
                            int i10 = next2.f10104b;
                            List<Long> list4 = next2.f10105c;
                            File file7 = new File(file6, str2);
                            String str3 = "--pending-delete";
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        File file8 = new File(file6, str2);
                                        File file9 = new File(file6, str2 + "--pending-delete");
                                        file8.renameTo(file9);
                                        arrayList.add(new C0051a(key, str2, i10, 0L, file9));
                                    }
                                } else if (list4 != null && (b10 = j.b(file7)) != null && !b10.isEmpty()) {
                                    for (Long l10 : b10) {
                                        if (list4.get(0).longValue() > l10.longValue()) {
                                            File file10 = new File(file7, l10 + str3);
                                            new File(file7, String.valueOf(l10)).renameTo(file10);
                                            it4 = it6;
                                            it5 = it7;
                                            file4 = file7;
                                            str = str3;
                                            file5 = file6;
                                            list2 = list4;
                                            arrayList.add(new C0051a(key, str2, i10, l10.longValue(), file10));
                                        } else {
                                            it4 = it6;
                                            it5 = it7;
                                            file4 = file7;
                                            str = str3;
                                            file5 = file6;
                                            list2 = list4;
                                        }
                                        it6 = it4;
                                        str3 = str;
                                        list4 = list2;
                                        file6 = file5;
                                        file7 = file4;
                                        it7 = it5;
                                    }
                                }
                                it = it6;
                                it2 = it7;
                                file2 = file6;
                            } else {
                                it = it6;
                                it2 = it7;
                                File file11 = file7;
                                file2 = file6;
                                if (list4 != null && (b3 = j.b(file11)) != null && !b3.isEmpty()) {
                                    Iterator<Long> it8 = b3.iterator();
                                    while (it8.hasNext()) {
                                        Long next3 = it8.next();
                                        if (list4.contains(next3)) {
                                            File file12 = file11;
                                            File file13 = new File(file12, next3 + "--pending-delete");
                                            new File(file12, String.valueOf(next3)).renameTo(file13);
                                            it3 = it8;
                                            file3 = file12;
                                            arrayList.add(new C0051a(key, str2, i10, next3.longValue(), file13));
                                        } else {
                                            file3 = file11;
                                            it3 = it8;
                                        }
                                        it8 = it3;
                                        file11 = file3;
                                    }
                                }
                            }
                            it6 = it;
                            file6 = file2;
                            it7 = it2;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0051a> list5 = arrayList;
                    if (list5 != null && !list5.isEmpty()) {
                        for (C0051a c0051a : list5) {
                            File file14 = c0051a.f10005e;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            boolean a = com.bykv.vk.openvk.preload.geckox.utils.c.a(file14);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            if (a) {
                                b.a(context2).a(c0051a.a, c0051a.f10002b, c0051a.f10003c, 200, c0051a.f10004d, 0, null, uptimeMillis2 - uptimeMillis);
                            } else {
                                b.a(context2).a(c0051a.a, c0051a.f10002b, c0051a.f10003c, 201, c0051a.f10004d, 601, "delete failed", uptimeMillis2 - uptimeMillis);
                            }
                        }
                    }
                } catch (Exception e10) {
                    GeckoLogger.w("clean-channel", "", e10);
                }
            }
        });
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.f10030o) {
            Common common = new Common(bVar.f10023h.longValue(), bVar.f10024i, bVar.f10025j, com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a), h.a(bVar.a), bVar.f10028m, bVar.f10027l);
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String h10 = vd.e.h(new StringBuilder("https://"), bVar.f10026k, "/gecko/server/packages/stats");
            try {
                Response doPost = bVar.f10019d.doPost(h10, com.bykv.vk.openvk.preload.geckox.c.b.a().a.a(statisticModel));
                if (doPost.code == 200) {
                    if (new JSONObject(doPost.body).getInt(NotificationCompat.CATEGORY_STATUS) != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + h10);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
