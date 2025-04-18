package com.bytedance.adsdk.ugeno.vc.YFl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import com.bytedance.adsdk.ugeno.vc.AlY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class YFl extends LinearLayout {
    private Context AlY;
    private int DSW;
    private int NjR;
    private int Sg;
    private List<View> YFl;
    private boolean qsH;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10287vc;
    private int wN;

    public YFl(Context context) {
        super(context);
        this.Sg = -65536;
        this.tN = -16776961;
        this.wN = 5;
        this.f10287vc = 20;
        this.DSW = 20;
        this.AlY = context;
        this.YFl = new ArrayList();
        YFl();
    }

    public void Sg() {
        View view = new View(getContext());
        view.setClickable(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f10287vc, this.DSW);
        int i10 = this.wN;
        layoutParams.leftMargin = i10;
        layoutParams.rightMargin = i10;
        addView(view, layoutParams);
        view.setBackground(Sg(this.tN));
        this.YFl.add(view);
    }

    public void YFl(int i10, int i11) {
        Iterator<View> it = this.YFl.iterator();
        while (it.hasNext()) {
            it.next().setBackground(Sg(this.tN));
        }
        if (i10 < 0 || i10 >= this.YFl.size()) {
            i10 = 0;
        }
        if (this.YFl.size() > 0) {
            this.YFl.get(i10).setBackground(Sg(this.Sg));
            this.NjR = i11;
        }
    }

    public int getSize() {
        return this.YFl.size();
    }

    public void setLoop(boolean z10) {
        this.qsH = z10;
    }

    public void setSelectedColor(int i10) {
        this.Sg = i10;
    }

    public void setUnSelectedColor(int i10) {
        this.tN = i10;
    }

    public void YFl() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        setGravity(17);
        setOrientation(0);
        layoutParams.bottomMargin = (int) qsH.YFl(this.AlY, 10.0f);
        setLayoutParams(layoutParams);
    }

    private GradientDrawable Sg(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public void YFl(int i10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f10287vc, this.DSW);
        int i11 = this.wN;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i11;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f10287vc, this.DSW);
        int i12 = this.wN;
        layoutParams2.leftMargin = i12;
        layoutParams2.rightMargin = i12;
        int YFl = AlY.YFl(this.qsH, this.NjR, this.YFl.size());
        int YFl2 = AlY.YFl(this.qsH, i10, this.YFl.size());
        if (this.YFl.size() == 0) {
            YFl2 = 0;
        }
        if (!this.YFl.isEmpty() && AlY.YFl(YFl, this.YFl) && AlY.YFl(YFl2, this.YFl)) {
            this.YFl.get(YFl).setBackground(Sg(this.tN));
            this.YFl.get(YFl).setLayoutParams(layoutParams2);
            this.YFl.get(YFl2).setBackground(Sg(this.Sg));
            this.YFl.get(YFl2).setLayoutParams(layoutParams);
            this.NjR = i10;
        }
    }
}
