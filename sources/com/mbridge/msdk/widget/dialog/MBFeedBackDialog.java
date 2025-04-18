package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public class MBFeedBackDialog extends Dialog {
    private Button a;

    /* renamed from: b, reason: collision with root package name */
    private Button f16468b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f16469c;

    /* renamed from: d, reason: collision with root package name */
    private a f16470d;

    /* renamed from: e, reason: collision with root package name */
    private Button f16471e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f16472f;

    /* renamed from: g, reason: collision with root package name */
    private int f16473g;

    /* renamed from: h, reason: collision with root package name */
    private int f16474h;

    public MBFeedBackDialog(Context context, a aVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(v.a(context, "mbridge_cm_feedbackview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.f16470d = aVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f16472f = (TextView) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e2) {
                ad.a("MBAlertDialog", e2.getMessage());
            }
            try {
                this.f16469c = (LinearLayout) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f16468b = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.a = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
                this.f16471e = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_private_action_button", "id"));
            } catch (Exception e10) {
                ad.a("MBAlertDialog", e10.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        Button button = this.a;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f16470d != null) {
                        MBFeedBackDialog.this.f16470d.a();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        Button button2 = this.f16468b;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f16470d != null) {
                        MBFeedBackDialog.this.f16470d.b();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        Button button3 = this.f16471e;
        if (button3 != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBFeedBackDialog.this.dismiss();
                    if (MBFeedBackDialog.this.f16470d != null) {
                        MBFeedBackDialog.this.f16470d.c();
                    }
                }
            });
        }
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                if (MBFeedBackDialog.this.f16470d != null) {
                    MBFeedBackDialog.this.f16470d.b();
                }
            }
        });
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public void clear() {
        if (this.f16470d != null) {
            this.f16470d = null;
        }
    }

    public a getListener() {
        return this.f16470d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            int i10 = Build.VERSION.SDK_INT;
            window.addFlags(67108864);
            window.getDecorView().setSystemUiVisibility(4098);
            if (i10 >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setCancelButtonClickable(boolean z10) {
        Button button = this.a;
        if (button != null) {
            button.setClickable(z10);
            if (z10) {
                this.a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", c.m().g()));
                this.a.setAlpha(1.0f);
            } else {
                this.a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", c.m().g()));
                this.a.setAlpha(0.4f);
            }
        }
    }

    public void setCancelText(String str) {
        Button button = this.a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f16469c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = e.a(16.0f);
            layoutParams.rightMargin = e.a(16.0f);
            layoutParams.topMargin = e.a(3.0f);
            layoutParams.bottomMargin = e.a(3.0f);
            this.f16469c.addView(viewGroup, layoutParams);
        }
    }

    public void setDialogWidthAndHeight(float f10, float f11) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (isScreenOrientationPortrait(getContext())) {
            this.f16474h = displayMetrics.widthPixels;
            this.f16473g = displayMetrics.heightPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = (int) (this.f16473g * f11);
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f16474h = displayMetrics.heightPixels;
        this.f16473g = displayMetrics.widthPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = (int) (this.f16473g * f10);
        attributes2.height = -1;
        attributes2.gravity = 17;
        getWindow().setAttributes(attributes2);
    }

    public void setListener(a aVar) {
        this.f16470d = aVar;
    }

    public void setPrivacyText(String str) {
        Button button = this.f16471e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f16472f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e2) {
            ad.b("MBAlertDialog", e2.getMessage());
            super.show();
        }
    }
}
