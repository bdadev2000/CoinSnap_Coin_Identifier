package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public class FingerprintManagerCompat {

    /* renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends FingerprintManager.AuthenticationCallback {
        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationError(int i2, CharSequence charSequence) {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationFailed() {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationHelp(int i2, CharSequence charSequence) {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            Api23Impl.f(Api23Impl.b(authenticationResult));
            throw null;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api23Impl {
        @RequiresPermission
        @DoNotInline
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i2, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i2, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @DoNotInline
        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @DoNotInline
        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @RequiresPermission
        @DoNotInline
        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @RequiresPermission
        @DoNotInline
        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @DoNotInline
        public static CryptoObject f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        @DoNotInline
        public static FingerprintManager.CryptoObject g(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            Cipher cipher = cryptoObject.f18576b;
            if (cipher != null) {
                return new FingerprintManager.CryptoObject(cipher);
            }
            Signature signature = cryptoObject.f18575a;
            if (signature != null) {
                return new FingerprintManager.CryptoObject(signature);
            }
            Mac mac = cryptoObject.f18577c;
            if (mac != null) {
                return new FingerprintManager.CryptoObject(mac);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class AuthenticationCallback {
    }

    /* loaded from: classes.dex */
    public static final class AuthenticationResult {
    }

    /* loaded from: classes.dex */
    public static class CryptoObject {

        /* renamed from: a, reason: collision with root package name */
        public final Signature f18575a;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f18576b;

        /* renamed from: c, reason: collision with root package name */
        public final Mac f18577c;

        public CryptoObject(Signature signature) {
            this.f18575a = signature;
            this.f18576b = null;
            this.f18577c = null;
        }

        public CryptoObject(Cipher cipher) {
            this.f18576b = cipher;
            this.f18575a = null;
            this.f18577c = null;
        }

        public CryptoObject(Mac mac) {
            this.f18577c = mac;
            this.f18576b = null;
            this.f18575a = null;
        }
    }
}
