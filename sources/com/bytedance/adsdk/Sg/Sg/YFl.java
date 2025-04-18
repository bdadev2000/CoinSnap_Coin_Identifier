package com.bytedance.adsdk.Sg.Sg;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.Sg.tN;
import com.bytedance.adsdk.Sg.tN.DSW;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class YFl {
    private final AssetManager AlY;
    private tN wN;
    private final DSW<String> YFl = new DSW<>();
    private final Map<DSW<String>, Typeface> Sg = new HashMap();
    private final Map<String, Typeface> tN = new HashMap();

    /* renamed from: vc, reason: collision with root package name */
    private String f10152vc = ".ttf";

    public YFl(Drawable.Callback callback, tN tNVar) {
        this.wN = tNVar;
        if (!(callback instanceof View)) {
            this.AlY = null;
        } else {
            this.AlY = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface Sg(com.bytedance.adsdk.Sg.tN.tN tNVar) {
        Typeface typeface;
        String YFl = tNVar.YFl();
        Typeface typeface2 = this.tN.get(YFl);
        if (typeface2 != null) {
            return typeface2;
        }
        String tN = tNVar.tN();
        String Sg = tNVar.Sg();
        tN tNVar2 = this.wN;
        if (tNVar2 != null) {
            typeface = tNVar2.YFl(YFl, tN, Sg);
            if (typeface == null) {
                typeface = this.wN.YFl(YFl);
            }
        } else {
            typeface = null;
        }
        tN tNVar3 = this.wN;
        if (tNVar3 != null && typeface == null) {
            String Sg2 = tNVar3.Sg(YFl, tN, Sg);
            if (Sg2 == null) {
                Sg2 = this.wN.Sg(YFl);
            }
            if (Sg2 != null) {
                try {
                    typeface = Typeface.createFromAsset(this.AlY, Sg2);
                } catch (Throwable unused) {
                    typeface = Typeface.DEFAULT;
                }
            }
        }
        if (tNVar.AlY() != null) {
            return tNVar.AlY();
        }
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(this.AlY, "fonts/" + YFl + this.f10152vc);
            } catch (Throwable unused2) {
                typeface = Typeface.DEFAULT;
            }
        }
        this.tN.put(YFl, typeface);
        return typeface;
    }

    public void YFl(tN tNVar) {
        this.wN = tNVar;
    }

    public void YFl(String str) {
        this.f10152vc = str;
    }

    public Typeface YFl(com.bytedance.adsdk.Sg.tN.tN tNVar) {
        this.YFl.YFl(tNVar.YFl(), tNVar.tN());
        Typeface typeface = this.Sg.get(this.YFl);
        if (typeface != null) {
            return typeface;
        }
        Typeface YFl = YFl(Sg(tNVar), tNVar.tN());
        this.Sg.put(this.YFl, YFl);
        return YFl;
    }

    private Typeface YFl(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i10 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
