package com.bytedance.adsdk.ugeno.NjR.wN;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.DSW.tN;

/* loaded from: classes.dex */
public class Sg extends com.bytedance.adsdk.ugeno.Sg.Sg<YFl> {
    private static final int ECi = Color.parseColor("#FFC642");
    private static final int VJb = Color.parseColor("#e3e3e4");
    private float Gmi;
    private int Gnp;
    private int YFl;
    private float dU;

    /* renamed from: ni, reason: collision with root package name */
    private float f10244ni;

    public Sg(Context context) {
        super(context);
        this.YFl = ECi;
        this.Gnp = VJb;
        this.f10244ni = 4.0f;
        this.Gmi = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
        if (Ga()) {
            ((YFl) this.wN).YFl(this.f10244ni, this.YFl, this.Gnp, this.Gmi, (int) this.dU);
        } else {
            ((YFl) this.wN).YFl(this.f10244ni, this.YFl, this.Gnp, this.Gmi, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public YFl AlY() {
        YFl yFl = new YFl(this.Sg);
        yFl.YFl(this);
        return yFl;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(String str, String str2) {
        super.YFl(str, str2);
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1810866385:
                if (str.equals("highLightColor")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1804390815:
                if (str.equals("lowLightColor")) {
                    c10 = 1;
                    break;
                }
                break;
            case 102102:
                if (str.equals("gap")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109264530:
                if (str.equals("score")) {
                    c10 = 4;
                    break;
                }
                break;
            case 490636047:
                if (str.equals("highlightColor")) {
                    c10 = 5;
                    break;
                }
                break;
            case 497111617:
                if (str.equals("lowlightColor")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                this.YFl = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
                return;
            case 1:
            case 6:
                this.Gnp = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2, VJb);
                return;
            case 2:
                this.dU = tN.YFl(str2, 0.0f);
                return;
            case 3:
                this.Gmi = tN.YFl(str2, 20.0f);
                return;
            case 4:
                this.f10244ni = tN.YFl(str2, 4.0f);
                return;
            default:
                return;
        }
    }
}
