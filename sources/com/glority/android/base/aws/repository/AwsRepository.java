package com.glority.android.base.aws.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.component.generatedAPI.kotlinAPI.storage.GetUploadConfigMessage;
import com.glority.component.generatedAPI.kotlinAPI.storage.UpdateItemOriginalImageUrlMessage;
import com.glority.network.ApiServer;
import com.glority.network.model.Resource;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AwsRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007JH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0011H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/glority/android/base/aws/repository/AwsRepository;", "", "()V", "appServer", "Lcom/glority/network/ApiServer;", "getAppServer", "()Lcom/glority/network/ApiServer;", "appServer$delegate", "Lkotlin/Lazy;", "getUploadConfigBlocking", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/storage/GetUploadConfigMessage;", "updateItemOriginalImageUrl", "Lcom/glority/component/generatedAPI/kotlinAPI/storage/UpdateItemOriginalImageUrlMessage;", "itemId", "", "picUrl", "", "imageSha1", "imageHigh", "", "imageWidth", "fileSize", "fileFormat", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes14.dex */
public final class AwsRepository {
    public static final AwsRepository INSTANCE = new AwsRepository();

    /* renamed from: appServer$delegate, reason: from kotlin metadata */
    private static final Lazy appServer = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ApiServer>() { // from class: com.glority.android.base.aws.repository.AwsRepository$appServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ApiServer invoke() {
            return new ApiServer.Builder().host(AppContext.INSTANCE.getConfig("HOST")).build();
        }
    });

    private AwsRepository() {
    }

    public final ApiServer getAppServer() {
        return (ApiServer) appServer.getValue();
    }

    public final Resource<GetUploadConfigMessage> getUploadConfigBlocking() {
        return getAppServer().sendMessageBlocking(new GetUploadConfigMessage(0, 1, null));
    }

    public final Resource<UpdateItemOriginalImageUrlMessage> updateItemOriginalImageUrl(long itemId, String picUrl, String imageSha1, int imageHigh, int imageWidth, long fileSize, String fileFormat) {
        Intrinsics.checkNotNullParameter(picUrl, "picUrl");
        Intrinsics.checkNotNullParameter(imageSha1, "imageSha1");
        Intrinsics.checkNotNullParameter(fileFormat, "fileFormat");
        return getAppServer().sendMessageBlocking(new UpdateItemOriginalImageUrlMessage(itemId, picUrl, imageSha1, Integer.valueOf(imageHigh), Integer.valueOf(imageWidth), Long.valueOf(fileSize), fileFormat));
    }
}
