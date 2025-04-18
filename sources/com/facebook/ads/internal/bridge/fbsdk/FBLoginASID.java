package com.facebook.ads.internal.bridge.fbsdk;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.a;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Date;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class FBLoginASID {
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String getFBLoginASID() {
        try {
            Date date = a.f10880n;
            Object invoke = a.class.getDeclaredMethod("getCurrentAccessToken", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null) {
                return (String) a.class.getDeclaredMethod("getUserId", new Class[0]).invoke(invoke, new Object[0]);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
