package com.bytedance.adsdk.ugeno.YFl.YFl;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg extends YFl {
    private int AlY;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private Paint f10264vc;
    private int wN;

    public Sg(com.bytedance.adsdk.ugeno.Sg.Sg sg2, JSONObject jSONObject) {
        super(sg2, jSONObject);
        Paint paint = new Paint();
        this.f10264vc = paint;
        paint.setAntiAlias(true);
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.YFl.YFl
    public void Sg() {
        this.tN = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(this.YFl.optString("bgColor"));
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.YFl.YFl
    public void YFl(Canvas canvas) {
        try {
            this.f10264vc.setColor(this.tN);
            this.f10264vc.setAlpha(90);
            canvas.drawCircle(this.AlY, this.wN, Math.min(r0, r2) * 2 * this.Sg.mB(), this.f10264vc);
        } catch (Throwable th2) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.YFl.YFl
    public List<PropertyValuesHolder> tN() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(AlY(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.YFl.YFl
    public void YFl(int i10, int i11) {
        this.AlY = i10 / 2;
        this.wN = i11 / 2;
    }
}
