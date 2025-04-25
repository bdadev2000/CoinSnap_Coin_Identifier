package com.glority.android.core.route.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetMd5EncryptKeyRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/core/route/network/GetMd5EncryptKeyRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "host", "(Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GetMd5EncryptKeyRequest extends RouteRequest<String> {
    private final String host;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMd5EncryptKeyRequest(String host) {
        super(UrlNetwork.INSTANCE.getURL_GET_MD5_ENCRYPT_KEY(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
    }

    public final String getHost() {
        return this.host;
    }
}
