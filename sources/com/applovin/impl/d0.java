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

/* loaded from: classes3.dex */
public class d0 extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f23394a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f23395b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f23396c;
    private RelativeLayout d;

    public d0(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f23394a = viewGroup;
        this.f23395b = size;
        this.f23396c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.d.removeView(this.f23394a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f23396c, this.f23395b.getWidth()), AppLovinSdkUtils.dpToPx(this.f23396c, this.f23395b.getHeight()));
        layoutParams.addRule(13);
        this.f23394a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f23396c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f23396c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f23396c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        final int i2 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.et

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f23757b;

            {
                this.f23757b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                d0 d0Var = this.f23757b;
                switch (i3) {
                    case 0:
                        d0Var.a(view);
                        return;
                    default:
                        d0Var.b(view);
                        return;
                }
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f23396c);
        this.d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.d.setBackgroundColor(Integer.MIN_VALUE);
        this.d.addView(imageButton);
        this.d.addView(this.f23394a);
        final int i3 = 1;
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.et

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f23757b;

            {
                this.f23757b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                d0 d0Var = this.f23757b;
                switch (i32) {
                    case 0:
                        d0Var.a(view);
                        return;
                    default:
                        d0Var.b(view);
                        return;
                }
            }
        });
        setContentView(this.d);
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
