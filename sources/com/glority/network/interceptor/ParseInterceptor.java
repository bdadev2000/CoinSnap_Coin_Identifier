package com.glority.network.interceptor;

import android.os.Build;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.agreement.IsAgreedAgreementRequest;
import com.glority.android.core.route.core.GetCountryCodeRequest;
import com.glority.android.core.route.encrypt.DecryptRequest;
import com.glority.android.core.route.encrypt.EncryptRequest;
import com.glority.android.core.route.network.GetAccessTokenRequest;
import com.glority.android.core.route.network.GetAdditionalHttpHeadersRequest;
import com.glority.android.core.route.network.GetMd5EncryptKeyRequest;
import com.glority.android.core.route.network.GetUserIdRequest;
import com.glority.android.core.route.network.GetUserTypeRequest;
import com.glority.network.Host;
import com.glority.network.exception.RequestFailException;
import com.glority.network.util.GZipUtils;
import com.glority.network.util.Md5Utils;
import com.glority.utils.stability.LogUtils;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Version;
import okio.Buffer;

/* compiled from: ParseInterceptor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u001b\u0010\u0010\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0013\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\b¨\u0006!"}, d2 = {"Lcom/glority/network/interceptor/ParseInterceptor;", "Lokhttp3/Interceptor;", "enableEncryption", "", "(Z)V", "appName", "", "getAppName", "()Ljava/lang/String;", "appName$delegate", "Lkotlin/Lazy;", "applicationId", "getApplicationId", "applicationId$delegate", "userAgent", "getUserAgent", "versionCode", "getVersionCode", "versionCode$delegate", "versionName", "getVersionName", "versionName$delegate", "get24UUID", "getSignature", "request", "Lokhttp3/Request;", "timestamp", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class ParseInterceptor implements Interceptor {
    private static final String CONTENT_TYPE_ENCRYPTED = "application/encrypted";
    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String KEY_ACCESS_TOKEN = "ACCESS-TOKEN";
    private static final String KEY_DEVICE_TYPE = "DEVICE-TYPE";
    private static final String KEY_SIGNATURE = "SIGNATURE";
    private static final String KEY_SIGN_TIME = "SIGN-TIME";
    private static final String KEY_USER_AGENT = "User-Agent";
    private static final String KEY_USER_ID = "USER-ID";
    private static final String KEY_VERSION = "VERSION";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";
    private static final String SIGN_KEY = "SIGN-KEY";
    private static final String TRACE_ID = "X-Amzn-Trace-Id";

    /* renamed from: appName$delegate, reason: from kotlin metadata */
    private final Lazy appName;

    /* renamed from: applicationId$delegate, reason: from kotlin metadata */
    private final Lazy applicationId;
    private final boolean enableEncryption;

    /* renamed from: versionCode$delegate, reason: from kotlin metadata */
    private final Lazy versionCode;

    /* renamed from: versionName$delegate, reason: from kotlin metadata */
    private final Lazy versionName;

    public ParseInterceptor() {
        this(false, 1, null);
    }

    public ParseInterceptor(boolean z) {
        this.enableEncryption = z;
        this.appName = LazyKt.lazy(new Function0<String>() { // from class: com.glority.network.interceptor.ParseInterceptor$appName$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return AppContext.INSTANCE.getConfig("APP_NAME");
            }
        });
        this.applicationId = LazyKt.lazy(new Function0<String>() { // from class: com.glority.network.interceptor.ParseInterceptor$applicationId$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return AppContext.INSTANCE.getConfig("APPLICATION_ID");
            }
        });
        this.versionName = LazyKt.lazy(new Function0<String>() { // from class: com.glority.network.interceptor.ParseInterceptor$versionName$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return AppContext.INSTANCE.getConfig("VERSION_NAME");
            }
        });
        this.versionCode = LazyKt.lazy(new Function0<String>() { // from class: com.glority.network.interceptor.ParseInterceptor$versionCode$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return AppContext.INSTANCE.getConfig("VERSION_CODE");
            }
        });
    }

    public /* synthetic */ ParseInterceptor(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        String host = request.url().host();
        Request.Builder newBuilder = request.newBuilder();
        Long result = new GetUserIdRequest().toResult();
        if (Intrinsics.areEqual(host, Host.INSTANCE.getHost())) {
            if (result != null) {
                newBuilder.header(KEY_USER_ID, result.toString());
            }
            String result2 = new GetAccessTokenRequest().toResult();
            if (result2 != null && result2.length() > 0) {
                newBuilder.header(KEY_ACCESS_TOKEN, result2);
            }
        }
        if (Host.INSTANCE.getAuthHosts().contains(host)) {
            if (this.enableEncryption) {
                String host2 = request.url().host();
                Intrinsics.checkNotNullExpressionValue(host2, "host(...)");
                String result3 = new GetMd5EncryptKeyRequest(host2).toResult();
                String str = result3;
                if (str != null && str.length() != 0) {
                    newBuilder.header(SIGN_KEY, result3);
                }
                long currentTimeMillis = System.currentTimeMillis();
                Intrinsics.checkNotNull(request);
                String signature = getSignature(request, currentTimeMillis);
                newBuilder.header(KEY_SIGN_TIME, String.valueOf(currentTimeMillis));
                newBuilder.header(KEY_SIGNATURE, signature);
            }
            try {
                StringBuilder sb = new StringBuilder("Root=1-");
                String l = Long.toString(System.currentTimeMillis() / 1000, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(l, "toString(...)");
                newBuilder.header(TRACE_ID, sb.append(l).append('-').append(get24UUID()).toString() + ((result == null || result.longValue() == 0) ? "" : ";User-Id=" + result));
            } catch (Exception unused) {
                LogUtils.e("ParseInterceptor", "err add trace id to header");
            }
        }
        newBuilder.header(KEY_DEVICE_TYPE, LikeItem.DISLIKE);
        newBuilder.header(KEY_VERSION, AppContext.INSTANCE.getVersionName());
        newBuilder.header("User-Agent", getUserAgent());
        URL url = request.url().url();
        Intrinsics.checkNotNullExpressionValue(url, "url(...)");
        Map<String, ? extends String> result4 = new GetAdditionalHttpHeadersRequest(url).toResult();
        if (result4 != null) {
            for (String str2 : result4.keySet()) {
                String str3 = result4.get(str2);
                if (str2.length() > 0 && str3 != null && str3.length() > 0) {
                    newBuilder.header(str2, str3);
                }
            }
        }
        Response proceed = chain.proceed(newBuilder.build());
        ResponseBody body = proceed.body();
        if (body != null) {
            if (Intrinsics.areEqual(String.valueOf(body.contentType()), CONTENT_TYPE_ENCRYPTED)) {
                byte[] bytes = body.bytes();
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes(...)");
                String host3 = request.url().host();
                Intrinsics.checkNotNullExpressionValue(host3, "host(...)");
                byte[] result5 = new DecryptRequest(bytes, host3).toResult();
                if (result5 == null) {
                    throw new RequestFailException("", "Decrypt API failed.", RequestFailException.ErrorCode.DECRYPT_ERROR.getValue());
                }
                String str4 = new String(GZipUtils.INSTANCE.decompress(result5), Charsets.UTF_8);
                Log.d("ParseInterceptor", "decrypted response: ".concat(str4));
                Response build = proceed.newBuilder().body(ResponseBody.create(MediaType.get(CONTENT_TYPE_JSON), str4)).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                return build;
            }
            Log.d("ParseInterceptor", "json response");
        }
        Intrinsics.checkNotNull(proceed);
        return proceed;
    }

    private final String get24UUID() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        List split$default = StringsKt.split$default((CharSequence) uuid, new String[]{"-"}, false, 0, 6, (Object) null);
        return ((String) CollectionsKt.getOrNull(split$default, 0)) + ((String) CollectionsKt.getOrNull(split$default, 1)) + ((String) CollectionsKt.getOrNull(split$default, 4));
    }

    private final String getSignature(Request request, long timestamp) {
        String str;
        String replace$default;
        StringBuilder sb = new StringBuilder("");
        TreeMap treeMap = new TreeMap();
        String method = request.method();
        if (Intrinsics.areEqual(method, "GET")) {
            HttpUrl url = request.url();
            Set<String> queryParameterNames = url.queryParameterNames();
            Intrinsics.checkNotNull(queryParameterNames);
            for (String str2 : queryParameterNames) {
                TreeMap treeMap2 = treeMap;
                Intrinsics.checkNotNull(str2);
                String queryParameter = url.queryParameter(str2);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                Intrinsics.checkNotNull(queryParameter);
                treeMap2.put(str2, queryParameter);
                Log.d("ParseInterceptor", "Get name: " + str2 + ", value: " + ((String) treeMap.get(str2)));
            }
        } else if (Intrinsics.areEqual(method, "POST")) {
            RequestBody body = request.body();
            if (body instanceof FormBody) {
                FormBody formBody = (FormBody) body;
                int size = formBody.size();
                for (int i = 0; i < size; i++) {
                    String name = formBody.name(i);
                    Intrinsics.checkNotNullExpressionValue(name, "name(...)");
                    String value = formBody.value(i);
                    Intrinsics.checkNotNullExpressionValue(value, "value(...)");
                    treeMap.put(name, value);
                    Log.d("ParseInterceptor", "FormBody name: " + formBody.name(i) + ", value: " + formBody.value(i));
                }
            } else if (body instanceof MultipartBody) {
                List<MultipartBody.Part> parts = ((MultipartBody) body).parts();
                Intrinsics.checkNotNullExpressionValue(parts, "parts(...)");
                for (MultipartBody.Part part : parts) {
                    MediaType contentType = part.body().contentType();
                    String str3 = null;
                    String type = contentType != null ? contentType.type() : null;
                    if (type == null || Intrinsics.areEqual(type, "text")) {
                        Headers headers = part.headers();
                        String replace$default2 = (headers == null || (str = headers.get("Content-Disposition")) == null || (replace$default = StringsKt.replace$default(str, "form-data; name=", "", false, 4, (Object) null)) == null) ? null : StringsKt.replace$default(replace$default, "\"", "", false, 4, (Object) null);
                        try {
                            Buffer buffer = new Buffer();
                            part.body().writeTo(buffer);
                            str3 = buffer.readUtf8();
                        } catch (Exception e) {
                            if (AppContext.INSTANCE.isDebugMode()) {
                                LogUtils.e(Log.getStackTraceString(e));
                            }
                        }
                        Log.d("ParseInterceptor", "MultipartBody name: " + replace$default2 + ", value: " + str3);
                        if (replace$default2 != null && replace$default2.length() > 0 && str3 != null && str3.length() > 0) {
                            treeMap.put(replace$default2, str3);
                        }
                    }
                }
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append(((String) entry.getKey()) + ((String) entry.getValue()));
        }
        sb.append(timestamp);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        String host = request.url().host();
        Intrinsics.checkNotNullExpressionValue(host, "host(...)");
        byte[] result = new EncryptRequest(sb2, host).toResult();
        if (result == null) {
            throw new RequestFailException("", "Encrypt API failed. Please check EncryptHandler implementation.", RequestFailException.ErrorCode.ENCRYPT_ERROR.getValue());
        }
        String md5 = Md5Utils.md5(result);
        Intrinsics.checkNotNullExpressionValue(md5, "md5(...)");
        return md5;
    }

    private final String getAppName() {
        return (String) this.appName.getValue();
    }

    private final String getApplicationId() {
        return (String) this.applicationId.getValue();
    }

    private final String getVersionName() {
        return (String) this.versionName.getValue();
    }

    private final String getVersionCode() {
        return (String) this.versionCode.getValue();
    }

    private final String getUserAgent() {
        return getAppName() + '/' + getVersionName() + " (bundle:" + getApplicationId() + "; build:" + getVersionCode() + "; OS version: " + Build.VERSION.SDK_INT + "; " + (Intrinsics.areEqual((Object) new IsAgreedAgreementRequest().toResult(), (Object) true) ? "USER_TYPE: " + new GetUserTypeRequest().toResult().intValue() + "; COUNTRY_CODE: " + new GetCountryCodeRequest().toResult() + ';' : "") + ") " + Version.userAgent();
    }
}
