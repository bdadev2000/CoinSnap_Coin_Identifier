package com.glority.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public class GlSettingItemView extends ConstraintLayout {
    private View bottomLine;
    private ImageView ivIcon;
    private ImageView ivRightIcon;
    private SwitchCompat scChecked;
    private TextView tvDesc;
    private TextView tvRightInfo;
    private TextView tvTitle;

    public GlSettingItemView(Context context) {
        super(context);
        init(context, (AttributeSet) null, 0);
    }

    public GlSettingItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0);
    }

    public GlSettingItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        LayoutInflater.from(context).inflate(R.layout.gl_widget_setting_item, (ViewGroup) this, true);
        this.ivIcon = (ImageView) findViewById(R.id.iv_icon);
        this.ivRightIcon = (ImageView) findViewById(R.id.iv_right_icon);
        this.tvTitle = (TextView) findViewById(R.id.tv_title);
        this.tvDesc = (TextView) findViewById(R.id.tv_desc);
        this.tvRightInfo = (TextView) findViewById(R.id.tv_right_info);
        this.scChecked = (SwitchCompat) findViewById(R.id.sc_checked);
        this.bottomLine = findViewById(R.id.bottom_line);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GlSettingItemView, 0, i);
            int color = obtainStyledAttributes.getColor(R.styleable.GlSettingItemView_background, 0);
            if (color != 0) {
                setBackgroundColor(color);
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.GlSettingItemView_icon);
            if (drawable != null) {
                this.ivIcon.setVisibility(0);
                this.ivIcon.setImageDrawable(drawable);
            }
            this.tvTitle.setText(obtainStyledAttributes.getString(R.styleable.GlSettingItemView_title));
            setDesc(obtainStyledAttributes.getString(R.styleable.GlSettingItemView_desc));
            if (obtainStyledAttributes.getBoolean(R.styleable.GlSettingItemView_right_info_visible, true)) {
                this.tvRightInfo.setVisibility(0);
                this.tvRightInfo.setText(obtainStyledAttributes.getString(R.styleable.GlSettingItemView_right_info));
                int color2 = obtainStyledAttributes.getColor(R.styleable.GlSettingItemView_right_info_color, 0);
                if (color2 != 0) {
                    this.tvRightInfo.setTextColor(color2);
                }
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.GlSettingItemView_right_icon_visible, true)) {
                this.ivRightIcon.setVisibility(0);
                Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.GlSettingItemView_right_icon);
                if (drawable2 != null) {
                    this.ivRightIcon.setImageDrawable(drawable2);
                }
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.GlSettingItemView_bottom_line_visible, true)) {
                this.bottomLine.setVisibility(0);
            } else {
                this.bottomLine.setVisibility(8);
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.GlSettingItemView_sc_checked_visible, false)) {
                this.scChecked.setVisibility(0);
            } else {
                this.scChecked.setVisibility(8);
            }
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            if (0 != 0) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public void setTitle(int i) {
        this.tvTitle.setText(i);
    }

    public void setTitle(String str) {
        this.tvTitle.setText(str);
    }

    public void setDesc(int i) {
        if (i == 0) {
            this.tvDesc.setVisibility(8);
        } else {
            this.tvDesc.setVisibility(0);
            this.tvDesc.setText(i);
        }
    }

    public void setDesc(String str) {
        if (str == null) {
            this.tvDesc.setVisibility(8);
            ((ConstraintLayout.LayoutParams) this.tvTitle.getLayoutParams()).bottomToBottom = 0;
        } else {
            this.tvDesc.setVisibility(0);
            this.tvDesc.setText(str);
            ((ConstraintLayout.LayoutParams) this.tvTitle.getLayoutParams()).bottomToBottom = -1;
        }
    }

    public void setIcon(int i) {
        this.ivIcon.setImageResource(i);
    }

    public void setRightIcon(int i) {
        this.ivRightIcon.setImageResource(i);
        if (this.ivRightIcon.getVisibility() != 0) {
            this.ivRightIcon.setVisibility(0);
        }
        if (this.tvRightInfo.getVisibility() == 0) {
            this.tvRightInfo.setVisibility(8);
        }
    }

    public void setRightIcon(Drawable drawable) {
        this.ivRightIcon.setImageDrawable(drawable);
        if (this.ivRightIcon.getVisibility() != 0) {
            this.ivRightIcon.setVisibility(0);
        }
        if (this.tvRightInfo.getVisibility() == 0) {
            this.tvRightInfo.setVisibility(8);
        }
    }

    public void setRightText(String str) {
        this.tvRightInfo.setText(str);
        if (this.tvRightInfo.getVisibility() != 0) {
            this.tvRightInfo.setVisibility(0);
        }
        if (this.ivRightIcon.getVisibility() == 0) {
            this.ivRightIcon.setVisibility(8);
        }
    }

    public void setRightTextColor(int i) {
        this.tvRightInfo.setTextColor(getContext().getResources().getColor(i));
    }

    public void setBottomLineVisibility(int i) {
        this.bottomLine.setVisibility(i);
    }

    public void setSwitchVisibility(int i) {
        this.scChecked.setVisibility(i);
    }

    public SwitchCompat getCheckBox() {
        return this.scChecked;
    }
}
