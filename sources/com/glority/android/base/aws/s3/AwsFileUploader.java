package com.glority.android.base.aws.s3;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferListener;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.StorageClass;
import com.glority.android.base.aws.ImageUtils;
import com.glority.android.base.aws.s3.AwsFileUploader;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.store.FileUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.util.Vector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AwsFileUploader.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J6\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ6\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000bJ$\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J:\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006 "}, d2 = {"Lcom/glority/android/base/aws/s3/AwsFileUploader;", "", "()V", "IMAGE_SIZE_THRESHOLD", "", "TAG", "", "kotlin.jvm.PlatformType", "hTaskList", "Ljava/util/Vector;", "isReady", "", "()Z", "isWorking", "addTask", "", "objectKey", "init", "removeTask", "uploadImageFile", "filePath", "scope", "progressListener", "Lcom/glority/android/base/aws/s3/AwsFileUploader$ProgressListener;", "resultListener", "Lcom/glority/android/base/aws/s3/AwsFileUploader$ResultListener;", TtmlNode.TAG_METADATA, "Lcom/amazonaws/services/s3/model/ObjectMetadata;", "enableIntelligentTiering", "uploadImageFileImpl", "ProgressListener", "ResultListener", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes14.dex */
public final class AwsFileUploader {
    private static final int IMAGE_SIZE_THRESHOLD = 204800;
    public static final AwsFileUploader INSTANCE = new AwsFileUploader();
    private static final Vector<String> hTaskList = new Vector<>();
    private static final String TAG = "AwsFileUploader";

    /* compiled from: AwsFileUploader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/glority/android/base/aws/s3/AwsFileUploader$ProgressListener;", "", "onProgress", "", "current", "", "total", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes14.dex */
    public interface ProgressListener {
        void onProgress(long current, long total);
    }

    /* compiled from: AwsFileUploader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lcom/glority/android/base/aws/s3/AwsFileUploader$ResultListener;", "", "onError", "", NotificationCompat.CATEGORY_MESSAGE, "", "onSuccess", "url", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes14.dex */
    public interface ResultListener {
        void onError(String msg);

        void onSuccess(String url);
    }

    private AwsFileUploader() {
    }

    public final boolean isWorking() {
        return !hTaskList.isEmpty();
    }

    public final void addTask(String objectKey) {
        Intrinsics.checkNotNullParameter(objectKey, "objectKey");
        hTaskList.add(objectKey);
    }

    public final void removeTask(String objectKey) {
        Intrinsics.checkNotNullParameter(objectKey, "objectKey");
        hTaskList.remove(objectKey);
    }

    public final String uploadImageFile(String filePath, String scope, ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (filePath == null) {
            return null;
        }
        try {
            ObjectMetadata objectMetadata = new ObjectMetadata();
            Long imageSize = ImageUtils.INSTANCE.getImageSize(filePath);
            if ((imageSize == null ? 0L : imageSize.longValue()) > 204800) {
                objectMetadata.setStorageClass(StorageClass.IntelligentTiering);
            }
            return uploadImageFileImpl(filePath, scope, null, resultListener, objectMetadata);
        } catch (Exception e) {
            e.printStackTrace();
            if (resultListener != null) {
                resultListener.onError(e.getMessage());
            }
            return null;
        }
    }

    public static /* synthetic */ String uploadImageFile$default(AwsFileUploader awsFileUploader, String str, String str2, ProgressListener progressListener, ResultListener resultListener, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        return awsFileUploader.uploadImageFile(str, str2, progressListener, resultListener, z);
    }

