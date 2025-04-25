package com.glority.android.guide.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.glority.android.guide.R;
import com.glority.android.guide.utils.DensityUtil;

/* loaded from: classes3.dex */
public class VipBenefitIndicator extends LinearLayout {
    private Context context;
    private ImageView[] images;
    private int ivHeight;
    private int ivMargin;
    private int ivWidth;

    public VipBenefitIndicator(Context context) {
        super(context);
        init(context);
        this.context = context;
    }

    public VipBenefitIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
        this.context = context;
    }

    private void init(Context context) {
        setGravity(17);
        setOrientation(0);
        this.ivWidth = DensityUtil.dip2px(context, 10.0f);
        this.ivHeight = DensityUtil.dip2px(context, 10.0f);
        this.ivMargin = DensityUtil.dip2px(context, 5.0f);
    }

    public void setCountNum(int i) {
        int i2 = 0;
        if (this.images != null) {
            int i3 = 0;
            while (true) {
                ImageView[] imageViewArr = this.images;
                if (i3 >= imageViewArr.length) {
                    break;
                }
                removeView(imageViewArr[i3]);
                i3++;
            }
        }
        if (i <= 1) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        this.images = new ImageView[i];
        while (true) {
            ImageView[] imageViewArr2 = this.images;
            if (i2 >= imageViewArr2.length) {
                return;
            }
            imageViewArr2[i2] = new ImageView(getContext());
            this.images[i2].setImageResource(R.drawable.shape_rect_solid_dddddd_r_100);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ivWidth, this.ivHeight);
            int i4 = this.ivMargin;
            layoutParams.setMargins(i4, i4, i4, i4);
            this.images[i2].setLayoutParams(layoutParams);
            addView(this.images[i2]);
            i2++;
        }
    }

    public void setSelectOrder(int i) {
        ImageView[] imageViewArr = this.images;
        if (i >= imageViewArr.length) {
            return;
        }
        int i2 = 0;
        for (ImageView imageView : imageViewArr) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            if (i2 != i) {
                if ("selected".equals(imageView.getTag())) {
                    layoutParams.width = this.ivWidth;
                    imageView.setLayoutParams(layoutParams);
                    imageView.setImageResource(R.drawable.shape_rect_solid_dddddd_r_100);
                    imageView.setTag(null);
                    ViewCompat.setElevation(imageView, 0.0f);
                }
            } else {
                layoutParams.width = this.ivWidth * 2;
                imageView.setLayoutParams(layoutParams);
                imageView.setTag("selected");
                imageView.setImageResource(R.drawable.shape_rect_solid_05a67a_r_100);
                ViewCompat.setElevation(imageView, 4.0f);
            }
            i2++;
        }
    }
}
