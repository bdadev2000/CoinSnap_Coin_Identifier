package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        List<StatisticModel.PackageStatisticModel> list;
        StatisticModel b = b(bVar, aVar);
        if (b == null || (list = b.packages) == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitor = bVar.f13193c;
        if (iStatisticMonitor != null) {
            try {
                Iterator<StatisticModel.PackageStatisticModel> it = list.iterator();
                while (it.hasNext()) {
                    iStatisticMonitor.upload("geckosdk_update_stats", a(it.next(), b.common));
                }
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
        if (bVar.f13203o) {
            try {
                String a6 = com.bykv.vk.openvk.preload.geckox.c.b.a().f13232a.a(b);
                if (TextUtils.isEmpty(a6)) {
                    return;
                }
                a(bVar, a6);
            } catch (Throwable unused) {
            }
        }
    }

    private static JSONObject b(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("device_id", bVar.f13200j);
        jSONObject.put("os", 0);
        jSONObject.put("app_version", bVar.f13199i);
        jSONObject.put("api_version", "v3");
        jSONObject.put("aid", bVar.f13198h.longValue());
        jSONObject.put("x_tt_logid", bVar2.f13324e);
        jSONObject.put("http_status", bVar2.f13326g);
        jSONObject.put("err_msg", bVar2.f13323d);
        if (TextUtils.isEmpty(bVar2.f13324e)) {
            jSONObject.put("deployments_info", bVar2.b);
            jSONObject.put("local_info", bVar2.f13321a);
            jSONObject.put("custom_info", bVar2.f13322c);
        } else {
            jSONObject.put("deployments_info", "");
            jSONObject.put("local_info", "");
            jSONObject.put("custom_info", "");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        jSONObject.put("os_version", sb.toString());
        jSONObject.put("device_platform", "android");
        jSONObject.put("device_model", Build.MODEL);
        jSONObject.put("ac", bVar2.f13325f);
        return jSONObject;
    }

    private static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, final String str) {
        final String h6 = AbstractC2914a.h(new StringBuilder("https://"), bVar.f13201k, "/gecko/server/packages/stats");
        com.bykv.vk.openvk.preload.geckox.b.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
            @Override // java.lang.Runnable
            public final void run() {
                Response doPost;
                for (int i9 = 0; i9 < 3; i9++) {
                    try {
                        doPost = com.bykv.vk.openvk.preload.geckox.b.this.f13194d.doPost(h6, str);
                    } catch (Exception e4) {
                        GeckoLogger.w("gecko-debug-tag", "upload statistic:", e4);
                    }
                    if (doPost.code == 200) {
                        if (new JSONObject(doPost.body).getInt(NotificationCompat.CATEGORY_STATUS) == 0) {
                            return;
                        }
                    } else {
                        throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + h6);
                        break;
                    }
                }
            }
        });
    }

    private static JSONObject a(StatisticModel.PackageStatisticModel packageStatisticModel, Common common) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put(TtmlNode.TAG_REGION, common.region);
        jSONObject.put("err_code", packageStatisticModel.errCode);
        jSONObject.put("err_msg", packageStatisticModel.errMsg);
        jSONObject.put("sdk_version", common.sdkVersion);
        jSONObject.put("access_key", packageStatisticModel.accessKey);
        jSONObject.put("stats_type", packageStatisticModel.statsType);
        jSONObject.put("device_id", common.deviceId);
        Long l = packageStatisticModel.patchId;
        jSONObject.put("patch_id", l == null ? 0L : l.longValue());
        jSONObject.put("group_name", packageStatisticModel.groupName);
        jSONObject.put("os", common.os);
        jSONObject.put("app_version", common.appVersion);
        jSONObject.put("device_model", common.deviceModel);
        jSONObject.put("channel", packageStatisticModel.channel);
        Long l2 = packageStatisticModel.id;
        jSONObject.put("id", l2 == null ? 0L : l2.longValue());
        jSONObject.put("ac", common.ac);
        Integer num = packageStatisticModel.downloadRetryTimes;
        jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
        String str = packageStatisticModel.downloadUrl;
        if (str == null) {
            str = "";
        }
        jSONObject.put(DownloadModel.DOWNLOAD_URL, str);
        jSONObject.put("download_duration", packageStatisticModel.downloadDuration);
        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = packageStatisticModel.downloadFailRecords;
        jSONObject.put("download_fail_records", list != null ? list : "");
        jSONObject.put("log_id", packageStatisticModel.logId);
        Long l6 = packageStatisticModel.activeCheckDuration;
        jSONObject.put("active_check_duration", l6 == null ? 0L : l6.longValue());
        Long l7 = packageStatisticModel.applyDuration;
        jSONObject.put("apply_duration", l7 != null ? l7.longValue() : 0L);
        return jSONObject;
    }

    private static StatisticModel b(com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f13300d != null || aVar2.f13302f != 0) {
                if (aVar2.f13304h && aVar2.f13305i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.b;
                    packageStatisticModel.accessKey = aVar2.f13298a;
                    packageStatisticModel.channel = aVar2.f13299c;
                    packageStatisticModel.ac = aVar2.f13310p;
                    packageStatisticModel.id = aVar2.f13312r;
                    packageStatisticModel.patchId = aVar2.f13311q;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f13301e);
                    packageStatisticModel.downloadUrl = aVar2.f13300d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f13301e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f13303g - aVar2.f13302f);
                    if (!aVar2.f13306j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f13299c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f13314t;
                        packageStatisticModel2.ac = aVar2.f13310p;
                        packageStatisticModel2.patchId = aVar2.f13311q;
                        packageStatisticModel2.id = aVar2.f13312r;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f13301e);
                        packageStatisticModel2.downloadUrl = aVar2.f13300d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f13301e);
                    } else if (aVar2.f13307k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f13298a;
                        packageStatisticModel3.groupName = aVar2.b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f13311q;
                        packageStatisticModel3.id = aVar2.f13312r;
                        packageStatisticModel3.channel = aVar2.f13299c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f13308n - aVar2.f13303g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f13309o - aVar2.f13308n);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f13298a;
                        packageStatisticModel4.groupName = aVar2.b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f13299c;
                        packageStatisticModel4.patchId = aVar2.f13311q;
                        packageStatisticModel4.id = aVar2.f13312r;
                        packageStatisticModel4.errMsg = aVar2.f13315u;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f13298a;
                    packageStatisticModel5.groupName = aVar2.b;
                    packageStatisticModel5.channel = aVar2.f13299c;
                    packageStatisticModel5.ac = aVar2.f13310p;
                    packageStatisticModel5.patchId = aVar2.f13311q;
                    packageStatisticModel5.id = aVar2.f13312r;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f13301e);
                    packageStatisticModel5.downloadUrl = aVar2.f13300d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f13301e);
                    if (!aVar2.f13304h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f13301e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f13301e.get(0).reason;
                        }
                    } else if (!aVar2.f13305i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f13313s;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context context = bVar.f13192a;
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.b.a(context).a());
        if (arrayList.isEmpty()) {
            return null;
        }
        Common common = new Common(bVar.f13198h.longValue(), bVar.f13199i, bVar.f13200j, com.bykv.vk.openvk.preload.geckox.utils.a.b(context), h.a(context), bVar.m, bVar.l);
        StatisticModel statisticModel = new StatisticModel();
        statisticModel.common = common;
        statisticModel.packages = arrayList;
        String uuid = UUID.randomUUID().toString();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((StatisticModel.PackageStatisticModel) it.next()).logId = uuid;
        }
        return statisticModel;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.f13293B && aVar.f13294C) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f13298a;
            packageStatisticModel.groupName = aVar.b;
            packageStatisticModel.channel = aVar.f13299c;
            packageStatisticModel.ac = aVar.f13310p;
            packageStatisticModel.id = aVar.f13312r;
            packageStatisticModel.downloadRetryTimes = a(aVar.f13317w);
            packageStatisticModel.downloadUrl = aVar.f13316v;
            packageStatisticModel.downloadFailRecords = b(aVar.f13317w);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f13319y - aVar.f13318x);
            if (aVar.f13295D) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f13298a;
                packageStatisticModel2.groupName = aVar.b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.id = aVar.f13312r;
                packageStatisticModel2.channel = aVar.f13299c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f13320z - aVar.f13319y);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.f13292A - aVar.f13320z);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f13298a;
            packageStatisticModel3.groupName = aVar.b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.id = aVar.f13312r;
            packageStatisticModel3.channel = aVar.f13299c;
            packageStatisticModel3.errMsg = aVar.f13297F;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f13298a;
        packageStatisticModel4.groupName = aVar.b;
        packageStatisticModel4.channel = aVar.f13299c;
        packageStatisticModel4.ac = aVar.f13310p;
        packageStatisticModel4.id = aVar.f13312r;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f13317w);
        packageStatisticModel4.downloadUrl = aVar.f13316v;
        packageStatisticModel4.downloadFailRecords = b(aVar.f13317w);
        if (!aVar.f13293B) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f13317w;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f13317w.get(0).reason;
            return;
        }
        if (aVar.f13294C) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.f13296E;
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2) {
        IStatisticMonitor iStatisticMonitor = bVar.f13193c;
        if (iStatisticMonitor != null) {
            try {
                iStatisticMonitor.upload("geckosdk_query_pkgs", b(bVar, bVar2));
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }
}
