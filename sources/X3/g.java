package X3;

import J1.r;
import Y3.j;
import Y3.k;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final r f3673c = new r("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    public final j f3674a;
    public final String b;

    public g(Context context) {
        String str;
        this.b = context.getPackageName();
        r rVar = k.f3787a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance(Constants.SHA256);
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            String str2 = Build.TAGS;
                            if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            }
                        }
                        this.f3674a = new j(context, f3673c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                        return;
                    }
                    return;
                }
                Object[] objArr = new Object[0];
                r rVar2 = k.f3787a;
                rVar2.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", r.b(rVar2.f1539a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
