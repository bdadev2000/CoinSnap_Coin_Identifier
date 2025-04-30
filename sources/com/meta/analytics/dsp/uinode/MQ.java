package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class MQ extends RelativeLayout {
    public TextView A00;
    public final Button A01;
    public final Button A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public static final int A08 = (int) (LD.A02 * 60.0f);
    public static final int A07 = (int) (LD.A02 * 8.0f);
    public static final int A09 = (int) (LD.A02 * 16.0f);
    public static final int A0A = (int) (LD.A02 * 24.0f);
    public static final int A06 = (int) (LD.A02 * 12.0f);

    public MQ(C1636Yn c1636Yn, int i9, int i10, String str, String str2, String str3, String str4, Bitmap bitmap) {
        super(c1636Yn);
        TextView textView = new TextView(c1636Yn);
        this.A05 = textView;
        Button button = new Button(c1636Yn);
        this.A02 = button;
        Button button2 = new Button(c1636Yn);
        this.A01 = button2;
        ImageView imageView = new ImageView(c1636Yn);
        this.A03 = imageView;
        this.A04 = new LinearLayout(c1636Yn);
        if (!TextUtils.isEmpty(str2)) {
            this.A00 = new TextView(c1636Yn);
        }
        textView.setText(str);
        textView.setTextColor(i9);
        AbstractC1303Lo.A0X(textView, true, 20);
        TextView textView2 = this.A00;
        if (textView2 != null) {
            textView2.setText(str2);
            this.A00.setTextColor(i9);
            AbstractC1303Lo.A0X(this.A00, false, 18);
        }
        imageView.setImageBitmap(bitmap);
        imageView.setColorFilter(i9);
        button.setText(str3);
        AbstractC1303Lo.A0X(button, true, 18);
        button.setAllCaps(true);
        button.setTextColor(i10);
        int i11 = A06;
        button.setPadding(i11, i11, i11, i11);
        button2.setText(str4);
        AbstractC1303Lo.A0X(button2, true, 18);
        button2.setAllCaps(true);
        button2.setTextColor(i9);
        button2.setPadding(i11, i11, i11, i11);
        int A01 = AbstractC08522p.A01(i10, 20);
        int i12 = A07;
        AbstractC1303Lo.A0O(button, i9, i12);
        AbstractC1303Lo.A0O(button2, A01, i12);
        A00();
        setGravity(17);
    }

    private void A00() {
        int i9 = A0A;
        setPadding(i9, i9, i9, i9);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.A04.setOrientation(1);
        this.A04.setGravity(14);
        addView(this.A04, layoutParams);
        int i10 = A08;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i10, i10);
        int i11 = A09;
        layoutParams2.setMargins(0, 0, 0, i11);
        layoutParams2.gravity = 1;
        this.A04.addView(this.A03, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, i11 / 2);
        this.A05.setGravity(17);
        this.A04.addView(this.A05, layoutParams3);
        if (this.A00 != null) {
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(0, 0, 0, i11);
            this.A00.setGravity(17);
            this.A04.addView(this.A00, layoutParams4);
        }
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, 0, 0, i11);
        this.A04.addView(this.A02, layoutParams5);
        this.A04.addView(this.A01, layoutParams5);
    }
}
