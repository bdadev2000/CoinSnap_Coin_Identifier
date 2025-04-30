package com.bytedance.sdk.openadsdk.jU;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.COT;
import com.bytedance.sdk.component.lMd.zp.HWF;
import com.bytedance.sdk.component.lMd.zp.KS;
import com.bytedance.sdk.component.lMd.zp.YW;
import com.bytedance.sdk.component.lMd.zp.dQp;
import com.bytedance.sdk.component.lMd.zp.rV;
import com.bytedance.sdk.component.lMd.zp.tG;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class zp implements INetWork {
    protected Bj lMd;
    protected Bj zp;

    public zp() {
        Bj.zp zpVar = new Bj.zp();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.zp = zpVar.zp(10L, timeUnit).lMd(10L, timeUnit).KS(10L, timeUnit).zp();
        this.lMd = new Bj.zp().zp(10L, timeUnit).lMd(30L, timeUnit).KS(30L, timeUnit).zp();
    }

    private Map<String, String> zp(HWF hwf) {
        if (hwf == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i9 = 0; i9 < hwf.zp(); i9++) {
            hashMap.put(hwf.zp(i9), hwf.lMd(i9));
        }
        return hashMap;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        String str2;
        dQp zp = this.zp.zp(new tG.zp().zp().lMd(str).lMd()).zp();
        Map<String, String> zp2 = zp(zp.QR());
        if (zp.KS() == 200) {
            str2 = zp.HWF().lMd();
        } else {
            str2 = null;
        }
        return new Response(zp2, str2, zp.KS(), zp.COT());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        COT.zp zpVar = new COT.zp();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                zpVar.zp((String) pair.first, (String) pair.second);
            }
        }
        dQp zp = this.zp.zp(new tG.zp().lMd(str).zp((rV) zpVar.zp()).lMd()).zp();
        return new Response(zp(zp.QR()), zp.KS() == 200 ? zp.HWF().lMd() : null, zp.KS(), zp.COT());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j7, BufferOutputStream bufferOutputStream) throws Exception {
        BufferedInputStream bufferedInputStream;
        Exception e4;
        int KS;
        BufferedInputStream bufferedInputStream2 = null;
        int i9 = 0;
        try {
            try {
                dQp zp = this.lMd.zp(new tG.zp().zp().lMd(str).lMd()).zp();
                KS = zp.KS();
                try {
                    bufferedInputStream = new BufferedInputStream(zp.HWF().KS());
                } catch (Exception e9) {
                    bufferedInputStream = null;
                    e4 = e9;
                }
            } catch (Throwable th) {
                th = th;
                CloseableUtils.close(bufferedInputStream2);
                throw th;
            }
        } catch (Exception e10) {
            bufferedInputStream = null;
            e4 = e10;
        }
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read != -1) {
                        bufferOutputStream.write(bArr, 0, read);
                    } else {
                        CloseableUtils.close(bufferedInputStream);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream2 = bufferedInputStream;
                CloseableUtils.close(bufferedInputStream2);
                throw th;
            }
        } catch (Exception e11) {
            e4 = e11;
            i9 = KS;
            throw new RuntimeException("downloadFile failed, code: " + i9 + ", url:" + str + ", caused by:" + e4.getMessage(), e4);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.zp.zp(new tG.zp().zp().lMd(str).lMd()).zp(new KS() { // from class: com.bytedance.sdk.openadsdk.jU.zp.1
            @Override // com.bytedance.sdk.component.lMd.zp.KS
            public void zp(com.bytedance.sdk.component.lMd.zp.lMd lmd, dQp dqp) throws IOException {
            }

            @Override // com.bytedance.sdk.component.lMd.zp.KS
            public void zp(com.bytedance.sdk.component.lMd.zp.lMd lmd, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        dQp zp = this.zp.zp(new tG.zp().lMd(str).zp(rV.zp(YW.zp("application/json; charset=utf-8"), str2)).lMd()).zp();
        return new Response(zp(zp.QR()), zp.KS() == 200 ? zp.HWF().lMd() : null, zp.KS(), zp.COT());
    }
}
