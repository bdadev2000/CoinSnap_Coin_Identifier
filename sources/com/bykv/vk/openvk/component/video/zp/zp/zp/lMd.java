package com.bykv.vk.openvk.component.video.zp.zp.zp;

import Q7.n0;
import android.content.Context;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.tG;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class lMd implements KS {
    private long COT;
    private File KS;
    private RandomAccessFile YW;
    private final com.bykv.vk.openvk.component.video.api.KS.KS dT;
    private File jU;
    private volatile long zp = -2147483648L;
    private final Object lMd = new Object();
    private volatile long HWF = -1;
    private volatile boolean QR = false;
    private volatile boolean ku = false;

    public lMd(Context context, com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        this.COT = 0L;
        this.YW = null;
        this.dT = ks;
        try {
            this.KS = com.bykv.vk.openvk.component.video.zp.COT.lMd.lMd(ks.lMd(), ks.rV());
            this.jU = com.bykv.vk.openvk.component.video.zp.COT.lMd.KS(ks.lMd(), ks.rV());
            if (jU()) {
                this.YW = new RandomAccessFile(this.jU, CampaignEx.JSON_KEY_AD_R);
            } else {
                this.YW = new RandomAccessFile(this.KS, "rw");
            }
            if (!jU()) {
                this.COT = this.KS.length();
                zp();
            }
        } catch (Throwable unused) {
            ks.tG();
        }
    }

    private long COT() {
        if (jU()) {
            return this.jU.length();
        }
        return this.KS.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HWF() throws IOException {
        synchronized (this.lMd) {
            if (jU()) {
                this.dT.tG();
                this.dT.rV();
                return;
            }
            try {
            } finally {
                return;
            }
            if (this.KS.renameTo(this.jU)) {
                RandomAccessFile randomAccessFile = this.YW;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.YW = new RandomAccessFile(this.jU, "rw");
                this.dT.rV();
                this.dT.tG();
                return;
            }
            throw new IOException("Error renaming file " + this.KS + " to " + this.jU + " for completion!");
        }
    }

    private boolean jU() {
        return this.jU.exists();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.zp.zp.KS
    public long KS() throws IOException {
        if (jU()) {
            this.zp = this.jU.length();
        } else {
            synchronized (this.lMd) {
                int i9 = 0;
                do {
                    try {
                        if (this.zp == -2147483648L) {
                            i9 += 15;
                            try {
                                this.lMd.wait(5L);
                            } catch (InterruptedException unused) {
                                throw new IOException("total length InterruptException");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } while (i9 <= 20000);
                return -1L;
            }
        }
        return this.zp;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.zp.zp.KS
    public void lMd() {
        try {
            if (!this.QR) {
                this.YW.close();
            }
            File file = this.KS;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.jU;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.QR = true;
    }

    public void zp() {
        Bj.zp zpVar;
        if (com.bykv.vk.openvk.component.video.api.KS.jU() != null) {
            zpVar = com.bykv.vk.openvk.component.video.api.KS.jU().lMd();
        } else {
            zpVar = new Bj.zp("v_cache");
        }
        long KVG = this.dT.KVG();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zpVar.zp(KVG, timeUnit).lMd(this.dT.woN(), timeUnit).KS(this.dT.vwr(), timeUnit);
        Bj zp = zpVar.zp();
        this.dT.rV();
        zp.zp(new tG.zp().zp("RANGE", n0.k(new StringBuilder("bytes="), this.COT, "-")).lMd(this.dT.tG()).zp().zp("videoLoadWhenPlaying").zp(9).lMd()).zp(new com.bytedance.sdk.component.lMd.zp.KS() { // from class: com.bykv.vk.openvk.component.video.zp.zp.zp.lMd.1
            @Override // com.bytedance.sdk.component.lMd.zp.KS
            public void zp(com.bytedance.sdk.component.lMd.zp.lMd lmd, IOException iOException) {
                lMd.this.ku = false;
                lMd.this.zp = -1L;
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x00c0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0079 A[SYNTHETIC] */
            @Override // com.bytedance.sdk.component.lMd.zp.KS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void zp(com.bytedance.sdk.component.lMd.zp.lMd r17, com.bytedance.sdk.component.lMd.zp.dQp r18) throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 455
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.zp.zp.zp.lMd.AnonymousClass1.zp(com.bytedance.sdk.component.lMd.zp.lMd, com.bytedance.sdk.component.lMd.zp.dQp):void");
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.zp.zp.zp.KS
    public int zp(long j7, byte[] bArr, int i9, int i10) throws IOException {
        try {
            if (j7 == this.zp) {
                return -1;
            }
            int i11 = 0;
            int i12 = 0;
            while (!this.QR) {
                synchronized (this.lMd) {
                    try {
                        if (j7 < COT()) {
                            this.YW.seek(j7);
                            i12 = this.YW.read(bArr, i9, i10);
                        } else {
                            i11 += 33;
                            this.lMd.wait(33L);
                        }
                    } finally {
                    }
                }
                if (i12 > 0) {
                    return i12;
                }
                if (i11 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }
}
