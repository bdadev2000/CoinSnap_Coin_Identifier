package com.glority.base.server;

import android.content.res.AssetManager;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: AssetsInterceptor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/glority/base/server/AssetsInterceptor;", "Lokhttp3/Interceptor;", "assetsManager", "Landroid/content/res/AssetManager;", "<init>", "(Landroid/content/res/AssetManager;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "getAssetsJson", "", "url", "Ljava/net/URL;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AssetsInterceptor implements Interceptor {
    public static final int $stable = 8;
    private final AssetManager assetsManager;

    public AssetsInterceptor(AssetManager assetsManager) {
        Intrinsics.checkNotNullParameter(assetsManager, "assetsManager");
        this.assetsManager = assetsManager;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response proceed = chain.proceed(request);
        URL url = request.url().url();
        if (proceed.code() != 200) {
            AssetManager assetManager = this.assetsManager;
            Intrinsics.checkNotNull(url);
            String assetsJson = getAssetsJson(assetManager, url);
            if (assetsJson != null) {
                Response build = proceed.newBuilder().body(ResponseBody.create(MediaType.parse("application/json; charset=utf-8"), assetsJson)).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                return build;
            }
        }
        Intrinsics.checkNotNull(proceed);
        return proceed;
    }

    private final String getAssetsJson(AssetManager assetsManager, URL url) {
        String[] list = assetsManager.list("");
        if (list == null) {
            return null;
        }
        for (String str : list) {
            String path = url.getPath();
            Intrinsics.checkNotNull(str);
            if (Intrinsics.areEqual(path, StringsKt.replace$default(str, InstructionFileId.DOT, RemoteSettings.FORWARD_SLASH_STRING, false, 4, (Object) null))) {
                try {
                    InputStream open = assetsManager.open(str);
                    Intrinsics.checkNotNullExpressionValue(open, "open(...)");
                    return TextStreamsKt.readText(new InputStreamReader(open, Charsets.UTF_8));
                } catch (Throwable th) {
                    Log.e("AssetsInterceptor", "getAssetsJson: " + th);
                }
            }
        }
        return null;
    }
}
