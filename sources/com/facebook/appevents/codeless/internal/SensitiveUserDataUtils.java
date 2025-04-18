package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes3.dex */
public final class SensitiveUserDataUtils {

    @NotNull
    public static final SensitiveUserDataUtils INSTANCE = new SensitiveUserDataUtils();

    private SensitiveUserDataUtils() {
    }

    private final boolean isCreditCard(TextView textView) {
        int i2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            String textOfView = ViewHierarchy.getTextOfView(textView);
            Pattern compile = Pattern.compile("\\s");
            a.r(compile, "compile(...)");
            a.s(textOfView, "input");
            String replaceAll = compile.matcher(textOfView).replaceAll("");
            a.r(replaceAll, "replaceAll(...)");
            int length = replaceAll.length();
            if (length >= 12 && length <= 19) {
                int i3 = length - 1;
                if (i3 >= 0) {
                    boolean z2 = false;
                    i2 = 0;
                    while (true) {
                        int i4 = i3 - 1;
                        char charAt = replaceAll.charAt(i3);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        int M = a.M(charAt);
                        if (z2 && (M = M * 2) > 9) {
                            M = (M % 10) + 1;
                        }
                        i2 += M;
                        z2 = !z2;
                        if (i4 < 0) {
                            break;
                        }
                        i3 = i4;
                    }
                } else {
                    i2 = 0;
                }
                return i2 % 10 == 0;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isEmail(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String textOfView = ViewHierarchy.getTextOfView(textView);
            if (textOfView != null && textOfView.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(textOfView).matches();
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPassword(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPersonName(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPhoneNumber(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPostalAddress(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final boolean isSensitiveUserData(@Nullable View view) {
        if (CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            SensitiveUserDataUtils sensitiveUserDataUtils = INSTANCE;
            if (!sensitiveUserDataUtils.isPassword((TextView) view) && !sensitiveUserDataUtils.isCreditCard((TextView) view) && !sensitiveUserDataUtils.isPersonName((TextView) view) && !sensitiveUserDataUtils.isPostalAddress((TextView) view) && !sensitiveUserDataUtils.isPhoneNumber((TextView) view)) {
                if (!sensitiveUserDataUtils.isEmail((TextView) view)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveUserDataUtils.class);
            return false;
        }
    }
}
