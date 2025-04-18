package fc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.c1;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import w3.h;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f17780d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f17781e = Charset.forName("UTF-8");
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final cc.c f17782b;

    /* renamed from: c, reason: collision with root package name */
    public final e f17783c = new e();

    public c(Context context, cc.c cVar) {
        this.a = context;
        this.f17782b = cVar;
    }

    public static URL a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new dc.f(e2.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String e2;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f17781e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = str3;
            if (TextUtils.isEmpty(str)) {
                e2 = "";
            } else {
                e2 = vd.e.e(", ", str);
            }
            objArr[2] = e2;
            Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
        }
    }

    public static long d(String str) {
        Preconditions.checkArgument(f17780d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    public static a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f17781e));
        c1 c1Var = new c1(7);
        c1Var.f11924c = 0L;
        h hVar = new h();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                hVar.a = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                hVar.f26699b = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                hVar.f26700c = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(BidResponsed.KEY_TOKEN)) {
                        c1Var.f11923b = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        c1Var.f11924c = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                hVar.f26701d = c1Var.d();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        hVar.f26702e = d.OK;
        return hVar.a();
    }

    public static b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f17781e));
        c1 c1Var = new c1(7);
        c1Var.f11924c = 0L;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(BidResponsed.KEY_TOKEN)) {
                c1Var.f11923b = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                c1Var.f11924c = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        c1Var.f11925d = f.OK;
        return c1Var.d();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public final HttpURLConnection c(URL url, String str) {
        String str2;
        byte[] packageCertificateHashBytes;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            ac.f fVar = (ac.f) this.f17782b.get();
            if (fVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(((ac.d) fVar).a()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (ExecutionException e10) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                }
            }
            try {
                packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            } catch (PackageManager.NameNotFoundException e11) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e11);
            }
            if (packageCertificateHashBytes == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                str2 = null;
                httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                httpURLConnection.addRequestProperty("x-goog-api-key", str);
                return httpURLConnection;
            }
            str2 = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new dc.f("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
