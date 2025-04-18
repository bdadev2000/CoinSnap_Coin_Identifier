package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.ServerProtocol;
import e0.t;
import e0.u;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes2.dex */
public final class PKCEUtil {

    @NotNull
    public static final PKCEUtil INSTANCE = new PKCEUtil();

    private PKCEUtil() {
    }

    @NotNull
    public static final GraphRequest createCodeExchangeRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        p0.a.s(str, "authorizationCode");
        p0.a.s(str2, "redirectUri");
        p0.a.s(str3, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str2);
        bundle.putString("code_verifier", str3);
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "oauth/access_token", null);
        newGraphPathRequest.setHttpMethod(HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        return newGraphPathRequest;
    }

    @NotNull
    public static final String generateCodeChallenge(@NotNull String str, @NotNull CodeChallengeMethod codeChallengeMethod) throws FacebookException {
        p0.a.s(str, "codeVerifier");
        p0.a.s(codeChallengeMethod, "codeChallengeMethod");
        if (!isValidCodeVerifier(str)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(z0.a.f31459b);
            p0.a.r(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            p0.a.r(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return encodeToString;
        } catch (Exception e) {
            throw new FacebookException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.g, w0.e] */
    @NotNull
    public static final String generateCodeVerifier() {
        ArrayList arrayList;
        ?? eVar = new w0.e(43, 128, 1);
        u0.e eVar2 = u0.f.f31370a;
        p0.a.s(eVar2, "random");
        try {
            int w = kotlin.jvm.internal.e.w(eVar2, eVar);
            Iterable aVar = new w0.a('a', 'z');
            w0.a aVar2 = new w0.a('A', 'Z');
            if (aVar instanceof Collection) {
                arrayList = u.P0(aVar2, (Collection) aVar);
            } else {
                ArrayList arrayList2 = new ArrayList();
                t.t0(arrayList2, aVar);
                t.t0(arrayList2, aVar2);
                arrayList = arrayList2;
            }
            ArrayList Q0 = u.Q0(u.Q0(u.Q0(u.Q0(u.P0(new w0.a('0', '9'), arrayList), Character.valueOf(SignatureVisitor.SUPER)), '.'), '_'), '~');
            ArrayList arrayList3 = new ArrayList(w);
            for (int i2 = 0; i2 < w; i2++) {
                p0.a.s(u0.f.f31370a, "random");
                if (Q0.isEmpty()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                arrayList3.add(Character.valueOf(((Character) Q0.get(u0.f.f31371b.c(Q0.size()))).charValue()));
            }
            return u.K0(arrayList3, "", null, null, null, 62);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final boolean isValidCodeVerifier(@Nullable String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        Pattern compile = Pattern.compile("^[-._~A-Za-z0-9]+$");
        p0.a.r(compile, "compile(...)");
        return compile.matcher(str).matches();
    }
}
