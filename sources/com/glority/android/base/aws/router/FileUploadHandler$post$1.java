package com.glority.android.base.aws.router;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.glority.android.base.aws.s3.AwsFileUploader;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.core.GetCountryCodeRequest;
import com.glority.android.core.route.fileupload.FileUploadRequest;
import com.glority.android.core.route.surveyEvent.SurveyAddToMmsRequest;
import io.reactivex.functions.Consumer;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileUploadHandler.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/glority/android/base/aws/router/FileUploadHandler$post$1", "Lcom/glority/android/base/aws/s3/AwsFileUploader$ResultListener;", "onError", "", NotificationCompat.CATEGORY_MESSAGE, "", "onSuccess", "url", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes14.dex */
public final class FileUploadHandler$post$1 implements AwsFileUploader.ResultListener {
    final /* synthetic */ RouteRequest<Map<Long, String>> $request;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileUploadHandler$post$1(RouteRequest<Map<Long, String>> routeRequest) {
        this.$request = routeRequest;
    }

    @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
    public void onSuccess(final String url) {
        String itemType = ((FileUploadRequest) this.$request).getItemType();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        if (itemType != null) {
            String lowerCase = itemType.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            SurveyAddToMmsRequest surveyAddToMmsRequest = new SurveyAddToMmsRequest(lowerCase, url == null ? "" : url, null, new GetCountryCodeRequest().toResult(), ((FileUploadRequest) this.$request).getPhotoFrom(), ((FileUploadRequest) this.$request).getFields());
            final RouteRequest<Map<Long, String>> routeRequest = this.$request;
            Consumer consumer = new Consumer() { // from class: com.glority.android.base.aws.router.FileUploadHandler$post$1$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FileUploadHandler$post$1.m7700onSuccess$lambda0(RouteRequest.this, url, (Long) obj);
                }
            };
            final RouteRequest<Map<Long, String>> routeRequest2 = this.$request;
            surveyAddToMmsRequest.subscribe(consumer, new Consumer() { // from class: com.glority.android.base.aws.router.FileUploadHandler$post$1$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FileUploadHandler$post$1.m7701onSuccess$lambda1(RouteRequest.this, (Throwable) obj);
                }
            });
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-0, reason: not valid java name */
    public static final void m7700onSuccess$lambda0(RouteRequest request, String str, Long l) {
        Intrinsics.checkNotNullParameter(request, "$request");
        Router.onResponse(request.getId(), MapsKt.mapOf(TuplesKt.to(l, str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-1, reason: not valid java name */
    public static final void m7701onSuccess$lambda1(RouteRequest request, Throwable th) {
        Intrinsics.checkNotNullParameter(request, "$request");
        Router.onResponse(request.getId(), MapsKt.emptyMap());
    }

    @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
    public void onError(String msg) {
        Router.onResponse(this.$request.getId(), MapsKt.emptyMap());
    }
}
