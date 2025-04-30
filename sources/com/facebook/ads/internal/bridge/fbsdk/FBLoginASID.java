package com.facebook.ads.internal.bridge.fbsdk;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.C0785a;
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
            Date date = C0785a.f13439n;
            Object invoke = C0785a.class.getDeclaredMethod("getCurrentAccessToken", null).invoke(null, null);
            if (invoke != null) {
                return (String) C0785a.class.getDeclaredMethod("getUserId", null).invoke(invoke, null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
