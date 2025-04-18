package com.bytedance.adsdk.ugeno.YFl.Sg;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class tN extends YFl {
    public tN(Context context, com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, TreeMap<Float, String> treeMap) {
        super(context, sg2, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public void Sg() {
        if (this.AlY == com.bytedance.adsdk.ugeno.YFl.AlY.BACKGROUND_COLOR) {
            this.wN.add(Keyframe.ofInt(0.0f, this.DSW.Sco()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public void YFl(float f10, String str) {
        Keyframe ofInt;
        if (this.AlY == com.bytedance.adsdk.ugeno.YFl.AlY.BACKGROUND_COLOR) {
            ofInt = Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str));
        } else {
            ofInt = Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.DSW.tN.YFl(str, 0));
        }
        this.wN.add(ofInt);
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public TypeEvaluator vc() {
        if (this.AlY == com.bytedance.adsdk.ugeno.YFl.AlY.BACKGROUND_COLOR) {
            return new ArgbEvaluator();
        }
        return new IntEvaluator();
    }
}
