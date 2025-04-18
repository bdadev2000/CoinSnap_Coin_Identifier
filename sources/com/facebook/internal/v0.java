package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.applovin.sdk.AppLovinEventTypes;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes3.dex */
public class v0 extends Dialog {

    /* renamed from: o, reason: collision with root package name */
    public static volatile int f11104o;

    /* renamed from: b, reason: collision with root package name */
    public String f11105b;

    /* renamed from: c, reason: collision with root package name */
    public String f11106c;

    /* renamed from: d, reason: collision with root package name */
    public q0 f11107d;

    /* renamed from: f, reason: collision with root package name */
    public u0 f11108f;

    /* renamed from: g, reason: collision with root package name */
    public ProgressDialog f11109g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f11110h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f11111i;

    /* renamed from: j, reason: collision with root package name */
    public final s0 f11112j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11113k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11114l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11115m;

    /* renamed from: n, reason: collision with root package name */
    public WindowManager.LayoutParams f11116n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, String str, Bundle bundle, com.facebook.login.b0 b0Var, q0 q0Var) {
        super(context, f11104o);
        Uri b3;
        x5.i.s();
        this.f11106c = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = m0.w(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f11106c = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", com.facebook.x.b());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"16.1.3"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f11107d = q0Var;
        if (Intrinsics.areEqual(str, AppLovinEventTypes.USER_SHARED_LINK) && bundle.containsKey("media")) {
            this.f11112j = new s0(this, str, bundle);
            return;
        }
        if (t0.a[b0Var.ordinal()] == 1) {
            b3 = m0.b(bundle, w5.d.d(), "oauth/authorize");
        } else {
            b3 = m0.b(bundle, w5.d.c(), com.facebook.x.d() + "/dialog/" + ((Object) str));
        }
        this.f11105b = b3.toString();
    }

    public static final void a(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                bundle = null;
            } else {
                bundle = applicationInfo.metaData;
            }
            if (bundle != null && f11104o == 0) {
                int i10 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i10 == 0) {
                    i10 = R.style.com_facebook_activity_theme;
                }
                f11104o = i10;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle b(String str) {
        Uri parse = Uri.parse(str);
        Bundle F = m0.F(parse.getQuery());
        F.putAll(m0.F(parse.getFragment()));
        return F;
    }

    public final void c() {
        int i10;
        double d10;
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i11 = displayMetrics.widthPixels;
            int i12 = displayMetrics.heightPixels;
            if (i11 < i12) {
                i10 = i11;
            } else {
                i10 = i12;
            }
            if (i11 >= i12) {
                i12 = i11;
            }
            int i13 = (int) (i10 / displayMetrics.density);
            double d11 = 1.0d;
            if (i13 <= 480) {
                d10 = 1.0d;
            } else if (i13 >= 800) {
                d10 = 0.5d;
            } else {
                d10 = (((800 - i13) / 320) * 0.5d) + 0.5d;
            }
            int min = Math.min((int) (i10 * d10), i11);
            int i14 = (int) (i12 / displayMetrics.density);
            if (i14 > 800) {
                if (i14 >= 1280) {
                    d11 = 0.5d;
                } else {
                    d11 = (((1280 - i14) / 480) * 0.5d) + 0.5d;
                }
            }
            int min2 = Math.min((int) (i12 * d11), displayMetrics.heightPixels);
            Window window = getWindow();
            if (window != null) {
                window.setLayout(min, min2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f11107d != null && !this.f11113k) {
            d(new com.facebook.s());
        }
    }

    public final void d(Exception exc) {
        com.facebook.q qVar;
        if (this.f11107d != null && !this.f11113k) {
            this.f11113k = true;
            if (exc instanceof com.facebook.q) {
                qVar = (com.facebook.q) exc;
            } else {
                qVar = new com.facebook.q(exc);
            }
            q0 q0Var = this.f11107d;
            if (q0Var != null) {
                q0Var.a(null, qVar);
            }
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        u0 u0Var = this.f11108f;
        if (u0Var != null) {
            u0Var.stopLoading();
        }
        if (!this.f11114l && (progressDialog = this.f11109g) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(int i10) {
        WebSettings settings;
        WebSettings settings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        u0 u0Var = new u0(getContext());
        this.f11108f = u0Var;
        u0Var.setVerticalScrollBarEnabled(false);
        u0 u0Var2 = this.f11108f;
        if (u0Var2 != null) {
            u0Var2.setHorizontalScrollBarEnabled(false);
        }
        u0 u0Var3 = this.f11108f;
        if (u0Var3 != null) {
            u0Var3.setWebViewClient(new p0(this));
        }
        u0 u0Var4 = this.f11108f;
        WebSettings webSettings = null;
        if (u0Var4 == null) {
            settings = null;
        } else {
            settings = u0Var4.getSettings();
        }
        int i11 = 1;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        u0 u0Var5 = this.f11108f;
        if (u0Var5 != null) {
            String str = this.f11105b;
            if (str != null) {
                u0Var5.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        u0 u0Var6 = this.f11108f;
        if (u0Var6 != null) {
            u0Var6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        u0 u0Var7 = this.f11108f;
        if (u0Var7 != null) {
            u0Var7.setVisibility(4);
        }
        u0 u0Var8 = this.f11108f;
        if (u0Var8 == null) {
            settings2 = null;
        } else {
            settings2 = u0Var8.getSettings();
        }
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        u0 u0Var9 = this.f11108f;
        if (u0Var9 != null) {
            webSettings = u0Var9.getSettings();
        }
        if (webSettings != null) {
            webSettings.setSaveFormData(false);
        }
        u0 u0Var10 = this.f11108f;
        if (u0Var10 != null) {
            u0Var10.setFocusable(true);
        }
        u0 u0Var11 = this.f11108f;
        if (u0Var11 != null) {
            u0Var11.setFocusableInTouchMode(true);
        }
        u0 u0Var12 = this.f11108f;
        if (u0Var12 != null) {
            u0Var12.setOnTouchListener(new com.applovin.impl.adview.r(i11));
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f11108f);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f11111i;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        IBinder iBinder2;
        this.f11114l = false;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (m0.E(context) && (layoutParams = this.f11116n) != null) {
            IBinder iBinder3 = null;
            if (layoutParams == null) {
                iBinder = null;
            } else {
                iBinder = layoutParams.token;
            }
            if (iBinder == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity == null) {
                        window = null;
                    } else {
                        window = ownerActivity.getWindow();
                    }
                    if (window == null || (attributes = window.getAttributes()) == null) {
                        iBinder2 = null;
                    } else {
                        iBinder2 = attributes.token;
                    }
                    layoutParams.token = iBinder2;
                }
                WindowManager.LayoutParams layoutParams2 = this.f11116n;
                if (layoutParams2 != null) {
                    iBinder3 = layoutParams2.token;
                }
                Intrinsics.stringPlus("Set token on onAttachedToWindow(): ", iBinder3);
                com.facebook.x xVar = com.facebook.x.a;
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f11109g = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f11109g;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f11109g;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f11109g;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.n0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    v0 this$0 = v0.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.f11111i = new FrameLayout(getContext());
        c();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f11110h = imageView;
        imageView.setOnClickListener(new z2.b(this, 2));
        Drawable drawable = getContext().getResources().getDrawable(2131231119);
        ImageView imageView2 = this.f11110h;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f11110h;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f11105b != null) {
            ImageView imageView4 = this.f11110h;
            if (imageView4 != null) {
                e((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.f11111i;
        if (frameLayout != null) {
            frameLayout.addView(this.f11110h, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f11111i;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f11114l = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 == 4) {
            u0 u0Var = this.f11108f;
            if (u0Var != null && Intrinsics.areEqual(Boolean.valueOf(u0Var.canGoBack()), Boolean.TRUE)) {
                u0 u0Var2 = this.f11108f;
                if (u0Var2 != null) {
                    u0Var2.goBack();
                    return true;
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        AsyncTask.Status status;
        super.onStart();
        s0 s0Var = this.f11112j;
        if (s0Var != null) {
            if (s0Var == null) {
                status = null;
            } else {
                status = s0Var.getStatus();
            }
            if (status == AsyncTask.Status.PENDING) {
                if (s0Var != null) {
                    s0Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f11109g;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        c();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        s0 s0Var = this.f11112j;
        if (s0Var != null) {
            s0Var.cancel(true);
            ProgressDialog progressDialog = this.f11109g;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.f11116n = params;
        }
        super.onWindowAttributesChanged(params);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v0(androidx.fragment.app.FragmentActivity r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            x5.i.s()
            int r0 = com.facebook.internal.v0.f11104o
            if (r0 != 0) goto L16
            x5.i.s()
            int r0 = com.facebook.internal.v0.f11104o
        L16:
            r1.<init>(r2, r0)
            java.lang.String r2 = "fbconnect://success"
            r1.f11106c = r2
            r1.f11105b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.v0.<init>(androidx.fragment.app.FragmentActivity, java.lang.String):void");
    }
}
