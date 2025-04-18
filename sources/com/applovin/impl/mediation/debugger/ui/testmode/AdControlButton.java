package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.o;
import com.applovin.impl.r3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {
    private final GradientDrawable a;

    /* renamed from: b, reason: collision with root package name */
    private final Button f6140b;

    /* renamed from: c, reason: collision with root package name */
    private final o f6141c;

    /* renamed from: d, reason: collision with root package name */
    private b f6142d;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdFormat f6143f;

    /* renamed from: g, reason: collision with root package name */
    private a f6144g;

    /* loaded from: classes.dex */
    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    /* loaded from: classes.dex */
    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        if (b.LOAD == bVar) {
            return r3.a(R.color.applovin_sdk_brand_color, getContext());
        }
        if (b.LOADING == bVar) {
            return r3.a(R.color.applovin_sdk_brand_color, getContext());
        }
        return r3.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        if (b.LOAD == bVar) {
            return "Load";
        }
        if (b.LOADING == bVar) {
            return "";
        }
        return "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f6141c.a();
        } else {
            setEnabled(true);
            this.f6141c.b();
        }
        this.f6140b.setText(b(bVar));
        this.a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f6142d;
    }

    public MaxAdFormat getFormat() {
        return this.f6143f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f6144g;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f6142d != bVar) {
            c(bVar);
        }
        this.f6142d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f6143f = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f6144g = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.a = gradientDrawable;
        Button button = new Button(getContext());
        this.f6140b = button;
        o oVar = new o(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f6141c = oVar;
        b bVar = b.LOAD;
        this.f6142d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        oVar.setColor(-1);
        addView(oVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f6140b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{r3.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
