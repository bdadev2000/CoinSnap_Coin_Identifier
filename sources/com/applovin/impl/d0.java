package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class d0 extends Dialog {
    private ViewGroup a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f4167b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f4168c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f4169d;

    public d0(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.a = viewGroup;
        this.f4167b = size;
        this.f4168c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f4169d.removeView(this.a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f4168c, this.f4167b.getWidth()), AppLovinSdkUtils.dpToPx(this.f4168c, this.f4167b.getHeight()));
        layoutParams.addRule(13);
        this.a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f4168c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f4168c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f4168c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        final int i10 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.lt

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d0 f5918c;

            {
                this.f5918c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                d0 d0Var = this.f5918c;
                switch (i11) {
                    case 0:
                        d0Var.a(view);
                        return;
                    default:
                        d0Var.b(view);
                        return;
                }
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f4168c);
        this.f4169d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f4169d.setBackgroundColor(Integer.MIN_VALUE);
        this.f4169d.addView(imageButton);
        this.f4169d.addView(this.a);
        final int i11 = 1;
        this.f4169d.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.lt

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d0 f5918c;

            {
                this.f5918c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                d0 d0Var = this.f5918c;
                switch (i112) {
                    case 0:
                        d0Var.a(view);
                        return;
                    default:
                        d0Var.b(view);
                        return;
                }
            }
        });
        setContentView(this.f4169d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }
}
