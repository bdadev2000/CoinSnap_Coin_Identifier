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

/* renamed from: com.applovin.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0683d0 extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f7147a;
    private AppLovinSdkUtils.Size b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f7148c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f7149d;

    public DialogC0683d0(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f7147a = viewGroup;
        this.b = size;
        this.f7148c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f7149d.removeView(this.f7147a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f7148c, this.b.getWidth()), AppLovinSdkUtils.dpToPx(this.f7148c, this.b.getHeight()));
        layoutParams.addRule(13);
        this.f7147a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f7148c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f7148c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f7148c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        final int i9 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.D0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DialogC0683d0 f6377c;

            {
                this.f6377c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        this.f6377c.a(view);
                        return;
                    default:
                        this.f6377c.b(view);
                        return;
                }
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f7148c);
        this.f7149d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f7149d.setBackgroundColor(Integer.MIN_VALUE);
        this.f7149d.addView(imageButton);
        this.f7149d.addView(this.f7147a);
        final int i10 = 1;
        this.f7149d.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.D0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DialogC0683d0 f6377c;

            {
                this.f6377c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f6377c.a(view);
                        return;
                    default:
                        this.f6377c.b(view);
                        return;
                }
            }
        });
        setContentView(this.f7149d);
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
