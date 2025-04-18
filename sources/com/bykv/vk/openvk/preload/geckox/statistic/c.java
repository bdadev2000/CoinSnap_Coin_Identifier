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
import vd.e;

/* loaded from: classes.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        List<StatisticModel.PackageStatisticModel> list;
        StatisticModel b3 = b(bVar, aVar);
        if (b3 == null || (list = b3.packages) == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitor = bVar.f10018c;
        if (iStatisticMonitor != null) {
            try {
                Iterator<StatisticModel.PackageStatisticModel> it = list.iterator();
                while (it.hasNext()) {
                    iStatisticMonitor.upload("geckosdk_update_stats", a(it.next(), b3.common));
                }
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
        if (bVar.f10030o) {
            try {
                String a = com.bykv.vk.openvk.preload.geckox.c.b.a().a.a(b3);
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                a(bVar, a);
            } catch (Throwable unused) {
            }
        }
    }

    private static JSONObject b(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("device_id", bVar.f10025j);
        jSONObject.put("os", 0);
        jSONObject.put("app_version", bVar.f10024i);
        jSONObject.put("api_version", "v3");
        jSONObject.put("aid", bVar.f10023h.longValue());
        jSONObject.put("x_tt_logid", bVar2.f10139e);
        jSONObject.put("http_status", bVar2.f10141g);
        jSONObject.put("err_msg", bVar2.f10138d);
        if (TextUtils.isEmpty(bVar2.f10139e)) {
            jSONObject.put("deployments_info", bVar2.f10136b);
            jSONObject.put("local_info", bVar2.a);
            jSONObject.put("custom_info", bVar2.f10137c);
        } else {
            jSONObject.put("deployments_info", "");
            jSONObject.put("local_info", "");
            jSONObject.put("custom_info", "");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        jSONObject.put("os_version", sb2.toString());
        jSONObject.put("device_platform", "android");
        jSONObject.put("device_model", Build.MODEL);
        jSONObject.put("ac", bVar2.f10140f);
        return jSONObject;
    }

    private static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, final String str) {
        final String h10 = e.h(new StringBuilder("https://"), bVar.f10026k, "/gecko/server/packages/stats");
        com.bykv.vk.openvk.preload.geckox.b.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
            @Override // java.lang.Runnable
            public final void run() {
                Response doPost;
                for (int i10 = 0; i10 < 3; i10++) {
                    try {
                        doPost = com.bykv.vk.openvk.preload.geckox.b.this.f10019d.doPost(h10, str);
                    } catch (Exception e2) {
                        GeckoLogger.w("gecko-debug-tag", "upload statistic:", e2);
                    }
                    if (doPost.code == 200) {
                        if (new JSONObject(doPost.body).getInt(NotificationCompat.CATEGORY_STATUS) == 0) {
                            return;
                        }
                    } else {
                        throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + h10);
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
        Long l10 = packageStatisticModel.patchId;
        jSONObject.put("patch_id", l10 == null ? 0L : l10.longValue());
        jSONObject.put("group_name", packageStatisticModel.groupName);
        jSONObject.put("os", common.os);
        jSONObject.put("app_version", common.appVersion);
        jSONObject.put("device_model", common.deviceModel);
        jSONObject.put("channel", packageStatisticModel.channel);
        Long l11 = packageStatisticModel.f10111id;
        jSONObject.put("id", l11 == null ? 0L : l11.longValue());
        jSONObject.put("ac", common.f10103ac);
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
        Long l12 = packageStatisticModel.activeCheckDuration;
        jSONObject.put("active_check_duration", l12 == null ? 0L : l12.longValue());
        Long l13 = packageStatisticModel.applyDuration;
        jSONObject.put("apply_duration", l13 != null ? l13.longValue() : 0L);
        return jSONObject;
    }

    private static StatisticModel b(com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f10114d != null || aVar2.f10116f != 0) {
                if (aVar2.f10118h && aVar2.f10119i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f10112b;
                    packageStatisticModel.accessKey = aVar2.a;
                    packageStatisticModel.channel = aVar2.f10113c;
                    packageStatisticModel.f10110ac = aVar2.f10126p;
                    packageStatisticModel.f10111id = aVar2.f10128r;
                    packageStatisticModel.patchId = aVar2.f10127q;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f10115e);
                    packageStatisticModel.downloadUrl = aVar2.f10114d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f10115e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f10117g - aVar2.f10116f);
                    if (!aVar2.f10120j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f10113c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f10130t;
                        packageStatisticModel2.f10110ac = aVar2.f10126p;
                        packageStatisticModel2.patchId = aVar2.f10127q;
                        packageStatisticModel2.f10111id = aVar2.f10128r;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f10115e);
                        packageStatisticModel2.downloadUrl = aVar2.f10114d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f10115e);
                    } else if (aVar2.f10121k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.a;
                        packageStatisticModel3.groupName = aVar2.f10112b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f10127q;
                        packageStatisticModel3.f10111id = aVar2.f10128r;
                        packageStatisticModel3.channel = aVar2.f10113c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f10124n - aVar2.f10117g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f10125o - aVar2.f10124n);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.a;
                        packageStatisticModel4.groupName = aVar2.f10112b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f10113c;
                        packageStatisticModel4.patchId = aVar2.f10127q;
                        packageStatisticModel4.f10111id = aVar2.f10128r;
                        packageStatisticModel4.errMsg = aVar2.u;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.a;
                    packageStatisticModel5.groupName = aVar2.f10112b;
                    packageStatisticModel5.channel = aVar2.f10113c;
                    packageStatisticModel5.f10110ac = aVar2.f10126p;
                    packageStatisticModel5.patchId = aVar2.f10127q;
                    packageStatisticModel5.f10111id = aVar2.f10128r;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f10115e);
                    packageStatisticModel5.downloadUrl = aVar2.f10114d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f10115e);
                    if (!aVar2.f10118h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f10115e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f10115e.get(0).reason;
                        }
                    } else if (!aVar2.f10119i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f10129s;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context context = bVar.a;
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.b.a(context).a());
        if (arrayList.isEmpty()) {
            return null;
        }
        Common common = new Common(bVar.f10023h.longValue(), bVar.f10024i, bVar.f10025j, com.bykv.vk.openvk.preload.geckox.utils.a.b(context), h.a(context), bVar.f10028m, bVar.f10027l);
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
        if (aVar.B && aVar.C) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.a;
            packageStatisticModel.groupName = aVar.f10112b;
            packageStatisticModel.channel = aVar.f10113c;
            packageStatisticModel.f10110ac = aVar.f10126p;
            packageStatisticModel.f10111id = aVar.f10128r;
            packageStatisticModel.downloadRetryTimes = a(aVar.f10132w);
            packageStatisticModel.downloadUrl = aVar.f10131v;
            packageStatisticModel.downloadFailRecords = b(aVar.f10132w);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f10134y - aVar.f10133x);
            if (aVar.D) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.a;
                packageStatisticModel2.groupName = aVar.f10112b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.f10111id = aVar.f10128r;
                packageStatisticModel2.channel = aVar.f10113c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f10135z - aVar.f10134y);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.A - aVar.f10135z);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.a;
            packageStatisticModel3.groupName = aVar.f10112b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.f10111id = aVar.f10128r;
            packageStatisticModel3.channel = aVar.f10113c;
            packageStatisticModel3.errMsg = aVar.F;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.a;
        packageStatisticModel4.groupName = aVar.f10112b;
        packageStatisticModel4.channel = aVar.f10113c;
        packageStatisticModel4.f10110ac = aVar.f10126p;
        packageStatisticModel4.f10111id = aVar.f10128r;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f10132w);
        packageStatisticModel4.downloadUrl = aVar.f10131v;
        packageStatisticModel4.downloadFailRecords = b(aVar.f10132w);
        if (!aVar.B) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f10132w;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f10132w.get(0).reason;
            return;
        }
        if (aVar.C) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.E;
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2) {
        IStatisticMonitor iStatisticMonitor = bVar.f10018c;
        if (iStatisticMonitor != null) {
            try {
                iStatisticMonitor.upload("geckosdk_query_pkgs", b(bVar, bVar2));
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
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
