package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.impl.L;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Locale;

/* loaded from: classes3.dex */
public class MBAlertDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private Button f19500a;
    private Button b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f19501c;

    /* renamed from: d, reason: collision with root package name */
    private a f19502d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f19503e;

    public MBAlertDialog(Context context, final a aVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(v.a(context, "mbridge_cm_alertview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        this.f19502d = aVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f19503e = (TextView) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e4) {
                ad.a("MBAlertDialog", e4.getMessage());
            }
            try {
                this.f19501c = (TextView) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.b = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f19500a = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e9) {
                ad.a("MBAlertDialog", e9.getMessage());
            }
        }
        Button button = this.f19500a;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBAlertDialog.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    MBAlertDialog.this.cancel();
                    MBAlertDialog.this.clear();
                }
            });
        }
        Button button2 = this.b;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBAlertDialog.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    MBAlertDialog.this.cancel();
                    MBAlertDialog.this.clear();
                }
            });
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    private void a(String str, String str2, String str3, String str4) {
        setTitle(str);
        setContent(str2);
        setConfirmText(str3);
        setCancelText(str4);
    }

    public void clear() {
        if (this.f19502d != null) {
            this.f19502d = null;
        }
    }

    public a getListener() {
        return this.f19502d;
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

    public void makeDownloadAlert(String str) {
    }

    public void makeIVAlertView(int i9, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        try {
            String obj = al.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String obj2 = al.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String obj3 = al.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String obj4 = al.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            if (TextUtils.isEmpty(obj) && TextUtils.isEmpty(obj2) && TextUtils.isEmpty(obj3) && TextUtils.isEmpty(obj4)) {
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    if (i9 == com.mbridge.msdk.foundation.same.a.f15660G) {
                        str5 = "确认关闭？";
                    } else {
                        str5 = "提示";
                    }
                    setTitle(str5);
                    if (i9 == com.mbridge.msdk.foundation.same.a.f15660G) {
                        str6 = "如果你选择继续，结束后将会获得奖励。确认关闭吗？";
                    } else {
                        str6 = "如果你选择继续，结束后将会获得奖励。是否继续？";
                    }
                    setContent(str6);
                    if (i9 == com.mbridge.msdk.foundation.same.a.f15660G) {
                        str7 = "确认关闭";
                    } else {
                        str7 = "取消";
                    }
                    setConfirmText(str7);
                    setCancelText("继续");
                } else {
                    if (i9 == com.mbridge.msdk.foundation.same.a.f15660G) {
                        str2 = "Confirm";
                    } else {
                        str2 = "Tips";
                    }
                    setTitle(str2);
                    if (i9 == com.mbridge.msdk.foundation.same.a.f15660G) {
                        str3 = "If you choose to continue, you will receive a reward after the end. Confirm closed?";
                    } else {
                        str3 = "If you choose to continue, you will receive a reward after the end. Whether to continue?";
                    }
                    setContent(str3);
                    if (i9 == com.mbridge.msdk.foundation.same.a.f15660G) {
                        str4 = "Close";
                    } else {
                        str4 = "Cancel";
                    }
                    setConfirmText(str4);
                    setCancelText("Continue");
                }
            } else {
                a(obj, obj2, obj3, obj4);
            }
        } catch (Exception e4) {
            ad.a("MBAlertDialog", e4.getMessage());
        }
    }

    public void makeInsAlert(String str) {
    }

    public void makePlayableAlertView() {
        g f9 = L.f(h.a());
        if (f9 != null) {
            a(f9.w(), f9.u(), f9.v(), f9.s());
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
            setTitle("确认关闭？");
            setContent("关闭后您将不会获得任何奖励噢~ ");
            setConfirmText("确认关闭");
            setCancelText("继续试玩");
            return;
        }
        setTitle("Confirm to close? ");
        setContent("You will not be rewarded after closing the window");
        setConfirmText("Close it");
        setCancelText("Continue");
    }

    public void makeRVAlertView(String str) {
        try {
            String obj = al.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String obj2 = al.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String obj3 = al.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String obj4 = al.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            g b = h.a().b(c.m().k());
            if (TextUtils.isEmpty(obj) && TextUtils.isEmpty(obj2) && TextUtils.isEmpty(obj3) && TextUtils.isEmpty(obj4)) {
                if (b != null) {
                    a(b.w(), b.u(), b.v(), b.t());
                    return;
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    setTitle("确认关闭？");
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                    setConfirmText("确认关闭");
                    setCancelText("继续观看");
                    return;
                }
                setTitle("Confirm to close? ");
                setContent("You will not be rewarded after closing the window");
                setConfirmText("Close it");
                setCancelText("Continue");
                return;
            }
            String language2 = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(obj)) {
                if (b != null) {
                    obj = b.w();
                } else if (!TextUtils.isEmpty(language2) && language2.equals("zh")) {
                    setTitle("确认关闭？");
                } else {
                    setTitle("Confirm to close? ");
                }
            }
            if (TextUtils.isEmpty(obj2)) {
                if (b != null) {
                    obj2 = b.u();
                } else if (!TextUtils.isEmpty(language2) && language2.equals("zh")) {
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                } else {
                    setContent("You will not be rewarded after closing the window");
                }
            }
            if (TextUtils.isEmpty(obj4)) {
                if (b != null) {
                    obj4 = b.v();
                } else if (!TextUtils.isEmpty(language2) && language2.equals("zh")) {
                    setConfirmText("确认关闭");
                } else {
                    setConfirmText("Close it");
                }
            }
            if (TextUtils.isEmpty(obj3)) {
                if (b != null) {
                    obj3 = b.t();
                } else if (!TextUtils.isEmpty(language2) && language2.equals("zh")) {
                    setCancelText("继续观看");
                } else {
                    setCancelText("Continue");
                }
            }
            a(obj, obj2, obj4, obj3);
        } catch (Exception e4) {
            ad.a("MBAlertDialog", e4.getMessage());
        }
    }

    public void onlyShow() {
        super.show();
    }

    public void setCancelText(String str) {
        Button button = this.f19500a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.b;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setContent(String str) {
        TextView textView = this.f19501c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f19503e;
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
