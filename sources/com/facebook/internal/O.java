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
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.C1849l;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public class O extends Dialog {

    /* renamed from: o, reason: collision with root package name */
    public static volatile int f13594o;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f13595c;

    /* renamed from: d, reason: collision with root package name */
    public J f13596d;

    /* renamed from: f, reason: collision with root package name */
    public N f13597f;

    /* renamed from: g, reason: collision with root package name */
    public ProgressDialog f13598g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f13599h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f13600i;

    /* renamed from: j, reason: collision with root package name */
    public final L f13601j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13602k;
    public boolean l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public WindowManager.LayoutParams f13603n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Context context, String str, Bundle bundle, com.facebook.login.A a6, J j7) {
        super(context, f13594o);
        Uri a9;
        AbstractC1839h.k();
        this.f13595c = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = H.y(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f13595c = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", com.facebook.r.b());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"16.1.3"}, 1)));
        this.f13596d = j7;
        if (str.equals(AppLovinEventTypes.USER_SHARED_LINK) && bundle.containsKey("media")) {
            this.f13601j = new L(this, str, bundle);
            return;
        }
        if (M.f13593a[a6.ordinal()] == 1) {
            a9 = H.a(H.q(), "oauth/authorize", bundle);
        } else {
            a9 = H.a(H.o(), com.facebook.r.d() + "/dialog/" + ((Object) str), bundle);
        }
        this.b = a9.toString();
    }

    public static int a(int i9, float f9, int i10, int i11) {
        double d2;
        int i12 = (int) (i9 / f9);
        if (i12 <= i10) {
            d2 = 1.0d;
        } else if (i12 >= i11) {
            d2 = 0.5d;
        } else {
            d2 = (((i11 - i12) / (i11 - i10)) * 0.5d) + 0.5d;
        }
        return (int) (i9 * d2);
    }

    public static final void b(Context context) {
        Bundle bundle;
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo == null) {
                    bundle = null;
                } else {
                    bundle = applicationInfo.metaData;
                }
                if (bundle != null && f13594o == 0) {
                    int i9 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                    if (i9 == 0) {
                        i9 = R.style.com_facebook_activity_theme;
                    }
                    f13594o = i9;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    public Bundle c(String str) {
        Uri parse = Uri.parse(str);
        Bundle G3 = H.G(parse.getQuery());
        G3.putAll(H.G(parse.getFragment()));
        return G3;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f13596d != null && !this.f13602k) {
            e(new RuntimeException());
        }
    }

    public final void d() {
        int i9;
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            if (i10 < i11) {
                i9 = i10;
            } else {
                i9 = i11;
            }
            if (i10 < i11) {
                i10 = i11;
            }
            int min = Math.min(a(i9, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
            int min2 = Math.min(a(i10, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
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
    public final void dismiss() {
        ProgressDialog progressDialog;
        N n2 = this.f13597f;
        if (n2 != null) {
            n2.stopLoading();
        }
        if (!this.l && (progressDialog = this.f13598g) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.internal.J] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.facebook.l] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void e(Exception exc) {
        ?? runtimeException;
        if (this.f13596d != null && !this.f13602k) {
            this.f13602k = true;
            if (exc instanceof C1849l) {
                runtimeException = (C1849l) exc;
            } else {
                runtimeException = new RuntimeException(exc);
            }
            ?? r02 = this.f13596d;
            if (r02 != 0) {
                r02.a(null, runtimeException);
            }
            dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.internal.N, android.view.View, android.webkit.WebView] */
    public final void f(int i9) {
        WebSettings settings;
        WebSettings settings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        ?? webView = new WebView(getContext());
        this.f13597f = webView;
        webView.setVerticalScrollBarEnabled(false);
        N n2 = this.f13597f;
        if (n2 != null) {
            n2.setHorizontalScrollBarEnabled(false);
        }
        N n9 = this.f13597f;
        if (n9 != null) {
            n9.setWebViewClient(new T5.c(this));
        }
        N n10 = this.f13597f;
        WebSettings webSettings = null;
        if (n10 == null) {
            settings = null;
        } else {
            settings = n10.getSettings();
        }
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        N n11 = this.f13597f;
        if (n11 != null) {
            String str = this.b;
            if (str != null) {
                n11.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        N n12 = this.f13597f;
        if (n12 != null) {
            n12.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        N n13 = this.f13597f;
        if (n13 != null) {
            n13.setVisibility(4);
        }
        N n14 = this.f13597f;
        if (n14 == null) {
            settings2 = null;
        } else {
            settings2 = n14.getSettings();
        }
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        N n15 = this.f13597f;
        if (n15 != null) {
            webSettings = n15.getSettings();
        }
        if (webSettings != null) {
            webSettings.setSaveFormData(false);
        }
        N n16 = this.f13597f;
        if (n16 != null) {
            n16.setFocusable(true);
        }
        N n17 = this.f13597f;
        if (n17 != null) {
            n17.setFocusableInTouchMode(true);
        }
        N n18 = this.f13597f;
        if (n18 != null) {
            n18.setOnTouchListener(new com.applovin.impl.adview.r(1));
        }
        linearLayout.setPadding(i9, i9, i9, i9);
        linearLayout.addView(this.f13597f);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f13600i;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        AutofillManager i9;
        boolean isAutofillSupported;
        boolean isEnabled;
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        IBinder iBinder2;
        this.l = false;
        Context context = getContext();
        G7.j.d(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && (i9 = com.bykv.vk.openvk.component.video.zp.jU.a.i(context.getSystemService(com.bykv.vk.openvk.component.video.zp.jU.a.l()))) != null) {
            isAutofillSupported = i9.isAutofillSupported();
            if (isAutofillSupported) {
                isEnabled = i9.isEnabled();
                if (isEnabled && (layoutParams = this.f13603n) != null) {
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
                        WindowManager.LayoutParams layoutParams2 = this.f13603n;
                        if (layoutParams2 != null) {
                            iBinder3 = layoutParams2.token;
                        }
                        G7.j.j(iBinder3, "Set token on onAttachedToWindow(): ");
                        com.facebook.r rVar = com.facebook.r.f13801a;
                    }
                }
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f13598g = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f13598g;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f13598g;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f13598g;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.I
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    O o3 = O.this;
                    G7.j.e(o3, "this$0");
                    o3.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.f13600i = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f13599h = imageView;
        imageView.setOnClickListener(new A6.c(this, 8));
        Drawable drawable = getContext().getResources().getDrawable(2131231122);
        ImageView imageView2 = this.f13599h;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f13599h;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.b != null) {
            ImageView imageView4 = this.f13599h;
            if (imageView4 != null) {
                f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.f13600i;
        if (frameLayout != null) {
            frameLayout.addView(this.f13599h, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f13600i;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.l = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        G7.j.e(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (i9 == 4) {
            N n2 = this.f13597f;
            if (n2 != null && G7.j.a(Boolean.valueOf(n2.canGoBack()), Boolean.TRUE)) {
                N n9 = this.f13597f;
                if (n9 != null) {
                    n9.goBack();
                    return true;
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        AsyncTask.Status status;
        super.onStart();
        L l = this.f13601j;
        if (l != null) {
            if (l == null) {
                status = null;
            } else {
                status = l.getStatus();
            }
            if (status == AsyncTask.Status.PENDING) {
                if (l != null) {
                    l.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f13598g;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        L l = this.f13601j;
        if (l != null) {
            l.cancel(true);
            ProgressDialog progressDialog = this.f13598g;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        G7.j.e(layoutParams, "params");
        if (layoutParams.token == null) {
            this.f13603n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }
}
