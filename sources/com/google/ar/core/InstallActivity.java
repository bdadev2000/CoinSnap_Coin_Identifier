package com.google.ar.core;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.internal.C1835d;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.annotations.UsedByReflection;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(24)
@UsedByReflection("AndroidManifest.xml")
/* loaded from: classes2.dex */
public class InstallActivity extends Activity {
    private static final int BOX_SIZE_DP = 280;
    private static final int INSTALLING_TEXT_BOTTOM_MARGIN_DP = 30;
    static final String INSTALL_BEHAVIOR_KEY = "behavior";
    static final String MESSAGE_TYPE_KEY = "message";
    private static final String TAG = "ARCore-InstallActivity";
    private boolean finished;
    private ArCoreApk.InstallBehavior installBehavior;
    private boolean installStarted;
    private ArCoreApk.UserMessageType messageType;
    private boolean waitingForCompletion;
    private final ContextThemeWrapper themeWrapper = new ContextThemeWrapper(this, android.R.style.Theme.Material.Light.Dialog.Alert);
    private F lastEvent = F.f14261c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateToSpinner, reason: merged with bridge method [inline-methods] */
    public void b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f9 = displayMetrics.density * 280.0f;
        int width = getWindow().getDecorView().getWidth();
        int height = getWindow().getDecorView().getHeight();
        setContentView(new RelativeLayout(this));
        int i9 = (int) f9;
        getWindow().getDecorView().setMinimumWidth(i9);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new E(this, width, i9, height));
        ofFloat.addListener(new B3.c(this, 6));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: closeInstaller, reason: merged with bridge method [inline-methods] */
    public void e() {
        startActivity(new Intent(this, (Class<?>) InstallActivity.class).setFlags(67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finishWithFailure, reason: merged with bridge method [inline-methods] */
    public void c(Exception exc) {
        v vVar = v.m;
        vVar.b = exc;
        vVar.b();
        this.finished = true;
        super.finish();
    }

    private boolean isOptional() {
        if (this.installBehavior == ArCoreApk.InstallBehavior.OPTIONAL) {
            return true;
        }
        return false;
    }

    private void showEducationDialog() {
        setContentView(com.tools.arruler.photomeasure.camera.ruler.R.layout.__arcore_education);
        findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.__arcore_cancelButton).setOnClickListener(new D(this, 1));
        if (!isOptional()) {
            findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.__arcore_cancelButton).setVisibility(8);
        }
        findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.__arcore_continueButton).setOnClickListener(new D(this, 0));
        TextView textView = (TextView) findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.__arcore_messageText);
        ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        if (this.messageType.ordinal() != 1) {
            textView.setText(com.tools.arruler.photomeasure.camera.ruler.R.string.__arcore_install_app);
        } else {
            textView.setText(com.tools.arruler.photomeasure.camera.ruler.R.string.__arcore_install_feature);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSpinner, reason: merged with bridge method [inline-methods] */
    public void a() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i9 = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i9, i9);
        RelativeLayout relativeLayout = new RelativeLayout(this.themeWrapper);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.themeWrapper);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.themeWrapper);
        textView.setText(com.tools.arruler.photomeasure.camera.ruler.R.string.__arcore_installing);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i9, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [B3.e, java.lang.Object] */
    /* renamed from: startInstaller, reason: merged with bridge method [inline-methods] */
    public void d() {
        this.installStarted = true;
        this.lastEvent = F.f14261c;
        H a6 = v.m.a(this);
        ?? obj = new Object();
        obj.b = this;
        obj.f283a = false;
        if (a6.f14270h == null) {
            try {
                a6.f14269g = getPackageManager().getPackageInstaller();
                C1857c c1857c = new C1857c(a6, obj);
                a6.f14270h = c1857c;
                a6.f14269g.registerSessionCallback(c1857c);
            } catch (NullPointerException unused) {
                obj.c(new FatalException("Unable to obtain Android PackageInstaller; is this a Play Instant App?"));
            }
        }
        if (a6.f14267e == null) {
            C1835d c1835d = new C1835d(obj, 6);
            a6.f14267e = c1835d;
            a6.f14268f = this;
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(c1835d, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), 2);
            } else {
                registerReceiver(c1835d, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
            }
        }
        try {
            a6.d(new A4.e(a6, this, obj, 9));
        } catch (C1859e unused2) {
            Log.w("ARCore-InstallService", "requestInstall bind failed, launching fullscreen.");
            H.e(this, obj);
        }
    }

    public final /* synthetic */ void f(F f9) {
        this.lastEvent = f9;
    }

    @Override // android.app.Activity
    public void finish() {
        c(new UnavailableUserDeclinedInstallationException());
    }

    public final /* synthetic */ boolean g() {
        return this.waitingForCompletion;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 16);
        sb.append("activityResult: ");
        sb.append(i10);
        Log.i(TAG, sb.toString());
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (bundle != null) {
                c(new FatalException("Install activity was suspended and recreated."));
                return;
            }
            this.messageType = (ArCoreApk.UserMessageType) getIntent().getSerializableExtra(MESSAGE_TYPE_KEY);
            ArCoreApk.InstallBehavior installBehavior = (ArCoreApk.InstallBehavior) getIntent().getSerializableExtra(INSTALL_BEHAVIOR_KEY);
            this.installBehavior = installBehavior;
            if (this.messageType != null && installBehavior != null) {
                setTheme(android.R.style.Theme.Material.Light.Dialog.Alert);
                getWindow().requestFeature(1);
                setFinishOnTouchOutside(isOptional());
                if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                    a();
                    return;
                }
                AtomicReference atomicReference = new AtomicReference(ArCoreApk.Availability.UNKNOWN_CHECKING);
                v.m.a(this).c(this, new C(atomicReference));
                int ordinal = ((ArCoreApk.Availability) atomicReference.get()).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 3) {
                        c(new UnavailableDeviceNotCompatibleException());
                        return;
                    }
                } else {
                    Log.w(TAG, "Preliminary compatibility check failed.");
                }
                showEducationDialog();
                return;
            }
            Log.e(TAG, "missing intent data.");
            c(new FatalException("Install activity launched without config data."));
        } catch (RuntimeException e4) {
            c(new FatalException("Exception starting install flow", e4));
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (!this.finished) {
            v.m.b();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.installStarted) {
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                d();
            }
        } else if (!this.finished) {
            synchronized (this) {
                try {
                    F f9 = this.lastEvent;
                    if (f9 == F.f14261c) {
                        finish();
                    } else if (f9 == F.b) {
                        this.waitingForCompletion = true;
                    } else {
                        c(v.m.b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }
}
