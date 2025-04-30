package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class COT implements KS {
    @Override // com.bytedance.adsdk.ugeno.core.KS
    public List<lMd> zp() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lMd("Text") { // from class: com.bytedance.adsdk.ugeno.core.COT.1
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.text.lMd(context);
            }
        });
        arrayList.add(new lMd("Image") { // from class: com.bytedance.adsdk.ugeno.core.COT.4
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.image.lMd(context);
            }
        });
        arrayList.add(new lMd("FlexLayout") { // from class: com.bytedance.adsdk.ugeno.core.COT.5
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.flexbox.COT(context);
            }
        });
        arrayList.add(new lMd("FrameLayout") { // from class: com.bytedance.adsdk.ugeno.core.COT.6
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.frame.zp(context);
            }
        });
        arrayList.add(new lMd("ScrollLayout") { // from class: com.bytedance.adsdk.ugeno.core.COT.7
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.scroll.zp(context);
            }
        });
        arrayList.add(new lMd("RichText") { // from class: com.bytedance.adsdk.ugeno.core.COT.8
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.text.zp(context);
            }
        });
        arrayList.add(new lMd("Input") { // from class: com.bytedance.adsdk.ugeno.core.COT.9
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.input.zp(context);
            }
        });
        arrayList.add(new lMd("Dislike") { // from class: com.bytedance.adsdk.ugeno.core.COT.10
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.dislike.zp(context);
            }
        });
        arrayList.add(new lMd("RatingBar") { // from class: com.bytedance.adsdk.ugeno.core.COT.11
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.ratingbar.zp(context);
            }
        });
        arrayList.add(new lMd("UgenProgressView") { // from class: com.bytedance.adsdk.ugeno.core.COT.2
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.progressbar.zp(context);
            }
        });
        arrayList.add(new lMd("ProgressButton") { // from class: com.bytedance.adsdk.ugeno.core.COT.3
            @Override // com.bytedance.adsdk.ugeno.core.lMd
            public com.bytedance.adsdk.ugeno.component.lMd zp(Context context) {
                return new com.bytedance.adsdk.ugeno.component.progressbar.zp(context);
            }
        });
        return arrayList;
    }
}