    public final String uploadImageFile(String filePath, String scope, ProgressListener progressListener, ResultListener resultListener, boolean enableIntelligentTiering) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        try {
            ObjectMetadata objectMetadata = new ObjectMetadata();
            if (enableIntelligentTiering) {
                objectMetadata.setStorageClass(StorageClass.IntelligentTiering);
            }
            return uploadImageFileImpl(filePath, scope, progressListener, resultListener, objectMetadata);
        } catch (Exception e) {
            e.printStackTrace();
            if (resultListener != null) {
                resultListener.onError(e.getMessage());
            }
            return null;
        }
    }

    public static /* synthetic */ String uploadImageFile$default(AwsFileUploader awsFileUploader, String str, String str2, ProgressListener progressListener, ResultListener resultListener, ObjectMetadata objectMetadata, int i, Object obj) {
        if ((i & 16) != 0) {
            objectMetadata = new ObjectMetadata();
        }
        return awsFileUploader.uploadImageFile(str, str2, progressListener, resultListener, objectMetadata);
    }

    public final String uploadImageFile(String filePath, String scope, ProgressListener progressListener, ResultListener resultListener, ObjectMetadata metadata) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        try {
            return uploadImageFileImpl(filePath, scope, progressListener, resultListener, metadata);
        } catch (Exception e) {
            e.printStackTrace();
            if (resultListener != null) {
                resultListener.onError(e.getMessage());
            }
            return null;
        }
    }

    static /* synthetic */ String uploadImageFileImpl$default(AwsFileUploader awsFileUploader, String str, String str2, ProgressListener progressListener, ResultListener resultListener, ObjectMetadata objectMetadata, int i, Object obj) {
        if ((i & 16) != 0) {
            objectMetadata = new ObjectMetadata();
        }
        return awsFileUploader.uploadImageFileImpl(str, str2, progressListener, resultListener, objectMetadata);
    }

    private final String uploadImageFileImpl(String filePath, final String scope, final ProgressListener progressListener, final ResultListener resultListener, ObjectMetadata metadata) {
        if (!isReady()) {
            init();
            if (resultListener != null) {
                resultListener.onError("AwsFileUploader not init yet.");
            }
            return null;
        }
        if (!S3Util.INSTANCE.getInstance().getUploaders().containsKey(scope)) {
            if (resultListener != null) {
                resultListener.onError(Intrinsics.stringPlus("Invalid scope. Please check the scope. Wrong scope: ", scope));
            }
            return null;
        }
        String str = filePath;
        if (str == null || str.length() == 0) {
            if (resultListener != null) {
                resultListener.onError("Invalid filePath.");
            }
            return null;
        }
        String format = FileUtils.getFileExtension(filePath);
        String str2 = format;
        if (str2 == null || str2.length() == 0) {
            if (resultListener != null) {
                resultListener.onError("Invalid filePath format.");
            }
            return null;
        }
        S3Util companion = S3Util.INSTANCE.getInstance();
        Intrinsics.checkNotNullExpressionValue(format, "format");
        final String objectKey = companion.getObjectKey(scope, format);
        addTask(objectKey);
        TransferUtility transferUtility = S3Util.INSTANCE.getInstance().getTransferUtility(scope);
        TransferObserver upload = transferUtility != null ? transferUtility.upload(objectKey, new File(filePath), metadata) : null;
        if (upload != null) {
            final TransferObserver transferObserver = upload;
            upload.setTransferListener(new TransferListener() { // from class: com.glority.android.base.aws.s3.AwsFileUploader$uploadImageFileImpl$1
                @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
                public void onStateChanged(int id, TransferState state) {
                    String str3;
                    String str4;
                    Intrinsics.checkNotNullParameter(state, "state");
                    if (state == TransferState.COMPLETED) {
                        String accessUrl = S3Util.INSTANCE.getInstance().getAccessUrl(scope, objectKey);
                        str4 = AwsFileUploader.TAG;
                        Log.d(str4, Intrinsics.stringPlus("UploadSuccess. accessUrl: ", accessUrl));
                        AwsFileUploader.ResultListener resultListener2 = resultListener;
                        if (resultListener2 != null) {
                            resultListener2.onSuccess(accessUrl);
                        }
                        AwsFileUploader.INSTANCE.removeTask(objectKey);
                        return;
                    }
                    if (state == TransferState.FAILED || state == TransferState.CANCELED) {
                        str3 = AwsFileUploader.TAG;
                        Log.d(str3, "UploadFail");
                        transferObserver.cleanTransferListener();
                        AwsFileUploader.ResultListener resultListener3 = resultListener;
                        if (resultListener3 == null) {
                            return;
                        }
                        resultListener3.onError("UploadFail");
                    }
                }

                @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
                public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
                    AwsFileUploader.ProgressListener progressListener2 = progressListener;
                    if (progressListener2 == null) {
                        return;
                    }
                    progressListener2.onProgress(bytesCurrent, bytesTotal);
                }

                @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
                public void onError(int id, Exception e) {
                    String str3;
                    Intrinsics.checkNotNullParameter(e, "e");
                    e.printStackTrace();
                    str3 = AwsFileUploader.TAG;
                    LogUtils.e(str3, e.getMessage());
                    transferObserver.cleanTransferListener();
                    AwsFileUploader.ResultListener resultListener2 = resultListener;
                    if (resultListener2 != null) {
                        resultListener2.onError(e.getMessage());
                    }
                    AwsFileUploader.INSTANCE.removeTask(objectKey);
                }
            });
        }
        if (upload == null) {
            if (resultListener != null) {
                resultListener.onError("observer == null");
            }
            removeTask(objectKey);
        }
        return objectKey;
    }

    public final void init() {
        S3Util.INSTANCE.getInstance().updateAwsCredentials();
    }

    private final boolean isReady() {
        return !S3Util.INSTANCE.getInstance().getUploaders().isEmpty();
    }
}
