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
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public class MBFeedBackDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private Button f19506a;
    private Button b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f19507c;

    /* renamed from: d, reason: collision with root package name */
    private a f19508d;

    /* renamed from: e, reason: collision with root package name */
    private Button f19509e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f19510f;

    /* renamed from: g, reason: collision with root package name */
    private int f19511g;

    /* renamed from: h, reason: collision with root package name */
    private int f19512h;

    public MBFeedBackDialog(Context context, a aVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(v.a(context, "mbridge_cm_feedbackview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.f19508d = aVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f19510f = (TextView) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e4) {
                ad.a("MBAlertDialog", e4.getMessage());
            }
            try {
                this.f19507c = (LinearLayout) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.b = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f19506a = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
                this.f19509e = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_private_action_button", "id"));
            } catch (Exception e9) {
                ad.a("MBAlertDialog", e9.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        Button button = this.f19506a;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f19508d != null) {
                        MBFeedBackDialog.this.f19508d.a();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        Button button2 = this.b;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f19508d != null) {
                        MBFeedBackDialog.this.f19508d.b();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        Button button3 = this.f19509e;
        if (button3 != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBFeedBackDialog.this.dismiss();
                    if (MBFeedBackDialog.this.f19508d != null) {
                        MBFeedBackDialog.this.f19508d.c();
                    }
                }
            });
        }
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                if (MBFeedBackDialog.this.f19508d != null) {
                    MBFeedBackDialog.this.f19508d.b();
                }
            }
        });
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public void clear() {
        if (this.f19508d != null) {
            this.f19508d = null;
        }
    }

    public a getListener() {
        return this.f19508d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            int i9 = Build.VERSION.SDK_INT;
            window.addFlags(67108864);
            window.getDecorView().setSystemUiVisibility(4098);
            if (i9 >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setCancelButtonClickable(boolean z8) {
        Button button = this.f19506a;
        if (button != null) {
            button.setClickable(z8);
            if (z8) {
                this.f19506a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", c.m().g()));
                this.f19506a.setAlpha(1.0f);
            } else {
                this.f19506a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", c.m().g()));
                this.f19506a.setAlpha(0.4f);
            }
        }
    }

    public void setCancelText(String str) {
        Button button = this.f19506a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f19507c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = L.a(16.0f);
            layoutParams.rightMargin = L.a(16.0f);
            layoutParams.topMargin = L.a(3.0f);
            layoutParams.bottomMargin = L.a(3.0f);
            this.f19507c.addView(viewGroup, layoutParams);
        }
    }

    public void setDialogWidthAndHeight(float f9, float f10) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (isScreenOrientationPortrait(getContext())) {
            this.f19512h = displayMetrics.widthPixels;
            this.f19511g = displayMetrics.heightPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = (int) (this.f19511g * f10);
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f19512h = displayMetrics.heightPixels;
        this.f19511g = displayMetrics.widthPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = (int) (this.f19511g * f9);
        attributes2.height = -1;
        attributes2.gravity = 17;
        getWindow().setAttributes(attributes2);
    }

    public void setListener(a aVar) {
        this.f19508d = aVar;
    }

    public void setPrivacyText(String str) {
        Button button = this.f19509e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f19510f;
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
        } catch (Exception e4) {
            ad.b("MBAlertDialog", e4.getMessage());
            super.show();
        }
    }
}
