package com.bytedance.sdk.openadsdk.core.eT.tN;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.AlY.Sg;
import com.bytedance.adsdk.ugeno.core.GA;
import com.bytedance.adsdk.ugeno.core.NjR;
import com.bytedance.adsdk.ugeno.core.YoT;
import com.bytedance.adsdk.ugeno.core.nc;
import com.bytedance.sdk.openadsdk.core.eT.wN.AlY;
import com.bytedance.sdk.openadsdk.utils.mn;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements GA, YoT {
    private GA AlY;
    private com.bytedance.adsdk.ugeno.Sg.Sg<View> Sg;
    private final Context YFl;
    private InterfaceC0127YFl tN;

    /* renamed from: com.bytedance.sdk.openadsdk.core.eT.tN.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0127YFl {
        void YFl(nc ncVar);
    }

    public YFl(Context context) {
        this.YFl = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(JSONObject jSONObject, JSONObject jSONObject2, AlY alY) {
        try {
            NjR njR = new NjR(this.YFl);
            com.bytedance.adsdk.ugeno.Sg.Sg<View> YFl = njR.YFl(jSONObject);
            this.Sg = YFl;
            if (YFl == null) {
                if (alY != null) {
                    alY.YFl(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View NjR = YFl.NjR();
            if (NjR != null) {
                NjR.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.eT.tN.YFl.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            njR.YFl((YoT) this);
            njR.YFl((GA) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.YoT.YFl());
                    jSONObject2.put("os", "Android");
                } catch (JSONException unused) {
                }
            }
            njR.Sg(jSONObject2);
            if (alY != null) {
                alY.YFl(this.Sg);
            }
        } catch (Exception e2) {
            if (alY != null) {
                alY.YFl(3000, "ugen render fail exception is" + e2.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.YoT
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, Sg.YFl yFl) {
    }

    public void YFl(final JSONObject jSONObject, final JSONObject jSONObject2, final AlY alY) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Sg(jSONObject, jSONObject2, alY);
        } else {
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.eT.tN.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    YFl.this.Sg(jSONObject, jSONObject2, alY);
                }
            });
        }
    }

    public void YFl(InterfaceC0127YFl interfaceC0127YFl) {
        this.tN = interfaceC0127YFl;
    }

    public void YFl(GA ga2) {
        this.AlY = ga2;
    }

    @Override // com.bytedance.adsdk.ugeno.core.YoT
    public void YFl(nc ncVar, YoT.Sg sg2, YoT.YFl yFl) {
        InterfaceC0127YFl interfaceC0127YFl;
        if (ncVar == null) {
            return;
        }
        if ((ncVar.Sg() == 1 || ncVar.Sg() == 4) && (interfaceC0127YFl = this.tN) != null) {
            interfaceC0127YFl.YFl(ncVar);
        }
        if (sg2 == null || ncVar.AlY() == null) {
            return;
        }
        sg2.YFl(ncVar.AlY());
    }

    @Override // com.bytedance.adsdk.ugeno.core.GA
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, MotionEvent motionEvent) {
        GA ga2 = this.AlY;
        if (ga2 != null) {
            ga2.YFl(sg2, motionEvent);
        }
    }
}
