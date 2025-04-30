package com.bykv.vk.openvk.component.video.zp.lMd;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.zp.lMd.YW;
import com.bykv.vk.openvk.component.video.zp.lMd.ku;
import com.bykv.vk.openvk.component.video.zp.lMd.vDp;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class lMd extends com.bykv.vk.openvk.component.video.zp.lMd.zp {
    private final InterfaceC0055lMd KVG;
    private final int dQp;
    final Object rV;
    final Object tG;
    private volatile com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd vwr;
    private volatile ku.zp woN;

    /* renamed from: com.bykv.vk.openvk.component.video.zp.lMd.lMd$lMd, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0055lMd {
        void zp(lMd lmd);
    }

    public lMd(zp zpVar) {
        super(zpVar.jU, zpVar.COT);
        this.dQp = zpVar.QR;
        this.KVG = zpVar.YW;
        this.tG = this;
        this.QR = zpVar.zp;
        this.ku = zpVar.lMd;
        this.HWF = zpVar.HWF;
        this.dT = zpVar.KS;
        this.YW = zpVar.ku;
        this.rV = zpVar.dT;
    }

    private boolean dT() throws com.bykv.vk.openvk.component.video.zp.lMd.KS.zp {
        while (this.dT.zp()) {
            COT();
            vDp.zp lMd = this.dT.lMd();
            try {
                zp(lMd);
                return true;
            } catch (com.bykv.vk.openvk.component.video.zp.lMd.KS.KS unused) {
                lMd.zp();
                QR();
            } catch (com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd e4) {
                this.vwr = e4;
                return false;
            } catch (ku.zp e9) {
                this.woN = e9;
                QR();
                return false;
            } catch (IOException e10) {
                if (e10 instanceof SocketTimeoutException) {
                    lMd.lMd();
                }
                if (!lMd()) {
                    QR();
                }
            } catch (Throwable unused2) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b8, code lost:
    
        KS();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bd, code lost:
    
        if (com.bykv.vk.openvk.component.video.zp.lMd.COT.KS == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bf, code lost:
    
        android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cb, code lost:
    
        com.bykv.vk.openvk.component.video.zp.KS.zp.zp(r6.jU());
        r4.zp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(com.bykv.vk.openvk.component.video.zp.lMd.vDp.zp r13) throws java.io.IOException, com.bykv.vk.openvk.component.video.zp.lMd.ku.zp, com.bykv.vk.openvk.component.video.zp.lMd.KS.zp, com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.zp.lMd.lMd.zp(com.bykv.vk.openvk.component.video.zp.lMd.vDp$zp):void");
    }

    public com.bykv.vk.openvk.component.video.zp.lMd.KS.lMd YW() {
        return this.vwr;
    }

    public ku.zp ku() {
        return this.woN;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.zp.zp(this.ku);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            dT();
        } catch (Throwable unused) {
        }
        this.jU.set(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.zp.lMd(this.ku);
        InterfaceC0055lMd interfaceC0055lMd = this.KVG;
        if (interfaceC0055lMd != null) {
            interfaceC0055lMd.zp(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class zp {
        com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS COT;
        List<YW.lMd> HWF;
        vDp KS;
        int QR;
        InterfaceC0055lMd YW;
        Object dT;
        com.bykv.vk.openvk.component.video.zp.lMd.zp.zp jU;
        YW ku;
        String lMd;
        String zp;

        public zp lMd(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.lMd = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        public zp zp(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.zp = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }

        public zp zp(vDp vdp) {
            if (vdp != null) {
                this.KS = vdp;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        public zp zp(com.bykv.vk.openvk.component.video.zp.lMd.zp.zp zpVar) {
            if (zpVar != null) {
                this.jU = zpVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        public zp zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS ks) {
            if (ks != null) {
                this.COT = ks;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        public zp zp(List<YW.lMd> list) {
            this.HWF = list;
            return this;
        }

        public zp zp(int i9) {
            this.QR = i9;
            return this;
        }

        public zp zp(InterfaceC0055lMd interfaceC0055lMd) {
            this.YW = interfaceC0055lMd;
            return this;
        }

        public zp zp(YW yw) {
            this.ku = yw;
            return this;
        }

        public zp zp(Object obj) {
            this.dT = obj;
            return this;
        }

        public lMd zp() {
            if (this.jU != null && this.COT != null && !TextUtils.isEmpty(this.zp) && !TextUtils.isEmpty(this.lMd) && this.KS != null) {
                return new lMd(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
