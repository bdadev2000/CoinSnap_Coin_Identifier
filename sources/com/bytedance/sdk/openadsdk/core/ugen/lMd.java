package com.bytedance.sdk.openadsdk.core.ugen;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class lMd {
    public static void zp(Context context) {
        com.bytedance.adsdk.ugeno.KS.zp().zp(context, new com.bytedance.adsdk.ugeno.core.KS() { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.1
            @Override // com.bytedance.adsdk.ugeno.core.KS
            public List<com.bytedance.adsdk.ugeno.core.lMd> zp() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.bytedance.adsdk.ugeno.core.lMd("Gif") { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.1.1
                    @Override // com.bytedance.adsdk.ugeno.core.lMd
                    public com.bytedance.adsdk.ugeno.component.lMd zp(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.lMd(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.lMd("Lottie") { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.1.2
                    @Override // com.bytedance.adsdk.ugeno.core.lMd
                    public com.bytedance.adsdk.ugeno.component.lMd zp(Context context2) {
                        return new com.bytedance.adsdk.lMd.zp(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.lMd("Logo") { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.1.3
                    @Override // com.bytedance.adsdk.ugeno.core.lMd
                    public com.bytedance.adsdk.ugeno.component.lMd zp(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.KS(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.lMd("CommentNum") { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.1.4
                    @Override // com.bytedance.adsdk.ugeno.core.lMd
                    public com.bytedance.adsdk.ugeno.component.lMd zp(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.zp(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.lMd("Video") { // from class: com.bytedance.sdk.openadsdk.core.ugen.lMd.1.5
                    @Override // com.bytedance.adsdk.ugeno.core.lMd
                    public com.bytedance.adsdk.ugeno.component.lMd zp(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.video.zp(context2);
                    }
                });
                return arrayList;
            }
        }, new zp());
    }
}
