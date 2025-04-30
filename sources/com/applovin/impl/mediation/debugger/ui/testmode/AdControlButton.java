package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.C0730o;
import com.applovin.impl.r3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final GradientDrawable f9093a;
    private final Button b;

    /* renamed from: c, reason: collision with root package name */
    private final C0730o f9094c;

    /* renamed from: d, reason: collision with root package name */
    private b f9095d;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdFormat f9096f;

    /* renamed from: g, reason: collision with root package name */
    private a f9097g;

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
            this.f9094c.a();
        } else {
            setEnabled(true);
            this.f9094c.b();
        }
        this.b.setText(b(bVar));
        this.f9093a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f9095d;
    }

    public MaxAdFormat getFormat() {
        return this.f9096f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f9097g;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f9095d != bVar) {
            c(bVar);
        }
        this.f9095d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f9096f = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f9097g = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f9093a = gradientDrawable;
        Button button = new Button(getContext());
        this.b = button;
        C0730o c0730o = new C0730o(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f9094c = c0730o;
        b bVar = b.LOAD;
        this.f9095d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        c0730o.setColor(-1);
        addView(c0730o, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{r3.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
