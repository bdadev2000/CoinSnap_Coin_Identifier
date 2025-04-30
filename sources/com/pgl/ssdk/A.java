package com.pgl.ssdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.Inet6Address;
import java.net.InetAddress;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class A {
    private static String a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                }
            } catch (Exception unused) {
            }
        } while (read >= 4096);
        return sb.toString();
    }

    private static void b(LinkProperties linkProperties, JSONArray jSONArray) {
        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            if (linkAddress != null && linkAddress.getAddress() != null && !linkAddress.getAddress().isLoopbackAddress()) {
                jSONArray.put(linkAddress.getAddress().getHostAddress());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L5a
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L5a
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L5b
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L5b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L5b
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L5d
            r2.write(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L5d
            r5 = 10
            r2.write(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L5d
            r2.flush()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L5d
            r2.close()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L5d
            r1.waitFor()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L5d
            java.lang.String r0 = a(r3)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L5d
            r2.close()     // Catch: java.io.IOException -> L39
        L39:
            r3.close()     // Catch: java.io.IOException -> L6a
            goto L6a
        L3d:
            r5 = move-exception
        L3e:
            r0 = r2
            goto L4a
        L40:
            r5 = move-exception
            r3 = r0
            goto L3e
        L43:
            r3 = r0
            goto L5d
        L45:
            r5 = move-exception
            goto L49
        L47:
            r5 = move-exception
            r1 = r0
        L49:
            r3 = r0
        L4a:
            if (r0 == 0) goto L4f
            r0.close()     // Catch: java.io.IOException -> L4f
        L4f:
            if (r3 == 0) goto L54
            r3.close()     // Catch: java.io.IOException -> L54
        L54:
            if (r1 == 0) goto L59
            r1.destroy()
        L59:
            throw r5
        L5a:
            r1 = r0
        L5b:
            r2 = r0
            r3 = r2
        L5d:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L62
        L62:
            if (r3 == 0) goto L67
            r3.close()     // Catch: java.io.IOException -> L67
        L67:
            if (r1 != 0) goto L6a
            goto L6d
        L6a:
            r1.destroy()
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.A.a(java.lang.String):java.lang.String");
    }

    public static String[] b(Context context) {
        Network[] allNetworks;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        int type;
        String[] strArr = new String[5];
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            JSONArray jSONArray5 = new JSONArray();
            for (Network network : allNetworks) {
                if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getState() == NetworkInfo.State.CONNECTED && (linkProperties = connectivityManager.getLinkProperties(network)) != null && ((type = networkInfo.getType()) == 0 || type == 1)) {
                    for (InetAddress inetAddress : linkProperties.getDnsServers()) {
                        if (inetAddress != null) {
                            jSONArray5.put(inetAddress.getHostAddress());
                        }
                    }
                    if (type == 0) {
                        b(linkProperties, jSONArray);
                        a(linkProperties, jSONArray2);
                    } else {
                        b(linkProperties, jSONArray3);
                        a(linkProperties, jSONArray4);
                    }
                }
            }
            strArr[0] = jSONArray3.toString();
            strArr[1] = jSONArray4.toString();
            strArr[2] = jSONArray.toString();
            strArr[3] = jSONArray2.toString();
            strArr[4] = jSONArray5.toString();
        }
        return strArr;
    }

    private static void a(LinkProperties linkProperties, JSONArray jSONArray) {
        InetAddress gateway;
        for (RouteInfo routeInfo : linkProperties.getRoutes()) {
            if (routeInfo != null && routeInfo.isDefaultRoute() && (gateway = routeInfo.getGateway()) != null && (!(gateway instanceof Inet6Address) || !"::".equals(gateway.getHostAddress()))) {
                jSONArray.put(gateway.getHostAddress());
            }
        }
    }

    public static synchronized String a(Context context) {
        String str;
        synchronized (A.class) {
            try {
                String str2 = context.getFilesDir().getAbsolutePath() + "/cid";
                if (new File(str2).exists()) {
                    a("chmod 777 ".concat(String.valueOf(str2)));
                    String a6 = a(str2);
                    a("chmod 600 ".concat(String.valueOf(str2)));
                    if (a6 != null && a6.length() > 0) {
                        return a6;
                    }
                }
                InputStream open = context.getResources().getAssets().open(BidResponsedEx.KEY_CID);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = open.read(bArr, 0, 4096);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.close();
                a("chmod 777 ".concat(String.valueOf(str2)));
                str = a(str2);
                if (str == null || str.length() == 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(str2, "rw");
                    randomAccessFile.seek(16L);
                    randomAccessFile.write(new byte[]{2});
                    randomAccessFile.close();
                    str = a(str2);
                }
                a("chmod 600 ".concat(String.valueOf(str2)));
            } catch (Throwable unused) {
                str = "0[<!>]EXCEPTION[<!>]";
            }
            if (str != null) {
                try {
                    if (str.length() == 0) {
                    }
                    return str;
                } finally {
                }
            }
            str = "0[<!>]ERROR[<!>]";
            return str;
        }
    }
}
