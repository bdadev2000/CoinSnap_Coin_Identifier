package com.bytedance.adsdk.ugeno.YFl.YFl;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN extends YFl {
    private int AlY;
    private Path DSW;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private Paint f10265vc;
    private int wN;

    public tN(com.bytedance.adsdk.ugeno.Sg.Sg sg2, JSONObject jSONObject) {
        super(sg2, jSONObject);
        Paint paint = new Paint();
        this.f10265vc = paint;
        paint.setAntiAlias(true);
        this.DSW = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.YFl.YFl
    public void Sg() {
        this.wN = this.YFl.optInt("shineWidth", 30);
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.YFl.YFl
    public void YFl(Canvas canvas) {
        int UI = ((int) (this.Sg.UI() * ((this.AlY * 2) + ((this.wN * 2) + (this.tN * 4))))) - ((this.AlY * 2) + this.wN);
        float f10 = UI;
        int i10 = this.wN;
        this.f10265vc.setShader(new LinearGradient(f10, 0.0f, ((i10 + r4) / 2.0f) + f10, this.AlY / 2.0f, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
        this.f10265vc.setStrokeWidth(this.tN * 2);
        Path path = this.DSW;
        if (path != null) {
            canvas.clipPath(path, Region.Op.INTERSECT);
        }
        int i11 = UI + this.wN;
        canvas.drawLine(f10, 0.0f, i11 + r1, this.AlY, this.f10265vc);
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
        this.tN = i10 / 2;
        this.AlY = i11 / 2;
        float f10 = i11;
        RectF rectF = new RectF(0.0f, 0.0f, i10, f10);
        float f11 = f10 / 2.0f;
        this.DSW.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }
}
