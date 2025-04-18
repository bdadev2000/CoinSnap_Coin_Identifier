package com.bytedance.adsdk.ugeno.YFl.Sg;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class YFl {
    protected com.bytedance.adsdk.ugeno.YFl.AlY AlY;
    protected com.bytedance.adsdk.ugeno.Sg.Sg DSW;
    protected String Sg;
    protected Context YFl;
    protected Map<Float, String> tN;

    /* renamed from: vc, reason: collision with root package name */
    protected List<PropertyValuesHolder> f10262vc = new ArrayList();
    protected List<Keyframe> wN = new ArrayList();

    public YFl(Context context, com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, Map<Float, String> map) {
        this.YFl = context;
        this.Sg = str;
        this.tN = map;
        this.AlY = com.bytedance.adsdk.ugeno.YFl.AlY.YFl(this.Sg);
        this.DSW = sg2;
    }

    public void AlY() {
        Map<Float, String> map = this.tN;
        if (map != null && map.size() > 0) {
            if (!YFl()) {
                Sg();
            }
            for (Map.Entry<Float, String> entry : this.tN.entrySet()) {
                if (entry != null) {
                    YFl(entry.getKey().floatValue() / 100.0f, entry.getValue());
                }
            }
            tN();
        }
    }

    public abstract void Sg();

    public abstract void YFl(float f10, String str);

    public boolean YFl() {
        Map<Float, String> map = this.tN;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.tN.containsKey(Float.valueOf(0.0f));
    }

    public void tN() {
        Map<Float, String> map = this.tN;
        if (map != null && map.size() > 0) {
            Map<Float, String> map2 = this.tN;
            if (map2 instanceof TreeMap) {
                float floatValue = ((Float) ((TreeMap) map2).lastKey()).floatValue();
                if (floatValue != 100.0f) {
                    YFl(100.0f, this.tN.get(Float.valueOf(floatValue)));
                }
            }
        }
    }

    public abstract TypeEvaluator vc();

    public List<PropertyValuesHolder> wN() {
        String Sg = this.AlY.Sg();
        AlY();
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(Sg, (Keyframe[]) this.wN.toArray(new Keyframe[0]));
        TypeEvaluator vc2 = vc();
        if (vc2 != null) {
            ofKeyframe.setEvaluator(vc2);
        }
        this.f10262vc.add(ofKeyframe);
        return this.f10262vc;
    }
}
