package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class n {
    static final List<String> a;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str, DownloadError downloadError);

        void a(String str, String str2, String str3, String str4, boolean z10);
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        a = arrayList;
        arrayList.add("mbridge_splash_native_template_v_v1.xml");
        arrayList.add("mbridge_splash_native_template_h_v1.xml");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:5|6|7|(3:8|9|(2:11|12))|(1:68)|17|18|(4:(7:20|21|22|(2:(1:(1:26)(2:58|59))|62)(1:63)|60|28|(6:46|47|48|49|50|51)(1:(6:33|34|35|37|38|39)(1:45)))|49|50|51)|66|21|22|(0)(0)|60|28|(1:30)|46|47|48) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:5|6|7|8|9|(2:11|12)|(1:68)|17|18|(4:(7:20|21|22|(2:(1:(1:26)(2:58|59))|62)(1:63)|60|28|(6:46|47|48|49|50|51)(1:(6:33|34|35|37|38|39)(1:45)))|49|50|51)|66|21|22|(0)(0)|60|28|(1:30)|46|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r19 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0176, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0177, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("DynamicViewResourceManager", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0095 A[Catch: Exception -> 0x009c, TRY_LEAVE, TryCatch #2 {Exception -> 0x009c, blocks: (B:59:0x0085, B:62:0x008d, B:63:0x0095), top: B:22:0x007a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r19, java.lang.String r20, final java.lang.String r21, final com.mbridge.msdk.foundation.tools.n.a r22, com.mbridge.msdk.foundation.entity.CampaignEx r23) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.n.a(int, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.tools.n$a, com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private static String b(int i10, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            String path = new URL(str2).getPath();
            String substring = path.substring(path.lastIndexOf(47) + 1);
            return !TextUtils.isEmpty(substring) ? substring.replace(".zip", "") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            String substring = path.substring(path.lastIndexOf(47) + 1);
            if (TextUtils.isEmpty(substring)) {
                return "";
            }
            String replace = substring.replace(".zip", "");
            List<String> list = a;
            return list != null ? !list.contains(replace) ? replace : "" : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(int i10, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            str3 = b(i10, str, str2);
        } catch (Exception unused) {
            str3 = "";
        }
        String str4 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_XML) + File.separator;
        File file = null;
        try {
            if (!TextUtils.isEmpty(str3)) {
                file = new File(str4, str3);
            }
        } catch (Exception unused2) {
        }
        if (file == null || !file.exists()) {
            file = new File(vd.e.h(eb.j.m(str4), File.separator, str3.replace(".xml", "")), str3);
        }
        return file.getPath();
    }

    public static String a(String str) {
        String str2;
        final String str3;
        File file;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP);
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!queryParameter.equals("1")) {
                    return "";
                }
            }
        } catch (Throwable unused) {
        }
        try {
            str2 = b(str);
        } catch (Exception unused2) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            str3 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_XML) + File.separator;
            file = new File(str3, str2);
        } catch (Exception unused3) {
        }
        if (file.isFile() && file.exists()) {
            return file.getPath();
        }
        String path = new URL(str).getPath();
        final String substring = path.substring(path.lastIndexOf(47) + 1);
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, substring, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withReadTimeout(com.mbridge.msdk.foundation.same.a.u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f13284o).with("download_scene", "download_dynamic_view").withWriteTimeout(com.mbridge.msdk.foundation.same.a.f13288s).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.tools.n.2
            @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
            public final void onCancelDownload(DownloadMessage downloadMessage) {
            }

            @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
            public final void onDownloadComplete(DownloadMessage downloadMessage) {
                try {
                    MBResourceManager.getInstance().unZip(str3 + File.separator + substring, str3);
                } catch (Exception unused4) {
                }
            }

            @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
            public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            }

            @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
            public final void onDownloadStart(DownloadMessage downloadMessage) {
            }
        }).build().start();
        return "";
    }
}
