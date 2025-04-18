package com.bytedance.adsdk.ugeno.YFl.Sg;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class Sg extends YFl {

    /* renamed from: com.bytedance.adsdk.ugeno.YFl.Sg.Sg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ugeno.YFl.AlY.values().length];
            YFl = iArr;
            try {
                iArr[com.bytedance.adsdk.ugeno.YFl.AlY.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[com.bytedance.adsdk.ugeno.YFl.AlY.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[com.bytedance.adsdk.ugeno.YFl.AlY.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                YFl[com.bytedance.adsdk.ugeno.YFl.AlY.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                YFl[com.bytedance.adsdk.ugeno.YFl.AlY.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                YFl[com.bytedance.adsdk.ugeno.YFl.AlY.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                YFl[com.bytedance.adsdk.ugeno.YFl.AlY.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                YFl[com.bytedance.adsdk.ugeno.YFl.AlY.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                YFl[com.bytedance.adsdk.ugeno.YFl.AlY.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public Sg(Context context, com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, TreeMap<Float, String> treeMap) {
        super(context, sg2, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public void Sg() {
        float YoT;
        switch (AnonymousClass1.YFl[this.AlY.ordinal()]) {
            case 1:
                YoT = this.DSW.YoT();
                break;
            case 2:
                YoT = this.DSW.GA();
                break;
            case 3:
                YoT = this.DSW.pDU();
                break;
            case 4:
                YoT = this.DSW.EH();
                break;
            case 5:
                YoT = this.DSW.rkt();
                break;
            case 6:
                YoT = this.DSW.lG();
                break;
            case 7:
                YoT = this.DSW.Wwa();
                break;
            case 8:
                YoT = this.DSW.qO();
                break;
            case 9:
                YoT = this.DSW.aIu();
                break;
            default:
                YoT = 0.0f;
                break;
        }
        this.wN.add(Keyframe.ofFloat(0.0f, YoT));
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public void YFl(float f10, String str) {
        float YFl;
        if (!this.Sg.startsWith(com.bytedance.adsdk.ugeno.YFl.AlY.TRANSLATE.YFl()) && this.AlY != com.bytedance.adsdk.ugeno.YFl.AlY.BORDER_RADIUS) {
            YFl = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str, 0.0f);
        } else {
            YFl = qsH.YFl(this.YFl, com.bytedance.adsdk.ugeno.DSW.tN.YFl(str, 0.0f));
        }
        this.wN.add(Keyframe.ofFloat(f10, YFl));
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public TypeEvaluator vc() {
        return new FloatEvaluator();
    }
}
