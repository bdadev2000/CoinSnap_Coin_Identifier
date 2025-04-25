package com.glority.network.interceptor;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.utils.stability.LogUtils;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: LoggingInterceptor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/glority/network/interceptor/LoggingInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class LoggingInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        long nanoTime = System.nanoTime();
        Object[] objArr = new Object[1];
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr2 = new Object[4];
        objArr2[0] = request.url();
        objArr2[1] = chain.connection();
        objArr2[2] = request.headers().toString();
        objArr2[3] = request.body() != null ? String.valueOf(request.body()) : "";
        String format = String.format("Sending request %s on %s%n%s%n%s", Arrays.copyOf(objArr2, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        objArr[0] = format;
        LogUtils.i(objArr);
        Response proceed = chain.proceed(request);
        long nanoTime2 = System.nanoTime();
        Object[] objArr3 = new Object[1];
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        Object[] objArr4 = new Object[4];
        objArr4[0] = proceed.request().url();
        objArr4[1] = Double.valueOf((nanoTime2 - nanoTime) / 1000000.0d);
        objArr4[2] = proceed.headers().toString();
        objArr4[3] = request.body() != null ? String.valueOf(proceed.body()) : "";
        String format2 = String.format("Received response for %s in %.1fms%n%s%s", Arrays.copyOf(objArr4, 4));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        objArr3[0] = format2;
        LogUtils.i(objArr3);
        return proceed;
    }
}
