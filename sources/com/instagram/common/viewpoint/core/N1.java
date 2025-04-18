package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class N1 extends LinearLayout {
    public static final int A08 = (int) (LP.A02 * 15.0f);
    public static final int A09 = (int) (LP.A02 * 10.0f);
    public static final int A0A = (int) (LP.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public boolean A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final C1045Zs A06;
    public final OJ A07;

    public N1(C1045Zs c1045Zs, int i2, boolean z2) {
        super(c1045Zs);
        this.A01 = false;
        this.A06 = c1045Zs;
        this.A02 = z2;
        this.A03 = new ImageView(c1045Zs);
        this.A03.setPadding(A09, A09, A09, A09);
        this.A07 = new OJ(c1045Zs, this.A02);
        this.A07.setProgress(0.0f);
        this.A07.setPadding(A09, A09, A09, A09);
        this.A05 = new TextView(c1045Zs);
        setOrientation(0);
        this.A04 = new LinearLayout(c1045Zs);
        this.A00 = i2;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A0A, A0A);
        M3.A0Y(this.A05, true, 16);
        this.A05.setTextColor(-1);
        this.A05.setVisibility(8);
        this.A04.addView(this.A03, layoutParams2);
        this.A04.addView(this.A07, layoutParams2);
        addView(this.A04, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A05, actionTextLayoutParams);
    }

    private void A01() {
        int i2;
        OJ oj = this.A07;
        int i3 = 8;
        if (this.A00 == 2 || this.A00 == 6) {
            i2 = this.A01 ? 4 : 0;
        } else {
            i2 = 8;
        }
        oj.setVisibility(i2);
        ImageView imageView = this.A03;
        if (this.A00 == 5) {
            i3 = 4;
        } else if (this.A00 != 2 && this.A00 != 6) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
    }

    public final void A02() {
        setVisibility(4);
    }

    public final void A03(float f2, int i2) {
        this.A07.A02(f2, i2);
    }

    public final void A04(C1O c1o, boolean z2, boolean z3) {
        int A04 = c1o.A04(z2);
        OJ oj = this.A07;
        int accentColor = AbstractC02302p.A01(A04, 77);
        oj.A03(accentColor, A04, 110);
        this.A03.setColorFilter(A04);
        if (z3) {
            TextView textView = this.A05;
            int accentColor2 = AbstractC02302p.A01(-1, 110);
            textView.setTextColor(accentColor2);
            return;
        }
        this.A05.setTextColor(A04);
    }

    public final boolean A05() {
        return !this.A05.getText().toString().isEmpty();
    }

    public final boolean A06() {
        return (this.A00 == 2 || this.A00 == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i2) {
        if (i2 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f2) {
        this.A07.setProgressWithAnimation(f2);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setProgressImage(MB mb) {
        this.A07.setImage(mb);
    }

    public void setProgressImmediate(float f2) {
        this.A07.clearAnimation();
        this.A07.setProgress(f2);
    }

    public void setProgressSpinnerInvisible(boolean z2) {
        this.A01 = z2;
        A01();
    }

    public void setToolbarActionMode(int i2) {
        MB mb;
        this.A06.A0E().ADn(i2);
        this.A00 = i2;
        A01();
        setVisibility(0);
        if (Build.VERSION.SDK_INT >= 16) {
            this.A03.setImageAlpha(255);
        }
        this.A03.setPadding(A09, A09, A09, A09);
        switch (i2) {
            case 0:
                mb = MB.CROSS;
                break;
            case 1:
                if (!this.A02) {
                    mb = MB.SKIP_ARROW;
                    break;
                } else {
                    mb = MB.REDESIGN_SKIP_ICON;
                    break;
                }
            case 2:
            default:
                mb = MB.CROSS;
                break;
            case 3:
                mb = MB.MINIMIZE_ARROW;
                break;
            case 4:
                mb = MB.CROSS;
                this.A03.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                mb = MB.CROSS;
                break;
            case 6:
                mb = MB.CROSS;
                break;
            case 7:
                mb = MB.CROSS;
                if (Build.VERSION.SDK_INT >= 16) {
                    this.A03.setImageAlpha(110);
                }
                this.A03.setPadding(A08, A08, A08, A08);
                break;
        }
        this.A03.setImageBitmap(MC.A01(mb));
        if (i2 == 1) {
            M3.A0G(1005, this.A03);
            setVisibility(0);
        } else {
            M3.A0G(1002, this.A03);
        }
    }

    public void setToolbarMessage(String str) {
        this.A05.setText(str);
        this.A05.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z2) {
        this.A05.setVisibility(z2 ? 0 : 4);
    }
}
