package com.bykv.vk.openvk.component.video.zp.lMd;

import android.os.SystemClock;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import com.bykv.vk.openvk.component.video.zp.lMd.YW;
import com.bykv.vk.openvk.component.video.zp.lMd.ku;
import com.bykv.vk.openvk.component.video.zp.lMd.lMd;
import com.bykv.vk.openvk.component.video.zp.lMd.vDp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class QR extends com.bykv.vk.openvk.component.video.zp.lMd.zp {
    private volatile com.bykv.vk.openvk.component.video.zp.lMd.lMd KVG;
    private final jU dQp;
    private final KS rV;
    private final Socket tG;
    private volatile boolean woN;

    /* loaded from: classes.dex */
    public interface KS {
        void lMd(QR qr);

        void zp(QR qr);
    }

    /* loaded from: classes.dex */
    public static class lMd {
        private boolean KS;
        private int lMd;
        private final OutputStream zp;

        public lMd(OutputStream outputStream, int i9) {
            this.zp = outputStream;
            this.lMd = i9;
        }

        public void lMd(byte[] bArr, int i9, int i10) throws com.bykv.vk.openvk.component.video.zp.lMd.KS.jU {
            try {
                this.zp.write(bArr, i9, i10);
                this.lMd += i10;
            } catch (IOException e4) {
                throw new com.bykv.vk.openvk.component.video.zp.lMd.KS.jU(e4);
            }
        }

        public boolean zp() {
            return this.KS;
        }

        public void zp(byte[] bArr, int i9, int i10) throws com.bykv.vk.openvk.component.video.zp.lMd.KS.jU {
            if (this.KS) {
                return;
            }
            try {
                this.zp.write(bArr, i9, i10);
                this.KS = true;
            } catch (IOException e4) {
                throw new com.bykv.vk.openvk.component.video.zp.lMd.KS.jU(e4);
            }
        }

        public int lMd() {
            return this.lMd;
        }
    }

    public QR(zp zpVar) {
        super(zpVar.zp, zpVar.lMd);
        this.woN = true;
        this.tG = zpVar.KS;
        this.rV = zpVar.jU;
        this.dQp = jU.KS();
    }

    private void KS(lMd lmd, vDp.zp zpVar) throws ku.zp, com.bykv.vk.openvk.component.video.zp.lMd.KS.jU, IOException, com.bykv.vk.openvk.component.video.zp.lMd.KS.zp, com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd {
        if (this.woN) {
            File KS2 = this.zp.KS(this.ku);
            long length = KS2.length();
            com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zp2 = this.lMd.zp(this.ku, this.YW.KS.zp);
            int lMd2 = lmd.lMd();
            if (length > lmd.lMd()) {
                if (COT.KS) {
                    Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + (length - lMd2));
                }
                zp(zp2, KS2, lmd, zpVar);
                return;
            }
        } else {
            lmd.lMd();
        }
        jU(lmd, zpVar);
    }

    private void YW() {
        com.bykv.vk.openvk.component.video.zp.lMd.lMd lmd = this.KVG;
        this.KVG = null;
        if (lmd != null) {
            lmd.zp();
        }
    }

    private void jU(lMd lmd, vDp.zp zpVar) throws com.bykv.vk.openvk.component.video.zp.lMd.KS.jU, IOException, com.bykv.vk.openvk.component.video.zp.lMd.KS.zp, com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd {
        String zp2;
        ku kuVar;
        int i9;
        YW();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int lMd2 = lmd.lMd();
        com.bykv.vk.openvk.component.video.zp.lMd.COT.zp zp3 = zp(zpVar, lMd2, this.YW.KS.COT, "GET");
        if (zp3 == null) {
            return;
        }
        ku kuVar2 = null;
        int i10 = 0;
        try {
            zp2 = com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp3, false, true);
        } catch (Throwable th) {
            th = th;
        }
        if (zp2 == null) {
            com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zp4 = this.lMd.zp(this.ku, HWF());
            int zp5 = com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp3);
            if (zp4 != null && zp4.KS != zp5) {
                if (COT.KS) {
                    Log.e("TAG_PROXY_ProxyTask", "Content-Length not match, old: " + zp4.KS + ", " + zp5 + ", key: " + this.ku);
                }
                throw new com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd("Content-Length not match, old length: " + zp4.KS + ", new length: " + zp5 + ", rawKey: " + this.QR + ", currentUrl: " + zpVar + ", previousInfo: " + zp4.COT);
            }
            if (!lmd.zp()) {
                String zp6 = com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp3, lMd2);
                COT();
                byte[] bytes = zp6.getBytes(com.bykv.vk.openvk.component.video.zp.KS.zp.zp);
                lmd.zp(bytes, 0, bytes.length);
            }
            COT();
            File jU = this.zp.jU(this.ku);
            if (this.woN && jU != null && jU.length() >= lmd.lMd()) {
                com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp3, this.lMd, this.ku, this.YW.KS.zp);
                try {
                    kuVar = new ku(jU, "rwd");
                    try {
                        kuVar.zp(lmd.lMd());
                    } catch (Throwable th2) {
                        th = th2;
                        kuVar2 = kuVar;
                    }
                } catch (ku.zp unused) {
                    kuVar = null;
                }
                if (COT.KS) {
                    Log.i("TAG_PROXY_ProxyTask", "can write to cache file in network task, cache file size: " + jU.length() + ", from: " + lmd.lMd());
                }
            } else {
                if (COT.KS) {
                    Log.w("TAG_PROXY_ProxyTask", "can't write to cache file in network task, cache file size: " + jU.length() + ", from: " + lmd.lMd());
                }
                kuVar = null;
            }
            com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zp7 = this.lMd.zp(this.ku, HWF());
            if (zp7 == null) {
                i9 = 0;
            } else {
                i9 = zp7.KS;
            }
            byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
            InputStream jU2 = zp3.jU();
            int i11 = 0;
            while (true) {
                try {
                    int read = jU2.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    COT();
                    if (read > 0) {
                        lmd.lMd(bArr, 0, read);
                        i11 += read;
                        if (kuVar != null) {
                            try {
                                kuVar.zp(bArr, 0, read);
                            } catch (Throwable th3) {
                                kuVar.zp();
                                try {
                                    if (COT.KS) {
                                        Log.e("TAG_PROXY_ProxyTask", "append to cache file error in network task!!! " + Log.getStackTraceString(th3));
                                    }
                                    kuVar = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                        zp(i9, lmd.lMd());
                    }
                    COT();
                } catch (Throwable th5) {
                    th = th5;
                    kuVar2 = kuVar;
                }
                th = th5;
                kuVar2 = kuVar;
                i10 = i11;
                com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp3.jU());
                if (kuVar2 != null) {
                    kuVar2.zp();
                }
                this.KS.addAndGet(i10);
                this.jU.addAndGet(SystemClock.elapsedRealtime() - elapsedRealtime);
                throw th;
            }
            if (COT.KS) {
                Log.i("TAG_PROXY_ProxyTask", "read from net complete!");
            }
            KS();
            com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp3.jU());
            if (kuVar != null) {
                kuVar.zp();
            }
            this.KS.addAndGet(i11);
            this.jU.addAndGet(SystemClock.elapsedRealtime() - elapsedRealtime);
            return;
        }
        throw new com.bykv.vk.openvk.component.video.zp.lMd.KS.KS(zp2 + ", rawKey: " + this.QR + ", url: " + zpVar);
    }

    private lMd ku() {
        com.bykv.vk.openvk.component.video.zp.lMd.zp.zp zpVar;
        try {
            this.YW = YW.zp(this.tG.getInputStream());
            OutputStream outputStream = this.tG.getOutputStream();
            if (this.YW.KS.zp == 1) {
                zpVar = COT.zp;
            } else {
                zpVar = COT.lMd;
            }
            if (zpVar == null) {
                if (COT.KS) {
                    Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.zp = zpVar;
            this.QR = this.YW.KS.lMd;
            this.ku = this.YW.KS.KS;
            this.dT = new vDp(this.YW.KS.QR);
            this.HWF = this.YW.lMd;
            if (COT.KS) {
                Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.YW.toString());
            }
            return new lMd(outputStream, this.YW.KS.jU);
        } catch (YW.jU e4) {
            com.bykv.vk.openvk.component.video.zp.KS.zp.zp(this.tG);
            if (COT.KS) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e4));
            }
            if (this.zp != null) {
                QR();
            }
            return null;
        } catch (IOException e9) {
            com.bykv.vk.openvk.component.video.zp.KS.zp.zp(this.tG);
            if (COT.KS) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e9));
            }
            if (this.zp != null) {
                QR();
            }
            return null;
        }
    }

    private void lMd(lMd lmd, vDp.zp zpVar) throws IOException, com.bykv.vk.openvk.component.video.zp.lMd.KS.jU {
        byte[] zp2 = zp(this.lMd.zp(this.ku, this.YW.KS.zp), lmd, zpVar);
        if (zp2 == null) {
            return;
        }
        lmd.zp(zp2, 0, zp2.length);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zp2;
        lMd ku = ku();
        if (ku == null) {
            return;
        }
        KS ks = this.rV;
        if (ks != null) {
            ks.zp(this);
        }
        this.zp.zp(this.ku);
        if (COT.ku != 0 && ((zp2 = this.lMd.zp(this.ku, this.YW.KS.zp)) == null || this.zp.KS(this.ku).length() < zp2.KS)) {
            this.dQp.zp(QR(), this.ku);
        }
        try {
            zp(ku);
        } catch (com.bykv.vk.openvk.component.video.zp.lMd.KS.zp e4) {
            if (COT.KS) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e4));
            }
        } catch (Throwable th) {
            if (COT.KS) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(th));
            }
        }
        this.zp.lMd(this.ku);
        this.dQp.zp(QR(), null);
        zp();
        com.bykv.vk.openvk.component.video.zp.KS.zp.zp(this.tG);
        KS ks2 = this.rV;
        if (ks2 != null) {
            ks2.lMd(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class zp {
        Socket KS;
        KS jU;
        com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS lMd;
        com.bykv.vk.openvk.component.video.zp.lMd.zp.zp zp;

        public zp zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS ks) {
            if (ks != null) {
                this.lMd = ks;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        public zp zp(Socket socket) {
            if (socket != null) {
                this.KS = socket;
                return this;
            }
            throw new IllegalArgumentException("socket == null");
        }

        public zp zp(KS ks) {
            this.jU = ks;
            return this;
        }

        public QR zp() {
            if (this.lMd != null && this.KS != null) {
                return new QR(this);
            }
            throw new IllegalArgumentException();
        }
    }

    private boolean zp(lMd lmd) throws com.bykv.vk.openvk.component.video.zp.lMd.KS.zp {
        while (this.dT.zp()) {
            COT();
            vDp.zp lMd2 = this.dT.lMd();
            try {
                zp(lmd, lMd2);
                return true;
            } catch (com.bykv.vk.openvk.component.video.zp.lMd.KS.KS unused) {
                lMd2.zp();
                QR();
            } catch (com.bykv.vk.openvk.component.video.zp.lMd.KS.jU e4) {
                if (COT.KS) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e4));
                }
                return true;
            } catch (com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd e9) {
                if (COT.KS) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e9));
                }
                return false;
            } catch (ku.zp e10) {
                if (COT.KS) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e10));
                }
                this.woN = false;
                QR();
            } catch (IOException e11) {
                if (e11 instanceof SocketTimeoutException) {
                    lMd2.lMd();
                }
                if (lMd()) {
                    if (COT.KS) {
                        if ("Canceled".equalsIgnoreCase(e11.getMessage())) {
                            Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                        } else {
                            Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e11));
                        }
                    }
                } else {
                    QR();
                }
            } catch (Exception e12) {
                if (COT.KS) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e12));
                }
            }
        }
        return false;
    }

    private void zp(lMd lmd, vDp.zp zpVar) throws com.bykv.vk.openvk.component.video.zp.lMd.KS.jU, IOException, ku.zp, com.bykv.vk.openvk.component.video.zp.lMd.KS.zp, com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd {
        if ("HEAD".equalsIgnoreCase(this.YW.zp.zp)) {
            lMd(lmd, zpVar);
        } else {
            KS(lmd, zpVar);
        }
    }

    private byte[] zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zpVar, lMd lmd, vDp.zp zpVar2) throws IOException {
        if (zpVar != null) {
            if (COT.KS) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zpVar, lmd.lMd()).getBytes(com.bykv.vk.openvk.component.video.zp.KS.zp.zp);
        }
        com.bykv.vk.openvk.component.video.zp.lMd.COT.zp zp2 = zp(zpVar2, 0, -1, "HEAD");
        if (zp2 == null) {
            return null;
        }
        try {
            String zp3 = com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp2, false, false);
            if (zp3 == null) {
                com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zp4 = com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp2, this.lMd, this.ku, this.YW.KS.zp);
                if (COT.KS) {
                    Log.w("TAG_PROXY_ProxyTask", "get header from network");
                }
                byte[] bytes = com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp4, lmd.lMd()).getBytes(com.bykv.vk.openvk.component.video.zp.KS.zp.zp);
                com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp2.jU());
                return bytes;
            }
            throw new com.bykv.vk.openvk.component.video.zp.lMd.KS.KS(zp3 + ", rawKey: " + this.QR + ", url: " + zpVar2);
        } catch (Throwable th) {
            com.bykv.vk.openvk.component.video.zp.KS.zp.zp(zp2.jU());
            throw th;
        }
    }

    private void zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp zpVar, File file, lMd lmd, vDp.zp zpVar2) throws IOException, com.bykv.vk.openvk.component.video.zp.lMd.KS.jU, ku.zp, com.bykv.vk.openvk.component.video.zp.lMd.KS.zp, com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd {
        final com.bytedance.sdk.component.ku.QR qr;
        com.bykv.vk.openvk.component.video.zp.lMd.lMd lmd2;
        if (!lmd.zp()) {
            byte[] zp2 = zp(zpVar, lmd, zpVar2);
            COT();
            if (zp2 == null) {
                return;
            } else {
                lmd.zp(zp2, 0, zp2.length);
            }
        }
        ku kuVar = null;
        if (zpVar == null && (zpVar = this.lMd.zp(this.ku, this.YW.KS.zp)) == null) {
            if (COT.KS) {
                Log.e("TAG_PROXY_ProxyTask", "failed to get video header info from db");
            }
            zp(null, lmd, zpVar2);
            zpVar = this.lMd.zp(this.ku, this.YW.KS.zp);
            if (zpVar == null) {
                throw new com.bykv.vk.openvk.component.video.zp.lMd.KS.KS("failed to get header, rawKey: " + this.QR + ", url: " + zpVar2);
            }
        }
        if (file.length() >= zpVar.KS || !((lmd2 = this.KVG) == null || lmd2.lMd() || lmd2.jU())) {
            qr = null;
        } else {
            com.bykv.vk.openvk.component.video.zp.lMd.lMd zp3 = new lMd.zp().zp(this.zp).zp(this.lMd).zp(this.QR).lMd(this.ku).zp(new vDp(zpVar2.zp)).zp(this.HWF).zp(this.YW).zp(new lMd.InterfaceC0055lMd() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.QR.1
                @Override // com.bykv.vk.openvk.component.video.zp.lMd.lMd.InterfaceC0055lMd
                public void zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd lmd3) {
                    QR.this.KS.addAndGet(lmd3.KS.get());
                    QR.this.jU.addAndGet(lmd3.jU.get());
                    synchronized (lmd3.tG) {
                        lmd3.tG.notifyAll();
                    }
                    if (lmd3.jU()) {
                        QR.this.dQp.zp(QR.this.QR(), null);
                    }
                }
            }).zp();
            this.KVG = zp3;
            qr = new com.bytedance.sdk.component.ku.QR(zp3, null, 10, 1);
            com.bytedance.sdk.component.ku.HWF.lMd(new com.bytedance.sdk.component.ku.ku("processCacheNetWorkConcurrent") { // from class: com.bykv.vk.openvk.component.video.zp.lMd.QR.2
                @Override // java.lang.Runnable
                public void run() {
                    qr.run();
                }
            });
            if (COT.KS) {
                Log.e("TAG_PROXY_ProxyTask", "fire download in process cache task");
            }
        }
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        try {
            ku kuVar2 = new ku(file, CampaignEx.JSON_KEY_AD_R);
            try {
                kuVar2.zp(lmd.lMd());
                int min = this.YW.KS.COT > 0 ? Math.min(zpVar.KS, this.YW.KS.COT) : zpVar.KS;
                while (lmd.lMd() < min) {
                    COT();
                    int zp4 = kuVar2.zp(bArr);
                    if (zp4 <= 0) {
                        com.bykv.vk.openvk.component.video.zp.lMd.lMd lmd3 = this.KVG;
                        if (lmd3 != null) {
                            com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd YW = lmd3.YW();
                            if (YW == null) {
                                ku.zp ku = lmd3.ku();
                                if (ku != null) {
                                    throw ku;
                                }
                            } else {
                                throw YW;
                            }
                        }
                        if (lmd3 != null && !lmd3.lMd() && !lmd3.jU()) {
                            COT();
                            synchronized (lmd3.tG) {
                                try {
                                    lmd3.tG.wait(1000L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        if (COT.KS) {
                            Log.e("TAG_PROXY_ProxyTask", "download task has finished!!!");
                        }
                        throw new com.bykv.vk.openvk.component.video.zp.lMd.KS.KS("illegal state download task has finished, rawKey: " + this.QR + ", url: " + zpVar2);
                    }
                    lmd.lMd(bArr, 0, zp4);
                    COT();
                }
                if (COT.KS) {
                    Log.i("TAG_PROXY_ProxyTask", "read cache file complete: " + lmd.lMd() + ", " + min);
                }
                KS();
                kuVar2.zp();
                if (qr != null) {
                    try {
                        qr.get();
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                kuVar = kuVar2;
                if (kuVar != null) {
                    kuVar.zp();
                }
                if (qr != null) {
                    try {
                        qr.get();
                    } catch (Throwable unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.zp
    public void zp() {
        super.zp();
        YW();
    }
}
