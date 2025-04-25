package com.glority.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.glority.base.R;
import com.glority.base.databinding.WidgetSettingItemBinding;

/* loaded from: classes6.dex */
public class SettingItem extends ConstraintLayout {
    private WidgetSettingItemBinding binding;

    public SettingItem(Context context) {
        super(context);
        init(context, (AttributeSet) null, 0);
    }

    public SettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0);
    }

    public SettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        this.binding = (WidgetSettingItemBinding) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.widget_setting_item, this, true);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArray = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.SettingItem, 0, 0);
            int color = typedArray.getColor(R.styleable.SettingItem_background, 0);
            if (color != 0) {
                this.binding.getRoot().setBackgroundColor(color);
            }
            Drawable drawable = typedArray.getDrawable(R.styleable.SettingItem_icon);
            if (drawable != null) {
                this.binding.ivIcon.setVisibility(0);
                this.binding.ivIcon.setImageDrawable(drawable);
            }
            this.binding.tvTitle.setText(typedArray.getString(R.styleable.SettingItem_title));
            String string = typedArray.getString(R.styleable.SettingItem_subtitle);
            if (string != null && !string.isEmpty()) {
                this.binding.tvSubtitle.setVisibility(0);
                this.binding.tvSubtitle.setText(string);
            } else {
                this.binding.tvSubtitle.setVisibility(8);
            }
            if (typedArray.getBoolean(R.styleable.SettingItem_right_info_visible, false)) {
                this.binding.tvRightInfo.setVisibility(0);
                this.binding.tvRightInfo.setText(typedArray.getString(R.styleable.SettingItem_right_info));
                this.binding.tvRightInfo.setTextColor(typedArray.getColor(R.styleable.SettingItem_right_info_color, Color.parseColor("#666666")));
            }
            if (typedArray.getBoolean(R.styleable.SettingItem_right_icon_visible, false)) {
                this.binding.ivRightIcon.setVisibility(0);
                Drawable drawable2 = typedArray.getDrawable(R.styleable.SettingItem_right_icon);
                if (drawable2 != null) {
                    this.binding.ivRightIcon.setImageDrawable(drawable2);
                }
            }
            typedArray.getBoolean(R.styleable.SettingItem_bottom_line_visible, true);
            this.binding.bottomLine.setVisibility(8);
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    public void setTitle(int i) {
        this.binding.tvTitle.setText(i);
    }

    public void setTitle(String str) {
        this.binding.tvTitle.setText(str);
    }

    public void setSubtitle(int i) {
        this.binding.tvSubtitle.setVisibility(0);
        this.binding.tvSubtitle.setText(i);
    }

    public void setSubtitle(String str) {
        this.binding.tvSubtitle.setVisibility(0);
        this.binding.tvSubtitle.setText(str);
    }

    public void setSubtitleLines(Integer num) {
        this.binding.tvSubtitle.setLines(num.intValue());
    }

    public void setIcon(int i) {
        this.binding.ivIcon.setImageResource(i);
    }

    public void setRightIcon(int i) {
        this.binding.ivRightIcon.setImageResource(i);
        if (this.binding.ivRightIcon.getVisibility() != 0) {
            this.binding.ivRightIcon.setVisibility(0);
        }
        if (this.binding.tvRightInfo.getVisibility() == 0) {
            this.binding.tvRightInfo.setVisibility(8);
        }
    }

    public void setRightIcon(Drawable drawable) {
        this.binding.ivRightIcon.setImageDrawable(drawable);
        if (this.binding.ivRightIcon.getVisibility() != 0) {
            this.binding.ivRightIcon.setVisibility(0);
        }
        if (this.binding.tvRightInfo.getVisibility() == 0) {
            this.binding.tvRightInfo.setVisibility(8);
        }
    }

    public void setRightText(String str) {
        this.binding.tvRightInfo.setText(str);
        if (this.binding.tvRightInfo.getVisibility() != 0) {
            this.binding.tvRightInfo.setVisibility(0);
        }
        if (this.binding.ivRightIcon.getVisibility() == 0) {
            this.binding.ivRightIcon.setVisibility(8);
        }
    }

    public void setBottomLineVisibility(int i) {
        this.binding.bottomLine.setVisibility(i);
    }

    public static void setBottomVisible(SettingItem settingItem, int i) {
        settingItem.setBottomLineVisibility(i);
    }

    public static void setRightIcon(SettingItem settingItem, int i) {
        settingItem.setRightIcon(i);
    }

    public static void setRightInfo(SettingItem settingItem, String str) {
        settingItem.setRightText(str);
    }
}
