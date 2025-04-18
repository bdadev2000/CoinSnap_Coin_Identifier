package com.bytedance.sdk.openadsdk.DSW;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.Sg.YFl.EH;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.NjR;
import com.bytedance.sdk.component.Sg.YFl.eT;
import com.bytedance.sdk.component.Sg.YFl.pDU;
import com.bytedance.sdk.component.Sg.YFl.tN;
import com.bytedance.sdk.component.Sg.YFl.vc;
import com.bytedance.sdk.component.Sg.YFl.wN;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class YFl implements INetWork {
    protected eT Sg;
    protected eT YFl;

    public YFl() {
        eT.YFl yFl = new eT.YFl();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.YFl = yFl.YFl(10L, timeUnit).Sg(10L, timeUnit).tN(10L, timeUnit).YFl();
        this.Sg = new eT.YFl().YFl(10L, timeUnit).Sg(30L, timeUnit).tN(30L, timeUnit).YFl();
    }

    private Map<String, String> YFl(vc vcVar) {
        if (vcVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < vcVar.YFl(); i10++) {
            hashMap.put(vcVar.YFl(i10), vcVar.Sg(i10));
        }
        return hashMap;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        String str2;
        EH Sg = this.YFl.YFl(new GA.YFl().YFl().Sg(str).Sg()).Sg();
        Map<String, String> YFl = YFl(Sg.DSW());
        if (Sg.tN() == 200) {
            str2 = Sg.vc().Sg();
        } else {
            str2 = null;
        }
        return new Response(YFl, str2, Sg.tN(), Sg.wN());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        wN.YFl yFl = new wN.YFl();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                yFl.YFl((String) pair.first, (String) pair.second);
            }
        }
        EH Sg = this.YFl.YFl(new GA.YFl().Sg(str).YFl((pDU) yFl.YFl()).Sg()).Sg();
        return new Response(YFl(Sg.DSW()), Sg.tN() == 200 ? Sg.vc().Sg() : null, Sg.tN(), Sg.wN());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0076: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:119), block:B:26:0x0076 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j3, BufferOutputStream bufferOutputStream) throws Exception {
        Exception e2;
        Closeable closeable;
        Closeable closeable2 = null;
        int i10 = 0;
        try {
            try {
                try {
                    EH Sg = this.Sg.YFl(new GA.YFl().YFl().Sg(str).Sg()).Sg();
                    int tN = Sg.tN();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(Sg.vc().tN());
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
                        } catch (Exception e10) {
                            e2 = e10;
                            i10 = tN;
                            throw new RuntimeException("downloadFile failed, code: " + i10 + ", url:" + str + ", caused by:" + e2.getMessage(), e2);
                        }
                    } catch (Exception e11) {
                        e2 = e11;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e12) {
                e2 = e12;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.YFl.YFl(new GA.YFl().YFl().Sg(str).Sg()).YFl(new tN() { // from class: com.bytedance.sdk.openadsdk.DSW.YFl.1
            @Override // com.bytedance.sdk.component.Sg.YFl.tN
            public void YFl(com.bytedance.sdk.component.Sg.YFl.Sg sg2, EH eh2) throws IOException {
            }

            @Override // com.bytedance.sdk.component.Sg.YFl.tN
            public void YFl(com.bytedance.sdk.component.Sg.YFl.Sg sg2, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        EH Sg = this.YFl.YFl(new GA.YFl().Sg(str).YFl(pDU.YFl(NjR.YFl("application/json; charset=utf-8"), str2)).Sg()).Sg();
        return new Response(YFl(Sg.DSW()), Sg.tN() == 200 ? Sg.vc().Sg() : null, Sg.tN(), Sg.wN());
    }
}
