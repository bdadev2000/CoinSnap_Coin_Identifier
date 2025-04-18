package com.bytedance.adsdk.ugeno.AlY;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class YFl implements AlY {
    @Override // com.bytedance.adsdk.ugeno.AlY.AlY
    public List<tN> YFl() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new tN("slide") { // from class: com.bytedance.adsdk.ugeno.AlY.YFl.1
            @Override // com.bytedance.adsdk.ugeno.AlY.tN
            public com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl(Context context) {
                return new com.bytedance.adsdk.ugeno.AlY.Sg.Sg(context);
            }
        });
        arrayList.add(new tN("tap") { // from class: com.bytedance.adsdk.ugeno.AlY.YFl.2
            @Override // com.bytedance.adsdk.ugeno.AlY.tN
            public com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl(Context context) {
                return new com.bytedance.adsdk.ugeno.AlY.Sg.tN(context);
            }
        });
        arrayList.add(new tN("timer") { // from class: com.bytedance.adsdk.ugeno.AlY.YFl.3
            @Override // com.bytedance.adsdk.ugeno.AlY.tN
            public com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl(Context context) {
                return new com.bytedance.adsdk.ugeno.AlY.Sg.AlY(context);
            }
        });
        return arrayList;
    }
}
