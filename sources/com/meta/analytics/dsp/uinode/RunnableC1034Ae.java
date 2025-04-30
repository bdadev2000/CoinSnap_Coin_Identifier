package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1034Ae implements Runnable {
    public static String[] A02 = {"gEStiipcoHuaINFMFSefmMs8iJ8", "n9ayDC2Q9LbczQUv6kNBUjfOQvpJ6m9Y", "YRdlhIvruMxBWPz1UYepqvzW8cflIkUe", "0jpFqemlukRtoq3k6JiQw6WgjYe", "0H8DdqCHvDwgvE7HdU", "qVWhNgbEjrOLZUtMFaOJ", "CHIZeJLHO", "Dnn7Swfx8SjzrQdnEympdOYUelCKsqZE"};
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C1038Ai A01;

    public RunnableC1034Ae(C1038Ai c1038Ai, Format format) {
        this.A01 = c1038Ai;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1039Aj interfaceC1039Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1039Aj = this.A01.A01;
            interfaceC1039Aj.AAr(this.A00);
        } catch (Throwable th) {
            String[] strArr = A02;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "vpLxvPT6UZiwGBmRNL53LnwHHIr";
            strArr2[3] = "jkYPOZ0t4IBxfDdfPMKN8YOHnot";
            KL.A00(th, this);
        }
    }
}
