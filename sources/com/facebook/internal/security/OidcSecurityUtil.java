package com.facebook.internal.security;

import android.util.Base64;
import android.util.Log;
import com.applovin.impl.iu;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p0.a;
import z0.m;

/* loaded from: classes4.dex */
public final class OidcSecurityUtil {

    @NotNull
    public static final OidcSecurityUtil INSTANCE = new OidcSecurityUtil();

    @NotNull
    private static final String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";

    @NotNull
    public static final String SIGNATURE_ALGORITHM_SHA256 = "SHA256withRSA";
    public static final long TIMEOUT_IN_MILLISECONDS = 5000;

    private OidcSecurityUtil() {
    }

    @NotNull
    public static final PublicKey getPublicKeyFromString(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_KEY);
        byte[] decode = Base64.decode(m.k1(m.k1(m.k1(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        a.r(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        a.r(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Nullable
    public static final String getRawKeyFromEndPoint(@NotNull String str) {
        a.s(str, "kid");
        URL url = new URL(TournamentShareDialogURIBuilder.scheme, a.z0(FacebookSdk.getFacebookDomain(), "www."), OPENID_KEYS_PATH);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        ?? obj = new Object();
        FacebookSdk.getExecutor().execute(new iu(url, obj, str, reentrantLock, newCondition));
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) obj.f30930a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: getRawKeyFromEndPoint$lambda-1 */
    public static final void m556getRawKeyFromEndPoint$lambda1(URL url, f0 f0Var, String str, ReentrantLock reentrantLock, Condition condition) {
        a.s(url, "$openIdKeyUrl");
        a.s(f0Var, "$result");
        a.s(str, "$kid");
        a.s(reentrantLock, "$lock");
        URLConnection openConnection = url.openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                a.r(inputStream, "connection.inputStream");
                Reader inputStreamReader = new InputStreamReader(inputStream, z0.a.f31458a);
                String A = b1.f0.A(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                f0Var.f30930a = new JSONObject(A).optString(str);
                httpURLConnection.disconnect();
                reentrantLock.lock();
            } catch (Exception e) {
                String name = INSTANCE.getClass().getName();
                String message = e.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                } finally {
                }
            }
            try {
                condition.signal();
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                throw th;
            } finally {
            }
        }
    }

    public static final boolean verify(@NotNull PublicKey publicKey, @NotNull String str, @NotNull String str2) {
        a.s(publicKey, "publicKey");
        a.s(str, "data");
        a.s(str2, "signature");
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM_SHA256);
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(z0.a.f31458a);
            a.r(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            a.r(decode, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public final String getOPENID_KEYS_PATH() {
        return OPENID_KEYS_PATH;
    }
}
