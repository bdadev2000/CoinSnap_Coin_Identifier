package com.glority.android.base.aws.s3;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.glority.android.core.app.AppContext;
import com.glority.component.generatedAPI.kotlinAPI.storage.UploadToken;
import com.glority.utils.UtilsApp;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: S3Uploader.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013J\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/glority/android/base/aws/s3/S3Uploader;", "", "uploadToken", "Lcom/glority/component/generatedAPI/kotlinAPI/storage/UploadToken;", "(Lcom/glority/component/generatedAPI/kotlinAPI/storage/UploadToken;)V", "awsCredentials", "Lcom/glority/android/base/aws/s3/AppAWSSessionCredentials;", "getAwsCredentials", "()Lcom/glority/android/base/aws/s3/AppAWSSessionCredentials;", "s3Client", "Lcom/amazonaws/services/s3/AmazonS3Client;", "getS3Client", "()Lcom/amazonaws/services/s3/AmazonS3Client;", "transferUtility", "Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;", "<set-?>", "getUploadToken", "()Lcom/glority/component/generatedAPI/kotlinAPI/storage/UploadToken;", "getAccessUrl", "", "objectKey", "getObjectKey", "fileName", "getTransferUtility", "updateCredentials", "", "Companion", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes14.dex */
public final class S3Uploader {
    private static final String ENDPOINT = "https://s3.amazonaws.com";
    private final AppAWSSessionCredentials awsCredentials;
    private final AmazonS3Client s3Client;
    private TransferUtility transferUtility;
    private UploadToken uploadToken;

    public S3Uploader(UploadToken uploadToken) {
        Region region;
        TransferUtility transferUtility;
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        this.uploadToken = uploadToken;
        AppAWSSessionCredentials appAWSSessionCredentials = new AppAWSSessionCredentials();
        this.awsCredentials = appAWSSessionCredentials;
        updateCredentials(uploadToken);
        AmazonS3Client amazonS3Client = new AmazonS3Client(appAWSSessionCredentials);
        try {
            region = Region.getRegion(uploadToken.getRegion());
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            region = Region.getRegion(Regions.US_EAST_1);
        }
        amazonS3Client.setEndpoint(ENDPOINT);
        amazonS3Client.setRegion(region);
        Unit unit = Unit.INSTANCE;
        this.s3Client = amazonS3Client;
        try {
            transferUtility = TransferUtility.builder().context(UtilsApp.getApp()).s3Client(amazonS3Client).defaultBucket(uploadToken.getBucket()).build();
        } catch (Exception unused) {
            transferUtility = null;
        }
        this.transferUtility = transferUtility;
    }

    public final UploadToken getUploadToken() {
        return this.uploadToken;
    }

    public final AppAWSSessionCredentials getAwsCredentials() {
        return this.awsCredentials;
    }

    public final AmazonS3Client getS3Client() {
        return this.s3Client;
    }

    public final TransferUtility getTransferUtility() {
        TransferUtility transferUtility;
        if (this.transferUtility == null) {
            try {
                transferUtility = TransferUtility.builder().context(UtilsApp.getApp()).s3Client(this.s3Client).defaultBucket(this.uploadToken.getBucket()).build();
            } catch (Exception unused) {
                transferUtility = null;
            }
            this.transferUtility = transferUtility;
        }
        return this.transferUtility;
    }

    public final void updateCredentials(UploadToken uploadToken) {
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        uploadToken.setAuthorizedPath(StringsKt.trimEnd(uploadToken.getAuthorizedPath(), '/'));
        this.uploadToken = uploadToken;
        AppAWSSessionCredentials appAWSSessionCredentials = this.awsCredentials;
        appAWSSessionCredentials.setAwsAccessKey(uploadToken.getAccessKeyId());
        appAWSSessionCredentials.setAwsSecretKey(uploadToken.getAccessKeySecret());
        appAWSSessionCredentials.setSessionToken(uploadToken.getSecurityToken());
    }

    public final String getObjectKey(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return this.uploadToken.getAuthorizedPath() + '/' + fileName;
    }

    public final String getAccessUrl(String objectKey) {
        Intrinsics.checkNotNullParameter(objectKey, "objectKey");
        return this.uploadToken.getDownloadUrlPrefix() + '/' + objectKey;
    }
}
