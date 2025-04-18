package com.bytedance.adsdk.ugeno.YFl.Sg;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class AlY extends YFl {
    private List<Keyframe> qsH;

    /* renamed from: com.bytedance.adsdk.ugeno.YFl.Sg.AlY$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ugeno.YFl.AlY.values().length];
            YFl = iArr;
            try {
                iArr[com.bytedance.adsdk.ugeno.YFl.AlY.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[com.bytedance.adsdk.ugeno.YFl.AlY.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AlY(Context context, com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, Map<Float, String> map) {
        super(context, sg2, str, map);
        this.qsH = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public void Sg() {
        Keyframe ofFloat;
        Keyframe ofFloat2;
        int i10 = AnonymousClass1.YFl[this.AlY.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                ofFloat = null;
                ofFloat2 = null;
            } else {
                ofFloat = Keyframe.ofFloat(0.0f, this.DSW.pDU());
                ofFloat2 = Keyframe.ofFloat(0.0f, this.DSW.EH());
            }
        } else {
            ofFloat = Keyframe.ofFloat(0.0f, this.DSW.YoT());
            ofFloat2 = Keyframe.ofFloat(0.0f, this.DSW.GA());
        }
        if (ofFloat != null) {
            this.wN.add(ofFloat);
        }
        if (ofFloat2 != null) {
            this.qsH.add(ofFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public void YFl(float f10, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float optDouble = (float) jSONArray.optDouble(0);
            float optDouble2 = (float) jSONArray.optDouble(1);
            if (this.AlY == com.bytedance.adsdk.ugeno.YFl.AlY.TRANSLATE) {
                optDouble = qsH.YFl(this.YFl, optDouble);
                optDouble2 = qsH.YFl(this.YFl, optDouble2);
            }
            this.wN.add(Keyframe.ofFloat(f10, optDouble));
            this.qsH.add(Keyframe.ofFloat(f10, optDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public TypeEvaluator vc() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.Sg.YFl
    public List<PropertyValuesHolder> wN() {
        String Sg = this.AlY.Sg();
        AlY();
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(Sg + "X", (Keyframe[]) this.wN.toArray(new Keyframe[0]));
        this.f10262vc.add(ofKeyframe);
        PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(Sg + "Y", (Keyframe[]) this.qsH.toArray(new Keyframe[0]));
        this.f10262vc.add(ofKeyframe2);
        TypeEvaluator vc2 = vc();
        if (vc2 != null) {
            ofKeyframe.setEvaluator(vc2);
            ofKeyframe2.setEvaluator(vc2);
        }
        return this.f10262vc;
    }
}
