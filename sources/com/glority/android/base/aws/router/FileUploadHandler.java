package com.glority.android.base.aws.router;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.base.aws.s3.AwsFileUploader;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.fileupload.FileUploadRequest;
import com.glority.android.core.route.fileupload.UrlFileUpload;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileUploadHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0005J\"\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\fH\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/base/aws/router/FileUploadHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "", "", "()V", "url", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes14.dex */
public final class FileUploadHandler implements RouteHandler<Map<Long, ? extends String>> {
    @Override // com.glority.android.core.route.RouteHandler
    public Map<Long, ? extends String> execute(RouteRequest<Map<Long, ? extends String>> routeRequest) {
        return (Map) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlFileUpload.INSTANCE.getURL_UPLOAD();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Map<Long, ? extends String>> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof FileUploadRequest) {
            FileUploadRequest fileUploadRequest = (FileUploadRequest) request;
            String scope = fileUploadRequest.getScope();
            if (fileUploadRequest.getFilePath() == null || scope == null) {
                Router.onResponse(request.getId(), MapsKt.emptyMap());
            } else {
                AwsFileUploader.INSTANCE.uploadImageFile(fileUploadRequest.getFilePath(), scope, new FileUploadHandler$post$1(request));
            }
        }
    }
}
