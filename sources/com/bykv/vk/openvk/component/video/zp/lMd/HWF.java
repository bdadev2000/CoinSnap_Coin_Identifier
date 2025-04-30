package com.bykv.vk.openvk.component.video.zp.lMd;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.zp.lMd.QR;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class HWF {
    private static volatile HWF jU;
    private volatile KS Bj;
    private volatile com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS COT;
    private volatile com.bykv.vk.openvk.component.video.zp.lMd.zp.KS HWF;
    private final AtomicInteger KS = new AtomicInteger(0);
    private volatile com.bykv.vk.openvk.component.video.zp.lMd.zp.lMd QR;
    private final QR.KS YW;
    private volatile KS dT;
    private final SparseArray<Set<QR>> ku;
    private volatile int lMd;
    private final AtomicBoolean tG;
    private final Runnable vDp;
    private volatile ServerSocket zp;

    /* loaded from: classes.dex */
    public static final class zp implements Callable<Boolean> {
        private final int lMd;
        private final String zp;

        public zp(String str, int i9) {
            this.zp = str;
            this.lMd = i9;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Socket socket;
            Throwable th;
            try {
                socket = new Socket(this.zp, this.lMd);
            } catch (Throwable th2) {
                socket = null;
                th = th2;
            }
            try {
                socket.setSoTimeout(2000);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("Ping\n".getBytes(com.bykv.vk.openvk.component.video.zp.KS.zp.zp));
                outputStream.flush();
                if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                    return Boolean.TRUE;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    th.getMessage();
                    HWF.zp("ping error", Log.getStackTraceString(th));
                    return Boolean.FALSE;
                } finally {
                    com.bykv.vk.openvk.component.video.zp.KS.zp.zp(socket);
                }
            }
            return Boolean.FALSE;
        }
    }

    private HWF() {
        SparseArray<Set<QR>> sparseArray = new SparseArray<>(2);
        this.ku = sparseArray;
        this.YW = new QR.KS() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.HWF.1
            @Override // com.bykv.vk.openvk.component.video.zp.lMd.QR.KS
            public void lMd(QR qr) {
                if (COT.KS) {
                    Log.d("ProxyServer", "afterExecute, ProxyTask: ".concat(String.valueOf(qr)));
                }
                int HWF = qr.HWF();
                synchronized (HWF.this.ku) {
                    try {
                        Set set = (Set) HWF.this.ku.get(HWF);
                        if (set != null) {
                            set.remove(qr);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.bykv.vk.openvk.component.video.zp.lMd.QR.KS
            public void zp(QR qr) {
                synchronized (HWF.this.ku) {
                    try {
                        Set set = (Set) HWF.this.ku.get(qr.HWF());
                        if (set != null) {
                            set.add(qr);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.vDp = new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.HWF.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i9 = 0;
                    HWF.this.zp = new ServerSocket(0, 50, InetAddress.getByName(HWF.this.YW()));
                    HWF hwf = HWF.this;
                    hwf.lMd = hwf.zp.getLocalPort();
                    if (HWF.this.lMd == -1) {
                        HWF.zp("socket not bound", "");
                        HWF.this.COT();
                        return;
                    }
                    dT.zp(HWF.this.YW(), HWF.this.lMd);
                    if (HWF.this.QR()) {
                        AtomicInteger unused = HWF.this.KS;
                        if (HWF.this.KS.compareAndSet(0, 1)) {
                            AtomicInteger unused2 = HWF.this.KS;
                            boolean z8 = COT.KS;
                            while (HWF.this.KS.get() == 1) {
                                try {
                                    try {
                                        Socket accept = HWF.this.zp.accept();
                                        com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS ks = HWF.this.COT;
                                        if (ks != null) {
                                            final QR zp2 = new QR.zp().zp(ks).zp(accept).zp(HWF.this.YW).zp();
                                            com.bytedance.sdk.component.ku.HWF.KS().execute(new com.bytedance.sdk.component.ku.ku("ProxyTask", 10) { // from class: com.bykv.vk.openvk.component.video.zp.lMd.HWF.2.1
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    zp2.run();
                                                }
                                            });
                                        } else {
                                            com.bykv.vk.openvk.component.video.zp.KS.zp.zp(accept);
                                        }
                                    } catch (IOException e4) {
                                        HWF.zp("accept error", Log.getStackTraceString(e4));
                                        i9++;
                                        if (i9 > 3) {
                                            break;
                                        }
                                    }
                                } catch (Throwable th) {
                                    String stackTraceString = Log.getStackTraceString(th);
                                    Log.e("ProxyServer", "proxy server crashed!  ".concat(String.valueOf(stackTraceString)));
                                    HWF.zp("error", stackTraceString);
                                }
                            }
                            boolean z9 = COT.KS;
                            HWF.this.COT();
                        }
                    }
                } catch (IOException e9) {
                    if (COT.KS) {
                        Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(e9));
                    }
                    HWF.zp("create ServerSocket error", Log.getStackTraceString(e9));
                    HWF.this.COT();
                }
            }
        };
        this.tG = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    public static /* synthetic */ void zp(String str, String str2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void COT() {
        if (this.KS.compareAndSet(1, 2) || this.KS.compareAndSet(0, 2)) {
            com.bykv.vk.openvk.component.video.zp.KS.zp.zp(this.zp);
            HWF();
        }
    }

    private void HWF() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.ku) {
            try {
                int size = this.ku.size();
                for (int i9 = 0; i9 < size; i9++) {
                    SparseArray<Set<QR>> sparseArray = this.ku;
                    Set<QR> set = sparseArray.get(sparseArray.keyAt(i9));
                    if (set != null) {
                        arrayList.addAll(set);
                        set.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((QR) it.next()).zp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean QR() {
        com.bytedance.sdk.component.ku.QR qr = new com.bytedance.sdk.component.ku.QR(new zp(YW(), this.lMd), 5, 1);
        com.bytedance.sdk.component.ku.HWF.KS().submit(qr);
        ku();
        try {
            if (!((Boolean) qr.get()).booleanValue()) {
                Log.e("ProxyServer", "Ping error");
                COT();
                return false;
            }
            boolean z8 = COT.KS;
            return true;
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            COT();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String YW() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }

    private void ku() {
        Socket socket = null;
        try {
            socket = this.zp.accept();
            socket.setSoTimeout(2000);
            if ("Ping".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("OK\n".getBytes(com.bykv.vk.openvk.component.video.zp.KS.zp.zp));
                outputStream.flush();
            }
        } catch (IOException e4) {
            Log.getStackTraceString(e4);
        } finally {
            com.bykv.vk.openvk.component.video.zp.KS.zp.zp(socket);
        }
    }

    public KS KS() {
        return this.Bj;
    }

    public void jU() {
        if (this.tG.compareAndSet(false, true)) {
            Thread thread = new Thread(this.vDp);
            thread.setName("csj_proxy_server");
            thread.start();
        }
    }

    public KS lMd() {
        return this.dT;
    }

    public boolean zp(int i9, String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.ku) {
            Set<QR> set = this.ku.get(i9);
            if (set != null) {
                for (QR qr : set) {
                    if (qr != null && str.equals(qr.ku)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static HWF zp() {
        if (jU == null) {
            synchronized (HWF.class) {
                try {
                    if (jU == null) {
                        jU = new HWF();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return jU;
    }

    public void zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS ks) {
        this.COT = ks;
    }

    public void zp(com.bykv.vk.openvk.component.video.zp.lMd.zp.KS ks) {
        this.HWF = ks;
    }

    public String zp(boolean z8, boolean z9, String str, String... strArr) {
        String str2;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return strArr[0];
        }
        if (this.COT == null) {
            return strArr[0];
        }
        if ((z8 ? this.QR : this.HWF) == null) {
            return strArr[0];
        }
        if (this.KS.get() != 1) {
            return strArr[0];
        }
        List<String> zp2 = com.bykv.vk.openvk.component.video.zp.KS.zp.zp(strArr);
        if (zp2 == null) {
            return strArr[0];
        }
        String zp3 = YW.zp(str, z9 ? str : com.bykv.vk.openvk.component.video.api.HWF.lMd.zp(str), zp2);
        if (zp3 == null) {
            return strArr[0];
        }
        if (z8) {
            str2 = "https://" + YW() + ":" + this.lMd + "?f=1&" + zp3;
        } else {
            str2 = "https://" + YW() + ":" + this.lMd + "?" + zp3;
        }
        return str2.replaceFirst("s", "");
    }
}
