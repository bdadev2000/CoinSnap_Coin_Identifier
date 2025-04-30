package com.bykv.vk.openvk.component.video.zp.KS;

import Q7.n0;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.vk.openvk.component.video.zp.lMd.COT;
import com.bykv.vk.openvk.component.video.zp.lMd.YW;
import com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS;
import com.bytedance.sdk.component.ku.HWF;
import com.bytedance.sdk.component.ku.ku;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class zp {
    private static final Handler lMd = new Handler(Looper.getMainLooper());
    public static final Charset zp = Charset.forName("UTF-8");

    /* renamed from: com.bykv.vk.openvk.component.video.zp.KS.zp$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass1 implements FilenameFilter {
        private Pattern zp = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.zp.matcher(str).matches();
        }
    }

    public static boolean KS(String str) {
        if (str != null) {
            if (str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int lMd(String str) {
        return zp(str, 0);
    }

    public static void zp(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String lMd(int i9, int i10) {
        if (i9 >= 0 && i10 > 0) {
            return i9 + "-" + i10;
        }
        if (i9 > 0) {
            return i9 + "-";
        }
        if (i9 >= 0 || i10 <= 0) {
            return null;
        }
        return "-".concat(String.valueOf(i10));
    }

    public static void zp(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void zp(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void zp(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean lMd() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean zp(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    public static String lMd(List<YW.lMd> list) {
        if (list != null && list.size() != 0) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                YW.lMd lmd = list.get(0);
                if (lmd != null) {
                    sb.append(lmd.zp);
                    sb.append(": ");
                    sb.append(lmd.lMd);
                    sb.append("\r\n");
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static int zp(String str, int i9) {
        if (TextUtils.isEmpty(str)) {
            return i9;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i9;
        }
    }

    public static String zp(com.bykv.vk.openvk.component.video.zp.lMd.COT.zp zpVar, int i9) {
        int zp2;
        if (zpVar == null || !zpVar.lMd()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(zpVar.COT().toUpperCase());
        sb.append(' ');
        sb.append(zpVar.zp());
        sb.append(' ');
        sb.append(zpVar.HWF());
        sb.append("\r\n");
        if (COT.KS) {
            Log.i("TAG_PROXY_headers", zpVar.COT().toUpperCase() + " " + zpVar.zp() + " " + zpVar.HWF());
        }
        List<YW.lMd> zp3 = zp(zpVar.KS());
        boolean z8 = true;
        if (zp3 != null) {
            int size = zp3.size();
            for (int i10 = 0; i10 < size; i10++) {
                YW.lMd lmd = zp3.get(i10);
                if (lmd != null) {
                    String str = lmd.zp;
                    String str2 = lmd.lMd;
                    AbstractC2914a.j(sb, str, ": ", str2, "\r\n");
                    if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z8 = false;
                    }
                }
            }
        }
        if (z8 && (zp2 = zp(zpVar)) > 0) {
            sb.append("Content-Range: bytes ");
            sb.append(Math.max(i9, 0));
            sb.append("-");
            n0.t(sb, zp2 - 1, "/", zp2, "\r\n");
        }
        sb.append("Connection: close\r\n\r\n");
        String sb2 = sb.toString();
        if (COT.KS) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    public static String lMd(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append((Object) entry.getKey());
                sb.append(": ");
                sb.append((Object) entry.getValue());
                sb.append("\r\n");
            }
            return sb.toString();
        }
        return "";
    }

    public static String zp(int i9, int i10) {
        String lMd2 = lMd(i9, i10);
        if (lMd2 == null) {
            return null;
        }
        return "bytes=".concat(lMd2);
    }

    public static List<String> zp(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (zp(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static String zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zpVar, int i9) {
        StringBuilder sb = new StringBuilder();
        if (i9 <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\nContent-Type: ");
        sb.append(zpVar.lMd);
        sb.append("\r\n");
        if (i9 <= 0) {
            sb.append("Content-Length: ");
            sb.append(zpVar.KS);
            sb.append("\r\n");
        } else {
            sb.append("Content-Range: bytes ");
            sb.append(i9);
            sb.append("-");
            sb.append(zpVar.KS - 1);
            sb.append("/");
            sb.append(zpVar.KS);
            sb.append("\r\nContent-Length: ");
            sb.append(zpVar.KS - i9);
            sb.append("\r\n");
        }
        sb.append("Connection: close\r\n\r\n");
        String sb2 = sb.toString();
        if (COT.KS) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    public static int zp() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 1);
    }

    public static int zp(com.bykv.vk.openvk.component.video.zp.lMd.COT.zp zpVar) {
        int lastIndexOf;
        if (zpVar == null) {
            return -1;
        }
        if (zpVar.zp() == 200) {
            return zp(zpVar.zp("Content-Length", null), -1);
        }
        if (zpVar.zp() == 206) {
            String zp2 = zpVar.zp("Content-Range", null);
            if (!TextUtils.isEmpty(zp2) && (lastIndexOf = zp2.lastIndexOf("/")) >= 0 && lastIndexOf < zp2.length() - 1) {
                return zp(zp2.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    public static String zp(com.bykv.vk.openvk.component.video.zp.lMd.COT.zp zpVar, boolean z8, boolean z9) {
        String zp2;
        if (zpVar == null) {
            if (COT.KS) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        }
        if (!zpVar.lMd()) {
            if (COT.KS) {
                Log.e("TAG_PROXY_Response", "response code: " + zpVar.zp());
            }
            return "response code: " + zpVar.zp();
        }
        String zp3 = zpVar.zp("Content-Type", null);
        if (!KS(zp3)) {
            if (COT.KS) {
                Log.e("TAG_PROXY_Response", "Content-Type: ".concat(String.valueOf(zp3)));
            }
            return "Content-Type: ".concat(String.valueOf(zp3));
        }
        int zp4 = zp(zpVar);
        if (zp4 <= 0) {
            if (COT.KS) {
                Log.e("TAG_PROXY_Response", "Content-Length: ".concat(String.valueOf(zp4)));
            }
            return "Content-Length: ".concat(String.valueOf(zp4));
        }
        if (z8 && ((zp2 = zpVar.zp("Accept-Ranges", null)) == null || !zp2.contains("bytes"))) {
            if (COT.KS) {
                Log.e("TAG_PROXY_Response", "Accept-Ranges: ".concat(String.valueOf(zp2)));
            }
            return "Accept-Ranges: ".concat(String.valueOf(zp2));
        }
        if (!z9 || zpVar.jU() != null) {
            return null;
        }
        if (COT.KS) {
            Log.e("TAG_PROXY_Response", "response body null");
        }
        return "response body null";
    }

    public static void zp(ku kuVar) {
        if (kuVar != null) {
            if (lMd()) {
                HWF.lMd(kuVar);
                if (COT.KS) {
                    Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                    return;
                }
                return;
            }
            kuVar.run();
            if (COT.KS) {
                Log.e("TAG_PROXY_UTIL", "invoke calling thread");
            }
        }
    }

    public static void zp(Runnable runnable) {
        if (runnable != null) {
            if (lMd()) {
                runnable.run();
            } else {
                lMd.post(runnable);
            }
        }
    }

    public static List<YW.lMd> zp(List<YW.lMd> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (COT.KS) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                YW.lMd lmd = list.get(i9);
                if (lmd != null) {
                    Log.i("TAG_PROXY_PRE_FILTER", lmd.zp + ": " + lmd.zp);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (YW.lMd lmd2 : list) {
            if ("Host".equals(lmd2.zp) || "Keep-Alive".equals(lmd2.zp) || "Connection".equals(lmd2.zp) || "Proxy-Connection".equals(lmd2.zp)) {
                arrayList.add(lmd2);
            }
        }
        list.removeAll(arrayList);
        if (COT.KS) {
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                YW.lMd lmd3 = list.get(i10);
                if (lmd3 != null) {
                    Log.i("TAG_PROXY_POST_FILTER", lmd3.zp + ": " + lmd3.lMd);
                }
            }
        }
        return list;
    }

    public static List<YW.lMd> zp(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : entrySet) {
                    arrayList.add(new YW.lMd(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zp(com.bykv.vk.openvk.component.video.zp.lMd.COT.zp zpVar, KS ks, String str, int i9) {
        String str2;
        String str3;
        String str4;
        com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zp2 = ks.zp(str, i9);
        if (zp2 != null) {
            return zp2;
        }
        int zp3 = zp(zpVar);
        String zp4 = zpVar.zp("Content-Type", null);
        if (zp3 <= 0 || TextUtils.isEmpty(zp4)) {
            return zp2;
        }
        com.bykv.vk.openvk.component.video.zp.lMd.COT.COT QR = zpVar.QR();
        if (QR == null) {
            str2 = "";
            str3 = str2;
        } else {
            str3 = QR.lMd;
            str2 = lMd(QR.COT);
        }
        String lMd2 = lMd(zpVar.KS());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestUrl", str3);
            jSONObject.put("requestHeaders", str2);
            jSONObject.put("responseHeaders", lMd2);
            str4 = jSONObject.toString();
        } catch (Throwable unused) {
            str4 = "";
        }
        com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zpVar2 = new com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp(str, zp4, zp3, i9, str4);
        ks.zp(zpVar2);
        return zpVar2;
    }
}
