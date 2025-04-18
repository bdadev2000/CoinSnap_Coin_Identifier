package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.BuildConfig;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DeviceLoginManager;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.widget.LoginButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class DeviceLoginButton extends LoginButton {

    @Nullable
    private Uri deviceRedirectUri;

    /* loaded from: classes2.dex */
    public final class DeviceLoginClickListener extends LoginButton.LoginClickListener {
        final /* synthetic */ DeviceLoginButton this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceLoginClickListener(DeviceLoginButton deviceLoginButton) {
            super(deviceLoginButton);
            p0.a.s(deviceLoginButton, "this$0");
            this.this$0 = deviceLoginButton;
        }

        @Override // com.facebook.login.widget.LoginButton.LoginClickListener
        @NotNull
        public LoginManager getLoginManager() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                DeviceLoginManager companion = DeviceLoginManager.Companion.getInstance();
                companion.setDefaultAudience(this.this$0.getDefaultAudience());
                companion.setLoginBehavior(LoginBehavior.DEVICE_AUTH);
                companion.setDeviceRedirectUri(this.this$0.getDeviceRedirectUri());
                return companion;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        p0.a.s(context, "context");
        p0.a.s(attributeSet, "attrs");
    }

    @Override // com.facebook.login.widget.LoginButton, com.facebook.FacebookButtonBase, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(BuildConfig.LIBRARY_PACKAGE_NAME, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final Uri getDeviceRedirectUri() {
        return this.deviceRedirectUri;
    }

    @Override // com.facebook.login.widget.LoginButton
    @NotNull
    public LoginButton.LoginClickListener getNewLoginClickListener() {
        return new DeviceLoginClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.login.widget.LoginButton, com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setDeviceRedirectUri(@Nullable Uri uri) {
        this.deviceRedirectUri = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        p0.a.s(context, "context");
        p0.a.s(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(@NotNull Context context) {
        super(context);
        p0.a.s(context, "context");
    }
}
